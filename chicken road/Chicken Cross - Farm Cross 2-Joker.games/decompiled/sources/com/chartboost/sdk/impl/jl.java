package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class jl {
    public static final jl b = new jl("MRAID_OPEN", 0);
    public static final jl c = new jl("WEBVIEW_CLICK", 1);
    public static final /* synthetic */ jl[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        jl[] a2 = a();
        d = a2;
        e = EnumEntriesKt.enumEntries(a2);
    }

    public jl(String str, int i) {
    }

    public static final /* synthetic */ jl[] a() {
        return new jl[]{b, c};
    }

    public static jl valueOf(String str) {
        return (jl) Enum.valueOf(jl.class, str);
    }

    public static jl[] values() {
        return (jl[]) d.clone();
    }
}
