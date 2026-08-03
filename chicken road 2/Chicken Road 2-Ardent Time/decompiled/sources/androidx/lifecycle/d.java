package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ androidx.lifecycle.d[] $VALUES;
    public static final androidx.lifecycle.b Companion;
    public static final androidx.lifecycle.d ON_ANY;
    public static final androidx.lifecycle.d ON_CREATE;
    public static final androidx.lifecycle.d ON_DESTROY;
    public static final androidx.lifecycle.d ON_PAUSE;
    public static final androidx.lifecycle.d ON_RESUME;
    public static final androidx.lifecycle.d ON_START;
    public static final androidx.lifecycle.d ON_STOP;

    static {
        androidx.lifecycle.d dVar = new androidx.lifecycle.d("ON_CREATE", 0);
        ON_CREATE = dVar;
        androidx.lifecycle.d dVar2 = new androidx.lifecycle.d("ON_START", 1);
        ON_START = dVar2;
        androidx.lifecycle.d dVar3 = new androidx.lifecycle.d("ON_RESUME", 2);
        ON_RESUME = dVar3;
        androidx.lifecycle.d dVar4 = new androidx.lifecycle.d("ON_PAUSE", 3);
        ON_PAUSE = dVar4;
        androidx.lifecycle.d dVar5 = new androidx.lifecycle.d("ON_STOP", 4);
        ON_STOP = dVar5;
        androidx.lifecycle.d dVar6 = new androidx.lifecycle.d("ON_DESTROY", 5);
        ON_DESTROY = dVar6;
        androidx.lifecycle.d dVar7 = new androidx.lifecycle.d("ON_ANY", 6);
        ON_ANY = dVar7;
        $VALUES = new androidx.lifecycle.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        Companion = new androidx.lifecycle.b();
    }

    public static androidx.lifecycle.d valueOf(java.lang.String str) {
        return (androidx.lifecycle.d) java.lang.Enum.valueOf(androidx.lifecycle.d.class, str);
    }

    public static androidx.lifecycle.d[] values() {
        return (androidx.lifecycle.d[]) $VALUES.clone();
    }

    public final androidx.lifecycle.e a() {
        switch (androidx.lifecycle.c.f2378a[ordinal()]) {
            case 1:
            case 2:
                return androidx.lifecycle.e.f2381c;
            case 3:
            case 4:
                return androidx.lifecycle.e.f2382d;
            case 5:
                return androidx.lifecycle.e.f2383e;
            case 6:
                return androidx.lifecycle.e.f2379a;
            default:
                throw new java.lang.IllegalArgumentException(this + " has no target state");
        }
    }
}
