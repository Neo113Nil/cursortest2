package com.plaid.internal.classic.networking.adapter;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/plaid/internal/classic/networking/adapter/LinkAccountVerificationStatusAdapter;", "Lcom/google/gson/JsonSerializer;", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "Lcom/google/gson/JsonDeserializer;", "<init>", "()V", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", "context", "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/plaid/link/result/LinkAccountVerificationStatus;", "src", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "serialize", "(Lcom/plaid/link/result/LinkAccountVerificationStatus;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LinkAccountVerificationStatusAdapter implements com.google.gson.JsonSerializer<com.plaid.link.result.LinkAccountVerificationStatus>, com.google.gson.JsonDeserializer<com.plaid.link.result.LinkAccountVerificationStatus> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public final com.plaid.link.result.LinkAccountVerificationStatus deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) {
        if (json == null) {
            return null;
        }
        return com.plaid.link.result.LinkAccountVerificationStatus.INSTANCE.convert(json.getAsString());
    }

    @Override // com.google.gson.JsonSerializer
    public final com.google.gson.JsonElement serialize(com.plaid.link.result.LinkAccountVerificationStatus src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
        java.lang.String str;
        if (src == null || (str = src.getJson()) == null) {
            str = "";
        }
        return new com.google.gson.JsonPrimitive(str);
    }
}
