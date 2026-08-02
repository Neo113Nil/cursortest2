package Mm0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    public static final d Basic;
    public static final d Deep;

    /* renamed from: transient, reason: not valid java name */
    private static final /* synthetic */ d[] f2transient;

    static {
        d dVar = new d("Basic", 0);
        Basic = dVar;
        d dVar2 = new d("Deep", 1);
        Deep = dVar2;
        f2transient = new d[]{dVar, dVar2};
    }

    private d() {
        throw null;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2transient.clone();
    }
}
