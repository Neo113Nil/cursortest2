package com.fyber.inneractive.sdk.player.cache;

import java.io.File;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f5523a;
    public final long[] b;
    public boolean c;
    public d d;
    public final /* synthetic */ g e;

    public e(g gVar, String str) {
        this.e = gVar;
        this.f5523a = str;
        this.b = new long[gVar.g];
    }

    public final File a(int i) {
        return new File(this.e.f5524a, this.f5523a + "." + i);
    }

    public final File b(int i) {
        return new File(this.e.f5524a, this.f5523a + "." + i + ".tmp");
    }
}
