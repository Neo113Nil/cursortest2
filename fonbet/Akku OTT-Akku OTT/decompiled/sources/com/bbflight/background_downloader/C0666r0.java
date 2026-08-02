package com.bbflight.background_downloader;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.InterfaceC1120x0;

@DebugMetadata(c = "com.bbflight.background_downloader.NotificationService$updateGroupNotification$3", f = "Notifications.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* renamed from: com.bbflight.background_downloader.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0666r0 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super InterfaceC1120x0>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ Ref.ObjectRef<Z> b;
    public final /* synthetic */ String c;

    @DebugMetadata(c = "com.bbflight.background_downloader.NotificationService$updateGroupNotification$3$1", f = "Notifications.kt", i = {}, l = {533}, m = "invokeSuspend", n = {}, nl = {534}, s = {}, v = 2)
    /* renamed from: com.bbflight.background_downloader.r0$a */
    public static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Ref.ObjectRef<Z> b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<Z> objectRef, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = objectRef;
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (kotlinx.coroutines.W.b(5000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Z z = this.b.element;
            if (z.b() == z.c.size()) {
                C0657m0.b.remove(this.c);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0666r0(Ref.ObjectRef<Z> objectRef, String str, Continuation<? super C0666r0> continuation) {
        super(2, continuation);
        this.b = objectRef;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C0666r0 c0666r0 = new C0666r0(this.b, this.c, continuation);
        c0666r0.a = obj;
        return c0666r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super InterfaceC1120x0> continuation) {
        return ((C0666r0) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.K k = (kotlinx.coroutines.K) this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return C1082i.c(k, null, null, new a(this.b, this.c, null), 3);
    }
}
