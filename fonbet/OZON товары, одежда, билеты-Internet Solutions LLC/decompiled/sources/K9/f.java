package K9;

import I9.h;
import I9.j;
import androidx.recyclerview.widget.m;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private h f15396a;

    /* renamed from: b, reason: collision with root package name */
    private I9.f f15397b;

    /* renamed from: c, reason: collision with root package name */
    private j f15398c;

    /* renamed from: d, reason: collision with root package name */
    private int f15399d = -1;

    /* renamed from: e, reason: collision with root package name */
    private b f15400e;

    public final b a() {
        return this.f15400e;
    }

    public final void b(I9.f fVar) {
        this.f15397b = fVar;
    }

    public final void c(int i11) {
        this.f15399d = i11;
    }

    public final void d(b bVar) {
        this.f15400e = bVar;
    }

    public final void e(h hVar) {
        this.f15396a = hVar;
    }

    public final void f(j jVar) {
        this.f15398c = jVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        sb2.append("<<\n mode: ");
        sb2.append(this.f15396a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f15397b);
        sb2.append("\n version: ");
        sb2.append(this.f15398c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f15399d);
        if (this.f15400e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f15400e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
