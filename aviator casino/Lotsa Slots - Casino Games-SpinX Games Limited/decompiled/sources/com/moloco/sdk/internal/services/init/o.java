package com.moloco.sdk.internal.services.init;

/* loaded from: classes5.dex */
public final class o implements com.moloco.sdk.internal.services.init.n {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7302a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7303a;

        static {
            int[] iArr = new int[com.moloco.sdk.internal.services.init.b.values().length];
            try {
                iArr[com.moloco.sdk.internal.services.init.b.f.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.internal.services.init.b.f7281a.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.internal.services.init.b.b.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.moloco.sdk.internal.services.init.b.c.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.moloco.sdk.internal.services.init.b.d.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.moloco.sdk.internal.services.init.b.e.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            f7303a = iArr;
        }
    }

    public o(java.lang.String endpoint, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d httpRequestClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestClient, "httpRequestClient");
        this.f7302a = endpoint;
        this.b = httpRequestClient;
    }

    @Override // com.moloco.sdk.internal.services.init.n
    public java.lang.Object a(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.internal.MolocoLogger molocoLogger;
        try {
            molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
            com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.services.init.p.f7304a, "Reporting InitTracking success", false, 4, null);
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.p.f7304a, "Failed to send notifySuccess post request", e, false, 8, null);
        }
        if (this.f7302a.length() == 0) {
            com.moloco.sdk.internal.MolocoLogger.debug$default(molocoLogger, com.moloco.sdk.internal.services.init.p.f7304a, "SDK InitTracking disabled", false, 4, null);
            return kotlin.Unit.INSTANCE;
        }
        android.net.Uri build = android.net.Uri.parse(this.f7302a).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d dVar = this.b;
        java.lang.String uri = build.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.a.a(dVar, uri, a(j), io.ktor.http.ContentType.Application.INSTANCE.getProtoBuf(), null, 8, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.internal.services.init.n
    public java.lang.Object a(com.moloco.sdk.internal.services.init.j jVar, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        try {
            if (jVar instanceof com.moloco.sdk.internal.services.init.j.a) {
                com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.p.f7304a, "Reporting InitTracking client failure: " + ((com.moloco.sdk.internal.services.init.j.a) jVar).a(), false, 4, null);
            } else {
                if (!(jVar instanceof com.moloco.sdk.internal.services.init.j.b)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.p.f7304a, "Reporting InitTracking server failure: " + ((com.moloco.sdk.internal.services.init.j.b) jVar).a(), false, 4, null);
            }
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.p.f7304a, "Failed to send notifyFailure post request", e, false, 8, null);
        }
        if (this.f7302a.length() == 0) {
            com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.p.f7304a, "SDK InitTracking disabled", false, 4, null);
            return kotlin.Unit.INSTANCE;
        }
        android.net.Uri build = android.net.Uri.parse(this.f7302a).buildUpon().build();
        byte[] a2 = a(jVar, j);
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d dVar = this.b;
        java.lang.String uri = build.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.a.a(dVar, uri, a2, io.ktor.http.ContentType.Application.INSTANCE.getProtoBuf(), null, 8, null);
        return kotlin.Unit.INSTANCE;
    }

    public final byte[] a(long j) {
        com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder newBuilder = com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.newBuilder();
        newBuilder.setLatencyMs(j);
        newBuilder.setSuccess(com.moloco.sdk.MetricsRequest.SDKInitSuccessTrackingRequest.newBuilder().build());
        byte[] byteArray = newBuilder.build().toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final byte[] a(com.moloco.sdk.internal.services.init.j jVar, long j) {
        com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.Builder newBuilder = com.moloco.sdk.MetricsRequest.SDKInitTrackingRequest.newBuilder();
        com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.Builder newBuilder2 = com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.newBuilder();
        if (jVar instanceof com.moloco.sdk.internal.services.init.j.a) {
            com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.Builder newBuilder3 = com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.newBuilder();
            newBuilder3.setClientFailureType(a(((com.moloco.sdk.internal.services.init.j.a) jVar).a()));
            newBuilder2.setClientError(newBuilder3.build());
        } else if (jVar instanceof com.moloco.sdk.internal.services.init.j.b) {
            com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.Builder newBuilder4 = com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ServerError.newBuilder();
            newBuilder4.setServerHttpStatus(((com.moloco.sdk.internal.services.init.j.b) jVar).a());
            newBuilder2.setServerError(newBuilder4.build());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        newBuilder.setFailure(newBuilder2.build());
        newBuilder.setLatencyMs(j);
        byte[] byteArray = newBuilder.build().toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes a(com.moloco.sdk.internal.services.init.b bVar) {
        switch (com.moloco.sdk.internal.services.init.o.a.f7303a[bVar.ordinal()]) {
            case 1:
                return com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.UNKNOWN;
            case 2:
                return com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.HTTP_REQUEST_TIMEOUT;
            case 3:
                return com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.HTTP_UKNOWN_HOST;
            case 4:
                return com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.HTTP_SOCKET;
            case 5:
                return com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.HTTP_SSL_ERROR;
            case 6:
                return com.moloco.sdk.MetricsRequest.SDKInitFailureTrackingRequest.ClientError.ClientErrorTypes.ANDROID_WORK_MANAGER_ISSUE;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
