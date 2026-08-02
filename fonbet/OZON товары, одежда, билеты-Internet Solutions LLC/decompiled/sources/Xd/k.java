package Xd;

import je.N;
import je.Y;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9856v;
import td.InterfaceC9815F;
import td.InterfaceC9839e;

/* loaded from: classes.dex */
public final class k extends g<Pair<? extends Sd.b, ? extends Sd.f>> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Sd.b f34403b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Sd.f f34404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull Sd.b enumClassId, @NotNull Sd.f enumEntryName) {
        super(new Pair(enumClassId, enumEntryName));
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        this.f34403b = enumClassId;
        this.f34404c = enumEntryName;
    }

    @Override // Xd.g
    @NotNull
    public final N a(@NotNull InterfaceC9815F module) {
        Y q11;
        Intrinsics.checkNotNullParameter(module, "module");
        Sd.b bVar = this.f34403b;
        InterfaceC9839e a11 = C9856v.a(module, bVar);
        if (a11 != null) {
            if (!Vd.i.u(a11)) {
                a11 = null;
            }
            if (a11 != null && (q11 = a11.q()) != null) {
                return q11;
            }
        }
        return le.l.c(le.k.ERROR_ENUM_TYPE, bVar.toString(), this.f34404c.toString());
    }

    @NotNull
    public final Sd.f c() {
        return this.f34404c;
    }

    @Override // Xd.g
    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34403b.h());
        sb2.append('.');
        sb2.append(this.f34404c);
        return sb2.toString();
    }
}
