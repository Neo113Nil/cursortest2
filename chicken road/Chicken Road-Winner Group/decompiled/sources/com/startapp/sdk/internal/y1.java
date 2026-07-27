package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class y1 {

    /* renamed from: m0, reason: collision with root package name */
    public static final Collection f4651m0;

    /* renamed from: A, reason: collision with root package name */
    public String f4652A;

    /* renamed from: B, reason: collision with root package name */
    public String f4653B;

    /* renamed from: C, reason: collision with root package name */
    public String f4654C;

    /* renamed from: D, reason: collision with root package name */
    public String f4655D;

    /* renamed from: E, reason: collision with root package name */
    public String f4656E;

    /* renamed from: F, reason: collision with root package name */
    public String f4657F;

    /* renamed from: G, reason: collision with root package name */
    public String f4658G;

    /* renamed from: H, reason: collision with root package name */
    public String f4659H;

    /* renamed from: I, reason: collision with root package name */
    public String f4660I;

    /* renamed from: J, reason: collision with root package name */
    public String f4661J;

    /* renamed from: K, reason: collision with root package name */
    public final String f4662K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public int f4663M;

    /* renamed from: N, reason: collision with root package name */
    public float f4664N;

    /* renamed from: O, reason: collision with root package name */
    public Boolean f4665O;

    /* renamed from: P, reason: collision with root package name */
    public final int f4666P;

    /* renamed from: Q, reason: collision with root package name */
    public String f4667Q;

    /* renamed from: R, reason: collision with root package name */
    public String f4668R;

    /* renamed from: S, reason: collision with root package name */
    public int f4669S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f4670T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f4671U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f4672V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4673W;

    /* renamed from: X, reason: collision with root package name */
    public String f4674X;

    /* renamed from: Y, reason: collision with root package name */
    public String f4675Y;

    /* renamed from: Z, reason: collision with root package name */
    public final int f4676Z;

    /* renamed from: a, reason: collision with root package name */
    public String f4677a;

    /* renamed from: a0, reason: collision with root package name */
    public Long f4678a0;

    /* renamed from: b, reason: collision with root package name */
    public String f4679b;

    /* renamed from: b0, reason: collision with root package name */
    public Integer f4680b0;

    /* renamed from: c, reason: collision with root package name */
    public String f4681c;

    /* renamed from: c0, reason: collision with root package name */
    public Boolean f4682c0;

    /* renamed from: d, reason: collision with root package name */
    public final TreeMap f4683d;

    /* renamed from: d0, reason: collision with root package name */
    public Boolean f4684d0;

    /* renamed from: e, reason: collision with root package name */
    public Map f4685e;

    /* renamed from: e0, reason: collision with root package name */
    public Boolean f4686e0;
    public String f;
    public Boolean f0;

    /* renamed from: g, reason: collision with root package name */
    public k0 f4687g;

    /* renamed from: g0, reason: collision with root package name */
    public u0 f4688g0;

    /* renamed from: h, reason: collision with root package name */
    public String f4689h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f4690h0;

    /* renamed from: i, reason: collision with root package name */
    public String f4691i;

    /* renamed from: i0, reason: collision with root package name */
    public Integer f4692i0;

    /* renamed from: j, reason: collision with root package name */
    public String f4693j;

    /* renamed from: j0, reason: collision with root package name */
    public Long f4694j0;

    /* renamed from: k, reason: collision with root package name */
    public String f4695k;

    /* renamed from: k0, reason: collision with root package name */
    public Boolean f4696k0;

    /* renamed from: l, reason: collision with root package name */
    public String f4697l;
    public String l0;

    /* renamed from: m, reason: collision with root package name */
    public String f4698m;

    /* renamed from: n, reason: collision with root package name */
    public String f4699n;

    /* renamed from: o, reason: collision with root package name */
    public zb f4700o;

    /* renamed from: p, reason: collision with root package name */
    public ca f4701p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f4702q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f4703r;

    /* renamed from: s, reason: collision with root package name */
    public String f4704s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4705t;

    /* renamed from: u, reason: collision with root package name */
    public int f4706u;

    /* renamed from: v, reason: collision with root package name */
    public String f4707v;

    /* renamed from: w, reason: collision with root package name */
    public String f4708w;

    /* renamed from: x, reason: collision with root package name */
    public String f4709x;
    public String y;

    /* renamed from: z, reason: collision with root package name */
    public String f4710z;

    static {
        ArrayList arrayList = new ArrayList();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            arrayList.add(23);
        }
        if (i3 >= 26) {
            arrayList.add(22);
        }
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(8);
        f4651m0 = Collections.unmodifiableCollection(arrayList);
    }

    public y1(int i3) {
        new HashMap();
        this.f4681c = "5.3.0";
        this.f4683d = new TreeMap();
        this.f4662K = ConstantDeviceInfo.APP_PLATFORM;
        this.f4666P = 3;
        this.f4676Z = i3;
    }

    public Set a() {
        return Collections.EMPTY_SET;
    }

    public boolean b() {
        return false;
    }

    public final void c(Context context) {
        if (this.f4679b == null) {
            q0 q0Var = (q0) com.startapp.sdk.components.a.a(context).f3365m.a();
            String str = q0Var.f4236c;
            if (str == null) {
                synchronized (q0Var.f4234a) {
                    try {
                        str = q0Var.f4236c;
                        if (str == null) {
                            str = q0Var.f4235b.getString("c88d4eab540fab77", null);
                        }
                    } finally {
                    }
                }
            }
            this.f4677a = str;
            this.f4679b = q0Var.a();
        }
        this.f4689h = context.getPackageName();
    }

    public final void d(Context context) {
        int i3;
        e6 e6Var;
        this.f4704s = rd.a(context);
        String str = ((vh) com.startapp.sdk.components.a.a(context).f3359g.a()).f4532h;
        this.f4659H = str;
        this.f4707v = str;
        try {
            e6Var = ((f6) com.startapp.sdk.components.a.a(context).f3372t.a()).f3677e;
        } catch (Throwable th) {
            if (!si.a(th, RemoteException.class)) {
                d9.a(th);
            }
        }
        if (e6Var != null) {
            i3 = e6Var.a();
            this.f4706u = i3;
        }
        i3 = -1;
        this.f4706u = i3;
    }

    public final void e(Context context) {
        jh jhVar = (jh) ((mh) com.startapp.sdk.components.a.a(context).f.a()).b();
        Object opt = jhVar.f3932a.opt(String.valueOf(7));
        if ((opt instanceof Number ? ((Number) opt).intValue() : 0) == 5) {
            this.f4708w = jhVar.a(8);
            this.f4709x = jhVar.a(9);
            this.y = jhVar.a(15);
            this.f4710z = jhVar.a(16);
        }
        Object opt2 = jhVar.f3932a.opt(String.valueOf(10));
        int intValue = opt2 instanceof Number ? ((Number) opt2).intValue() : 0;
        if (intValue != 0 && intValue != 2) {
            this.f4652A = jhVar.a(11);
            this.f4653B = jhVar.a(12);
        }
        this.f4654C = jhVar.a(4);
        this.f4655D = jhVar.a(3);
        this.f4656E = jhVar.a(5);
        this.f4657F = jhVar.a(1);
        this.f4658G = jhVar.a(2);
        this.f4660I = jhVar.a(13);
        Object opt3 = jhVar.f3932a.opt(String.valueOf(14));
        this.f4705t = (opt3 instanceof Number ? ((Number) opt3).intValue() : 0) == 1;
    }

    public final void f(Context context) {
        com.startapp.sdk.components.a a3 = com.startapp.sdk.components.a.a(context);
        g6 g6Var = (g6) a3.f3362j.a();
        if (g6Var.b()) {
            int hashCode = ((com.startapp.sdk.common.advertisingid.b) g6Var.f3752c.a()).a().f3940a.hashCode();
            if (!((sf) g6Var.f3751b.a()).contains("advIdHash") || ((sf) g6Var.f3751b.a()).getInt("advIdHash", 0) != hashCode) {
                rf edit = ((sf) g6Var.f3751b.a()).edit();
                if (edit.f4300b.containsKey("consentType")) {
                    edit.f4302d = true;
                }
                edit.f4299a.remove("consentType");
                if (edit.f4300b.containsKey("consentTimestamp")) {
                    edit.f4302d = true;
                }
                edit.f4299a.remove("consentTimestamp");
                edit.a("advIdHash", Integer.valueOf(hashCode));
                edit.f4299a.putInt("advIdHash", hashCode);
                edit.apply();
            }
        }
        this.f4692i0 = (g6Var.b() && ((sf) g6Var.f3751b.a()).contains("consentType")) ? Integer.valueOf(((sf) g6Var.f3751b.a()).getInt("consentType", -1)) : null;
        this.f4694j0 = (g6Var.b() && ((sf) g6Var.f3751b.a()).contains("consentTimestamp")) ? Long.valueOf(((sf) g6Var.f3751b.a()).getLong("consentTimestamp", 0L)) : null;
        this.f4696k0 = (g6Var.b() && ((sf) g6Var.f3751b.a()).contains("consentApc")) ? Boolean.valueOf(((sf) g6Var.f3751b.a()).getBoolean("consentApc", false)) : null;
        this.l0 = ((sf) a3.f3342H.a()).getString("IABTCF_TCString", null);
    }

    public final void a(Context context) {
        if (MetaData.E().s()) {
            return;
        }
        this.f4687g = ((com.startapp.sdk.common.advertisingid.b) com.startapp.sdk.components.a.a(context).f3360h.a()).a();
        try {
            this.f4693j = ((fa) com.startapp.sdk.components.a.a(context).f3363k.a()).a();
        } catch (Throwable th) {
            d9.a(th);
        }
        try {
            this.f4685e = ((sf) com.startapp.sdk.components.a.a(context).f3343I.a()).getAll();
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (android.provider.Settings.Secure.getInt(r5.getContentResolver(), "install_non_market_apps") == 1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Context context, AdPreferences adPreferences) {
        String str;
        boolean z3;
        boolean z4;
        Resources resources;
        String string;
        DisplayMetrics displayMetrics;
        NetworkInfo activeNetworkInfo;
        this.f4667Q = mg.f4061d.f4062a;
        this.f4698m = Build.MANUFACTURER;
        this.f4697l = Build.MODEL;
        this.f4699n = Integer.toString(Build.VERSION.SDK_INT);
        if (adPreferences != null) {
            this.f = adPreferences.getAge(context);
        }
        this.f4691i = ((xg) ((yg) com.startapp.sdk.components.a.a(context).f3367o.a()).b()).f4648a;
        int i3 = p0.f4197a;
        boolean z5 = false;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        this.f4668R = str;
        this.f4669S = p0.a(context);
        try {
            z3 = true;
        } catch (Throwable unused2) {
        }
        this.f4671U = z4;
        try {
            z5 = u6.a(context);
        } catch (Throwable unused3) {
        }
        this.f4672V = z5;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4703r = (connectivityManager == null && p0.a(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) ? Boolean.valueOf(activeNetworkInfo.isRoaming()) : null;
        this.f4673W = si.d(context);
        this.f4690h0 = si.e(context);
        resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.L = displayMetrics.widthPixels;
            this.f4663M = displayMetrics.heightPixels;
            this.f4664N = displayMetrics.density;
        }
        com.startapp.sdk.components.a a3 = com.startapp.sdk.components.a.a(context);
        this.f4700o = (zb) ((ac) a3.f3357d.a()).b();
        this.f4701p = (ca) ((ea) a3.f3358e.a()).b();
        sf sfVar = (sf) a3.f3341G.a();
        this.f4674X = sfVar.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap = this.f4683d;
        string = sfVar.getString("sharedPrefsWrappers", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    treeMap.put(next, (String) jSONObject.get(next));
                }
            } catch (JSONException unused4) {
            }
        }
        this.f4665O = Boolean.valueOf(si.c(context));
        this.f4665O = Boolean.valueOf(si.c(context));
        this.f4672V = z5;
        ConnectivityManager connectivityManager2 = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4703r = (connectivityManager2 == null && p0.a(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager2.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) ? Boolean.valueOf(activeNetworkInfo.isRoaming()) : null;
        this.f4673W = si.d(context);
        this.f4690h0 = si.e(context);
        resources = context.getResources();
        if (resources != null) {
            this.L = displayMetrics.widthPixels;
            this.f4663M = displayMetrics.heightPixels;
            this.f4664N = displayMetrics.density;
        }
        com.startapp.sdk.components.a a32 = com.startapp.sdk.components.a.a(context);
        this.f4700o = (zb) ((ac) a32.f3357d.a()).b();
        this.f4701p = (ca) ((ea) a32.f3358e.a()).b();
        sf sfVar2 = (sf) a32.f3341G.a();
        this.f4674X = sfVar2.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap2 = this.f4683d;
        string = sfVar2.getString("sharedPrefsWrappers", null);
        if (string != null) {
        }
        this.f4665O = Boolean.valueOf(si.c(context));
        z3 = false;
        this.f4702q = Boolean.valueOf(z3);
        this.f4670T = p0.b(context);
        try {
            z4 = we.a(context);
        } catch (Throwable unused5) {
            z4 = false;
        }
        this.f4671U = z4;
        z5 = u6.a(context);
        this.f4672V = z5;
        ConnectivityManager connectivityManager22 = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4703r = (connectivityManager22 == null && p0.a(context, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager22.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) ? Boolean.valueOf(activeNetworkInfo.isRoaming()) : null;
        this.f4673W = si.d(context);
        this.f4690h0 = si.e(context);
        resources = context.getResources();
        if (resources != null) {
        }
        com.startapp.sdk.components.a a322 = com.startapp.sdk.components.a.a(context);
        this.f4700o = (zb) ((ac) a322.f3357d.a()).b();
        this.f4701p = (ca) ((ea) a322.f3358e.a()).b();
        sf sfVar22 = (sf) a322.f3341G.a();
        this.f4674X = sfVar22.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap22 = this.f4683d;
        string = sfVar22.getString("sharedPrefsWrappers", null);
        if (string != null) {
        }
        this.f4665O = Boolean.valueOf(si.c(context));
    }

    public final void a(Context context, AdPreferences adPreferences) {
        try {
            this.f4688g0 = (u0) com.startapp.sdk.components.a.a(context).f3350Q.a();
        } catch (Throwable th) {
            d9.a(th);
        }
        c(context);
        try {
            b(context, adPreferences);
        } catch (Throwable unused) {
        }
        try {
            d(context);
        } catch (Throwable th2) {
            d9.a(th2);
        }
        try {
            e(context);
        } catch (Throwable th3) {
            d9.a(th3);
        }
        try {
            this.f4695k = ng.a(context);
        } catch (Throwable th4) {
            d9.a(th4);
        }
        try {
            this.f4661J = ((ef) com.startapp.sdk.components.a.a(context).f3361i.a()).a(this);
        } catch (Throwable th5) {
            d9.a(th5);
        }
        try {
            a(context);
        } catch (Throwable th6) {
            d9.a(th6);
        }
        try {
            b(context);
        } catch (Throwable th7) {
            d9.a(th7);
        }
        try {
            f(context);
        } catch (Throwable th8) {
            d9.a(th8);
        }
    }

    public final q8 a(boolean z3) {
        eb ebVar = new eb(a());
        a(ebVar);
        byte[] bytes = ebVar.f3631b.toString().getBytes();
        String str = null;
        if (z3) {
            try {
                WeakHashMap weakHashMap = si.f4343a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                bytes = byteArrayOutputStream.toByteArray();
                str = "gzip";
            } catch (IOException e3) {
                d9.a(e3);
            }
        }
        return new q8(bytes, "application/json", str);
    }

    public final String a(String str) {
        md mdVar = new md(a());
        a(mdVar);
        String mdVar2 = mdVar.toString();
        if (str.contains("?") && mdVar2.startsWith("?")) {
            return str + "&" + mdVar2.substring(1);
        }
        return B0.c.o(str, mdVar2);
    }

    public void a(se seVar) {
        Map map = this.f4685e;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                seVar.a((String) entry.getKey(), entry.getValue(), false, true);
            }
        }
        seVar.a("publisherId", this.f4677a, false, true);
        seVar.a("productId", this.f4679b, b(), true);
        seVar.a("os", this.f4662K, true, true);
        seVar.a("sdkVersion", this.f4681c, false, true);
        seVar.a("flavor", 1023, false, true);
        TreeMap treeMap = this.f4683d;
        if (treeMap != null && !treeMap.isEmpty()) {
            String str = "";
            for (String str2 : this.f4683d.keySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                str = B0.c.l(sb, (String) this.f4683d.get(str2), ";");
            }
            seVar.a("frameworksData", str.substring(0, str.length() - 1), false, false);
        }
        seVar.a("packageId", this.f4689h, false, true);
        seVar.a("installerPkg", this.f4691i, false, true);
        seVar.a("age", this.f, false, true);
        k0 k0Var = this.f4687g;
        if (k0Var != null) {
            seVar.a("userAdvertisingId", k0Var.f3940a, false, true);
            boolean z3 = this.f4687g.f3942c;
            if (z3) {
                seVar.a("limat", Boolean.valueOf(z3), false, true);
            }
            seVar.a("advertisingIdSource", this.f4687g.f3941b, false, true);
        }
        String str3 = this.f4693j;
        if (str3 != null) {
            seVar.a("duid", str3, false, true);
        }
        String str4 = this.f4695k;
        if (str4 != null) {
            seVar.a("vendorId", str4, false, true);
        }
        seVar.a(CommonUrlParts.MODEL, this.f4697l, false, true);
        seVar.a(CommonUrlParts.MANUFACTURER, this.f4698m, false, true);
        seVar.a("deviceVersion", this.f4699n, false, true);
        zb zbVar = this.f4700o;
        if (zbVar != null) {
            seVar.a(CommonUrlParts.LOCALE, zbVar.f4794a, false, true);
            int i3 = this.f4676Z;
            if (i3 == 4 || i3 == 2) {
                seVar.a("localeList", this.f4700o.f4795b, false, true);
            }
        }
        int i4 = this.f4676Z;
        if (i4 == 4 || i4 == 2) {
            seVar.a("inputLangs", this.f4701p, false, true);
        }
        seVar.a("isp", this.f4708w, false, true);
        seVar.a("ispName", this.f4709x, false, true);
        seVar.a("ispCarrId", this.y, false, true);
        seVar.a("ispCarrIdName", this.f4710z, false, true);
        seVar.a("netOper", this.f4652A, false, true);
        seVar.a("networkOperName", this.f4653B, false, true);
        seVar.a("cid", this.f4654C, false, true);
        seVar.a("lac", this.f4655D, false, true);
        seVar.a("tac", this.f4656E, false, true);
        seVar.a("blat", this.f4657F, false, true);
        seVar.a("blon", this.f4658G, false, true);
        seVar.a("subPublisherId", null, false, true);
        seVar.a("subProductId", null, false, true);
        seVar.a("retryCount", null, false, true);
        seVar.a("roaming", this.f4703r, false, true);
        seVar.a("grid", this.f4704s, false, true);
        if (this.f4705t) {
            seVar.a("c5g", "1", false, false);
        }
        int i5 = this.f4706u;
        if (i5 >= 0) {
            seVar.a("transport", String.valueOf(i5), false, false);
        }
        if (this.f4690h0) {
            seVar.a("tv", Boolean.TRUE, false, false);
        }
        seVar.a("silev", this.f4707v, false, true);
        seVar.a("cellSignalLevel", this.f4659H, false, true);
        seVar.a("cellTimingAdv", this.f4660I, false, true);
        seVar.a("outsource", this.f4702q, false, true);
        seVar.a("width", String.valueOf(this.L), false, true);
        seVar.a("height", String.valueOf(this.f4663M), false, true);
        seVar.a("density", String.valueOf(this.f4664N), false, true);
        seVar.a("fgApp", this.f4665O, false, true);
        seVar.a("sdkId", String.valueOf(this.f4666P), true, true);
        seVar.a("clientSessionId", this.f4667Q, false, true);
        seVar.a("appVersion", this.f4668R, false, true);
        seVar.a("appCode", Integer.valueOf(this.f4669S), false, true);
        seVar.a("timeSinceBoot", Long.valueOf(SystemClock.elapsedRealtime()), false, true);
        seVar.a("udbg", Boolean.valueOf(this.f4670T), false, true);
        seVar.a("root", Boolean.valueOf(this.f4671U), false, true);
        seVar.a("smltr", Boolean.valueOf(this.f4672V), false, true);
        seVar.a("isddbg", Boolean.valueOf(this.f4673W), false, true);
        seVar.a("pas", this.f4674X, false, true);
        seVar.a("prm", this.f4675Y, false, false);
        seVar.a("free", this.f4678a0, false, false);
        seVar.a("chr", this.f4682c0, false, false);
        seVar.a("blp", this.f4680b0, false, false);
        seVar.a("hs", this.f4684d0, false, false);
        seVar.a("lpm", this.f4686e0, false, false);
        seVar.a("dm", this.f0, false, false);
        seVar.a("ct", this.f4692i0, false, true);
        seVar.a("tsc", this.f4694j0, false, true);
        seVar.a("apc", this.f4696k0, false, true);
        seVar.a("IABTCF_TCString", this.l0, false, true);
        u0 u0Var = this.f4688g0;
        if (u0Var != null) {
            long j3 = 0;
            if (u0Var.f4406d > 0) {
                u0Var.f4403a.getClass();
                j3 = SystemClock.elapsedRealtime() - u0Var.f4406d;
            }
            seVar.a("appSessionDuration", Long.valueOf(j3 / 1000), false, false);
        }
        seVar.a("rsc", this.f4661J, false, true);
    }

    public final void b(Context context) {
        boolean z3;
        try {
            this.f4678a0 = Long.valueOf(new StatFs(Environment.getRootDirectory().getAbsolutePath()).getFreeBytes());
        } catch (Throwable th) {
            d9.a(th);
        }
        boolean z4 = true;
        try {
            this.f4682c0 = null;
            this.f4680b0 = null;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                if (registerReceiver.hasExtra("status")) {
                    int intExtra = registerReceiver.getIntExtra("status", -1);
                    if (intExtra != 2 && intExtra != 5) {
                        z3 = false;
                        this.f4682c0 = Boolean.valueOf(z3);
                    }
                    z3 = true;
                    this.f4682c0 = Boolean.valueOf(z3);
                }
                if (registerReceiver.hasExtra("level") && registerReceiver.hasExtra("scale")) {
                    int intExtra2 = registerReceiver.getIntExtra("level", -1);
                    int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        this.f4680b0 = Integer.valueOf((intExtra2 * 100) / intExtra3);
                    }
                }
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
        try {
            this.f4684d0 = null;
            Object systemService = context.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                AudioDeviceInfo[] devices = ((AudioManager) systemService).getDevices(2);
                if (devices != null) {
                    for (AudioDeviceInfo audioDeviceInfo : devices) {
                        if (audioDeviceInfo != null && f4651m0.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                            break;
                        }
                    }
                }
                z4 = false;
                this.f4684d0 = Boolean.valueOf(z4);
            }
        } catch (Throwable th3) {
            d9.a(th3);
        }
        try {
            this.f4686e0 = null;
            Object systemService2 = context.getSystemService("power");
            if (systemService2 instanceof PowerManager) {
                this.f4686e0 = Boolean.valueOf(((PowerManager) systemService2).isPowerSaveMode());
            }
        } catch (Throwable th4) {
            d9.a(th4);
        }
        try {
            this.f0 = null;
            int i3 = context.getResources().getConfiguration().uiMode & 48;
            if (i3 == 32) {
                this.f0 = Boolean.TRUE;
            } else if (i3 == 16) {
                this.f0 = Boolean.FALSE;
            }
        } catch (Throwable th5) {
            d9.a(th5);
        }
    }
}
