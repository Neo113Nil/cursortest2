package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.qd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4608qd implements InterfaceC4625rd, G {

    /* renamed from: a, reason: collision with root package name */
    private final String f8492a;
    private final List<String> b;
    private final int c;
    private final InterfaceC4733xd d;
    private final T0 e;
    private boolean f;
    private Function1<? super Boolean, Unit> g;
    private List<C4422g6> h;
    private int i;
    private int j;
    private Integer k;
    private boolean l;

    public C4608qd(String adUnitId, List<String> instanceNames, int i, InterfaceC4733xd fetcher, T0 adUnitTools) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(instanceNames, "instanceNames");
        Intrinsics.checkNotNullParameter(fetcher, "fetcher");
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        this.f8492a = adUnitId;
        this.b = instanceNames;
        this.c = i;
        this.d = fetcher;
        this.e = adUnitTools;
        this.f = true;
        this.h = CollectionsKt.emptyList();
    }

    private final void d() {
        if (this.i >= this.h.size()) {
            return;
        }
        this.j++;
        C4422g6 c4422g6 = this.h.get(this.i);
        this.i++;
        c4422g6.a(this);
    }

    @Override // com.ironsource.InterfaceC4625rd
    public boolean a() {
        return this.f;
    }

    @Override // com.ironsource.InterfaceC4625rd
    public String b() {
        return this.f8492a;
    }

    @Override // com.ironsource.InterfaceC4625rd
    public C4422g6 c() {
        Integer num = this.k;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (this.l) {
            return null;
        }
        this.l = true;
        return this.h.get(intValue);
    }

    private final void b(boolean z) {
        if (this.j > 0) {
            return;
        }
        if (!z) {
            this.e.f().e().a();
        }
        Function1<? super Boolean, Unit> function1 = this.g;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        this.g = null;
    }

    @Override // com.ironsource.InterfaceC4625rd
    public void a(Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.e.f().e().b();
        this.f = false;
        this.g = callback;
        List<C4422g6> a2 = this.d.a(this.b);
        if (a2.isEmpty()) {
            b(false);
            return;
        }
        this.h = a2;
        int min = Math.min(this.c, a2.size());
        for (int i = 0; i < min; i++) {
            d();
        }
    }

    @Override // com.ironsource.G
    public void b(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        int a2 = a(instance);
        if (a2 == -1) {
            instance.c();
            IronLog.INTERNAL.warning("stale load success callback for adUnitId: " + b());
            return;
        }
        this.j--;
        if (this.l) {
            instance.c();
        } else {
            a(a2);
        }
        b(true);
    }

    @Override // com.ironsource.InterfaceC4625rd
    public void a(boolean z) {
        if (!this.l) {
            IronLog.INTERNAL.warning("reset before getting instance for adUnitId: " + b());
            return;
        }
        this.l = false;
        this.i = 0;
        this.j = 0;
        this.g = null;
        this.f = z;
        if (z) {
            this.h = CollectionsKt.emptyList();
            this.k = null;
        }
    }

    private final void a(int i) {
        Integer num = this.k;
        if (num == null) {
            this.e.f().e().c();
            this.k = Integer.valueOf(i);
        } else {
            int min = Math.min(i, num.intValue());
            this.h.get(Math.max(i, num.intValue())).c();
            this.k = Integer.valueOf(min);
        }
    }

    @Override // com.ironsource.G
    public void a(IronSourceError error, B instance) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (a(instance) == -1) {
            IronLog.INTERNAL.warning("stale load failure callback for adUnitId: " + b());
            return;
        }
        this.j--;
        if (this.k != null) {
            b(true);
        } else if (this.i < this.h.size()) {
            d();
        } else {
            b(false);
        }
    }

    private final int a(B b) {
        Iterator<C4422g6> it = this.h.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() == b) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
