package com.moloco.sdk.internal;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4823i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4824j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4825k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4826l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4830p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class l {
    public static final C4823i a(com.moloco.sdk.internal.ortb.model.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        com.moloco.sdk.internal.ortb.model.p appName = nVar.getAppName();
        String e = appName != null ? appName.e() : null;
        String ctaUrl = nVar.getCtaUrl();
        String ctaTrackingUrl = nVar.getCtaTrackingUrl();
        String impressionTrackingUrl = nVar.getImpressionTrackingUrl();
        String skipToDecTrackingUrl = nVar.getSkipToDecTrackingUrl();
        com.moloco.sdk.internal.ortb.model.p appName2 = nVar.getAppName();
        Integer c = appName2 != null ? appName2.c() : null;
        com.moloco.sdk.internal.ortb.model.r decCta = nVar.getDecCta();
        C4826l a2 = decCta != null ? a(decCta) : null;
        com.moloco.sdk.internal.ortb.model.o decAppIcon = nVar.getDecAppIcon();
        C4824j a3 = decAppIcon != null ? a(decAppIcon) : null;
        com.moloco.sdk.internal.ortb.model.s decRating = nVar.getDecRating();
        return new C4823i(e, ctaUrl, ctaTrackingUrl, impressionTrackingUrl, skipToDecTrackingUrl, c, a2, a3, decRating != null ? a(decRating) : null);
    }

    public static final C4826l a(com.moloco.sdk.internal.ortb.model.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Integer t = rVar.t();
        String n = rVar.n();
        Integer l = rVar.l();
        Integer p = rVar.p();
        com.moloco.sdk.internal.ortb.model.q j = rVar.j();
        return new C4826l(t, n, l, p, j != null ? a(j) : null, rVar.r(), rVar.h());
    }

    public static final C4824j a(com.moloco.sdk.internal.ortb.model.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Integer h = oVar.h();
        String d = oVar.d();
        com.moloco.sdk.internal.ortb.model.q f = oVar.f();
        return new C4824j(h, d, f != null ? a(f) : null);
    }

    public static final C4830p a(com.moloco.sdk.internal.ortb.model.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Float l = sVar.l();
        String j = sVar.j();
        if (j == null) {
            j = "#FFFFFF00";
        }
        String str = j;
        String f = sVar.f();
        if (f == null) {
            f = "#FF888888";
        }
        String str2 = f;
        Integer n = sVar.n();
        int intValue = n != null ? n.intValue() : 12;
        Integer h = sVar.h();
        return new C4830p(l, str, str2, intValue, h != null ? h.intValue() : 9);
    }

    public static final C4825k a(com.moloco.sdk.internal.ortb.model.q qVar) {
        List list;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        List<com.moloco.sdk.internal.ortb.model.v> f = qVar.f();
        if (f != null) {
            list = new ArrayList(CollectionsKt.collectionSizeOrDefault(f, 10));
            Iterator<T> it = f.iterator();
            while (it.hasNext()) {
                list.add(((com.moloco.sdk.internal.ortb.model.v) it.next()).b());
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return new C4825k(qVar.d(), list);
    }
}
