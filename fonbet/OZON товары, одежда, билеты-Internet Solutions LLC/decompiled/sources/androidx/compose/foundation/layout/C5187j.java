package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.C5236c1;
import e1.InterfaceC6250b;
import org.jetbrains.annotations.NotNull;
import u0.InterfaceC9893b;

/* renamed from: androidx.compose.foundation.layout.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5187j implements InterfaceC9893b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5187j f39515a = new C5187j();

    @Override // u0.InterfaceC9893b
    @NotNull
    public final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull InterfaceC6250b interfaceC6250b) {
        return eVar.l0(new BoxChildDataElement(interfaceC6250b, false, C5236c1.a()));
    }

    @Override // u0.InterfaceC9893b
    @NotNull
    public final androidx.compose.ui.e b(@NotNull androidx.compose.ui.e eVar) {
        return eVar.l0(new BoxChildDataElement(InterfaceC6250b.a.e(), true, C5236c1.a()));
    }
}
