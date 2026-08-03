package com.moloco.sdk.internal.services.events;

/* loaded from: classes5.dex */
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a {
    public static final int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.InterfaceC3440k f7267a;
    public final com.moloco.sdk.internal.services.B b;
    public final com.moloco.sdk.internal.services.y c;
    public final com.moloco.sdk.internal.services.F d;
    public final com.moloco.sdk.internal.services.usertracker.f e;
    public final com.moloco.sdk.internal.services.InterfaceC3433d f;
    public final com.moloco.sdk.internal.services.proto.a g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c h;
    public final java.lang.String i;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.events.CustomUserEventBuilderServiceImpl", f = "CustomUserEventBuilderServiceImpl.kt", i = {0, 0, 0, 0}, l = {67}, m = "userAdInteractionExt", n = {"this", "interaction", "$this$userAdInteractionExt_u24lambda_u240", "eventTimestamp"}, s = {"L$0", "L$1", "L$3", "J$0"})
    /* renamed from: com.moloco.sdk.internal.services.events.a$a, reason: collision with other inner class name */
    public static final class C0205a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7268a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public long f;
        public /* synthetic */ java.lang.Object g;
        public int i;

        public C0205a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.events.a.C0205a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.events.a.this.a(0L, (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.events.CustomUserEventBuilderServiceImpl", f = "CustomUserEventBuilderServiceImpl.kt", i = {0}, l = {52}, m = "userAdInteractionExtAsQueryParameter", n = {"url"}, s = {"L$0"})
    public static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7269a;
        public /* synthetic */ java.lang.Object b;
        public int d;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.events.a.b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.events.a.this.a(0L, (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a) null, (java.lang.String) null, this);
        }
    }

    public a(com.moloco.sdk.internal.services.InterfaceC3440k appInfoService, com.moloco.sdk.internal.services.B networkInfoService, com.moloco.sdk.internal.services.y deviceInfoService, com.moloco.sdk.internal.services.F screenInfoService, com.moloco.sdk.internal.services.usertracker.f userIdentifierService, com.moloco.sdk.internal.services.InterfaceC3433d adDataService, com.moloco.sdk.internal.services.proto.a encoderService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c userEventConfigService, java.lang.String sdkVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfoService, "appInfoService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfoService, "networkInfoService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenInfoService, "screenInfoService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIdentifierService, "userIdentifierService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adDataService, "adDataService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoderService, "encoderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userEventConfigService, "userEventConfigService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.f7267a = appInfoService;
        this.b = networkInfoService;
        this.c = deviceInfoService;
        this.d = screenInfoService;
        this.e = userIdentifierService;
        this.f = adDataService;
        this.g = encoderService;
        this.h = userEventConfigService;
        this.i = sdkVersion;
    }

    public final com.moloco.sdk.internal.services.InterfaceC3440k b() {
        return this.f7267a;
    }

    public final com.moloco.sdk.internal.services.y c() {
        return this.c;
    }

    public final com.moloco.sdk.internal.services.proto.a d() {
        return this.g;
    }

    public final com.moloco.sdk.internal.services.B e() {
        return this.b;
    }

    public final com.moloco.sdk.internal.services.F f() {
        return this.d;
    }

    public final java.lang.String g() {
        return this.i;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c h() {
        return this.h;
    }

    public final com.moloco.sdk.internal.services.usertracker.f i() {
        return this.e;
    }

    public final com.moloco.sdk.internal.services.InterfaceC3433d a() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(long j2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a abstractC0325a, java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.moloco.sdk.internal.services.events.a.b bVar;
        int i;
        if (continuation instanceof com.moloco.sdk.internal.services.events.a.b) {
            bVar = (com.moloco.sdk.internal.services.events.a.b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.h.c()) {
                        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.events.b.f7270a, "Event reporting config disabled, UserAdInteractionExt not reporting", false, 4, null);
                        return str;
                    }
                    bVar.f7269a = str;
                    bVar.d = 1;
                    obj = a(j2, abstractC0325a, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) bVar.f7269a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String uri = android.net.Uri.parse(str).buildUpon().appendQueryParameter(com.moloco.sdk.internal.services.events.b.b, (java.lang.String) obj).build().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                return uri;
            }
        }
        bVar = new com.moloco.sdk.internal.services.events.a.b(continuation);
        java.lang.Object obj2 = bVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
        if (i != 0) {
        }
        java.lang.String uri2 = android.net.Uri.parse(str).buildUpon().appendQueryParameter(com.moloco.sdk.internal.services.events.b.b, (java.lang.String) obj2).build().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(long j2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a abstractC0325a, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.moloco.sdk.internal.services.events.a.C0205a c0205a;
        int i;
        com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder newBuilder;
        com.moloco.sdk.internal.services.events.a aVar;
        com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder builder;
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a abstractC0325a2;
        com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder builder2;
        com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder builder3;
        com.moloco.sdk.internal.services.AbstractC3432c a2;
        if (continuation instanceof com.moloco.sdk.internal.services.events.a.C0205a) {
            c0205a = (com.moloco.sdk.internal.services.events.a.C0205a) continuation;
            int i2 = c0205a.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0205a.i = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c0205a.g;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0205a.i;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    newBuilder = com.moloco.sdk.UserIntent.UserAdInteractionExt.newBuilder();
                    if (this.h.b()) {
                        com.moloco.sdk.internal.services.usertracker.f fVar = this.e;
                        c0205a.f7268a = this;
                        c0205a.b = abstractC0325a;
                        c0205a.c = newBuilder;
                        c0205a.d = newBuilder;
                        c0205a.e = newBuilder;
                        c0205a.f = j2;
                        c0205a.i = 1;
                        java.lang.Object b2 = fVar.b(c0205a);
                        if (b2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        abstractC0325a2 = abstractC0325a;
                        builder2 = newBuilder;
                        builder3 = builder2;
                        builder = builder3;
                        obj = b2;
                        aVar = this;
                    } else {
                        aVar = this;
                        builder = newBuilder;
                        a2 = aVar.f.a();
                        if (a2 instanceof com.moloco.sdk.internal.services.AbstractC3432c.a) {
                            newBuilder.setAdvertisingId(((com.moloco.sdk.internal.services.AbstractC3432c.a) a2).b());
                        } else if (!(a2 instanceof com.moloco.sdk.internal.services.AbstractC3432c.b)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        newBuilder.setClientTimestamp(j2);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder);
                        aVar.a(newBuilder);
                        aVar.a(newBuilder, abstractC0325a, aVar.d.invoke());
                        aVar.a(newBuilder, aVar.f7267a.invoke());
                        aVar.a(newBuilder, aVar.c.invoke());
                        aVar.a(newBuilder, aVar.b.invoke());
                        com.moloco.sdk.UserIntent.UserAdInteractionExt build = builder.build();
                        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                        com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.services.events.b.f7270a, "Encoding protobuf UserAdInteractionExt: " + build, false, 4, null);
                        com.moloco.sdk.internal.services.proto.a aVar2 = aVar.g;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(build);
                        java.lang.String a3 = com.moloco.sdk.internal.services.proto.a.C0206a.a(aVar2, build, 0, 2, null);
                        com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.services.events.b.f7270a, "Successfully built userAdInteractionExt as base64 string: " + a3, false, 4, null);
                        return a3;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = c0205a.f;
                    builder2 = (com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder) c0205a.e;
                    builder3 = (com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder) c0205a.d;
                    builder = (com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder) c0205a.c;
                    abstractC0325a2 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a) c0205a.b;
                    aVar = (com.moloco.sdk.internal.services.events.a) c0205a.f7268a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                builder2.setMref((java.lang.String) obj);
                newBuilder = builder3;
                abstractC0325a = abstractC0325a2;
                a2 = aVar.f.a();
                if (a2 instanceof com.moloco.sdk.internal.services.AbstractC3432c.a) {
                }
                newBuilder.setClientTimestamp(j2);
                kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder);
                aVar.a(newBuilder);
                aVar.a(newBuilder, abstractC0325a, aVar.d.invoke());
                aVar.a(newBuilder, aVar.f7267a.invoke());
                aVar.a(newBuilder, aVar.c.invoke());
                aVar.a(newBuilder, aVar.b.invoke());
                com.moloco.sdk.UserIntent.UserAdInteractionExt build2 = builder.build();
                com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger2, com.moloco.sdk.internal.services.events.b.f7270a, "Encoding protobuf UserAdInteractionExt: " + build2, false, 4, null);
                com.moloco.sdk.internal.services.proto.a aVar22 = aVar.g;
                kotlin.jvm.internal.Intrinsics.checkNotNull(build2);
                java.lang.String a32 = com.moloco.sdk.internal.services.proto.a.C0206a.a(aVar22, build2, 0, 2, null);
                com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger2, com.moloco.sdk.internal.services.events.b.f7270a, "Successfully built userAdInteractionExt as base64 string: " + a32, false, 4, null);
                return a32;
            }
        }
        c0205a = new com.moloco.sdk.internal.services.events.a.C0205a(continuation);
        java.lang.Object obj2 = c0205a.g;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0205a.i;
        if (i != 0) {
        }
        builder2.setMref((java.lang.String) obj2);
        newBuilder = builder3;
        abstractC0325a = abstractC0325a2;
        a2 = aVar.f.a();
        if (a2 instanceof com.moloco.sdk.internal.services.AbstractC3432c.a) {
        }
        newBuilder.setClientTimestamp(j2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(newBuilder);
        aVar.a(newBuilder);
        aVar.a(newBuilder, abstractC0325a, aVar.d.invoke());
        aVar.a(newBuilder, aVar.f7267a.invoke());
        aVar.a(newBuilder, aVar.c.invoke());
        aVar.a(newBuilder, aVar.b.invoke());
        com.moloco.sdk.UserIntent.UserAdInteractionExt build22 = builder.build();
        com.moloco.sdk.internal.MolocoLogger molocoLogger22 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger22, com.moloco.sdk.internal.services.events.b.f7270a, "Encoding protobuf UserAdInteractionExt: " + build22, false, 4, null);
        com.moloco.sdk.internal.services.proto.a aVar222 = aVar.g;
        kotlin.jvm.internal.Intrinsics.checkNotNull(build22);
        java.lang.String a322 = com.moloco.sdk.internal.services.proto.a.C0206a.a(aVar222, build22, 0, 2, null);
        com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger22, com.moloco.sdk.internal.services.events.b.f7270a, "Successfully built userAdInteractionExt as base64 string: " + a322, false, 4, null);
        return a322;
    }

    public final com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder a(com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder builder) {
        com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.Builder newBuilder = com.moloco.sdk.UserIntent.UserAdInteractionExt.MolocoSDK.newBuilder();
        newBuilder.setCoreVer(this.i);
        builder.setSdk(newBuilder.build());
        return builder;
    }

    public final com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder a(com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder builder, com.moloco.sdk.internal.services.x xVar) {
        com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.Builder newBuilder = com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.newBuilder();
        newBuilder.setOsVer(xVar.x());
        newBuilder.setModel(xVar.v());
        newBuilder.setOs(com.moloco.sdk.UserIntent.UserAdInteractionExt.Device.OsType.ANDROID);
        newBuilder.setScreenScale(xVar.y());
        builder.setDevice(newBuilder.build());
        return builder;
    }

    public final com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder a(com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder builder, com.moloco.sdk.internal.services.A a2) {
        com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.Builder newBuilder = com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.newBuilder();
        if (a2 instanceof com.moloco.sdk.internal.services.A.a) {
            newBuilder.setConnectionType(com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType.CELLULAR);
            newBuilder.setCarrier(((com.moloco.sdk.internal.services.A.a) a2).a());
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(a2, com.moloco.sdk.internal.services.A.b.b)) {
            newBuilder.setConnectionType(com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType.UNKNOWN);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(a2, com.moloco.sdk.internal.services.A.c.b)) {
            newBuilder.setConnectionType(com.moloco.sdk.UserIntent.UserAdInteractionExt.Network.ConnectionType.WIFI);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        builder.setNetwork(newBuilder.build());
        return builder;
    }

    public final com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder a(com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder builder, com.moloco.sdk.internal.services.C3439j c3439j) {
        com.moloco.sdk.UserIntent.UserAdInteractionExt.App.Builder newBuilder = com.moloco.sdk.UserIntent.UserAdInteractionExt.App.newBuilder();
        newBuilder.setId(c3439j.b());
        newBuilder.setVer(c3439j.c());
        builder.setApp(newBuilder.build());
        return builder;
    }

    public final com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder a(com.moloco.sdk.UserIntent.UserAdInteractionExt.Builder builder, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a abstractC0325a, com.moloco.sdk.internal.services.E e) {
        if (abstractC0325a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.e) {
            builder.setImpInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.ImpressionInteraction.newBuilder().build());
        } else if (abstractC0325a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.d) {
            com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.Builder newBuilder = com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction.newBuilder();
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.d) abstractC0325a;
            newBuilder.setClickPos(com.moloco.sdk.internal.services.events.b.a(dVar.b()));
            newBuilder.setScreenSize(com.moloco.sdk.internal.services.events.b.a(e));
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.g d = dVar.d();
            if (d != null) {
                newBuilder.setViewSize(com.moloco.sdk.internal.services.events.b.a(d));
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f c = dVar.c();
            if (c != null) {
                newBuilder.setViewPos(com.moloco.sdk.internal.services.events.b.a(c));
            }
            java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c> a2 = dVar.a();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(a2, 10));
            for (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c cVar : a2) {
                com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.Builder newBuilder2 = com.moloco.sdk.UserIntent.UserAdInteractionExt.Button.newBuilder();
                newBuilder2.setType(com.moloco.sdk.internal.services.events.b.a(cVar.d()));
                newBuilder2.setPos(com.moloco.sdk.internal.services.events.b.a(cVar.e()));
                newBuilder2.setSize(com.moloco.sdk.internal.services.events.b.a(cVar.f()));
                arrayList.add(newBuilder2.build());
            }
            newBuilder.addAllButtons(arrayList);
            builder.setClickInteraction((com.moloco.sdk.UserIntent.UserAdInteractionExt.ClickInteraction) newBuilder.build());
        } else if (abstractC0325a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.b) {
            com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.Builder newBuilder3 = com.moloco.sdk.UserIntent.UserAdInteractionExt.AppForegroundingInteraction.newBuilder();
            newBuilder3.setBgTsMs(((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.b) abstractC0325a).b());
            builder.setAppForegroundingInteraction(newBuilder3.build());
        } else if (abstractC0325a instanceof com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.C0326a) {
            builder.setAppBackgroundingInteraction(com.moloco.sdk.UserIntent.UserAdInteractionExt.AppBackgroundingInteraction.newBuilder().build());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return builder;
    }
}
