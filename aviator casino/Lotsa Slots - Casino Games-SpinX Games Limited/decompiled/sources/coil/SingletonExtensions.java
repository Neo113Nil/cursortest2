package coil;

/* compiled from: Extensions.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a<\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0000\u001a\u00020\u00012\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0086\b\u001a\r\u0010\u000f\u001a\u00020\r*\u00020\u0007H\u0086\b\u001a<\u0010\u0014\u001a\u00020\u0006*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0000\u001a\u00020\u00012\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\r*\u00020\u0007H\u0087\b\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"!\u0010\u0016\u001a\u0004\u0018\u00010\u0011*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, d2 = {"imageLoader", "Lcoil/ImageLoader;", "Landroid/content/Context;", "getImageLoader", "(Landroid/content/Context;)Lcoil/ImageLoader;", "load", "Lcoil/request/Disposable;", "Landroid/widget/ImageView;", "data", "", "builder", "Lkotlin/Function1;", "Lcoil/request/ImageRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "dispose", "result", "Lcoil/request/ImageResult;", "getResult", "(Landroid/widget/ImageView;)Lcoil/request/ImageResult;", "loadAny", "clear", "metadata", "getMetadata$annotations", "(Landroid/widget/ImageView;)V", "getMetadata", "coil-singleton_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: coil.-SingletonExtensions, reason: invalid class name */
/* loaded from: classes2.dex */
public final class SingletonExtensions {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Migrate to 'result'.", replaceWith = @kotlin.ReplaceWith(expression = "result", imports = {"coil.result"}))
    public static /* synthetic */ void getMetadata$annotations(android.widget.ImageView imageView) {
    }

    public static final coil.ImageLoader getImageLoader(android.content.Context context) {
        return coil.Coil.imageLoader(context);
    }

    public static /* synthetic */ coil.request.Disposable load$default(android.widget.ImageView imageView, java.lang.Object obj, coil.ImageLoader imageLoader, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            imageLoader = coil.Coil.imageLoader(imageView.getContext());
        }
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<coil.request.ImageRequest.Builder, kotlin.Unit>() { // from class: coil.-SingletonExtensions$load$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(coil.request.ImageRequest.Builder builder) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(coil.request.ImageRequest.Builder builder) {
                    invoke2(builder);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        coil.request.ImageRequest.Builder target = new coil.request.ImageRequest.Builder(imageView.getContext()).data(obj).target(imageView);
        function1.invoke(target);
        return imageLoader.enqueue(target.build());
    }

    public static final coil.request.Disposable load(android.widget.ImageView imageView, java.lang.Object obj, coil.ImageLoader imageLoader, kotlin.jvm.functions.Function1<? super coil.request.ImageRequest.Builder, kotlin.Unit> function1) {
        coil.request.ImageRequest.Builder target = new coil.request.ImageRequest.Builder(imageView.getContext()).data(obj).target(imageView);
        function1.invoke(target);
        return imageLoader.enqueue(target.build());
    }

    public static final void dispose(android.widget.ImageView imageView) {
        coil.util.CoilUtils.dispose(imageView);
    }

    public static final coil.request.ImageResult getResult(android.widget.ImageView imageView) {
        return coil.util.CoilUtils.result(imageView);
    }

    public static /* synthetic */ coil.request.Disposable loadAny$default(android.widget.ImageView imageView, java.lang.Object obj, coil.ImageLoader imageLoader, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            imageLoader = coil.Coil.imageLoader(imageView.getContext());
        }
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<coil.request.ImageRequest.Builder, kotlin.Unit>() { // from class: coil.-SingletonExtensions$loadAny$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(coil.request.ImageRequest.Builder builder) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(coil.request.ImageRequest.Builder builder) {
                    invoke2(builder);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        coil.request.ImageRequest.Builder target = new coil.request.ImageRequest.Builder(imageView.getContext()).data(obj).target(imageView);
        function1.invoke(target);
        return imageLoader.enqueue(target.build());
    }

    public static final coil.request.ImageResult getMetadata(android.widget.ImageView imageView) {
        return coil.util.CoilUtils.result(imageView);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Migrate to 'load'.", replaceWith = @kotlin.ReplaceWith(expression = "load(data, imageLoader, builder)", imports = {"coil.imageLoader", "coil.load"}))
    public static final coil.request.Disposable loadAny(android.widget.ImageView imageView, java.lang.Object obj, coil.ImageLoader imageLoader, kotlin.jvm.functions.Function1<? super coil.request.ImageRequest.Builder, kotlin.Unit> function1) {
        coil.request.ImageRequest.Builder target = new coil.request.ImageRequest.Builder(imageView.getContext()).data(obj).target(imageView);
        function1.invoke(target);
        return imageLoader.enqueue(target.build());
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Migrate to 'dispose'.", replaceWith = @kotlin.ReplaceWith(expression = "dispose()", imports = {"coil.dispose"}))
    public static final void clear(android.widget.ImageView imageView) {
        coil.util.CoilUtils.dispose(imageView);
    }
}
