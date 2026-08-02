package F4;

import p3.f;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f2746a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2747b;

    /* renamed from: c, reason: collision with root package name */
    public final b f2748c;

    public c() {
        e eVar = new e();
        eVar.f2752b = 0;
        eVar.f2751a = new byte[1024];
        this.f2746a = eVar;
        this.f2747b = new b(this, 0);
        this.f2748c = new b(this, 1);
    }

    public final f a(int i7) {
        return t.e.b(i7, 2) ? this.f2748c : this.f2747b;
    }
}
