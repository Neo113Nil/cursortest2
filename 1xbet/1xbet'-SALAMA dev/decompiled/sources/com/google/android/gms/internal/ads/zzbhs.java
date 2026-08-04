package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.os.SystemClock;
import android.text.TextUtils;
import io.sentry.SentryBaseEvent;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzbhs implements zzbiz {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        String str = (String) map.get("action");
        if (!"tick".equals(str)) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get("value");
                if (!TextUtils.isEmpty(str2)) {
                    zzcebVar.zzl().zza().zzd("e", str2);
                    return;
                } else {
                    int i7 = J.f3546b;
                    j.g("No value given for CSI experiment.");
                    return;
                }
            }
            if (SentryBaseEvent.JsonKeys.EXTRA.equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get("value");
                if (TextUtils.isEmpty(str4)) {
                    int i8 = J.f3546b;
                    j.g("No value given for CSI extra.");
                    return;
                } else if (!TextUtils.isEmpty(str3)) {
                    zzcebVar.zzl().zza().zzd(str3, str4);
                    return;
                } else {
                    int i9 = J.f3546b;
                    j.g("No name given for CSI extra.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str5)) {
            int i10 = J.f3546b;
            j.g("No label given for CSI tick.");
            return;
        }
        zzbbp zzbbpVar = zzbby.zzcl;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && !zza.matcher(str5).matches()) {
            int i11 = J.f3546b;
            j.b("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            int i12 = J.f3546b;
            j.g("No timestamp given for CSI tick.");
            return;
        }
        try {
            long j = Long.parseLong(str7);
            o oVar = o.f1952C;
            oVar.j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            oVar.j.getClass();
            long jElapsedRealtime = (j - jCurrentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() || zza.matcher(str6).matches()) {
                zzcebVar.zzl().zzc(str5, str6, jElapsedRealtime);
            } else {
                int i13 = J.f3546b;
                j.b("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            }
        } catch (NumberFormatException e7) {
            int i14 = J.f3546b;
            j.h("Malformed timestamp for CSI tick.", e7);
        }
    }
}
