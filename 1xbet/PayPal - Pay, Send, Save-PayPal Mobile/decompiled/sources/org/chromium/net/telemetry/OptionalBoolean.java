package org.chromium.net.telemetry;

/* loaded from: classes5.dex */
public enum OptionalBoolean {
    UNSET(0),
    TRUE(1),
    FALSE(2);

    private final int getHighResolutionOutputSizeshNQ4ISI;

    OptionalBoolean(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public final int getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.chromium.net.telemetry.OptionalBoolean fromBoolean(java.lang.Boolean bool) {
        if (bool == null) {
            return UNSET;
        }
        return bool.booleanValue() ? TRUE : FALSE;
    }
}
