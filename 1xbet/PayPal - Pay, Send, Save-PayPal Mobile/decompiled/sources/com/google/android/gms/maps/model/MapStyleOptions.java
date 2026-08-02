package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class MapStyleOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.MapStyleOptions> CREATOR = new com.google.android.gms.maps.model.zzo();
    private final java.lang.String zza;

    public MapStyleOptions(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "json must not be null");
        this.zza = str;
    }

    public static com.google.android.gms.maps.model.MapStyleOptions loadRawResourceStyle(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        try {
            return new com.google.android.gms.maps.model.MapStyleOptions(new java.lang.String(com.google.android.gms.common.util.IOUtils.readInputStreamFully(context.getResources().openRawResource(i)), java.nio.charset.StandardCharsets.UTF_8));
        } catch (java.io.IOException e) {
            java.lang.String obj = e.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to read resource ");
            sb.append(i);
            sb.append(": ");
            sb.append(obj);
            throw new android.content.res.Resources.NotFoundException(sb.toString());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
