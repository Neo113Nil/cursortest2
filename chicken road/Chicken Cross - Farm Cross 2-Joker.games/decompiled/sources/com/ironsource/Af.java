package com.ironsource;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes6.dex */
public final class Af implements Y3 {

    /* renamed from: a, reason: collision with root package name */
    private Activity f7556a;
    private Context b;

    @Override // com.ironsource.Y3
    public Activity a() {
        return this.f7556a;
    }

    @Override // com.ironsource.Y3
    public Context b() {
        return this.b;
    }

    @Override // com.ironsource.Y3
    public void a(Activity activity) {
        this.f7556a = activity;
    }

    @Override // com.ironsource.Y3
    public void a(Context context) {
        this.b = context;
    }
}
