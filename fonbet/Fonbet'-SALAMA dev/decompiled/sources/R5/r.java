package R5;

import a.AbstractC0603a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final B4.V f6204b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f6205c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f6206d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f6207e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f6208f;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ r[] f6209x;

    /* renamed from: a, reason: collision with root package name */
    public final int f6210a;

    static {
        r rVar = new r("OPEN", 0, 0);
        f6205c = rVar;
        r rVar2 = new r("OPEN_MULTIPLE", 1, 1);
        f6206d = rVar2;
        r rVar3 = new r("SAVE", 2, 2);
        f6207e = rVar3;
        r rVar4 = new r("UNKNOWN", 3, 3);
        f6208f = rVar4;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4};
        f6209x = rVarArr;
        AbstractC0603a.T(rVarArr);
        f6204b = new B4.V(10);
    }

    public r(String str, int i7, int i8) {
        this.f6210a = i8;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f6209x.clone();
    }
}
