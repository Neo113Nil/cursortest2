package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Bl extends E5 {

    /* renamed from: k, reason: collision with root package name */
    public final C0601Gf f7873k;

    /* renamed from: l, reason: collision with root package name */
    public final C1529ro f7874l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f7875m;

    public Bl(C0601Gf c0601Gf, C1529ro c1529ro) {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        this.f7875m = new HashMap();
        this.f7873k = c0601Gf;
        this.f7874l = c1529ro;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Q2.X0 u3(HashMap hashMap) {
        int i;
        Bundle bundle;
        Bundle bundle2;
        char c5;
        Bundle bundle3 = new Bundle();
        ArrayList arrayList = new ArrayList();
        Bundle bundle4 = new Bundle();
        Bundle bundle5 = new Bundle();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String str = (String) hashMap.get("ad_request");
        boolean z3 = false;
        int i5 = -1;
        String str2 = null;
        int i6 = 60000;
        if (str == null) {
            return new Q2.X0(8, -1L, bundle3, -1, arrayList, false, -1, false, null, null, null, null, bundle4, bundle5, arrayList2, null, null, false, null, -1, null, arrayList3, 60000, null, 0, 0L);
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            i = -1;
            while (jsonReader.hasNext()) {
                try {
                    String nextName = jsonReader.nextName();
                    switch (nextName.hashCode()) {
                        case -1289032093:
                            if (nextName.equals("extras")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -839117230:
                            if (nextName.equals("isTestDevice")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -733436947:
                            if (nextName.equals("tagForUnderAgeOfConsent")) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -99890337:
                            if (nextName.equals("httpTimeoutMillis")) {
                                c5 = 6;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 523149226:
                            if (nextName.equals("keywords")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 597632527:
                            if (nextName.equals("maxAdContentRating")) {
                                c5 = 5;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1411582723:
                            if (nextName.equals("tagForChildDirectedTreatment")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    switch (c5) {
                        case 0:
                            jsonReader.beginObject();
                            Bundle bundle6 = new Bundle();
                            while (jsonReader.hasNext()) {
                                bundle6.putString(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            bundle3 = bundle6;
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
                            z3 = jsonReader.nextBoolean();
                            break;
                        case 3:
                            if (!jsonReader.nextBoolean()) {
                                i5 = 0;
                                break;
                            } else {
                                i5 = 1;
                                break;
                            }
                        case 4:
                            if (!jsonReader.nextBoolean()) {
                                i = 0;
                                break;
                            } else {
                                i = 1;
                                break;
                            }
                        case 5:
                            String nextString = jsonReader.nextString();
                            if (!J2.p.f2724b.contains(nextString)) {
                                break;
                            } else {
                                str2 = nextString;
                                break;
                            }
                        case 6:
                            i6 = jsonReader.nextInt();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } catch (IOException unused) {
                    U2.j.d("Ad Request json was malformed, parsing ended early.");
                    int i7 = i;
                    ArrayList arrayList5 = arrayList;
                    String str3 = str2;
                    int i8 = i6;
                    bundle = bundle4.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
                    if (bundle != null) {
                    }
                    return new Q2.X0(8, -1L, bundle2, -1, arrayList5, z3, i5, false, null, null, null, null, bundle4, bundle5, arrayList2, null, null, false, null, i7, str3, arrayList3, i8, null, 0, 0L);
                }
            }
            jsonReader.endObject();
        } catch (IOException unused2) {
            i = -1;
        }
        int i72 = i;
        ArrayList arrayList52 = arrayList;
        String str32 = str2;
        int i82 = i6;
        bundle = bundle4.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle4.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
            bundle2 = bundle3;
        } else {
            bundle2 = bundle;
        }
        return new Q2.X0(8, -1L, bundle2, -1, arrayList52, z3, i5, false, null, null, null, null, bundle4, bundle5, arrayList2, null, null, false, null, i72, str32, arrayList3, i82, null, 0, 0L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00c2, code lost:
    
        if (r6.equals("create_interstitial_ad") != false) goto L56;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.E5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        boolean z3;
        boolean z5;
        HashMap hashMap = this.f7875m;
        char c5 = 0;
        if (i == 1) {
            String readString = parcel.readString();
            F5.b(parcel);
            A7 a7 = F7.z9;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                T2.G.m("Received H5 gmsg: ".concat(String.valueOf(readString)));
                Uri parse = Uri.parse(readString);
                T2.L l5 = P2.o.f4767B.f4771c;
                HashMap l6 = T2.L.l(parse);
                String str = (String) l6.get("action");
                if (!TextUtils.isEmpty(str)) {
                    int hashCode = str.hashCode();
                    if (hashCode != 579053441) {
                        if (hashCode == 871091088 && str.equals("initialize")) {
                            z3 = false;
                        }
                        z3 = -1;
                    } else {
                        if (str.equals("dispose_all")) {
                            z3 = true;
                        }
                        z3 = -1;
                    }
                    C1529ro c1529ro = this.f7874l;
                    if (!z3) {
                        z5 = true;
                        hashMap.clear();
                        c1529ro.getClass();
                        c1529ro.r(new C1324n6("initialize"));
                    } else if (!z3) {
                        String str2 = (String) l6.get("obj_id");
                        try {
                            Objects.requireNonNull(str2);
                            long parseLong = Long.parseLong(str2);
                            switch (str.hashCode()) {
                                case -1790951212:
                                    if (str.equals("show_interstitial_ad")) {
                                        c5 = 2;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case -1266374734:
                                    if (str.equals("show_rewarded_ad")) {
                                        c5 = 5;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case -257098725:
                                    if (str.equals("load_rewarded_ad")) {
                                        c5 = 4;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case 393881811:
                                    break;
                                case 585513149:
                                    if (str.equals("load_interstitial_ad")) {
                                        c5 = 1;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case 1671767583:
                                    if (str.equals("dispose")) {
                                        c5 = 6;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case 2109237041:
                                    if (str.equals("create_rewarded_ad")) {
                                        c5 = 3;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                default:
                                    c5 = 65535;
                                    break;
                            }
                            D7 d7 = rVar.f5056c;
                            z5 = true;
                            C0601Gf c0601Gf = this.f7873k;
                            switch (c5) {
                                case 0:
                                    if (hashMap.size() < ((Integer) d7.a(F7.A9)).intValue()) {
                                        Long valueOf = Long.valueOf(parseLong);
                                        if (!hashMap.containsKey(valueOf)) {
                                            String str3 = (String) l6.get("ad_unit");
                                            if (!TextUtils.isEmpty(str3)) {
                                                C0601Gf c0601Gf2 = c0601Gf.f9199d;
                                                Long valueOf2 = Long.valueOf(parseLong);
                                                str3.getClass();
                                                m2.g gVar = new m2.g(c0601Gf.f9198c, c0601Gf2, valueOf2, str3);
                                                long longValue = ((Long) gVar.f17994l).longValue();
                                                C0601Gf c0601Gf3 = (C0601Gf) gVar.f17997o;
                                                hashMap.put(valueOf, new Dl(longValue, c0601Gf3.f9196a, new C1529ro(21, c0601Gf3.f9197b), (C0554Af) gVar.f17996n, (String) gVar.f17995m));
                                                c1529ro.getClass();
                                                C1324n6 c1324n6 = new C1324n6("creation");
                                                c1324n6.f14578k = Long.valueOf(parseLong);
                                                c1324n6.f14580m = "nativeObjectCreated";
                                                c1529ro.r(c1324n6);
                                                T2.G.m("Created H5 interstitial #" + parseLong + " with ad unit " + str3);
                                                break;
                                            } else {
                                                U2.j.i("Could not create H5 ad, missing ad unit id");
                                                c1529ro.q(parseLong);
                                                break;
                                            }
                                        } else {
                                            U2.j.d("Could not create H5 ad, object ID already exists");
                                            c1529ro.q(parseLong);
                                            break;
                                        }
                                    } else {
                                        U2.j.i("Could not create H5 ad, too many existing objects");
                                        c1529ro.q(parseLong);
                                        break;
                                    }
                                case 1:
                                    InterfaceC1886zl interfaceC1886zl = (InterfaceC1886zl) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC1886zl != null) {
                                        interfaceC1886zl.b(u3(l6));
                                        break;
                                    } else {
                                        U2.j.d("Could not load H5 ad, object ID does not exist");
                                        c1529ro.getClass();
                                        C1324n6 c1324n62 = new C1324n6("interstitial");
                                        c1324n62.f14578k = Long.valueOf(parseLong);
                                        c1324n62.f14580m = "onNativeAdObjectNotAvailable";
                                        c1529ro.r(c1324n62);
                                        break;
                                    }
                                case 2:
                                    InterfaceC1886zl interfaceC1886zl2 = (InterfaceC1886zl) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC1886zl2 != null) {
                                        interfaceC1886zl2.i();
                                        break;
                                    } else {
                                        U2.j.d("Could not show H5 ad, object ID does not exist");
                                        c1529ro.getClass();
                                        C1324n6 c1324n63 = new C1324n6("interstitial");
                                        c1324n63.f14578k = Long.valueOf(parseLong);
                                        c1324n63.f14580m = "onNativeAdObjectNotAvailable";
                                        c1529ro.r(c1324n63);
                                        break;
                                    }
                                case 3:
                                    if (hashMap.size() < ((Integer) d7.a(F7.A9)).intValue()) {
                                        Long valueOf3 = Long.valueOf(parseLong);
                                        if (!hashMap.containsKey(valueOf3)) {
                                            String str4 = (String) l6.get("ad_unit");
                                            if (!TextUtils.isEmpty(str4)) {
                                                C0601Gf c0601Gf4 = c0601Gf.f9199d;
                                                Long valueOf4 = Long.valueOf(parseLong);
                                                str4.getClass();
                                                m2.g gVar2 = new m2.g(c0601Gf.f9198c, c0601Gf4, valueOf4, str4);
                                                long longValue2 = ((Long) gVar2.f17994l).longValue();
                                                C0601Gf c0601Gf5 = (C0601Gf) gVar2.f17997o;
                                                hashMap.put(valueOf3, new Gl(longValue2, c0601Gf5.f9196a, new C1529ro(21, c0601Gf5.f9197b), (C0554Af) gVar2.f17996n, (String) gVar2.f17995m));
                                                c1529ro.getClass();
                                                C1324n6 c1324n64 = new C1324n6("creation");
                                                c1324n64.f14578k = Long.valueOf(parseLong);
                                                c1324n64.f14580m = "nativeObjectCreated";
                                                c1529ro.r(c1324n64);
                                                T2.G.m("Created H5 rewarded #" + parseLong + " with ad unit " + str4);
                                                break;
                                            } else {
                                                U2.j.i("Could not create H5 ad, missing ad unit id");
                                                c1529ro.q(parseLong);
                                                break;
                                            }
                                        } else {
                                            U2.j.d("Could not create H5 ad, object ID already exists");
                                            c1529ro.q(parseLong);
                                            break;
                                        }
                                    } else {
                                        U2.j.i("Could not create H5 ad, too many existing objects");
                                        c1529ro.q(parseLong);
                                        break;
                                    }
                                case 4:
                                    InterfaceC1886zl interfaceC1886zl3 = (InterfaceC1886zl) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC1886zl3 != null) {
                                        interfaceC1886zl3.b(u3(l6));
                                        break;
                                    } else {
                                        U2.j.d("Could not load H5 ad, object ID does not exist");
                                        c1529ro.getClass();
                                        C1324n6 c1324n65 = new C1324n6("rewarded");
                                        c1324n65.f14578k = Long.valueOf(parseLong);
                                        c1324n65.f14580m = "onNativeAdObjectNotAvailable";
                                        c1529ro.r(c1324n65);
                                        break;
                                    }
                                case 5:
                                    InterfaceC1886zl interfaceC1886zl4 = (InterfaceC1886zl) hashMap.get(Long.valueOf(parseLong));
                                    if (interfaceC1886zl4 != null) {
                                        interfaceC1886zl4.i();
                                        break;
                                    } else {
                                        U2.j.d("Could not show H5 ad, object ID does not exist");
                                        c1529ro.getClass();
                                        C1324n6 c1324n66 = new C1324n6("rewarded");
                                        c1324n66.f14578k = Long.valueOf(parseLong);
                                        c1324n66.f14580m = "onNativeAdObjectNotAvailable";
                                        c1529ro.r(c1324n66);
                                        break;
                                    }
                                case 6:
                                    Long valueOf5 = Long.valueOf(parseLong);
                                    InterfaceC1886zl interfaceC1886zl5 = (InterfaceC1886zl) hashMap.get(valueOf5);
                                    if (interfaceC1886zl5 != null) {
                                        interfaceC1886zl5.a();
                                        hashMap.remove(valueOf5);
                                        T2.G.m("Disposed H5 ad #" + parseLong);
                                        break;
                                    } else {
                                        U2.j.d("Could not dispose H5 ad, object ID does not exist");
                                        break;
                                    }
                                default:
                                    U2.j.d("H5 gmsg contained invalid action: ".concat(str));
                                    break;
                            }
                        } catch (NullPointerException | NumberFormatException unused) {
                            z5 = true;
                            U2.j.d("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str2)));
                        }
                    } else {
                        z5 = true;
                        Iterator it = hashMap.values().iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1886zl) it.next()).a();
                        }
                        hashMap.clear();
                    }
                    parcel2.writeNoException();
                    return z5;
                }
                U2.j.d("H5 gmsg did not contain an action");
            }
        } else {
            if (i != 2) {
                return false;
            }
            hashMap.clear();
        }
        z5 = true;
        parcel2.writeNoException();
        return z5;
    }
}
