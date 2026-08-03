package com.inmobi.media;

/* renamed from: com.inmobi.media.yb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2904yb {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5568a;
    public final long b;
    public final int c;
    public final long d;
    public final boolean e;
    public final int f;

    public C2904yb(java.lang.String fileName, long j, int i, long j2, boolean z, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f5568a = fileName;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = z;
        this.f = i2;
    }

    public /* synthetic */ C2904yb(java.lang.String str, long j, int i, long j2, boolean z, int i2, int i3) {
        this(str, j, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? 0 : i2);
    }
}
