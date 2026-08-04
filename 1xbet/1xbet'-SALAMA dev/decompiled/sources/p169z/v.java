package p169z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f18372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f18373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f18374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f18375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v[] f18376e;

    static {
        v vVar = new v("UNDEFINED", 0);
        f18372a = vVar;
        v vVar2 = new v("SETUP", 1);
        f18373b = vVar2;
        v vVar3 = new v("MOVING", 2);
        f18374c = vVar3;
        v vVar4 = new v("FINISHED", 3);
        f18375d = vVar4;
        f18376e = new v[]{vVar, vVar2, vVar3, vVar4};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f18376e.clone();
    }
}
