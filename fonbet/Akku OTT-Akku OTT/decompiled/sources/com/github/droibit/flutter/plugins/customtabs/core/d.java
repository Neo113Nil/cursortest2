package com.github.droibit.flutter.plugins.customtabs.core;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {
    public static boolean a(Activity activity, Uri uri, CustomTabsIntent customTabsIntent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(customTabsIntent, "customTabsIntent");
        Intent intent = customTabsIntent.intent;
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        if (!intent.hasExtra(CustomTabsIntent.EXTRA_INITIAL_ACTIVITY_HEIGHT_PX) && !intent.hasExtra(CustomTabsIntent.EXTRA_INITIAL_ACTIVITY_WIDTH_PX)) {
            return false;
        }
        intent.setData(uri);
        activity.startActivityForResult(intent, 1001);
        return true;
    }
}
