package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
public final class HsdpDeepLinkServiceFactory {
    private static final String HPOA_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hpoa.service.HpoaService";
    private static final String HPOA_SERVICE_CLASS_NAME_FOR_TESTING = "com.google.android.play.core.hsdp.testapp.FakeHpoaService";
    private static final String HSDP_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hsdp.service.HsdpService";

    private HsdpDeepLinkServiceFactory() {
    }

    public static HsdpDeepLinkService create(Activity activity) {
        return create(activity, false);
    }

    private static Intent createHpoaServiceIntent(Context context, boolean z) {
        return z ? new Intent().setClassName(context.getPackageName(), HPOA_SERVICE_CLASS_NAME_FOR_TESTING) : new Intent().setClassName("com.android.vending", HPOA_SERVICE_CLASS_NAME);
    }

    static Intent createHsdpServiceIntent() {
        return new Intent().setClassName("com.android.vending", HSDP_SERVICE_CLASS_NAME);
    }

    private static HsdpDeepLinkService createInternal(final Context context, boolean z, boolean z2) {
        if (!z2 && !(context instanceof Activity)) {
            throw new IllegalArgumentException("Context must be an Activity when using activity-based HSDP.");
        }
        if (z && !(context instanceof Activity)) {
            throw new IllegalArgumentException("Context must be an Activity when enabling loading panel.");
        }
        final boolean z3 = ActivityManager.isRunningInTestHarness() || (Build.VERSION.SDK_INT >= 29 && ActivityManager.isRunningInUserTestHarness());
        return new zzat(context, com.google.android.gms.internal.playcore_hsdp.zzj.zza(new com.google.android.gms.internal.playcore_hsdp.zzg() { // from class: com.google.android.play.core.hsdp.service.zzaj
            @Override // com.google.android.gms.internal.playcore_hsdp.zzg
            public final Object zza() {
                return HsdpDeepLinkServiceFactory.lambda$createInternal$0(context, z3);
            }
        }), com.google.android.gms.internal.playcore_hsdp.zzj.zza(new com.google.android.gms.internal.playcore_hsdp.zzg() { // from class: com.google.android.play.core.hsdp.service.zzak
            @Override // com.google.android.gms.internal.playcore_hsdp.zzg
            public final Object zza() {
                zzr zza;
                zza = zzs.zza(HsdpDeepLinkServiceFactory.createHsdpServiceIntent(), context);
                return zza;
            }
        }), z3, z2, z);
    }

    static /* synthetic */ zze lambda$createInternal$0(Context context, boolean z) {
        return new zzp(createHpoaServiceIntent(context, z), (Activity) context);
    }

    public static HsdpDeepLinkService create(Activity activity, boolean z) {
        return create(activity, z, false);
    }

    public static HsdpDeepLinkService create(Activity activity, boolean z, boolean z2) {
        return createInternal(activity, z, z2);
    }

    public static HsdpDeepLinkService create(Context context) {
        return createInternal(context, false, true);
    }
}
