package coil.compose;

/* compiled from: SingletonImagePainter.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0018\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b¢\u0006\u0002\u0010\u0004\u001ab\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032H\u0010\u0005\u001aD\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tj\u0002`\b\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tj\u0002`\b\u0012\u0004\u0012\u00020\r0\u0007j\u0002`\u0006H\u0087\b¢\u0006\u0002\u0010\u000e\u001a1\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u0010\u0014\u001a{\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032H\u0010\u0005\u001aD\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tj\u0002`\b\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tj\u0002`\b\u0012\u0004\u0012\u00020\r0\u0007j\u0002`\u00062\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u0010\u0015\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u000bH\u0087\b¢\u0006\u0002\u0010\u0017\u001a`\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u000b2H\u0010\u0005\u001aD\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tj\u0002`\b\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tj\u0002`\b\u0012\u0004\u0012\u00020\r0\u0007j\u0002`\u0006H\u0087\b¢\u0006\u0002\u0010\u0018*\u0088\u0001\b\u0002\u0010\u0019\"@\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tj\u0002`\b\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tj\u0002`\b\u0012\u0004\u0012\u00020\r0\u00072@\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tj\u0002`\b\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tj\u0002`\b\u0012\u0004\u0012\u00020\r0\u0007*0\b\u0002\u0010\u001a\"\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t2\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t¨\u0006\u001b"}, d2 = {"rememberImagePainter", "Lcoil/compose/AsyncImagePainter;", "data", "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "onExecute", "Lcoil/compose/ExecuteCallback;", "Lkotlin/Function2;", "Lcoil/compose/Snapshot;", "Lkotlin/Triple;", "Lcoil/compose/AsyncImagePainter$State;", "Lcoil/request/ImageRequest;", "Landroidx/compose/ui/geometry/Size;", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "builder", "Lkotlin/Function1;", "Lcoil/request/ImageRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "request", "(Lcoil/request/ImageRequest;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "(Lcoil/request/ImageRequest;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "ExecuteCallback", "Snapshot", "coil-compose-singleton_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingletonImagePainterKt {
    @kotlin.Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @kotlin.ReplaceWith(expression = "rememberAsyncImagePainter(data)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    public static final coil.compose.AsyncImagePainter rememberImagePainter(java.lang.Object obj, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1998134191);
        coil.compose.AsyncImagePainter m4978rememberAsyncImagePainterEHKIwbg = coil.compose.SingletonAsyncImagePainterKt.m4978rememberAsyncImagePainterEHKIwbg(obj, null, null, null, 0, null, composer, 8, 62);
        composer.endReplaceableGroup();
        return m4978rememberAsyncImagePainterEHKIwbg;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @kotlin.ReplaceWith(expression = "rememberAsyncImagePainter(data)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    public static final coil.compose.AsyncImagePainter rememberImagePainter(java.lang.Object obj, kotlin.jvm.functions.Function2<? super kotlin.Triple<? extends coil.compose.AsyncImagePainter.State, coil.request.ImageRequest, androidx.compose.ui.geometry.Size>, ? super kotlin.Triple<? extends coil.compose.AsyncImagePainter.State, coil.request.ImageRequest, androidx.compose.ui.geometry.Size>, java.lang.Boolean> function2, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(2090701729);
        coil.compose.AsyncImagePainter m4978rememberAsyncImagePainterEHKIwbg = coil.compose.SingletonAsyncImagePainterKt.m4978rememberAsyncImagePainterEHKIwbg(obj, null, null, null, 0, null, composer, 8, 62);
        composer.endReplaceableGroup();
        return m4978rememberAsyncImagePainterEHKIwbg;
    }

    @kotlin.Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @kotlin.ReplaceWith(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build())", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    public static final coil.compose.AsyncImagePainter rememberImagePainter(java.lang.Object obj, kotlin.jvm.functions.Function1<? super coil.request.ImageRequest.Builder, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(309201794);
        androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localContext);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        coil.request.ImageRequest.Builder data = new coil.request.ImageRequest.Builder((android.content.Context) consume).data(obj);
        function1.invoke(data);
        coil.compose.AsyncImagePainter m4978rememberAsyncImagePainterEHKIwbg = coil.compose.SingletonAsyncImagePainterKt.m4978rememberAsyncImagePainterEHKIwbg(data.build(), null, null, null, 0, null, composer, 8, 62);
        composer.endReplaceableGroup();
        return m4978rememberAsyncImagePainterEHKIwbg;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @kotlin.ReplaceWith(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build())", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    public static final coil.compose.AsyncImagePainter rememberImagePainter(java.lang.Object obj, kotlin.jvm.functions.Function2<? super kotlin.Triple<? extends coil.compose.AsyncImagePainter.State, coil.request.ImageRequest, androidx.compose.ui.geometry.Size>, ? super kotlin.Triple<? extends coil.compose.AsyncImagePainter.State, coil.request.ImageRequest, androidx.compose.ui.geometry.Size>, java.lang.Boolean> function2, kotlin.jvm.functions.Function1<? super coil.request.ImageRequest.Builder, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(305839348);
        androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localContext);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        coil.request.ImageRequest.Builder data = new coil.request.ImageRequest.Builder((android.content.Context) consume).data(obj);
        function1.invoke(data);
        coil.compose.AsyncImagePainter m4978rememberAsyncImagePainterEHKIwbg = coil.compose.SingletonAsyncImagePainterKt.m4978rememberAsyncImagePainterEHKIwbg(data.build(), null, null, null, 0, null, composer, 8, 62);
        composer.endReplaceableGroup();
        return m4978rememberAsyncImagePainterEHKIwbg;
    }

    @kotlin.Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @kotlin.ReplaceWith(expression = "rememberAsyncImagePainter(request)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    public static final coil.compose.AsyncImagePainter rememberImagePainter(coil.request.ImageRequest imageRequest, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(2091320589);
        coil.compose.AsyncImagePainter m4978rememberAsyncImagePainterEHKIwbg = coil.compose.SingletonAsyncImagePainterKt.m4978rememberAsyncImagePainterEHKIwbg(imageRequest, null, null, null, 0, null, composer, 8, 62);
        composer.endReplaceableGroup();
        return m4978rememberAsyncImagePainterEHKIwbg;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @kotlin.ReplaceWith(expression = "rememberAsyncImagePainter(request)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    public static final coil.compose.AsyncImagePainter rememberImagePainter(coil.request.ImageRequest imageRequest, kotlin.jvm.functions.Function2<? super kotlin.Triple<? extends coil.compose.AsyncImagePainter.State, coil.request.ImageRequest, androidx.compose.ui.geometry.Size>, ? super kotlin.Triple<? extends coil.compose.AsyncImagePainter.State, coil.request.ImageRequest, androidx.compose.ui.geometry.Size>, java.lang.Boolean> function2, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-2003443841);
        coil.compose.AsyncImagePainter m4978rememberAsyncImagePainterEHKIwbg = coil.compose.SingletonAsyncImagePainterKt.m4978rememberAsyncImagePainterEHKIwbg(imageRequest, null, null, null, 0, null, composer, 8, 62);
        composer.endReplaceableGroup();
        return m4978rememberAsyncImagePainterEHKIwbg;
    }
}
