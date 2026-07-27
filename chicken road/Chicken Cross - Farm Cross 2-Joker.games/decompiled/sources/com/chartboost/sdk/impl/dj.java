package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class dj {
    public static e3 b;
    public static zk c;

    /* renamed from: a, reason: collision with root package name */
    public static final dj f4736a = new dj();
    public static final CoroutineScope d = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ rj c;
        public final /* synthetic */ sj d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rj rjVar, sj sjVar, Continuation continuation) {
            super(2, continuation);
            this.c = rjVar;
            this.d = sjVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            sj a2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                rj rjVar = this.c;
                sj sjVar = this.d;
                zk m = sjVar.m();
                if (m == null) {
                    m = dj.c;
                }
                Context applicationContext = this.d.b().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                a2 = sjVar.a((r30 & 1) != 0 ? sjVar.f5011a : m, (r30 & 2) != 0 ? sjVar.b : null, (r30 & 4) != 0 ? sjVar.c : applicationContext, (r30 & 8) != 0 ? sjVar.d : null, (r30 & 16) != 0 ? sjVar.e : null, (r30 & 32) != 0 ? sjVar.f : null, (r30 & 64) != 0 ? sjVar.g : null, (r30 & 128) != 0 ? sjVar.h : null, (r30 & 256) != 0 ? sjVar.i : null, (r30 & 512) != 0 ? sjVar.j : null, (r30 & 1024) != 0 ? sjVar.k : null, (r30 & 2048) != 0 ? sjVar.l : null, (r30 & 4096) != 0 ? sjVar.m : null, (r30 & 8192) != 0 ? sjVar.n : null);
                rjVar.b(a2);
            } catch (Exception e) {
                mb.b("Error tracking VAST event " + this.c.a() + ": " + e.getMessage(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public final e3 b() {
        return b;
    }

    public final void a(zk zkVar) {
        c = zkVar;
    }

    public final void a(e3 service) {
        Intrinsics.checkNotNullParameter(service, "service");
        b = service;
    }

    public final void a(rj eventType, sj params) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(params, "params");
        BuildersKt__Builders_commonKt.launch$default(d, null, null, new a(eventType, params, null), 3, null);
    }
}
