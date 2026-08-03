package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class km {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3062 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f3063 = -1549132124806242019L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f3064;

    public interface c {
        /* renamed from: ﾒ */
        void mo7414(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static java.lang.Object m8457(java.lang.Class<?> cls, java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.km.c cVar) {
        int i = 2 % 2;
        try {
            java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(java.lang.Thread.currentThread().getContextClassLoader(), new java.lang.Class[]{cls, com.ironsource.adqualitysdk.sdk.i.hj.class}, new com.ironsource.adqualitysdk.sdk.i.km.b(obj, cVar));
            int i2 = f3064 + 81;
            f3062 = i2 % 128;
            int i3 = i2 % 2;
            return newProxyInstance;
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8458("⅍聀挬싨ꗘң\ue673䤽⠉诉", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 41263).intern(), m8458("⅘貈窡⣇雳䒾㈞\ue022丅㱡\uea69妕ި\uf5d2ꏚᇄ？괥᭛쥁띕抋키뺳泇\udaf3蠟瘯\u242b鈖䁸⾍鶉䮲㦓\ue7ef唄̊\uf114彃൫\uf896ꚞᒨ식냅ỳ찕먾桙홏葷玐↪迂緎", android.view.View.MeasureSpec.getSize(0) + 44519).intern(), th, true);
            try {
                return java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls, com.ironsource.adqualitysdk.sdk.i.hj.class}, new com.ironsource.adqualitysdk.sdk.i.km.b(obj, cVar));
            } catch (java.lang.Throwable th2) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8458("⅍聀挬싨ꗘң\ue673䤽⠉诉", android.text.TextUtils.getCapsMode("", 0, 0) + 41263).intern(), m8458("⅘㓴ਖ਼憣眃䴺ꃖ뙎跥\ue30d率쳑∸㦶༂敘磟丹ꖃ믥酅\ue4cf館톟⟧㵟თ昫綛厲ꥀ벱鈉\ue98eﾫ핋⢴㸎ᑜ毬䅄咽ꨀ聘韖\ued43삣혍Ɀ", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 5531).intern(), th2, true);
                return obj;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((r3 instanceof com.ironsource.adqualitysdk.sdk.i.hj) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0015, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (java.lang.reflect.Proxy.isProxyClass(r3.getClass()) == false) goto L14;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m8459(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f3064 + 47;
        f3062 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
        int i4 = f3064 + 109;
        f3062 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    static class b implements java.lang.reflect.InvocationHandler {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f3065 = 1;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static char f3066 = 19331;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f3067 = 0;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char f3068 = 3344;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char f3069 = 60067;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char f3070 = 59789;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private java.lang.Object f3071;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private com.ironsource.adqualitysdk.sdk.i.km.c f3072;

        b(java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.km.c cVar) {
            this.f3071 = obj;
            this.f3072 = cVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
            int i = 2 % 2;
            int i2 = f3065 + 91;
            f3067 = i2 % 128;
            int i3 = i2 % 2;
            java.lang.Object obj2 = null;
            if (m8462(method)) {
                try {
                    return m8463(method);
                } catch (java.lang.Throwable th) {
                    java.lang.String intern = m8464("馎蟷İ\u200d䭒団㨢敽\uf5a7ᚌ", 11 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(m8464("ﯧ\udf56츤琉迵땨畢毮\uab1c㗘뤘㿥㹕퇢츞\uf0a3\udb64렻蝝穣템▷齪Ƶဲ\ud9b8궗ങ慕\ue166", android.text.TextUtils.getOffsetBefore("", 0) + 30).intern());
                    sb.append(method.getName());
                    com.ironsource.adqualitysdk.sdk.i.kl.m8455(intern, sb.toString(), th, true);
                    return null;
                }
            }
            try {
                this.f3072.mo7414(obj, method, objArr);
            } catch (java.lang.Throwable th2) {
                java.lang.String intern2 = m8464("馎蟷İ\u200d䭒団㨢敽\uf5a7ᚌ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10).intern();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(m8464("ﯧ\udf56츤琉迵땨畢毮\uab1c㗘뤘㿥\uf640唕ꛁ豼沁蟧\ue5ba埥㹼쮷ಧ\ue707", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22).intern());
                java.lang.Object obj3 = this.f3071;
                sb2.append(obj3 != null ? obj3.toString() : m8464("纂彴\ue1b0ꁯ", '4' - android.text.AndroidCharacter.getMirror('0')).intern());
                sb2.append(m8464("齪Ƶဲ\ud9b8궗ങ黋\ue45a", android.text.TextUtils.lastIndexOf("", '0', 0) + 9).intern());
                sb2.append(method.getName());
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(intern2, sb2.toString(), th2, true);
                int i4 = f3067 + 75;
                f3065 = i4 % 128;
                int i5 = i4 % 2;
            }
            java.lang.Object obj4 = this.f3071;
            if (obj4 != null) {
                return method.invoke(obj4, objArr);
            }
            if (!java.lang.Object.class.equals(method.getDeclaringClass())) {
                return null;
            }
            int i6 = f3065 + 119;
            f3067 = i6 % 128;
            if (i6 % 2 != 0) {
                method.invoke(this, m8460(objArr));
                super.hashCode();
                throw null;
            }
            java.lang.Object invoke = method.invoke(this, m8460(objArr));
            int i7 = f3065 + 69;
            f3067 = i7 % 128;
            if (i7 % 2 == 0) {
                return invoke;
            }
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static java.lang.Object[] m8460(java.lang.Object[] objArr) {
            int i = 2 % 2;
            int i2 = f3065 + 21;
            f3067 = i2 % 128;
            int i3 = i2 % 2;
            if (objArr != null) {
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int i4 = f3065 + 75;
                    f3067 = i4 % 128;
                    int i5 = i4 % 2;
                    for (java.lang.Object obj : objArr) {
                        int i6 = f3067 + 37;
                        f3065 = i6 % 128;
                        int i7 = i6 % 2;
                        if (!(!java.lang.reflect.Proxy.isProxyClass(obj.getClass()))) {
                            arrayList.add(java.lang.reflect.Proxy.getInvocationHandler(obj));
                            int i8 = f3065 + 95;
                            f3067 = i8 % 128;
                            int i9 = i8 % 2;
                        } else {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList.toArray();
                } catch (java.lang.Throwable th) {
                    com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8464("馎蟷İ\u200d䭒団㨢敽\uf5a7ᚌ", android.view.View.getDefaultSize(0, 0) + 10).intern(), m8464("ﯧ\udf56츤琉迵땨꓄⋤ㆣۿ畢毮룎誛畢毮\uab1c㗘勢뿐㨢敽礅䒻㹕퇢⚛藁秠Ɇ", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 29).intern(), th, true);
                }
            }
            return objArr;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static boolean m8462(java.lang.reflect.Method method) {
            int i = 2 % 2;
            int i2 = f3065 + 79;
            f3067 = i2 % 128;
            int i3 = i2 % 2;
            java.lang.String name = method.getName();
            if (name.hashCode() == 1622498214 && name.equals(m8464("꓄⋤\ue0cb쨡䲽생ఊ䢹椮鶵鳵핻싟쭒\ue1b0ꁯ䮙麃\uda33⽰", 20 - (android.os.Process.myTid() >> 22)).intern())) {
                int i4 = f3067 + 79;
                f3065 = i4 % 128;
                if (!(i4 % 2 == 0)) {
                    return true;
                }
            }
            int i5 = f3067 + 115;
            f3065 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private java.lang.Object m8463(java.lang.reflect.Method method) {
            int i = 2 % 2;
            int i2 = f3065;
            int i3 = i2 + 99;
            f3067 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (method != null) {
                int i4 = i2 + 57;
                f3067 = i4 % 128;
                int i5 = i4 % 2;
                java.lang.String name = method.getName();
                if (name.hashCode() == 1622498214 && name.equals(m8464("꓄⋤\ue0cb쨡䲽생ఊ䢹椮鶵鳵핻싟쭒\ue1b0ꁯ䮙麃\uda33⽰", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20).intern())) {
                    return m8461();
                }
            }
            int i6 = f3067 + 49;
            f3065 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 86 / 0;
            }
            return null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private java.lang.Object m8461() {
            int i = 2 % 2;
            int i2 = f3065;
            int i3 = i2 + 39;
            f3067 = i3 % 128;
            if (i3 % 2 != 0) {
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }
            java.lang.Object obj2 = this.f3071;
            int i4 = i2 + 17;
            f3067 = i4 % 128;
            int i5 = i4 % 2;
            return obj2;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static java.lang.String m8464(java.lang.String str, int i) {
            java.lang.String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (com.ironsource.adqualitysdk.sdk.i.o.f3104) {
                char[] cArr3 = new char[cArr2.length];
                com.ironsource.adqualitysdk.sdk.i.o.f3105 = 0;
                char[] cArr4 = new char[2];
                while (com.ironsource.adqualitysdk.sdk.i.o.f3105 < cArr2.length) {
                    cArr4[0] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105];
                    cArr4[1] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr4[1];
                        char c2 = cArr4[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f3070)) ^ ((c2 >>> 5) + f3066)));
                        cArr4[1] = c3;
                        cArr4[0] = (char) (c2 - (((c3 >>> 5) + f3068) ^ ((c3 + i2) ^ ((c3 << 4) + f3069))));
                        i2 -= 40503;
                    }
                    cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105] = cArr4[0];
                    cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1] = cArr4[1];
                    com.ironsource.adqualitysdk.sdk.i.o.f3105 += 2;
                }
                str2 = new java.lang.String(cArr3, 0, i);
            }
            return str2;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.String m8458(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.i.f2464) {
            com.ironsource.adqualitysdk.sdk.i.i.f2465 = i;
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.i.f2463 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.i.f2463 < cArr2.length) {
                cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f3063);
                com.ironsource.adqualitysdk.sdk.i.i.f2463++;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
