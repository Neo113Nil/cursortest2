package ae0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ae0.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC5007c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC5007c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final EnumC5007c LIBRE;
    public static final EnumC5007c YANDEX;

    @NotNull
    private final String value;

    /* renamed from: ae0.c$a */
    public static final class a {
    }

    static {
        EnumC5007c enumC5007c = new EnumC5007c("YANDEX", 0, "yandex");
        YANDEX = enumC5007c;
        EnumC5007c enumC5007c2 = new EnumC5007c("LIBRE", 1, "libre");
        LIBRE = enumC5007c2;
        EnumC5007c[] enumC5007cArr = {enumC5007c, enumC5007c2};
        $VALUES = enumC5007cArr;
        $ENTRIES = Xc.b.a(enumC5007cArr);
        Companion = new a();
    }

    private EnumC5007c(String str, int i11, String str2) {
        this.value = str2;
    }

    public static EnumC5007c valueOf(String str) {
        return (EnumC5007c) Enum.valueOf(EnumC5007c.class, str);
    }

    public static EnumC5007c[] values() {
        return (EnumC5007c[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.value;
    }
}
