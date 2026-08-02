package i0;

import android.graphics.PathMeasure;
import n.AbstractC2107A;

/* renamed from: i0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2004i {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f17282a;

    public C2004i(PathMeasure pathMeasure) {
        this.f17282a = pathMeasure;
    }

    public final void a(float f, float f5, C2003h c2003h) {
        if (!AbstractC2107A.A(c2003h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f17282a.getSegment(f, f5, c2003h.f17279a, true);
    }
}
