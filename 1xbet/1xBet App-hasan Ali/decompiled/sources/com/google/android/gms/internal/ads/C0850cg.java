package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.cg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0850cg implements InterfaceC0699Uf {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13026a;

    /* renamed from: b, reason: collision with root package name */
    public final T2.I f13027b = P2.o.f4767B.f4774g.d();

    public C0850cg(Context context) {
        this.f13026a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0699Uf
    public final void a(HashMap hashMap) {
        String str;
        if (hashMap.isEmpty() || (str = (String) hashMap.get("gad_idless")) == null) {
            return;
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        this.f13027b.d(parseBoolean);
        if (parseBoolean) {
            G4.l.R(this.f13026a);
        }
    }
}
