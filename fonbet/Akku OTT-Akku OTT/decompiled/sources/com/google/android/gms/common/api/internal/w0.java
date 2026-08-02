package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.common.zzh;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class w0 {
    public final Map a = Collections.synchronizedMap(new ArrayMap());
    public int b = 0;

    @Nullable
    public Bundle c;

    public final void a(String str, C0836j c0836j) {
        Map map = this.a;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(android.support.v4.media.b.b("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, c0836j);
        if (this.b > 0) {
            new zzh(Looper.getMainLooper()).post(new v0(this, c0836j, str));
        }
    }

    public final void b(@Nullable Bundle bundle) {
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.a.entrySet()) {
            ((C0836j) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((C0836j) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }
}
