package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class YU implements android.hardware.SensorEventListener {
    public static byte[] A0A;
    public static java.lang.String[] A0B = {"Uaa3J2scapV8yes5b6pnu2IZk0LU1rHr", "LXJurOGNRLg3EZS8fSyHIDjya5ZXSJzZ", "hCsv3utrXnSLOEX2XFPv3VRLBGlOvh7o", "RmYGkVFgjEbS5IzY3jbSoV7saQb", "K5WWR24mbSYeRgwsb3gP0cRcHXaCk4OY", "QLQ7H5Nzwy1ReHmp", "O9fDe2IL", "IeHuYhXCHfpoc9Iu6CaN8EzSXeA"};
    public long A04;
    public long A05;
    public long A06;
    public android.hardware.SensorManager A07;
    public final com.facebook.ads.redexgen.core.C1636gi A08;
    public int A03 = 0;
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public final java.util.Set<com.facebook.ads.redexgen.core.YT> A09 = new java.util.concurrent.CopyOnWriteArraySet();

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0B[5].length() != 16) {
                throw new java.lang.RuntimeException();
            }
            A0B[6] = "nz7up3lN";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
            i4++;
        }
    }

    public static void A02() {
        A0A = new byte[]{122, 76, 71, 90, 70, 91, 90, 9, 71, 70, 93, 9, 90, 92, 89, 89, 70, 91, 93, 76, 77, 5, 62, 55, kotlin.io.encoding.Base64.padSymbol, 63, 56, 49, 118, 56, 57, 34, 118, 37, 35, 38, 38, 57, 36, 34, 51, 50, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SI, 4, com.google.common.base.Ascii.EM, 5, com.google.common.base.Ascii.CAN};
    }

    static {
        A02();
    }

    public YU(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A08 = c1636gi;
    }

    private void A01() {
        this.A07 = (android.hardware.SensorManager) this.A08.getSystemService(A00(42, 6, 72));
        if (this.A07 == null) {
            android.widget.Toast.makeText(this.A08, A00(0, 21, 11), 1).show();
        }
        boolean z = false;
        try {
            z = this.A07.registerListener(this, this.A07.getDefaultSensor(1), 3);
        } catch (java.lang.Exception unused) {
            android.widget.Toast.makeText(this.A08, A00(21, 21, 116), 1).show();
        }
        if (!z && this.A07 != null) {
            this.A07.unregisterListener(this);
        }
    }

    public final void A03(com.facebook.ads.redexgen.core.YT yt) {
        if (this.A09.isEmpty()) {
            A01();
        } else if (this.A09.contains(yt)) {
            return;
        }
        this.A09.add(yt);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        long now = android.os.SystemClock.elapsedRealtime();
        if (now - this.A04 > 500) {
            this.A03 = 0;
        }
        if (now - this.A06 > 100) {
            float speed = (java.lang.Math.abs(((((sensorEvent.values[0] + sensorEvent.values[1]) + sensorEvent.values[2]) - this.A00) - this.A01) - this.A02) / (now - this.A06)) * 10000.0f;
            if (speed > 800.0f) {
                int i = this.A03 + 1;
                this.A03 = i;
                if (i >= 3 && now - this.A05 > 1000) {
                    this.A05 = now;
                    this.A03 = 0;
                    java.util.Iterator<com.facebook.ads.redexgen.core.YT> it = this.A09.iterator();
                    while (it.hasNext()) {
                        it.next().AFv();
                    }
                }
                this.A04 = now;
            }
            this.A06 = now;
            this.A00 = sensorEvent.values[0];
            this.A01 = sensorEvent.values[1];
            this.A02 = sensorEvent.values[2];
        }
    }
}
