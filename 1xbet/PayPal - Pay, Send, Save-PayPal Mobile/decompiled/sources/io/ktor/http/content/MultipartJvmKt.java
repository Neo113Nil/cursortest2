package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/http/content/PartData$FileItem;", "Lkotlin/Function0;", "Ljava/io/InputStream;", "getStreamProvider", "(Lio/ktor/http/content/PartData$FileItem;)Lkotlin/jvm/functions/Function0;", "getStreamProvider$annotations", "(Lio/ktor/http/content/PartData$FileItem;)V", "streamProvider"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MultipartJvmKt {
    @kotlin.Deprecated(message = "This API uses blocking InputStream. Please use provider() directly.")
    public static /* synthetic */ void getStreamProvider$annotations(io.ktor.http.content.PartData.FileItem fileItem) {
    }

    public static final kotlin.jvm.functions.Function0<java.io.InputStream> getStreamProvider(final io.ktor.http.content.PartData.FileItem fileItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileItem, "");
        return new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.content.MultipartJvmKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.io.InputStream inputStream$default;
                inputStream$default = io.ktor.utils.io.jvm.javaio.BlockingKt.toInputStream$default(io.ktor.http.content.PartData.FileItem.this.getProvider().invoke(), null, 1, null);
                return inputStream$default;
            }
        };
    }
}
