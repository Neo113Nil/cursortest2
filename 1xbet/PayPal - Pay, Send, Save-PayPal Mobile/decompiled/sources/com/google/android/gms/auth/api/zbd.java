package com.google.android.gms.auth.api;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class zbd implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public static final com.google.android.gms.auth.api.zbd zba = new com.google.android.gms.auth.api.zbd(new com.google.android.gms.auth.api.zbc());
    private final java.lang.String zbb = null;
    private final boolean zbc;
    private final java.lang.String zbd;

    public zbd(com.google.android.gms.auth.api.zbc zbcVar) {
        this.zbc = zbcVar.zba.booleanValue();
        this.zbd = zbcVar.zbb;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.zbd)) {
            return false;
        }
        com.google.android.gms.auth.api.zbd zbdVar = (com.google.android.gms.auth.api.zbd) obj;
        java.lang.String str = zbdVar.zbb;
        return com.google.android.gms.common.internal.Objects.equal(null, null) && this.zbc == zbdVar.zbc && com.google.android.gms.common.internal.Objects.equal(this.zbd, zbdVar.zbd);
    }

    public final int hashCode() {
        boolean z = this.zbc;
        return com.google.android.gms.common.internal.Objects.hashCode(null, java.lang.Boolean.valueOf(z), this.zbd);
    }

    public final android.os.Bundle zba() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.zbc);
        bundle.putString("log_session_id", this.zbd);
        return bundle;
    }

    final /* synthetic */ java.lang.String zbc() {
        return this.zbd;
    }

    final /* synthetic */ boolean zbb() {
        return this.zbc;
    }
}
