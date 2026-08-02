package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3329a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[androidx.camera.view.PreviewView.StreamState.values().length];
        try {
            iArr[androidx.camera.view.PreviewView.StreamState.IDLE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[androidx.camera.view.PreviewView.StreamState.STREAMING.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        f3329a = iArr;
        int[] iArr2 = new int[androidx.camera.core.CameraState.Type.values().length];
        try {
            iArr2[androidx.camera.core.CameraState.Type.PENDING_OPEN.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr2[androidx.camera.core.CameraState.Type.OPENING.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr2[androidx.camera.core.CameraState.Type.OPEN.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr2[androidx.camera.core.CameraState.Type.CLOSING.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr2[androidx.camera.core.CameraState.Type.CLOSED.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
