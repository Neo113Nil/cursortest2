package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class k9 {
    public static final a c;
    public static final k9 d = new k9("NONE", 0, 0);
    public static final k9 e = new k9("TOP", 1, 1);
    public static final k9 f = new k9("LEFT", 2, 2);
    public static final k9 g = new k9("BOTTOM", 3, 4);
    public static final k9 h = new k9("RIGHT", 4, 8);
    public static final k9 i = new k9("ALL", 5, 15);
    public static final /* synthetic */ k9[] j;
    public static final /* synthetic */ EnumEntries k;
    public final int b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i) {
            return (i & k9.g.b()) != 0;
        }

        public final boolean b(int i) {
            return (i & k9.f.b()) != 0;
        }

        public final boolean c(int i) {
            return (i & k9.h.b()) != 0;
        }

        public final boolean d(int i) {
            return (i & k9.e.b()) != 0;
        }

        public a() {
        }
    }

    static {
        k9[] a2 = a();
        j = a2;
        k = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public k9(String str, int i2, int i3) {
        this.b = i3;
    }

    public static final /* synthetic */ k9[] a() {
        return new k9[]{d, e, f, g, h, i};
    }

    public static k9 valueOf(String str) {
        return (k9) Enum.valueOf(k9.class, str);
    }

    public static k9[] values() {
        return (k9[]) j.clone();
    }

    public final int b() {
        return this.b;
    }
}
