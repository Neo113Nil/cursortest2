package androidx.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\n\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/lifecycle/LifecycleOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "", "enabled", "Lkotlin/Function1;", "Landroidx/activity/OnBackPressedCallback;", "", "Lkotlin/ExtensionFunctionType;", "onBackPressed", "addCallback", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function1;)Landroidx/activity/OnBackPressedCallback;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OnBackPressedDispatcherKt {
    public static /* synthetic */ androidx.view.OnBackPressedCallback addCallback$default(androidx.view.OnBackPressedDispatcher onBackPressedDispatcher, androidx.view.LifecycleOwner lifecycleOwner, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return addCallback(onBackPressedDispatcher, lifecycleOwner, z, function1);
    }

    public static final androidx.view.OnBackPressedCallback addCallback(androidx.view.OnBackPressedDispatcher onBackPressedDispatcher, androidx.view.LifecycleOwner lifecycleOwner, final boolean z, final kotlin.jvm.functions.Function1<? super androidx.view.OnBackPressedCallback, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.OnBackPressedCallback onBackPressedCallback = new androidx.view.OnBackPressedCallback(z) { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                function1.invoke(this);
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.addCallback(lifecycleOwner, onBackPressedCallback);
        } else {
            onBackPressedDispatcher.addCallback(onBackPressedCallback);
        }
        return onBackPressedCallback;
    }
}
