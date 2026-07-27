package com.unity3d.player;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.unity3d.player.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4899c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Set f11782a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;

    public RunnableC4899c(Set set, String str, int i, long j, long j2, int i2, int i3) {
        this.f11782a = set;
        this.b = str;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = i2;
        this.g = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f11782a.iterator();
        while (it.hasNext()) {
            ((IAssetPackManagerDownloadStatusCallback) it.next()).onStatusUpdate(this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }
}
