package com.ironsource;

import androidx.lifecycle.ProcessLifecycleOwner;

/* loaded from: classes6.dex */
public final class Q5 implements B7 {
    @Override // com.ironsource.B7
    public boolean a() {
        try {
            ProcessLifecycleOwner.INSTANCE.get();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
