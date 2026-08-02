package com.ingo.sdk.android.ux.feature.web_view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/web_view/GetHtmlContentViewModelImpl;", "Lcom/ingo/sdk/kotlin/common/platform/BaseViewModel;", "Lcom/ingo/sdk/kotlin/common/features/html_content/HtmlContentViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScopeProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "url", "", "getHtmlContent", "(Ljava/lang/String;)V", "Lcom/ingo/sdk/kotlin/common/features/html_content/GetHtmlContentUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/ingo/sdk/kotlin/common/features/html_content/GetHtmlContentUseCase;", "Landroidx/lifecycle/MutableLiveData;", "htmlContent", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GetHtmlContentViewModelImpl extends com.ingo.sdk.kotlin.common.platform.BaseViewModel implements com.ingo.sdk.kotlin.common.features.html_content.HtmlContentViewModel {
    public static final int $stable = 8;
    private final com.ingo.sdk.kotlin.common.features.html_content.GetHtmlContentUseCase getHighSpeedVideoFpsRanges;
    private final androidx.view.MutableLiveData<java.lang.String> htmlContent;

    public /* synthetic */ GetHtmlContentViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope);
    }

    public GetHtmlContentViewModelImpl(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope, 0L, 2, null);
        this.getHighSpeedVideoFpsRanges = new com.ingo.sdk.kotlin.common.features.html_content.GetHtmlContentUseCase();
        this.htmlContent = new androidx.view.MutableLiveData<>();
    }

    public final androidx.view.MutableLiveData<java.lang.String> getHtmlContent() {
        return this.htmlContent;
    }

    @Override // com.ingo.sdk.kotlin.common.features.html_content.HtmlContentViewModel
    public final void getHtmlContent(final java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        runSingleUseCase(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl.$r8$lambda$VGTu669GMym3s8ghwuu0tHudlz4(com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl.this, url);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GJLRFiK0cfx_LNjXXVqDQ6OV1f8(final com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl getHtmlContentViewModelImpl, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        getHtmlContentViewModelImpl.onUseCaseSuccess(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl.$r8$lambda$hmZvzTGIeMRs08mnZVJgoHotyyw(com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl.this, str);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VGTu669GMym3s8ghwuu0tHudlz4(final com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl getHtmlContentViewModelImpl, java.lang.String str) {
        getHtmlContentViewModelImpl.getHighSpeedVideoFpsRanges.invoke(str, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl.m10706$r8$lambda$vLSWicbbBjnACEHm5wlRUP9ZiQ(com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.functional.Either) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vb05LO1MCAvhTt0EAtqTNVvK3uQ(com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl getHtmlContentViewModelImpl, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.platform.BaseViewModel.onUseCaseFailure$default(getHtmlContentViewModelImpl, failure, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hmZvzTGIeMRs08mnZVJgoHotyyw(com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl getHtmlContentViewModelImpl, java.lang.String str) {
        getHtmlContentViewModelImpl.htmlContent.postValue(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vLSWicbbBjn-ACEHm5wlRUP9ZiQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10706$r8$lambda$vLSWicbbBjnACEHm5wlRUP9ZiQ(final com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl getHtmlContentViewModelImpl, com.ingo.sdk.kotlin.common.core.functional.Either either) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
        either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl.$r8$lambda$Vb05LO1MCAvhTt0EAtqTNVvK3uQ(com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl.$r8$lambda$GJLRFiK0cfx_LNjXXVqDQ6OV1f8(com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl.this, (java.lang.String) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetHtmlContentViewModelImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
