package U1;

import C1.C0095a;
import S1.c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p097n3.a {
    public static EventMessage h0(C0095a c0095a) {
        String strO = c0095a.o();
        strO.getClass();
        String strO2 = c0095a.o();
        strO2.getClass();
        return new EventMessage(strO, strO2, c0095a.n(), c0095a.n(), Arrays.copyOfRange((byte[]) c0095a.f1465c, c0095a.f1463a, c0095a.f1464b));
    }

    @Override // p097n3.a
    public final Metadata o(c cVar, ByteBuffer byteBuffer) {
        return new Metadata(h0(new C0095a(byteBuffer.array(), byteBuffer.limit())));
    }
}
