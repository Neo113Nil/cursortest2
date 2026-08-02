package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.uD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1645uD {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f15808a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f15809b;

    /* renamed from: c, reason: collision with root package name */
    public int f15810c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f15811d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f15812e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f15813g;

    /* renamed from: h, reason: collision with root package name */
    public int f15814h;
    public final MediaCodec.CryptoInfo i;

    /* renamed from: j, reason: collision with root package name */
    public final C1667ur f15815j;

    public C1645uD() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.f15815j = AbstractC1260lo.f14419a >= 24 ? new C1667ur(cryptoInfo) : null;
    }

    public final void a(int i) {
        if (i == 0) {
            return;
        }
        if (this.f15811d == null) {
            int[] iArr = new int[1];
            this.f15811d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f15811d;
        iArr2[0] = iArr2[0] + i;
    }
}
