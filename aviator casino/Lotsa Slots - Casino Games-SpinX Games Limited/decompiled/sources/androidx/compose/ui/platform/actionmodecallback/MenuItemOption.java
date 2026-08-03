package androidx.compose.ui.platform.actionmodecallback;

/* compiled from: TextActionModeCallback.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", com.ironsource.C3232q2.u, "getOrder", "titleResource", "getTitleResource", "Copy", "Paste", "Cut", "SelectAll", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum MenuItemOption {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);

    private final int id;
    private final int order;

    /* compiled from: TextActionModeCallback.android.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    MenuItemOption(int i) {
        this.id = i;
        this.order = i;
    }

    public final int getId() {
        return this.id;
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
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final int getOrder() {
        return this.order;
    }
}
