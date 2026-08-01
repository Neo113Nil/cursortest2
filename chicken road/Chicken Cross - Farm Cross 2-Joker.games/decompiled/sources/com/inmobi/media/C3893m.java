package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3893m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y9 f7234a;
    public final /* synthetic */ InterfaceC3834k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3893m(Y9 y9, InterfaceC3834k interfaceC3834k, Continuation continuation) {
        super(2, continuation);
        this.f7234a = y9;
        this.b = interfaceC3834k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3893m(this.f7234a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3893m(this.f7234a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Y9 y9 = this.f7234a;
        if (y9 != null) {
            ((Z9) y9).c("AdAudioTracker", "Adding audio volume change listener. Existing listeners - " + r.h.size());
        }
        Iterator it = r.h.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                r.h.remove(weakReference);
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = r.h;
        boolean isEmpty = copyOnWriteArraySet.isEmpty();
        copyOnWriteArraySet.add(new WeakReference(this.b));
        InterfaceC3834k interfaceC3834k = this.b;
        Float f = (Float) r.e.get();
        ((C3941nj) interfaceC3834k).a(f != null ? Boxing.boxFloat(AbstractC3727g4.a(f.floatValue() * 100.0f)) : null);
        if (isEmpty) {
            Y9 y92 = this.f7234a;
            if (y92 != null) {
                ((Z9) y92).c("AdAudioTracker", "Starting audio volume change listener");
            }
            r rVar = r.f7338a;
            r.a(this.f7234a);
        } else {
            Y9 y93 = this.f7234a;
            if (y93 != null) {
                ((Z9) y93).c("AdAudioTracker", "Resuming audio volume change listener");
            }
        }
        return Unit.INSTANCE;
    }
}
