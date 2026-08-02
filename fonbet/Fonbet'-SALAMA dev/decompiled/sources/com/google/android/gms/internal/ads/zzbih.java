package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbih implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            J.k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfrr zzl = zzfrs.zzl();
        zzl.zzb((String) map.get("appId"));
        zzl.zzh(zzcebVar.getWidth());
        zzl.zzg(zzcebVar.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzl.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzl.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzl.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzl.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzl.zza((String) map.get("enifd"));
        }
        try {
            o.f1952C.f1971r.h(zzcebVar, zzl.zzi());
        } catch (NullPointerException e7) {
            o.f1952C.f1961g.zzw(e7, "DefaultGmsgHandlers.ShowLMDOverlay");
            J.k("Missing parameters for LMD Overlay show request");
        }
    }
}
