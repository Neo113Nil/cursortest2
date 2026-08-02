package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIlllIIlll {
    public final com.microblink.blinkid.secured.IlIlIlllIl llIIlIlIIl;
    public android.graphics.Rect IlIllIlIIl = null;
    public android.graphics.Rect IllIIIllII = null;
    public float llIIIlllll = 0.0f;
    public android.graphics.Rect[] IllIIIIllI = null;
    public int lIlIIIIlIl = 0;
    public int llIIlIIlll = 0;
    public int IIlIIIllIl = 0;

    public lIlllIIlll(com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl) {
        this.llIIlIlIIl = ilIlIlllIl;
    }

    public final void llIIlIlIIl(android.hardware.camera2.CameraCharacteristics cameraCharacteristics) {
        android.graphics.Rect rect = (android.graphics.Rect) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        this.IllIIIllII = rect;
        if (rect == null) {
            throw new java.lang.RuntimeException("Unable to obtain sensor active array size. This is a bug in device!");
        }
        com.microblink.blinkid.util.Log.i(this, "Sensor active array size: {}x{}", java.lang.Integer.valueOf(rect.width()), java.lang.Integer.valueOf(this.IllIIIllII.height()));
        java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        java.lang.Integer num2 = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        java.lang.Integer num3 = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null || num2 == null || num3 == null) {
            throw new java.lang.RuntimeException("Unable to obtain max number of regions for AF, AE and AWB. This is a bug in device!");
        }
        this.lIlIIIIlIl = num.intValue();
        this.llIIlIIlll = num2.intValue();
        int intValue = num3.intValue();
        this.IIlIIIllIl = intValue;
        com.microblink.blinkid.util.Log.i(this, "Max AF regions: {}, Max AE regions: {}, Max AWB regions: {}", java.lang.Integer.valueOf(this.lIlIIIIlIl), java.lang.Integer.valueOf(this.llIIlIIlll), java.lang.Integer.valueOf(intValue));
        java.lang.Float f = (java.lang.Float) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            throw new java.lang.RuntimeException("Unable to obtain max digital zoom value. This is a bug in device!");
        }
        this.llIIIlllll = f.floatValue();
        com.microblink.blinkid.util.Log.i(this, "Maximum digital zoom: {}", f);
    }

    public final void llIIlIlIIl(android.hardware.camera2.CaptureRequest.Builder builder, android.graphics.Rect[] rectArr) {
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr;
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr2;
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr3;
        if (this.IlIllIlIIl == null) {
            return;
        }
        android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr4 = null;
        if (rectArr != null) {
            int i = this.lIlIIIIlIl;
            if (i > 0) {
                if (rectArr.length < i) {
                    i = rectArr.length;
                }
                meteringRectangleArr3 = new android.hardware.camera2.params.MeteringRectangle[i];
            } else {
                meteringRectangleArr3 = null;
            }
            int i2 = this.llIIlIIlll;
            if (i2 > 0) {
                if (rectArr.length < i2) {
                    i2 = rectArr.length;
                }
                meteringRectangleArr2 = new android.hardware.camera2.params.MeteringRectangle[i2];
            } else {
                meteringRectangleArr2 = null;
            }
            int i3 = this.IIlIIIllIl;
            if (i3 > 0) {
                if (rectArr.length < i3) {
                    i3 = rectArr.length;
                }
                meteringRectangleArr4 = new android.hardware.camera2.params.MeteringRectangle[i3];
            }
            for (int i4 = 0; i4 < rectArr.length; i4++) {
                if (i4 < this.lIlIIIIlIl) {
                    meteringRectangleArr3[i4] = new android.hardware.camera2.params.MeteringRectangle(llIIlIlIIl(rectArr[i4]), 1000);
                }
                if (i4 < this.llIIlIIlll) {
                    meteringRectangleArr2[i4] = new android.hardware.camera2.params.MeteringRectangle(llIIlIlIIl(rectArr[i4]), 1000);
                }
                if (i4 < this.IIlIIIllIl) {
                    meteringRectangleArr4[i4] = new android.hardware.camera2.params.MeteringRectangle(llIIlIlIIl(rectArr[i4]), 1000);
                }
            }
            android.hardware.camera2.params.MeteringRectangle[] meteringRectangleArr5 = meteringRectangleArr3;
            meteringRectangleArr = meteringRectangleArr4;
            meteringRectangleArr4 = meteringRectangleArr5;
        } else {
            meteringRectangleArr = null;
            meteringRectangleArr2 = null;
        }
        if (meteringRectangleArr4 != null) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr4);
        } else if (this.lIlIIIIlIl > 0) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS, new android.hardware.camera2.params.MeteringRectangle[]{new android.hardware.camera2.params.MeteringRectangle(this.IlIllIlIIl, 0)});
        }
        if (meteringRectangleArr2 != null) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        } else if (this.llIIlIIlll > 0) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS, new android.hardware.camera2.params.MeteringRectangle[]{new android.hardware.camera2.params.MeteringRectangle(this.IlIllIlIIl, 0)});
        }
        if (meteringRectangleArr != null) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr);
        } else if (this.IIlIIIllIl > 0) {
            builder.set(android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS, new android.hardware.camera2.params.MeteringRectangle[]{new android.hardware.camera2.params.MeteringRectangle(this.IlIllIlIIl, 0)});
        }
        this.IllIIIIllI = rectArr;
    }

    public final android.graphics.Rect llIIlIlIIl(android.graphics.Rect rect) {
        float f = (rect.left + 1000) / 2000.0f;
        float f2 = (rect.right + 1000) / 2000.0f;
        float f3 = (rect.top + 1000) / 2000.0f;
        float f4 = (rect.bottom + 1000) / 2000.0f;
        int i = this.IlIllIlIIl.left;
        int round = java.lang.Math.round(f * r1.width());
        int i2 = this.IlIllIlIIl.left;
        int round2 = java.lang.Math.round(f2 * r1.width());
        int i3 = this.IlIllIlIIl.top;
        return new android.graphics.Rect(round + i, java.lang.Math.round(f3 * r2.height()) + i3, round2 + i2, java.lang.Math.round(f4 * r3.height()) + this.IlIllIlIIl.top);
    }

    public final void llIIlIlIIl(android.hardware.camera2.CaptureRequest.Builder builder, float f) {
        float llIIlIlIIl = this.llIIlIlIIl.llIIlIlIIl(f);
        if (llIIlIlIIl < 0.0f) {
            llIIlIlIIl = 0.0f;
        }
        if (llIIlIlIIl > 1.0f) {
            llIIlIlIIl = 1.0f;
        }
        float f2 = (((this.llIIIlllll - 1.0f) * llIIlIlIIl) + 1.0f) * 2.0f;
        int round = java.lang.Math.round(this.IllIIIllII.width() / f2);
        int round2 = java.lang.Math.round(this.IllIIIllII.height() / f2);
        int width = this.IllIIIllII.width() / 2;
        int height = this.IllIIIllII.height() / 2;
        android.graphics.Rect rect = new android.graphics.Rect(width - round, height - round2, width + round, height + round2);
        this.IlIllIlIIl = rect;
        builder.set(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION, rect);
    }
}
