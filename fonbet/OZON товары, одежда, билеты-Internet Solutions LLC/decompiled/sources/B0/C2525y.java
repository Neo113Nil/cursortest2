package B0;

import Bl0.C2652m;
import K1.C3422b;
import P1.AbstractC3809p;
import S0.InterfaceC3967k;
import androidx.compose.foundation.text.modifiers.b;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7813c0;

/* renamed from: B0.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2525y extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f2003b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3422b f2004c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<K1.K, Unit> f2005d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f2006e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Map<String, E0> f2007f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ K1.T f2008g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f2009h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f2010i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f2011j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f2012k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ AbstractC3809p.a f2013l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ H0.h f2014m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ InterfaceC7813c0 f2015n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function1<b.a, Unit> f2016o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ int f2017p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ int f2018q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2525y(androidx.compose.ui.e eVar, C3422b c3422b, Function1 function1, boolean z11, Map map, K1.T t2, int i11, boolean z12, int i12, int i13, AbstractC3809p.a aVar, H0.h hVar, InterfaceC7813c0 interfaceC7813c0, Function1 function12, int i14, int i15) {
        super(2);
        this.f2003b = eVar;
        this.f2004c = c3422b;
        this.f2005d = function1;
        this.f2006e = z11;
        this.f2007f = map;
        this.f2008g = t2;
        this.f2009h = i11;
        this.f2010i = z12;
        this.f2011j = i12;
        this.f2012k = i13;
        this.f2013l = aVar;
        this.f2014m = hVar;
        this.f2015n = interfaceC7813c0;
        this.f2016o = function12;
        this.f2017p = i14;
        this.f2018q = i15;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f2017p | 1);
        int e12 = C2652m.e(this.f2018q);
        AbstractC3809p.a aVar = this.f2013l;
        H0.h hVar = this.f2014m;
        C2510t.c(this.f2003b, this.f2004c, this.f2005d, this.f2006e, this.f2007f, this.f2008g, this.f2009h, this.f2010i, this.f2011j, this.f2012k, aVar, hVar, this.f2015n, this.f2016o, interfaceC3967k, e11, e12);
        return Unit.f71690a;
    }
}
