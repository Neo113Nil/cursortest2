package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t12 extends rt1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7250e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ v22 f7251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t12(v22 v22Var, f12 f12Var, int i) {
        super(f12Var);
        this.f7250e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(v22Var);
                this.f7251f = v22Var;
                super(f12Var);
                break;
            case 2:
                Objects.requireNonNull(v22Var);
                this.f7251f = v22Var;
                super(f12Var);
                break;
            case 3:
                this.f7251f = v22Var;
                super(f12Var);
                break;
            default:
                Objects.requireNonNull(v22Var);
                this.f7251f = v22Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:49:0x0147  */
    /* JADX WARN: Code duplicated, block: B:51:0x0158  */
    /* JADX WARN: Code duplicated, block: B:57:0x0174  */
    /* JADX WARN: Code duplicated, block: B:58:0x0177  */
    /* JADX WARN: Code duplicated, block: B:61:0x017b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0185  */
    /* JADX WARN: Code duplicated, block: B:66:0x0199  */
    /* JADX WARN: Code duplicated, block: B:67:0x019c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01af  */
    /* JADX WARN: Code duplicated, block: B:71:0x01de  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:82:0x028a A[Catch: IllegalArgumentException | MalformedURLException -> 0x0291, TryCatch #2 {IllegalArgumentException | MalformedURLException -> 0x0291, blocks: (B:80:0x0242, B:82:0x028a, B:85:0x0293, B:87:0x0299, B:89:0x02a1, B:90:0x02a7, B:91:0x02ab), top: B:112:0x0242 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0299 A[Catch: IllegalArgumentException | MalformedURLException -> 0x0291, TryCatch #2 {IllegalArgumentException | MalformedURLException -> 0x0291, blocks: (B:80:0x0242, B:82:0x028a, B:85:0x0293, B:87:0x0299, B:89:0x02a1, B:90:0x02a7, B:91:0x02ab), top: B:112:0x0242 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x02a1 A[Catch: IllegalArgumentException | MalformedURLException -> 0x0291, TryCatch #2 {IllegalArgumentException | MalformedURLException -> 0x0291, blocks: (B:80:0x0242, B:82:0x028a, B:85:0x0293, B:87:0x0299, B:89:0x02a1, B:90:0x02a7, B:91:0x02ab), top: B:112:0x0242 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02c5  */
    @Override // p000.rt1
    /* JADX INFO: renamed from: a */
    public final void mo23a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        v42 v42VarM1573p;
        f02 f02Var;
        nx1 nx1Var;
        gt1 gt1VarMo573o;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i;
        String str2;
        String string;
        f02 f02Var2;
        URL url;
        String strConcat;
        int i2 = this.f7250e;
        int i3 = 0;
        v22 v22Var = this.f7251f;
        switch (i2) {
            case 0:
                v22 v22Var2 = ((f02) v22Var.f7192j).f2254v;
                f02.m1559l(v22Var2);
                new Thread(new s12(v22Var2, i3)).start();
                break;
            case 1:
                v22Var.m5044Z();
                break;
            case 2:
                v22Var.m5025G();
                break;
            default:
                f02 f02Var3 = (f02) v22Var.f7192j;
                fz1 fz1Var = f02Var3.f2246n;
                ky1 ky1Var = f02Var3.f2247o;
                a02 a02Var = f02Var3.f2248p;
                f02.m1560m(a02Var);
                a02Var.mo11z();
                a32 a32Var = f02Var3.f2256x;
                f02.m1560m(a32Var);
                f02 f02Var4 = (f02) a32Var.f7192j;
                f02.m1560m(a32Var);
                String strM5219G = f02Var3.m1575r().m5219G();
                Boolean boolM772N = f02Var3.f2245m.m772N("google_analytics_adid_collection_enabled");
                if (boolM772N == null || boolM772N.booleanValue()) {
                    f02.m1558k(fz1Var);
                    f02 f02Var5 = (f02) fz1Var.f7192j;
                    fz1Var.mo11z();
                    if (fz1Var.m1911H().m3157i(k12.f4249k)) {
                        f02Var5.f2252t.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = fz1Var.f2554q;
                        if (str3 == null || jElapsedRealtime >= fz1Var.f2556s) {
                            fz1Var.f2556s = f02Var5.f2245m.m767I(strM5219G, jx1.f4167b) + jElapsedRealtime;
                            try {
                                C0272h3 c0272h3M2522a = C0309i3.m2522a(f02Var5.f2242j);
                                fz1Var.f2554q = "";
                                String str4 = (String) c0272h3M2522a.f3021b;
                                if (str4 != null) {
                                    fz1Var.f2554q = str4;
                                }
                                fz1Var.f2555r = c0272h3M2522a.f3022c;
                            } catch (Exception e) {
                                ky1 ky1Var2 = f02Var5.f2247o;
                                f02.m1560m(ky1Var2);
                                ky1Var2.f4607v.m5313b(e, "Unable to get advertising id");
                                fz1Var.f2554q = "";
                            }
                            pair = new Pair(fz1Var.f2554q, Boolean.valueOf(fz1Var.f2555r));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(fz1Var.f2555r));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        f02.m1560m(a32Var);
                        a32Var.m1081C();
                        ConnectivityManager connectivityManager = (ConnectivityManager) f02Var4.f2242j.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb = new StringBuilder();
                            v42 v42VarM1573p2 = f02Var3.m1573p();
                            v42VarM1573p2.mo11z();
                            v42VarM1573p2.m3446B();
                            if (!v42VarM1573p2.m5060H()) {
                                v22 v22Var3 = f02Var3.f2254v;
                                f02.m1559l(v22Var3);
                                f02 f02Var6 = (f02) v22Var3.f7192j;
                                v22Var3.mo11z();
                                v42VarM1573p = f02Var6.m1573p();
                                f02Var = (f02) v42VarM1573p.f7192j;
                                v42VarM1573p.mo11z();
                                v42VarM1573p.m3446B();
                                nx1Var = v42VarM1573p.f8065m;
                                if (nx1Var == null) {
                                    v42VarM1573p.m5059G();
                                    ky1 ky1Var3 = f02Var.f2247o;
                                    f02.m1560m(ky1Var3);
                                    ky1Var3.f4607v.m5312a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        gt1VarMo573o = nx1Var.mo573o(v42VarM1573p.m5069Q(false));
                                        v42VarM1573p.m5066N();
                                    } catch (RemoteException e2) {
                                        ky1 ky1Var4 = f02Var.f2247o;
                                        f02.m1560m(ky1Var4);
                                        ky1Var4.f4600o.m5313b(e2, "Failed to get consents; remote exception");
                                        gt1VarMo573o = null;
                                    }
                                    if (gt1VarMo573o != null) {
                                        bundle = gt1VarMo573o.f2871j;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = f02Var3.f2238K;
                                        f02Var3.f2238K = i + 1;
                                        i3 = i < 10 ? 1 : 0;
                                        f02.m1560m(ky1Var);
                                        wc1 wc1Var = ky1Var.f4607v;
                                        StringBuilder sb2 = new StringBuilder(69);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        wc1Var.m5313b(Integer.valueOf(f02Var3.f2238K), AbstractC0024an.m285h(sb2, str2, " retryCount"));
                                    } else {
                                        l12 l12VarM3149b = l12.m3149b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(l12VarM3149b.m3155f());
                                        zt1 zt1VarM6038c = zt1.m6038c(100, bundle);
                                        str = zt1VarM6038c.f9957d;
                                        sb.append("&dma=");
                                        Boolean bool2 = zt1VarM6038c.f9956c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = l12.m3151d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i4 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i4);
                                        f02.m1560m(ky1Var);
                                        ky1Var.f4608w.m5313b(sb, "Consent query parameters to Bow");
                                        f72 f72Var = f02Var3.f2250r;
                                        f02.m1558k(f72Var);
                                        ((f02) f02Var3.m1575r().f7192j).f2245m.m765G();
                                        String str5 = (String) pair.first;
                                        long jM821a = fz1Var.f2544D.m821a() - 1;
                                        string = sb.toString();
                                        f02Var2 = (f02) f72Var.f7192j;
                                        try {
                                            p80.m3860e(str5);
                                            p80.m3860e(strM5219G);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + f72Var.m1731m0()) + "&rdid=" + str5 + "&bundleid=" + strM5219G + "&retry=" + jM821a;
                                            if (strM5219G.equals(f02Var2.f2245m.m763E("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException | MalformedURLException e3) {
                                            ky1 ky1Var5 = f02Var2.f2247o;
                                            f02.m1560m(ky1Var5);
                                            ky1Var5.f4600o.m5313b(e3.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            f02.m1560m(a32Var);
                                            d02 d02Var = new d02(f02Var3);
                                            a32Var.m1081C();
                                            a02 a02Var2 = f02Var4.f2248p;
                                            f02.m1560m(a02Var2);
                                            a02Var2.m9M(new py1(a32Var, strM5219G, url, (byte[]) null, (HashMap) null, d02Var));
                                        }
                                    }
                                }
                                gt1VarMo573o = null;
                                if (gt1VarMo573o != null) {
                                    bundle = gt1VarMo573o.f2871j;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i = f02Var3.f2238K;
                                    f02Var3.f2238K = i + 1;
                                    if (i < 10) {
                                    }
                                    f02.m1560m(ky1Var);
                                    wc1 wc1Var2 = ky1Var.f4607v;
                                    StringBuilder sb3 = new StringBuilder(69);
                                    sb3.append("Failed to retrieve DMA consent from the service, ");
                                    if (i < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    wc1Var2.m5313b(Integer.valueOf(f02Var3.f2238K), AbstractC0024an.m285h(sb3, str2, " retryCount"));
                                } else {
                                    l12 l12VarM3149b2 = l12.m3149b(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(l12VarM3149b2.m3155f());
                                    zt1 zt1VarM6038c2 = zt1.m6038c(100, bundle);
                                    str = zt1VarM6038c2.f9957d;
                                    sb.append("&dma=");
                                    Boolean bool3 = zt1VarM6038c2.f9956c;
                                    bool = Boolean.FALSE;
                                    sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    iOrdinal = l12.m3151d(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i5 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i5);
                                    f02.m1560m(ky1Var);
                                    ky1Var.f4608w.m5313b(sb, "Consent query parameters to Bow");
                                    f72 f72Var2 = f02Var3.f2250r;
                                    f02.m1558k(f72Var2);
                                    ((f02) f02Var3.m1575r().f7192j).f2245m.m765G();
                                    String str6 = (String) pair.first;
                                    long jM821a2 = fz1Var.f2544D.m821a() - 1;
                                    string = sb.toString();
                                    f02Var2 = (f02) f72Var2.f7192j;
                                    p80.m3860e(str6);
                                    p80.m3860e(strM5219G);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + f72Var2.m1731m0()) + "&rdid=" + str6 + "&bundleid=" + strM5219G + "&retry=" + jM821a2;
                                    if (strM5219G.equals(f02Var2.f2245m.m763E("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        f02.m1560m(a32Var);
                                        d02 d02Var2 = new d02(f02Var3);
                                        a32Var.m1081C();
                                        a02 a02Var3 = f02Var4.f2248p;
                                        f02.m1560m(a02Var3);
                                        a02Var3.m9M(new py1(a32Var, strM5219G, url, (byte[]) null, (HashMap) null, d02Var2));
                                    }
                                }
                                break;
                            } else {
                                f72 f72Var3 = ((f02) v42VarM1573p2.f7192j).f2250r;
                                f02.m1558k(f72Var3);
                                if (f72Var3.m1731m0() >= 234200) {
                                    v22 v22Var4 = f02Var3.f2254v;
                                    f02.m1559l(v22Var4);
                                    f02 f02Var7 = (f02) v22Var4.f7192j;
                                    v22Var4.mo11z();
                                    v42VarM1573p = f02Var7.m1573p();
                                    f02Var = (f02) v42VarM1573p.f7192j;
                                    v42VarM1573p.mo11z();
                                    v42VarM1573p.m3446B();
                                    nx1Var = v42VarM1573p.f8065m;
                                    if (nx1Var == null) {
                                        v42VarM1573p.m5059G();
                                        ky1 ky1Var6 = f02Var.f2247o;
                                        f02.m1560m(ky1Var6);
                                        ky1Var6.f4607v.m5312a("Failed to get consents; not connected to service yet.");
                                    } else {
                                        gt1VarMo573o = nx1Var.mo573o(v42VarM1573p.m5069Q(false));
                                        v42VarM1573p.m5066N();
                                        if (gt1VarMo573o != null) {
                                            bundle = gt1VarMo573o.f2871j;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i = f02Var3.f2238K;
                                            f02Var3.f2238K = i + 1;
                                            if (i < 10) {
                                            }
                                            f02.m1560m(ky1Var);
                                            wc1 wc1Var3 = ky1Var.f4607v;
                                            StringBuilder sb4 = new StringBuilder(69);
                                            sb4.append("Failed to retrieve DMA consent from the service, ");
                                            if (i < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            wc1Var3.m5313b(Integer.valueOf(f02Var3.f2238K), AbstractC0024an.m285h(sb4, str2, " retryCount"));
                                        } else {
                                            l12 l12VarM3149b3 = l12.m3149b(100, bundle);
                                            sb.append("&gcs=");
                                            sb.append(l12VarM3149b3.m3155f());
                                            zt1 zt1VarM6038c3 = zt1.m6038c(100, bundle);
                                            str = zt1VarM6038c3.f9957d;
                                            sb.append("&dma=");
                                            Boolean bool4 = zt1VarM6038c3.f9956c;
                                            bool = Boolean.FALSE;
                                            sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb.append("&dma_cps=");
                                                sb.append(str);
                                            }
                                            iOrdinal = l12.m3151d(bundle.getString("ad_personalization")).ordinal();
                                            if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    bool = null;
                                                } else {
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                            int i6 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                            sb.append("&npa=");
                                            sb.append(i6);
                                            f02.m1560m(ky1Var);
                                            ky1Var.f4608w.m5313b(sb, "Consent query parameters to Bow");
                                            f72 f72Var4 = f02Var3.f2250r;
                                            f02.m1558k(f72Var4);
                                            ((f02) f02Var3.m1575r().f7192j).f2245m.m765G();
                                            String str7 = (String) pair.first;
                                            long jM821a3 = fz1Var.f2544D.m821a() - 1;
                                            string = sb.toString();
                                            f02Var2 = (f02) f72Var4.f7192j;
                                            p80.m3860e(str7);
                                            p80.m3860e(strM5219G);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + f72Var4.m1731m0()) + "&rdid=" + str7 + "&bundleid=" + strM5219G + "&retry=" + jM821a3;
                                            if (strM5219G.equals(f02Var2.f2245m.m763E("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                f02.m1560m(a32Var);
                                                d02 d02Var3 = new d02(f02Var3);
                                                a32Var.m1081C();
                                                a02 a02Var4 = f02Var4.f2248p;
                                                f02.m1560m(a02Var4);
                                                a02Var4.m9M(new py1(a32Var, strM5219G, url, (byte[]) null, (HashMap) null, d02Var3));
                                            }
                                        }
                                    }
                                    gt1VarMo573o = null;
                                    if (gt1VarMo573o != null) {
                                        bundle = gt1VarMo573o.f2871j;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = f02Var3.f2238K;
                                        f02Var3.f2238K = i + 1;
                                        if (i < 10) {
                                        }
                                        f02.m1560m(ky1Var);
                                        wc1 wc1Var4 = ky1Var.f4607v;
                                        StringBuilder sb5 = new StringBuilder(69);
                                        sb5.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        wc1Var4.m5313b(Integer.valueOf(f02Var3.f2238K), AbstractC0024an.m285h(sb5, str2, " retryCount"));
                                    } else {
                                        l12 l12VarM3149b4 = l12.m3149b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(l12VarM3149b4.m3155f());
                                        zt1 zt1VarM6038c4 = zt1.m6038c(100, bundle);
                                        str = zt1VarM6038c4.f9957d;
                                        sb.append("&dma=");
                                        Boolean bool5 = zt1VarM6038c4.f9956c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = l12.m3151d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i7 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i7);
                                        f02.m1560m(ky1Var);
                                        ky1Var.f4608w.m5313b(sb, "Consent query parameters to Bow");
                                        f72 f72Var5 = f02Var3.f2250r;
                                        f02.m1558k(f72Var5);
                                        ((f02) f02Var3.m1575r().f7192j).f2245m.m765G();
                                        String str8 = (String) pair.first;
                                        long jM821a4 = fz1Var.f2544D.m821a() - 1;
                                        string = sb.toString();
                                        f02Var2 = (f02) f72Var5.f7192j;
                                        p80.m3860e(str8);
                                        p80.m3860e(strM5219G);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + f72Var5.m1731m0()) + "&rdid=" + str8 + "&bundleid=" + strM5219G + "&retry=" + jM821a4;
                                        if (strM5219G.equals(f02Var2.f2245m.m763E("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat("&");
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            f02.m1560m(a32Var);
                                            d02 d02Var4 = new d02(f02Var3);
                                            a32Var.m1081C();
                                            a02 a02Var5 = f02Var4.f2248p;
                                            f02.m1560m(a02Var5);
                                            a02Var5.m9M(new py1(a32Var, strM5219G, url, (byte[]) null, (HashMap) null, d02Var4));
                                        }
                                    }
                                } else {
                                    f72 f72Var6 = f02Var3.f2250r;
                                    f02.m1558k(f72Var6);
                                    ((f02) f02Var3.m1575r().f7192j).f2245m.m765G();
                                    String str9 = (String) pair.first;
                                    long jM821a5 = fz1Var.f2544D.m821a() - 1;
                                    string = sb.toString();
                                    f02Var2 = (f02) f72Var6.f7192j;
                                    p80.m3860e(str9);
                                    p80.m3860e(strM5219G);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + f72Var6.m1731m0()) + "&rdid=" + str9 + "&bundleid=" + strM5219G + "&retry=" + jM821a5;
                                    if (strM5219G.equals(f02Var2.f2245m.m763E("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        f02.m1560m(a32Var);
                                        d02 d02Var5 = new d02(f02Var3);
                                        a32Var.m1081C();
                                        a02 a02Var6 = f02Var4.f2248p;
                                        f02.m1560m(a02Var6);
                                        a02Var6.m9M(new py1(a32Var, strM5219G, url, (byte[]) null, (HashMap) null, d02Var5));
                                    }
                                }
                            }
                        } else {
                            f02.m1560m(ky1Var);
                            ky1Var.f4603r.m5312a("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        f02.m1560m(ky1Var);
                        ky1Var.f4608w.m5312a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    f02.m1560m(ky1Var);
                    ky1Var.f4608w.m5312a("ADID collection is disabled from Manifest. Skipping");
                }
                if (i3 != 0) {
                    v22Var.f8006B.m4403b(2000L);
                }
                break;
        }
    }
}
