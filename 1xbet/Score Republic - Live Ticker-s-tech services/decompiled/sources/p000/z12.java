package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class z12 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9575j = 0;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f9576k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f9577l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean f9578m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f9579n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f9580o;

    public z12(v22 v22Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f9579n = atomicReference;
        this.f9576k = str;
        this.f9577l = str2;
        this.f9578m = z;
        Objects.requireNonNull(v22Var);
        this.f9580o = v22Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111 A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:68:0x0151 A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0168 A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x016f A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x018d A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0193 A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundleM1698C0;
        String str;
        String str2;
        wc1 wc1Var;
        Bundle bundleM1698C1;
        int i = this.f9575j;
        boolean z = this.f9578m;
        Object obj = this.f9577l;
        Object obj2 = this.f9576k;
        Object obj3 = this.f9579n;
        Object obj4 = this.f9580o;
        switch (i) {
            case 0:
                v42 v42VarM1573p = ((AppMeasurementDynamiteService) obj4).f1351b.m1573p();
                v42VarM1573p.mo11z();
                v42VarM1573p.m3446B();
                v42VarM1573p.m5067O(new n32(v42VarM1573p, (String) obj2, (String) obj, v42VarM1573p.m5069Q(false), this.f9578m, (gv1) obj3));
                break;
            case 1:
                v42 v42VarM1573p2 = ((f02) ((v22) obj4).f7192j).m1573p();
                v42VarM1573p2.mo11z();
                v42VarM1573p2.m3446B();
                v42VarM1573p2.m5067O(new n32(v42VarM1573p2, (AtomicReference) obj3, (String) obj2, (String) obj, v42VarM1573p2.m5069Q(false), this.f9578m));
                break;
            case 2:
                C0414kz c0414kz = (C0414kz) obj4;
                v22 v22Var = (v22) c0414kz.f4610k;
                v22Var.mo11z();
                f02 f02Var = (f02) v22Var.f7192j;
                iz1 iz1Var = v22Var.f8024z;
                String str3 = (String) obj;
                Uri uri = (Uri) obj3;
                try {
                    f72 f72Var = f02Var.f2250r;
                    ky1 ky1Var = f02Var.f2247o;
                    f02.m1558k(f72Var);
                    try {
                        String str4 = "utm_medium";
                        if (!TextUtils.isEmpty(str3)) {
                            if (!str3.contains("gclid")) {
                                try {
                                    if (!str3.contains("gbraid") && !str3.contains("utm_campaign") && !str3.contains("utm_source") && !str3.contains("utm_medium") && !str3.contains("utm_id") && !str3.contains("dclid") && !str3.contains("srsltid") && !str3.contains("sfmc_id")) {
                                        ky1 ky1Var2 = ((f02) f72Var.f7192j).f2247o;
                                        f02.m1560m(ky1Var2);
                                        ky1Var2.f4607v.m5312a("Activity created with data 'referrer' without required params");
                                    }
                                    str = (String) obj2;
                                    if (z) {
                                        str2 = "Activity created with data 'referrer' without required params";
                                        f72 f72Var2 = f02Var.f2250r;
                                        f02.m1558k(f72Var2);
                                        bundleM1698C1 = f72Var2.m1698C0(uri);
                                        if (bundleM1698C1 != null) {
                                            bundleM1698C1.putString("_cis", "intent");
                                            if (bundleM1698C1.containsKey("gclid") && bundleM1698C0 != null && bundleM1698C0.containsKey("gclid")) {
                                                bundleM1698C1.putString("_cer", "gclid=" + bundleM1698C0.getString("gclid"));
                                            }
                                            v22Var.m5026H(str, "_cmp", bundleM1698C1);
                                            iz1Var.m2751b(bundleM1698C1, str);
                                        }
                                        if (!TextUtils.isEmpty(str3)) {
                                            f02.m1560m(ky1Var);
                                            wc1Var = ky1Var.f4607v;
                                            wc1Var.m5313b(str3, "Activity created with referrer");
                                            if (!f02Var.f2245m.m770L(null, jx1.f4125G0)) {
                                                if (bundleM1698C0 != null) {
                                                    v22Var.m5026H(str, "_cmp", bundleM1698C0);
                                                    iz1Var.m2751b(bundleM1698C0, str);
                                                } else {
                                                    f02.m1560m(ky1Var);
                                                    wc1Var.m5313b(str3, "Referrer does not contain valid parameters");
                                                }
                                                f02Var.f2252t.getClass();
                                                v22Var.m5029K("auto", "_ldl", null, true, System.currentTimeMillis());
                                            } else if (str3.contains("gclid") || (!str3.contains("utm_campaign") && !str3.contains("utm_source") && !str3.contains(str4) && !str3.contains("utm_term") && !str3.contains("utm_content"))) {
                                                f02.m1560m(ky1Var);
                                                wc1Var.m5312a(str2);
                                            } else if (!TextUtils.isEmpty(str3)) {
                                                f02Var.f2252t.getClass();
                                                v22Var.m5029K("auto", "_ldl", str3, true, System.currentTimeMillis());
                                            }
                                        }
                                    } else {
                                        str2 = "Activity created with data 'referrer' without required params";
                                    }
                                    str4 = "utm_medium";
                                    if (!TextUtils.isEmpty(str3)) {
                                        f02.m1560m(ky1Var);
                                        wc1Var = ky1Var.f4607v;
                                        wc1Var.m5313b(str3, "Activity created with referrer");
                                        if (!f02Var.f2245m.m770L(null, jx1.f4125G0)) {
                                            if (str3.contains("gclid")) {
                                            }
                                            f02.m1560m(ky1Var);
                                            wc1Var.m5312a(str2);
                                        } else {
                                            if (bundleM1698C0 != null) {
                                                v22Var.m5026H(str, "_cmp", bundleM1698C0);
                                                iz1Var.m2751b(bundleM1698C0, str);
                                            } else {
                                                f02.m1560m(ky1Var);
                                                wc1Var.m5313b(str3, "Referrer does not contain valid parameters");
                                            }
                                            f02Var.f2252t.getClass();
                                            v22Var.m5029K("auto", "_ldl", null, true, System.currentTimeMillis());
                                        }
                                    }
                                } catch (RuntimeException e) {
                                    e = e;
                                    c0414kz = c0414kz;
                                    ky1 ky1Var3 = ((f02) ((v22) c0414kz.f4610k).f7192j).f2247o;
                                    f02.m1560m(ky1Var3);
                                    ky1Var3.f4600o.m5313b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                    return;
                                }
                                break;
                            }
                            bundleM1698C0 = f72Var.m1698C0(Uri.parse("https://google.com/search?".concat(str3)));
                            if (bundleM1698C0 != null) {
                                bundleM1698C0.putString("_cis", "referrer");
                            }
                            str = (String) obj2;
                            if (z) {
                                str2 = "Activity created with data 'referrer' without required params";
                                f72 f72Var3 = f02Var.f2250r;
                                f02.m1558k(f72Var3);
                                bundleM1698C1 = f72Var3.m1698C0(uri);
                                if (bundleM1698C1 != null) {
                                    bundleM1698C1.putString("_cis", "intent");
                                    if (bundleM1698C1.containsKey("gclid")) {
                                    }
                                    v22Var.m5026H(str, "_cmp", bundleM1698C1);
                                    iz1Var.m2751b(bundleM1698C1, str);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    f02.m1560m(ky1Var);
                                    wc1Var = ky1Var.f4607v;
                                    wc1Var.m5313b(str3, "Activity created with referrer");
                                    if (!f02Var.f2245m.m770L(null, jx1.f4125G0)) {
                                        if (str3.contains("gclid")) {
                                        }
                                        f02.m1560m(ky1Var);
                                        wc1Var.m5312a(str2);
                                    } else {
                                        if (bundleM1698C0 != null) {
                                            v22Var.m5026H(str, "_cmp", bundleM1698C0);
                                            iz1Var.m2751b(bundleM1698C0, str);
                                        } else {
                                            f02.m1560m(ky1Var);
                                            wc1Var.m5313b(str3, "Referrer does not contain valid parameters");
                                        }
                                        f02Var.f2252t.getClass();
                                        v22Var.m5029K("auto", "_ldl", null, true, System.currentTimeMillis());
                                    }
                                }
                            } else {
                                str2 = "Activity created with data 'referrer' without required params";
                            }
                            str4 = "utm_medium";
                            if (!TextUtils.isEmpty(str3)) {
                                f02.m1560m(ky1Var);
                                wc1Var = ky1Var.f4607v;
                                wc1Var.m5313b(str3, "Activity created with referrer");
                                if (!f02Var.f2245m.m770L(null, jx1.f4125G0)) {
                                    if (str3.contains("gclid")) {
                                    }
                                    f02.m1560m(ky1Var);
                                    wc1Var.m5312a(str2);
                                } else {
                                    if (bundleM1698C0 != null) {
                                        v22Var.m5026H(str, "_cmp", bundleM1698C0);
                                        iz1Var.m2751b(bundleM1698C0, str);
                                    } else {
                                        f02.m1560m(ky1Var);
                                        wc1Var.m5313b(str3, "Referrer does not contain valid parameters");
                                    }
                                    f02Var.f2252t.getClass();
                                    v22Var.m5029K("auto", "_ldl", null, true, System.currentTimeMillis());
                                }
                            }
                            break;
                        }
                        bundleM1698C0 = null;
                        str = (String) obj2;
                        if (z) {
                            str2 = "Activity created with data 'referrer' without required params";
                            f72 f72Var4 = f02Var.f2250r;
                            f02.m1558k(f72Var4);
                            bundleM1698C1 = f72Var4.m1698C0(uri);
                            if (bundleM1698C1 != null) {
                                bundleM1698C1.putString("_cis", "intent");
                                if (bundleM1698C1.containsKey("gclid")) {
                                }
                                v22Var.m5026H(str, "_cmp", bundleM1698C1);
                                iz1Var.m2751b(bundleM1698C1, str);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                f02.m1560m(ky1Var);
                                wc1Var = ky1Var.f4607v;
                                wc1Var.m5313b(str3, "Activity created with referrer");
                                if (!f02Var.f2245m.m770L(null, jx1.f4125G0)) {
                                    if (str3.contains("gclid")) {
                                    }
                                    f02.m1560m(ky1Var);
                                    wc1Var.m5312a(str2);
                                } else {
                                    if (bundleM1698C0 != null) {
                                        v22Var.m5026H(str, "_cmp", bundleM1698C0);
                                        iz1Var.m2751b(bundleM1698C0, str);
                                    } else {
                                        f02.m1560m(ky1Var);
                                        wc1Var.m5313b(str3, "Referrer does not contain valid parameters");
                                    }
                                    f02Var.f2252t.getClass();
                                    v22Var.m5029K("auto", "_ldl", null, true, System.currentTimeMillis());
                                }
                            }
                        } else {
                            str2 = "Activity created with data 'referrer' without required params";
                        }
                        str4 = "utm_medium";
                        if (!TextUtils.isEmpty(str3)) {
                            f02.m1560m(ky1Var);
                            wc1Var = ky1Var.f4607v;
                            wc1Var.m5313b(str3, "Activity created with referrer");
                            if (!f02Var.f2245m.m770L(null, jx1.f4125G0)) {
                                if (str3.contains("gclid")) {
                                }
                                f02.m1560m(ky1Var);
                                wc1Var.m5312a(str2);
                            } else {
                                if (bundleM1698C0 != null) {
                                    v22Var.m5026H(str, "_cmp", bundleM1698C0);
                                    iz1Var.m2751b(bundleM1698C0, str);
                                } else {
                                    f02.m1560m(ky1Var);
                                    wc1Var.m5313b(str3, "Referrer does not contain valid parameters");
                                }
                                f02Var.f2252t.getClass();
                                v22Var.m5029K("auto", "_ldl", null, true, System.currentTimeMillis());
                            }
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        ky1 ky1Var4 = ((f02) ((v22) c0414kz.f4610k).f7192j).f2247o;
                        f02.m1560m(ky1Var4);
                        ky1Var4.f4600o.m5313b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                        return;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                }
                break;
            default:
                v42 v42Var = (v42) obj4;
                nx1 nx1Var = v42Var.f8065m;
                f02 f02Var2 = (f02) v42Var.f7192j;
                if (nx1Var == null) {
                    ky1 ky1Var5 = f02Var2.f2247o;
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4600o.m5312a("Failed to send default event parameters to service");
                } else {
                    z72 z72Var = (z72) obj3;
                    if (f02Var2.f2245m.m770L(null, jx1.f4157W0)) {
                        v42Var.m5071S(nx1Var, z ? null : (eu1) obj2, z72Var);
                    } else {
                        try {
                            nx1Var.mo582z((Bundle) obj, z72Var);
                            v42Var.m5066N();
                        } catch (RemoteException e4) {
                            ky1 ky1Var6 = f02Var2.f2247o;
                            f02.m1560m(ky1Var6);
                            ky1Var6.f4600o.m5313b(e4, "Failed to send default event parameters to service");
                        }
                    }
                }
                break;
        }
    }

    public z12(AppMeasurementDynamiteService appMeasurementDynamiteService, gv1 gv1Var, String str, String str2, boolean z) {
        this.f9579n = gv1Var;
        this.f9576k = str;
        this.f9577l = str2;
        this.f9578m = z;
        this.f9580o = appMeasurementDynamiteService;
    }

    public z12(C0414kz c0414kz, boolean z, Uri uri, String str, String str2) {
        this.f9578m = z;
        this.f9579n = uri;
        this.f9576k = str;
        this.f9577l = str2;
        this.f9580o = c0414kz;
    }

    public z12(v42 v42Var, z72 z72Var, boolean z, eu1 eu1Var, Bundle bundle) {
        this.f9579n = z72Var;
        this.f9578m = z;
        this.f9576k = eu1Var;
        this.f9577l = bundle;
        Objects.requireNonNull(v42Var);
        this.f9580o = v42Var;
    }
}
