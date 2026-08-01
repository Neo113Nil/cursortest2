package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class y8 {
    public static final y8 c = new y8("REQUEST_SUCCESS_START", 0, 200);
    public static final y8 d = new y8("REQUEST_SUCCESS_END", 1, 299);
    public static final y8 e = new y8("REDIRECTION_START", 2, 300);
    public static final y8 f = new y8("REDIRECTION_END", 3, 399);
    public static final /* synthetic */ y8[] g;
    public static final /* synthetic */ EnumEntries h;
    public final int b;

    static {
        y8[] a2 = a();
        g = a2;
        h = EnumEntriesKt.enumEntries(a2);
    }

    public y8(String str, int i, int i2) {
        this.b = i2;
    }

    public static final /* synthetic */ y8[] a() {
        return new y8[]{c, d, e, f};
    }

    public static y8 valueOf(String str) {
        return (y8) Enum.valueOf(y8.class, str);
    }

    public static y8[] values() {
        return (y8[]) g.clone();
    }

    public final int b() {
        return this.b;
    }
}
