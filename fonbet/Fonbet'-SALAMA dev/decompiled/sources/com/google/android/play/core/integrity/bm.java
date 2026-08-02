package com.google.android.play.core.integrity;

import A3.A;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
abstract class bm extends A {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f11651f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f11651f = bnVar;
    }

    @Override // A3.A
    public final void a(Exception exc) {
        if (!(exc instanceof A3.f)) {
            super.a(exc);
        } else if (bn.k(this.f11651f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
