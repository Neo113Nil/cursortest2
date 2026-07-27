package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zb {
    public static final a c;
    public static final zb d = new zb("LEGACY", 0, "download");
    public static final zb e = new zb("PROBE", 1, "probe");
    public static final /* synthetic */ zb[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zb a(int i) {
            return i == 1 ? zb.e : zb.d;
        }

        public a() {
        }
    }

    static {
        zb[] a2 = a();
        f = a2;
        g = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public zb(String str, int i, String str2) {
        this.b = str2;
    }

    public static final /* synthetic */ zb[] a() {
        return new zb[]{d, e};
    }

    public static zb valueOf(String str) {
        return (zb) Enum.valueOf(zb.class, str);
    }

    public static zb[] values() {
        return (zb[]) f.clone();
    }

    public final String b() {
        return this.b;
    }
}
