package com.github.mikephil.charting.matrix;

/* loaded from: classes8.dex */
public final class Vector3 {
    public float x;
    public float y;
    public float z;
    public static final com.github.mikephil.charting.matrix.Vector3 ZERO = new com.github.mikephil.charting.matrix.Vector3(0.0f, 0.0f, 0.0f);
    public static final com.github.mikephil.charting.matrix.Vector3 UNIT_X = new com.github.mikephil.charting.matrix.Vector3(1.0f, 0.0f, 0.0f);
    public static final com.github.mikephil.charting.matrix.Vector3 UNIT_Y = new com.github.mikephil.charting.matrix.Vector3(0.0f, 1.0f, 0.0f);
    public static final com.github.mikephil.charting.matrix.Vector3 UNIT_Z = new com.github.mikephil.charting.matrix.Vector3(0.0f, 0.0f, 1.0f);

    public Vector3() {
    }

    public Vector3(float[] fArr) {
        set(fArr[0], fArr[1], fArr[2]);
    }

    public Vector3(float f, float f2, float f3) {
        set(f, f2, f3);
    }

    public Vector3(com.github.mikephil.charting.matrix.Vector3 vector3) {
        set(vector3);
    }

    public final void add(com.github.mikephil.charting.matrix.Vector3 vector3) {
        this.x += vector3.x;
        this.y += vector3.y;
        this.z += vector3.z;
    }

    public final void add(float f, float f2, float f3) {
        this.x += f;
        this.y += f2;
        this.z += f3;
    }

    public final void subtract(com.github.mikephil.charting.matrix.Vector3 vector3) {
        this.x -= vector3.x;
        this.y -= vector3.y;
        this.z -= vector3.z;
    }

    public final void subtractMultiple(com.github.mikephil.charting.matrix.Vector3 vector3, float f) {
        this.x -= vector3.x * f;
        this.y -= vector3.y * f;
        this.z -= vector3.z * f;
    }

    public final void multiply(float f) {
        this.x *= f;
        this.y *= f;
        this.z *= f;
    }

    public final void multiply(com.github.mikephil.charting.matrix.Vector3 vector3) {
        this.x *= vector3.x;
        this.y *= vector3.y;
        this.z *= vector3.z;
    }

    public final void divide(float f) {
        if (f != 0.0f) {
            this.x /= f;
            this.y /= f;
            this.z /= f;
        }
    }

    public final void set(com.github.mikephil.charting.matrix.Vector3 vector3) {
        this.x = vector3.x;
        this.y = vector3.y;
        this.z = vector3.z;
    }

    public final void set(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    public final float dot(com.github.mikephil.charting.matrix.Vector3 vector3) {
        return (this.x * vector3.x) + (this.y * vector3.y) + (this.z * vector3.z);
    }

    public final com.github.mikephil.charting.matrix.Vector3 cross(com.github.mikephil.charting.matrix.Vector3 vector3) {
        float f = this.y;
        float f2 = vector3.z;
        float f3 = this.z;
        float f4 = vector3.y;
        float f5 = vector3.x;
        float f6 = this.x;
        return new com.github.mikephil.charting.matrix.Vector3((f * f2) - (f3 * f4), (f3 * f5) - (f2 * f6), (f6 * f4) - (f * f5));
    }

    public final float length() {
        return (float) java.lang.Math.sqrt(length2());
    }

    public final float length2() {
        float f = this.x;
        float f2 = this.y;
        float f3 = this.z;
        return (f * f) + (f2 * f2) + (f3 * f3);
    }

    public final float distance2(com.github.mikephil.charting.matrix.Vector3 vector3) {
        float f = this.x - vector3.x;
        float f2 = this.y - vector3.y;
        float f3 = this.z - vector3.z;
        return (f * f) + (f2 * f2) + (f3 * f3);
    }

    public final float normalize() {
        float length = length();
        if (length != 0.0f) {
            this.x /= length;
            this.y /= length;
            this.z /= length;
        }
        return length;
    }

    public final void zero() {
        set(0.0f, 0.0f, 0.0f);
    }

    public final boolean pointsInSameDirection(com.github.mikephil.charting.matrix.Vector3 vector3) {
        return dot(vector3) > 0.0f;
    }
}
