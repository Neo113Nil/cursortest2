package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Modality {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Modality ABSTRACT;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Modality.Companion Companion;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Modality FINAL;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Modality OPEN;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Modality SEALED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.Modality[] getHighSpeedVideoFpsRangesFor;

    private Modality(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = new kotlin.reflect.jvm.internal.impl.descriptors.Modality("FINAL", 0);
        FINAL = modality;
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality2 = new kotlin.reflect.jvm.internal.impl.descriptors.Modality("SEALED", 1);
        SEALED = modality2;
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality3 = new kotlin.reflect.jvm.internal.impl.descriptors.Modality("OPEN", 2);
        OPEN = modality3;
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality4 = new kotlin.reflect.jvm.internal.impl.descriptors.Modality("ABSTRACT", 3);
        ABSTRACT = modality4;
        kotlin.reflect.jvm.internal.impl.descriptors.Modality[] modalityArr = {modality, modality2, modality3, modality4};
        getHighSpeedVideoFpsRangesFor = modalityArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(modalityArr);
        Companion = new kotlin.reflect.jvm.internal.impl.descriptors.Modality.Companion(null);
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.Modality convertFromFlags(boolean z, boolean z2, boolean z3) {
            if (z) {
                return kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED;
            }
            if (z2) {
                return kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;
            }
            if (z3) {
                return kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;
            }
            return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.Modality[] values() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.Modality[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.Modality valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.Modality) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.Modality.class, str);
    }
}
