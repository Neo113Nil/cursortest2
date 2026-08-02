package u2;

import E3.AbstractC0158p;
import E3.AbstractC0167z;
import android.content.Context;
import android.os.Handler;
import c2.D;
import com.google.android.gms.internal.ads.zzbbd;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import w1.C1761y0;

/* renamed from: u2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1642t implements InterfaceC1629f, U {

    /* renamed from: n, reason: collision with root package name */
    public static final E3.L f16823n = AbstractC0167z.H(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: o, reason: collision with root package name */
    public static final E3.L f16824o = AbstractC0167z.H(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: p, reason: collision with root package name */
    public static final E3.L f16825p = AbstractC0167z.H(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: q, reason: collision with root package name */
    public static final E3.L f16826q = AbstractC0167z.H(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: r, reason: collision with root package name */
    public static final E3.L f16827r = AbstractC0167z.H(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: s, reason: collision with root package name */
    public static final E3.L f16828s = AbstractC0167z.H(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: t, reason: collision with root package name */
    public static C1642t f16829t;

    /* renamed from: a, reason: collision with root package name */
    public final E3.Q f16830a;

    /* renamed from: b, reason: collision with root package name */
    public final C1761y0 f16831b = new C1761y0(22);

    /* renamed from: c, reason: collision with root package name */
    public final S f16832c;

    /* renamed from: d, reason: collision with root package name */
    public final v2.p f16833d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16834e;

    /* renamed from: f, reason: collision with root package name */
    public int f16835f;

    /* renamed from: g, reason: collision with root package name */
    public long f16836g;

    /* renamed from: h, reason: collision with root package name */
    public long f16837h;

    /* renamed from: i, reason: collision with root package name */
    public int f16838i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public long f16839k;

    /* renamed from: l, reason: collision with root package name */
    public long f16840l;

    /* renamed from: m, reason: collision with root package name */
    public long f16841m;

    public C1642t(Context context, HashMap hashMap, int i7, v2.p pVar, boolean z4) {
        this.f16830a = E3.Q.a(hashMap);
        this.f16832c = new S(i7);
        this.f16833d = pVar;
        this.f16834e = z4;
        if (context == null) {
            this.f16838i = 0;
            this.f16840l = b(0);
            return;
        }
        v2.n e7 = v2.n.e(context);
        int f7 = e7.f();
        this.f16838i = f7;
        this.f16840l = b(f7);
        C1641s c1641s = new C1641s(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) e7.f17138c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(c1641s));
        ((Handler) e7.f17137b).post(new io.sentry.cache.f(8, e7, c1641s));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1019:0x0ceb, code lost:
    
        if (r8.equals("AD") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] a(String str) {
        char c3 = 0;
        str.getClass();
        switch (str.hashCode()) {
            case 2083:
                break;
            case 2084:
                if (str.equals("AE")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 2085:
                if (str.equals("AF")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 2086:
                if (str.equals("AG")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 2088:
                if (str.equals("AI")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 2091:
                if (str.equals("AL")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 2092:
                if (str.equals("AM")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 2094:
                if (str.equals("AO")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 2097:
                if (str.equals("AR")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 2098:
                if (str.equals("AS")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 2099:
                if (str.equals("AT")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 2100:
                if (str.equals("AU")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 2102:
                if (str.equals("AW")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case 2103:
                if (str.equals("AX")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case 2111:
                if (str.equals("BA")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 2112:
                if (str.equals("BB")) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 2114:
                if (str.equals("BD")) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case 2115:
                if (str.equals("BE")) {
                    c3 = 19;
                    break;
                }
                c3 = 65535;
                break;
            case 2116:
                if (str.equals("BF")) {
                    c3 = 20;
                    break;
                }
                c3 = 65535;
                break;
            case 2117:
                if (str.equals("BG")) {
                    c3 = 21;
                    break;
                }
                c3 = 65535;
                break;
            case 2118:
                if (str.equals("BH")) {
                    c3 = 22;
                    break;
                }
                c3 = 65535;
                break;
            case 2119:
                if (str.equals("BI")) {
                    c3 = 23;
                    break;
                }
                c3 = 65535;
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c3 = 24;
                    break;
                }
                c3 = 65535;
                break;
            case 2122:
                if (str.equals("BL")) {
                    c3 = 25;
                    break;
                }
                c3 = 65535;
                break;
            case 2123:
                if (str.equals("BM")) {
                    c3 = 26;
                    break;
                }
                c3 = 65535;
                break;
            case 2124:
                if (str.equals("BN")) {
                    c3 = 27;
                    break;
                }
                c3 = 65535;
                break;
            case 2125:
                if (str.equals("BO")) {
                    c3 = 28;
                    break;
                }
                c3 = 65535;
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c3 = 29;
                    break;
                }
                c3 = 65535;
                break;
            case 2129:
                if (str.equals("BS")) {
                    c3 = 30;
                    break;
                }
                c3 = 65535;
                break;
            case 2130:
                if (str.equals("BT")) {
                    c3 = 31;
                    break;
                }
                c3 = 65535;
                break;
            case 2133:
                if (str.equals("BW")) {
                    c3 = ' ';
                    break;
                }
                c3 = 65535;
                break;
            case 2135:
                if (str.equals("BY")) {
                    c3 = '!';
                    break;
                }
                c3 = 65535;
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c3 = '\"';
                    break;
                }
                c3 = 65535;
                break;
            case 2142:
                if (str.equals("CA")) {
                    c3 = '#';
                    break;
                }
                c3 = 65535;
                break;
            case 2145:
                if (str.equals("CD")) {
                    c3 = '$';
                    break;
                }
                c3 = 65535;
                break;
            case 2147:
                if (str.equals("CF")) {
                    c3 = '%';
                    break;
                }
                c3 = 65535;
                break;
            case 2148:
                if (str.equals("CG")) {
                    c3 = '&';
                    break;
                }
                c3 = 65535;
                break;
            case 2149:
                if (str.equals("CH")) {
                    c3 = '\'';
                    break;
                }
                c3 = 65535;
                break;
            case 2150:
                if (str.equals("CI")) {
                    c3 = '(';
                    break;
                }
                c3 = 65535;
                break;
            case 2152:
                if (str.equals("CK")) {
                    c3 = ')';
                    break;
                }
                c3 = 65535;
                break;
            case 2153:
                if (str.equals("CL")) {
                    c3 = '*';
                    break;
                }
                c3 = 65535;
                break;
            case 2154:
                if (str.equals("CM")) {
                    c3 = '+';
                    break;
                }
                c3 = 65535;
                break;
            case 2155:
                if (str.equals("CN")) {
                    c3 = ',';
                    break;
                }
                c3 = 65535;
                break;
            case 2156:
                if (str.equals("CO")) {
                    c3 = '-';
                    break;
                }
                c3 = 65535;
                break;
            case 2159:
                if (str.equals("CR")) {
                    c3 = '.';
                    break;
                }
                c3 = 65535;
                break;
            case 2162:
                if (str.equals("CU")) {
                    c3 = '/';
                    break;
                }
                c3 = 65535;
                break;
            case 2163:
                if (str.equals("CV")) {
                    c3 = '0';
                    break;
                }
                c3 = 65535;
                break;
            case 2164:
                if (str.equals("CW")) {
                    c3 = '1';
                    break;
                }
                c3 = 65535;
                break;
            case 2165:
                if (str.equals("CX")) {
                    c3 = '2';
                    break;
                }
                c3 = 65535;
                break;
            case 2166:
                if (str.equals("CY")) {
                    c3 = '3';
                    break;
                }
                c3 = 65535;
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c3 = '4';
                    break;
                }
                c3 = 65535;
                break;
            case 2177:
                if (str.equals("DE")) {
                    c3 = '5';
                    break;
                }
                c3 = 65535;
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c3 = '6';
                    break;
                }
                c3 = 65535;
                break;
            case 2183:
                if (str.equals("DK")) {
                    c3 = '7';
                    break;
                }
                c3 = 65535;
                break;
            case 2185:
                if (str.equals("DM")) {
                    c3 = '8';
                    break;
                }
                c3 = 65535;
                break;
            case 2187:
                if (str.equals("DO")) {
                    c3 = '9';
                    break;
                }
                c3 = 65535;
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c3 = ':';
                    break;
                }
                c3 = 65535;
                break;
            case 2206:
                if (str.equals("EC")) {
                    c3 = ';';
                    break;
                }
                c3 = 65535;
                break;
            case 2208:
                if (str.equals("EE")) {
                    c3 = '<';
                    break;
                }
                c3 = 65535;
                break;
            case 2210:
                if (str.equals("EG")) {
                    c3 = '=';
                    break;
                }
                c3 = 65535;
                break;
            case 2221:
                if (str.equals("ER")) {
                    c3 = '>';
                    break;
                }
                c3 = 65535;
                break;
            case 2222:
                if (str.equals("ES")) {
                    c3 = '?';
                    break;
                }
                c3 = 65535;
                break;
            case 2223:
                if (str.equals("ET")) {
                    c3 = '@';
                    break;
                }
                c3 = 65535;
                break;
            case 2243:
                if (str.equals("FI")) {
                    c3 = 'A';
                    break;
                }
                c3 = 65535;
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c3 = 'B';
                    break;
                }
                c3 = 65535;
                break;
            case 2245:
                if (str.equals("FK")) {
                    c3 = 'C';
                    break;
                }
                c3 = 65535;
                break;
            case 2247:
                if (str.equals("FM")) {
                    c3 = 'D';
                    break;
                }
                c3 = 65535;
                break;
            case 2249:
                if (str.equals("FO")) {
                    c3 = 'E';
                    break;
                }
                c3 = 65535;
                break;
            case 2252:
                if (str.equals("FR")) {
                    c3 = 'F';
                    break;
                }
                c3 = 65535;
                break;
            case 2266:
                if (str.equals("GA")) {
                    c3 = 'G';
                    break;
                }
                c3 = 65535;
                break;
            case 2267:
                if (str.equals("GB")) {
                    c3 = 'H';
                    break;
                }
                c3 = 65535;
                break;
            case 2269:
                if (str.equals("GD")) {
                    c3 = 'I';
                    break;
                }
                c3 = 65535;
                break;
            case 2270:
                if (str.equals("GE")) {
                    c3 = 'J';
                    break;
                }
                c3 = 65535;
                break;
            case 2271:
                if (str.equals("GF")) {
                    c3 = 'K';
                    break;
                }
                c3 = 65535;
                break;
            case 2272:
                if (str.equals("GG")) {
                    c3 = 'L';
                    break;
                }
                c3 = 65535;
                break;
            case 2273:
                if (str.equals("GH")) {
                    c3 = 'M';
                    break;
                }
                c3 = 65535;
                break;
            case 2274:
                if (str.equals("GI")) {
                    c3 = 'N';
                    break;
                }
                c3 = 65535;
                break;
            case 2277:
                if (str.equals("GL")) {
                    c3 = 'O';
                    break;
                }
                c3 = 65535;
                break;
            case 2278:
                if (str.equals("GM")) {
                    c3 = 'P';
                    break;
                }
                c3 = 65535;
                break;
            case 2279:
                if (str.equals("GN")) {
                    c3 = 'Q';
                    break;
                }
                c3 = 65535;
                break;
            case 2281:
                if (str.equals("GP")) {
                    c3 = 'R';
                    break;
                }
                c3 = 65535;
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c3 = 'S';
                    break;
                }
                c3 = 65535;
                break;
            case 2283:
                if (str.equals("GR")) {
                    c3 = 'T';
                    break;
                }
                c3 = 65535;
                break;
            case 2285:
                if (str.equals("GT")) {
                    c3 = 'U';
                    break;
                }
                c3 = 65535;
                break;
            case 2286:
                if (str.equals("GU")) {
                    c3 = 'V';
                    break;
                }
                c3 = 65535;
                break;
            case 2288:
                if (str.equals("GW")) {
                    c3 = 'W';
                    break;
                }
                c3 = 65535;
                break;
            case 2290:
                if (str.equals("GY")) {
                    c3 = 'X';
                    break;
                }
                c3 = 65535;
                break;
            case 2307:
                if (str.equals("HK")) {
                    c3 = 'Y';
                    break;
                }
                c3 = 65535;
                break;
            case 2314:
                if (str.equals("HR")) {
                    c3 = 'Z';
                    break;
                }
                c3 = 65535;
                break;
            case 2316:
                if (str.equals("HT")) {
                    c3 = '[';
                    break;
                }
                c3 = 65535;
                break;
            case 2317:
                if (str.equals("HU")) {
                    c3 = '\\';
                    break;
                }
                c3 = 65535;
                break;
            case 2331:
                if (str.equals("ID")) {
                    c3 = ']';
                    break;
                }
                c3 = 65535;
                break;
            case 2332:
                if (str.equals("IE")) {
                    c3 = '^';
                    break;
                }
                c3 = 65535;
                break;
            case 2339:
                if (str.equals("IL")) {
                    c3 = '_';
                    break;
                }
                c3 = 65535;
                break;
            case 2340:
                if (str.equals("IM")) {
                    c3 = '`';
                    break;
                }
                c3 = 65535;
                break;
            case 2341:
                if (str.equals("IN")) {
                    c3 = 'a';
                    break;
                }
                c3 = 65535;
                break;
            case 2342:
                if (str.equals("IO")) {
                    c3 = 'b';
                    break;
                }
                c3 = 65535;
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c3 = 'c';
                    break;
                }
                c3 = 65535;
                break;
            case 2345:
                if (str.equals("IR")) {
                    c3 = 'd';
                    break;
                }
                c3 = 65535;
                break;
            case 2346:
                if (str.equals("IS")) {
                    c3 = 'e';
                    break;
                }
                c3 = 65535;
                break;
            case 2347:
                if (str.equals("IT")) {
                    c3 = 'f';
                    break;
                }
                c3 = 65535;
                break;
            case 2363:
                if (str.equals("JE")) {
                    c3 = 'g';
                    break;
                }
                c3 = 65535;
                break;
            case 2371:
                if (str.equals("JM")) {
                    c3 = 'h';
                    break;
                }
                c3 = 65535;
                break;
            case 2373:
                if (str.equals("JO")) {
                    c3 = 'i';
                    break;
                }
                c3 = 65535;
                break;
            case 2374:
                if (str.equals("JP")) {
                    c3 = 'j';
                    break;
                }
                c3 = 65535;
                break;
            case 2394:
                if (str.equals("KE")) {
                    c3 = 'k';
                    break;
                }
                c3 = 65535;
                break;
            case 2396:
                if (str.equals("KG")) {
                    c3 = 'l';
                    break;
                }
                c3 = 65535;
                break;
            case 2397:
                if (str.equals("KH")) {
                    c3 = 'm';
                    break;
                }
                c3 = 65535;
                break;
            case 2398:
                if (str.equals("KI")) {
                    c3 = 'n';
                    break;
                }
                c3 = 65535;
                break;
            case 2402:
                if (str.equals("KM")) {
                    c3 = 'o';
                    break;
                }
                c3 = 65535;
                break;
            case 2403:
                if (str.equals("KN")) {
                    c3 = 'p';
                    break;
                }
                c3 = 65535;
                break;
            case 2405:
                if (str.equals("KP")) {
                    c3 = 'q';
                    break;
                }
                c3 = 65535;
                break;
            case 2407:
                if (str.equals("KR")) {
                    c3 = 'r';
                    break;
                }
                c3 = 65535;
                break;
            case 2412:
                if (str.equals("KW")) {
                    c3 = 's';
                    break;
                }
                c3 = 65535;
                break;
            case 2414:
                if (str.equals("KY")) {
                    c3 = 't';
                    break;
                }
                c3 = 65535;
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c3 = 'u';
                    break;
                }
                c3 = 65535;
                break;
            case 2421:
                if (str.equals("LA")) {
                    c3 = 'v';
                    break;
                }
                c3 = 65535;
                break;
            case 2422:
                if (str.equals("LB")) {
                    c3 = 'w';
                    break;
                }
                c3 = 65535;
                break;
            case 2423:
                if (str.equals("LC")) {
                    c3 = 'x';
                    break;
                }
                c3 = 65535;
                break;
            case 2429:
                if (str.equals("LI")) {
                    c3 = 'y';
                    break;
                }
                c3 = 65535;
                break;
            case 2431:
                if (str.equals("LK")) {
                    c3 = 'z';
                    break;
                }
                c3 = 65535;
                break;
            case 2438:
                if (str.equals("LR")) {
                    c3 = '{';
                    break;
                }
                c3 = 65535;
                break;
            case 2439:
                if (str.equals("LS")) {
                    c3 = '|';
                    break;
                }
                c3 = 65535;
                break;
            case 2440:
                if (str.equals("LT")) {
                    c3 = '}';
                    break;
                }
                c3 = 65535;
                break;
            case 2441:
                if (str.equals("LU")) {
                    c3 = '~';
                    break;
                }
                c3 = 65535;
                break;
            case 2442:
                if (str.equals("LV")) {
                    c3 = 127;
                    break;
                }
                c3 = 65535;
                break;
            case 2445:
                if (str.equals("LY")) {
                    c3 = 128;
                    break;
                }
                c3 = 65535;
                break;
            case 2452:
                if (str.equals("MA")) {
                    c3 = 129;
                    break;
                }
                c3 = 65535;
                break;
            case 2454:
                if (str.equals("MC")) {
                    c3 = 130;
                    break;
                }
                c3 = 65535;
                break;
            case 2455:
                if (str.equals("MD")) {
                    c3 = 131;
                    break;
                }
                c3 = 65535;
                break;
            case 2456:
                if (str.equals("ME")) {
                    c3 = 132;
                    break;
                }
                c3 = 65535;
                break;
            case 2457:
                if (str.equals("MF")) {
                    c3 = 133;
                    break;
                }
                c3 = 65535;
                break;
            case 2458:
                if (str.equals("MG")) {
                    c3 = 134;
                    break;
                }
                c3 = 65535;
                break;
            case 2459:
                if (str.equals("MH")) {
                    c3 = 135;
                    break;
                }
                c3 = 65535;
                break;
            case 2462:
                if (str.equals("MK")) {
                    c3 = 136;
                    break;
                }
                c3 = 65535;
                break;
            case 2463:
                if (str.equals("ML")) {
                    c3 = 137;
                    break;
                }
                c3 = 65535;
                break;
            case 2464:
                if (str.equals("MM")) {
                    c3 = 138;
                    break;
                }
                c3 = 65535;
                break;
            case 2465:
                if (str.equals("MN")) {
                    c3 = 139;
                    break;
                }
                c3 = 65535;
                break;
            case 2466:
                if (str.equals("MO")) {
                    c3 = 140;
                    break;
                }
                c3 = 65535;
                break;
            case 2467:
                if (str.equals("MP")) {
                    c3 = 141;
                    break;
                }
                c3 = 65535;
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c3 = 142;
                    break;
                }
                c3 = 65535;
                break;
            case 2469:
                if (str.equals("MR")) {
                    c3 = 143;
                    break;
                }
                c3 = 65535;
                break;
            case 2470:
                if (str.equals("MS")) {
                    c3 = 144;
                    break;
                }
                c3 = 65535;
                break;
            case 2471:
                if (str.equals("MT")) {
                    c3 = 145;
                    break;
                }
                c3 = 65535;
                break;
            case 2472:
                if (str.equals("MU")) {
                    c3 = 146;
                    break;
                }
                c3 = 65535;
                break;
            case 2473:
                if (str.equals("MV")) {
                    c3 = 147;
                    break;
                }
                c3 = 65535;
                break;
            case 2474:
                if (str.equals("MW")) {
                    c3 = 148;
                    break;
                }
                c3 = 65535;
                break;
            case 2475:
                if (str.equals("MX")) {
                    c3 = 149;
                    break;
                }
                c3 = 65535;
                break;
            case 2476:
                if (str.equals("MY")) {
                    c3 = 150;
                    break;
                }
                c3 = 65535;
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c3 = 151;
                    break;
                }
                c3 = 65535;
                break;
            case 2483:
                if (str.equals("NA")) {
                    c3 = 152;
                    break;
                }
                c3 = 65535;
                break;
            case 2485:
                if (str.equals("NC")) {
                    c3 = 153;
                    break;
                }
                c3 = 65535;
                break;
            case 2487:
                if (str.equals("NE")) {
                    c3 = 154;
                    break;
                }
                c3 = 65535;
                break;
            case 2489:
                if (str.equals("NG")) {
                    c3 = 155;
                    break;
                }
                c3 = 65535;
                break;
            case 2491:
                if (str.equals("NI")) {
                    c3 = 156;
                    break;
                }
                c3 = 65535;
                break;
            case 2494:
                if (str.equals("NL")) {
                    c3 = 157;
                    break;
                }
                c3 = 65535;
                break;
            case 2497:
                if (str.equals("NO")) {
                    c3 = 158;
                    break;
                }
                c3 = 65535;
                break;
            case 2498:
                if (str.equals("NP")) {
                    c3 = 159;
                    break;
                }
                c3 = 65535;
                break;
            case 2500:
                if (str.equals("NR")) {
                    c3 = 160;
                    break;
                }
                c3 = 65535;
                break;
            case 2503:
                if (str.equals("NU")) {
                    c3 = 161;
                    break;
                }
                c3 = 65535;
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c3 = 162;
                    break;
                }
                c3 = 65535;
                break;
            case 2526:
                if (str.equals("OM")) {
                    c3 = 163;
                    break;
                }
                c3 = 65535;
                break;
            case 2545:
                if (str.equals("PA")) {
                    c3 = 164;
                    break;
                }
                c3 = 65535;
                break;
            case 2549:
                if (str.equals("PE")) {
                    c3 = 165;
                    break;
                }
                c3 = 65535;
                break;
            case 2550:
                if (str.equals("PF")) {
                    c3 = 166;
                    break;
                }
                c3 = 65535;
                break;
            case 2551:
                if (str.equals("PG")) {
                    c3 = 167;
                    break;
                }
                c3 = 65535;
                break;
            case 2552:
                if (str.equals("PH")) {
                    c3 = 168;
                    break;
                }
                c3 = 65535;
                break;
            case 2555:
                if (str.equals("PK")) {
                    c3 = 169;
                    break;
                }
                c3 = 65535;
                break;
            case 2556:
                if (str.equals("PL")) {
                    c3 = 170;
                    break;
                }
                c3 = 65535;
                break;
            case 2557:
                if (str.equals("PM")) {
                    c3 = 171;
                    break;
                }
                c3 = 65535;
                break;
            case 2562:
                if (str.equals("PR")) {
                    c3 = 172;
                    break;
                }
                c3 = 65535;
                break;
            case 2563:
                if (str.equals("PS")) {
                    c3 = 173;
                    break;
                }
                c3 = 65535;
                break;
            case 2564:
                if (str.equals("PT")) {
                    c3 = 174;
                    break;
                }
                c3 = 65535;
                break;
            case 2567:
                if (str.equals("PW")) {
                    c3 = 175;
                    break;
                }
                c3 = 65535;
                break;
            case 2576:
                if (str.equals("QA")) {
                    c3 = 176;
                    break;
                }
                c3 = 65535;
                break;
            case 2611:
                if (str.equals("RE")) {
                    c3 = 177;
                    break;
                }
                c3 = 65535;
                break;
            case 2621:
                if (str.equals("RO")) {
                    c3 = 178;
                    break;
                }
                c3 = 65535;
                break;
            case 2625:
                if (str.equals("RS")) {
                    c3 = 179;
                    break;
                }
                c3 = 65535;
                break;
            case 2627:
                if (str.equals("RU")) {
                    c3 = 180;
                    break;
                }
                c3 = 65535;
                break;
            case 2629:
                if (str.equals("RW")) {
                    c3 = 181;
                    break;
                }
                c3 = 65535;
                break;
            case 2638:
                if (str.equals("SA")) {
                    c3 = 182;
                    break;
                }
                c3 = 65535;
                break;
            case 2639:
                if (str.equals("SB")) {
                    c3 = 183;
                    break;
                }
                c3 = 65535;
                break;
            case 2640:
                if (str.equals("SC")) {
                    c3 = 184;
                    break;
                }
                c3 = 65535;
                break;
            case 2641:
                if (str.equals("SD")) {
                    c3 = 185;
                    break;
                }
                c3 = 65535;
                break;
            case 2642:
                if (str.equals("SE")) {
                    c3 = 186;
                    break;
                }
                c3 = 65535;
                break;
            case 2644:
                if (str.equals("SG")) {
                    c3 = 187;
                    break;
                }
                c3 = 65535;
                break;
            case 2645:
                if (str.equals("SH")) {
                    c3 = 188;
                    break;
                }
                c3 = 65535;
                break;
            case 2646:
                if (str.equals("SI")) {
                    c3 = 189;
                    break;
                }
                c3 = 65535;
                break;
            case 2648:
                if (str.equals("SK")) {
                    c3 = 190;
                    break;
                }
                c3 = 65535;
                break;
            case 2649:
                if (str.equals("SL")) {
                    c3 = 191;
                    break;
                }
                c3 = 65535;
                break;
            case 2650:
                if (str.equals("SM")) {
                    c3 = 192;
                    break;
                }
                c3 = 65535;
                break;
            case 2651:
                if (str.equals("SN")) {
                    c3 = 193;
                    break;
                }
                c3 = 65535;
                break;
            case 2652:
                if (str.equals("SO")) {
                    c3 = 194;
                    break;
                }
                c3 = 65535;
                break;
            case 2655:
                if (str.equals("SR")) {
                    c3 = 195;
                    break;
                }
                c3 = 65535;
                break;
            case 2656:
                if (str.equals("SS")) {
                    c3 = 196;
                    break;
                }
                c3 = 65535;
                break;
            case 2657:
                if (str.equals("ST")) {
                    c3 = 197;
                    break;
                }
                c3 = 65535;
                break;
            case 2659:
                if (str.equals("SV")) {
                    c3 = 198;
                    break;
                }
                c3 = 65535;
                break;
            case 2661:
                if (str.equals("SX")) {
                    c3 = 199;
                    break;
                }
                c3 = 65535;
                break;
            case 2662:
                if (str.equals("SY")) {
                    c3 = 200;
                    break;
                }
                c3 = 65535;
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c3 = 201;
                    break;
                }
                c3 = 65535;
                break;
            case 2671:
                if (str.equals("TC")) {
                    c3 = 202;
                    break;
                }
                c3 = 65535;
                break;
            case 2672:
                if (str.equals("TD")) {
                    c3 = 203;
                    break;
                }
                c3 = 65535;
                break;
            case 2675:
                if (str.equals("TG")) {
                    c3 = 204;
                    break;
                }
                c3 = 65535;
                break;
            case 2676:
                if (str.equals("TH")) {
                    c3 = 205;
                    break;
                }
                c3 = 65535;
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c3 = 206;
                    break;
                }
                c3 = 65535;
                break;
            case 2679:
                if (str.equals("TK")) {
                    c3 = 207;
                    break;
                }
                c3 = 65535;
                break;
            case 2680:
                if (str.equals("TL")) {
                    c3 = 208;
                    break;
                }
                c3 = 65535;
                break;
            case 2681:
                if (str.equals("TM")) {
                    c3 = 209;
                    break;
                }
                c3 = 65535;
                break;
            case 2682:
                if (str.equals("TN")) {
                    c3 = 210;
                    break;
                }
                c3 = 65535;
                break;
            case 2683:
                if (str.equals("TO")) {
                    c3 = 211;
                    break;
                }
                c3 = 65535;
                break;
            case 2686:
                if (str.equals("TR")) {
                    c3 = 212;
                    break;
                }
                c3 = 65535;
                break;
            case 2688:
                if (str.equals("TT")) {
                    c3 = 213;
                    break;
                }
                c3 = 65535;
                break;
            case 2690:
                if (str.equals("TV")) {
                    c3 = 214;
                    break;
                }
                c3 = 65535;
                break;
            case 2691:
                if (str.equals("TW")) {
                    c3 = 215;
                    break;
                }
                c3 = 65535;
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c3 = 216;
                    break;
                }
                c3 = 65535;
                break;
            case 2700:
                if (str.equals("UA")) {
                    c3 = 217;
                    break;
                }
                c3 = 65535;
                break;
            case 2706:
                if (str.equals("UG")) {
                    c3 = 218;
                    break;
                }
                c3 = 65535;
                break;
            case 2718:
                if (str.equals("US")) {
                    c3 = 219;
                    break;
                }
                c3 = 65535;
                break;
            case 2724:
                if (str.equals("UY")) {
                    c3 = 220;
                    break;
                }
                c3 = 65535;
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c3 = 221;
                    break;
                }
                c3 = 65535;
                break;
            case 2731:
                if (str.equals("VA")) {
                    c3 = 222;
                    break;
                }
                c3 = 65535;
                break;
            case 2733:
                if (str.equals("VC")) {
                    c3 = 223;
                    break;
                }
                c3 = 65535;
                break;
            case 2735:
                if (str.equals("VE")) {
                    c3 = 224;
                    break;
                }
                c3 = 65535;
                break;
            case 2737:
                if (str.equals("VG")) {
                    c3 = 225;
                    break;
                }
                c3 = 65535;
                break;
            case 2739:
                if (str.equals("VI")) {
                    c3 = 226;
                    break;
                }
                c3 = 65535;
                break;
            case 2744:
                if (str.equals("VN")) {
                    c3 = 227;
                    break;
                }
                c3 = 65535;
                break;
            case 2751:
                if (str.equals("VU")) {
                    c3 = 228;
                    break;
                }
                c3 = 65535;
                break;
            case 2767:
                if (str.equals("WF")) {
                    c3 = 229;
                    break;
                }
                c3 = 65535;
                break;
            case 2780:
                if (str.equals("WS")) {
                    c3 = 230;
                    break;
                }
                c3 = 65535;
                break;
            case 2803:
                if (str.equals("XK")) {
                    c3 = 231;
                    break;
                }
                c3 = 65535;
                break;
            case 2828:
                if (str.equals("YE")) {
                    c3 = 232;
                    break;
                }
                c3 = 65535;
                break;
            case 2843:
                if (str.equals("YT")) {
                    c3 = 233;
                    break;
                }
                c3 = 65535;
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c3 = 234;
                    break;
                }
                c3 = 65535;
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c3 = 235;
                    break;
                }
                c3 = 65535;
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c3 = 236;
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
            case 26:
            case 29:
            case 'I':
            case 'O':
            case 'p':
            case 't':
            case 'x':
            case 223:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 4, 0};
            case 2:
            case 'P':
                return new int[]{4, 3, 3, 4, 2, 2};
            case 3:
                return new int[]{2, 4, 1, 2, 2, 2};
            case 4:
                return new int[]{0, 2, 0, 3, 2, 2};
            case 5:
            case 231:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 3, 2, 2, 2};
            case '\b':
            case '>':
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
            case 'l':
            case 210:
            case 220:
                return new int[]{2, 1, 1, 1, 2, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
                return new int[]{1, 0, 1, 1, 0, 0};
            case '\f':
                return new int[]{0, 1, 1, 1, 2, 0};
            case '\r':
                return new int[]{1, 3, 4, 4, 2, 2};
            case 14:
            case 'y':
            case 144:
            case 171:
            case 192:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 'K':
            case 128:
            case 169:
            case 194:
            case 211:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 16:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 17:
            case '8':
            case 'E':
            case 'N':
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case zzbbd.zzt.zzm /* 21 */:
            case 145:
            case 190:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 1, 3, 4, 2};
            case 23:
            case '[':
            case 'o':
            case 134:
            case 154:
            case 185:
            case 203:
            case 224:
            case 232:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 3, 2, 2};
            case 25:
            case '2':
            case 222:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 27:
            case '1':
                return new int[]{2, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 30:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 31:
                return new int[]{3, 1, 3, 2, 2, 2};
            case ' ':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '!':
                return new int[]{0, 1, 2, 3, 2, 2};
            case '\"':
                return new int[]{2, 4, 2, 1, 2, 2};
            case '#':
                return new int[]{0, 2, 2, 2, 3, 2};
            case '$':
                return new int[]{4, 2, 3, 2, 2, 2};
            case '%':
            case 'n':
                return new int[]{4, 2, 4, 2, 2, 2};
            case '&':
            case '=':
            case 'W':
                return new int[]{3, 4, 3, 3, 2, 2};
            case '\'':
                return new int[]{0, 0, 0, 1, 0, 2};
            case '(':
            case ':':
            case '{':
                return new int[]{3, 4, 4, 4, 2, 2};
            case ')':
            case 166:
                return new int[]{2, 2, 2, 1, 2, 2};
            case '*':
            case '_':
                return new int[]{1, 2, 2, 2, 3, 2};
            case '+':
                return new int[]{3, 3, 3, 3, 2, 2};
            case ',':
                return new int[]{2, 0, 1, 1, 3, 2};
            case '-':
                return new int[]{2, 3, 4, 3, 2, 2};
            case '.':
                return new int[]{2, 3, 4, 4, 2, 2};
            case '/':
            case '6':
            case 200:
            case 206:
            case 208:
                return new int[]{4, 3, 4, 4, 2, 2};
            case '0':
                return new int[]{2, 1, 0, 0, 2, 2};
            case '3':
            case 's':
                return new int[]{1, 0, 0, 0, 0, 2};
            case '4':
            case 158:
                return new int[]{0, 0, 2, 0, 1, 2};
            case '5':
                return new int[]{0, 1, 2, 2, 2, 3};
            case '7':
                return new int[]{0, 0, 3, 2, 0, 2};
            case '9':
                return new int[]{3, 4, 4, 4, 4, 2};
            case ';':
                return new int[]{2, 3, 2, 1, 2, 2};
            case '<':
            case ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE /* 101 */:
            case 127:
            case 174:
            case 186:
            case 215:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '?':
            case '^':
                return new int[]{0, 1, 1, 1, 2, 2};
            case '@':
                return new int[]{4, 3, 3, 1, 2, 2};
            case 'A':
                return new int[]{0, 0, 0, 3, 0, 2};
            case 'B':
                return new int[]{3, 1, 2, 2, 2, 2};
            case 'C':
            case 'k':
            case 'q':
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'D':
                return new int[]{4, 2, 4, 1, 2, 2};
            case 'F':
                return new int[]{1, 2, 3, 1, 0, 2};
            case 'G':
            case 204:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 'H':
                return new int[]{0, 0, 1, 1, 1, 1};
            case 'J':
                return new int[]{1, 1, 1, 2, 2, 2};
            case 'L':
            case 226:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'M':
            case 152:
            case 228:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 'Q':
                return new int[]{4, 3, 4, 2, 2, 2};
            case 'R':
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 'S':
                return new int[]{4, 2, 1, 4, 2, 2};
            case 'T':
            case 'Z':
            case 189:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 'U':
                return new int[]{2, 3, 2, 2, 2, 2};
            case 'V':
            case 165:
                return new int[]{1, 2, 4, 4, 4, 2};
            case 'X':
                return new int[]{3, 2, 2, 1, 2, 2};
            case 'Y':
                return new int[]{0, 1, 2, 3, 2, 0};
            case '\\':
                return new int[]{0, 0, 0, 1, 3, 2};
            case ']':
                return new int[]{3, 1, 2, 2, 3, 2};
            case '`':
            case 217:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 'a':
                return new int[]{1, 1, 3, 2, 3, 3};
            case 'b':
            case 135:
            case 214:
            case 229:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 'c':
                return new int[]{3, 2, 2, 3, 2, 2};
            case 'd':
                return new int[]{3, 0, 1, 1, 4, 1};
            case 'f':
                return new int[]{0, 0, 0, 1, 1, 2};
            case 'g':
            case 233:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 'h':
                return new int[]{2, 4, 3, 2, 2, 2};
            case 'i':
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'j':
                return new int[]{0, 1, 1, 2, 2, 4};
            case 'm':
                return new int[]{2, 1, 4, 2, 2, 2};
            case 'r':
                return new int[]{0, 1, 1, 3, 4, 4};
            case 'u':
                return new int[]{2, 1, 2, 2, 2, 2};
            case 'v':
                return new int[]{1, 2, 1, 3, 2, 2};
            case 'w':
                return new int[]{3, 3, 2, 4, 2, 2};
            case 'z':
                return new int[]{3, 1, 3, 3, 4, 2};
            case '|':
                return new int[]{3, 3, 2, 2, 2, 2};
            case '}':
                return new int[]{0, 0, 0, 0, 2, 2};
            case '~':
                return new int[]{1, 0, 3, 2, 1, 4};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 130:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 131:
            case 179:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 2, 2};
            case 133:
            case 177:
                return new int[]{1, 2, 1, 2, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 137:
            case 167:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 138:
                return new int[]{2, 4, 2, 3, 2, 2};
            case 139:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 140:
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 143:
            case 236:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 146:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 147:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 148:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 149:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 150:
                return new int[]{1, 0, 3, 1, 3, 2};
            case 151:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 153:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 155:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 156:
            case 164:
            case 198:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 157:
                return new int[]{0, 2, 2, 3, 0, 3};
            case 159:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 160:
            case 161:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 162:
            case 170:
                return new int[]{1, 1, 2, 2, 4, 2};
            case 163:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 168:
                return new int[]{2, 1, 3, 3, 3, 0};
            case 172:
                return new int[]{2, 0, 2, 1, 2, 1};
            case 173:
                return new int[]{3, 4, 1, 2, 2, 2};
            case 175:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 176:
                return new int[]{2, 4, 4, 4, 4, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case 180:
                return new int[]{1, 0, 0, 0, 4, 3};
            case 181:
                return new int[]{3, 4, 2, 0, 2, 2};
            case 182:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 183:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 184:
            case 209:
                return new int[]{4, 2, 1, 1, 2, 2};
            case 187:
                return new int[]{1, 1, 2, 2, 2, 1};
            case 191:
            case 218:
                return new int[]{3, 3, 4, 3, 2, 2};
            case 193:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 195:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 196:
                return new int[]{4, 3, 2, 3, 2, 2};
            case 197:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 199:
            case 202:
                return new int[]{1, 2, 1, 0, 2, 2};
            case 201:
                return new int[]{3, 3, 3, 4, 2, 2};
            case 205:
                return new int[]{0, 2, 2, 3, 3, 4};
            case 207:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 212:
                return new int[]{1, 1, 0, 0, 2, 2};
            case 213:
                return new int[]{1, 4, 1, 3, 2, 2};
            case 216:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 219:
                return new int[]{1, 0, 2, 2, 3, 1};
            case 221:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 225:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 227:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 230:
                return new int[]{3, 1, 3, 1, 2, 2};
            case 234:
                return new int[]{3, 2, 2, 1, 1, 2};
            case 235:
                return new int[]{3, 3, 4, 2, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    public final long b(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        E3.Q q7 = this.f16830a;
        Long l7 = (Long) q7.get(valueOf);
        if (l7 == null) {
            l7 = (Long) q7.get(0);
        }
        if (l7 == null) {
            l7 = 1000000L;
        }
        return l7.longValue();
    }

    public final void c(final int i7, final long j, final long j3) {
        if (i7 == 0 && j == 0 && j3 == this.f16841m) {
            return;
        }
        this.f16841m = j3;
        Iterator it = ((CopyOnWriteArrayList) this.f16831b.f17932b).iterator();
        while (it.hasNext()) {
            final C1628e c1628e = (C1628e) it.next();
            if (!c1628e.f16778c) {
                c1628e.f16776a.post(new Runnable() { // from class: u2.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        B1.h hVar = C1628e.this.f16777b;
                        Q3.o oVar = hVar.f989d;
                        B1.a K7 = hVar.K(((AbstractC0167z) oVar.f5823b).isEmpty() ? null : (c2.D) AbstractC0158p.f((AbstractC0167z) oVar.f5823b));
                        hVar.N(K7, 1006, new v2.e(i7, j, j3) { // from class: B1.g

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ int f984b;

                            /* renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ long f985c;

                            @Override // v2.e
                            public final void invoke(Object obj) {
                                n nVar = (n) ((b) obj);
                                nVar.getClass();
                                a aVar = a.this;
                                D d7 = aVar.f971d;
                                if (d7 != null) {
                                    String b7 = nVar.f1019b.b(aVar.f969b, d7);
                                    HashMap hashMap = nVar.f1025h;
                                    Long l7 = (Long) hashMap.get(b7);
                                    HashMap hashMap2 = nVar.f1024g;
                                    Long l8 = (Long) hashMap2.get(b7);
                                    hashMap.put(b7, Long.valueOf((l7 == null ? 0L : l7.longValue()) + this.f985c));
                                    hashMap2.put(b7, Long.valueOf((l8 != null ? l8.longValue() : 0L) + this.f984b));
                                }
                            }
                        });
                    }
                });
            }
        }
    }
}
