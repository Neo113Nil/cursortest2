package com.github.droibit.flutter.plugins.customtabs.core.session;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import io.flutter.Log;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCustomTabsSessionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomTabsSessionController.kt\ncom/github/droibit/flutter/plugins/customtabs/core/session/CustomTabsSessionController\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n29#2:95\n29#2:99\n1586#3:96\n1661#3,2:97\n1663#3:100\n*S KotlinDebug\n*F\n+ 1 CustomTabsSessionController.kt\ncom/github/droibit/flutter/plugins/customtabs/core/session/CustomTabsSessionController\n*L\n80#1:95\n85#1:99\n85#1:96\n85#1:97,2\n85#1:100\n*E\n"})
/* loaded from: classes3.dex */
public final class a extends CustomTabsServiceConnection {
    public final String a;
    public Context b;
    public CustomTabsSession c;
    public boolean d;

    public a(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.a = packageName;
    }

    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = this.d;
        String str = this.a;
        if (z) {
            Log.d("CustomTabsAndroid", "Custom Tab(" + str + ") already bound.");
            return true;
        }
        try {
            boolean bindCustomTabsService = CustomTabsClient.bindCustomTabsService(context, str, this);
            Log.d("CustomTabsAndroid", "Custom Tab(" + str + ") bound: " + bindCustomTabsService);
            if (bindCustomTabsService) {
                this.b = context;
            }
            this.d = bindCustomTabsService;
        } catch (SecurityException unused) {
            this.d = false;
        }
        return this.d;
    }

    public final void b() {
        Context context = this.b;
        if (context != null) {
            context.unbindService(this);
        }
        this.c = null;
        this.d = false;
        Log.d("CustomTabsAndroid", "Custom Tab(" + this.a + ") unbound.");
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient client) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        Log.d("CustomTabsAndroid", "Custom Tab(" + name.getPackageName() + ") warmedUp: " + client.warmup(0L));
        this.c = client.newSession(null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.c = null;
        this.d = false;
        Log.d("CustomTabsAndroid", "Custom Tab(" + this.a + ") disconnected.");
    }
}
