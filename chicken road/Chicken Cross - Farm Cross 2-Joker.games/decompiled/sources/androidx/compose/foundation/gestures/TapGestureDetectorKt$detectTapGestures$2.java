package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.moloco.sdk.BidRequest;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.time.DurationKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
    final /* synthetic */ Function1<Offset, Unit> $onLongPress;
    final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
    final /* synthetic */ Function1<Offset, Unit> $onTap;
    final /* synthetic */ PointerInputScope $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TapGestureDetectorKt$detectTapGestures$2(PointerInputScope pointerInputScope, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function1<? super Offset, Unit> function13, Continuation<? super TapGestureDetectorKt$detectTapGestures$2> continuation) {
        super(2, continuation);
        this.$this_detectTapGestures = pointerInputScope;
        this.$onPress = function3;
        this.$onLongPress = function1;
        this.$onDoubleTap = function12;
        this.$onTap = function13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, continuation);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
            this.label = 1;
            if (ForEachGestureKt.forEachGesture(this.$this_detectTapGestures, new AnonymousClass1(pressGestureScopeImpl, this.$onPress, coroutineScope, this.$onLongPress, this.$onDoubleTap, this.$onTap, null), this) == coroutine_suspended) {
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

    /* compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $$this$coroutineScope;
        final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
        final /* synthetic */ Function1<Offset, Unit> $onLongPress;
        final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
        final /* synthetic */ Function1<Offset, Unit> $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PressGestureScopeImpl pressGestureScopeImpl, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, CoroutineScope coroutineScope, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function1<? super Offset, Unit> function13, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pressScope = pressGestureScopeImpl;
            this.$onPress = function3;
            this.$$this$coroutineScope = coroutineScope;
            this.$onLongPress = function1;
            this.$onDoubleTap = function12;
            this.$onTap = function13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pressScope, this.$onPress, this.$$this$coroutineScope, this.$onLongPress, this.$onDoubleTap, this.$onTap, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {MBSupportMuteAdType.REWARD_VIDEO, 106, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 127, 140, 158}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "down", "upOrCancel", "longPressTimeout", "$this$awaitPointerEventScope", "upOrCancel", "longPressTimeout", "$this$awaitPointerEventScope", "upOrCancel", "longPressTimeout", "$this$awaitPointerEventScope", "upOrCancel", "secondDown"}, s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00141 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
            final /* synthetic */ Function1<Offset, Unit> $onLongPress;
            final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
            final /* synthetic */ Function1<Offset, Unit> $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00141(PressGestureScopeImpl pressGestureScopeImpl, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, CoroutineScope coroutineScope, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function1<? super Offset, Unit> function13, Continuation<? super C00141> continuation) {
                super(2, continuation);
                this.$pressScope = pressGestureScopeImpl;
                this.$onPress = function3;
                this.$$this$coroutineScope = coroutineScope;
                this.$onLongPress = function1;
                this.$onDoubleTap = function12;
                this.$onTap = function13;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00141 c00141 = new C00141(this.$pressScope, this.$onPress, this.$$this$coroutineScope, this.$onLongPress, this.$onDoubleTap, this.$onTap, continuation);
                c00141.L$0 = obj;
                return c00141;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C00141) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x01d9  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x01ec  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0209 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0175  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x018a  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00f4 A[Catch: PointerEventTimeoutCancellationException -> 0x0107, TryCatch #2 {PointerEventTimeoutCancellationException -> 0x0107, blocks: (B:57:0x00ee, B:59:0x00f4, B:62:0x00fa), top: B:56:0x00ee }] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00fa A[Catch: PointerEventTimeoutCancellationException -> 0x0107, TRY_LEAVE, TryCatch #2 {PointerEventTimeoutCancellationException -> 0x0107, blocks: (B:57:0x00ee, B:59:0x00f4, B:62:0x00fa), top: B:56:0x00ee }] */
            /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x012f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:76:0x00a1  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x00ea A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x00c3  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                Object awaitFirstDown$default;
                AwaitPointerEventScope awaitPointerEventScope2;
                PointerInputChange pointerInputChange;
                Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function3;
                Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function32;
                long longPressTimeoutMillis;
                Ref.ObjectRef objectRef;
                Object withTimeout;
                AwaitPointerEventScope awaitPointerEventScope3;
                PointerInputChange pointerInputChange2;
                Ref.ObjectRef objectRef2;
                AwaitPointerEventScope awaitPointerEventScope4;
                Function1<Offset, Unit> function1;
                Object consumeUntilUp;
                T t;
                Object awaitSecondDown;
                Ref.ObjectRef objectRef3;
                AwaitPointerEventScope awaitPointerEventScope5;
                PointerInputChange pointerInputChange3;
                Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function33;
                Ref.ObjectRef objectRef4;
                AwaitPointerEventScope awaitPointerEventScope6;
                Function1<Offset, Unit> function12;
                Function1<Offset, Unit> function13;
                Object consumeUntilUp2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope;
                        this.label = 1;
                        awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, this, 1, null);
                        if (awaitFirstDown$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerInputChange = (PointerInputChange) awaitFirstDown$default;
                        pointerInputChange.consume();
                        this.$pressScope.reset();
                        function3 = this.$onPress;
                        function32 = TapGestureDetectorKt.NoPressGesture;
                        if (function3 != function32) {
                            BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new C00151(this.$onPress, this.$pressScope, pointerInputChange, null), 3, null);
                        }
                        longPressTimeoutMillis = this.$onLongPress == null ? awaitPointerEventScope2.getViewConfiguration().getLongPressTimeoutMillis() : DurationKt.MAX_MILLIS;
                        objectRef = new Ref.ObjectRef();
                        try {
                            this.L$0 = awaitPointerEventScope2;
                            this.L$1 = pointerInputChange;
                            this.L$2 = objectRef;
                            this.L$3 = objectRef;
                            this.J$0 = longPressTimeoutMillis;
                            this.label = 2;
                            withTimeout = awaitPointerEventScope2.withTimeout(longPressTimeoutMillis, new AnonymousClass2(null), this);
                        } catch (PointerEventTimeoutCancellationException unused) {
                            awaitPointerEventScope4 = awaitPointerEventScope2;
                            function1 = this.$onLongPress;
                            if (function1 != null) {
                                function1.invoke(Offset.m1381boximpl(pointerInputChange.getPosition()));
                            }
                            this.L$0 = awaitPointerEventScope4;
                            this.L$1 = objectRef;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.J$0 = longPressTimeoutMillis;
                            this.label = 3;
                            consumeUntilUp = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope4, this);
                            if (consumeUntilUp == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.$pressScope.release();
                            objectRef2 = objectRef;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            if (objectRef2.element != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (withTimeout != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        pointerInputChange2 = pointerInputChange;
                        objectRef2 = objectRef;
                        t = withTimeout;
                        try {
                            objectRef.element = t;
                            if (objectRef2.element != 0) {
                                this.$pressScope.cancel();
                            } else {
                                ((PointerInputChange) objectRef2.element).consume();
                                this.$pressScope.release();
                            }
                        } catch (PointerEventTimeoutCancellationException unused2) {
                            objectRef = objectRef2;
                            pointerInputChange = pointerInputChange2;
                            awaitPointerEventScope4 = awaitPointerEventScope3;
                            function1 = this.$onLongPress;
                            if (function1 != null) {
                            }
                            this.L$0 = awaitPointerEventScope4;
                            this.L$1 = objectRef;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.J$0 = longPressTimeoutMillis;
                            this.label = 3;
                            consumeUntilUp = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope4, this);
                            if (consumeUntilUp == coroutine_suspended) {
                            }
                            this.$pressScope.release();
                            objectRef2 = objectRef;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            if (objectRef2.element != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (objectRef2.element != 0) {
                            if (this.$onDoubleTap == null) {
                                Function1<Offset, Unit> function14 = this.$onTap;
                                if (function14 != null) {
                                    function14.invoke(Offset.m1381boximpl(((PointerInputChange) objectRef2.element).getPosition()));
                                }
                            } else {
                                this.L$0 = awaitPointerEventScope3;
                                this.L$1 = objectRef2;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.J$0 = longPressTimeoutMillis;
                                this.label = 4;
                                awaitSecondDown = TapGestureDetectorKt.awaitSecondDown(awaitPointerEventScope3, (PointerInputChange) objectRef2.element, this);
                                if (awaitSecondDown == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                objectRef3 = objectRef2;
                                awaitPointerEventScope5 = awaitPointerEventScope3;
                                pointerInputChange3 = (PointerInputChange) awaitSecondDown;
                                if (pointerInputChange3 != null) {
                                    Function1<Offset, Unit> function15 = this.$onTap;
                                    if (function15 != null) {
                                        function15.invoke(Offset.m1381boximpl(((PointerInputChange) objectRef3.element).getPosition()));
                                    }
                                } else {
                                    this.$pressScope.reset();
                                    Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function34 = this.$onPress;
                                    function33 = TapGestureDetectorKt.NoPressGesture;
                                    if (function34 != function33) {
                                        BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass3(this.$onPress, this.$pressScope, pointerInputChange3, null), 3, null);
                                    }
                                    try {
                                        this.L$0 = awaitPointerEventScope5;
                                        this.L$1 = objectRef3;
                                        this.L$2 = pointerInputChange3;
                                        this.label = 5;
                                        if (awaitPointerEventScope5.withTimeout(longPressTimeoutMillis, new AnonymousClass4(this.$pressScope, this.$onDoubleTap, this.$onTap, objectRef3, null), this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } catch (PointerEventTimeoutCancellationException unused3) {
                                        objectRef4 = objectRef3;
                                        awaitPointerEventScope6 = awaitPointerEventScope5;
                                        function12 = this.$onTap;
                                        if (function12 != null) {
                                        }
                                        function13 = this.$onLongPress;
                                        if (function13 != null) {
                                        }
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                        consumeUntilUp2 = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope6, this);
                                        if (consumeUntilUp2 == coroutine_suspended) {
                                        }
                                        this.$pressScope.release();
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        awaitFirstDown$default = obj;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerInputChange = (PointerInputChange) awaitFirstDown$default;
                        pointerInputChange.consume();
                        this.$pressScope.reset();
                        function3 = this.$onPress;
                        function32 = TapGestureDetectorKt.NoPressGesture;
                        if (function3 != function32) {
                        }
                        if (this.$onLongPress == null) {
                        }
                        objectRef = new Ref.ObjectRef();
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange;
                        this.L$2 = objectRef;
                        this.L$3 = objectRef;
                        this.J$0 = longPressTimeoutMillis;
                        this.label = 2;
                        withTimeout = awaitPointerEventScope2.withTimeout(longPressTimeoutMillis, new AnonymousClass2(null), this);
                        if (withTimeout != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        longPressTimeoutMillis = this.J$0;
                        objectRef = (Ref.ObjectRef) this.L$3;
                        Ref.ObjectRef objectRef5 = (Ref.ObjectRef) this.L$2;
                        pointerInputChange = (PointerInputChange) this.L$1;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                            pointerInputChange2 = pointerInputChange;
                            objectRef2 = objectRef5;
                            t = obj;
                            objectRef.element = t;
                            if (objectRef2.element != 0) {
                            }
                        } catch (PointerEventTimeoutCancellationException unused4) {
                            objectRef = objectRef5;
                            awaitPointerEventScope4 = awaitPointerEventScope2;
                            function1 = this.$onLongPress;
                            if (function1 != null) {
                            }
                            this.L$0 = awaitPointerEventScope4;
                            this.L$1 = objectRef;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.J$0 = longPressTimeoutMillis;
                            this.label = 3;
                            consumeUntilUp = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope4, this);
                            if (consumeUntilUp == coroutine_suspended) {
                            }
                            this.$pressScope.release();
                            objectRef2 = objectRef;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            if (objectRef2.element != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (objectRef2.element != 0) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                        longPressTimeoutMillis = this.J$0;
                        objectRef = (Ref.ObjectRef) this.L$1;
                        awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        this.$pressScope.release();
                        objectRef2 = objectRef;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                        if (objectRef2.element != 0) {
                        }
                        return Unit.INSTANCE;
                    case 4:
                        longPressTimeoutMillis = this.J$0;
                        Ref.ObjectRef objectRef6 = (Ref.ObjectRef) this.L$1;
                        AwaitPointerEventScope awaitPointerEventScope7 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objectRef3 = objectRef6;
                        awaitPointerEventScope5 = awaitPointerEventScope7;
                        awaitSecondDown = obj;
                        pointerInputChange3 = (PointerInputChange) awaitSecondDown;
                        if (pointerInputChange3 != null) {
                        }
                        return Unit.INSTANCE;
                    case 5:
                        pointerInputChange3 = (PointerInputChange) this.L$2;
                        objectRef4 = (Ref.ObjectRef) this.L$1;
                        awaitPointerEventScope6 = (AwaitPointerEventScope) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (PointerEventTimeoutCancellationException unused5) {
                            function12 = this.$onTap;
                            if (function12 != null) {
                                function12.invoke(Offset.m1381boximpl(((PointerInputChange) objectRef4.element).getPosition()));
                            }
                            function13 = this.$onLongPress;
                            if (function13 != null) {
                                function13.invoke(Offset.m1381boximpl(pointerInputChange3.getPosition()));
                            }
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                            consumeUntilUp2 = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope6, this);
                            if (consumeUntilUp2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.$pressScope.release();
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        this.$pressScope.release();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$1", f = "TapGestureDetector.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00151(Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation<? super C00151> continuation) {
                    super(2, continuation);
                    this.$onPress = function3;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C00151(this.$onPress, this.$pressScope, this.$down, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C00151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function3 = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset m1381boximpl = Offset.m1381boximpl(this.$down.getPosition());
                        this.label = 1;
                        if (function3.invoke(pressGestureScopeImpl, m1381boximpl, this) == coroutine_suspended) {
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

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2", f = "TapGestureDetector.kt", i = {}, l = {BidRequest.SdkBidRequest.Imp.Native.NativeRequest.EventTrackers.EventType.CUSTOM_ACTION_07_VALUE}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerInputChange> continuation) {
                    return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        obj = TapGestureDetectorKt.waitForUpOrCancellation((AwaitPointerEventScope) this.L$0, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$3", f = "TapGestureDetector.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                final /* synthetic */ PointerInputChange $secondDown;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$onPress = function3;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$secondDown = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(this.$onPress, this.$pressScope, this.$secondDown, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function3 = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset m1381boximpl = Offset.m1381boximpl(this.$secondDown.getPosition());
                        this.label = 1;
                        if (function3.invoke(pressGestureScopeImpl, m1381boximpl, this) == coroutine_suspended) {
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

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4", f = "TapGestureDetector.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function1<Offset, Unit> $onDoubleTap;
                final /* synthetic */ Function1<Offset, Unit> $onTap;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                final /* synthetic */ Ref.ObjectRef<PointerInputChange> $upOrCancel;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Ref.ObjectRef<PointerInputChange> objectRef, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                    this.$onDoubleTap = function1;
                    this.$onTap = function12;
                    this.$upOrCancel = objectRef;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$pressScope, this.$onDoubleTap, this.$onTap, this.$upOrCancel, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        obj = TapGestureDetectorKt.waitForUpOrCancellation((AwaitPointerEventScope) this.L$0, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        pointerInputChange.consume();
                        this.$pressScope.release();
                        this.$onDoubleTap.invoke(Offset.m1381boximpl(pointerInputChange.getPosition()));
                        return Unit.INSTANCE;
                    }
                    this.$pressScope.cancel();
                    Function1<Offset, Unit> function1 = this.$onTap;
                    if (function1 == null) {
                        return null;
                    }
                    function1.invoke(Offset.m1381boximpl(this.$upOrCancel.element.getPosition()));
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (((PointerInputScope) this.L$0).awaitPointerEventScope(new C00141(this.$pressScope, this.$onPress, this.$$this$coroutineScope, this.$onLongPress, this.$onDoubleTap, this.$onTap, null), this) == coroutine_suspended) {
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
}
