package Kd;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10025c;

/* renamed from: Kd.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3508e implements InterfaceC10025c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3508e f15888a = new C3508e();

    @Override // ud.InterfaceC10025c
    @NotNull
    public final Map<Sd.f, Xd.g<?>> b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // ud.InterfaceC10025c
    public final Sd.c c() {
        return InterfaceC10025c.a.a(this);
    }

    @Override // ud.InterfaceC10025c
    @NotNull
    public final td.d0 e() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // ud.InterfaceC10025c
    @NotNull
    public final je.N getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @NotNull
    public final String toString() {
        return "[EnhancedType]";
    }
}
