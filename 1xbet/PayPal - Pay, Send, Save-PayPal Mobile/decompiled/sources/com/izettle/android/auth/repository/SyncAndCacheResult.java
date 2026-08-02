package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/izettle/android/auth/repository/SyncAndCacheResult;", "Lcom/izettle/android/auth/repository/GetStrategy;", "", "forceSync", "<init>", "(Z)V", "Z", "getForceSync", "()Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SyncAndCacheResult implements com.izettle.android.auth.repository.GetStrategy {
    private final boolean forceSync;

    public SyncAndCacheResult(boolean z) {
        this.forceSync = z;
    }

    public final boolean getForceSync() {
        return this.forceSync;
    }
}
