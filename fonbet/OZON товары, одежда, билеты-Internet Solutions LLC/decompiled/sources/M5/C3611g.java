package M5;

import N5.c;
import android.graphics.Color;
import java.io.IOException;

/* renamed from: M5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3611g implements M<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final C3611g f17414a = new C3611g();

    @Override // M5.M
    public final Integer a(N5.c cVar, float f7) throws IOException {
        boolean z11 = cVar.m() == c.b.BEGIN_ARRAY;
        if (z11) {
            cVar.beginArray();
        }
        double nextDouble = cVar.nextDouble();
        double nextDouble2 = cVar.nextDouble();
        double nextDouble3 = cVar.nextDouble();
        double nextDouble4 = cVar.m() == c.b.NUMBER ? cVar.nextDouble() : 1.0d;
        if (z11) {
            cVar.endArray();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            if (nextDouble4 <= 1.0d) {
                nextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) nextDouble4, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }
}
