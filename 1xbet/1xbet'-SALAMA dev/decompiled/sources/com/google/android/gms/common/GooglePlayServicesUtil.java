package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import androidx.fragment.app.AbstractComponentCallbacksC0701v;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public final class GooglePlayServicesUtil extends g {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i7, Activity activity, int i8) {
        return getErrorDialog(i7, activity, i8, null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i7, Context context, int i8) {
        return d.f11217b.b(context, i7, i8, null);
    }

    @VisibleForTesting
    @Deprecated
    public static String getErrorString(int i7) {
        return ConnectionResult.j(i7);
    }

    public static Context getRemoteContext(Context context) {
        return g.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return g.isGooglePlayServicesAvailable(context, g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i7) {
        return i7 == 1 || i7 == 2 || i7 == 3 || i7 == 9;
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i7, Activity activity, int i8) {
        return showErrorDialogFragment(i7, activity, i8, null);
    }

    @Deprecated
    public static void showErrorNotification(int i7, Context context) {
        c cVar = c.f11215d;
        if (g.isPlayServicesPossiblyUpdating(context, i7) || g.isPlayStorePossiblyUpdating(context, i7)) {
            new j(cVar, context).sendEmptyMessageDelayed(1, 120000L);
        } else {
            cVar.i(context, i7, cVar.b(context, i7, 0, "n"));
        }
    }

    @Deprecated
    public static Dialog getErrorDialog(int i7, Activity activity, int i8, DialogInterface.OnCancelListener onCancelListener) {
        if (true == g.isPlayServicesPossiblyUpdating(activity, i7)) {
            i7 = 18;
        }
        return c.f11215d.e(i7, activity, i8, onCancelListener);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i7) {
        return g.isGooglePlayServicesAvailable(context, i7);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i7, Activity activity, int i8, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i7, activity, null, i8, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i7, Activity activity, AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, int i8, DialogInterface.OnCancelListener onCancelListener) {
        if (true == g.isPlayServicesPossiblyUpdating(activity, i7)) {
            i7 = 18;
        }
        c cVar = c.f11215d;
        if (abstractComponentCallbacksC0701v == null) {
            AlertDialog alertDialogE = cVar.e(i7, activity, i8, onCancelListener);
            if (alertDialogE == null) {
                return false;
            }
            c.h(activity, alertDialogE, GMS_ERROR_DIALOG, onCancelListener);
            return true;
        }
        AlertDialog alertDialogG = c.g(activity, i7, new t(cVar.a(activity, i7, "d"), abstractComponentCallbacksC0701v, i8, 1), onCancelListener);
        if (alertDialogG == null) {
            return false;
        }
        c.h(activity, alertDialogG, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
