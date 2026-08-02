package com.bbflight.background_downloader;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.bbflight.background_downloader.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0678x0 {
    public static final EnumC0678x0 a;
    public static final EnumC0678x0 b;
    public static final /* synthetic */ EnumC0678x0[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        EnumC0678x0 enumC0678x0 = new EnumC0678x0("undetermined", 0);
        EnumC0678x0 enumC0678x02 = new EnumC0678x0("denied", 1);
        a = enumC0678x02;
        EnumC0678x0 enumC0678x03 = new EnumC0678x0("granted", 2);
        b = enumC0678x03;
        EnumC0678x0[] enumC0678x0Arr = {enumC0678x0, enumC0678x02, enumC0678x03, new EnumC0678x0("partial", 3), new EnumC0678x0("requestError", 4)};
        c = enumC0678x0Arr;
        d = EnumEntriesKt.enumEntries(enumC0678x0Arr);
    }

    public EnumC0678x0() {
        throw null;
    }

    public static EnumC0678x0 valueOf(String str) {
        return (EnumC0678x0) Enum.valueOf(EnumC0678x0.class, str);
    }

    public static EnumC0678x0[] values() {
        return (EnumC0678x0[]) c.clone();
    }
}
