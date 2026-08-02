package F3;

import I3.O;
import I3.c0;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes.dex */
public abstract class o {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            N3.b bVar = new N3.b(stringWriter);
            bVar.f3788r = 1;
            c0.f2643z.getClass();
            O.d(bVar, this);
            return stringWriter.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}
