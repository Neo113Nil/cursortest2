package com.inmobi.media;

import android.content.ContentValues;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.c5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3616c5 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7040a;
    public final /* synthetic */ C3644d5 b;
    public final /* synthetic */ C4207x6 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3616c5(C3644d5 c3644d5, C4207x6 c4207x6, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.b = c3644d5;
        this.c = c4207x6;
        this.d = j;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3616c5(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3616c5) create((S9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        if (r1.a(r8, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r8.a("c_data", r4, 4, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7040a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            S9 s9 = this.b.f7063a;
            C4207x6 c4207x6 = this.c;
            Intrinsics.checkNotNullParameter(c4207x6, "<this>");
            ContentValues contentValues = new ContentValues();
            contentValues.put("e_data", c4207x6.f7472a);
            contentValues.put("timestamp", Long.valueOf(c4207x6.b));
            this.f7040a = 1;
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
        String str = "DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > " + this.d + " ORDER BY timestamp DESC LIMIT " + this.e + ") foo);";
        S9 s92 = this.b.f7063a;
        this.f7040a = 2;
    }
}
