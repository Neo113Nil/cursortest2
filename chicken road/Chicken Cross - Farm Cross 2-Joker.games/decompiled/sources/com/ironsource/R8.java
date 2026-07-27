package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class R8 implements D7 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4709w7 f7872a;
    private final C4659tb b;
    private final Q8 c;
    private boolean d;
    private final List<Pair<String, LevelPlayImpressionDataListener>> e;
    private Set<String> f;

    static final class a extends Lambda implements Function1<Pair<? extends String, ? extends LevelPlayImpressionDataListener>, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayImpressionDataListener f7873a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
            super(1);
            this.f7873a = levelPlayImpressionDataListener;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Pair<String, ? extends LevelPlayImpressionDataListener> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.getSecond(), this.f7873a));
        }
    }

    public R8() {
        this(null, null, null, 7, null);
    }

    private final void b(String str, LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        if (!b(str)) {
            IronLog.INTERNAL.verbose("subscription denied for: " + levelPlayImpressionDataListener.getClass().getSimpleName());
            this.c.a(str, levelPlayImpressionDataListener.getClass(), a(str));
            return;
        }
        IronLog.INTERNAL.verbose("subscription approved for: " + levelPlayImpressionDataListener.getClass().getSimpleName());
        com.ironsource.mediationsdk.p.g().b(new Xa(levelPlayImpressionDataListener));
    }

    @Override // com.ironsource.D7
    public void a(final String subscriberId, final LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(subscriberId, "subscriberId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.b.a(new Runnable() { // from class: com.ironsource.R8$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                R8.a(R8.this, subscriberId, listener);
            }
        });
    }

    public R8(InterfaceC4709w7 epService, C4659tb tools, Q8 reporter) {
        Intrinsics.checkNotNullParameter(epService, "epService");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f7872a = epService;
        this.b = tools;
        this.c = reporter;
        this.e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(R8 this$0, String subscriberId, LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(subscriberId, "$subscriberId");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        this$0.c.a(subscriberId, listener.getClass());
        if (this$0.d) {
            this$0.b(subscriberId, listener);
            return;
        }
        IronLog.INTERNAL.verbose("queuing listener pre-init: " + listener.getClass().getSimpleName());
        this$0.e.add(TuplesKt.to(subscriberId, listener));
    }

    private final boolean b(String str) {
        Set<String> set;
        if (this.f7872a.B() && (set = this.f) != null) {
            return set.contains(str);
        }
        return true;
    }

    @Override // com.ironsource.D7
    public void a(final LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.b.a(new Runnable() { // from class: com.ironsource.R8$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                R8.a(R8.this, listener);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ R8(InterfaceC4709w7 interfaceC4709w7, C4659tb c4659tb, Q8 q8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Ib.v.d().h() : interfaceC4709w7, (i & 2) != 0 ? new C4659tb() : c4659tb, (i & 4) != 0 ? new Q8(null, 1, 0 == true ? 1 : 0) : q8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(R8 this$0, LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        this$0.c.a(listener.getClass());
        if (!this$0.d) {
            IronLog.INTERNAL.verbose("removing listener pre-init: " + listener.getClass().getSimpleName());
            CollectionsKt.removeAll((List) this$0.e, (Function1) new a(listener));
            return;
        }
        com.ironsource.mediationsdk.p.g().a(new Xa(listener));
    }

    @Override // com.ironsource.D7
    public void a(final Set<String> set) {
        this.b.a(new Runnable() { // from class: com.ironsource.R8$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                R8.a(R8.this, set);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(R8 this$0, Set set) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f = set;
        this$0.d = true;
        List<Pair> list = CollectionsKt.toList(this$0.e);
        this$0.e.clear();
        for (Pair pair : list) {
            this$0.b((String) pair.component1(), (LevelPlayImpressionDataListener) pair.component2());
        }
    }

    private final boolean a(String str) {
        Set<String> set = this.f;
        return (set == null || set.isEmpty() || set.contains(str)) ? false : true;
    }
}
