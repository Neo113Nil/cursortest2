package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C4 implements Re<String> {

    /* renamed from: a, reason: collision with root package name */
    private final String f7580a;
    private final String b;

    public C4(String encryptedResponse, String descriptionKey) {
        Intrinsics.checkNotNullParameter(encryptedResponse, "encryptedResponse");
        Intrinsics.checkNotNullParameter(descriptionKey, "descriptionKey");
        this.f7580a = encryptedResponse;
        this.b = descriptionKey;
    }

    @Override // com.ironsource.Re
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String value = I9.b(this.b, this.f7580a);
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        Intrinsics.checkNotNullExpressionValue(value, "value");
        return value;
    }
}
