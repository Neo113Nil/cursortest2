package com.inmobi.media;

import android.os.Message;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class E3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6526a;
    public final /* synthetic */ C4066s3 b;
    public final /* synthetic */ H3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3(C4066s3 c4066s3, H3 h3, Continuation continuation) {
        super(2, continuation);
        this.b = c4066s3;
        this.c = h3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new E3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E3(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r8 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        if (r8 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6526a;
        int i2 = 2;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4177w3 c4177w3 = (C4177w3) X3.b.getValue();
            int i3 = this.b.f7366a;
            this.f6526a = 1;
            Object a2 = c4177w3.f7450a.a("click", "id=?", new String[]{String.valueOf(i3)}, this);
            if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a2 = Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    return Boxing.boxBoolean(this.c.sendMessage(obtain));
                }
                X3 x3 = X3.f6941a;
                Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                X3.g.set(false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        X3.f.remove(this.b);
        if (!X3.f.isEmpty()) {
            H3 h3 = this.c;
            C4066s3 c4066s3 = (C4066s3) X3.f.get(0);
            int i4 = H3.f6594a;
            Message obtain2 = Message.obtain();
            if (c4066s3 != null && c4066s3.e) {
                i2 = 3;
            }
            obtain2.what = i2;
            obtain2.obj = c4066s3;
            h3.sendMessage(obtain2);
            return Unit.INSTANCE;
        }
        C4177w3 c4177w32 = (C4177w3) X3.b.getValue();
        this.f6526a = 2;
        obj = c4177w32.a(this);
    }
}
