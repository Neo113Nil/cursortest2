package M5;

import N5.c;
import java.io.IOException;

/* loaded from: classes.dex */
public final class F implements M<P5.d> {

    /* renamed from: a, reason: collision with root package name */
    public static final F f17397a = new F();

    @Override // M5.M
    public final P5.d a(N5.c cVar, float f7) throws IOException {
        boolean z11 = cVar.m() == c.b.BEGIN_ARRAY;
        if (z11) {
            cVar.beginArray();
        }
        float nextDouble = (float) cVar.nextDouble();
        float nextDouble2 = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        if (z11) {
            cVar.endArray();
        }
        return new P5.d((nextDouble / 100.0f) * f7, (nextDouble2 / 100.0f) * f7);
    }
}
