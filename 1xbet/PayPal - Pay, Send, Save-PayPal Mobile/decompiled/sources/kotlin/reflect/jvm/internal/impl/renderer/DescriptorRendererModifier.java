package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DescriptorRendererModifier {
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier ACTUAL;
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> ALL;
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> ALL_EXCEPT_ANNOTATIONS;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier ANNOTATIONS;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier CONST;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.Companion Companion;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier DATA;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier EXPECT;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier FUN;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier INLINE;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier INNER;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier LATEINIT;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier MEMBER_KIND;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier MODALITY;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier OVERRIDE;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier VALUE;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier VISIBILITY;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;

    private DescriptorRendererModifier(java.lang.String str, int i, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    static {
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("VISIBILITY", 0, true);
        VISIBILITY = descriptorRendererModifier;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier2 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("MODALITY", 1, true);
        MODALITY = descriptorRendererModifier2;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier3 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("OVERRIDE", 2, true);
        OVERRIDE = descriptorRendererModifier3;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier4 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("ANNOTATIONS", 3, false);
        ANNOTATIONS = descriptorRendererModifier4;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier5 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("INNER", 4, true);
        INNER = descriptorRendererModifier5;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier6 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("MEMBER_KIND", 5, true);
        MEMBER_KIND = descriptorRendererModifier6;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier7 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("DATA", 6, true);
        DATA = descriptorRendererModifier7;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier8 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("INLINE", 7, true);
        INLINE = descriptorRendererModifier8;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier9 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("EXPECT", 8, true);
        EXPECT = descriptorRendererModifier9;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier10 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("ACTUAL", 9, true);
        ACTUAL = descriptorRendererModifier10;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier11 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("CONST", 10, true);
        CONST = descriptorRendererModifier11;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier12 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("LATEINIT", 11, true);
        LATEINIT = descriptorRendererModifier12;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier13 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("FUN", 12, true);
        FUN = descriptorRendererModifier13;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier14 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier("VALUE", 13, true);
        VALUE = descriptorRendererModifier14;
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] descriptorRendererModifierArr = {descriptorRendererModifier, descriptorRendererModifier2, descriptorRendererModifier3, descriptorRendererModifier4, descriptorRendererModifier5, descriptorRendererModifier6, descriptorRendererModifier7, descriptorRendererModifier8, descriptorRendererModifier9, descriptorRendererModifier10, descriptorRendererModifier11, descriptorRendererModifier12, descriptorRendererModifier13, descriptorRendererModifier14};
        getHighSpeedVideoFpsRanges = descriptorRendererModifierArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(descriptorRendererModifierArr);
        Companion = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.Companion(null);
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] values = values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier15 : values) {
            if (descriptorRendererModifier15.getHighSpeedVideoFpsRangesFor) {
                arrayList.add(descriptorRendererModifier15);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = kotlin.collections.CollectionsKt.toSet(arrayList);
        ALL = kotlin.collections.ArraysKt.toSet(values());
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] values() {
        return (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.class, str);
    }
}
