package com.plaid.internal.core.crashreporting.internal.models;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/CrashContextTypeAdapter;", "Lcom/google/gson/JsonSerializer;", "Lcom/plaid/internal/core/crashreporting/internal/models/CrashContext;", "<init>", "()V", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "context", "Lcom/google/gson/JsonElement;", "serialize", "(Lcom/plaid/internal/core/crashreporting/internal/models/CrashContext;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CrashContextTypeAdapter implements com.google.gson.JsonSerializer<com.plaid.internal.core.crashreporting.internal.models.CrashContext> {
    @Override // com.google.gson.JsonSerializer
    public final com.google.gson.JsonElement serialize(com.plaid.internal.core.crashreporting.internal.models.CrashContext src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
        if (src == null) {
            return new com.google.gson.JsonObject();
        }
        java.util.Map<java.lang.String, java.lang.String> tags$crash_reporting_release = src.getTags$crash_reporting_release();
        if (tags$crash_reporting_release == null) {
            new com.google.gson.JsonObject();
        }
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        kotlin.jvm.internal.Intrinsics.checkNotNull(tags$crash_reporting_release);
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : tags$crash_reporting_release.entrySet()) {
            jsonObject.addProperty(entry.getKey(), entry.getValue());
        }
        return jsonObject;
    }
}
