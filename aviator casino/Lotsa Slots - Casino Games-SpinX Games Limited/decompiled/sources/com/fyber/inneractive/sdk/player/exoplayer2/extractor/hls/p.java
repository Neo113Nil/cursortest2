package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

/* loaded from: classes3.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public static final java.util.regex.Pattern g = java.util.regex.Pattern.compile("LOCAL:([^,]+)");
    public static final java.util.regex.Pattern h = java.util.regex.Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3943a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v b;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j d;
    public int f;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();
    public byte[] e = new byte[1024];

    public p(java.lang.String str, com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar) {
        this.f3943a = str;
        this.b = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.d = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        throw new java.lang.IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        int min;
        java.util.regex.Matcher matcher;
        java.lang.String c;
        int i = (int) bVar.b;
        int i2 = this.f;
        byte[] bArr = this.e;
        if (i2 == bArr.length) {
            this.e = java.util.Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i3 = this.f;
        int length = bArr2.length - i3;
        int i4 = bVar.f;
        if (i4 == 0) {
            min = 0;
        } else {
            min = java.lang.Math.min(i4, length);
            java.lang.System.arraycopy(bVar.d, 0, bArr2, i3, min);
            bVar.b(min);
        }
        if (min == 0) {
            min = bVar.a(bArr2, i3, length, 0, true);
        }
        if (min != -1) {
            bVar.c += min;
        }
        if (min != -1) {
            int i5 = this.f + min;
            this.f = i5;
            if (i == -1 || i5 != i) {
                return 0;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(this.e);
        try {
            java.util.regex.Pattern pattern = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f4068a;
            java.lang.String c2 = nVar.c();
            if (c2 == null || !com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.b.matcher(c2).matches()) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.text.a("Expected WEBVTT. Got " + c2);
            }
            long j = 0;
            long j2 = 0;
            while (true) {
                java.lang.String c3 = nVar.c();
                if (android.text.TextUtils.isEmpty(c3)) {
                    while (true) {
                        java.lang.String c4 = nVar.c();
                        if (c4 == null) {
                            matcher = null;
                            break;
                        }
                        if (com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f4068a.matcher(c4).matches()) {
                            do {
                                c = nVar.c();
                                if (c != null) {
                                }
                            } while (!c.isEmpty());
                        } else {
                            matcher = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.a.f4067a.matcher(c4);
                            if (matcher.matches()) {
                                break;
                            }
                        }
                    }
                    if (matcher == null) {
                        this.d.a(0, 3).a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "text/vtt", 0, this.f3943a, -1, null, 0L, java.util.Collections.emptyList()));
                        this.d.b();
                    } else {
                        long a2 = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher.group(1));
                        long a3 = this.b.a((j2 + a2) - j);
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a4 = this.d.a(0, 3);
                        a4.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "text/vtt", 0, this.f3943a, -1, null, a3 - a2, java.util.Collections.emptyList()));
                        this.d.b();
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.c;
                        byte[] bArr3 = this.e;
                        int i6 = this.f;
                        nVar2.f4112a = bArr3;
                        nVar2.c = i6;
                        nVar2.b = 0;
                        a4.a(i6, nVar2);
                        a4.a(a3, 1, this.f, 0, (byte[]) null);
                    }
                    return -1;
                }
                if (c3.startsWith("X-TIMESTAMP-MAP")) {
                    java.util.regex.Matcher matcher2 = g.matcher(c3);
                    if (matcher2.find()) {
                        java.util.regex.Matcher matcher3 = h.matcher(c3);
                        if (matcher3.find()) {
                            j = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher2.group(1));
                            j2 = (java.lang.Long.parseLong(matcher3.group(1)) * 1000000) / 90000;
                        } else {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(c3));
                        }
                    } else {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(c3));
                    }
                }
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.text.a e) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(e);
        }
    }
}
