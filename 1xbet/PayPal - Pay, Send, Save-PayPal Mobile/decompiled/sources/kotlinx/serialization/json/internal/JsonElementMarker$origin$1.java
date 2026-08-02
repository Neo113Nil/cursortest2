package kotlinx.serialization.json.internal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class JsonElementMarker$origin$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<kotlinx.serialization.descriptors.SerialDescriptor, java.lang.Integer, java.lang.Boolean> {
    public final java.lang.Boolean getHighSpeedVideoSizes(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return java.lang.Boolean.valueOf(kotlinx.serialization.json.internal.JsonElementMarker.access$readIfAbsent((kotlinx.serialization.json.internal.JsonElementMarker) this.receiver, serialDescriptor, i));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Boolean invoke(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, java.lang.Integer num) {
        return getHighSpeedVideoSizes(serialDescriptor, num.intValue());
    }

    JsonElementMarker$origin$1(java.lang.Object obj) {
        super(2, obj, kotlinx.serialization.json.internal.JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }
}
