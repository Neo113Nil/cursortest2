package Kb0;

import androidx.lifecycle.AbstractC5405a;
import androidx.lifecycle.C5418g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class W0 extends AbstractC5405a {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f15584d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ X0 f15585e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f15586f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f15587g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f15588h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ String f15589i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Ib0.c f15590j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ String f15591k;

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X0 f15592b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(X0 x02) {
            super(0);
            this.f15592b = x02;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f15592b.f15595b = null;
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W0(M4.e eVar, boolean z11, X0 x02, String str, boolean z12, boolean z13, String str2, Ib0.c cVar, String str3) {
        super(eVar, null);
        this.f15584d = z11;
        this.f15585e = x02;
        this.f15586f = str;
        this.f15587g = z12;
        this.f15588h = z13;
        this.f15589i = str2;
        this.f15590j = cVar;
        this.f15591k = str3;
    }

    @Override // androidx.lifecycle.AbstractC5405a
    protected final <T extends androidx.lifecycle.w0> T b(String key, Class<T> modelClass, C5418g0 handle) {
        K k11;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        X0 x02 = this.f15585e;
        k11 = x02.f15594a;
        Bc0.a aVar = new Bc0.a(k11, this.f15586f, handle, this.f15587g, this.f15588h);
        x02.f15595b = aVar;
        Unit unit = Unit.f71690a;
        a aVar2 = new a(x02);
        return new Lc0.a(this.f15584d, aVar, this.f15589i, this.f15590j, this.f15591k, aVar2);
    }
}
