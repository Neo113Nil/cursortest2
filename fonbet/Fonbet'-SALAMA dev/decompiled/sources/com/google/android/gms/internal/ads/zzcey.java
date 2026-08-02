package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class zzcey implements zzbiz {
    final /* synthetic */ zzcfa zza;

    public zzcey(zzcfa zzcfaVar) {
        this.zza = zzcfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i7;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zza) {
                    try {
                        zzcfa zzcfaVar = this.zza;
                        i7 = zzcfaVar.zzI;
                        if (i7 != parseInt) {
                            zzcfaVar.zzI = parseInt;
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
