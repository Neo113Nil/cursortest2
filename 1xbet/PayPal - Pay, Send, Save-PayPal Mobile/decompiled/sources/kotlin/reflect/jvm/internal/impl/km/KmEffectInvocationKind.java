package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class KmEffectInvocationKind {
    public static final kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind AT_LEAST_ONCE;
    public static final kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind AT_MOST_ONCE;
    public static final kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind EXACTLY_ONCE;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private KmEffectInvocationKind(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind kmEffectInvocationKind = new kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind("AT_MOST_ONCE", 0);
        AT_MOST_ONCE = kmEffectInvocationKind;
        kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind kmEffectInvocationKind2 = new kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind("EXACTLY_ONCE", 1);
        EXACTLY_ONCE = kmEffectInvocationKind2;
        kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind kmEffectInvocationKind3 = new kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind("AT_LEAST_ONCE", 2);
        AT_LEAST_ONCE = kmEffectInvocationKind3;
        kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind[] kmEffectInvocationKindArr = {kmEffectInvocationKind, kmEffectInvocationKind2, kmEffectInvocationKind3};
        getHighResolutionOutputSizeshNQ4ISI = kmEffectInvocationKindArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(kmEffectInvocationKindArr);
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind[] values() {
        return (kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind.class, str);
    }
}
