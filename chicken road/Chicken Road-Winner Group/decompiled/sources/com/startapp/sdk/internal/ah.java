package com.startapp.sdk.internal;

import android.os.Handler;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ah implements ic {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f3463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh f3464b;

    public ah(Handler handler, eh ehVar) {
        this.f3463a = handler;
        this.f3464b = ehVar;
    }

    public static void a(eh ehVar) {
        if (gh.f3774v == 1) {
            gh.f3774v = 2;
        }
        ehVar.getClass();
        WeakHashMap weakHashMap = si.f4343a;
        ehVar.f3654d = true;
        boolean z3 = ehVar.f3655e;
        if (z3 && z3 && !ehVar.f3652b) {
            ehVar.f3652b = true;
            g0.a(ehVar.f3651a);
        }
    }

    public final void b() {
        this.f3463a.post(new G0.m(11, this.f3464b));
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z3) {
        b();
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a() {
        b();
    }
}
