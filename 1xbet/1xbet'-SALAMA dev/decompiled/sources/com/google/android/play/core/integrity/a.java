package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes.dex */
final class a extends ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f11569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f11570b;

    @Override // com.google.android.play.core.integrity.ap
    public final ap a(y yVar) {
        this.f11570b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final ap b(String str) {
        this.f11569a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final aq c() {
        y yVar;
        String str = this.f11569a;
        if (str != null && (yVar = this.f11570b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f11569a == null) {
            sb.append(" token");
        }
        if (this.f11570b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
