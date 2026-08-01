package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i4 {
    public static final a c;
    public static final i4 d = new i4("CLICK_PREFERENCE_EMBEDDED", 0, 0);
    public static final i4 e = new i4("CLICK_PREFERENCE_NATIVE", 1, 1);
    public static final /* synthetic */ i4[] f;
    public static final /* synthetic */ EnumEntries g;
    public final int b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i4 a(int i) {
            return i != 0 ? i != 1 ? i4.d : i4.e : i4.d;
        }

        public a() {
        }
    }

    static {
        i4[] a2 = a();
        f = a2;
        g = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public i4(String str, int i, int i2) {
        this.b = i2;
    }

    public static final /* synthetic */ i4[] a() {
        return new i4[]{d, e};
    }

    public static i4 valueOf(String str) {
        return (i4) Enum.valueOf(i4.class, str);
    }

    public static i4[] values() {
        return (i4[]) f.clone();
    }

    public final int b() {
        return this.b;
    }
}
