package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Bg {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.Bg f4624a;
    public static final com.inmobi.media.Bg b;
    public static final com.inmobi.media.Bg c;
    public static final com.inmobi.media.Bg d;
    public static final com.inmobi.media.Bg e;
    public static final com.inmobi.media.Bg f;
    public static final com.inmobi.media.Bg g;
    public static final com.inmobi.media.Bg h;
    public static final /* synthetic */ com.inmobi.media.Bg[] i;

    static {
        com.inmobi.media.Bg bg = new com.inmobi.media.Bg("STATE_INITIALIZED", 0);
        f4624a = bg;
        com.inmobi.media.Bg bg2 = new com.inmobi.media.Bg("STATE_PREPARING", 1);
        b = bg2;
        com.inmobi.media.Bg bg3 = new com.inmobi.media.Bg("STATE_PREPARED", 2);
        c = bg3;
        com.inmobi.media.Bg bg4 = new com.inmobi.media.Bg("STATE_PLAYING", 3);
        d = bg4;
        com.inmobi.media.Bg bg5 = new com.inmobi.media.Bg("STATE_PAUSED", 4);
        e = bg5;
        com.inmobi.media.Bg bg6 = new com.inmobi.media.Bg("STATE_PLAYBACK_COMPLETED", 5);
        f = bg6;
        com.inmobi.media.Bg bg7 = new com.inmobi.media.Bg("STATE_ERROR", 6);
        g = bg7;
        com.inmobi.media.Bg bg8 = new com.inmobi.media.Bg("STATE_DESTROYED", 7);
        h = bg8;
        com.inmobi.media.Bg[] bgArr = {bg, bg2, bg3, bg4, bg5, bg6, bg7, bg8};
        i = bgArr;
        kotlin.enums.EnumEntriesKt.enumEntries(bgArr);
    }

    public Bg(java.lang.String str, int i2) {
    }

    public static com.inmobi.media.Bg valueOf(java.lang.String str) {
        return (com.inmobi.media.Bg) java.lang.Enum.valueOf(com.inmobi.media.Bg.class, str);
    }

    public static com.inmobi.media.Bg[] values() {
        return (com.inmobi.media.Bg[]) i.clone();
    }
}
