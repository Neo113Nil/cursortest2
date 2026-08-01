package com.ironsource;

import com.ironsource.J8;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.af, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C4323af implements J8, J8.a {
    private static final int c = 1;

    /* renamed from: a, reason: collision with root package name */
    private final Map<IronSource.a, Integer> f8082a = new HashMap();
    private final C4336ba b = new C4336ba();

    /* renamed from: com.ironsource.af$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8083a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            f8083a = iArr;
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8083a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8083a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8083a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    C4323af() {
        for (IronSource.a aVar : IronSource.a.values()) {
            a(aVar, 1);
        }
    }

    private void a(IronSource.a aVar, int i) {
        this.f8082a.put(aVar, Integer.valueOf(i));
        int i2 = a.f8083a[aVar.ordinal()];
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

    @Override // com.ironsource.J8.a
    public synchronized void b(IronSource.a aVar) {
        if (aVar == null) {
            return;
        }
        a(aVar, this.f8082a.get(aVar).intValue() + 1);
    }

    @Override // com.ironsource.J8
    public synchronized int a(IronSource.a aVar) {
        int i = -1;
        if (aVar == null) {
            return -1;
        }
        Integer num = this.f8082a.get(aVar);
        if (num != null) {
            i = num.intValue();
        }
        return i;
    }

    @Override // com.ironsource.J8
    public int a(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return a(com.unity3d.mediation.a.a(adFormat)) - 1;
    }
}
