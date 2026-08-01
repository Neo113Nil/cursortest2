package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.s6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC4069s6 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC4069s6 f7367a;
    public static final /* synthetic */ EnumC4069s6[] b;

    static {
        EnumC4069s6 enumC4069s6 = new EnumC4069s6("URL", 0);
        f7367a = enumC4069s6;
        EnumC4069s6[] enumC4069s6Arr = {enumC4069s6, new EnumC4069s6("HTML", 1)};
        b = enumC4069s6Arr;
        EnumEntriesKt.enumEntries(enumC4069s6Arr);
    }

    public EnumC4069s6(String str, int i) {
    }

    public static EnumC4069s6 valueOf(String str) {
        return (EnumC4069s6) Enum.valueOf(EnumC4069s6.class, str);
    }

    public static EnumC4069s6[] values() {
        return (EnumC4069s6[]) b.clone();
    }
}
