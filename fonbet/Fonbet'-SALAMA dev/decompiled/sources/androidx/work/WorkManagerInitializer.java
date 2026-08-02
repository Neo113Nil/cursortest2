package androidx.work;

import L0.b;
import M4.e;
import android.content.Context;
import d1.C0949b;
import d1.n;
import e1.l;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9858a = n.g("WrkMgrInitializer");

    @Override // L0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // L0.b
    public final Object b(Context context) {
        n.d().b(f9858a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        l.n0(context, new C0949b(new e()));
        return l.m0(context);
    }
}
