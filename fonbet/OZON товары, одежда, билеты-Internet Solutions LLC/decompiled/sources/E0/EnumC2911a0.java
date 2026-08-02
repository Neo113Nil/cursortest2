package E0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: E0.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC2911a0 {
    private static final /* synthetic */ EnumC2911a0[] $VALUES;
    public static final EnumC2911a0 Deletion;
    public static final EnumC2911a0 Insertion;
    public static final EnumC2911a0 Replacement;
    public static final EnumC2911a0 Untransformed;

    static {
        EnumC2911a0 enumC2911a0 = new EnumC2911a0("Untransformed", 0);
        Untransformed = enumC2911a0;
        EnumC2911a0 enumC2911a02 = new EnumC2911a0("Insertion", 1);
        Insertion = enumC2911a02;
        EnumC2911a0 enumC2911a03 = new EnumC2911a0("Replacement", 2);
        Replacement = enumC2911a03;
        EnumC2911a0 enumC2911a04 = new EnumC2911a0("Deletion", 3);
        Deletion = enumC2911a04;
        $VALUES = new EnumC2911a0[]{enumC2911a0, enumC2911a02, enumC2911a03, enumC2911a04};
    }

    private EnumC2911a0() {
        throw null;
    }

    public static EnumC2911a0 valueOf(String str) {
        return (EnumC2911a0) Enum.valueOf(EnumC2911a0.class, str);
    }

    public static EnumC2911a0[] values() {
        return (EnumC2911a0[]) $VALUES.clone();
    }
}
