package androidx.compose.ui.autofill;

/* compiled from: AndroidAutofill.android.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/Autofill;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "(Landroid/view/View;Landroidx/compose/ui/autofill/AutofillTree;)V", "autofillManager", "Landroid/view/autofill/AutofillManager;", "getAutofillManager", "()Landroid/view/autofill/AutofillManager;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "getView", "()Landroid/view/View;", "cancelAutofillForNode", "", "autofillNode", "Landroidx/compose/ui/autofill/AutofillNode;", "requestAutofillForNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAutofill implements androidx.compose.ui.autofill.Autofill {
    public static final int $stable = 8;
    private final android.view.autofill.AutofillManager autofillManager;
    private final androidx.compose.ui.autofill.AutofillTree autofillTree;
    private final android.view.View view;

    public AndroidAutofill(android.view.View view, androidx.compose.ui.autofill.AutofillTree autofillTree) {
        this.view = view;
        this.autofillTree = autofillTree;
        android.view.autofill.AutofillManager autofillManager = (android.view.autofill.AutofillManager) view.getContext().getSystemService(android.view.autofill.AutofillManager.class);
        if (autofillManager == null) {
            throw new java.lang.IllegalStateException("Autofill service could not be located.".toString());
        }
        this.autofillManager = autofillManager;
        view.setImportantForAutofill(1);
    }

    public final androidx.compose.ui.autofill.AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final android.view.View getView() {
        return this.view;
    }

    public final android.view.autofill.AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void requestAutofillForNode(androidx.compose.ui.autofill.AutofillNode autofillNode) {
        androidx.compose.ui.geometry.Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox == null) {
            throw new java.lang.IllegalStateException("requestAutofill called before onChildPositioned()".toString());
        }
        this.autofillManager.notifyViewEntered(this.view, autofillNode.getId(), new android.graphics.Rect(kotlin.math.MathKt.roundToInt(boundingBox.getLeft()), kotlin.math.MathKt.roundToInt(boundingBox.getTop()), kotlin.math.MathKt.roundToInt(boundingBox.getRight()), kotlin.math.MathKt.roundToInt(boundingBox.getBottom())));
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public void cancelAutofillForNode(androidx.compose.ui.autofill.AutofillNode autofillNode) {
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }
}
