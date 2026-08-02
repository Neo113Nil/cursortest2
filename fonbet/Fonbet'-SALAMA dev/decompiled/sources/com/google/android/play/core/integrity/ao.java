package com.google.android.play.core.integrity;

/* loaded from: classes.dex */
final class ao extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f11601a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f11602b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f11603c = null;

    public /* synthetic */ ao(String str, Long l7, Object obj, an anVar) {
        this.f11601a = str;
        this.f11602b = l7;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f11602b;
    }

    public final boolean equals(Object obj) {
        boolean z4;
        Long l7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f11601a.equals(integrityTokenRequest.nonce()) && ((l7 = this.f11602b) != null ? l7.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                z4 = true;
                if ((obj instanceof ao) || !a()) {
                    return z4;
                }
                ao aoVar = (ao) obj;
                if (!z4) {
                    return false;
                }
                Object obj2 = aoVar.f11603c;
                return true;
            }
        }
        z4 = false;
        if (obj instanceof ao) {
        }
        return z4;
    }

    public final int hashCode() {
        int hashCode = this.f11601a.hashCode() ^ 1000003;
        Long l7 = this.f11602b;
        int hashCode2 = (hashCode * 1000003) ^ (l7 == null ? 0 : l7.hashCode());
        return a() ? hashCode2 * 1000003 : hashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f11601a;
    }

    public final String toString() {
        String str = "IntegrityTokenRequest{nonce=" + this.f11601a + ", cloudProjectNumber=" + this.f11602b;
        if (a()) {
            str = str.concat(", network=null");
        }
        return str.concat("}");
    }
}
