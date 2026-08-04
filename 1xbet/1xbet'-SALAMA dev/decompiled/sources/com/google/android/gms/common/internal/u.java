package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC0791l;

/* JADX INFO: loaded from: classes.dex */
public final class u extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f11332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0791l f11333b;

    public u(Intent intent, InterfaceC0791l interfaceC0791l) {
        this.f11332a = intent;
        this.f11333b = interfaceC0791l;
    }

    @Override // com.google.android.gms.common.internal.v
    public final void a() {
        Intent intent = this.f11332a;
        if (intent != null) {
            this.f11333b.startActivityForResult(intent, 2);
        }
    }
}
