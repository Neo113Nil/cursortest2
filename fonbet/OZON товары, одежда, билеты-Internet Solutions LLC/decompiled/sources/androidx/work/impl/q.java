package androidx.work.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q extends K4.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f45484a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@NotNull Context mContext, int i11, int i12) {
        super(i11, i12);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f45484a = mContext;
    }

    @Override // K4.a
    public final void migrate(@NotNull O4.b db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        if (this.endVersion >= 10) {
            db2.H1(new Object[]{"reschedule_needed", 1});
        } else {
            this.f45484a.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
