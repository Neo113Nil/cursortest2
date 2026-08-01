package com.inmobi.media;

import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.s3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4066s3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7366a;
    public final String b;
    public final Map c;
    public final boolean d;
    public final boolean e;
    public int f;
    public long g;
    public final long h;

    public C4066s3(int i, String url, Map map, boolean z, boolean z2, int i2, long j, long j2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f7366a = i;
        this.b = url;
        this.c = map;
        this.d = z;
        this.e = z2;
        this.f = i2;
        this.g = j;
        this.h = j2;
    }

    public /* synthetic */ C4066s3(String str, boolean z, boolean z2, int i, int i2) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, null, z, z2, i, System.currentTimeMillis(), System.currentTimeMillis());
    }
}
