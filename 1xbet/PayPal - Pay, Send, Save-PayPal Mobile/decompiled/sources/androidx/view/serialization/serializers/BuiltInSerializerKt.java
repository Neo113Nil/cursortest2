package androidx.view.serialization.serializers;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "serialName", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "encoderErrorMessage", "(Ljava/lang/String;Lkotlinx/serialization/encoding/Encoder;)Ljava/lang/String;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "decoderErrorMessage", "(Ljava/lang/String;Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BuiltInSerializerKt {
    public static final java.lang.String encoderErrorMessage(java.lang.String str, kotlinx.serialization.encoding.Encoder encoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot serialize ");
        sb.append(str);
        sb.append(" with '");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(encoder.getClass()).getSimpleName());
        sb.append("'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.");
        return sb.toString();
    }

    public static final java.lang.String decoderErrorMessage(java.lang.String str, kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot deserialize ");
        sb.append(str);
        sb.append(" with '");
        sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(decoder.getClass()).getSimpleName());
        sb.append("'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.");
        return sb.toString();
    }
}
