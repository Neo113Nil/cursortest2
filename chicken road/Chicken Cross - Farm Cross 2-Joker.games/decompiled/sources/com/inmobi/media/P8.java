package com.inmobi.media;

import com.ironsource.U3;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class P8 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ P8[] f6778a;

    static {
        P8[] p8Arr = {new P8("LOADING", 0, "loading"), new P8("PLAYING", 1, U3.i.f0), new P8("PAUSED", 2, U3.i.e0), new P8("STOPPED", 3, U3.i.h0), new P8("FAILED", 4, U3.i.t), new P8("READY", 5, U3.i.s)};
        f6778a = p8Arr;
        EnumEntriesKt.enumEntries(p8Arr);
    }

    public P8(String str, int i, String str2) {
    }

    public static P8 valueOf(String str) {
        return (P8) Enum.valueOf(P8.class, str);
    }

    public static P8[] values() {
        return (P8[]) f6778a.clone();
    }
}
