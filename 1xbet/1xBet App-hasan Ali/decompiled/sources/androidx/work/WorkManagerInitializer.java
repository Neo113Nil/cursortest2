package androidx.work;

import Q1.j;
import Z1.b;
import android.content.Context;
import f2.C1944b;
import f2.m;
import g2.l;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7088a = m.f("WrkMgrInitializer");

    @Override // Z1.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // Z1.b
    public final Object b(Context context) {
        m.d().a(f7088a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        l.R(context, new C1944b(new j(27)));
        return l.Q(context);
    }
}
