package com.ironsource;

import com.ironsource.E0;
import com.ironsource.Ed;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.sd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4643sd implements InterfaceC4661td {

    /* renamed from: a, reason: collision with root package name */
    private final LevelPlay.AdFormat f8527a;

    /* renamed from: com.ironsource.sd$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8528a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8528a = iArr;
        }
    }

    public C4643sd(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f8527a = adFormat;
    }

    private final C4608qd a(Ed.c cVar, int i, Sa sa) {
        String c = cVar.c();
        if (c == null) {
            IronLog.INTERNAL.warning("invalid adUnitId");
            return null;
        }
        List<String> d = cVar.d();
        if (d == null) {
            IronLog.INTERNAL.warning("invalid instances");
            return null;
        }
        C4434h0 c4434h0 = new C4434h0(com.unity3d.mediation.a.a(this.f8527a), C4637s7.f8524a.a(), c, null, null, null, 56, null);
        AbstractC4720x0 a2 = a(c4434h0, sa);
        if (a2 == null) {
            IronLog.INTERNAL.warning("adunit data is null");
            return null;
        }
        IronSource.a a3 = com.unity3d.mediation.a.a(this.f8527a);
        E0.b bVar = E0.b.MEDIATION;
        T0 t0 = new T0(new C4577p0(a3, bVar), a2, bVar);
        t0.f().a(new C0(t0, c4434h0, null, 4, null));
        return new C4608qd(c, d, i, new C4715wd(t0, a2, null, 4, null), t0);
    }

    private final AbstractC4720x0 a(C4434h0 c4434h0, Sa sa) {
        try {
            int i = a.f8528a[this.f8527a.ordinal()];
            if (i == 1) {
                return B9.z.a(c4434h0, sa, false);
            }
            if (i == 2) {
                return C4340be.z.a(c4434h0, sa, false);
            }
            throw new IllegalArgumentException("Unsupported ad format for preload: " + this.f8527a);
        } catch (Exception e) {
            IronLog.INTERNAL.error("Failed to create AdUnitData for ad format " + this.f8527a + ": " + e.getMessage() + "\n" + ExceptionsKt.stackTraceToString(e));
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC4661td
    public List<InterfaceC4625rd> a(List<Ed.c> config, int i, Sa levelPlayConfig) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(levelPlayConfig, "levelPlayConfig");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = config.iterator();
        while (it.hasNext()) {
            C4608qd a2 = a((Ed.c) it.next(), i, levelPlayConfig);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
