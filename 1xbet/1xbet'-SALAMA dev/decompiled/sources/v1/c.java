package v1;

import java.util.HashMap;
import p145u1.j;
import p155w1.C1013m0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f17079b;

    public /* synthetic */ c(int i7, HashMap map) {
        this.f17078a = i7;
        this.f17079b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17078a) {
            case 0:
                j.f16707b.c(this.f17079b);
                break;
            case 1:
                C1013m0.f17797c.c(this.f17079b);
                break;
            case 2:
                C1013m0.f17797c.c(this.f17079b);
                break;
            default:
                d.f17080a.c(this.f17079b);
                break;
        }
    }
}
