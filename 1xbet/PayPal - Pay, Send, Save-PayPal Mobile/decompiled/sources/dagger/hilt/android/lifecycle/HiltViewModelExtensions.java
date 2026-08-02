package dagger.hilt.android.lifecycle;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"VMF", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/Function1;", "Landroidx/lifecycle/ViewModel;", com.sun.jna.Callback.METHOD_NAME, "withCreationCallback", "(Landroidx/lifecycle/viewmodel/CreationExtras;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/viewmodel/CreationExtras;", "Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "addCreationCallback", "(Landroidx/lifecycle/viewmodel/MutableCreationExtras;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HiltViewModelExtensions {
    public static final <VMF> androidx.view.viewmodel.CreationExtras withCreationCallback(androidx.view.viewmodel.CreationExtras creationExtras, kotlin.jvm.functions.Function1<? super VMF, ? extends androidx.view.ViewModel> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return addCreationCallback(new androidx.view.viewmodel.MutableCreationExtras(creationExtras), function1);
    }

    public static final <VMF> androidx.view.viewmodel.CreationExtras addCreationCallback(androidx.view.viewmodel.MutableCreationExtras mutableCreationExtras, final kotlin.jvm.functions.Function1<? super VMF, ? extends androidx.view.ViewModel> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableCreationExtras, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.lifecycle.viewmodel.CreationExtras.Key<kotlin.jvm.functions.Function1<java.lang.Object, androidx.view.ViewModel>> key = dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.CREATION_CALLBACK_KEY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        mutableCreationExtras.set(key, new kotlin.jvm.functions.Function1<java.lang.Object, androidx.view.ViewModel>() { // from class: dagger.hilt.android.lifecycle.HiltViewModelExtensions$addCreationCallback$1$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final androidx.view.ViewModel invoke(java.lang.Object obj) {
                return function1.invoke(obj);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
        return mutableCreationExtras;
    }
}
