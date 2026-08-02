package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class aq extends com.google.android.play.core.integrity.IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3799a;
    private final com.google.android.play.core.integrity.y b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final com.google.android.gms.tasks.Task<java.lang.Integer> showDialog(android.app.Activity activity, int i) {
        return this.b.a(activity, i);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final java.lang.String token() {
        return this.f3799a;
    }

    aq(java.lang.String str, com.google.android.play.core.integrity.y yVar) {
        this.f3799a = str;
        this.b = yVar;
    }
}
