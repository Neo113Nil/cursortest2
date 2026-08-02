package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes4.dex */
public final class y extends z {
    @Override // com.google.android.gms.cloudmessaging.z
    public final void a(Bundle bundle) {
        if (!bundle.getBoolean("ack", false)) {
            c(new A("Invalid response to one way request", null));
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
        }
        this.b.setResult(null);
    }

    @Override // com.google.android.gms.cloudmessaging.z
    public final boolean b() {
        return true;
    }
}
