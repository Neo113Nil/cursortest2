package com.datadog.android.rum.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/AnonymousIdentifierDeserializer;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "", "Ljava/util/UUID;", "<init>", "()V", "model", "deserialize", "(Ljava/lang/String;)Ljava/util/UUID;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AnonymousIdentifierDeserializer implements com.datadog.android.core.internal.persistence.Deserializer<java.lang.String, java.util.UUID> {
    @Override // com.datadog.android.core.internal.persistence.Deserializer
    public final java.util.UUID deserialize(java.lang.String model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        try {
            return java.util.UUID.fromString(model);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }
}
