package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class s6 {
    public static final a c;
    public static final s6 d = new s6("NONE", 0, 0);
    public static final s6 e = new s6("STOPPED_QUEUE", 1, 1);
    public static final s6 f = new s6("MAX_COUNT_TIME_WINDOW", 2, 2);
    public static final s6 g = new s6("FORCED_OUT", 3, 3);
    public static final /* synthetic */ s6[] h;
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
        s6[] a2 = a();
        h = a2;
        i = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public s6(String str, int i2, int i3) {
        this.b = i3;
    }

    public static final /* synthetic */ s6[] a() {
        return new s6[]{d, e, f, g};
    }

    public static s6 valueOf(String str) {
        return (s6) Enum.valueOf(s6.class, str);
    }

    public static s6[] values() {
        return (s6[]) h.clone();
    }

    public final int b() {
        return this.b;
    }
}
