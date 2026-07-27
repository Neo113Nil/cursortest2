package com.inmobi.media;

import android.R;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes6.dex */
public final class Xe extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3597bf f6949a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xe(C3597bf c3597bf, Continuation continuation) {
        super(2, continuation);
        this.f6949a = c3597bf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Xe(this.f6949a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Xe(this.f6949a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C3597bf c3597bf = this.f6949a;
        c3597bf.getClass();
        c3597bf.f7028a.addView(c3597bf.g, new RelativeLayout.LayoutParams(-1, -1));
        C3597bf c3597bf2 = this.f6949a;
        boolean z = c3597bf2.d.d.f7133a;
        c3597bf2.i = z;
        if (z) {
            c3597bf2.a(c3597bf2.j, c3597bf2.k);
        } else {
            c3597bf2.a(c3597bf2.k, c3597bf2.j);
        }
        C4004pp c4004pp = this.f6949a.l;
        if (c4004pp.c.f6952a) {
            float b = AbstractC3841k6.b();
            ProgressBar progressBar = new ProgressBar(c4004pp.b.getContext(), null, R.attr.progressBarStyleHorizontal);
            c4004pp.e = progressBar;
            AbstractC3673e7.a(progressBar, c4004pp.c, b);
            c4004pp.b.addView(c4004pp.e);
            BuildersKt__Builders_commonKt.launch$default(c4004pp.f7314a, Dispatchers.getMain(), null, new C3947np(c4004pp.d, null, c4004pp), 2, null);
        }
        return Unit.INSTANCE;
    }
}
