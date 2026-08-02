package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0007¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcoil3/compose/AsyncImageModelEqualityDelegate;", "LocalAsyncImageModelEqualityDelegate", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAsyncImageModelEqualityDelegate", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAsyncImageModelEqualityDelegate$annotations", "()V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalAsyncImageModelEqualityDelegateKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<coil3.compose.AsyncImageModelEqualityDelegate> LocalAsyncImageModelEqualityDelegate = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: coil3.compose.LocalAsyncImageModelEqualityDelegateKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            coil3.compose.AsyncImageModelEqualityDelegate highSpeedVideoSizes;
            highSpeedVideoSizes = coil3.compose.LocalAsyncImageModelEqualityDelegateKt.getHighSpeedVideoSizes();
            return highSpeedVideoSizes;
        }
    });

    public static /* synthetic */ void getLocalAsyncImageModelEqualityDelegate$annotations() {
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<coil3.compose.AsyncImageModelEqualityDelegate> getLocalAsyncImageModelEqualityDelegate() {
        return LocalAsyncImageModelEqualityDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final coil3.compose.AsyncImageModelEqualityDelegate getHighSpeedVideoSizes() {
        return coil3.compose.AsyncImageModelEqualityDelegate.Default;
    }
}
