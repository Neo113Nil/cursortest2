package z;

import A.b;
import A.h;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0864a implements h {

    /* renamed from: b, reason: collision with root package name */
    public final Object f6798b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6799c;

    public C0864a() {
        this.f6798b = new ReentrantLock();
        this.f6799c = new LinkedHashMap();
    }

    public C0864a(b bVar) {
        C0864a c0864a = new C0864a();
        this.f6798b = bVar;
        this.f6799c = c0864a;
    }
}
