package coil3.fetch;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcoil3/fetch/DataUriFetcher;", "Lcoil3/fetch/Fetcher;", "Lcoil3/Uri;", "uri", "Lcoil3/request/Options;", "options", "<init>", "(Lcoil3/Uri;Lcoil3/request/Options;)V", "Lcoil3/fetch/FetchResult;", "fetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcoil3/Uri;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcoil3/request/Options;", "Companion", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DataUriFetcher implements coil3.fetch.Fetcher {
    private static final coil3.fetch.DataUriFetcher.Companion Companion = new coil3.fetch.DataUriFetcher.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final coil3.view.Options getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final coil3.Uri getHighResolutionOutputSizeshNQ4ISI;

    public DataUriFetcher(coil3.Uri uri, coil3.view.Options options) {
        this.getHighResolutionOutputSizeshNQ4ISI = uri;
        this.getHighSpeedVideoSizes = options;
    }

    @Override // coil3.fetch.Fetcher
    public final java.lang.Object fetch(kotlin.coroutines.Continuation<? super coil3.fetch.FetchResult> continuation) {
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.getHighResolutionOutputSizeshNQ4ISI.toString(), ";base64,", 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1) {
            throw new java.lang.IllegalStateException("invalid data uri: ".concat(java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI)).toString());
        }
        int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.getHighResolutionOutputSizeshNQ4ISI.toString(), kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default2 == -1) {
            throw new java.lang.IllegalStateException("invalid data uri: ".concat(java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI)).toString());
        }
        java.lang.String substring = this.getHighResolutionOutputSizeshNQ4ISI.toString().substring(indexOf$default2 + 1, indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        byte[] decode$default = kotlin.io.encoding.Base64.decode$default(kotlin.io.encoding.Base64.INSTANCE, this.getHighResolutionOutputSizeshNQ4ISI.toString(), indexOf$default + 8, 0, 4, (java.lang.Object) null);
        okio.Buffer buffer = new okio.Buffer();
        buffer.write(decode$default);
        return new coil3.fetch.SourceFetchResult(coil3.graphics.ImageSourceKt.ImageSource$default(buffer, this.getHighSpeedVideoSizes.getFileSystem(), null, 4, null), substring, coil3.graphics.DataSource.MEMORY);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcoil3/fetch/DataUriFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Lcoil3/Uri;", "<init>", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/fetch/Fetcher;", "create", "(Lcoil3/Uri;Lcoil3/request/Options;Lcoil3/ImageLoader;)Lcoil3/fetch/Fetcher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.fetch.Fetcher.Factory<coil3.Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public final coil3.fetch.Fetcher create(coil3.Uri data, coil3.view.Options options, coil3.ImageLoader imageLoader) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(data.getScheme(), com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                return new coil3.fetch.DataUriFetcher(data, options);
            }
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcoil3/fetch/DataUriFetcher$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
