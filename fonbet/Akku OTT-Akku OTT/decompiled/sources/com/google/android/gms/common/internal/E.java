package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.InterfaceC0832f;
import com.google.android.gms.common.internal.AbstractC0861c;

/* loaded from: classes4.dex */
public final class E implements AbstractC0861c.a {
    public final /* synthetic */ InterfaceC0832f a;

    public E(InterfaceC0832f interfaceC0832f) {
        this.a = interfaceC0832f;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c.a
    public final void onConnected(@Nullable Bundle bundle) {
        this.a.onConnected();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c.a
    public final void onConnectionSuspended(int i) {
        this.a.onConnectionSuspended(i);
    }
}
