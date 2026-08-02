package com.microblink.blinkid.util;

/* loaded from: classes10.dex */
public class CameraPermissionManager {
    private final com.microblink.blinkid.secured.lIIIIIllIl getHighSpeedVideoFpsRanges;
    private final android.view.View getHighSpeedVideoSizes;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private final com.microblink.blinkid.util.llIIlIlIIl getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.util.llIIlIlIIl(this);
    private final com.microblink.blinkid.util.IllIIIllII Camera2StreamConfigurationMap = new com.microblink.blinkid.util.IllIIIllII(this);

    public CameraPermissionManager(android.app.Activity activity) {
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.secured.lIIIIIllIl(activity);
        android.view.View inflate = activity.getLayoutInflater().inflate(com.microblink.blinkid.resources.Layouts.IlIllIlIIl, (android.view.ViewGroup) null);
        this.getHighSpeedVideoSizes = inflate;
        inflate.setVisibility(8);
    }

    public void askForCameraPermission() {
        if (hasCameraPermission()) {
            android.view.View view = this.getHighSpeedVideoSizes;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        android.view.View findViewById = this.getHighSpeedVideoSizes.findViewById(com.microblink.blinkid.library.R.id.camera_ask_permission_button);
        if (this.getHighSpeedVideoFpsRanges.llIIIlllll()) {
            this.getHighSpeedVideoSizes.setVisibility(0);
            findViewById.setOnClickListener(this.getHighSpeedVideoFpsRangesFor);
        } else {
            if (this.getHighSpeedVideoFpsRanges.IllIIIllII().getBoolean("DeniedPermission", false)) {
                this.getHighSpeedVideoSizes.setVisibility(0);
                findViewById.setOnClickListener(this.Camera2StreamConfigurationMap);
                return;
            }
            this.getHighSpeedVideoSizes.setVisibility(8);
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighSpeedVideoFpsRanges.llIIlIlIIl(new java.lang.String[]{"android.permission.CAMERA"});
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }
    }

    public android.view.View getAskPermissionOverlay() {
        return this.getHighSpeedVideoSizes;
    }

    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        if (i != 69) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= strArr.length) {
                break;
            }
            if (!strArr[i2].equals("android.permission.CAMERA")) {
                i2++;
            } else if (iArr[i2] == 0) {
                android.content.SharedPreferences.Editor edit = this.getHighSpeedVideoFpsRanges.IllIIIllII().edit();
                edit.putBoolean("DeniedPermission", false);
                edit.apply();
                this.getHighSpeedVideoSizes.setVisibility(8);
                return;
            }
        }
        android.content.SharedPreferences.Editor edit2 = this.getHighSpeedVideoFpsRanges.IllIIIllII().edit();
        edit2.putBoolean("DeniedPermission", true);
        edit2.apply();
        this.getHighSpeedVideoSizes.setVisibility(0);
        android.view.View findViewById = this.getHighSpeedVideoSizes.findViewById(com.microblink.blinkid.library.R.id.camera_ask_permission_button);
        if (this.getHighSpeedVideoFpsRanges.llIIIlllll()) {
            findViewById.setOnClickListener(this.getHighSpeedVideoFpsRangesFor);
        } else {
            findViewById.setOnClickListener(this.Camera2StreamConfigurationMap);
        }
    }

    public void onResume() {
        if (hasCameraPermission()) {
            android.content.SharedPreferences.Editor edit = this.getHighSpeedVideoFpsRanges.IllIIIllII().edit();
            edit.putBoolean("DeniedPermission", false);
            edit.apply();
        }
    }

    static boolean Camera2StreamConfigurationMap(android.content.Context context) {
        return context.getApplicationContext().getPackageManager().isInstantApp();
    }

    public boolean hasCameraPermission() {
        return this.getHighSpeedVideoFpsRanges.llIIlIlIIl() == 0;
    }

    static void getHighSpeedVideoFpsRanges(com.microblink.blinkid.util.CameraPermissionManager cameraPermissionManager) {
        if (cameraPermissionManager.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        cameraPermissionManager.getHighSpeedVideoFpsRanges.llIIlIlIIl(new java.lang.String[]{"android.permission.CAMERA"});
        cameraPermissionManager.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    public CameraPermissionManager(android.app.Fragment fragment) {
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.secured.lIIIIIllIl(fragment);
        android.view.View inflate = fragment.getActivity().getLayoutInflater().inflate(com.microblink.blinkid.resources.Layouts.IlIllIlIIl, (android.view.ViewGroup) null);
        this.getHighSpeedVideoSizes = inflate;
        inflate.setVisibility(8);
    }

    public CameraPermissionManager(androidx.fragment.app.Fragment fragment) {
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.secured.lIIIIIllIl(fragment);
        android.view.View inflate = fragment.getLayoutInflater().inflate(com.microblink.blinkid.resources.Layouts.IlIllIlIIl, (android.view.ViewGroup) null);
        this.getHighSpeedVideoSizes = inflate;
        inflate.setVisibility(8);
    }
}
