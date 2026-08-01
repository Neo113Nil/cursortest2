package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Kh {

    /* renamed from: a, reason: collision with root package name */
    public static final Kh f6674a;
    public static final Kh b;
    public static final Kh c;
    public static final Kh d;
    public static final Kh e;
    public static final Kh f;
    public static final Kh g;
    public static final Kh h;
    public static final /* synthetic */ Kh[] i;

    static {
        Kh kh = new Kh("STATE_INITIALIZED", 0);
        f6674a = kh;
        Kh kh2 = new Kh("STATE_PREPARING", 1);
        b = kh2;
        Kh kh3 = new Kh("STATE_PREPARED", 2);
        c = kh3;
        Kh kh4 = new Kh("STATE_PLAYING", 3);
        d = kh4;
        Kh kh5 = new Kh("STATE_PAUSED", 4);
        e = kh5;
        Kh kh6 = new Kh("STATE_PLAYBACK_COMPLETED", 5);
        f = kh6;
        Kh kh7 = new Kh("STATE_ERROR", 6);
        g = kh7;
        Kh kh8 = new Kh("STATE_DESTROYED", 7);
        h = kh8;
        Kh[] khArr = {kh, kh2, kh3, kh4, kh5, kh6, kh7, kh8};
        i = khArr;
        EnumEntriesKt.enumEntries(khArr);
    }

    public Kh(String str, int i2) {
    }

    public static Kh valueOf(String str) {
        return (Kh) Enum.valueOf(Kh.class, str);
    }

    public static Kh[] values() {
        return (Kh[]) i.clone();
    }
}
