package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

/* loaded from: classes5.dex */
public abstract class AbstractReceiverValue implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue {
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue getHighSpeedVideoSizes;
    protected final kotlin.reflect.jvm.internal.impl.types.KotlinType receiverType;

    public AbstractReceiverValue(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue) {
        if (kotlinType == null) {
            getHighSpeedVideoFpsRangesFor(0);
        }
        this.receiverType = kotlinType;
        this.getHighSpeedVideoSizes = receiverValue == null ? this : receiverValue;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = this.receiverType;
        if (kotlinType == null) {
            getHighSpeedVideoFpsRangesFor(1);
        }
        return kotlinType;
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
        java.lang.String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
