package m0;

/* loaded from: classes.dex */
public final class f extends m0.g {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f8052c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static final m0.f f8053d = new m0.f();

    public static android.app.AlertDialog d(android.app.Activity activity, int i2, p0.DialogInterfaceOnClickListenerC0960l dialogInterfaceOnClickListenerC0960l, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (i2 == 0) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        activity.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        android.app.AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new android.app.AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new android.app.AlertDialog.Builder(activity);
        }
        builder.setMessage(p0.AbstractC0959k.b(activity, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        android.content.res.Resources resources = activity.getResources();
        java.lang.String string = i2 != 1 ? i2 != 2 ? i2 != 3 ? resources.getString(android.R.string.ok) : resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_enable_button) : resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_update_button) : resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, dialogInterfaceOnClickListenerC0960l);
        }
        java.lang.String c2 = p0.AbstractC0959k.c(activity, i2);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        android.util.Log.w("GoogleApiAvailability", B1.a.f(i2, "Creating dialog for Google Play services availability issue. ConnectionResult="), new java.lang.IllegalArgumentException());
        return builder.create();
    }

    public static void e(android.app.Activity activity, android.app.AlertDialog alertDialog, java.lang.String str, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        m0.c cVar = new m0.c();
        p0.AbstractC0966r.d(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f8046a = alertDialog;
        if (onCancelListener != null) {
            cVar.f8047b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(com.google.android.gms.common.api.GoogleApiActivity googleApiActivity, int i2, com.google.android.gms.common.api.GoogleApiActivity googleApiActivity2) {
        android.app.AlertDialog d2 = d(googleApiActivity, i2, new p0.DialogInterfaceOnClickListenerC0960l(super.a(googleApiActivity, "d", i2), googleApiActivity, 0), googleApiActivity2);
        if (d2 == null) {
            return;
        }
        e(googleApiActivity, d2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(android.content.Context context, int i2, android.app.PendingIntent pendingIntent) {
        android.app.NotificationManager notificationManager;
        java.lang.CharSequence charSequence;
        int i3;
        android.os.Bundle bundle;
        int i4;
        java.util.ArrayList arrayList;
        int i5;
        android.app.NotificationChannel notificationChannel;
        java.lang.CharSequence name;
        android.util.Log.w("GoogleApiAvailability", B1.a.g(i2, "GMS core API Availability. ConnectionResult=", ", tag=null"), new java.lang.IllegalArgumentException());
        if (i2 == 18) {
            new m0.l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                android.util.Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        java.lang.String e2 = i2 == 6 ? p0.AbstractC0959k.e(context, "common_google_play_services_resolution_required_title") : p0.AbstractC0959k.c(context, i2);
        if (e2 == null) {
            e2 = context.getResources().getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_notification_ticker);
        }
        java.lang.String d2 = (i2 == 6 || i2 == 19) ? p0.AbstractC0959k.d(context, "common_google_play_services_resolution_required_text", p0.AbstractC0959k.a(context)) : p0.AbstractC0959k.b(context, i2);
        android.content.res.Resources resources = context.getResources();
        java.lang.Object systemService = context.getSystemService("notification");
        p0.AbstractC0966r.c(systemService);
        android.app.NotificationManager notificationManager2 = (android.app.NotificationManager) systemService;
        o.b bVar = new o.b();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        bVar.f8105b = arrayList2;
        bVar.f8106c = new java.util.ArrayList();
        bVar.f8107d = new java.util.ArrayList();
        bVar.f8112i = true;
        bVar.f8114k = false;
        android.app.Notification notification = new android.app.Notification();
        bVar.f8118o = notification;
        bVar.f8104a = context;
        bVar.f8116m = null;
        notification.when = java.lang.System.currentTimeMillis();
        notification.audioStreamType = -1;
        bVar.f8111h = 0;
        bVar.f8119p = new java.util.ArrayList();
        bVar.f8117n = true;
        bVar.f8114k = true;
        notification.flags |= 16;
        bVar.f8108e = o.b.a(e2);
        x0.e eVar = new x0.e(29, false);
        eVar.f8410c = o.b.a(d2);
        bVar.b(eVar);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (Q1.l.f1638e == null) {
            Q1.l.f1638e = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (Q1.l.f1638e.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            bVar.f8111h = 2;
            if (Q1.l.p(context)) {
                arrayList2.add(new o.C0941a(resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_open_on_phone), pendingIntent));
            } else {
                bVar.f8110g = pendingIntent;
            }
        } else {
            notification.icon = android.R.drawable.stat_sys_warning;
            notification.tickerText = o.b.a(resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_notification_ticker));
            notification.when = java.lang.System.currentTimeMillis();
            bVar.f8110g = pendingIntent;
            bVar.f8109f = o.b.a(d2);
        }
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            if (i6 < 26) {
                throw new java.lang.IllegalStateException();
            }
            synchronized (f8052c) {
            }
            notificationChannel = notificationManager2.getNotificationChannel("com.google.android.gms.availability");
            java.lang.String string = context.getResources().getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager2.createNotificationChannel(m0.e.b(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager2.createNotificationChannel(notificationChannel);
                }
            }
            bVar.f8116m = "com.google.android.gms.availability";
        }
        new java.util.ArrayList();
        android.os.Bundle bundle2 = new android.os.Bundle();
        android.app.Notification.Builder a2 = android.os.Build.VERSION.SDK_INT >= 26 ? o.g.a(bVar.f8104a, bVar.f8116m) : new android.app.Notification.Builder(bVar.f8104a);
        android.app.Notification notification2 = bVar.f8118o;
        a2.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(bVar.f8108e).setContentText(bVar.f8109f).setContentInfo(null).setContentIntent(bVar.f8110g).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        o.e.b(a2, null);
        a2.setSubText(null).setUsesChronometer(false).setPriority(bVar.f8111h);
        java.util.Iterator it = bVar.f8105b.iterator();
        while (it.hasNext()) {
            o.C0941a c0941a = (o.C0941a) it.next();
            if (c0941a.f8098b == null && (i5 = c0941a.f8101e) != 0) {
                c0941a.f8098b = androidx.core.graphics.drawable.IconCompat.b(i5);
            }
            androidx.core.graphics.drawable.IconCompat iconCompat = c0941a.f8098b;
            android.app.Notification.Action.Builder a3 = o.e.a(iconCompat != null ? s.b.c(iconCompat, null) : null, c0941a.f8102f, c0941a.f8103g);
            android.os.Bundle bundle3 = c0941a.f8097a;
            android.os.Bundle bundle4 = bundle3 != null ? new android.os.Bundle(bundle3) : new android.os.Bundle();
            boolean z2 = c0941a.f8099c;
            bundle4.putBoolean("android.support.allowGeneratedReplies", z2);
            int i7 = android.os.Build.VERSION.SDK_INT;
            o.f.a(a3, z2);
            bundle4.putInt("android.support.action.semanticAction", 0);
            if (i7 >= 28) {
                o.h.b(a3, 0);
            }
            if (i7 >= 29) {
                o.i.c(a3, false);
            }
            if (i7 >= 31) {
                o.j.a(a3, false);
            }
            bundle4.putBoolean("android.support.action.showsUserInterface", c0941a.f8100d);
            o.c.b(a3, bundle4);
            o.c.a(a2, o.c.d(a3));
        }
        android.os.Bundle bundle5 = bVar.f8115l;
        if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        int i8 = android.os.Build.VERSION.SDK_INT;
        a2.setShowWhen(bVar.f8112i);
        o.c.i(a2, bVar.f8114k);
        o.c.g(a2, null);
        o.c.j(a2, null);
        o.c.h(a2, false);
        o.d.b(a2, null);
        o.d.c(a2, 0);
        o.d.f(a2, 0);
        o.d.d(a2, null);
        o.d.e(a2, notification2.sound, notification2.audioAttributes);
        java.util.ArrayList arrayList3 = bVar.f8119p;
        java.util.ArrayList arrayList4 = bVar.f8106c;
        if (i8 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(arrayList4.size());
                java.util.Iterator it2 = arrayList4.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new java.lang.ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    l.C0925c c0925c = new l.C0925c(arrayList3.size() + arrayList.size());
                    c0925c.addAll(arrayList);
                    c0925c.addAll(arrayList3);
                    arrayList3 = new java.util.ArrayList(c0925c);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            java.util.Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                o.d.a(a2, (java.lang.String) it3.next());
            }
        }
        java.util.ArrayList arrayList5 = bVar.f8107d;
        if (arrayList5.size() > 0) {
            if (bVar.f8115l == null) {
                bVar.f8115l = new android.os.Bundle();
            }
            android.os.Bundle bundle6 = bVar.f8115l.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new android.os.Bundle();
            }
            android.os.Bundle bundle7 = new android.os.Bundle(bundle6);
            android.os.Bundle bundle8 = new android.os.Bundle();
            int i9 = 0;
            while (i9 < arrayList5.size()) {
                java.lang.String num = java.lang.Integer.toString(i9);
                o.C0941a c0941a2 = (o.C0941a) arrayList5.get(i9);
                java.util.ArrayList arrayList6 = arrayList5;
                android.os.Bundle bundle9 = new android.os.Bundle();
                android.app.NotificationManager notificationManager3 = notificationManager2;
                if (c0941a2.f8098b == null && (i4 = c0941a2.f8101e) != 0) {
                    c0941a2.f8098b = androidx.core.graphics.drawable.IconCompat.b(i4);
                }
                androidx.core.graphics.drawable.IconCompat iconCompat2 = c0941a2.f8098b;
                bundle9.putInt("icon", iconCompat2 != null ? iconCompat2.c() : 0);
                bundle9.putCharSequence("title", c0941a2.f8102f);
                bundle9.putParcelable("actionIntent", c0941a2.f8103g);
                android.os.Bundle bundle10 = c0941a2.f8097a;
                android.os.Bundle bundle11 = bundle10 != null ? new android.os.Bundle(bundle10) : new android.os.Bundle();
                bundle11.putBoolean("android.support.allowGeneratedReplies", c0941a2.f8099c);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", c0941a2.f8100d);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(num, bundle9);
                i9++;
                arrayList5 = arrayList6;
                notificationManager2 = notificationManager3;
            }
            notificationManager = notificationManager2;
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (bVar.f8115l == null) {
                bVar.f8115l = new android.os.Bundle();
            }
            bVar.f8115l.putBundle("android.car.EXTENSIONS", bundle6);
            bundle2.putBundle("android.car.EXTENSIONS", bundle7);
        } else {
            notificationManager = notificationManager2;
        }
        int i10 = android.os.Build.VERSION.SDK_INT;
        a2.setExtras(bVar.f8115l);
        o.f.e(a2, null);
        if (i10 >= 26) {
            o.g.b(a2, 0);
            o.g.e(a2, null);
            o.g.f(a2, null);
            o.g.g(a2, 0L);
            o.g.d(a2, 0);
            if (!android.text.TextUtils.isEmpty(bVar.f8116m)) {
                a2.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i10 >= 28) {
            java.util.Iterator it4 = arrayList4.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new java.lang.ClassCastException();
            }
        }
        if (i10 >= 29) {
            o.i.a(a2, bVar.f8117n);
            charSequence = null;
            o.i.b(a2, null);
        } else {
            charSequence = null;
        }
        x0.e eVar2 = bVar.f8113j;
        if (eVar2 != null) {
            new android.app.Notification.BigTextStyle(a2).setBigContentTitle(charSequence).bigText((java.lang.CharSequence) eVar2.f8410c);
        }
        android.app.Notification build = i6 >= 26 ? a2.build() : a2.build();
        if (eVar2 != null) {
            bVar.f8113j.getClass();
        }
        if (eVar2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            m0.i.f8056a.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, build);
    }

    public final void g(android.app.Activity activity, o0.y yVar, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.AlertDialog d2 = d(activity, i2, new p0.DialogInterfaceOnClickListenerC0960l(super.a(activity, "d", i2), yVar, 1), onCancelListener);
        if (d2 == null) {
            return;
        }
        e(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
