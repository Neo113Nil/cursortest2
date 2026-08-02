package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public class StampStyle extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.StampStyle> CREATOR = new com.google.android.gms.maps.model.zzw();
    protected final com.google.android.gms.maps.model.BitmapDescriptor zza;

    StampStyle(android.os.IBinder iBinder) {
        this.zza = new com.google.android.gms.maps.model.BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, bitmapDescriptor.zza().asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    protected StampStyle(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.zza = bitmapDescriptor;
    }

    static abstract class Builder<T extends com.google.android.gms.maps.model.StampStyle.Builder<T>> {
        com.google.android.gms.maps.model.BitmapDescriptor zza;

        protected abstract T self();

        public T stamp(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
            this.zza = bitmapDescriptor;
            return self();
        }

        Builder() {
        }
    }

    public com.google.android.gms.maps.model.BitmapDescriptor getStamp() {
        return this.zza;
    }
}
