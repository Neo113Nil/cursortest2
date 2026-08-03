package com.vungle.ads.internal.omsdk;

/* compiled from: OMInjector.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000f\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\u000eJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0016J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u0014H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/internal/omsdk/OMInjector;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cachedOMSDKJS", "Ljava/util/concurrent/atomic/AtomicReference;", "", "cachedOMSessionJS", "getContext", "()Landroid/content/Context;", "uiHandler", "Landroid/os/Handler;", "getOMSDKJS", "getOMSDKJS$vungle_ads_release", "getOMSessionJS", com.ironsource.X3.a.f, "", "injectJsFiles", "", "Ljava/io/File;", "dir", "injectJsFiles$vungle_ads_release", "loadJsFromRaw", "resId", "", "writeToFile", "lines", "outputFile", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class OMInjector {
    private static final java.lang.String TAG = "OMInjector";
    private java.util.concurrent.atomic.AtomicReference<java.lang.String> cachedOMSDKJS;
    private java.util.concurrent.atomic.AtomicReference<java.lang.String> cachedOMSessionJS;
    private final android.content.Context context;
    private final android.os.Handler uiHandler;

    public OMInjector(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.uiHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.cachedOMSDKJS = new java.util.concurrent.atomic.AtomicReference<>(null);
        this.cachedOMSessionJS = new java.util.concurrent.atomic.AtomicReference<>(null);
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final void init() {
        this.uiHandler.post(new java.lang.Runnable() { // from class: com.vungle.ads.internal.omsdk.OMInjector$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.omsdk.OMInjector.m10447init$lambda2(com.vungle.ads.internal.omsdk.OMInjector.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-2, reason: not valid java name */
    public static final void m10447init$lambda2(com.vungle.ads.internal.omsdk.OMInjector this$0) {
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (!com.iab.omid.library.vungle.Omid.isActive()) {
                com.iab.omid.library.vungle.Omid.activate(this$0.context);
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl != null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "error: " + m10801exceptionOrNullimpl.getLocalizedMessage());
        }
    }

    public final java.util.List<java.io.File> injectJsFiles$vungle_ads_release(java.io.File dir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.File file = new java.io.File(dir, com.vungle.ads.internal.Constants.OM_SDK_JS);
        if (!file.exists()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "injecting omsdk.js to " + file.getAbsolutePath());
            java.lang.String oMSDKJS$vungle_ads_release = getOMSDKJS$vungle_ads_release();
            if (oMSDKJS$vungle_ads_release != null) {
                writeToFile(oMSDKJS$vungle_ads_release, file);
            }
            arrayList.add(file);
        }
        java.io.File file2 = new java.io.File(dir, com.vungle.ads.internal.Constants.OM_SESSION_JS);
        if (!file2.exists()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "injecting omsdk-session.js to " + file2.getAbsolutePath());
            java.lang.String oMSessionJS = getOMSessionJS();
            if (oMSessionJS != null) {
                writeToFile(oMSessionJS, file2);
            }
            arrayList.add(file2);
        }
        return arrayList;
    }

    public final java.lang.String getOMSDKJS$vungle_ads_release() {
        java.lang.String str = this.cachedOMSDKJS.get();
        if (str != null) {
            return str;
        }
        java.lang.String loadJsFromRaw = loadJsFromRaw(com.vungle.ads.R.raw.omsdk_v1_6_2);
        this.cachedOMSDKJS.set(loadJsFromRaw);
        return loadJsFromRaw;
    }

    private final java.lang.String getOMSessionJS() {
        java.lang.String str = this.cachedOMSessionJS.get();
        if (str != null) {
            return str;
        }
        java.lang.String loadJsFromRaw = loadJsFromRaw(com.vungle.ads.R.raw.omid_session_client_v1_6_2);
        this.cachedOMSessionJS.set(loadJsFromRaw);
        return loadJsFromRaw;
    }

    private final java.lang.String loadJsFromRaw(int resId) {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.omsdk.OMInjector oMInjector = this;
            java.io.InputStream openRawResource = this.context.getResources().openRawResource(resId);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openRawResource, "context.resources.openRawResource(resId)");
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(openRawResource, kotlin.text.Charsets.UTF_8);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            try {
                java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(readText);
            } finally {
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return (java.lang.String) (kotlin.Result.m10804isFailureimpl(m10798constructorimpl) ? null : m10798constructorimpl);
    }

    private final java.io.File writeToFile(java.lang.String lines, java.io.File outputFile) {
        if (lines == null) {
            throw new java.io.IOException("omsdk js must not be null");
        }
        java.io.FileWriter fileWriter = new java.io.FileWriter(outputFile);
        try {
            java.io.FileWriter fileWriter2 = fileWriter;
            fileWriter2.write(lines);
            fileWriter2.flush();
            kotlin.io.CloseableKt.closeFinally(fileWriter, null);
            return outputFile;
        } finally {
        }
    }
}
