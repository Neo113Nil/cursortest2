package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class y0 {
    public static final a c;
    public static final y0 d = new y0("TOP_LEFT", 0, 0);
    public static final y0 e = new y0("TOP_RIGHT", 1, 1);
    public static final y0 f = new y0("BOTTOM_LEFT", 2, 2);
    public static final y0 g = new y0("BOTTOM_RIGHT", 3, 3);
    public static final /* synthetic */ y0[] h;
    public static final /* synthetic */ EnumEntries i;
    public final int b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        y0[] a2 = a();
        h = a2;
        i = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public y0(String str, int i2, int i3) {
        this.b = i3;
    }

    public static final /* synthetic */ y0[] a() {
        return new y0[]{d, e, f, g};
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) h.clone();
    }
}
