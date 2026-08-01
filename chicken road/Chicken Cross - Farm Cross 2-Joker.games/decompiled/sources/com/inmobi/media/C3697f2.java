package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* renamed from: com.inmobi.media.f2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3697f2 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f7097a;
    public final ViewGroup b;
    public final MutableStateFlow c;
    public final long d;
    public final Y9 e;
    public Job f;

    public C3697f2(long j, ViewGroup observableView, Y9 y9, CoroutineScope coroutineScope, MutableStateFlow visibilityStateFlow) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(observableView, "observableView");
        Intrinsics.checkNotNullParameter(visibilityStateFlow, "visibilityStateFlow");
        this.f7097a = coroutineScope;
        this.b = observableView;
        this.c = visibilityStateFlow;
        this.d = j;
        this.e = y9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r12.collect(r13, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (r14.collect(r2, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C3697f2 c3697f2, ViewGroup viewGroup, CoroutineScope coroutineScope, ContinuationImpl continuationImpl) {
        C3641d2 c3641d2;
        int i;
        c3697f2.getClass();
        if (continuationImpl instanceof C3641d2) {
            c3641d2 = (C3641d2) continuationImpl;
            int i2 = c3641d2.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3641d2.c = i2 - Integer.MIN_VALUE;
                Object obj = c3641d2.f7060a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3641d2.c;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
                Y5.f6965a.getClass();
                if (Y5.B()) {
                    Y9 y9 = c3697f2.e;
                    if (y9 != null) {
                        ((Z9) y9).a("WindowLifecycleHandler", "startObservingVisibility - Using window visibility observer (UDC+)");
                    }
                    StateFlow stateIn = FlowKt.stateIn(FlowKt.flowOn(FlowKt.callbackFlow(new Sq(viewGroup, null)), Dispatchers.getMain()), coroutineScope, SharingStarted.INSTANCE.getEagerly(), Boxing.boxBoolean(viewGroup.getWindowVisibility() == 0));
                    C3668e2 c3668e2 = new C3668e2(c3697f2);
                    c3641d2.c = 1;
                } else {
                    Y9 y92 = c3697f2.e;
                    if (y92 != null) {
                        ((Z9) y92).a("WindowLifecycleHandler", "startObservingVisibility - Using window focus observer (pre-UDC)");
                    }
                    StateFlow stateIn2 = FlowKt.stateIn(FlowKt.flowOn(FlowKt.callbackFlow(new Qq(viewGroup, null)), Dispatchers.getMain()), coroutineScope, SharingStarted.INSTANCE.getEagerly(), Boxing.boxBoolean(viewGroup.isFocused()));
                    C4181w7 c4181w7 = new C4181w7(c3697f2.d, viewGroup, c3697f2.e, coroutineScope, c3697f2.c);
                    c3641d2.c = 2;
                }
                return coroutine_suspended;
            }
        }
        c3641d2 = new C3641d2(c3697f2, continuationImpl);
        Object obj2 = c3641d2.f7060a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3641d2.c;
        if (i == 0) {
        }
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue());
    }

    public final Unit a(boolean z) {
        Job launch$default;
        Y9 y9 = this.e;
        if (y9 != null) {
            ((Z9) y9).a("WindowLifecycleHandler", "AttachedStateCollector - view attachment state changed: " + z);
        }
        if (z) {
            Y9 y92 = this.e;
            if (y92 != null) {
                ((Z9) y92).a("WindowLifecycleHandler", "AttachedStateCollector - starting visibility observation");
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.f7097a, null, null, new C3613c2(this, null), 3, null);
            this.f = launch$default;
        } else {
            Y9 y93 = this.e;
            if (y93 != null) {
                ((Z9) y93).a("WindowLifecycleHandler", "AttachedStateCollector - view detached, stopping observation");
            }
            this.c.setValue(Boxing.boxBoolean(false));
            AbstractC3787i7.a(this.f);
            this.f = null;
        }
        return Unit.INSTANCE;
    }
}
