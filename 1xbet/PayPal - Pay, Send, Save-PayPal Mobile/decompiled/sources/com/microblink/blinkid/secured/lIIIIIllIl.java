package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIIIIIllIl {
    public final android.app.Fragment IlIllIlIIl;
    public final androidx.fragment.app.Fragment IllIIIllII;
    public final android.content.Context llIIIlllll;
    public final android.app.Activity llIIlIlIIl;

    public lIIIIIllIl(android.app.Activity activity) {
        this.llIIlIlIIl = activity;
        this.llIIIlllll = activity;
    }

    public final android.content.Context IlIllIlIIl() {
        return this.llIIIlllll;
    }

    public final android.content.SharedPreferences IllIIIllII() {
        android.app.Fragment fragment = this.IlIllIlIIl;
        if (fragment != null) {
            return fragment.getActivity().getSharedPreferences("CameraPermissionManager.prefs", 0);
        }
        android.app.Activity activity = this.llIIlIlIIl;
        if (activity != null) {
            return activity.getSharedPreferences("CameraPermissionManager.prefs", 0);
        }
        androidx.fragment.app.Fragment fragment2 = this.IllIIIllII;
        if (fragment2 != null) {
            return fragment2.getActivity().getSharedPreferences("CameraPermissionManager.prefs", 0);
        }
        return null;
    }

    public final boolean llIIIlllll() {
        android.app.Fragment fragment = this.IlIllIlIIl;
        if (fragment != null) {
            return fragment.shouldShowRequestPermissionRationale("android.permission.CAMERA");
        }
        android.app.Activity activity = this.llIIlIlIIl;
        if (activity != null) {
            return activity.shouldShowRequestPermissionRationale("android.permission.CAMERA");
        }
        androidx.fragment.app.Fragment fragment2 = this.IllIIIllII;
        return fragment2 != null && fragment2.shouldShowRequestPermissionRationale("android.permission.CAMERA");
    }

    public final int llIIlIlIIl() {
        android.app.Fragment fragment = this.IlIllIlIIl;
        if (fragment != null) {
            return fragment.getActivity().checkSelfPermission("android.permission.CAMERA");
        }
        android.app.Activity activity = this.llIIlIlIIl;
        if (activity != null) {
            return activity.checkSelfPermission("android.permission.CAMERA");
        }
        androidx.fragment.app.Fragment fragment2 = this.IllIIIllII;
        if (fragment2 != null) {
            return fragment2.getActivity().checkSelfPermission("android.permission.CAMERA");
        }
        return -1;
    }

    public lIIIIIllIl(android.app.Fragment fragment) {
        this.IlIllIlIIl = fragment;
        this.llIIIlllll = fragment.getActivity();
    }

    public lIIIIIllIl(androidx.fragment.app.Fragment fragment) {
        this.IllIIIllII = fragment;
        this.llIIIlllll = fragment.getContext();
    }

    public final void llIIlIlIIl(java.lang.String[] strArr) {
        android.app.Fragment fragment = this.IlIllIlIIl;
        if (fragment != null) {
            fragment.requestPermissions(strArr, 69);
        }
        android.app.Activity activity = this.llIIlIlIIl;
        if (activity != null) {
            activity.requestPermissions(strArr, 69);
        }
        androidx.fragment.app.Fragment fragment2 = this.IllIIIllII;
        if (fragment2 != null) {
            fragment2.requestPermissions(strArr, 69);
        }
    }
}
