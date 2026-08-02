package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.aw1;
import p000.hn0;
import p000.l10;
import p000.m10;
import p000.mw1;
import p000.p80;
import p000.sv1;
import p000.w00;
import p000.w22;
import p000.xv1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b */
    public static volatile FirebaseAnalytics f1353b;

    /* JADX INFO: renamed from: a */
    public final mw1 f1354a;

    public FirebaseAnalytics(mw1 mw1Var) {
        p80.m3863h(mw1Var);
        this.f1354a = mw1Var;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f1353b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f1353b == null) {
                        f1353b = new FirebaseAnalytics(mw1.m3432d(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1353b;
    }

    public static w22 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        mw1 mw1VarM3432d = mw1.m3432d(context, bundle);
        if (mw1VarM3432d == null) {
            return null;
        }
        return new sv1(mw1VarM3432d);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = l10.f4629m;
            w00 w00VarM5221b = w00.m5221b();
            w00VarM5221b.m5224a();
            return (String) hn0.m2311b(((l10) w00VarM5221b.f8321d.mo2281a(m10.class)).m3141c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        xv1 xv1VarM5690b = xv1.m5690b(activity);
        mw1 mw1Var = this.f1354a;
        mw1Var.getClass();
        mw1Var.m3434b(new aw1(mw1Var, xv1VarM5690b, str, str2));
    }
}
