package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import J2.j;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcbx implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzcaw zzcawVar = (zzcaw) obj;
        zzcfd zzq = zzcawVar.zzq();
        if (zzq == null) {
            try {
                zzcfd zzcfdVar = new zzcfd(zzcawVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcawVar.zzC(zzcfdVar);
                zzq = zzcfdVar;
            } catch (NullPointerException e7) {
                e = e7;
                int i7 = J.f3546b;
                j.e("Unable to parse videoMeta message.", e);
                o.f1952C.f1961g.zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e8) {
                e = e8;
                int i72 = J.f3546b;
                j.e("Unable to parse videoMeta message.", e);
                o.f1952C.f1961g.zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || parseInt > 3) {
            parseInt = 0;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (j.j(3)) {
            j.b("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + parseInt + " , aspectRatio : " + str);
        }
        zzq.zzr(parseFloat2, parseFloat, parseInt, equals, parseFloat3);
    }
}
