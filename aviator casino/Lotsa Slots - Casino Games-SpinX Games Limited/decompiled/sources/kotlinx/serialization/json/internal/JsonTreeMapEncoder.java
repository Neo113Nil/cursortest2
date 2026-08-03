package kotlinx.serialization.json.internal;

/* compiled from: TreeJsonEncoder.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeMapEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "json", "Lkotlinx/serialization/json/Json;", "nodeConsumer", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "", "isKey", "", "putElement", com.ironsource.X3.i.W, "element", "getCurrent", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class JsonTreeMapEncoder extends kotlinx.serialization.json.internal.JsonTreeEncoder {
    private boolean isKey;
    private java.lang.String tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeMapEncoder(kotlinx.serialization.json.Json json, kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonElement, kotlin.Unit> nodeConsumer) {
        super(json, nodeConsumer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.isKey = true;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeEncoder, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void putElement(java.lang.String key, kotlinx.serialization.json.JsonElement element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        if (this.isKey) {
            if (element instanceof kotlinx.serialization.json.JsonPrimitive) {
                this.tag = ((kotlinx.serialization.json.JsonPrimitive) element).getContent();
                this.isKey = false;
                return;
            } else {
                if (element instanceof kotlinx.serialization.json.JsonObject) {
                    throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidKeyKindException(kotlinx.serialization.json.JsonObjectSerializer.INSTANCE.getDescriptor());
                }
                if (!(element instanceof kotlinx.serialization.json.JsonArray)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidKeyKindException(kotlinx.serialization.json.JsonArraySerializer.INSTANCE.getDescriptor());
            }
        }
        java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> content = getContent();
        java.lang.String str = this.tag;
        if (str == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY);
            str = null;
        }
        content.put(str, element);
        this.isKey = true;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeEncoder, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public kotlinx.serialization.json.JsonElement getCurrent() {
        return new kotlinx.serialization.json.JsonObject(getContent());
    }
}
