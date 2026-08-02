package Qi0;

import G.g;
import I0.C3173b;
import Kk.C3532b;
import Q1.C3853w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23480a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f23481b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23482c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f23483d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f23484e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23485f;

    private b() {
        throw null;
    }

    public b(int i11, String label, String data, String locator, Function1 onDataChanged, boolean z11) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onDataChanged, "onDataChanged");
        Intrinsics.checkNotNullParameter(locator, "locator");
        this.f23480a = label;
        this.f23481b = data;
        this.f23482c = z11;
        this.f23483d = onDataChanged;
        this.f23484e = locator;
        this.f23485f = i11;
    }

    public static b a(b bVar, String data, boolean z11) {
        String label = bVar.f23480a;
        Function1<String, Unit> onDataChanged = bVar.f23483d;
        String locator = bVar.f23484e;
        int i11 = bVar.f23485f;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onDataChanged, "onDataChanged");
        Intrinsics.checkNotNullParameter(locator, "locator");
        return new b(i11, label, data, locator, onDataChanged, z11);
    }

    @NotNull
    public final String b() {
        return this.f23481b;
    }

    public final int c() {
        return this.f23485f;
    }

    @NotNull
    public final String d() {
        return this.f23480a;
    }

    @NotNull
    public final String e() {
        return this.f23484e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f23480a, bVar.f23480a) && Intrinsics.d(this.f23481b, bVar.f23481b) && this.f23482c == bVar.f23482c && Intrinsics.d(this.f23483d, bVar.f23483d) && Intrinsics.d(this.f23484e, bVar.f23484e) && this.f23485f == bVar.f23485f;
    }

    @NotNull
    public final Function1<String, Unit> f() {
        return this.f23483d;
    }

    public final boolean g() {
        return this.f23482c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23485f) + g.a((this.f23483d.hashCode() + C3532b.a(g.a(this.f23480a.hashCode() * 31, 31, this.f23481b), 31, this.f23482c)) * 31, 31, this.f23484e);
    }

    @NotNull
    public final String toString() {
        String b11 = C3853w.b(this.f23485f);
        StringBuilder sb2 = new StringBuilder("FieldInputVO(label=");
        sb2.append(this.f23480a);
        sb2.append(", data=");
        sb2.append(this.f23481b);
        sb2.append(", isValid=");
        sb2.append(this.f23482c);
        sb2.append(", onDataChanged=");
        sb2.append(this.f23483d);
        sb2.append(", locator=");
        return C3173b.c(sb2, this.f23484e, ", keyboardType=", b11, ")");
    }
}
