package N;

import P.C;
import Q.s;
import a.AbstractC0009a;
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
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.GoogleApiActivity;
import h.C0063a;
import h.C0064b;
import java.util.ArrayList;
import java.util.Iterator;
import k.AbstractC0777a;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f240c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f241d = new e();

    public static AlertDialog d(Activity activity, int i2, Q.m mVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(Q.l.b(activity, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i2 != 1 ? i2 != 2 ? i2 != 3 ? resources.getString(R.string.ok) : resources.getString(com.skytonedarps.arskthrp.R.string.common_google_play_services_enable_button) : resources.getString(com.skytonedarps.arskthrp.R.string.common_google_play_services_update_button) : resources.getString(com.skytonedarps.arskthrp.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, mVar);
        }
        String c2 = Q.l.c(activity, i2);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        Log.w("GoogleApiAvailability", C0.g.g(i2, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        s.d(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f234a = alertDialog;
        if (onCancelListener != null) {
            cVar.f235b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i2, GoogleApiActivity googleApiActivity2) {
        AlertDialog d2 = d(googleApiActivity, i2, new Q.m(super.a(googleApiActivity, "d", i2), googleApiActivity, 0), googleApiActivity2);
        if (d2 == null) {
            return;
        }
        e(googleApiActivity, d2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i2, PendingIntent pendingIntent) {
        NotificationManager notificationManager;
        CharSequence charSequence;
        int i3;
        Bundle bundle;
        int i4;
        ArrayList arrayList;
        int i5;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", "GMS core API Availability. ConnectionResult=" + i2 + ", tag=null", new IllegalArgumentException());
        if (i2 == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e2 = i2 == 6 ? Q.l.e(context, "common_google_play_services_resolution_required_title") : Q.l.c(context, i2);
        if (e2 == null) {
            e2 = context.getResources().getString(com.skytonedarps.arskthrp.R.string.common_google_play_services_notification_ticker);
        }
        String d2 = (i2 == 6 || i2 == 19) ? Q.l.d(context, "common_google_play_services_resolution_required_text", Q.l.a(context)) : Q.l.b(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        s.c(systemService);
        NotificationManager notificationManager2 = (NotificationManager) systemService;
        C0064b c0064b = new C0064b();
        ArrayList arrayList2 = new ArrayList();
        c0064b.f1197b = arrayList2;
        c0064b.f1198c = new ArrayList();
        c0064b.f1199d = new ArrayList();
        c0064b.f1204i = true;
        c0064b.f1206k = false;
        Notification notification = new Notification();
        c0064b.f1210o = notification;
        c0064b.f1196a = context;
        c0064b.f1208m = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        c0064b.f1203h = 0;
        c0064b.f1211p = new ArrayList();
        c0064b.f1209n = true;
        c0064b.f1206k = true;
        notification.flags |= 16;
        c0064b.f1200e = C0064b.a(e2);
        Y.e eVar = new Y.e(22, false);
        eVar.f524c = C0064b.a(d2);
        c0064b.b(eVar);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC0009a.f538b == null) {
            AbstractC0009a.f538b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC0009a.f538b.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            c0064b.f1203h = 2;
            if (AbstractC0009a.s(context)) {
                arrayList2.add(new C0063a(resources.getString(com.skytonedarps.arskthrp.R.string.common_open_on_phone), pendingIntent));
            } else {
                c0064b.f1202g = pendingIntent;
            }
        } else {
            notification.icon = R.drawable.stat_sys_warning;
            notification.tickerText = C0064b.a(resources.getString(com.skytonedarps.arskthrp.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            c0064b.f1202g = pendingIntent;
            c0064b.f1201f = C0064b.a(d2);
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            if (i6 < 26) {
                throw new IllegalStateException();
            }
            synchronized (f240c) {
            }
            notificationChannel = notificationManager2.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.skytonedarps.arskthrp.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager2.createNotificationChannel(E0.a.c(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager2.createNotificationChannel(notificationChannel);
                }
            }
            c0064b.f1208m = "com.google.android.gms.availability";
        }
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Notification.Builder a2 = Build.VERSION.SDK_INT >= 26 ? h.g.a(c0064b.f1196a, c0064b.f1208m) : new Notification.Builder(c0064b.f1196a);
        Notification notification2 = c0064b.f1210o;
        a2.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(c0064b.f1200e).setContentText(c0064b.f1201f).setContentInfo(null).setContentIntent(c0064b.f1202g).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        h.e.b(a2, null);
        a2.setSubText(null).setUsesChronometer(false).setPriority(c0064b.f1203h);
        Iterator it = c0064b.f1197b.iterator();
        while (it.hasNext()) {
            C0063a c0063a = (C0063a) it.next();
            if (c0063a.f1190b == null && (i5 = c0063a.f1193e) != 0) {
                c0063a.f1190b = IconCompat.b(i5);
            }
            IconCompat iconCompat = c0063a.f1190b;
            Notification.Action.Builder a3 = h.e.a(iconCompat != null ? AbstractC0777a.c(iconCompat, null) : null, c0063a.f1194f, c0063a.f1195g);
            Bundle bundle3 = c0063a.f1189a;
            Bundle bundle4 = bundle3 != null ? new Bundle(bundle3) : new Bundle();
            boolean z2 = c0063a.f1191c;
            bundle4.putBoolean("android.support.allowGeneratedReplies", z2);
            int i7 = Build.VERSION.SDK_INT;
            h.f.a(a3, z2);
            bundle4.putInt("android.support.action.semanticAction", 0);
            if (i7 >= 28) {
                h.h.b(a3, 0);
            }
            if (i7 >= 29) {
                h.i.c(a3, false);
            }
            if (i7 >= 31) {
                h.j.a(a3, false);
            }
            bundle4.putBoolean("android.support.action.showsUserInterface", c0063a.f1192d);
            h.c.b(a3, bundle4);
            h.c.a(a2, h.c.d(a3));
        }
        Bundle bundle5 = c0064b.f1207l;
        if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        int i8 = Build.VERSION.SDK_INT;
        a2.setShowWhen(c0064b.f1204i);
        h.c.i(a2, c0064b.f1206k);
        h.c.g(a2, null);
        h.c.j(a2, null);
        h.c.h(a2, false);
        h.d.b(a2, null);
        h.d.c(a2, 0);
        h.d.f(a2, 0);
        h.d.d(a2, null);
        h.d.e(a2, notification2.sound, notification2.audioAttributes);
        ArrayList arrayList3 = c0064b.f1211p;
        ArrayList arrayList4 = c0064b.f1198c;
        if (i8 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it2 = arrayList4.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    f.c cVar = new f.c(arrayList3.size() + arrayList.size());
                    cVar.addAll(arrayList);
                    cVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(cVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                h.d.a(a2, (String) it3.next());
            }
        }
        ArrayList arrayList5 = c0064b.f1199d;
        if (arrayList5.size() > 0) {
            if (c0064b.f1207l == null) {
                c0064b.f1207l = new Bundle();
            }
            Bundle bundle6 = c0064b.f1207l.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            int i9 = 0;
            while (i9 < arrayList5.size()) {
                String num = Integer.toString(i9);
                C0063a c0063a2 = (C0063a) arrayList5.get(i9);
                ArrayList arrayList6 = arrayList5;
                Bundle bundle9 = new Bundle();
                NotificationManager notificationManager3 = notificationManager2;
                if (c0063a2.f1190b == null && (i4 = c0063a2.f1193e) != 0) {
                    c0063a2.f1190b = IconCompat.b(i4);
                }
                IconCompat iconCompat2 = c0063a2.f1190b;
                bundle9.putInt("icon", iconCompat2 != null ? iconCompat2.c() : 0);
                bundle9.putCharSequence("title", c0063a2.f1194f);
                bundle9.putParcelable("actionIntent", c0063a2.f1195g);
                Bundle bundle10 = c0063a2.f1189a;
                Bundle bundle11 = bundle10 != null ? new Bundle(bundle10) : new Bundle();
                bundle11.putBoolean("android.support.allowGeneratedReplies", c0063a2.f1191c);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", c0063a2.f1192d);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(num, bundle9);
                i9++;
                arrayList5 = arrayList6;
                notificationManager2 = notificationManager3;
            }
            notificationManager = notificationManager2;
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (c0064b.f1207l == null) {
                c0064b.f1207l = new Bundle();
            }
            c0064b.f1207l.putBundle("android.car.EXTENSIONS", bundle6);
            bundle2.putBundle("android.car.EXTENSIONS", bundle7);
        } else {
            notificationManager = notificationManager2;
        }
        int i10 = Build.VERSION.SDK_INT;
        a2.setExtras(c0064b.f1207l);
        h.f.e(a2, null);
        if (i10 >= 26) {
            h.g.b(a2, 0);
            h.g.e(a2, null);
            h.g.f(a2, null);
            h.g.g(a2, 0L);
            h.g.d(a2, 0);
            if (!TextUtils.isEmpty(c0064b.f1208m)) {
                a2.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i10 >= 28) {
            Iterator it4 = arrayList4.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i10 >= 29) {
            h.i.a(a2, c0064b.f1209n);
            charSequence = null;
            h.i.b(a2, null);
        } else {
            charSequence = null;
        }
        Y.e eVar2 = c0064b.f1205j;
        if (eVar2 != null) {
            new Notification.BigTextStyle(a2).setBigContentTitle(charSequence).bigText((CharSequence) eVar2.f524c);
        }
        Notification build = i6 >= 26 ? a2.build() : a2.build();
        if (eVar2 != null) {
            c0064b.f1205j.getClass();
        }
        if (eVar2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            h.f244a.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, build);
    }

    public final void g(Activity activity, C c2, int i2, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i2, new Q.m(super.a(activity, "d", i2), c2, 1), onCancelListener);
        if (d2 == null) {
            return;
        }
        e(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
