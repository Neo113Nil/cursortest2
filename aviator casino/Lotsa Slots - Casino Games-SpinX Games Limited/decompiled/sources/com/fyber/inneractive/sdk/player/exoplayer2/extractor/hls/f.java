package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f3936a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.o c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k e;
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.y f;
    public final java.util.List g;
    public boolean h;
    public byte[] i;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.g j;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a k;
    public android.net.Uri l;
    public byte[] m;
    public java.lang.String n;
    public byte[] o;
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b p;

    public f(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.o oVar, java.util.List list) {
        this.e = kVar;
        this.d = aVarArr;
        this.c = oVar;
        this.g = list;
        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            oVarArr[i] = aVarArr[i].b;
            iArr[i] = i;
        }
        this.f3936a = bVar.f3934a.a();
        this.b = bVar.f3934a.a();
        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.y(oVarArr);
        this.f = yVar;
        this.p = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.e(yVar, iArr);
    }

    public final void a(android.net.Uri uri, java.lang.String str, byte[] bArr) {
        byte[] byteArray = new java.math.BigInteger(str.toLowerCase(java.util.Locale.getDefault()).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        java.lang.System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.l = uri;
        this.m = bArr;
        this.n = str;
        this.o = bArr2;
    }
}
