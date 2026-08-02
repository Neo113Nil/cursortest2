package com.bbflight.background_downloader;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlinx.serialization.i(with = Z0.class)
/* loaded from: classes3.dex */
public final class W0 {
    public static final a Companion;
    public static final Lazy<kotlinx.serialization.b<Object>> a;
    public static final W0 b;
    public static final W0 c;
    public static final W0 d;
    public static final W0 e;
    public static final W0 f;
    public static final W0 i;
    public static final W0 j;
    public static final W0 k;
    public static final /* synthetic */ W0[] l;
    public static final /* synthetic */ EnumEntries m;

    public static final class a {
        public final kotlinx.serialization.b<W0> serializer() {
            return (kotlinx.serialization.b) W0.a.getValue();
        }
    }

    static {
        W0 w0 = new W0("enqueued", 0);
        b = w0;
        W0 w02 = new W0("running", 1);
        c = w02;
        W0 w03 = new W0("complete", 2);
        d = w03;
        W0 w04 = new W0("notFound", 3);
        e = w04;
        W0 w05 = new W0("failed", 4);
        f = w05;
        W0 w06 = new W0("canceled", 5);
        i = w06;
        W0 w07 = new W0("waitingToRetry", 6);
        j = w07;
        W0 w08 = new W0("paused", 7);
        k = w08;
        W0[] w0Arr = {w0, w02, w03, w04, w05, w06, w07, w08};
        l = w0Arr;
        m = EnumEntriesKt.enumEntries(w0Arr);
        Companion = new a();
        a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new V0());
    }

    public W0() {
        throw null;
    }

    public static W0 valueOf(String str) {
        return (W0) Enum.valueOf(W0.class, str);
    }

    public static W0[] values() {
        return (W0[]) l.clone();
    }

    public final boolean a() {
        return !(this == b || this == c || this == j || this == k);
    }
}
