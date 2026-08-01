package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3949o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y9 f7275a;
    public final /* synthetic */ InterfaceC3834k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3949o(Y9 y9, InterfaceC3834k interfaceC3834k, Continuation continuation) {
        super(2, continuation);
        this.f7275a = y9;
        this.b = interfaceC3834k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3949o(this.f7275a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3949o(this.f7275a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Y9 y9 = this.f7275a;
        if (y9 != null) {
            ((Z9) y9).c("AdAudioTracker", "Removing audio volume change listener");
        }
        CopyOnWriteArraySet copyOnWriteArraySet = r.h;
        InterfaceC3834k interfaceC3834k = this.b;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (Intrinsics.areEqual(weakReference.get(), interfaceC3834k)) {
                r.h.remove(weakReference);
            }
        }
        if (r.h.isEmpty()) {
            Y9 y92 = this.f7275a;
            if (y92 != null) {
                ((Z9) y92).c("AdAudioTracker", "Stopping audio volume change listener");
            }
            r rVar = r.f7338a;
            Y9 y93 = this.f7275a;
            Context context = AbstractC3914mk.f7252a;
            if (context == null) {
                if (y93 != null) {
                    ((Z9) y93).b("AdAudioTracker", "Context is null. Cannot stop audio volume tracking");
                }
                r.a((Float) null);
            } else if (r.d.compareAndSet(true, false)) {
                if (y93 != null) {
                    ((Z9) y93).c("AdAudioTracker", "Stopping audio volume tracking");
                }
                r.a(context, y93);
            } else if (y93 != null) {
                ((Z9) y93).c("AdAudioTracker", "Audio volume tracking is already stopped");
            }
        }
        return Unit.INSTANCE;
    }
}
