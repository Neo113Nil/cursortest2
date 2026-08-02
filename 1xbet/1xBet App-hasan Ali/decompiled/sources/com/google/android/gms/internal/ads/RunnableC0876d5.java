package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.d5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0876d5 implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13096k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0965f5 f13097l;

    public /* synthetic */ RunnableC0876d5(C0965f5 c0965f5, int i) {
        this.f13096k = i;
        this.f13097l = c0965f5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13096k) {
            case 0:
                C0965f5 c0965f5 = this.f13097l;
                try {
                    if (c0965f5.f == null && c0965f5.i) {
                        N2.b bVar = new N2.b(c0965f5.f13438a, 30000L, false);
                        bVar.d(true);
                        c0965f5.f = bVar;
                        break;
                    }
                } catch (j3.g | IOException unused) {
                    c0965f5.f = null;
                    return;
                }
                break;
            default:
                F7.a(this.f13097l.f13438a);
                break;
        }
    }
}
