package com.google.android.recaptcha.internal;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.InterfaceC1053e0;
import kotlinx.coroutines.InterfaceC1109s;
import kotlinx.coroutines.InterfaceC1113u;
import kotlinx.coroutines.InterfaceC1115v;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.coroutines.S;
import kotlinx.coroutines.selects.a;
import kotlinx.coroutines.selects.c;

/* loaded from: classes4.dex */
public final class zzbw implements S {
    private final /* synthetic */ InterfaceC1115v zza;

    public zzbw(InterfaceC1115v interfaceC1115v) {
        this.zza = interfaceC1115v;
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final InterfaceC1109s attachChild(InterfaceC1113u interfaceC1113u) {
        return this.zza.attachChild(interfaceC1113u);
    }

    @Override // kotlinx.coroutines.S
    public final Object await(Continuation continuation) {
        return this.zza.await(continuation);
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.zza.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.zza.get(key);
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final Sequence getChildren() {
        return this.zza.getChildren();
    }

    @Override // kotlinx.coroutines.S
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // kotlinx.coroutines.S
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return this.zza.getKey();
    }

    @Override // kotlinx.coroutines.S
    public final c getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final a getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final InterfaceC1120x0 getParent() {
        return this.zza.getParent();
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final InterfaceC1053e0 invokeOnCompletion(Function1 function1) {
        return this.zza.invokeOnCompletion(function1);
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final Object join(Continuation continuation) {
        return this.zza.join(continuation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.zza.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.zza.plus(coroutineContext);
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final boolean start() {
        return this.zza.start();
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    public final InterfaceC1053e0 invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        return this.zza.invokeOnCompletion(z, z2, function1);
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public final InterfaceC1120x0 plus(InterfaceC1120x0 interfaceC1120x0) {
        return this.zza.plus(interfaceC1120x0);
    }

    @Override // kotlinx.coroutines.InterfaceC1120x0
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }
}
