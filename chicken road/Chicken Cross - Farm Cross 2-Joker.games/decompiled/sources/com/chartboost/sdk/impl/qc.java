package com.chartboost.sdk.impl;

import com.ironsource.U3;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class qc {
    public static final qc c = new qc("LANDSCAPE", 0, U3.i.C);
    public static final qc d = new qc("PORTRAIT", 1, U3.i.D);
    public static final qc e = new qc("NONE", 2, "");
    public static final /* synthetic */ qc[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String b;

    static {
        qc[] a2 = a();
        f = a2;
        g = EnumEntriesKt.enumEntries(a2);
    }

    public qc(String str, int i, String str2) {
        this.b = str2;
    }

    public static final /* synthetic */ qc[] a() {
        return new qc[]{c, d, e};
    }

    public static qc valueOf(String str) {
        return (qc) Enum.valueOf(qc.class, str);
    }

    public static qc[] values() {
        return (qc[]) f.clone();
    }

    public final String b() {
        return this.b;
    }
}
