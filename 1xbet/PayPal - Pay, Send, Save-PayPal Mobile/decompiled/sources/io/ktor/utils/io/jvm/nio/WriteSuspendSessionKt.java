package io.ktor.utils.io.jvm.nio;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a=\u0010\b\u001a\u00020\u0004*\u00020\u00002'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0086H¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/Function2;", "Lio/ktor/utils/io/jvm/nio/WriteSuspendSession;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "writeSuspendSession", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "", "writeWhile", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WriteSuspendSessionKt {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r8.invoke(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r7v0, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "writeSuspendSession deprecated, use writeWhile instead", replaceWith = @kotlin.ReplaceWith(expression = "writeWhile { buffer -> }", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object writeSuspendSession(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.jvm.functions.Function2<? super io.ktor.utils.io.jvm.nio.WriteSuspendSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1 writeSuspendSessionKt$writeSuspendSession$1;
        java.lang.Object coroutine_suspended;
        int i;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        try {
            if (continuation instanceof io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1) {
                writeSuspendSessionKt$writeSuspendSession$1 = (io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1) continuation;
                if ((writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = writeSuspendSessionKt$writeSuspendSession$1.Camera2StreamConfigurationMap;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.utils.io.jvm.nio.WriteSuspendSession writeSuspendSession = new io.ktor.utils.io.jvm.nio.WriteSuspendSession(byteWriteChannel);
                        writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoFpsRangesFor = byteWriteChannel;
                        writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoSizes = 1;
                        byteWriteChannel2 = byteWriteChannel;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                return kotlin.Unit.INSTANCE;
                            }
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.lang.Throwable th = (java.lang.Throwable) writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel3;
                    }
                    writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoFpsRangesFor = null;
                    writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoSizes = 2;
                    byteWriteChannel = byteWriteChannel2.flush(writeSuspendSessionKt$writeSuspendSession$1);
                }
            }
            if (i != 0) {
            }
            writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoFpsRangesFor = null;
            writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoSizes = 2;
            byteWriteChannel = byteWriteChannel2.flush(writeSuspendSessionKt$writeSuspendSession$1);
        } catch (java.lang.Throwable th2) {
            writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoFpsRangesFor = th2;
            writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoSizes = 3;
            if (byteWriteChannel.flush(writeSuspendSessionKt$writeSuspendSession$1) != coroutine_suspended) {
                throw th2;
            }
        }
        writeSuspendSessionKt$writeSuspendSession$1 = new io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1(continuation);
        java.lang.Object obj2 = writeSuspendSessionKt$writeSuspendSession$1.Camera2StreamConfigurationMap;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = writeSuspendSessionKt$writeSuspendSession$1.getHighSpeedVideoSizes;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object writeWhile(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeWhile$1 writeSuspendSessionKt$writeWhile$1;
        int i;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        if (continuation instanceof io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeWhile$1) {
            writeSuspendSessionKt$writeWhile$1 = (io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeWhile$1) continuation;
            if ((writeSuspendSessionKt$writeWhile$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                writeSuspendSessionKt$writeWhile$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = writeSuspendSessionKt$writeWhile$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = writeSuspendSessionKt$writeWhile$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteWriteChannel2 = byteWriteChannel;
                    booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) writeSuspendSessionKt$writeWhile$1.getHighResolutionOutputSizeshNQ4ISI;
                    function1 = (kotlin.jvm.functions.Function1) writeSuspendSessionKt$writeWhile$1.getHighSpeedVideoFpsRanges;
                    byteWriteChannel2 = (io.ktor.utils.io.ByteWriteChannel) writeSuspendSessionKt$writeWhile$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (!booleanRef.element) {
                    kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                    kotlinx.io.Buffer getHighSpeedVideoFpsRanges = byteWriteChannel2.getWriteBuffer().getGetHighSpeedVideoFpsRanges();
                    kotlinx.io.Segment writableSegment = getHighSpeedVideoFpsRanges.writableSegment(1);
                    byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
                    int limit = writableSegment.getLimit();
                    java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(dataAsByteArray, limit, dataAsByteArray.length - limit);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(wrap);
                    booleanRef.element = !function1.invoke(wrap).booleanValue();
                    int position = wrap.position() - limit;
                    if (position == 1) {
                        writableSegment.writeBackData(dataAsByteArray, position);
                        writableSegment.setLimit(writableSegment.getLimit() + position);
                        getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + position);
                    } else {
                        if (position < 0 || position > writableSegment.getRemainingCapacity()) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number of bytes written: ");
                            sb.append(position);
                            sb.append(". Should be in 0..");
                            sb.append(writableSegment.getRemainingCapacity());
                            throw new java.lang.IllegalStateException(sb.toString().toString());
                        }
                        if (position != 0) {
                            writableSegment.writeBackData(dataAsByteArray, position);
                            writableSegment.setLimit(writableSegment.getLimit() + position);
                            getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + position);
                        } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
                            getHighSpeedVideoFpsRanges.recycleTail();
                        }
                    }
                    writeSuspendSessionKt$writeWhile$1.Camera2StreamConfigurationMap = byteWriteChannel2;
                    writeSuspendSessionKt$writeWhile$1.getHighSpeedVideoFpsRanges = function1;
                    writeSuspendSessionKt$writeWhile$1.getHighResolutionOutputSizeshNQ4ISI = booleanRef;
                    writeSuspendSessionKt$writeWhile$1.getHighSpeedVideoSizes = 1;
                    if (byteWriteChannel2.flush(writeSuspendSessionKt$writeWhile$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        writeSuspendSessionKt$writeWhile$1 = new io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeWhile$1(continuation);
        java.lang.Object obj2 = writeSuspendSessionKt$writeWhile$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = writeSuspendSessionKt$writeWhile$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        while (!booleanRef.element) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
