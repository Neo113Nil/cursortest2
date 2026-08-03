package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
final class zac implements java.util.Comparator {
    zac() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.gms.common.api.Scope) obj).getScopeUri().compareTo(((com.google.android.gms.common.api.Scope) obj2).getScopeUri());
    }
}
