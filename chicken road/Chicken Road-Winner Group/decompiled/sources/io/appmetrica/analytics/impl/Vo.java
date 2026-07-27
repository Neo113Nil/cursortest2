package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* loaded from: classes.dex */
public final /* synthetic */ class Vo implements S1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6767b;

    public /* synthetic */ Vo(int i3, Object obj) {
        this.f6766a = i3;
        this.f6767b = obj;
    }

    @Override // io.appmetrica.analytics.impl.S1
    public final void a(Intent intent) {
        switch (this.f6766a) {
            case 0:
                C0545hd.a((ModuleServiceLifecycleObserver) this.f6767b, intent);
                break;
            case 1:
                C0545hd.b((ModuleServiceLifecycleObserver) this.f6767b, intent);
                break;
            default:
                ((M1) this.f6767b).d(intent);
                break;
        }
    }
}
