package com.bbflight.background_downloader;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.channels.b;
import kotlinx.coroutines.internal.C1086c;

/* loaded from: classes3.dex */
public final class A1 {
    public static final kotlinx.coroutines.channels.b a;
    public static final kotlinx.coroutines.channels.b b;
    public static final kotlinx.coroutines.sync.c c;

    @DebugMetadata(c = "com.bbflight.background_downloader.WiFi$1", f = "WiFi.kt", i = {1, 2}, l = {35, 36, 37}, m = "invokeSuspend", n = {"change", "change"}, nl = {36, 37, 39}, s = {"L$1", "L$1"}, v = 2)
    public static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        public kotlinx.coroutines.channels.i a;
        public Object b;
        public int c;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
        
            if (r8 == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007e -> B:7:0x007f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.channels.i aVar;
            kotlinx.coroutines.channels.i iVar;
            C0 c0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.b bVar = A1.a;
                bVar.getClass();
                aVar = new b.a();
                this.a = aVar;
                this.b = null;
                this.c = 1;
                obj = aVar.b(this);
            } else {
                if (i == 1) {
                    aVar = this.a;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    C0 c02 = (C0) aVar.next();
                    kotlinx.coroutines.sync.c cVar = A1.c;
                    this.a = aVar;
                    this.b = c02;
                    this.c = 2;
                    if (cVar.d(this) != coroutine_suspended) {
                        iVar = aVar;
                        c0 = c02;
                        this.a = iVar;
                        this.b = SpillingKt.nullOutSpilledVariable(c0);
                        this.c = 3;
                        obj = c0.a(this);
                        if (obj != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 2) {
                    c0 = (C0) this.b;
                    iVar = this.a;
                    ResultKt.throwOnFailure(obj);
                    this.a = iVar;
                    this.b = SpillingKt.nullOutSpilledVariable(c0);
                    this.c = 3;
                    obj = c0.a(this);
                    if (obj != coroutine_suspended) {
                        aVar = iVar;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        this.a = aVar;
                        this.b = null;
                        this.c = 1;
                        obj = aVar.b(this);
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.a;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    kotlinx.coroutines.sync.c cVar2 = A1.c;
                    if (cVar2.b()) {
                        cVar2.c(null);
                    }
                }
                this.a = aVar;
                this.b = null;
                this.c = 1;
                obj = aVar.b(this);
            }
        }
    }

    @DebugMetadata(c = "com.bbflight.background_downloader.WiFi$2", f = "WiFi.kt", i = {1}, l = {45, 46}, m = "invokeSuspend", n = {"reEnqueue"}, nl = {46, 47}, s = {"L$1"}, v = 2)
    public static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        public kotlinx.coroutines.channels.i a;
        public U b;
        public int c;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((b) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if (r7 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        
            if (r1.a(1000, r6) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:6:0x0060). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005d -> B:6:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.channels.i aVar;
            kotlinx.coroutines.channels.i iVar;
            U u;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.b bVar = A1.b;
                bVar.getClass();
                aVar = new b.a();
                this.a = aVar;
                this.b = null;
                this.c = 1;
                obj = aVar.b(this);
            } else if (i == 1) {
                aVar = this.a;
                ResultKt.throwOnFailure(obj);
                iVar = aVar;
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                u = (U) iVar.next();
                if (u != null) {
                    this.a = iVar;
                    this.b = u;
                    this.c = 2;
                }
                if (u == null) {
                }
                aVar = iVar;
                this.a = aVar;
                this.b = null;
                this.c = 1;
                obj = aVar.b(this);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u = this.b;
                iVar = this.a;
                ResultKt.throwOnFailure(obj);
                if (u == null) {
                    kotlinx.coroutines.sync.c cVar = A1.c;
                    if (cVar.b()) {
                        cVar.c(null);
                    }
                }
                aVar = iVar;
                this.a = aVar;
                this.b = null;
                this.c = 1;
                obj = aVar.b(this);
            }
        }
    }

    static {
        C1086c a2 = kotlinx.coroutines.L.a(C1049c0.a);
        a = kotlinx.coroutines.channels.j.a(Integer.MAX_VALUE, null, 6);
        b = kotlinx.coroutines.channels.j.a(Integer.MAX_VALUE, null, 6);
        c = kotlinx.coroutines.sync.d.a();
        C1082i.c(a2, null, null, new a(2, null), 3);
        C1082i.c(a2, null, null, new b(2, null), 3);
    }
}
