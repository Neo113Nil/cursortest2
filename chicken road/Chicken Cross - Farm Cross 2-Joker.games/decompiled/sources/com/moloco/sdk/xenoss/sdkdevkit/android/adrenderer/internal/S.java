package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.view.View;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes7.dex */
public class S implements Q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10933a = 0;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isEnoughAreaVisibleFlow$1", f = "ViewVisibilityTracker.kt", i = {0, 0, 1, 1}, l = {71, 72}, m = "invokeSuspend", n = {"$this$flow", "rect", "$this$flow", "rect"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10934a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ View d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.d, continuation);
            aVar.c = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:6:0x003c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.b
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r8.f10934a
                android.graphics.Rect r1 = (android.graphics.Rect) r1
                java.lang.Object r5 = r8.c
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlin.ResultKt.throwOnFailure(r9)
                goto L3c
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r1 = r8.f10934a
                android.graphics.Rect r1 = (android.graphics.Rect) r1
                java.lang.Object r5 = r8.c
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlin.ResultKt.throwOnFailure(r9)
                goto L60
            L2f:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.c
                r5 = r9
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>(r4, r4, r4, r4)
            L3c:
                android.view.View r9 = r8.d
                boolean r9 = r9.isShown()
                if (r9 == 0) goto L4e
                android.view.View r9 = r8.d
                boolean r9 = r9.getGlobalVisibleRect(r1)
                if (r9 == 0) goto L4e
                r9 = r3
                goto L4f
            L4e:
                r9 = r4
            L4f:
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
                r8.c = r5
                r8.f10934a = r1
                r8.b = r3
                java.lang.Object r9 = r5.emit(r9, r8)
                if (r9 != r0) goto L60
                return r0
            L60:
                r8.c = r5
                r8.f10934a = r1
                r8.b = r2
                r6 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r8)
                if (r9 != r0) goto L3c
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isVisibleFlow$1", f = "ViewVisibilityTracker.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10935a;
        public /* synthetic */ Object b;
        public final /* synthetic */ View c;
        public final /* synthetic */ S d;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isVisibleFlow$1$1", f = "ViewVisibilityTracker.kt", i = {}, l = {47, 56}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10936a;
            public /* synthetic */ boolean b;
            public final /* synthetic */ View c;
            public final /* synthetic */ ProducerScope<Boolean> d;
            public final /* synthetic */ S e;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isVisibleFlow$1$1$1", f = "ViewVisibilityTracker.kt", i = {}, l = {50, 52}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S$b$a$a, reason: collision with other inner class name */
            public static final class C1517a extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f10937a;
                public /* synthetic */ Object b;
                public final /* synthetic */ S c;
                public final /* synthetic */ View d;
                public final /* synthetic */ ProducerScope<Boolean> e;

                @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isVisibleFlow$1$1$1$1", f = "ViewVisibilityTracker.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S$b$a$a$a, reason: collision with other inner class name */
                public static final class C1518a extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    public int f10938a;
                    public /* synthetic */ boolean b;
                    public final /* synthetic */ ProducerScope<Boolean> c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C1518a(ProducerScope<? super Boolean> producerScope, Continuation<? super C1518a> continuation) {
                        super(2, continuation);
                        this.c = producerScope;
                    }

                    public final Object a(boolean z, Continuation<? super Unit> continuation) {
                        return ((C1518a) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1518a c1518a = new C1518a(this.c, continuation);
                        c1518a.b = ((Boolean) obj).booleanValue();
                        return c1518a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                        return a(bool.booleanValue(), continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f10938a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            boolean z = this.b;
                            ProducerScope<Boolean> producerScope = this.c;
                            Boolean boxBoolean = Boxing.boxBoolean(z);
                            this.f10938a = 1;
                            if (producerScope.send(boxBoolean, this) == coroutine_suspended) {
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
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C1517a(S s, View view, ProducerScope<? super Boolean> producerScope, Continuation<? super C1517a> continuation) {
                    super(2, continuation);
                    this.c = s;
                    this.d = view;
                    this.e = producerScope;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return ((C1517a) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1517a c1517a = new C1517a(this.c, this.d, this.e, continuation);
                    c1517a.b = obj;
                    return c1517a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f10937a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (Intrinsics.areEqual((Boolean) this.b, Boxing.boxBoolean(false))) {
                            ProducerScope<Boolean> producerScope = this.e;
                            Boolean boxBoolean = Boxing.boxBoolean(false);
                            this.f10937a = 2;
                            if (producerScope.send(boxBoolean, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            Flow<Boolean> b = this.c.b(this.d);
                            C1518a c1518a = new C1518a(this.e, null);
                            this.f10937a = 1;
                            if (FlowKt.collectLatest(b, c1518a, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1 && i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(View view, ProducerScope<? super Boolean> producerScope, S s, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = view;
                this.d = producerScope;
                this.e = s;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                return ((a) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.c, this.d, this.e, continuation);
                aVar.b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Flow b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10936a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.b) {
                        b = T.b(ViewTreeLifecycleOwner.get(this.c));
                        C1517a c1517a = new C1517a(this.e, this.c, this.d, null);
                        this.f10936a = 1;
                        if (FlowKt.collectLatest(b, c1517a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        ProducerScope<Boolean> producerScope = this.d;
                        Boolean boxBoolean = Boxing.boxBoolean(false);
                        this.f10936a = 2;
                        if (producerScope.send(boxBoolean, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, S s, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = view;
            this.d = s;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
            return ((b) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.c, this.d, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Flow b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10935a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.b;
                b = T.b(this.c);
                a aVar = new a(this.c, producerScope, this.d, null);
                this.f10935a = 1;
                if (FlowKt.collectLatest(b, aVar, this) == coroutine_suspended) {
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
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q
    public Flow<Boolean> a(View view) {
        Flow<Boolean> b2;
        Intrinsics.checkNotNullParameter(view, "view");
        b2 = T.b(FlowKt.channelFlow(new b(view, this, null)));
        return b2;
    }

    public Flow<Boolean> b(View view) {
        Flow<Boolean> b2;
        Intrinsics.checkNotNullParameter(view, "view");
        b2 = T.b(FlowKt.flow(new a(view, null)));
        return b2;
    }
}
