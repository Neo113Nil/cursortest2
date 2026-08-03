package com.inmobi.media;

/* renamed from: com.inmobi.media.j2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2499j2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5268a;
    public java.lang.String b;
    public long c;
    public int d;

    public AbstractC2499j2(java.lang.String eventType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f5268a = eventType;
        this.b = str;
        this.c = java.lang.System.currentTimeMillis();
    }
}
