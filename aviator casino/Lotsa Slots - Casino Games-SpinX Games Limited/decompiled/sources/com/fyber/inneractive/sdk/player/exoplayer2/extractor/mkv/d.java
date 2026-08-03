package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

/* loaded from: classes3.dex */
public final class d {
    public boolean L;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r O;
    public int P;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f3955a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public com.fyber.inneractive.sdk.player.exoplayer2.drm.d i;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = 0;
    public byte[] o = null;
    public int p = -1;
    public boolean q = false;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = 1000;
    public int v = 200;
    public float w = -1.0f;
    public float x = -1.0f;
    public float y = -1.0f;
    public float z = -1.0f;
    public float A = -1.0f;
    public float B = -1.0f;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public int G = 1;
    public int H = -1;
    public int I = 8000;
    public long J = 0;
    public long K = 0;
    public boolean M = true;
    public java.lang.String N = "eng";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03df, code lost:
    
        if (r1.g() == r2.getLeastSignificantBits()) goto L222;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0436  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, int i) {
        char c;
        java.util.List singletonList;
        java.lang.String str;
        int i2;
        int a2;
        java.util.List list;
        java.util.List list2;
        int i3;
        int i4;
        java.util.List singletonList2;
        java.util.List list3;
        java.lang.String str2;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar;
        int i5;
        int i6;
        com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar;
        byte[] bArr;
        int i7;
        java.lang.String str3 = this.f3955a;
        str3.getClass();
        str3.hashCode();
        switch (str3.hashCode()) {
            case -2095576542:
                if (str3.equals("V_MPEG4/ISO/AP")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str3.equals("V_MPEG4/ISO/SP")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str3.equals("A_MS/ACM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str3.equals("A_TRUEHD")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str3.equals("A_VORBIS")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str3.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str3.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str3.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str3.equals("S_DVBSUB")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str3.equals("V_MPEG4/ISO/ASP")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str3.equals("V_MPEG4/ISO/AVC")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str3.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str3.equals("A_DTS/LOSSLESS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str3.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str3.equals("A_AC3")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str3.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str3.equals("V_VP8")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str3.equals("V_VP9")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str3.equals("S_HDMV/PGS")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str3.equals("V_THEORA")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str3.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str3.equals("A_PCM/INT/LIT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str3.equals("V_MPEGH/ISO/HEVC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str3.equals("S_TEXT/UTF8")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str3.equals("V_MPEG2")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str3.equals("A_EAC3")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str3.equals("A_FLAC")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str3.equals("A_OPUS")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        java.lang.String str4 = "audio/x-unknown";
        switch (c) {
            case 0:
            case 1:
            case '\t':
                byte[] bArr2 = this.h;
                singletonList = bArr2 == null ? null : java.util.Collections.singletonList(bArr2);
                str = "video/mp4v-es";
                i2 = -1;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i8 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                    oVar = com.fyber.inneractive.sdk.player.exoplayer2.o.a(java.lang.Integer.toString(i), str, -1, i4, this.G, this.I, i3, -1, -1, list2, this.i, i8, this.N, null);
                    i5 = 1;
                } else if ("video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                    if (this.n == 0) {
                        int i9 = this.l;
                        i6 = -1;
                        if (i9 == -1) {
                            i9 = this.j;
                        }
                        this.l = i9;
                        int i10 = this.m;
                        if (i10 == -1) {
                            i10 = this.k;
                        }
                        this.m = i10;
                    } else {
                        i6 = -1;
                    }
                    float f = (this.l == i6 || (i7 = this.m) == i6) ? -1.0f : (this.k * r3) / (this.j * i7);
                    if (this.q) {
                        if (this.w == -1.0f || this.x == -1.0f || this.y == -1.0f || this.z == -1.0f || this.A == -1.0f || this.B == -1.0f || this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
                            wrap.put((byte) 0);
                            wrap.putShort((short) ((this.w * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.x * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.y * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.z * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.A * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.B * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.C * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.D * 50000.0f) + 0.5f));
                            wrap.putShort((short) (this.E + 0.5f));
                            wrap.putShort((short) (this.F + 0.5f));
                            wrap.putShort((short) this.u);
                            wrap.putShort((short) this.v);
                        }
                        cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.r, this.t, this.s, bArr);
                    } else {
                        cVar = null;
                    }
                    oVar = com.fyber.inneractive.sdk.player.exoplayer2.o.a(java.lang.Integer.toString(i), str, i4, this.j, this.k, list2, -1, f, this.o, this.p, cVar, this.i);
                    i5 = 2;
                } else {
                    if ("application/x-subrip".equals(str)) {
                        oVar = com.fyber.inneractive.sdk.player.exoplayer2.o.a(java.lang.Integer.toString(i), str, i8, this.N, -1, this.i, Long.MAX_VALUE, java.util.Collections.emptyList());
                    } else {
                        if (!"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unexpected MIME type.");
                        }
                        oVar = new com.fyber.inneractive.sdk.player.exoplayer2.o(java.lang.Integer.toString(i), null, str, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list2, this.i, null);
                    }
                    i5 = 3;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a3 = jVar.a(this.b, i5);
                this.O = a3;
                a3.a(oVar);
                return;
            case 2:
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(this.h);
                try {
                    int f2 = nVar.f();
                    if (f2 != 1) {
                        if (f2 == 65534) {
                            nVar.e(24);
                            long g = nVar.g();
                            java.util.UUID uuid = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e.b0;
                            if (g == uuid.getMostSignificantBits()) {
                                break;
                            }
                        }
                        android.util.Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        list = null;
                        a2 = -1;
                        i2 = a2;
                        singletonList = list;
                        str = str4;
                        list2 = singletonList;
                        i3 = i2;
                        i4 = -1;
                        int i82 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                        if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a32 = jVar.a(this.b, i5);
                        this.O = a32;
                        a32.a(oVar);
                        return;
                    }
                    a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.H);
                    if (a2 != 0) {
                        str4 = "audio/raw";
                        list = null;
                        i2 = a2;
                        singletonList = list;
                        str = str4;
                        list2 = singletonList;
                        i3 = i2;
                        i4 = -1;
                        int i822 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                        if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a322 = jVar.a(this.b, i5);
                        this.O = a322;
                        a322.a(oVar);
                        return;
                    }
                    android.util.Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.H + ". Setting mimeType to audio/x-unknown");
                    list = null;
                    a2 = -1;
                    i2 = a2;
                    singletonList = list;
                    str = str4;
                    list2 = singletonList;
                    i3 = i2;
                    i4 = -1;
                    int i8222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                    if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a3222 = jVar.a(this.b, i5);
                    this.O = a3222;
                    a3222.a(oVar);
                    return;
                } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing MS/ACM codec private");
                }
            case 3:
                str4 = "audio/true-hd";
                list = null;
                a2 = -1;
                i2 = a2;
                singletonList = list;
                str = str4;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i82222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a32222 = jVar.a(this.b, i5);
                this.O = a32222;
                a32222.a(oVar);
                return;
            case 4:
                byte[] bArr3 = this.h;
                try {
                    if (bArr3[0] != 2) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                    }
                    int i11 = 1;
                    int i12 = 0;
                    while (true) {
                        int i13 = bArr3[i11];
                        int i14 = -1;
                        if (i13 == -1) {
                            i12 += 255;
                            i11++;
                        } else {
                            int i15 = i11 + 1;
                            int i16 = i12 + i13;
                            int i17 = 0;
                            while (true) {
                                int i18 = bArr3[i15];
                                if (i18 != i14) {
                                    int i19 = i15 + 1;
                                    int i20 = i17 + i18;
                                    if (bArr3[i19] != 1) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    byte[] bArr4 = new byte[i16];
                                    java.lang.System.arraycopy(bArr3, i19, bArr4, 0, i16);
                                    int i21 = i19 + i16;
                                    if (bArr3[i21] != 3) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    int i22 = i21 + i20;
                                    if (bArr3[i22] != 5) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    byte[] bArr5 = new byte[bArr3.length - i22];
                                    java.lang.System.arraycopy(bArr3, i22, bArr5, 0, bArr3.length - i22);
                                    java.util.ArrayList arrayList = new java.util.ArrayList(2);
                                    arrayList.add(bArr4);
                                    arrayList.add(bArr5);
                                    list2 = arrayList;
                                    i3 = -1;
                                    str = "audio/vorbis";
                                    i4 = 8192;
                                    int i822222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                                    if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a322222 = jVar.a(this.b, i5);
                                    this.O = a322222;
                                    a322222.a(oVar);
                                    return;
                                }
                                i17 += 255;
                                i15++;
                                i14 = -1;
                            }
                        }
                    }
                } catch (java.lang.ArrayIndexOutOfBoundsException unused2) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                }
                break;
            case 5:
                str = "audio/mpeg-L2";
                i4 = 4096;
                list2 = null;
                i3 = -1;
                int i8222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a3222222 = jVar.a(this.b, i5);
                this.O = a3222222;
                a3222222.a(oVar);
                return;
            case 6:
                str = "audio/mpeg";
                i4 = 4096;
                list2 = null;
                i3 = -1;
                int i82222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a32222222 = jVar.a(this.b, i5);
                this.O = a32222222;
                a32222222.a(oVar);
                return;
            case 7:
                byte[] bArr6 = this.h;
                try {
                    if (16 > bArr6.length) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    if (((bArr6[16] & 255) | ((bArr6[17] & 255) << 8) | ((bArr6[18] & 255) << 16) | ((bArr6[19] & 255) << 24)) == 826496599) {
                        for (int i23 = 40; i23 < bArr6.length - 4; i23++) {
                            if (bArr6[i23] == 0 && bArr6[i23 + 1] == 0 && bArr6[i23 + 2] == 1) {
                                if (bArr6[i23 + 3] == 15) {
                                    singletonList2 = java.util.Collections.singletonList(java.util.Arrays.copyOfRange(bArr6, i23, bArr6.length));
                                }
                            }
                        }
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Failed to find FourCC VC1 initialization data");
                    }
                    singletonList2 = null;
                    if (singletonList2 != null) {
                        str4 = "video/wvc1";
                    } else {
                        android.util.Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                        str4 = "video/x-unknown";
                    }
                    list = singletonList2;
                    a2 = -1;
                    i2 = a2;
                    singletonList = list;
                    str = str4;
                    list2 = singletonList;
                    i3 = i2;
                    i4 = -1;
                    int i822222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                    if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a322222222 = jVar.a(this.b, i5);
                    this.O = a322222222;
                    a322222222.a(oVar);
                    return;
                } catch (java.lang.ArrayIndexOutOfBoundsException unused3) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing FourCC VC1 codec private");
                }
            case '\b':
                byte[] bArr7 = this.h;
                singletonList = java.util.Collections.singletonList(new byte[]{bArr7[0], bArr7[1], bArr7[2], bArr7[3]});
                str = "application/dvbsubs";
                i2 = -1;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i8222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a3222222222 = jVar.a(this.b, i5);
                this.O = a3222222222;
                a3222222222.a(oVar);
                return;
            case '\n':
                com.fyber.inneractive.sdk.player.exoplayer2.video.a a4 = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(new com.fyber.inneractive.sdk.player.exoplayer2.util.n(this.h));
                list3 = a4.f4122a;
                this.P = a4.b;
                str2 = "video/avc";
                i2 = -1;
                java.util.List list4 = list3;
                str = str2;
                singletonList = list4;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i82222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a32222222222 = jVar.a(this.b, i5);
                this.O = a32222222222;
                a32222222222.a(oVar);
                return;
            case 11:
                singletonList = java.util.Collections.singletonList(this.h);
                str = "application/vobsub";
                i2 = -1;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i822222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a322222222222 = jVar.a(this.b, i5);
                this.O = a322222222222;
                a322222222222.a(oVar);
                return;
            case '\f':
                str4 = "audio/vnd.dts.hd";
                list = null;
                a2 = -1;
                i2 = a2;
                singletonList = list;
                str = str4;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i8222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a3222222222222 = jVar.a(this.b, i5);
                this.O = a3222222222222;
                a3222222222222.a(oVar);
                return;
            case '\r':
                singletonList = java.util.Collections.singletonList(this.h);
                str = "audio/mp4a-latm";
                i2 = -1;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i82222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a32222222222222 = jVar.a(this.b, i5);
                this.O = a32222222222222;
                a32222222222222.a(oVar);
                return;
            case 14:
                str4 = "audio/ac3";
                list = null;
                a2 = -1;
                i2 = a2;
                singletonList = list;
                str = str4;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i822222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a322222222222222 = jVar.a(this.b, i5);
                this.O = a322222222222222;
                a322222222222222.a(oVar);
                return;
            case 15:
            case 20:
                str4 = "audio/vnd.dts";
                list = null;
                a2 = -1;
                i2 = a2;
                singletonList = list;
                str = str4;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i8222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a3222222222222222 = jVar.a(this.b, i5);
                this.O = a3222222222222222;
                a3222222222222222.a(oVar);
                return;
            case 16:
                str4 = "video/x-vnd.on2.vp8";
                list = null;
                a2 = -1;
                i2 = a2;
                singletonList = list;
                str = str4;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i82222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a32222222222222222 = jVar.a(this.b, i5);
                this.O = a32222222222222222;
                a32222222222222222.a(oVar);
                return;
            case 17:
                str4 = "video/x-vnd.on2.vp9";
                list = null;
                a2 = -1;
                i2 = a2;
                singletonList = list;
                str = str4;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i822222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a322222222222222222 = jVar.a(this.b, i5);
                this.O = a322222222222222222;
                a322222222222222222.a(oVar);
                return;
            case 18:
                str4 = "application/pgs";
                list = null;
                a2 = -1;
                i2 = a2;
                singletonList = list;
                str = str4;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i8222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a3222222222222222222 = jVar.a(this.b, i5);
                this.O = a3222222222222222222;
                a3222222222222222222.a(oVar);
                return;
            case 19:
                str4 = "video/x-unknown";
                list = null;
                a2 = -1;
                i2 = a2;
                singletonList = list;
                str = str4;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i82222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a32222222222222222222 = jVar.a(this.b, i5);
                this.O = a32222222222222222222;
                a32222222222222222222.a(oVar);
                return;
            case 21:
                a2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.H);
                if (a2 != 0) {
                    str4 = "audio/raw";
                    list = null;
                    i2 = a2;
                    singletonList = list;
                    str = str4;
                    list2 = singletonList;
                    i3 = i2;
                    i4 = -1;
                    int i822222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                    if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a322222222222222222222 = jVar.a(this.b, i5);
                    this.O = a322222222222222222222;
                    a322222222222222222222.a(oVar);
                    return;
                }
                android.util.Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.H + ". Setting mimeType to audio/x-unknown");
                list = null;
                a2 = -1;
                i2 = a2;
                singletonList = list;
                str = str4;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i8222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a3222222222222222222222 = jVar.a(this.b, i5);
                this.O = a3222222222222222222222;
                a3222222222222222222222.a(oVar);
                return;
            case 22:
                com.fyber.inneractive.sdk.player.exoplayer2.video.d a5 = com.fyber.inneractive.sdk.player.exoplayer2.video.d.a(new com.fyber.inneractive.sdk.player.exoplayer2.util.n(this.h));
                list3 = a5.f4124a;
                this.P = a5.b;
                str2 = "video/hevc";
                i2 = -1;
                java.util.List list42 = list3;
                str = str2;
                singletonList = list42;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i82222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a32222222222222222222222 = jVar.a(this.b, i5);
                this.O = a32222222222222222222222;
                a32222222222222222222222.a(oVar);
                return;
            case 23:
                str4 = "application/x-subrip";
                list = null;
                a2 = -1;
                i2 = a2;
                singletonList = list;
                str = str4;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i822222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a322222222222222222222222 = jVar.a(this.b, i5);
                this.O = a322222222222222222222222;
                a322222222222222222222222.a(oVar);
                return;
            case 24:
                str4 = "video/mpeg2";
                list = null;
                a2 = -1;
                i2 = a2;
                singletonList = list;
                str = str4;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i8222222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a3222222222222222222222222 = jVar.a(this.b, i5);
                this.O = a3222222222222222222222222;
                a3222222222222222222222222.a(oVar);
                return;
            case 25:
                str4 = "audio/eac3";
                list = null;
                a2 = -1;
                i2 = a2;
                singletonList = list;
                str = str4;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i82222222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a32222222222222222222222222 = jVar.a(this.b, i5);
                this.O = a32222222222222222222222222;
                a32222222222222222222222222.a(oVar);
                return;
            case 26:
                singletonList = java.util.Collections.singletonList(this.h);
                str = "audio/flac";
                i2 = -1;
                list2 = singletonList;
                i3 = i2;
                i4 = -1;
                int i822222222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a322222222222222222222222222 = jVar.a(this.b, i5);
                this.O = a322222222222222222222222222;
                a322222222222222222222222222.a(oVar);
                return;
            case 27:
                java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
                arrayList2.add(this.h);
                arrayList2.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.J).array());
                arrayList2.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(this.K).array());
                str = "audio/opus";
                list2 = arrayList2;
                i4 = 5760;
                i3 = -1;
                int i8222222222222222222222222222 = (this.M ? 1 : 0) | (!this.L ? 2 : 0);
                if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a3222222222222222222222222222 = jVar.a(this.b, i5);
                this.O = a3222222222222222222222222222;
                a3222222222222222222222222222.a(oVar);
                return;
            default:
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unrecognized codec identifier.");
        }
    }
}
