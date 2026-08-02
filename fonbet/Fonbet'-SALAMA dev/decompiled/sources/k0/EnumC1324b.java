package k0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1324b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1324b f14651a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1324b f14652b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1324b f14653c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1324b[] f14654d;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1324b EF0;

    static {
        EnumC1324b enumC1324b = new EnumC1324b("PENALTY_LOG", 0);
        EnumC1324b enumC1324b2 = new EnumC1324b("PENALTY_DEATH", 1);
        EnumC1324b enumC1324b3 = new EnumC1324b("DETECT_FRAGMENT_REUSE", 2);
        f14651a = enumC1324b3;
        EnumC1324b enumC1324b4 = new EnumC1324b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f14652b = enumC1324b4;
        EnumC1324b enumC1324b5 = new EnumC1324b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        EnumC1324b enumC1324b6 = new EnumC1324b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        EnumC1324b enumC1324b7 = new EnumC1324b("DETECT_SET_USER_VISIBLE_HINT", 6);
        EnumC1324b enumC1324b8 = new EnumC1324b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        EnumC1324b enumC1324b9 = new EnumC1324b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f14653c = enumC1324b9;
        f14654d = new EnumC1324b[]{enumC1324b, enumC1324b2, enumC1324b3, enumC1324b4, enumC1324b5, enumC1324b6, enumC1324b7, enumC1324b8, enumC1324b9};
    }

    public static EnumC1324b valueOf(String str) {
        return (EnumC1324b) Enum.valueOf(EnumC1324b.class, str);
    }

    public static EnumC1324b[] values() {
        return (EnumC1324b[]) f14654d.clone();
    }
}
