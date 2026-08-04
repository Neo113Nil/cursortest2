package com.ryanheise.audioservice;

import G.h;
import I4.j;
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
import java.util.List;
import p031e1.k;
import p049g5.l;
import p130s0.a;
import p130s0.b;

/* JADX INFO: loaded from: classes2.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12321a = 0;

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbK = k.k("Expected 1 service that handles ", str, ", found ");
        sbK.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbK.toString());
    }

    public final void b(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameA = a(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameA == null) {
            ComponentName componentNameA2 = a(context, "android.media.browse.MediaBrowserService");
            if (componentNameA2 == null) {
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            b bVar = new b(applicationContext, intent, pendingResultGoAsync);
            e eVar = new e(applicationContext, componentNameA2, bVar);
            bVar.f16100f = eVar;
            Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
            eVar.f8009a.f8001b.connect();
            return;
        }
        intent.setComponent(componentNameA);
        try {
            h.startForegroundService(context, intent);
        } catch (IllegalStateException e7) {
            if (Build.VERSION.SDK_INT < 31 || !a.b(e7)) {
                throw e7;
            }
            Log.e("MediaButtonReceiver", "caught exception when trying to start a foreground service from the background: " + a.a(e7).getMessage());
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
