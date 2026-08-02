package com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0017B1\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\b\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/viewmodel/DebitCardWebViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/base/MviViewModel;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewEffect;", "", "url", "", "isAuthRequired", "title", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewReducer;", "reducer", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewReducer;)V", "stateStoreName", "()Ljava/lang/String;", "initialState", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/mvi/DebitCardWebViewState;", "Ljava/lang/String;", "getUrl", "Z", "()Z", "getTitle", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardWebViewModel extends com.paypal.oslo.feature.debitcard.shared.base.MviViewModel<com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState, com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent, com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEffect> {
    public static final int $stable = 8;
    private final boolean isAuthRequired;
    private final java.lang.String title;
    private final java.lang.String url;

    public /* synthetic */ DebitCardWebViewModel(java.lang.String str, boolean z, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer debitCardWebViewReducer, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str2, debitCardWebViewReducer);
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: isAuthRequired, reason: from getter */
    public final boolean getIsAuthRequired() {
        return this.isAuthRequired;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public DebitCardWebViewModel(@dagger.assisted.Assisted("url") java.lang.String str, @dagger.assisted.Assisted("isAuthRequired") boolean z, @dagger.assisted.Assisted("title") java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer debitCardWebViewReducer) {
        super(debitCardWebViewReducer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWebViewReducer, "");
        this.url = str;
        this.isAuthRequired = z;
        this.title = str2;
        processEvent(new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent.Initialize(str, z, str2));
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/viewmodel/DebitCardWebViewModel$Factory;", "", "", "url", "", "isAuthRequired", "title", "Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/viewmodel/DebitCardWebViewModel;", "create", "(Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/viewmodel/DebitCardWebViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @dagger.assisted.AssistedFactory
    public interface Factory {
        com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel create(@dagger.assisted.Assisted("url") java.lang.String url, @dagger.assisted.Assisted("isAuthRequired") boolean isAuthRequired, @dagger.assisted.Assisted("title") java.lang.String title);

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel create$default(com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel.Factory factory, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return factory.create(str, z, str2);
        }
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final java.lang.String stateStoreName() {
        return "DebitCardWebViewModel.store";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.paypal.oslo.feature.debitcard.shared.base.MviViewModel
    public final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState initialState() {
        return com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewState.Initial.INSTANCE;
    }
}
