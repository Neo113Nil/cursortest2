package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import J2.j;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzcbx implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzcaw zzcawVar = (zzcaw) obj;
        zzcfd zzcfdVarZzq = zzcawVar.zzq();
        if (zzcfdVarZzq == null) {
            try {
                zzcfd zzcfdVar = new zzcfd(zzcawVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcawVar.zzC(zzcfdVar);
                zzcfdVarZzq = zzcfdVar;
            } catch (NullPointerException e7) {
                e = e7;
                int i7 = J.f3546b;
                j.e("Unable to parse videoMeta message.", e);
                o.f1952C.f1961g.zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e8) {
                e = e8;
                int i8 = J.f3546b;
                j.e("Unable to parse videoMeta message.", e);
                o.f1952C.f1961g.zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f7 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f8 = Float.parseFloat((String) map.get("currentTime"));
        int i9 = Integer.parseInt((String) map.get("playbackState"));
        if (i9 < 0 || i9 > 3) {
            i9 = 0;
        }
        String str = (String) map.get("aspectRatio");
        float f9 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (j.j(3)) {
            j.b("Video Meta GMSG: currentTime : " + f8 + " , duration : " + f7 + " , isMuted : " + zEquals + " , playbackState : " + i9 + " , aspectRatio : " + str);
        }
        zzcfdVarZzq.zzr(f8, f7, i9, zEquals, f9);
    }
}
