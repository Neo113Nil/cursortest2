package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0875q;
import java.util.Set;

/* loaded from: classes4.dex */
public final class ScopeUtil {
    private ScopeUtil() {
    }

    @NonNull
    public static String[] toScopeString(@NonNull Set<Scope> set) {
        C0875q.h(set, "scopes can't be null.");
        Scope[] scopeArr = (Scope[]) set.toArray(new Scope[set.size()]);
        C0875q.h(scopeArr, "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i = 0; i < scopeArr.length; i++) {
            strArr[i] = scopeArr[i].b;
        }
        return strArr;
    }
}
