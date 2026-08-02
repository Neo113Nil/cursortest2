package androidx.media3.exoplayer;

import F3.InterfaceC3018x;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import j3.C7272n;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5449k extends j3.w {

    /* renamed from: c, reason: collision with root package name */
    public final int f44076c;

    /* renamed from: d, reason: collision with root package name */
    public final String f44077d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44078e;

    /* renamed from: f, reason: collision with root package name */
    public final C7272n f44079f;

    /* renamed from: g, reason: collision with root package name */
    public final int f44080g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3018x.b f44081h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f44082i;

    private C5449k(int i11, Exception exc, int i12) {
        this(i11, exc, i12, null, -1, null, 4, null, false);
    }

    public static C5449k d(Exception exc, String str, int i11, C7272n c7272n, int i12, InterfaceC3018x.b bVar, boolean z11, int i13) {
        if (c7272n == null) {
            i12 = 4;
        }
        return new C5449k(1, exc, i13, str, i11, c7272n, i12, bVar, z11);
    }

    public static C5449k e(int i11, IOException iOException) {
        return new C5449k(0, iOException, i11);
    }

    public static C5449k f(RuntimeException runtimeException, int i11) {
        return new C5449k(2, runtimeException, i11);
    }

    final C5449k b(InterfaceC3018x.b bVar) {
        String message = getMessage();
        int i11 = m3.N.f74289a;
        return new C5449k(message, getCause(), this.f69342a, this.f44076c, this.f44077d, this.f44078e, this.f44079f, this.f44080g, bVar, this.f69343b, this.f44082i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C5449k(String str, Throwable th2, int i11, int i12, String str2, int i13, C7272n c7272n, int i14, InterfaceC3018x.b bVar, long j11, boolean z11) {
        super(str, th2, i11, j11);
        Bundle bundle = Bundle.EMPTY;
        G10.a.c(!z11 || i12 == 1);
        G10.a.c(th2 != null || i12 == 3);
        this.f44076c = i12;
        this.f44077d = str2;
        this.f44078e = i13;
        this.f44079f = c7272n;
        this.f44080g = i14;
        this.f44081h = bVar;
        this.f44082i = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C5449k(int i11, Exception exc, int i12, String str, int i13, C7272n c7272n, int i14, InterfaceC3018x.b bVar, boolean z11) {
        this(TextUtils.isEmpty(null) ? r0 : U7.d.e(r0, ": null"), exc, i12, i11, r5, r6, r7, i14, bVar, SystemClock.elapsedRealtime(), z11);
        String str2;
        int i15;
        C7272n c7272n2;
        String str3;
        if (i11 == 0) {
            str2 = str;
            i15 = i13;
            c7272n2 = c7272n;
            str3 = "Source error";
        } else if (i11 != 1) {
            if (i11 != 3) {
                str3 = "Unexpected runtime error";
            } else {
                str3 = "Remote error";
            }
            str2 = str;
            i15 = i13;
            c7272n2 = c7272n;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i15 = i13;
            sb2.append(i15);
            sb2.append(", format=");
            c7272n2 = c7272n;
            sb2.append(c7272n2);
            sb2.append(", format_supported=");
            sb2.append(m3.N.A(i14));
            str3 = sb2.toString();
        }
    }
}
