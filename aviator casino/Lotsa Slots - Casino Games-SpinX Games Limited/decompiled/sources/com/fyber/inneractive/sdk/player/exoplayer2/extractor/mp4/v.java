package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f3980a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;

    public v(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        if (iArr.length != jArr2.length) {
            throw new java.lang.IllegalArgumentException();
        }
        if (jArr.length != jArr2.length) {
            throw new java.lang.IllegalArgumentException();
        }
        if (iArr2.length != jArr2.length) {
            throw new java.lang.IllegalArgumentException();
        }
        this.b = jArr;
        this.c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.f3980a = jArr.length;
    }
}
