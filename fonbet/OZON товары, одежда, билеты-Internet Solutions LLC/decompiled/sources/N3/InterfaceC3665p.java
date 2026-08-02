package N3;

import com.google.common.collect.AbstractC5880y;
import java.io.IOException;
import java.util.List;

/* renamed from: N3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3665p {
    void a(long j11, long j12);

    void b(r rVar);

    default InterfaceC3665p c() {
        return this;
    }

    boolean d(q qVar) throws IOException;

    default List<L> e() {
        return AbstractC5880y.v();
    }

    int f(q qVar, G g10) throws IOException;

    void release();
}
