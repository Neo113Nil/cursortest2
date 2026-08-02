package com.google.android.datatransport.runtime;

import android.content.Context;
import com.bbflight.background_downloader.C0670t0;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.scheduling.persistence.w;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e {
    public Context a;

    public final f a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        f fVar = new f();
        fVar.a = com.google.android.datatransport.runtime.dagger.internal.a.a(j.a.a);
        com.google.android.datatransport.runtime.dagger.internal.c cVar = new com.google.android.datatransport.runtime.dagger.internal.c(context);
        fVar.b = cVar;
        fVar.c = com.google.android.datatransport.runtime.dagger.internal.a.a(new com.google.android.datatransport.runtime.backends.l(cVar, new com.google.android.datatransport.runtime.backends.j(cVar)));
        com.google.android.datatransport.runtime.dagger.internal.c cVar2 = fVar.b;
        fVar.d = new w(cVar2);
        javax.inject.a<String> a = com.google.android.datatransport.runtime.dagger.internal.a.a(new com.google.android.datatransport.runtime.scheduling.persistence.f(cVar2));
        fVar.e = a;
        javax.inject.a<com.google.android.datatransport.runtime.scheduling.persistence.m> a2 = com.google.android.datatransport.runtime.dagger.internal.a.a(new com.google.android.datatransport.runtime.scheduling.persistence.n(fVar.d, a));
        fVar.f = a2;
        C0670t0 c0670t0 = new C0670t0();
        com.google.android.datatransport.runtime.dagger.internal.c cVar3 = fVar.b;
        com.google.android.datatransport.runtime.scheduling.f fVar2 = new com.google.android.datatransport.runtime.scheduling.f(cVar3, a2, c0670t0);
        javax.inject.a<Executor> aVar = fVar.a;
        javax.inject.a aVar2 = fVar.c;
        fVar.i = com.google.android.datatransport.runtime.dagger.internal.a.a(new r(new com.google.android.datatransport.runtime.scheduling.d(aVar, aVar2, fVar2, a2, a2), new com.google.android.datatransport.runtime.scheduling.jobscheduling.n(cVar3, aVar2, a2, fVar2, aVar, a2, a2), new com.google.android.datatransport.runtime.scheduling.jobscheduling.p(aVar, a2, fVar2, a2)));
        return fVar;
    }
}
