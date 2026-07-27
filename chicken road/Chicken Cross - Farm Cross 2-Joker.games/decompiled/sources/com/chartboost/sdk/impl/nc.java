package com.chartboost.sdk.impl;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.media.Position;
import com.iab.omid.library.chartboost.adsession.media.VastProperties;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public class nc implements wk {
    public static final a i = new a(null);
    public static final AtomicInteger j = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final sk f4895a;
    public final AdSession b;
    public final AdEvents c;
    public boolean d;
    public boolean e;
    public yk f;
    public int g;
    public final CoroutineScope h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4896a;

        static {
            int[] iArr = new int[yk.values().length];
            try {
                iArr[yk.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yk.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yk.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yk.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4896a = iArr;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return nc.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                nc.this.c.loaded();
            } catch (Exception e) {
                mb.b("Signaling ad loaded for viewability failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ VastProperties d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(VastProperties vastProperties, Continuation continuation) {
            super(2, continuation);
            this.d = vastProperties;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return nc.this.new d(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                nc.this.c.loaded(this.d);
            } catch (Exception e) {
                mb.b("Signaling video loaded for viewability failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ Ref.BooleanRef d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.BooleanRef booleanRef, Continuation continuation) {
            super(2, continuation);
            this.d = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return nc.this.new e(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                nc.this.c.impressionOccurred();
                nc.this.d = true;
                this.d.element = true;
            } catch (Exception e) {
                mb.b("Counting the viewability impression failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int b;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return nc.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            try {
                try {
                    nc.this.b.finish();
                    mb.a("Viewability ad session finished (session=" + nc.this.e() + ")", (Throwable) null, 2, (Object) null);
                } catch (Exception e) {
                    mb.b("Finishing the viewability ad session failed.", e);
                }
                CoroutineScopeKt.cancel$default(nc.this.d(), null, 1, null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                CoroutineScopeKt.cancel$default(nc.this.d(), null, 1, null);
                throw th;
            }
        }
    }

    public nc(sk manager, AdSession adSession, AdEvents adEvents, View adView, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        Intrinsics.checkNotNullParameter(adEvents, "adEvents");
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f4895a = manager;
        this.b = adSession;
        this.c = adEvents;
        this.f = yk.b;
        this.h = CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.g = j.incrementAndGet();
        b(adView);
    }

    @Override // com.chartboost.sdk.impl.wk
    public void c() {
        a(yk.c);
    }

    public final CoroutineScope d() {
        return this.h;
    }

    public final int e() {
        return this.g;
    }

    public final boolean f() {
        return this.e;
    }

    public final void b(View adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        try {
            this.b.registerAdView(adView);
        } catch (Exception e2) {
            mb.b("Unable to register ad view.", e2);
        }
    }

    @Override // com.chartboost.sdk.impl.wk
    public void a() {
        a(yk.e);
    }

    @Override // com.chartboost.sdk.impl.wk
    public void a(View view, uk purpose) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        try {
            this.b.addFriendlyObstruction(view, purpose.c(), purpose.b());
        } catch (Exception e2) {
            mb.b("Adding a friendly obstruction failed.", e2);
        }
    }

    @Override // com.chartboost.sdk.impl.wk
    public void b() {
        a(yk.f);
    }

    @Override // com.chartboost.sdk.impl.wk
    public void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            this.b.removeFriendlyObstruction(view);
        } catch (Exception e2) {
            mb.b("Removing a friendly obstruction failed.", e2);
        }
    }

    public final void a(yk newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        a(newState, (Integer) null);
    }

    public final void a(yk newState, Integer num) {
        VastProperties createVastPropertiesForNonSkippableMedia;
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (this.f4895a.isActive()) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            int i2 = b.f4896a[newState.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return;
                        }
                        yk ykVar = this.f;
                        if (ykVar != yk.b && ykVar != yk.f) {
                            BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new f(null), 3, null);
                            this.e = false;
                            booleanRef.element = true;
                        }
                    } else {
                        if (this.d) {
                            return;
                        }
                        yk ykVar2 = this.f;
                        if (ykVar2 == yk.c || ykVar2 == yk.d) {
                            BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new e(booleanRef, null), 3, null);
                        }
                    }
                } else if (this.f == yk.b) {
                    try {
                        this.b.start();
                        mb.a("Viewability video ad session started (session=" + this.g + ")", (Throwable) null, 2, (Object) null);
                        if (num != null && num.intValue() > 0) {
                            createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(num.intValue(), true, Position.STANDALONE);
                            Intrinsics.checkNotNull(createVastPropertiesForNonSkippableMedia);
                        } else {
                            createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                            Intrinsics.checkNotNull(createVastPropertiesForNonSkippableMedia);
                        }
                        BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new d(createVastPropertiesForNonSkippableMedia, null), 3, null);
                        this.e = true;
                        booleanRef.element = true;
                    } catch (Exception e2) {
                        mb.b("Ad session start for viewability failed.", e2);
                    }
                }
            } else if (this.f == yk.b) {
                try {
                    this.b.start();
                    mb.a("Viewability ad session started (session=" + this.g + ")", (Throwable) null, 2, (Object) null);
                    BuildersKt__Builders_commonKt.launch$default(this.h, null, null, new c(null), 3, null);
                    this.e = true;
                    booleanRef.element = true;
                } catch (Exception e3) {
                    mb.b("Ad session start for viewability failed.", e3);
                }
            }
            if (booleanRef.element) {
                this.f = newState;
            }
        }
    }

    public /* synthetic */ nc(sk skVar, AdSession adSession, AdEvents adEvents, View view, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(skVar, adSession, adEvents, view, (i2 & 16) != 0 ? Dispatchers.getMain().getImmediate() : coroutineDispatcher);
    }
}
