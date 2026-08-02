package androidx.compose.ui.focus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "Landroidx/compose/ui/focus/FocusState;", "", "<init>", "(Ljava/lang/String;I)V", "", "isFocused", "()Z", "getHasFocus", "hasFocus", "isCaptured", "Active", "ActiveParent", "Captured", "Inactive"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusStateImpl implements androidx.compose.ui.focus.FocusState {
    private static final /* synthetic */ androidx.compose.ui.focus.FocusStateImpl[] Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.compose.ui.focus.FocusStateImpl Active = new androidx.compose.ui.focus.FocusStateImpl("Active", 0);
    public static final androidx.compose.ui.focus.FocusStateImpl ActiveParent = new androidx.compose.ui.focus.FocusStateImpl("ActiveParent", 1);
    public static final androidx.compose.ui.focus.FocusStateImpl Captured = new androidx.compose.ui.focus.FocusStateImpl("Captured", 2);
    public static final androidx.compose.ui.focus.FocusStateImpl Inactive = new androidx.compose.ui.focus.FocusStateImpl("Inactive", 3);

    private FocusStateImpl(java.lang.String str, int i) {
    }

    static {
        androidx.compose.ui.focus.FocusStateImpl[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap = highSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.focus.FocusState
    public final boolean isFocused() {
        int i = androidx.compose.ui.focus.FocusStateImpl.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public final boolean getHasFocus() {
        int i = androidx.compose.ui.focus.FocusStateImpl.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public final boolean isCaptured() {
        int i = androidx.compose.ui.focus.FocusStateImpl.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3 || i == 4) {
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static androidx.compose.ui.focus.FocusStateImpl[] values() {
        return (androidx.compose.ui.focus.FocusStateImpl[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.compose.ui.focus.FocusStateImpl valueOf(java.lang.String str) {
        return (androidx.compose.ui.focus.FocusStateImpl) java.lang.Enum.valueOf(androidx.compose.ui.focus.FocusStateImpl.class, str);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.focus.FocusStateImpl.values().length];
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Captured.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Active.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static kotlin.enums.EnumEntries<androidx.compose.ui.focus.FocusStateImpl> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    private static final /* synthetic */ androidx.compose.ui.focus.FocusStateImpl[] getHighSpeedVideoFpsRangesFor() {
        return new androidx.compose.ui.focus.FocusStateImpl[]{Active, ActiveParent, Captured, Inactive};
    }
}
