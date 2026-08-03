package io.ktor.utils.io.jvm.nio;

/* compiled from: WriteSuspendSession.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a=\u0010\b\u001a\u00020\u0004*\u00020\u00002'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0086H¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/Function2;", "Lio/ktor/utils/io/jvm/nio/WriteSuspendSession;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "writeSuspendSession", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "", "writeWhile", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WriteSuspendSessionKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
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
                if ((writeSuspendSessionKt$writeSuspendSession$1.label & Integer.MIN_VALUE) != 0) {
                    writeSuspendSessionKt$writeSuspendSession$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = writeSuspendSessionKt$writeSuspendSession$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = writeSuspendSessionKt$writeSuspendSession$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.utils.io.jvm.nio.WriteSuspendSession writeSuspendSession = new io.ktor.utils.io.jvm.nio.WriteSuspendSession(byteWriteChannel);
                        writeSuspendSessionKt$writeSuspendSession$1.L$0 = byteWriteChannel;
                        writeSuspendSessionKt$writeSuspendSession$1.label = 1;
                        byteWriteChannel2 = byteWriteChannel;
                        if (function2.invoke(writeSuspendSession, writeSuspendSessionKt$writeSuspendSession$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                return kotlin.Unit.INSTANCE;
                            }
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.lang.Throwable th = (java.lang.Throwable) writeSuspendSessionKt$writeSuspendSession$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) writeSuspendSessionKt$writeSuspendSession$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel3;
                    }
                    writeSuspendSessionKt$writeSuspendSession$1.L$0 = null;
                    writeSuspendSessionKt$writeSuspendSession$1.label = 2;
                    byteWriteChannel = byteWriteChannel2.flush(writeSuspendSessionKt$writeSuspendSession$1);
                    if (byteWriteChannel == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            writeSuspendSessionKt$writeSuspendSession$1.L$0 = null;
            writeSuspendSessionKt$writeSuspendSession$1.label = 2;
            byteWriteChannel = byteWriteChannel2.flush(writeSuspendSessionKt$writeSuspendSession$1);
            if (byteWriteChannel == coroutine_suspended) {
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th2) {
            writeSuspendSessionKt$writeSuspendSession$1.L$0 = th2;
            writeSuspendSessionKt$writeSuspendSession$1.label = 3;
            if (byteWriteChannel.flush(writeSuspendSessionKt$writeSuspendSession$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th2;
        }
        writeSuspendSessionKt$writeSuspendSession$1 = new io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1(continuation);
        java.lang.Object obj2 = writeSuspendSessionKt$writeSuspendSession$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = writeSuspendSessionKt$writeSuspendSession$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object writeWhile(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeWhile$1 writeSuspendSessionKt$writeWhile$1;
        int i;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, java.lang.Boolean> function12;
        if (continuation instanceof io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeWhile$1) {
            writeSuspendSessionKt$writeWhile$1 = (io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeWhile$1) continuation;
            if ((writeSuspendSessionKt$writeWhile$1.label & Integer.MIN_VALUE) != 0) {
                writeSuspendSessionKt$writeWhile$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = writeSuspendSessionKt$writeWhile$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = writeSuspendSessionKt$writeWhile$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteWriteChannel2 = byteWriteChannel;
                    booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                    function12 = function1;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) writeSuspendSessionKt$writeWhile$1.L$2;
                    kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, java.lang.Boolean> function13 = (kotlin.jvm.functions.Function1) writeSuspendSessionKt$writeWhile$1.L$1;
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) writeSuspendSessionKt$writeWhile$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function12 = function13;
                    byteWriteChannel2 = byteWriteChannel3;
                }
                while (!booleanRef.element) {
                    kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                    kotlinx.io.Buffer bufferField = byteWriteChannel2.getWriteBuffer().getBufferField();
                    kotlinx.io.Segment writableSegment = bufferField.writableSegment(1);
                    byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
                    int limit = writableSegment.getLimit();
                    java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(dataAsByteArray, limit, dataAsByteArray.length - limit);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(wrap);
                    booleanRef.element = !function12.invoke(wrap).booleanValue();
                    int position = wrap.position() - limit;
                    if (position == 1) {
                        writableSegment.writeBackData(dataAsByteArray, position);
                        writableSegment.setLimit(writableSegment.getLimit() + position);
                        bufferField.setSizeMut(bufferField.getSizeMut() + position);
                    } else {
                        if (position < 0 || position > writableSegment.getRemainingCapacity()) {
                            throw new java.lang.IllegalStateException(("Invalid number of bytes written: " + position + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
                        }
                        if (position != 0) {
                            writableSegment.writeBackData(dataAsByteArray, position);
                            writableSegment.setLimit(writableSegment.getLimit() + position);
                            bufferField.setSizeMut(bufferField.getSizeMut() + position);
                        } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
                            bufferField.recycleTail();
                        }
                    }
                    writeSuspendSessionKt$writeWhile$1.L$0 = byteWriteChannel2;
                    writeSuspendSessionKt$writeWhile$1.L$1 = function12;
                    writeSuspendSessionKt$writeWhile$1.L$2 = booleanRef;
                    writeSuspendSessionKt$writeWhile$1.label = 1;
                    if (byteWriteChannel2.flush(writeSuspendSessionKt$writeWhile$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        writeSuspendSessionKt$writeWhile$1 = new io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeWhile$1(continuation);
        java.lang.Object obj2 = writeSuspendSessionKt$writeWhile$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = writeSuspendSessionKt$writeWhile$1.label;
        if (i != 0) {
        }
        while (!booleanRef.element) {
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final java.lang.Object writeWhile$$forInline(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        while (!booleanRef.element) {
            kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
            kotlinx.io.Buffer bufferField = byteWriteChannel.getWriteBuffer().getBufferField();
            kotlinx.io.Segment writableSegment = bufferField.writableSegment(1);
            byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(writableSegment.getLimit());
            int intValue = java.lang.Integer.valueOf(dataAsByteArray.length).intValue();
            int intValue2 = valueOf.intValue();
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(dataAsByteArray, intValue2, intValue - intValue2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(wrap);
            booleanRef.element = !function1.invoke(wrap).booleanValue();
            int intValue3 = java.lang.Integer.valueOf(wrap.position() - intValue2).intValue();
            if (intValue3 == 1) {
                writableSegment.writeBackData(dataAsByteArray, intValue3);
                writableSegment.setLimit(writableSegment.getLimit() + intValue3);
                bufferField.setSizeMut(bufferField.getSizeMut() + intValue3);
            } else {
                if (intValue3 < 0 || intValue3 > writableSegment.getRemainingCapacity()) {
                    throw new java.lang.IllegalStateException(("Invalid number of bytes written: " + intValue3 + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
                }
                if (intValue3 != 0) {
                    writableSegment.writeBackData(dataAsByteArray, intValue3);
                    writableSegment.setLimit(writableSegment.getLimit() + intValue3);
                    bufferField.setSizeMut(bufferField.getSizeMut() + intValue3);
                } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
                    bufferField.recycleTail();
                }
            }
            kotlin.jvm.internal.InlineMarker.mark(0);
            byteWriteChannel.flush(continuation);
            kotlin.jvm.internal.InlineMarker.mark(1);
        }
        return kotlin.Unit.INSTANCE;
    }
}
