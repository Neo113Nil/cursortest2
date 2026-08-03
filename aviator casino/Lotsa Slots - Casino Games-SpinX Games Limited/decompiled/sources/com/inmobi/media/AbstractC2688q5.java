package com.inmobi.media;

/* renamed from: com.inmobi.media.q5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2688q5 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static com.inmobi.media.core.config.models.Config a(java.lang.String configType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    return new com.inmobi.media.core.config.models.CrashConfig();
                }
                break;
            case 96432:
                if (configType.equals("ads")) {
                    return new com.inmobi.media.core.config.models.AdConfig();
                }
                break;
            case 3506402:
                if (configType.equals("root")) {
                    return new com.inmobi.media.core.config.models.RootConfig();
                }
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    return new com.inmobi.media.core.config.models.TelemetryConfig();
                }
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    return new com.inmobi.media.core.config.models.SignalsConfig();
                }
                break;
        }
        throw new java.lang.IllegalArgumentException("Type: " + configType);
    }
}
