package com.microblink.blinkid.entities;

/* loaded from: classes9.dex */
public abstract class Entity<T extends com.microblink.blinkid.entities.Entity.Result> implements android.os.Parcelable {
    private final com.microblink.blinkid.entities.Entity.Result getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRanges;

    public static abstract class Result implements android.os.Parcelable {
        public com.microblink.blinkid.entities.Entity IlIllIlIIl = null;
        private final long getHighSpeedVideoFpsRanges;

        public Result(long j) {
            this.getHighSpeedVideoFpsRanges = j;
        }

        protected abstract byte[] IlIllIlIIl();

        @Override // 
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public abstract com.microblink.blinkid.entities.Entity.Result mo10870clone();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        protected final void finalize() {
            super.finalize();
            if (this.IlIllIlIIl == null) {
                llIIlIlIIl(this.getHighSpeedVideoFpsRanges);
            }
        }

        public final long getNativeContext() {
            return this.getHighSpeedVideoFpsRanges;
        }

        protected abstract void llIIlIlIIl(long j);

        public void llIIlIlIIl(android.os.Parcel parcel) {
            int readInt = parcel.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                llIIlIlIIl(bArr);
            }
        }

        protected abstract void llIIlIlIIl(byte[] bArr);

        protected abstract boolean llIIlIlIIl();

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            byte[] IlIllIlIIl = IlIllIlIIl();
            if (IlIllIlIIl == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(IlIllIlIIl.length);
                parcel.writeByteArray(IlIllIlIIl);
            }
        }
    }

    public Entity(long j, com.microblink.blinkid.entities.Entity.Result result) {
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighResolutionOutputSizeshNQ4ISI = result;
        result.IlIllIlIIl = this;
    }

    public static native long nativeGetNativeResultContext(long j);

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract com.microblink.blinkid.entities.Entity mo10869clone();

    public abstract void consumeResultFrom(com.microblink.blinkid.entities.Entity entity);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected final void finalize() {
        super.finalize();
        llIIlIlIIl(this.getHighSpeedVideoFpsRanges);
    }

    public final long getNativeContext() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final T getResult() {
        return (T) this.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected abstract void llIIlIlIIl(long j);

    public void llIIlIlIIl(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            llIIlIlIIl(bArr);
        }
        if (parcel.readByte() != 0) {
            this.getHighResolutionOutputSizeshNQ4ISI.llIIlIlIIl(parcel);
        }
    }

    protected abstract void llIIlIlIIl(byte[] bArr);

    protected abstract byte[] llIIlIlIIl();

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        byte[] llIIlIlIIl = llIIlIlIIl();
        if (llIIlIlIIl != null) {
            parcel.writeInt(llIIlIlIIl.length);
            parcel.writeByteArray(llIIlIlIIl);
        } else {
            parcel.writeInt(0);
        }
        boolean llIIlIlIIl2 = this.getHighResolutionOutputSizeshNQ4ISI.llIIlIlIIl();
        parcel.writeByte(!llIIlIlIIl2 ? (byte) 1 : (byte) 0);
        if (llIIlIlIIl2) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.writeToParcel(parcel, i);
    }

    public Entity(long j, com.microblink.blinkid.entities.Entity.Result result, android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighResolutionOutputSizeshNQ4ISI = result;
        result.IlIllIlIIl = this;
        llIIlIlIIl(parcel);
    }
}
