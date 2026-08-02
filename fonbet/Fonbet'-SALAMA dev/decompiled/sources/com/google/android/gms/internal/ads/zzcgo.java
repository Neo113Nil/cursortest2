package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class zzcgo implements zzheg {
    public zzcgo(zzcge zzcgeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* synthetic */ Object zzb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d"));
        return intent;
    }
}
