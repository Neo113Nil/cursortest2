package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Jb {
    public static final com.inmobi.media.Ib a(java.lang.String logLevel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        return kotlin.text.StringsKt.equals(logLevel, "DEBUG", true) ? com.inmobi.media.Ib.b : kotlin.text.StringsKt.equals(logLevel, "ERROR", true) ? com.inmobi.media.Ib.c : kotlin.text.StringsKt.equals(logLevel, "INFO", true) ? com.inmobi.media.Ib.f4763a : kotlin.text.StringsKt.equals(logLevel, com.google.ads.mediation.inmobi.InMobiNetworkKeys.STATE, true) ? com.inmobi.media.Ib.d : com.inmobi.media.Ib.c;
    }
}
