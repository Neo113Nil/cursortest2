package com.google.android.gms.common.moduleinstall;

/* loaded from: classes8.dex */
public class ModuleAvailabilityResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse> CREATOR = new com.google.android.gms.common.moduleinstall.zaa();
    private final boolean zaa;
    private final int zab;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface AvailabilityStatus {
        public static final int STATUS_ALREADY_AVAILABLE = 0;
        public static final int STATUS_READY_TO_DOWNLOAD = 1;
        public static final int STATUS_UNKNOWN_MODULE = 2;
    }

    public ModuleAvailabilityResponse(boolean z, int i) {
        this.zaa = z;
        this.zab = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, areModulesAvailable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getAvailabilityStatus());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public int getAvailabilityStatus() {
        return this.zab;
    }

    public boolean areModulesAvailable() {
        return this.zaa;
    }
}
