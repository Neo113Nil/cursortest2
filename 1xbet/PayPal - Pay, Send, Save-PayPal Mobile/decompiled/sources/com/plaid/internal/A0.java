package com.plaid.internal;

/* loaded from: classes16.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.InterfaceC0695y6 f5746a;

    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5747a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.b.values().length];
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.b.SINK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.b.HEADLESS_O_AUTH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f5747a = iArr;
            int[] iArr2 = new int[com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.values().length];
            try {
                iArr2[com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    @javax.inject.Inject
    public A0(com.plaid.internal.InterfaceC0695y6 interfaceC0695y6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0695y6, "");
        this.f5746a = interfaceC0695y6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.N2 n2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.B0 b0;
        int i;
        com.plaid.internal.r8 f;
        java.lang.Object a2;
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering;
        if (continuationImpl instanceof com.plaid.internal.B0) {
            b0 = (com.plaid.internal.B0) continuationImpl;
            int i2 = b0.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0.f = i2 - 2147483648;
                java.lang.Object obj = b0.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = b0.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (n2 instanceof com.plaid.internal.N2.e) {
                        return new com.plaid.internal.AbstractC0698z0.d(((com.plaid.internal.N2.e) n2).i());
                    }
                    if (n2 instanceof com.plaid.internal.N2.i) {
                        return new com.plaid.internal.AbstractC0698z0.c((com.plaid.internal.N2.i) n2);
                    }
                    if (n2 instanceof com.plaid.internal.N2.k) {
                        com.plaid.internal.N2.k kVar = (com.plaid.internal.N2.k) n2;
                        return kVar.m() ? kVar.i() == null ? a(new com.plaid.internal.D2("Can't open out of process webview without channel info"), n2.h()) : new com.plaid.internal.AbstractC0698z0.h(kVar.k(), kVar.l(), kVar.i()) : new com.plaid.internal.AbstractC0698z0.k(kVar.k(), kVar.l(), kVar.j());
                    }
                    if (n2 instanceof com.plaid.internal.N2.d) {
                        return new com.plaid.internal.AbstractC0698z0.b(((com.plaid.internal.N2.d) n2).i());
                    }
                    f = n2.f();
                    com.plaid.internal.InterfaceC0695y6 interfaceC0695y6 = this.f5746a;
                    b0.f5755a = this;
                    b0.b = n2;
                    b0.c = f;
                    b0.f = 1;
                    a2 = interfaceC0695y6.a(f, b0);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.plaid.internal.r8 r8Var = b0.c;
                    com.plaid.internal.N2 n22 = b0.b;
                    com.plaid.internal.A0 a0 = b0.f5755a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    a2 = obj;
                    f = r8Var;
                    n2 = n22;
                }
                pane$PaneRendering = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) a2;
                if (pane$PaneRendering != null) {
                    return a(new com.plaid.internal.C2("No pane in response"), n2.h());
                }
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.b renderingCase = pane$PaneRendering.getRenderingCase();
                int i3 = renderingCase == null ? -1 : com.plaid.internal.A0.a.f5747a[renderingCase.ordinal()];
                if (i3 == -1) {
                    return a(new com.plaid.internal.D2("Can't render pane because rendering is null"), n2.h());
                }
                if (i3 == 1) {
                    return a(pane$PaneRendering, n2);
                }
                if (i3 == 2) {
                    return new com.plaid.internal.AbstractC0698z0.i.a(f);
                }
                java.lang.String concat = "Native panes are no longer supported: ".concat(java.lang.String.valueOf(pane$PaneRendering.getRenderingCase()));
                pane$PaneRendering.getId();
                pane$PaneRendering.getPaneNodeId();
                return a(new com.plaid.internal.C2(concat), n2.h());
            }
        }
        b0 = new com.plaid.internal.B0(this, continuationImpl);
        java.lang.Object obj2 = b0.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = b0.f;
        if (i != 0) {
        }
        pane$PaneRendering = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) a2;
        if (pane$PaneRendering != null) {
        }
    }

    public static com.plaid.internal.AbstractC0698z0 a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering, com.plaid.internal.N2 n2) {
        java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppearList;
        if (pane$PaneRendering.hasSink()) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering sink = pane$PaneRendering.getSink();
            if (sink.hasResult()) {
                com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult result = sink.getResult();
                com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.Events events = sink.getEvents();
                if (events != null && (onAppearList = events.getOnAppearList()) != null) {
                    for (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent : onAppearList) {
                        kotlin.jvm.functions.Function2<com.plaid.link.event.LinkEvent, com.plaid.internal.I2, kotlin.Unit> linkEventListenerInternal$link_sdk_release = com.plaid.link.Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
                        if (linkEventListenerInternal$link_sdk_release != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(common$SDKEvent);
                            linkEventListenerInternal$link_sdk_release.invoke(com.plaid.internal.S6.a(common$SDKEvent), com.plaid.internal.I2.d.f5810a);
                        }
                    }
                }
                try {
                    com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b callback = result.getCallback();
                    int i = callback == null ? -1 : com.plaid.internal.A0.a.b[callback.ordinal()];
                    if (i == 1) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(result);
                        java.lang.String metadataJson = sink.getMetadataJson();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(metadataJson, "");
                        return new com.plaid.internal.AbstractC0698z0.j(a(result, metadataJson));
                    }
                    if (i == 2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(result);
                        java.lang.String a2 = com.plaid.internal.O2.a(n2);
                        java.lang.String errorJson = sink.getErrorJson();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorJson, "");
                        java.lang.String metadataJson2 = sink.getMetadataJson();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(metadataJson2, "");
                        return new com.plaid.internal.AbstractC0698z0.d(a(result, a2, errorJson, metadataJson2));
                    }
                    com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.b callback2 = result.getCallback();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Result type not supported by client: ");
                    sb.append(callback2);
                    throw new com.plaid.link.exception.LinkInvalidResultException(sb.toString());
                } catch (java.lang.Throwable th) {
                    return a(th, n2.h());
                }
            }
            pane$PaneRendering.getId();
            pane$PaneRendering.getPaneNodeId();
            return a(new com.plaid.internal.C2("Tried to convert sink pane but result was null"), n2.h());
        }
        pane$PaneRendering.getId();
        pane$PaneRendering.getPaneNodeId();
        return a(new com.plaid.internal.C2("Tried to get sink but didn't exist"), n2.h());
    }

    public static com.plaid.link.result.LinkExit a(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult sdkResult$SDKResult, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.plaid.link.result.LinkExitMetadata a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkResult$SDKResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        if (sdkResult$SDKResult.hasError() && !kotlin.jvm.internal.Intrinsics.areEqual(sdkResult$SDKResult.getError().getRequestId(), "")) {
            str = sdkResult$SDKResult.getError().getRequestId();
        }
        java.lang.String str4 = str;
        com.plaid.link.result.LinkError linkError = null;
        if (sdkResult$SDKResult.hasMetadata()) {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution institution = sdkResult$SDKResult.getMetadata().hasInstitution() ? sdkResult$SDKResult.getMetadata().getInstitution() : null;
            java.lang.String linkSessionId = sdkResult$SDKResult.getMetadata().getLinkSessionId();
            java.lang.String name2 = institution != null ? institution.getName() : null;
            java.lang.String institutionId = institution != null ? institution.getInstitutionId() : null;
            a2 = new com.plaid.link.result.LinkExitMetadata(com.plaid.link.result.LinkExitMetadataStatus.INSTANCE.fromString(sdkResult$SDKResult.getMetadata().getStatus()), (institutionId == null || institutionId.length() == 0 || name2 == null || name2.length() == 0) ? null : new com.plaid.link.result.LinkInstitution(institutionId, name2), linkSessionId, str4, str3);
        } else {
            a2 = com.plaid.internal.L2.a(55, str4);
        }
        com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Error error = sdkResult$SDKResult.hasError() ? sdkResult$SDKResult.getError() : null;
        if (error != null) {
            java.lang.String errorCode = error.getErrorCode();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorCode, "");
            java.lang.String errorMessage = error.getErrorMessage();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorMessage, "");
            java.lang.String displayMessage = error.getDisplayMessage();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            linkError = new com.plaid.link.result.LinkError(com.plaid.link.result.LinkErrorCode.INSTANCE.convert(errorCode), errorMessage, displayMessage, str2);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
        return new com.plaid.link.result.LinkExit(linkError, a2);
    }

    public static com.plaid.link.result.LinkSuccess a(com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult sdkResult$SDKResult, java.lang.String str) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkResult$SDKResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (sdkResult$SDKResult.hasMetadata()) {
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult.Metadata metadata = sdkResult$SDKResult.getMetadata();
            kotlin.jvm.internal.Intrinsics.checkNotNull(metadata);
            java.util.List<com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account> accountsList = metadata.getAccountsList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(accountsList, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(accountsList, 10));
            java.util.Iterator<T> it = accountsList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account account = (com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Account) it.next();
                java.lang.String id = account.getId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
                java.lang.String name2 = account.getName();
                java.lang.String mask = account.getMask();
                com.plaid.link.result.LinkAccountSubtype convert = com.plaid.link.result.LinkAccountSubtype.INSTANCE.convert(account.getSubtype(), account.getType());
                java.lang.String verificationStatus = account.getVerificationStatus();
                if (verificationStatus != null && verificationStatus.length() != 0) {
                    str2 = account.getVerificationStatus();
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(convert, "");
                arrayList.add(new com.plaid.link.result.LinkAccount(id, name2, mask, convert, com.plaid.link.result.LinkAccountVerificationStatus.INSTANCE.convert(str2), null, 32, null));
            }
            com.plaid.internal.core.protos.link.workflow.primitives.SdkResult.SDKResult.Metadata.Institution institution = metadata.hasInstitution() ? metadata.getInstitution() : null;
            java.lang.String institutionId = institution != null ? institution.getInstitutionId() : null;
            str2 = institution != null ? institution.getName() : null;
            java.lang.String linkSessionId = metadata.getLinkSessionId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linkSessionId, "");
            com.plaid.link.result.LinkSuccessMetadata a2 = com.plaid.internal.L2.a(arrayList, institutionId, str2, linkSessionId, str);
            java.lang.String publicToken = sdkResult$SDKResult.getPublicToken();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publicToken, "");
            return com.plaid.internal.L2.a(publicToken, a2);
        }
        throw new com.plaid.link.exception.LinkException("Was successful but returned no data: ".concat(java.lang.String.valueOf(sdkResult$SDKResult)));
    }

    public static com.plaid.internal.AbstractC0698z0.d a(java.lang.Throwable th, java.lang.String str) {
        com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, th);
        return new com.plaid.internal.AbstractC0698z0.d(com.plaid.internal.L2.b(th, str));
    }
}
