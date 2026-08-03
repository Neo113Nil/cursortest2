package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.22, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AnonymousClass22 extends android.os.Binder {
    public static final int A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static com.facebook.ads.redexgen.core.BP<android.os.Bundle> A00(android.os.IBinder iBinder) {
        com.facebook.ads.redexgen.core.C2K A01 = com.facebook.ads.redexgen.core.BP.A01();
        int i = 0;
        int i2 = 1;
        while (i2 != 0) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInt(i);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        i2 = obtain2.readInt();
                        if (i2 == 1) {
                            A01.A04((android.os.Bundle) com.facebook.ads.redexgen.core.AbstractC04203y.A01(obtain2.readBundle()));
                            i++;
                        }
                    }
                } catch (android.os.RemoteException e) {
                    throw new java.lang.RuntimeException(e);
                }
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        return A01.A05();
    }

    static {
        A00 = com.facebook.ads.redexgen.core.C5C.A02 >= 30 ? android.os.IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }
}
