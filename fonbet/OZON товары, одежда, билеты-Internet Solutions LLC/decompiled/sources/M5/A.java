package M5;

import N5.c;
import android.graphics.PointF;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class A implements M<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final A f17392a = new A();

    @Override // M5.M
    public final PointF a(N5.c cVar, float f7) throws IOException {
        c.b m11 = cVar.m();
        if (m11 != c.b.BEGIN_ARRAY && m11 != c.b.BEGIN_OBJECT) {
            if (m11 != c.b.NUMBER) {
                throw new IllegalArgumentException("Cannot convert json to point. Next token is " + m11);
            }
            PointF pointF = new PointF(((float) cVar.nextDouble()) * f7, ((float) cVar.nextDouble()) * f7);
            while (cVar.hasNext()) {
                cVar.skipValue();
            }
            return pointF;
        }
        return s.b(cVar, f7);
    }
}
