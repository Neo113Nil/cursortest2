package com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003JO\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/flow/onlinepin/model/SignatureAndNoCvmData;", "", "isSignatureRequired", "", "isSignatureSupported", "isCvmFallbackToSignatureAllowed", "isCdCvmSupported", "isCvmFallbackToNoCvmAllowed", "isNoCvmRequired", "isCdCvmPerformed", "(ZZZZZZZ)V", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.a.a.a.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class SignatureAndNoCvmData {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3015a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public SignatureAndNoCvmData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f3015a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    private /* synthetic */ SignatureAndNoCvmData() {
        this(false, false, false, false, false, false, false);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SignatureAndNoCvmData(isSignatureRequired=");
        sb.append(this.f3015a);
        sb.append(", isSignatureSupported=");
        sb.append(this.b);
        sb.append(", isCvmFallbackToSignatureAllowed=");
        sb.append(this.c);
        sb.append(", isCdCvmSupported=");
        sb.append(this.d);
        sb.append(", isCvmFallbackToNoCvmAllowed=");
        sb.append(this.e);
        sb.append(", isNoCvmRequired=");
        sb.append(this.f);
        sb.append(", isCdCvmPerformed=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    public final int hashCode() {
        boolean z = this.f3015a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        ?? r2 = this.b;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        ?? r3 = this.c;
        int i2 = r3;
        if (r3 != 0) {
            i2 = 1;
        }
        ?? r4 = this.d;
        int i3 = r4;
        if (r4 != 0) {
            i3 = 1;
        }
        ?? r5 = this.e;
        int i4 = r5;
        if (r5 != 0) {
            i4 = 1;
        }
        ?? r6 = this.f;
        int i5 = r6;
        if (r6 != 0) {
            i5 = 1;
        }
        boolean z2 = this.g;
        return (((((((((((r0 * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.model.SignatureAndNoCvmData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.model.SignatureAndNoCvmData signatureAndNoCvmData = (com.discover.mpos.sdk.cardreader.kernel.flow.cvm.flow.onlinepin.model.SignatureAndNoCvmData) other;
        return this.f3015a == signatureAndNoCvmData.f3015a && this.b == signatureAndNoCvmData.b && this.c == signatureAndNoCvmData.c && this.d == signatureAndNoCvmData.d && this.e == signatureAndNoCvmData.e && this.f == signatureAndNoCvmData.f && this.g == signatureAndNoCvmData.g;
    }
}
