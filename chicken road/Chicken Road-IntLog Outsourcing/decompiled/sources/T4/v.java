package T4;

import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final C0152b f2985b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f2986c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f2987d;

    /* renamed from: e, reason: collision with root package name */
    public static final v f2988e;

    /* renamed from: f, reason: collision with root package name */
    public static final v f2989f;

    /* renamed from: g, reason: collision with root package name */
    public static final v f2990g;

    /* renamed from: h, reason: collision with root package name */
    public static final v f2991h;

    /* renamed from: i, reason: collision with root package name */
    public static final v f2992i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ v[] f2993j;

    /* renamed from: a, reason: collision with root package name */
    public final String f2994a;

    static {
        v vVar = new v("HTTP_1_0", 0, "http/1.0");
        f2986c = vVar;
        v vVar2 = new v("HTTP_1_1", 1, "http/1.1");
        f2987d = vVar2;
        v vVar3 = new v("SPDY_3", 2, "spdy/3.1");
        f2988e = vVar3;
        v vVar4 = new v("HTTP_2", 3, "h2");
        f2989f = vVar4;
        v vVar5 = new v("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        f2990g = vVar5;
        v vVar6 = new v("QUIC", 5, "quic");
        f2991h = vVar6;
        v vVar7 = new v("HTTP_3", 6, "h3");
        f2992i = vVar7;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7};
        f2993j = vVarArr;
        AbstractC1477a.n(vVarArr);
        f2985b = new C0152b();
    }

    public v(String str, int i2, String str2) {
        this.f2994a = str2;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f2993j.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f2994a;
    }
}
