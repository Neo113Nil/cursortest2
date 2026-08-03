package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class m implements com.moloco.sdk.internal.services.bidtoken.providers.l {
    public static final com.moloco.sdk.internal.services.bidtoken.providers.m.a c = new com.moloco.sdk.internal.services.bidtoken.providers.m.a(null);
    public static final int d = 8;
    public static final java.lang.String e = "ClientBidTokenSignalProviderImpl";
    public final java.util.List<com.moloco.sdk.internal.services.bidtoken.providers.j<?>> b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@com.google.common.annotations.VisibleForTesting java.util.List<? extends com.moloco.sdk.internal.services.bidtoken.providers.j<?>> signalProviders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signalProviders, "signalProviders");
        this.b = signalProviders;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        java.util.Iterator<com.moloco.sdk.internal.services.bidtoken.providers.j<?>> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        java.util.List<com.moloco.sdk.internal.services.bidtoken.providers.j<?>> list = this.b;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                com.moloco.sdk.internal.services.bidtoken.providers.j jVar = (com.moloco.sdk.internal.services.bidtoken.providers.j) it.next();
                boolean b = jVar.b();
                if (b) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "[CBT] Signal provider " + jVar.c() + " needs refresh", null, false, 12, null);
                }
                if (b) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public java.lang.String c() {
        return e;
    }

    public final java.util.List<com.moloco.sdk.internal.services.bidtoken.providers.j<?>> e() {
        return this.b;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.bidtoken.providers.k d() {
        java.util.List<com.moloco.sdk.internal.services.bidtoken.providers.j<?>> list = this.b;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (java.lang.Object obj : list) {
            linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.moloco.sdk.internal.services.bidtoken.providers.j) obj).getClass()), obj);
        }
        java.lang.Object obj2 = linkedHashMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.moloco.sdk.internal.services.bidtoken.providers.w.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.SDKInitStateSignalProvider");
        boolean booleanValue = ((com.moloco.sdk.internal.services.bidtoken.providers.w) obj2).d().booleanValue();
        java.lang.Object obj3 = linkedHashMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.moloco.sdk.internal.services.bidtoken.providers.v.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.PrivacyStateSignalProvider");
        com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings d2 = ((com.moloco.sdk.internal.services.bidtoken.providers.v) obj3).d();
        java.lang.Object obj4 = linkedHashMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.moloco.sdk.internal.services.bidtoken.providers.s.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.MemorySignalProvider");
        com.moloco.sdk.internal.services.bidtoken.providers.r d3 = ((com.moloco.sdk.internal.services.bidtoken.providers.s) obj4).d();
        java.lang.Object obj5 = linkedHashMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.moloco.sdk.internal.services.bidtoken.providers.e.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AppDirInfoSignalProvider");
        com.moloco.sdk.internal.services.bidtoken.providers.d d4 = ((com.moloco.sdk.internal.services.bidtoken.providers.e) obj5).d();
        java.lang.Object obj6 = linkedHashMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.moloco.sdk.internal.services.bidtoken.providers.u.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.NetworkInfoSignalProvider");
        com.moloco.sdk.internal.services.bidtoken.providers.t d5 = ((com.moloco.sdk.internal.services.bidtoken.providers.u) obj6).d();
        java.lang.Object obj7 = linkedHashMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.moloco.sdk.internal.services.bidtoken.providers.i.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.BatteryInfoSignalProvider");
        com.moloco.sdk.internal.services.bidtoken.providers.h d6 = ((com.moloco.sdk.internal.services.bidtoken.providers.i) obj7).d();
        java.lang.Object obj8 = linkedHashMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.moloco.sdk.internal.services.bidtoken.providers.c.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AdvertisingSignalProvider");
        com.moloco.sdk.internal.services.AbstractC3432c d7 = ((com.moloco.sdk.internal.services.bidtoken.providers.c) obj8).d();
        java.lang.Object obj9 = linkedHashMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.moloco.sdk.internal.services.bidtoken.providers.o.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.DeviceSignalProvider");
        com.moloco.sdk.internal.services.bidtoken.providers.n d8 = ((com.moloco.sdk.internal.services.bidtoken.providers.o) obj9).d();
        java.lang.Object obj10 = linkedHashMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.moloco.sdk.internal.services.bidtoken.providers.g.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AudioSignalProvider");
        com.moloco.sdk.internal.services.bidtoken.providers.f d9 = ((com.moloco.sdk.internal.services.bidtoken.providers.g) obj10).d();
        java.lang.Object obj11 = linkedHashMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.moloco.sdk.internal.services.bidtoken.providers.b.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.AccessibilitySignalProvider");
        com.moloco.sdk.internal.services.bidtoken.providers.a d10 = ((com.moloco.sdk.internal.services.bidtoken.providers.b) obj11).d();
        java.lang.Object obj12 = linkedHashMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.moloco.sdk.internal.services.bidtoken.providers.q.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.IlrdSignalProvider");
        com.moloco.sdk.internal.services.bidtoken.providers.p d11 = ((com.moloco.sdk.internal.services.bidtoken.providers.q) obj12).d();
        java.lang.Object obj13 = linkedHashMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.moloco.sdk.internal.services.bidtoken.providers.y.class));
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type com.moloco.sdk.internal.services.bidtoken.providers.TestConfigSignalProvider");
        return new com.moloco.sdk.internal.services.bidtoken.providers.k(booleanValue, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, ((com.moloco.sdk.internal.services.bidtoken.providers.y) obj13).d());
    }
}
