package com.microblink.blinkid.fragment.overlay.components.settings;

/* loaded from: classes10.dex */
public class ControlsLayoutConfig {
    public final int backButtonId;
    public final int helpButtonId;
    public final int layoutId;
    public final int statusTextId;
    public final int torchButtonId;

    public ControlsLayoutConfig(int i, int i2, int i3, int i4, int i5) {
        this.layoutId = i;
        this.torchButtonId = i2;
        this.backButtonId = i3;
        this.helpButtonId = i4;
        this.statusTextId = i5;
    }

    public static com.microblink.blinkid.fragment.overlay.components.settings.ControlsLayoutConfig createDefault() {
        return new com.microblink.blinkid.fragment.overlay.components.settings.ControlsLayoutConfig(com.microblink.blinkid.resources.Layouts.IllIIIllII, com.microblink.blinkid.library.R.id.defaultTorchButton, com.microblink.blinkid.library.R.id.defaultBackButton, com.microblink.blinkid.library.R.id.defaultHelpButton, 0);
    }

    public static com.microblink.blinkid.fragment.overlay.components.settings.ControlsLayoutConfig createDefaultWithStatus() {
        return new com.microblink.blinkid.fragment.overlay.components.settings.ControlsLayoutConfig(com.microblink.blinkid.resources.Layouts.llIIIlllll, com.microblink.blinkid.library.R.id.defaultTorchButton, com.microblink.blinkid.library.R.id.defaultBackButton, com.microblink.blinkid.library.R.id.defaultHelpButton, com.microblink.blinkid.library.R.id.defaultStatusTextSwitcher);
    }
}
