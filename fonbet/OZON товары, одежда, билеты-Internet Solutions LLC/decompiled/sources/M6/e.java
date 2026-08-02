package M6;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public abstract class e implements c {
    @Override // M6.c
    public final synchronized L6.d a() throws IOException {
        return new L6.e(b());
    }

    protected abstract InputStream b() throws IOException;
}
