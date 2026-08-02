package p000;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qe1 {

    /* JADX INFO: renamed from: a */
    public static final Logger f6481a = Logger.getLogger(qe1.class.getName());

    /* JADX INFO: renamed from: b */
    public static final byte[] f6482b = "-bin".getBytes(AbstractC0358jg.f3919a);

    /* JADX INFO: renamed from: a */
    public static boolean m4091a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
