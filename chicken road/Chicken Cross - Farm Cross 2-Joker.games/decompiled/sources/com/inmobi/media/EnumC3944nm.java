package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.nm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC3944nm {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3944nm f7271a;
    public static final EnumC3944nm b;
    public static final /* synthetic */ EnumC3944nm[] c;

    static {
        EnumC3944nm enumC3944nm = new EnumC3944nm("SDK", 0);
        f7271a = enumC3944nm;
        EnumC3944nm enumC3944nm2 = new EnumC3944nm("TEMPLATE", 1);
        b = enumC3944nm2;
        EnumC3944nm[] enumC3944nmArr = {enumC3944nm, enumC3944nm2};
        c = enumC3944nmArr;
        EnumEntriesKt.enumEntries(enumC3944nmArr);
    }

    public EnumC3944nm(String str, int i) {
    }

    public static EnumC3944nm valueOf(String str) {
        return (EnumC3944nm) Enum.valueOf(EnumC3944nm.class, str);
    }

    public static EnumC3944nm[] values() {
        return (EnumC3944nm[]) c.clone();
    }
}
