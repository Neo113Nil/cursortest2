package com.inmobi.media;

import com.adjust.sdk.Constants;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final /* synthetic */ class Gl extends FunctionReferenceImpl implements Function2, SuspendFunction {
    public Gl() {
        super(2, Rl.f6833a, Rl.class, Constants.PUSH, "push(Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Rl) this.receiver).a((JSONObject) obj, (Continuation) obj2);
    }
}
