package U1;

import C1.C0095a;
import S1.c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public final class a extends AbstractC1464a {
    public static EventMessage h0(C0095a c0095a) {
        String o7 = c0095a.o();
        o7.getClass();
        String o8 = c0095a.o();
        o8.getClass();
        return new EventMessage(o7, o8, c0095a.n(), c0095a.n(), Arrays.copyOfRange((byte[]) c0095a.f1465c, c0095a.f1463a, c0095a.f1464b));
    }

    @Override // n3.AbstractC1464a
    public final Metadata o(c cVar, ByteBuffer byteBuffer) {
        return new Metadata(h0(new C0095a(byteBuffer.array(), byteBuffer.limit())));
    }
}
