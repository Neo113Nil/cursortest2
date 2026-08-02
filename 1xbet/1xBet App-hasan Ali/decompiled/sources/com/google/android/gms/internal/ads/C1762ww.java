package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ww, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1762ww extends AbstractC0952et {
    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final void H(AbstractC1672uw abstractC1672uw, Set set) {
        synchronized (abstractC1672uw) {
            if (abstractC1672uw.f16351r == null) {
                abstractC1672uw.f16351r = set;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final int c(AbstractC1672uw abstractC1672uw) {
        int i;
        synchronized (abstractC1672uw) {
            i = abstractC1672uw.f16352s - 1;
            abstractC1672uw.f16352s = i;
        }
        return i;
    }
}
