package kotlinx.serialization.json.internal;

/* compiled from: JsonElementMarker.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class JsonElementMarker$origin$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<kotlinx.serialization.descriptors.SerialDescriptor, java.lang.Integer, java.lang.Boolean> {
    JsonElementMarker$origin$1(java.lang.Object obj) {
        super(2, obj, kotlinx.serialization.json.internal.JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final java.lang.Boolean invoke(kotlinx.serialization.descriptors.SerialDescriptor p0, int i) {
        boolean readIfAbsent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        readIfAbsent = ((kotlinx.serialization.json.internal.JsonElementMarker) this.receiver).readIfAbsent(p0, i);
        return java.lang.Boolean.valueOf(readIfAbsent);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, java.lang.Integer num) {
        return invoke(serialDescriptor, num.intValue());
    }
}
