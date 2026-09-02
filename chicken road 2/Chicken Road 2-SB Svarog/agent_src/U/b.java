package U;

import P.l;
import P.m;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends m {

    /* renamed from: d, reason: collision with root package name */
    public static final b f383d = new b();

    @Override // P.m
    public final Serializable f(byte b2, ByteBuffer byteBuffer) {
        if (b2 != -127) {
            return super.f(b2, byteBuffer);
        }
        Object e2 = e(byteBuffer);
        if (e2 == null) {
            return null;
        }
        return c.values()[((Long) e2).intValue()];
    }

    @Override // P.m
    public final void k(l lVar, Object obj) {
        if (!(obj instanceof c)) {
            super.k(lVar, obj);
        } else {
            lVar.write(129);
            k(lVar, obj == null ? null : Integer.valueOf(((c) obj).f385b));
        }
    }
}
