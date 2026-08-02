package K4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f4020a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f4021b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f4022c;

    static {
        i iVar = new i("UNREACHABLE", 0);
        f4020a = iVar;
        i iVar2 = new i("REACHABLE", 1);
        f4021b = iVar2;
        f4022c = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f4022c.clone();
    }
}
