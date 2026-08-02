package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.c;
import androidx.work.impl.C;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class WorkManagerInitializer implements R4.a<w> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f45241a = o.i("WrkMgrInitializer");

    @Override // R4.a
    @NonNull
    public final List<Class<? extends R4.a<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // R4.a
    @NonNull
    public final w create(@NonNull Context context) {
        o.e().a(f45241a, "Initializing WorkManager with default configuration.");
        C.q(context, new c(new c.a()));
        return C.i(context);
    }
}
