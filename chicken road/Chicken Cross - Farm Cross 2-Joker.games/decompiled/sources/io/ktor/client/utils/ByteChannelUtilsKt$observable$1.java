package io.ktor.client.utils;

import io.ktor.client.content.ProgressListener;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ByteArrayPoolKt;
import io.ktor.utils.io.pool.ObjectPool;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: ByteChannelUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3}, l = {22, 24, 26, 31}, m = "invokeSuspend", n = {"$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "read", "$this$writer", "$this$useInstance$iv", "instance$iv", "byteArray", "bytesSend", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$5", "L$6", "J$0", "L$0", "L$1", "L$5", "L$6", "J$0", "I$0", "L$0", "L$1", "L$5", "L$6", "J$0", "L$0", "L$1"})
/* loaded from: classes7.dex */
final class ByteChannelUtilsKt$observable$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $contentLength;
    final /* synthetic */ ProgressListener $listener;
    final /* synthetic */ ByteReadChannel $this_observable;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelUtilsKt$observable$1(ByteReadChannel byteReadChannel, ProgressListener progressListener, Long l, Continuation<? super ByteChannelUtilsKt$observable$1> continuation) {
        super(2, continuation);
        this.$this_observable = byteReadChannel;
        this.$listener = progressListener;
        this.$contentLength = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ByteChannelUtilsKt$observable$1 byteChannelUtilsKt$observable$1 = new ByteChannelUtilsKt$observable$1(this.$this_observable, this.$listener, this.$contentLength, continuation);
        byteChannelUtilsKt$observable$1.L$0 = obj;
        return byteChannelUtilsKt$observable$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super Unit> continuation) {
        return ((ByteChannelUtilsKt$observable$1) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00de A[Catch: all -> 0x01bc, TryCatch #4 {all -> 0x01bc, blocks: (B:27:0x00d8, B:29:0x00de, B:33:0x011d, B:35:0x0125, B:49:0x0182, B:53:0x0195), top: B:26:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125 A[Catch: all -> 0x01bc, TRY_LEAVE, TryCatch #4 {all -> 0x01bc, blocks: (B:27:0x00d8, B:29:0x00de, B:33:0x011d, B:35:0x0125, B:49:0x0182, B:53:0x0195), top: B:26:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0123 -> B:25:0x0176). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x016b -> B:24:0x0175). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ObjectPool byteArrayPool;
        Object obj2;
        ObjectPool objectPool;
        Long l;
        Object obj3;
        byte[] bArr;
        WriterScope writerScope;
        ByteReadChannel byteReadChannel;
        ProgressListener progressListener;
        long j;
        ObjectPool objectPool2;
        Object obj4;
        ByteReadChannel byteReadChannel2;
        WriterScope writerScope2;
        Long l2;
        byte[] bArr2;
        long j2;
        int i;
        long j3;
        Object obj5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        int i3 = 2;
        int i4 = 1;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            WriterScope writerScope3 = (WriterScope) this.L$0;
            byteArrayPool = ByteArrayPoolKt.getByteArrayPool();
            ByteReadChannel byteReadChannel3 = this.$this_observable;
            ProgressListener progressListener2 = this.$listener;
            Long l3 = this.$contentLength;
            Object borrow = byteArrayPool.borrow();
            try {
                objectPool = byteArrayPool;
                l = l3;
                obj3 = borrow;
                bArr = (byte[]) borrow;
                writerScope = writerScope3;
                byteReadChannel = byteReadChannel3;
                progressListener = progressListener2;
                j = 0;
                if (byteReadChannel.isClosedForRead()) {
                }
            } catch (Throwable th) {
                th = th;
                obj2 = borrow;
            }
        } else if (i2 == 1) {
            long j4 = this.J$0;
            byte[] bArr3 = (byte[]) this.L$6;
            Object obj6 = this.L$5;
            Long l4 = (Long) this.L$4;
            ProgressListener progressListener3 = (ProgressListener) this.L$3;
            ByteReadChannel byteReadChannel4 = (ByteReadChannel) this.L$2;
            ObjectPool objectPool3 = (ObjectPool) this.L$1;
            WriterScope writerScope4 = (WriterScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                bArr = bArr3;
                l = l4;
                writerScope = writerScope4;
                objectPool = objectPool3;
                obj3 = obj6;
                j = j4;
                obj5 = obj;
                progressListener = progressListener3;
                byteReadChannel = byteReadChannel4;
                i = ((Number) obj5).intValue();
                if (i > 0) {
                }
                i4 = 1;
                if (byteReadChannel.isClosedForRead()) {
                }
            } catch (Throwable th2) {
                th = th2;
                obj2 = obj6;
                byteArrayPool = objectPool3;
            }
        } else if (i2 == 2) {
            i = this.I$0;
            j2 = this.J$0;
            bArr2 = (byte[]) this.L$6;
            obj4 = this.L$5;
            l2 = (Long) this.L$4;
            progressListener = (ProgressListener) this.L$3;
            byteReadChannel2 = (ByteReadChannel) this.L$2;
            objectPool2 = (ObjectPool) this.L$1;
            writerScope2 = (WriterScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                j3 = j2 + i;
                this.L$0 = writerScope2;
                this.L$1 = objectPool2;
                this.L$2 = byteReadChannel2;
                this.L$3 = progressListener;
                this.L$4 = l2;
                this.L$5 = obj4;
                this.L$6 = bArr2;
                this.J$0 = j3;
                this.label = 3;
                if (progressListener.onProgress(j3, l2, this) != coroutine_suspended) {
                }
            } catch (Throwable th3) {
                th = th3;
                obj2 = obj4;
                byteArrayPool = objectPool2;
                byteArrayPool.recycle(obj2);
                throw th;
            }
        } else if (i2 == 3) {
            long j5 = this.J$0;
            byte[] bArr4 = (byte[]) this.L$6;
            Object obj7 = this.L$5;
            Long l5 = (Long) this.L$4;
            ProgressListener progressListener4 = (ProgressListener) this.L$3;
            ByteReadChannel byteReadChannel5 = (ByteReadChannel) this.L$2;
            objectPool2 = (ObjectPool) this.L$1;
            WriterScope writerScope5 = (WriterScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                obj3 = obj7;
                objectPool = objectPool2;
                l = l5;
                writerScope = writerScope5;
                bArr = bArr4;
                j = j5;
                progressListener = progressListener4;
                byteReadChannel = byteReadChannel5;
                try {
                    i3 = 2;
                    if (byteReadChannel.isClosedForRead()) {
                        this.L$0 = writerScope;
                        this.L$1 = objectPool;
                        this.L$2 = byteReadChannel;
                        this.L$3 = progressListener;
                        this.L$4 = l;
                        this.L$5 = obj3;
                        this.L$6 = bArr;
                        this.J$0 = j;
                        this.label = i4;
                        Long l6 = l;
                        long j6 = j;
                        WriterScope writerScope6 = writerScope;
                        ByteReadChannel byteReadChannel6 = byteReadChannel;
                        ProgressListener progressListener5 = progressListener;
                        obj5 = ByteReadChannelOperationsKt.readAvailable$default(byteReadChannel, bArr, 0, 0, this, 6, null);
                        if (obj5 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j = j6;
                        writerScope = writerScope6;
                        byteReadChannel = byteReadChannel6;
                        progressListener = progressListener5;
                        l = l6;
                        i = ((Number) obj5).intValue();
                        if (i > 0) {
                            ByteWriteChannel channel = writerScope.getChannel();
                            this.L$0 = writerScope;
                            this.L$1 = objectPool;
                            this.L$2 = byteReadChannel;
                            this.L$3 = progressListener;
                            this.L$4 = l;
                            this.L$5 = obj3;
                            this.L$6 = bArr;
                            this.J$0 = j;
                            this.I$0 = i;
                            this.label = i3;
                            if (ByteWriteChannelOperationsKt.writeFully(channel, bArr, 0, i, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j2 = j;
                            bArr2 = bArr;
                            byteReadChannel2 = byteReadChannel;
                            l2 = l;
                            objectPool2 = objectPool;
                            Object obj8 = obj3;
                            writerScope2 = writerScope;
                            obj4 = obj8;
                            j3 = j2 + i;
                            this.L$0 = writerScope2;
                            this.L$1 = objectPool2;
                            this.L$2 = byteReadChannel2;
                            this.L$3 = progressListener;
                            this.L$4 = l2;
                            this.L$5 = obj4;
                            this.L$6 = bArr2;
                            this.J$0 = j3;
                            this.label = 3;
                            if (progressListener.onProgress(j3, l2, this) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectPool = objectPool2;
                            l = l2;
                            byteReadChannel = byteReadChannel2;
                            bArr = bArr2;
                            j = j3;
                            WriterScope writerScope7 = writerScope2;
                            obj3 = obj4;
                            writerScope = writerScope7;
                            i3 = 2;
                        }
                        i4 = 1;
                        if (byteReadChannel.isClosedForRead()) {
                            WriterScope writerScope8 = writerScope;
                            ProgressListener progressListener6 = progressListener;
                            Long l7 = l;
                            long j7 = j;
                            Throwable closedCause = byteReadChannel.getClosedCause();
                            ByteWriteChannelOperationsKt.close(writerScope8.getChannel(), closedCause);
                            if (closedCause == null && j7 == 0) {
                                this.L$0 = objectPool;
                                this.L$1 = obj3;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.label = 4;
                                if (progressListener6.onProgress(j7, l7, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            obj2 = obj3;
                            byteArrayPool = objectPool;
                            Unit unit = Unit.INSTANCE;
                            byteArrayPool.recycle(obj2);
                            return Unit.INSTANCE;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj2 = obj3;
                    byteArrayPool = objectPool;
                }
                i4 = 1;
            } catch (Throwable th5) {
                th = th5;
                obj2 = obj7;
                byteArrayPool = objectPool2;
                byteArrayPool.recycle(obj2);
                throw th;
            }
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.L$1;
            byteArrayPool = (ObjectPool) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                Unit unit2 = Unit.INSTANCE;
                byteArrayPool.recycle(obj2);
                return Unit.INSTANCE;
            } catch (Throwable th6) {
                th = th6;
            }
        }
        byteArrayPool.recycle(obj2);
        throw th;
    }
}
