package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public interface ICancelToken extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.ICancelToken {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        public static com.google.android.gms.common.internal.ICancelToken asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return queryLocalInterface instanceof com.google.android.gms.common.internal.ICancelToken ? (com.google.android.gms.common.internal.ICancelToken) queryLocalInterface : new com.google.android.gms.common.internal.zzu(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel() throws android.os.RemoteException;
}
