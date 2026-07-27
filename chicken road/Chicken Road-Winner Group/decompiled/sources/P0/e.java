package P0;

import R0.x;
import S0.r;
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
import java.util.ArrayList;
import java.util.Iterator;
import p.C1153c;
import s.AbstractC1185f;
import s.AbstractC1186g;
import s.AbstractC1187h;
import s.AbstractC1188i;
import s.AbstractC1189j;
import s.AbstractC1190k;
import s.AbstractC1191l;
import s.AbstractC1192m;
import s.C1183d;
import s.C1184e;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1131c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f1132d = new e();

    public static AlertDialog d(Activity activity, int i3, S0.l lVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i3 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(S0.k.b(activity, i3));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i3 != 1 ? i3 != 2 ? i3 != 3 ? resources.getString(R.string.ok) : resources.getString(com.chicken.jump.road.pump.R.string.common_google_play_services_enable_button) : resources.getString(com.chicken.jump.road.pump.R.string.common_google_play_services_update_button) : resources.getString(com.chicken.jump.road.pump.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, lVar);
        }
        String c3 = S0.k.c(activity, i3);
        if (c3 != null) {
            builder.setTitle(c3);
        }
        Log.w("GoogleApiAvailability", B0.c.h(i3, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        r.d(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f1125a = alertDialog;
        if (onCancelListener != null) {
            cVar.f1126b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i3, GoogleApiActivity googleApiActivity2) {
        AlertDialog d3 = d(googleApiActivity, i3, new S0.l(super.a(i3, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (d3 == null) {
            return;
        }
        e(googleApiActivity, d3, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i3, PendingIntent pendingIntent) {
        ArrayList arrayList;
        CharSequence charSequence;
        int i4;
        Bundle bundle;
        int i5;
        ArrayList arrayList2;
        int i6;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", B0.c.i(i3, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i3 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i3 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e3 = i3 == 6 ? S0.k.e(context, "common_google_play_services_resolution_required_title") : S0.k.c(context, i3);
        if (e3 == null) {
            e3 = context.getResources().getString(com.chicken.jump.road.pump.R.string.common_google_play_services_notification_ticker);
        }
        String d3 = (i3 == 6 || i3 == 19) ? S0.k.d(context, "common_google_play_services_resolution_required_text", S0.k.a(context)) : S0.k.b(context, i3);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        r.c(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C1184e c1184e = new C1184e();
        ArrayList arrayList3 = new ArrayList();
        c1184e.f10298b = arrayList3;
        c1184e.f10299c = new ArrayList();
        c1184e.f10300d = new ArrayList();
        c1184e.f10304i = true;
        c1184e.f10306k = false;
        Notification notification = new Notification();
        c1184e.f10310o = notification;
        c1184e.f10297a = context;
        c1184e.f10308m = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        c1184e.f10303h = 0;
        c1184e.f10311p = new ArrayList();
        c1184e.f10309n = true;
        c1184e.f10306k = true;
        notification.flags |= 16;
        c1184e.f10301e = C1184e.a(e3);
        V1.b bVar = new V1.b(14, false);
        bVar.f1615c = C1184e.a(d3);
        c1184e.b(bVar);
        PackageManager packageManager = context.getPackageManager();
        if (F2.b.f382c == null) {
            F2.b.f382c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (F2.b.f382c.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            c1184e.f10303h = 2;
            if (F2.b.A(context)) {
                arrayList3.add(new C1183d(resources.getString(com.chicken.jump.road.pump.R.string.common_open_on_phone), pendingIntent));
            } else {
                c1184e.f10302g = pendingIntent;
            }
        } else {
            notification.icon = R.drawable.stat_sys_warning;
            notification.tickerText = C1184e.a(resources.getString(com.chicken.jump.road.pump.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            c1184e.f10302g = pendingIntent;
            c1184e.f = C1184e.a(d3);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            if (i7 < 26) {
                throw new IllegalStateException();
            }
            synchronized (f1131c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.chicken.jump.road.pump.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(A1.a.e(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            c1184e.f10308m = "com.google.android.gms.availability";
        }
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Notification.Builder a3 = Build.VERSION.SDK_INT >= 26 ? AbstractC1189j.a(c1184e.f10297a, c1184e.f10308m) : new Notification.Builder(c1184e.f10297a);
        Notification notification2 = c1184e.f10310o;
        a3.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(c1184e.f10301e).setContentText(c1184e.f).setContentInfo(null).setContentIntent(c1184e.f10302g).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        AbstractC1187h.b(a3, null);
        a3.setSubText(null).setUsesChronometer(false).setPriority(c1184e.f10303h);
        Iterator it = c1184e.f10298b.iterator();
        while (it.hasNext()) {
            C1183d c1183d = (C1183d) it.next();
            if (c1183d.f10292b == null && (i6 = c1183d.f10295e) != 0) {
                c1183d.f10292b = IconCompat.b(i6);
            }
            IconCompat iconCompat = c1183d.f10292b;
            Notification.Action.Builder a4 = AbstractC1187h.a(iconCompat != null ? x.b.c(iconCompat, null) : null, c1183d.f, c1183d.f10296g);
            Bundle bundle3 = c1183d.f10291a;
            Bundle bundle4 = bundle3 != null ? new Bundle(bundle3) : new Bundle();
            boolean z3 = c1183d.f10293c;
            bundle4.putBoolean("android.support.allowGeneratedReplies", z3);
            int i8 = Build.VERSION.SDK_INT;
            AbstractC1188i.a(a4, z3);
            bundle4.putInt("android.support.action.semanticAction", 0);
            if (i8 >= 28) {
                AbstractC1190k.b(a4, 0);
            }
            if (i8 >= 29) {
                AbstractC1191l.c(a4, false);
            }
            if (i8 >= 31) {
                AbstractC1192m.a(a4, false);
            }
            bundle4.putBoolean("android.support.action.showsUserInterface", c1183d.f10294d);
            AbstractC1185f.b(a4, bundle4);
            AbstractC1185f.a(a3, AbstractC1185f.d(a4));
        }
        Bundle bundle5 = c1184e.f10307l;
        if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        int i9 = Build.VERSION.SDK_INT;
        a3.setShowWhen(c1184e.f10304i);
        AbstractC1185f.i(a3, c1184e.f10306k);
        AbstractC1185f.g(a3, null);
        AbstractC1185f.j(a3, null);
        AbstractC1185f.h(a3, false);
        AbstractC1186g.b(a3, null);
        AbstractC1186g.c(a3, 0);
        AbstractC1186g.f(a3, 0);
        AbstractC1186g.d(a3, null);
        AbstractC1186g.e(a3, notification2.sound, notification2.audioAttributes);
        ArrayList arrayList4 = c1184e.f10311p;
        ArrayList arrayList5 = c1184e.f10299c;
        if (i9 < 28) {
            if (arrayList5 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList5.size());
                Iterator it2 = arrayList5.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList2 != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList2;
                } else {
                    C1153c c1153c = new C1153c(arrayList4.size() + arrayList2.size());
                    c1153c.addAll(arrayList2);
                    c1153c.addAll(arrayList4);
                    arrayList4 = new ArrayList(c1153c);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                AbstractC1186g.a(a3, (String) it3.next());
            }
        }
        ArrayList arrayList6 = c1184e.f10300d;
        if (arrayList6.size() > 0) {
            if (c1184e.f10307l == null) {
                c1184e.f10307l = new Bundle();
            }
            Bundle bundle6 = c1184e.f10307l.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            int i10 = 0;
            while (i10 < arrayList6.size()) {
                String num = Integer.toString(i10);
                C1183d c1183d2 = (C1183d) arrayList6.get(i10);
                ArrayList arrayList7 = arrayList6;
                Bundle bundle9 = new Bundle();
                ArrayList arrayList8 = arrayList5;
                if (c1183d2.f10292b == null && (i5 = c1183d2.f10295e) != 0) {
                    c1183d2.f10292b = IconCompat.b(i5);
                }
                IconCompat iconCompat2 = c1183d2.f10292b;
                int i11 = i10;
                bundle9.putInt("icon", iconCompat2 != null ? iconCompat2.c() : 0);
                bundle9.putCharSequence("title", c1183d2.f);
                bundle9.putParcelable("actionIntent", c1183d2.f10296g);
                Bundle bundle10 = c1183d2.f10291a;
                Bundle bundle11 = bundle10 != null ? new Bundle(bundle10) : new Bundle();
                bundle11.putBoolean("android.support.allowGeneratedReplies", c1183d2.f10293c);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", c1183d2.f10294d);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(num, bundle9);
                i10 = i11 + 1;
                arrayList6 = arrayList7;
                arrayList5 = arrayList8;
            }
            arrayList = arrayList5;
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (c1184e.f10307l == null) {
                c1184e.f10307l = new Bundle();
            }
            c1184e.f10307l.putBundle("android.car.EXTENSIONS", bundle6);
            bundle2.putBundle("android.car.EXTENSIONS", bundle7);
        } else {
            arrayList = arrayList5;
        }
        int i12 = Build.VERSION.SDK_INT;
        a3.setExtras(c1184e.f10307l);
        AbstractC1188i.e(a3, null);
        if (i12 >= 26) {
            AbstractC1189j.b(a3, 0);
            AbstractC1189j.e(a3, null);
            AbstractC1189j.f(a3, null);
            AbstractC1189j.g(a3, 0L);
            AbstractC1189j.d(a3, 0);
            if (!TextUtils.isEmpty(c1184e.f10308m)) {
                a3.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i12 >= 28) {
            Iterator it4 = arrayList.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i12 >= 29) {
            AbstractC1191l.a(a3, c1184e.f10309n);
            charSequence = null;
            AbstractC1191l.b(a3, null);
        } else {
            charSequence = null;
        }
        V1.b bVar2 = c1184e.f10305j;
        if (bVar2 != null) {
            new Notification.BigTextStyle(a3).setBigContentTitle(charSequence).bigText((CharSequence) bVar2.f1615c);
        }
        Notification build = i7 >= 26 ? a3.build() : a3.build();
        if (bVar2 != null) {
            c1184e.f10305j.getClass();
        }
        if (bVar2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            i.f1135a.set(false);
            i4 = 10436;
        } else {
            i4 = 39789;
        }
        notificationManager.notify(i4, build);
    }

    public final void g(Activity activity, x xVar, int i3, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d3 = d(activity, i3, new S0.l(super.a(i3, activity, "d"), xVar, 1), onCancelListener);
        if (d3 == null) {
            return;
        }
        e(activity, d3, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
