package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class F2 {

    /* renamed from: a, reason: collision with root package name */
    public String f6546a;
    public String b;
    public long c;
    public int d;

    public F2(String eventType, String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f6546a = eventType;
        this.b = str;
        this.c = System.currentTimeMillis();
    }
}
