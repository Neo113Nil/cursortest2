package t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: k, reason: collision with root package name */
    public static final v f19415k;

    /* renamed from: l, reason: collision with root package name */
    public static final v f19416l;

    /* renamed from: m, reason: collision with root package name */
    public static final v f19417m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ v[] f19418n;

    static {
        v vVar = new v("PreEnter", 0);
        f19415k = vVar;
        v vVar2 = new v("Visible", 1);
        f19416l = vVar2;
        v vVar3 = new v("PostExit", 2);
        f19417m = vVar3;
        f19418n = new v[]{vVar, vVar2, vVar3};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f19418n.clone();
    }
}
