package Tg0;

import Sc.InterfaceC4008j;
import android.content.Intent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27174a;

    public e(@NotNull InterfaceC4008j<? extends Sg0.b> repositoryLazy) {
        Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
        this.f27174a = repositoryLazy;
    }

    @NotNull
    public final List<Intent> a(@NotNull String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        return ((Sg0.b) this.f27174a.getValue()).b(applicationId);
    }
}
