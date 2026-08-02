package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class a extends com.google.android.play.core.integrity.ap {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f3786a;
    private com.google.android.play.core.integrity.y b;

    @Override // com.google.android.play.core.integrity.ap
    final com.google.android.play.core.integrity.aq c() {
        com.google.android.play.core.integrity.y yVar;
        java.lang.String str = this.f3786a;
        if (str != null && (yVar = this.b) != null) {
            return new com.google.android.play.core.integrity.aq(str, yVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f3786a == null) {
            sb.append(" token");
        }
        if (this.b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.ap
    final com.google.android.play.core.integrity.ap b(java.lang.String str) {
        this.f3786a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    final com.google.android.play.core.integrity.ap a(com.google.android.play.core.integrity.y yVar) {
        this.b = yVar;
        return this;
    }

    a() {
    }
}
