package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class yc {
    public static final a c;
    public static final yc d = new yc("OPEN", 0, "open");
    public static final yc e = new yc("SET_ORIENTATION_PROPERTIES", 1, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.h);
    public static final yc f = new yc("UNLOAD", 2, "unload");
    public static final /* synthetic */ yc[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final yc a(String stringValue) {
            Intrinsics.checkNotNullParameter(stringValue, "stringValue");
            yc ycVar = yc.d;
            if (Intrinsics.areEqual(stringValue, ycVar.b())) {
                return ycVar;
            }
            yc ycVar2 = yc.e;
            if (Intrinsics.areEqual(stringValue, ycVar2.b())) {
                return ycVar2;
            }
            yc ycVar3 = yc.f;
            if (Intrinsics.areEqual(stringValue, ycVar3.b())) {
                return ycVar3;
            }
            throw new IllegalArgumentException("Not a valid MraidJSToNativeCommand.");
        }

        public a() {
        }
    }

    static {
        yc[] a2 = a();
        g = a2;
        h = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public yc(String str, int i, String str2) {
        this.b = str2;
    }

    public static final /* synthetic */ yc[] a() {
        return new yc[]{d, e, f};
    }

    public static yc valueOf(String str) {
        return (yc) Enum.valueOf(yc.class, str);
    }

    public static yc[] values() {
        return (yc[]) g.clone();
    }

    public final String b() {
        return this.b;
    }
}
