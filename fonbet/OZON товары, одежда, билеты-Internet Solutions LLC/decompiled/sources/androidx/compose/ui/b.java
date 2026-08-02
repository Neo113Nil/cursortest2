package androidx.compose.ui;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC5245f1;
import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class b extends AbstractC5245f1 implements e.b {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<e, InterfaceC3967k, Integer, e> f40324b;

    public b(@NotNull InterfaceC6511n interfaceC6511n, @NotNull Function1 function1) {
        super(function1);
        this.f40324b = interfaceC6511n;
    }

    @NotNull
    public final InterfaceC6511n<e, InterfaceC3967k, Integer, e> a() {
        return this.f40324b;
    }
}
