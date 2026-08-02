package androidx.compose.foundation.text.modifiers;

import B0.C2454a;
import B90.C2616s;
import D1.AbstractC2794c0;
import H0.l;
import K1.T;
import Kk.C3532b;
import P1.AbstractC3809p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7813c0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "LD1/c0;", "LH0/l;", "Ll1/c0;", "color", "Ll1/c0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends AbstractC2794c0<l> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f39832a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final T f39833b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC3809p.a f39834c;
    private final InterfaceC7813c0 color;

    /* renamed from: d, reason: collision with root package name */
    private final int f39835d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f39836e;

    /* renamed from: f, reason: collision with root package name */
    private final int f39837f;

    /* renamed from: g, reason: collision with root package name */
    private final int f39838g;

    public TextStringSimpleElement(String str, T t2, AbstractC3809p.a aVar, int i11, boolean z11, int i12, int i13, InterfaceC7813c0 interfaceC7813c0) {
        this.f39832a = str;
        this.f39833b = t2;
        this.f39834c = aVar;
        this.f39835d = i11;
        this.f39836e = z11;
        this.f39837f = i12;
        this.f39838g = i13;
        this.color = interfaceC7813c0;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final l getF41119a() {
        InterfaceC7813c0 interfaceC7813c0 = this.color;
        return new l(this.f39832a, this.f39833b, this.f39834c, this.f39835d, this.f39836e, this.f39837f, this.f39838g, interfaceC7813c0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        if (Intrinsics.d(this.color, textStringSimpleElement.color) && Intrinsics.d(this.f39832a, textStringSimpleElement.f39832a) && Intrinsics.d(this.f39833b, textStringSimpleElement.f39833b) && Intrinsics.d(this.f39834c, textStringSimpleElement.f39834c)) {
            return this.f39835d == textStringSimpleElement.f39835d && this.f39836e == textStringSimpleElement.f39836e && this.f39837f == textStringSimpleElement.f39837f && this.f39838g == textStringSimpleElement.f39838g;
        }
        return false;
    }

    public final int hashCode() {
        int a11 = (((C3532b.a(C2454a.a(this.f39835d, (this.f39834c.hashCode() + C2616s.a(this.f39832a.hashCode() * 31, 31, this.f39833b)) * 31, 31), 31, this.f39836e) + this.f39837f) * 31) + this.f39838g) * 31;
        InterfaceC7813c0 interfaceC7813c0 = this.color;
        return a11 + (interfaceC7813c0 != null ? interfaceC7813c0.hashCode() : 0);
    }

    @Override // D1.AbstractC2794c0
    public final void update(l lVar) {
        l lVar2 = lVar;
        lVar2.P1(lVar2.S1(this.color, this.f39833b), lVar2.U1(this.f39832a), lVar2.T1(this.f39833b, this.f39838g, this.f39837f, this.f39836e, this.f39834c, this.f39835d));
    }
}
