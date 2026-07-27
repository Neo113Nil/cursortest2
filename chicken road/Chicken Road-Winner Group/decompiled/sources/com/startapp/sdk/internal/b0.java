package com.startapp.sdk.internal;

import android.view.View;

/* loaded from: classes.dex */
public final class b0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f3479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.adsbase.adinformation.a f3480b;

    public b0(com.startapp.sdk.adsbase.adinformation.a aVar, q qVar) {
        this.f3480b = aVar;
        this.f3479a = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q qVar = this.f3479a;
        com.startapp.sdk.adsbase.adinformation.a aVar = this.f3480b;
        qVar.a(aVar.f3151e, aVar.f);
    }
}
