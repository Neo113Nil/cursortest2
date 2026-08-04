package D6;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: D6.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0142z implements p065i6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6.i f1893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p065i6.h f1894b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0142z(p065i6.h hVar, Function1 function1) {
        t6.h.e(hVar, "baseKey");
        this.f1893a = (t6.i) function1;
        this.f1894b = hVar instanceof C0142z ? ((C0142z) hVar).f1894b : hVar;
    }
}
