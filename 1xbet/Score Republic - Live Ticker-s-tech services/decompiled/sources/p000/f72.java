package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f72 extends d12 {

    /* JADX INFO: renamed from: r */
    public static final String[] f2338r = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: s */
    public static final String[] f2339s = {"_err"};

    /* JADX INFO: renamed from: l */
    public SecureRandom f2340l;

    /* JADX INFO: renamed from: m */
    public final AtomicLong f2341m;

    /* JADX INFO: renamed from: n */
    public int f2342n;

    /* JADX INFO: renamed from: o */
    public en0 f2343o;

    /* JADX INFO: renamed from: p */
    public Boolean f2344p;

    /* JADX INFO: renamed from: q */
    public Integer f2345q;

    public f72(f02 f02Var) {
        super(f02Var);
        this.f2345q = null;
        this.f2341m = new AtomicLong(0L);
    }

    /* JADX INFO: renamed from: B0 */
    public static boolean m1680B0(String str) {
        p80.m3860e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m1681D0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: H */
    public static String m1682H(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
        }
        return null;
    }

    /* JADX INFO: renamed from: N0 */
    public static boolean m1683N0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: renamed from: S */
    public static void m1684S(e72 e72Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m1689Z(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        e72Var.mo1384e(str, "_err", bundle);
    }

    /* JADX INFO: renamed from: T */
    public static MessageDigest m1685T() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: U */
    public static long m1686U(byte[] bArr) {
        p80.m3863h(bArr);
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalStateException();
        }
        int i = 0;
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m1687V(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: X */
    public static int m1688X() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    /* JADX INFO: renamed from: Z */
    public static final boolean m1689Z(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m1690c0(String str, String[] strArr) {
        p80.m3863h(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public static final boolean m1691d0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m1692f0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: renamed from: k0 */
    public static byte[] m1693k0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static ArrayList m1694v0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hr1 hr1Var = (hr1) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", hr1Var.f3299j);
            bundle.putString("origin", hr1Var.f3300k);
            bundle.putLong("creation_timestamp", hr1Var.f3302m);
            bundle.putString("name", hr1Var.f3301l.f749k);
            Object objM600b = hr1Var.f3301l.m600b();
            p80.m3863h(objM600b);
            oa2.m3662i(bundle, objM600b);
            bundle.putBoolean("active", hr1Var.f3303n);
            String str = hr1Var.f3304o;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            fu1 fu1Var = hr1Var.f3305p;
            if (fu1Var != null) {
                bundle.putString("timed_out_event_name", fu1Var.f2501j);
                eu1 eu1Var = fu1Var.f2502k;
                if (eu1Var != null) {
                    bundle.putBundle("timed_out_event_params", eu1Var.m1507e());
                }
            }
            bundle.putLong("trigger_timeout", hr1Var.f3306q);
            fu1 fu1Var2 = hr1Var.f3307r;
            if (fu1Var2 != null) {
                bundle.putString("triggered_event_name", fu1Var2.f2501j);
                eu1 eu1Var2 = fu1Var2.f2502k;
                if (eu1Var2 != null) {
                    bundle.putBundle("triggered_event_params", eu1Var2.m1507e());
                }
            }
            bundle.putLong("triggered_timestamp", hr1Var.f3301l.f750l);
            bundle.putLong("time_to_live", hr1Var.f3308s);
            fu1 fu1Var3 = hr1Var.f3309t;
            if (fu1Var3 != null) {
                bundle.putString("expired_event_name", fu1Var3.f2501j);
                eu1 eu1Var3 = fu1Var3.f2502k;
                if (eu1Var3 != null) {
                    bundle.putBundle("expired_event_params", eu1Var3.m1507e());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w0 */
    public static boolean m1695w0(Context context) {
        ActivityInfo receiverInfo;
        p80.m3863h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static void m1696x0(f32 f32Var, Bundle bundle, boolean z) {
        if (bundle != null && f32Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = f32Var.f2295a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = f32Var.f2296b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", f32Var.f2297c);
                return;
            }
            z = false;
        }
        if (bundle != null && f32Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final SecureRandom m1697A0() {
        mo11z();
        if (this.f2340l == null) {
            this.f2340l = new SecureRandom();
        }
        return this.f2340l;
    }

    @Override // p000.d12
    /* JADX INFO: renamed from: B */
    public final boolean mo0B() {
        return true;
    }

    /* JADX INFO: renamed from: C0 */
    public final Bundle m1698C0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        f02 f02Var = (f02) this.f7192j;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter2 = uri.getQueryParameter("utm_campaign");
                    queryParameter3 = uri.getQueryParameter("utm_source");
                    queryParameter4 = uri.getQueryParameter("utm_medium");
                    queryParameter5 = uri.getQueryParameter("gclid");
                    queryParameter6 = uri.getQueryParameter("gbraid");
                    queryParameter7 = uri.getQueryParameter("utm_id");
                    queryParameter8 = uri.getQueryParameter("dclid");
                    queryParameter9 = uri.getQueryParameter("srsltid");
                    queryParameter = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (!TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9) || !TextUtils.isEmpty(queryParameter)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("campaign", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("source", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("medium", queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("gclid", queryParameter5);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("gbraid", queryParameter6);
                    }
                    String queryParameter10 = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString("gad_source", queryParameter10);
                    }
                    String queryParameter11 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("term", queryParameter11);
                    }
                    String queryParameter12 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString("content", queryParameter12);
                    }
                    String queryParameter13 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("aclid", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("cp1", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("anid", queryParameter15);
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("campaign_id", queryParameter7);
                    }
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("dclid", queryParameter8);
                    }
                    String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter16)) {
                        bundle.putString("source_platform", queryParameter16);
                    }
                    String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter17)) {
                        bundle.putString("creative_format", queryParameter17);
                    }
                    String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter18)) {
                        bundle.putString("marketing_tactic", queryParameter18);
                    }
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("srsltid", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("sfmc_id", queryParameter);
                    }
                    for (String str : uri.getQueryParameterNames()) {
                        if (str.startsWith("gad_")) {
                            String queryParameter19 = uri.getQueryParameter(str);
                            if (!TextUtils.isEmpty(queryParameter19)) {
                                bundle.putString(str, queryParameter19);
                            }
                        }
                    }
                    if (f02Var.f2245m.m770L(null, jx1.f4166a1)) {
                        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        f02Var.f2245m.getClass();
                        int iMax = Math.max(500, 256);
                        if (string.length() > iMax) {
                            string = m1682H(iMax - 3, string, true);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle.putString("deep_link_url", string);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4603r.m5313b(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m1699E(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) <= i) {
            return true;
        }
        ky1 ky1Var = ((f02) this.f7192j).f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4605t.m5315d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
        return false;
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m1700E0(String str, String str2) {
        f02 f02Var = (f02) this.f7192j;
        if (str2 == null) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4602q.m5313b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4602q.m5313b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            ky1 ky1Var3 = f02Var.f2247o;
            f02.m1560m(ky1Var3);
            ky1Var3.f4602q.m5314c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                ky1 ky1Var4 = f02Var.f2247o;
                f02.m1560m(ky1Var4);
                ky1Var4.f4602q.m5314c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    public final void m1701F(String str, String str2, Bundle bundle, List list, boolean z) {
        int iM1713L0;
        int iM1706I;
        list = list;
        if (bundle == null) {
            return;
        }
        f02 f02Var = (f02) this.f7192j;
        bt1 bt1Var = f02Var.f2245m;
        ky1 ky1Var = f02Var.f2247o;
        cy1 cy1Var = f02Var.f2251s;
        f72 f72Var = ((f02) bt1Var.f7192j).f2250r;
        f02.m1558k(f72Var);
        int i = true != f72Var.m1730l0(231100000) ? 0 : 35;
        int i2 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iM1713L0 = !z ? m1713L0(str3) : 0;
                if (iM1713L0 == 0) {
                    iM1713L0 = m1715M0(str3);
                }
            } else {
                iM1713L0 = 0;
            }
            if (iM1713L0 != 0) {
                m1717O(bundle, iM1713L0, str3, iM1713L0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (m1683N0(bundle.get(str3))) {
                    f02.m1560m(ky1Var);
                    ky1Var.f4605t.m5315d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iM1706I = 22;
                } else {
                    iM1706I = m1706I(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iM1706I != 0 && !"_ev".equals(str3)) {
                    m1717O(bundle, iM1706I, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (m1680B0(str3) && !m1690c0(str3, AbstractC0875xf.f8946h)) {
                    i2++;
                    if (!m1730l0(231100000)) {
                        f02.m1560m(ky1Var);
                        ky1Var.f4602q.m5314c(cy1Var.m1043a(str), cy1Var.m1047e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        m1689Z(23, bundle);
                        bundle.remove(str3);
                    } else if (i2 > i) {
                        if (!z2) {
                            f02.m1560m(ky1Var);
                            wc1 wc1Var = ky1Var.f4602q;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            wc1Var.m5314c(cy1Var.m1043a(str), cy1Var.m1047e(bundle), sb.toString());
                        }
                        m1689Z(28, bundle);
                        bundle.remove(str3);
                        z2 = true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m1702F0(String str, String str2) {
        f02 f02Var = (f02) this.f7192j;
        if (str2 == null) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4602q.m5313b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4602q.m5313b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                ky1 ky1Var3 = f02Var.f2247o;
                f02.m1560m(ky1Var3);
                ky1Var3.f4602q.m5314c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                ky1 ky1Var4 = f02Var.f2247o;
                f02.m1560m(ky1Var4);
                ky1Var4.f4602q.m5314c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m1703G(String str) {
        f02 f02Var = (f02) this.f7192j;
        if (TextUtils.isEmpty(str)) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4602q.m5312a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        p80.m3863h(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        ky1 ky1Var2 = f02Var.f2247o;
        f02.m1560m(ky1Var2);
        ky1Var2.f4602q.m5313b(ky1.m3106I(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m1704G0(String str, String[] strArr, String[] strArr2, String str2) {
        f02 f02Var = (f02) this.f7192j;
        if (str2 == null) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4602q.m5313b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(f2338r[i])) {
                ky1 ky1Var2 = f02Var.f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4602q.m5314c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !m1690c0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m1690c0(str2, strArr2)) {
            return true;
        }
        ky1 ky1Var3 = f02Var.f2247o;
        f02.m1560m(ky1Var3);
        ky1Var3.f4602q.m5314c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m1705H0(int i, String str, String str2) {
        f02 f02Var = (f02) this.f7192j;
        if (str2 == null) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4602q.m5313b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        ky1 ky1Var2 = f02Var.f2247o;
        f02.m1560m(ky1Var2);
        ky1Var2.f4602q.m5315d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX INFO: renamed from: I */
    public final int m1706I(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int size;
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        int i2 = 0;
        if (!m1683N0(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!m1690c0(str2, AbstractC0875xf.f8945g)) {
                return 20;
            }
            v42 v42VarM1573p = f02Var.m1573p();
            v42VarM1573p.mo11z();
            v42VarM1573p.m3446B();
            if (v42VarM1573p.m5060H()) {
                f72 f72Var = ((f02) v42VarM1573p.f7192j).f2250r;
                f02.m1558k(f72Var);
                if (f72Var.m1731m0() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4605t.m5315d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
            } else {
                i = 0;
            }
        }
        int iMax = 500;
        if (m1692f0(str) || m1692f0(str2)) {
            f02Var.f2245m.getClass();
            iMax = Math.max(500, 256);
        } else {
            f02Var.f2245m.getClass();
        }
        if (!m1699E("param", str2, iMax, obj)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                m1701F(str, str2, (Bundle) obj, list, z);
                return i;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i2 < length) {
                    Parcelable parcelable = parcelableArr2[i2];
                    if (!(parcelable instanceof Bundle)) {
                        ky1 ky1Var2 = f02Var.f2247o;
                        f02.m1560m(ky1Var2);
                        ky1Var2.f4605t.m5314c(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    m1701F(str, str2, (Bundle) parcelable, list, z);
                    i2++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    if (!(obj2 instanceof Bundle)) {
                        ky1 ky1Var3 = f02Var.f2247o;
                        f02.m1560m(ky1Var3);
                        ky1Var3.f4605t.m5314c(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    m1701F(str, str2, (Bundle) obj2, list, z);
                    i2++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: I0 */
    public final int m1707I0(String str) {
        if (!m1702F0("event", str)) {
            return 2;
        }
        if (m1704G0("event", zg1.f9762h, ((f02) this.f7192j).f2245m.m770L(null, jx1.f4181f1) ? zg1.f9764j : zg1.f9763i, str)) {
            return !m1705H0(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX INFO: renamed from: J */
    public final Object m1708J(Object obj, String str) {
        f02 f02Var = (f02) this.f7192j;
        int iMax = 500;
        if ("_ev".equals(str)) {
            f02Var.f2245m.getClass();
            return m1723a0(Math.max(500, 256), obj, true, true);
        }
        if (m1692f0(str)) {
            f02Var.f2245m.getClass();
            iMax = Math.max(500, 256);
        } else {
            f02Var.f2245m.getClass();
        }
        return m1723a0(iMax, obj, false, true);
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m1709J0(String str) {
        return ((f02) this.f7192j).f2245m.m770L(null, jx1.f4181f1) ? m1690c0(str, zg1.f9766l) : m1690c0(str, zg1.f9765k);
    }

    /* JADX INFO: renamed from: K */
    public final Bundle m1710K(String str, Bundle bundle, List list, boolean z) {
        int iM1713L0;
        boolean zM1690c0 = m1690c0(str, zg1.f9768n);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        f02 f02Var = (f02) this.f7192j;
        bt1 bt1Var = f02Var.f2245m;
        cy1 cy1Var = f02Var.f2251s;
        f72 f72Var = ((f02) bt1Var.f7192j).f2250r;
        f02.m1558k(f72Var);
        int i = f72Var.m1730l0(201500000) ? 100 : 25;
        int i2 = 0;
        boolean z2 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iM1713L0 = !z ? m1713L0(str2) : 0;
                if (iM1713L0 == 0) {
                    iM1713L0 = m1715M0(str2);
                }
            } else {
                iM1713L0 = 0;
            }
            if (iM1713L0 != 0) {
                m1717O(bundle2, iM1713L0, str2, iM1713L0 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iM1706I = m1706I(str, str2, bundle.get(str2), bundle2, list, z, zM1690c0);
                if (iM1706I == 17) {
                    m1717O(bundle2, 17, str2, Boolean.FALSE);
                } else if (iM1706I != 0 && !"_ev".equals(str2)) {
                    m1717O(bundle2, iM1706I, iM1706I == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (m1680B0(str2)) {
                    i2++;
                    if (i2 > i) {
                        if (!z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String string = sb.toString();
                            ky1 ky1Var = f02Var.f2247o;
                            f02.m1560m(ky1Var);
                            ky1Var.f4602q.m5314c(cy1Var.m1043a(str), cy1Var.m1047e(bundle), string);
                        }
                        m1689Z(5, bundle2);
                        bundle2.remove(str2);
                        z2 = true;
                    }
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: K0 */
    public final int m1711K0(String str) {
        if (!m1702F0("user property", str)) {
            return 6;
        }
        if (!m1704G0("user property", AbstractC0959zp.f9890u, null, str)) {
            return 15;
        }
        ((f02) this.f7192j).getClass();
        return !m1705H0(24, "user property", str) ? 6 : 0;
    }

    /* JADX INFO: renamed from: L */
    public final void m1712L(ly1 ly1Var, int i) {
        Bundle bundle = ly1Var.f4927e;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (m1680B0(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String string = sb.toString();
                    f02 f02Var = (f02) this.f7192j;
                    ky1 ky1Var = f02Var.f2247o;
                    cy1 cy1Var = f02Var.f2251s;
                    f02.m1560m(ky1Var);
                    ky1Var.f4602q.m5314c(cy1Var.m1043a(ly1Var.f4923a), cy1Var.m1047e(bundle), string);
                    m1689Z(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final int m1713L0(String str) {
        if (!m1700E0("event param", str)) {
            return 3;
        }
        if (!m1704G0("event param", null, null, str)) {
            return 14;
        }
        ((f02) this.f7192j).getClass();
        return !m1705H0(40, "event param", str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: M */
    public final void m1714M(Parcelable[] parcelableArr, int i) {
        p80.m3863h(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m1680B0(str) && !m1690c0(str, AbstractC0875xf.f8946h) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        f02 f02Var = (f02) this.f7192j;
                        ky1 ky1Var = f02Var.f2247o;
                        cy1 cy1Var = f02Var.f2251s;
                        f02.m1560m(ky1Var);
                        wc1 wc1Var = ky1Var.f4602q;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        wc1Var.m5314c(cy1Var.m1044b(str), cy1Var.m1047e(bundle), sb.toString());
                    }
                    m1689Z(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final int m1715M0(String str) {
        if (!m1702F0("event param", str)) {
            return 3;
        }
        if (!m1704G0("event param", null, null, str)) {
            return 14;
        }
        ((f02) this.f7192j).getClass();
        return !m1705H0(40, "event param", str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: N */
    public final void m1716N(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                f72 f72Var = ((f02) this.f7192j).f2250r;
                f02.m1558k(f72Var);
                f72Var.m1720R(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m1717O(Bundle bundle, int i, String str, Object obj) {
        if (m1689Z(i, bundle)) {
            ((f02) this.f7192j).getClass();
            bundle.putString("_ev", m1682H(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final int m1718P(Object obj, String str) {
        return "_ldl".equals(str) ? m1699E("user property referrer", str, m1724b0(str), obj) : m1699E("user property", str, m1724b0(str), obj) ? 0 : 7;
    }

    /* JADX INFO: renamed from: Q */
    public final Object m1719Q(Object obj, String str) {
        return "_ldl".equals(str) ? m1723a0(m1724b0(str), obj, true, false) : m1723a0(m1724b0(str), obj, false, false);
    }

    /* JADX INFO: renamed from: R */
    public final void m1720R(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            f02 f02Var = (f02) this.f7192j;
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4605t.m5314c(f02Var.f2251s.m1044b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    /* JADX INFO: renamed from: W */
    public final en0 m1721W() {
        dn0 dn0Var;
        if (this.f2343o == null) {
            Context context = ((f02) this.f7192j).f2242j;
            context.getClass();
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i = Build.VERSION.SDK_INT;
            C0235g3 c0235g3 = C0235g3.f2588a;
            sb.append(i >= 33 ? c0235g3.m1974a() : 0);
            Log.d("MeasurementManager", sb.toString());
            if ((i >= 33 ? c0235g3.m1974a() : 0) >= 5) {
                dn0Var = new dn0(context, 1);
            } else {
                C0197f3 c0197f3 = C0197f3.f2281a;
                if (((i == 31 || i == 32) ? c0197f3.m1583a() : 0) >= 9) {
                    try {
                        dn0Var = new dn0(context, 0);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i2 = Build.VERSION.SDK_INT;
                        sb2.append((i2 == 31 || i2 == 32) ? c0197f3.m1583a() : 0);
                        Log.d("MeasurementManager", sb2.toString());
                        dn0Var = null;
                    }
                } else {
                    dn0Var = null;
                }
            }
            this.f2343o = dn0Var != null ? new en0(dn0Var) : null;
        }
        return this.f2343o;
    }

    /* JADX INFO: renamed from: Y */
    public final long m1722Y() {
        long j;
        boolean zBooleanValue;
        Integer num;
        Object e;
        mo11z();
        f02 f02Var = (f02) this.f7192j;
        vx1 vx1VarM1575r = f02Var.m1575r();
        ky1 ky1Var = f02Var.f2247o;
        if (!m1691d0((String) jx1.f4207q0.m2715a(null), vx1VarM1575r.m5219G())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = m1688X() < ((Integer) jx1.f4195k0.m2715a(null)).intValue() ? 16L : 0L;
        }
        if (!m1725e0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.f2344p == null) {
                en0 en0VarM1721W = m1721W();
                zBooleanValue = false;
                if (en0VarM1721W != null) {
                    try {
                        num = (Integer) en0VarM1721W.m1470b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
                                e = e2;
                                f02.m1560m(ky1Var);
                                ky1Var.f4603r.m5313b(e, "Measurement manager api exception");
                                this.f2344p = Boolean.FALSE;
                            }
                        }
                        this.f2344p = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e3) {
                        num = null;
                        e = e3;
                    }
                    f02.m1560m(ky1Var);
                    ky1Var.f4608w.m5313b(num, "Measurement manager api status result");
                    zBooleanValue = this.f2344p.booleanValue();
                }
            } else {
                zBooleanValue = this.f2344p.booleanValue();
            }
            if (!zBooleanValue) {
                j = 64;
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    /* JADX INFO: renamed from: a0 */
    public final Object m1723a0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m1682H(i, obj.toString(), z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleM1727h0 = m1727h0((Bundle) parcelable);
                if (!bundleM1727h0.isEmpty()) {
                    arrayList.add(bundleM1727h0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: b0 */
    public final int m1724b0(String str) {
        f02 f02Var = (f02) this.f7192j;
        if ("_ldl".equals(str)) {
            f02Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            f02Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            f02Var.getClass();
            return 100;
        }
        f02Var.getClass();
        return 36;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m1725e0(String str) {
        mo11z();
        f02 f02Var = (f02) this.f7192j;
        if (tk1.m4792a(f02Var.f2242j).f2181k.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        ky1 ky1Var = f02Var.f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4607v.m5313b(str, "Permission not granted");
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m1726g0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((f02) this.f7192j).f2245m.m763E("debug.firebase.analytics.app").equals(str);
    }

    /* JADX INFO: renamed from: h0 */
    public final Bundle m1727h0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM1708J = m1708J(bundle.get(str), str);
                if (objM1708J == null) {
                    f02 f02Var = (f02) this.f7192j;
                    ky1 ky1Var = f02Var.f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4605t.m5313b(f02Var.f2251s.m1044b(str), "Param value can't be null");
                } else {
                    m1720R(bundle2, str, objM1708J);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: i0 */
    public final fu1 m1728i0(String str, Bundle bundle, String str2, long j, long j2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m1707I0(str) != 0) {
            f02 f02Var = (f02) this.f7192j;
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5313b(f02Var.f2251s.m1045c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleM1710K = m1710K(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleM1710K = m1727h0(bundleM1710K);
        }
        p80.m3863h(bundleM1710K);
        return new fu1(str, new eu1(bundleM1710K), str2, j, j2);
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m1729j0(Context context, String str) {
        Signature[] signatureArr;
        f02 f02Var = (f02) this.f7192j;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoM1502e = tk1.m4792a(context).m1502e(str, 64);
            if (packageInfoM1502e == null || (signatureArr = packageInfoM1502e.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5313b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5313b(e2, "Error obtaining certificate");
            return true;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m1730l0(int i) {
        Boolean bool = ((f02) this.f7192j).m1573p().f8066n;
        if (m1731m0() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: m0 */
    public final int m1731m0() {
        if (this.f2345q == null) {
            f02 f02Var = (f02) this.f7192j;
            i90 i90Var = i90.f3485b;
            Context context = f02Var.f2242j;
            i90Var.getClass();
            int i = o90.f5673e;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f2345q = Integer.valueOf(i2 / 1000);
        }
        return this.f2345q.intValue();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m1732n0(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5313b(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m1733o0(String str, gv1 gv1Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            gv1Var.mo785n(bundle);
        } catch (RemoteException e) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5313b(e, "Error returning string value to wrapper");
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m1734p0(gv1 gv1Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            gv1Var.mo785n(bundle);
        } catch (RemoteException e) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5313b(e, "Error returning long value to wrapper");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m1735q0(gv1 gv1Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            gv1Var.mo785n(bundle);
        } catch (RemoteException e) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5313b(e, "Error returning int value to wrapper");
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m1736r0(gv1 gv1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            gv1Var.mo785n(bundle);
        } catch (RemoteException e) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5313b(e, "Error returning byte array to wrapper");
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m1737s0(gv1 gv1Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            gv1Var.mo785n(bundle);
        } catch (RemoteException e) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5313b(e, "Error returning boolean value to wrapper");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m1738t0(gv1 gv1Var, Bundle bundle) {
        try {
            gv1Var.mo785n(bundle);
        } catch (RemoteException e) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5313b(e, "Error returning bundle value to wrapper");
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1739u0(gv1 gv1Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            gv1Var.mo785n(bundle);
        } catch (RemoteException e) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5313b(e, "Error returning bundle list to wrapper");
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final String m1740y0() {
        byte[] bArr = new byte[16];
        m1697A0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX INFO: renamed from: z0 */
    public final long m1741z0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.f2341m;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f2341m;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((f02) this.f7192j).f2252t.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.f2342n + 1;
            this.f2342n = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }
}
