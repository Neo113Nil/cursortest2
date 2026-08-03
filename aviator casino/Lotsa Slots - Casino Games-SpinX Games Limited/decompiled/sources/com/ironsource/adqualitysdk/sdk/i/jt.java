package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class jt {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static com.ironsource.adqualitysdk.sdk.i.jt f2912;

    /* renamed from: ﻛ, reason: contains not printable characters */
    boolean f2914 = false;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.util.Set<com.ironsource.adqualitysdk.sdk.i.jr> f2913 = new java.util.HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public abstract boolean mo8289();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract void mo8290(android.app.Application application, android.app.Activity activity);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract android.app.Activity mo8293();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized com.ironsource.adqualitysdk.sdk.i.jt m8287() {
        com.ironsource.adqualitysdk.sdk.i.jt jtVar;
        synchronized (com.ironsource.adqualitysdk.sdk.i.jt.class) {
            if (f2912 == null) {
                f2912 = new com.ironsource.adqualitysdk.sdk.i.jt.d((byte) 0);
            }
            jtVar = f2912;
        }
        return jtVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m8292(com.ironsource.adqualitysdk.sdk.i.jr jrVar) {
        this.f2913.add(jrVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m8288(com.ironsource.adqualitysdk.sdk.i.jr jrVar) {
        this.f2913.remove(jrVar);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    protected final synchronized java.util.List<com.ironsource.adqualitysdk.sdk.i.jr> m8291() {
        return new java.util.ArrayList(this.f2913);
    }

    static class c extends com.ironsource.adqualitysdk.sdk.i.jt {

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f2915 = 1;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static char f2916 = 4934;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f2917 = 0;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char f2918 = 28055;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char f2919 = 57824;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char f2920 = 44956;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private android.content.Context f2921;

        /* synthetic */ c(byte b) {
            this();
        }

        private c() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* renamed from: ﻛ */
        public final synchronized void mo8290(android.app.Application application, android.app.Activity activity) {
            int i = 2 % 2;
            int i2 = f2915 + 63;
            f2917 = i2 % 128;
            if (i2 % 2 != 0) {
                java.lang.Object obj = null;
                super.hashCode();
                throw null;
            }
            if (application == null) {
                if (activity != null) {
                    this.f2921 = activity.getApplicationContext();
                    int i3 = 2 % 2;
                }
                return;
            } else {
                this.f2921 = application.getApplicationContext();
                int i4 = f2915 + 95;
                f2917 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 45 / 0;
                    return;
                }
                return;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* renamed from: ﾒ */
        public final android.app.Activity mo8293() {
            int i = 2 % 2;
            int i2 = f2915 + 65;
            int i3 = i2 % 128;
            f2917 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 97;
            f2915 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* renamed from: ﻐ */
        public final boolean mo8289() {
            int i = 2 % 2;
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) this.f2921.getSystemService(m8294("ꆺ㒝\ue179\uda77ᳫ₭蔜\ue3dd", android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 9).intern())).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                java.lang.String packageName = this.f2921.getPackageName();
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100) {
                        int i2 = f2915 + 85;
                        f2917 = i2 % 128;
                        int i3 = i2 % 2;
                        if (runningAppProcessInfo.processName.equals(packageName)) {
                            int i4 = f2915 + 5;
                            f2917 = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i5 = 1 / 0;
                            }
                            return true;
                        }
                    }
                    int i6 = f2917 + 41;
                    f2915 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 5 / 5;
                    }
                }
                return false;
            }
            int i8 = f2917 + 99;
            f2915 = i8 % 128;
            return i8 % 2 == 0;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static java.lang.String m8294(java.lang.String str, int i) {
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
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2919)) ^ ((c2 >>> 5) + f2916)));
                        cArr4[1] = c3;
                        cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2920) ^ ((c3 + i2) ^ ((c3 << 4) + f2918))));
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

    static class d extends com.ironsource.adqualitysdk.sdk.i.jt implements android.app.Application.ActivityLifecycleCallbacks {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f2922 = 0;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f2923 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int[] f2924 = {-871357969, 1337581473, 430089141, 357984553, 2069095681, -957501125, 1709954397, 877960220, -637464995, 1727038325, 1140351433, 1094155977, 1356479358, 29226465, -1363218710, 786522359, -294517061, -508750614};

        /* renamed from: ｋ, reason: contains not printable characters */
        private java.util.Map<android.app.Activity, java.lang.Boolean> f2925;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private java.lang.ref.WeakReference<android.app.Activity> f2926;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private java.lang.ref.WeakReference<android.app.Application> f2927;

        private d() {
            this.f2925 = new java.util.WeakHashMap();
        }

        /* synthetic */ d(byte b) {
            this();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* renamed from: ﻛ */
        public final synchronized void mo8290(android.app.Application application, android.app.Activity activity) {
            if (this.f2927 == null) {
                this.f2927 = new java.lang.ref.WeakReference<>(application);
                if (activity != null) {
                    m8295(activity);
                    synchronized (this) {
                        this.f2925.put(activity, java.lang.Boolean.TRUE);
                    }
                }
                application.registerActivityLifecycleCallbacks(this);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* renamed from: ﾒ */
        public final android.app.Activity mo8293() {
            int i = 2 % 2;
            int i2 = f2923 + 1;
            f2922 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 78 / 0;
                if (this.f2926 == null) {
                    return null;
                }
            } else if (this.f2926 == null) {
                return null;
            }
            android.app.Activity activity = this.f2926.get();
            int i4 = f2922 + 55;
            f2923 = i4 % 128;
            int i5 = i4 % 2;
            return activity;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private void m8295(final android.app.Activity activity) {
            int i = 2 % 2;
            this.f2926 = new java.lang.ref.WeakReference<>(activity);
            com.ironsource.adqualitysdk.sdk.i.p.m8549(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jt.d.4
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5825() throws java.lang.Exception {
                    com.ironsource.adqualitysdk.sdk.i.kf.m8366(activity);
                }
            });
            int i2 = f2923 + 103;
            f2922 = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* renamed from: ﻐ */
        public final synchronized boolean mo8289() {
            int i = 2 % 2;
            if (this.f2925.size() > 0) {
                int i2 = f2922 + 119;
                f2923 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = f2922 + 95;
            f2923 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(android.app.Activity activity) {
            int i = 2 % 2;
            int i2 = f2922 + 53;
            f2923 = i2 % 128;
            int i3 = i2 % 2;
            try {
                m8295(activity);
                java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jr> it = m8291().iterator();
                while (it.hasNext()) {
                    int i4 = f2923 + 99;
                    f2922 = i4 % 128;
                    int i5 = i4 % 2;
                    it.next().onActivityResumed(activity);
                }
            } catch (java.lang.Exception e) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8297(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, 30 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)).intern(), m8297(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, 1385927799, 1364847630, -1899218572, -1797057217, -926562044, -1217637057}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 26).intern(), (java.lang.Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(android.app.Activity activity) {
            int i = 2 % 2;
            try {
                java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jr> it = m8291().iterator();
                while (it.hasNext()) {
                    int i2 = f2923 + 105;
                    f2922 = i2 % 128;
                    if (i2 % 2 != 0) {
                        it.next().onActivityPaused(activity);
                        throw null;
                    }
                    it.next().onActivityPaused(activity);
                    int i3 = f2923 + 37;
                    f2922 = i3 % 128;
                    int i4 = i3 % 2;
                }
            } catch (java.lang.Exception e) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8297(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, android.text.TextUtils.getOffsetBefore("", 0) + 30).intern(), m8297(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, -321643915, 1366169862, 1322038222, -871121847, 1041900432, 757404849}, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24).intern(), (java.lang.Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            try {
                synchronized (com.ironsource.adqualitysdk.sdk.i.jt.class) {
                    if (this.f2926 == null) {
                        m8295(activity);
                        com.ironsource.adqualitysdk.sdk.i.jt.class.notifyAll();
                    }
                }
                java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jr> it = m8291().iterator();
                while (it.hasNext()) {
                    it.next().onActivityCreated(activity, bundle);
                }
            } catch (java.lang.Exception e) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8297(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, 30 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m8297(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, 1858328683, -689158369, 55377100, -626326503, -926562044, -1217637057}, 26 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)).intern(), (java.lang.Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(android.app.Activity activity) {
            try {
                if (this.f2926 == null) {
                    m8295(activity);
                }
                synchronized (this) {
                    this.f2925.put(activity, java.lang.Boolean.TRUE);
                }
                java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jr> it = m8291().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStarted(activity);
                }
                if (activity.getLocalClassName().equals(m8297(new int[]{1293564134, 807685648, 1998697044, -834050683, -1550536543, 76565470, -1027350837, -843054928, 10261674, -2125008486, -1786728957, 1207954123, 662460433, 248596877, -1967419306, -725761015, -1850572200, 694134203, -1994432257, 1673985983, 1100463782, -808118632}, android.text.TextUtils.getOffsetBefore("", 0) + 43).intern())) {
                    return;
                }
                synchronized (this) {
                    if (this.f2925.size() == 1 && !this.f2914) {
                        m8298(activity);
                    }
                }
            } catch (java.lang.Exception e) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8297(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, 30 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m8297(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, 1889836171, -887348532, 480549063, -1535923990, -926562044, -1217637057}, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25).intern(), (java.lang.Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(android.app.Activity activity) {
            int i;
            try {
                java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jr> it = m8291().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStopped(activity);
                }
                this.f2914 = activity.isChangingConfigurations();
                synchronized (this) {
                    if (!this.f2925.containsKey(activity) || activity.getLocalClassName().equals(m8297(new int[]{1293564134, 807685648, 1998697044, -834050683, -1550536543, 76565470, -1027350837, -843054928, 10261674, -2125008486, -1786728957, 1207954123, 662460433, 248596877, -1967419306, -725761015, -1850572200, 694134203, -1994432257, 1673985983, 1100463782, -808118632}, android.graphics.Color.green(0) + 43).intern())) {
                        i = -1;
                    } else {
                        this.f2925.remove(activity);
                        i = this.f2925.size();
                    }
                }
                if (i < 0 || i != 0 || this.f2914) {
                    return;
                }
                m8296(activity);
            } catch (java.lang.Exception e) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8297(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, 30 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), m8297(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, 1889836171, -887348532, 1434797394, 1790972388, -926562044, -1217637057}, 26 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), (java.lang.Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            int i = 2 % 2;
            try {
                java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jr> it = m8291().iterator();
                while (it.hasNext()) {
                    int i2 = f2923 + 49;
                    f2922 = i2 % 128;
                    int i3 = i2 % 2;
                    it.next().onActivitySaveInstanceState(activity, bundle);
                    int i4 = f2923 + 101;
                    f2922 = i4 % 128;
                    int i5 = i4 % 2;
                }
            } catch (java.lang.Exception e) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8297(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, (android.os.Process.myPid() >> 22) + 30).intern(), m8297(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, 1889836171, -887348532, -1038434714, -722735429, -2003500875, 402667811, 1964754719, -2003821901, 1333325114, 1738527500}, android.widget.ExpandableListView.getPackedPositionType(0L) + 36).intern(), (java.lang.Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(android.app.Activity activity) {
            java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jr> it;
            int i = 2 % 2;
            int i2 = f2922 + 25;
            f2923 = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    it = m8291().iterator();
                    int i3 = 95 / 0;
                } else {
                    it = m8291().iterator();
                }
                while (it.hasNext()) {
                    int i4 = f2922 + 33;
                    f2923 = i4 % 128;
                    if (i4 % 2 == 0) {
                        it.next().onActivityDestroyed(activity);
                        int i5 = 96 / 0;
                    } else {
                        it.next().onActivityDestroyed(activity);
                    }
                }
            } catch (java.lang.Exception e) {
                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8297(new int[]{-88531261, 223708792, -1297599512, -2038368432, -1962001421, 1628445724, 134774992, 1701289583, -420180869, -1982703358, -545192751, -366345522, 324501072, -1034053448, 1664182240, -765371038}, 29 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')).intern(), m8297(new int[]{-2036167223, -1315705389, 825271665, -1460655033, 648336035, -1782349955, -1994432257, 1673985983, -858773682, -980847206, -677829030, -483398048, -775645339, -658125370}, 28 - android.view.Gravity.getAbsoluteGravity(0, 0)).intern(), (java.lang.Throwable) e, false);
            }
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private void m8296(android.app.Activity activity) {
            int i = 2 % 2;
            java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jr> it = m8291().iterator();
            while (it.hasNext()) {
                int i2 = f2923 + 93;
                f2922 = i2 % 128;
                int i3 = i2 % 2;
                it.next().mo5967(activity);
                int i4 = f2922 + 95;
                f2923 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private void m8298(android.app.Activity activity) {
            int i = 2 % 2;
            int i2 = f2922 + 49;
            f2923 = i2 % 128;
            if (i2 % 2 != 0) {
                java.util.Iterator<com.ironsource.adqualitysdk.sdk.i.jr> it = m8291().iterator();
                while (it.hasNext()) {
                    int i3 = f2922 + 35;
                    f2923 = i3 % 128;
                    int i4 = i3 % 2;
                    it.next().mo5968(activity);
                }
                return;
            }
            m8291().iterator();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static java.lang.String m8297(int[] iArr, int i) {
            java.lang.String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2924.clone();
                com.ironsource.adqualitysdk.sdk.i.a.f93 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.a.f93 < iArr.length) {
                    cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93] >> 16);
                    cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93];
                    cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1] >> 16);
                    cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1];
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = (cArr[0] << 16) + cArr[1];
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = (cArr[2] << 16) + cArr[3];
                    com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                    for (int i2 = 0; i2 < 16; i2++) {
                        int i3 = com.ironsource.adqualitysdk.sdk.i.a.f94 ^ iArr2[i2];
                        com.ironsource.adqualitysdk.sdk.i.a.f94 = i3;
                        com.ironsource.adqualitysdk.sdk.i.a.f95 = com.ironsource.adqualitysdk.sdk.i.a.m5771(i3) ^ com.ironsource.adqualitysdk.sdk.i.a.f95;
                        int i4 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                        com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                        com.ironsource.adqualitysdk.sdk.i.a.f95 = i4;
                    }
                    int i5 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                    com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = i5;
                    com.ironsource.adqualitysdk.sdk.i.a.f95 = i5 ^ iArr2[16];
                    com.ironsource.adqualitysdk.sdk.i.a.f94 ^= iArr2[17];
                    int i6 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                    int i7 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                    cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f94 >>> 16);
                    cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.a.f94;
                    cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f95 >>> 16);
                    cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.a.f95;
                    com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                    cArr2[com.ironsource.adqualitysdk.sdk.i.a.f93 << 1] = cArr[0];
                    cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 1] = cArr[1];
                    cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 2] = cArr[2];
                    cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 3] = cArr[3];
                    com.ironsource.adqualitysdk.sdk.i.a.f93 += 2;
                }
                str = new java.lang.String(cArr2, 0, i);
            }
            return str;
        }
    }
}
