package com.google.android.gms.auth.api;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C0874p;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes4.dex */
public final class c implements a.d {

    @NonNull
    public static final c b = new c(new Bundle());
    public final Bundle a;

    public /* synthetic */ c(Bundle bundle) {
        this.a = bundle;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        Bundle bundle = ((c) obj).a;
        Bundle bundle2 = this.a;
        if (bundle2 == null || bundle == null) {
            return bundle2 == bundle;
        }
        if (bundle2.size() == bundle.size()) {
            Set<String> keySet = bundle2.keySet();
            if (keySet.containsAll(bundle.keySet())) {
                for (String str : keySet) {
                    if (!C0874p.a(bundle2.get(str), bundle.get(str))) {
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
