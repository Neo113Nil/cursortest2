package com.onesignal.core.internal.features;

import java.util.Set;
import kotlin.jvm.internal.i;
import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FeatureFlag {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ FeatureFlag[] $VALUES;
    public static final FeatureFlag SDK_BACKGROUND_THREADING = new FeatureFlag("SDK_BACKGROUND_THREADING", 0, "sdk_background_threading", FeatureActivationMode.APP_STARTUP);
    public static final FeatureFlag SDK_IDENTITY_VERIFICATION = new FeatureFlag("SDK_IDENTITY_VERIFICATION", 1, "sdk_identity_verification", FeatureActivationMode.IMMEDIATE);
    private final FeatureActivationMode activationMode;
    private final String key;

    private static final /* synthetic */ FeatureFlag[] $values() {
        return new FeatureFlag[]{SDK_BACKGROUND_THREADING, SDK_IDENTITY_VERIFICATION};
    }

    static {
        FeatureFlag[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
    }

    private FeatureFlag(String str, int i2, String str2, FeatureActivationMode featureActivationMode) {
        this.key = str2;
        this.activationMode = featureActivationMode;
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static FeatureFlag valueOf(String str) {
        return (FeatureFlag) Enum.valueOf(FeatureFlag.class, str);
    }

    public static FeatureFlag[] values() {
        return (FeatureFlag[]) $VALUES.clone();
    }

    public final FeatureActivationMode getActivationMode() {
        return this.activationMode;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean isEnabledIn(Set<String> enabledKeys) {
        i.e(enabledKeys, "enabledKeys");
        return enabledKeys.contains(this.key);
    }
}
