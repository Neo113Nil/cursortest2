package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class KmEffectType {
    public static final kotlin.reflect.jvm.internal.impl.km.KmEffectType CALLS;
    public static final kotlin.reflect.jvm.internal.impl.km.KmEffectType RETURNS_CONSTANT;
    public static final kotlin.reflect.jvm.internal.impl.km.KmEffectType RETURNS_NOT_NULL;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmEffectType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private KmEffectType(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.km.KmEffectType kmEffectType = new kotlin.reflect.jvm.internal.impl.km.KmEffectType("RETURNS_CONSTANT", 0);
        RETURNS_CONSTANT = kmEffectType;
        kotlin.reflect.jvm.internal.impl.km.KmEffectType kmEffectType2 = new kotlin.reflect.jvm.internal.impl.km.KmEffectType("CALLS", 1);
        CALLS = kmEffectType2;
        kotlin.reflect.jvm.internal.impl.km.KmEffectType kmEffectType3 = new kotlin.reflect.jvm.internal.impl.km.KmEffectType("RETURNS_NOT_NULL", 2);
        RETURNS_NOT_NULL = kmEffectType3;
        kotlin.reflect.jvm.internal.impl.km.KmEffectType[] kmEffectTypeArr = {kmEffectType, kmEffectType2, kmEffectType3};
        getHighSpeedVideoFpsRanges = kmEffectTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(kmEffectTypeArr);
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmEffectType[] values() {
        return (kotlin.reflect.jvm.internal.impl.km.KmEffectType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmEffectType valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.km.KmEffectType) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.km.KmEffectType.class, str);
    }
}
