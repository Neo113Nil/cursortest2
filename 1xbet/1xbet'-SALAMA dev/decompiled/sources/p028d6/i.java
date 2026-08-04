package p028d6;

import U5.EnumC0446m;
import U5.L;
import W5.C0536r1;
import W5.D0;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f12436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f12437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0536r1 f12438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EnumC0446m f12439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public L f12440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12441f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f12442g;

    public i(x xVar, j jVar, C0536r1 c0536r1, D0 d7) {
        this.f12442g = xVar;
        this.f12436a = jVar;
        this.f12438c = c0536r1;
        this.f12440e = d7;
        e eVar = new e(new h(this, 1));
        this.f12437b = eVar;
        this.f12439d = EnumC0446m.f6550a;
        eVar.i(c0536r1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address = ");
        sb.append(this.f12436a);
        sb.append(", state = ");
        sb.append(this.f12439d);
        sb.append(", picker type: ");
        sb.append(this.f12440e.getClass());
        sb.append(", lb: ");
        sb.append(this.f12437b.g().getClass());
        sb.append(this.f12441f ? ", deactivated" : "");
        return sb.toString();
    }
}
