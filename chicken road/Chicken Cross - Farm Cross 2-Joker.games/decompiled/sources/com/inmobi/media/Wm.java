package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.LinkedHashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;

/* loaded from: classes6.dex */
public final class Wm {

    /* renamed from: a, reason: collision with root package name */
    public static final Wm f6937a = new Wm();
    public static final Oi b = new Oi();
    public static final LinkedHashSet c = new LinkedHashSet();
    public static Deferred d;
    public static Zm e;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (a((kotlin.coroutines.Continuation) r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (com.inmobi.media.AbstractC3727g4.a(r7, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        Sm sm;
        int i;
        if (continuationImpl instanceof Sm) {
            sm = (Sm) continuationImpl;
            int i2 = sm.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sm.c = i2 - Integer.MIN_VALUE;
                Object obj = sm.f6857a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sm.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Oi oi = b;
                    Tm tm = new Tm(null);
                    sm.c = 1;
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
                sm.c = 2;
            }
        }
        sm = new Sm(this, continuationImpl);
        Object obj2 = sm.f6857a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sm.c;
        if (i != 0) {
        }
        sm.c = 2;
    }

    public static Object a(Continuation continuation) {
        Oi oi = Kk.f6677a;
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig = ((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getUnifiedIdServiceConfig();
        String str = "processRequest - " + unifiedIdServiceConfig.getUrl();
        Object a2 = AbstractC3727g4.a(b, new Um(unifiedIdServiceConfig, null), continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    public static Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, Continuation continuation) {
        if (inMobiUnifiedIdInterface != null) {
            Boxing.boxBoolean(c.add(inMobiUnifiedIdInterface));
        }
        if (b.b.get() != null) {
            String str = "Fetch is optimised and does not make a 2nd api call " + inMobiUnifiedIdInterface;
            return Unit.INSTANCE;
        }
        Object a2 = a(continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }
}
