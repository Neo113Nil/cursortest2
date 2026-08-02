package com.ryanheise.audioservice;

import G.h;
import I4.j;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.e;
import android.util.Log;
import e1.k;
import g5.l;
import java.util.List;
import s0.AbstractC1584a;
import s0.C1585b;

/* loaded from: classes2.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12321a = 0;

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder k7 = k.k("Expected 1 service that handles ", str, ", found ");
        k7.append(queryIntentServices.size());
        throw new IllegalStateException(k7.toString());
    }

    public final void b(Context context, Intent intent) {
        String message;
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName a2 = a(context, "android.intent.action.MEDIA_BUTTON");
        if (a2 == null) {
            ComponentName a4 = a(context, "android.media.browse.MediaBrowserService");
            if (a4 == null) {
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C1585b c1585b = new C1585b(applicationContext, intent, goAsync);
            e eVar = new e(applicationContext, a4, c1585b);
            c1585b.f16094f = eVar;
            Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
            eVar.f8009a.f8001b.connect();
            return;
        }
        intent.setComponent(a2);
        try {
            h.startForegroundService(context, intent);
        } catch (IllegalStateException e7) {
            if (Build.VERSION.SDK_INT < 31 || !AbstractC1584a.b(e7)) {
                throw e7;
            }
            ForegroundServiceStartNotAllowedException a7 = AbstractC1584a.a(e7);
            StringBuilder sb = new StringBuilder("caught exception when trying to start a foreground service from the background: ");
            message = a7.getMessage();
            sb.append(message);
            Log.e("MediaButtonReceiver", sb.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE".equals(intent.getAction()) || AudioService.f12300P == null) {
            b(context, intent);
            return;
        }
        j jVar = AudioService.f12302R;
        if (jVar == null) {
            return;
        }
        jVar.g("onNotificationDeleted", l.k(new Object[0]), null);
    }
}
