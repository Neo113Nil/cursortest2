package androidx.biometric.auth;

/* loaded from: classes5.dex */
public class AuthPromptHost {
    private androidx.fragment.app.Fragment Camera2StreamConfigurationMap;
    private androidx.fragment.app.FragmentActivity getHighResolutionOutputSizeshNQ4ISI;

    public AuthPromptHost(androidx.fragment.app.FragmentActivity fragmentActivity) {
        this.getHighResolutionOutputSizeshNQ4ISI = fragmentActivity;
    }

    public AuthPromptHost(androidx.fragment.app.Fragment fragment) {
        this.Camera2StreamConfigurationMap = fragment;
    }

    public androidx.fragment.app.FragmentActivity getActivity() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public androidx.fragment.app.Fragment getFragment() {
        return this.Camera2StreamConfigurationMap;
    }
}
