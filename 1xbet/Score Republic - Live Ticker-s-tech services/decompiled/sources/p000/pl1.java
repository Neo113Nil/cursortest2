package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pl1 {

    /* JADX INFO: renamed from: a */
    public static final w71 f6205a = new w71(0);

    /* JADX INFO: renamed from: b */
    public static Locale f6206b;

    /* JADX INFO: renamed from: a */
    public static String m3964a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
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
                return m3968e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m3968e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m3968e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m3968e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m3965b(Context context, int i) {
        Resources resources = context.getResources();
        String strM3966c = m3966c(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strM3966c);
        }
        if (i == 2) {
            return a90.m136t(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strM3966c);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strM3966c);
        }
        if (i == 5) {
            return m3967d(context, "common_google_play_services_invalid_account_text", strM3966c);
        }
        if (i == 7) {
            return m3967d(context, "common_google_play_services_network_error_text", strM3966c);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strM3966c);
        }
        if (i == 20) {
            return m3967d(context, "common_google_play_services_restricted_profile_text", strM3966c);
        }
        switch (i) {
            case 16:
                return m3967d(context, "common_google_play_services_api_unavailable_text", strM3966c);
            case 17:
                return m3967d(context, "common_google_play_services_sign_in_failed_text", strM3966c);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strM3966c);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strM3966c);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m3966c(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = tk1.m4792a(context).f2181k;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m3967d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM3968e = m3968e(context, str);
        if (strM3968e == null) {
            strM3968e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strM3968e, str2);
    }

    /* JADX INFO: renamed from: e */
    public static String m3968e(Context context, String str) {
        Resources resourcesForApplication;
        w71 w71Var = f6205a;
        synchronized (w71Var) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(f6206b)) {
                    w71Var.clear();
                    f6206b = locale;
                }
                String str2 = (String) w71Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = o90.f5673e;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb = new StringBuilder(str.length() + 18);
                        sb.append("Missing resource: ");
                        sb.append(str);
                        Log.w("GoogleApiAvailability", sb.toString());
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            w71Var.put(str, string);
                            return string;
                        }
                        StringBuilder sb2 = new StringBuilder(str.length() + 20);
                        sb2.append("Got empty resource: ");
                        sb2.append(str);
                        Log.w("GoogleApiAvailability", sb2.toString());
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
