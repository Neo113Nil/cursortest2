package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ei, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3684ei extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Map f7088a;
    public int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ SignalsConfig.PublisherConfig d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3684ei(Map map, SignalsConfig.PublisherConfig publisherConfig, Continuation continuation) {
        super(2, continuation);
        this.c = map;
        this.d = publisherConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3684ei(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3684ei(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0186, code lost:
    
        if (com.inmobi.media.C3770hi.b(r13, r1, r0, r12) == r2) goto L70;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map signals;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        try {
        } catch (Exception unused) {
            Kc.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = "Received new publisher signals: " + this.c;
            Pair b = AbstractC3797ii.b(this.c);
            Map map = (Map) b.component1();
            Map map2 = (Map) b.component2();
            if (!map.isEmpty()) {
                C3770hi c3770hi = C3770hi.f7146a;
                JSONObject b2 = AbstractC3797ii.b(AbstractC3797ii.a(AbstractC3797ii.d(MapsKt.plus(AbstractC3797ii.a(c3770hi.c(), C3770hi.d()), map), this.d)), this.d);
                if (b2 != null) {
                    JSONObject jsonObject = C3770hi.b(c3770hi);
                    Intrinsics.checkNotNullParameter(b2, "<this>");
                    Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                    Iterator<String> keys = b2.keys();
                    Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jsonObject.put(next, b2.opt(next));
                    }
                    C3770hi c3770hi2 = C3770hi.f7146a;
                    this.f7088a = map2;
                    this.b = 1;
                    if (c3770hi2.a(jsonObject, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            signals = map2;
        } else {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            signals = this.f7088a;
            ResultKt.throwOnFailure(obj);
        }
        if (!signals.isEmpty()) {
            Map map3 = AbstractC3797ii.f7164a;
            Intrinsics.checkNotNullParameter(signals, "signals");
            Set keySet = signals.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (!StringsKt.startsWith$default((String) it.next(), "dir_", false, 2, (Object) null)) {
                        Intrinsics.checkNotNullParameter(signals, "signals");
                        Set keySet2 = signals.keySet();
                        if (!(keySet2 instanceof Collection) || !keySet2.isEmpty()) {
                            Iterator it2 = keySet2.iterator();
                            while (it2.hasNext()) {
                                if (!StringsKt.startsWith$default((String) it2.next(), "obj_", false, 2, (Object) null)) {
                                    Intrinsics.checkNotNullParameter(signals, "signals");
                                    Set keySet3 = signals.keySet();
                                    if (!(keySet3 instanceof Collection) || !keySet3.isEmpty()) {
                                        Iterator it3 = keySet3.iterator();
                                        while (it3.hasNext()) {
                                            if (!StringsKt.startsWith$default((String) it3.next(), "auto_", false, 2, (Object) null)) {
                                                Kc.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to unsupported or mixed keys = " + signals + ". Each call must contain only one type of new flow signals (obj_* or dir_*)");
                                                break;
                                            }
                                        }
                                    }
                                    C3770hi c3770hi3 = C3770hi.f7146a;
                                    SignalsConfig.PublisherConfig publisherConfig = this.d;
                                    this.f7088a = null;
                                    this.b = 4;
                                    if (C3770hi.a(c3770hi3, signals, publisherConfig, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        }
                        C3770hi c3770hi4 = C3770hi.f7146a;
                        SignalsConfig.PublisherConfig publisherConfig2 = this.d;
                        this.f7088a = null;
                        this.b = 3;
                        if (C3770hi.c(c3770hi4, signals, publisherConfig2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
            C3770hi c3770hi5 = C3770hi.f7146a;
            SignalsConfig.PublisherConfig publisherConfig3 = this.d;
            this.f7088a = null;
            this.b = 2;
        }
        return Unit.INSTANCE;
    }
}
