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
import y2.u;

/* loaded from: classes.dex */
public final class zzdry extends zzbka {
    private final zzdsb zza;
    private final zzdrw zzb;
    private final Map zzc = new HashMap();

    public zzdry(zzdsb zzdsbVar, zzdrw zzdrwVar) {
        this.zza = zzdsbVar;
        this.zzb = zzdrwVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.google.android.gms.ads.internal.client.zzm zzc(Map map) {
        int i7;
        Bundle bundle;
        char c3;
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = new ArrayList();
        Bundle bundle3 = new Bundle();
        Bundle bundle4 = new Bundle();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String str = (String) map.get("ad_request");
        boolean z4 = false;
        int i8 = -1;
        String str2 = null;
        int i9 = 60000;
        if (str == null) {
            return new com.google.android.gms.ads.internal.client.zzm(8, -1L, bundle2, -1, arrayList, false, -1, false, null, null, null, null, bundle3, bundle4, arrayList2, null, null, false, null, -1, null, arrayList3, 60000, null, 0, 0L);
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            i7 = -1;
            while (jsonReader.hasNext()) {
                try {
                    String nextName = jsonReader.nextName();
                    switch (nextName.hashCode()) {
                        case -1289032093:
                            if (nextName.equals("extras")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -839117230:
                            if (nextName.equals("isTestDevice")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -733436947:
                            if (nextName.equals("tagForUnderAgeOfConsent")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -99890337:
                            if (nextName.equals("httpTimeoutMillis")) {
                                c3 = 6;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 523149226:
                            if (nextName.equals("keywords")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 597632527:
                            if (nextName.equals("maxAdContentRating")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1411582723:
                            if (nextName.equals("tagForChildDirectedTreatment")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            jsonReader.beginObject();
                            Bundle bundle5 = new Bundle();
                            while (jsonReader.hasNext()) {
                                bundle5.putString(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            bundle2 = bundle5;
                            break;
                        case 1:
                            jsonReader.beginArray();
                            ArrayList arrayList4 = new ArrayList();
                            while (jsonReader.hasNext()) {
                                arrayList4.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                            arrayList = arrayList4;
                            break;
                        case 2:
                            z4 = jsonReader.nextBoolean();
                            break;
                        case 3:
                            if (!jsonReader.nextBoolean()) {
                                i8 = 0;
                                break;
                            } else {
                                i8 = 1;
                                break;
                            }
                        case 4:
                            if (!jsonReader.nextBoolean()) {
                                i7 = 0;
                                break;
                            } else {
                                i7 = 1;
                                break;
                            }
                        case 5:
                            String nextString = jsonReader.nextString();
                            if (!u.f18177f.contains(nextString)) {
                                break;
                            } else {
                                str2 = nextString;
                                break;
                            }
                        case 6:
                            i9 = jsonReader.nextInt();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } catch (IOException unused) {
                    int i10 = J.f3546b;
                    j.b("Ad Request json was malformed, parsing ended early.");
                    com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm(8, -1L, bundle2, -1, arrayList, z4, i8, false, null, null, null, null, bundle3, bundle4, arrayList2, null, null, false, null, i7, str2, arrayList3, i9, null, 0, 0L);
                    Bundle bundle6 = zzmVar.f10742D;
                    bundle = bundle6.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
                    if (bundle == null) {
                    }
                    return new com.google.android.gms.ads.internal.client.zzm(8, -1L, bundle, zzmVar.f10759d, zzmVar.f10760e, zzmVar.f10761f, zzmVar.f10762x, zzmVar.f10763y, zzmVar.f10764z, zzmVar.f10739A, zzmVar.f10740B, zzmVar.f10741C, zzmVar.f10742D, zzmVar.f10743E, zzmVar.f10744F, zzmVar.f10745G, zzmVar.f10746H, zzmVar.f10747I, zzmVar.f10748J, zzmVar.f10749K, zzmVar.f10750L, zzmVar.f10751M, zzmVar.f10752N, zzmVar.f10753O, zzmVar.f10754P, zzmVar.f10755Q);
                }
            }
            jsonReader.endObject();
        } catch (IOException unused2) {
            i7 = -1;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar2 = new com.google.android.gms.ads.internal.client.zzm(8, -1L, bundle2, -1, arrayList, z4, i8, false, null, null, null, null, bundle3, bundle4, arrayList2, null, null, false, null, i7, str2, arrayList3, i9, null, 0, 0L);
        Bundle bundle62 = zzmVar2.f10742D;
        bundle = bundle62.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle == null) {
            bundle = zzmVar2.f10758c;
            bundle62.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle);
        }
        return new com.google.android.gms.ads.internal.client.zzm(8, -1L, bundle, zzmVar2.f10759d, zzmVar2.f10760e, zzmVar2.f10761f, zzmVar2.f10762x, zzmVar2.f10763y, zzmVar2.f10764z, zzmVar2.f10739A, zzmVar2.f10740B, zzmVar2.f10741C, zzmVar2.f10742D, zzmVar2.f10743E, zzmVar2.f10744F, zzmVar2.f10745G, zzmVar2.f10746H, zzmVar2.f10747I, zzmVar2.f10748J, zzmVar2.f10749K, zzmVar2.f10750L, zzmVar2.f10751M, zzmVar2.f10752N, zzmVar2.f10753O, zzmVar2.f10754P, zzmVar2.f10755Q);
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zze() {
        this.zzc.clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zzf(String str) {
        boolean z4;
        zzbbp zzbbpVar = zzbby.zzjU;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            J.k("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri parse = Uri.parse(str);
            P p5 = o.f1952C.f1957c;
            HashMap l7 = P.l(parse);
            String str2 = (String) l7.get("action");
            if (TextUtils.isEmpty(str2)) {
                j.b("H5 gmsg did not contain an action");
                return;
            }
            int hashCode = str2.hashCode();
            char c3 = 65535;
            if (hashCode != 579053441) {
                if (hashCode == 871091088 && str2.equals("initialize")) {
                    z4 = false;
                }
                z4 = -1;
            } else {
                if (str2.equals("dispose_all")) {
                    z4 = true;
                }
                z4 = -1;
            }
            if (!z4) {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            if (z4) {
                Iterator it = this.zzc.values().iterator();
                while (it.hasNext()) {
                    ((zzdrr) it.next()).zza();
                }
                this.zzc.clear();
                return;
            }
            String str3 = (String) l7.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long parseLong = Long.parseLong(str3);
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            c3 = 5;
                            break;
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            c3 = 4;
                            break;
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            c3 = 6;
                            break;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            c3 = 3;
                            break;
                        }
                        break;
                }
                zzbbw zzbbwVar = c0254t.f2726c;
                switch (c3) {
                    case 0:
                        if (this.zzc.size() < ((Integer) zzbbwVar.zzb(zzbby.zzjV)).intValue()) {
                            Map map = this.zzc;
                            Long valueOf = Long.valueOf(parseLong);
                            if (!map.containsKey(valueOf)) {
                                String str4 = (String) l7.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzdrs zzb = this.zza.zzb();
                                    zzb.zzb(parseLong);
                                    zzb.zza(str4);
                                    this.zzc.put(valueOf, zzb.zzc().zza());
                                    this.zzb.zzh(parseLong);
                                    J.k("Created H5 interstitial #" + parseLong + " with ad unit " + str4);
                                    break;
                                } else {
                                    j.g("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzi(parseLong);
                                    break;
                                }
                            } else {
                                j.b("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(parseLong);
                                break;
                            }
                        } else {
                            j.g("Could not create H5 ad, too many existing objects");
                            this.zzb.zzi(parseLong);
                            break;
                        }
                    case 1:
                        zzdrr zzdrrVar = (zzdrr) this.zzc.get(Long.valueOf(parseLong));
                        if (zzdrrVar != null) {
                            zzdrrVar.zzb(zzc(l7));
                            break;
                        } else {
                            j.b("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzf(parseLong);
                            break;
                        }
                    case 2:
                        zzdrr zzdrrVar2 = (zzdrr) this.zzc.get(Long.valueOf(parseLong));
                        if (zzdrrVar2 != null) {
                            zzdrrVar2.zzc();
                            break;
                        } else {
                            j.b("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzf(parseLong);
                            break;
                        }
                    case 3:
                        if (this.zzc.size() < ((Integer) zzbbwVar.zzb(zzbby.zzjV)).intValue()) {
                            Map map2 = this.zzc;
                            Long valueOf2 = Long.valueOf(parseLong);
                            if (!map2.containsKey(valueOf2)) {
                                String str5 = (String) l7.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    zzdrs zzb2 = this.zza.zzb();
                                    zzb2.zzb(parseLong);
                                    zzb2.zza(str5);
                                    this.zzc.put(valueOf2, zzb2.zzc().zzb());
                                    this.zzb.zzh(parseLong);
                                    J.k("Created H5 rewarded #" + parseLong + " with ad unit " + str5);
                                    break;
                                } else {
                                    j.g("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzi(parseLong);
                                    break;
                                }
                            } else {
                                j.b("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(parseLong);
                                break;
                            }
                        } else {
                            j.g("Could not create H5 ad, too many existing objects");
                            this.zzb.zzi(parseLong);
                            break;
                        }
                    case 4:
                        zzdrr zzdrrVar3 = (zzdrr) this.zzc.get(Long.valueOf(parseLong));
                        if (zzdrrVar3 != null) {
                            zzdrrVar3.zzb(zzc(l7));
                            break;
                        } else {
                            j.b("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzq(parseLong);
                            break;
                        }
                    case 5:
                        zzdrr zzdrrVar4 = (zzdrr) this.zzc.get(Long.valueOf(parseLong));
                        if (zzdrrVar4 != null) {
                            zzdrrVar4.zzc();
                            break;
                        } else {
                            j.b("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzq(parseLong);
                            break;
                        }
                    case 6:
                        Map map3 = this.zzc;
                        Long valueOf3 = Long.valueOf(parseLong);
                        zzdrr zzdrrVar5 = (zzdrr) map3.get(valueOf3);
                        if (zzdrrVar5 != null) {
                            zzdrrVar5.zza();
                            this.zzc.remove(valueOf3);
                            J.k("Disposed H5 ad #" + parseLong);
                            break;
                        } else {
                            j.b("Could not dispose H5 ad, object ID does not exist");
                            break;
                        }
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
