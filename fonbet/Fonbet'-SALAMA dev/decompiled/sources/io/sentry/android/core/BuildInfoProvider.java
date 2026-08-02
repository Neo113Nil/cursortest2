package io.sentry.android.core;

import android.os.Build;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.protocol.Device;
import io.sentry.util.Objects;

/* loaded from: classes2.dex */
public final class BuildInfoProvider {
    final ILogger logger;

    public BuildInfoProvider(ILogger iLogger) {
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "The ILogger object is required.");
    }

    public String getBuildTags() {
        return Build.TAGS;
    }

    public String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public String getModel() {
        return Build.MODEL;
    }

    public int getSdkInfoVersion() {
        return Build.VERSION.SDK_INT;
    }

    public String getVersionRelease() {
        return Build.VERSION.RELEASE;
    }

    public Boolean isEmulator() {
        boolean z4;
        try {
            if (Build.BRAND.startsWith("generic")) {
                if (!Build.DEVICE.startsWith("generic")) {
                }
                z4 = true;
                return Boolean.valueOf(z4);
            }
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains(Device.JsonKeys.SIMULATOR)) {
                            z4 = false;
                            return Boolean.valueOf(z4);
                        }
                    }
                }
            }
            z4 = true;
            return Boolean.valueOf(z4);
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error checking whether application is running in an emulator.", th);
            return null;
        }
    }
}
