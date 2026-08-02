package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.common.zzd;
import io.sentry.protocol.SentryStackFrame;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11216a = g.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: b, reason: collision with root package name */
    public static final d f11217b = new d();

    public Intent a(Context context, int i7, String str) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && m3.c.m(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f11216a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(n3.c.a(context).t(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public final PendingIntent b(Context context, int i7, int i8, String str) {
        Intent a2 = a(context, i7, str);
        if (a2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i8, a2, zzd.zza | 134217728);
    }

    public int c(Context context) {
        return d(context, f11216a);
    }

    public int d(Context context, int i7) {
        int isGooglePlayServicesAvailable = g.isGooglePlayServicesAvailable(context, i7);
        if (g.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }
}
