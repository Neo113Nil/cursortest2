package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3452h {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3452h f7458a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3452h();
    public static final kotlin.text.Regex b = new kotlin.text.Regex("<meta\\s+name=[\"']templateName[\"']\\s+content=[\"']([^\"']+)[\"']", kotlin.text.RegexOption.IGNORE_CASE);
    public static final int c = 8;

    public final boolean a(java.lang.String adm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
        return kotlin.text.StringsKt.contains((java.lang.CharSequence) adm, (java.lang.CharSequence) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.k, true);
    }

    public final boolean b(java.lang.String adm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
        return kotlin.text.StringsKt.contains((java.lang.CharSequence) adm, (java.lang.CharSequence) "<VAST", true);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c(java.lang.String adm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i e = e(adm);
        return e == null ? d(adm) : e;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i d(java.lang.String str) {
        return b(str) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f7361a : a(str) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.b : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.c;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i e(java.lang.String str) {
        java.util.List<java.lang.String> groupValues;
        java.lang.String str2;
        kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(b, str, 0, 2, null);
        if (find$default == null || (groupValues = find$default.getGroupValues()) == null || (str2 = groupValues.get(1)) == null) {
            return null;
        }
        if (kotlin.text.StringsKt.startsWith(str2, "video", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.d;
        }
        if (kotlin.text.StringsKt.equals(str2, "mraid", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.e;
        }
        if (kotlin.text.StringsKt.equals(str2, "static", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f;
        }
        com.moloco.sdk.acm.recorder.MetricsRecorder.INSTANCE.withNoMediation().recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.Y.c()).withTag("template_name", str2));
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f;
    }
}
