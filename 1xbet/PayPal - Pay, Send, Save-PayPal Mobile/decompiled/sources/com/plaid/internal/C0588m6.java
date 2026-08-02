package com.plaid.internal;

/* renamed from: com.plaid.internal.m6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0588m6 implements com.plaid.internal.M5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.N5 f6495a;
    public final com.plaid.internal.C0471c5 b;
    public final kotlin.Lazy c;
    public final com.plaid.internal.C0647t3 d;

    /* renamed from: com.plaid.internal.m6$a */
    public static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.util.List<? extends com.plaid.link.event.LinkEventName>> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.C0588m6.a f6496a = new com.plaid.internal.C0588m6.a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final java.util.List<? extends com.plaid.link.event.LinkEventName> invoke() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.plaid.link.event.LinkEventName[]{com.plaid.link.event.LinkEventName.PROFILE_ELIGIBILITY_CHECK_READY.INSTANCE, com.plaid.link.event.LinkEventName.LAYER_AUTOFILL_NOT_AVAILABLE.INSTANCE, com.plaid.link.event.LinkEventName.LAYER_READY.INSTANCE, com.plaid.link.event.LinkEventName.LAYER_NOT_AVAILABLE.INSTANCE});
        }
    }

    /* renamed from: com.plaid.internal.m6$b */
    public final /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<com.plaid.link.event.LinkEvent, com.plaid.internal.I2, kotlin.Unit> {
        public b(com.plaid.internal.C0588m6 c0588m6) {
            super(2, c0588m6, com.plaid.internal.C0588m6.class, "onEvent", "onEvent(Lcom/plaid/link/event/LinkEvent;Lcom/plaid/internal/event/LinkQueueOptions;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final kotlin.Unit invoke(com.plaid.link.event.LinkEvent linkEvent, com.plaid.internal.I2 i2) {
            com.plaid.link.event.LinkEvent linkEvent2 = linkEvent;
            com.plaid.internal.I2 i22 = i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkEvent2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i22, "");
            ((com.plaid.internal.C0588m6) this.receiver).a(linkEvent2, i22);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* renamed from: com.plaid.internal.m6$c */
    public final /* synthetic */ class c extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        public c(com.plaid.internal.C0588m6 c0588m6) {
            super(0, c0588m6, com.plaid.internal.C0588m6.class, "preLoadFailed", "preLoadFailed()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlin.Unit invoke() {
            com.plaid.internal.C0588m6 c0588m6 = (com.plaid.internal.C0588m6) this.receiver;
            com.plaid.internal.C0471c5 c0471c5 = c0588m6.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Preload received unexpected action", "");
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, null, null, new com.plaid.internal.C0451a5(c0471c5, "Preload received unexpected action", null), 3, null);
            c0588m6.f6495a.a();
            return kotlin.Unit.INSTANCE;
        }
    }

    @javax.inject.Inject
    public C0588m6(com.plaid.internal.N5 n5, com.plaid.internal.C0471c5 c0471c5, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0471c5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.f6495a = n5;
        this.b = c0471c5;
        this.c = kotlin.LazyKt.lazy(com.plaid.internal.C0588m6.a.f6496a);
        this.d = new com.plaid.internal.C0647t3(new com.plaid.internal.W0(new com.plaid.internal.C0588m6.b(this), new com.plaid.internal.C0588m6.c(this)), json);
    }

    @Override // com.plaid.internal.M5
    public final void a(com.plaid.internal.AbstractC0639s4 abstractC0639s4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractC0639s4, "");
    }

    public final void a(com.plaid.link.event.LinkEvent linkEvent, com.plaid.internal.I2 i2) {
        if (((java.util.List) this.c.getValue()).contains(linkEvent.getEventName())) {
            com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
            com.plaid.internal.C0452a6.a.a("Preload delivered event: ".concat(java.lang.String.valueOf(linkEvent.getEventName())), true);
            com.plaid.link.Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(linkEvent);
            return;
        }
        com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Preload enqueued event: ".concat(java.lang.String.valueOf(linkEvent.getEventName())), true);
        kotlin.jvm.functions.Function2<com.plaid.link.event.LinkEvent, com.plaid.internal.I2, kotlin.Unit> linkEventListenerInternal$link_sdk_release = com.plaid.link.Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(linkEvent, i2);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.plaid.internal.M5
    public final boolean a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.d.a(str);
        return true;
    }
}
