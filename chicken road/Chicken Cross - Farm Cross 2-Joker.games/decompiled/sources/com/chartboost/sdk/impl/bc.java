package com.chartboost.sdk.impl;

import com.facebook.share.internal.ShareConstants;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class bc {
    public static final bc c = new bc("UNKNOWN", 0, 0);
    public static final bc d = new bc("HTML", 1, 1);
    public static final bc e = new bc(ShareConstants.VIDEO_URL, 2, 2);
    public static final bc f = new bc("AUDIO", 3, 3);
    public static final bc g = new bc("NATIVE", 4, 4);
    public static final /* synthetic */ bc[] h;
    public static final /* synthetic */ EnumEntries i;
    public final int b;

    static {
        bc[] a2 = a();
        h = a2;
        i = EnumEntriesKt.enumEntries(a2);
    }

    public bc(String str, int i2, int i3) {
        this.b = i3;
    }

    public static final /* synthetic */ bc[] a() {
        return new bc[]{c, d, e, f, g};
    }

    public static EnumEntries b() {
        return i;
    }

    public static bc valueOf(String str) {
        return (bc) Enum.valueOf(bc.class, str);
    }

    public static bc[] values() {
        return (bc[]) h.clone();
    }

    public final int c() {
        return this.b;
    }
}
