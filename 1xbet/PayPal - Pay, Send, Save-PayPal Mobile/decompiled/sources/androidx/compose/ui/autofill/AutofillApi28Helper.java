package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi28Helper;", "", "<init>", "()V", "Landroid/view/ViewStructure;", "structure", "", "length", "", "setMaxTextLength", "(Landroid/view/ViewStructure;I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutofillApi28Helper {
    public static final int $stable = 0;
    public static final androidx.compose.ui.autofill.AutofillApi28Helper INSTANCE = new androidx.compose.ui.autofill.AutofillApi28Helper();

    private AutofillApi28Helper() {
    }

    public final void setMaxTextLength(android.view.ViewStructure structure, int length) {
        structure.setMaxTextLength(length);
    }
}
