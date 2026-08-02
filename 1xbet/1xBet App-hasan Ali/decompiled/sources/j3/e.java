package j3;

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
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import d1.C1912c;
import e2.AbstractC1923d;
import l3.x;
import m3.v;
import n.AbstractC2107A;
import q3.AbstractC2309b;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f17511c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f17512d = new e();

    public static AlertDialog e(Activity activity, int i, m3.p pVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(m3.o.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(game.betting133.sports1xbet.R.string.common_google_play_services_enable_button) : resources.getString(game.betting133.sports1xbet.R.string.common_google_play_services_update_button) : resources.getString(game.betting133.sports1xbet.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, pVar);
        }
        String c5 = m3.o.c(activity, i);
        if (c5 != null) {
            builder.setTitle(c5);
        }
        Log.w("GoogleApiAvailability", AbstractC2107A.q("Creating dialog for Google Play services availability issue. ConnectionResult=", i), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        v.f("Cannot display null dialog", alertDialog);
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f17505k = alertDialog;
        if (onCancelListener != null) {
            cVar.f17506l = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog e3 = e(googleApiActivity, i, new m3.p(super.b(i, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (e3 == null) {
            return;
        }
        f(googleApiActivity, e3, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) {
        int i5;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", L1.a.l(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e3 = i == 6 ? m3.o.e(context, "common_google_play_services_resolution_required_title") : m3.o.c(context, i);
        if (e3 == null) {
            e3 = context.getResources().getString(game.betting133.sports1xbet.R.string.common_google_play_services_notification_ticker);
        }
        String d5 = (i == 6 || i == 19) ? m3.o.d(context, "common_google_play_services_resolution_required_text", m3.o.a(context)) : m3.o.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        v.e(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        d1.g gVar = new d1.g(context, null);
        gVar.f16875l = true;
        gVar.f16879p.flags |= 16;
        gVar.f16870e = d1.g.b(e3);
        d1.f fVar = new d1.f();
        fVar.f16865b = d1.g.b(d5);
        gVar.d(fVar);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC2309b.f18888b == null) {
            AbstractC2309b.f18888b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC2309b.f18888b.booleanValue()) {
            gVar.f16879p.icon = context.getApplicationInfo().icon;
            gVar.i = 2;
            if (AbstractC2309b.h(context)) {
                gVar.f16867b.add(new C1912c(resources.getString(game.betting133.sports1xbet.R.string.common_open_on_phone), pendingIntent));
            } else {
                gVar.f16871g = pendingIntent;
            }
        } else {
            gVar.f16879p.icon = R.drawable.stat_sys_warning;
            gVar.f16879p.tickerText = d1.g.b(resources.getString(game.betting133.sports1xbet.R.string.common_google_play_services_notification_ticker));
            gVar.f16879p.when = System.currentTimeMillis();
            gVar.f16871g = pendingIntent;
            gVar.f = d1.g.b(d5);
        }
        if (AbstractC2309b.e()) {
            if (!AbstractC2309b.e()) {
                throw new IllegalStateException();
            }
            synchronized (f17511c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(game.betting133.sports1xbet.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(AbstractC1923d.b(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            gVar.f16877n = "com.google.android.gms.availability";
        }
        Notification a5 = gVar.a();
        if (i == 1 || i == 2 || i == 3) {
            h.f17515a.set(false);
            i5 = 10436;
        } else {
            i5 = 39789;
        }
        notificationManager.notify(i5, a5);
    }

    public final void h(Activity activity, x xVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e3 = e(activity, i, new m3.p(super.b(i, activity, "d"), xVar, 1), onCancelListener);
        if (e3 == null) {
            return;
        }
        f(activity, e3, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
