package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.security.ProviderInstaller;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ef implements ProviderInstaller.ProviderInstallListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4757a;
    public final oi b;

    public ef(Context context, oi uiPoster) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        this.f4757a = context;
        this.b = uiPoster;
    }

    public final void a() {
        if (b()) {
            this.b.a(new Function0() { // from class: com.chartboost.sdk.impl.ef$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ef.a(ef.this);
                }
            });
        }
    }

    public final boolean b() {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f4757a) == 0;
        } catch (Exception e) {
            mb.b("GoogleApiAvailability error", e);
            return false;
        }
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstallFailed(int i, Intent intent) {
        mb.e("ProviderInstaller onProviderInstallFailed: " + i + " ProviderInstaller is unable to install an updated Provider, your device's security provider might be vulnerable to known exploits. Your app should behave as if all HTTP communication is unencrypted.", null, 2, null);
    }

    @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    public void onProviderInstalled() {
        mb.b("ProviderInstaller onProviderInstalled", (Throwable) null, 2, (Object) null);
    }

    public static final Unit a(ef efVar) {
        try {
            ProviderInstaller.installIfNeededAsync(efVar.f4757a, efVar);
        } catch (Exception e) {
            mb.b("ProviderInstaller", e);
        }
        return Unit.INSTANCE;
    }
}
