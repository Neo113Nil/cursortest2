package androidx.work.impl;

import J4.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.work.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5474b extends s.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5474b f45361a = new C5474b();

    @Override // J4.s.b
    public final void b(@NotNull O4.b db2) {
        long j11;
        Intrinsics.checkNotNullParameter(db2, "db");
        super.b(db2);
        db2.A();
        try {
            StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            long currentTimeMillis = System.currentTimeMillis();
            j11 = x.f45538a;
            sb2.append(currentTimeMillis - j11);
            sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db2.O0(sb2.toString());
            db2.f1();
        } finally {
            db2.i1();
        }
    }
}
