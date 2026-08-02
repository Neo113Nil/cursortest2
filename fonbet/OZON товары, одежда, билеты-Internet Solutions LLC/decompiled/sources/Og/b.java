package Og;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f20369a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20370b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f20371c;

    public b(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("com.vk.id.tracking.tracer", "libraryPackageName");
        this.f20369a = context;
        this.f20370b = i11;
        this.f20371c = k.b(new a(this));
    }

    @NotNull
    public final yg.b c() {
        return (yg.b) this.f20371c.getValue();
    }
}
