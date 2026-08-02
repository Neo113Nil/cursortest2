package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Lio/ktor/utils/io/ByteWriteChannel;", "log", "observe", "(Lio/ktor/http/content/OutgoingContent;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ObservingUtilsKt {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r12, r2, 0, 0, r0, 6, null) != r8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
    
        if (r13 != r8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object observe(io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent> continuation) {
        io.ktor.client.plugins.logging.ObservingUtilsKt$observe$1 observingUtilsKt$observe$1;
        int i;
        io.ktor.http.content.OutgoingContent.ContentWrapper contentWrapper;
        if (continuation instanceof io.ktor.client.plugins.logging.ObservingUtilsKt$observe$1) {
            observingUtilsKt$observe$1 = (io.ktor.client.plugins.logging.ObservingUtilsKt$observe$1) continuation;
            if ((observingUtilsKt$observe$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                observingUtilsKt$observe$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = observingUtilsKt$observe$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = observingUtilsKt$observe$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent) {
                        byte[] getHighSpeedVideoFpsRangesFor = ((io.ktor.http.content.OutgoingContent.ByteArrayContent) outgoingContent).getGetHighSpeedVideoFpsRangesFor();
                        observingUtilsKt$observe$1.getHighSpeedVideoFpsRanges = outgoingContent;
                        observingUtilsKt$observe$1.Camera2StreamConfigurationMap = byteWriteChannel;
                        observingUtilsKt$observe$1.getHighSpeedVideoSizes = 1;
                    } else {
                        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent) {
                            io.ktor.utils.io.ByteChannel byteChannel = new io.ktor.utils.io.ByteChannel(false, 1, null);
                            io.ktor.util.ByteChannelsKt.copyToBoth(((io.ktor.http.content.OutgoingContent.ReadChannelContent) outgoingContent).getGetHighSpeedVideoFpsRanges(), byteWriteChannel, byteChannel);
                            return new io.ktor.client.plugins.logging.LoggedContent(outgoingContent, byteChannel);
                        }
                        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent) {
                            io.ktor.utils.io.ByteChannel byteChannel2 = new io.ktor.utils.io.ByteChannel(false, 1, null);
                            io.ktor.util.ByteChannelsKt.copyToBoth(io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) kotlinx.coroutines.Dispatchers.getDefault(), false, (kotlin.jvm.functions.Function2) new io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1((io.ktor.http.content.OutgoingContent.WriteChannelContent) outgoingContent, null), 2, (java.lang.Object) null).getChannel(), byteWriteChannel, byteChannel2);
                            return new io.ktor.client.plugins.logging.LoggedContent(outgoingContent, byteChannel2);
                        }
                        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ContentWrapper) {
                            contentWrapper = (io.ktor.http.content.OutgoingContent.ContentWrapper) outgoingContent;
                            io.ktor.http.content.OutgoingContent getHighSpeedVideoFpsRanges = contentWrapper.getGetHighSpeedVideoFpsRanges();
                            observingUtilsKt$observe$1.getHighSpeedVideoFpsRanges = contentWrapper;
                            observingUtilsKt$observe$1.getHighSpeedVideoSizes = 3;
                            obj = observe(getHighSpeedVideoFpsRanges, byteWriteChannel, observingUtilsKt$observe$1);
                        } else {
                            if (!(outgoingContent instanceof io.ktor.http.content.OutgoingContent.NoContent) && !(outgoingContent instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            observingUtilsKt$observe$1.getHighSpeedVideoFpsRanges = outgoingContent;
                            observingUtilsKt$observe$1.getHighSpeedVideoSizes = 4;
                            if (byteWriteChannel.flushAndClose(observingUtilsKt$observe$1) != coroutine_suspended) {
                                return outgoingContent;
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            io.ktor.http.content.OutgoingContent outgoingContent2 = (io.ktor.http.content.OutgoingContent) observingUtilsKt$observe$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return outgoingContent2;
                        }
                        if (i == 3) {
                            contentWrapper = (io.ktor.http.content.OutgoingContent.ContentWrapper) observingUtilsKt$observe$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return contentWrapper.copy((io.ktor.http.content.OutgoingContent) obj);
                        }
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        io.ktor.http.content.OutgoingContent outgoingContent3 = (io.ktor.http.content.OutgoingContent) observingUtilsKt$observe$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return outgoingContent3;
                    }
                    byteWriteChannel = (io.ktor.utils.io.ByteWriteChannel) observingUtilsKt$observe$1.Camera2StreamConfigurationMap;
                    outgoingContent = (io.ktor.http.content.OutgoingContent) observingUtilsKt$observe$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    observingUtilsKt$observe$1.getHighSpeedVideoFpsRanges = outgoingContent;
                    observingUtilsKt$observe$1.Camera2StreamConfigurationMap = null;
                    observingUtilsKt$observe$1.getHighSpeedVideoSizes = 2;
                    if (byteWriteChannel.flushAndClose(observingUtilsKt$observe$1) != coroutine_suspended) {
                        return outgoingContent;
                    }
                }
                return coroutine_suspended;
            }
        }
        observingUtilsKt$observe$1 = new io.ktor.client.plugins.logging.ObservingUtilsKt$observe$1(continuation);
        java.lang.Object obj2 = observingUtilsKt$observe$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = observingUtilsKt$observe$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return coroutine_suspended2;
    }
}
