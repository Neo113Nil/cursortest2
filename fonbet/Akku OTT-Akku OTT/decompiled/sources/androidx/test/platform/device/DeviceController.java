package androidx.test.platform.device;

import androidx.test.annotation.ExperimentalTestApi;

@ExperimentalTestApi
/* loaded from: classes3.dex */
public interface DeviceController {

    public enum ScreenOrientation {
        PORTRAIT,
        LANDSCAPE
    }

    void setDeviceMode(int i);

    void setScreenOrientation(int i);
}
