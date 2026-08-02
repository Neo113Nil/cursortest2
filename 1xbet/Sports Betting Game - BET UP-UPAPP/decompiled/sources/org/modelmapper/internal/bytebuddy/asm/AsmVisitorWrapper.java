package org.modelmapper.internal.bytebuddy.asm;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldList;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;
import org.modelmapper.internal.bytebuddy.utility.OpenedClassReader;

/* loaded from: classes4.dex */
public interface AsmVisitorWrapper {
    public static final int NO_FLAGS = 0;

    public static abstract class AbstractBase implements AsmVisitorWrapper {
        @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
        public int mergeReader(int i) {
            return i;
        }

        @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
        public int mergeWriter(int i) {
            return i;
        }
    }

    public enum NoOp implements AsmVisitorWrapper {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
        public int mergeReader(int i) {
            return i;
        }

        @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
        public int mergeWriter(int i) {
            return i;
        }

        @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
        public ClassVisitor wrap(TypeDescription typeDescription, ClassVisitor classVisitor, Implementation.Context context, TypePool typePool, FieldList<FieldDescription.InDefinedShape> fieldList, MethodList<?> methodList, int i, int i2) {
            return classVisitor;
        }
    }

    int mergeReader(int i);

    int mergeWriter(int i);

    ClassVisitor wrap(TypeDescription typeDescription, ClassVisitor classVisitor, Implementation.Context context, TypePool typePool, FieldList<FieldDescription.InDefinedShape> fieldList, MethodList<?> methodList, int i, int i2);

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForDeclaredFields extends AbstractBase {
        private final List<Entry> entries;

        public interface FieldVisitorWrapper {
            FieldVisitor wrap(TypeDescription typeDescription, FieldDescription.InDefinedShape inDefinedShape, FieldVisitor fieldVisitor);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.entries.equals(((ForDeclaredFields) obj).entries);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.entries.hashCode();
        }

        public ForDeclaredFields() {
            this(Collections.emptyList());
        }

        protected ForDeclaredFields(List<Entry> list) {
            this.entries = list;
        }

        public ForDeclaredFields field(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher, FieldVisitorWrapper... fieldVisitorWrapperArr) {
            return field(elementMatcher, Arrays.asList(fieldVisitorWrapperArr));
        }

        public ForDeclaredFields field(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher, List<? extends FieldVisitorWrapper> list) {
            return new ForDeclaredFields(CompoundList.of(this.entries, new Entry(elementMatcher, list)));
        }

        @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
        public ClassVisitor wrap(TypeDescription typeDescription, ClassVisitor classVisitor, Implementation.Context context, TypePool typePool, FieldList<FieldDescription.InDefinedShape> fieldList, MethodList<?> methodList, int i, int i2) {
            HashMap hashMap = new HashMap();
            for (FieldDescription.InDefinedShape inDefinedShape : fieldList) {
                hashMap.put(inDefinedShape.getInternalName() + inDefinedShape.getDescriptor(), inDefinedShape);
            }
            return new DispatchingVisitor(classVisitor, typeDescription, hashMap);
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class Entry implements ElementMatcher<FieldDescription.InDefinedShape>, FieldVisitorWrapper {
            private final List<? extends FieldVisitorWrapper> fieldVisitorWrappers;
            private final ElementMatcher<? super FieldDescription.InDefinedShape> matcher;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Entry entry = (Entry) obj;
                return this.matcher.equals(entry.matcher) && this.fieldVisitorWrappers.equals(entry.fieldVisitorWrappers);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode()) * 31) + this.fieldVisitorWrappers.hashCode();
            }

            protected Entry(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher, List<? extends FieldVisitorWrapper> list) {
                this.matcher = elementMatcher;
                this.fieldVisitorWrappers = list;
            }

            @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
            public boolean matches(FieldDescription.InDefinedShape inDefinedShape) {
                return inDefinedShape != null && this.matcher.matches(inDefinedShape);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredFields.FieldVisitorWrapper
            public FieldVisitor wrap(TypeDescription typeDescription, FieldDescription.InDefinedShape inDefinedShape, FieldVisitor fieldVisitor) {
                Iterator<? extends FieldVisitorWrapper> it = this.fieldVisitorWrappers.iterator();
                while (it.hasNext()) {
                    fieldVisitor = it.next().wrap(typeDescription, inDefinedShape, fieldVisitor);
                }
                return fieldVisitor;
            }
        }

        protected class DispatchingVisitor extends ClassVisitor {
            private final Map<String, FieldDescription.InDefinedShape> fields;
            private final TypeDescription instrumentedType;

            protected DispatchingVisitor(ClassVisitor classVisitor, TypeDescription typeDescription, Map<String, FieldDescription.InDefinedShape> map) {
                super(OpenedClassReader.ASM_API, classVisitor);
                this.instrumentedType = typeDescription;
                this.fields = map;
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
                FieldVisitor visitField = super.visitField(i, str, str2, str3, obj);
                FieldDescription.InDefinedShape inDefinedShape = this.fields.get(str + str2);
                if (visitField != null && inDefinedShape != null) {
                    for (Entry entry : ForDeclaredFields.this.entries) {
                        if (entry.matches(inDefinedShape)) {
                            visitField = entry.wrap(this.instrumentedType, inDefinedShape, visitField);
                        }
                    }
                }
                return visitField;
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForDeclaredMethods implements AsmVisitorWrapper {
        private final List<Entry> entries;
        private final int readerFlags;
        private final int writerFlags;

        public interface MethodVisitorWrapper {
            MethodVisitor wrap(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, TypePool typePool, int i, int i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ForDeclaredMethods forDeclaredMethods = (ForDeclaredMethods) obj;
            return this.entries.equals(forDeclaredMethods.entries) && this.writerFlags == forDeclaredMethods.writerFlags && this.readerFlags == forDeclaredMethods.readerFlags;
        }

        public int hashCode() {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.entries.hashCode()) * 31) + this.writerFlags) * 31) + this.readerFlags;
        }

        public ForDeclaredMethods() {
            this(Collections.emptyList(), 0, 0);
        }

        protected ForDeclaredMethods(List<Entry> list, int i, int i2) {
            this.entries = list;
            this.writerFlags = i;
            this.readerFlags = i2;
        }

        public ForDeclaredMethods method(ElementMatcher<? super MethodDescription> elementMatcher, MethodVisitorWrapper... methodVisitorWrapperArr) {
            return method(elementMatcher, Arrays.asList(methodVisitorWrapperArr));
        }

        public ForDeclaredMethods method(ElementMatcher<? super MethodDescription> elementMatcher, List<? extends MethodVisitorWrapper> list) {
            return new ForDeclaredMethods(CompoundList.of(this.entries, new Entry(elementMatcher, list)), this.writerFlags, this.readerFlags);
        }

        public ForDeclaredMethods writerFlags(int i) {
            return new ForDeclaredMethods(this.entries, i | this.writerFlags, this.readerFlags);
        }

        public ForDeclaredMethods readerFlags(int i) {
            return new ForDeclaredMethods(this.entries, this.writerFlags, i | this.readerFlags);
        }

        @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
        public int mergeWriter(int i) {
            return i | this.writerFlags;
        }

        @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
        public int mergeReader(int i) {
            return i | this.readerFlags;
        }

        @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
        public ClassVisitor wrap(TypeDescription typeDescription, ClassVisitor classVisitor, Implementation.Context context, TypePool typePool, FieldList<FieldDescription.InDefinedShape> fieldList, MethodList<?> methodList, int i, int i2) {
            HashMap hashMap = new HashMap();
            for (MethodDescription methodDescription : CompoundList.of(methodList, new MethodDescription.Latent.TypeInitializer(typeDescription))) {
                hashMap.put(methodDescription.getInternalName() + methodDescription.getDescriptor(), methodDescription);
            }
            return new DispatchingVisitor(classVisitor, typeDescription, context, typePool, hashMap, i, i2);
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class Entry implements ElementMatcher<MethodDescription>, MethodVisitorWrapper {
            private final ElementMatcher<? super MethodDescription> matcher;
            private final List<? extends MethodVisitorWrapper> methodVisitorWrappers;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Entry entry = (Entry) obj;
                return this.matcher.equals(entry.matcher) && this.methodVisitorWrappers.equals(entry.methodVisitorWrappers);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode()) * 31) + this.methodVisitorWrappers.hashCode();
            }

            protected Entry(ElementMatcher<? super MethodDescription> elementMatcher, List<? extends MethodVisitorWrapper> list) {
                this.matcher = elementMatcher;
                this.methodVisitorWrappers = list;
            }

            @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
            public boolean matches(MethodDescription methodDescription) {
                return methodDescription != null && this.matcher.matches(methodDescription);
            }

            @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper
            public MethodVisitor wrap(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, TypePool typePool, int i, int i2) {
                Iterator<? extends MethodVisitorWrapper> it = this.methodVisitorWrappers.iterator();
                MethodVisitor methodVisitor2 = methodVisitor;
                while (it.hasNext()) {
                    methodVisitor2 = it.next().wrap(typeDescription, methodDescription, methodVisitor2, context, typePool, i, i2);
                }
                return methodVisitor2;
            }
        }

        protected class DispatchingVisitor extends ClassVisitor {
            private final Implementation.Context implementationContext;
            private final TypeDescription instrumentedType;
            private final Map<String, MethodDescription> methods;
            private final int readerFlags;
            private final TypePool typePool;
            private final int writerFlags;

            protected DispatchingVisitor(ClassVisitor classVisitor, TypeDescription typeDescription, Implementation.Context context, TypePool typePool, Map<String, MethodDescription> map, int i, int i2) {
                super(OpenedClassReader.ASM_API, classVisitor);
                this.instrumentedType = typeDescription;
                this.implementationContext = context;
                this.typePool = typePool;
                this.methods = map;
                this.writerFlags = i;
                this.readerFlags = i2;
            }

            @Override // org.modelmapper.internal.asm.ClassVisitor
            public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
                MethodVisitor visitMethod = super.visitMethod(i, str, str2, str3, strArr);
                MethodDescription methodDescription = this.methods.get(str + str2);
                if (visitMethod == null || methodDescription == null) {
                    return visitMethod;
                }
                MethodVisitor methodVisitor = visitMethod;
                for (Entry entry : ForDeclaredMethods.this.entries) {
                    if (entry.matches(methodDescription)) {
                        methodVisitor = entry.wrap(this.instrumentedType, methodDescription, methodVisitor, this.implementationContext, this.typePool, this.writerFlags, this.readerFlags);
                    }
                }
                return methodVisitor;
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements AsmVisitorWrapper {
        private final List<AsmVisitorWrapper> asmVisitorWrappers;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.asmVisitorWrappers.equals(((Compound) obj).asmVisitorWrappers);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.asmVisitorWrappers.hashCode();
        }

        public Compound(AsmVisitorWrapper... asmVisitorWrapperArr) {
            this((List<? extends AsmVisitorWrapper>) Arrays.asList(asmVisitorWrapperArr));
        }

        public Compound(List<? extends AsmVisitorWrapper> list) {
            this.asmVisitorWrappers = new ArrayList();
            for (AsmVisitorWrapper asmVisitorWrapper : list) {
                if (asmVisitorWrapper instanceof Compound) {
                    this.asmVisitorWrappers.addAll(((Compound) asmVisitorWrapper).asmVisitorWrappers);
                } else if (!(asmVisitorWrapper instanceof NoOp)) {
                    this.asmVisitorWrappers.add(asmVisitorWrapper);
                }
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
        public int mergeWriter(int i) {
            Iterator<AsmVisitorWrapper> it = this.asmVisitorWrappers.iterator();
            while (it.hasNext()) {
                i = it.next().mergeWriter(i);
            }
            return i;
        }

        @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
        public int mergeReader(int i) {
            Iterator<AsmVisitorWrapper> it = this.asmVisitorWrappers.iterator();
            while (it.hasNext()) {
                i = it.next().mergeReader(i);
            }
            return i;
        }

        @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
        public ClassVisitor wrap(TypeDescription typeDescription, ClassVisitor classVisitor, Implementation.Context context, TypePool typePool, FieldList<FieldDescription.InDefinedShape> fieldList, MethodList<?> methodList, int i, int i2) {
            Iterator<AsmVisitorWrapper> it = this.asmVisitorWrappers.iterator();
            ClassVisitor classVisitor2 = classVisitor;
            while (it.hasNext()) {
                classVisitor2 = it.next().wrap(typeDescription, classVisitor2, context, typePool, fieldList, methodList, i, i2);
            }
            return classVisitor2;
        }
    }
}
