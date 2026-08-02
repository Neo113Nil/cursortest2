package F3;

import java.io.IOException;
import t3.C9730B;

/* loaded from: classes.dex */
public interface U {
    boolean isReady();

    void maybeThrowError() throws IOException;

    int readData(C9730B c9730b, s3.f fVar, int i11);

    int skipData(long j11);
}
