package org.modelmapper.internal.asm.tree.analysis;

import java.util.List;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* loaded from: classes4.dex */
public class SimpleVerifier extends BasicVerifier {
    private final Type currentClass;
    private final List<Type> currentClassInterfaces;
    private final Type currentSuperClass;
    private final boolean isInterface;
    private ClassLoader loader;

    public SimpleVerifier() {
        this(null, null, false);
    }

    public SimpleVerifier(Type type, Type type2, boolean z) {
        this(type, type2, null, z);
    }

    public SimpleVerifier(Type type, Type type2, List<Type> list, boolean z) {
        this(Opcodes.ASM6, type, type2, list, z);
        if (getClass() != SimpleVerifier.class) {
            throw new IllegalStateException();
        }
    }

    protected SimpleVerifier(int i, Type type, Type type2, List<Type> list, boolean z) {
        super(i);
        this.loader = getClass().getClassLoader();
        this.currentClass = type;
        this.currentSuperClass = type2;
        this.currentClassInterfaces = list;
        this.isInterface = z;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.loader = classLoader;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.modelmapper.internal.asm.tree.analysis.BasicInterpreter, org.modelmapper.internal.asm.tree.analysis.Interpreter
    public BasicValue newValue(Type type) {
        int sort;
        if (type == null) {
            return BasicValue.UNINITIALIZED_VALUE;
        }
        boolean z = type.getSort() == 9;
        if (z && ((sort = type.getElementType().getSort()) == 1 || sort == 2 || sort == 3 || sort == 4)) {
            return new BasicValue(type);
        }
        BasicValue newValue = super.newValue(type);
        if (!BasicValue.REFERENCE_VALUE.equals(newValue)) {
            return newValue;
        }
        if (z) {
            BasicValue newValue2 = newValue(type.getElementType());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < type.getDimensions(); i++) {
                sb.append('[');
            }
            sb.append(newValue2.getType().getDescriptor());
            return new BasicValue(Type.getType(sb.toString()));
        }
        return new BasicValue(type);
    }

    @Override // org.modelmapper.internal.asm.tree.analysis.BasicVerifier
    protected boolean isArrayValue(BasicValue basicValue) {
        Type type = basicValue.getType();
        return type != null && (type.getSort() == 9 || type.equals(NULL_TYPE));
    }

    @Override // org.modelmapper.internal.asm.tree.analysis.BasicVerifier
    protected BasicValue getElementValue(BasicValue basicValue) throws AnalyzerException {
        Type type = basicValue.getType();
        if (type != null) {
            if (type.getSort() == 9) {
                return newValue(Type.getType(type.getDescriptor().substring(1)));
            }
            if (type.equals(NULL_TYPE)) {
                return basicValue;
            }
        }
        throw new AssertionError();
    }

    @Override // org.modelmapper.internal.asm.tree.analysis.BasicVerifier
    protected boolean isSubTypeOf(BasicValue basicValue, BasicValue basicValue2) {
        Type type = basicValue2.getType();
        Type type2 = basicValue.getType();
        switch (type.getSort()) {
            case 5:
            case 6:
            case 7:
            case 8:
                return type2.equals(type);
            case 9:
            case 10:
                if (type2.equals(NULL_TYPE)) {
                    return true;
                }
                if (type2.getSort() == 10 || type2.getSort() == 9) {
                    return isAssignableFrom(type, type2);
                }
                return false;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.modelmapper.internal.asm.tree.analysis.BasicInterpreter, org.modelmapper.internal.asm.tree.analysis.Interpreter
    public BasicValue merge(BasicValue basicValue, BasicValue basicValue2) {
        int i;
        if (basicValue.equals(basicValue2)) {
            return basicValue;
        }
        Type type = basicValue.getType();
        Type type2 = basicValue2.getType();
        if (type != null && ((type.getSort() == 10 || type.getSort() == 9) && type2 != null && (type2.getSort() == 10 || type2.getSort() == 9))) {
            if (type.equals(NULL_TYPE)) {
                return basicValue2;
            }
            if (type2.equals(NULL_TYPE) || isAssignableFrom(type, type2)) {
                return basicValue;
            }
            if (isAssignableFrom(type2, type)) {
                return basicValue2;
            }
            if (type.getSort() == 9 && type2.getSort() == 9 && type.getDimensions() == type2.getDimensions() && type.getElementType().getSort() == 10 && type2.getElementType().getSort() == 10) {
                i = type.getDimensions();
                type = type.getElementType();
                type2 = type2.getElementType();
            } else {
                i = 0;
            }
            while (type != null && !isInterface(type)) {
                type = getSuperClass(type);
                if (isAssignableFrom(type, type2)) {
                    return newValue(type, i);
                }
            }
            return newValue(Type.getObjectType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME), i);
        }
        return BasicValue.UNINITIALIZED_VALUE;
    }

    private BasicValue newValue(Type type, int i) {
        if (i == 0) {
            return newValue(type);
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('[');
        }
        sb.append(type.getDescriptor());
        return newValue(Type.getType(sb.toString()));
    }

    protected boolean isInterface(Type type) {
        Type type2 = this.currentClass;
        if (type2 != null && type.equals(type2)) {
            return this.isInterface;
        }
        return getClass(type).isInterface();
    }

    protected Type getSuperClass(Type type) {
        Type type2 = this.currentClass;
        if (type2 != null && type.equals(type2)) {
            return this.currentSuperClass;
        }
        Class<? super Object> superclass = getClass(type).getSuperclass();
        if (superclass == null) {
            return null;
        }
        return Type.getType(superclass);
    }

    protected boolean isAssignableFrom(Type type, Type type2) {
        if (type.equals(type2)) {
            return true;
        }
        Type type3 = this.currentClass;
        if (type3 != null && type.equals(type3)) {
            if (getSuperClass(type2) == null) {
                return false;
            }
            if (this.isInterface) {
                return type2.getSort() == 10 || type2.getSort() == 9;
            }
            return isAssignableFrom(type, getSuperClass(type2));
        }
        Type type4 = this.currentClass;
        if (type4 != null && type2.equals(type4)) {
            if (isAssignableFrom(type, this.currentSuperClass)) {
                return true;
            }
            if (this.currentClassInterfaces != null) {
                for (int i = 0; i < this.currentClassInterfaces.size(); i++) {
                    if (isAssignableFrom(type, this.currentClassInterfaces.get(i))) {
                        return true;
                    }
                }
            }
            return false;
        }
        Class<?> cls = getClass(type);
        if (cls.isInterface()) {
            cls = Object.class;
        }
        return cls.isAssignableFrom(getClass(type2));
    }

    protected Class<?> getClass(Type type) {
        try {
            if (type.getSort() == 9) {
                return Class.forName(type.getDescriptor().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH), false, this.loader);
            }
            return Class.forName(type.getClassName(), false, this.loader);
        } catch (ClassNotFoundException e) {
            throw new TypeNotPresentException(e.toString(), e);
        }
    }
}
