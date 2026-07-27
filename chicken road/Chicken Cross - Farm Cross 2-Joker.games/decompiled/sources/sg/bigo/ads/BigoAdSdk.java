package sg.bigo.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.F0.b;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.Q;
import sg.bigo.ads.T0.f;
import sg.bigo.ads.T0.g;
import sg.bigo.ads.X0.A;
import sg.bigo.ads.X0.h;
import sg.bigo.ads.X0.i;
import sg.bigo.ads.X0.m;
import sg.bigo.ads.X0.o;
import sg.bigo.ads.X0.r;
import sg.bigo.ads.X0.t;
import sg.bigo.ads.Y.c;
import sg.bigo.ads.Y.d;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.d.AbstractC5059e;
import sg.bigo.ads.d.C5055a;
import sg.bigo.ads.d.RunnableC5056b;
import sg.bigo.ads.d.RunnableC5057c;
import sg.bigo.ads.d.RunnableC5060f;
import sg.bigo.ads.p0.AbstractC5427a;
import sg.bigo.ads.p0.AbstractC5429c;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.q0.ThreadFactoryC5440d;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public class BigoAdSdk {
    public static r d;
    public static volatile C5055a e;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f12220a = new AtomicBoolean(false);
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public static final ArrayList g = new ArrayList();

    public interface InitListener {
        void onInitialized();
    }

    public static C5055a a(Context context) {
        if (e == null) {
            e = new C5055a(context);
        }
        if (!e.b) {
            e.a(context);
        }
        return e;
    }

    public static void addExtraHost(String str, String str2) {
        AbstractC5446j.a(1, new RunnableC5057c(str, str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x013c, code lost:
    
        if (r1 != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context) {
        f fVar;
        boolean z;
        boolean z2;
        boolean z3;
        if (!b.a()) {
            b.f12300a = context.getApplicationContext();
        }
        if (!AbstractC5429c.d()) {
            AbstractC5429c.b(context.getApplicationContext());
        }
        if (!AbstractC5429c.a(context)) {
            g gVar = sg.bigo.ads.O.g.f12472a;
            fVar = gVar != null ? gVar.K : null;
            b.b("sp_ads", "gdpr_check_by_server", Integer.valueOf((fVar == null || fVar.f12552a != 1) ? 0 : 1), 0);
            r4 = ((Integer) b.a("sp_ads", "user_consent_gdpr", (Object) 0, 0)).intValue() != 2;
            ConsentOptions consentOptions = ConsentOptions.GDPR;
            boolean a2 = a(consentOptions, r4);
            if (r4 || !a2) {
                return;
            }
            AbstractC5446j.a(1, new RunnableC5056b(context, consentOptions));
            return;
        }
        g gVar2 = sg.bigo.ads.O.g.f12472a;
        fVar = gVar2 != null ? gVar2.K : null;
        b.b("sp_ads", "gdpr_check_by_server", Integer.valueOf((fVar == null || fVar.f12552a != 1) ? 0 : 1), 0);
        boolean z4 = fVar != null && fVar.b == 1;
        boolean z5 = fVar != null && fVar.c == 1;
        if (AbstractC5429c.a() == 1) {
            if (I.a((CharSequence) AbstractC5429c.f13236a) && AbstractC5429c.d()) {
                AbstractC5429c.f13236a = sg.bigo.ads.F0.a.c(AbstractC5429c.h.getPackageName());
            }
            String str = AbstractC5429c.f13236a;
            if (!I.a((CharSequence) str)) {
                if (str.length() >= 11) {
                    int[] iArr = AbstractC5427a.f13235a;
                    for (int i = 0; i < 7; i++) {
                        if (str.charAt(iArr[i] - 1) != '0') {
                        }
                    }
                }
                z = false;
                if (!z4) {
                    if (I.a((CharSequence) AbstractC5429c.c) && AbstractC5429c.d()) {
                        AbstractC5429c.c = sg.bigo.ads.F0.a.d(AbstractC5429c.h.getPackageName());
                    }
                    String str2 = AbstractC5429c.c;
                    if (!I.a((CharSequence) str2)) {
                        if (str2.length() >= 11) {
                            int[] iArr2 = AbstractC5427a.b;
                            for (int i2 = 0; i2 < 4; i2++) {
                                if (str2.charAt(iArr2[i2] - 1) != '0') {
                                }
                            }
                        }
                        z2 = false;
                        if (z5) {
                            String c2 = AbstractC5429c.c();
                            if (!I.a((CharSequence) c2) && c2.length() >= 1488 && c2.charAt(1487) == '0') {
                                z3 = false;
                                if (z) {
                                    if (z2) {
                                    }
                                }
                                ConsentOptions consentOptions2 = ConsentOptions.GDPR;
                                boolean a3 = a(consentOptions2, r4);
                                if (r4 || !a3) {
                                    return;
                                }
                                AbstractC5446j.a(1, new RunnableC5056b(context, consentOptions2));
                                return;
                            }
                        }
                        z3 = true;
                        if (z) {
                        }
                        ConsentOptions consentOptions22 = ConsentOptions.GDPR;
                        boolean a32 = a(consentOptions22, r4);
                        if (r4) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                z2 = true;
                if (z5) {
                }
                z3 = true;
                if (z) {
                }
                ConsentOptions consentOptions222 = ConsentOptions.GDPR;
                boolean a322 = a(consentOptions222, r4);
                if (r4) {
                }
            }
            z = true;
            if (!z4) {
            }
            z2 = true;
            if (z5) {
            }
            z3 = true;
            if (z) {
            }
            ConsentOptions consentOptions2222 = ConsentOptions.GDPR;
            boolean a3222 = a(consentOptions2222, r4);
            if (r4) {
            }
        }
        r4 = true;
        ConsentOptions consentOptions22222 = ConsentOptions.GDPR;
        boolean a32222 = a(consentOptions22222, r4);
        if (r4) {
        }
    }

    public static String getBidderToken() {
        String str;
        String str2;
        if (!f12220a.get()) {
            str = "BigoAdSdk";
            str2 = "Please initialize SDK before get bidder token.";
        } else {
            if (d != null) {
                if (AbstractC5429c.f) {
                    AbstractC5429c.f = false;
                    c.set(true);
                }
                if (c.compareAndSet(true, false)) {
                    r rVar = d;
                    A a2 = rVar.g;
                    if (a2 == null) {
                        a2 = new A();
                        rVar.g = a2;
                    }
                    if (a2.f12595a != null) {
                        synchronized (A.class) {
                            a2.f12595a = null;
                        }
                    }
                }
                return d.a();
            }
            str = "BigoAdSdk";
            str2 = "Error to get bidder token with empty controller.";
        }
        AbstractC5496a.a(str, str2);
        return null;
    }

    public static String getHashId() {
        return "bf00667";
    }

    public static String getSDKVersion() {
        return String.valueOf(51001);
    }

    public static String getSDKVersionName() {
        return "5.10.1";
    }

    public static void initialize(Context context, AdConfig adConfig, InitListener initListener) {
        boolean z = f12220a.get();
        boolean z2 = !z;
        if (z) {
            AbstractC5496a.a(2, 5, "", "Bigo Ads SDK init had been invoked.");
        }
        if (t.c.b.get() == -1) {
            AbstractC5496a.a(2, 5, "", "Bigo Ads SDK wait to initing due to empty config.");
            z2 = true;
        }
        if (!z2) {
            AbstractC5496a.a(2, 5, "", "Avoid initializing Bigo Ads SDK repeatedly.");
            if (initListener != null) {
                initListener.onInitialized();
                return;
            }
            return;
        }
        if (initListener != null) {
            f.add(initListener);
        }
        context.getClass();
        adConfig.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        if (b.getAndSet(true)) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean isDebug = adConfig.isDebug();
        sg.bigo.ads.G0.a.f12309a.set((int) (System.currentTimeMillis() / 1000));
        b.f12300a = applicationContext;
        AbstractC5429c.b(applicationContext);
        int i = d.c;
        d dVar = c.f12622a;
        dVar.getClass();
        Context applicationContext2 = applicationContext.getApplicationContext();
        if (applicationContext2 != null) {
            dVar.f12623a = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            applicationContext2.registerReceiver(dVar, intentFilter);
        }
        Q.f12348a = isDebug;
        String extra = adConfig.getExtra(AdConfig.EXTRA_KEY_HOST_RULES);
        r rVar = new r(applicationContext, adConfig);
        d = rVar;
        a aVar = new a(extra, context);
        AbstractC5446j.a(1, null, new sg.bigo.ads.X0.f(rVar.f12613a, rVar), 0L);
        rVar.j = elapsedRealtime;
        rVar.e.f12615a = adConfig;
        rVar.g = new A();
        sg.bigo.ads.X0.g gVar = new sg.bigo.ads.X0.g();
        synchronized (AbstractC5446j.class) {
            if (AbstractC5446j.j == null) {
                AbstractC5446j.j = new ArrayList();
            }
            AbstractC5446j.j.add(gVar);
        }
        AbstractC5446j.a(3, null, new h(rVar, aVar), 0L);
        i iVar = new i(rVar);
        int i2 = C5447k.b;
        ThreadFactoryC5440d.e = iVar;
    }

    public static boolean isInitialized() {
        return f12220a.get();
    }

    public static boolean isOffice() {
        return true;
    }

    public static void setUserConsent(Context context, ConsentOptions consentOptions, boolean z) {
        if (!b.a()) {
            b.f12300a = context.getApplicationContext();
        }
        if (!AbstractC5429c.d()) {
            AbstractC5429c.b(context.getApplicationContext());
        }
        AbstractC5446j.a(3, null, new RunnableC5060f(context, consentOptions, z), 0L);
        if (consentOptions == ConsentOptions.GDPR) {
            b.b("sp_ads", "user_consent_gdpr", Integer.valueOf(z ? 1 : 2), 0);
            if (AbstractC5429c.a(context)) {
                return;
            }
        }
        boolean a2 = a(consentOptions, z);
        if (z || !a2) {
            return;
        }
        AbstractC5446j.a(1, new RunnableC5056b(context, consentOptions));
    }

    public static o a(sg.bigo.ads.N.d dVar, sg.bigo.ads.P0.c cVar) {
        int i;
        String str;
        sg.bigo.ads.N.c cVar2 = dVar.h;
        cVar2.getClass();
        cVar2.f = System.currentTimeMillis();
        sg.bigo.ads.P0.a aVar = new sg.bigo.ads.P0.a(cVar);
        if (!f12220a.get()) {
            aVar.a(0, 1000, 0, "Please initialize SDK before request ads.", new Pair(dVar, null));
            return null;
        }
        b(d.f12613a);
        r rVar = d;
        if (I.a((CharSequence) rVar.e.f12615a.getAppKey())) {
            aVar.a(0, 1013, 10000, "App id cannot be empty, please pass the id when initializing bigo sdk.", new Pair(dVar, null));
            return null;
        }
        sg.bigo.ads.P.d e2 = dVar.e();
        if (e2 != null) {
            aVar.a(0, e2.f12476a, e2.b, e2.c, new Pair(dVar, null));
            return null;
        }
        if (sg.bigo.ads.F0.a.f()) {
            String str2 = "Missing CCPA consent";
            if (sg.bigo.ads.F0.a.c() == 2) {
                str = "Missing GDPR consent";
                i = 1;
            } else {
                i = 0;
                str = "Missing CCPA consent";
            }
            if (sg.bigo.ads.F0.a.d() == 2) {
                i++;
                str = "Missing LGPD consent";
            }
            if (sg.bigo.ads.F0.a.a() == 2) {
                i++;
            } else {
                str2 = str;
            }
            if (sg.bigo.ads.F0.a.b() == 2) {
                i++;
                str2 = "Missing COPPA consent";
            }
            aVar.a(0, 1001, 800, i > 1 ? "Missing user consent" : str2, new Pair(dVar, null));
            return null;
        }
        o oVar = new o(dVar, aVar);
        AbstractC5446j.a(3, null, new m(rVar, dVar, oVar), 0L);
        return oVar;
    }

    public static boolean a(ConsentOptions consentOptions, boolean z) {
        int i = z ? 1 : 2;
        int i2 = AbstractC5059e.f12723a[consentOptions.ordinal()];
        boolean z2 = false;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4 && i != sg.bigo.ads.F0.a.b()) {
                        b.b("sp_ads", "consent_coppa", Integer.valueOf(i), 0);
                        z2 = true;
                    }
                } else if (i != sg.bigo.ads.F0.a.d()) {
                    b.b("sp_ads", "consent_lgpd", Integer.valueOf(i), 0);
                    z2 = true;
                }
            } else if (i != sg.bigo.ads.F0.a.a()) {
                b.b("sp_ads", "consent_ccpa", Integer.valueOf(i), 0);
                z2 = true;
            }
        } else if (i != sg.bigo.ads.F0.a.c()) {
            b.b("sp_ads", "consent_gdpr", Integer.valueOf(i), 0);
            z2 = true;
        }
        if (z2) {
            c.set(true);
        }
        return z2;
    }
}
