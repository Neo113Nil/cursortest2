package androidx.view;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a:\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0002\b\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "Lkotlin/Function1;", "Landroidx/savedstate/SavedStateReader;", "Lkotlin/ExtensionFunctionType;", "p0", "read", "(Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/savedstate/SavedStateWriter;", "write"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/savedstate/SavedStateKt")
/* loaded from: classes7.dex */
final /* synthetic */ class SavedStateKt__SavedStateKt {
    public static final <T> T read(android.os.Bundle bundle, kotlin.jvm.functions.Function1<? super androidx.view.SavedStateReader, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return function1.invoke(androidx.view.SavedStateReader.m9295boximpl(androidx.view.SavedStateReader.m9296constructorimpl(bundle)));
    }

    public static final <T> T write(android.os.Bundle bundle, kotlin.jvm.functions.Function1<? super androidx.view.SavedStateWriter, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return function1.invoke(androidx.view.SavedStateWriter.m9380boximpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle)));
    }
}
