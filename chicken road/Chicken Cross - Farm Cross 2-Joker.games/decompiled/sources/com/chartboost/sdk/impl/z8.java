package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public interface z8 {

    public static final class a {
        public static /* synthetic */ Object a(z8 z8Var, Context context, String str, v vVar, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load-BWLJW6A");
            }
            if ((i & 4) != 0) {
                vVar = new v(null, null, 3, null);
            }
            return z8Var.a(context, str, vVar, continuation);
        }
    }

    Object a(Context context, String str, v vVar, Continuation continuation);

    Object a(Context context, Continuation continuation);

    void a();

    boolean b();

    void destroy();
}
