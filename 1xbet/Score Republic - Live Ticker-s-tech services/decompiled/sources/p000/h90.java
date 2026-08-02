package p000;

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

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h90 extends i90 {

    /* JADX INFO: renamed from: d */
    public static final Object f3129d = new Object();

    /* JADX INFO: renamed from: e */
    public static final h90 f3130e = new h90();

    /* JADX INFO: renamed from: c */
    public dm1 f3131c;

    /* JADX INFO: renamed from: d */
    public static AlertDialog m2236d(Activity activity, int i, xl1 xl1Var, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(pl1.m3965b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(live.football.scorerepublic.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(live.football.scorerepublic.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(live.football.scorerepublic.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, xl1Var);
        }
        String strM3964a = pl1.m3964a(activity, i);
        if (strM3964a != null) {
            builder.setTitle(strM3964a);
        }
        Log.w("GoogleApiAvailability", j11.m2773h("Creating dialog for Google Play services availability issue. ConnectionResult=", i), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX INFO: renamed from: g */
    public static void m2237g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC0790v4) {
                t50 t50Var = ((e50) ((AbstractActivityC0790v4) activity).f8056D.f793k).f1954q;
                sb1 sb1Var = new sb1();
                p80.m3864i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                sb1Var.f7090t0 = alertDialog;
                if (onCancelListener != null) {
                    sb1Var.f7091u0 = onCancelListener;
                }
                sb1Var.f9936q0 = false;
                sb1Var.f9937r0 = true;
                t50Var.getClass();
                C0722ta c0722ta = new C0722ta(t50Var);
                c0722ta.f7388o = true;
                c0722ta.m4778f(0, sb1Var, str);
                c0722ta.m4777e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC0265gx dialogFragmentC0265gx = new DialogFragmentC0265gx();
        p80.m3864i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC0265gx.f2954j = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC0265gx.f2955k = onCancelListener;
        }
        dialogFragmentC0265gx.show(fragmentManager, str);
    }

    /* JADX INFO: renamed from: c */
    public final void m2238c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogM2236d = m2236d(googleApiActivity, i, new sl1(super.m2574a(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogM2236d == null) {
            return;
        }
        m2237g(googleApiActivity, alertDialogM2236d, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX INFO: renamed from: e */
    public final void m2239e(Activity activity, vh0 vh0Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogM2236d = m2236d(activity, i, new vl1(super.m2574a(i, activity, "d"), vh0Var), onCancelListener);
        if (alertDialogM2236d == null) {
            return;
        }
        m2237g(activity, alertDialogM2236d, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    /* JADX INFO: renamed from: f */
    public final void m2240f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", AbstractC0024an.m282e(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new ol1(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM3968e = i == 6 ? pl1.m3968e(context, "common_google_play_services_resolution_required_title") : pl1.m3964a(context, i);
        if (strM3968e == null) {
            strM3968e = context.getResources().getString(live.football.scorerepublic.R.string.common_google_play_services_notification_ticker);
        }
        String strM3967d = (i == 6 || i == 19) ? pl1.m3967d(context, "common_google_play_services_resolution_required_text", pl1.m3966c(context)) : pl1.m3965b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        p80.m3863h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        ns0 ns0Var = new ns0(context, null);
        ns0Var.f5522m = true;
        ns0Var.m3586c(true);
        ns0Var.f5514e = ns0.m3584b(strM3968e);
        ms0 ms0Var = new ms0();
        ms0Var.f5155k = ns0.m3584b(strM3967d);
        ns0Var.m3587d(ms0Var);
        PackageManager packageManager = context.getPackageManager();
        if (a90.f80c == null) {
            a90.f80c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean zBooleanValue = a90.f80c.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            ns0Var.f5528s.icon = i3;
            ns0Var.f5519j = 2;
            if (a90.m136t(context)) {
                ns0Var.f5511b.add(new js0(resources.getString(live.football.scorerepublic.R.string.common_open_on_phone), pendingIntent));
            } else {
                ns0Var.f5516g = pendingIntent;
            }
        } else {
            ns0Var.f5528s.icon = R.drawable.stat_sys_warning;
            ns0Var.f5528s.tickerText = ns0.m3584b(resources.getString(live.football.scorerepublic.R.string.common_google_play_services_notification_ticker));
            ns0Var.f5528s.when = System.currentTimeMillis();
            ns0Var.f5516g = pendingIntent;
            ns0Var.f5515f = ns0.m3584b(strM3967d);
        }
        synchronized (f3129d) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(live.football.scorerepublic.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        ns0Var.f5526q = "com.google.android.gms.availability";
        Notification notificationM3585a = ns0Var.m3585a();
        if (i == 1 || i == 2 || i == 3) {
            o90.f5669a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationM3585a);
    }
}
