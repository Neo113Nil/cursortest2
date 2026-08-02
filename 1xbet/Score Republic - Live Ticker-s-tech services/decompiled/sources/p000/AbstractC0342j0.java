package p000;

import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: renamed from: j0 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0342j0 {
    protected int memoizedHashCode;

    /* JADX INFO: renamed from: a */
    public abstract int mo2754a(r51 r51Var);

    /* JADX INFO: renamed from: b */
    public final byte[] m2755b() {
        try {
            int iMo2754a = ((s70) this).mo2754a(null);
            byte[] bArr = new byte[iMo2754a];
            Logger logger = AbstractC0397ki.f4383b;
            C0250gi c0250gi = new C0250gi(bArr, 0, iMo2754a);
            mo2756c(c0250gi);
            if (c0250gi.m2057B() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo2756c(AbstractC0397ki abstractC0397ki);
}
