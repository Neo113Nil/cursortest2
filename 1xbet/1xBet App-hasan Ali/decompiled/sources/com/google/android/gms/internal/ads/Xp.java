package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class Xp implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12248b;

    public /* synthetic */ Xp(int i, Object obj) {
        this.f12247a = i;
        this.f12248b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj = this.f12248b;
        switch (this.f12247a) {
            case 0:
                String str = (String) ((Mw) obj).f10752k;
                Mw mw = Mw.f10750l;
                return new C1530rp(2, str, null);
            case 1:
                return new Xo(2, (ArrayList) ((Qo) obj).f11262c);
            default:
                ((Br) obj).mo20a();
                return null;
        }
    }

    public /* synthetic */ Xp(Mw mw) {
        this.f12247a = 0;
        Mw mw2 = Mw.f10750l;
        this.f12248b = mw;
    }
}
