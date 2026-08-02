package com.microblink.blinkid.fragment.overlay.components;

/* loaded from: classes10.dex */
public class ErrorDialogFactory {

    /* renamed from: com.microblink.blinkid.fragment.overlay.components.ErrorDialogFactory$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.microblink.blinkid.view.NotSupportedReason.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.microblink.blinkid.view.NotSupportedReason.CUSTOM_UI_FORBIDDEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.view.NotSupportedReason.INVALID_OR_MISSING_LICENSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.view.NotSupportedReason.UNSUPPORTED_ANDROID_VERSION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.view.NotSupportedReason.BLACKLISTED_DEVICE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.view.NotSupportedReason.NO_CAMERA.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.view.NotSupportedReason.UNSUPPORTED_PROCESSOR_ARCHITECTURE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    private static android.app.AlertDialog getHighSpeedVideoFpsRanges(android.app.Activity activity, final java.lang.Runnable runnable, java.lang.String str, java.lang.String str2) {
        return new android.app.AlertDialog.Builder(activity).setTitle(str).setMessage(str2).setNeutralButton(activity.getString(com.microblink.blinkid.library.R.string.mb_dismiss_error_dialog), new android.content.DialogInterface.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.components.ErrorDialogFactory.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                runnable.run();
            }
        }).setCancelable(false).create();
    }

    public android.app.AlertDialog createErrorDialog(android.app.Activity activity, java.lang.Throwable th, java.lang.Runnable runnable) {
        java.lang.String string;
        java.lang.String string2 = activity.getString(com.microblink.blinkid.library.R.string.mb_warning_title);
        if (th instanceof com.microblink.blinkid.hardware.camera.CameraResolutionTooSmallException) {
            com.microblink.blinkid.util.Log.e(this, th, "Camera resolution too low!", new java.lang.Object[0]);
            return getHighSpeedVideoFpsRanges(activity, runnable, string2, activity.getString(com.microblink.blinkid.library.R.string.mb_feature_unsupported_device));
        }
        if (th instanceof com.microblink.blinkid.recognition.RecognizerError) {
            com.microblink.blinkid.util.Log.e(this, th, "There was an error starting a native recognizer. Reason: {}", th.getMessage());
            return getHighSpeedVideoFpsRanges(activity, runnable, string2, activity.getString(com.microblink.blinkid.library.R.string.mb_error_initializing));
        }
        if (th instanceof java.lang.UnsatisfiedLinkError) {
            com.microblink.blinkid.util.Log.e(this, th, "Native library not loaded!", new java.lang.Object[0]);
            return getHighSpeedVideoFpsRanges(activity, runnable, string2, activity.getString(com.microblink.blinkid.library.R.string.mb_error_initializing));
        }
        if (th instanceof com.microblink.blinkid.hardware.camera.AutoFocusRequiredButNotSupportedException) {
            com.microblink.blinkid.util.Log.e(this, th, "Autofocus required, but not supported!", new java.lang.Object[0]);
            return getHighSpeedVideoFpsRanges(activity, runnable, string2, activity.getString(com.microblink.blinkid.library.R.string.mb_feature_unsupported_autofocus));
        }
        if (!(th instanceof com.microblink.blinkid.recognition.FeatureNotSupportedException)) {
            if (!(th instanceof java.lang.SecurityException)) {
                return th instanceof com.microblink.blinkid.licence.exception.LicenceLockedException ? getHighSpeedVideoFpsRanges(activity, runnable, "", activity.getString(com.microblink.blinkid.library.R.string.mb_licence_locked)) : th instanceof com.microblink.blinkid.licence.exception.RemoteLicenceCheckException ? getHighSpeedVideoFpsRanges(activity, runnable, "", activity.getString(com.microblink.blinkid.library.R.string.mb_licence_check_failed)) : getHighSpeedVideoFpsRanges(activity, runnable, string2, activity.getString(com.microblink.blinkid.library.R.string.mb_camera_not_ready));
            }
            com.microblink.blinkid.util.Log.e(this, th, "Camera permission not given!", new java.lang.Object[0]);
            return getHighSpeedVideoFpsRanges(activity, runnable, string2, activity.getString(com.microblink.blinkid.library.R.string.mb_camera_not_allowed));
        }
        switch (com.microblink.blinkid.fragment.overlay.components.ErrorDialogFactory.AnonymousClass2.Camera2StreamConfigurationMap[((com.microblink.blinkid.recognition.FeatureNotSupportedException) th).getReason().ordinal()]) {
            case 1:
                string = activity.getString(com.microblink.blinkid.library.R.string.mb_custom_ui_forbidden);
                break;
            case 2:
                string = activity.getString(com.microblink.blinkid.library.R.string.mb_invalid_license);
                break;
            case 3:
                string = activity.getString(com.microblink.blinkid.library.R.string.mb_feature_unsupported_android_version);
                break;
            case 4:
            case 5:
            case 6:
                string = activity.getString(com.microblink.blinkid.library.R.string.mb_feature_unsupported_device);
                break;
            default:
                string = null;
                break;
        }
        return getHighSpeedVideoFpsRanges(activity, runnable, string2, string);
    }
}
