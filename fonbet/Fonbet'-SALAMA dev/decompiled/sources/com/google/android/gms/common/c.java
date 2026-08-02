package com.google.android.gms.common;

import F.q;
import F.u;
import F.w;
import W5.AbstractC0486a1;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.A;
import androidx.fragment.app.C0702a;
import androidx.fragment.app.Q;
import com.google.android.gms.common.api.internal.InterfaceC0835l;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.v;

/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11214c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final c f11215d = new c();

    public static c f() {
        throw null;
    }

    public static AlertDialog g(Activity activity, int i7, v vVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(s.b(i7, activity));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i7 != 1 ? i7 != 2 ? i7 != 3 ? resources.getString(R.string.ok) : resources.getString(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.string.common_google_play_services_enable_button) : resources.getString(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.string.common_google_play_services_update_button) : resources.getString(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, vVar);
        }
        String c3 = s.c(i7, activity);
        if (c3 != null) {
            builder.setTitle(c3);
        }
        Log.w("GoogleApiAvailability", e1.k.d(i7, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof A) {
                Q supportFragmentManager = ((A) activity).getSupportFragmentManager();
                i iVar = new i();
                D.j(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                iVar.f11220x0 = alertDialog;
                if (onCancelListener != null) {
                    iVar.f11221y0 = onCancelListener;
                }
                iVar.f9488u0 = false;
                iVar.f9489v0 = true;
                supportFragmentManager.getClass();
                C0702a c0702a = new C0702a(supportFragmentManager);
                c0702a.f9444o = true;
                c0702a.e(0, iVar, str);
                c0702a.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        D.j(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.f11211a = alertDialog;
        if (onCancelListener != null) {
            bVar.f11212b = onCancelListener;
        }
        bVar.show(fragmentManager, str);
    }

    @Override // com.google.android.gms.common.d
    public final int c(Context context) {
        return d(context, d.f11216a);
    }

    public final AlertDialog e(int i7, Activity activity, int i8, DialogInterface.OnCancelListener onCancelListener) {
        return g(activity, i7, new t(super.a(activity, i7, "d"), activity, i8, 0), onCancelListener);
    }

    public final void i(Context context, int i7, PendingIntent pendingIntent) {
        int i8;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", AbstractC0486a1.f(i7, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i7 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e7 = i7 == 6 ? s.e(context, "common_google_play_services_resolution_required_title") : s.c(i7, context);
        if (e7 == null) {
            e7 = context.getResources().getString(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.string.common_google_play_services_notification_ticker);
        }
        String d7 = (i7 == 6 || i7 == 19) ? s.d(context, "common_google_play_services_resolution_required_text", s.a(context)) : s.b(i7, context);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        D.i(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        w wVar = new w(context, null);
        wVar.f2467m = true;
        wVar.c(16);
        wVar.f2460e = w.b(e7);
        u uVar = new u();
        uVar.f2455c = w.b(d7);
        wVar.e(uVar);
        if (m3.c.l(context)) {
            wVar.f2473s.icon = context.getApplicationInfo().icon;
            wVar.f2464i = 2;
            if (m3.c.m(context)) {
                wVar.f2457b.add(new q(2131165281, resources.getString(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.string.common_open_on_phone), pendingIntent));
            } else {
                wVar.f2462g = pendingIntent;
            }
        } else {
            wVar.f2473s.icon = R.drawable.stat_sys_warning;
            wVar.f2473s.tickerText = w.b(resources.getString(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.string.common_google_play_services_notification_ticker));
            wVar.f2473s.when = System.currentTimeMillis();
            wVar.f2462g = pendingIntent;
            wVar.f2461f = w.b(d7);
        }
        if (m3.c.h()) {
            D.l(m3.c.h());
            synchronized (f11214c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(N.b.e(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            wVar.f2471q = "com.google.android.gms.availability";
        }
        Notification a2 = wVar.a();
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            g.sCanceledAvailabilityNotification.set(false);
            i8 = 10436;
        } else {
            i8 = 39789;
        }
        notificationManager.notify(i8, a2);
    }

    public final void j(Activity activity, InterfaceC0835l interfaceC0835l, int i7, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog g3 = g(activity, i7, new com.google.android.gms.common.internal.u(super.a(activity, i7, "d"), interfaceC0835l), onCancelListener);
        if (g3 == null) {
            return;
        }
        h(activity, g3, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
    }
}
