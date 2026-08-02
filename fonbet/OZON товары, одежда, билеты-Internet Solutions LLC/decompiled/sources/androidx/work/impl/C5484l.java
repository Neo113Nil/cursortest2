package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.work.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5484l extends K4.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5484l f45461a = new C5484l(7, 8);

    @Override // K4.a
    public final void migrate(@NotNull O4.b db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.O0("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
