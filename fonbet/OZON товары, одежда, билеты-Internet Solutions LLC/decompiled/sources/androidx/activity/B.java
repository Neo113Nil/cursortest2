package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Executor f36912a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f36913b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f36914c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36915d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f36916e;

    public B(@NotNull Executor executor, @NotNull Function0<Unit> reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f36912a = executor;
        this.f36913b = reportFullyDrawn;
        this.f36914c = new Object();
        this.f36916e = new ArrayList();
    }

    public final void a() {
        synchronized (this.f36914c) {
            try {
                this.f36915d = true;
                Iterator it = this.f36916e.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f36916e.clear();
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z11;
        synchronized (this.f36914c) {
            z11 = this.f36915d;
        }
        return z11;
    }
}
