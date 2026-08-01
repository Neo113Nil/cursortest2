package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbpf implements zzbqh {
    zzbpf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        if (TextUtils.isEmpty((CharSequence) map.get(RemoteConfigConstants.RequestFieldKey.APP_ID))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzgss zzm = zzgst.zzm();
        zzm.zzb((String) map.get(RemoteConfigConstants.RequestFieldKey.APP_ID));
        zzm.zzh(zzclmVar.getWidth());
        zzm.zza(zzclmVar.zzE().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzm.zzc(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzm.zzc(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzm.zzd(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzm.zzd(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzm.zzi((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzt().zzc(zzclmVar, zzm.zzj());
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
