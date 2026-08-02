package com.zettle.sdk.feature.taptopay.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Lkotlin/Function0;", "", "action", "doOnDestroy", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function0;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SettingsPagerViewKt {
    public static final void doOnDestroy(androidx.view.Lifecycle lifecycle, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        lifecycle.addObserver(new androidx.view.DefaultLifecycleObserver() { // from class: com.zettle.sdk.feature.taptopay.ui.settings.SettingsPagerViewKt$doOnDestroy$1
            @Override // androidx.view.DefaultLifecycleObserver
            public final void onDestroy(androidx.view.LifecycleOwner owner) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
                function0.invoke();
            }
        });
    }
}
