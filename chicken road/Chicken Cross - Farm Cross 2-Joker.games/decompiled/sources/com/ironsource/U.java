package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class U implements InterfaceC4718wg {

    /* renamed from: a, reason: collision with root package name */
    private final String f7919a;
    private final InterfaceC4532m9 b;
    private final boolean c;

    static final class a extends Lambda implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7920a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4635s5.f8523a.r();
        }
    }

    static final class b extends Lambda implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7921a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4635s5.f8523a.o();
        }
    }

    static final class c extends Lambda implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7922a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4635s5.f8523a.n();
        }
    }

    static final class d extends Lambda implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f7923a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4635s5.f8523a.q();
        }
    }

    static final class e extends Lambda implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f7924a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4635s5.f8523a.o();
        }
    }

    static final class f extends Lambda implements Function0<IronSourceError> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f7925a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4635s5.f8523a.g();
        }
    }

    public U(String adm, InterfaceC4532m9 interfaceC4532m9, boolean z) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.f7919a = adm;
        this.b = interfaceC4532m9;
        this.c = z;
    }

    @Override // com.ironsource.InterfaceC4718wg
    public void a() throws C4591pe {
        a(this.c, a.f7920a);
        a(this.b != null, b.f7921a);
        InterfaceC4532m9 interfaceC4532m9 = this.b;
        if (interfaceC4532m9 != null) {
            if (interfaceC4532m9.f() == EnumC4586p9.NonBidder) {
                a(this.f7919a.length() == 0, c.f7922a);
            }
            if (interfaceC4532m9.f() == EnumC4586p9.Bidder) {
                a(this.f7919a.length() > 0, d.f7923a);
            }
            a(interfaceC4532m9.f() != EnumC4586p9.NotSupported, e.f7924a);
            a(interfaceC4532m9.e().length() > 0, f.f7925a);
        }
    }
}
