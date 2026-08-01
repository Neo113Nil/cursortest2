package com.inmobi.media;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* renamed from: com.inmobi.media.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3665e {
    public static final boolean a() {
        return true;
    }

    public static void a(final O0 process, final Wh wh, Long l, final Function0 shouldProcess) {
        Intrinsics.checkNotNullParameter(process, "process");
        Intrinsics.checkNotNullParameter(shouldProcess, "shouldProcess");
        Lazy lazy = G0.f6569a;
        long longValue = l != null ? l.longValue() : 0L;
        Function0 execute = new Function0() { // from class: com.inmobi.media.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3665e.a(Function0.this, process, wh);
            }
        };
        Intrinsics.checkNotNullParameter(execute, "execute");
        CoroutineScope coroutineScope = G0.e;
        if (coroutineScope == null) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
            G0.e = coroutineScope;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new F0(longValue, execute, null), 3, null);
    }

    public static final Unit a(Function0 function0, O0 o0, Wh wh) {
        try {
            if (((Boolean) function0.invoke()).booleanValue()) {
                Object a2 = o0.a();
                if (wh != null) {
                    wh.a(a2);
                }
            } else if (wh != null) {
                wh.onError(new Exception("Capture Aborted: Should Capture not satisfied"));
            }
        } catch (Exception e) {
            if (wh != null) {
                wh.onError(e);
            }
        }
        return Unit.INSTANCE;
    }
}
