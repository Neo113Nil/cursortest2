package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzcey implements zzbiz {
    final /* synthetic */ zzcfa zza;

    public zzcey(zzcfa zzcfaVar) {
        this.zza = zzcfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i7 = Integer.parseInt(str);
                synchronized (this.zza) {
                    try {
                        zzcfa zzcfaVar = this.zza;
                        if (zzcfaVar.zzI != i7) {
                            zzcfaVar.zzI = i7;
                            this.zza.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e7) {
                int i8 = J.f3546b;
                j.h("Exception occurred while getting webview content height", e7);
            }
        }
    }
}
