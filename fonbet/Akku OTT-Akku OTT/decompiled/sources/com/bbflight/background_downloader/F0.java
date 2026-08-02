package com.bbflight.background_downloader;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class F0 {
    public static final /* synthetic */ F0[] a;
    public static final /* synthetic */ EnumEntries b;

    static {
        F0[] f0Arr = {new F0("downloads", 0), new F0("images", 1), new F0("video", 2), new F0("audio", 3), new F0("files", 4), new F0("external", 5)};
        a = f0Arr;
        b = EnumEntriesKt.enumEntries(f0Arr);
    }

    public F0() {
        throw null;
    }

    public static F0 valueOf(String str) {
        return (F0) Enum.valueOf(F0.class, str);
    }

    public static F0[] values() {
        return (F0[]) a.clone();
    }
}
