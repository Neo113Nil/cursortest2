package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.work.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5477e extends K4.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5477e f45428a = new C5477e(11, 12);

    @Override // K4.a
    public final void migrate(@NotNull O4.b db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.O0("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
