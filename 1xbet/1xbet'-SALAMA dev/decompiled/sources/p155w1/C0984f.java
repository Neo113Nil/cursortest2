package p155w1;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: w1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0984f extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Throwable f17709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HashMap f17710e;

    public C0984f(String str, long j, String str2, Throwable th, HashMap map) {
        this.f17706a = str;
        this.f17707b = j;
        this.f17708c = str2;
        this.f17709d = th;
        this.f17710e = map;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() throws Throwable {
        HashMap mapB = AbstractC0998i1.b();
        C1036t c1036t = H2.a().f17408f;
        String str = this.f17706a;
        long j = this.f17707b;
        String str2 = this.f17708c;
        String name = this.f17709d.getClass().getName();
        Throwable th = this.f17709d;
        HashMap map = this.f17710e;
        c1036t.getClass();
        c1036t.h(new C1033s(str, j, str2, name, th, mapB, map, Collections.emptyList()));
        if (this.f17710e.isEmpty()) {
            synchronized (AbstractC0997i0.class) {
            }
        }
    }
}
