package Ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ve.z0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC4801z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4801z0 f32615a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4801z0 f32616b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC4801z0[] f32617c;

    static {
        EnumC4801z0 enumC4801z0 = new EnumC4801z0("INITIAL_AUTH", 0);
        f32615a = enumC4801z0;
        EnumC4801z0 enumC4801z02 = new EnumC4801z0("AUTH_FOR_FULL_EMISSION", 1);
        f32616b = enumC4801z02;
        f32617c = new EnumC4801z0[]{enumC4801z0, enumC4801z02};
    }

    public static EnumC4801z0 valueOf(String str) {
        return (EnumC4801z0) Enum.valueOf(EnumC4801z0.class, str);
    }

    public static EnumC4801z0[] values() {
        return (EnumC4801z0[]) f32617c.clone();
    }
}
