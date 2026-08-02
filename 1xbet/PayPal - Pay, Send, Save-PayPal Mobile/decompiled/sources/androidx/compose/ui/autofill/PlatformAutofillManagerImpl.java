package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ'\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/ui/autofill/PlatformAutofillManagerImpl;", "Landroidx/compose/ui/autofill/PlatformAutofillManager;", "Landroid/view/autofill/AutofillManager;", "platformAndroidManager", "<init>", "(Landroid/view/autofill/AutofillManager;)V", "Landroid/view/View;", "view", "", "semanticsId", "Landroid/graphics/Rect;", "bounds", "", "notifyViewEntered", "(Landroid/view/View;ILandroid/graphics/Rect;)V", "notifyViewExited", "(Landroid/view/View;I)V", "Landroid/view/autofill/AutofillValue;", "autofillValue", "notifyValueChanged", "(Landroid/view/View;ILandroid/view/autofill/AutofillValue;)V", "", "isVisible", "notifyViewVisibilityChanged", "(Landroid/view/View;IZ)V", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.QUERY_COMMIT, "()V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "requestAutofill", "Landroid/view/autofill/AutofillManager;", "getPlatformAndroidManager", "()Landroid/view/autofill/AutofillManager;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformAutofillManagerImpl implements androidx.compose.ui.autofill.PlatformAutofillManager {
    public static final int $stable = 8;
    private final android.view.autofill.AutofillManager platformAndroidManager;

    public PlatformAutofillManagerImpl(android.view.autofill.AutofillManager autofillManager) {
        this.platformAndroidManager = autofillManager;
    }

    public final android.view.autofill.AutofillManager getPlatformAndroidManager() {
        return this.platformAndroidManager;
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void notifyViewEntered(android.view.View view, int semanticsId, android.graphics.Rect bounds) {
        this.platformAndroidManager.notifyViewEntered(view, semanticsId, bounds);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void notifyViewExited(android.view.View view, int semanticsId) {
        this.platformAndroidManager.notifyViewExited(view, semanticsId);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void notifyValueChanged(android.view.View view, int semanticsId, android.view.autofill.AutofillValue autofillValue) {
        this.platformAndroidManager.notifyValueChanged(view, semanticsId, autofillValue);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void notifyViewVisibilityChanged(android.view.View view, int semanticsId, boolean isVisible) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            androidx.compose.ui.autofill.AutofillApi27Helper.INSTANCE.notifyViewVisibilityChanged(view, this.platformAndroidManager, semanticsId, isVisible);
        }
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void commit() {
        this.platformAndroidManager.commit();
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void cancel() {
        this.platformAndroidManager.cancel();
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public final void requestAutofill(android.view.View view, int semanticsId, android.graphics.Rect bounds) {
        this.platformAndroidManager.requestAutofill(view, semanticsId, bounds);
    }
}
