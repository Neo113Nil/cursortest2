package kotlinx.datetime.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlinx/datetime/format/WhenToOutput;", "", "<init>", "(Ljava/lang/String;I)V", "NEVER", "IF_NONZERO", "ALWAYS"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WhenToOutput {
    public static final kotlinx.datetime.format.WhenToOutput ALWAYS;
    public static final kotlinx.datetime.format.WhenToOutput IF_NONZERO;
    public static final kotlinx.datetime.format.WhenToOutput NEVER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlinx.datetime.format.WhenToOutput[] getHighSpeedVideoFpsRanges;

    private WhenToOutput(java.lang.String str, int i) {
    }

    static {
        kotlinx.datetime.format.WhenToOutput whenToOutput = new kotlinx.datetime.format.WhenToOutput("NEVER", 0);
        NEVER = whenToOutput;
        kotlinx.datetime.format.WhenToOutput whenToOutput2 = new kotlinx.datetime.format.WhenToOutput("IF_NONZERO", 1);
        IF_NONZERO = whenToOutput2;
        kotlinx.datetime.format.WhenToOutput whenToOutput3 = new kotlinx.datetime.format.WhenToOutput("ALWAYS", 2);
        ALWAYS = whenToOutput3;
        kotlinx.datetime.format.WhenToOutput[] whenToOutputArr = {whenToOutput, whenToOutput2, whenToOutput3};
        getHighSpeedVideoFpsRanges = whenToOutputArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(whenToOutputArr);
    }

    public static kotlinx.datetime.format.WhenToOutput valueOf(java.lang.String str) {
        return (kotlinx.datetime.format.WhenToOutput) java.lang.Enum.valueOf(kotlinx.datetime.format.WhenToOutput.class, str);
    }

    public static kotlinx.datetime.format.WhenToOutput[] values() {
        return (kotlinx.datetime.format.WhenToOutput[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.enums.EnumEntries<kotlinx.datetime.format.WhenToOutput> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
