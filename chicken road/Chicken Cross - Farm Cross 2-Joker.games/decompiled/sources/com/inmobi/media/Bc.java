package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class Bc {
    public static final Ac a(String logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        return StringsKt.equals(logLevel, "DEBUG", true) ? Ac.b : StringsKt.equals(logLevel, "ERROR", true) ? Ac.c : StringsKt.equals(logLevel, "INFO", true) ? Ac.f6454a : StringsKt.equals(logLevel, "STATE", true) ? Ac.d : Ac.c;
    }
}
