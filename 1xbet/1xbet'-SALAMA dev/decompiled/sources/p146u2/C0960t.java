package p146u2;

import B1.a;
import B1.h;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.L;
import E3.Q;
import Q3.o;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzbbd;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import io.sentry.cache.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p018c2.D;
import p151v2.e;
import p151v2.n;
import p151v2.p;
import p155w1.C1052y0;

/* JADX INFO: renamed from: u2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0960t implements InterfaceC0947f, U {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final L f16829n = AbstractC0167z.H(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final L f16830o = AbstractC0167z.H(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final L f16831p = AbstractC0167z.H(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final L f16832q = AbstractC0167z.H(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final L f16833r = AbstractC0167z.H(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final L f16834s = AbstractC0167z.H(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static C0960t f16835t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f16836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1052y0 f16837b = new C1052y0(22);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S f16838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f16839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16844i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f16846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16847m;

    public C0960t(Context context, HashMap map, int i7, p pVar, boolean z4) {
        this.f16836a = Q.a(map);
        this.f16838c = new S(i7);
        this.f16839d = pVar;
        this.f16840e = z4;
        if (context == null) {
            this.f16844i = 0;
            this.f16846l = b(0);
            return;
        }
        n nVarE = n.e(context);
        int iF = nVarE.f();
        this.f16844i = iF;
        this.f16846l = b(iF);
        C0959s c0959s = new C0959s(this);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = (CopyOnWriteArrayList) nVarE.f17144c;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(c0959s));
        ((Handler) nVarE.f17143b).post(new f(8, nVarE, c0959s));
    }

    public static int[] a(String str) {
        byte b7 = 0;
        str.getClass();
        switch (str.hashCode()) {
            case 2083:
                if (!str.equals("AD")) {
                    b7 = -1;
                }
                break;
            case 2084:
                b7 = !str.equals("AE") ? (byte) -1 : (byte) 1;
                break;
            case 2085:
                b7 = !str.equals("AF") ? (byte) -1 : (byte) 2;
                break;
            case 2086:
                b7 = !str.equals("AG") ? (byte) -1 : (byte) 3;
                break;
            case 2088:
                b7 = !str.equals("AI") ? (byte) -1 : (byte) 4;
                break;
            case 2091:
                b7 = !str.equals("AL") ? (byte) -1 : (byte) 5;
                break;
            case 2092:
                b7 = !str.equals("AM") ? (byte) -1 : (byte) 6;
                break;
            case 2094:
                b7 = !str.equals("AO") ? (byte) -1 : (byte) 7;
                break;
            case 2096:
                b7 = !str.equals("AQ") ? (byte) -1 : (byte) 8;
                break;
            case 2097:
                b7 = !str.equals("AR") ? (byte) -1 : (byte) 9;
                break;
            case 2098:
                b7 = !str.equals("AS") ? (byte) -1 : (byte) 10;
                break;
            case 2099:
                b7 = !str.equals("AT") ? (byte) -1 : (byte) 11;
                break;
            case 2100:
                b7 = !str.equals("AU") ? (byte) -1 : (byte) 12;
                break;
            case 2102:
                b7 = !str.equals("AW") ? (byte) -1 : (byte) 13;
                break;
            case 2103:
                b7 = !str.equals("AX") ? (byte) -1 : (byte) 14;
                break;
            case 2105:
                b7 = !str.equals("AZ") ? (byte) -1 : (byte) 15;
                break;
            case 2111:
                b7 = !str.equals("BA") ? (byte) -1 : (byte) 16;
                break;
            case 2112:
                b7 = !str.equals("BB") ? (byte) -1 : (byte) 17;
                break;
            case 2114:
                b7 = !str.equals("BD") ? (byte) -1 : (byte) 18;
                break;
            case 2115:
                b7 = !str.equals("BE") ? (byte) -1 : (byte) 19;
                break;
            case 2116:
                b7 = !str.equals("BF") ? (byte) -1 : (byte) 20;
                break;
            case 2117:
                b7 = !str.equals("BG") ? (byte) -1 : (byte) 21;
                break;
            case 2118:
                b7 = !str.equals("BH") ? (byte) -1 : (byte) 22;
                break;
            case 2119:
                b7 = !str.equals("BI") ? (byte) -1 : (byte) 23;
                break;
            case 2120:
                b7 = !str.equals("BJ") ? (byte) -1 : (byte) 24;
                break;
            case 2122:
                b7 = !str.equals("BL") ? (byte) -1 : (byte) 25;
                break;
            case 2123:
                b7 = !str.equals("BM") ? (byte) -1 : (byte) 26;
                break;
            case 2124:
                b7 = !str.equals("BN") ? (byte) -1 : (byte) 27;
                break;
            case 2125:
                b7 = !str.equals("BO") ? (byte) -1 : (byte) 28;
                break;
            case 2127:
                b7 = !str.equals("BQ") ? (byte) -1 : (byte) 29;
                break;
            case 2129:
                b7 = !str.equals("BS") ? (byte) -1 : (byte) 30;
                break;
            case 2130:
                b7 = !str.equals("BT") ? (byte) -1 : (byte) 31;
                break;
            case 2133:
                b7 = !str.equals("BW") ? (byte) -1 : (byte) 32;
                break;
            case 2135:
                b7 = !str.equals("BY") ? (byte) -1 : (byte) 33;
                break;
            case 2136:
                b7 = !str.equals("BZ") ? (byte) -1 : (byte) 34;
                break;
            case 2142:
                b7 = !str.equals("CA") ? (byte) -1 : (byte) 35;
                break;
            case 2145:
                b7 = !str.equals("CD") ? (byte) -1 : (byte) 36;
                break;
            case 2147:
                b7 = !str.equals("CF") ? (byte) -1 : (byte) 37;
                break;
            case 2148:
                b7 = !str.equals("CG") ? (byte) -1 : (byte) 38;
                break;
            case 2149:
                b7 = !str.equals("CH") ? (byte) -1 : (byte) 39;
                break;
            case 2150:
                b7 = !str.equals("CI") ? (byte) -1 : (byte) 40;
                break;
            case 2152:
                b7 = !str.equals("CK") ? (byte) -1 : (byte) 41;
                break;
            case 2153:
                b7 = !str.equals("CL") ? (byte) -1 : (byte) 42;
                break;
            case 2154:
                b7 = !str.equals("CM") ? (byte) -1 : (byte) 43;
                break;
            case 2155:
                b7 = !str.equals("CN") ? (byte) -1 : (byte) 44;
                break;
            case 2156:
                b7 = !str.equals("CO") ? (byte) -1 : (byte) 45;
                break;
            case 2159:
                b7 = !str.equals("CR") ? (byte) -1 : (byte) 46;
                break;
            case 2162:
                b7 = !str.equals("CU") ? (byte) -1 : (byte) 47;
                break;
            case 2163:
                b7 = !str.equals("CV") ? (byte) -1 : (byte) 48;
                break;
            case 2164:
                b7 = !str.equals("CW") ? (byte) -1 : (byte) 49;
                break;
            case 2165:
                b7 = !str.equals("CX") ? (byte) -1 : (byte) 50;
                break;
            case 2166:
                b7 = !str.equals("CY") ? (byte) -1 : (byte) 51;
                break;
            case 2167:
                b7 = !str.equals("CZ") ? (byte) -1 : (byte) 52;
                break;
            case 2177:
                b7 = !str.equals("DE") ? (byte) -1 : (byte) 53;
                break;
            case 2182:
                b7 = !str.equals("DJ") ? (byte) -1 : (byte) 54;
                break;
            case 2183:
                b7 = !str.equals("DK") ? (byte) -1 : (byte) 55;
                break;
            case 2185:
                b7 = !str.equals("DM") ? (byte) -1 : (byte) 56;
                break;
            case 2187:
                b7 = !str.equals("DO") ? (byte) -1 : (byte) 57;
                break;
            case 2198:
                b7 = !str.equals("DZ") ? (byte) -1 : (byte) 58;
                break;
            case 2206:
                b7 = !str.equals("EC") ? (byte) -1 : (byte) 59;
                break;
            case 2208:
                b7 = !str.equals("EE") ? (byte) -1 : (byte) 60;
                break;
            case 2210:
                b7 = !str.equals("EG") ? (byte) -1 : (byte) 61;
                break;
            case 2221:
                b7 = !str.equals("ER") ? (byte) -1 : (byte) 62;
                break;
            case 2222:
                b7 = !str.equals("ES") ? (byte) -1 : (byte) 63;
                break;
            case 2223:
                b7 = !str.equals("ET") ? (byte) -1 : (byte) 64;
                break;
            case 2243:
                b7 = !str.equals("FI") ? (byte) -1 : (byte) 65;
                break;
            case 2244:
                b7 = !str.equals("FJ") ? (byte) -1 : (byte) 66;
                break;
            case 2245:
                b7 = !str.equals("FK") ? (byte) -1 : (byte) 67;
                break;
            case 2247:
                b7 = !str.equals("FM") ? (byte) -1 : (byte) 68;
                break;
            case 2249:
                b7 = !str.equals("FO") ? (byte) -1 : (byte) 69;
                break;
            case 2252:
                b7 = !str.equals("FR") ? (byte) -1 : (byte) 70;
                break;
            case 2266:
                b7 = !str.equals("GA") ? (byte) -1 : (byte) 71;
                break;
            case 2267:
                b7 = !str.equals("GB") ? (byte) -1 : (byte) 72;
                break;
            case 2269:
                b7 = !str.equals("GD") ? (byte) -1 : (byte) 73;
                break;
            case 2270:
                b7 = !str.equals("GE") ? (byte) -1 : (byte) 74;
                break;
            case 2271:
                b7 = !str.equals("GF") ? (byte) -1 : (byte) 75;
                break;
            case 2272:
                b7 = !str.equals("GG") ? (byte) -1 : (byte) 76;
                break;
            case 2273:
                b7 = !str.equals("GH") ? (byte) -1 : (byte) 77;
                break;
            case 2274:
                b7 = !str.equals("GI") ? (byte) -1 : (byte) 78;
                break;
            case 2277:
                b7 = !str.equals("GL") ? (byte) -1 : (byte) 79;
                break;
            case 2278:
                b7 = !str.equals("GM") ? (byte) -1 : (byte) 80;
                break;
            case 2279:
                b7 = !str.equals("GN") ? (byte) -1 : (byte) 81;
                break;
            case 2281:
                b7 = !str.equals("GP") ? (byte) -1 : (byte) 82;
                break;
            case 2282:
                b7 = !str.equals("GQ") ? (byte) -1 : (byte) 83;
                break;
            case 2283:
                b7 = !str.equals("GR") ? (byte) -1 : (byte) 84;
                break;
            case 2285:
                b7 = !str.equals("GT") ? (byte) -1 : (byte) 85;
                break;
            case 2286:
                b7 = !str.equals("GU") ? (byte) -1 : (byte) 86;
                break;
            case 2288:
                b7 = !str.equals("GW") ? (byte) -1 : (byte) 87;
                break;
            case 2290:
                b7 = !str.equals("GY") ? (byte) -1 : (byte) 88;
                break;
            case 2307:
                b7 = !str.equals("HK") ? (byte) -1 : (byte) 89;
                break;
            case 2314:
                b7 = !str.equals("HR") ? (byte) -1 : (byte) 90;
                break;
            case 2316:
                b7 = !str.equals("HT") ? (byte) -1 : (byte) 91;
                break;
            case 2317:
                b7 = !str.equals("HU") ? (byte) -1 : (byte) 92;
                break;
            case 2331:
                b7 = !str.equals("ID") ? (byte) -1 : (byte) 93;
                break;
            case 2332:
                b7 = !str.equals("IE") ? (byte) -1 : (byte) 94;
                break;
            case 2339:
                b7 = !str.equals("IL") ? (byte) -1 : (byte) 95;
                break;
            case 2340:
                b7 = !str.equals("IM") ? (byte) -1 : (byte) 96;
                break;
            case 2341:
                b7 = !str.equals("IN") ? (byte) -1 : (byte) 97;
                break;
            case 2342:
                b7 = !str.equals("IO") ? (byte) -1 : (byte) 98;
                break;
            case 2344:
                b7 = !str.equals("IQ") ? (byte) -1 : (byte) 99;
                break;
            case 2345:
                b7 = !str.equals("IR") ? (byte) -1 : (byte) 100;
                break;
            case 2346:
                b7 = !str.equals("IS") ? (byte) -1 : (byte) 101;
                break;
            case 2347:
                b7 = !str.equals("IT") ? (byte) -1 : (byte) 102;
                break;
            case 2363:
                b7 = !str.equals("JE") ? (byte) -1 : (byte) 103;
                break;
            case 2371:
                b7 = !str.equals("JM") ? (byte) -1 : (byte) 104;
                break;
            case 2373:
                b7 = !str.equals("JO") ? (byte) -1 : (byte) 105;
                break;
            case 2374:
                b7 = !str.equals("JP") ? (byte) -1 : (byte) 106;
                break;
            case 2394:
                b7 = !str.equals("KE") ? (byte) -1 : (byte) 107;
                break;
            case 2396:
                b7 = !str.equals("KG") ? (byte) -1 : (byte) 108;
                break;
            case 2397:
                b7 = !str.equals("KH") ? (byte) -1 : (byte) 109;
                break;
            case 2398:
                b7 = !str.equals("KI") ? (byte) -1 : (byte) 110;
                break;
            case 2402:
                b7 = !str.equals("KM") ? (byte) -1 : (byte) 111;
                break;
            case 2403:
                b7 = !str.equals("KN") ? (byte) -1 : (byte) 112;
                break;
            case 2405:
                b7 = !str.equals("KP") ? (byte) -1 : (byte) 113;
                break;
            case 2407:
                b7 = !str.equals("KR") ? (byte) -1 : (byte) 114;
                break;
            case 2412:
                b7 = !str.equals("KW") ? (byte) -1 : (byte) 115;
                break;
            case 2414:
                b7 = !str.equals("KY") ? (byte) -1 : (byte) 116;
                break;
            case 2415:
                b7 = !str.equals("KZ") ? (byte) -1 : (byte) 117;
                break;
            case 2421:
                b7 = !str.equals("LA") ? (byte) -1 : (byte) 118;
                break;
            case 2422:
                b7 = !str.equals("LB") ? (byte) -1 : (byte) 119;
                break;
            case 2423:
                b7 = !str.equals("LC") ? (byte) -1 : (byte) 120;
                break;
            case 2429:
                b7 = !str.equals("LI") ? (byte) -1 : (byte) 121;
                break;
            case 2431:
                b7 = !str.equals("LK") ? (byte) -1 : (byte) 122;
                break;
            case 2438:
                b7 = !str.equals("LR") ? (byte) -1 : (byte) 123;
                break;
            case 2439:
                b7 = !str.equals("LS") ? (byte) -1 : (byte) 124;
                break;
            case 2440:
                b7 = !str.equals("LT") ? (byte) -1 : (byte) 125;
                break;
            case 2441:
                b7 = !str.equals("LU") ? (byte) -1 : (byte) 126;
                break;
            case 2442:
                b7 = !str.equals("LV") ? (byte) -1 : (byte) 127;
                break;
            case 2445:
                b7 = !str.equals("LY") ? (byte) -1 : (byte) 128;
                break;
            case 2452:
                b7 = !str.equals("MA") ? (byte) -1 : (byte) 129;
                break;
            case 2454:
                b7 = !str.equals("MC") ? (byte) -1 : (byte) 130;
                break;
            case 2455:
                b7 = !str.equals("MD") ? (byte) -1 : (byte) 131;
                break;
            case 2456:
                b7 = !str.equals("ME") ? (byte) -1 : (byte) 132;
                break;
            case 2457:
                b7 = !str.equals("MF") ? (byte) -1 : (byte) 133;
                break;
            case 2458:
                b7 = !str.equals("MG") ? (byte) -1 : (byte) 134;
                break;
            case 2459:
                b7 = !str.equals("MH") ? (byte) -1 : (byte) 135;
                break;
            case 2462:
                b7 = !str.equals("MK") ? (byte) -1 : (byte) 136;
                break;
            case 2463:
                b7 = !str.equals("ML") ? (byte) -1 : (byte) 137;
                break;
            case 2464:
                b7 = !str.equals("MM") ? (byte) -1 : (byte) 138;
                break;
            case 2465:
                b7 = !str.equals("MN") ? (byte) -1 : (byte) 139;
                break;
            case 2466:
                b7 = !str.equals("MO") ? (byte) -1 : (byte) 140;
                break;
            case 2467:
                b7 = !str.equals("MP") ? (byte) -1 : (byte) 141;
                break;
            case 2468:
                b7 = !str.equals("MQ") ? (byte) -1 : (byte) 142;
                break;
            case 2469:
                b7 = !str.equals("MR") ? (byte) -1 : (byte) 143;
                break;
            case 2470:
                b7 = !str.equals("MS") ? (byte) -1 : (byte) 144;
                break;
            case 2471:
                b7 = !str.equals("MT") ? (byte) -1 : (byte) 145;
                break;
            case 2472:
                b7 = !str.equals("MU") ? (byte) -1 : (byte) 146;
                break;
            case 2473:
                b7 = !str.equals("MV") ? (byte) -1 : (byte) 147;
                break;
            case 2474:
                b7 = !str.equals("MW") ? (byte) -1 : (byte) 148;
                break;
            case 2475:
                b7 = !str.equals("MX") ? (byte) -1 : (byte) 149;
                break;
            case 2476:
                b7 = !str.equals("MY") ? (byte) -1 : (byte) 150;
                break;
            case 2477:
                b7 = !str.equals("MZ") ? (byte) -1 : (byte) 151;
                break;
            case 2483:
                b7 = !str.equals("NA") ? (byte) -1 : (byte) 152;
                break;
            case 2485:
                b7 = !str.equals("NC") ? (byte) -1 : (byte) 153;
                break;
            case 2487:
                b7 = !str.equals("NE") ? (byte) -1 : (byte) 154;
                break;
            case 2489:
                b7 = !str.equals("NG") ? (byte) -1 : (byte) 155;
                break;
            case 2491:
                b7 = !str.equals("NI") ? (byte) -1 : (byte) 156;
                break;
            case 2494:
                b7 = !str.equals("NL") ? (byte) -1 : (byte) 157;
                break;
            case 2497:
                b7 = !str.equals("NO") ? (byte) -1 : (byte) 158;
                break;
            case 2498:
                b7 = !str.equals("NP") ? (byte) -1 : (byte) 159;
                break;
            case 2500:
                b7 = !str.equals("NR") ? (byte) -1 : (byte) 160;
                break;
            case 2503:
                b7 = !str.equals("NU") ? (byte) -1 : (byte) 161;
                break;
            case 2508:
                b7 = !str.equals("NZ") ? (byte) -1 : (byte) 162;
                break;
            case 2526:
                b7 = !str.equals("OM") ? (byte) -1 : (byte) 163;
                break;
            case 2545:
                b7 = !str.equals("PA") ? (byte) -1 : (byte) 164;
                break;
            case 2549:
                b7 = !str.equals("PE") ? (byte) -1 : (byte) 165;
                break;
            case 2550:
                b7 = !str.equals("PF") ? (byte) -1 : (byte) 166;
                break;
            case 2551:
                b7 = !str.equals("PG") ? (byte) -1 : (byte) 167;
                break;
            case 2552:
                b7 = !str.equals("PH") ? (byte) -1 : (byte) 168;
                break;
            case 2555:
                b7 = !str.equals("PK") ? (byte) -1 : (byte) 169;
                break;
            case 2556:
                b7 = !str.equals("PL") ? (byte) -1 : (byte) 170;
                break;
            case 2557:
                b7 = !str.equals("PM") ? (byte) -1 : (byte) 171;
                break;
            case 2562:
                b7 = !str.equals("PR") ? (byte) -1 : (byte) 172;
                break;
            case 2563:
                b7 = !str.equals("PS") ? (byte) -1 : (byte) 173;
                break;
            case 2564:
                b7 = !str.equals("PT") ? (byte) -1 : (byte) 174;
                break;
            case 2567:
                b7 = !str.equals("PW") ? (byte) -1 : (byte) 175;
                break;
            case 2576:
                b7 = !str.equals("QA") ? (byte) -1 : (byte) 176;
                break;
            case 2611:
                b7 = !str.equals("RE") ? (byte) -1 : (byte) 177;
                break;
            case 2621:
                b7 = !str.equals("RO") ? (byte) -1 : (byte) 178;
                break;
            case 2625:
                b7 = !str.equals("RS") ? (byte) -1 : (byte) 179;
                break;
            case 2627:
                b7 = !str.equals("RU") ? (byte) -1 : (byte) 180;
                break;
            case 2629:
                b7 = !str.equals("RW") ? (byte) -1 : (byte) 181;
                break;
            case 2638:
                b7 = !str.equals("SA") ? (byte) -1 : (byte) 182;
                break;
            case 2639:
                b7 = !str.equals("SB") ? (byte) -1 : (byte) 183;
                break;
            case 2640:
                b7 = !str.equals("SC") ? (byte) -1 : (byte) 184;
                break;
            case 2641:
                b7 = !str.equals("SD") ? (byte) -1 : (byte) 185;
                break;
            case 2642:
                b7 = !str.equals("SE") ? (byte) -1 : (byte) 186;
                break;
            case 2644:
                b7 = !str.equals("SG") ? (byte) -1 : (byte) 187;
                break;
            case 2645:
                b7 = !str.equals("SH") ? (byte) -1 : (byte) 188;
                break;
            case 2646:
                b7 = !str.equals("SI") ? (byte) -1 : (byte) 189;
                break;
            case 2648:
                b7 = !str.equals("SK") ? (byte) -1 : (byte) 190;
                break;
            case 2649:
                b7 = !str.equals("SL") ? (byte) -1 : (byte) 191;
                break;
            case 2650:
                b7 = !str.equals("SM") ? (byte) -1 : (byte) 192;
                break;
            case 2651:
                b7 = !str.equals("SN") ? (byte) -1 : (byte) 193;
                break;
            case 2652:
                b7 = !str.equals("SO") ? (byte) -1 : (byte) 194;
                break;
            case 2655:
                b7 = !str.equals("SR") ? (byte) -1 : (byte) 195;
                break;
            case 2656:
                b7 = !str.equals("SS") ? (byte) -1 : (byte) 196;
                break;
            case 2657:
                b7 = !str.equals("ST") ? (byte) -1 : (byte) 197;
                break;
            case 2659:
                b7 = !str.equals("SV") ? (byte) -1 : (byte) 198;
                break;
            case 2661:
                b7 = !str.equals("SX") ? (byte) -1 : (byte) 199;
                break;
            case 2662:
                b7 = !str.equals("SY") ? (byte) -1 : (byte) 200;
                break;
            case 2663:
                b7 = !str.equals("SZ") ? (byte) -1 : (byte) 201;
                break;
            case 2671:
                b7 = !str.equals("TC") ? (byte) -1 : (byte) 202;
                break;
            case 2672:
                b7 = !str.equals("TD") ? (byte) -1 : (byte) 203;
                break;
            case 2675:
                b7 = !str.equals("TG") ? (byte) -1 : (byte) 204;
                break;
            case 2676:
                b7 = !str.equals("TH") ? (byte) -1 : (byte) 205;
                break;
            case 2678:
                b7 = !str.equals("TJ") ? (byte) -1 : (byte) 206;
                break;
            case 2679:
                b7 = !str.equals("TK") ? (byte) -1 : (byte) 207;
                break;
            case 2680:
                b7 = !str.equals("TL") ? (byte) -1 : (byte) 208;
                break;
            case 2681:
                b7 = !str.equals("TM") ? (byte) -1 : (byte) 209;
                break;
            case 2682:
                b7 = !str.equals("TN") ? (byte) -1 : (byte) 210;
                break;
            case 2683:
                b7 = !str.equals("TO") ? (byte) -1 : (byte) 211;
                break;
            case 2686:
                b7 = !str.equals("TR") ? (byte) -1 : (byte) 212;
                break;
            case 2688:
                b7 = !str.equals("TT") ? (byte) -1 : (byte) 213;
                break;
            case 2690:
                b7 = !str.equals("TV") ? (byte) -1 : (byte) 214;
                break;
            case 2691:
                b7 = !str.equals("TW") ? (byte) -1 : (byte) 215;
                break;
            case 2694:
                b7 = !str.equals("TZ") ? (byte) -1 : (byte) 216;
                break;
            case 2700:
                b7 = !str.equals("UA") ? (byte) -1 : (byte) 217;
                break;
            case 2706:
                b7 = !str.equals("UG") ? (byte) -1 : (byte) 218;
                break;
            case 2718:
                b7 = !str.equals("US") ? (byte) -1 : (byte) 219;
                break;
            case 2724:
                b7 = !str.equals("UY") ? (byte) -1 : (byte) 220;
                break;
            case 2725:
                b7 = !str.equals("UZ") ? (byte) -1 : (byte) 221;
                break;
            case 2731:
                b7 = !str.equals("VA") ? (byte) -1 : (byte) 222;
                break;
            case 2733:
                b7 = !str.equals("VC") ? (byte) -1 : (byte) 223;
                break;
            case 2735:
                b7 = !str.equals("VE") ? (byte) -1 : (byte) 224;
                break;
            case 2737:
                b7 = !str.equals("VG") ? (byte) -1 : (byte) 225;
                break;
            case 2739:
                b7 = !str.equals("VI") ? (byte) -1 : (byte) 226;
                break;
            case 2744:
                b7 = !str.equals("VN") ? (byte) -1 : (byte) 227;
                break;
            case 2751:
                b7 = !str.equals("VU") ? (byte) -1 : (byte) 228;
                break;
            case 2767:
                b7 = !str.equals("WF") ? (byte) -1 : (byte) 229;
                break;
            case 2780:
                b7 = !str.equals("WS") ? (byte) -1 : (byte) 230;
                break;
            case 2803:
                b7 = !str.equals("XK") ? (byte) -1 : (byte) 231;
                break;
            case 2828:
                b7 = !str.equals("YE") ? (byte) -1 : (byte) 232;
                break;
            case 2843:
                b7 = !str.equals("YT") ? (byte) -1 : (byte) 233;
                break;
            case 2855:
                b7 = !str.equals("ZA") ? (byte) -1 : (byte) 234;
                break;
            case 2867:
                b7 = !str.equals("ZM") ? (byte) -1 : (byte) 235;
                break;
            case 2877:
                b7 = !str.equals("ZW") ? (byte) -1 : (byte) 236;
                break;
            default:
                b7 = -1;
                break;
        }
        switch (b7) {
            case 0:
            case 26:
            case 29:
            case 73:
            case 79:
            case 112:
            case 116:
            case 120:
            case 223:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 4, 0};
            case 2:
            case 80:
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
            case 8:
            case 62:
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
            case 108:
            case 210:
            case 220:
                return new int[]{2, 1, 1, 1, 2, 2};
            case 10:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
                return new int[]{1, 0, 1, 1, 0, 0};
            case 12:
                return new int[]{0, 1, 1, 1, 2, 0};
            case 13:
                return new int[]{1, 3, 4, 4, 2, 2};
            case 14:
            case 121:
            case 144:
            case 171:
            case 192:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 75:
            case 128:
            case 169:
            case 194:
            case 211:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 16:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 17:
            case 56:
            case 69:
            case 78:
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
            case 91:
            case 111:
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
            case 50:
            case 222:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 27:
            case 49:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 30:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 31:
                return new int[]{3, 1, 3, 2, 2, 2};
            case 32:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 33:
                return new int[]{0, 1, 2, 3, 2, 2};
            case 34:
                return new int[]{2, 4, 2, 1, 2, 2};
            case 35:
                return new int[]{0, 2, 2, 2, 3, 2};
            case 36:
                return new int[]{4, 2, 3, 2, 2, 2};
            case 37:
            case 110:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 38:
            case 61:
            case 87:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 39:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 40:
            case 58:
            case 123:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 41:
            case 166:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 42:
            case 95:
                return new int[]{1, 2, 2, 2, 3, 2};
            case 43:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 44:
                return new int[]{2, 0, 1, 1, 3, 2};
            case 45:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 46:
                return new int[]{2, 3, 4, 4, 2, 2};
            case 47:
            case 54:
            case 200:
            case 206:
            case 208:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 48:
                return new int[]{2, 1, 0, 0, 2, 2};
            case 51:
            case 115:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 52:
            case 158:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 53:
                return new int[]{0, 1, 2, 2, 2, 3};
            case 55:
                return new int[]{0, 0, 3, 2, 0, 2};
            case 57:
                return new int[]{3, 4, 4, 4, 4, 2};
            case 59:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 60:
            case ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE /* 101 */:
            case 127:
            case 174:
            case 186:
            case 215:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 63:
            case 94:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 64:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 65:
                return new int[]{0, 0, 0, 3, 0, 2};
            case 66:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 67:
            case 107:
            case 113:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 68:
                return new int[]{4, 2, 4, 1, 2, 2};
            case 70:
                return new int[]{1, 2, 3, 1, 0, 2};
            case 71:
            case 204:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 72:
                return new int[]{0, 0, 1, 1, 1, 1};
            case 74:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 76:
            case 226:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 77:
            case 152:
            case 228:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 81:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 82:
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 83:
                return new int[]{4, 2, 1, 4, 2, 2};
            case 84:
            case 90:
            case 189:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 85:
                return new int[]{2, 3, 2, 2, 2, 2};
            case 86:
            case 165:
                return new int[]{1, 2, 4, 4, 4, 2};
            case 88:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 89:
                return new int[]{0, 1, 2, 3, 2, 0};
            case 92:
                return new int[]{0, 0, 0, 1, 3, 2};
            case 93:
                return new int[]{3, 1, 2, 2, 3, 2};
            case 96:
            case 217:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 97:
                return new int[]{1, 1, 3, 2, 3, 3};
            case 98:
            case 135:
            case 214:
            case 229:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 99:
                return new int[]{3, 2, 2, 3, 2, 2};
            case 100:
                return new int[]{3, 0, 1, 1, 4, 1};
            case 102:
                return new int[]{0, 0, 0, 1, 1, 2};
            case 103:
            case 233:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 104:
                return new int[]{2, 4, 3, 2, 2, 2};
            case 105:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 106:
                return new int[]{0, 1, 1, 2, 2, 4};
            case 109:
                return new int[]{2, 1, 4, 2, 2, 2};
            case 114:
                return new int[]{0, 1, 1, 3, 4, 4};
            case 117:
                return new int[]{2, 1, 2, 2, 2, 2};
            case 118:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 119:
                return new int[]{3, 3, 2, 4, 2, 2};
            case 122:
                return new int[]{3, 1, 3, 3, 4, 2};
            case 124:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 125:
                return new int[]{0, 0, 0, 0, 2, 2};
            case 126:
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
        Integer numValueOf = Integer.valueOf(i7);
        Q q7 = this.f16836a;
        Long l7 = (Long) q7.get(numValueOf);
        if (l7 == null) {
            l7 = (Long) q7.get(0);
        }
        if (l7 == null) {
            l7 = 1000000L;
        }
        return l7.longValue();
    }

    public final void c(final int i7, final long j, final long j3) {
        if (i7 == 0 && j == 0 && j3 == this.f16847m) {
            return;
        }
        this.f16847m = j3;
        for (final C0946e c0946e : (CopyOnWriteArrayList) this.f16837b.f17938b) {
            if (!c0946e.f16784c) {
                c0946e.f16782a.post(new Runnable() { // from class: u2.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        h hVar = c0946e.f16783b;
                        o oVar = hVar.f989d;
                        a aVarK = hVar.K(((AbstractC0167z) oVar.f5823b).isEmpty() ? null : (D) AbstractC0158p.f((AbstractC0167z) oVar.f5823b));
                        hVar.N(aVarK, 1006, new e(i7, j, j3) { // from class: B1.g

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ int f984b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ long f985c;

                            @Override // p151v2.e
                            public final void invoke(Object obj) {
                                n nVar = (n) ((b) obj);
                                nVar.getClass();
                                a aVar = this.f983a;
                                D d7 = aVar.f971d;
                                if (d7 != null) {
                                    String strB = nVar.f1019b.b(aVar.f969b, d7);
                                    HashMap map = nVar.f1025h;
                                    Long l7 = (Long) map.get(strB);
                                    HashMap map2 = nVar.f1024g;
                                    Long l8 = (Long) map2.get(strB);
                                    map.put(strB, Long.valueOf((l7 == null ? 0L : l7.longValue()) + this.f985c));
                                    map2.put(strB, Long.valueOf((l8 != null ? l8.longValue() : 0L) + ((long) this.f984b)));
                                }
                            }
                        });
                    }
                });
            }
        }
    }
}
