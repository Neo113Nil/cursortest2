package w1;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: w1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1693f extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17702c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Throwable f17703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HashMap f17704e;

    public C1693f(String str, long j, String str2, Throwable th, HashMap hashMap) {
        this.f17700a = str;
        this.f17701b = j;
        this.f17702c = str2;
        this.f17703d = th;
        this.f17704e = hashMap;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        HashMap b7 = AbstractC1707i1.b();
        C1745t c1745t = H2.a().f17402f;
        String str = this.f17700a;
        long j = this.f17701b;
        String str2 = this.f17702c;
        String name = this.f17703d.getClass().getName();
        Throwable th = this.f17703d;
        HashMap hashMap = this.f17704e;
        c1745t.getClass();
        c1745t.h(new C1742s(str, j, str2, name, th, b7, hashMap, Collections.emptyList()));
        if (this.f17704e.isEmpty()) {
            synchronized (AbstractC1706i0.class) {
            }
        }
    }
}
