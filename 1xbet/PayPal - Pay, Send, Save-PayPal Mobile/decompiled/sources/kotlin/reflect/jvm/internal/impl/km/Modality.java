package kotlin.reflect.jvm.internal.impl.km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Modality {
    public static final kotlin.reflect.jvm.internal.impl.km.Modality ABSTRACT;
    public static final kotlin.reflect.jvm.internal.impl.km.Modality FINAL;
    public static final kotlin.reflect.jvm.internal.impl.km.Modality OPEN;
    public static final kotlin.reflect.jvm.internal.impl.km.Modality SEALED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.Modality[] getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl getHighSpeedVideoSizes;

    private Modality(java.lang.String str, int i, int i2) {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality> flagField = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(flagField, "");
        this.getHighSpeedVideoSizes = new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(flagField, i2);
    }

    static {
        kotlin.reflect.jvm.internal.impl.km.Modality modality = new kotlin.reflect.jvm.internal.impl.km.Modality("FINAL", 0, 0);
        FINAL = modality;
        kotlin.reflect.jvm.internal.impl.km.Modality modality2 = new kotlin.reflect.jvm.internal.impl.km.Modality("OPEN", 1, 1);
        OPEN = modality2;
        kotlin.reflect.jvm.internal.impl.km.Modality modality3 = new kotlin.reflect.jvm.internal.impl.km.Modality("ABSTRACT", 2, 2);
        ABSTRACT = modality3;
        kotlin.reflect.jvm.internal.impl.km.Modality modality4 = new kotlin.reflect.jvm.internal.impl.km.Modality("SEALED", 3, 3);
        SEALED = modality4;
        kotlin.reflect.jvm.internal.impl.km.Modality[] modalityArr = {modality, modality2, modality3, modality4};
        getHighSpeedVideoFpsRangesFor = modalityArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(modalityArr);
    }

    public final kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl getFlag$kotlin_metadata() {
        return this.getHighSpeedVideoSizes;
    }

    public static kotlin.reflect.jvm.internal.impl.km.Modality[] values() {
        return (kotlin.reflect.jvm.internal.impl.km.Modality[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.km.Modality valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.km.Modality) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.km.Modality.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.reflect.jvm.internal.impl.km.Modality> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
