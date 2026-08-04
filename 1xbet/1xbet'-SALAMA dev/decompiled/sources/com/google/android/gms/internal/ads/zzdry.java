package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.j;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p167y2.u;

/* JADX INFO: loaded from: classes.dex */
public final class zzdry extends zzbka {
    private final zzdsb zza;
    private final zzdrw zzb;
    private final Map zzc = new HashMap();

    public zzdry(zzdsb zzdsbVar, zzdrw zzdrwVar) {
        this.zza = zzdsbVar;
        this.zzb = zzdrwVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    private static com.google.android.gms.ads.internal.client.zzm zzc(Map map) {
        int i7;
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String str = (String) map.get("ad_request");
        boolean zNextBoolean = false;
        int i8 = -1;
        String str2 = null;
        int iNextInt = 60000;
        if (str == null) {
            return new com.google.android.gms.ads.internal.client.zzm(8, -1L, bundle, -1, arrayList, false, -1, false, null, null, null, null, bundle2, bundle3, arrayList2, null, null, false, null, -1, null, arrayList3, 60000, null, 0, 0L);
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            i7 = -1;
            while (jsonReader.hasNext()) {
                try {
                    switch (jsonReader.nextName()) {
                        case "extras":
                            jsonReader.beginObject();
                            Bundle bundle4 = new Bundle();
                            while (jsonReader.hasNext()) {
                                bundle4.putString(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            bundle = bundle4;
                            break;
                        case "keywords":
                            jsonReader.beginArray();
                            ArrayList arrayList4 = new ArrayList();
                            while (jsonReader.hasNext()) {
                                arrayList4.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                            arrayList = arrayList4;
                            break;
                        case "isTestDevice":
                            zNextBoolean = jsonReader.nextBoolean();
                            break;
                        case "tagForChildDirectedTreatment":
                            if (!jsonReader.nextBoolean()) {
                                i8 = 0;
                                break;
                            } else {
                                i8 = 1;
                                break;
                            }
                            break;
                        case "tagForUnderAgeOfConsent":
                            if (!jsonReader.nextBoolean()) {
                                i7 = 0;
                                break;
                            } else {
                                i7 = 1;
                                break;
                            }
                            break;
                        case "maxAdContentRating":
                            String strNextString = jsonReader.nextString();
                            if (!u.f18183f.contains(strNextString)) {
                                break;
                            } else {
                                str2 = strNextString;
                                break;
                            }
                            break;
                        case "httpTimeoutMillis":
                            iNextInt = jsonReader.nextInt();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } catch (IOException unused) {
                    int i9 = J.f3546b;
                    j.b("Ad Request json was malformed, parsing ended early.");
                }
            }
            jsonReader.endObject();
        } catch (IOException unused2) {
            i7 = -1;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm(8, -1L, bundle, -1, arrayList, zNextBoolean, i8, false, null, null, null, null, bundle2, bundle3, arrayList2, null, null, false, null, i7, str2, arrayList3, iNextInt, null, 0, 0L);
        Bundle bundle5 = zzmVar.f10742D;
        Bundle bundle6 = bundle5.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle6 == null) {
            bundle6 = zzmVar.f10758c;
            bundle5.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle6);
        }
        return new com.google.android.gms.ads.internal.client.zzm(8, -1L, bundle6, zzmVar.f10759d, zzmVar.f10760e, zzmVar.f10761f, zzmVar.f10762x, zzmVar.f10763y, zzmVar.f10764z, zzmVar.f10739A, zzmVar.f10740B, zzmVar.f10741C, zzmVar.f10742D, zzmVar.f10743E, zzmVar.f10744F, zzmVar.f10745G, zzmVar.f10746H, zzmVar.f10747I, zzmVar.f10748J, zzmVar.f10749K, zzmVar.f10750L, zzmVar.f10751M, zzmVar.f10752N, zzmVar.f10753O, zzmVar.f10754P, zzmVar.f10755Q);
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zze() {
        this.zzc.clear();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zzf(String str) {
        byte b7;
        zzbbp zzbbpVar = zzbby.zzjU;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            J.k("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            P p5 = o.f1952C.f1957c;
            HashMap mapL = P.l(uri);
            String str2 = (String) mapL.get("action");
            if (TextUtils.isEmpty(str2)) {
                j.b("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            byte b8 = -1;
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals("initialize")) {
                    b7 = 0;
                } else {
                    b7 = -1;
                }
            } else if (str2.equals("dispose_all")) {
                b7 = 1;
            } else {
                b7 = -1;
            }
            if (b7 == 0) {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            if (b7 == 1) {
                Iterator it = this.zzc.values().iterator();
                while (it.hasNext()) {
                    ((zzdrr) it.next()).zza();
                }
                this.zzc.clear();
                return;
            }
            String str3 = (String) mapL.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long j = Long.parseLong(str3);
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            b8 = 2;
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            b8 = 5;
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            b8 = 4;
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            b8 = 0;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            b8 = 1;
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            b8 = 6;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            b8 = 3;
                        }
                        break;
                }
                zzbbw zzbbwVar = c0254t.f2726c;
                switch (b8) {
                    case 0:
                        if (this.zzc.size() < ((Integer) zzbbwVar.zzb(zzbby.zzjV)).intValue()) {
                            Map map = this.zzc;
                            Long lValueOf = Long.valueOf(j);
                            if (!map.containsKey(lValueOf)) {
                                String str4 = (String) mapL.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzdrs zzdrsVarZzb = this.zza.zzb();
                                    zzdrsVarZzb.zzb(j);
                                    zzdrsVarZzb.zza(str4);
                                    this.zzc.put(lValueOf, zzdrsVarZzb.zzc().zza());
                                    this.zzb.zzh(j);
                                    J.k("Created H5 interstitial #" + j + " with ad unit " + str4);
                                } else {
                                    j.g("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzi(j);
                                }
                            } else {
                                j.b("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(j);
                            }
                        } else {
                            j.g("Could not create H5 ad, too many existing objects");
                            this.zzb.zzi(j);
                        }
                        break;
                    case 1:
                        zzdrr zzdrrVar = (zzdrr) this.zzc.get(Long.valueOf(j));
                        if (zzdrrVar != null) {
                            zzdrrVar.zzb(zzc(mapL));
                        } else {
                            j.b("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzf(j);
                        }
                        break;
                    case 2:
                        zzdrr zzdrrVar2 = (zzdrr) this.zzc.get(Long.valueOf(j));
                        if (zzdrrVar2 != null) {
                            zzdrrVar2.zzc();
                        } else {
                            j.b("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzf(j);
                        }
                        break;
                    case 3:
                        if (this.zzc.size() < ((Integer) zzbbwVar.zzb(zzbby.zzjV)).intValue()) {
                            Map map2 = this.zzc;
                            Long lValueOf2 = Long.valueOf(j);
                            if (!map2.containsKey(lValueOf2)) {
                                String str5 = (String) mapL.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    zzdrs zzdrsVarZzb2 = this.zza.zzb();
                                    zzdrsVarZzb2.zzb(j);
                                    zzdrsVarZzb2.zza(str5);
                                    this.zzc.put(lValueOf2, zzdrsVarZzb2.zzc().zzb());
                                    this.zzb.zzh(j);
                                    J.k("Created H5 rewarded #" + j + " with ad unit " + str5);
                                } else {
                                    j.g("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzi(j);
                                }
                            } else {
                                j.b("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(j);
                            }
                        } else {
                            j.g("Could not create H5 ad, too many existing objects");
                            this.zzb.zzi(j);
                        }
                        break;
                    case 4:
                        zzdrr zzdrrVar3 = (zzdrr) this.zzc.get(Long.valueOf(j));
                        if (zzdrrVar3 != null) {
                            zzdrrVar3.zzb(zzc(mapL));
                        } else {
                            j.b("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzq(j);
                        }
                        break;
                    case 5:
                        zzdrr zzdrrVar4 = (zzdrr) this.zzc.get(Long.valueOf(j));
                        if (zzdrrVar4 != null) {
                            zzdrrVar4.zzc();
                        } else {
                            j.b("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzq(j);
                        }
                        break;
                    case 6:
                        Map map3 = this.zzc;
                        Long lValueOf3 = Long.valueOf(j);
                        zzdrr zzdrrVar5 = (zzdrr) map3.get(lValueOf3);
                        if (zzdrrVar5 != null) {
                            zzdrrVar5.zza();
                            this.zzc.remove(lValueOf3);
                            J.k("Disposed H5 ad #" + j);
                        } else {
                            j.b("Could not dispose H5 ad, object ID does not exist");
                        }
                        break;
                    default:
                        j.b("H5 gmsg contained invalid action: ".concat(str2));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                j.b("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }
}
