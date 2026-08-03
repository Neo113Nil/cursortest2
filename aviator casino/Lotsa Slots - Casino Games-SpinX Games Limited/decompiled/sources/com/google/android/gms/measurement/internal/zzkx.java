package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkx implements android.app.Application.ActivityLifecycleCallbacks, com.google.android.gms.measurement.internal.zzkv {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zza;

    zzkx(com.google.android.gms.measurement.internal.zzli zzliVar) {
        java.util.Objects.requireNonNull(zzliVar);
        this.zza = zzliVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        zza(com.google.android.gms.internal.measurement.zzdf.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        zzb(com.google.android.gms.internal.measurement.zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        zzc(com.google.android.gms.internal.measurement.zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        zzd(com.google.android.gms.internal.measurement.zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        zze(com.google.android.gms.internal.measurement.zzdf.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    @Override // com.google.android.gms.measurement.internal.zzkv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(com.google.android.gms.internal.measurement.zzdf zzdfVar, android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzib zzibVar;
        com.google.android.gms.measurement.internal.zzli zzliVar;
        com.google.android.gms.measurement.internal.zzib zzibVar2;
        android.content.Intent intent;
        android.net.Uri uri;
        java.lang.String stringExtra;
        java.lang.String str;
        try {
            try {
                zzliVar = this.zza;
                zzibVar2 = zzliVar.zzu;
                zzibVar2.zzaV().zzk().zza("onActivityCreated");
                intent = zzdfVar.zzc;
            } catch (java.lang.RuntimeException e) {
                this.zza.zzu.zzaV().zzb().zzb("Throwable caught in onActivityCreated", e);
            }
            if (intent != null) {
                android.net.Uri data = intent.getData();
                if (data != null) {
                    if (!data.isHierarchical()) {
                    }
                    uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        zzibVar2.zzk();
                        stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                            str = "auto";
                            zzibVar2.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkw(this, bundle != null, uri, str, uri.getQueryParameter(com.adjust.sdk.Constants.REFERRER)));
                            zzibVar = this.zza.zzu;
                            zzibVar.zzs().zzm(zzdfVar, bundle);
                        }
                        str = "gs";
                        zzibVar2.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkw(this, bundle != null, uri, str, uri.getQueryParameter(com.adjust.sdk.Constants.REFERRER)));
                        zzibVar = this.zza.zzu;
                        zzibVar.zzs().zzm(zzdfVar, bundle);
                    }
                }
                android.os.Bundle extras = intent.getExtras();
                uri = null;
                if (extras != null) {
                    java.lang.String string = extras.getString("com.android.vending.referral_url");
                    if (!android.text.TextUtils.isEmpty(string)) {
                        data = android.net.Uri.parse(string);
                        uri = data;
                    }
                }
                if (uri != null) {
                    zzibVar2.zzk();
                    stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                        str = "auto";
                        zzibVar2.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkw(this, bundle != null, uri, str, uri.getQueryParameter(com.adjust.sdk.Constants.REFERRER)));
                        zzibVar = this.zza.zzu;
                        zzibVar.zzs().zzm(zzdfVar, bundle);
                    }
                    str = "gs";
                    zzibVar2.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkw(this, bundle != null, uri, str, uri.getQueryParameter(com.adjust.sdk.Constants.REFERRER)));
                    zzibVar = this.zza.zzu;
                    zzibVar.zzs().zzm(zzdfVar, bundle);
                }
            }
            zzibVar = zzliVar.zzu;
            zzibVar.zzs().zzm(zzdfVar, bundle);
        } catch (java.lang.Throwable th) {
            this.zza.zzu.zzs().zzm(zzdfVar, bundle);
            throw th;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    public final void zzb(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        this.zza.zzu.zzs().zzs(zzdfVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    public final void zzc(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zza.zzu;
        zzibVar.zzs().zzp(zzdfVar);
        com.google.android.gms.measurement.internal.zzob zzh = zzibVar.zzh();
        com.google.android.gms.measurement.internal.zzib zzibVar2 = zzh.zzu;
        zzibVar2.zzaW().zzj(new com.google.android.gms.measurement.internal.zznu(zzh, zzibVar2.zzaZ().elapsedRealtime()));
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    public final void zzd(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zza.zzu;
        com.google.android.gms.measurement.internal.zzob zzh = zzibVar.zzh();
        com.google.android.gms.measurement.internal.zzib zzibVar2 = zzh.zzu;
        zzibVar2.zzaW().zzj(new com.google.android.gms.measurement.internal.zznt(zzh, zzibVar2.zzaZ().elapsedRealtime()));
        zzibVar.zzs().zzn(zzdfVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    public final void zze(com.google.android.gms.internal.measurement.zzdf zzdfVar, android.os.Bundle bundle) {
        this.zza.zzu.zzs().zzq(zzdfVar, bundle);
    }
}
