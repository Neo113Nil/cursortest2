package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ih {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2520 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2521 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2522 = -7336706130906380083L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2523 = 1796;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2524;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2525;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.util.Map<com.ironsource.adqualitysdk.sdk.i.ig.e, com.ironsource.adqualitysdk.sdk.i.ib> f2526;

    public ih() {
        m8022("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", 1 - android.text.TextUtils.getCapsMode("", 0, 0)).intern();
        this.f2526 = new java.util.HashMap();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <T> T m8030(java.lang.Class cls, java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.hz hzVar, T t) {
        int i = 2 % 2;
        int i2 = f2520 + 51;
        f2521 = i2 % 128;
        int i3 = i2 % 2;
        try {
            java.lang.reflect.Field m7868 = com.ironsource.adqualitysdk.sdk.i.id.m7934().m7937().m7868(cls, hzVar);
            if (m7868 == null) {
                return t;
            }
            T t2 = (T) m7868.get(obj);
            int i4 = f2520 + 53;
            f2521 = i4 % 128;
            if (i4 % 2 == 0) {
                return t2;
            }
            throw null;
        } catch (java.lang.Throwable unused) {
            java.lang.String intern = m8022("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", 1 - android.view.View.resolveSizeAndState(0, 0, 0)).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8022("㤯㥪왲\uf6ab컍\ue743숈\ud800ᩩ\uea53숂\ufff6缳褳껀ꊩ僔됻", 1 - android.graphics.Color.argb(0, 0, 0, 0)).intern());
            sb.append(hzVar.m7885());
            sb.append(m8037((char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 1), "\u0000\u0000\u0000\u0000", "ᠵ㩇玕\ue531", "\u1ff0\uaad6㗍坡ꊘ㡷巰蛾渉죦ᒜ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1791342824).intern());
            sb.append(cls);
            sb.append(m8037((char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29515), "\u0000\u0000\u0000\u0000", "ﱞ鐲䮳୳", "퉰媈⌫൰筵\ue0f3", android.widget.ExpandableListView.getPackedPositionGroup(0L)).intern());
            com.ironsource.adqualitysdk.sdk.i.m.m8524(intern, sb.toString());
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static java.util.List<java.lang.Object> m8038(java.lang.Class cls, java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.hz hzVar) {
        int i = 2 % 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Iterator<java.lang.reflect.Field> it = com.ironsource.adqualitysdk.sdk.i.id.m7934().m7937().m7867(cls, hzVar).iterator();
            int i2 = f2520 + 19;
            f2521 = i2 % 128;
            int i3 = i2 % 2;
            while (it.hasNext()) {
                int i4 = f2520 + 57;
                f2521 = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList.add(it.next().get(obj));
                    int i5 = 44 / 0;
                } else {
                    arrayList.add(it.next().get(obj));
                }
            }
        } catch (java.lang.Throwable unused) {
            java.lang.String intern = m8022("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8022("㤯㥪왲\uf6ab컍\ue743숈\ud800ᩩ\uea53숂\ufff6缳褳껀ꊩ僔됻", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1).intern());
            sb.append(hzVar.m7885());
            sb.append(m8037((char) android.view.View.resolveSize(0, 0), "\u0000\u0000\u0000\u0000", "ᠵ㩇玕\ue531", "\u1ff0\uaad6㗍坡ꊘ㡷巰蛾渉죦ᒜ", (-1791342824) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
            sb.append(cls);
            sb.append(m8037((char) (29515 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), "\u0000\u0000\u0000\u0000", "ﱞ鐲䮳୳", "퉰媈⌫൰筵\ue0f3", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
            com.ironsource.adqualitysdk.sdk.i.m.m8524(intern, sb.toString());
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final <T> com.ironsource.adqualitysdk.sdk.i.Cif<T> m8045(java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.ii iiVar, com.ironsource.adqualitysdk.sdk.i.hx hxVar, java.util.List<java.lang.String> list, int i) {
        int i2 = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.Cif<T> m8044 = m8044(obj, new com.ironsource.adqualitysdk.sdk.i.ig.d().m7992(true).m7993(iiVar, hxVar, list, i));
        int i3 = f2520 + 11;
        f2521 = i3 % 128;
        int i4 = i3 % 2;
        return m8044;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final <T> com.ironsource.adqualitysdk.sdk.i.Cif<T> m8044(java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.ig igVar) {
        int i = 2 % 2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.ironsource.adqualitysdk.sdk.i.ig.e m7975 = igVar.m7975(obj.getClass());
        com.ironsource.adqualitysdk.sdk.i.ib ibVar = this.f2526.get(m7975);
        if (ibVar != null) {
            com.ironsource.adqualitysdk.sdk.i.Cif<T> m8026 = m8026(obj, ibVar);
            if (m8026 != null) {
                int i2 = f2521 + 117;
                f2520 = i2 % 128;
                if (i2 % 2 == 0) {
                    m8033(igVar.m7976(), m8026);
                    throw null;
                }
                if (m8033(igVar.m7976(), m8026)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(m8037((char) (android.view.View.resolveSizeAndState(0, 0, 0) + 19055), "\u0000\u0000\u0000\u0000", "綷\udffe潬橊", "㕍\ue223霘㳙\ue567ꮀ怭ᓥ벝\uf195\u0a65\udc29䂾䪲韄ꚓ挟Ⱒ更", android.view.View.getDefaultSize(0, 0) + 1826619005).intern());
                    sb.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
                    sb.append(m8022("鶓鷾㕯鑔㷑豱", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
                    m8023(m8026, obj, sb.toString());
                    return m8026;
                }
            }
            java.lang.String intern = m8022("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", -android.text.TextUtils.lastIndexOf("", '0')).intern();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append(m8037((char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", "藈袥\ueff6㡇", "쀁㜳\udbfe㨆갠맳빵䥨얯ݎ캞", (-158816891) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
            com.ironsource.adqualitysdk.sdk.i.m.m8524(intern, sb2.toString());
            this.f2526.remove(m7975);
        }
        com.ironsource.adqualitysdk.sdk.i.ij<T> ijVar = new com.ironsource.adqualitysdk.sdk.i.ij<>(igVar);
        com.ironsource.adqualitysdk.sdk.i.Cif<T> m8029 = m8029(obj, ijVar, 0, (com.ironsource.adqualitysdk.sdk.i.Cif) null);
        if (m8029 == null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(m8037((char) (2460 - android.graphics.ImageFormat.getBitsPerPixel(0)), "\u0000\u0000\u0000\u0000", "寤ᵌ鵩餉", "\ude8fꕄ㸰殊甂嶶䩏濾⌕亪\ue54b麃䅦", android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 1763527772).intern());
            sb3.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
            sb3.append(m8037((char) (android.text.TextUtils.indexOf("", "", 0, 0) + 16992), "\u0000\u0000\u0000\u0000", "둹胵悼婂", "\uee93뫡션պ", android.view.ViewConfiguration.getScrollBarSize() >> 8).intern());
            sb3.append(ijVar.m8053().size());
            sb3.append(m8022("辢辂\ud8a2婥퀀䮝膇鮊곳\uf4c0滟뱯짪韾ȉ\ue168\ue64dꪮ℧", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1).intern());
            m8023(null, obj, sb3.toString());
            return null;
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(m8037((char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", "艡旊墽獟", "Ꮚ趝鼋㌻䫁覿ꃁ츄.", android.view.View.resolveSize(0, 0) - 1117402494).intern());
        sb4.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb4.append(m8037((char) (android.view.View.combineMeasuredStates(0, 0) + 16992), "\u0000\u0000\u0000\u0000", "둹胵悼婂", "\uee93뫡션պ", android.view.View.MeasureSpec.getMode(0)).intern());
        sb4.append(ijVar.m8053().size());
        sb4.append(m8022("辢辂\ud8a2婥퀀䮝膇鮊곳\uf4c0滟뱯짪韾ȉ\ue168\ue64dꪮ℧", -android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0)).intern());
        m8023(m8029, obj, sb4.toString());
        this.f2526.put(m7975, ijVar.m8054());
        int i3 = f2520 + 21;
        f2521 = i3 % 128;
        if (i3 % 2 == 0) {
            return m8029;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final java.util.List<com.ironsource.adqualitysdk.sdk.i.Cif> m8042(java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.ig igVar) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ij ijVar = new com.ironsource.adqualitysdk.sdk.i.ij(igVar);
        ijVar.m8056();
        m8029(obj, ijVar, 0, (com.ironsource.adqualitysdk.sdk.i.Cif) null);
        java.util.ArrayList arrayList = new java.util.ArrayList(ijVar.m8049());
        int i2 = f2520 + 75;
        f2521 = i2 % 128;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private <T> com.ironsource.adqualitysdk.sdk.i.Cif<T> m8026(java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.ib ibVar) {
        int i = 2 % 2;
        int i2 = f2521 + 29;
        f2520 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object obj2 = null;
        try {
            com.ironsource.adqualitysdk.sdk.i.Cif<T> m8035 = m8035(m8036(obj, ibVar.m7917().get(0), (com.ironsource.adqualitysdk.sdk.i.Cif) null), ibVar, 1);
            int i4 = f2520 + 119;
            f2521 = i4 % 128;
            if (i4 % 2 == 0) {
                return m8035;
            }
            super.hashCode();
            throw null;
        } catch (java.lang.Exception e) {
            com.ironsource.adqualitysdk.sdk.i.m.m8532(m8022("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", 1 - android.text.TextUtils.getOffsetAfter("", 0)).intern(), m8037((char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 1), "\u0000\u0000\u0000\u0000", "ꄟ庁ꣃ\ud8ac", "\udd42ꅞ⧭耄㐓\ueef1ꖀꁓ记ᷔ✟ᵽ⯞ܐ蚞\ueefb֖糭卶ꪬ鞵䝌飣ꕱ眾瞹佭鈩ഗ칍턘ᮉ抐鼈世", (-1017216607) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), e);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private <T> com.ironsource.adqualitysdk.sdk.i.Cif<T> m8035(com.ironsource.adqualitysdk.sdk.i.Cif cif, com.ironsource.adqualitysdk.sdk.i.ib ibVar, int i) {
        com.ironsource.adqualitysdk.sdk.i.Cif m8036;
        int i2 = 2 % 2;
        int i3 = f2521 + 61;
        f2520 = i3 % 128;
        int i4 = i3 % 2;
        if (i >= ibVar.m7917().size()) {
            int i5 = f2520 + 3;
            f2521 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 15 / 0;
            }
            return cif;
        }
        int i7 = f2520 + 105;
        f2521 = i7 % 128;
        int i8 = i7 % 2;
        java.util.List<java.lang.reflect.Field> list = ibVar.m7917().get(i);
        java.lang.Object mo7963 = cif.mo7963();
        java.util.List m8039 = m8039(mo7963);
        if (m8039 == null) {
            java.lang.String intern = m8022("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8022("ﰣﱦ焟䲖禪嵼‱㨳\udf74嵪砽᷎멫㹩ᓻ䂒闓̓㟃ꑆ炚\ue4ed튒蜦䱈즼质\uea17⽺굪ꡨ춎\u0a3d蹃䓳ょ\ue5ea匄柉ᑒ샗", android.text.TextUtils.getOffsetBefore("", 0) + 1).intern());
            sb.append(mo7963.getClass());
            com.ironsource.adqualitysdk.sdk.i.m.m8524(intern, sb.toString());
            return null;
        }
        for (java.lang.Object obj : m8039) {
            int i9 = f2521 + 33;
            f2520 = i9 % 128;
            int i10 = i9 % 2;
            try {
                m8036 = m8036(obj, list, m8021(mo7963, obj, cif));
            } catch (java.lang.Exception unused) {
            }
            if (m8036 != null) {
                return m8035(m8036, ibVar, i + 1);
            }
            continue;
        }
        int i11 = f2520 + 125;
        f2521 = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static <T> com.ironsource.adqualitysdk.sdk.i.Cif<T> m8036(java.lang.Object obj, java.util.List<java.lang.reflect.Field> list, com.ironsource.adqualitysdk.sdk.i.Cif cif) throws java.lang.IllegalAccessException {
        java.util.Iterator<java.lang.reflect.Field> it;
        java.lang.Object obj2;
        int i = 2 % 2;
        int i2 = f2520 + 117;
        f2521 = i2 % 128;
        if (i2 % 2 != 0) {
            it = list.iterator();
            int i3 = 47 / 0;
        } else {
            it = list.iterator();
        }
        while (it.hasNext()) {
            int i4 = f2520 + 71;
            f2521 = i4 % 128;
            if (i4 % 2 == 0) {
                java.lang.reflect.Field next = it.next();
                if (java.lang.ref.WeakReference.class.isAssignableFrom(next.getType())) {
                    obj2 = ((java.lang.ref.WeakReference) next.get(obj)).get();
                } else {
                    obj2 = next.get(obj);
                }
                cif = m8027(next, obj, cif);
                obj = obj2;
            } else {
                java.lang.ref.WeakReference.class.isAssignableFrom(it.next().getType());
                throw null;
            }
        }
        return cif;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r19 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if ((r17 instanceof android.app.Activity) == true) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r18.m8053().add(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r18.m8051().m7977() == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r6 = r18.m8051().m7977().mo7872(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.ih.f2520 + 91;
        com.ironsource.adqualitysdk.sdk.i.ih.f2521 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if ((r7 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r7 = 3 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        r7 = r18.m8054();
        r8 = r6.length;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (r9 >= r8) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        r10 = r6[r9];
        r10.setAccessible(true);
        r7.m7918(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        r12 = m8028(m8027(r10, r17, r20), r18, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (r12 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        r15 = com.ironsource.adqualitysdk.sdk.i.ih.f2521 + 117;
        com.ironsource.adqualitysdk.sdk.i.ih.f2520 = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        if ((r15 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        r15 = 44 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
    
        if (r18.m8055() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.ih.f2521 + 19;
        com.ironsource.adqualitysdk.sdk.i.ih.f2520 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (r18.m8055() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        r7.m7916(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.m.m8532(m8022("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1).intern(), m8022("ꭾꬻ鎕⚾鬪㝖ᅛ\u0b53蠸뾴ሗⲥ\ued62\udcd4绕燺슅\ue1dc巇锺⟄٭뢷똘ᬼ⬭\ue745\udb5c砢", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fe, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006a, code lost:
    
        r6 = m8025(r17.getClass(), r18.m8051().m7974(r19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007a, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.i.ih.f2521 + 61;
        com.ironsource.adqualitysdk.sdk.i.ih.f2520 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x002c, code lost:
    
        if (r17 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r17 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r18.m8053().contains(r17) != false) goto L50;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private <T> com.ironsource.adqualitysdk.sdk.i.Cif<T> m8029(java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.ij<T> ijVar, int i, com.ironsource.adqualitysdk.sdk.i.Cif cif) {
        int i2 = 2 % 2;
        int i3 = f2520 + 67;
        f2521 = i3 % 128;
        int i4 = i3 % 2;
        if (i != ijVar.m8051().m7970()) {
            int i5 = f2520 + 7;
            f2521 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.ironsource.adqualitysdk.sdk.i.Cif m8028(com.ironsource.adqualitysdk.sdk.i.Cif cif, com.ironsource.adqualitysdk.sdk.i.ij ijVar, int i) {
        int i2;
        java.lang.Object obj;
        int i3;
        int i4 = 2 % 2;
        int i5 = f2521 + 89;
        f2520 = i5 % 128;
        int i6 = i5 % 2;
        java.lang.Object mo7963 = cif.mo7963();
        java.lang.Object obj2 = null;
        if (ijVar.m8053().contains(mo7963) || ijVar.m8050().contains(mo7963)) {
            return null;
        }
        if (ijVar.m8051().m7973(i)) {
            int i7 = f2520 + 65;
            f2521 = i7 % 128;
            int i8 = i7 % 2;
            if (m8033(ijVar.m8051().m7976(), cif)) {
                if (!(!ijVar.m8055())) {
                    int i9 = f2521 + 45;
                    f2520 = i9 % 128;
                    int i10 = i9 % 2;
                    ijVar.m8052(cif);
                    ijVar.m8057(mo7963);
                }
                return cif;
            }
        }
        if (mo7963 instanceof java.lang.ref.WeakReference) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) mo7963;
            if (weakReference.get() != null) {
                int i11 = f2521 + 25;
                f2520 = i11 % 128;
                int i12 = i11 % 2;
                if (ijVar.m8051().m7971(i) && !(!m8034(weakReference.get(), ijVar.m8051().m7972()))) {
                    int i13 = f2521 + 11;
                    f2520 = i13 % 128;
                    if (i13 % 2 == 0) {
                        obj = weakReference.get();
                        i3 = i % 0;
                    } else {
                        obj = weakReference.get();
                        i3 = i + 1;
                    }
                    return m8029(obj, ijVar, i3, cif);
                }
            }
        }
        if (m8034(mo7963, ijVar.m8051().m7972())) {
            int i14 = f2520 + 77;
            f2521 = i14 % 128;
            if (i14 % 2 == 0) {
                i++;
            }
            return m8029(mo7963, ijVar, i, cif);
        }
        if (ijVar.m8051().m7979() && mo7963 != null) {
            ijVar.m8053().add(mo7963);
        }
        java.util.List m8040 = m8040(mo7963, ijVar.m8051(), i);
        com.ironsource.adqualitysdk.sdk.i.ib m8054 = ijVar.m8054();
        if (m8040 == null) {
            return null;
        }
        java.util.Iterator it = m8040.iterator();
        com.ironsource.adqualitysdk.sdk.i.Cif cif2 = null;
        while (it.hasNext()) {
            int i15 = f2521 + 95;
            f2520 = i15 % 128;
            if (i15 % 2 == 0) {
                com.ironsource.adqualitysdk.sdk.i.Cif m8021 = m8021(mo7963, it.next(), cif);
                m8054.m7915();
                m8028(m8021, ijVar, i);
                super.hashCode();
                throw null;
            }
            com.ironsource.adqualitysdk.sdk.i.Cif m80212 = m8021(mo7963, it.next(), cif);
            m8054.m7915();
            cif2 = m8028(m80212, ijVar, i);
            if (cif2 != null) {
                int i16 = f2520 + 17;
                f2521 = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 6 / 0;
                    if (!ijVar.m8055()) {
                        i2 = f2521 + 37;
                        f2520 = i2 % 128;
                        if (i2 % 2 == 0) {
                            return cif2;
                        }
                        throw null;
                    }
                } else if (!ijVar.m8055()) {
                    i2 = f2521 + 37;
                    f2520 = i2 % 128;
                    if (i2 % 2 == 0) {
                    }
                }
            }
            m8054.m7919();
        }
        return cif2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m8048(java.lang.Object obj, java.util.List<java.lang.String> list, int i) {
        int i2 = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ij ijVar = new com.ironsource.adqualitysdk.sdk.i.ij(new com.ironsource.adqualitysdk.sdk.i.ig.d().m7985(true).m7987(true).m7995(true).m7988(-1).m7996(new com.ironsource.adqualitysdk.sdk.i.ii() { // from class: com.ironsource.adqualitysdk.sdk.i.ih.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* renamed from: ﻐ */
            public final boolean mo7425(com.ironsource.adqualitysdk.sdk.i.Cif cif) {
                return cif.mo7963() instanceof java.lang.String;
            }
        }, list, i));
        ijVar.m8056();
        m8029(obj, ijVar, 0, (com.ironsource.adqualitysdk.sdk.i.Cif) null);
        java.util.ArrayList arrayList = new java.util.ArrayList(ijVar.m8050());
        int i3 = f2521 + 63;
        f2520 = i3 % 128;
        int i4 = i3 % 2;
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m8033(com.ironsource.adqualitysdk.sdk.i.ii iiVar, com.ironsource.adqualitysdk.sdk.i.Cif cif) {
        int i = 2 % 2;
        int i2 = f2521 + 85;
        f2520 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                boolean mo7425 = iiVar.mo7425(cif);
                int i3 = f2521 + 7;
                f2520 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 7 / 0;
                }
                return mo7425;
            }
            iiVar.mo7425(cif);
            throw null;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m8034(java.lang.Object obj, java.util.List<java.lang.String> list) {
        int i = 2 % 2;
        if (obj == null) {
            return false;
        }
        int i2 = f2520 + 59;
        f2521 = i2 % 128;
        int i3 = i2 % 2;
        boolean m8429 = com.ironsource.adqualitysdk.sdk.i.kk.m8429(obj.getClass(), list);
        int i4 = f2521 + 107;
        f2520 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return m8429;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.reflect.Field[] m8025(java.lang.Class cls, int i) {
        int i2 = 2 % 2;
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        for (int i3 = 0; cls != null && i3 != i; i3++) {
            int i4 = f2520 + 9;
            f2521 = i4 % 128;
            int i5 = i4 % 2;
            cls = cls.getSuperclass();
            if (cls != null) {
                int i6 = f2521 + 31;
                f2520 = i6 % 128;
                int i7 = i6 % 2;
                declaredFields = com.ironsource.adqualitysdk.sdk.i.kk.m8436(declaredFields, cls.getDeclaredFields());
            }
        }
        return declaredFields;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.util.List m8039(java.lang.Object obj) {
        int i = 2 % 2;
        int i2 = f2520 + 109;
        f2521 = i2 % 128;
        int i3 = i2 % 2;
        java.util.List m8041 = m8041(obj, true, true, true);
        int i4 = f2521 + 31;
        f2520 = i4 % 128;
        int i5 = i4 % 2;
        return m8041;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.util.List m8040(java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.ig igVar, int i) {
        int i2 = 2 % 2;
        int i3 = f2521 + 85;
        f2520 = i3 % 128;
        int i4 = i3 % 2;
        java.util.List m8041 = m8041(obj, igVar.m7969(i), igVar.m7978(i), igVar.m7980(i));
        int i5 = f2520 + 39;
        f2521 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return m8041;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.util.List m8041(java.lang.Object obj, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        int i2 = f2520 + 39;
        f2521 = i2 % 128;
        java.lang.Object obj2 = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (obj == null) {
            return null;
        }
        if ((obj instanceof java.util.Collection) && z) {
            return new java.util.ArrayList((java.util.Collection) obj);
        }
        if (obj.getClass().isArray()) {
            int i3 = f2521 + 49;
            f2520 = i3 % 128;
            if (i3 % 2 == 0) {
                super.hashCode();
                throw null;
            }
            if (z3) {
                return new java.util.ArrayList(java.util.Arrays.asList(obj));
            }
        }
        if (!(obj instanceof java.util.Map)) {
            return null;
        }
        int i4 = f2520 + 49;
        f2521 = i4 % 128;
        int i5 = i4 % 2;
        if (!z2) {
            return null;
        }
        java.util.Map map = (java.util.Map) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.values());
        arrayList.addAll(map.keySet());
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static <T> com.ironsource.adqualitysdk.sdk.i.Cif<T> m8027(java.lang.reflect.Field field, java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.Cif cif) {
        int i = 2 % 2;
        com.ironsource.adqualitysdk.sdk.i.ik ikVar = new com.ironsource.adqualitysdk.sdk.i.ik(field, obj, cif);
        int i2 = f2521 + 25;
        f2520 = i2 % 128;
        if (i2 % 2 != 0) {
            return ikVar;
        }
        java.lang.Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static <T> com.ironsource.adqualitysdk.sdk.i.Cif<T> m8021(java.lang.Object obj, java.lang.Object obj2, com.ironsource.adqualitysdk.sdk.i.Cif cif) {
        int i = 2 % 2;
        int i2 = f2521 + 111;
        f2520 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
            if (obj == null) {
                return null;
            }
        } else if (obj == null) {
            return null;
        }
        if (obj instanceof java.util.Collection) {
            com.ironsource.adqualitysdk.sdk.i.ik ikVar = new com.ironsource.adqualitysdk.sdk.i.ik((java.util.Collection) obj, obj2, cif);
            int i4 = f2520 + 101;
            f2521 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
            return ikVar;
        }
        if (obj instanceof java.util.Map) {
            return new com.ironsource.adqualitysdk.sdk.i.ik((java.util.Map) obj, obj2, cif);
        }
        if (obj.getClass().isArray()) {
            return new com.ironsource.adqualitysdk.sdk.i.ik(new java.util.ArrayList(java.util.Arrays.asList(obj)), obj2, cif);
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final java.lang.String m8043(java.lang.Class cls, java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2521 + 117;
        f2520 = i2 % 128;
        int i3 = i2 % 2;
        java.lang.String m8031 = m8031((java.lang.Object) null, cls, str);
        int i4 = f2521 + 33;
        f2520 = i4 % 128;
        if (i4 % 2 != 0) {
            return m8031;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final java.lang.String m8046(java.lang.Object obj, java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2521 + 125;
        f2520 = i2 % 128;
        if (i2 % 2 == 0) {
            m8031(obj, obj.getClass(), str);
            java.lang.Object obj2 = null;
            super.hashCode();
            throw null;
        }
        java.lang.String m8031 = m8031(obj, obj.getClass(), str);
        int i3 = f2521 + 83;
        f2520 = i3 % 128;
        int i4 = i3 % 2;
        return m8031;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final java.lang.String m8047(java.lang.Object obj, org.json.JSONArray jSONArray) {
        int i = 2 % 2;
        int i2 = f2520 + 79;
        int i3 = i2 % 128;
        f2521 = i3;
        java.lang.Object obj2 = null;
        if (i2 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (jSONArray != null) {
            int i4 = i3 + 67;
            int i5 = i4 % 128;
            f2520 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 99;
            f2521 = i7 % 128;
            int i8 = i7 % 2;
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                java.lang.String m8046 = m8046(obj, jSONArray.optString(i9));
                if (m8046 != null) {
                    return m8046;
                }
            }
        }
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.lang.String m8031(java.lang.Object obj, java.lang.Class cls, java.lang.String str) {
        java.lang.reflect.Field[] m8024;
        int length;
        int i = 2 % 2;
        while (cls != null) {
            int i2 = f2520 + 37;
            f2521 = i2 % 128;
            int i3 = i2 % 2;
            if (cls.equals(java.lang.Object.class)) {
                break;
            }
            int i4 = f2521 + 77;
            f2520 = i4 % 128;
            if (i4 % 2 == 0) {
                m8024 = m8024(cls);
                length = m8024.length;
            } else {
                m8024 = m8024(cls);
                length = m8024.length;
            }
            for (int i5 = 0; i5 < length; i5++) {
                java.lang.reflect.Field field = m8024[i5];
                field.setAccessible(true);
                try {
                    java.lang.String str2 = (java.lang.String) field.get(obj);
                    if (str2 != null && !(!java.util.regex.Pattern.compile(str).matcher(str2).matches())) {
                        return str2;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            cls = cls.getSuperclass();
        }
        int i6 = f2521 + 91;
        f2520 = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.reflect.Field[] m8024(java.lang.Class cls) {
        int i = 2 % 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        int i2 = f2520 + 85;
        f2521 = i2 % 128;
        int i3 = i2 % 2;
        for (java.lang.reflect.Field field : declaredFields) {
            int i4 = f2521 + 115;
            f2520 = i4 % 128;
            int i5 = i4 % 2;
            if (field.getType().equals(java.lang.String.class)) {
                arrayList.add(field);
            }
        }
        return (java.lang.reflect.Field[]) arrayList.toArray(new java.lang.reflect.Field[0]);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m8023(com.ironsource.adqualitysdk.sdk.i.Cif cif, java.lang.Object obj, java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2521 + 85;
        f2520 = i2 % 128;
        int i3 = i2 % 2;
        if (cif != null) {
            java.lang.String intern = m8022("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", 1 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)).intern();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(obj);
            sb.append(m8037((char) (14703 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), "\u0000\u0000\u0000\u0000", "⩱㜮漑ู", "䪑岍", android.os.Process.myTid() >> 22).intern());
            sb.append(str);
            sb.append(m8037((char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "ꡇᰮ邿ᮗ", "\uf10c鷿톊犎톤\ueeb5ܨ\ue592", android.view.View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
            sb.append(cif.mo7963());
            com.ironsource.adqualitysdk.sdk.i.m.m8517(intern, sb.toString());
            return;
        }
        java.lang.String intern2 = m8022("ꩤꨫໃ\ua7e8٬똘찝혟褳⊶鍠\uf1ef\uec62䆒ﾏ겠", android.view.Gravity.getAbsoluteGravity(0, 0) + 1).intern();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(m8037((char) (14703 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), "\u0000\u0000\u0000\u0000", "⩱㜮漑ู", "䪑岍", android.text.TextUtils.indexOf("", "", 0)).intern());
        sb2.append(str);
        com.ironsource.adqualitysdk.sdk.i.m.m8517(intern2, sb2.toString());
        int i4 = f2520 + 79;
        f2521 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static java.lang.String m8032(java.lang.Object obj, java.util.List<java.lang.String> list, int i) {
        int i2 = 2 % 2;
        java.lang.String m7914 = new com.ironsource.adqualitysdk.sdk.i.ia(list, i).m7914(obj);
        int i3 = f2520 + 105;
        f2521 = i3 % 128;
        int i4 = i3 % 2;
        return m7914;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m8022(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.g.f2165) {
            char[] m7782 = com.ironsource.adqualitysdk.sdk.i.g.m7782(f2522, cArr2, i);
            com.ironsource.adqualitysdk.sdk.i.g.f2167 = 4;
            while (com.ironsource.adqualitysdk.sdk.i.g.f2167 < m7782.length) {
                com.ironsource.adqualitysdk.sdk.i.g.f2166 = com.ironsource.adqualitysdk.sdk.i.g.f2167 - 4;
                m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] = (char) ((m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167] ^ m7782[com.ironsource.adqualitysdk.sdk.i.g.f2167 % 4]) ^ (com.ironsource.adqualitysdk.sdk.i.g.f2166 * f2522));
                com.ironsource.adqualitysdk.sdk.i.g.f2167++;
            }
            str2 = new java.lang.String(m7782, 4, m7782.length - 4);
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m8037(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        java.lang.String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2052) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            com.ironsource.adqualitysdk.sdk.i.f.f2051 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.f.f2051 < length) {
                int i2 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 2) % 4;
                int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 3) % 4;
                com.ironsource.adqualitysdk.sdk.i.f.f2053 = (char) (((cArr7[com.ironsource.adqualitysdk.sdk.i.f.f2051 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = com.ironsource.adqualitysdk.sdk.i.f.f2053;
                cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f2524) ^ f2525) ^ f2523);
                com.ironsource.adqualitysdk.sdk.i.f.f2051++;
            }
            str4 = new java.lang.String(cArr9);
        }
        return str4;
    }
}
