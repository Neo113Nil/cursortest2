package t6;

import D6.D;
import io.sentry.android.replay.capture.BaseCaptureStrategy;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends m implements A6.c, A6.d {
    public j(String str, String str2) {
        super(a.f16460a, BaseCaptureStrategy.class, str, str2, 0);
    }

    @Override // A6.c
    public final void a() {
        if (this.f16475x) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        A6.a aVarD = d();
        if (aVarD == this) {
            throw new D("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((j) ((A6.d) aVarD)).a();
    }

    @Override // t6.b
    public final A6.a b() {
        q.f16479a.getClass();
        return this;
    }

    @Override // A6.c
    public final Object get(Object obj) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a();
        throw null;
    }
}
