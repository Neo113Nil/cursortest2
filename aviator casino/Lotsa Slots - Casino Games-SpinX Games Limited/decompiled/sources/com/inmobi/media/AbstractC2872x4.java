package com.inmobi.media;

/* renamed from: com.inmobi.media.x4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2872x4 {
    public static final java.lang.String a(java.lang.Class clazz) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (kotlin.jvm.internal.Intrinsics.areEqual(clazz, com.inmobi.media.core.config.models.RootConfig.class)) {
            return "root";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(clazz, com.inmobi.media.core.config.models.AdConfig.class)) {
            return "ads";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(clazz, com.inmobi.media.core.config.models.TelemetryConfig.class)) {
            return "telemetry";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(clazz, com.inmobi.media.core.config.models.SignalsConfig.class)) {
            return "signals";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(clazz, com.inmobi.media.core.config.models.CrashConfig.class)) {
            return "crashReporting";
        }
        throw new java.lang.IllegalArgumentException("Type: " + clazz);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final java.lang.Class a(java.lang.String configType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    return com.inmobi.media.core.config.models.CrashConfig.class;
                }
                break;
            case 96432:
                if (configType.equals("ads")) {
                    return com.inmobi.media.core.config.models.AdConfig.class;
                }
                break;
            case 3506402:
                if (configType.equals("root")) {
                    return com.inmobi.media.core.config.models.RootConfig.class;
                }
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    return com.inmobi.media.core.config.models.TelemetryConfig.class;
                }
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    return com.inmobi.media.core.config.models.SignalsConfig.class;
                }
                break;
        }
        throw new java.lang.IllegalArgumentException("Type: " + configType);
    }
}
