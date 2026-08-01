package com.inmobi.media;

import java.io.File;

/* renamed from: com.inmobi.media.f6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3701f6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7100a;
    public final long[] b;
    public boolean c;
    public C3672e6 d;
    public final /* synthetic */ C3786i6 e;

    public C3701f6(C3786i6 c3786i6, String str) {
        this.e = c3786i6;
        this.f7100a = str;
        this.b = new long[c3786i6.h];
    }

    public final File a(int i) {
        return new File(this.e.b, this.f7100a + "." + i);
    }

    public final File b(int i) {
        return new File(this.e.b, this.f7100a + "." + i + ".tmp");
    }
}
