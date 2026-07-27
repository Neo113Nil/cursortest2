package com.inmobi.media;

import android.content.ContentValues;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.v3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4150v3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7428a;
    public final /* synthetic */ int b;
    public final /* synthetic */ C4177w3 c;
    public final /* synthetic */ C4066s3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4150v3(int i, C4177w3 c4177w3, C4066s3 c4066s3, Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.c = c4177w3;
        this.d = c4066s3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4150v3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4150v3) create((S9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (r6.a("click", r1, 5, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r1.a(r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7428a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = "DELETE FROM click WHERE ts = (SELECT ts FROM click ORDER BY ts ASC LIMIT 1) AND (SELECT COUNT(*) FROM click) > " + (this.b - 1) + ";";
            S9 s9 = this.c.f7450a;
            this.f7428a = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        S9 s92 = this.c.f7450a;
        ContentValues a2 = AbstractC4231y3.a(this.d);
        this.f7428a = 2;
    }
}
