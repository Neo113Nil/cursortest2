package com.github.mikephil.charting.data;

/* loaded from: classes8.dex */
public class Entry extends com.github.mikephil.charting.data.BaseEntry implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.github.mikephil.charting.data.Entry> CREATOR = new android.os.Parcelable.Creator<com.github.mikephil.charting.data.Entry>() { // from class: com.github.mikephil.charting.data.Entry.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.github.mikephil.charting.data.Entry createFromParcel(android.os.Parcel parcel) {
            return new com.github.mikephil.charting.data.Entry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.github.mikephil.charting.data.Entry[] newArray(int i) {
            return new com.github.mikephil.charting.data.Entry[i];
        }
    };
    private float Camera2StreamConfigurationMap;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Entry() {
        this.Camera2StreamConfigurationMap = 0.0f;
    }

    public Entry(float f, float f2) {
        super(f2);
        this.Camera2StreamConfigurationMap = f;
    }

    public Entry(float f, float f2, java.lang.Object obj) {
        super(f2, obj);
        this.Camera2StreamConfigurationMap = f;
    }

    public Entry(float f, float f2, android.graphics.drawable.Drawable drawable) {
        super(f2, drawable);
        this.Camera2StreamConfigurationMap = f;
    }

    public Entry(float f, float f2, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        super(f2, drawable, obj);
        this.Camera2StreamConfigurationMap = f;
    }

    public float getX() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setX(float f) {
        this.Camera2StreamConfigurationMap = f;
    }

    public com.github.mikephil.charting.data.Entry copy() {
        return new com.github.mikephil.charting.data.Entry(this.Camera2StreamConfigurationMap, getY(), getData());
    }

    public boolean equalTo(com.github.mikephil.charting.data.Entry entry) {
        return entry != null && entry.getData() == getData() && java.lang.Math.abs(entry.Camera2StreamConfigurationMap - this.Camera2StreamConfigurationMap) <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON && java.lang.Math.abs(entry.getY() - getY()) <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Entry, x: ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(" y: ");
        sb.append(getY());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.Camera2StreamConfigurationMap);
        parcel.writeFloat(getY());
        if (getData() != null) {
            if (getData() instanceof android.os.Parcelable) {
                parcel.writeInt(1);
                parcel.writeParcelable((android.os.Parcelable) getData(), i);
                return;
            }
            throw new android.os.ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
        parcel.writeInt(0);
    }

    protected Entry(android.os.Parcel parcel) {
        this.Camera2StreamConfigurationMap = 0.0f;
        this.Camera2StreamConfigurationMap = parcel.readFloat();
        setY(parcel.readFloat());
        if (parcel.readInt() == 1) {
            setData(parcel.readParcelable(java.lang.Object.class.getClassLoader()));
        }
    }
}
