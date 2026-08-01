package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzdzs;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbc {
    public final String zza;
    public String zzb;
    public zzcbv zzc;
    public Bundle zzd = new Bundle();
    private long zze;
    private long zzf;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzbc(JsonReader jsonReader, zzcbv zzcbvVar) throws IOException {
        Bundle bundle;
        char c;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzc = zzcbvVar;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals("start_time")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -995427962:
                    if (nextName.equals("params")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1725551537:
                    if (nextName.equals(SDKConstants.PARAM_TOURNAMENTS_END_TIME)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (c == 2) {
                this.zze = jsonReader.nextLong();
            } else if (c != 3) {
                jsonReader.skipValue();
            } else {
                this.zzf = jsonReader.nextLong();
            }
        }
        this.zza = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzd.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue() || zzcbvVar == null || (bundle = zzcbvVar.zzm) == null) {
            return;
        }
        bundle.putLong(zzdzs.GET_SIGNALS_SDKCORE_START.zza(), this.zze);
        zzcbvVar.zzm.putLong(zzdzs.GET_SIGNALS_SDKCORE_END.zza(), this.zzf);
    }
}
