package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class b extends com.google.android.play.core.integrity.bq {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f3807a;
    private com.google.android.play.core.integrity.y b;

    @Override // com.google.android.play.core.integrity.bq
    final com.google.android.play.core.integrity.bq b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null token");
        }
        this.f3807a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final com.google.android.play.core.integrity.br c() {
        com.google.android.play.core.integrity.y yVar;
        java.lang.String str = this.f3807a;
        if (str != null && (yVar = this.b) != null) {
            return new com.google.android.play.core.integrity.br(str, yVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f3807a == null) {
            sb.append(" token");
        }
        if (this.b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.bq
    final com.google.android.play.core.integrity.bq a(com.google.android.play.core.integrity.y yVar) {
        this.b = yVar;
        return this;
    }

    b() {
    }
}
