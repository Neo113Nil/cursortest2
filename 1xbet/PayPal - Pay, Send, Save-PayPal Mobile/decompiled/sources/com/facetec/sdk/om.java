package com.facetec.sdk;

/* loaded from: classes8.dex */
final class om {
    static final com.facetec.sdk.of[] c = {new com.facetec.sdk.of(com.facetec.sdk.of.h, ""), new com.facetec.sdk.of(com.facetec.sdk.of.e, "GET"), new com.facetec.sdk.of(com.facetec.sdk.of.e, "POST"), new com.facetec.sdk.of(com.facetec.sdk.of.f3703a, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR), new com.facetec.sdk.of(com.facetec.sdk.of.f3703a, "/index.html"), new com.facetec.sdk.of(com.facetec.sdk.of.b, "http"), new com.facetec.sdk.of(com.facetec.sdk.of.b, "https"), new com.facetec.sdk.of(com.facetec.sdk.of.d, "200"), new com.facetec.sdk.of(com.facetec.sdk.of.d, "204"), new com.facetec.sdk.of(com.facetec.sdk.of.d, "206"), new com.facetec.sdk.of(com.facetec.sdk.of.d, "304"), new com.facetec.sdk.of(com.facetec.sdk.of.d, "400"), new com.facetec.sdk.of(com.facetec.sdk.of.d, "404"), new com.facetec.sdk.of(com.facetec.sdk.of.d, "500"), new com.facetec.sdk.of("accept-charset", ""), new com.facetec.sdk.of("accept-encoding", "gzip, deflate"), new com.facetec.sdk.of("accept-language", ""), new com.facetec.sdk.of("accept-ranges", ""), new com.facetec.sdk.of("accept", ""), new com.facetec.sdk.of("access-control-allow-origin", ""), new com.facetec.sdk.of("age", ""), new com.facetec.sdk.of("allow", ""), new com.facetec.sdk.of("authorization", ""), new com.facetec.sdk.of("cache-control", ""), new com.facetec.sdk.of("content-disposition", ""), new com.facetec.sdk.of("content-encoding", ""), new com.facetec.sdk.of("content-language", ""), new com.facetec.sdk.of("content-length", ""), new com.facetec.sdk.of("content-location", ""), new com.facetec.sdk.of("content-range", ""), new com.facetec.sdk.of("content-type", ""), new com.facetec.sdk.of("cookie", ""), new com.facetec.sdk.of("date", ""), new com.facetec.sdk.of("etag", ""), new com.facetec.sdk.of("expect", ""), new com.facetec.sdk.of("expires", ""), new com.facetec.sdk.of("from", ""), new com.facetec.sdk.of(com.datadog.android.log.LogAttributes.HOST, ""), new com.facetec.sdk.of("if-match", ""), new com.facetec.sdk.of("if-modified-since", ""), new com.facetec.sdk.of("if-none-match", ""), new com.facetec.sdk.of("if-range", ""), new com.facetec.sdk.of("if-unmodified-since", ""), new com.facetec.sdk.of("last-modified", ""), new com.facetec.sdk.of("link", ""), new com.facetec.sdk.of("location", ""), new com.facetec.sdk.of("max-forwards", ""), new com.facetec.sdk.of("proxy-authenticate", ""), new com.facetec.sdk.of("proxy-authorization", ""), new com.facetec.sdk.of("range", ""), new com.facetec.sdk.of("referer", ""), new com.facetec.sdk.of(com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, ""), new com.facetec.sdk.of("retry-after", ""), new com.facetec.sdk.of("server", ""), new com.facetec.sdk.of("set-cookie", ""), new com.facetec.sdk.of("strict-transport-security", ""), new com.facetec.sdk.of("transfer-encoding", ""), new com.facetec.sdk.of("user-agent", ""), new com.facetec.sdk.of("vary", ""), new com.facetec.sdk.of("via", ""), new com.facetec.sdk.of("www-authenticate", "")};
    static final java.util.Map<com.facetec.sdk.pq, java.lang.Integer> e;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(61);
        int i = 0;
        while (true) {
            com.facetec.sdk.of[] ofVarArr = c;
            if (i >= ofVarArr.length) {
                e = java.util.Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(ofVarArr[i].j)) {
                    linkedHashMap.put(ofVarArr[i].j, java.lang.Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    static final class b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static long g;
        private static char[] i;

        /* renamed from: a, reason: collision with root package name */
        private com.facetec.sdk.of[] f3724a;
        private final int b;
        private final java.util.List<com.facetec.sdk.of> c;
        private int d;
        private final com.facetec.sdk.pr e;
        private int f;
        private int h;
        private int j;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$c(short s, byte b, int i2) {
            int i3;
            int i4 = 4 - (i2 * 2);
            byte[] bArr = $$a;
            int i5 = b * 3;
            int i6 = 106 - s;
            byte[] bArr2 = new byte[i5 + 1];
            if (bArr == null) {
                i6 = i5;
                int i7 = i4;
                i3 = 0;
                i4++;
                i6 += i7;
                bArr2[i3] = (byte) i6;
                if (i3 == i5) {
                    return new java.lang.String(bArr2, 0);
                }
                i3++;
                i7 = bArr[i4];
                i4++;
                i6 += i7;
                bArr2[i3] = (byte) i6;
                if (i3 == i5) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i6;
                if (i3 == i5) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{8, -63, 81, 89};
            $$b = 204;
        }

        private static void k(char c, int i2, int i3, java.lang.Object[] objArr) {
            com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
            long[] jArr = new long[i3];
            hhVar.e = 0;
            while (hhVar.e < i3) {
                int i4 = hhVar.e;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i[i2 + i4])};
                    java.lang.Object d = com.facetec.sdk.al.d(-719238807);
                    if (d == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        d = com.facetec.sdk.al.c((char) (android.text.TextUtils.indexOf("", "", 0, 0) + 45150), 2149 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 24 - android.text.TextUtils.getOffsetAfter("", 0), 1926116241, false, $$c(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i4), java.lang.Long.valueOf(g), java.lang.Integer.valueOf(c)};
                    java.lang.Object d2 = com.facetec.sdk.al.d(671690243);
                    if (d2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        d2 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1835, 24 - android.view.KeyEvent.keyCodeFromString(""), -1880730373, false, $$c(b3, b4, b4), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).longValue();
                    java.lang.Object[] objArr4 = {hhVar, hhVar};
                    java.lang.Object d3 = com.facetec.sdk.al.d(898558648);
                    if (d3 == null) {
                        char resolveOpacity = (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                        double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                        byte length = (byte) $$a.length;
                        byte b5 = (byte) (length - 4);
                        d3 = com.facetec.sdk.al.c(resolveOpacity, (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 2341, (fadingEdgeLength >> 16) + 24, -1839099840, false, $$c(length, b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d3).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i3];
            hhVar.e = 0;
            while (hhVar.e < i3) {
                cArr[hhVar.e] = (char) jArr[hhVar.e];
                java.lang.Object[] objArr5 = {hhVar, hhVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                if (d4 == null) {
                    char deadChar = (char) android.view.KeyEvent.getDeadChar(0, 0);
                    int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
                    int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                    byte length2 = (byte) $$a.length;
                    byte b6 = (byte) (length2 - 4);
                    d4 = com.facetec.sdk.al.c(deadChar, 2341 - indexOf, (maximumDrawingCacheSize >> 24) + 24, -1839099840, false, $$c(length2, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr5);
            }
            objArr[0] = new java.lang.String(cArr);
        }

        b(com.facetec.sdk.pz pzVar) {
            this(4096, 4096, pzVar);
        }

        private b(int i2, int i3, com.facetec.sdk.pz pzVar) {
            this.c = new java.util.ArrayList();
            this.f3724a = new com.facetec.sdk.of[8];
            this.f = 7;
            this.h = 0;
            this.j = 0;
            this.b = 4096;
            this.d = 4096;
            this.e = com.facetec.sdk.pt.d(pzVar);
        }

        private void e() {
            java.util.Arrays.fill(this.f3724a, (java.lang.Object) null);
            this.f = this.f3724a.length - 1;
            this.h = 0;
            this.j = 0;
        }

        private int d(int i2) {
            int i3;
            if (i2 <= 0) {
                return 0;
            }
            int length = this.f3724a.length - 1;
            int i4 = 0;
            while (true) {
                i3 = this.f;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                i2 -= this.f3724a[length].g;
                this.j -= this.f3724a[length].g;
                this.h--;
                i4++;
                length--;
            }
            com.facetec.sdk.of[] ofVarArr = this.f3724a;
            try {
                java.lang.Object[] objArr = {ofVarArr, java.lang.Integer.valueOf(r4), ofVarArr, java.lang.Integer.valueOf(r4 + i4), java.lang.Integer.valueOf(this.h)};
                int i5 = i3 + 1;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                k((char) (43999 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), android.graphics.Color.green(0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15, objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                k((char) android.view.KeyEvent.normalizeMetaState(0), 15 - android.os.Process.getGidForName(""), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\'', objArr3);
                cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
                this.f += i4;
                return i4;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        final void b() throws java.io.IOException {
            while (!this.e.b()) {
                byte j = this.e.j();
                int i2 = j & 255;
                if (i2 == 128) {
                    throw new java.io.IOException("index == 0");
                }
                if ((j & 128) == 128) {
                    int c = c(i2, 127);
                    int i3 = c - 1;
                    if (c(i3)) {
                        this.c.add(com.facetec.sdk.om.c[i3]);
                    } else {
                        int b = b(i3 - com.facetec.sdk.om.c.length);
                        if (b >= 0) {
                            com.facetec.sdk.of[] ofVarArr = this.f3724a;
                            if (b < ofVarArr.length) {
                                this.c.add(ofVarArr[b]);
                            }
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Header index too large ");
                        sb.append(c);
                        throw new java.io.IOException(sb.toString());
                    }
                } else if (i2 == 64) {
                    e(new com.facetec.sdk.of(com.facetec.sdk.om.b(a()), a()));
                } else if ((j & 64) == 64) {
                    e(new com.facetec.sdk.of(e(c(i2, 63) - 1), a()));
                } else if ((j & 32) == 32) {
                    int c2 = c(i2, 31);
                    this.d = c2;
                    if (c2 < 0 || c2 > this.b) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid dynamic table size update ");
                        sb2.append(this.d);
                        throw new java.io.IOException(sb2.toString());
                    }
                    int i4 = this.j;
                    if (c2 < i4) {
                        if (c2 == 0) {
                            e();
                        } else {
                            d(i4 - c2);
                        }
                    }
                } else if (i2 == 16 || i2 == 0) {
                    this.c.add(new com.facetec.sdk.of(com.facetec.sdk.om.b(a()), a()));
                } else {
                    this.c.add(new com.facetec.sdk.of(e(c(i2, 15) - 1), a()));
                }
            }
        }

        public final java.util.List<com.facetec.sdk.of> d() {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.c);
            this.c.clear();
            return arrayList;
        }

        private int b(int i2) {
            return this.f + 1 + i2;
        }

        private com.facetec.sdk.pq e(int i2) throws java.io.IOException {
            if (c(i2)) {
                return com.facetec.sdk.om.c[i2].j;
            }
            int b = b(i2 - com.facetec.sdk.om.c.length);
            if (b >= 0) {
                com.facetec.sdk.of[] ofVarArr = this.f3724a;
                if (b < ofVarArr.length) {
                    return ofVarArr[b].j;
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Header index too large ");
            sb.append(i2 + 1);
            throw new java.io.IOException(sb.toString());
        }

        private static boolean c(int i2) {
            return i2 >= 0 && i2 <= com.facetec.sdk.om.c.length - 1;
        }

        private void e(com.facetec.sdk.of ofVar) {
            this.c.add(ofVar);
            int i2 = ofVar.g;
            int i3 = this.d;
            if (i2 > i3) {
                e();
                return;
            }
            d((this.j + i2) - i3);
            int i4 = this.h;
            com.facetec.sdk.of[] ofVarArr = this.f3724a;
            if (i4 + 1 > ofVarArr.length) {
                com.facetec.sdk.of[] ofVarArr2 = new com.facetec.sdk.of[ofVarArr.length << 1];
                try {
                    java.lang.Object[] objArr = {ofVarArr, 0, ofVarArr2, java.lang.Integer.valueOf(ofVarArr.length), java.lang.Integer.valueOf(ofVarArr.length)};
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    k((char) (android.view.KeyEvent.keyCodeFromString("") + 43999), 1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17, objArr2);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    k((char) android.text.TextUtils.indexOf("", "", 0, 0), 17 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 9 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr3);
                    cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
                    this.f = this.f3724a.length - 1;
                    this.f3724a = ofVarArr2;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = this.f;
            this.f = i5 - 1;
            this.f3724a[i5] = ofVar;
            this.h++;
            this.j += i2;
        }

        private int c() throws java.io.IOException {
            return this.e.j() & 255;
        }

        private int c(int i2, int i3) throws java.io.IOException {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int c = c();
                if ((c & 128) == 0) {
                    return i3 + (c << i5);
                }
                i3 += (c & 127) << i5;
                i5 += 7;
            }
        }

        private com.facetec.sdk.pq a() throws java.io.IOException {
            int c = c();
            boolean z = (c & 128) == 128;
            int c2 = c(c, 127);
            if (z) {
                return com.facetec.sdk.pq.d(com.facetec.sdk.ot.e().b(this.e.i(c2)));
            }
            return this.e.a(c2);
        }

        static {
            init$0();
            i = new char[]{51119, 28944, 43739, 58296, 7483, 22061, 36764, 14663, 29186, 43967, 58526, 7680, 22470, 32917, 14968, 29476, 27771, 56028, 256, 18535, 46771, 65021, 9293, 37510, 55747};
            g = -2870681790999242066L;
        }
    }

    static final class a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static char k;
        private static char l;
        private static char m;
        private static char n;

        /* renamed from: a, reason: collision with root package name */
        final com.facetec.sdk.pk f3723a;
        boolean b;
        int c;
        int d;
        int e;
        com.facetec.sdk.of[] f;
        int g;
        private final boolean h;
        private int i;
        int j;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$c(int i, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7 = (i3 * 3) + 4;
            int i8 = (i * 3) + 1;
            byte[] bArr = $$a;
            int i9 = 112 - (i2 * 3);
            byte[] bArr2 = new byte[i8];
            if (bArr == null) {
                int i10 = i7;
                i6 = 0;
                i7 += -i9;
                i5 = i10 + 1;
                i4 = i6;
                i6 = i4 + 1;
                bArr2[i4] = (byte) i7;
                if (i6 == i8) {
                    return new java.lang.String(bArr2, 0);
                }
                i10 = i5;
                i9 = bArr[i5];
                i7 += -i9;
                i5 = i10 + 1;
                i4 = i6;
                i6 = i4 + 1;
                bArr2[i4] = (byte) i7;
                if (i6 == i8) {
                }
            } else {
                i4 = 0;
                i7 = i9;
                i5 = i7;
                i6 = i4 + 1;
                bArr2[i4] = (byte) i7;
                if (i6 == i8) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{107, com.visa.cbp.getEncExpo.onUnminimized, -45, 38};
            $$b = 87;
        }

        private static void o(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] charArray = str != null ? str.toCharArray() : str;
            com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
            char[] cArr = new char[charArray.length];
            hoVar.b = 0;
            char[] cArr2 = new char[2];
            while (hoVar.b < charArray.length) {
                cArr2[0] = charArray[hoVar.b];
                cArr2[1] = charArray[hoVar.b + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr2[1];
                    char c2 = cArr2[0];
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (k ^ 2174069992062419062L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(m)};
                        int i4 = c2 + i2;
                        java.lang.Object d = com.facetec.sdk.al.d(1497828241);
                        if (d == null) {
                            d = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 211 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 23, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                        cArr2[1] = charValue;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (l ^ 2174069992062419062L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(n)};
                        int i5 = charValue + i2;
                        java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                        if (d2 == null) {
                            d2 = com.facetec.sdk.al.c((char) android.graphics.Color.blue(0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 211, android.text.TextUtils.indexOf("", "") + 23, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).charValue();
                        i2 -= 40503;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr[hoVar.b] = cArr2[0];
                cArr[hoVar.b + 1] = cArr2[1];
                java.lang.Object[] objArr4 = {hoVar, hoVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(-2113314280);
                if (d3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    d3 = com.facetec.sdk.al.c((char) (31541 - android.view.View.getDefaultSize(0, 0)), 1912 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 23, 635836640, false, $$c(b, b2, b2), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr, 0, i);
        }

        a(com.facetec.sdk.pk pkVar) {
            this(pkVar, (byte) 0);
        }

        private a(com.facetec.sdk.pk pkVar, byte b) {
            this.d = Integer.MAX_VALUE;
            this.f = new com.facetec.sdk.of[8];
            this.g = 7;
            this.i = 0;
            this.j = 0;
            this.e = 4096;
            this.c = 4096;
            this.h = true;
            this.f3723a = pkVar;
        }

        final void d() {
            java.util.Arrays.fill(this.f, (java.lang.Object) null);
            this.g = this.f.length - 1;
            this.i = 0;
            this.j = 0;
        }

        final int c(int i) {
            int i2;
            if (i <= 0) {
                return 0;
            }
            int length = this.f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.g;
                if (length < i2 || i <= 0) {
                    break;
                }
                i -= this.f[length].g;
                this.j -= this.f[length].g;
                this.i--;
                i3++;
                length--;
            }
            com.facetec.sdk.of[] ofVarArr = this.f;
            try {
                java.lang.Object[] objArr = {ofVarArr, java.lang.Integer.valueOf(r4), ofVarArr, java.lang.Integer.valueOf(r4 + i3), java.lang.Integer.valueOf(this.i)};
                int i4 = i2 + 1;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                o("야貄客㎜暕瞄첔Ꮫ쫉\uea91舛偔뼀\uf131\uf6f3砵", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                o("Ṧᚢஜ渨㤮仮產쟰㸋ຊ", 9 - android.graphics.Color.blue(0), objArr3);
                cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
                com.facetec.sdk.of[] ofVarArr2 = this.f;
                int i5 = this.g + 1;
                java.util.Arrays.fill(ofVarArr2, i5, i5 + i3, (java.lang.Object) null);
                this.g += i3;
                return i3;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        final void d(com.facetec.sdk.of ofVar) {
            int i = ofVar.g;
            int i2 = this.c;
            if (i > i2) {
                d();
                return;
            }
            c((this.j + i) - i2);
            int i3 = this.i;
            com.facetec.sdk.of[] ofVarArr = this.f;
            if (i3 + 1 > ofVarArr.length) {
                com.facetec.sdk.of[] ofVarArr2 = new com.facetec.sdk.of[ofVarArr.length << 1];
                try {
                    java.lang.Object[] objArr = {ofVarArr, 0, ofVarArr2, java.lang.Integer.valueOf(ofVarArr.length), java.lang.Integer.valueOf(ofVarArr.length)};
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    o("야貄客㎜暕瞄첔Ꮫ쫉\uea91舛偔뼀\uf131\uf6f3砵", android.graphics.Color.alpha(0) + 16, objArr2);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    o("Ṧᚢஜ渨㤮仮產쟰㸋ຊ", android.graphics.Color.blue(0) + 9, objArr3);
                    cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
                    this.g = this.f.length - 1;
                    this.f = ofVarArr2;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i4 = this.g;
            this.g = i4 - 1;
            this.f[i4] = ofVar;
            this.i++;
            this.j += i;
        }

        final void e(int i, int i2, int i3) {
            if (i < i2) {
                this.f3723a.g(i | i3);
                return;
            }
            this.f3723a.g(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f3723a.g(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f3723a.g(i4);
        }

        final void e(com.facetec.sdk.pq pqVar) throws java.io.IOException {
            if (this.h) {
                com.facetec.sdk.ot.e();
                if (com.facetec.sdk.ot.d(pqVar) < pqVar.j()) {
                    com.facetec.sdk.pk pkVar = new com.facetec.sdk.pk();
                    com.facetec.sdk.ot.e();
                    com.facetec.sdk.ot.e(pqVar, pkVar);
                    com.facetec.sdk.pq o2 = pkVar.o();
                    e(o2.j(), 127, 128);
                    this.f3723a.b(o2);
                    return;
                }
            }
            e(pqVar.j(), 127, 0);
            this.f3723a.b(pqVar);
        }

        static {
            init$0();
            l = (char) 28768;
            n = (char) 14500;
            k = (char) 5155;
            m = (char) 64339;
        }
    }

    static com.facetec.sdk.pq b(com.facetec.sdk.pq pqVar) throws java.io.IOException {
        int j = pqVar.j();
        for (int i = 0; i < j; i++) {
            byte c2 = pqVar.c(i);
            if (c2 >= 65 && c2 <= 90) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(pqVar.e());
                throw new java.io.IOException(sb.toString());
            }
        }
        return pqVar;
    }
}
