package com.discover.mpos.sdk.cardreader.kernel.flow.terminalactionanalysis.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u00064"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/terminalactionanalysis/model/TerminalActionAnalysisData;", "", "isAAC", "", "pidLimitReached", "offlineDataAuthenticationWasNotPerformed", "cdaFailed", "isTc", "switchOtherInterfaceIfOdaFailed", "processOnlineIfCdaFailed", "requestedServiceNotAllowedForCardProduct", "cardAppearsOnTerminalExceptionFile", "iccDataMissing", "expiredApplication", "declineIfCardExpired", "processOnlineIfCardExpired", "applicationNotEffectiveYet", "(ZZZZZZZZZZZZZZ)V", "getApplicationNotEffectiveYet", "()Z", "getCardAppearsOnTerminalExceptionFile", "getCdaFailed", "getDeclineIfCardExpired", "getExpiredApplication", "getIccDataMissing", "getOfflineDataAuthenticationWasNotPerformed", "getPidLimitReached", "getProcessOnlineIfCardExpired", "getProcessOnlineIfCdaFailed", "getRequestedServiceNotAllowedForCardProduct", "getSwitchOtherInterfaceIfOdaFailed", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.m.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class TerminalActionAnalysisData {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3175a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public TerminalActionAnalysisData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f3175a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = z13;
        this.n = z14;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TerminalActionAnalysisData(isAAC=");
        sb.append(this.f3175a);
        sb.append(", pidLimitReached=");
        sb.append(this.b);
        sb.append(", offlineDataAuthenticationWasNotPerformed=");
        sb.append(this.c);
        sb.append(", cdaFailed=");
        sb.append(this.d);
        sb.append(", isTc=");
        sb.append(this.e);
        sb.append(", switchOtherInterfaceIfOdaFailed=");
        sb.append(this.f);
        sb.append(", processOnlineIfCdaFailed=");
        sb.append(this.g);
        sb.append(", requestedServiceNotAllowedForCardProduct=");
        sb.append(this.h);
        sb.append(", cardAppearsOnTerminalExceptionFile=");
        sb.append(this.i);
        sb.append(", iccDataMissing=");
        sb.append(this.j);
        sb.append(", expiredApplication=");
        sb.append(this.k);
        sb.append(", declineIfCardExpired=");
        sb.append(this.l);
        sb.append(", processOnlineIfCardExpired=");
        sb.append(this.m);
        sb.append(", applicationNotEffectiveYet=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    public final int hashCode() {
        boolean z = this.f3175a;
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
        ?? r7 = this.g;
        int i6 = r7;
        if (r7 != 0) {
            i6 = 1;
        }
        ?? r8 = this.h;
        int i7 = r8;
        if (r8 != 0) {
            i7 = 1;
        }
        ?? r9 = this.i;
        int i8 = r9;
        if (r9 != 0) {
            i8 = 1;
        }
        ?? r10 = this.j;
        int i9 = r10;
        if (r10 != 0) {
            i9 = 1;
        }
        ?? r11 = this.k;
        int i10 = r11;
        if (r11 != 0) {
            i10 = 1;
        }
        ?? r12 = this.l;
        int i11 = r12;
        if (r12 != 0) {
            i11 = 1;
        }
        ?? r13 = this.m;
        int i12 = r13;
        if (r13 != 0) {
            i12 = 1;
        }
        boolean z2 = this.n;
        return (((((((((((((((((((((((((r0 * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + i9) * 31) + i10) * 31) + i11) * 31) + i12) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.terminalactionanalysis.model.TerminalActionAnalysisData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.terminalactionanalysis.model.TerminalActionAnalysisData terminalActionAnalysisData = (com.discover.mpos.sdk.cardreader.kernel.flow.terminalactionanalysis.model.TerminalActionAnalysisData) other;
        return this.f3175a == terminalActionAnalysisData.f3175a && this.b == terminalActionAnalysisData.b && this.c == terminalActionAnalysisData.c && this.d == terminalActionAnalysisData.d && this.e == terminalActionAnalysisData.e && this.f == terminalActionAnalysisData.f && this.g == terminalActionAnalysisData.g && this.h == terminalActionAnalysisData.h && this.i == terminalActionAnalysisData.i && this.j == terminalActionAnalysisData.j && this.k == terminalActionAnalysisData.k && this.l == terminalActionAnalysisData.l && this.m == terminalActionAnalysisData.m && this.n == terminalActionAnalysisData.n;
    }
}
