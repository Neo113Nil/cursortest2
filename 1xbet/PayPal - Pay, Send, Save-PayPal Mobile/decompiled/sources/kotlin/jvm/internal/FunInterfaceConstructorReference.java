package kotlin.jvm.internal;

/* loaded from: classes17.dex */
public class FunInterfaceConstructorReference extends kotlin.jvm.internal.FunctionReference implements java.io.Serializable {
    private final java.lang.Class getHighSpeedVideoFpsRanges;

    public FunInterfaceConstructorReference(java.lang.Class cls) {
        super(1);
        this.getHighSpeedVideoFpsRanges = cls;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kotlin.jvm.internal.FunInterfaceConstructorReference) {
            return this.getHighSpeedVideoFpsRanges.equals(((kotlin.jvm.internal.FunInterfaceConstructorReference) obj).getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("fun interface ");
        sb.append(this.getHighSpeedVideoFpsRanges.getName());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    public kotlin.reflect.KFunction getReflected() {
        throw new java.lang.UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
