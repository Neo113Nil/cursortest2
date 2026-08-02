package kotlin.reflect.jvm.internal.impl.types.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class TypeVariance {
    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeVariance IN;
    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeVariance INV;
    public static final kotlin.reflect.jvm.internal.impl.types.model.TypeVariance OUT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String Camera2StreamConfigurationMap;

    private TypeVariance(java.lang.String str, int i, java.lang.String str2) {
        this.Camera2StreamConfigurationMap = str2;
    }

    static {
        kotlin.reflect.jvm.internal.impl.types.model.TypeVariance typeVariance = new kotlin.reflect.jvm.internal.impl.types.model.TypeVariance("IN", 0, "in");
        IN = typeVariance;
        kotlin.reflect.jvm.internal.impl.types.model.TypeVariance typeVariance2 = new kotlin.reflect.jvm.internal.impl.types.model.TypeVariance("OUT", 1, "out");
        OUT = typeVariance2;
        kotlin.reflect.jvm.internal.impl.types.model.TypeVariance typeVariance3 = new kotlin.reflect.jvm.internal.impl.types.model.TypeVariance("INV", 2, "");
        INV = typeVariance3;
        kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[] typeVarianceArr = {typeVariance, typeVariance2, typeVariance3};
        getHighSpeedVideoFpsRangesFor = typeVarianceArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(typeVarianceArr);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.Camera2StreamConfigurationMap;
    }

    public static kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[] values() {
        return (kotlin.reflect.jvm.internal.impl.types.model.TypeVariance[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.types.model.TypeVariance valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.types.model.TypeVariance) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.class, str);
    }
}
