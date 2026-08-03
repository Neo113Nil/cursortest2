package com.moloco.sdk.internal.ortb.model;

/* loaded from: classes5.dex */
public final class j implements kotlinx.serialization.KSerializer<androidx.compose.ui.graphics.Color> {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.ortb.model.j f7037a = new com.moloco.sdk.internal.ortb.model.j();
    public static final kotlinx.serialization.descriptors.SerialDescriptor b = kotlinx.serialization.descriptors.SerialDescriptorsKt.PrimitiveSerialDescriptor("Color", kotlinx.serialization.descriptors.PrimitiveKind.STRING.INSTANCE);

    public long a(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "decoder");
        return androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(decoder.decodeString()));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        return androidx.compose.ui.graphics.Color.m2103boximpl(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        a(encoder, ((androidx.compose.ui.graphics.Color) obj).m2123unboximpl());
    }

    public void a(kotlinx.serialization.encoding.Encoder encoder, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        throw new kotlin.NotImplementedError("Color encoding is not supported");
    }
}
