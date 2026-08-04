package io.sentry.android.core.internal.util;

import io.sentry.protocol.Device;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceOrientations {
    private DeviceOrientations() {
    }

    public static Device.DeviceOrientation getOrientation(int i7) {
        if (i7 == 1) {
            return Device.DeviceOrientation.PORTRAIT;
        }
        if (i7 != 2) {
            return null;
        }
        return Device.DeviceOrientation.LANDSCAPE;
    }
}
