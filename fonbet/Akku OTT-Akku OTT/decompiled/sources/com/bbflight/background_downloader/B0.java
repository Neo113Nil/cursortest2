package com.bbflight.background_downloader;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class B0 {
    public static final B0 a;
    public static final B0 b;
    public static final /* synthetic */ B0[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        B0 b0 = new B0("asSetByTask", 0);
        a = b0;
        B0 b02 = new B0("forAllTasks", 1);
        b = b02;
        B0[] b0Arr = {b0, b02, new B0("forNoTasks", 2)};
        c = b0Arr;
        d = EnumEntriesKt.enumEntries(b0Arr);
    }

    public B0() {
        throw null;
    }

    public static B0 valueOf(String str) {
        return (B0) Enum.valueOf(B0.class, str);
    }

    public static B0[] values() {
        return (B0[]) c.clone();
    }
}
