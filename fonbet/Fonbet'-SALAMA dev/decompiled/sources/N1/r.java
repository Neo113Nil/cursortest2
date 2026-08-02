package N1;

import F1.u;
import android.util.Log;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4749a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4750b;

    /* renamed from: c, reason: collision with root package name */
    public final u f4751c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4752d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4753e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r7.equals("cbc1") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(boolean z4, String str, int i7, byte[] bArr, int i8, int i9, byte[] bArr2) {
        int i10 = 2;
        char c3 = 0;
        AbstractC1664a.f((i7 == 0) ^ (bArr2 == null));
        this.f4749a = z4;
        this.f4750b = str;
        this.f4752d = i7;
        this.f4753e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                case 1:
                    break;
                default:
                    Log.w("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                case 2:
                case 3:
                    i10 = 1;
                    break;
            }
            this.f4751c = new u(i10, bArr, i8, i9);
        }
        i10 = 1;
        this.f4751c = new u(i10, bArr, i8, i9);
    }
}
