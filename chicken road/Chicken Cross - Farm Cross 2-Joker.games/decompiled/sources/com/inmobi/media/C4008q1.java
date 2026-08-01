package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* renamed from: com.inmobi.media.q1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4008q1 implements InterfaceC3620c9 {

    /* renamed from: a, reason: collision with root package name */
    public final C4036r1 f7316a;
    public final Context b;
    public final Z9 c;
    public final C3639d0 d;
    public final CoroutineScope e;
    public final C3922n0 f;

    public C4008q1(Context context, Gd gd, C4036r1 adManagerContext) {
        Intrinsics.checkNotNullParameter(adManagerContext, "adManagerContext");
        this.f7316a = adManagerContext;
        C3980p1 c3980p1 = new C3980p1(CoroutineExceptionHandler.INSTANCE, this);
        this.b = context;
        this.c = gd.f6582a;
        C3639d0 c3639d0 = new C3639d0();
        this.d = c3639d0;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(c3980p1));
        this.e = CoroutineScope;
        this.f = new C3922n0(CoroutineScope, adManagerContext, c3639d0);
    }

    @Override // com.inmobi.media.InterfaceC3620c9
    public final CoroutineScope a() {
        return this.e;
    }

    @Override // com.inmobi.media.InterfaceC3620c9
    public final C3922n0 b() {
        return this.f;
    }

    @Override // com.inmobi.media.InterfaceC3620c9
    public final Y9 c() {
        return this.c;
    }
}
