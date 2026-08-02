package com.google.android.gms.common;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC0837k;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: com.google.android.gms.common.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0855e extends C0856f {
    public static final Object c = new Object();
    public static final C0855e d = new C0855e();

    @Nullable
    public static AlertDialog e(@NonNull Activity activity, int i, @Nullable com.google.android.gms.common.internal.D d2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(com.google.android.gms.common.internal.A.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.haryanvi.netstream.R.string.common_google_play_services_enable_button) : resources.getString(com.haryanvi.netstream.R.string.common_google_play_services_update_button) : resources.getString(com.haryanvi.netstream.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, d2);
        }
        String c2 = com.google.android.gms.common.internal.A.c(activity, i);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                l lVar = new l();
                C0875q.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                lVar.a = alertDialog;
                if (onCancelListener != null) {
                    lVar.b = onCancelListener;
                }
                lVar.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC0853c dialogFragmentC0853c = new DialogFragmentC0853c();
        C0875q.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC0853c.a = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC0853c.b = onCancelListener;
        }
        dialogFragmentC0853c.show(fragmentManager, str);
    }

    @Override // com.google.android.gms.common.C0856f
    @ResultIgnorabilityUnspecified
    public final int b(@NonNull Context context) {
        return c(context, C0856f.a);
    }

    @ResultIgnorabilityUnspecified
    public final void d(@NonNull GoogleApiActivity googleApiActivity, int i, @Nullable GoogleApiActivity googleApiActivity2) {
        AlertDialog e = e(googleApiActivity, i, new com.google.android.gms.common.internal.B(super.a(googleApiActivity, i, "d"), googleApiActivity), googleApiActivity2);
        if (e == null) {
            return;
        }
        f(googleApiActivity, e, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    @TargetApi(20)
    public final void g(Context context, int i, @Nullable PendingIntent pendingIntent) {
        int i2;
        NotificationChannel notificationChannel;
        CharSequence name;
        new IllegalArgumentException();
        if (i == 18) {
            new m(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String e = i == 6 ? com.google.android.gms.common.internal.A.e(context, "common_google_play_services_resolution_required_title") : com.google.android.gms.common.internal.A.c(context, i);
        if (e == null) {
            e = context.getResources().getString(com.haryanvi.netstream.R.string.common_google_play_services_notification_ticker);
        }
        String d2 = (i == 6 || i == 19) ? com.google.android.gms.common.internal.A.d(context, "common_google_play_services_resolution_required_text", com.google.android.gms.common.internal.A.a(context)) : com.google.android.gms.common.internal.A.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        C0875q.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(e).setStyle(new NotificationCompat.BigTextStyle().bigText(d2));
        if (!DeviceProperties.isWearable(context)) {
            style.setSmallIcon(R.drawable.stat_sys_warning).setTicker(resources.getString(com.haryanvi.netstream.R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(d2);
        } else {
            if (!PlatformVersion.isAtLeastKitKatWatch()) {
                throw new IllegalStateException();
            }
            style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                style.addAction(2131230883, resources.getString(com.haryanvi.netstream.R.string.common_open_on_phone), pendingIntent);
            } else {
                style.setContentIntent(pendingIntent);
            }
        }
        if (PlatformVersion.isAtLeastO()) {
            if (!PlatformVersion.isAtLeastO()) {
                throw new IllegalStateException();
            }
            synchronized (c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.haryanvi.netstream.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(androidx.compose.ui.graphics.x.b(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            style.setChannelId("com.google.android.gms.availability");
        }
        Notification build = style.build();
        if (i == 1 || i == 2 || i == 3) {
            j.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, build);
    }

    @ResultIgnorabilityUnspecified
    public final void h(@NonNull Activity activity, @NonNull InterfaceC0837k interfaceC0837k, int i, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e = e(activity, i, new com.google.android.gms.common.internal.C(super.a(activity, i, "d"), interfaceC0837k), onCancelListener);
        if (e == null) {
            return;
        }
        f(activity, e, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
