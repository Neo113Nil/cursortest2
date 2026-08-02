package com.bbflight.background_downloader;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbflight/background_downloader/DataTaskWorker;", "Lcom/bbflight/background_downloader/TaskWorker;", "applicationContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "process", "Lcom/bbflight/background_downloader/TaskStatus;", "connection", "Ljava/net/HttpURLConnection;", "filePath", "", "(Ljava/net/HttpURLConnection;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "background_downloader_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DataTaskWorker extends TaskWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataTaskWorker(Context applicationContext, WorkerParameters workerParams) {
        super(applicationContext, workerParams);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // com.bbflight.background_downloader.TaskWorker
    public final Object l(HttpURLConnection httpURLConnection, String str, Continuation<? super W0> continuation) {
        this.t = Boxing.boxInt(httpURLConnection.getResponseCode());
        int responseCode = httpURLConnection.getResponseCode();
        if (200 > responseCode || responseCode >= 207) {
            httpURLConnection.getResponseCode();
            String str2 = k().a;
            String m = TaskWorker.m(httpURLConnection);
            W w = W.i;
            int responseCode2 = httpURLConnection.getResponseCode();
            String responseMessage = (m == null || m.length() <= 0) ? httpURLConnection.getResponseMessage() : m;
            Intrinsics.checkNotNull(responseMessage);
            this.q = new P0(w, responseCode2, responseMessage);
            if (httpURLConnection.getResponseCode() != 404) {
                return W0.f;
            }
            this.r = m;
            return W0.e;
        }
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
        i(headerFields);
        Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
        Intrinsics.checkNotNullExpressionValue(headerFields2, "getHeaderFields(...)");
        h(headerFields2);
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
            this.r = TextStreamsKt.readText(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192));
            return W0.d;
        } catch (Exception e) {
            e.toString();
            this.q = new P0(W.e, "Could not read response content: " + e, 2);
            return W0.f;
        }
    }
}
