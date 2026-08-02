package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: pw */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0596pw {

    /* JADX INFO: renamed from: a */
    public final C0818vw f6274a;

    /* JADX INFO: renamed from: b */
    public final byte[] f6275b;

    public C0596pw(C0818vw c0818vw, byte[] bArr) {
        if (c0818vw == null) {
            C0270h1.m2192h("encoding is null");
            throw null;
        }
        if (bArr == null) {
            C0270h1.m2192h("bytes is null");
            throw null;
        }
        this.f6274a = c0818vw;
        this.f6275b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0596pw)) {
            return false;
        }
        C0596pw c0596pw = (C0596pw) obj;
        if (this.f6274a.equals(c0596pw.f6274a)) {
            return Arrays.equals(this.f6275b, c0596pw.f6275b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6275b) ^ ((this.f6274a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f6274a + ", bytes=[...]}";
    }
}
