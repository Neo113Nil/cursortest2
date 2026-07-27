package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Mb {
    public static final Mb d;
    public static final Mb e;
    public static final Mb f;
    public static final Mb g;
    public static final Mb h;
    public static final Mb i;
    public static final Mb j;
    public static final /* synthetic */ Mb[] k;

    /* renamed from: a, reason: collision with root package name */
    public final String f6714a;
    public final String b;
    public final int c;

    static {
        Mb mb = new Mb("LPClickStart", 0, "clickStartCalled", "sdk_click_detected", 0);
        d = mb;
        Mb mb2 = new Mb("LPStartFailed", 1, "landingsStartFailed", "valid_click_failed", 1);
        e = mb2;
        Mb mb3 = new Mb("LPStartSuccess", 2, "landingsStartSuccess", "browser_open_success", 2);
        f = mb3;
        Mb mb4 = new Mb("LPBrowserOpenFailed", 3, "browserOpenFailed", "browser_open_failed", 2);
        g = mb4;
        Mb mb5 = new Mb("LPPageStart", 4, "landingsPageStarted", "on_page_started", 3);
        h = mb5;
        Mb mb6 = new Mb("LPCompleteSuccess", 5, "landingsCompleteSuccess", "landing_success", 4);
        i = mb6;
        Mb mb7 = new Mb("LPCompleteFailed", 6, "landingsCompleteFailed", "landing_failed", 4);
        j = mb7;
        Mb[] mbArr = {mb, mb2, mb3, mb4, mb5, mb6, mb7};
        k = mbArr;
        EnumEntriesKt.enumEntries(mbArr);
    }

    public Mb(String str, int i2, String str2, String str3, int i3) {
        this.f6714a = str2;
        this.b = str3;
        this.c = i3;
    }

    public static Mb valueOf(String str) {
        return (Mb) Enum.valueOf(Mb.class, str);
    }

    public static Mb[] values() {
        return (Mb[]) k.clone();
    }
}
