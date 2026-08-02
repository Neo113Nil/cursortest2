package com.dyneti.android.dyscan;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/dyneti/android/dyscan/DyScanProgressUpdate;", "", "", "lastFourDigits", "network", "", "numberMismatch", "fewDigitsSeen", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "a", "Ljava/lang/String;", "getLastFourDigits", "()Ljava/lang/String;", util.h.xy.cb.b.f1091, "getNetwork", "c", "Z", "getNumberMismatch", "()Z", "d", "getFewDigitsSeen", "Companion", "com/dyneti/android/dyscan/y0", "com/dyneti/android/dyscan/x0", "dyscan_nonFraudEuRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DyScanProgressUpdate {
    public static final com.dyneti.android.dyscan.x0 Companion = new com.dyneti.android.dyscan.x0();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String lastFourDigits;

    /* renamed from: b, reason: from kotlin metadata */
    public final java.lang.String network;

    /* renamed from: c, reason: from kotlin metadata */
    public final boolean numberMismatch;

    /* renamed from: d, reason: from kotlin metadata */
    public final boolean fewDigitsSeen;

    public DyScanProgressUpdate() {
        this(null, null, false, false, 15, null);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String lastFour(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str.length() < 4) {
            return "";
        }
        java.lang.String substring = str.substring(str.length() - 4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    @kotlin.jvm.JvmStatic
    public static final com.dyneti.android.dyscan.y0 network(com.dyneti.android.dyscan.w wVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wVar, "");
        switch (wVar) {
            case visa:
                return com.dyneti.android.dyscan.y0.f3353a;
            case mastercard:
                return com.dyneti.android.dyscan.y0.b;
            case amex:
                return com.dyneti.android.dyscan.y0.c;
            case discover:
                return com.dyneti.android.dyscan.y0.d;
            case unionpay:
                return com.dyneti.android.dyscan.y0.e;
            case dinersclub:
                return com.dyneti.android.dyscan.y0.f;
            case jcb:
                return com.dyneti.android.dyscan.y0.g;
            case maestro:
                return com.dyneti.android.dyscan.y0.h;
            case nationalVietnam:
                return com.dyneti.android.dyscan.y0.i;
            case national:
                return com.dyneti.android.dyscan.y0.j;
            case other:
                return com.dyneti.android.dyscan.y0.k;
            case mealcard:
                return com.dyneti.android.dyscan.y0.l;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public final boolean getFewDigitsSeen() {
        return this.fewDigitsSeen;
    }

    public final java.lang.String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public final java.lang.String getNetwork() {
        return this.network;
    }

    public final boolean getNumberMismatch() {
        return this.numberMismatch;
    }

    public DyScanProgressUpdate(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.lastFourDigits = str;
        this.network = str2;
        this.numberMismatch = z;
        this.fewDigitsSeen = z2;
    }

    public /* synthetic */ DyScanProgressUpdate(java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
