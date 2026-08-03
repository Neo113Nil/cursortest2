package com.ironsource;

/* loaded from: classes5.dex */
public final class Yf {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.Yf f6105a = new com.ironsource.Yf();
    private static final java.lang.String b = ",";
    private static final java.lang.String c = "[";
    private static final java.lang.String d = "]";
    private static final int e = 118;

    private Yf() {
    }

    public final java.util.List<java.lang.Object> a(java.lang.Object... items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "items");
        return kotlin.collections.CollectionsKt.listOf(java.util.Arrays.copyOf(items, items.length));
    }

    public final java.lang.String b(java.util.List<? extends java.lang.Object> methodArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodArgs, "methodArgs");
        java.lang.String str = new java.lang.String();
        for (java.lang.Object obj : methodArgs) {
            str = ((java.lang.Object) (((java.lang.Object) str) + (obj instanceof java.util.List ? f6105a.a((java.util.List<?>) obj) : f6105a.a(obj)))) + b;
        }
        return kotlin.text.StringsKt.removeSuffix(str, (java.lang.CharSequence) b);
    }

    private final java.lang.String a(java.util.List<?> list) {
        java.util.Iterator<?> it = list.iterator();
        java.lang.String str = "[";
        while (it.hasNext()) {
            str = ((java.lang.Object) str) + f6105a.a(it.next()) + b;
        }
        return ((java.lang.Object) kotlin.text.StringsKt.removeSuffix(str, (java.lang.CharSequence) b)) + "]";
    }

    private final java.lang.String a(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return "'" + obj + "'";
        }
        return java.lang.String.valueOf(obj);
    }

    public final com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo a(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(levelPlayAdInfo, "<this>");
        return new com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo(new com.ironsource.V8(levelPlayAdInfo), null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError a(com.unity3d.mediation.LevelPlayAdError levelPlayAdError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(levelPlayAdError, "<this>");
        return new com.ironsource.mediationsdk.logger.IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    public final android.view.ViewGroup.LayoutParams a(android.content.Context context) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        layoutParams.bottomMargin = a(context, 118);
        return layoutParams;
    }

    private final int a(android.content.Context context, int i) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        return (int) (i * ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density));
    }
}
