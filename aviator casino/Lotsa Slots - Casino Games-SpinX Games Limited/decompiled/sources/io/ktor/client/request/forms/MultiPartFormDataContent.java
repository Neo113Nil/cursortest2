package io.ktor.client.request.forms;

/* compiled from: FormDataContent.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/ktor/client/request/forms/MultiPartFormDataContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "", "Lio/ktor/http/content/PartData;", "parts", "", "boundary", "Lio/ktor/http/ContentType;", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "<init>", "(Ljava/util/List;Ljava/lang/String;Lio/ktor/http/ContentType;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "", "BOUNDARY_BYTES", "[B", "LAST_BOUNDARY_BYTES", "", "BODY_OVERHEAD_SIZE", "I", "PART_OVERHEAD_SIZE", "Lio/ktor/client/request/forms/PreparedPart;", "rawParts", "Ljava/util/List;", "", "value", "contentLength", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MultiPartFormDataContent extends io.ktor.http.content.OutgoingContent.WriteChannelContent {
    private final int BODY_OVERHEAD_SIZE;
    private final byte[] BOUNDARY_BYTES;
    private final byte[] LAST_BOUNDARY_BYTES;
    private final int PART_OVERHEAD_SIZE;
    private final java.lang.String boundary;
    private java.lang.Long contentLength;
    private final io.ktor.http.ContentType contentType;
    private final java.util.List<io.ktor.client.request.forms.PreparedPart> rawParts;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MultiPartFormDataContent(java.util.List list, java.lang.String str, io.ktor.http.ContentType contentType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? io.ktor.http.ContentType.MultiPart.INSTANCE.getFormData().withParameter("boundary", str) : contentType);
        str = (i & 2) != 0 ? io.ktor.client.request.forms.FormDataContentKt.generateBoundary() : str;
    }

    public final java.lang.String getBoundary() {
        return this.boundary;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.ContentType getContentType() {
        return this.contentType;
    }

    public MultiPartFormDataContent(java.util.List<? extends io.ktor.http.content.PartData> parts, java.lang.String boundary, io.ktor.http.ContentType contentType) {
        byte[] bArr;
        io.ktor.client.request.forms.PreparedPart channelPart;
        byte[] bArr2;
        byte[] bArr3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parts, "parts");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boundary, "boundary");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.boundary = boundary;
        this.contentType = contentType;
        java.lang.Long l = null;
        byte[] byteArray$default = io.ktor.utils.io.core.StringsKt.toByteArray$default("--" + boundary + io.ktor.sse.ServerSentEventKt.END_OF_LINE, null, 1, null);
        this.BOUNDARY_BYTES = byteArray$default;
        byte[] byteArray$default2 = io.ktor.utils.io.core.StringsKt.toByteArray$default("--" + boundary + "--\r\n", null, 1, null);
        this.LAST_BOUNDARY_BYTES = byteArray$default2;
        this.BODY_OVERHEAD_SIZE = byteArray$default2.length;
        bArr = io.ktor.client.request.forms.FormDataContentKt.RN_BYTES;
        this.PART_OVERHEAD_SIZE = (bArr.length * 2) + byteArray$default.length;
        java.util.List<? extends io.ktor.http.content.PartData> list = parts;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (io.ktor.http.content.PartData partData : list) {
            kotlinx.io.Sink BytePacketBuilder = io.ktor.utils.io.core.BytePacketBuilderKt.BytePacketBuilder();
            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : partData.getHeaders().entries()) {
                io.ktor.utils.io.core.StringsKt.writeText$default(BytePacketBuilder, entry.getKey() + ": " + kotlin.collections.CollectionsKt.joinToString$default(entry.getValue(), "; ", null, null, 0, null, null, 62, null), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
                bArr3 = io.ktor.client.request.forms.FormDataContentKt.RN_BYTES;
                io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default(BytePacketBuilder, bArr3, 0, 0, 6, null);
            }
            java.lang.String str = partData.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
            java.lang.Long valueOf = str != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(str)) : null;
            if (partData instanceof io.ktor.http.content.PartData.FileItem) {
                channelPart = new io.ktor.client.request.forms.PreparedPart.ChannelPart(kotlinx.io.SourcesKt.readByteArray(io.ktor.utils.io.core.BytePacketBuilderKt.build(BytePacketBuilder)), ((io.ktor.http.content.PartData.FileItem) partData).getProvider(), valueOf != null ? java.lang.Long.valueOf(valueOf.longValue() + this.PART_OVERHEAD_SIZE + r4.length) : null);
            } else if (partData instanceof io.ktor.http.content.PartData.BinaryItem) {
                channelPart = new io.ktor.client.request.forms.PreparedPart.InputPart(kotlinx.io.SourcesKt.readByteArray(io.ktor.utils.io.core.BytePacketBuilderKt.build(BytePacketBuilder)), ((io.ktor.http.content.PartData.BinaryItem) partData).getProvider(), valueOf != null ? java.lang.Long.valueOf(valueOf.longValue() + this.PART_OVERHEAD_SIZE + r4.length) : null);
            } else if (!(partData instanceof io.ktor.http.content.PartData.FormItem)) {
                if (!(partData instanceof io.ktor.http.content.PartData.BinaryChannelItem)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                channelPart = new io.ktor.client.request.forms.PreparedPart.ChannelPart(kotlinx.io.SourcesKt.readByteArray(io.ktor.utils.io.core.BytePacketBuilderKt.build(BytePacketBuilder)), ((io.ktor.http.content.PartData.BinaryChannelItem) partData).getProvider(), valueOf != null ? java.lang.Long.valueOf(valueOf.longValue() + this.PART_OVERHEAD_SIZE + r4.length) : null);
            } else {
                kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
                io.ktor.utils.io.core.StringsKt.writeText$default(buffer, ((io.ktor.http.content.PartData.FormItem) partData).getValue(), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
                final byte[] readByteArray = kotlinx.io.SourcesKt.readByteArray(buffer);
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.request.forms.MultiPartFormDataContent$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlinx.io.Source rawParts$lambda$3$lambda$2;
                        rawParts$lambda$3$lambda$2 = io.ktor.client.request.forms.MultiPartFormDataContent.rawParts$lambda$3$lambda$2(readByteArray);
                        return rawParts$lambda$3$lambda$2;
                    }
                };
                if (valueOf == null) {
                    io.ktor.utils.io.core.StringsKt.writeText$default(BytePacketBuilder, io.ktor.http.HttpHeaders.INSTANCE.getContentLength() + ": " + readByteArray.length, 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
                    bArr2 = io.ktor.client.request.forms.FormDataContentKt.RN_BYTES;
                    io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default(BytePacketBuilder, bArr2, 0, 0, 6, null);
                }
                channelPart = new io.ktor.client.request.forms.PreparedPart.InputPart(kotlinx.io.SourcesKt.readByteArray(io.ktor.utils.io.core.BytePacketBuilderKt.build(BytePacketBuilder)), function0, java.lang.Long.valueOf(readByteArray.length + this.PART_OVERHEAD_SIZE + r4.length));
            }
            arrayList.add(channelPart);
        }
        java.util.ArrayList arrayList2 = arrayList;
        this.rawParts = arrayList2;
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
        this.contentLength = l != null ? java.lang.Long.valueOf(l.longValue() + this.BODY_OVERHEAD_SIZE) : l;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public java.lang.Long getContentLength() {
        return this.contentLength;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|104|6|7|8|(2:(0)|(1:55))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e1, code lost:
    
        throw r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0060, code lost:
    
        r15 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0061, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b6, code lost:
    
        r15 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00b0, code lost:
    
        r15 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00b1, code lost:
    
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b7, code lost:
    
        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ba, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c8, code lost:
    
        if (r14.flushAndClose(r0) == r1) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ca, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ce, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cf, code lost:
    
        r0.L$0 = r15;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01dd, code lost:
    
        if (r14.flushAndClose(r0) == r1) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01df, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3 A[Catch: all -> 0x01b6, TryCatch #4 {all -> 0x01b6, blocks: (B:18:0x003f, B:25:0x00bd, B:27:0x00c3, B:30:0x00e1, B:33:0x00fb, B:47:0x0170, B:68:0x0193, B:86:0x00b7), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:37:0x0117, B:39:0x011c, B:45:0x013e, B:59:0x014b, B:61:0x014f, B:66:0x018d, B:67:0x0192, B:57:0x0147, B:58:0x014a, B:77:0x0084, B:80:0x0096, B:83:0x00a9, B:40:0x0128, B:44:0x013c, B:75:0x0070, B:54:0x0145), top: B:7:0x0022, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:37:0x0117, B:39:0x011c, B:45:0x013e, B:59:0x014b, B:61:0x014f, B:66:0x018d, B:67:0x0192, B:57:0x0147, B:58:0x014a, B:77:0x0084, B:80:0x0096, B:83:0x00a9, B:40:0x0128, B:44:0x013c, B:75:0x0070, B:54:0x0145), top: B:7:0x0022, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0193 A[Catch: all -> 0x01b6, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x01b6, blocks: (B:18:0x003f, B:25:0x00bd, B:27:0x00c3, B:30:0x00e1, B:33:0x00fb, B:47:0x0170, B:68:0x0193, B:86:0x00b7), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x018a -> B:25:0x00bd). Please report as a decompilation issue!!! */
    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1 multiPartFormDataContent$writeTo$1;
        ?? r2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        java.util.Iterator<io.ktor.client.request.forms.PreparedPart> it;
        io.ktor.client.request.forms.PreparedPart preparedPart;
        io.ktor.client.request.forms.PreparedPart preparedPart2;
        kotlinx.io.Source source;
        java.util.Iterator<io.ktor.client.request.forms.PreparedPart> it2;
        java.util.Iterator<io.ktor.client.request.forms.PreparedPart> it3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        byte[] bArr;
        java.lang.Object copyTo;
        byte[] bArr2;
        byte[] headers;
        if (continuation instanceof io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1) {
            multiPartFormDataContent$writeTo$1 = (io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1) continuation;
            if ((multiPartFormDataContent$writeTo$1.label & Integer.MIN_VALUE) != 0) {
                multiPartFormDataContent$writeTo$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = multiPartFormDataContent$writeTo$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = multiPartFormDataContent$writeTo$1.label;
                switch (r2) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        it = this.rawParts.iterator();
                        if (it.hasNext()) {
                            preparedPart = it.next();
                            byte[] bArr3 = this.BOUNDARY_BYTES;
                            multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                            multiPartFormDataContent$writeTo$1.L$1 = it;
                            multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                            multiPartFormDataContent$writeTo$1.label = 1;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr3, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            headers = preparedPart.getHeaders();
                            multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                            multiPartFormDataContent$writeTo$1.L$1 = it;
                            multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                            multiPartFormDataContent$writeTo$1.label = 2;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, headers, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            bArr2 = io.ktor.client.request.forms.FormDataContentKt.RN_BYTES;
                            multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                            multiPartFormDataContent$writeTo$1.L$1 = it;
                            multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                            multiPartFormDataContent$writeTo$1.label = 3;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr2, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteWriteChannel2 = byteWriteChannel;
                            preparedPart2 = preparedPart;
                            if (preparedPart2 instanceof io.ktor.client.request.forms.PreparedPart.InputPart) {
                                source = ((io.ktor.client.request.forms.PreparedPart.InputPart) preparedPart2).getProvider().invoke();
                                multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel2;
                                multiPartFormDataContent$writeTo$1.L$1 = it;
                                multiPartFormDataContent$writeTo$1.L$2 = source;
                                multiPartFormDataContent$writeTo$1.label = 4;
                                copyTo = io.ktor.client.request.forms.FormDataContentKt.copyTo(source, byteWriteChannel2, multiPartFormDataContent$writeTo$1);
                                if (copyTo == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it2 = it;
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlin.jdk7.AutoCloseableKt.closeFinally(source, null);
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                byteWriteChannel = byteWriteChannel2;
                                bArr = io.ktor.client.request.forms.FormDataContentKt.RN_BYTES;
                                multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                                multiPartFormDataContent$writeTo$1.L$1 = it2;
                                multiPartFormDataContent$writeTo$1.L$2 = null;
                                multiPartFormDataContent$writeTo$1.label = 6;
                                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                                }
                            } else {
                                if (!(preparedPart2 instanceof io.ktor.client.request.forms.PreparedPart.ChannelPart)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                io.ktor.utils.io.ByteReadChannel invoke = ((io.ktor.client.request.forms.PreparedPart.ChannelPart) preparedPart2).getProvider().invoke();
                                multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel2;
                                multiPartFormDataContent$writeTo$1.L$1 = it;
                                multiPartFormDataContent$writeTo$1.L$2 = null;
                                multiPartFormDataContent$writeTo$1.label = 5;
                                if (io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(invoke, byteWriteChannel2, multiPartFormDataContent$writeTo$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it3 = it;
                                byteWriteChannel3 = byteWriteChannel2;
                                io.ktor.utils.io.ByteWriteChannel byteWriteChannel4 = byteWriteChannel3;
                                it2 = it3;
                                byteWriteChannel = byteWriteChannel4;
                                bArr = io.ktor.client.request.forms.FormDataContentKt.RN_BYTES;
                                multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                                multiPartFormDataContent$writeTo$1.L$1 = it2;
                                multiPartFormDataContent$writeTo$1.L$2 = null;
                                multiPartFormDataContent$writeTo$1.label = 6;
                                if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it = it2;
                                if (it.hasNext()) {
                                    byte[] bArr4 = this.LAST_BOUNDARY_BYTES;
                                    multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                                    multiPartFormDataContent$writeTo$1.L$1 = null;
                                    multiPartFormDataContent$writeTo$1.label = 7;
                                    if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr4, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    multiPartFormDataContent$writeTo$1.L$0 = null;
                                    multiPartFormDataContent$writeTo$1.label = 8;
                                    if (byteWriteChannel.flushAndClose(multiPartFormDataContent$writeTo$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            }
                        }
                    case 1:
                        io.ktor.client.request.forms.PreparedPart preparedPart3 = (io.ktor.client.request.forms.PreparedPart) multiPartFormDataContent$writeTo$1.L$2;
                        java.util.Iterator<io.ktor.client.request.forms.PreparedPart> it4 = (java.util.Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel5 = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        it = it4;
                        preparedPart = preparedPart3;
                        byteWriteChannel = byteWriteChannel5;
                        headers = preparedPart.getHeaders();
                        multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                        multiPartFormDataContent$writeTo$1.L$1 = it;
                        multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                        multiPartFormDataContent$writeTo$1.label = 2;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, headers, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                        }
                        bArr2 = io.ktor.client.request.forms.FormDataContentKt.RN_BYTES;
                        multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                        multiPartFormDataContent$writeTo$1.L$1 = it;
                        multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                        multiPartFormDataContent$writeTo$1.label = 3;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr2, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                        }
                        break;
                    case 2:
                        io.ktor.client.request.forms.PreparedPart preparedPart4 = (io.ktor.client.request.forms.PreparedPart) multiPartFormDataContent$writeTo$1.L$2;
                        java.util.Iterator<io.ktor.client.request.forms.PreparedPart> it5 = (java.util.Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel6 = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        it = it5;
                        preparedPart = preparedPart4;
                        byteWriteChannel = byteWriteChannel6;
                        bArr2 = io.ktor.client.request.forms.FormDataContentKt.RN_BYTES;
                        multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                        multiPartFormDataContent$writeTo$1.L$1 = it;
                        multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                        multiPartFormDataContent$writeTo$1.label = 3;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr2, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                        }
                        break;
                    case 3:
                        preparedPart2 = (io.ktor.client.request.forms.PreparedPart) multiPartFormDataContent$writeTo$1.L$2;
                        java.util.Iterator<io.ktor.client.request.forms.PreparedPart> it6 = (java.util.Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        it = it6;
                        if (preparedPart2 instanceof io.ktor.client.request.forms.PreparedPart.InputPart) {
                        }
                        break;
                    case 4:
                        source = (java.lang.AutoCloseable) multiPartFormDataContent$writeTo$1.L$2;
                        it2 = (java.util.Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            kotlin.jdk7.AutoCloseableKt.closeFinally(source, null);
                            kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                            byteWriteChannel = byteWriteChannel2;
                            bArr = io.ktor.client.request.forms.FormDataContentKt.RN_BYTES;
                            multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                            multiPartFormDataContent$writeTo$1.L$1 = it2;
                            multiPartFormDataContent$writeTo$1.L$2 = null;
                            multiPartFormDataContent$writeTo$1.label = 6;
                            if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                            }
                        } finally {
                        }
                        break;
                    case 5:
                        it3 = (java.util.Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel42 = byteWriteChannel3;
                        it2 = it3;
                        byteWriteChannel = byteWriteChannel42;
                        bArr = io.ktor.client.request.forms.FormDataContentKt.RN_BYTES;
                        multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                        multiPartFormDataContent$writeTo$1.L$1 = it2;
                        multiPartFormDataContent$writeTo$1.L$2 = null;
                        multiPartFormDataContent$writeTo$1.label = 6;
                        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                        }
                        break;
                    case 6:
                        java.util.Iterator<io.ktor.client.request.forms.PreparedPart> it7 = (java.util.Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel7 = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        it = it7;
                        byteWriteChannel = byteWriteChannel7;
                        if (it.hasNext()) {
                        }
                        break;
                    case 7:
                        byteWriteChannel = (io.ktor.utils.io.ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        multiPartFormDataContent$writeTo$1.L$0 = null;
                        multiPartFormDataContent$writeTo$1.label = 8;
                        if (byteWriteChannel.flushAndClose(multiPartFormDataContent$writeTo$1) == coroutine_suspended) {
                        }
                        return kotlin.Unit.INSTANCE;
                    case 8:
                    case 9:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    case 10:
                        java.lang.Throwable th = (java.lang.Throwable) multiPartFormDataContent$writeTo$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        throw th;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        multiPartFormDataContent$writeTo$1 = new io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1(this, continuation);
        java.lang.Object obj2 = multiPartFormDataContent$writeTo$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = multiPartFormDataContent$writeTo$1.label;
        switch (r2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.io.Source rawParts$lambda$3$lambda$2(byte[] bArr) {
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        io.ktor.utils.io.core.BytePacketBuilderKt.writeFully$default(buffer, bArr, 0, 0, 6, null);
        return buffer;
    }
}
