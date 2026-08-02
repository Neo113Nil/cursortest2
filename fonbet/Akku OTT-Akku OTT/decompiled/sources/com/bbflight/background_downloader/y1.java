package com.bbflight.background_downloader;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@DebugMetadata(c = "com.bbflight.background_downloader.UploadTaskWorker$processBinaryUpload$3", f = "UploadTaskWorker.kt", i = {0, 0, 0, 0, 0, 0}, l = {216}, m = "invokeSuspend", n = {"fis", "limitedInputStream", "outputStream", "$i$a$-use-UploadTaskWorker$processBinaryUpload$3$1", "$i$a$-use-UploadTaskWorker$processBinaryUpload$3$1$1", "$i$a$-use-UploadTaskWorker$processBinaryUpload$3$1$1$1"}, nl = {215}, s = {"L$1", "L$3", "L$5", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes3.dex */
public final class y1 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super W0>, Object> {
    public InputStream a;
    public Object b;
    public C0652j0 c;
    public Object d;
    public DataOutputStream e;
    public Object f;
    public int i;
    public final /* synthetic */ InputStream j;
    public final /* synthetic */ String k;
    public final /* synthetic */ Ref.LongRef l;
    public final /* synthetic */ long m;
    public final /* synthetic */ HttpURLConnection n;
    public final /* synthetic */ UploadTaskWorker o;
    public final /* synthetic */ Long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(InputStream inputStream, String str, Ref.LongRef longRef, long j, HttpURLConnection httpURLConnection, UploadTaskWorker uploadTaskWorker, Long l, Continuation<? super y1> continuation) {
        super(2, continuation);
        this.j = inputStream;
        this.k = str;
        this.l = longRef;
        this.m = j;
        this.n = httpURLConnection;
        this.o = uploadTaskWorker;
        this.p = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new y1(this.j, this.k, this.l, this.m, this.n, this.o, this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super W0> continuation) {
        return ((y1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        C0652j0 c0652j0;
        InputStream inputStream;
        Throwable th2;
        Throwable th3;
        DataOutputStream dataOutputStream;
        InputStream inputStream2;
        C0652j0 c0652j02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.i;
        ?? r2 = 1;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.LongRef longRef = this.l;
                long j = this.m;
                HttpURLConnection httpURLConnection = this.n;
                UploadTaskWorker uploadTaskWorker = this.o;
                Long l = this.p;
                inputStream = this.j;
                String str = this.k;
                if (str != null) {
                    try {
                        inputStream.skip(longRef.element);
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                }
                c0652j0 = new C0652j0(inputStream, j);
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
                    DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192));
                    if (str == null) {
                        try {
                            j = l.longValue();
                        } catch (Throwable th5) {
                            th3 = th5;
                            r2 = c0652j0;
                            dataOutputStream = dataOutputStream2;
                            inputStream2 = inputStream;
                            throw th3;
                        }
                    }
                    long j2 = j;
                    M0 k = uploadTaskWorker.k();
                    this.a = inputStream;
                    this.b = SpillingKt.nullOutSpilledVariable(inputStream);
                    this.c = c0652j0;
                    this.d = SpillingKt.nullOutSpilledVariable(c0652j0);
                    this.e = dataOutputStream2;
                    this.f = SpillingKt.nullOutSpilledVariable(dataOutputStream2);
                    this.i = 1;
                    obj = uploadTaskWorker.p(c0652j0, dataOutputStream2, j2, k, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c0652j02 = c0652j0;
                    dataOutputStream = dataOutputStream2;
                    inputStream2 = inputStream;
                } catch (Throwable th6) {
                    th = th6;
                    try {
                        throw th;
                    } finally {
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dataOutputStream = this.e;
                C0652j0 c0652j03 = this.c;
                inputStream2 = this.a;
                try {
                    ResultKt.throwOnFailure(obj);
                    c0652j02 = c0652j03;
                } catch (Throwable th7) {
                    th3 = th7;
                    r2 = c0652j03;
                    try {
                        throw th3;
                    } finally {
                    }
                }
            }
            CloseableKt.closeFinally(dataOutputStream, null);
            try {
                CloseableKt.closeFinally(c0652j02, null);
                CloseableKt.closeFinally(inputStream2, null);
                return obj;
            } catch (Throwable th8) {
                th2 = th8;
                inputStream = inputStream2;
                throw th2;
            }
        } catch (Throwable th9) {
            th = th9;
            c0652j0 = r2;
            inputStream = inputStream2;
        }
    }
}
