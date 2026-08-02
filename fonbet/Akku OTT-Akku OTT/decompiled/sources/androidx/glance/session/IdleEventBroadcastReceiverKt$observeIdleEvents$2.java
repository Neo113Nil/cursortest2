package androidx.glance.session;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/K;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.session.IdleEventBroadcastReceiverKt$observeIdleEvents$2", f = "IdleEventBroadcastReceiver.kt", i = {0}, l = {88}, m = "invokeSuspend", n = {"idleReceiver"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class IdleEventBroadcastReceiverKt$observeIdleEvents$2<T> extends SuspendLambda implements Function2<K, Continuation<? super T>, Object> {
    final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onIdle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IdleEventBroadcastReceiverKt$observeIdleEvents$2(Context context, Function1<? super Continuation<? super T>, ? extends Object> function1, Function1<? super Continuation<? super Unit>, ? extends Object> function12, Continuation<? super IdleEventBroadcastReceiverKt$observeIdleEvents$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$block = function1;
        this.$onIdle = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IdleEventBroadcastReceiverKt$observeIdleEvents$2 idleEventBroadcastReceiverKt$observeIdleEvents$2 = new IdleEventBroadcastReceiverKt$observeIdleEvents$2(this.$context, this.$block, this.$onIdle, continuation);
        idleEventBroadcastReceiverKt$observeIdleEvents$2.L$0 = obj;
        return idleEventBroadcastReceiverKt$observeIdleEvents$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IdleEventBroadcastReceiver idleEventBroadcastReceiver;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final K k = (K) this.L$0;
            final Function1<Continuation<? super Unit>, Object> function1 = this.$onIdle;
            IdleEventBroadcastReceiver idleEventBroadcastReceiver2 = new IdleEventBroadcastReceiver(new Function0<Unit>() { // from class: androidx.glance.session.IdleEventBroadcastReceiverKt$observeIdleEvents$2$idleReceiver$1

                @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
                @DebugMetadata(c = "androidx.glance.session.IdleEventBroadcastReceiverKt$observeIdleEvents$2$idleReceiver$1$1", f = "IdleEventBroadcastReceiver.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.glance.session.IdleEventBroadcastReceiverKt$observeIdleEvents$2$idleReceiver$1$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onIdle;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$onIdle = function1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.$onIdle, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Function1<Continuation<? super Unit>, Object> function1 = this.$onIdle;
                            this.label = 1;
                            if (function1.invoke(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(K k, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    C1082i.c(K.this, null, null, new AnonymousClass1(function1, null), 3);
                }
            });
            this.$context.registerReceiver(idleEventBroadcastReceiver2, IdleEventBroadcastReceiver.INSTANCE.getFilter());
            try {
                idleEventBroadcastReceiver2.checkIdleStatus$glance_release(this.$context);
                Function1<Continuation<? super T>, Object> function12 = this.$block;
                this.L$0 = idleEventBroadcastReceiver2;
                this.label = 1;
                obj = function12.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                idleEventBroadcastReceiver = idleEventBroadcastReceiver2;
            } catch (Throwable th) {
                th = th;
                idleEventBroadcastReceiver = idleEventBroadcastReceiver2;
                this.$context.unregisterReceiver(idleEventBroadcastReceiver);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            idleEventBroadcastReceiver = (IdleEventBroadcastReceiver) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                this.$context.unregisterReceiver(idleEventBroadcastReceiver);
                throw th;
            }
        }
        this.$context.unregisterReceiver(idleEventBroadcastReceiver);
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super T> continuation) {
        return ((IdleEventBroadcastReceiverKt$observeIdleEvents$2) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
