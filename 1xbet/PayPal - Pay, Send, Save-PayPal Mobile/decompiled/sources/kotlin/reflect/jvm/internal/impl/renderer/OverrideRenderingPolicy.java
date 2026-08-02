package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class OverrideRenderingPolicy {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy RENDER_OPEN;
    public static final kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy RENDER_OPEN_OVERRIDE;
    public static final kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy RENDER_OVERRIDE;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy[] getHighSpeedVideoSizes;

    private OverrideRenderingPolicy(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy overrideRenderingPolicy = new kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy("RENDER_OVERRIDE", 0);
        RENDER_OVERRIDE = overrideRenderingPolicy;
        kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy overrideRenderingPolicy2 = new kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy("RENDER_OPEN", 1);
        RENDER_OPEN = overrideRenderingPolicy2;
        kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy overrideRenderingPolicy3 = new kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2);
        RENDER_OPEN_OVERRIDE = overrideRenderingPolicy3;
        kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy[] overrideRenderingPolicyArr = {overrideRenderingPolicy, overrideRenderingPolicy2, overrideRenderingPolicy3};
        getHighSpeedVideoSizes = overrideRenderingPolicyArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(overrideRenderingPolicyArr);
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy[] values() {
        return (kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy.class, str);
    }
}
