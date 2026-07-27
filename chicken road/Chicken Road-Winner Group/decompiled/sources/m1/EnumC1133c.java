package m1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1133c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1133c f10098a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1133c[] f10099b;

    static {
        EnumC1133c enumC1133c = new EnumC1133c("DEFAULT", 0);
        f10098a = enumC1133c;
        f10099b = new EnumC1133c[]{enumC1133c, new EnumC1133c("SIGNED", 1), new EnumC1133c("FIXED", 2)};
    }

    public static EnumC1133c valueOf(String str) {
        return (EnumC1133c) Enum.valueOf(EnumC1133c.class, str);
    }

    public static EnumC1133c[] values() {
        return (EnumC1133c[]) f10099b.clone();
    }
}
