package p0;

/* renamed from: p0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0959k {

    /* renamed from: a, reason: collision with root package name */
    public static final l.k f8264a = new l.k();

    /* renamed from: b, reason: collision with root package name */
    public static java.util.Locale f8265b;

    public static java.lang.String a(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        try {
            android.content.Context context2 = u0.C0996b.a(context).f556a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
            java.lang.String str = context.getApplicationInfo().name;
            return android.text.TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static java.lang.String b(android.content.Context context, int i2) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String a2 = a(context);
        if (i2 == 1) {
            return resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_install_text, a2);
        }
        if (i2 == 2) {
            return Q1.l.p(context) ? resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_wear_update_text) : resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_update_text, a2);
        }
        if (i2 == 3) {
            return resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_enable_text, a2);
        }
        if (i2 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i2 == 7) {
            return d(context, "common_google_play_services_network_error_text", a2);
        }
        if (i2 == 9) {
            return resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_unsupported_text, a2);
        }
        if (i2 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i2) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a2);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_updating_text, a2);
            default:
                return resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_unknown_issue, a2);
        }
    }

    public static java.lang.String c(android.content.Context context, int i2) {
        android.content.res.Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                android.util.Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                android.util.Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                android.util.Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                android.util.Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                android.util.Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                android.util.Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
            default:
                android.util.Log.e("GoogleApiAvailability", "Unexpected error code " + i2);
                return null;
            case 16:
                android.util.Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                android.util.Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                android.util.Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static java.lang.String d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String e2 = e(context, str);
        if (e2 == null) {
            e2 = resources.getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_unknown_issue);
        }
        return java.lang.String.format(resources.getConfiguration().locale, e2, str2);
    }

    public static java.lang.String e(android.content.Context context, java.lang.String str) {
        android.content.res.Resources resources;
        l.k kVar = f8264a;
        synchronized (kVar) {
            try {
                java.util.Locale locale = u.AbstractC0992a.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f8265b)) {
                    kVar.clear();
                    f8265b = locale;
                }
                java.lang.String str2 = (java.lang.String) kVar.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = m0.i.f8056a;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    android.util.Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                java.lang.String string = resources.getString(identifier);
                if (android.text.TextUtils.isEmpty(string)) {
                    android.util.Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f8264a.put(str, string);
                return string;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
