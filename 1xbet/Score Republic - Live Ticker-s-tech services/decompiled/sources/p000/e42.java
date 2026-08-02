package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e42 extends InputStream {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1949j = 0;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1950k;

    public e42(f42 f42Var) {
        this.f1950k = f42Var;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f1949j;
        Object obj = this.f1950k;
        switch (i3) {
            case 0:
                f42 f42Var = (f42) obj;
                try {
                    int iInflate = f42Var.f2311j.inflate(bArr, i, i2);
                    if (iInflate > 0) {
                        return iInflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (f42Var.f2311j.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = f42Var.f2311j.getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            default:
                return ((AbstractC0860x0) obj).mo3245I(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.f1949j) {
            case 1:
                if (j <= 0) {
                    return 0L;
                }
                int i = j > 2147483647L ? Integer.MAX_VALUE : (int) j;
                ((AbstractC0860x0) this.f1950k).mo3246J(i);
                return i;
            default:
                return super.skip(j);
        }
    }

    public e42(f42 f42Var, AbstractC0860x0 abstractC0860x0) {
        this.f1950k = abstractC0860x0;
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f1949j) {
            case 0:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((AbstractC0860x0) this.f1950k).mo3245I(bArr2, 0, 1) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }
}
