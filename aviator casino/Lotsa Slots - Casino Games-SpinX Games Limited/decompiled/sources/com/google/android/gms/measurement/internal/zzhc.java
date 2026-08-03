package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhc {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhg zza;
    private final java.lang.String zzb;
    private final android.os.Bundle zzc;
    private android.os.Bundle zzd;

    public zzhc(com.google.android.gms.measurement.internal.zzhg zzhgVar, java.lang.String str, android.os.Bundle bundle) {
        java.util.Objects.requireNonNull(zzhgVar);
        this.zza = zzhgVar;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = new android.os.Bundle();
    }

    public final void zzb(android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzhg zzhgVar;
        org.json.JSONObject jSONObject;
        com.google.android.gms.measurement.internal.zzib zzibVar;
        android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
        com.google.android.gms.measurement.internal.zzhg zzhgVar2 = this.zza;
        android.content.SharedPreferences.Editor edit = zzhgVar2.zzd().edit();
        if (bundle2.size() == 0) {
            edit.remove(this.zzb);
        } else {
            java.lang.String str = this.zzb;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.lang.String str2 : bundle2.keySet()) {
                java.lang.Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        jSONObject = new org.json.JSONObject();
                        jSONObject.put(com.ironsource.B5.q, str2);
                        com.google.android.gms.internal.measurement.zzql.zza();
                        zzibVar = zzhgVar2.zzu;
                        zzhgVar = zzhgVar2;
                    } catch (org.json.JSONException e) {
                        e = e;
                        zzhgVar = zzhgVar2;
                    }
                    if (zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaQ)) {
                        try {
                        } catch (org.json.JSONException e2) {
                            e = e2;
                            this.zza.zzu.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences", e);
                            zzhgVar2 = zzhgVar;
                        }
                        if (obj instanceof java.lang.String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                        } else if (obj instanceof java.lang.Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE);
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", java.util.Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", java.util.Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof java.lang.Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            zzibVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            zzhgVar2 = zzhgVar;
                        }
                        jSONArray.put(jSONObject);
                        zzhgVar2 = zzhgVar;
                    } else {
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof java.lang.String) {
                            jSONObject.put("t", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                        } else if (obj instanceof java.lang.Long) {
                            jSONObject.put("t", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE);
                        } else if (obj instanceof java.lang.Double) {
                            jSONObject.put("t", "d");
                        } else {
                            zzibVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            zzhgVar2 = zzhgVar;
                        }
                        jSONArray.put(jSONObject);
                        zzhgVar2 = zzhgVar;
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.zzd = bundle2;
    }

    public final android.os.Bundle zza() {
        char c;
        if (this.zzd == null) {
            com.google.android.gms.measurement.internal.zzhg zzhgVar = this.zza;
            java.lang.String string = zzhgVar.zzd().getString(this.zzb, null);
            if (string != null) {
                try {
                    android.os.Bundle bundle = new android.os.Bundle();
                    org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                            java.lang.String string2 = jSONObject.getString(com.ironsource.B5.q);
                            java.lang.String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c = 1;
                                }
                                c = 65535;
                            } else if (hashCode == 108) {
                                if (string3.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE)) {
                                    c = 2;
                                }
                                c = 65535;
                            } else if (hashCode == 115) {
                                if (string3.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS)) {
                                    c = 0;
                                }
                                c = 65535;
                            } else if (hashCode != 3352) {
                                if (hashCode == 3445 && string3.equals("la")) {
                                    c = 4;
                                }
                                c = 65535;
                            } else {
                                if (string3.equals("ia")) {
                                    c = 3;
                                }
                                c = 65535;
                            }
                            if (c == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c == 1) {
                                bundle.putDouble(string2, java.lang.Double.parseDouble(jSONObject.getString("v")));
                            } else if (c == 2) {
                                bundle.putLong(string2, java.lang.Long.parseLong(jSONObject.getString("v")));
                            } else if (c == 3) {
                                com.google.android.gms.internal.measurement.zzql.zza();
                                if (zzhgVar.zzu.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaQ)) {
                                    org.json.JSONArray jSONArray2 = new org.json.JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    int[] iArr = new int[length];
                                    for (int i2 = 0; i2 < length; i2++) {
                                        iArr[i2] = jSONArray2.optInt(i2);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else if (c != 4) {
                                zzhgVar.zzu.zzaV().zzb().zzb("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                com.google.android.gms.internal.measurement.zzql.zza();
                                if (zzhgVar.zzu.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaQ)) {
                                    org.json.JSONArray jSONArray3 = new org.json.JSONArray(jSONObject.getString("v"));
                                    int length2 = jSONArray3.length();
                                    long[] jArr = new long[length2];
                                    for (int i3 = 0; i3 < length2; i3++) {
                                        jArr[i3] = jSONArray3.optLong(i3);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            }
                        } catch (java.lang.NumberFormatException | org.json.JSONException unused) {
                            this.zza.zzu.zzaV().zzb().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (org.json.JSONException unused2) {
                    this.zza.zzu.zzaV().zzb().zza("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return new android.os.Bundle((android.os.Bundle) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd));
    }
}
