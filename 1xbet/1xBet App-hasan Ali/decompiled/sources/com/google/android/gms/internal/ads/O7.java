package com.google.android.gms.internal.ads;

import android.os.Bundle;
import q.AbstractC2286a;

/* loaded from: classes.dex */
public final class O7 extends AbstractC2286a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P7 f10934a;

    public O7(P7 p7) {
        this.f10934a = p7;
    }

    @Override // q.AbstractC2286a
    public final void e(int i, Bundle bundle) {
        P7 p7 = this.f10934a;
        p7.getClass();
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8904t4)).booleanValue() || p7.f11068d == null) {
            return;
        }
        AbstractC0613Id.f9539a.execute(new RunnableC0920e5(i, 1, p7));
    }
}
