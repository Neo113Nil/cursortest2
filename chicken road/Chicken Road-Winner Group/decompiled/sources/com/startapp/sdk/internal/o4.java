package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Pair;
import com.startapp.sdk.jobs.SchedulerService;

/* loaded from: classes.dex */
public final class o4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4128a;

    public o4(Context context) {
        this.f4128a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        Context context = this.f4128a;
        Pair pair = new Pair(new bb(context, SchedulerService.class), new yh(context));
        return new ab((yf) pair.first, (yf) pair.second);
    }
}
