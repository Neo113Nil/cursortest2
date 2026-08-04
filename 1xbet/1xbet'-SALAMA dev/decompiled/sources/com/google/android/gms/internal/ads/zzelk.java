package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzelk implements zzesh {
    private final Context zza;
    private final zzgbn zzb;

    public zzelk(zzgbn zzgbnVar, Context context) {
        this.zzb = zzgbnVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmO)).booleanValue()) {
            return zzgbc.zzh(new zzell(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? zzgbc.zzh(new zzell(null, false)) : this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzelj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzell(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }
}
