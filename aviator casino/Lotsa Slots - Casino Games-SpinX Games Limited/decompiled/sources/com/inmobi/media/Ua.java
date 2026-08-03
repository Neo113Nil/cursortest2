package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Ua {
    public static final com.inmobi.media.Ua d;
    public static final com.inmobi.media.Ua e;
    public static final com.inmobi.media.Ua f;
    public static final com.inmobi.media.Ua g;
    public static final com.inmobi.media.Ua h;
    public static final com.inmobi.media.Ua i;
    public static final com.inmobi.media.Ua j;
    public static final /* synthetic */ com.inmobi.media.Ua[] k;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4993a;
    public final java.lang.String b;
    public final int c;

    static {
        com.inmobi.media.Ua ua = new com.inmobi.media.Ua("LPClickStart", 0, "clickStartCalled", "sdk_click_detected", 0);
        d = ua;
        com.inmobi.media.Ua ua2 = new com.inmobi.media.Ua("LPStartFailed", 1, "landingsStartFailed", "valid_click_failed", 1);
        e = ua2;
        com.inmobi.media.Ua ua3 = new com.inmobi.media.Ua("LPStartSuccess", 2, "landingsStartSuccess", "browser_open_success", 2);
        f = ua3;
        com.inmobi.media.Ua ua4 = new com.inmobi.media.Ua("LPBrowserOpenFailed", 3, "browserOpenFailed", "browser_open_failed", 2);
        g = ua4;
        com.inmobi.media.Ua ua5 = new com.inmobi.media.Ua("LPPageStart", 4, "landingsPageStarted", "on_page_started", 3);
        h = ua5;
        com.inmobi.media.Ua ua6 = new com.inmobi.media.Ua("LPCompleteSuccess", 5, "landingsCompleteSuccess", "landing_success", 4);
        i = ua6;
        com.inmobi.media.Ua ua7 = new com.inmobi.media.Ua("LPCompleteFailed", 6, "landingsCompleteFailed", "landing_failed", 4);
        j = ua7;
        com.inmobi.media.Ua[] uaArr = {ua, ua2, ua3, ua4, ua5, ua6, ua7};
        k = uaArr;
        kotlin.enums.EnumEntriesKt.enumEntries(uaArr);
    }

    public Ua(java.lang.String str, int i2, java.lang.String str2, java.lang.String str3, int i3) {
        this.f4993a = str2;
        this.b = str3;
        this.c = i3;
    }

    public static com.inmobi.media.Ua valueOf(java.lang.String str) {
        return (com.inmobi.media.Ua) java.lang.Enum.valueOf(com.inmobi.media.Ua.class, str);
    }

    public static com.inmobi.media.Ua[] values() {
        return (com.inmobi.media.Ua[]) k.clone();
    }
}
