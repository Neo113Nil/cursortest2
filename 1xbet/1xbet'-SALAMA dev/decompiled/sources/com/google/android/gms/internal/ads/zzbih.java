package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzbih implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            J.k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfrr zzfrrVarZzl = zzfrs.zzl();
        zzfrrVarZzl.zzb((String) map.get("appId"));
        zzfrrVarZzl.zzh(zzcebVar.getWidth());
        zzfrrVarZzl.zzg(zzcebVar.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzfrrVarZzl.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzfrrVarZzl.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzfrrVarZzl.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzfrrVarZzl.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzfrrVarZzl.zza((String) map.get("enifd"));
        }
        try {
            o.f1952C.f1971r.h(zzcebVar, zzfrrVarZzl.zzi());
        } catch (NullPointerException e7) {
            o.f1952C.f1961g.zzw(e7, "DefaultGmsgHandlers.ShowLMDOverlay");
            J.k("Missing parameters for LMD Overlay show request");
        }
    }
}
