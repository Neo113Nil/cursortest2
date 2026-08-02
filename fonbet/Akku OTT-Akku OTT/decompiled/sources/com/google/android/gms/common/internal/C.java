package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC0837k;

/* loaded from: classes4.dex */
public final class C extends D {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ InterfaceC0837k b;

    public C(Intent intent, InterfaceC0837k interfaceC0837k) {
        this.a = intent;
        this.b = interfaceC0837k;
    }

    @Override // com.google.android.gms.common.internal.D
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
