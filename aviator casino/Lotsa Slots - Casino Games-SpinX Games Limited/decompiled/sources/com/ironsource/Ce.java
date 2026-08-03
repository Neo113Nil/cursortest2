package com.ironsource;

/* loaded from: classes5.dex */
public final class Ce implements com.ironsource.Cc {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.Ce f5659a = new com.ironsource.Ce();
    private static final com.ironsource.Fe b = new com.ironsource.Fe();

    public static final class a implements com.ironsource.InterfaceC3297te {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.InterfaceC3297te f5660a;

        a(com.ironsource.InterfaceC3297te interfaceC3297te) {
            this.f5660a = interfaceC3297te;
        }

        @Override // com.ironsource.InterfaceC3297te
        public void a(final com.ironsource.C3190ne sdkConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            com.ironsource.Fe fe = com.ironsource.Ce.b;
            final com.ironsource.InterfaceC3297te interfaceC3297te = this.f5660a;
            fe.c(new java.lang.Runnable() { // from class: com.ironsource.Ce$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.Ce.a.a(com.ironsource.C3190ne.this, interfaceC3297te);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.ironsource.C3190ne sdkConfig, com.ironsource.InterfaceC3297te listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
            com.ironsource.Ce.f5659a.a(sdkConfig, listener);
        }

        @Override // com.ironsource.InterfaceC3297te
        public void a(final com.ironsource.C3226pe error, final com.ironsource.C2988c9 c2988c9) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.ironsource.Fe fe = com.ironsource.Ce.b;
            final com.ironsource.InterfaceC3297te interfaceC3297te = this.f5660a;
            fe.b(new java.lang.Runnable() { // from class: com.ironsource.Ce$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.Ce.a.a(com.ironsource.InterfaceC3297te.this, error, c2988c9);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.ironsource.InterfaceC3297te listener, com.ironsource.C3226pe error, com.ironsource.C2988c9 c2988c9) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
            listener.a(error, c2988c9);
        }
    }

    private Ce() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(android.content.Context context, com.ironsource.C3333ve initRequest, com.ironsource.InterfaceC3297te listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        new com.ironsource.T9().a(com.ironsource.EnumC3315ue.LEVEL_PLAY_INIT);
        f5659a.a(context, initRequest, listener, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(android.content.Context context, com.ironsource.C3333ve initRequest, com.ironsource.InterfaceC3297te listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        com.ironsource.mediationsdk.p h = com.ironsource.mediationsdk.p.h();
        java.lang.String d = initRequest.d();
        com.ironsource.mediationsdk.IronSource.a[] aVarArr = (com.ironsource.mediationsdk.IronSource.a[]) initRequest.e().toArray(new com.ironsource.mediationsdk.IronSource.a[0]);
        java.util.List<com.ironsource.mediationsdk.IronSource.a> validAdUnitsList = h.a(context, d, false, (com.ironsource.mediationsdk.IronSource.a[]) java.util.Arrays.copyOf(aVarArr, aVarArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(validAdUnitsList, "validAdUnitsList");
        initRequest.a(validAdUnitsList);
        new com.ironsource.T9().a(com.ironsource.EnumC3315ue.EXTERNAL_MEDIATION_INIT);
        f5659a.a(context, initRequest, listener, true);
    }

    public final void c(final android.content.Context context, final com.ironsource.C3333ve initRequest, final com.ironsource.InterfaceC3297te listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        b.d(new java.lang.Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Ce.d(context, initRequest, listener);
            }
        });
    }

    @Override // com.ironsource.Cc
    public void onInitFailed(final com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        b.c(new java.lang.Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Ce.a(com.ironsource.mediationsdk.logger.IronSourceError.this);
            }
        });
    }

    public final void a(final android.content.Context context, final com.ironsource.C3333ve initRequest, final com.ironsource.InterfaceC3297te listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        b.d(new java.lang.Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Ce.b(context, initRequest, listener);
            }
        });
    }

    private final void a(android.content.Context context, com.ironsource.C3333ve c3333ve, final com.ironsource.InterfaceC3297te interfaceC3297te, boolean z) {
        java.lang.String f = c3333ve.f();
        if (f != null && f.length() > 0) {
            com.ironsource.mediationsdk.p.h().j(c3333ve.f());
        } else {
            c3333ve = new com.ironsource.C3333ve(c3333ve.d(), com.ironsource.mediationsdk.p.h().j(), kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) c3333ve.e()));
        }
        com.ironsource.mediationsdk.p h = com.ironsource.mediationsdk.p.h();
        java.lang.String d = c3333ve.d();
        com.ironsource.mediationsdk.IronSource.a[] aVarArr = (com.ironsource.mediationsdk.IronSource.a[]) c3333ve.e().toArray(new com.ironsource.mediationsdk.IronSource.a[0]);
        final com.ironsource.mediationsdk.logger.IronSourceError a2 = h.a(context, d, z, this, (com.ironsource.mediationsdk.IronSource.a[]) java.util.Arrays.copyOf(aVarArr, aVarArr.length));
        if (a2 != null && a2.getErrorCode() != 2020) {
            if (a2.getErrorCode() == 2040) {
                com.ironsource.Ve e = com.ironsource.mediationsdk.p.h().e();
                if (e != null) {
                    a(new com.ironsource.C3190ne(new com.ironsource.C3351we(e), null, null, 6, null), interfaceC3297te);
                    return;
                }
            } else if (a2.getErrorCode() == 2030) {
                com.ironsource.Be.l.a().d();
                return;
            }
            b.b(new java.lang.Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.Ce.a(com.ironsource.InterfaceC3297te.this, a2);
                }
            });
            return;
        }
        com.ironsource.Be.l.a().a(context, c3333ve, new com.ironsource.Ce.a(interfaceC3297te));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.Ve serverResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        com.ironsource.Be.l.a().a(new com.ironsource.C3351we(serverResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.InterfaceC3297te listener, com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(error, "error");
        com.ironsource.InterfaceC3297te.CC.a(listener, new com.ironsource.C3226pe(error), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final com.ironsource.C3190ne c3190ne, final com.ironsource.InterfaceC3297te interfaceC3297te) {
        if (!com.ironsource.mediationsdk.p.h().a(false, c3190ne.d())) {
            b.b(new java.lang.Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.Ce.a(com.ironsource.InterfaceC3297te.this);
                }
            });
        } else {
            b.b(new java.lang.Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.Ce.a(com.ironsource.InterfaceC3297te.this, c3190ne);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.InterfaceC3297te listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        com.ironsource.InterfaceC3297te.CC.a(listener, new com.ironsource.C3226pe(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.InterfaceC3297te listener, com.ironsource.C3190ne sdkInitResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInitResponse, "$sdkInitResponse");
        listener.a(sdkInitResponse);
    }

    @Override // com.ironsource.Cc
    public void a(final com.ironsource.Ve serverResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        b.c(new java.lang.Runnable() { // from class: com.ironsource.Ce$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Ce.b(com.ironsource.Ve.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        com.ironsource.Be.l.a().a(new com.ironsource.C3226pe(error));
    }
}
