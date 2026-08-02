package d6;

import U5.EnumC0446m;
import U5.L;
import W5.C0536r1;
import W5.D0;

/* renamed from: d6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0975i {

    /* renamed from: a, reason: collision with root package name */
    public final C0976j f12430a;

    /* renamed from: b, reason: collision with root package name */
    public final C0971e f12431b;

    /* renamed from: c, reason: collision with root package name */
    public final C0536r1 f12432c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0446m f12433d;

    /* renamed from: e, reason: collision with root package name */
    public L f12434e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12435f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0990x f12436g;

    public C0975i(C0990x c0990x, C0976j c0976j, C0536r1 c0536r1, D0 d02) {
        this.f12436g = c0990x;
        this.f12430a = c0976j;
        this.f12432c = c0536r1;
        this.f12434e = d02;
        C0971e c0971e = new C0971e(new C0974h(this, 1));
        this.f12431b = c0971e;
        this.f12433d = EnumC0446m.f6550a;
        c0971e.i(c0536r1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address = ");
        sb.append(this.f12430a);
        sb.append(", state = ");
        sb.append(this.f12433d);
        sb.append(", picker type: ");
        sb.append(this.f12434e.getClass());
        sb.append(", lb: ");
        sb.append(this.f12431b.g().getClass());
        sb.append(this.f12435f ? ", deactivated" : "");
        return sb.toString();
    }
}
