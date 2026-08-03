package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzbc {
    public final java.lang.String zza;
    public java.lang.String zzb;
    public com.google.android.gms.internal.ads.zzcbd zzc;
    public android.os.Bundle zzd = new android.os.Bundle();
    private long zze;
    private long zzf;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzbc(android.util.JsonReader jsonReader, com.google.android.gms.internal.ads.zzcbd zzcbdVar) throws java.io.IOException {
        android.os.Bundle bundle;
        char c;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzc = zzcbdVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        jsonReader.beginObject();
        java.lang.String str = "";
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
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
                    if (nextName.equals("end_time")) {
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
                hashMap = new java.util.HashMap();
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
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzd.putString((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue() || zzcbdVar == null || (bundle = zzcbdVar.zzm) == null) {
            return;
        }
        bundle.putLong(com.google.android.gms.internal.ads.zzdyu.GET_SIGNALS_SDKCORE_START.zza(), this.zze);
        zzcbdVar.zzm.putLong(com.google.android.gms.internal.ads.zzdyu.GET_SIGNALS_SDKCORE_END.zza(), this.zzf);
    }
}
