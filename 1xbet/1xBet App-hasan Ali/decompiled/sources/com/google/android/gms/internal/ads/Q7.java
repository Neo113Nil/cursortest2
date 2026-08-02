package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import q.C2294i;

/* loaded from: classes.dex */
public final class Q7 {

    /* renamed from: a, reason: collision with root package name */
    public m2.g f11183a;

    /* renamed from: b, reason: collision with root package name */
    public C2294i f11184b;

    /* renamed from: c, reason: collision with root package name */
    public MD f11185c;

    /* renamed from: d, reason: collision with root package name */
    public v3.e f11186d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(AbstractC0952et.l(context));
                    }
                }
            }
        }
        return false;
    }
}
