package com.google.android.gms.common.moduleinstall;

/* loaded from: classes8.dex */
public class ModuleInstallResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.ModuleInstallResponse> CREATOR = new com.google.android.gms.common.moduleinstall.zad();
    private final int zaa;
    private final boolean zab;

    public ModuleInstallResponse(int i) {
        this(i, false);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getSessionId());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zab);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ModuleInstallResponse(int i, boolean z) {
        this.zaa = i;
        this.zab = z;
    }

    public final boolean zaa() {
        return this.zab;
    }

    public int getSessionId() {
        return this.zaa;
    }

    public boolean areModulesAlreadyInstalled() {
        return this.zaa == 0;
    }
}
