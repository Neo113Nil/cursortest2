package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0244n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0244n f4576a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0244n f4577b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0244n f4578c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0244n f4579d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0244n f4580e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0244n[] f4581f;

    static {
        EnumC0244n enumC0244n = new EnumC0244n("DESTROYED", 0);
        f4576a = enumC0244n;
        EnumC0244n enumC0244n2 = new EnumC0244n("INITIALIZED", 1);
        f4577b = enumC0244n2;
        EnumC0244n enumC0244n3 = new EnumC0244n("CREATED", 2);
        f4578c = enumC0244n3;
        EnumC0244n enumC0244n4 = new EnumC0244n("STARTED", 3);
        f4579d = enumC0244n4;
        EnumC0244n enumC0244n5 = new EnumC0244n("RESUMED", 4);
        f4580e = enumC0244n5;
        f4581f = new EnumC0244n[]{enumC0244n, enumC0244n2, enumC0244n3, enumC0244n4, enumC0244n5};
    }

    public static EnumC0244n valueOf(String str) {
        return (EnumC0244n) Enum.valueOf(EnumC0244n.class, str);
    }

    public static EnumC0244n[] values() {
        return (EnumC0244n[]) f4581f.clone();
    }
}
