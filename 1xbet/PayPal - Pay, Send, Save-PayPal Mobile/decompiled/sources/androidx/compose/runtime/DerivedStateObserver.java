package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/DerivedStateObserver;", "", "Landroidx/compose/runtime/DerivedState;", "derivedState", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Landroidx/compose/runtime/DerivedState;)V", com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.TestTagDone}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DerivedStateObserver {
    void done(androidx.compose.runtime.DerivedState<?> derivedState);

    void start(androidx.compose.runtime.DerivedState<?> derivedState);
}
