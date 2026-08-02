package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class u1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.dyneti.android.dyscan.w1 f3345a;
    public final /* synthetic */ com.dyneti.android.dyscan.n2 b;

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.dyneti.android.dyscan.u1(this.f3345a, this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        javax.net.ssl.HttpsURLConnection httpsURLConnection = null;
        try {
            javax.net.ssl.HttpsURLConnection a2 = com.dyneti.android.dyscan.w1.a(this.f3345a);
            try {
                java.io.OutputStream outputStream = a2.getOutputStream();
                java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream, "UTF-8"));
                bufferedWriter.write(this.b.f3326a.toString());
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                java.io.InputStream errorStream = a2.getResponseCode() >= 400 ? a2.getErrorStream() : a2.getInputStream();
                kotlin.jvm.internal.Intrinsics.checkNotNull(errorStream);
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(errorStream, kotlin.text.Charsets.UTF_8), 8192);
                try {
                    kotlin.io.TextStreamsKt.readText(bufferedReader);
                    kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                    a2.disconnect();
                    z = true;
                } finally {
                }
            } catch (java.lang.Exception unused) {
                httpsURLConnection = a2;
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                z = false;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            } catch (java.lang.Throwable th) {
                th = th;
                httpsURLConnection = a2;
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
        } catch (java.lang.Exception unused2) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.dyneti.android.dyscan.u1(this.f3345a, this.b, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.dyneti.android.dyscan.w1 w1Var, com.dyneti.android.dyscan.n2 n2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f3345a = w1Var;
        this.b = n2Var;
    }
}
