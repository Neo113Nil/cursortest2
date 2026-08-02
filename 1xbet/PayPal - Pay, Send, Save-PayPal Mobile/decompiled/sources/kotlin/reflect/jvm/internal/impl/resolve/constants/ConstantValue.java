package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public abstract class ConstantValue<T> {
    private final T getHighResolutionOutputSizeshNQ4ISI;

    public abstract kotlin.reflect.jvm.internal.impl.types.KotlinType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor);

    public ConstantValue(T t) {
        this.getHighResolutionOutputSizeshNQ4ISI = t;
    }

    public T getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        T value = getValue();
        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue constantValue = obj instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue ? (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) obj : null;
        return kotlin.jvm.internal.Intrinsics.areEqual(value, constantValue != null ? constantValue.getValue() : null);
    }

    public int hashCode() {
        T value = getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(getValue());
    }
}
