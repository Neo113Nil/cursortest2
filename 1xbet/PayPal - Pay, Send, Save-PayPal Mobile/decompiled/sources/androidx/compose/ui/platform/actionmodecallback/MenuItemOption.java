package androidx.compose.ui.platform.actionmodecallback;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "id", com.visa.cbp.getEncExpo.warmup, "getId", "()I", "getTitleResource", "titleResource", "order", "getOrder", "Copy", "Paste", "Cut", "SelectAll", "Autofill"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MenuItemOption {
    public static final androidx.compose.ui.platform.actionmodecallback.MenuItemOption Autofill;
    private static final /* synthetic */ androidx.compose.ui.platform.actionmodecallback.MenuItemOption[] Camera2StreamConfigurationMap;
    public static final androidx.compose.ui.platform.actionmodecallback.MenuItemOption Copy;
    public static final androidx.compose.ui.platform.actionmodecallback.MenuItemOption Cut;
    public static final androidx.compose.ui.platform.actionmodecallback.MenuItemOption Paste;
    public static final androidx.compose.ui.platform.actionmodecallback.MenuItemOption SelectAll;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final int id;
    private final int order;

    private MenuItemOption(java.lang.String str, int i, int i2) {
        this.id = i2;
        this.order = i2;
    }

    public final int getId() {
        return this.id;
    }

    static {
        androidx.compose.ui.platform.actionmodecallback.MenuItemOption menuItemOption = new androidx.compose.ui.platform.actionmodecallback.MenuItemOption("Copy", 0, 0);
        Copy = menuItemOption;
        androidx.compose.ui.platform.actionmodecallback.MenuItemOption menuItemOption2 = new androidx.compose.ui.platform.actionmodecallback.MenuItemOption("Paste", 1, 1);
        Paste = menuItemOption2;
        androidx.compose.ui.platform.actionmodecallback.MenuItemOption menuItemOption3 = new androidx.compose.ui.platform.actionmodecallback.MenuItemOption("Cut", 2, 2);
        Cut = menuItemOption3;
        androidx.compose.ui.platform.actionmodecallback.MenuItemOption menuItemOption4 = new androidx.compose.ui.platform.actionmodecallback.MenuItemOption("SelectAll", 3, 3);
        SelectAll = menuItemOption4;
        androidx.compose.ui.platform.actionmodecallback.MenuItemOption menuItemOption5 = new androidx.compose.ui.platform.actionmodecallback.MenuItemOption("Autofill", 4, 4);
        Autofill = menuItemOption5;
        androidx.compose.ui.platform.actionmodecallback.MenuItemOption[] menuItemOptionArr = {menuItemOption, menuItemOption2, menuItemOption3, menuItemOption4, menuItemOption5};
        Camera2StreamConfigurationMap = menuItemOptionArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(menuItemOptionArr);
    }

    public final int getTitleResource() {
        int i = androidx.compose.ui.platform.actionmodecallback.MenuItemOption.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return android.R.string.copy;
        }
        if (i == 2) {
            return android.R.string.paste;
        }
        if (i == 3) {
            return android.R.string.cut;
        }
        if (i == 4) {
            return android.R.string.selectAll;
        }
        if (i == 5) {
            return android.os.Build.VERSION.SDK_INT <= 26 ? androidx.compose.ui.R.string.androidx_compose_ui_autofill : android.R.string.autofill;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final int getOrder() {
        return this.order;
    }

    public static androidx.compose.ui.platform.actionmodecallback.MenuItemOption[] values() {
        return (androidx.compose.ui.platform.actionmodecallback.MenuItemOption[]) Camera2StreamConfigurationMap.clone();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.platform.actionmodecallback.MenuItemOption.values().length];
            try {
                iArr[androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Copy.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Paste.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Cut.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.platform.actionmodecallback.MenuItemOption.SelectAll.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.ui.platform.actionmodecallback.MenuItemOption.Autofill.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static androidx.compose.ui.platform.actionmodecallback.MenuItemOption valueOf(java.lang.String str) {
        return (androidx.compose.ui.platform.actionmodecallback.MenuItemOption) java.lang.Enum.valueOf(androidx.compose.ui.platform.actionmodecallback.MenuItemOption.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.ui.platform.actionmodecallback.MenuItemOption> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
