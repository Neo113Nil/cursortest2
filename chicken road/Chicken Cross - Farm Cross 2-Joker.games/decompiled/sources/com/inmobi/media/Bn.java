package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Bn {

    /* renamed from: a, reason: collision with root package name */
    public final int f6482a;
    public final int b;
    public final String c;
    public final int d;

    public Bn(int i, int i2, String mediaUrl, String delivery, String type, int i3) {
        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f6482a = i;
        this.b = i2;
        this.c = mediaUrl;
        this.d = i3;
    }
}
