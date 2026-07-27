package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public interface ld {

    public static final class a {
        public static /* synthetic */ Object a(ld ldVar, String str, Map map, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i & 2) != 0) {
                map = MapsKt.emptyMap();
            }
            return ldVar.a(str, map, continuation);
        }
    }

    Object a(String str, String str2, Map map, String str3, Continuation continuation);

    Object a(String str, Map map, Continuation continuation);
}
