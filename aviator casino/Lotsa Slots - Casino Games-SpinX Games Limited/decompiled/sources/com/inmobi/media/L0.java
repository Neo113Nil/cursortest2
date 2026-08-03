package com.inmobi.media;

/* loaded from: classes5.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.core.config.models.AdConfig.AdQualityConfig f4808a;
    public final com.inmobi.media.InterfaceC2772t9 b;
    public final java.util.concurrent.atomic.AtomicBoolean c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final java.util.concurrent.CopyOnWriteArrayList f;
    public com.inmobi.media.ads.network.common.model.AdQualityControl g;
    public com.inmobi.media.Yn h;
    public com.inmobi.adquality.models.AdQualityResult i;
    public java.lang.String j;
    public org.json.JSONObject k;
    public final java.util.concurrent.atomic.AtomicBoolean l;

    public L0(com.inmobi.media.core.config.models.AdConfig.AdQualityConfig adQualityConfig, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.f4808a = adQualityConfig;
        this.b = interfaceC2772t9;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = new java.util.concurrent.CopyOnWriteArrayList();
        this.h = com.inmobi.media.Yn.f5073a;
        this.j = "";
        this.k = new org.json.JSONObject();
        this.l = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final void a(java.lang.String str, byte[] bArr, boolean z) {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            com.inmobi.media.Vj vj = new com.inmobi.media.Vj(context.getFilesDir().getAbsolutePath() + "/adQuality/screenshots", bArr);
            if (!z) {
                this.f.add(vj);
            }
            com.inmobi.media.AbstractC2365e.a(vj, new com.inmobi.media.J0(this, z, vj, str), null, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002e: INVOKE 
                  (r1v1 'vj' com.inmobi.media.Vj)
                  (wrap:com.inmobi.media.J0:0x002b: CONSTRUCTOR 
                  (r2v0 'this' com.inmobi.media.L0 A[IMMUTABLE_TYPE, THIS])
                  (r5v0 'z' boolean)
                  (r1v1 'vj' com.inmobi.media.Vj)
                  (r3v0 'str' java.lang.String)
                 A[MD:(com.inmobi.media.L0, boolean, com.inmobi.media.Vj, java.lang.String):void (m), WRAPPED] (LINE:9) call: com.inmobi.media.J0.<init>(com.inmobi.media.L0, boolean, com.inmobi.media.Vj, java.lang.String):void type: CONSTRUCTOR)
                  (null java.lang.Long)
                  (wrap:kotlin.jvm.functions.Function0:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1) call: com.inmobi.media.e$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR)
                 STATIC call: com.inmobi.media.e.a(com.inmobi.media.M0, com.inmobi.media.Ng, java.lang.Long, kotlin.jvm.functions.Function0):void A[MD:(com.inmobi.media.M0, com.inmobi.media.Ng, java.lang.Long, kotlin.jvm.functions.Function0):void (m)] (LINE:2) in method: com.inmobi.media.L0.a(java.lang.String, byte[], boolean):void, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.inmobi.media.e$$ExternalSyntheticLambda0, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	... 23 more
                */
            /*
                this = this;
                android.content.Context r0 = com.inmobi.media.Xi.f5051a
                if (r0 == 0) goto L31
                java.io.File r0 = r0.getFilesDir()
                java.lang.String r0 = r0.getAbsolutePath()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = "/adQuality/screenshots"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.inmobi.media.Vj r1 = new com.inmobi.media.Vj
                r1.<init>(r0, r4)
                if (r5 != 0) goto L29
                java.util.concurrent.CopyOnWriteArrayList r4 = r2.f
                r4.add(r1)
            L29:
                com.inmobi.media.J0 r4 = new com.inmobi.media.J0
                r4.<init>(r2, r5, r1, r3)
                com.inmobi.media.AbstractC2365e.a(r1, r4)
            L31:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.L0.a(java.lang.String, byte[], boolean):void");
        }

        public final void a(android.app.Activity activity, java.lang.String url, boolean z, org.json.JSONObject extras, com.inmobi.media.Zh listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            if (extras.length() > 0 && url.length() > 0) {
                this.j = url;
                this.k = extras;
                a("report ad starting");
                if (z) {
                    a("report ad capture");
                    a(activity, 0L, true, listener);
                    return;
                } else {
                    a("report ad report");
                    a(new com.inmobi.adquality.models.AdQualityResult("", null, url, extras.toString()), false);
                    return;
                }
            }
            listener.f5086a.h("window.mraidview.broadcastEvent('AdReportFailed')");
            a("Incorrect parameters for reporting. url - " + url + " , extras - " + extras, (java.lang.Exception) null);
        }

        public final void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi view, java.lang.String url, boolean z, org.json.JSONObject extras, com.inmobi.media.Zh listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            if (extras.length() > 0 && url.length() > 0) {
                this.j = url;
                this.k = extras;
                if (z) {
                    a(view, 0L, true, listener);
                    return;
                } else {
                    a(new com.inmobi.adquality.models.AdQualityResult("", null, url, extras.toString()), false);
                    return;
                }
            }
            listener.f5086a.h("window.mraidview.broadcastEvent('AdReportFailed')");
            a("Incorrect parameters for reporting. url - " + url + " , extras - " + extras, (java.lang.Exception) null);
        }

        public final boolean a() {
            if (this.c.get()) {
                a("ad quality session is already in progress. skipping...");
                return false;
            }
            if (!this.f4808a.getEnabled()) {
                a("config kill switch while state check - false. ad quality will skip");
                return false;
            }
            if (this.g == null) {
                a("setup not done. skipping");
                return false;
            }
            com.inmobi.media.Yn yn = this.h;
            if (yn != com.inmobi.media.Yn.f5073a && yn != com.inmobi.media.Yn.b) {
                return true;
            }
            a("ad view is not visible. skipping");
            return false;
        }

        public final void a(com.inmobi.adquality.models.AdQualityResult adQualityResult, boolean z) {
            if (adQualityResult.getBeaconUrl().length() != 0) {
                com.inmobi.media.AbstractC2365e.a(new com.inmobi.media.C2807uh(adQualityResult), new com.inmobi.media.I0(this, z), null, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: INVOKE 
                      (wrap:com.inmobi.media.uh:0x0012: CONSTRUCTOR (r2v0 'adQualityResult' com.inmobi.adquality.models.AdQualityResult) A[MD:(com.inmobi.adquality.models.AdQualityResult):void (m), WRAPPED] (LINE:57) call: com.inmobi.media.uh.<init>(com.inmobi.adquality.models.AdQualityResult):void type: CONSTRUCTOR)
                      (wrap:com.inmobi.media.I0:0x0017: CONSTRUCTOR (r1v0 'this' com.inmobi.media.L0 A[IMMUTABLE_TYPE, THIS]), (r3v0 'z' boolean) A[MD:(com.inmobi.media.L0, boolean):void (m), WRAPPED] (LINE:58) call: com.inmobi.media.I0.<init>(com.inmobi.media.L0, boolean):void type: CONSTRUCTOR)
                      (null java.lang.Long)
                      (wrap:kotlin.jvm.functions.Function0:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1) call: com.inmobi.media.e$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR)
                     STATIC call: com.inmobi.media.e.a(com.inmobi.media.M0, com.inmobi.media.Ng, java.lang.Long, kotlin.jvm.functions.Function0):void A[MD:(com.inmobi.media.M0, com.inmobi.media.Ng, java.lang.Long, kotlin.jvm.functions.Function0):void (m)] (LINE:2) in method: com.inmobi.media.L0.a(com.inmobi.adquality.models.AdQualityResult, boolean):void, file: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.inmobi.media.e$$ExternalSyntheticLambda0, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 21 more
                    */
                /*
                    this = this;
                    java.lang.String r0 = r2.getBeaconUrl()
                    int r0 = r0.length()
                    if (r0 != 0) goto L10
                    java.lang.String r2 = "beacon is empty"
                    r1.a(r2)
                    return
                L10:
                    com.inmobi.media.uh r0 = new com.inmobi.media.uh
                    r0.<init>(r2)
                    com.inmobi.media.I0 r2 = new com.inmobi.media.I0
                    r2.<init>(r1, r3)
                    com.inmobi.media.AbstractC2365e.a(r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.L0.a(com.inmobi.adquality.models.AdQualityResult, boolean):void");
            }

            public final void a(final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, final long j, final boolean z, final com.inmobi.media.Zh zh) {
                a("isCapture started - " + this.l.get() + ", isReporting - " + z);
                if (this.l.get() && !z) {
                    a("Screenshot process already in progress... skipping...", (java.lang.Exception) null);
                } else {
                    gestureDetectorOnGestureListenerC2675pi.post(new java.lang.Runnable() { // from class: com.inmobi.media.L0$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.inmobi.media.L0.a(com.inmobi.media.L0.this, gestureDetectorOnGestureListenerC2675pi, j, z, zh);
                        }
                    });
                }
            }

            public static final void a(com.inmobi.media.L0 l0, android.view.View adView, long j, boolean z, com.inmobi.media.Zh zh) {
                l0.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
                l0.a(new com.inmobi.media.Vi(adView, l0.f4808a), j, z, zh);
                l0.l.set(!z);
            }

            public final void a(final android.app.Activity activity, final long j, final boolean z, final com.inmobi.media.Zh zh) {
                a("isCapture started - " + this.l.get() + ", isReporting - " + z);
                if (this.l.get() && !z) {
                    a("Screenshot process already in progress... skipping...", (java.lang.Exception) null);
                } else {
                    activity.getWindow().getDecorView().post(new java.lang.Runnable() { // from class: com.inmobi.media.L0$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.inmobi.media.L0.a(com.inmobi.media.L0.this, activity, j, z, zh);
                        }
                    });
                }
            }

            public static final void a(com.inmobi.media.L0 l0, android.app.Activity activity, long j, boolean z, com.inmobi.media.Zh zh) {
                l0.a("activity is visible");
                android.view.Window window = activity.getWindow();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "window");
                l0.a(new com.inmobi.media.C2934zg(window, l0.f4808a), j, z, zh);
                l0.l.set(!z);
            }

            public final void a(com.inmobi.media.AbstractC2792u2 abstractC2792u2, long j, boolean z, com.inmobi.media.Zh zh) {
                if (!z) {
                    this.f.add(abstractC2792u2);
                }
                com.inmobi.media.AbstractC2365e.a(abstractC2792u2, new com.inmobi.media.K0(this, abstractC2792u2, z, zh), java.lang.Long.valueOf(j), new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.L0$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(com.inmobi.media.L0.a(com.inmobi.media.L0.this));
                    }
                });
            }

            public static final boolean a(com.inmobi.media.L0 l0) {
                return l0.h == com.inmobi.media.Yn.c;
            }

            public final void a(android.graphics.Bitmap bitmap, com.inmobi.media.M0 process, boolean z, com.inmobi.media.Zh zh) {
                java.lang.String beacon;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(process, "process");
                a("Screen shot result received - isReporting - " + z);
                this.f.remove(process);
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                if (bitmap != null) {
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (bitmap != null && zh != null) {
                    zh.f5086a.h("window.mraidview.broadcastEvent('ScreenshotSuccess')");
                }
                if (!z) {
                    com.inmobi.media.ads.network.common.model.AdQualityControl adQualityControl = this.g;
                    if (adQualityControl != null && (beacon = adQualityControl.getBeacon()) != null) {
                        a("saving to file - beacon - " + beacon);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(byteArray);
                        a(beacon, byteArray, false);
                    }
                } else {
                    java.lang.String str = this.j;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(byteArray);
                    a(str, byteArray, true);
                }
                this.l.set(false);
            }

            public final void a(java.lang.Exception exc, com.inmobi.media.M0 process) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(process, "process");
                a("error in running process - " + process.getClass().getSimpleName(), exc);
                this.f.remove(process);
                a(true);
            }

            public final void a(java.lang.String result, com.inmobi.media.M0 process, java.lang.String beacon, boolean z) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(process, "process");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beacon, "beacon");
                if (z) {
                    a(new com.inmobi.adquality.models.AdQualityResult(result, null, beacon, this.k.toString()), false);
                    return;
                }
                this.f.remove(process);
                com.inmobi.adquality.models.AdQualityResult adQualityResult = this.i;
                if (adQualityResult != null) {
                    adQualityResult.setImageLocation(result);
                } else {
                    this.i = new com.inmobi.adquality.models.AdQualityResult(result, null, beacon, null, 8, null);
                }
                a("file is saved. result - " + this.i);
                a(true);
            }

            public final void a(boolean z) {
                java.lang.String beacon;
                com.inmobi.media.ads.network.common.model.AdQualityControl adQualityControl = this.g;
                if (adQualityControl == null || (beacon = adQualityControl.getBeacon()) == null) {
                    return;
                }
                if (this.f.isEmpty() && this.d.get() && !this.e.get()) {
                    this.e.set(true);
                    a("session end - queuing result");
                    com.inmobi.adquality.models.AdQualityResult adQualityResult = this.i;
                    if (adQualityResult == null) {
                        adQualityResult = new com.inmobi.adquality.models.AdQualityResult(kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL, null, beacon, null, 8, null);
                    }
                    a(adQualityResult, true);
                    return;
                }
                if (this.d.get() && !z && !this.e.get()) {
                    this.e.set(true);
                    a("session stop - queuing result");
                    kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.E0.e;
                    if (coroutineScope != null) {
                        kotlinx.coroutines.CoroutineScopeKt.cancel(coroutineScope, new java.util.concurrent.CancellationException("Shutdown"));
                    }
                    com.inmobi.media.E0.e = null;
                    com.inmobi.adquality.models.AdQualityResult adQualityResult2 = this.i;
                    if (adQualityResult2 == null) {
                        adQualityResult2 = new com.inmobi.adquality.models.AdQualityResult(kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL, null, beacon, null, 8, null);
                    }
                    a(adQualityResult2, true);
                    return;
                }
                this.f.size();
                this.d.get();
                java.util.Objects.toString(this.e);
            }

            public final void a(java.lang.String str) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).a("AdQualityManager", str);
                }
            }

            public final void a(java.lang.String str, java.lang.Exception exc) {
                kotlin.Unit unit;
                if (exc != null) {
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
                    if (interfaceC2772t9 != null) {
                        ((com.inmobi.media.C2799u9) interfaceC2772t9).a("AdQualityManager", str, exc);
                        unit = kotlin.Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        return;
                    }
                }
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
                if (interfaceC2772t92 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t92).b("AdQualityManager", "Error with null exception : " + str);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
            }
        }
