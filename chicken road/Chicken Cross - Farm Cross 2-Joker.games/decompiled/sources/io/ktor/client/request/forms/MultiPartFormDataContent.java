package io.ktor.client.request.forms;

import io.ktor.client.request.forms.PreparedPart;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.PartData;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;

/* compiled from: FormDataContent.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/ktor/client/request/forms/MultiPartFormDataContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "", "Lio/ktor/http/content/PartData;", "parts", "", "boundary", "Lio/ktor/http/ContentType;", "contentType", "<init>", "(Ljava/util/List;Ljava/lang/String;Lio/ktor/http/ContentType;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "", "BOUNDARY_BYTES", "[B", "LAST_BOUNDARY_BYTES", "", "BODY_OVERHEAD_SIZE", "I", "PART_OVERHEAD_SIZE", "Lio/ktor/client/request/forms/PreparedPart;", "rawParts", "Ljava/util/List;", "", "value", "contentLength", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MultiPartFormDataContent extends OutgoingContent.WriteChannelContent {
    private final int BODY_OVERHEAD_SIZE;
    private final byte[] BOUNDARY_BYTES;
    private final byte[] LAST_BOUNDARY_BYTES;
    private final int PART_OVERHEAD_SIZE;
    private final String boundary;
    private Long contentLength;
    private final ContentType contentType;
    private final List<PreparedPart> rawParts;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MultiPartFormDataContent(List list, String str, ContentType contentType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? ContentType.MultiPart.INSTANCE.getFormData().withParameter("boundary", str) : contentType);
        str = (i & 2) != 0 ? FormDataContentKt.generateBoundary() : str;
    }

    public final String getBoundary() {
        return this.boundary;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    public MultiPartFormDataContent(List<? extends PartData> parts, String boundary, ContentType contentType) {
        byte[] bArr;
        PreparedPart channelPart;
        byte[] bArr2;
        byte[] bArr3;
        Intrinsics.checkNotNullParameter(parts, "parts");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.boundary = boundary;
        this.contentType = contentType;
        Long l = null;
        byte[] byteArray$default = StringsKt.toByteArray$default("--" + boundary + ServerSentEventKt.END_OF_LINE, null, 1, null);
        this.BOUNDARY_BYTES = byteArray$default;
        byte[] byteArray$default2 = StringsKt.toByteArray$default("--" + boundary + "--\r\n", null, 1, null);
        this.LAST_BOUNDARY_BYTES = byteArray$default2;
        this.BODY_OVERHEAD_SIZE = byteArray$default2.length;
        bArr = FormDataContentKt.RN_BYTES;
        this.PART_OVERHEAD_SIZE = (bArr.length * 2) + byteArray$default.length;
        List<? extends PartData> list = parts;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (PartData partData : list) {
            Sink BytePacketBuilder = BytePacketBuilderKt.BytePacketBuilder();
            for (Map.Entry<String, List<String>> entry : partData.getHeaders().entries()) {
                StringsKt.writeText$default(BytePacketBuilder, entry.getKey() + ": " + CollectionsKt.joinToString$default(entry.getValue(), "; ", null, null, 0, null, null, 62, null), 0, 0, (Charset) null, 14, (Object) null);
                bArr3 = FormDataContentKt.RN_BYTES;
                BytePacketBuilderKt.writeFully$default(BytePacketBuilder, bArr3, 0, 0, 6, null);
            }
            String str = partData.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
            Long valueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
            if (partData instanceof PartData.FileItem) {
                channelPart = new PreparedPart.ChannelPart(SourcesKt.readByteArray(BytePacketBuilderKt.build(BytePacketBuilder)), ((PartData.FileItem) partData).getProvider(), valueOf != null ? Long.valueOf(valueOf.longValue() + this.PART_OVERHEAD_SIZE + r4.length) : null);
            } else if (partData instanceof PartData.BinaryItem) {
                channelPart = new PreparedPart.InputPart(SourcesKt.readByteArray(BytePacketBuilderKt.build(BytePacketBuilder)), ((PartData.BinaryItem) partData).getProvider(), valueOf != null ? Long.valueOf(valueOf.longValue() + this.PART_OVERHEAD_SIZE + r4.length) : null);
            } else if (!(partData instanceof PartData.FormItem)) {
                if (!(partData instanceof PartData.BinaryChannelItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                channelPart = new PreparedPart.ChannelPart(SourcesKt.readByteArray(BytePacketBuilderKt.build(BytePacketBuilder)), ((PartData.BinaryChannelItem) partData).getProvider(), valueOf != null ? Long.valueOf(valueOf.longValue() + this.PART_OVERHEAD_SIZE + r4.length) : null);
            } else {
                Buffer buffer = new Buffer();
                StringsKt.writeText$default(buffer, ((PartData.FormItem) partData).getValue(), 0, 0, (Charset) null, 14, (Object) null);
                final byte[] readByteArray = SourcesKt.readByteArray(buffer);
                Function0 function0 = new Function0() { // from class: io.ktor.client.request.forms.MultiPartFormDataContent$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Source rawParts$lambda$3$lambda$2;
                        rawParts$lambda$3$lambda$2 = MultiPartFormDataContent.rawParts$lambda$3$lambda$2(readByteArray);
                        return rawParts$lambda$3$lambda$2;
                    }
                };
                if (valueOf == null) {
                    StringsKt.writeText$default(BytePacketBuilder, HttpHeaders.INSTANCE.getContentLength() + ": " + readByteArray.length, 0, 0, (Charset) null, 14, (Object) null);
                    bArr2 = FormDataContentKt.RN_BYTES;
                    BytePacketBuilderKt.writeFully$default(BytePacketBuilder, bArr2, 0, 0, 6, null);
                }
                channelPart = new PreparedPart.InputPart(SourcesKt.readByteArray(BytePacketBuilderKt.build(BytePacketBuilder)), function0, Long.valueOf(readByteArray.length + this.PART_OVERHEAD_SIZE + r4.length));
            }
            arrayList.add(channelPart);
        }
        ArrayList arrayList2 = arrayList;
        this.rawParts = arrayList2;
        Long l2 = 0L;
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                l = l2;
                break;
            }
            Long size = ((PreparedPart) it.next()).getSize();
            if (size == null) {
                break;
            } else {
                l2 = l2 != null ? Long.valueOf(l2.longValue() + size.longValue()) : null;
            }
        }
        this.contentLength = l != null ? Long.valueOf(l.longValue() + this.BODY_OVERHEAD_SIZE) : l;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
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
    public Object writeTo(ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) {
        MultiPartFormDataContent$writeTo$1 multiPartFormDataContent$writeTo$1;
        ?? r2;
        ByteWriteChannel byteWriteChannel2;
        Iterator<PreparedPart> it;
        PreparedPart preparedPart;
        PreparedPart preparedPart2;
        Source source;
        Iterator<PreparedPart> it2;
        Iterator<PreparedPart> it3;
        ByteWriteChannel byteWriteChannel3;
        byte[] bArr;
        Object copyTo;
        byte[] bArr2;
        byte[] headers;
        if (continuation instanceof MultiPartFormDataContent$writeTo$1) {
            multiPartFormDataContent$writeTo$1 = (MultiPartFormDataContent$writeTo$1) continuation;
            if ((multiPartFormDataContent$writeTo$1.label & Integer.MIN_VALUE) != 0) {
                multiPartFormDataContent$writeTo$1.label -= Integer.MIN_VALUE;
                Object obj = multiPartFormDataContent$writeTo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = multiPartFormDataContent$writeTo$1.label;
                switch (r2) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        it = this.rawParts.iterator();
                        if (it.hasNext()) {
                            preparedPart = it.next();
                            byte[] bArr3 = this.BOUNDARY_BYTES;
                            multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                            multiPartFormDataContent$writeTo$1.L$1 = it;
                            multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                            multiPartFormDataContent$writeTo$1.label = 1;
                            if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr3, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            headers = preparedPart.getHeaders();
                            multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                            multiPartFormDataContent$writeTo$1.L$1 = it;
                            multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                            multiPartFormDataContent$writeTo$1.label = 2;
                            if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, headers, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            bArr2 = FormDataContentKt.RN_BYTES;
                            multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                            multiPartFormDataContent$writeTo$1.L$1 = it;
                            multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                            multiPartFormDataContent$writeTo$1.label = 3;
                            if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr2, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteWriteChannel2 = byteWriteChannel;
                            preparedPart2 = preparedPart;
                            if (preparedPart2 instanceof PreparedPart.InputPart) {
                                source = ((PreparedPart.InputPart) preparedPart2).getProvider().invoke();
                                multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel2;
                                multiPartFormDataContent$writeTo$1.L$1 = it;
                                multiPartFormDataContent$writeTo$1.L$2 = source;
                                multiPartFormDataContent$writeTo$1.label = 4;
                                copyTo = FormDataContentKt.copyTo(source, byteWriteChannel2, multiPartFormDataContent$writeTo$1);
                                if (copyTo == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it2 = it;
                                Unit unit = Unit.INSTANCE;
                                AutoCloseableKt.closeFinally(source, null);
                                Unit unit2 = Unit.INSTANCE;
                                byteWriteChannel = byteWriteChannel2;
                                bArr = FormDataContentKt.RN_BYTES;
                                multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                                multiPartFormDataContent$writeTo$1.L$1 = it2;
                                multiPartFormDataContent$writeTo$1.L$2 = null;
                                multiPartFormDataContent$writeTo$1.label = 6;
                                if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                                }
                            } else {
                                if (!(preparedPart2 instanceof PreparedPart.ChannelPart)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ByteReadChannel invoke = ((PreparedPart.ChannelPart) preparedPart2).getProvider().invoke();
                                multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel2;
                                multiPartFormDataContent$writeTo$1.L$1 = it;
                                multiPartFormDataContent$writeTo$1.L$2 = null;
                                multiPartFormDataContent$writeTo$1.label = 5;
                                if (ByteReadChannelOperationsKt.copyTo(invoke, byteWriteChannel2, multiPartFormDataContent$writeTo$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it3 = it;
                                byteWriteChannel3 = byteWriteChannel2;
                                ByteWriteChannel byteWriteChannel4 = byteWriteChannel3;
                                it2 = it3;
                                byteWriteChannel = byteWriteChannel4;
                                bArr = FormDataContentKt.RN_BYTES;
                                multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                                multiPartFormDataContent$writeTo$1.L$1 = it2;
                                multiPartFormDataContent$writeTo$1.L$2 = null;
                                multiPartFormDataContent$writeTo$1.label = 6;
                                if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it = it2;
                                if (it.hasNext()) {
                                    byte[] bArr4 = this.LAST_BOUNDARY_BYTES;
                                    multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                                    multiPartFormDataContent$writeTo$1.L$1 = null;
                                    multiPartFormDataContent$writeTo$1.label = 7;
                                    if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr4, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    multiPartFormDataContent$writeTo$1.L$0 = null;
                                    multiPartFormDataContent$writeTo$1.label = 8;
                                    if (byteWriteChannel.flushAndClose(multiPartFormDataContent$writeTo$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    case 1:
                        PreparedPart preparedPart3 = (PreparedPart) multiPartFormDataContent$writeTo$1.L$2;
                        Iterator<PreparedPart> it4 = (Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        ByteWriteChannel byteWriteChannel5 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        it = it4;
                        preparedPart = preparedPart3;
                        byteWriteChannel = byteWriteChannel5;
                        headers = preparedPart.getHeaders();
                        multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                        multiPartFormDataContent$writeTo$1.L$1 = it;
                        multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                        multiPartFormDataContent$writeTo$1.label = 2;
                        if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, headers, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                        }
                        bArr2 = FormDataContentKt.RN_BYTES;
                        multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                        multiPartFormDataContent$writeTo$1.L$1 = it;
                        multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                        multiPartFormDataContent$writeTo$1.label = 3;
                        if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr2, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                        }
                        break;
                    case 2:
                        PreparedPart preparedPart4 = (PreparedPart) multiPartFormDataContent$writeTo$1.L$2;
                        Iterator<PreparedPart> it5 = (Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        ByteWriteChannel byteWriteChannel6 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        it = it5;
                        preparedPart = preparedPart4;
                        byteWriteChannel = byteWriteChannel6;
                        bArr2 = FormDataContentKt.RN_BYTES;
                        multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                        multiPartFormDataContent$writeTo$1.L$1 = it;
                        multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                        multiPartFormDataContent$writeTo$1.label = 3;
                        if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr2, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) == coroutine_suspended) {
                        }
                        break;
                    case 3:
                        preparedPart2 = (PreparedPart) multiPartFormDataContent$writeTo$1.L$2;
                        Iterator<PreparedPart> it6 = (Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        byteWriteChannel2 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        it = it6;
                        if (preparedPart2 instanceof PreparedPart.InputPart) {
                        }
                        break;
                    case 4:
                        source = (AutoCloseable) multiPartFormDataContent$writeTo$1.L$2;
                        it2 = (Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        byteWriteChannel2 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            Unit unit3 = Unit.INSTANCE;
                            AutoCloseableKt.closeFinally(source, null);
                            Unit unit22 = Unit.INSTANCE;
                            byteWriteChannel = byteWriteChannel2;
                            bArr = FormDataContentKt.RN_BYTES;
                            multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                            multiPartFormDataContent$writeTo$1.L$1 = it2;
                            multiPartFormDataContent$writeTo$1.L$2 = null;
                            multiPartFormDataContent$writeTo$1.label = 6;
                            if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                            }
                        } finally {
                        }
                        break;
                    case 5:
                        it3 = (Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        byteWriteChannel3 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ByteWriteChannel byteWriteChannel42 = byteWriteChannel3;
                        it2 = it3;
                        byteWriteChannel = byteWriteChannel42;
                        bArr = FormDataContentKt.RN_BYTES;
                        multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel;
                        multiPartFormDataContent$writeTo$1.L$1 = it2;
                        multiPartFormDataContent$writeTo$1.L$2 = null;
                        multiPartFormDataContent$writeTo$1.label = 6;
                        if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel, bArr, 0, 0, multiPartFormDataContent$writeTo$1, 6, null) != coroutine_suspended) {
                        }
                        break;
                    case 6:
                        Iterator<PreparedPart> it7 = (Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        ByteWriteChannel byteWriteChannel7 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        it = it7;
                        byteWriteChannel = byteWriteChannel7;
                        if (it.hasNext()) {
                        }
                        break;
                    case 7:
                        byteWriteChannel = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        multiPartFormDataContent$writeTo$1.L$0 = null;
                        multiPartFormDataContent$writeTo$1.label = 8;
                        if (byteWriteChannel.flushAndClose(multiPartFormDataContent$writeTo$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 8:
                    case 9:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 10:
                        Throwable th = (Throwable) multiPartFormDataContent$writeTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        throw th;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        multiPartFormDataContent$writeTo$1 = new MultiPartFormDataContent$writeTo$1(this, continuation);
        Object obj2 = multiPartFormDataContent$writeTo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = multiPartFormDataContent$writeTo$1.label;
        switch (r2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Source rawParts$lambda$3$lambda$2(byte[] bArr) {
        Buffer buffer = new Buffer();
        BytePacketBuilderKt.writeFully$default(buffer, bArr, 0, 0, 6, null);
        return buffer;
    }
}
