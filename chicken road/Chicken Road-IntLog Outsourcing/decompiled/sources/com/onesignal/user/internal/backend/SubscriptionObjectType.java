package com.onesignal.user.internal.backend;

import B4.r;
import C1.b;
import com.onesignal.core.internal.device.IDeviceService;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SubscriptionObjectType {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ SubscriptionObjectType[] $VALUES;
    public static final Companion Companion;
    private final String value;
    public static final SubscriptionObjectType IOS_PUSH = new SubscriptionObjectType("IOS_PUSH", 0, "iOSPush");
    public static final SubscriptionObjectType ANDROID_PUSH = new SubscriptionObjectType("ANDROID_PUSH", 1, "AndroidPush");
    public static final SubscriptionObjectType FIREOS_PUSH = new SubscriptionObjectType("FIREOS_PUSH", 2, "FireOSPush");
    public static final SubscriptionObjectType CHROME_EXTENSION = new SubscriptionObjectType("CHROME_EXTENSION", 3, "ChromeExtensionPush");
    public static final SubscriptionObjectType CHROME_PUSH = new SubscriptionObjectType("CHROME_PUSH", 4, "ChromePush");
    public static final SubscriptionObjectType WINDOWS_PUSH = new SubscriptionObjectType("WINDOWS_PUSH", 5, "WindowsPush");
    public static final SubscriptionObjectType SAFARI_PUSH = new SubscriptionObjectType("SAFARI_PUSH", 6, "SafariPush");
    public static final SubscriptionObjectType SAFARI_PUSH_LEGACY = new SubscriptionObjectType("SAFARI_PUSH_LEGACY", 7, "SafariLegacyPush");
    public static final SubscriptionObjectType FIREFOX_PUSH = new SubscriptionObjectType("FIREFOX_PUSH", 8, "FirefoxPush");
    public static final SubscriptionObjectType MACOS_PUSH = new SubscriptionObjectType("MACOS_PUSH", 9, "macOSPush");
    public static final SubscriptionObjectType EMAIL = new SubscriptionObjectType("EMAIL", 10, "Email");
    public static final SubscriptionObjectType HUAWEI_PUSH = new SubscriptionObjectType("HUAWEI_PUSH", 11, "HuaweiPush");
    public static final SubscriptionObjectType SMS = new SubscriptionObjectType("SMS", 12, "SMS");

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IDeviceService.DeviceType.values().length];
                try {
                    iArr[IDeviceService.DeviceType.Android.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IDeviceService.DeviceType.Fire.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IDeviceService.DeviceType.Huawei.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final SubscriptionObjectType fromDeviceType(IDeviceService.DeviceType type) {
            i.e(type, "type");
            int i2 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i2 == 1) {
                return SubscriptionObjectType.ANDROID_PUSH;
            }
            if (i2 == 2) {
                return SubscriptionObjectType.FIREOS_PUSH;
            }
            if (i2 == 3) {
                return SubscriptionObjectType.HUAWEI_PUSH;
            }
            throw new b();
        }

        public final SubscriptionObjectType fromString(String type) {
            i.e(type, "type");
            for (SubscriptionObjectType subscriptionObjectType : SubscriptionObjectType.values()) {
                if (r.I(subscriptionObjectType.getValue(), type)) {
                    return subscriptionObjectType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SubscriptionObjectType[] $values() {
        return new SubscriptionObjectType[]{IOS_PUSH, ANDROID_PUSH, FIREOS_PUSH, CHROME_EXTENSION, CHROME_PUSH, WINDOWS_PUSH, SAFARI_PUSH, SAFARI_PUSH_LEGACY, FIREFOX_PUSH, MACOS_PUSH, EMAIL, HUAWEI_PUSH, SMS};
    }

    static {
        SubscriptionObjectType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
        Companion = new Companion(null);
    }

    private SubscriptionObjectType(String str, int i2, String str2) {
        this.value = str2;
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionObjectType valueOf(String str) {
        return (SubscriptionObjectType) Enum.valueOf(SubscriptionObjectType.class, str);
    }

    public static SubscriptionObjectType[] values() {
        return (SubscriptionObjectType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
