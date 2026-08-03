package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
public final class zab {
    public final java.util.Set zaa;

    public zab(java.util.Set set) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(set);
        this.zaa = java.util.Collections.unmodifiableSet(set);
    }
}
