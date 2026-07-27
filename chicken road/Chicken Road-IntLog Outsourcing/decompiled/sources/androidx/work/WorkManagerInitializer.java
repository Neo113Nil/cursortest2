package androidx.work;

import android.content.Context;
import e0.b;
import java.util.Collections;
import java.util.List;
import l1.j;
import s0.C1414b;
import s0.s;
import t0.o;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4707a = s.f("WrkMgrInitializer");

    @Override // e0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // e0.b
    public final Object create(Context context) {
        s.d().a(f4707a, "Initializing WorkManager with default configuration.");
        o.b(context, new C1414b(new j(29)));
        return o.a(context);
    }
}
