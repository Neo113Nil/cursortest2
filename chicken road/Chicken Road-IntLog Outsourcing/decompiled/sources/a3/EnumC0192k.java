package a3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0192k implements InterfaceC0187f {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0192k f3874a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0192k[] f3875b;

    static {
        EnumC0192k enumC0192k = new EnumC0192k("INSTANCE", 0);
        f3874a = enumC0192k;
        f3875b = new EnumC0192k[]{enumC0192k};
    }

    public static EnumC0192k valueOf(String str) {
        return (EnumC0192k) Enum.valueOf(EnumC0192k.class, str);
    }

    public static EnumC0192k[] values() {
        return (EnumC0192k[]) f3875b.clone();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
