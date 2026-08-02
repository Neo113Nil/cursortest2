package com.google.android.gms.common.util;

/* loaded from: classes8.dex */
public final class ScopeUtil {
    public static java.lang.String[] toScopeString(java.util.Set<com.google.android.gms.common.api.Scope> set) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(set, "scopes can't be null.");
        com.google.android.gms.common.api.Scope[] scopeArr = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[set.size()]);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(scopeArr, "scopes can't be null.");
        java.lang.String[] strArr = new java.lang.String[scopeArr.length];
        for (int i = 0; i < scopeArr.length; i++) {
            strArr[i] = scopeArr[i].getScopeUri();
        }
        return strArr;
    }

    private ScopeUtil() {
    }
}
