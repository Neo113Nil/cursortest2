package Eb;

import Zl0.r;
import android.os.Binder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qb.C9017a;

/* loaded from: classes9.dex */
public final class a {
    @NotNull
    public static final C9017a a(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return new C9017a(Binder.getCallingUid(), Binder.getCallingPid());
    }
}
