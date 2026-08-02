package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes4.dex */
public final class B extends z {
    @Override // com.google.android.gms.cloudmessaging.z
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            String.valueOf(bundle2);
        }
        this.b.setResult(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.z
    public final boolean b() {
        return false;
    }
}
