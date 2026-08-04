package com.google.android.recaptcha.internal;

import A1.x0;
import B6.b;
import D6.B;
import D6.C0120f0;
import D6.C0136t;
import D6.C0138v;
import D6.H;
import D6.InterfaceC0112b0;
import D6.InterfaceC0118e0;
import D6.InterfaceC0133p;
import D6.InterfaceC0135s;
import D6.O;
import D6.l0;
import D6.p0;
import D6.q0;
import D6.r;
import D6.r0;
import D6.s0;
import j6.a;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p065i6.g;
import p065i6.i;
import t6.h;
import t6.s;

/* JADX INFO: loaded from: classes.dex */
public final class zzar implements H {
    private final /* synthetic */ InterfaceC0135s zza;

    public zzar(InterfaceC0135s interfaceC0135s) {
        this.zza = interfaceC0135s;
    }

    @Override // D6.InterfaceC0118e0
    public final InterfaceC0133p attachChild(r rVar) {
        return ((s0) this.zza).attachChild(rVar);
    }

    @Override // D6.H
    public final Object await(d dVar) throws Throwable {
        Object objJ = ((C0136t) this.zza).j(dVar);
        a aVar = a.f14648a;
        return objJ;
    }

    @Override // D6.InterfaceC0118e0
    public final void cancel(CancellationException cancellationException) {
        ((s0) this.zza).cancel(cancellationException);
    }

    @Override // p065i6.i
    public final Object fold(Object obj, Function2 function2) {
        s0 s0Var = (s0) this.zza;
        s0Var.getClass();
        h.e(function2, "operation");
        return function2.invoke(obj, s0Var);
    }

    @Override // p065i6.i
    public final g get(p065i6.h hVar) {
        s0 s0Var = (s0) this.zza;
        s0Var.getClass();
        return p003a.a.W(s0Var, hVar);
    }

    @Override // D6.InterfaceC0118e0
    public final CancellationException getCancellationException() {
        return ((s0) this.zza).getCancellationException();
    }

    @Override // D6.InterfaceC0118e0
    public final b getChildren() {
        return ((s0) this.zza).getChildren();
    }

    @Override // D6.H
    public final Object getCompleted() {
        return ((C0136t) this.zza).s();
    }

    @Override // D6.H
    public final Throwable getCompletionExceptionOrNull() {
        return ((s0) this.zza).getCompletionExceptionOrNull();
    }

    @Override // p065i6.g
    public final p065i6.h getKey() {
        this.zza.getClass();
        return B.f1775b;
    }

    public final L6.b getOnAwait() {
        C0136t c0136t = (C0136t) this.zza;
        c0136t.getClass();
        s.a(3, p0.f1870z);
        s.a(3, q0.f1872z);
        return new p033e3.h(c0136t);
    }

    public final L6.a getOnJoin() {
        s0 s0Var = (s0) this.zza;
        s0Var.getClass();
        s.a(3, r0.f1873z);
        return new x0(s0Var, 6);
    }

    @Override // D6.InterfaceC0118e0
    public final InterfaceC0118e0 getParent() {
        return ((s0) this.zza).getParent();
    }

    @Override // D6.InterfaceC0118e0
    public final O invokeOnCompletion(boolean z4, boolean z7, Function1 function1) {
        return ((s0) this.zza).invokeOnCompletion(z4, z7, function1);
    }

    @Override // D6.InterfaceC0118e0
    public final boolean isActive() {
        return ((s0) this.zza).isActive();
    }

    public final boolean isCancelled() {
        Object objX = ((s0) this.zza).x();
        return (objX instanceof C0138v) || ((objX instanceof l0) && ((l0) objX).d());
    }

    public final boolean isCompleted() {
        return !(((s0) this.zza).x() instanceof InterfaceC0112b0);
    }

    @Override // D6.InterfaceC0118e0
    public final Object join(d dVar) {
        return ((s0) this.zza).join(dVar);
    }

    @Override // p065i6.i
    public final i minusKey(p065i6.h hVar) {
        s0 s0Var = (s0) this.zza;
        s0Var.getClass();
        return p003a.a.e0(s0Var, hVar);
    }

    public final InterfaceC0118e0 plus(InterfaceC0118e0 interfaceC0118e0) {
        ((s0) this.zza).getClass();
        return interfaceC0118e0;
    }

    @Override // D6.InterfaceC0118e0
    public final boolean start() {
        return ((s0) this.zza).start();
    }

    public final /* synthetic */ boolean cancel(Throwable th) {
        s0 s0Var = (s0) this.zza;
        s0Var.getClass();
        s0Var.l(th != null ? s0.M(s0Var, th) : new C0120f0(s0Var.n(), null, s0Var));
        return true;
    }

    @Override // D6.InterfaceC0118e0
    public final O invokeOnCompletion(Function1 function1) {
        return ((s0) this.zza).invokeOnCompletion(false, true, function1);
    }

    @Override // p065i6.i
    public final i plus(i iVar) {
        s0 s0Var = (s0) this.zza;
        s0Var.getClass();
        return p003a.a.m0(s0Var, iVar);
    }

    public final /* synthetic */ void cancel() {
        ((s0) this.zza).cancel(null);
    }
}
