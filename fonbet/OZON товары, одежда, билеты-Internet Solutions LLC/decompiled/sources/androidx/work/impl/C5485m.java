package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.work.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5485m extends K4.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5485m f45462a = new C5485m(8, 9);

    @Override // K4.a
    public final void migrate(@NotNull O4.b db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.O0("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
