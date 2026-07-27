package com.onesignal.core.internal.device;

import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public interface IDeviceService {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DeviceType {
        private static final /* synthetic */ InterfaceC1344a $ENTRIES;
        private static final /* synthetic */ DeviceType[] $VALUES;
        private final int value;
        public static final DeviceType Fire = new DeviceType("Fire", 0, 2);
        public static final DeviceType Android = new DeviceType("Android", 1, 1);
        public static final DeviceType Huawei = new DeviceType("Huawei", 2, 13);

        private static final /* synthetic */ DeviceType[] $values() {
            return new DeviceType[]{Fire, Android, Huawei};
        }

        static {
            DeviceType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC1477a.n($values);
        }

        private DeviceType(String str, int i2, int i3) {
            this.value = i3;
        }

        public static InterfaceC1344a getEntries() {
            return $ENTRIES;
        }

        public static DeviceType valueOf(String str) {
            return (DeviceType) Enum.valueOf(DeviceType.class, str);
        }

        public static DeviceType[] values() {
            return (DeviceType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class JetpackLibraryStatus {
        private static final /* synthetic */ InterfaceC1344a $ENTRIES;
        private static final /* synthetic */ JetpackLibraryStatus[] $VALUES;
        public static final JetpackLibraryStatus MISSING = new JetpackLibraryStatus("MISSING", 0);
        public static final JetpackLibraryStatus OUTDATED = new JetpackLibraryStatus("OUTDATED", 1);
        public static final JetpackLibraryStatus OK = new JetpackLibraryStatus("OK", 2);

        private static final /* synthetic */ JetpackLibraryStatus[] $values() {
            return new JetpackLibraryStatus[]{MISSING, OUTDATED, OK};
        }

        static {
            JetpackLibraryStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC1477a.n($values);
        }

        private JetpackLibraryStatus(String str, int i2) {
        }

        public static InterfaceC1344a getEntries() {
            return $ENTRIES;
        }

        public static JetpackLibraryStatus valueOf(String str) {
            return (JetpackLibraryStatus) Enum.valueOf(JetpackLibraryStatus.class, str);
        }

        public static JetpackLibraryStatus[] values() {
            return (JetpackLibraryStatus[]) $VALUES.clone();
        }
    }

    DeviceType getDeviceType();

    boolean getHasAllHMSLibrariesForPushKit();

    boolean getHasFCMLibrary();

    JetpackLibraryStatus getJetpackLibraryStatus();

    boolean getSupportsHMS();

    boolean isAndroidDeviceType();

    boolean isFireOSDeviceType();

    boolean isGMSInstalledAndEnabled();

    boolean isHuaweiDeviceType();

    boolean supportsGooglePush();
}
