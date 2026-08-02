package f6;

import a.AbstractC0603a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1110c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC1110c[] f12999a;

    static {
        EnumC1110c[] enumC1110cArr = {new EnumC1110c("SYNCHRONIZED", 0), new EnumC1110c("PUBLICATION", 1), new EnumC1110c("NONE", 2)};
        f12999a = enumC1110cArr;
        AbstractC0603a.T(enumC1110cArr);
    }

    public static EnumC1110c valueOf(String str) {
        return (EnumC1110c) Enum.valueOf(EnumC1110c.class, str);
    }

    public static EnumC1110c[] values() {
        return (EnumC1110c[]) f12999a.clone();
    }
}
