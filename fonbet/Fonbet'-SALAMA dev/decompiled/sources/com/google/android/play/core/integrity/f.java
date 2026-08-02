package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes.dex */
final class f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private String f11673a;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        return new h(this.f11673a, null);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(String str) {
        this.f11673a = str;
        return this;
    }
}
