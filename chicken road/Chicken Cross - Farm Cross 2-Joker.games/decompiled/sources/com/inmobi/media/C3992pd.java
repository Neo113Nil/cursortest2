package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* renamed from: com.inmobi.media.pd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3992pd extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7304a;
    public final /* synthetic */ C4020qd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3992pd(C4020qd c4020qd, Continuation continuation) {
        super(2, continuation);
        this.b = c4020qd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3992pd(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3992pd(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object a2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7304a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4020qd c4020qd = this.b;
            String str3 = c4020qd.f7326a;
            int i2 = c4020qd.b;
            int i3 = c4020qd.c;
            IntRange intRange = Tf.f6872a;
            c4020qd.g = new Kf(str3, null, null, null, new C3631ck(i2, i3 * 1000, 0), false, 46);
            C4020qd c4020qd2 = this.b;
            Kf kf = c4020qd2.g;
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a3 = Cb.a(context, "mraid_js_store");
                str = "key";
                str2 = "last_ts";
                Intrinsics.checkNotNullParameter(str2, str);
                if ((System.currentTimeMillis() / 1000) - a3.f6510a.getLong(str2, 0L) > c4020qd2.d && kf != null) {
                    C3733ga c3733ga = (C3733ga) If.c.getValue();
                    this.f7304a = 1;
                    a2 = c3733ga.f7119a.a(kf, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        a2 = obj;
        str = "key";
        str2 = "last_ts";
        Of of = (Of) a2;
        Context context2 = AbstractC3914mk.f7252a;
        if (!AbstractC4086sn.a(of)) {
            C4020qd c4020qd3 = this.b;
            Y9 y9 = c4020qd3.e;
            if (y9 != null) {
                String str4 = c4020qd3.f;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((Z9) y9).b(str4, "Getting MRAID Js from server failed.");
            }
        } else if (context2 != null) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
            ConcurrentHashMap concurrentHashMap2 = Db.b;
            Db a4 = Cb.a(context2, "mraid_js_store");
            IntRange intRange2 = Tf.f6872a;
            Intrinsics.checkNotNullParameter(of, "<this>");
            String value = of.d().string(Charsets.UTF_8);
            Intrinsics.checkNotNullParameter("mraid_js_string", str);
            Intrinsics.checkNotNullParameter(value, "value");
            a4.a("mraid_js_string", value, false);
            a4.a(str2, System.currentTimeMillis() / 1000, false);
        }
        return Unit.INSTANCE;
    }
}
