package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final c Companion;
    public static final e ON_ANY;
    public static final e ON_CREATE;
    public static final e ON_DESTROY;
    public static final e ON_PAUSE;
    public static final e ON_RESUME;
    public static final e ON_START;
    public static final e ON_STOP;

    static {
        e eVar = new e("ON_CREATE", 0);
        ON_CREATE = eVar;
        e eVar2 = new e("ON_START", 1);
        ON_START = eVar2;
        e eVar3 = new e("ON_RESUME", 2);
        ON_RESUME = eVar3;
        e eVar4 = new e("ON_PAUSE", 3);
        ON_PAUSE = eVar4;
        e eVar5 = new e("ON_STOP", 4);
        ON_STOP = eVar5;
        e eVar6 = new e("ON_DESTROY", 5);
        ON_DESTROY = eVar6;
        e eVar7 = new e("ON_ANY", 6);
        ON_ANY = eVar7;
        $VALUES = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        Companion = new c();
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final f a() {
        switch (d.f2302a[ordinal()]) {
            case 1:
            case 2:
                return f.f2305c;
            case 3:
            case 4:
                return f.f2306d;
            case 5:
                return f.f2307e;
            case 6:
                return f.f2303a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
