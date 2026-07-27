package com.inmobi.media;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;

/* renamed from: com.inmobi.media.gi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3741gi extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public ReceiveChannel f7125a;
    public ChannelIterator b;
    public int c;

    public C3741gi(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3741gi(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3741gi((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x000f, B:7:0x0039, B:9:0x0041, B:10:0x002c, B:14:0x004d, B:24:0x0027), top: B:2:0x0007, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x000f, B:7:0x0039, B:9:0x0041, B:10:0x002c, B:14:0x004d, B:24:0x0027), top: B:2:0x0007, outer: #2 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0036 -> B:7:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReceiveChannel receiveChannel;
        ChannelIterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        try {
            try {
            } finally {
            }
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            U9.a(e);
            C3770hi.j.set(false);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4276zk.f7528a.getClass();
            receiveChannel = C4276zk.i;
            it = receiveChannel.iterator();
            this.f7125a = receiveChannel;
            this.b = it;
            this.c = 1;
            obj = it.hasNext(this);
            if (obj == coroutine_suspended) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.b;
            receiveChannel = this.f7125a;
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                C3770hi.c(C3770hi.f7146a);
                this.f7125a = receiveChannel;
                this.b = it;
                this.c = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) obj).booleanValue()) {
                    Unit unit = Unit.INSTANCE;
                    ChannelsKt.cancelConsumed(receiveChannel, null);
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
