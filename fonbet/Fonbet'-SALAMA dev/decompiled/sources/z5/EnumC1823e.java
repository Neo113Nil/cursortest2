package z5;

import w1.L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1823e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1823e f18461a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1823e[] f18462b;

    static {
        EnumC1823e enumC1823e = new EnumC1823e("PLAIN_TEXT", 0);
        f18461a = enumC1823e;
        f18462b = new EnumC1823e[]{enumC1823e};
    }

    public static EnumC1823e a(String str) {
        for (EnumC1823e enumC1823e : values()) {
            enumC1823e.getClass();
            if ("text/plain".equals(str)) {
                return enumC1823e;
            }
        }
        throw new NoSuchFieldException(L.i("No such ClipboardContentFormat: ", str));
    }

    public static EnumC1823e valueOf(String str) {
        return (EnumC1823e) Enum.valueOf(EnumC1823e.class, str);
    }

    public static EnumC1823e[] values() {
        return (EnumC1823e[]) f18462b.clone();
    }
}
