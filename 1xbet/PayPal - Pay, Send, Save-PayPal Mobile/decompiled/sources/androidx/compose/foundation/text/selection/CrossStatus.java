package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/text/selection/CrossStatus;", "", "<init>", "(Ljava/lang/String;I)V", "CROSSED", "NOT_CROSSED", "COLLAPSED"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CrossStatus {
    public static final androidx.compose.foundation.text.selection.CrossStatus COLLAPSED;
    public static final androidx.compose.foundation.text.selection.CrossStatus CROSSED;
    public static final androidx.compose.foundation.text.selection.CrossStatus NOT_CROSSED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ androidx.compose.foundation.text.selection.CrossStatus[] getHighSpeedVideoSizes;

    private CrossStatus(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.selection.CrossStatus crossStatus = new androidx.compose.foundation.text.selection.CrossStatus("CROSSED", 0);
        CROSSED = crossStatus;
        androidx.compose.foundation.text.selection.CrossStatus crossStatus2 = new androidx.compose.foundation.text.selection.CrossStatus("NOT_CROSSED", 1);
        NOT_CROSSED = crossStatus2;
        androidx.compose.foundation.text.selection.CrossStatus crossStatus3 = new androidx.compose.foundation.text.selection.CrossStatus("COLLAPSED", 2);
        COLLAPSED = crossStatus3;
        androidx.compose.foundation.text.selection.CrossStatus[] crossStatusArr = {crossStatus, crossStatus2, crossStatus3};
        getHighSpeedVideoSizes = crossStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(crossStatusArr);
    }

    public static androidx.compose.foundation.text.selection.CrossStatus[] values() {
        return (androidx.compose.foundation.text.selection.CrossStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static androidx.compose.foundation.text.selection.CrossStatus valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.selection.CrossStatus) java.lang.Enum.valueOf(androidx.compose.foundation.text.selection.CrossStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.selection.CrossStatus> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
