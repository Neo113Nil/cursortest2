package com.datadog.android.rum.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/internal/AnonymousIdentifierSerializer;", "Lcom/datadog/android/core/persistence/Serializer;", "Ljava/util/UUID;", "<init>", "()V", "model", "", "serialize", "(Ljava/util/UUID;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AnonymousIdentifierSerializer implements com.datadog.android.core.persistence.Serializer<java.util.UUID> {
    @Override // com.datadog.android.core.persistence.Serializer
    public final java.lang.String serialize(java.util.UUID model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        java.lang.String obj = model.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
