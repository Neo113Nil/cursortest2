package com.inmobi.media;

/* renamed from: com.inmobi.media.wc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2854wc {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f5527a;
    public final java.lang.String b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public int h;
    public float i;
    public org.json.JSONArray j;
    public android.view.MotionEvent k;
    public int l;

    public C2854wc(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi mListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.f5527a = mListener;
        this.b = "wc";
        this.l = Integer.MAX_VALUE;
        this.g = -1;
        this.h = -1;
    }

    public final void a(android.view.MotionEvent event) {
        float f;
        float f2;
        float f3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            java.lang.String TAG = this.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            java.util.Objects.toString(event);
            this.g = event.getPointerId(event.getActionIndex());
            this.j = new org.json.JSONArray();
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.inmobi.media.J3.c(event.getX())), java.lang.Integer.valueOf(com.inmobi.media.J3.c(event.getY()))}));
            org.json.JSONArray jSONArray2 = this.j;
            if (jSONArray2 != null) {
                jSONArray2.put(jSONArray);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            java.lang.String TAG2 = this.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            java.util.Objects.toString(event);
            this.g = -1;
            org.json.JSONArray jSONArray3 = this.j;
            if (jSONArray3 == null || jSONArray3.length() <= 5) {
                return;
            }
            this.f5527a.a(this);
            this.j = new org.json.JSONArray();
            return;
        }
        float f4 = 0.0f;
        if (actionMasked == 2) {
            org.json.JSONArray jSONArray4 = this.j;
            int i = this.g;
            if (i == -1 || this.h == -1) {
                if (i == -1 || jSONArray4 == null || jSONArray4.length() <= 0 || jSONArray4.length() >= 50) {
                    return;
                }
                try {
                    int c = com.inmobi.media.J3.c(event.getX());
                    int c2 = com.inmobi.media.J3.c(event.getY());
                    org.json.JSONArray jSONArray5 = jSONArray4.getJSONArray(jSONArray4.length() - 1);
                    org.json.JSONArray jSONArray6 = new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(c2)}));
                    float f5 = jSONArray5.getInt(0) - jSONArray6.getInt(0);
                    float f6 = jSONArray5.getInt(1) - jSONArray6.getInt(1);
                    if (((int) java.lang.Math.sqrt((f6 * f6) + (f5 * f5))) > 100) {
                        jSONArray4.put(jSONArray6);
                        return;
                    }
                    return;
                } catch (org.json.JSONException unused) {
                    return;
                }
            }
            int findPointerIndex = event.findPointerIndex(i);
            int findPointerIndex2 = event.findPointerIndex(this.h);
            if (findPointerIndex >= 0) {
                f2 = event.getX(findPointerIndex);
                f = event.getY(findPointerIndex);
            } else {
                kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                com.inmobi.media.W9.a(new com.inmobi.media.M2(new java.lang.IllegalArgumentException("Index for mPtrID1=" + this.g + " is " + findPointerIndex + " | Pointer count=" + event.getPointerCount())));
                f = 0.0f;
                f2 = 0.0f;
            }
            if (findPointerIndex2 >= 0) {
                float x = event.getX(findPointerIndex2);
                f4 = event.getY(findPointerIndex2);
                f3 = x;
            } else {
                kotlin.Lazy lazy2 = com.inmobi.media.W9.f5027a;
                com.inmobi.media.W9.a(new com.inmobi.media.M2(new java.lang.IllegalArgumentException("Index for mPtrID1=" + this.h + " is " + findPointerIndex2 + " | Pointer count=" + event.getPointerCount())));
                f3 = 0.0f;
            }
            float degrees = ((float) java.lang.Math.toDegrees(((float) java.lang.Math.atan2(this.d - this.f, this.c - this.e)) - ((float) java.lang.Math.atan2(f4 - f, f3 - f2)))) % 360;
            if (degrees < -180.0f) {
                degrees += 360.0f;
            }
            if (degrees > 180.0f) {
                degrees -= 360.0f;
            }
            this.i = java.lang.Math.abs(degrees);
            return;
        }
        if (actionMasked == 3) {
            java.lang.String TAG3 = this.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            java.util.Objects.toString(event);
            this.g = -1;
            this.h = -1;
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            java.lang.String TAG4 = this.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            java.util.Objects.toString(event);
            this.h = -1;
            if (this.i > 30.0f) {
                android.view.MotionEvent motionEvent = this.k;
                if (motionEvent != null) {
                    this.f5527a.b(this, motionEvent, event);
                }
                this.i = 0.0f;
            }
            float x2 = event.getX() - event.getX(1);
            float y = event.getY() - event.getY(1);
            if (java.lang.Math.abs(((int) java.lang.Math.sqrt((y * y) + (x2 * x2))) - this.l) > 500) {
                android.view.MotionEvent motionEvent2 = this.k;
                if (motionEvent2 != null) {
                    this.f5527a.a(this, motionEvent2, event);
                }
                this.l = Integer.MAX_VALUE;
                return;
            }
            return;
        }
        java.lang.String TAG5 = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
        java.util.Objects.toString(event);
        this.h = event.getPointerId(event.getActionIndex());
        this.k = android.view.MotionEvent.obtain(event);
        int findPointerIndex3 = event.findPointerIndex(this.g);
        int findPointerIndex4 = event.findPointerIndex(this.h);
        if (findPointerIndex3 >= 0) {
            this.e = event.getX(findPointerIndex3);
            this.f = event.getY(findPointerIndex3);
        } else {
            kotlin.Lazy lazy3 = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(new java.lang.IllegalArgumentException("Index for mPtrID1=" + this.g + " is " + findPointerIndex3 + " | Pointer count=" + event.getPointerCount())));
        }
        if (findPointerIndex4 >= 0) {
            this.c = event.getX(findPointerIndex4);
            this.d = event.getY(findPointerIndex4);
        } else {
            kotlin.Lazy lazy4 = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(new java.lang.IllegalArgumentException("Index for mPtrID2=" + this.h + " is " + findPointerIndex4 + " | Pointer count=" + event.getPointerCount())));
        }
        float f7 = this.e - this.c;
        float f8 = this.f - this.d;
        this.l = (int) java.lang.Math.sqrt((f8 * f8) + (f7 * f7));
    }
}
