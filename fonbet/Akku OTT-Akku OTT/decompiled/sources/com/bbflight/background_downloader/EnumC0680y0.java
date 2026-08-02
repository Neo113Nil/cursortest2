package com.bbflight.background_downloader;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.bbflight.background_downloader.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0680y0 {
    public static final EnumC0680y0 a;
    public static final EnumC0680y0 b;
    public static final /* synthetic */ EnumC0680y0[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        EnumC0680y0 enumC0680y0 = new EnumC0680y0("notifications", 0);
        a = enumC0680y0;
        EnumC0680y0 enumC0680y02 = new EnumC0680y0("androidSharedStorage", 1);
        b = enumC0680y02;
        EnumC0680y0[] enumC0680y0Arr = {enumC0680y0, enumC0680y02, new EnumC0680y0("iosAddToPhotoLibrary", 2), new EnumC0680y0("iosChangePhotoLibrary", 3)};
        c = enumC0680y0Arr;
        d = EnumEntriesKt.enumEntries(enumC0680y0Arr);
    }

    public EnumC0680y0() {
        throw null;
    }

    public static EnumC0680y0 valueOf(String str) {
        return (EnumC0680y0) Enum.valueOf(EnumC0680y0.class, str);
    }

    public static EnumC0680y0[] values() {
        return (EnumC0680y0[]) c.clone();
    }
}
