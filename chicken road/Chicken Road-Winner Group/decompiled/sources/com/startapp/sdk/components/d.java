package com.startapp.sdk.components;

import android.content.Context;
import com.startapp.sdk.internal.i7;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3383b;

    public /* synthetic */ d(Context context, int i3) {
        this.f3382a = i3;
        this.f3383b = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        switch (this.f3382a) {
            case 0:
                return a.b(this.f3383b);
            default:
                return a.d(this.f3383b);
        }
    }
}
