package com.airbnb.lottie.model;

/* loaded from: classes7.dex */
public class Marker {
    private final java.lang.String Camera2StreamConfigurationMap;
    public final float durationFrames;
    public final float startFrame;

    public Marker(java.lang.String str, float f, float f2) {
        this.Camera2StreamConfigurationMap = str;
        this.durationFrames = f2;
        this.startFrame = f;
    }

    public java.lang.String getName() {
        return this.Camera2StreamConfigurationMap;
    }

    public float getStartFrame() {
        return this.startFrame;
    }

    public float getDurationFrames() {
        return this.durationFrames;
    }

    public boolean matchesName(java.lang.String str) {
        if (this.Camera2StreamConfigurationMap.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.Camera2StreamConfigurationMap.endsWith("\r")) {
            java.lang.String str2 = this.Camera2StreamConfigurationMap;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
