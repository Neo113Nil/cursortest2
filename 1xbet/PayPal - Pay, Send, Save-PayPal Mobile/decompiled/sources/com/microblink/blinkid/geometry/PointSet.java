package com.microblink.blinkid.geometry;

/* loaded from: classes10.dex */
public class PointSet implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.geometry.PointSet> CREATOR = new com.microblink.blinkid.geometry.IlIllIlIIl();
    private final java.util.ArrayList Camera2StreamConfigurationMap;

    public PointSet(java.util.List<com.microblink.blinkid.geometry.Point> list) {
        this.Camera2StreamConfigurationMap = null;
        if (list instanceof java.util.ArrayList) {
            this.Camera2StreamConfigurationMap = (java.util.ArrayList) list;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        this.Camera2StreamConfigurationMap = arrayList;
        arrayList.addAll(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void draw(android.graphics.Canvas canvas, android.graphics.Paint paint, int i) {
        java.util.ArrayList arrayList = this.Camera2StreamConfigurationMap;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.microblink.blinkid.geometry.Point) it.next()).draw(canvas, paint, i);
            }
        }
    }

    public java.util.List<com.microblink.blinkid.geometry.Point> getPoints() {
        return this.Camera2StreamConfigurationMap;
    }

    public float[] toFloatArray() {
        float[] fArr = new float[this.Camera2StreamConfigurationMap.size() * 2];
        for (int i = 0; i < this.Camera2StreamConfigurationMap.size(); i++) {
            int i2 = i * 2;
            fArr[i2] = ((com.microblink.blinkid.geometry.Point) this.Camera2StreamConfigurationMap.get(i)).getX();
            fArr[i2 + 1] = ((com.microblink.blinkid.geometry.Point) this.Camera2StreamConfigurationMap.get(i)).getY();
        }
        return fArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeTypedList(this.Camera2StreamConfigurationMap);
    }

    public PointSet(float[] fArr) {
        this.Camera2StreamConfigurationMap = null;
        this.Camera2StreamConfigurationMap = new java.util.ArrayList(fArr.length / 2);
        for (int i = 0; i < fArr.length - 1; i += 2) {
            this.Camera2StreamConfigurationMap.add(new com.microblink.blinkid.geometry.Point(fArr[i], fArr[i + 1]));
        }
    }

    public PointSet(float[] fArr, int i, int i2, int i3, boolean z) {
        this.Camera2StreamConfigurationMap = null;
        com.microblink.blinkid.util.Log.d(this, "Point set length: {}", java.lang.Integer.valueOf(fArr.length));
        this.Camera2StreamConfigurationMap = new java.util.ArrayList(fArr.length / 2);
        for (int i4 = 0; i4 < fArr.length - 1; i4 += 2) {
            com.microblink.blinkid.geometry.Point point = new com.microblink.blinkid.geometry.Point(fArr[i4], fArr[i4 + 1]);
            point = (i3 == 8 || i3 == 9) ? point.mirrorXY(1.0f, 1.0f) : point;
            point = z ? point.mirrorXY(1.0f, 1.0f) : point;
            if (i3 != 1 && i3 != 9) {
                this.Camera2StreamConfigurationMap.add(new com.microblink.blinkid.geometry.Point(point.getX() * i, point.getY() * i2));
            } else {
                this.Camera2StreamConfigurationMap.add(new com.microblink.blinkid.geometry.Point((1.0f - point.getY()) * i, point.getX() * i2));
            }
        }
    }

    protected PointSet(android.os.Parcel parcel) {
        this.Camera2StreamConfigurationMap = null;
        this.Camera2StreamConfigurationMap = parcel.createTypedArrayList(com.microblink.blinkid.geometry.Point.CREATOR);
    }
}
