package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.work.impl.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5481i extends K4.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5481i f45458a = new C5481i(3, 4);

    @Override // K4.a
    public final void migrate(@NotNull O4.b db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.O0("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
