package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1813y1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16377a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16378b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f16379c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16380d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f16381e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r6.equals("cenc") != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1813y1(boolean z3, String str, int i, byte[] bArr, int i5, int i6, byte[] bArr2) {
        char c5 = 0;
        int i7 = 1;
        AbstractC1668us.S((i == 0) ^ (bArr2 == null));
        this.f16377a = z3;
        this.f16378b = str;
        this.f16380d = i;
        this.f16381e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals("cbc1")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3049879:
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            if (c5 != 0 && c5 != 1) {
                if (c5 == 2 || c5 == 3) {
                    i7 = 2;
                } else {
                    JB.l("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                }
            }
        }
        this.f16379c = new Z(i7, i5, i6, bArr);
    }
}
