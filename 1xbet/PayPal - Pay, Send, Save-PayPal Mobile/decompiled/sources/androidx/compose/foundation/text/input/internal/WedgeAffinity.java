package androidx.compose.foundation.text.input.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "End"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WedgeAffinity {
    public static final androidx.compose.foundation.text.input.internal.WedgeAffinity End;
    public static final androidx.compose.foundation.text.input.internal.WedgeAffinity Start;
    private static final /* synthetic */ androidx.compose.foundation.text.input.internal.WedgeAffinity[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private WedgeAffinity(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.input.internal.WedgeAffinity wedgeAffinity = new androidx.compose.foundation.text.input.internal.WedgeAffinity("Start", 0);
        Start = wedgeAffinity;
        androidx.compose.foundation.text.input.internal.WedgeAffinity wedgeAffinity2 = new androidx.compose.foundation.text.input.internal.WedgeAffinity("End", 1);
        End = wedgeAffinity2;
        androidx.compose.foundation.text.input.internal.WedgeAffinity[] wedgeAffinityArr = {wedgeAffinity, wedgeAffinity2};
        getHighSpeedVideoFpsRanges = wedgeAffinityArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(wedgeAffinityArr);
    }

    public static androidx.compose.foundation.text.input.internal.WedgeAffinity[] values() {
        return (androidx.compose.foundation.text.input.internal.WedgeAffinity[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.compose.foundation.text.input.internal.WedgeAffinity valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.input.internal.WedgeAffinity) java.lang.Enum.valueOf(androidx.compose.foundation.text.input.internal.WedgeAffinity.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.input.internal.WedgeAffinity> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
