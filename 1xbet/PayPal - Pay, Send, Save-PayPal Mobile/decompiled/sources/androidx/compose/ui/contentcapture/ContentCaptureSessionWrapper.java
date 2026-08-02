package androidx.compose.ui.contentcapture;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0016\u001a\u00020\u000e2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0002\b\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH&¢\u0006\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", "", "", "virtualChildId", "Landroid/view/autofill/AutofillId;", "newAutofillId", "(J)Landroid/view/autofill/AutofillId;", "parentId", "virtualId", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "newVirtualViewStructure", "(Landroid/view/autofill/AutofillId;J)Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "Landroid/view/ViewStructure;", "node", "", "notifyViewAppeared", "(Landroid/view/ViewStructure;)V", "flush", "()V", "", "Lkotlin/jvm/JvmSuppressWildcards;", "appearedNodes", "notifyViewsAppeared", "(Ljava/util/List;)V", "", "virtualIds", "notifyViewsDisappeared", "([J)V", "id", "notifyViewDisappeared", "(Landroid/view/autofill/AutofillId;)V", "", "text", "notifyViewTextChanged", "(Landroid/view/autofill/AutofillId;Ljava/lang/CharSequence;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ContentCaptureSessionWrapper {
    void flush();

    android.view.autofill.AutofillId newAutofillId(long virtualChildId);

    androidx.compose.ui.platform.coreshims.ViewStructureCompat newVirtualViewStructure(android.view.autofill.AutofillId parentId, long virtualId);

    void notifyViewAppeared(android.view.ViewStructure node);

    void notifyViewDisappeared(android.view.autofill.AutofillId id);

    void notifyViewTextChanged(android.view.autofill.AutofillId id, java.lang.CharSequence text);

    void notifyViewsAppeared(java.util.List<android.view.ViewStructure> appearedNodes);

    void notifyViewsDisappeared(long[] virtualIds);
}
