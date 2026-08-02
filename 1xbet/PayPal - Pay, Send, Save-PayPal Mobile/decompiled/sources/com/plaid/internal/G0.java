package com.plaid.internal;

/* loaded from: classes16.dex */
public final class G0 {
    public static java.lang.String a(android.app.Application application) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        return android.provider.Settings.Secure.getString(application.getApplicationContext().getContentResolver(), a.b.l);
    }
}
