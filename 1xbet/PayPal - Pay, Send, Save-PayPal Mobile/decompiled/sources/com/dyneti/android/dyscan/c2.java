package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f3295a;
    public final com.dyneti.android.dyscan.y b;
    public final com.dyneti.android.dyscan.p0 c;
    public final java.nio.ByteBuffer d;
    public final java.util.ArrayList e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public boolean i = false;
    public java.lang.String j = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP;
    public final java.lang.Boolean k;
    public final android.graphics.Bitmap l;

    public c2(java.util.ArrayList arrayList, com.dyneti.android.dyscan.y yVar, com.dyneti.android.dyscan.p0 p0Var, java.util.ArrayList arrayList2, boolean z, boolean z2, boolean z3, java.nio.ByteBuffer byteBuffer, android.graphics.Bitmap bitmap, boolean z4, boolean z5) {
        this.f3295a = arrayList;
        this.b = yVar;
        this.c = p0Var;
        this.e = arrayList2;
        this.f = z || z4;
        this.g = z2;
        this.h = z3;
        this.d = byteBuffer;
        this.k = java.lang.Boolean.valueOf(z5);
        this.l = bitmap;
    }
}
