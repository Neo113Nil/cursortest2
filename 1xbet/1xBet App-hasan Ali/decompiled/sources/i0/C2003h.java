package i0;

import android.graphics.Path;
import android.graphics.RectF;
import h0.C1989c;

/* renamed from: i0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2003h {

    /* renamed from: a, reason: collision with root package name */
    public final Path f17279a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f17280b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f17281c;

    public C2003h(Path path) {
        this.f17279a = path;
    }

    public final C1989c a() {
        if (this.f17280b == null) {
            this.f17280b = new RectF();
        }
        RectF rectF = this.f17280b;
        kotlin.jvm.internal.l.c(rectF);
        this.f17279a.computeBounds(rectF, true);
        return new C1989c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean b(C2003h c2003h, C2003h c2003h2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(c2003h instanceof C2003h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c2003h.f17279a;
        if (c2003h2 instanceof C2003h) {
            return this.f17279a.op(path, c2003h2.f17279a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void c() {
        this.f17279a.reset();
    }
}
