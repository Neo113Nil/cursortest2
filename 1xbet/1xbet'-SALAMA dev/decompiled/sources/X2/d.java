package X2;

import android.os.Bundle;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.D;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f7471b = new d(new Bundle());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f7472a;

    public /* synthetic */ d(Bundle bundle) {
        this.f7472a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        Bundle bundle = ((d) obj).f7472a;
        Bundle bundle2 = this.f7472a;
        if (bundle2 == null || bundle == null) {
            if (bundle2 == bundle) {
                return true;
            }
        } else if (bundle2.size() == bundle.size()) {
            Set<String> setKeySet = bundle2.keySet();
            if (setKeySet.containsAll(bundle.keySet())) {
                for (String str : setKeySet) {
                    if (!D.m(bundle2.get(str), bundle.get(str))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7472a});
    }
}
