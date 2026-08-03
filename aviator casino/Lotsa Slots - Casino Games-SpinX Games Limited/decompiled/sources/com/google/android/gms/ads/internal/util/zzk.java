package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzk implements com.google.android.gms.internal.ads.zzbjq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbjr zza;
    final /* synthetic */ android.os.Bundle zzb;
    final /* synthetic */ android.content.Context zzc;
    final /* synthetic */ android.net.Uri zzd;

    zzk(com.google.android.gms.ads.internal.util.zzs zzsVar, com.google.android.gms.internal.ads.zzbjr zzbjrVar, android.os.Bundle bundle, android.content.Context context, android.net.Uri uri) {
        this.zza = zzbjrVar;
        this.zzb = bundle;
        this.zzc = context;
        this.zzd = uri;
        java.util.Objects.requireNonNull(zzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zza() {
        com.google.android.gms.internal.ads.zzbjr zzbjrVar = this.zza;
        androidx.browser.customtabs.CustomTabsIntent.Builder builder = new androidx.browser.customtabs.CustomTabsIntent.Builder(zzbjrVar.zzc());
        com.google.android.gms.ads.internal.util.zzs.zzai(builder, this.zzb);
        androidx.browser.customtabs.CustomTabsIntent build = builder.build();
        android.content.Intent intent = build.intent;
        android.content.Context context = this.zzc;
        intent.setPackage(com.google.android.gms.internal.ads.zzink.zza(context));
        build.launchUrl(context, this.zzd);
        zzbjrVar.zzb((android.app.Activity) context);
    }
}
