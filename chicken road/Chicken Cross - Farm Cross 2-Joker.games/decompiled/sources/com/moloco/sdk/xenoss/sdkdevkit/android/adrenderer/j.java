package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f11577a = new j("VAST", 0);
    public static final j b = new j("MRAID", 1);
    public static final j c = new j("STATIC", 2);
    public static final j d = new j("TEMPLATE_VAST", 3);
    public static final j e = new j("TEMPLATE_MRAID", 4);
    public static final j f = new j("TEMPLATE_STATIC", 5);
    public static final j g = new j("UNKNOWN", 6);
    public static final /* synthetic */ j[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        j[] a2 = a();
        h = a2;
        i = EnumEntriesKt.enumEntries(a2);
    }

    public j(String str, int i2) {
    }

    public static final /* synthetic */ j[] a() {
        return new j[]{f11577a, b, c, d, e, f, g};
    }

    public static EnumEntries<j> b() {
        return i;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) h.clone();
    }
}
