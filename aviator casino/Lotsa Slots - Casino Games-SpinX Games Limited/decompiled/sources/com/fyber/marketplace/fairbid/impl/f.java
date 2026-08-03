package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public enum f {
    KEY_AVAILABLE_DISK_SPACE("available_disk", "dsk_a", java.lang.Integer.class),
    KEY_HEADSET("headset", "headset", java.lang.Boolean.class),
    KEY_BATTERY_CONNECTED("battery_charging", "btry_c", java.lang.Boolean.class),
    KEY_BATTERY_LEVEL("battery_level", "btry_l", java.lang.Integer.class),
    KEY_BLUETOOTH_CONNECTED("bluetooth_connected", "bt_con", java.lang.Boolean.class),
    KEY_ANDROID_LEVEL("d_api", "d_api", java.lang.Integer.class),
    KEY_AIRPLANE_MODE("apnm", "apnm", java.lang.Boolean.class),
    KEY_DO_NOT_DISTURB("dnd", "dnd", java.lang.Boolean.class),
    KEY_IS_MUTED("is_muted", "is_muted", java.lang.Boolean.class),
    KEY_TOTAL_DISK_SPACE("total_disk", "dsk_t", java.lang.Integer.class),
    KEY_TIME_OF_DAY("time_difference", "tod", java.lang.Integer.class),
    KEY_LOW_POWER_MODE("low_power_mode", "low_power_mode", java.lang.Boolean.class),
    KEY_COUNTRY_CODE("ciso", "ciso", java.lang.String.class),
    KEY_DARK_MODE("dark_mode", "dark_mode", java.lang.Boolean.class),
    KEY_LAST_DOMAIN_SHOWED("last_adomain", "ldomain", java.lang.String.class),
    KEY_LAST_BUNDLE_SHOWED("last_bundle", "lbundle", java.lang.String.class),
    KEY_IGNITE_VERSION("version", "ignitev", java.lang.String.class),
    KEY_IGNITE_PACKAGE_NAME("package_name", "ignitep", java.lang.String.class),
    KEY_MEDIA_MUTED("media_muted", "media_muted", java.lang.Boolean.class),
    KEY_AD_SERVICES_VERSION("asv", "asv", java.lang.Integer.class);

    public java.lang.String fairBidParam;
    public java.lang.String marketPlaceParam;
    public java.lang.Object type;

    f(java.lang.String str, java.lang.String str2, java.lang.Class cls) {
        this.fairBidParam = str;
        this.marketPlaceParam = str2;
        this.type = cls;
    }
}
