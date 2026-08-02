package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

/* loaded from: classes5.dex */
public class ImplicitClassReceiver implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitReceiver, kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver {
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver getHighSpeedVideoSizes;

    public ImplicitClassReceiver(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver implicitClassReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        this.getHighSpeedVideoFpsRangesFor = classDescriptor;
        this.getHighSpeedVideoSizes = implicitClassReceiver == null ? this : implicitClassReceiver;
        this.Camera2StreamConfigurationMap = classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getClassDescriptor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = this.getHighSpeedVideoFpsRangesFor.getDefaultType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
        return defaultType;
    }

    public boolean equals(java.lang.Object obj) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = this.getHighSpeedVideoFpsRangesFor;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver implicitClassReceiver = obj instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver ? (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver) obj : null;
        return kotlin.jvm.internal.Intrinsics.areEqual(classDescriptor, implicitClassReceiver != null ? implicitClassReceiver.getHighSpeedVideoFpsRangesFor : null);
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Class{");
        sb.append(getType());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
