package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r.l f11326a = new r.l();

    /* renamed from: b, reason: collision with root package name */
    public static Locale f11327b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return n3.c.a(context).r(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(int i7, Context context) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i7 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a2);
        }
        if (i7 == 2) {
            return m3.c.m(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a2);
        }
        if (i7 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a2);
        }
        if (i7 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i7 == 7) {
            return d(context, "common_google_play_services_network_error_text", a2);
        }
        if (i7 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a2);
        }
        if (i7 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i7) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a2);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a2);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a2);
        }
    }

    public static String c(int i7, Context context) {
        Resources resources = context.getResources();
        switch (i7) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                w1.L.k(i7, "Unexpected error code ", "GoogleApiAvailability");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e7 = e(context, str);
        if (e7 == null) {
            e7 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e7, str2);
    }

    public static String e(Context context, String str) {
        r.l lVar = f11326a;
        synchronized (lVar) {
            try {
                Locale locale = L.d.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f11327b)) {
                    lVar.clear();
                    f11327b = locale;
                }
                String str2 = (String) lVar.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                lVar.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
