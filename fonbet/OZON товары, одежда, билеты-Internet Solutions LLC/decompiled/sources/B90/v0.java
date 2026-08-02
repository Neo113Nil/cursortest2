package B90;

import C.C2702w;
import H30.C3132a;
import Sc.InterfaceC4008j;
import android.app.Activity;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieManager;
import c90.InterfaceC5773a;
import g30.InterfaceC6618a;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.UUID;
import k90.AbstractC7611a;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o40.InterfaceC8640a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.uni.android.uikit.common.StyleParser;

/* loaded from: classes3.dex */
public final class v0 extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f3199a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f3200b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f3201c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final S30.a f3202d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final A30.m f3203e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final h90.f f3204f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final K40.a f3205g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC5773a f3206h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final V70.b f3207i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final P60.o f3208j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f3209k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f3210l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC8640a f3211m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Q90.n f3212n;

    /* renamed from: o, reason: collision with root package name */
    private WeakReference<Activity> f3213o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final Handler f3214p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final String f3215q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f3216r;

    public v0(@NotNull Application application, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull S80.b fintechNavigation, @NotNull S30.a applicationInfoDataSource, @NotNull A30.m authInteractor, @NotNull h90.f notificationInteractor, @NotNull K40.a cbottomDisplay, @NotNull InterfaceC5773a fintechTestEnvironmentManager, @NotNull V70.b audioRecordInteractor, @NotNull P60.o installedBankAppsInteractor, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull SharedPreferences sharedPreferences, @NotNull InterfaceC8640a forceUpdateInteractor, @NotNull Q90.n fintechUltraManager, @NotNull O30.b fintechLibType) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(authInteractor, "authInteractor");
        Intrinsics.checkNotNullParameter(notificationInteractor, "notificationInteractor");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(fintechTestEnvironmentManager, "fintechTestEnvironmentManager");
        Intrinsics.checkNotNullParameter(audioRecordInteractor, "audioRecordInteractor");
        Intrinsics.checkNotNullParameter(installedBankAppsInteractor, "installedBankAppsInteractor");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(forceUpdateInteractor, "forceUpdateInteractor");
        Intrinsics.checkNotNullParameter(fintechUltraManager, "fintechUltraManager");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        this.f3199a = application;
        this.f3200b = fintechSettings;
        this.f3201c = fintechNavigation;
        this.f3202d = applicationInfoDataSource;
        this.f3203e = authInteractor;
        this.f3204f = notificationInteractor;
        this.f3205g = cbottomDisplay;
        this.f3206h = fintechTestEnvironmentManager;
        this.f3207i = audioRecordInteractor;
        this.f3208j = installedBankAppsInteractor;
        this.f3209k = fintechAnalyticInteractor;
        this.f3210l = sharedPreferences;
        this.f3211m = forceUpdateInteractor;
        this.f3212n = fintechUltraManager;
        this.f3214p = new Handler(Looper.getMainLooper());
        this.f3215q = W30.a.b(application, fintechLibType);
        this.f3216r = Sc.k.b(new m0(this, 0));
    }

    private final L90.a P0() {
        return (L90.a) this.f3216r.getValue();
    }

    public static void d0(v0 v0Var) {
        v0Var.f3201c.k0();
    }

    public static void e0(v0 v0Var) {
        v0Var.f3201c.t0(-36, C7714v.b0("https://ir.ozone.ru/s3/multimedia-o/wc1000/6615564888.jpg", "https://ir.ozone.ru/s3/multimedia-z/wc1000/6615564899.jpg", "https://ir.ozone.ru/s3/multimedia-p/wc1000/6615564925.jpg", "https://ir.ozone.ru/s3/multimedia-2/wc1000/6438995594.jpg", "https://ir.ozone.ru/s3/multimedia-r/wc1000/6622781499.jpg", "https://ir.ozone.ru/s3/multimedia-t/wc1000/6622781501.jpg", "https://ir.ozone.ru/s3/multimedia-j/wc1000/6577082863.jpg", "https://ir.ozone.ru/s3/multimedia-h/wc1000/6577082861.jpg", "https://ir.ozone.ru/s3/multimedia-g/wc1000/6577082860.jpg", "https://ir.ozone.ru/s3/multimedia-9/wc1000/6438995313.jpg"), null);
    }

    public static void f0(v0 v0Var) {
        v0Var.f3201c.s();
    }

    public static void g0(v0 v0Var) {
        v0Var.f3201c.f();
    }

    public static void h0(v0 v0Var) {
        S80.b bVar = v0Var.f3201c;
        AssetManager assets = StyleParser.INSTANCE.getApplication().getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        String a11 = C3132a.a(assets, "cbottom_onboarding.json");
        if (a11 == null) {
            a11 = "";
        }
        bVar.B0(a11, null, 1, "");
    }

    public static void i0(v0 v0Var) {
        v0Var.f3201c.r();
    }

    public static void j0(v0 v0Var) {
        v0Var.f3201c.a0();
    }

    public static void k0(v0 v0Var) {
        InputStream open = v0Var.f3199a.getAssets().open("base64/testImg1");
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        Charset charset = Charsets.UTF_8;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, charset), 8192);
        try {
            String d11 = bd.q.d(bufferedReader);
            bufferedReader.close();
            Application application = v0Var.f3199a;
            InputStream open2 = application.getAssets().open("base64/testImg2");
            Intrinsics.checkNotNullExpressionValue(open2, "open(...)");
            bufferedReader = new BufferedReader(new InputStreamReader(open2, charset), 8192);
            try {
                String d12 = bd.q.d(bufferedReader);
                bufferedReader.close();
                InputStream open3 = application.getAssets().open("base64/testImg3");
                Intrinsics.checkNotNullExpressionValue(open3, "open(...)");
                bufferedReader = new BufferedReader(new InputStreamReader(open3, charset), 8192);
                try {
                    String d13 = bd.q.d(bufferedReader);
                    bufferedReader.close();
                    InputStream open4 = application.getAssets().open("base64/testImg4");
                    Intrinsics.checkNotNullExpressionValue(open4, "open(...)");
                    bufferedReader = new BufferedReader(new InputStreamReader(open4, charset), 8192);
                    try {
                        String d14 = bd.q.d(bufferedReader);
                        bufferedReader.close();
                        v0Var.f3201c.t0(2, null, C7714v.b0(d11, d12, d13, d14));
                    } finally {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static void l0(v0 v0Var) {
        v0Var.f3201c.j0("", null, false);
    }

    public static void m0(v0 v0Var) {
        v0Var.f3201c.G0();
    }

    public static void n0(v0 v0Var) {
        v0Var.f3201c.f0();
    }

    public static void p0(v0 v0Var) {
        v0Var.f3201c.t();
    }

    public static L90.a q0(v0 v0Var) {
        return new L90.a(v0Var.f3199a, v0Var.f3200b);
    }

    public static void r0(v0 v0Var) {
        S80.b bVar = v0Var.f3201c;
        AssetManager assets = StyleParser.INSTANCE.getApplication().getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        String a11 = C3132a.a(assets, "cbottom_stories.json");
        if (a11 == null) {
            a11 = "";
        }
        bVar.F(a11, null, 1, "");
    }

    public static void s0(v0 v0Var) {
        v0Var.f3201c.w();
    }

    public static void t0(v0 v0Var) {
        v0Var.f3201c.v0("Файл", "https://cdn1.ozone.ru/s3/ob-landing/static/docs/ecom/products/rules/%D0%9E%D0%B1%D1%89%D0%B8%D0%B5%20%D0%BF%D0%BE%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F%20%D0%9A%D0%BB%D0%B8%D0%B5%D0%BD%D1%82%D1%81%D0%BA%D0%B8%D1%85%20%D0%BF%D1%80%D0%B0%D0%B2%D0%B8%D0%BB%2020220919.pdf", 12333L, "attachment; filename=quot.pdf;", "application/pdf", false, null);
    }

    public static void u0(v0 v0Var) {
        v0Var.f3201c.l0(2);
    }

    public static void v0(v0 v0Var) {
        v0Var.f3201c.p0();
    }

    public static void w0(v0 v0Var) {
        v0Var.f3201c.g();
    }

    public static void x0(v0 v0Var) {
        v0Var.f3201c.S();
    }

    public static void y0(v0 v0Var) {
        v0Var.f3201c.T();
    }

    public final void A1() {
        this.f3204f.b(new AbstractC7611a.C1161a("s", "d", "Приветики", "Функционал Рассрочки в Ozon Банк находится на стадии тестирования и может быть ограничен. Подробные условия программы лояльности размещены на ozon.ru", Integer.valueOf(R.drawable.fintech_preference_notif_icon), "ozonbank://web?isBackStackEnabled=true&url=https://finance.ozonru.me/lk/upgrade-full-photo?rephoto&origin=push", 22, null));
    }

    public final void E0(boolean z11) {
        Activity c11;
        Q90.n nVar = this.f3212n;
        if (nVar.d() == z11 || (c11 = this.f3201c.c()) == null) {
            return;
        }
        nVar.c(c11, z11);
    }

    public final void F0() {
        this.f3206h.o();
        InterfaceC5773a.C0860a c0860a = InterfaceC5773a.f56817a;
        P0().a(".", "/", "x-o3-ab-variants", true);
        P0().a(".", "/", "x-o3-ab-variants", false);
    }

    public final void G0() {
        this.f3206h.m();
        InterfaceC5773a.C0860a c0860a = InterfaceC5773a.f56817a;
        P0().a(".", "/", "x-o3-meshversion", true);
        P0().a(".", "/", "x-o3-meshversion", false);
    }

    public final void H0() {
        C2702w.e(this.f3210l, "IS_WAS_SHOWN_NOTIFICATION_REQUEST", false);
    }

    public final void I0() {
        this.f3206h.e();
        InterfaceC5773a.C0860a c0860a = InterfaceC5773a.f56817a;
        P0().a(".", "/", "x-o3-ob-testing-auth-ttl", true);
        P0().a(".", "/", "x-o3-ob-testing-auth-ttl", false);
    }

    public final void J0() {
        this.f3206h.f();
    }

    public final void K0(@NotNull androidx.preference.g manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        StringBuilder sb2 = new StringBuilder("configure preference by name ");
        String str = this.f3215q;
        sb2.append(str);
        L80.a.a("FintechPreferencesViewModel", sb2.toString());
        manager.n(str);
    }

    public final void L0(@NotNull String textToCopy) {
        Intrinsics.checkNotNullParameter(textToCopy, "textToCopy");
        ClipData newPlainText = ClipData.newPlainText("OZON_LABEL", textToCopy);
        Object systemService = this.f3199a.getSystemService("clipboard");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(newPlainText);
    }

    public final void M0() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new g0(this, 0), 500L);
    }

    public final boolean N0() {
        try {
            this.f3203e.getClass();
            CookieManager cookieManager = CookieManager.getInstance();
            Intrinsics.f(cookieManager);
            H30.f.a(cookieManager, "__OBANK_session");
            H30.f.a(cookieManager, "__OBANK_refresh");
            return true;
        } catch (Exception e11) {
            L80.a.c("FintechPreferencesViewModel", null, e11);
            return false;
        }
    }

    @NotNull
    public final String O0() {
        String aBVariantsHeader = this.f3206h.getABVariantsHeader();
        return aBVariantsHeader == null ? "" : aBVariantsHeader;
    }

    @NotNull
    public final String Q0() {
        return this.f3206h.getHeaderToken();
    }

    @NotNull
    public final String R0() {
        String meshHeader = this.f3206h.getMeshHeader();
        return meshHeader == null ? "" : meshHeader;
    }

    public final void S0() {
        Application context = this.f3199a;
        Intrinsics.checkNotNullParameter(context, "context");
        SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(context.getDatabasePath("Database.db.tracker.ozon.ru").getAbsolutePath(), null, 1);
        try {
            Cursor rawQuery = openDatabase.rawQuery("SELECT * FROM event", null);
            Intrinsics.checkNotNullExpressionValue(rawQuery, "rawQuery(...)");
            String[] columnNames = rawQuery.getColumnNames();
            while (rawQuery.moveToNext()) {
                Intrinsics.f(columnNames);
                L80.a.a("AnalyticsDB", C7705l.P(columnNames, null, null, null, new h0(rawQuery, 0), 31));
            }
            rawQuery.close();
            openDatabase.close();
        } catch (Exception e11) {
            L80.a.c("AnalyticsDB", null, e11);
            openDatabase.close();
        }
    }

    @NotNull
    public final String T0() {
        String b11 = this.f3206h.b();
        return b11 == null ? "" : b11;
    }

    public final void U0() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new k0(this, 0), 500L);
    }

    public final void V0() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new j0(this, 0), 500L);
    }

    public final void W0() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new B5.j(this, 1), 500L);
    }

    public final void X0() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new e0(this, 0), 500L);
    }

    public final void Y0() {
        K40.a aVar = this.f3205g;
        K40.b creator = aVar.creator();
        String string = this.f3199a.getString(R.string.fintech_preferences_sheet_share_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        aVar.g(K40.b.f(creator, string), CbottomType.SHEET, "", null);
    }

    public final void Z0() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new i0(this, 0), 500L);
    }

    public final void a1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new s0(this, 0), 500L);
    }

    public final void b1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new p0(this, 0), 500L);
    }

    public final void c1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new c0(this, 0), 500L);
    }

    public final void d1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new u0(this, 0), 500L);
    }

    public final void e1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new t0(this, 0), 500L);
    }

    public final void f1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new q0(this, 0), 500L);
    }

    public final void g1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new r0(this, 0), 500L);
    }

    public final boolean h1() {
        return this.f3212n.f();
    }

    public final boolean i1() {
        return this.f3200b.isStandAloneIntegration();
    }

    public final boolean j1() {
        return this.f3212n.d();
    }

    public final void k1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new RunnableC2610l(this, 1), 500L);
    }

    public final void l1(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f3208j.c(packageName);
    }

    public final void m1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new l0(this, 0), 500L);
    }

    public final void n1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new f0(this, 0), 500L);
    }

    public final void o1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new RunnableC2599a(this, 1), 500L);
    }

    public final void p1() {
        this.f3201c.n0();
    }

    public final void q1() {
        this.f3209k.Q();
    }

    public final void r1(WeakReference<Activity> weakReference) {
        this.f3213o = weakReference;
    }

    public final void s1(@NotNull String seconds) {
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        this.f3206h.l(seconds);
    }

    public final void t1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new d0(this, 0), 500L);
    }

    public final void u1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new o0(this, 0), 500L);
    }

    public final void v1() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f3213o;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
        }
        this.f3214p.postDelayed(new n0(this, 0), 500L);
    }

    public final void w1() {
        V70.b bVar = this.f3207i;
        bVar.b();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        bVar.c(uuid);
    }

    public final void x1() {
        this.f3207i.a();
    }

    public final void y1() {
        this.f3204f.b(new AbstractC7611a.C1161a("s", "d", "Приветики", "Функционал Рассрочки в Ozon Банк находится на стадии тестирования и может быть ограничен. Подробные условия программы лояльности размещены на ozon.ru", Integer.valueOf(R.drawable.fintech_preference_notif_icon), "https://finance.ozon.ru/promo/client-redirect?url=https://s.ozon.ru/axJQxVM", 22, null));
    }

    public final void z1() {
        this.f3204f.b(new AbstractC7611a.b("s", "d", "1234", "Копируй", "Вот твой ОТП код", "12303303 никому его не говори", Integer.valueOf(R.drawable.fintech_preference_notif_icon), U7.d.e(this.f3200b.f(), "/m/lk/limits"), 22, null));
    }
}
