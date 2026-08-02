package com.amplitude.core.platform.plugins;

import com.amplitude.core.platform.f;
import com.amplitude.core.platform.g;
import com.amplitude.core.platform.intercept.h;
import com.amplitude.core.platform.n;
import com.amplitude.core.platform.o;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1101n0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.internal.C1086c;

/* loaded from: classes3.dex */
public final class a extends com.amplitude.core.platform.a {
    public com.amplitude.core.platform.b e;
    public h f;

    @DebugMetadata(c = "com.amplitude.core.platform.plugins.AmplitudeDestination$enqueue$1$1", f = "AmplitudeDestination.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.amplitude.core.platform.plugins.a$a, reason: collision with other inner class name */
    public static final class C0043a extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.amplitude.core.events.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0043a(com.amplitude.core.events.a aVar, Continuation<? super C0043a> continuation) {
            super(2, continuation);
            this.c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new C0043a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((C0043a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            com.amplitude.core.platform.b bVar = null;
            a aVar = a.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                h hVar = aVar.f;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identifyInterceptor");
                    hVar = null;
                }
                this.a = 1;
                obj = hVar.a(this.c, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.amplitude.core.events.a event = (com.amplitude.core.events.a) obj;
            if (event != null) {
                Intrinsics.checkNotNullParameter(event, "event");
                com.amplitude.core.platform.b bVar2 = aVar.e;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pipeline");
                } else {
                    bVar = bVar2;
                }
                bVar.a(event);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.amplitude.core.platform.plugins.AmplitudeDestination$flush$1", f = "AmplitudeDestination.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((b) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            a aVar = a.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                h hVar = aVar.f;
                if (hVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("identifyInterceptor");
                    hVar = null;
                }
                this.a = 1;
                if (hVar.c(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.amplitude.core.platform.b bVar = aVar.e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pipeline");
                bVar = null;
            }
            bVar.g.c(new n(o.b, null));
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplitude.core.platform.h
    public final com.amplitude.core.events.c a(com.amplitude.core.events.c payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        j(payload);
        return payload;
    }

    @Override // com.amplitude.core.platform.a, com.amplitude.core.platform.k
    public final void c(com.amplitude.core.b amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.c(amplitude);
        com.amplitude.core.platform.b bVar = new com.amplitude.core.platform.b(amplitude);
        this.e = bVar;
        bVar.i = true;
        com.amplitude.core.b bVar2 = bVar.a;
        C1101n0 c1101n0 = bVar2.f;
        g gVar = new g(bVar, null);
        C1086c c1086c = bVar.f;
        C1082i.c(c1086c, c1101n0, null, gVar, 2);
        C1082i.c(c1086c, bVar2.e, null, new f(bVar, null), 2);
        this.f = new h(amplitude.g(), amplitude, amplitude.i(), amplitude.a, this);
        c plugin = new c();
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        plugin.b(h());
        this.b.a(plugin);
    }

    @Override // com.amplitude.core.platform.h
    public final com.amplitude.core.events.g d(com.amplitude.core.events.g payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        j(payload);
        return payload;
    }

    @Override // com.amplitude.core.platform.h
    public final com.amplitude.core.events.a e(com.amplitude.core.events.a payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        j(payload);
        return payload;
    }

    @Override // com.amplitude.core.platform.h
    public final void flush() {
        C1082i.c(h().c, h().f, null, new b(null), 2);
    }

    @Override // com.amplitude.core.platform.h
    public final com.amplitude.core.events.b g(com.amplitude.core.events.b payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        j(payload);
        return payload;
    }

    public final void j(com.amplitude.core.events.a aVar) {
        if (aVar != null) {
            if (aVar.b()) {
                C1082i.c(h().c, h().f, null, new C0043a(aVar, null), 2);
                return;
            }
            h().i().d("Event is invalid for missing information like userId and deviceId. Dropping event: " + aVar.a());
        }
    }
}
