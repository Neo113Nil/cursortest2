package io.ktor.client.request.forms;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0017\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R(\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lio/ktor/client/request/forms/MultiPartFormDataContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "", "Lio/ktor/http/content/PartData;", "parts", "", "boundary", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "<init>", "(Ljava/util/List;Ljava/lang/String;Lio/ktor/http/ContentType;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "", "getHighSpeedVideoFpsRanges", "[B", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Lio/ktor/client/request/forms/PreparedPart;", "Ljava/util/List;", "", "p0", "contentLength", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MultiPartFormDataContent extends io.ktor.http.content.OutgoingContent.WriteChannelContent {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String boundary;
    private java.lang.Long contentLength;
    private final io.ktor.http.ContentType contentType;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final byte[] getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<io.ktor.client.request.forms.PreparedPart> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MultiPartFormDataContent(java.util.List list, java.lang.String str, io.ktor.http.ContentType contentType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? io.ktor.http.ContentType.MultiPart.INSTANCE.getFormData().withParameter("boundary", str) : contentType);
        str = (i & 2) != 0 ? io.ktor.client.request.forms.FormDataContentKt.access$generateBoundary() : str;
    }

    public final java.lang.String getBoundary() {
        return this.boundary;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.ContentType getContentType() {
        return this.contentType;
    }

    public MultiPartFormDataContent(java.util.List<? extends io.ktor.http.content.PartData> list, java.lang.String str, io.ktor.http.ContentType contentType) {
        byte[] bArr;
        io.ktor.client.request.forms.PreparedPart channelPart;
        byte[] bArr2;
        byte[] bArr3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        this.boundary = str;
        this.contentType = contentType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("--");
        sb.append(str);
        sb.append(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        java.lang.Long l = null;
        byte[] byteArray$default = io.ktor.utils.io.core.StringsKt.toByteArray$default(sb.toString(), null, 1, null);
        this.getHighSpeedVideoSizes = byteArray$default;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("--");
        sb2.append(str);
        sb2.append("--\r\n");
        byte[] byteArray$default2 = io.ktor.utils.io.core.StringsKt.toByteArray$default(sb2.toString(), null, 1, null);
        this.getHighSpeedVideoFpsRangesFor = byteArray$default2;
        this.Camera2StreamConfigurationMap = byteArray$default2.length;
        bArr = io.ktor.client.request.forms.FormDataContentKt.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = (bArr.length * 2) + byteArray$default.length;
        java.util.List<? extends io.ktor.http.content.PartData> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (io.ktor.http.content.PartData partData : list2) {
            kotlinx.io.Sink BytePacketBuilder = io.ktor.utils.io.core.BytePacketBuilderKt.BytePacketBuilder();
            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : partData.getHeaders().entries()) {
                java.lang.String key = entry.getKey();
                java.util.List<java.lang.String> value = entry.getValue();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(key);
                sb3.append(": ");
                sb3.append(kotlin.collections.CollectionsKt.joinToString$default(value, "; ", null, null, 0, null, null, 62, null));
                io.ktor.utils.io.core.StringsKt.writeText$default(BytePacketBuilder, sb3.toString(), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
                bArr3 = io.ktor.client.request.forms.FormDataContentKt.getHighResolutionOutputSizeshNQ4ISI;
                io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default(BytePacketBuilder, bArr3, 0, 0, 6, null);
            }
            java.lang.String str2 = partData.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
            java.lang.Long valueOf = str2 != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(str2)) : null;
            if (partData instanceof io.ktor.http.content.PartData.FileItem) {
                channelPart = new io.ktor.client.request.forms.PreparedPart.ChannelPart(kotlinx.io.SourcesKt.readByteArray(io.ktor.utils.io.core.BytePacketBuilderKt.build(BytePacketBuilder)), ((io.ktor.http.content.PartData.FileItem) partData).getProvider(), valueOf != null ? java.lang.Long.valueOf(valueOf.longValue() + this.getHighSpeedVideoFpsRanges + r4.length) : null);
            } else if (partData instanceof io.ktor.http.content.PartData.BinaryItem) {
                channelPart = new io.ktor.client.request.forms.PreparedPart.InputPart(kotlinx.io.SourcesKt.readByteArray(io.ktor.utils.io.core.BytePacketBuilderKt.build(BytePacketBuilder)), ((io.ktor.http.content.PartData.BinaryItem) partData).getProvider(), valueOf != null ? java.lang.Long.valueOf(valueOf.longValue() + this.getHighSpeedVideoFpsRanges + r4.length) : null);
            } else if (!(partData instanceof io.ktor.http.content.PartData.FormItem)) {
                if (!(partData instanceof io.ktor.http.content.PartData.BinaryChannelItem)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                channelPart = new io.ktor.client.request.forms.PreparedPart.ChannelPart(kotlinx.io.SourcesKt.readByteArray(io.ktor.utils.io.core.BytePacketBuilderKt.build(BytePacketBuilder)), ((io.ktor.http.content.PartData.BinaryChannelItem) partData).getProvider(), valueOf != null ? java.lang.Long.valueOf(valueOf.longValue() + this.getHighSpeedVideoFpsRanges + r4.length) : null);
            } else {
                kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
                io.ktor.utils.io.core.StringsKt.writeText$default(buffer, ((io.ktor.http.content.PartData.FormItem) partData).getValue(), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
                final byte[] readByteArray = kotlinx.io.SourcesKt.readByteArray(buffer);
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.request.forms.MultiPartFormDataContent$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return io.ktor.client.request.forms.MultiPartFormDataContent.$r8$lambda$axhT_zdV_XUGJx10aWfuElv1vzs(readByteArray);
                    }
                };
                if (valueOf == null) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
                    sb4.append(": ");
                    sb4.append(readByteArray.length);
                    io.ktor.utils.io.core.StringsKt.writeText$default(BytePacketBuilder, sb4.toString(), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
                    bArr2 = io.ktor.client.request.forms.FormDataContentKt.getHighResolutionOutputSizeshNQ4ISI;
                    io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default(BytePacketBuilder, bArr2, 0, 0, 6, null);
                }
                channelPart = new io.ktor.client.request.forms.PreparedPart.InputPart(kotlinx.io.SourcesKt.readByteArray(io.ktor.utils.io.core.BytePacketBuilderKt.build(BytePacketBuilder)), function0, java.lang.Long.valueOf(readByteArray.length + this.getHighSpeedVideoFpsRanges + r4.length));
            }
            arrayList.add(channelPart);
        }
        java.util.ArrayList arrayList2 = arrayList;
        this.getHighResolutionOutputSizeshNQ4ISI = arrayList2;
        java.lang.Long l2 = 0L;
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                l = l2;
                break;
            }
            java.lang.Long size = ((io.ktor.client.request.forms.PreparedPart) it.next()).getSize();
            if (size == null) {
                break;
            } else {
                l2 = l2 != null ? java.lang.Long.valueOf(l2.longValue() + size.longValue()) : null;
            }
        }
        this.contentLength = l != null ? java.lang.Long.valueOf(l.longValue() + this.Camera2StreamConfigurationMap) : l;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final java.lang.Long getContentLength() {
        return this.contentLength;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|97|6|7|8|(3:(1:50)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01b7, code lost:
    
        if (r14.flushAndClose(r0) != r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018b, code lost:
    
        if (r15 != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0171, code lost:
    
        if (io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(r14, r4, r0) != r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0061, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0062, code lost:
    
        r15 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0195, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ba, code lost:
    
        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bd, code lost:
    
        r0.getHighSpeedVideoSizes = null;
        r0.getHighSpeedVideoFpsRanges = null;
        r0.Camera2StreamConfigurationMap = null;
        r0.getHighResolutionOutputSizeshNQ4ISI = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01cb, code lost:
    
        if (r14.flushAndClose(r0) == r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d0, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d1, code lost:
    
        r0.getHighSpeedVideoSizes = r15;
        r0.getHighSpeedVideoFpsRanges = null;
        r0.Camera2StreamConfigurationMap = null;
        r0.getHighResolutionOutputSizeshNQ4ISI = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01df, code lost:
    
        if (r14.flushAndClose(r0) != r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e3, code lost:
    
        throw r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0044, code lost:
    
        r15 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00af, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00b0, code lost:
    
        r15 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0151, code lost:
    
        r14 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4 A[Catch: all -> 0x0061, TryCatch #1 {all -> 0x0061, blocks: (B:23:0x004f, B:24:0x00be, B:26:0x00c4, B:29:0x00e4, B:44:0x0174, B:60:0x0197, B:65:0x005c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121 A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00af, blocks: (B:37:0x0121, B:42:0x0143, B:56:0x0158, B:58:0x018f, B:59:0x0194, B:52:0x014d, B:53:0x0150, B:70:0x0085, B:72:0x0096, B:75:0x00a9, B:38:0x012d, B:41:0x0141, B:68:0x0071, B:49:0x014b), top: B:7:0x0022, inners: #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0197 A[Catch: all -> 0x0061, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0061, blocks: (B:23:0x004f, B:24:0x00be, B:26:0x00c4, B:29:0x00e4, B:44:0x0174, B:60:0x0197, B:65:0x005c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x018b -> B:24:0x00be). Please report as a decompilation issue!!! */
    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1 multiPartFormDataContent$writeTo$1;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        java.util.Iterator<io.ktor.client.request.forms.PreparedPart> it;
        io.ktor.client.request.forms.PreparedPart preparedPart;
        java.util.Iterator<io.ktor.client.request.forms.PreparedPart> it2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4;
        java.util.Iterator<io.ktor.client.request.forms.PreparedPart> it3;
        io.ktor.client.request.forms.PreparedPart preparedPart2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel5;
        io.ktor.client.request.forms.PreparedPart preparedPart3;
        kotlinx.io.Source source;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel6;
        byte[] bArr;
        byte[] bArr2;
        byte[] headers;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel7;
        if (continuation instanceof io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1) {
            multiPartFormDataContent$writeTo$1 = (io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1) continuation;
            if ((multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                byteWriteChannel2 = multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI;
                switch (byteWriteChannel2) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel;
                        it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                        if (!it.hasNext()) {
                            io.ktor.client.request.forms.PreparedPart next = it.next();
                            byte[] bArr3 = this.getHighSpeedVideoSizes;
                            multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes = byteWriteChannel2;
                            multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges = it;
                            multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap = next;
                            multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel2, bArr3, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                                it2 = it;
                                preparedPart = next;
                                byteWriteChannel4 = byteWriteChannel2;
                                headers = preparedPart.getHeaders();
                                multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes = byteWriteChannel4;
                                multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges = it2;
                                multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap = preparedPart;
                                multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel4, headers, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                                    java.util.Iterator<io.ktor.client.request.forms.PreparedPart> it4 = it2;
                                    preparedPart2 = preparedPart;
                                    byteWriteChannel5 = byteWriteChannel4;
                                    it3 = it4;
                                    bArr2 = io.ktor.client.request.forms.FormDataContentKt.getHighResolutionOutputSizeshNQ4ISI;
                                    multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes = byteWriteChannel5;
                                    multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges = it3;
                                    multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap = preparedPart2;
                                    multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                                    if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel5, bArr2, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                                        byteWriteChannel3 = byteWriteChannel5;
                                        preparedPart3 = preparedPart2;
                                        if (preparedPart3 instanceof io.ktor.client.request.forms.PreparedPart.InputPart) {
                                            source = ((io.ktor.client.request.forms.PreparedPart.InputPart) preparedPart3).getProvider().invoke();
                                            multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes = byteWriteChannel3;
                                            multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges = it3;
                                            multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap = source;
                                            multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI = 4;
                                            if (io.ktor.client.request.forms.FormDataContentKt.access$copyTo(source, byteWriteChannel3, multiPartFormDataContent$writeTo$1) == coroutine_suspended) {
                                            }
                                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                            kotlin.jdk7.AutoCloseableKt.closeFinally(source, null);
                                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                            it = it3;
                                            byteWriteChannel6 = byteWriteChannel3;
                                            bArr = io.ktor.client.request.forms.FormDataContentKt.getHighResolutionOutputSizeshNQ4ISI;
                                            multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes = byteWriteChannel6;
                                            multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges = it;
                                            multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap = null;
                                            multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI = 6;
                                            java.lang.Object writeFully$default = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel6, bArr, 0, 0, multiPartFormDataContent$writeTo$1, 6, null);
                                            byteWriteChannel2 = byteWriteChannel6;
                                            break;
                                        } else {
                                            if (!(preparedPart3 instanceof io.ktor.client.request.forms.PreparedPart.ChannelPart)) {
                                                throw new kotlin.NoWhenBranchMatchedException();
                                            }
                                            io.ktor.utils.io.ByteReadChannel invoke = ((io.ktor.client.request.forms.PreparedPart.ChannelPart) preparedPart3).getProvider().invoke();
                                            multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes = byteWriteChannel3;
                                            multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges = it3;
                                            multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap = null;
                                            multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI = 5;
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
                            multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes = byteWriteChannel2;
                            multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges = null;
                            multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI = 7;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel2, bArr4, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                                byteWriteChannel7 = byteWriteChannel2;
                                multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes = null;
                                multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI = 8;
                                break;
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        preparedPart = (io.ktor.client.request.forms.PreparedPart) multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap;
                        java.util.Iterator<io.ktor.client.request.forms.PreparedPart> it5 = (java.util.Iterator) multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges;
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel8 = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        it2 = it5;
                        byteWriteChannel4 = byteWriteChannel8;
                        headers = preparedPart.getHeaders();
                        multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes = byteWriteChannel4;
                        multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges = it2;
                        multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap = preparedPart;
                        multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel4, headers, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        io.ktor.client.request.forms.PreparedPart preparedPart4 = (io.ktor.client.request.forms.PreparedPart) multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap;
                        it3 = (java.util.Iterator) multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges;
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel9 = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        preparedPart2 = preparedPart4;
                        byteWriteChannel5 = byteWriteChannel9;
                        bArr2 = io.ktor.client.request.forms.FormDataContentKt.getHighResolutionOutputSizeshNQ4ISI;
                        multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes = byteWriteChannel5;
                        multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges = it3;
                        multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap = preparedPart2;
                        multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel5, bArr2, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        preparedPart3 = (io.ktor.client.request.forms.PreparedPart) multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap;
                        it3 = (java.util.Iterator) multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges;
                        byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (preparedPart3 instanceof io.ktor.client.request.forms.PreparedPart.InputPart) {
                        }
                        return coroutine_suspended;
                    case 4:
                        source = (java.lang.AutoCloseable) multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap;
                        it3 = (java.util.Iterator) multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges;
                        byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            kotlin.jdk7.AutoCloseableKt.closeFinally(source, null);
                            kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                            it = it3;
                            byteWriteChannel6 = byteWriteChannel3;
                            bArr = io.ktor.client.request.forms.FormDataContentKt.getHighResolutionOutputSizeshNQ4ISI;
                            multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes = byteWriteChannel6;
                            multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges = it;
                            multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap = null;
                            multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI = 6;
                            java.lang.Object writeFully$default2 = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel6, bArr, 0, 0, multiPartFormDataContent$writeTo$1, 6, null);
                            byteWriteChannel2 = byteWriteChannel6;
                            break;
                        } finally {
                        }
                    case 5:
                        it = (java.util.Iterator) multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges;
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel10 = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        byteWriteChannel6 = byteWriteChannel10;
                        bArr = io.ktor.client.request.forms.FormDataContentKt.getHighResolutionOutputSizeshNQ4ISI;
                        multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes = byteWriteChannel6;
                        multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges = it;
                        multiPartFormDataContent$writeTo$1.Camera2StreamConfigurationMap = null;
                        multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI = 6;
                        java.lang.Object writeFully$default22 = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel6, bArr, 0, 0, multiPartFormDataContent$writeTo$1, 6, null);
                        byteWriteChannel2 = byteWriteChannel6;
                        break;
                    case 6:
                        it = (java.util.Iterator) multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRanges;
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel11 = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel11;
                        if (!it.hasNext()) {
                        }
                        return coroutine_suspended;
                    case 7:
                        byteWriteChannel7 = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes = null;
                        multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI = 8;
                        break;
                    case 8:
                    case 9:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    case 10:
                        java.lang.Throwable th = (java.lang.Throwable) multiPartFormDataContent$writeTo$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        throw th;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        multiPartFormDataContent$writeTo$1 = new io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1(this, continuation);
        java.lang.Object obj2 = multiPartFormDataContent$writeTo$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        byteWriteChannel2 = multiPartFormDataContent$writeTo$1.getHighResolutionOutputSizeshNQ4ISI;
        switch (byteWriteChannel2) {
        }
    }

    public static /* synthetic */ kotlinx.io.Source $r8$lambda$axhT_zdV_XUGJx10aWfuElv1vzs(byte[] bArr) {
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default(buffer, bArr, 0, 0, 6, null);
        return buffer;
    }
}
