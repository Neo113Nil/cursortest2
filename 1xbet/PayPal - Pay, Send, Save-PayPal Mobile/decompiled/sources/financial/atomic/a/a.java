package financial.atomic.a;

/* loaded from: classes3.dex */
public final class a implements kotlinx.serialization.KSerializer {
    public static final financial.atomic.a.a INSTANCE = new financial.atomic.a.a();

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.SerialDescriptor f6728a = kotlinx.serialization.descriptors.SerialDescriptorsKt.SerialDescriptor("JSONObject", kotlinx.serialization.json.JsonObject.INSTANCE.serializer().getDescriptor());

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f6728a;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final org.json.JSONObject deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return new org.json.JSONObject(((kotlinx.serialization.json.JsonDecoder) decoder).decodeJsonElement().toString());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "");
        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        ((kotlinx.serialization.json.JsonEncoder) encoder).encodeJsonElement(companion.parseToJsonElement(jSONObject2));
    }
}
