package Ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ve.vm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC4711vm {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4711vm f32308a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4711vm f32309b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC4711vm[] f32310c;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4711vm EF0;

    static {
        EnumC4711vm enumC4711vm = new EnumC4711vm("SESSION_ID", 0);
        EnumC4711vm enumC4711vm2 = new EnumC4711vm("LIST_OF_CARDS", 1);
        EnumC4711vm enumC4711vm3 = new EnumC4711vm("BNPL_PLAN", 2);
        EnumC4711vm enumC4711vm4 = new EnumC4711vm("ALL_RESPONSES", 3);
        f32308a = enumC4711vm4;
        EnumC4711vm enumC4711vm5 = new EnumC4711vm("ALL", 4);
        f32309b = enumC4711vm5;
        f32310c = new EnumC4711vm[]{enumC4711vm, enumC4711vm2, enumC4711vm3, enumC4711vm4, enumC4711vm5, new EnumC4711vm("MERCHANT_DATA", 5)};
    }

    public static EnumC4711vm valueOf(String str) {
        return (EnumC4711vm) Enum.valueOf(EnumC4711vm.class, str);
    }

    public static EnumC4711vm[] values() {
        return (EnumC4711vm[]) f32310c.clone();
    }
}
