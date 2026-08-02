package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\b\u001a\u00020\u00072)\b\u0004\u0010\u0006\u001a#\b\u0001\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0000H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\n\u001a\u00020\u00072+\b\u0004\u0010\u0006\u001a%\b\u0001\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0000H\u0087\b¢\u0006\u0004\b\n\u0010\t\"#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0007¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlin/Function2;", "Lcoil3/request/ImageRequest;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "Lcoil3/Image;", "", "image", "Lcoil3/compose/AsyncImagePreviewHandler;", "AsyncImagePreviewHandlerNotNull", "(Lkotlin/jvm/functions/Function2;)Lcoil3/compose/AsyncImagePreviewHandler;", "AsyncImagePreviewHandler", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAsyncImagePreviewHandler", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAsyncImagePreviewHandler", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAsyncImagePreviewHandler$annotations", "()V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocalAsyncImagePreviewHandlerKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<coil3.compose.AsyncImagePreviewHandler> LocalAsyncImagePreviewHandler = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: coil3.compose.LocalAsyncImagePreviewHandlerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            coil3.compose.AsyncImagePreviewHandler asyncImagePreviewHandler;
            asyncImagePreviewHandler = coil3.compose.AsyncImagePreviewHandler.Default;
            return asyncImagePreviewHandler;
        }
    });

    public static /* synthetic */ void getLocalAsyncImagePreviewHandler$annotations() {
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<coil3.compose.AsyncImagePreviewHandler> getLocalAsyncImagePreviewHandler() {
        return LocalAsyncImagePreviewHandler;
    }

    public static final coil3.compose.AsyncImagePreviewHandler AsyncImagePreviewHandlerNotNull(kotlin.jvm.functions.Function2<? super coil3.view.ImageRequest, ? super kotlin.coroutines.Continuation<? super coil3.Image>, ? extends java.lang.Object> function2) {
        return new coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1(function2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Migrate to the AsyncImagePreviewHandler constructor that returns a not null Image. Alternatively, if you need to return a nullable Image, inline this code into your call site.", replaceWith = @kotlin.ReplaceWith(expression = "AsyncImagePreviewHandler { _, request -> AsyncImagePainter.State.Loading(image(request)?.asPainter(request.context)) }", imports = {"coil3.compose.AsyncImagePainter"}))
    public static final coil3.compose.AsyncImagePreviewHandler AsyncImagePreviewHandler(kotlin.jvm.functions.Function2<? super coil3.view.ImageRequest, ? super kotlin.coroutines.Continuation<? super coil3.Image>, ? extends java.lang.Object> function2) {
        return new coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$2(function2);
    }
}
