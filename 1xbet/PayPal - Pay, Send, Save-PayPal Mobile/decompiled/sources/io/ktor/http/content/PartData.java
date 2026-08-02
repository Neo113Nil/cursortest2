package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004 !\"#B\u001f\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00118GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00178GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0001\u0004$%&'"}, d2 = {"Lio/ktor/http/content/PartData;", "", "Lkotlin/Function0;", "", "p0", "Lio/ktor/http/Headers;", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Lio/ktor/http/Headers;)V", "dispose", "Lkotlin/jvm/functions/Function0;", "getDispose", "()Lkotlin/jvm/functions/Function0;", "headers", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "Lio/ktor/http/ContentDisposition;", "contentDisposition$delegate", "Lkotlin/Lazy;", "getContentDisposition", "()Lio/ktor/http/ContentDisposition;", "contentDisposition", "Lio/ktor/http/ContentType;", "contentType$delegate", "getContentType", "()Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "getName", "()Ljava/lang/String;", "name", "FormItem", "FileItem", "BinaryItem", "BinaryChannelItem", "Lio/ktor/http/content/PartData$BinaryChannelItem;", "Lio/ktor/http/content/PartData$BinaryItem;", "Lio/ktor/http/content/PartData$FileItem;", "Lio/ktor/http/content/PartData$FormItem;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PartData {

    /* renamed from: contentDisposition$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy contentDisposition;

    /* renamed from: contentType$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy contentType;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> dispose;
    private final io.ktor.http.Headers headers;

    private PartData(kotlin.jvm.functions.Function0<kotlin.Unit> function0, io.ktor.http.Headers headers) {
        this.dispose = function0;
        this.headers = headers;
        this.contentDisposition = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.content.PartData$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return io.ktor.http.content.PartData.$r8$lambda$amtqs1AbSHDCvqjwTMWeuCdT0pU(io.ktor.http.content.PartData.this);
            }
        });
        this.contentType = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.content.PartData$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return io.ktor.http.content.PartData.$r8$lambda$2swyhJCWypdVTvZuPsxbF5xx3TA(io.ktor.http.content.PartData.this);
            }
        });
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getDispose() {
        return this.dispose;
    }

    public final io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lio/ktor/http/content/PartData$FormItem;", "Lio/ktor/http/content/PartData;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/Function0;", "", "dispose", "Lio/ktor/http/Headers;", "partHeaders", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lio/ktor/http/Headers;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class FormItem extends io.ktor.http.content.PartData {
        private final java.lang.String value;

        public final java.lang.String getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormItem(java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, io.ktor.http.Headers headers) {
            super(function0, headers, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            this.value = str;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/http/content/PartData$FileItem;", "Lio/ktor/http/content/PartData;", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "provider", "", "dispose", "Lio/ktor/http/Headers;", "partHeaders", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lio/ktor/http/Headers;)V", "Lkotlin/jvm/functions/Function0;", "getProvider", "()Lkotlin/jvm/functions/Function0;", "", "originalFileName", "Ljava/lang/String;", "getOriginalFileName", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FileItem extends io.ktor.http.content.PartData {
        private final java.lang.String originalFileName;
        private final kotlin.jvm.functions.Function0<io.ktor.utils.io.ByteReadChannel> provider;

        public final kotlin.jvm.functions.Function0<io.ktor.utils.io.ByteReadChannel> getProvider() {
            return this.provider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FileItem(kotlin.jvm.functions.Function0<? extends io.ktor.utils.io.ByteReadChannel> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, io.ktor.http.Headers headers) {
            super(function02, headers, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            this.provider = function0;
            io.ktor.http.ContentDisposition contentDisposition = getContentDisposition();
            this.originalFileName = contentDisposition != null ? contentDisposition.parameter("filename") : null;
        }

        public final java.lang.String getOriginalFileName() {
            return this.originalFileName;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR!\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/http/content/PartData$BinaryItem;", "Lio/ktor/http/content/PartData;", "Lkotlin/Function0;", "Lkotlinx/io/Source;", "Lio/ktor/utils/io/core/Input;", "provider", "", "dispose", "Lio/ktor/http/Headers;", "partHeaders", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lio/ktor/http/Headers;)V", "Lkotlin/jvm/functions/Function0;", "getProvider", "()Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class BinaryItem extends io.ktor.http.content.PartData {
        private final kotlin.jvm.functions.Function0<kotlinx.io.Source> provider;

        public final kotlin.jvm.functions.Function0<kotlinx.io.Source> getProvider() {
            return this.provider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public BinaryItem(kotlin.jvm.functions.Function0<? extends kotlinx.io.Source> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, io.ktor.http.Headers headers) {
            super(function02, headers, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            this.provider = function0;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/http/content/PartData$BinaryChannelItem;", "Lio/ktor/http/content/PartData;", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "provider", "Lio/ktor/http/Headers;", "partHeaders", "<init>", "(Lkotlin/jvm/functions/Function0;Lio/ktor/http/Headers;)V", "Lkotlin/jvm/functions/Function0;", "getProvider", "()Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class BinaryChannelItem extends io.ktor.http.content.PartData {
        private final kotlin.jvm.functions.Function0<io.ktor.utils.io.ByteReadChannel> provider;

        public final kotlin.jvm.functions.Function0<io.ktor.utils.io.ByteReadChannel> getProvider() {
            return this.provider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public BinaryChannelItem(kotlin.jvm.functions.Function0<? extends io.ktor.utils.io.ByteReadChannel> function0, io.ktor.http.Headers headers) {
            super(new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.content.PartData$BinaryChannelItem$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            }, headers, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            this.provider = function0;
        }
    }

    public final io.ktor.http.ContentDisposition getContentDisposition() {
        return (io.ktor.http.ContentDisposition) this.contentDisposition.getValue();
    }

    public final io.ktor.http.ContentType getContentType() {
        return (io.ktor.http.ContentType) this.contentType.getValue();
    }

    public final java.lang.String getName() {
        io.ktor.http.ContentDisposition contentDisposition = getContentDisposition();
        if (contentDisposition != null) {
            return contentDisposition.getName();
        }
        return null;
    }

    public static /* synthetic */ io.ktor.http.ContentType $r8$lambda$2swyhJCWypdVTvZuPsxbF5xx3TA(io.ktor.http.content.PartData partData) {
        java.lang.String str = partData.headers.get(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
        if (str != null) {
            return io.ktor.http.ContentType.INSTANCE.parse(str);
        }
        return null;
    }

    public static /* synthetic */ io.ktor.http.ContentDisposition $r8$lambda$amtqs1AbSHDCvqjwTMWeuCdT0pU(io.ktor.http.content.PartData partData) {
        java.lang.String str = partData.headers.get(io.ktor.http.HttpHeaders.INSTANCE.getContentDisposition());
        if (str != null) {
            return io.ktor.http.ContentDisposition.INSTANCE.parse(str);
        }
        return null;
    }

    public /* synthetic */ PartData(kotlin.jvm.functions.Function0 function0, io.ktor.http.Headers headers, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, headers);
    }
}
