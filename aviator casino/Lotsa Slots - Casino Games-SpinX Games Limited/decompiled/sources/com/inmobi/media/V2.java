package com.inmobi.media;

/* loaded from: classes5.dex */
public final class V2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5007a;
    public final java.lang.String b;
    public final java.util.Map c;
    public final boolean d;
    public final boolean e;
    public int f;
    public long g;
    public final long h;

    public V2(int i, java.lang.String url, java.util.Map map, boolean z, boolean z2, int i2, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.f5007a = i;
        this.b = url;
        this.c = map;
        this.d = z;
        this.e = z2;
        this.f = i2;
        this.g = j;
        this.h = j2;
    }

    public /* synthetic */ V2(java.lang.String str, boolean z, boolean z2, int i, int i2) {
        this(new java.util.Random().nextInt() & Integer.MAX_VALUE, str, null, z, z2, i, java.lang.System.currentTimeMillis(), java.lang.System.currentTimeMillis());
    }
}
