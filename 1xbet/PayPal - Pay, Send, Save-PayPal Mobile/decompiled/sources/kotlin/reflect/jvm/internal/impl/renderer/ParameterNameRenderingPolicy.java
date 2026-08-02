package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ParameterNameRenderingPolicy {
    public static final kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy ALL;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[] Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy NONE;
    public static final kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy ONLY_NON_SYNTHESIZED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ParameterNameRenderingPolicy(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy parameterNameRenderingPolicy = new kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy("ALL", 0);
        ALL = parameterNameRenderingPolicy;
        kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy parameterNameRenderingPolicy2 = new kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);
        ONLY_NON_SYNTHESIZED = parameterNameRenderingPolicy2;
        kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy parameterNameRenderingPolicy3 = new kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy("NONE", 2);
        NONE = parameterNameRenderingPolicy3;
        kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[] parameterNameRenderingPolicyArr = {parameterNameRenderingPolicy, parameterNameRenderingPolicy2, parameterNameRenderingPolicy3};
        Camera2StreamConfigurationMap = parameterNameRenderingPolicyArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(parameterNameRenderingPolicyArr);
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[] values() {
        return (kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.class, str);
    }
}
