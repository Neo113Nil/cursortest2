package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class Ju extends Lt {

    /* renamed from: o, reason: collision with root package name */
    public Ww f10079o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f10080p;

    /* renamed from: q, reason: collision with root package name */
    public int f10081q;

    /* renamed from: r, reason: collision with root package name */
    public int f10082r;

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final long a(Ww ww) {
        g(ww);
        this.f10079o = ww;
        Uri normalizeScheme = ww.f12125a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        AbstractC1668us.W("Unsupported scheme: ".concat(String.valueOf(scheme)), "data".equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i = AbstractC1260lo.f14419a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new B7("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f10080p = Base64.decode(str, 0);
            } catch (IllegalArgumentException e3) {
                throw new B7("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e3, true, 0);
            }
        } else {
            this.f10080p = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        int length = this.f10080p.length;
        long j5 = length;
        long j6 = ww.f12127c;
        if (j6 > j5) {
            this.f10080p = null;
            throw new C1806xv();
        }
        int i5 = (int) j6;
        this.f10081q = i5;
        int i6 = length - i5;
        this.f10082r = i6;
        long j7 = ww.f12128d;
        if (j7 != -1) {
            this.f10082r = (int) Math.min(i6, j7);
        }
        k(ww);
        return j7 != -1 ? j7 : this.f10082r;
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.f10082r;
        if (i6 == 0) {
            return -1;
        }
        int min = Math.min(i5, i6);
        byte[] bArr2 = this.f10080p;
        int i7 = AbstractC1260lo.f14419a;
        System.arraycopy(bArr2, this.f10081q, bArr, i, min);
        this.f10081q += min;
        this.f10082r -= min;
        B(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        Ww ww = this.f10079o;
        if (ww != null) {
            return ww.f12125a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        if (this.f10080p != null) {
            this.f10080p = null;
            f();
        }
        this.f10079o = null;
    }
}
