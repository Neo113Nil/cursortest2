package N1;

import F1.u;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f4751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4753e;

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[FALL_THROUGH] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public r(boolean z4, String str, int i7, byte[] bArr, int i8, int i9, byte[] bArr2) {
        int i10 = 2;
        byte b7 = 0;
        p151v2.a.f((i7 == 0) ^ (bArr2 == null));
        this.f4749a = z4;
        this.f4750b = str;
        this.f4752d = i7;
        this.f4753e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b7 = -1;
                    }
                    break;
                case 3046671:
                    b7 = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b7 = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b7 = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            switch (b7) {
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
        } else {
            i10 = 1;
        }
        this.f4751c = new u(i10, bArr, i8, i9);
    }
}
