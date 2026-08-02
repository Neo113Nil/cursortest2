package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.rH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1514rH implements RB {

    /* renamed from: B, reason: collision with root package name */
    public static C1514rH f15288B;

    /* renamed from: k, reason: collision with root package name */
    public final Cv f15294k;

    /* renamed from: l, reason: collision with root package name */
    public final Hq f15295l = new Hq(15);

    /* renamed from: m, reason: collision with root package name */
    public final C1739wH f15296m = new C1739wH();

    /* renamed from: n, reason: collision with root package name */
    public int f15297n;

    /* renamed from: o, reason: collision with root package name */
    public long f15298o;

    /* renamed from: p, reason: collision with root package name */
    public long f15299p;

    /* renamed from: q, reason: collision with root package name */
    public long f15300q;

    /* renamed from: r, reason: collision with root package name */
    public long f15301r;

    /* renamed from: s, reason: collision with root package name */
    public long f15302s;

    /* renamed from: t, reason: collision with root package name */
    public long f15303t;

    /* renamed from: u, reason: collision with root package name */
    public int f15304u;

    /* renamed from: v, reason: collision with root package name */
    public static final C1761wv f15289v = AbstractC1044gv.p(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: w, reason: collision with root package name */
    public static final C1761wv f15290w = AbstractC1044gv.p(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: x, reason: collision with root package name */
    public static final C1761wv f15291x = AbstractC1044gv.p(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: y, reason: collision with root package name */
    public static final C1761wv f15292y = AbstractC1044gv.p(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: z, reason: collision with root package name */
    public static final C1761wv f15293z = AbstractC1044gv.p(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: A, reason: collision with root package name */
    public static final C1761wv f15287A = AbstractC1044gv.p(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    public C1514rH(Context context, HashMap hashMap) {
        this.f15294k = Cv.a(hashMap);
        if (context == null) {
            this.f15304u = 0;
            this.f15302s = d(0);
            return;
        }
        C0901dm f = C0901dm.f(context);
        int b3 = f.b();
        this.f15304u = b3;
        this.f15302s = d(b3);
        C1470qH c1470qH = new C1470qH(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) f.f13166c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(c1470qH));
        ((Handler) f.f13165b).post(new Kw(24, f, c1470qH));
    }

    public static synchronized C1514rH a(Context context) {
        C1514rH c1514rH;
        String E5;
        TelephonyManager telephonyManager;
        synchronized (C1514rH.class) {
            try {
                if (f15288B == null) {
                    Context applicationContext = context == null ? null : context.getApplicationContext();
                    int i = AbstractC1260lo.f14419a;
                    if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                        if (!TextUtils.isEmpty(networkCountryIso)) {
                            E5 = AbstractC0952et.E(networkCountryIso);
                            int[] h3 = h(E5);
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            C1761wv c1761wv = f15289v;
                            hashMap.put(2, (Long) c1761wv.get(h3[0]));
                            hashMap.put(3, (Long) f15290w.get(h3[1]));
                            hashMap.put(4, (Long) f15291x.get(h3[2]));
                            hashMap.put(5, (Long) f15292y.get(h3[3]));
                            hashMap.put(10, (Long) f15293z.get(h3[4]));
                            hashMap.put(9, (Long) f15287A.get(h3[5]));
                            hashMap.put(7, (Long) c1761wv.get(h3[0]));
                            f15288B = new C1514rH(applicationContext, hashMap);
                        }
                    }
                    E5 = AbstractC0952et.E(Locale.getDefault().getCountry());
                    int[] h32 = h(E5);
                    HashMap hashMap2 = new HashMap(8);
                    hashMap2.put(0, 1000000L);
                    C1761wv c1761wv2 = f15289v;
                    hashMap2.put(2, (Long) c1761wv2.get(h32[0]));
                    hashMap2.put(3, (Long) f15290w.get(h32[1]));
                    hashMap2.put(4, (Long) f15291x.get(h32[2]));
                    hashMap2.put(5, (Long) f15292y.get(h32[3]));
                    hashMap2.put(10, (Long) f15293z.get(h32[4]));
                    hashMap2.put(9, (Long) f15287A.get(h32[5]));
                    hashMap2.put(7, (Long) c1761wv2.get(h32[0]));
                    f15288B = new C1514rH(applicationContext, hashMap2);
                }
                c1514rH = f15288B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1514rH;
    }

    public static void b(C1514rH c1514rH, int i) {
        C1514rH c1514rH2;
        Throwable th;
        int i5;
        synchronized (c1514rH) {
            try {
                if (c1514rH.f15304u != i) {
                    c1514rH.f15304u = i;
                    if (i != 1 && i != 0 && i != 8) {
                        c1514rH.f15302s = c1514rH.d(i);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (c1514rH.f15297n > 0) {
                            try {
                                i5 = (int) (elapsedRealtime - c1514rH.f15298o);
                            } catch (Throwable th2) {
                                th = th2;
                                c1514rH2 = c1514rH;
                                throw th;
                            }
                        } else {
                            i5 = 0;
                        }
                        c1514rH2 = c1514rH;
                        try {
                            c1514rH2.e(i5, c1514rH.f15299p, c1514rH.f15302s);
                            c1514rH2.f15298o = elapsedRealtime;
                            c1514rH2.f15299p = 0L;
                            c1514rH2.f15301r = 0L;
                            c1514rH2.f15300q = 0L;
                            C1739wH c1739wH = c1514rH2.f15296m;
                            try {
                                c1739wH.f16110a.clear();
                                c1739wH.f16112c = -1;
                                c1739wH.f16113d = 0;
                                c1739wH.f16114e = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                c1514rH2 = c1514rH;
                th = th5;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x013b, code lost:
    
        if (r3.equals("YT") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0526, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0145, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0b12, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x015d, code lost:
    
        if (r3.equals("WS") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0542, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0167, code lost:
    
        if (r3.equals("WF") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x060e, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0171, code lost:
    
        if (r3.equals("VU") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x072c, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a5, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01af, code lost:
    
        if (r3.equals("VC") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01b9, code lost:
    
        if (r3.equals("VA") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0bf6, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01fb, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0ae8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0221, code lost:
    
        if (r3.equals("TV") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0239, code lost:
    
        if (r3.equals("TR") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0be8, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x025f, code lost:
    
        if (r3.equals("TM") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0269, code lost:
    
        if (r3.equals("TL") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0a7c, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0273, code lost:
    
        if (r3.equals("TJ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x09f2, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x027d, code lost:
    
        if (r3.equals("TH") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0ac2, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0295, code lost:
    
        if (r3.equals("TD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0b3c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x02ad, code lost:
    
        if (r3.equals("SZ") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0b99, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x02b7, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x02c1, code lost:
    
        if (r3.equals("SX") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x02e7, code lost:
    
        if (r3.equals("SS") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x08be, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if (r3.equals("CI") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x031b, code lost:
    
        if (r3.equals("SM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0325, code lost:
    
        if (r3.equals("SL") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0b66, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x033d, code lost:
    
        if (r3.equals("SJ") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0974, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0347, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0b8b, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0b2e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0351, code lost:
    
        if (r3.equals("SH") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0369, code lost:
    
        if (r3.equals("SE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0373, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x037d, code lost:
    
        if (r3.equals("SC") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0387, code lost:
    
        if (r3.equals("SB") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x03f7, code lost:
    
        if (r3.equals("PY") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x040f, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0435, code lost:
    
        if (r3.equals("PM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0469, code lost:
    
        if (r3.equals("PG") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0698, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x048f, code lost:
    
        if (r3.equals("PA") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0c12, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x09c8, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x04b5, code lost:
    
        if (r3.equals("NU") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x04bf, code lost:
    
        if (r3.equals("NR") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x04f3, code lost:
    
        if (r3.equals("NI") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0a8a, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x050b, code lost:
    
        if (r3.equals("NF") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0515, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x051f, code lost:
    
        if (r3.equals("NC") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x053b, code lost:
    
        if (r3.equals("MZ") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x058f, code lost:
    
        if (r3.equals("MT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0599, code lost:
    
        if (r3.equals("MS") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x05a3, code lost:
    
        if (r3.equals("MR") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0ab4, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x05bb, code lost:
    
        if (r3.equals("MP") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x05e5, code lost:
    
        if (r3.equals("MM") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x06b0, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x05ef, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0ada, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0607, code lost:
    
        if (r3.equals("MH") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0615, code lost:
    
        if (r3.equals("MG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0649, code lost:
    
        if (r3.equals("MC") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x08cc, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0661, code lost:
    
        if (r3.equals("LY") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x066b, code lost:
    
        if (r3.equals("LV") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0691, code lost:
    
        if (r3.equals("LS") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x069f, code lost:
    
        if (r3.equals("LR") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a00, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x06a9, code lost:
    
        if (r3.equals("LK") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x06b7, code lost:
    
        if (r3.equals("LI") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x06f9, code lost:
    
        if (r3.equals("KY") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0703, code lost:
    
        if (r3.equals("KW") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0836, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x071b, code lost:
    
        if (r3.equals("KN") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0725, code lost:
    
        if (r3.equals("KM") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0733, code lost:
    
        if (r3.equals("KI") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0775, code lost:
    
        if (r3.equals("JO") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x078d, code lost:
    
        if (r3.equals("JE") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r3.equals("BQ") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x08da, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x07a5, code lost:
    
        if (r3.equals("IS") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0bda, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x07e7, code lost:
    
        if (r3.equals("IM") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x081b, code lost:
    
        if (r3.equals("HU") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0825, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x082f, code lost:
    
        if (r3.equals("HR") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0891, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x08b7, code lost:
    
        if (r3.equals("GM") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x08c5, code lost:
    
        if (r3.equals("GL") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x08d3, code lost:
    
        if (r3.equals("GI") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x096d, code lost:
    
        if (r3.equals("FK") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x09b3, code lost:
    
        if (r3.equals("ER") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x09c1, code lost:
    
        if (r3.equals("EG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x09cf, code lost:
    
        if (r3.equals("EE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x09eb, code lost:
    
        if (r3.equals("DZ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x09f9, code lost:
    
        if (r3.equals("DO") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0a07, code lost:
    
        if (r3.equals("DM") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00cd, code lost:
    
        if (r3.equals("BL") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0a1f, code lost:
    
        if (r3.equals("DJ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0a53, code lost:
    
        if (r3.equals("CX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x0a5d, code lost:
    
        if (r3.equals("CW") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x05c2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x0a75, code lost:
    
        if (r3.equals("CU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x0a83, code lost:
    
        if (r3.equals("CR") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0aad, code lost:
    
        if (r3.equals("CM") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x0abb, code lost:
    
        if (r3.equals("CL") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x0ac9, code lost:
    
        if (r3.equals("CK") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0bbe, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0ad3, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x0ae1, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0b0b, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0b27, code lost:
    
        if (r3.equals("BG") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0b35, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x0b5f, code lost:
    
        if (r3.equals("AZ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e5, code lost:
    
        if (r3.equals("AT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0b7b, code lost:
    
        if (r3.equals("AI") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0b84, code lost:
    
        if (r3.equals("AG") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0b92, code lost:
    
        if (r3.equals("AF") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x0bae, code lost:
    
        if (r3.equals("AD") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x0bb7, code lost:
    
        if (r3.equals("BZ") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x0bd3, code lost:
    
        if (r3.equals("BB") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x09d6, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x0be1, code lost:
    
        if (r3.equals("BA") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0bef, code lost:
    
        if (r3.equals("AX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x0c0b, code lost:
    
        if (r3.equals("AM") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x010b, code lost:
    
        if (r3.equals("AQ") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x09ba, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0115, code lost:
    
        if (r3.equals("ZW") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x038e, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] h(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 2091) {
            if (hashCode != 2092) {
                if (hashCode != 2102) {
                    if (hashCode != 2103) {
                        if (hashCode != 2111) {
                            if (hashCode != 2112) {
                                if (hashCode != 2135) {
                                    if (hashCode != 2136) {
                                        switch (hashCode) {
                                            case 2083:
                                                break;
                                            case 2084:
                                                if (str.equals("AE")) {
                                                    return new int[]{1, 4, 2, 3, 4, 1};
                                                }
                                                break;
                                            case 2085:
                                                break;
                                            case 2086:
                                                break;
                                            default:
                                                switch (hashCode) {
                                                    case 2088:
                                                        break;
                                                    case 2094:
                                                        if (str.equals("AO")) {
                                                            return new int[]{3, 4, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2105:
                                                        break;
                                                    case 2114:
                                                        if (str.equals("BD")) {
                                                            return new int[]{2, 1, 3, 2, 4, 2};
                                                        }
                                                        break;
                                                    case 2115:
                                                        if (str.equals("BE")) {
                                                            return new int[]{0, 0, 1, 0, 1, 2};
                                                        }
                                                        break;
                                                    case 2116:
                                                        break;
                                                    case 2117:
                                                        break;
                                                    case 2118:
                                                        if (str.equals("BH")) {
                                                            return new int[]{1, 3, 1, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2119:
                                                        break;
                                                    case 2120:
                                                        if (str.equals("BJ")) {
                                                            return new int[]{4, 4, 2, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2133:
                                                        if (str.equals("BW")) {
                                                            return new int[]{3, 2, 1, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2142:
                                                        break;
                                                    case 2145:
                                                        break;
                                                    case 2152:
                                                        break;
                                                    case 2153:
                                                        break;
                                                    case 2154:
                                                        break;
                                                    case 2155:
                                                        if (str.equals("CN")) {
                                                            return new int[]{2, 0, 1, 1, 3, 1};
                                                        }
                                                        break;
                                                    case 2156:
                                                        if (str.equals("CO")) {
                                                            return new int[]{2, 3, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2159:
                                                        break;
                                                    case 2162:
                                                        break;
                                                    case 2163:
                                                        if (str.equals("CV")) {
                                                            return new int[]{2, 3, 0, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2164:
                                                        break;
                                                    case 2165:
                                                        break;
                                                    case 2166:
                                                        if (str.equals("CY")) {
                                                            return new int[]{1, 0, 1, 0, 0, 2};
                                                        }
                                                        break;
                                                    case 2167:
                                                        if (str.equals("CZ")) {
                                                            return new int[]{0, 0, 2, 0, 1, 2};
                                                        }
                                                        break;
                                                    case 2177:
                                                        if (str.equals("DE")) {
                                                            return new int[]{0, 1, 4, 2, 2, 1};
                                                        }
                                                        break;
                                                    case 2182:
                                                        break;
                                                    case 2183:
                                                        if (str.equals("DK")) {
                                                            return new int[]{0, 0, 2, 0, 0, 2};
                                                        }
                                                        break;
                                                    case 2185:
                                                        break;
                                                    case 2187:
                                                        break;
                                                    case 2198:
                                                        break;
                                                    case 2206:
                                                        if (str.equals("EC")) {
                                                            return new int[]{1, 3, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2208:
                                                        break;
                                                    case 2210:
                                                        break;
                                                    case 2221:
                                                        break;
                                                    case 2222:
                                                        if (str.equals("ES")) {
                                                            return new int[]{0, 0, 0, 0, 1, 0};
                                                        }
                                                        break;
                                                    case 2223:
                                                        if (str.equals("ET")) {
                                                            return new int[]{4, 3, 4, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2243:
                                                        if (str.equals("FI")) {
                                                            return new int[]{0, 0, 0, 1, 0, 2};
                                                        }
                                                        break;
                                                    case 2244:
                                                        if (str.equals("FJ")) {
                                                            return new int[]{3, 2, 2, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2245:
                                                        break;
                                                    case 2247:
                                                        if (str.equals("FM")) {
                                                            return new int[]{4, 2, 4, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2249:
                                                        if (str.equals("FO")) {
                                                            return new int[]{0, 2, 2, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2252:
                                                        if (str.equals("FR")) {
                                                            return new int[]{1, 1, 1, 1, 0, 2};
                                                        }
                                                        break;
                                                    case 2266:
                                                        if (str.equals("GA")) {
                                                            return new int[]{3, 4, 0, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2267:
                                                        if (str.equals("GB")) {
                                                            return new int[]{1, 1, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2269:
                                                        if (str.equals("GD")) {
                                                            return new int[]{2, 2, 0, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2270:
                                                        if (str.equals("GE")) {
                                                            return new int[]{1, 1, 0, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2271:
                                                        if (str.equals("GF")) {
                                                            return new int[]{3, 2, 3, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2272:
                                                        if (str.equals("GG")) {
                                                            return new int[]{0, 2, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2273:
                                                        if (str.equals("GH")) {
                                                            return new int[]{3, 3, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2274:
                                                        break;
                                                    case 2277:
                                                        break;
                                                    case 2278:
                                                        break;
                                                    case 2279:
                                                        if (str.equals("GN")) {
                                                            return new int[]{3, 4, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2281:
                                                        if (str.equals("GP")) {
                                                            return new int[]{2, 1, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2282:
                                                        break;
                                                    case 2283:
                                                        if (str.equals("GR")) {
                                                            return new int[]{1, 0, 0, 0, 1, 2};
                                                        }
                                                        break;
                                                    case 2285:
                                                        if (str.equals("GT")) {
                                                            return new int[]{2, 1, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2286:
                                                        if (str.equals("GU")) {
                                                            return new int[]{2, 2, 4, 3, 3, 2};
                                                        }
                                                        break;
                                                    case 2288:
                                                        if (str.equals("GW")) {
                                                            return new int[]{4, 4, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2290:
                                                        if (str.equals("GY")) {
                                                            return new int[]{3, 1, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2307:
                                                        if (str.equals("HK")) {
                                                            return new int[]{0, 1, 0, 1, 1, 0};
                                                        }
                                                        break;
                                                    case 2314:
                                                        break;
                                                    case 2316:
                                                        break;
                                                    case 2317:
                                                        break;
                                                    case 2331:
                                                        if (str.equals("ID")) {
                                                            return new int[]{3, 1, 3, 3, 2, 4};
                                                        }
                                                        break;
                                                    case 2332:
                                                        if (str.equals("IE")) {
                                                            return new int[]{1, 1, 1, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2339:
                                                        if (str.equals("IL")) {
                                                            return new int[]{1, 2, 2, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2340:
                                                        break;
                                                    case 2341:
                                                        if (str.equals("IN")) {
                                                            return new int[]{1, 1, 3, 2, 2, 3};
                                                        }
                                                        break;
                                                    case 2342:
                                                        if (str.equals("IO")) {
                                                            return new int[]{3, 2, 2, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2344:
                                                        if (str.equals("IQ")) {
                                                            return new int[]{3, 2, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2345:
                                                        if (str.equals("IR")) {
                                                            return new int[]{4, 2, 3, 3, 4, 3};
                                                        }
                                                        break;
                                                    case 2346:
                                                        break;
                                                    case 2347:
                                                        if (str.equals("IT")) {
                                                            return new int[]{0, 1, 1, 2, 1, 2};
                                                        }
                                                        break;
                                                    case 2363:
                                                        break;
                                                    case 2371:
                                                        if (str.equals("JM")) {
                                                            return new int[]{2, 4, 3, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2373:
                                                        break;
                                                    case 2374:
                                                        if (str.equals("JP")) {
                                                            return new int[]{0, 3, 2, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2394:
                                                        if (str.equals("KE")) {
                                                            return new int[]{3, 2, 1, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2396:
                                                        if (str.equals("KG")) {
                                                            return new int[]{2, 1, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2397:
                                                        if (str.equals("KH")) {
                                                            return new int[]{1, 0, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2398:
                                                        break;
                                                    case 2402:
                                                        break;
                                                    case 2403:
                                                        break;
                                                    case 2407:
                                                        if (str.equals("KR")) {
                                                            return new int[]{0, 2, 2, 4, 4, 4};
                                                        }
                                                        break;
                                                    case 2412:
                                                        break;
                                                    case 2414:
                                                        break;
                                                    case 2415:
                                                        if (str.equals("KZ")) {
                                                            return new int[]{2, 1, 2, 2, 3, 2};
                                                        }
                                                        break;
                                                    case 2421:
                                                        if (str.equals("LA")) {
                                                            return new int[]{1, 2, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2422:
                                                        if (str.equals("LB")) {
                                                            return new int[]{3, 1, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2423:
                                                        if (str.equals("LC")) {
                                                            return new int[]{2, 2, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2429:
                                                        break;
                                                    case 2431:
                                                        break;
                                                    case 2438:
                                                        break;
                                                    case 2439:
                                                        break;
                                                    case 2440:
                                                        if (str.equals("LT")) {
                                                            return new int[]{0, 1, 0, 1, 0, 2};
                                                        }
                                                        break;
                                                    case 2441:
                                                        if (str.equals("LU")) {
                                                            return new int[]{4, 0, 3, 2, 1, 3};
                                                        }
                                                        break;
                                                    case 2442:
                                                        break;
                                                    case 2445:
                                                        break;
                                                    case 2452:
                                                        if (str.equals("MA")) {
                                                            return new int[]{3, 3, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2454:
                                                        break;
                                                    case 2455:
                                                        if (str.equals("MD")) {
                                                            return new int[]{1, 0, 0, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2456:
                                                        if (str.equals("ME")) {
                                                            return new int[]{2, 0, 0, 1, 3, 2};
                                                        }
                                                        break;
                                                    case 2457:
                                                        if (str.equals("MF")) {
                                                            return new int[]{1, 2, 2, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2458:
                                                        break;
                                                    case 2459:
                                                        break;
                                                    case 2462:
                                                        if (str.equals("MK")) {
                                                            return new int[]{1, 0, 0, 1, 3, 2};
                                                        }
                                                        break;
                                                    case 2463:
                                                        break;
                                                    case 2464:
                                                        break;
                                                    case 2465:
                                                        if (str.equals("MN")) {
                                                            return new int[]{2, 0, 2, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2466:
                                                        if (str.equals("MO")) {
                                                            return new int[]{0, 2, 4, 4, 3, 1};
                                                        }
                                                        break;
                                                    case 2467:
                                                        break;
                                                    case 2468:
                                                        if (str.equals("MQ")) {
                                                            return new int[]{2, 1, 2, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2469:
                                                        break;
                                                    case 2470:
                                                        break;
                                                    case 2471:
                                                        break;
                                                    case 2472:
                                                        if (str.equals("MU")) {
                                                            return new int[]{3, 1, 0, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2473:
                                                        if (str.equals("MV")) {
                                                            return new int[]{3, 2, 1, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2474:
                                                        if (str.equals("MW")) {
                                                            return new int[]{3, 2, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2475:
                                                        if (str.equals("MX")) {
                                                            return new int[]{2, 4, 4, 4, 3, 2};
                                                        }
                                                        break;
                                                    case 2476:
                                                        if (str.equals("MY")) {
                                                            return new int[]{1, 0, 4, 1, 1, 0};
                                                        }
                                                        break;
                                                    case 2477:
                                                        break;
                                                    case 2483:
                                                        if (str.equals("NA")) {
                                                            return new int[]{3, 4, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2485:
                                                        break;
                                                    case 2487:
                                                        break;
                                                    case 2488:
                                                        break;
                                                    case 2489:
                                                        if (str.equals("NG")) {
                                                            return new int[]{3, 4, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2491:
                                                        break;
                                                    case 2494:
                                                        if (str.equals("NL")) {
                                                            return new int[]{2, 1, 4, 3, 0, 4};
                                                        }
                                                        break;
                                                    case 2497:
                                                        if (str.equals("NO")) {
                                                            return new int[]{0, 0, 3, 0, 0, 2};
                                                        }
                                                        break;
                                                    case 2498:
                                                        if (str.equals("NP")) {
                                                            return new int[]{2, 2, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2500:
                                                        break;
                                                    case 2503:
                                                        break;
                                                    case 2508:
                                                        if (str.equals("NZ")) {
                                                            return new int[]{0, 0, 1, 2, 4, 2};
                                                        }
                                                        break;
                                                    case 2526:
                                                        if (str.equals("OM")) {
                                                            return new int[]{2, 3, 1, 2, 4, 2};
                                                        }
                                                        break;
                                                    case 2545:
                                                        break;
                                                    case 2549:
                                                        if (str.equals("PE")) {
                                                            return new int[]{1, 2, 4, 4, 3, 2};
                                                        }
                                                        break;
                                                    case 2550:
                                                        if (str.equals("PF")) {
                                                            return new int[]{2, 2, 3, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2551:
                                                        break;
                                                    case 2552:
                                                        if (str.equals("PH")) {
                                                            return new int[]{2, 1, 2, 3, 2, 1};
                                                        }
                                                        break;
                                                    case 2555:
                                                        if (str.equals("PK")) {
                                                            return new int[]{3, 3, 3, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2556:
                                                        if (str.equals("PL")) {
                                                            return new int[]{1, 0, 2, 2, 4, 4};
                                                        }
                                                        break;
                                                    case 2557:
                                                        break;
                                                    case 2562:
                                                        if (str.equals("PR")) {
                                                            return new int[]{2, 0, 2, 1, 2, 0};
                                                        }
                                                        break;
                                                    case 2563:
                                                        if (str.equals("PS")) {
                                                            return new int[]{3, 4, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2564:
                                                        break;
                                                    case 2567:
                                                        if (str.equals("PW")) {
                                                            return new int[]{2, 2, 4, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2569:
                                                        break;
                                                    case 2576:
                                                        if (str.equals("QA")) {
                                                            return new int[]{1, 4, 4, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2611:
                                                        if (str.equals("RE")) {
                                                            return new int[]{0, 3, 2, 3, 1, 2};
                                                        }
                                                        break;
                                                    case 2621:
                                                        if (str.equals("RO")) {
                                                            return new int[]{0, 0, 1, 1, 3, 2};
                                                        }
                                                        break;
                                                    case 2625:
                                                        if (str.equals("RS")) {
                                                            return new int[]{1, 0, 0, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2627:
                                                        if (str.equals("RU")) {
                                                            return new int[]{1, 0, 0, 1, 3, 3};
                                                        }
                                                        break;
                                                    case 2629:
                                                        if (str.equals("RW")) {
                                                            return new int[]{3, 3, 2, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2638:
                                                        if (str.equals("SA")) {
                                                            return new int[]{3, 1, 1, 2, 2, 0};
                                                        }
                                                        break;
                                                    case 2639:
                                                        break;
                                                    case 2640:
                                                        break;
                                                    case 2641:
                                                        break;
                                                    case 2642:
                                                        break;
                                                    case 2644:
                                                        if (str.equals("SG")) {
                                                            return new int[]{2, 3, 3, 3, 1, 1};
                                                        }
                                                        break;
                                                    case 2645:
                                                        break;
                                                    case 2646:
                                                        break;
                                                    case 2647:
                                                        break;
                                                    case 2648:
                                                        if (str.equals("SK")) {
                                                            return new int[]{0, 1, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2649:
                                                        break;
                                                    case 2650:
                                                        break;
                                                    case 2651:
                                                        if (str.equals("SN")) {
                                                            return new int[]{4, 4, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2652:
                                                        if (str.equals("SO")) {
                                                            return new int[]{2, 2, 3, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2655:
                                                        if (str.equals("SR")) {
                                                            return new int[]{2, 4, 4, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2656:
                                                        break;
                                                    case 2657:
                                                        if (str.equals("ST")) {
                                                            return new int[]{2, 2, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2659:
                                                        if (str.equals("SV")) {
                                                            return new int[]{2, 3, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2661:
                                                        break;
                                                    case 2662:
                                                        break;
                                                    case 2663:
                                                        break;
                                                    case 2671:
                                                        if (str.equals("TC")) {
                                                            return new int[]{3, 2, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2672:
                                                        break;
                                                    case 2675:
                                                        if (str.equals("TG")) {
                                                            return new int[]{3, 4, 1, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2676:
                                                        break;
                                                    case 2678:
                                                        break;
                                                    case 2680:
                                                        break;
                                                    case 2681:
                                                        break;
                                                    case 2682:
                                                        if (str.equals("TN")) {
                                                            return new int[]{3, 1, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2683:
                                                        if (str.equals("TO")) {
                                                            return new int[]{3, 2, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2686:
                                                        break;
                                                    case 2688:
                                                        if (str.equals("TT")) {
                                                            return new int[]{2, 4, 1, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2690:
                                                        break;
                                                    case 2691:
                                                        if (str.equals("TW")) {
                                                            return new int[]{0, 0, 0, 0, 0, 0};
                                                        }
                                                        break;
                                                    case 2694:
                                                        if (str.equals("TZ")) {
                                                            return new int[]{3, 4, 2, 1, 3, 2};
                                                        }
                                                        break;
                                                    case 2700:
                                                        break;
                                                    case 2706:
                                                        if (str.equals("UG")) {
                                                            return new int[]{3, 3, 2, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2718:
                                                        if (str.equals("US")) {
                                                            return new int[]{2, 2, 4, 1, 3, 1};
                                                        }
                                                        break;
                                                    case 2724:
                                                        if (str.equals("UY")) {
                                                            return new int[]{2, 1, 1, 2, 1, 2};
                                                        }
                                                        break;
                                                    case 2725:
                                                        if (str.equals("UZ")) {
                                                            return new int[]{1, 2, 3, 4, 3, 2};
                                                        }
                                                        break;
                                                    case 2731:
                                                        break;
                                                    case 2733:
                                                        break;
                                                    case 2735:
                                                        break;
                                                    case 2737:
                                                        if (str.equals("VG")) {
                                                            return new int[]{2, 2, 1, 1, 2, 4};
                                                        }
                                                        break;
                                                    case 2739:
                                                        if (str.equals("VI")) {
                                                            return new int[]{0, 2, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2744:
                                                        if (str.equals("VN")) {
                                                            return new int[]{0, 0, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2751:
                                                        break;
                                                    case 2767:
                                                        break;
                                                    case 2780:
                                                        break;
                                                    case 2803:
                                                        if (str.equals("XK")) {
                                                            return new int[]{1, 2, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2828:
                                                        break;
                                                    case 2843:
                                                        break;
                                                    case 2855:
                                                        if (str.equals("ZA")) {
                                                            return new int[]{2, 4, 2, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2867:
                                                        if (str.equals("ZM")) {
                                                            return new int[]{4, 4, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2877:
                                                        break;
                                                    default:
                                                        switch (hashCode) {
                                                            case 2096:
                                                                break;
                                                            case 2097:
                                                                if (str.equals("AR")) {
                                                                    return new int[]{2, 2, 2, 2, 1, 2};
                                                                }
                                                                break;
                                                            case 2098:
                                                                if (str.equals("AS")) {
                                                                    return new int[]{2, 2, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2099:
                                                                break;
                                                            case 2100:
                                                                if (str.equals("AU")) {
                                                                    return new int[]{0, 3, 1, 1, 3, 0};
                                                                }
                                                                break;
                                                            default:
                                                                switch (hashCode) {
                                                                    case 2122:
                                                                        break;
                                                                    case 2123:
                                                                        if (str.equals("BM")) {
                                                                            return new int[]{0, 2, 0, 0, 2, 2};
                                                                        }
                                                                        break;
                                                                    case 2124:
                                                                        if (str.equals("BN")) {
                                                                            return new int[]{3, 2, 0, 0, 2, 2};
                                                                        }
                                                                        break;
                                                                    case 2125:
                                                                        if (str.equals("BO")) {
                                                                            return new int[]{1, 2, 4, 4, 2, 2};
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (hashCode) {
                                                                            case 2127:
                                                                                break;
                                                                            case 2128:
                                                                                if (str.equals("BR")) {
                                                                                    return new int[]{1, 1, 1, 1, 2, 4};
                                                                                }
                                                                                break;
                                                                            case 2129:
                                                                                if (str.equals("BS")) {
                                                                                    return new int[]{3, 2, 1, 1, 2, 2};
                                                                                }
                                                                                break;
                                                                            case 2130:
                                                                                if (str.equals("BT")) {
                                                                                    return new int[]{3, 1, 2, 2, 3, 2};
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (hashCode) {
                                                                                    case 2147:
                                                                                        if (str.equals("CF")) {
                                                                                            return new int[]{4, 2, 4, 2, 2, 2};
                                                                                        }
                                                                                        break;
                                                                                    case 2149:
                                                                                        if (str.equals("CH")) {
                                                                                            return new int[]{0, 1, 0, 0, 0, 2};
                                                                                        }
                                                                                        break;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                    }
                                } else if (str.equals("BY")) {
                                    return new int[]{1, 2, 3, 3, 2, 2};
                                }
                            }
                        }
                    }
                } else if (str.equals("AW")) {
                    return new int[]{2, 2, 3, 4, 2, 2};
                }
            }
        } else if (str.equals("AL")) {
            return new int[]{1, 1, 1, 2, 2, 2};
        }
        return new int[]{2, 2, 2, 2, 2, 2};
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r10.f15301r >= 524288) goto L26;
     */
    @Override // com.google.android.gms.internal.ads.RB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c(Ww ww, boolean z3) {
        Throwable th;
        boolean z5;
        C1514rH c1514rH;
        try {
            if (z3) {
                try {
                    ww.getClass();
                    z5 = true;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } else {
                z5 = false;
            }
            if (z5) {
                try {
                    AbstractC1668us.a0(this.f15297n > 0);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i = (int) (elapsedRealtime - this.f15298o);
                    this.f15300q += i;
                    long j5 = this.f15301r;
                    long j6 = this.f15299p;
                    this.f15301r = j5 + j6;
                    if (i > 0) {
                        this.f15296m.b((int) Math.sqrt(j6), (j6 * 8000.0f) / i);
                        if (this.f15300q < 2000) {
                        }
                        this.f15302s = (long) this.f15296m.a();
                        c1514rH = this;
                        c1514rH.e(i, this.f15299p, this.f15302s);
                        c1514rH.f15298o = elapsedRealtime;
                        c1514rH.f15299p = 0L;
                    } else {
                        c1514rH = this;
                    }
                    c1514rH.f15297n--;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final long d(int i) {
        Integer valueOf = Integer.valueOf(i);
        Cv cv = this.f15294k;
        Long l5 = (Long) cv.get(valueOf);
        if (l5 == null) {
            l5 = (Long) cv.get(0);
        }
        if (l5 == null) {
            l5 = 1000000L;
        }
        return l5.longValue();
    }

    public final void e(int i, long j5, final long j6) {
        final int i5;
        final long j7;
        if (i == 0) {
            if (j5 != 0) {
                j7 = j5;
            } else if (j6 == this.f15303t) {
                return;
            } else {
                j7 = 0;
            }
            i5 = 0;
        } else {
            i5 = i;
            j7 = j5;
        }
        this.f15303t = j6;
        Iterator it = ((CopyOnWriteArrayList) this.f15295l.f9491l).iterator();
        while (it.hasNext()) {
            final C1380oH c1380oH = (C1380oH) it.next();
            if (!c1380oH.f14801c) {
                c1380oH.f14799a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.nH
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object next;
                        Object obj;
                        C1603tG c1603tG;
                        SE se = C1380oH.this.f14800b;
                        C1324n6 c1324n6 = se.f11524d;
                        if (((AbstractC1044gv) c1324n6.f14579l).isEmpty()) {
                            c1603tG = null;
                        } else {
                            AbstractC1044gv abstractC1044gv = (AbstractC1044gv) c1324n6.f14579l;
                            if (abstractC1044gv == null) {
                                C0954ev listIterator = abstractC1044gv.listIterator(0);
                                do {
                                    next = listIterator.next();
                                } while (listIterator.hasNext());
                                obj = next;
                            } else {
                                if (abstractC1044gv.isEmpty()) {
                                    throw new NoSuchElementException();
                                }
                                obj = abstractC1044gv.get(abstractC1044gv.size() - 1);
                            }
                            c1603tG = (C1603tG) obj;
                        }
                        OE j8 = se.j(c1603tG);
                        se.i(j8, 1006, new Q1(j8, i5, j7, j6));
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.RB
    public final synchronized void f(Lt lt, Ww ww, boolean z3) {
        boolean z5;
        if (z3) {
            try {
                ww.getClass();
                z5 = true;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z5 = false;
        }
        if (z5) {
            if (this.f15297n == 0) {
                this.f15298o = SystemClock.elapsedRealtime();
            }
            this.f15297n++;
        }
    }

    @Override // com.google.android.gms.internal.ads.RB
    public final synchronized void g(Ww ww, boolean z3, int i) {
        boolean z5;
        if (z3) {
            ww.getClass();
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            this.f15299p += i;
        }
    }
}
