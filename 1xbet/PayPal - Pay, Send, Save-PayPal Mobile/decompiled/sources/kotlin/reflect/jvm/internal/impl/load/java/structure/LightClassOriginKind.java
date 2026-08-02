package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class LightClassOriginKind {
    public static final kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind BINARY;
    public static final kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind SOURCE;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private LightClassOriginKind(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind lightClassOriginKind = new kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind("SOURCE", 0);
        SOURCE = lightClassOriginKind;
        kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind lightClassOriginKind2 = new kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind("BINARY", 1);
        BINARY = lightClassOriginKind2;
        kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind[] lightClassOriginKindArr = {lightClassOriginKind, lightClassOriginKind2};
        getHighResolutionOutputSizeshNQ4ISI = lightClassOriginKindArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(lightClassOriginKindArr);
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind[] values() {
        return (kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.class, str);
    }
}
