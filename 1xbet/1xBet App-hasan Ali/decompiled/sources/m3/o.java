package m3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import game.betting133.sports1xbet.R;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import q3.AbstractC2309b;
import r.Q;
import r3.C2350b;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f18087a = new Q(0);

    /* renamed from: b, reason: collision with root package name */
    public static Locale f18088b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C2350b.a(context).f17113k;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String a5 = a(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a5);
        }
        if (i == 2) {
            return AbstractC2309b.h(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a5);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a5);
        }
        if (i == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a5);
        }
        if (i == 7) {
            return d(context, "common_google_play_services_network_error_text", a5);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a5);
        }
        if (i == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a5);
        }
        switch (i) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a5);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a5);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a5);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a5);
        }
    }

    public static String c(Context context, int i) {
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
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
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
        String e3 = e(context, str);
        if (e3 == null) {
            e3 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e3, str2);
    }

    public static String e(Context context, String str) {
        j1.c cVar;
        Resources resources;
        Q q5 = f18087a;
        synchronized (q5) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    cVar = new j1.c(new j1.f(d1.h.d(configuration)));
                } else {
                    Locale[] localeArr = {configuration.locale};
                    if (i >= 24) {
                        int i5 = j1.c.f17485b;
                        cVar = new j1.c(new j1.f(d1.h.b(localeArr)));
                    } else {
                        cVar = new j1.c(new j1.d(localeArr));
                    }
                }
                Locale locale = cVar.f17486a.get();
                if (!locale.equals(f18088b)) {
                    q5.clear();
                    f18088b = locale;
                }
                String str2 = (String) q5.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = j3.h.f17515a;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            f18087a.put(str, string);
                            return string;
                        }
                        Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
