package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l22 implements Callable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f4648j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f4649k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ x12 f4650l;

    public /* synthetic */ l22(boolean z, String str, x12 x12Var) {
        this.f4648j = z;
        this.f4649k = str;
        this.f4650l = x12Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.f4648j;
        String str = this.f4649k;
        x12 x12Var = this.f4650l;
        String str2 = (z || !p52.m3852b(str, x12Var, true, false).f5009k) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        p80.m3863h(messageDigest);
        byte[] bArrDigest = messageDigest.digest(x12Var.f8750d);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : bArrDigest) {
            char[] cArr2 = AbstractC0477mo.f5106c;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
    }
}
