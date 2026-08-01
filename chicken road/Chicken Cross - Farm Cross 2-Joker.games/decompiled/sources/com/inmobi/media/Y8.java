package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Y8 {

    /* renamed from: a, reason: collision with root package name */
    public static final Y8 f6968a;
    public static final Y8 b;
    public static final Y8 c;
    public static final Y8 d;
    public static final Y8 e;
    public static final Y8 f;
    public static final Y8 g;
    public static final Y8 h;
    public static final Y8 i;
    public static final /* synthetic */ Y8[] j;

    static {
        Y8 y8 = new Y8("INIT", 0);
        f6968a = y8;
        Y8 y82 = new Y8("LOADING", 1);
        b = y82;
        Y8 y83 = new Y8("LOADED", 2);
        c = y83;
        Y8 y84 = new Y8("LOAD_FAILED", 3);
        d = y84;
        Y8 y85 = new Y8("PLAYING", 4);
        e = y85;
        Y8 y86 = new Y8("PAUSED", 5);
        f = y86;
        Y8 y87 = new Y8("COMPLETED", 6);
        g = y87;
        Y8 y88 = new Y8("ERROR", 7);
        h = y88;
        Y8 y89 = new Y8("DESTROYED", 8);
        i = y89;
        Y8[] y8Arr = {y8, y82, y83, y84, y85, y86, y87, y88, y89};
        j = y8Arr;
        EnumEntriesKt.enumEntries(y8Arr);
    }

    public Y8(String str, int i2) {
    }

    public static Y8 valueOf(String str) {
        return (Y8) Enum.valueOf(Y8.class, str);
    }

    public static Y8[] values() {
        return (Y8[]) j.clone();
    }
}
