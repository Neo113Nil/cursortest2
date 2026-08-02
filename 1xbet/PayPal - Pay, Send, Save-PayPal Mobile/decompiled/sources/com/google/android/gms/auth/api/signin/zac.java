package com.google.android.gms.auth.api.signin;

/* loaded from: classes8.dex */
final class zac implements java.util.Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.gms.common.api.Scope) obj).getScopeUri().compareTo(((com.google.android.gms.common.api.Scope) obj2).getScopeUri());
    }

    zac() {
    }
}
