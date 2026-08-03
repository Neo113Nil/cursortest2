package coil.compose;

/* compiled from: LocalImageLoader.kt */
@kotlin.Deprecated(message = "LocalImageLoader was intended to provide a method to overwrite the singleton ImageLoader in local compositions. In practice, it's not clear that `LocalImageLoader.provide` **does not** set the singleton ImageLoader. This can result in accidentally creating multiple ImageLoader instances if you use a combination of `LocalImageLoader.current` and `context.imageLoader`. To maximize performance, apps should create one ImageLoader or use `ImageLoader.newBuilder` to create new ImageLoaders that share the same resources.\n\nAdditionally, as a composition is at most scoped to an Activity, `LocalImageLoader.provide` encourages creating multiple ImageLoaders if the user creates multiple activities that use Compose.\n\nYou should migrate to `ImageLoaderFactory` to set the singleton ImageLoader and `LocalContext.current.imageLoader` to access the singleton ImageLoader in Compose. If you need to use a locally scoped ImageLoader it's recommended to use the `AsyncImage` and `rememberAsyncImagePainter` overloads that have an ImageLoader argument and pass the local ImageLoader as input.")
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0087\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0088\u0001\u0002\u0092\u0001\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¨\u0006\u001e"}, d2 = {"Lcoil/compose/ImageLoaderProvidableCompositionLocal;", "", "delegate", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcoil/ImageLoader;", "constructor-impl", "(Landroidx/compose/runtime/ProvidableCompositionLocal;)Landroidx/compose/runtime/ProvidableCompositionLocal;", "current", "getCurrent$annotations", "()V", "getCurrent", "(Landroidx/compose/runtime/ProvidableCompositionLocal;Landroidx/compose/runtime/Composer;I)Lcoil/ImageLoader;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "value", "provides-impl", "(Landroidx/compose/runtime/ProvidableCompositionLocal;Lcoil/ImageLoader;)Landroidx/compose/runtime/ProvidedValue;", "equals", "", "other", "equals-impl", "(Landroidx/compose/runtime/ProvidableCompositionLocal;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroidx/compose/runtime/ProvidableCompositionLocal;)I", "toString", "", "toString-impl", "(Landroidx/compose/runtime/ProvidableCompositionLocal;)Ljava/lang/String;", "coil-compose-singleton_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes2.dex */
public final class ImageLoaderProvidableCompositionLocal {
    private final androidx.compose.runtime.ProvidableCompositionLocal<coil.ImageLoader> delegate;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ coil.compose.ImageLoaderProvidableCompositionLocal m4964boximpl(androidx.compose.runtime.ProvidableCompositionLocal providableCompositionLocal) {
        return new coil.compose.ImageLoaderProvidableCompositionLocal(providableCompositionLocal);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static androidx.compose.runtime.ProvidableCompositionLocal<coil.ImageLoader> m4965constructorimpl(androidx.compose.runtime.ProvidableCompositionLocal<coil.ImageLoader> providableCompositionLocal) {
        return providableCompositionLocal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final coil.ImageLoader constructor_impl$lambda$0() {
        return null;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4967equalsimpl(androidx.compose.runtime.ProvidableCompositionLocal<coil.ImageLoader> providableCompositionLocal, java.lang.Object obj) {
        return (obj instanceof coil.compose.ImageLoaderProvidableCompositionLocal) && kotlin.jvm.internal.Intrinsics.areEqual(providableCompositionLocal, ((coil.compose.ImageLoaderProvidableCompositionLocal) obj).getDelegate());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4968equalsimpl0(androidx.compose.runtime.ProvidableCompositionLocal<coil.ImageLoader> providableCompositionLocal, androidx.compose.runtime.ProvidableCompositionLocal<coil.ImageLoader> providableCompositionLocal2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(providableCompositionLocal, providableCompositionLocal2);
    }

    @kotlin.Deprecated(message = "LocalImageLoader was intended to provide a method to overwrite the singleton ImageLoader in local compositions. In practice, it's not clear that `LocalImageLoader.provide` **does not** set the singleton ImageLoader. This can result in accidentally creating multiple ImageLoader instances if you use a combination of `LocalImageLoader.current` and `context.imageLoader`. To maximize performance, apps should create one ImageLoader or use `ImageLoader.newBuilder` to create new ImageLoaders that share the same resources.\n\nAdditionally, as a composition is at most scoped to an Activity, `LocalImageLoader.provide` encourages creating multiple ImageLoaders if the user creates multiple activities that use Compose.\n\nYou should migrate to `ImageLoaderFactory` to set the singleton ImageLoader and `LocalContext.current.imageLoader` to access the singleton ImageLoader in Compose. If you need to use a locally scoped ImageLoader it's recommended to use the `AsyncImage` and `rememberAsyncImagePainter` overloads that have an ImageLoader argument and pass the local ImageLoader as input.", replaceWith = @kotlin.ReplaceWith(expression = "LocalContext.current.imageLoader", imports = {"androidx.compose.ui.platform.LocalContext", "coil.imageLoader"}))
    public static /* synthetic */ void getCurrent$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4969hashCodeimpl(androidx.compose.runtime.ProvidableCompositionLocal<coil.ImageLoader> providableCompositionLocal) {
        return providableCompositionLocal.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m4971toStringimpl(androidx.compose.runtime.ProvidableCompositionLocal<coil.ImageLoader> providableCompositionLocal) {
        return "ImageLoaderProvidableCompositionLocal(delegate=" + providableCompositionLocal + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return m4967equalsimpl(this.delegate, obj);
    }

    public int hashCode() {
        return m4969hashCodeimpl(this.delegate);
    }

    public java.lang.String toString() {
        return m4971toStringimpl(this.delegate);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ androidx.compose.runtime.ProvidableCompositionLocal getDelegate() {
        return this.delegate;
    }

    private /* synthetic */ ImageLoaderProvidableCompositionLocal(androidx.compose.runtime.ProvidableCompositionLocal providableCompositionLocal) {
        this.delegate = providableCompositionLocal;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.ProvidableCompositionLocal m4966constructorimpl$default(androidx.compose.runtime.ProvidableCompositionLocal providableCompositionLocal, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            providableCompositionLocal = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: coil.compose.ImageLoaderProvidableCompositionLocal$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    coil.ImageLoader constructor_impl$lambda$0;
                    constructor_impl$lambda$0 = coil.compose.ImageLoaderProvidableCompositionLocal.constructor_impl$lambda$0();
                    return constructor_impl$lambda$0;
                }
            });
        }
        return m4965constructorimpl(providableCompositionLocal);
    }

    public static final coil.ImageLoader getCurrent(androidx.compose.runtime.ProvidableCompositionLocal<coil.ImageLoader> providableCompositionLocal, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(providableCompositionLocal);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        coil.ImageLoader imageLoader = (coil.ImageLoader) consume;
        if (imageLoader != null) {
            return imageLoader;
        }
        androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume2 = composer.consume(localContext);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return coil.Coil.imageLoader((android.content.Context) consume2);
    }

    @kotlin.Deprecated(message = "Implement `ImageLoaderFactory` in your `android.app.Application` class.")
    /* renamed from: provides-impl, reason: not valid java name */
    public static final androidx.compose.runtime.ProvidedValue<coil.ImageLoader> m4970providesimpl(androidx.compose.runtime.ProvidableCompositionLocal<coil.ImageLoader> providableCompositionLocal, coil.ImageLoader imageLoader) {
        return providableCompositionLocal.provides(imageLoader);
    }
}
