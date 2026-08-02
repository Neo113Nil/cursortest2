package com.ingo.sdk.kotlin.common.extension;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aI\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\f\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u000b0\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\n"}, d2 = {"", "T", "Landroidx/lifecycle/LiveData;", "L", "Landroidx/lifecycle/LifecycleOwner;", "liveData", "Lkotlin/Function1;", "", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "observe", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function1;)V", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LifecycleKt {
    public static final <T, L extends androidx.view.LiveData<T>> void observe(androidx.view.LifecycleOwner lifecycleOwner, L l, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        l.observe(lifecycleOwner, new com.ingo.sdk.kotlin.common.extension.LifecycleKt$sam$androidx_lifecycle_Observer$0(function1));
    }

    public static final <L extends androidx.view.LiveData<com.ingo.sdk.kotlin.common.core.exception.Failure>> void failure(androidx.view.LifecycleOwner lifecycleOwner, L l, kotlin.jvm.functions.Function1<? super com.ingo.sdk.kotlin.common.core.exception.Failure, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        l.observe(lifecycleOwner, new com.ingo.sdk.kotlin.common.extension.LifecycleKt$sam$androidx_lifecycle_Observer$0(function1));
    }
}
