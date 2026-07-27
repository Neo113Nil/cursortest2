package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.qc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4019qc {

    /* renamed from: a, reason: collision with root package name */
    public final String f7325a;
    public final long b;
    public final int c;
    public final long d;
    public final boolean e;
    public final int f;

    public C4019qc(String fileName, long j, int i, long j2, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f7325a = fileName;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = z;
        this.f = i2;
    }

    public /* synthetic */ C4019qc(String str, long j, int i, long j2, boolean z, int i2, int i3) {
        this(str, j, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? 0 : i2);
    }
}
