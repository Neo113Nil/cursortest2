package com.startapp.sdk.internal;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class s5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f4323b;

    public s5(com.startapp.sdk.components.a aVar, Context context) {
        this.f4323b = aVar;
        this.f4322a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new zc(this.f4323b.f3338D, new File(this.f4322a.getCacheDir(), "StartApp-68962b1486d766d9"), new r5());
    }
}
