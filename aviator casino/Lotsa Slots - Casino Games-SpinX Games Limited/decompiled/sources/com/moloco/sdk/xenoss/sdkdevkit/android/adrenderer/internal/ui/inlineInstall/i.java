package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

/* loaded from: classes5.dex */
public final class i implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i.a h = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i.a(null);
    public static final int i = 8;
    public static final java.lang.String j = "InlineInstallLauncher";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m f7629a;
    public final java.lang.String b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a e;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder f;
    public final java.util.concurrent.atomic.AtomicBoolean g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m installer, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c bundleExtractor, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installer, "installer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundleExtractor, "bundleExtractor");
        this.f7629a = installer;
        this.b = str;
        this.c = bundleExtractor;
        this.d = bVar;
        this.e = aVar;
        this.f = metricsRecorder;
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h
    public void a(java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar = this.e;
        if (aVar == null || !aVar.g()) {
            return;
        }
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.f;
        if (metricsRecorder != null) {
            metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.Q.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.g.c(), "auto_inline"));
        }
        java.lang.String f = this.e.f();
        if (f != null) {
            str = f;
        }
        a(externalLinkHandler, str, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i.this, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k) obj);
            }
        });
        java.lang.String h2 = this.e.h();
        if (h2 != null) {
            com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, j, "auto_halfsheet_shown success", null, false, 12, null);
            com.moloco.sdk.service_locator.a.i.f7350a.c().a(h2);
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, j, "auto_inline_success fire this event once: " + h2, null, false, 12, null);
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.f;
            if (metricsRecorder2 != null) {
                metricsRecorder2.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "auto_halfsheet_shown"));
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h
    public void b(java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar = this.d;
        if (bVar == null || !bVar.c()) {
            if (str != null) {
                externalLinkHandler.a(str);
            }
        } else {
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.f;
            if (metricsRecorder != null) {
                metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.Q.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.g.c(), "android_inline"));
            }
            a(externalLinkHandler, str, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i.this, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k) obj);
                }
            });
        }
    }

    public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(outcome, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k.c.b)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(outcome, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k.a.b)) {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, j, "auto_fullsheet_shown", null, false, 12, null);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = iVar.f;
                if (metricsRecorder != null) {
                    metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "auto_fullsheet_shown"));
                }
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(outcome, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k.b.b)) {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, j, "auto_fallback_shown", null, false, 12, null);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = iVar.f;
                if (metricsRecorder2 != null) {
                    metricsRecorder2.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "auto_fallback_shown"));
                }
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (kotlin.jvm.internal.Intrinsics.areEqual(outcome, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k.c.b)) {
            com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
            com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, j, "click_inline_halfsheet_shown", null, false, 12, null);
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = iVar.f;
            if (metricsRecorder != null) {
                metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "click_inline_halfsheet_shown"));
            }
            if (iVar.g.compareAndSet(false, true)) {
                java.lang.String d = iVar.d.d();
                if (d != null) {
                    com.moloco.sdk.service_locator.a.i.f7350a.c().a(d);
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, j, "inline_install_success fire this event once: " + d, null, false, 12, null);
                }
            } else {
                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, j, "inline_install_success already fired", null, false, 12, null);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(outcome, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k.a.b)) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, j, "click_inline_fullsheet_shown", null, false, 12, null);
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = iVar.f;
            if (metricsRecorder2 != null) {
                metricsRecorder2.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "click_inline_fullsheet_shown"));
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(outcome, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k.b.b)) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, j, "click_inline_fallback_shown", null, false, 12, null);
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder3 = iVar.f;
            if (metricsRecorder3 != null) {
                metricsRecorder3.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "click_inline_fallback_shown"));
            }
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, java.lang.String str, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k, kotlin.Unit> function1) {
        java.lang.String str2;
        java.lang.String b;
        java.lang.String str3 = this.b;
        if (str3 != null && this.c.a(str3)) {
            b = this.b;
        } else if (str != null) {
            b = this.c.b(str);
        } else {
            str2 = null;
            java.lang.String d = str != null ? this.c.d(str) : null;
            if (str2 == null && this.c.a(str2)) {
                a(str2, d, str, rVar, function1);
                return;
            }
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, j, "Store URL found but bundle extraction/validation failed: " + str, null, false, 12, null);
            if (str != null || str.length() == 0) {
            }
            rVar.a(str);
            function1.invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k.b.b);
            return;
        }
        str2 = b;
        java.lang.String d2 = str != null ? this.c.d(str) : null;
        if (str2 == null) {
        }
        com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, j, "Store URL found but bundle extraction/validation failed: " + str, null, false, 12, null);
        if (str != null) {
        }
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, final kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k, kotlin.Unit> function1) {
        if (this.f7629a.a(str, str2, new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i.a(kotlin.jvm.functions.Function1.this, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k) obj);
            }
        }) || str3 == null) {
            return;
        }
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, j, "Cannot resolve app install intent", null, false, 12, null);
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, j, "inline_install_fallback", null, false, 12, null);
        rVar.a(str3);
        function1.invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k.b.b);
    }

    public static final kotlin.Unit a(kotlin.jvm.functions.Function1 function1, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "outcome");
        function1.invoke(outcome);
        return kotlin.Unit.INSTANCE;
    }
}
