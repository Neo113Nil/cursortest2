package androidx.view.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a2\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a \u0010\f\u001a\u00020\u000b*\u00020\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "initialExtras", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "CreationExtras", "(Landroidx/lifecycle/viewmodel/CreationExtras;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/viewmodel/CreationExtras;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "key", "", "contains", "(Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Z", "creationExtras", "plus", "(Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "plusAssign", "(Landroidx/lifecycle/viewmodel/MutableCreationExtras;Landroidx/lifecycle/viewmodel/CreationExtras;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreationExtrasKt {
    public static /* synthetic */ androidx.view.viewmodel.CreationExtras CreationExtras$default(androidx.view.viewmodel.CreationExtras creationExtras, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            creationExtras = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
        }
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.lifecycle.viewmodel.CreationExtrasKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.view.viewmodel.CreationExtrasKt.m9171$r8$lambda$Aiaba7uas_uMy2TwN1qwlg2tsQ((androidx.view.viewmodel.MutableCreationExtras) obj2);
                }
            };
        }
        return CreationExtras(creationExtras, function1);
    }

    public static final androidx.view.viewmodel.CreationExtras CreationExtras(androidx.view.viewmodel.CreationExtras creationExtras, kotlin.jvm.functions.Function1<? super androidx.view.viewmodel.MutableCreationExtras, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.viewmodel.MutableCreationExtras mutableCreationExtras = new androidx.view.viewmodel.MutableCreationExtras(creationExtras);
        function1.invoke(mutableCreationExtras);
        return mutableCreationExtras;
    }

    public static final boolean contains(androidx.view.viewmodel.CreationExtras creationExtras, androidx.lifecycle.viewmodel.CreationExtras.Key<?> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return creationExtras.getExtras$lifecycle_viewmodel().containsKey(key);
    }

    public static final androidx.view.viewmodel.MutableCreationExtras plus(androidx.view.viewmodel.CreationExtras creationExtras, androidx.view.viewmodel.CreationExtras creationExtras2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras2, "");
        return new androidx.view.viewmodel.MutableCreationExtras((java.util.Map<androidx.lifecycle.viewmodel.CreationExtras.Key<?>, ? extends java.lang.Object>) kotlin.collections.MapsKt.plus(creationExtras.getExtras$lifecycle_viewmodel(), creationExtras2.getExtras$lifecycle_viewmodel()));
    }

    public static final void plusAssign(androidx.view.viewmodel.MutableCreationExtras mutableCreationExtras, androidx.view.viewmodel.CreationExtras creationExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableCreationExtras, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "");
        mutableCreationExtras.getExtras$lifecycle_viewmodel().putAll(creationExtras.getExtras$lifecycle_viewmodel());
    }

    /* renamed from: $r8$lambda$A-iaba7uas_uMy2TwN1qwlg2tsQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9171$r8$lambda$Aiaba7uas_uMy2TwN1qwlg2tsQ(androidx.view.viewmodel.MutableCreationExtras mutableCreationExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableCreationExtras, "");
        return kotlin.Unit.INSTANCE;
    }

    public static final androidx.view.viewmodel.CreationExtras CreationExtras(androidx.view.viewmodel.CreationExtras creationExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "");
        return CreationExtras$default(creationExtras, null, 2, null);
    }

    public static final androidx.view.viewmodel.CreationExtras CreationExtras() {
        return CreationExtras$default(null, null, 3, null);
    }
}
