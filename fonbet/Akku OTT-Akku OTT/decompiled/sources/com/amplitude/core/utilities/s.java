package com.amplitude.core.utilities;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.K;

@DebugMetadata(c = "com.amplitude.core.utilities.FileResponseHandler$triggerEventsCallback$1$2$1", f = "FileResponseHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class s extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    public final /* synthetic */ q a;
    public final /* synthetic */ String b;
    public final /* synthetic */ com.amplitude.core.events.a c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, String str, com.amplitude.core.events.a aVar, int i, String str2, Continuation<? super s> continuation) {
        super(2, continuation);
        this.a = qVar;
        this.b = str;
        this.c = aVar;
        this.d = i;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new s(this.a, this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((s) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        com.amplitude.android.storage.i iVar = this.a.a;
        String insertId = this.b;
        Intrinsics.checkNotNullParameter(insertId, "insertId");
        Function3 function3 = (Function3) iVar.d.get(insertId);
        if (function3 != null) {
            String str = this.e;
            function3.invoke(this.c, Boxing.boxInt(this.d), str);
            iVar.j(insertId);
        }
        return Unit.INSTANCE;
    }
}
