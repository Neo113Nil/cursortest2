package com.google.android.play.core.integrity;

/* loaded from: classes.dex */
final class b extends bq {

    /* renamed from: a, reason: collision with root package name */
    private String f11622a;

    /* renamed from: b, reason: collision with root package name */
    private y f11623b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.f11623b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f11622a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.f11622a;
        if (str != null && (yVar = this.f11623b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f11622a == null) {
            sb.append(" token");
        }
        if (this.f11623b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
