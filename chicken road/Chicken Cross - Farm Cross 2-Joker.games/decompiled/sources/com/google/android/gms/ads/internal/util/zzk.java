package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zziom;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzk implements zzbkg {
    final /* synthetic */ zzbkh zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Uri zzd;

    zzk(zzs zzsVar, zzbkh zzbkhVar, Bundle bundle, Context context, Uri uri) {
        this.zza = zzbkhVar;
        this.zzb = bundle;
        this.zzc = context;
        this.zzd = uri;
        Objects.requireNonNull(zzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zza() {
        zzbkh zzbkhVar = this.zza;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(zzbkhVar.zzc());
        zzs.zzai(builder, this.zzb);
        CustomTabsIntent build = builder.build();
        Intent intent = build.intent;
        Context context = this.zzc;
        intent.setPackage(zziom.zza(context));
        build.launchUrl(context, this.zzd);
        zzbkhVar.zzb((Activity) context);
    }
}
