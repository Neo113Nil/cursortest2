package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ironsource.ud, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4679ud implements InterfaceC4697vd {

    /* renamed from: a, reason: collision with root package name */
    private final LevelPlay.AdFormat f8705a;
    private final InterfaceC4661td b;
    private final InterfaceC4709w7 c;
    private a d;
    private List<InterfaceC4625rd> e;
    private final int f;

    /* renamed from: com.ironsource.ud$a */
    private enum a {
        None,
        Idle,
        Loading
    }

    /* renamed from: com.ironsource.ud$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8707a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8707a = iArr;
        }
    }

    /* renamed from: com.ironsource.ud$c */
    static final class c extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4625rd f8708a;
        final /* synthetic */ C4679ud b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC4625rd interfaceC4625rd, C4679ud c4679ud) {
            super(1);
            this.f8708a = interfaceC4625rd;
            this.b = c4679ud;
        }

        public final void a(boolean z) {
            if (!z) {
                IronLog.INTERNAL.verbose("adunit \"" + this.f8708a.b() + "\" failed to load, removing");
                this.b.e.remove(this.f8708a);
            }
            this.b.d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public C4679ud(LevelPlay.AdFormat adFormat, InterfaceC4661td adUnitsFactory, InterfaceC4709w7 epService) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitsFactory, "adUnitsFactory");
        Intrinsics.checkNotNullParameter(epService, "epService");
        this.f8705a = adFormat;
        this.b = adUnitsFactory;
        this.c = epService;
        this.d = a.None;
        this.e = new ArrayList();
        this.f = b();
    }

    private final int c() {
        int i = b.f8707a[this.f8705a.ordinal()];
        if (i == 1) {
            return this.c.J();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        InterfaceC4625rd e = e();
        if (e == null) {
            this.d = a.Idle;
        } else {
            this.d = a.Loading;
            e.a(new c(e, this));
        }
    }

    private final InterfaceC4625rd e() {
        Object obj;
        if (!a()) {
            IronLog.INTERNAL.verbose(this.f8705a + " - reached capacity");
            return null;
        }
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC4625rd) obj).a()) {
                break;
            }
        }
        InterfaceC4625rd interfaceC4625rd = (InterfaceC4625rd) obj;
        if (interfaceC4625rd != null) {
            return interfaceC4625rd;
        }
        IronLog.INTERNAL.verbose(this.f8705a + " - preload done");
        return null;
    }

    private final int b() {
        int i = b.f8707a[this.f8705a.ordinal()];
        if (i == 1) {
            return this.c.j();
        }
        if (i != 2) {
            return 0;
        }
        return this.c.y();
    }

    @Override // com.ironsource.InterfaceC4697vd
    public void a(Sa config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (!this.c.x()) {
            IronLog.INTERNAL.warning(this.f8705a + " - preload is disabled");
            return;
        }
        if (this.d != a.None) {
            IronLog.INTERNAL.warning(this.f8705a + " - initializing service again");
            return;
        }
        int c2 = c();
        if (c2 < 1) {
            IronLog.INTERNAL.warning(this.f8705a + " - invalid maxParallelLoad: " + c2);
        } else {
            IronLog.INTERNAL.verbose(String.valueOf(this.f8705a));
            this.d = a.Idle;
            this.e = CollectionsKt.toMutableList((Collection) this.b.a(config.c(this.f8705a), c2, config));
            d();
        }
    }

    private final InterfaceC4625rd b(String str) {
        Object obj;
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((InterfaceC4625rd) obj).b(), str)) {
                break;
            }
        }
        return (InterfaceC4625rd) obj;
    }

    public /* synthetic */ C4679ud(LevelPlay.AdFormat adFormat, InterfaceC4661td interfaceC4661td, InterfaceC4709w7 interfaceC4709w7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, (i & 2) != 0 ? new C4643sd(adFormat) : interfaceC4661td, (i & 4) != 0 ? Ib.v.d().h() : interfaceC4709w7);
    }

    private final boolean a() {
        int i;
        List<InterfaceC4625rd> list = this.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (!((InterfaceC4625rd) it.next()).a() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i < this.f;
    }

    @Override // com.ironsource.InterfaceC4697vd
    public C4422g6 a(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        IronLog.INTERNAL.verbose(this.f8705a + " - adunit: \"" + adUnitId + "\"");
        InterfaceC4625rd b2 = b(adUnitId);
        if (b2 != null) {
            return b2.c();
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4697vd
    public void a(String adUnitId, boolean z) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(this.f8705a + " - adunit: \"" + adUnitId + "\", didUseInstance: " + z);
        InterfaceC4625rd b2 = b(adUnitId);
        if (b2 == null) {
            ironLog.warning("adunit is null at \"" + adUnitId + "\"");
            return;
        }
        b2.a(z);
        if (z && this.d == a.Idle) {
            d();
        }
    }
}
