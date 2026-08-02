package org.modelmapper.internal.bytebuddy.implementation.bytecode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;

/* loaded from: classes4.dex */
public enum StackSize {
    ZERO(0),
    SINGLE(1),
    DOUBLE(2);

    private final int size;

    StackSize(int i) {
        this.size = i;
    }

    public static StackSize of(Class<?> cls) {
        if (cls == Void.TYPE) {
            return ZERO;
        }
        if (cls == Double.TYPE || cls == Long.TYPE) {
            return DOUBLE;
        }
        return SINGLE;
    }

    public static StackSize of(int i) {
        if (i == 0) {
            return ZERO;
        }
        if (i == 1) {
            return SINGLE;
        }
        if (i == 2) {
            return DOUBLE;
        }
        throw new IllegalArgumentException("Unexpected stack size value: " + i);
    }

    public static int of(TypeDefinition... typeDefinitionArr) {
        return of(Arrays.asList(typeDefinitionArr));
    }

    public static int of(Collection<? extends TypeDefinition> collection) {
        Iterator<? extends TypeDefinition> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().getStackSize().getSize();
        }
        return i;
    }

    public int getSize() {
        return this.size;
    }

    public StackManipulation.Size toIncreasingSize() {
        return new StackManipulation.Size(getSize(), getSize());
    }

    public StackManipulation.Size toDecreasingSize() {
        return new StackManipulation.Size(getSize() * (-1), 0);
    }

    public StackSize maximum(StackSize stackSize) {
        int i = AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize[ordinal()];
        if (i == 1) {
            return this;
        }
        if (i != 2) {
            if (i == 3) {
                return stackSize;
            }
            throw new AssertionError();
        }
        int i2 = AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize[stackSize.ordinal()];
        if (i2 == 1) {
            return stackSize;
        }
        if (i2 == 2 || i2 == 3) {
            return this;
        }
        throw new AssertionError();
    }

    /* renamed from: org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize;

        static {
            int[] iArr = new int[StackSize.values().length];
            $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize = iArr;
            try {
                iArr[StackSize.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize[StackSize.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize[StackSize.ZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
