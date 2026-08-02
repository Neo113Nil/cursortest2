package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

/* loaded from: classes5.dex */
public class TransientReceiver extends kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.AbstractReceiverValue {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransientReceiver(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        this(kotlinType, (byte) 0);
        if (kotlinType == null) {
            getHighSpeedVideoFpsRanges(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private TransientReceiver(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, byte b) {
        super(kotlinType, null);
        if (kotlinType == null) {
            getHighSpeedVideoFpsRanges(1);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{Transient} : ");
        sb.append(getType());
        return sb.toString();
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
