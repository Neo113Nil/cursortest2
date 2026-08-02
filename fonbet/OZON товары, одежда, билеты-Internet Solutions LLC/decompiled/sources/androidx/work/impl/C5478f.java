package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.work.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5478f extends K4.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5478f f45429a = new C5478f(12, 13);

    @Override // K4.a
    public final void migrate(@NotNull O4.b db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.O0("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db2.O0("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
