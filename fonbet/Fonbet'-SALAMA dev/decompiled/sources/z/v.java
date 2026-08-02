package z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f18366a;

    /* renamed from: b, reason: collision with root package name */
    public static final v f18367b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f18368c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f18369d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v[] f18370e;

    static {
        v vVar = new v("UNDEFINED", 0);
        f18366a = vVar;
        v vVar2 = new v("SETUP", 1);
        f18367b = vVar2;
        v vVar3 = new v("MOVING", 2);
        f18368c = vVar3;
        v vVar4 = new v("FINISHED", 3);
        f18369d = vVar4;
        f18370e = new v[]{vVar, vVar2, vVar3, vVar4};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f18370e.clone();
    }
}
