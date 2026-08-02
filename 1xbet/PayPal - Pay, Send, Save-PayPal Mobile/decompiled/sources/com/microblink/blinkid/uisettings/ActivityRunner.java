package com.microblink.blinkid.uisettings;

/* loaded from: classes10.dex */
public abstract class ActivityRunner {
    public static final java.lang.String EXTRA_SCAN_EXCEPTION = "com.microblink.blinkid.scanexception";

    public static void startActivityForResult(android.app.Activity activity, int i, com.microblink.blinkid.uisettings.UISettings uISettings) {
        android.content.Intent intent = new android.content.Intent(activity, uISettings.getTargetActivity());
        uISettings.saveToIntent(intent);
        activity.startActivityForResult(intent, i);
    }

    public static void startActivityForResult(android.app.Fragment fragment, int i, com.microblink.blinkid.uisettings.UISettings uISettings) {
        android.content.Intent intent = new android.content.Intent(fragment.getActivity(), uISettings.getTargetActivity());
        uISettings.saveToIntent(intent);
        fragment.startActivityForResult(intent, i);
    }

    public static void startActivityForResult(androidx.fragment.app.Fragment fragment, int i, com.microblink.blinkid.uisettings.UISettings uISettings) {
        android.content.Intent intent = new android.content.Intent(fragment.getActivity(), uISettings.getTargetActivity());
        uISettings.saveToIntent(intent);
        fragment.startActivityForResult(intent, i);
    }
}
