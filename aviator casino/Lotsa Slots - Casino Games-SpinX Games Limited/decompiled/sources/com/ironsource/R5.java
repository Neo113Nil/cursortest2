package com.ironsource;

/* loaded from: classes5.dex */
public final class R5 implements com.ironsource.E7 {
    @Override // com.ironsource.E7
    public boolean a() {
        try {
            androidx.lifecycle.ProcessLifecycleOwner.INSTANCE.get();
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
