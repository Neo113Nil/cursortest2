package androidx.media3.common;

/* loaded from: classes7.dex */
public final class BundleListRetriever extends android.os.Binder {
    private static final int getHighResolutionOutputSizeshNQ4ISI;
    private final com.google.common.collect.ImmutableList<android.os.Bundle> Camera2StreamConfigurationMap;

    static {
        getHighResolutionOutputSizeshNQ4ISI = android.os.Build.VERSION.SDK_INT >= 30 ? android.os.IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public BundleListRetriever(java.util.List<android.os.Bundle> list) {
        this.Camera2StreamConfigurationMap = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.Camera2StreamConfigurationMap.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < getHighResolutionOutputSizeshNQ4ISI) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.Camera2StreamConfigurationMap.get(readInt));
            readInt++;
        }
        parcel2.writeInt(readInt < size ? 2 : 0);
        return true;
    }

    public static com.google.common.collect.ImmutableList<android.os.Bundle> getList(android.os.IBinder iBinder) {
        if (iBinder instanceof androidx.media3.common.BundleListRetriever) {
            return ((androidx.media3.common.BundleListRetriever) iBinder).Camera2StreamConfigurationMap;
        }
        return Camera2StreamConfigurationMap(iBinder);
    }

    private static com.google.common.collect.ImmutableList<android.os.Bundle> Camera2StreamConfigurationMap(android.os.IBinder iBinder) {
        int readInt;
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
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
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            builder.add((com.google.common.collect.ImmutableList.Builder) com.google.common.base.Preconditions.checkNotNull(obtain2.readBundle()));
                            i++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i2 = readInt;
                } catch (android.os.RemoteException e) {
                    throw new java.lang.RuntimeException(e);
                }
            } catch (java.lang.Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return builder.build();
    }
}
