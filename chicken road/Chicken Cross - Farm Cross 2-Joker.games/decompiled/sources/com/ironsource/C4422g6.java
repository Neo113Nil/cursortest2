package com.ironsource;

import android.app.Activity;
import com.ironsource.C4422g6;
import com.ironsource.U3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: com.ironsource.g6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4422g6 extends B implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {
    private C4385e5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4422g6(T0 adTools, C instanceData, I adInstancePayload) {
        super(adTools, instanceData, adInstancePayload, null, null, 24, null);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
    }

    private final List<String> K() {
        JSONObject optJSONObject = new N6().a(new String[]{L6.u}).optJSONObject(L6.u);
        if (optJSONObject == null) {
            return CollectionsKt.emptyList();
        }
        Object opt = optJSONObject.opt(L6.C);
        List list = opt instanceof List ? (List) opt : null;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList;
    }

    private final InterfaceC4440h6 L() {
        F s = s();
        if (s instanceof InterfaceC4440h6) {
            return (InterfaceC4440h6) s;
        }
        return null;
    }

    private final Map<String, Object> M() {
        Map createMapBuilder = MapsKt.createMapBuilder();
        for (String str : K()) {
            List split$default = StringsKt.split$default((CharSequence) str, new String[]{U3.j.b}, false, 2, 2, (Object) null);
            if (split$default.size() < 2) {
                IronLog.INTERNAL.warning(a("\"" + str + "\" is not a valid key=value format"));
            } else {
                createMapBuilder.put("custom_" + ((String) split$default.get(0)), (String) split$default.get(1));
            }
        }
        return MapsKt.build(createMapBuilder);
    }

    private final void N() {
        if (w()) {
            f().f().h().l("closed after failure");
            return;
        }
        if (!z()) {
            a(1000, "ad closed before ad opened");
            return;
        }
        this.z = new C4385e5();
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().f().a().a(k(), "");
        InterfaceC4440h6 L = L();
        if (L != null) {
            L.b(this);
        }
        c();
    }

    private final void O() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().f().a().d(k());
    }

    private final void P() {
        if (w()) {
            f().f().h().l("rewarded after failure");
            return;
        }
        Map<String, Object> M = M();
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = f().a(currentTimeMillis, p());
        long a3 = C4385e5.a(this.z);
        LevelPlayReward a4 = Ib.v.d().D().a(k(), n().j().b().c());
        f().f().a().a(k(), a4.getName(), a4.getAmount(), currentTimeMillis, a2, a3, M, f().j());
        InterfaceC4440h6 L = L();
        if (L != null) {
            L.a(this, a4);
        }
    }

    private final void Q() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        InterfaceC4440h6 L = L();
        if (L != null) {
            L.a(this);
        }
    }

    private final void R() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().f().a().i(k());
    }

    private final void S() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().f().a().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4422g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4422g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4422g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C4422g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.S();
    }

    @Override // com.ironsource.B
    protected void C() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object g = g();
        Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterAdFullScreenInterface) g).loadAd(n().h(), ContextProvider.getInstance().getActiveContext(), this);
    }

    @Override // com.ironsource.B
    public void a(K adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.B
    public void c() {
        if (g() instanceof AdapterAdFullScreenInterface) {
            a(new a());
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        f().a(new Runnable() { // from class: com.ironsource.g6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4422g6.a(C4422g6.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        f().a(new Runnable() { // from class: com.ironsource.g6$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C4422g6.b(C4422g6.this);
            }
        });
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        f().a(new Runnable() { // from class: com.ironsource.g6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4422g6.d(C4422g6.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        f().a(new Runnable() { // from class: com.ironsource.g6$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C4422g6.e(C4422g6.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        f().a(new Runnable() { // from class: com.ironsource.g6$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4422g6.f(C4422g6.this);
            }
        });
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.INTERNAL.verbose(a("placementName = " + k()));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        f().f().a().a(activity, k());
        a(new b(activity, objectRef));
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        super.onAdOpened(extraData);
        f().a(new Runnable() { // from class: com.ironsource.g6$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4422g6.c(C4422g6.this);
            }
        });
    }

    /* renamed from: com.ironsource.g6$a */
    static final class a extends Lambda implements Function0<Unit> {
        a() {
            super(0);
        }

        public final void a() {
            try {
                Object g = C4422g6.this.g();
                Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
                ((AdapterAdFullScreenInterface) g).destroyAd(C4422g6.this.n().h());
            } catch (Throwable th) {
                T0 f = C4422g6.this.f();
                final C4422g6 c4422g6 = C4422g6.this;
                f.a(new Runnable() { // from class: com.ironsource.g6$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4422g6.a.a(th, c4422g6);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Throwable t, C4422g6 this$0) {
            Intrinsics.checkNotNullParameter(t, "$t");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C4491k4.d().a(t);
            String str = "destroyAd - exception = " + t.getLocalizedMessage();
            IronLog.INTERNAL.error(this$0.a(str));
            this$0.f().f().h().g(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4422g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N();
    }

    /* renamed from: com.ironsource.g6$b */
    static final class b extends Lambda implements Function0<Unit> {
        final /* synthetic */ Activity b;
        final /* synthetic */ Ref.ObjectRef<String> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, Ref.ObjectRef<String> objectRef) {
            super(0);
            this.b = activity;
            this.c = objectRef;
        }

        public final void a() {
            try {
                if (C4422g6.this.g() instanceof AdapterAdFullScreenInterface) {
                    Object g = C4422g6.this.g();
                    Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                    ((AdapterAdFullScreenInterface) g).showAd(C4422g6.this.i(), this.b, C4422g6.this);
                } else {
                    this.c.element = "showAd - adapter not instance of AdapterAdFullScreenInterface";
                    IronLog.INTERNAL.error(C4422g6.this.a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                    T0 f = C4422g6.this.f();
                    final C4422g6 c4422g6 = C4422g6.this;
                    final Ref.ObjectRef<String> objectRef = this.c;
                    f.a(new Runnable() { // from class: com.ironsource.g6$b$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4422g6.b.a(C4422g6.this, objectRef);
                        }
                    });
                }
            } catch (Throwable th) {
                T0 f2 = C4422g6.this.f();
                final Ref.ObjectRef<String> objectRef2 = this.c;
                final C4422g6 c4422g62 = C4422g6.this;
                f2.a(new Runnable() { // from class: com.ironsource.g6$b$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4422g6.b.a(th, objectRef2, c4422g62);
                    }
                });
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void a(C4422g6 this$0, Ref.ObjectRef errorMessage) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
            this$0.f().f().h().g((String) errorMessage.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.String] */
        public static final void a(Throwable t, Ref.ObjectRef errorMessage, C4422g6 this$0) {
            Intrinsics.checkNotNullParameter(t, "$t");
            Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C4491k4.d().a(t);
            ?? r2 = "showAd - exception = " + t.getMessage();
            errorMessage.element = r2;
            IronLog.INTERNAL.error(this$0.a((String) r2));
            this$0.f().f().h().g((String) errorMessage.element);
            this$0.a(A0.h(this$0.n().i()), (String) errorMessage.element);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4422g6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Q();
    }
}
