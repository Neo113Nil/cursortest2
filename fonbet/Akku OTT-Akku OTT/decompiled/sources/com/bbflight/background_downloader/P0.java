package com.bbflight.background_downloader;

import kotlin.jvm.internal.Intrinsics;

@kotlinx.serialization.i(with = R0.class)
/* loaded from: classes3.dex */
public final class P0 {
    public static final a Companion = new a();
    public final W a;
    public final int b;
    public final String c;

    public static final class a {
        public final kotlinx.serialization.b<P0> serializer() {
            return R0.a;
        }
    }

    public P0(W type, int i, String description) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.a = type;
        this.b = i;
        this.c = description;
    }

    public /* synthetic */ P0(W w, String str, int i) {
        this(w, -1, (i & 4) != 0 ? "" : str);
    }
}
