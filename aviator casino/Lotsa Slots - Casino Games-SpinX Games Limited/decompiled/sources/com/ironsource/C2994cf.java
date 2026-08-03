package com.ironsource;

/* renamed from: com.ironsource.cf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C2994cf implements com.ironsource.L8, com.ironsource.L8.a {
    private static final int c = 1;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<com.ironsource.mediationsdk.IronSource.a, java.lang.Integer> f6191a = new java.util.HashMap();
    private final com.ironsource.C2971ba b = new com.ironsource.C2971ba();

    /* renamed from: com.ironsource.cf$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6192a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.IronSource.a.values().length];
            f6192a = iArr;
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f6192a[com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f6192a[com.ironsource.mediationsdk.IronSource.a.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f6192a[com.ironsource.mediationsdk.IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    C2994cf() {
        for (com.ironsource.mediationsdk.IronSource.a aVar : com.ironsource.mediationsdk.IronSource.a.values()) {
            a(aVar, 1);
        }
    }

    private void a(com.ironsource.mediationsdk.IronSource.a aVar, int i) {
        this.f6191a.put(aVar, java.lang.Integer.valueOf(i));
        int i2 = com.ironsource.C2994cf.a.f6192a[aVar.ordinal()];
        if (i2 == 1) {
            this.b.d(i);
            return;
        }
        if (i2 == 2) {
            this.b.b(i);
        } else if (i2 == 3) {
            this.b.a(i);
        } else {
            if (i2 != 4) {
                return;
            }
            this.b.c(i);
        }
    }

    @Override // com.ironsource.L8.a
    public synchronized void b(com.ironsource.mediationsdk.IronSource.a aVar) {
        if (aVar == null) {
            return;
        }
        a(aVar, this.f6191a.get(aVar).intValue() + 1);
    }

    @Override // com.ironsource.L8
    public synchronized int a(com.ironsource.mediationsdk.IronSource.a aVar) {
        int i = -1;
        if (aVar == null) {
            return -1;
        }
        java.lang.Integer num = this.f6191a.get(aVar);
        if (num != null) {
            i = num.intValue();
        }
        return i;
    }

    @Override // com.ironsource.L8
    public int a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return a(com.unity3d.mediation.a.a(adFormat)) - 1;
    }
}
