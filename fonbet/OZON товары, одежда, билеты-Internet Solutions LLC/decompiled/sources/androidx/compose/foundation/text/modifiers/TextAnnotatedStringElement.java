package androidx.compose.foundation.text.modifiers;

import B0.C2454a;
import B90.C2616s;
import D1.AbstractC2794c0;
import K1.C3422b;
import K1.C3442w;
import K1.K;
import K1.T;
import Kk.C3532b;
import P1.AbstractC3809p;
import androidx.compose.foundation.text.modifiers.b;
import java.util.List;
import k1.C7460f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7813c0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "LD1/c0;", "Landroidx/compose/foundation/text/modifiers/b;", "Ll1/c0;", "color", "Ll1/c0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends AbstractC2794c0<b> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3422b f39821a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final T f39822b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC3809p.a f39823c;
    private final InterfaceC7813c0 color;

    /* renamed from: d, reason: collision with root package name */
    private final Function1<K, Unit> f39824d;

    /* renamed from: e, reason: collision with root package name */
    private final int f39825e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39826f;

    /* renamed from: g, reason: collision with root package name */
    private final int f39827g;

    /* renamed from: h, reason: collision with root package name */
    private final int f39828h;

    /* renamed from: i, reason: collision with root package name */
    private final List<C3422b.C0288b<C3442w>> f39829i;

    /* renamed from: j, reason: collision with root package name */
    private final Function1<List<C7460f>, Unit> f39830j;

    /* renamed from: k, reason: collision with root package name */
    private final Function1<b.a, Unit> f39831k;

    private TextAnnotatedStringElement() {
        throw null;
    }

    public TextAnnotatedStringElement(C3422b c3422b, T t2, AbstractC3809p.a aVar, Function1 function1, int i11, boolean z11, int i12, int i13, List list, Function1 function12, InterfaceC7813c0 interfaceC7813c0, Function1 function13) {
        this.f39821a = c3422b;
        this.f39822b = t2;
        this.f39823c = aVar;
        this.f39824d = function1;
        this.f39825e = i11;
        this.f39826f = z11;
        this.f39827g = i12;
        this.f39828h = i13;
        this.f39829i = list;
        this.f39830j = function12;
        this.color = interfaceC7813c0;
        this.f39831k = function13;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final b getF41119a() {
        InterfaceC7813c0 interfaceC7813c0 = this.color;
        return new b(this.f39821a, this.f39822b, this.f39823c, this.f39824d, this.f39825e, this.f39826f, this.f39827g, this.f39828h, this.f39829i, this.f39830j, null, interfaceC7813c0, this.f39831k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return Intrinsics.d(this.color, textAnnotatedStringElement.color) && Intrinsics.d(this.f39821a, textAnnotatedStringElement.f39821a) && Intrinsics.d(this.f39822b, textAnnotatedStringElement.f39822b) && Intrinsics.d(this.f39829i, textAnnotatedStringElement.f39829i) && Intrinsics.d(this.f39823c, textAnnotatedStringElement.f39823c) && this.f39824d == textAnnotatedStringElement.f39824d && this.f39831k == textAnnotatedStringElement.f39831k && this.f39825e == textAnnotatedStringElement.f39825e && this.f39826f == textAnnotatedStringElement.f39826f && this.f39827g == textAnnotatedStringElement.f39827g && this.f39828h == textAnnotatedStringElement.f39828h && this.f39830j == textAnnotatedStringElement.f39830j;
    }

    public final int hashCode() {
        int hashCode = (this.f39823c.hashCode() + C2616s.a(this.f39821a.hashCode() * 31, 31, this.f39822b)) * 31;
        Function1<K, Unit> function1 = this.f39824d;
        int a11 = (((C3532b.a(C2454a.a(this.f39825e, (hashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.f39826f) + this.f39827g) * 31) + this.f39828h) * 31;
        List<C3422b.C0288b<C3442w>> list = this.f39829i;
        int hashCode2 = (a11 + (list != null ? list.hashCode() : 0)) * 31;
        Function1<List<C7460f>, Unit> function12 = this.f39830j;
        int hashCode3 = (hashCode2 + (function12 != null ? function12.hashCode() : 0)) * 961;
        InterfaceC7813c0 interfaceC7813c0 = this.color;
        int hashCode4 = (hashCode3 + (interfaceC7813c0 != null ? interfaceC7813c0.hashCode() : 0)) * 31;
        Function1<b.a, Unit> function13 = this.f39831k;
        return hashCode4 + (function13 != null ? function13.hashCode() : 0);
    }

    @Override // D1.AbstractC2794c0
    public final void update(b bVar) {
        b bVar2 = bVar;
        bVar2.P1(bVar2.U1(this.color, this.f39822b), bVar2.W1(this.f39821a), bVar2.V1(this.f39822b, this.f39829i, this.f39828h, this.f39827g, this.f39826f, this.f39823c, this.f39825e), bVar2.T1(this.f39824d, this.f39830j, null, this.f39831k));
    }
}
