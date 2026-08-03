package com.facebook;

/* compiled from: GraphRequestAsyncTask.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 #2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001#B\u001b\b\u0016\u0012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0002\u0010\bB\u0015\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0002\u0010\fB%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0002\u0010\u000fB\u001f\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\u0010\u0010B\u0017\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0002\u0010\u0011J)\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\"\u00020\u0002H\u0017¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0014J\b\u0010 \u001a\u00020\u001eH\u0017J\b\u0010!\u001a\u00020\"H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142\u000e\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/facebook/GraphRequestAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/facebook/GraphResponse;", "requests", "", "Lcom/facebook/GraphRequest;", "([Lcom/facebook/GraphRequest;)V", "", "(Ljava/util/Collection;)V", "Lcom/facebook/GraphRequestBatch;", "(Lcom/facebook/GraphRequestBatch;)V", "connection", "Ljava/net/HttpURLConnection;", "(Ljava/net/HttpURLConnection;[Lcom/facebook/GraphRequest;)V", "(Ljava/net/HttpURLConnection;Ljava/util/Collection;)V", "(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)V", "<set-?>", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "getException", "()Ljava/lang/Exception;", "getRequests", "()Lcom/facebook/GraphRequestBatch;", "doInBackground", "params", "([Ljava/lang/Void;)Ljava/util/List;", "onPostExecute", "", "result", "onPreExecute", "toString", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class GraphRequestAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.facebook.GraphResponse>> {
    private static final java.lang.String TAG = com.facebook.GraphRequestAsyncTask.class.getCanonicalName();
    private final java.net.HttpURLConnection connection;
    private java.lang.Exception exception;
    private final com.facebook.GraphRequestBatch requests;

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ java.util.List<? extends com.facebook.GraphResponse> doInBackground(java.lang.Void[] voidArr) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return null;
                }
                try {
                    return doInBackground2(voidArr);
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
                return null;
            }
        } catch (java.lang.Throwable th3) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th3, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(java.util.List<? extends com.facebook.GraphResponse> list) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    onPostExecute2((java.util.List<com.facebook.GraphResponse>) list);
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
            }
        } catch (java.lang.Throwable th3) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th3, this);
        }
    }

    public final com.facebook.GraphRequestBatch getRequests() {
        return this.requests;
    }

    public GraphRequestAsyncTask(java.net.HttpURLConnection httpURLConnection, com.facebook.GraphRequestBatch requests) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
        this.connection = httpURLConnection;
        this.requests = requests;
    }

    protected final java.lang.Exception getException() {
        return this.exception;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(com.facebook.GraphRequest... requests) {
        this((java.net.HttpURLConnection) null, new com.facebook.GraphRequestBatch((com.facebook.GraphRequest[]) java.util.Arrays.copyOf(requests, requests.length)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(java.util.Collection<com.facebook.GraphRequest> requests) {
        this((java.net.HttpURLConnection) null, new com.facebook.GraphRequestBatch(requests));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(com.facebook.GraphRequestBatch requests) {
        this((java.net.HttpURLConnection) null, requests);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(java.net.HttpURLConnection httpURLConnection, com.facebook.GraphRequest... requests) {
        this(httpURLConnection, new com.facebook.GraphRequestBatch((com.facebook.GraphRequest[]) java.util.Arrays.copyOf(requests, requests.length)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(java.net.HttpURLConnection httpURLConnection, java.util.Collection<com.facebook.GraphRequest> requests) {
        this(httpURLConnection, new com.facebook.GraphRequestBatch(requests));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
    }

    public java.lang.String toString() {
        java.lang.String str = "{RequestAsyncTask:  connection: " + this.connection + ", requests: " + this.requests + "}";
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        android.os.Handler handler;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    super.onPreExecute();
                    com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                    if (com.facebook.FacebookSdk.isDebugEnabled()) {
                        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                        java.lang.String str = TAG;
                        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                        java.lang.String format = java.lang.String.format("execute async task: %s", java.util.Arrays.copyOf(new java.lang.Object[]{this}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        com.facebook.internal.Utility.logd(str, format);
                    }
                    if (this.requests.getCallbackHandler() == null) {
                        if (java.lang.Thread.currentThread() instanceof android.os.HandlerThread) {
                            handler = new android.os.Handler();
                        } else {
                            handler = new android.os.Handler(android.os.Looper.getMainLooper());
                        }
                        this.requests.setCallbackHandler(handler);
                    }
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
            }
        } catch (java.lang.Throwable th3) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th3, this);
        }
    }

    /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
    protected void onPostExecute2(java.util.List<com.facebook.GraphResponse> result) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
                    super.onPostExecute((com.facebook.GraphRequestAsyncTask) result);
                    java.lang.Exception exc = this.exception;
                    if (exc != null) {
                        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                        java.lang.String str = TAG;
                        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                        java.lang.String format = java.lang.String.format("onPostExecute: exception encountered during request: %s", java.util.Arrays.copyOf(new java.lang.Object[]{exc.getMessage()}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        com.facebook.internal.Utility.logd(str, format);
                    }
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
            }
        } catch (java.lang.Throwable th3) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th3, this);
        }
    }

    /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
    public java.util.List<com.facebook.GraphResponse> doInBackground2(java.lang.Void... params) {
        java.util.List<com.facebook.GraphResponse> executeConnectionAndWait;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                    return null;
                }
                try {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
                    try {
                        if (this.connection == null) {
                            executeConnectionAndWait = this.requests.executeAndWait();
                        } else {
                            executeConnectionAndWait = com.facebook.GraphRequest.INSTANCE.executeConnectionAndWait(this.connection, this.requests);
                        }
                        return executeConnectionAndWait;
                    } catch (java.lang.Exception e) {
                        this.exception = e;
                        return null;
                    }
                } catch (java.lang.Throwable th) {
                    com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th2, this);
                return null;
            }
        } catch (java.lang.Throwable th3) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th3, this);
            return null;
        }
    }
}
