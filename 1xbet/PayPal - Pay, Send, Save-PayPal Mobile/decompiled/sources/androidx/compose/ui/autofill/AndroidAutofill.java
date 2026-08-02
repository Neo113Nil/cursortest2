package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/Autofill;", "Landroid/view/View;", "view", "Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "<init>", "(Landroid/view/View;Landroidx/compose/ui/autofill/AutofillTree;)V", "Landroidx/compose/ui/autofill/AutofillNode;", "autofillNode", "", "requestAutofillForNode", "(Landroidx/compose/ui/autofill/AutofillNode;)V", "cancelAutofillForNode", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "Landroid/view/autofill/AutofillManager;", "autofillManager", "Landroid/view/autofill/AutofillManager;", "getAutofillManager", "()Landroid/view/autofill/AutofillManager;", "Landroid/view/autofill/AutofillId;", "rootAutofillId", "Landroid/view/autofill/AutofillId;", "getRootAutofillId", "()Landroid/view/autofill/AutofillId;", "setRootAutofillId", "(Landroid/view/autofill/AutofillId;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAutofill implements androidx.compose.ui.autofill.Autofill {
    public static final int $stable = 8;
    private final android.view.autofill.AutofillManager autofillManager;
    private final androidx.compose.ui.autofill.AutofillTree autofillTree;
    private android.view.autofill.AutofillId rootAutofillId;
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
        androidx.compose.ui.platform.coreshims.AutofillIdCompat autofillId = androidx.compose.ui.platform.coreshims.ViewCompatShims.getAutofillId(view);
        android.view.autofill.AutofillId autofillId2 = autofillId != null ? autofillId.toAutofillId() : null;
        if (autofillId2 != null) {
            this.rootAutofillId = autofillId2;
        } else {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
            throw new kotlin.KotlinNothingValueException();
        }
    }

    public final android.view.View getView() {
        return this.view;
    }

    public final androidx.compose.ui.autofill.AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final android.view.autofill.AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    public final android.view.autofill.AutofillId getRootAutofillId() {
        return this.rootAutofillId;
    }

    public final void setRootAutofillId(android.view.autofill.AutofillId autofillId) {
        this.rootAutofillId = autofillId;
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public final void requestAutofillForNode(androidx.compose.ui.autofill.AutofillNode autofillNode) {
        androidx.compose.ui.geometry.Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox == null) {
            throw new java.lang.IllegalStateException("requestAutofill called before onChildPositioned()".toString());
        }
        this.autofillManager.notifyViewEntered(this.view, autofillNode.getId(), new android.graphics.Rect(java.lang.Math.round(boundingBox.getLeft()), java.lang.Math.round(boundingBox.getTop()), java.lang.Math.round(boundingBox.getRight()), java.lang.Math.round(boundingBox.getBottom())));
    }

    @Override // androidx.compose.ui.autofill.Autofill
    public final void cancelAutofillForNode(androidx.compose.ui.autofill.AutofillNode autofillNode) {
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }
}
