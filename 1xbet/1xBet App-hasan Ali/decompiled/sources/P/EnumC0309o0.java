package P;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: P.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0309o0 {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0309o0 f4494k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0309o0 f4495l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0309o0 f4496m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0309o0[] f4497n;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0309o0 EF7;

    static {
        EnumC0309o0 enumC0309o0 = new EnumC0309o0("Invalid", 0);
        EnumC0309o0 enumC0309o02 = new EnumC0309o0("Cancelled", 1);
        f4494k = enumC0309o02;
        EnumC0309o0 enumC0309o03 = new EnumC0309o0("InitialPending", 2);
        EnumC0309o0 enumC0309o04 = new EnumC0309o0("RecomposePending", 3);
        EnumC0309o0 enumC0309o05 = new EnumC0309o0("Recomposing", 4);
        f4495l = enumC0309o05;
        EnumC0309o0 enumC0309o06 = new EnumC0309o0("ApplyPending", 5);
        f4496m = enumC0309o06;
        f4497n = new EnumC0309o0[]{enumC0309o0, enumC0309o02, enumC0309o03, enumC0309o04, enumC0309o05, enumC0309o06, new EnumC0309o0("Applied", 6)};
    }

    public static EnumC0309o0 valueOf(String str) {
        return (EnumC0309o0) Enum.valueOf(EnumC0309o0.class, str);
    }

    public static EnumC0309o0[] values() {
        return (EnumC0309o0[]) f4497n.clone();
    }
}
