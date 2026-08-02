package com.google.android.gms.internal.ads;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.google.android.gms.internal.ads.fr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0995fr {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f13508a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    public final Ik f13509b;

    /* renamed from: c, reason: collision with root package name */
    public final C0606Hd f13510c;

    public C0995fr(Ik ik, C0606Hd c0606Hd) {
        this.f13509b = ik;
        this.f13510c = c0606Hd;
    }

    public final synchronized E3.a a() {
        b(1);
        return (E3.a) this.f13508a.poll();
    }

    public final synchronized void b(int i) {
        int size = i - this.f13508a.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f13508a.add(this.f13510c.d(this.f13509b));
        }
    }
}
