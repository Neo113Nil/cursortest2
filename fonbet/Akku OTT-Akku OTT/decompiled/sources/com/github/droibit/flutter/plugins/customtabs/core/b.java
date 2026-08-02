package com.github.droibit.flutter.plugins.customtabs.core;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nExternalBrowserLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalBrowserLauncher.kt\ncom/github/droibit/flutter/plugins/customtabs/core/ExternalBrowserLauncher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
/* loaded from: classes3.dex */
public final class b {
    public static boolean a(Context context, Uri uri, com.github.droibit.flutter.plugins.customtabs.core.options.e eVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        if (eVar != null) {
            com.github.droibit.flutter.plugins.customtabs.core.options.a aVar = eVar.k;
            if (Intrinsics.areEqual(aVar.a, Boolean.TRUE)) {
                Map<String, String> map = aVar.d;
                if (map != null) {
                    intent.putExtra("com.android.browser.headers", com.github.droibit.flutter.plugins.customtabs.core.utils.a.a(map));
                }
            } else {
                intent = null;
            }
        }
        if (intent == null) {
            return false;
        }
        intent.setData(uri);
        context.startActivity(intent);
        return true;
    }
}
