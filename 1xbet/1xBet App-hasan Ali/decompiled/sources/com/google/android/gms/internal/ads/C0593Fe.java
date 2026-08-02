package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Fe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593Fe implements InterfaceC1402ov {

    /* renamed from: k, reason: collision with root package name */
    public final C0953eu f8954k;

    /* renamed from: l, reason: collision with root package name */
    public final long f8955l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC1402ov f8956m;

    /* renamed from: n, reason: collision with root package name */
    public long f8957n;

    /* renamed from: o, reason: collision with root package name */
    public Uri f8958o;

    public C0593Fe(C0953eu c0953eu, int i, InterfaceC1402ov interfaceC1402ov) {
        this.f8954k = c0953eu;
        this.f8955l = i;
        this.f8956m = interfaceC1402ov;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final long a(Ww ww) {
        Ww ww2;
        this.f8958o = ww.f12125a;
        long j5 = ww.f12127c;
        long j6 = this.f8955l;
        Ww ww3 = null;
        long j7 = ww.f12128d;
        if (j5 >= j6) {
            ww2 = null;
        } else {
            long j8 = j6 - j5;
            if (j7 != -1) {
                j8 = Math.min(j7, j8);
            }
            ww2 = new Ww(ww.f12125a, j5, j8);
        }
        long j9 = ww.f12127c;
        if (j7 == -1 || j9 + j7 > j6) {
            ww3 = new Ww(ww.f12125a, Math.max(j6, j9), j7 != -1 ? Math.min(j7, (j9 + j7) - j6) : -1L);
        }
        long a5 = ww2 != null ? this.f8954k.a(ww2) : 0L;
        long a6 = ww3 != null ? this.f8956m.a(ww3) : 0L;
        this.f8957n = j9;
        if (a5 == -1 || a6 == -1) {
            return -1L;
        }
        return a5 + a6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Map b() {
        return Cv.f8103q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void d(RB rb) {
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        int i6;
        long j5 = this.f8957n;
        long j6 = this.f8955l;
        if (j5 < j6) {
            int e3 = this.f8954k.e(bArr, i, (int) Math.min(i5, j6 - j5));
            long j7 = this.f8957n + e3;
            this.f8957n = j7;
            i6 = e3;
            j5 = j7;
        } else {
            i6 = 0;
        }
        if (j5 < j6) {
            return i6;
        }
        int e5 = this.f8956m.e(bArr, i + i6, i5 - i6);
        int i7 = i6 + e5;
        this.f8957n += e5;
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        return this.f8958o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        this.f8954k.j();
        this.f8956m.j();
    }
}
