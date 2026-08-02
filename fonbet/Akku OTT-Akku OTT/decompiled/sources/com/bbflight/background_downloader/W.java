package com.bbflight.background_downloader;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class W {
    public static final W b;
    public static final W c;
    public static final W d;
    public static final W e;
    public static final W f;
    public static final W i;
    public static final /* synthetic */ W[] j;
    public static final /* synthetic */ EnumEntries k;
    public final String a;

    static {
        W w = new W("general", 0, "TaskException");
        b = w;
        W w2 = new W("fileSystem", 1, "TaskFileSystemException");
        c = w2;
        W w3 = new W("url", 2, "TaskUrlException");
        d = w3;
        W w4 = new W("connection", 3, "TaskConnectionException");
        e = w4;
        W w5 = new W("resume", 4, "TaskResumeException");
        f = w5;
        W w6 = new W("httpResponse", 5, "TaskHttpException");
        i = w6;
        W[] wArr = {w, w2, w3, w4, w5, w6};
        j = wArr;
        k = EnumEntriesKt.enumEntries(wArr);
    }

    public W(String str, int i2, String str2) {
        this.a = str2;
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) j.clone();
    }
}
