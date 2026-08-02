package com.github.droibit.flutter.plugins.customtabs.core.options;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension({"SMAP\nBrowserConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrowserConfiguration.kt\ncom/github/droibit/flutter/plugins/customtabs/core/options/BrowserConfiguration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    public final Boolean a;
    public final Boolean b;
    public final Set<String> c;
    public final Map<String, String> d;
    public final String e;

    public a(Boolean bool, Boolean bool2, Set<String> set, Map<String, String> map, String str) {
        this.a = bool;
        this.b = bool2;
        this.c = set;
        this.d = map;
        this.e = str;
    }

    public final com.droibit.android.customtabs.launcher.g a(Context context) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        Intrinsics.checkNotNullParameter(context, "context");
        Set<String> set = this.c;
        if (set != null) {
            return new com.droibit.android.customtabs.launcher.g(set);
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Set<String> set2 = com.droibit.android.customtabs.launcher.f.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intent addCategory = new Intent("android.intent.action.VIEW", Uri.parse("http://")).addCategory("android.intent.category.BROWSABLE");
        Intrinsics.checkNotNullExpressionValue(addCategory, "Intent(ACTION_VIEW, Uri.…ntent.CATEGORY_BROWSABLE)");
        PackageManager pm = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(pm, "pm");
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(131072);
            queryIntentActivities = pm.queryIntentActivities(addCategory, of);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "{\n            pm.queryIn…)\n            )\n        }");
        } else {
            queryIntentActivities = pm.queryIntentActivities(addCategory, 131072);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "{\n            pm.queryIn…s(intent, flag)\n        }");
        }
        return new com.droibit.android.customtabs.launcher.g(SequencesKt.toSet(SequencesKt.filter(SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(queryIntentActivities), com.droibit.android.customtabs.launcher.c.a), com.droibit.android.customtabs.launcher.d.a), new com.droibit.android.customtabs.launcher.e(pm))));
    }
}
