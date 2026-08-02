package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class XD extends K7 {

    /* renamed from: m, reason: collision with root package name */
    public final int f12159m;

    /* renamed from: n, reason: collision with root package name */
    public final String f12160n;

    /* renamed from: o, reason: collision with root package name */
    public final int f12161o;

    /* renamed from: p, reason: collision with root package name */
    public final C1407p f12162p;

    /* renamed from: q, reason: collision with root package name */
    public final int f12163q;

    /* renamed from: r, reason: collision with root package name */
    public final C1603tG f12164r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f12165s;

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public XD(int i, Exception exc, int i5) {
        this(i, exc, i5, null, -1, null, 4, false);
    }

    public final XD a(C1603tG c1603tG) {
        String message = getMessage();
        int i = AbstractC1260lo.f14419a;
        return new XD(message, getCause(), this.f10130k, this.f12159m, this.f12160n, this.f12161o, this.f12162p, this.f12163q, c1603tG, this.f10131l, this.f12165s);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public XD(int i, Exception exc, int i5, String str, int i6, C1407p c1407p, int i7, boolean z3) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), exc, i5, i, r5, r6, c1407p, i7, null, SystemClock.elapsedRealtime(), z3);
        String str2;
        int i8;
        String str3;
        String str4;
        if (i == 0) {
            str2 = str;
            i8 = i6;
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
            str2 = str;
            i8 = i6;
        } else {
            String valueOf = String.valueOf(c1407p);
            int i9 = AbstractC1260lo.f14419a;
            if (i7 == 0) {
                str4 = "NO";
            } else if (i7 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i7 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i7 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i7 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i8 = i6;
            sb.append(i8);
            sb.append(", format=");
            sb.append(valueOf);
            str3 = AbstractC2107A.u(sb, ", format_supported=", str4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XD(String str, Throwable th, int i, int i5, String str2, int i6, C1407p c1407p, int i7, C1603tG c1603tG, long j5, boolean z3) {
        super(str, th, i, j5);
        int i8;
        boolean z5;
        Bundle bundle = Bundle.EMPTY;
        if (!z3) {
            i8 = i5;
            z5 = true;
        } else if (i5 == 1) {
            i8 = 1;
            z5 = true;
        } else {
            i8 = i5;
            z5 = false;
        }
        AbstractC1668us.S(z5);
        AbstractC1668us.S(th != null);
        this.f12159m = i8;
        this.f12160n = str2;
        this.f12161o = i6;
        this.f12162p = c1407p;
        this.f12163q = i7;
        this.f12164r = c1603tG;
        this.f12165s = z3;
    }
}
