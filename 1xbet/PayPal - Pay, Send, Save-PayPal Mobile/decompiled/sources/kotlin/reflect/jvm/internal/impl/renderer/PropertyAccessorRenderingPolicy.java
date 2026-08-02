package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class PropertyAccessorRenderingPolicy {
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[] Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy DEBUG;
    public static final kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy NONE;
    public static final kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy PRETTY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private PropertyAccessorRenderingPolicy(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy = new kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy("PRETTY", 0);
        PRETTY = propertyAccessorRenderingPolicy;
        kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy2 = new kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy("DEBUG", 1);
        DEBUG = propertyAccessorRenderingPolicy2;
        kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy3 = new kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy("NONE", 2);
        NONE = propertyAccessorRenderingPolicy3;
        kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[] propertyAccessorRenderingPolicyArr = {propertyAccessorRenderingPolicy, propertyAccessorRenderingPolicy2, propertyAccessorRenderingPolicy3};
        Camera2StreamConfigurationMap = propertyAccessorRenderingPolicyArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(propertyAccessorRenderingPolicyArr);
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[] values() {
        return (kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.class, str);
    }
}
