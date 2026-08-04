package p155w1;

import java.util.HashMap;
import p145u1.h;

/* JADX INFO: renamed from: w1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0968b extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f17647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f17648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f17650d;

    public C0968b(h hVar, HashMap map, long j, long j3) {
        this.f17647a = hVar;
        this.f17648b = map;
        this.f17649c = j;
        this.f17650d = j3;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        Y1.c(this.f17647a.f16704a, 5, this.f17648b, false, false, null, this.f17649c, this.f17650d);
        if (this.f17648b.isEmpty()) {
            synchronized (AbstractC0997i0.class) {
            }
        }
    }
}
