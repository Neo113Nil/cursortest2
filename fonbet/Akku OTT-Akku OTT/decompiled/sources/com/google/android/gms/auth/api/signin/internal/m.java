package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.common.api.internal.C0833g;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class m {
    public static final com.google.android.gms.common.logging.a a = new com.google.android.gms.common.logging.a("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        n.a(context).b();
        Set set = com.google.android.gms.common.api.h.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((com.google.android.gms.common.api.h) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C0833g.a();
    }
}
