package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public final class l {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i a(com.moloco.sdk.internal.ortb.model.l lVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "<this>");
        com.moloco.sdk.internal.ortb.model.n appName = lVar.getAppName();
        java.lang.String e = appName != null ? appName.e() : null;
        java.lang.String ctaUrl = lVar.getCtaUrl();
        java.lang.String ctaTrackingUrl = lVar.getCtaTrackingUrl();
        java.lang.String impressionTrackingUrl = lVar.getImpressionTrackingUrl();
        java.lang.String skipToDecTrackingUrl = lVar.getSkipToDecTrackingUrl();
        com.moloco.sdk.internal.ortb.model.n appName2 = lVar.getAppName();
        java.lang.Integer c = appName2 != null ? appName2.c() : null;
        com.moloco.sdk.internal.ortb.model.p decCta = lVar.getDecCta();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l a2 = decCta != null ? a(decCta) : null;
        com.moloco.sdk.internal.ortb.model.m decAppIcon = lVar.getDecAppIcon();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j a3 = decAppIcon != null ? a(decAppIcon) : null;
        com.moloco.sdk.internal.ortb.model.q decRating = lVar.getDecRating();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i(e, ctaUrl, ctaTrackingUrl, impressionTrackingUrl, skipToDecTrackingUrl, c, a2, a3, decRating != null ? a(decRating) : null);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l a(com.moloco.sdk.internal.ortb.model.p pVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "<this>");
        java.lang.Integer t = pVar.t();
        java.lang.String n = pVar.n();
        java.lang.Integer l = pVar.l();
        java.lang.Integer p = pVar.p();
        com.moloco.sdk.internal.ortb.model.o j = pVar.j();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l(t, n, l, p, j != null ? a(j) : null, pVar.r(), pVar.h());
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j a(com.moloco.sdk.internal.ortb.model.m mVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "<this>");
        java.lang.Integer h = mVar.h();
        java.lang.String d = mVar.d();
        com.moloco.sdk.internal.ortb.model.o f = mVar.f();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j(h, d, f != null ? a(f) : null);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p a(com.moloco.sdk.internal.ortb.model.q qVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "<this>");
        java.lang.Float l = qVar.l();
        java.lang.String j = qVar.j();
        if (j == null) {
            j = "#FFFFFF00";
        }
        java.lang.String str = j;
        java.lang.String f = qVar.f();
        if (f == null) {
            f = "#FF888888";
        }
        java.lang.String str2 = f;
        java.lang.Integer n = qVar.n();
        int intValue = n != null ? n.intValue() : 12;
        java.lang.Integer h = qVar.h();
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p(l, str, str2, intValue, h != null ? h.intValue() : 9);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k a(com.moloco.sdk.internal.ortb.model.o oVar) {
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "<this>");
        java.util.List<com.moloco.sdk.internal.ortb.model.t> f = oVar.f();
        if (f != null) {
            list = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(f, 10));
            java.util.Iterator<T> it = f.iterator();
            while (it.hasNext()) {
                list.add(((com.moloco.sdk.internal.ortb.model.t) it.next()).b());
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k(oVar.d(), list);
    }
}
