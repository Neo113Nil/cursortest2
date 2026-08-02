package kotlinx.serialization.json;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kotlinx.serialization.json.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC1176a {
    public static final EnumC1176a a;
    public static final EnumC1176a b;
    public static final /* synthetic */ EnumC1176a[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        EnumC1176a enumC1176a = new EnumC1176a("NONE", 0);
        a = enumC1176a;
        EnumC1176a enumC1176a2 = new EnumC1176a("ALL_JSON_OBJECTS", 1);
        EnumC1176a enumC1176a3 = new EnumC1176a("POLYMORPHIC", 2);
        b = enumC1176a3;
        EnumC1176a[] enumC1176aArr = {enumC1176a, enumC1176a2, enumC1176a3};
        c = enumC1176aArr;
        d = EnumEntriesKt.enumEntries(enumC1176aArr);
    }

    public EnumC1176a() {
        throw null;
    }

    public static EnumC1176a valueOf(String str) {
        return (EnumC1176a) Enum.valueOf(EnumC1176a.class, str);
    }

    public static EnumC1176a[] values() {
        return (EnumC1176a[]) c.clone();
    }
}
