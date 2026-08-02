package Q3;

import d4.C1917b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: l, reason: collision with root package name */
    public static final c f5078l;

    /* renamed from: m, reason: collision with root package name */
    public static final d f5079m;

    /* renamed from: n, reason: collision with root package name */
    public static final d f5080n;

    /* renamed from: o, reason: collision with root package name */
    public static final d f5081o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ d[] f5082p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C1917b f5083q;

    /* renamed from: k, reason: collision with root package name */
    public final String f5084k;

    static {
        d dVar = new d(0, "LABEL_QUREKA", "adMarkerQureka");
        f5079m = dVar;
        d dVar2 = new d(1, "LABEL_ADX", "adMarkerAdx");
        f5080n = dVar2;
        d dVar3 = new d(2, "Direct", null);
        f5081o = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        f5082p = dVarArr;
        f5083q = new C1917b(dVarArr);
        f5078l = new c();
    }

    public d(int i, String str, String str2) {
        this.f5084k = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f5082p.clone();
    }
}
