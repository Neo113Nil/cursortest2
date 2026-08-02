package androidx.compose.foundation.text.modifiers;

import B0.C2454a;
import B90.C2616s;
import D1.AbstractC2794c0;
import H0.h;
import K1.C3422b;
import K1.C3442w;
import K1.K;
import K1.T;
import Kk.C3532b;
import P1.AbstractC3809p;
import V1.r;
import java.util.List;
import k1.C7460f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7813c0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "LD1/c0;", "Landroidx/compose/foundation/text/modifiers/a;", "Ll1/c0;", "color", "Ll1/c0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SelectableTextAnnotatedStringElement extends AbstractC2794c0<a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3422b f39810a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final T f39811b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC3809p.a f39812c;
    private final InterfaceC7813c0 color;

    /* renamed from: d, reason: collision with root package name */
    private final Function1<K, Unit> f39813d;

    /* renamed from: e, reason: collision with root package name */
    private final int f39814e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39815f;

    /* renamed from: g, reason: collision with root package name */
    private final int f39816g;

    /* renamed from: h, reason: collision with root package name */
    private final int f39817h;

    /* renamed from: i, reason: collision with root package name */
    private final List<C3422b.C0288b<C3442w>> f39818i;

    /* renamed from: j, reason: collision with root package name */
    private final Function1<List<C7460f>, Unit> f39819j;

    /* renamed from: k, reason: collision with root package name */
    private final h f39820k;

    private SelectableTextAnnotatedStringElement() {
        throw null;
    }

    public SelectableTextAnnotatedStringElement(int i11, int i12, int i13, h hVar, C3422b c3422b, T t2, AbstractC3809p.a aVar, List list, Function1 function1, Function1 function12, InterfaceC7813c0 interfaceC7813c0, boolean z11) {
        this.f39810a = c3422b;
        this.f39811b = t2;
        this.f39812c = aVar;
        this.f39813d = function1;
        this.f39814e = i11;
        this.f39815f = z11;
        this.f39816g = i12;
        this.f39817h = i13;
        this.f39818i = list;
        this.f39819j = function12;
        this.f39820k = hVar;
        this.color = interfaceC7813c0;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final a getF41119a() {
        InterfaceC7813c0 interfaceC7813c0 = this.color;
        List<C3422b.C0288b<C3442w>> list = this.f39818i;
        Function1<List<C7460f>, Unit> function1 = this.f39819j;
        C3422b c3422b = this.f39810a;
        T t2 = this.f39811b;
        AbstractC3809p.a aVar = this.f39812c;
        Function1<K, Unit> function12 = this.f39813d;
        return new a(this.f39814e, this.f39816g, this.f39817h, this.f39820k, c3422b, t2, aVar, list, function12, function1, interfaceC7813c0, this.f39815f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        if (Intrinsics.d(this.color, selectableTextAnnotatedStringElement.color) && Intrinsics.d(this.f39810a, selectableTextAnnotatedStringElement.f39810a) && Intrinsics.d(this.f39811b, selectableTextAnnotatedStringElement.f39811b) && Intrinsics.d(this.f39818i, selectableTextAnnotatedStringElement.f39818i) && Intrinsics.d(this.f39812c, selectableTextAnnotatedStringElement.f39812c) && this.f39813d == selectableTextAnnotatedStringElement.f39813d) {
            return this.f39814e == selectableTextAnnotatedStringElement.f39814e && this.f39815f == selectableTextAnnotatedStringElement.f39815f && this.f39816g == selectableTextAnnotatedStringElement.f39816g && this.f39817h == selectableTextAnnotatedStringElement.f39817h && this.f39819j == selectableTextAnnotatedStringElement.f39819j && Intrinsics.d(this.f39820k, selectableTextAnnotatedStringElement.f39820k);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f39812c.hashCode() + C2616s.a(this.f39810a.hashCode() * 31, 31, this.f39811b)) * 31;
        Function1<K, Unit> function1 = this.f39813d;
        int a11 = (((C3532b.a(C2454a.a(this.f39814e, (hashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.f39815f) + this.f39816g) * 31) + this.f39817h) * 31;
        List<C3422b.C0288b<C3442w>> list = this.f39818i;
        int hashCode2 = (a11 + (list != null ? list.hashCode() : 0)) * 31;
        Function1<List<C7460f>, Unit> function12 = this.f39819j;
        int hashCode3 = (hashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31;
        h hVar = this.f39820k;
        int hashCode4 = (hashCode3 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        InterfaceC7813c0 interfaceC7813c0 = this.color;
        return hashCode4 + (interfaceC7813c0 != null ? interfaceC7813c0.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.f39810a) + ", style=" + this.f39811b + ", fontFamilyResolver=" + this.f39812c + ", onTextLayout=" + this.f39813d + ", overflow=" + ((Object) r.a(this.f39814e)) + ", softWrap=" + this.f39815f + ", maxLines=" + this.f39816g + ", minLines=" + this.f39817h + ", placeholders=" + this.f39818i + ", onPlaceholderLayout=" + this.f39819j + ", selectionController=" + this.f39820k + ", color=" + this.color + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(a aVar) {
        InterfaceC7813c0 interfaceC7813c0 = this.color;
        int i11 = this.f39814e;
        h hVar = this.f39820k;
        C3422b c3422b = this.f39810a;
        T t2 = this.f39811b;
        List<C3422b.C0288b<C3442w>> list = this.f39818i;
        aVar.N1(this.f39817h, this.f39816g, i11, hVar, c3422b, t2, this.f39812c, list, this.f39813d, this.f39819j, interfaceC7813c0, this.f39815f);
    }
}
