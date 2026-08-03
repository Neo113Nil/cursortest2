package com.ironsource;

/* loaded from: classes5.dex */
public final class F4 implements com.ironsource.Te<java.lang.String> {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5696a;
    private final java.lang.String b;

    public F4(java.lang.String encryptedResponse, java.lang.String descriptionKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedResponse, "encryptedResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptionKey, "descriptionKey");
        this.f5696a = encryptedResponse;
        this.b = descriptionKey;
    }

    @Override // com.ironsource.Te
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.String a() {
        java.lang.String value = com.ironsource.I9.b(this.b, this.f5696a);
        if (value == null || value.length() == 0) {
            throw new java.lang.IllegalArgumentException("Decryption failed");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "value");
        return value;
    }
}
