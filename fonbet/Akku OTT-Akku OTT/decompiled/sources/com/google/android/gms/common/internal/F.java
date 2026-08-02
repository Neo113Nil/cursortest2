package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.api.internal.InterfaceC0841o;
import com.google.android.gms.common.internal.AbstractC0861c;

/* loaded from: classes4.dex */
public final class F implements AbstractC0861c.b {
    public final /* synthetic */ InterfaceC0841o a;

    public F(InterfaceC0841o interfaceC0841o) {
        this.a = interfaceC0841o;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c.b
    public final void onConnectionFailed(@NonNull C0852b c0852b) {
        this.a.onConnectionFailed(c0852b);
    }
}
