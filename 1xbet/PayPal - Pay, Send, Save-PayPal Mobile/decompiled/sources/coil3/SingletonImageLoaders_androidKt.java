package coil3;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\"\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u000f8Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0012*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroid/widget/ImageView;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/ImageLoader;", "imageLoader", "Lkotlin/Function1;", "Lcoil3/request/ImageRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Lcoil3/request/Disposable;", "load", "(Landroid/widget/ImageView;Ljava/lang/Object;Lcoil3/ImageLoader;Lkotlin/jvm/functions/Function1;)Lcoil3/request/Disposable;", "dispose", "(Landroid/widget/ImageView;)V", "Landroid/content/Context;", "getImageLoader", "(Landroid/content/Context;)Lcoil3/ImageLoader;", "Lcoil3/request/ImageResult;", "getResult", "(Landroid/widget/ImageView;)Lcoil3/request/ImageResult;", "result"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingletonImageLoaders_androidKt {
    public static final coil3.ImageLoader getImageLoader(android.content.Context context) {
        return coil3.SingletonImageLoader.get(context);
    }

    public static /* synthetic */ coil3.view.Disposable load$default(android.widget.ImageView imageView, java.lang.Object obj, coil3.ImageLoader imageLoader, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            imageLoader = coil3.SingletonImageLoader.get(imageView.getContext());
        }
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<coil3.request.ImageRequest.Builder, kotlin.Unit>() { // from class: coil3.SingletonImageLoaders_androidKt$load$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(coil3.request.ImageRequest.Builder builder) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(coil3.request.ImageRequest.Builder builder) {
                    invoke2(builder);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        coil3.request.ImageRequest.Builder target = coil3.view.ImageRequests_androidKt.target(new coil3.request.ImageRequest.Builder(imageView.getContext()).data(obj), imageView);
        function1.invoke(target);
        return imageLoader.enqueue(target.build());
    }

    public static final coil3.view.Disposable load(android.widget.ImageView imageView, java.lang.Object obj, coil3.ImageLoader imageLoader, kotlin.jvm.functions.Function1<? super coil3.request.ImageRequest.Builder, kotlin.Unit> function1) {
        coil3.request.ImageRequest.Builder target = coil3.view.ImageRequests_androidKt.target(new coil3.request.ImageRequest.Builder(imageView.getContext()).data(obj), imageView);
        function1.invoke(target);
        return imageLoader.enqueue(target.build());
    }

    public static final void dispose(android.widget.ImageView imageView) {
        coil3.content.CoilUtils.dispose(imageView);
    }

    public static final coil3.view.ImageResult getResult(android.widget.ImageView imageView) {
        return coil3.content.CoilUtils.result(imageView);
    }
}
