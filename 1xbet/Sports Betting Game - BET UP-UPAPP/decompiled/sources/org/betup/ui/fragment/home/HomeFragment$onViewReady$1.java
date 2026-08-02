package org.betup.ui.fragment.home;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.mediarouter.media.MediaRouter;
import io.bidmachine.media3.extractor.ts.PsExtractor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.ui.fragment.dailybonus.model.DailyBonusData;
import org.betup.ui.fragment.dailybonus.model.DailyBonusDay;
import org.betup.ui.fragment.dailybonus.model.DailyBonusState;
import org.betup.ui.fragment.home.controller.HomeDailyQuestEvent;
import org.betup.ui.fragment.home.controller.HomeVideoBonusEvent;
import org.betup.utils.SnackbarHelper;

/* compiled from: KHomeFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.home.HomeFragment$onViewReady$1", f = "KHomeFragment.kt", i = {}, l = {PsExtractor.VIDEO_STREAM_MASK}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class HomeFragment$onViewReady$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeFragment$onViewReady$1(HomeFragment homeFragment, Continuation<? super HomeFragment$onViewReady$1> continuation) {
        super(2, continuation);
        this.this$0 = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeFragment$onViewReady$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeFragment$onViewReady$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: KHomeFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1", f = "KHomeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HomeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HomeFragment homeFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: KHomeFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$1", f = "KHomeFragment.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C14401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HomeFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14401(HomeFragment homeFragment, Continuation<? super C14401> continuation) {
                super(2, continuation);
                this.this$0 = homeFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C14401(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C14401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<HomeVideoBonusEvent> events = this.this$0.getHomeVideoBonusController().getEvents();
                    final HomeFragment homeFragment = this.this$0;
                    this.label = 1;
                    if (events.collect(new FlowCollector() { // from class: org.betup.ui.fragment.home.HomeFragment.onViewReady.1.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((HomeVideoBonusEvent) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(HomeVideoBonusEvent homeVideoBonusEvent, Continuation<? super Unit> continuation) {
                            if (homeVideoBonusEvent instanceof HomeVideoBonusEvent.ShowCollectDialog) {
                                HomeFragment.this.showHomeVideoCollectDialog(((HomeVideoBonusEvent.ShowCollectDialog) homeVideoBonusEvent).getAmount());
                            } else {
                                if (!(homeVideoBonusEvent instanceof HomeVideoBonusEvent.ShowMessage)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                SnackbarHelper.showShort(HomeFragment.this.requireContext(), ((HomeVideoBonusEvent.ShowMessage) homeVideoBonusEvent).getMessageResId());
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C14401(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: KHomeFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$2", f = "KHomeFragment.kt", i = {}, l = {MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_REMOVED}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HomeFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(HomeFragment homeFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = homeFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<DailyBonusData> data = this.this$0.getDailyBonusController().getData();
                    final Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$2$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            @DebugMetadata(c = "org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$2$invokeSuspend$$inlined$map$1$2", f = "KHomeFragment.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                            /* renamed from: org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                List<DailyBonusDay> bonuses;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label -= Integer.MIN_VALUE;
                                        Object obj2 = anonymousClass1.result;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector = this.$this_unsafeFlow;
                                            DailyBonusData dailyBonusData = (DailyBonusData) obj;
                                            boolean z = false;
                                            if (dailyBonusData != null && (bonuses = dailyBonusData.getBonuses()) != null) {
                                                List<DailyBonusDay> list = bonuses;
                                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                                    Iterator<T> it = list.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            break;
                                                        }
                                                        if (((DailyBonusDay) it.next()).getState() == DailyBonusState.AVAILABLE) {
                                                            z = true;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            Boolean boxBoolean = Boxing.boxBoolean(z);
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj2);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                Object obj22 = anonymousClass1.result;
                                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    Flow<Boolean> flow = new Flow<Boolean>() { // from class: org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$2$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            @DebugMetadata(c = "org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$2$invokeSuspend$$inlined$filter$1$2", f = "KHomeFragment.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                            /* renamed from: org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label -= Integer.MIN_VALUE;
                                        Object obj2 = anonymousClass1.result;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector = this.$this_unsafeFlow;
                                            if (((Boolean) obj).booleanValue()) {
                                                anonymousClass1.label = 1;
                                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj2);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                Object obj22 = anonymousClass1.result;
                                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    final HomeFragment homeFragment = this.this$0;
                    this.label = 1;
                    if (flow.collect(new FlowCollector() { // from class: org.betup.ui.fragment.home.HomeFragment.onViewReady.1.1.2.3
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                            HomeFragment.this.tryScheduleAutoDailyBonusPresentation();
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
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

        /* compiled from: KHomeFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$3", f = "KHomeFragment.kt", i = {}, l = {MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_UNSELECTED}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: org.betup.ui.fragment.home.HomeFragment$onViewReady$1$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HomeFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(HomeFragment homeFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = homeFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
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
                    SharedFlow<HomeDailyQuestEvent> events = this.this$0.getHomeDailyQuestController().getEvents();
                    final HomeFragment homeFragment = this.this$0;
                    this.label = 1;
                    if (events.collect(new FlowCollector() { // from class: org.betup.ui.fragment.home.HomeFragment.onViewReady.1.1.3.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((HomeDailyQuestEvent) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(HomeDailyQuestEvent homeDailyQuestEvent, Continuation<? super Unit> continuation) {
                            if (homeDailyQuestEvent instanceof HomeDailyQuestEvent.ShowError) {
                                SnackbarHelper.showShort(HomeFragment.this.requireContext(), ((HomeDailyQuestEvent.ShowError) homeDailyQuestEvent).getMessageResId());
                            } else if (!(homeDailyQuestEvent instanceof HomeDailyQuestEvent.ShowClaimableNotification)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, Lifecycle.State.STARTED, new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
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
