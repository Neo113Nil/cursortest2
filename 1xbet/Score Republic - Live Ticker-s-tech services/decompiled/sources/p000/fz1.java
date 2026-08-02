package p000;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fz1 extends d12 {

    /* JADX INFO: renamed from: I */
    public static final Pair f2540I = new Pair("", 0L);

    /* JADX INFO: renamed from: A */
    public boolean f2541A;

    /* JADX INFO: renamed from: B */
    public final yy1 f2542B;

    /* JADX INFO: renamed from: C */
    public final yy1 f2543C;

    /* JADX INFO: renamed from: D */
    public final bz1 f2544D;

    /* JADX INFO: renamed from: E */
    public final C0809vn f2545E;

    /* JADX INFO: renamed from: F */
    public final C0809vn f2546F;

    /* JADX INFO: renamed from: G */
    public final bz1 f2547G;

    /* JADX INFO: renamed from: H */
    public final f71 f2548H;

    /* JADX INFO: renamed from: l */
    public SharedPreferences f2549l;

    /* JADX INFO: renamed from: m */
    public SharedPreferences f2550m;

    /* JADX INFO: renamed from: n */
    public C0593pt f2551n;

    /* JADX INFO: renamed from: o */
    public final bz1 f2552o;

    /* JADX INFO: renamed from: p */
    public final C0809vn f2553p;

    /* JADX INFO: renamed from: q */
    public String f2554q;

    /* JADX INFO: renamed from: r */
    public boolean f2555r;

    /* JADX INFO: renamed from: s */
    public long f2556s;

    /* JADX INFO: renamed from: t */
    public final bz1 f2557t;

    /* JADX INFO: renamed from: u */
    public final yy1 f2558u;

    /* JADX INFO: renamed from: v */
    public final C0809vn f2559v;

    /* JADX INFO: renamed from: w */
    public final f71 f2560w;

    /* JADX INFO: renamed from: x */
    public final yy1 f2561x;

    /* JADX INFO: renamed from: y */
    public final bz1 f2562y;

    /* JADX INFO: renamed from: z */
    public final bz1 f2563z;

    public fz1(f02 f02Var) {
        super(f02Var);
        this.f2557t = new bz1(this, "session_timeout", 1800000L);
        this.f2558u = new yy1(this, "start_new_session", true);
        this.f2562y = new bz1(this, "last_pause_time", 0L);
        this.f2563z = new bz1(this, "session_id", 0L);
        this.f2559v = new C0809vn(this, "non_personalized_ads");
        this.f2560w = new f71(this, "last_received_uri_timestamps_by_source");
        this.f2561x = new yy1(this, "allow_remote_dynamite", false);
        this.f2552o = new bz1(this, "first_open_time", 0L);
        p80.m3860e("app_install_time");
        this.f2553p = new C0809vn(this, "app_instance_id");
        this.f2542B = new yy1(this, "app_backgrounded", false);
        this.f2543C = new yy1(this, "deep_link_retrieval_complete", false);
        this.f2544D = new bz1(this, "deep_link_retrieval_attempts", 0L);
        this.f2545E = new C0809vn(this, "firebase_feature_rollouts");
        this.f2546F = new C0809vn(this, "deferred_attribution_cache");
        this.f2547G = new bz1(this, "deferred_attribution_cache_timestamp", 0L);
        this.f2548H = new f71(this, "default_event_parameters");
    }

    @Override // p000.d12
    /* JADX INFO: renamed from: B */
    public final boolean mo0B() {
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final SharedPreferences m1908E() {
        mo11z();
        m1081C();
        p80.m3863h(this.f2549l);
        return this.f2549l;
    }

    /* JADX INFO: renamed from: F */
    public final SharedPreferences m1909F() {
        mo11z();
        m1081C();
        if (this.f2550m == null) {
            f02 f02Var = (f02) this.f7192j;
            String strValueOf = String.valueOf(f02Var.f2242j.getPackageName());
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            wc1 wc1Var = ky1Var.f4608w;
            String strConcat = strValueOf.concat("_preferences");
            wc1Var.m5313b(strConcat, "Default prefs file");
            this.f2550m = f02Var.f2242j.getSharedPreferences(strConcat, 0);
        }
        return this.f2550m;
    }

    /* JADX INFO: renamed from: G */
    public final SparseArray m1910G() {
        Bundle bundleM1677x = this.f2560w.m1677x();
        int[] intArray = bundleM1677x.getIntArray("uriSources");
        long[] longArray = bundleM1677x.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    /* JADX INFO: renamed from: H */
    public final l12 m1911H() {
        mo11z();
        return l12.m3150c(m1908E().getString("consent_settings", "G1"), m1908E().getInt("consent_source", 100));
    }

    /* JADX INFO: renamed from: I */
    public final void m1912I(boolean z) {
        mo11z();
        ky1 ky1Var = ((f02) this.f7192j).f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4608w.m5313b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = m1908E().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: J */
    public final boolean m1913J(long j) {
        return j - this.f2557t.m821a() > this.f2562y.m821a();
    }
}
