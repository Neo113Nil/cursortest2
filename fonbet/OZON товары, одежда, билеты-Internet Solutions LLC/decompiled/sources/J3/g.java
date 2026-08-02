package J3;

import J3.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.recyclerview.widget.m;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.AbstractC5881z;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.HashMap;
import java.util.Locale;
import m3.C8053F;
import m3.C8060b;
import m3.InterfaceC8064f;
import m3.N;
import m3.y;
import org.maplibre.android.log.Logger;
import p3.InterfaceC8846f;
import p3.z;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes.dex */
public final class g implements d, z {

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC5880y<Long> f13765p = AbstractC5880y.A(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: q, reason: collision with root package name */
    public static final AbstractC5880y<Long> f13766q = AbstractC5880y.A(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: r, reason: collision with root package name */
    public static final AbstractC5880y<Long> f13767r = AbstractC5880y.A(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC5880y<Long> f13768s = AbstractC5880y.A(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: t, reason: collision with root package name */
    public static final AbstractC5880y<Long> f13769t = AbstractC5880y.A(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: u, reason: collision with root package name */
    public static final AbstractC5880y<Long> f13770u = AbstractC5880y.A(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: v, reason: collision with root package name */
    @SuppressLint({"NonFinalStaticField", "StaticFieldLeak"})
    private static g f13771v;

    /* renamed from: a, reason: collision with root package name */
    private final Context f13772a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5881z<Integer, Long> f13773b;

    /* renamed from: c, reason: collision with root package name */
    private final d.a.C0260a f13774c;

    /* renamed from: d, reason: collision with root package name */
    private final C8053F f13775d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f13776e;

    /* renamed from: f, reason: collision with root package name */
    private final n f13777f;

    /* renamed from: g, reason: collision with root package name */
    private int f13778g;

    /* renamed from: h, reason: collision with root package name */
    private long f13779h;

    /* renamed from: i, reason: collision with root package name */
    private long f13780i;

    /* renamed from: j, reason: collision with root package name */
    private long f13781j;

    /* renamed from: k, reason: collision with root package name */
    private long f13782k;

    /* renamed from: l, reason: collision with root package name */
    private long f13783l;

    /* renamed from: m, reason: collision with root package name */
    private long f13784m;

    /* renamed from: n, reason: collision with root package name */
    private int f13785n;

    /* renamed from: o, reason: collision with root package name */
    private String f13786o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f13787a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f13788b;

        /* renamed from: c, reason: collision with root package name */
        private int f13789c;

        /* renamed from: d, reason: collision with root package name */
        private C8053F f13790d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f13791e;

        public a(Context context) {
            this.f13787a = context == null ? null : context.getApplicationContext();
            this.f13789c = 2000;
            this.f13790d = InterfaceC8064f.f74315a;
            this.f13791e = true;
            HashMap hashMap = new HashMap(8);
            this.f13788b = hashMap;
            hashMap.put(0, 1000000L);
            hashMap.put(2, -9223372036854775807L);
            hashMap.put(3, -9223372036854775807L);
            hashMap.put(4, -9223372036854775807L);
            hashMap.put(5, -9223372036854775807L);
            hashMap.put(10, -9223372036854775807L);
            hashMap.put(9, -9223372036854775807L);
            hashMap.put(7, -9223372036854775807L);
        }

        public final g a() {
            return new g(this.f13787a, this.f13788b, this.f13789c, this.f13790d, this.f13791e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [J3.f] */
    g(Context context, HashMap hashMap, int i11, C8053F c8053f, boolean z11) {
        this.f13772a = context == null ? null : context.getApplicationContext();
        this.f13773b = AbstractC5881z.h(hashMap);
        this.f13774c = new d.a.C0260a();
        this.f13777f = new n(i11);
        this.f13775d = c8053f;
        this.f13776e = z11;
        if (context == null) {
            this.f13785n = 0;
            this.f13783l = 1000000L;
            return;
        }
        y d11 = y.d(context);
        int e11 = d11.e();
        this.f13785n = e11;
        this.f13783l = f(e11);
        d11.f(new y.b() { // from class: J3.f
            @Override // m3.y.b
            public final void a(int i12) {
                g.e(g.this, i12);
            }
        }, C8060b.b());
    }

    public static void e(g gVar, int i11) {
        String c11;
        TelephonyManager telephonyManager;
        synchronized (gVar) {
            int i12 = gVar.f13785n;
            if (i12 == 0 || gVar.f13776e) {
                if (i12 != i11 || gVar.f13786o == null) {
                    gVar.f13785n = i11;
                    if (i11 != 1 && i11 != 0 && i11 != 8) {
                        if (gVar.f13786o == null) {
                            Context context = gVar.f13772a;
                            int i13 = N.f74289a;
                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                    c11 = O7.b.c(networkCountryIso);
                                    gVar.f13786o = c11;
                                }
                            }
                            c11 = O7.b.c(Locale.getDefault().getCountry());
                            gVar.f13786o = c11;
                        }
                        gVar.f13783l = gVar.f(i11);
                        gVar.f13775d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i14 = gVar.f13778g > 0 ? (int) (elapsedRealtime - gVar.f13779h) : 0;
                        long j11 = gVar.f13780i;
                        long j12 = gVar.f13783l;
                        if (i14 != 0 || j11 != 0 || j12 != gVar.f13784m) {
                            gVar.f13784m = j12;
                            gVar.f13774c.b(i14, j11, j12);
                        }
                        gVar.f13779h = elapsedRealtime;
                        gVar.f13780i = 0L;
                        gVar.f13782k = 0L;
                        gVar.f13781j = 0L;
                        gVar.f13777f.c();
                    }
                }
            }
        }
    }

    private long f(int i11) {
        char c11;
        int[] iArr;
        long longValue;
        Integer valueOf = Integer.valueOf(i11);
        AbstractC5881z<Integer, Long> abstractC5881z = this.f13773b;
        Long l11 = abstractC5881z.get(valueOf);
        if (l11 == null) {
            l11 = abstractC5881z.get(0);
        } else if (l11.longValue() == -9223372036854775807L) {
            String str = this.f13786o;
            if (str == null) {
                str = "";
            }
            char c12 = 65535;
            switch (str.hashCode()) {
                case 2083:
                    c11 = 1;
                    if (str.equals("AD")) {
                        c12 = 0;
                        break;
                    }
                    break;
                case 2084:
                    c11 = 1;
                    if (str.equals("AE")) {
                        c12 = 1;
                        break;
                    }
                    break;
                case 2085:
                    c11 = 1;
                    if (str.equals("AF")) {
                        c12 = 2;
                        break;
                    }
                    break;
                case 2086:
                    c11 = 1;
                    if (str.equals("AG")) {
                        c12 = 3;
                        break;
                    }
                    break;
                case 2088:
                    c11 = 1;
                    if (str.equals("AI")) {
                        c12 = 4;
                        break;
                    }
                    break;
                case 2091:
                    c11 = 1;
                    if (str.equals("AL")) {
                        c12 = 5;
                        break;
                    }
                    break;
                case 2092:
                    c11 = 1;
                    if (str.equals("AM")) {
                        c12 = 6;
                        break;
                    }
                    break;
                case 2094:
                    c11 = 1;
                    if (str.equals("AO")) {
                        c12 = 7;
                        break;
                    }
                    break;
                case 2096:
                    c11 = 1;
                    if (str.equals("AQ")) {
                        c12 = '\b';
                        break;
                    }
                    break;
                case 2097:
                    c11 = 1;
                    if (str.equals("AR")) {
                        c12 = '\t';
                        break;
                    }
                    break;
                case 2098:
                    c11 = 1;
                    if (str.equals("AS")) {
                        c12 = '\n';
                        break;
                    }
                    break;
                case 2099:
                    c11 = 1;
                    if (str.equals("AT")) {
                        c12 = 11;
                        break;
                    }
                    break;
                case 2100:
                    c11 = 1;
                    if (str.equals("AU")) {
                        c12 = '\f';
                        break;
                    }
                    break;
                case 2102:
                    c11 = 1;
                    if (str.equals("AW")) {
                        c12 = '\r';
                        break;
                    }
                    break;
                case 2103:
                    c11 = 1;
                    if (str.equals("AX")) {
                        c12 = 14;
                        break;
                    }
                    break;
                case 2105:
                    c11 = 1;
                    if (str.equals("AZ")) {
                        c12 = 15;
                        break;
                    }
                    break;
                case 2111:
                    c11 = 1;
                    if (str.equals("BA")) {
                        c12 = 16;
                        break;
                    }
                    break;
                case 2112:
                    c11 = 1;
                    if (str.equals("BB")) {
                        c12 = 17;
                        break;
                    }
                    break;
                case 2114:
                    c11 = 1;
                    if (str.equals("BD")) {
                        c12 = 18;
                        break;
                    }
                    break;
                case 2115:
                    c11 = 1;
                    if (str.equals("BE")) {
                        c12 = 19;
                        break;
                    }
                    break;
                case 2116:
                    c11 = 1;
                    if (str.equals("BF")) {
                        c12 = 20;
                        break;
                    }
                    break;
                case 2117:
                    c11 = 1;
                    if (str.equals("BG")) {
                        c12 = 21;
                        break;
                    }
                    break;
                case 2118:
                    c11 = 1;
                    if (str.equals("BH")) {
                        c12 = 22;
                        break;
                    }
                    break;
                case 2119:
                    c11 = 1;
                    if (str.equals("BI")) {
                        c12 = 23;
                        break;
                    }
                    break;
                case 2120:
                    c11 = 1;
                    if (str.equals("BJ")) {
                        c12 = 24;
                        break;
                    }
                    break;
                case 2122:
                    c11 = 1;
                    if (str.equals("BL")) {
                        c12 = 25;
                        break;
                    }
                    break;
                case 2123:
                    c11 = 1;
                    if (str.equals("BM")) {
                        c12 = 26;
                        break;
                    }
                    break;
                case 2124:
                    c11 = 1;
                    if (str.equals("BN")) {
                        c12 = 27;
                        break;
                    }
                    break;
                case 2125:
                    c11 = 1;
                    if (str.equals("BO")) {
                        c12 = 28;
                        break;
                    }
                    break;
                case 2127:
                    c11 = 1;
                    if (str.equals("BQ")) {
                        c12 = 29;
                        break;
                    }
                    break;
                case 2128:
                    c11 = 1;
                    if (str.equals("BR")) {
                        c12 = 30;
                        break;
                    }
                    break;
                case 2129:
                    c11 = 1;
                    if (str.equals("BS")) {
                        c12 = 31;
                        break;
                    }
                    break;
                case 2130:
                    c11 = 1;
                    if (str.equals("BT")) {
                        c12 = ' ';
                        break;
                    }
                    break;
                case 2133:
                    c11 = 1;
                    if (str.equals("BW")) {
                        c12 = '!';
                        break;
                    }
                    break;
                case 2135:
                    c11 = 1;
                    if (str.equals("BY")) {
                        c12 = '\"';
                        break;
                    }
                    break;
                case 2136:
                    c11 = 1;
                    if (str.equals("BZ")) {
                        c12 = '#';
                        break;
                    }
                    break;
                case 2142:
                    c11 = 1;
                    if (str.equals("CA")) {
                        c12 = '$';
                        break;
                    }
                    break;
                case 2145:
                    c11 = 1;
                    if (str.equals("CD")) {
                        c12 = '%';
                        break;
                    }
                    break;
                case 2147:
                    c11 = 1;
                    if (str.equals("CF")) {
                        c12 = '&';
                        break;
                    }
                    break;
                case 2148:
                    c11 = 1;
                    if (str.equals("CG")) {
                        c12 = '\'';
                        break;
                    }
                    break;
                case 2149:
                    c11 = 1;
                    if (str.equals("CH")) {
                        c12 = '(';
                        break;
                    }
                    break;
                case 2150:
                    c11 = 1;
                    if (str.equals("CI")) {
                        c12 = ')';
                        break;
                    }
                    break;
                case 2152:
                    c11 = 1;
                    if (str.equals("CK")) {
                        c12 = '*';
                        break;
                    }
                    break;
                case 2153:
                    c11 = 1;
                    if (str.equals("CL")) {
                        c12 = '+';
                        break;
                    }
                    break;
                case 2154:
                    c11 = 1;
                    if (str.equals("CM")) {
                        c12 = ',';
                        break;
                    }
                    break;
                case 2155:
                    c11 = 1;
                    if (str.equals("CN")) {
                        c12 = '-';
                        break;
                    }
                    break;
                case 2156:
                    c11 = 1;
                    if (str.equals("CO")) {
                        c12 = '.';
                        break;
                    }
                    break;
                case 2159:
                    c11 = 1;
                    if (str.equals("CR")) {
                        c12 = '/';
                        break;
                    }
                    break;
                case 2162:
                    c11 = 1;
                    if (str.equals("CU")) {
                        c12 = '0';
                        break;
                    }
                    break;
                case 2163:
                    c11 = 1;
                    if (str.equals("CV")) {
                        c12 = '1';
                        break;
                    }
                    break;
                case 2164:
                    c11 = 1;
                    if (str.equals("CW")) {
                        c12 = '2';
                        break;
                    }
                    break;
                case 2165:
                    c11 = 1;
                    if (str.equals("CX")) {
                        c12 = '3';
                        break;
                    }
                    break;
                case 2166:
                    c11 = 1;
                    if (str.equals("CY")) {
                        c12 = '4';
                        break;
                    }
                    break;
                case 2167:
                    c11 = 1;
                    if (str.equals("CZ")) {
                        c12 = '5';
                        break;
                    }
                    break;
                case 2177:
                    c11 = 1;
                    if (str.equals("DE")) {
                        c12 = '6';
                        break;
                    }
                    break;
                case 2182:
                    c11 = 1;
                    if (str.equals("DJ")) {
                        c12 = '7';
                        break;
                    }
                    break;
                case 2183:
                    c11 = 1;
                    if (str.equals("DK")) {
                        c12 = '8';
                        break;
                    }
                    break;
                case 2185:
                    c11 = 1;
                    if (str.equals("DM")) {
                        c12 = '9';
                        break;
                    }
                    break;
                case 2187:
                    c11 = 1;
                    if (str.equals("DO")) {
                        c12 = ':';
                        break;
                    }
                    break;
                case 2198:
                    c11 = 1;
                    if (str.equals("DZ")) {
                        c12 = ';';
                        break;
                    }
                    break;
                case 2206:
                    c11 = 1;
                    if (str.equals("EC")) {
                        c12 = '<';
                        break;
                    }
                    break;
                case 2208:
                    c11 = 1;
                    if (str.equals("EE")) {
                        c12 = '=';
                        break;
                    }
                    break;
                case 2210:
                    c11 = 1;
                    if (str.equals("EG")) {
                        c12 = '>';
                        break;
                    }
                    break;
                case 2221:
                    c11 = 1;
                    if (str.equals("ER")) {
                        c12 = '?';
                        break;
                    }
                    break;
                case 2222:
                    c11 = 1;
                    if (str.equals("ES")) {
                        c12 = '@';
                        break;
                    }
                    break;
                case 2223:
                    c11 = 1;
                    if (str.equals("ET")) {
                        c12 = 'A';
                        break;
                    }
                    break;
                case 2243:
                    c11 = 1;
                    if (str.equals("FI")) {
                        c12 = 'B';
                        break;
                    }
                    break;
                case 2244:
                    c11 = 1;
                    if (str.equals("FJ")) {
                        c12 = 'C';
                        break;
                    }
                    break;
                case 2245:
                    c11 = 1;
                    if (str.equals("FK")) {
                        c12 = 'D';
                        break;
                    }
                    break;
                case 2247:
                    c11 = 1;
                    if (str.equals("FM")) {
                        c12 = 'E';
                        break;
                    }
                    break;
                case 2249:
                    c11 = 1;
                    if (str.equals("FO")) {
                        c12 = 'F';
                        break;
                    }
                    break;
                case 2252:
                    c11 = 1;
                    if (str.equals("FR")) {
                        c12 = 'G';
                        break;
                    }
                    break;
                case 2266:
                    c11 = 1;
                    if (str.equals("GA")) {
                        c12 = 'H';
                        break;
                    }
                    break;
                case 2267:
                    c11 = 1;
                    if (str.equals("GB")) {
                        c12 = 'I';
                        break;
                    }
                    break;
                case 2269:
                    c11 = 1;
                    if (str.equals("GD")) {
                        c12 = 'J';
                        break;
                    }
                    break;
                case 2270:
                    c11 = 1;
                    if (str.equals("GE")) {
                        c12 = 'K';
                        break;
                    }
                    break;
                case 2271:
                    c11 = 1;
                    if (str.equals("GF")) {
                        c12 = 'L';
                        break;
                    }
                    break;
                case 2272:
                    c11 = 1;
                    if (str.equals("GG")) {
                        c12 = 'M';
                        break;
                    }
                    break;
                case 2273:
                    c11 = 1;
                    if (str.equals("GH")) {
                        c12 = 'N';
                        break;
                    }
                    break;
                case 2274:
                    c11 = 1;
                    if (str.equals("GI")) {
                        c12 = 'O';
                        break;
                    }
                    break;
                case 2277:
                    c11 = 1;
                    if (str.equals("GL")) {
                        c12 = 'P';
                        break;
                    }
                    break;
                case 2278:
                    c11 = 1;
                    if (str.equals("GM")) {
                        c12 = 'Q';
                        break;
                    }
                    break;
                case 2279:
                    c11 = 1;
                    if (str.equals("GN")) {
                        c12 = 'R';
                        break;
                    }
                    break;
                case 2281:
                    c11 = 1;
                    if (str.equals("GP")) {
                        c12 = 'S';
                        break;
                    }
                    break;
                case 2282:
                    c11 = 1;
                    if (str.equals("GQ")) {
                        c12 = 'T';
                        break;
                    }
                    break;
                case 2283:
                    c11 = 1;
                    if (str.equals("GR")) {
                        c12 = 'U';
                        break;
                    }
                    break;
                case 2285:
                    c11 = 1;
                    if (str.equals("GT")) {
                        c12 = 'V';
                        break;
                    }
                    break;
                case 2286:
                    c11 = 1;
                    if (str.equals("GU")) {
                        c12 = 'W';
                        break;
                    }
                    break;
                case 2288:
                    c11 = 1;
                    if (str.equals("GW")) {
                        c12 = 'X';
                        break;
                    }
                    break;
                case 2290:
                    c11 = 1;
                    if (str.equals("GY")) {
                        c12 = 'Y';
                        break;
                    }
                    break;
                case 2307:
                    c11 = 1;
                    if (str.equals("HK")) {
                        c12 = 'Z';
                        break;
                    }
                    break;
                case 2314:
                    c11 = 1;
                    if (str.equals("HR")) {
                        c12 = '[';
                        break;
                    }
                    break;
                case 2316:
                    c11 = 1;
                    if (str.equals("HT")) {
                        c12 = '\\';
                        break;
                    }
                    break;
                case 2317:
                    c11 = 1;
                    if (str.equals("HU")) {
                        c12 = ']';
                        break;
                    }
                    break;
                case 2331:
                    c11 = 1;
                    if (str.equals("ID")) {
                        c12 = '^';
                        break;
                    }
                    break;
                case 2332:
                    c11 = 1;
                    if (str.equals("IE")) {
                        c12 = '_';
                        break;
                    }
                    break;
                case 2339:
                    c11 = 1;
                    if (str.equals("IL")) {
                        c12 = '`';
                        break;
                    }
                    break;
                case 2340:
                    c11 = 1;
                    if (str.equals("IM")) {
                        c12 = 'a';
                        break;
                    }
                    break;
                case 2341:
                    c11 = 1;
                    if (str.equals("IN")) {
                        c12 = 'b';
                        break;
                    }
                    break;
                case 2342:
                    c11 = 1;
                    if (str.equals("IO")) {
                        c12 = 'c';
                        break;
                    }
                    break;
                case 2344:
                    c11 = 1;
                    if (str.equals("IQ")) {
                        c12 = 'd';
                        break;
                    }
                    break;
                case 2345:
                    c11 = 1;
                    if (str.equals("IR")) {
                        c12 = 'e';
                        break;
                    }
                    break;
                case 2346:
                    c11 = 1;
                    if (str.equals("IS")) {
                        c12 = 'f';
                        break;
                    }
                    break;
                case 2347:
                    c11 = 1;
                    if (str.equals("IT")) {
                        c12 = 'g';
                        break;
                    }
                    break;
                case 2363:
                    c11 = 1;
                    if (str.equals("JE")) {
                        c12 = 'h';
                        break;
                    }
                    break;
                case 2371:
                    c11 = 1;
                    if (str.equals("JM")) {
                        c12 = 'i';
                        break;
                    }
                    break;
                case 2373:
                    c11 = 1;
                    if (str.equals("JO")) {
                        c12 = 'j';
                        break;
                    }
                    break;
                case 2374:
                    c11 = 1;
                    if (str.equals("JP")) {
                        c12 = 'k';
                        break;
                    }
                    break;
                case 2394:
                    c11 = 1;
                    if (str.equals("KE")) {
                        c12 = 'l';
                        break;
                    }
                    break;
                case 2396:
                    c11 = 1;
                    if (str.equals("KG")) {
                        c12 = 'm';
                        break;
                    }
                    break;
                case 2397:
                    c11 = 1;
                    if (str.equals("KH")) {
                        c12 = 'n';
                        break;
                    }
                    break;
                case 2398:
                    c11 = 1;
                    if (str.equals("KI")) {
                        c12 = 'o';
                        break;
                    }
                    break;
                case 2402:
                    c11 = 1;
                    if (str.equals("KM")) {
                        c12 = 'p';
                        break;
                    }
                    break;
                case 2403:
                    c11 = 1;
                    if (str.equals("KN")) {
                        c12 = 'q';
                        break;
                    }
                    break;
                case 2407:
                    c11 = 1;
                    if (str.equals("KR")) {
                        c12 = 'r';
                        break;
                    }
                    break;
                case 2412:
                    c11 = 1;
                    if (str.equals("KW")) {
                        c12 = 's';
                        break;
                    }
                    break;
                case 2414:
                    c11 = 1;
                    if (str.equals("KY")) {
                        c12 = 't';
                        break;
                    }
                    break;
                case 2415:
                    c11 = 1;
                    if (str.equals("KZ")) {
                        c12 = 'u';
                        break;
                    }
                    break;
                case 2421:
                    c11 = 1;
                    if (str.equals("LA")) {
                        c12 = 'v';
                        break;
                    }
                    break;
                case 2422:
                    c11 = 1;
                    if (str.equals("LB")) {
                        c12 = 'w';
                        break;
                    }
                    break;
                case 2423:
                    c11 = 1;
                    if (str.equals("LC")) {
                        c12 = 'x';
                        break;
                    }
                    break;
                case 2429:
                    c11 = 1;
                    if (str.equals("LI")) {
                        c12 = 'y';
                        break;
                    }
                    break;
                case 2431:
                    c11 = 1;
                    if (str.equals("LK")) {
                        c12 = 'z';
                        break;
                    }
                    break;
                case 2438:
                    c11 = 1;
                    if (str.equals("LR")) {
                        c12 = '{';
                        break;
                    }
                    break;
                case 2439:
                    c11 = 1;
                    if (str.equals("LS")) {
                        c12 = '|';
                        break;
                    }
                    break;
                case 2440:
                    c11 = 1;
                    if (str.equals("LT")) {
                        c12 = '}';
                        break;
                    }
                    break;
                case 2441:
                    c11 = 1;
                    if (str.equals("LU")) {
                        c12 = '~';
                        break;
                    }
                    break;
                case 2442:
                    c11 = 1;
                    if (str.equals("LV")) {
                        c12 = 127;
                        break;
                    }
                    break;
                case 2445:
                    c11 = 1;
                    if (str.equals("LY")) {
                        c12 = 128;
                        break;
                    }
                    break;
                case 2452:
                    c11 = 1;
                    if (str.equals("MA")) {
                        c12 = 129;
                        break;
                    }
                    break;
                case 2454:
                    c11 = 1;
                    if (str.equals("MC")) {
                        c12 = 130;
                        break;
                    }
                    break;
                case 2455:
                    c11 = 1;
                    if (str.equals("MD")) {
                        c12 = 131;
                        break;
                    }
                    break;
                case 2456:
                    c11 = 1;
                    if (str.equals("ME")) {
                        c12 = 132;
                        break;
                    }
                    break;
                case 2457:
                    c11 = 1;
                    if (str.equals("MF")) {
                        c12 = 133;
                        break;
                    }
                    break;
                case 2458:
                    c11 = 1;
                    if (str.equals("MG")) {
                        c12 = 134;
                        break;
                    }
                    break;
                case 2459:
                    c11 = 1;
                    if (str.equals("MH")) {
                        c12 = 135;
                        break;
                    }
                    break;
                case 2462:
                    c11 = 1;
                    if (str.equals("MK")) {
                        c12 = 136;
                        break;
                    }
                    break;
                case 2463:
                    c11 = 1;
                    if (str.equals("ML")) {
                        c12 = 137;
                        break;
                    }
                    break;
                case 2464:
                    c11 = 1;
                    if (str.equals("MM")) {
                        c12 = 138;
                        break;
                    }
                    break;
                case 2465:
                    c11 = 1;
                    if (str.equals("MN")) {
                        c12 = 139;
                        break;
                    }
                    break;
                case 2466:
                    c11 = 1;
                    if (str.equals("MO")) {
                        c12 = 140;
                        break;
                    }
                    break;
                case 2467:
                    c11 = 1;
                    if (str.equals("MP")) {
                        c12 = 141;
                        break;
                    }
                    break;
                case 2468:
                    c11 = 1;
                    if (str.equals("MQ")) {
                        c12 = 142;
                        break;
                    }
                    break;
                case 2469:
                    c11 = 1;
                    if (str.equals("MR")) {
                        c12 = 143;
                        break;
                    }
                    break;
                case 2470:
                    c11 = 1;
                    if (str.equals("MS")) {
                        c12 = 144;
                        break;
                    }
                    break;
                case 2471:
                    c11 = 1;
                    if (str.equals("MT")) {
                        c12 = 145;
                        break;
                    }
                    break;
                case 2472:
                    c11 = 1;
                    if (str.equals("MU")) {
                        c12 = 146;
                        break;
                    }
                    break;
                case 2473:
                    c11 = 1;
                    if (str.equals("MV")) {
                        c12 = 147;
                        break;
                    }
                    break;
                case 2474:
                    c11 = 1;
                    if (str.equals("MW")) {
                        c12 = 148;
                        break;
                    }
                    break;
                case 2475:
                    c11 = 1;
                    if (str.equals("MX")) {
                        c12 = 149;
                        break;
                    }
                    break;
                case 2476:
                    c11 = 1;
                    if (str.equals("MY")) {
                        c12 = 150;
                        break;
                    }
                    break;
                case 2477:
                    c11 = 1;
                    if (str.equals("MZ")) {
                        c12 = 151;
                        break;
                    }
                    break;
                case 2483:
                    c11 = 1;
                    if (str.equals("NA")) {
                        c12 = 152;
                        break;
                    }
                    break;
                case 2485:
                    c11 = 1;
                    if (str.equals("NC")) {
                        c12 = 153;
                        break;
                    }
                    break;
                case 2487:
                    c11 = 1;
                    if (str.equals("NE")) {
                        c12 = 154;
                        break;
                    }
                    break;
                case 2488:
                    c11 = 1;
                    if (str.equals("NF")) {
                        c12 = 155;
                        break;
                    }
                    break;
                case 2489:
                    c11 = 1;
                    if (str.equals("NG")) {
                        c12 = 156;
                        break;
                    }
                    break;
                case 2491:
                    c11 = 1;
                    if (str.equals("NI")) {
                        c12 = 157;
                        break;
                    }
                    break;
                case 2494:
                    c11 = 1;
                    if (str.equals("NL")) {
                        c12 = 158;
                        break;
                    }
                    break;
                case 2497:
                    c11 = 1;
                    if (str.equals("NO")) {
                        c12 = 159;
                        break;
                    }
                    break;
                case 2498:
                    c11 = 1;
                    if (str.equals("NP")) {
                        c12 = 160;
                        break;
                    }
                    break;
                case 2500:
                    c11 = 1;
                    if (str.equals("NR")) {
                        c12 = 161;
                        break;
                    }
                    break;
                case 2503:
                    c11 = 1;
                    if (str.equals("NU")) {
                        c12 = 162;
                        break;
                    }
                    break;
                case 2508:
                    c11 = 1;
                    if (str.equals("NZ")) {
                        c12 = 163;
                        break;
                    }
                    break;
                case 2526:
                    c11 = 1;
                    if (str.equals("OM")) {
                        c12 = 164;
                        break;
                    }
                    break;
                case 2545:
                    c11 = 1;
                    if (str.equals("PA")) {
                        c12 = 165;
                        break;
                    }
                    break;
                case 2549:
                    c11 = 1;
                    if (str.equals("PE")) {
                        c12 = 166;
                        break;
                    }
                    break;
                case 2550:
                    c11 = 1;
                    if (str.equals("PF")) {
                        c12 = 167;
                        break;
                    }
                    break;
                case 2551:
                    c11 = 1;
                    if (str.equals("PG")) {
                        c12 = 168;
                        break;
                    }
                    break;
                case 2552:
                    c11 = 1;
                    if (str.equals("PH")) {
                        c12 = 169;
                        break;
                    }
                    break;
                case 2555:
                    c11 = 1;
                    if (str.equals("PK")) {
                        c12 = 170;
                        break;
                    }
                    break;
                case 2556:
                    c11 = 1;
                    if (str.equals("PL")) {
                        c12 = 171;
                        break;
                    }
                    break;
                case 2557:
                    c11 = 1;
                    if (str.equals("PM")) {
                        c12 = 172;
                        break;
                    }
                    break;
                case 2562:
                    c11 = 1;
                    if (str.equals("PR")) {
                        c12 = 173;
                        break;
                    }
                    break;
                case 2563:
                    c11 = 1;
                    if (str.equals("PS")) {
                        c12 = 174;
                        break;
                    }
                    break;
                case 2564:
                    c11 = 1;
                    if (str.equals("PT")) {
                        c12 = 175;
                        break;
                    }
                    break;
                case 2567:
                    c11 = 1;
                    if (str.equals("PW")) {
                        c12 = 176;
                        break;
                    }
                    break;
                case 2569:
                    c11 = 1;
                    if (str.equals("PY")) {
                        c12 = 177;
                        break;
                    }
                    break;
                case 2576:
                    c11 = 1;
                    if (str.equals("QA")) {
                        c12 = 178;
                        break;
                    }
                    break;
                case 2611:
                    c11 = 1;
                    if (str.equals("RE")) {
                        c12 = 179;
                        break;
                    }
                    break;
                case 2621:
                    c11 = 1;
                    if (str.equals("RO")) {
                        c12 = 180;
                        break;
                    }
                    break;
                case 2625:
                    c11 = 1;
                    if (str.equals("RS")) {
                        c12 = 181;
                        break;
                    }
                    break;
                case 2627:
                    c11 = 1;
                    if (str.equals("RU")) {
                        c12 = 182;
                        break;
                    }
                    break;
                case 2629:
                    c11 = 1;
                    if (str.equals("RW")) {
                        c12 = 183;
                        break;
                    }
                    break;
                case 2638:
                    c11 = 1;
                    if (str.equals("SA")) {
                        c12 = 184;
                        break;
                    }
                    break;
                case 2639:
                    c11 = 1;
                    if (str.equals("SB")) {
                        c12 = 185;
                        break;
                    }
                    break;
                case 2640:
                    c11 = 1;
                    if (str.equals("SC")) {
                        c12 = 186;
                        break;
                    }
                    break;
                case 2641:
                    c11 = 1;
                    if (str.equals("SD")) {
                        c12 = 187;
                        break;
                    }
                    break;
                case 2642:
                    c11 = 1;
                    if (str.equals("SE")) {
                        c12 = 188;
                        break;
                    }
                    break;
                case 2644:
                    c11 = 1;
                    if (str.equals("SG")) {
                        c12 = 189;
                        break;
                    }
                    break;
                case 2645:
                    c11 = 1;
                    if (str.equals("SH")) {
                        c12 = 190;
                        break;
                    }
                    break;
                case 2646:
                    c11 = 1;
                    if (str.equals("SI")) {
                        c12 = 191;
                        break;
                    }
                    break;
                case 2647:
                    c11 = 1;
                    if (str.equals("SJ")) {
                        c12 = 192;
                        break;
                    }
                    break;
                case 2648:
                    c11 = 1;
                    if (str.equals("SK")) {
                        c12 = 193;
                        break;
                    }
                    break;
                case 2649:
                    c11 = 1;
                    if (str.equals("SL")) {
                        c12 = 194;
                        break;
                    }
                    break;
                case 2650:
                    c11 = 1;
                    if (str.equals("SM")) {
                        c12 = 195;
                        break;
                    }
                    break;
                case 2651:
                    c11 = 1;
                    if (str.equals("SN")) {
                        c12 = 196;
                        break;
                    }
                    break;
                case 2652:
                    c11 = 1;
                    if (str.equals("SO")) {
                        c12 = 197;
                        break;
                    }
                    break;
                case 2655:
                    c11 = 1;
                    if (str.equals("SR")) {
                        c12 = 198;
                        break;
                    }
                    break;
                case 2656:
                    c11 = 1;
                    if (str.equals("SS")) {
                        c12 = 199;
                        break;
                    }
                    break;
                case 2657:
                    c11 = 1;
                    if (str.equals("ST")) {
                        c12 = 200;
                        break;
                    }
                    break;
                case 2659:
                    c11 = 1;
                    if (str.equals("SV")) {
                        c12 = 201;
                        break;
                    }
                    break;
                case 2661:
                    c11 = 1;
                    if (str.equals("SX")) {
                        c12 = 202;
                        break;
                    }
                    break;
                case 2662:
                    c11 = 1;
                    if (str.equals("SY")) {
                        c12 = 203;
                        break;
                    }
                    break;
                case 2663:
                    c11 = 1;
                    if (str.equals("SZ")) {
                        c12 = 204;
                        break;
                    }
                    break;
                case 2671:
                    c11 = 1;
                    if (str.equals("TC")) {
                        c12 = 205;
                        break;
                    }
                    break;
                case 2672:
                    c11 = 1;
                    if (str.equals("TD")) {
                        c12 = 206;
                        break;
                    }
                    break;
                case 2675:
                    c11 = 1;
                    if (str.equals("TG")) {
                        c12 = 207;
                        break;
                    }
                    break;
                case 2676:
                    c11 = 1;
                    if (str.equals("TH")) {
                        c12 = 208;
                        break;
                    }
                    break;
                case 2678:
                    c11 = 1;
                    if (str.equals("TJ")) {
                        c12 = 209;
                        break;
                    }
                    break;
                case 2680:
                    c11 = 1;
                    if (str.equals("TL")) {
                        c12 = 210;
                        break;
                    }
                    break;
                case 2681:
                    c11 = 1;
                    if (str.equals("TM")) {
                        c12 = 211;
                        break;
                    }
                    break;
                case 2682:
                    c11 = 1;
                    if (str.equals("TN")) {
                        c12 = 212;
                        break;
                    }
                    break;
                case 2683:
                    c11 = 1;
                    if (str.equals("TO")) {
                        c12 = 213;
                        break;
                    }
                    break;
                case 2686:
                    c11 = 1;
                    if (str.equals("TR")) {
                        c12 = 214;
                        break;
                    }
                    break;
                case 2688:
                    c11 = 1;
                    if (str.equals("TT")) {
                        c12 = 215;
                        break;
                    }
                    break;
                case 2690:
                    c11 = 1;
                    if (str.equals("TV")) {
                        c12 = 216;
                        break;
                    }
                    break;
                case 2691:
                    c11 = 1;
                    if (str.equals("TW")) {
                        c12 = 217;
                        break;
                    }
                    break;
                case 2694:
                    c11 = 1;
                    if (str.equals("TZ")) {
                        c12 = 218;
                        break;
                    }
                    break;
                case 2700:
                    c11 = 1;
                    if (str.equals("UA")) {
                        c12 = 219;
                        break;
                    }
                    break;
                case 2706:
                    c11 = 1;
                    if (str.equals("UG")) {
                        c12 = 220;
                        break;
                    }
                    break;
                case 2718:
                    c11 = 1;
                    if (str.equals("US")) {
                        c12 = 221;
                        break;
                    }
                    break;
                case 2724:
                    c11 = 1;
                    if (str.equals("UY")) {
                        c12 = 222;
                        break;
                    }
                    break;
                case 2725:
                    c11 = 1;
                    if (str.equals("UZ")) {
                        c12 = 223;
                        break;
                    }
                    break;
                case 2731:
                    c11 = 1;
                    if (str.equals("VA")) {
                        c12 = 224;
                        break;
                    }
                    break;
                case 2733:
                    c11 = 1;
                    if (str.equals("VC")) {
                        c12 = 225;
                        break;
                    }
                    break;
                case 2735:
                    c11 = 1;
                    if (str.equals("VE")) {
                        c12 = 226;
                        break;
                    }
                    break;
                case 2737:
                    c11 = 1;
                    if (str.equals("VG")) {
                        c12 = 227;
                        break;
                    }
                    break;
                case 2739:
                    c11 = 1;
                    if (str.equals("VI")) {
                        c12 = 228;
                        break;
                    }
                    break;
                case 2744:
                    c11 = 1;
                    if (str.equals("VN")) {
                        c12 = 229;
                        break;
                    }
                    break;
                case 2751:
                    c11 = 1;
                    if (str.equals("VU")) {
                        c12 = 230;
                        break;
                    }
                    break;
                case 2767:
                    c11 = 1;
                    if (str.equals("WF")) {
                        c12 = 231;
                        break;
                    }
                    break;
                case 2780:
                    c11 = 1;
                    if (str.equals("WS")) {
                        c12 = 232;
                        break;
                    }
                    break;
                case 2803:
                    c11 = 1;
                    if (str.equals("XK")) {
                        c12 = 233;
                        break;
                    }
                    break;
                case 2828:
                    c11 = 1;
                    if (str.equals("YE")) {
                        c12 = 234;
                        break;
                    }
                    break;
                case 2843:
                    c11 = 1;
                    if (str.equals("YT")) {
                        c12 = 235;
                        break;
                    }
                    break;
                case 2855:
                    c11 = 1;
                    if (str.equals("ZA")) {
                        c12 = 236;
                        break;
                    }
                    break;
                case 2867:
                    c11 = 1;
                    if (str.equals("ZM")) {
                        c12 = 237;
                        break;
                    }
                    break;
                case 2877:
                    c11 = 1;
                    if (str.equals("ZW")) {
                        c12 = 238;
                        break;
                    }
                    break;
                default:
                    c11 = 1;
                    break;
            }
            switch (c12) {
                case 0:
                case 4:
                case 17:
                case 29:
                case '2':
                case '9':
                case 'q':
                case 't':
                case 202:
                case 225:
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case 1:
                    iArr = new int[]{1, 4, 2, 3, 4, 1};
                    break;
                case 2:
                case 204:
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case 3:
                case ')':
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case 5:
                    iArr = new int[]{1, 1, 1, 2, 2, 2};
                    break;
                case 6:
                case 165:
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case 7:
                    iArr = new int[]{3, 4, 4, 3, 2, 2};
                    break;
                case '\b':
                case '?':
                case 162:
                case 186:
                case 190:
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case '\t':
                    iArr = new int[]{2, 2, 2, 2, 1, 2};
                    break;
                case '\n':
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case 11:
                case '=':
                case ']':
                case 'f':
                case 127:
                case 145:
                case 188:
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case '\f':
                    iArr = new int[]{0, 3, 1, 1, 3, 0};
                    break;
                case '\r':
                    iArr = new int[]{2, 2, 3, 4, 2, 2};
                    break;
                case 14:
                case '3':
                case 'y':
                case 144:
                case 172:
                case 195:
                case 224:
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case 15:
                case '7':
                case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                case 194:
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case 16:
                case 'j':
                case 214:
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case 18:
                    iArr = new int[]{2, 1, 3, 2, 4, 2};
                    break;
                case 19:
                    iArr = new int[]{0, 0, 1, 0, 1, 2};
                    break;
                case 20:
                case 187:
                case 203:
                case 206:
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case 21:
                case 175:
                case 191:
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case 22:
                    iArr = new int[]{1, 3, 1, 3, 4, 2};
                    break;
                case 23:
                case 'T':
                case '\\':
                case 154:
                case 226:
                case 234:
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case 24:
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case 141:
                case 177:
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    iArr = new int[]{3, 2, 0, 0, 2, 2};
                    break;
                case 28:
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    iArr = new int[]{1, 1, 1, 1, 2, 4};
                    break;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    iArr = new int[]{3, 2, 1, 1, 2, 2};
                    break;
                case ' ':
                    iArr = new int[]{3, 1, 2, 2, 3, 2};
                    break;
                case '!':
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case '\"':
                    iArr = new int[]{1, 2, 3, 3, 2, 2};
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case '*':
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 219:
                    iArr = new int[]{0, 2, 1, 2, 3, 3};
                    break;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 137:
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case '&':
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case '>':
                case 134:
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case '(':
                    iArr = new int[]{0, 1, 0, 0, 0, 2};
                    break;
                case '+':
                case 208:
                    iArr = new int[]{0, 1, 2, 2, 2, 2};
                    break;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case 143:
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    iArr = new int[]{2, 0, 1, 1, 3, 1};
                    break;
                case '.':
                    iArr = new int[]{2, 3, 3, 2, 2, 2};
                    break;
                case '/':
                case 157:
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case '0':
                case 'o':
                case 161:
                case 210:
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case '1':
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case '4':
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case '5':
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case '6':
                    iArr = new int[]{0, 1, 4, 2, 2, 1};
                    break;
                case '8':
                    iArr = new int[]{0, 0, 2, 0, 0, 2};
                    break;
                case ':':
                case '{':
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case ';':
                case 209:
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case '<':
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    iArr = new int[]{0, 0, 0, 0, 1, 0};
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    iArr = new int[]{4, 3, 4, 4, 4, 2};
                    break;
                case 'B':
                    iArr = new int[]{0, 0, 0, 1, 0, 2};
                    break;
                case 'C':
                    iArr = new int[]{3, 2, 2, 3, 2, 2};
                    break;
                case 'D':
                case 155:
                case 192:
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case 'E':
                    iArr = new int[]{4, 2, 4, 0, 2, 2};
                    break;
                case 'F':
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case 'G':
                    iArr = new int[]{1, 1, 1, 1, 0, 2};
                    break;
                case 'H':
                    iArr = new int[]{3, 4, 0, 0, 2, 2};
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 73 */:
                    iArr = new int[]{1, 1, 3, 2, 2, 2};
                    break;
                case 'J':
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case 'K':
                    iArr = new int[]{1, 1, 0, 2, 2, 2};
                    break;
                case 'L':
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case 'M':
                    iArr = new int[]{0, 2, 1, 1, 2, 2};
                    break;
                case 'N':
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case 'O':
                case 'a':
                case 'h':
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case 'P':
                case 130:
                    iArr = new int[]{1, 2, 2, 0, 2, 2};
                    break;
                case 'Q':
                case 199:
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case 'R':
                    iArr = new int[]{3, 4, 4, 2, 2, 2};
                    break;
                case 'S':
                    iArr = new int[]{2, 1, 1, 3, 2, 2};
                    break;
                case 'U':
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case 'V':
                    iArr = new int[]{2, 1, 2, 1, 2, 2};
                    break;
                case 'W':
                    iArr = new int[]{2, 2, 4, 3, 3, 2};
                    break;
                case 'X':
                    iArr = new int[]{4, 4, 1, 2, 2, 2};
                    break;
                case 'Y':
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case 'Z':
                    iArr = new int[]{0, 1, 0, 1, 1, 0};
                    break;
                case '[':
                case 's':
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case '^':
                    iArr = new int[]{3, 1, 3, 3, 2, 4};
                    break;
                case '_':
                    iArr = new int[]{1, 1, 1, 1, 1, 2};
                    break;
                case '`':
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case 'b':
                    iArr = new int[]{1, 1, 3, 2, 2, 3};
                    break;
                case Logger.NONE /* 99 */:
                    iArr = new int[]{3, 2, 2, 0, 2, 2};
                    break;
                case 'd':
                    iArr = new int[]{3, 2, 3, 2, 2, 2};
                    break;
                case 'e':
                    iArr = new int[]{4, 2, 3, 3, 4, 3};
                    break;
                case 'g':
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case 'i':
                    iArr = new int[]{2, 4, 3, 1, 2, 2};
                    break;
                case 'k':
                    iArr = new int[]{0, 3, 2, 3, 4, 2};
                    break;
                case 'l':
                    iArr = new int[]{3, 2, 1, 1, 1, 2};
                    break;
                case 'm':
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case 'n':
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case 'p':
                case 230:
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case 'r':
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case 'u':
                    iArr = new int[]{2, 1, 2, 2, 3, 2};
                    break;
                case 'v':
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case 'w':
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case 'x':
                    iArr = new int[]{2, 2, 1, 1, 2, 2};
                    break;
                case 'z':
                case 138:
                    iArr = new int[]{3, 2, 3, 3, 4, 2};
                    break;
                case '|':
                case 168:
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case '}':
                    iArr = new int[]{0, 1, 0, 1, 0, 2};
                    break;
                case '~':
                    iArr = new int[]{4, 0, 3, 2, 1, 3};
                    break;
                case 129:
                    iArr = new int[]{3, 3, 1, 1, 2, 2};
                    break;
                case 131:
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case 132:
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case 133:
                    iArr = new int[]{1, 2, 2, 3, 2, 2};
                    break;
                case 135:
                case 211:
                case 216:
                case 231:
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case 136:
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case 139:
                    iArr = new int[]{2, 0, 2, 2, 2, 2};
                    break;
                case 140:
                    iArr = new int[]{0, 2, 4, 4, 3, 1};
                    break;
                case 142:
                    iArr = new int[]{2, 1, 2, 3, 2, 2};
                    break;
                case 146:
                    iArr = new int[]{3, 1, 0, 2, 2, 2};
                    break;
                case 147:
                    iArr = new int[]{3, 2, 1, 3, 4, 2};
                    break;
                case 148:
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case 149:
                    iArr = new int[]{2, 4, 4, 4, 3, 2};
                    break;
                case 150:
                    iArr = new int[]{1, 0, 4, 1, 1, 0};
                    break;
                case 151:
                case 232:
                    iArr = new int[]{3, 1, 2, 2, 2, 2};
                    break;
                case 152:
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case 153:
                case 235:
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case 156:
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case 158:
                    iArr = new int[]{2, 1, 4, 3, 0, 4};
                    break;
                case 159:
                    iArr = new int[]{0, 0, 3, 0, 0, 2};
                    break;
                case 160:
                    iArr = new int[]{2, 2, 4, 3, 2, 2};
                    break;
                case 163:
                    iArr = new int[]{0, 0, 1, 2, 4, 2};
                    break;
                case 164:
                    iArr = new int[]{2, 3, 1, 2, 4, 2};
                    break;
                case 166:
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case 167:
                    iArr = new int[]{2, 2, 3, 1, 2, 2};
                    break;
                case 169:
                    iArr = new int[]{2, 1, 2, 3, 2, 1};
                    break;
                case 170:
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case 171:
                    iArr = new int[]{1, 0, 2, 2, 4, 4};
                    break;
                case 173:
                    iArr = new int[]{2, 0, 2, 1, 2, 0};
                    break;
                case 174:
                    iArr = new int[]{3, 4, 1, 3, 2, 2};
                    break;
                case 176:
                    iArr = new int[]{2, 2, 4, 1, 2, 2};
                    break;
                case 178:
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case 179:
                    iArr = new int[]{0, 3, 2, 3, 1, 2};
                    break;
                case 180:
                    iArr = new int[]{0, 0, 1, 1, 3, 2};
                    break;
                case 181:
                    iArr = new int[]{1, 0, 0, 1, 2, 2};
                    break;
                case 182:
                    iArr = new int[]{1, 0, 0, 1, 3, 3};
                    break;
                case 183:
                    iArr = new int[]{3, 3, 2, 0, 2, 2};
                    break;
                case 184:
                    iArr = new int[]{3, 1, 1, 2, 2, 0};
                    break;
                case 185:
                case 238:
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case 189:
                    iArr = new int[]{2, 3, 3, 3, 1, 1};
                    break;
                case 193:
                    iArr = new int[]{0, 1, 1, 1, 2, 2};
                    break;
                case 196:
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case 197:
                    iArr = new int[]{2, 2, 3, 4, 4, 2};
                    break;
                case 198:
                    iArr = new int[]{2, 4, 4, 1, 2, 2};
                    break;
                case m.e.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case 201:
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case 205:
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case 207:
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case 212:
                    iArr = new int[]{3, 1, 1, 1, 2, 2};
                    break;
                case 213:
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor.MODULE_VERSION /* 215 */:
                    iArr = new int[]{2, 4, 1, 0, 2, 2};
                    break;
                case 217:
                    iArr = new int[]{0, 0, 0, 0, 0, 0};
                    break;
                case 218:
                    iArr = new int[]{3, 4, 2, 1, 3, 2};
                    break;
                case 220:
                    iArr = new int[]{3, 3, 2, 3, 4, 2};
                    break;
                case 221:
                    iArr = new int[]{2, 2, 4, 1, 3, 1};
                    break;
                case 222:
                    iArr = new int[]{2, 1, 1, 2, 1, 2};
                    break;
                case 223:
                    iArr = new int[]{1, 2, 3, 4, 3, 2};
                    break;
                case 227:
                    iArr = new int[]{2, 2, 1, 1, 2, 4};
                    break;
                case 228:
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case 229:
                    iArr = new int[]{0, 0, 1, 2, 2, 2};
                    break;
                case 233:
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case 236:
                    iArr = new int[]{2, 4, 2, 1, 1, 2};
                    break;
                case 237:
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            if (i11 != 2) {
                if (i11 == 3) {
                    longValue = f13766q.get(iArr[c11]).longValue();
                } else if (i11 == 4) {
                    longValue = f13767r.get(iArr[2]).longValue();
                } else if (i11 == 5) {
                    longValue = f13768s.get(iArr[3]).longValue();
                } else if (i11 != 7) {
                    longValue = i11 != 9 ? i11 != 10 ? 1000000L : f13769t.get(iArr[4]).longValue() : f13770u.get(iArr[5]).longValue();
                }
                l11 = Long.valueOf(longValue);
            }
            longValue = f13765p.get(iArr[0]).longValue();
            l11 = Long.valueOf(longValue);
        }
        if (l11 == null) {
            l11 = 1000000L;
        }
        return l11.longValue();
    }

    public static synchronized g g(Context context) {
        g gVar;
        synchronized (g.class) {
            try {
                if (f13771v == null) {
                    f13771v = new a(context).a();
                }
                gVar = f13771v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @Override // J3.d
    public final synchronized long a() {
        return this.f13783l;
    }

    @Override // J3.d
    public final void b(Handler handler, d.a aVar) {
        aVar.getClass();
        this.f13774c.a(handler, aVar);
    }

    @Override // J3.d
    public final z c() {
        return this;
    }

    @Override // J3.d
    public final void d(d.a aVar) {
        this.f13774c.c(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0012 A[Catch: all -> 0x001a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:12:0x0012), top: B:4:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010 A[DONT_GENERATE] */
    @Override // p3.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onBytesTransferred(InterfaceC8846f interfaceC8846f, p3.i iVar, boolean z11, int i11) {
        boolean z12;
        if (z11) {
            if (!iVar.c(8)) {
                z12 = true;
                if (z12) {
                    return;
                }
                this.f13780i += i11;
                return;
            }
        }
        z12 = false;
        if (z12) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0014 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {all -> 0x005c, blocks: (B:6:0x0007, B:13:0x0014, B:16:0x0019, B:18:0x0039, B:20:0x0052, B:23:0x0068, B:27:0x0074, B:30:0x0082, B:31:0x007b, B:32:0x005f, B:33:0x0086), top: B:5:0x0007 }] */
    @Override // p3.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onTransferEnd(InterfaceC8846f interfaceC8846f, p3.i iVar, boolean z11) {
        boolean z12;
        long j11;
        long j12;
        if (z11) {
            try {
                if (!iVar.c(8)) {
                    z12 = true;
                    if (z12) {
                        return;
                    }
                    G10.a.h(this.f13778g > 0);
                    this.f13775d.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i11 = (int) (elapsedRealtime - this.f13779h);
                    this.f13781j += i11;
                    long j13 = this.f13782k;
                    long j14 = this.f13780i;
                    this.f13782k = j13 + j14;
                    if (i11 > 0) {
                        this.f13777f.a((j14 * 8000.0f) / i11, (int) Math.sqrt(j14));
                        if (this.f13781j < 2000) {
                            if (this.f13782k >= 524288) {
                            }
                            j11 = this.f13780i;
                            j12 = this.f13783l;
                            if (i11 == 0 || j11 != 0 || j12 != this.f13784m) {
                                this.f13784m = j12;
                                this.f13774c.b(i11, j11, j12);
                            }
                            this.f13779h = elapsedRealtime;
                            this.f13780i = 0L;
                        }
                        this.f13783l = (long) this.f13777f.b();
                        j11 = this.f13780i;
                        j12 = this.f13783l;
                        if (i11 == 0) {
                        }
                        this.f13784m = j12;
                        this.f13774c.b(i11, j11, j12);
                        this.f13779h = elapsedRealtime;
                        this.f13780i = 0L;
                    }
                    this.f13778g--;
                    return;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z12 = false;
        if (z12) {
        }
    }

    @Override // p3.z
    public final void onTransferInitializing(InterfaceC8846f interfaceC8846f, p3.i iVar, boolean z11) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0013 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0006, B:13:0x0013, B:15:0x0017, B:16:0x0025), top: B:5:0x0006 }] */
    @Override // p3.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onTransferStart(InterfaceC8846f interfaceC8846f, p3.i iVar, boolean z11) {
        boolean z12;
        if (z11) {
            try {
                if (!iVar.c(8)) {
                    z12 = true;
                    if (z12) {
                        return;
                    }
                    if (this.f13778g == 0) {
                        this.f13775d.getClass();
                        this.f13779h = SystemClock.elapsedRealtime();
                    }
                    this.f13778g++;
                    return;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z12 = false;
        if (z12) {
        }
    }
}
