package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class w0 implements java.lang.Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.protobuf.e1 f4223a;
    public final int b;
    public final com.fyber.inneractive.sdk.protobuf.j4 c;
    public final boolean d;
    public final boolean e;

    public w0(com.fyber.inneractive.sdk.protobuf.e1 e1Var, int i, com.fyber.inneractive.sdk.protobuf.j4 j4Var, boolean z, boolean z2) {
        this.f4223a = e1Var;
        this.b = i;
        this.c = j4Var;
        this.d = z;
        this.e = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.b - ((com.fyber.inneractive.sdk.protobuf.w0) obj).b;
    }
}
