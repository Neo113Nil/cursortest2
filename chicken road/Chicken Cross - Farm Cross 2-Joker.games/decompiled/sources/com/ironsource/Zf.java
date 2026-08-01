package com.ironsource;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class Zf {

    /* renamed from: a, reason: collision with root package name */
    public static final Zf f8052a = new Zf();
    private static final String b = ",";
    private static final String c = "[";
    private static final String d = "]";
    private static final int e = 118;

    private Zf() {
    }

    public final List<Object> a(Object... items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return CollectionsKt.listOf(Arrays.copyOf(items, items.length));
    }

    public final String b(List<? extends Object> methodArgs) {
        Intrinsics.checkNotNullParameter(methodArgs, "methodArgs");
        String str = new String();
        for (Object obj : methodArgs) {
            str = ((Object) (((Object) str) + (obj instanceof List ? f8052a.a((List<?>) obj) : f8052a.a(obj)))) + b;
        }
        return StringsKt.removeSuffix(str, (CharSequence) b);
    }

    private final String a(List<?> list) {
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = ((Object) str) + f8052a.a(it.next()) + b;
        }
        return ((Object) StringsKt.removeSuffix(str, (CharSequence) b)) + "]";
    }

    private final String a(Object obj) {
        if (obj instanceof String) {
            return "'" + obj + "'";
        }
        return String.valueOf(obj);
    }

    public final AdInfo a(LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(levelPlayAdInfo, "<this>");
        return new AdInfo(new V8(levelPlayAdInfo), null);
    }

    public final IronSourceError a(LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(levelPlayAdError, "<this>");
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    public final ViewGroup.LayoutParams a(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        layoutParams.bottomMargin = a(context, 118);
        return layoutParams;
    }

    private final int a(Context context, int i) {
        Resources resources;
        DisplayMetrics displayMetrics;
        return (int) (i * ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density));
    }
}
