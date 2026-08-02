package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes4.dex */
public final class B extends D {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ GoogleApiActivity b;

    public B(Intent intent, GoogleApiActivity googleApiActivity) {
        this.a = intent;
        this.b = googleApiActivity;
    }

    @Override // com.google.android.gms.common.internal.D
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
