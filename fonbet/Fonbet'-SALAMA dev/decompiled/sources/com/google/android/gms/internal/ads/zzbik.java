package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import H2.r;
import I2.J;
import R4.c;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbik implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzfqy zzfqyVar;
        r rVar = o.f1952C.f1971r;
        if (!rVar.f3293d || (zzfqyVar = (zzfqy) rVar.f3295f) == null) {
            J.k("LastMileDelivery not connected");
            return;
        }
        zzfqw zzc = zzfqx.zzc();
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlx)).booleanValue() || TextUtils.isEmpty((String) rVar.f3292c)) {
            String str = (String) rVar.f3291b;
            if (str != null) {
                zzc.zzb(str);
            } else {
                rVar.g("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza((String) rVar.f3292c);
        }
        zzfqyVar.zzb(zzc.zzc(), (c) rVar.f3296g);
    }
}
