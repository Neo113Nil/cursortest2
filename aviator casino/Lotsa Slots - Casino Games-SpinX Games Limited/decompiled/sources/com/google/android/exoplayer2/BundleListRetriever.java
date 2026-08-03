package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class BundleListRetriever extends android.os.Binder {
    private static final int REPLY_BREAK = 2;
    private static final int REPLY_CONTINUE = 1;
    private static final int REPLY_END_OF_LIST = 0;
    private static final int SUGGESTED_MAX_IPC_SIZE;
    private final com.google.common.collect.ImmutableList<android.os.Bundle> list;

    static {
        SUGGESTED_MAX_IPC_SIZE = com.google.android.exoplayer2.util.Util.SDK_INT >= 30 ? android.os.IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public BundleListRetriever(java.util.List<android.os.Bundle> list) {
        this.list = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.list.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < SUGGESTED_MAX_IPC_SIZE) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.list.get(readInt));
            readInt++;
        }
        parcel2.writeInt(readInt < size ? 2 : 0);
        return true;
    }

    public static com.google.common.collect.ImmutableList<android.os.Bundle> getList(android.os.IBinder iBinder) {
        int readInt;
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        int i = 1;
        int i2 = 0;
        while (i != 0) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInt(i2);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            builder.add((com.google.common.collect.ImmutableList.Builder) com.google.android.exoplayer2.util.Assertions.checkNotNull(obtain2.readBundle()));
                            i2++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i = readInt;
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
