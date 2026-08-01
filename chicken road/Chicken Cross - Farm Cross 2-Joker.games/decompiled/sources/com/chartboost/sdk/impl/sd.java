package com.chartboost.sdk.impl;

import com.chartboost.sdk.events.ChartboostError;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class sd implements m8 {
    public static final a c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f5008a;
    public final CoroutineDispatcher b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ File c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file, Continuation continuation) {
            super(2, continuation);
            this.c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                if (this.c.exists()) {
                    long length = this.c.length();
                    if (this.c.delete()) {
                        mb.d("Cleaned up temporary download file: " + this.c.getName(), null, 2, null);
                    } else {
                        mb.e("Temp file delete failed: file=" + this.c.getAbsolutePath() + ", fileSize=" + length, null, 2, null);
                    }
                }
            } catch (Exception e) {
                mb.b("Temp file cleanup error: file=" + this.c.getAbsolutePath() + ", errorType=" + e.getClass().getSimpleName(), e);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public /* synthetic */ Object g;
        public int i;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            Object a2 = sd.this.a(null, null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ ResponseBody d;
        public final /* synthetic */ File e;
        public final /* synthetic */ Ref.LongRef f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ResponseBody responseBody, File file, Ref.LongRef longRef, Continuation continuation) {
            super(2, continuation);
            this.d = responseBody;
            this.e = file;
            this.f = longRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.d, this.e, this.f, continuation);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.c;
            InputStream byteStream = this.d.byteStream();
            File file = this.e;
            Ref.LongRef longRef = this.f;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = byteStream.read(bArr);
                        if (read == -1) {
                            fileOutputStream.flush();
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileOutputStream, null);
                            CloseableKt.closeFinally(byteStream, null);
                            return unit;
                        }
                        CoroutineScopeKt.ensureActive(coroutineScope);
                        fileOutputStream.write(bArr, 0, read);
                        longRef.element += read;
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    public static final class e extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public /* synthetic */ Object h;
        public int j;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            Object a2 = sd.this.a(null, null, 0L, 0L, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ ResponseBody d;
        public final /* synthetic */ File e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;
        public final /* synthetic */ Ref.LongRef h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ResponseBody responseBody, File file, long j, long j2, Ref.LongRef longRef, Continuation continuation) {
            super(2, continuation);
            this.d = responseBody;
            this.e = file;
            this.f = j;
            this.g = j2;
            this.h = longRef;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = new f(this.d, this.e, this.f, this.g, this.h, continuation);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.c;
            InputStream byteStream = this.d.byteStream();
            File file = this.e;
            long j2 = this.f;
            long j3 = this.g;
            Ref.LongRef longRef = this.h;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    byte[] bArr = new byte[8192];
                    Ref.IntRef intRef = new Ref.IntRef();
                    long j4 = (j2 - j3) + 1;
                    do {
                        int read = byteStream.read(bArr);
                        intRef.element = read;
                        if (read == -1) {
                            break;
                        }
                        CoroutineScopeKt.ensureActive(coroutineScope);
                        long j5 = longRef.element;
                        int i = intRef.element;
                        if (i + j5 > j4) {
                            i = (int) (j4 - j5);
                        }
                        if (i <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        j = longRef.element + i;
                        longRef.element = j;
                    } while (j < j4);
                    fileOutputStream.flush();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    CloseableKt.closeFinally(byteStream, null);
                    return unit;
                } finally {
                }
            } finally {
            }
        }
    }

    public sd(OkHttpClient okHttpClient, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f5008a = okHttpClient;
        this.b = ioDispatcher;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(2:11|(7:13|14|15|(5:17|(1:19)|28|21|(1:27))|29|(1:31)|34)(2:36|37))(5:38|39|40|(1:42)|34))(4:44|45|46|47))(6:85|86|87|88|89|(2:91|(3:93|(1:95)|60)(2:96|97))(2:98|99))|48|49|(1:53)|54))|121|6|7|(0)(0)|48|49|(2:51|53)|54|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0220, code lost:
    
        if (r0 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0251, code lost:
    
        if (r1 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x029c, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x029a, code lost:
    
        if (r1 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0144, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0145, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0142, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x020f A[Catch: all -> 0x0082, TryCatch #2 {all -> 0x0082, blocks: (B:14:0x0047, B:15:0x020b, B:17:0x020f, B:19:0x0215, B:21:0x0224, B:23:0x022f, B:25:0x0237, B:27:0x023f, B:29:0x0241, B:39:0x005c, B:40:0x028a, B:46:0x0075), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194 A[Catch: all -> 0x02a2, TryCatch #1 {all -> 0x02a2, blocks: (B:63:0x0180, B:66:0x0190, B:68:0x0194, B:70:0x019b, B:71:0x01a5, B:76:0x0187, B:58:0x0258), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b A[Catch: all -> 0x02a2, TryCatch #1 {all -> 0x02a2, blocks: (B:63:0x0180, B:66:0x0190, B:68:0x0194, B:70:0x019b, B:71:0x01a5, B:76:0x0187, B:58:0x0258), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0187 A[Catch: all -> 0x02a2, TryCatch #1 {all -> 0x02a2, blocks: (B:63:0x0180, B:66:0x0190, B:68:0x0194, B:70:0x019b, B:71:0x01a5, B:76:0x0187, B:58:0x0258), top: B:7:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v3, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // com.chartboost.sdk.impl.m8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(URL url, File file, Continuation continuation) {
        c cVar;
        int i;
        ?? r8;
        Object obj;
        ResponseBody body;
        Ref.LongRef longRef;
        sd sdVar;
        Exception exc;
        Response response;
        CancellationException cancellationException;
        Response response2;
        ResponseBody body2;
        Object m8079constructorimpl;
        ResponseBody body3;
        String str;
        sd sdVar2 = this;
        URL url2 = url;
        File file2 = file;
        try {
            try {
                if (continuation instanceof c) {
                    cVar = (c) continuation;
                    int i2 = cVar.i;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        cVar.i = i2 - Integer.MIN_VALUE;
                        Object obj2 = cVar.g;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = cVar.i;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj2);
                            Request build = new Request.Builder().url(url2).get().build();
                            longRef = new Ref.LongRef();
                            try {
                                mb.d("Starting OkHttp download for " + url2 + " to " + file.getAbsolutePath(), null, 2, null);
                                r8 = sdVar2.f5008a.newCall(build).execute();
                                try {
                                    try {
                                    } catch (Throwable th) {
                                        th = th;
                                        if (r8 != 0 && (body = r8.body()) != null) {
                                            body.close();
                                        }
                                        throw th;
                                    }
                                } catch (CancellationException e2) {
                                    e = e2;
                                    mb.e("Download cancelled: url=" + url2 + ", bytesDownloaded=" + longRef.element, null, 2, null);
                                    cVar.b = r8;
                                    cVar.c = e;
                                    cVar.d = null;
                                    cVar.e = null;
                                    cVar.f = null;
                                    cVar.i = 2;
                                    if (sdVar2.a(file2, cVar) != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                } catch (Exception e3) {
                                    e = e3;
                                    sdVar = sdVar2;
                                    if (e instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                    }
                                    if (e instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                                    }
                                    if (r7 != null) {
                                    }
                                    mb.b("Download failed: url=" + url2 + ", bytesDownloaded=" + longRef.element + ", errorCategory=" + r6 + ", httpCode=" + (r7 != null ? Boxing.boxInt(r7.b()) : null) + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                    cVar.b = r8;
                                    cVar.c = e;
                                    cVar.d = null;
                                    cVar.e = null;
                                    cVar.f = null;
                                    cVar.i = 3;
                                    if (sdVar.a(file2, cVar) != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                }
                            } catch (CancellationException e4) {
                                e = e4;
                                r8 = 0;
                                sdVar2 = this;
                            } catch (Exception e5) {
                                e = e5;
                                sdVar = sdVar2;
                                r8 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                obj = null;
                                r8 = obj;
                                if (r8 != 0) {
                                    body.close();
                                }
                                throw th;
                            }
                            if (!r8.isSuccessful()) {
                                com.chartboost.sdk.internal.Networking.okhttp.a b2 = com.chartboost.sdk.internal.Networking.okhttp.a.c.b(r8.code());
                                String url3 = url.toString();
                                Intrinsics.checkNotNullExpressionValue(url3, "toString(...)");
                                throw x8.a(b2, url3);
                            }
                            ResponseBody body4 = r8.body();
                            if (body4 == null) {
                                throw new IOException("Response body was null for " + url2);
                            }
                            CoroutineDispatcher coroutineDispatcher = sdVar2.b;
                            d dVar = new d(body4, file2, longRef, null);
                            cVar.b = sdVar2;
                            cVar.c = url2;
                            cVar.d = file2;
                            cVar.e = r8;
                            cVar.f = longRef;
                            cVar.i = 1;
                            if (BuildersKt.withContext(coroutineDispatcher, dVar, cVar) != coroutine_suspended) {
                                sdVar = sdVar2;
                                r8 = r8;
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                cancellationException = (CancellationException) cVar.c;
                                response2 = (Response) cVar.b;
                                ResultKt.throwOnFailure(obj2);
                                Result.Companion companion = Result.INSTANCE;
                                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(cancellationException));
                                if (response2 != null) {
                                    body3 = response2.body();
                                }
                                return m8079constructorimpl;
                            }
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            exc = (Exception) cVar.c;
                            response = (Response) cVar.b;
                            ResultKt.throwOnFailure(obj2);
                            if (exc instanceof IOException) {
                                String message = exc.getMessage();
                                if (message != null) {
                                    str = message.toLowerCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                                }
                                str = "";
                                if (StringsKt.contains$default((CharSequence) str, (CharSequence) "no space left", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "insufficient storage", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "disk full", false, 2, (Object) null)) {
                                    exc = ChartboostError.Load.NoStorage.INSTANCE;
                                }
                            }
                            Result.Companion companion2 = Result.INSTANCE;
                            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(exc));
                            if (response != null) {
                                body3 = response.body();
                            }
                            return m8079constructorimpl;
                        }
                        Ref.LongRef longRef2 = (Ref.LongRef) cVar.f;
                        Response response3 = (Response) cVar.e;
                        File file3 = (File) cVar.d;
                        URL url4 = (URL) cVar.c;
                        sd sdVar3 = (sd) cVar.b;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            longRef = longRef2;
                            url2 = url4;
                            r8 = response3;
                            file2 = file3;
                            sdVar = sdVar3;
                        } catch (CancellationException e6) {
                            e = e6;
                            sdVar2 = sdVar3;
                            longRef = longRef2;
                            url2 = url4;
                            r8 = response3;
                            file2 = file3;
                            mb.e("Download cancelled: url=" + url2 + ", bytesDownloaded=" + longRef.element, null, 2, null);
                            cVar.b = r8;
                            cVar.c = e;
                            cVar.d = null;
                            cVar.e = null;
                            cVar.f = null;
                            cVar.i = 2;
                            if (sdVar2.a(file2, cVar) != coroutine_suspended) {
                                cancellationException = e;
                                response2 = r8;
                                Result.Companion companion3 = Result.INSTANCE;
                                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(cancellationException));
                                if (response2 != null) {
                                }
                                return m8079constructorimpl;
                            }
                            return coroutine_suspended;
                        } catch (Exception e7) {
                            e = e7;
                            longRef = longRef2;
                            url2 = url4;
                            r8 = response3;
                            file2 = file3;
                            sdVar = sdVar3;
                            String str2 = e instanceof com.chartboost.sdk.internal.Networking.okhttp.a ? "HTTP_ERROR" : e instanceof IOException ? "IO_ERROR" : "UNEXPECTED";
                            com.chartboost.sdk.internal.Networking.okhttp.a aVar = e instanceof com.chartboost.sdk.internal.Networking.okhttp.a ? (com.chartboost.sdk.internal.Networking.okhttp.a) e : null;
                            mb.b("Download failed: url=" + url2 + ", bytesDownloaded=" + longRef.element + ", errorCategory=" + str2 + ", httpCode=" + (aVar != null ? Boxing.boxInt(aVar.b()) : null) + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                            cVar.b = r8;
                            cVar.c = e;
                            cVar.d = null;
                            cVar.e = null;
                            cVar.f = null;
                            cVar.i = 3;
                            if (sdVar.a(file2, cVar) != coroutine_suspended) {
                                exc = e;
                                response = r8;
                                if (exc instanceof IOException) {
                                }
                                Result.Companion companion22 = Result.INSTANCE;
                                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(exc));
                                if (response != null) {
                                }
                                return m8079constructorimpl;
                            }
                            return coroutine_suspended;
                        }
                        mb.d("OkHttp download complete for " + url2 + " (" + longRef.element + " bytes)", null, 2, null);
                        Result.Companion companion4 = Result.INSTANCE;
                        Object m8079constructorimpl2 = Result.m8079constructorimpl(Boxing.boxLong(longRef.element));
                        if (r8 != 0 && (body2 = r8.body()) != null) {
                            body2.close();
                        }
                        return m8079constructorimpl2;
                    }
                }
                if (i != 0) {
                }
                mb.d("OkHttp download complete for " + url2 + " (" + longRef.element + " bytes)", null, 2, null);
                Result.Companion companion42 = Result.INSTANCE;
                Object m8079constructorimpl22 = Result.m8079constructorimpl(Boxing.boxLong(longRef.element));
                if (r8 != 0) {
                    body2.close();
                }
                return m8079constructorimpl22;
            } catch (Throwable th3) {
                th = th3;
                obj = "Starting OkHttp download for ";
            }
        } catch (Throwable th4) {
            th = th4;
            r8 = file2;
        }
        cVar = sdVar2.new c(continuation);
        Object obj22 = cVar.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(2:9|(2:11|(2:13|(7:15|16|17|(5:19|(1:21)|30|23|(1:29))|31|(1:33)|36)(2:38|39))(5:40|41|42|(1:44)|36))(4:46|47|48|49))(2:88|(2:90|91)(2:92|(2:94|95)(7:96|97|98|99|100|101|(4:103|(2:107|108)|109|(14:111|112|113|114|115|116|117|118|119|120|121|122|(1:124)|62)(3:150|151|152))(2:153|154))))|50|51|(1:55)|56))|173|6|7|(0)(0)|50|51|(2:53|55)|56|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x039c, code lost:
    
        if (r0 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x03cd, code lost:
    
        if (r1 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x042c, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x042a, code lost:
    
        if (r1 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0257, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0419, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0254, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02f0, code lost:
    
        r5 = "HTTP_ERROR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0300, code lost:
    
        r8 = (com.chartboost.sdk.internal.Networking.okhttp.a) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0307, code lost:
    
        r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0385, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0310, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0304, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02f5, code lost:
    
        if ((r0 instanceof java.io.IOException) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02f7, code lost:
    
        r5 = "IO_ERROR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02fa, code lost:
    
        r5 = "UNEXPECTED";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x038b A[Catch: all -> 0x00a4, TryCatch #3 {all -> 0x00a4, blocks: (B:16:0x0060, B:17:0x0386, B:19:0x038b, B:21:0x0391, B:23:0x03a0, B:25:0x03ab, B:27:0x03b3, B:29:0x03bb, B:31:0x03bd, B:41:0x0075, B:42:0x041a, B:48:0x0092, B:51:0x020b, B:65:0x02ec, B:68:0x02fc, B:70:0x0300, B:72:0x0307, B:73:0x0311, B:79:0x02f3, B:60:0x03dd), top: B:7:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0300 A[Catch: all -> 0x00a4, TryCatch #3 {all -> 0x00a4, blocks: (B:16:0x0060, B:17:0x0386, B:19:0x038b, B:21:0x0391, B:23:0x03a0, B:25:0x03ab, B:27:0x03b3, B:29:0x03bb, B:31:0x03bd, B:41:0x0075, B:42:0x041a, B:48:0x0092, B:51:0x020b, B:65:0x02ec, B:68:0x02fc, B:70:0x0300, B:72:0x0307, B:73:0x0311, B:79:0x02f3, B:60:0x03dd), top: B:7:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0307 A[Catch: all -> 0x00a4, TryCatch #3 {all -> 0x00a4, blocks: (B:16:0x0060, B:17:0x0386, B:19:0x038b, B:21:0x0391, B:23:0x03a0, B:25:0x03ab, B:27:0x03b3, B:29:0x03bb, B:31:0x03bd, B:41:0x0075, B:42:0x041a, B:48:0x0092, B:51:0x020b, B:65:0x02ec, B:68:0x02fc, B:70:0x0300, B:72:0x0307, B:73:0x0311, B:79:0x02f3, B:60:0x03dd), top: B:7:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f3 A[Catch: all -> 0x00a4, TryCatch #3 {all -> 0x00a4, blocks: (B:16:0x0060, B:17:0x0386, B:19:0x038b, B:21:0x0391, B:23:0x03a0, B:25:0x03ab, B:27:0x03b3, B:29:0x03bb, B:31:0x03bd, B:41:0x0075, B:42:0x041a, B:48:0x0092, B:51:0x020b, B:65:0x02ec, B:68:0x02fc, B:70:0x0300, B:72:0x0307, B:73:0x0311, B:79:0x02f3, B:60:0x03dd), top: B:7:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [okhttp3.OkHttpClient] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v20, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v4, types: [okhttp3.Request] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.chartboost.sdk.impl.sd] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [com.chartboost.sdk.impl.sd] */
    @Override // com.chartboost.sdk.impl.m8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(URL url, File file, long j, long j2, Continuation continuation) {
        e eVar;
        int i;
        ?? r14;
        ResponseBody body;
        String str;
        ?? build;
        String str2;
        ?? r7;
        Response response;
        File file2;
        Ref.LongRef longRef;
        String str3;
        String str4;
        sd sdVar;
        Response execute;
        ?? r5;
        f fVar;
        String str5;
        String str6;
        com.chartboost.sdk.internal.Networking.okhttp.a aVar;
        Integer num;
        ResponseBody body2;
        Object m8079constructorimpl;
        ResponseBody body3;
        String str7;
        URL url2 = url;
        ?? r4 = "Range request unsupported: url=";
        try {
            if (continuation instanceof e) {
                eVar = (e) continuation;
                int i2 = eVar.j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.j = i2 - Integer.MIN_VALUE;
                    e eVar2 = eVar;
                    Object obj = eVar2.h;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = eVar2.j;
                    Object obj2 = ")";
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (j < 0) {
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure(new IllegalArgumentException("startByte must be non-negative, got: " + j)));
                        }
                        if (j2 < j) {
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure(new IllegalArgumentException("endByte (" + j2 + ") must be >= startByte (" + j + ")")));
                        }
                        str = "bytes=" + j + "-" + j2;
                        build = new Request.Builder().url(url2).header("Range", str).get().build();
                        Ref.LongRef longRef2 = new Ref.LongRef();
                        try {
                            mb.d("Starting OkHttp partial download for " + url2 + " (" + str + ") to " + file.getAbsolutePath(), null, 2, null);
                            execute = this.f5008a.newCall(build).execute();
                            try {
                                r5 = execute.isSuccessful();
                                try {
                                    try {
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (CancellationException e2) {
                                    e = e2;
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            } catch (CancellationException e4) {
                                e = e4;
                                r4 = file;
                                obj2 = coroutine_suspended;
                                r5 = execute;
                                build = longRef2;
                            } catch (Exception e5) {
                                e = e5;
                                r4 = file;
                                obj2 = coroutine_suspended;
                                r5 = execute;
                                build = longRef2;
                                str2 = ", httpCode=";
                            } catch (Throwable th2) {
                                th = th2;
                                r5 = execute;
                            }
                        } catch (CancellationException e6) {
                            e = e6;
                            file2 = file;
                            obj2 = coroutine_suspended;
                            longRef = longRef2;
                            str3 = ", bytesDownloaded=";
                            str4 = ", range=";
                            response = null;
                            sdVar = this;
                            mb.e("Partial download cancelled: url=" + url2 + str4 + str + str3 + longRef.element, null, 2, null);
                            eVar2.b = response;
                            eVar2.c = e;
                            eVar2.d = null;
                            eVar2.e = null;
                            eVar2.f = null;
                            eVar2.g = null;
                            eVar2.j = 2;
                            if (sdVar.a(file2, eVar2) != obj2) {
                            }
                            return obj2;
                        } catch (Exception e7) {
                            e = e7;
                            r4 = file;
                            obj2 = coroutine_suspended;
                            build = longRef2;
                            str2 = ", httpCode=";
                            r7 = this;
                            response = null;
                        } catch (Throwable th3) {
                            th = th3;
                            r14 = 0;
                        }
                        if (r5 != 0) {
                            if (execute.code() != 206 && j > 0) {
                                mb.e("Range request unsupported: url=" + url2 + ", httpCode=" + execute.code() + ", requestedRange=" + str, null, 2, null);
                                throw new IOException("Server doesn't support range requests for partial download");
                            }
                            ResponseBody body4 = execute.body();
                            if (body4 != null) {
                                CoroutineDispatcher coroutineDispatcher = this.b;
                                str2 = ", httpCode=";
                                str5 = ")";
                                obj2 = coroutine_suspended;
                                try {
                                    try {
                                        fVar = new f(body4, file, j2, j, longRef2, null);
                                        eVar2.b = this;
                                        eVar2.c = url2;
                                        r4 = file;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r5 = execute;
                                        r14 = r5;
                                        if (r14 != 0 && (body = r14.body()) != null) {
                                            body.close();
                                        }
                                        throw th;
                                    }
                                } catch (CancellationException e8) {
                                    e = e8;
                                    r4 = file;
                                } catch (Exception e9) {
                                    e = e9;
                                    r4 = file;
                                }
                                try {
                                    eVar2.d = r4;
                                    eVar2.e = str;
                                    r5 = execute;
                                    try {
                                        eVar2.f = r5;
                                        Ref.LongRef longRef3 = longRef2;
                                        eVar2.g = longRef3;
                                        eVar2.j = 1;
                                        if (BuildersKt.withContext(coroutineDispatcher, fVar, eVar2) != obj2) {
                                            r7 = this;
                                            response = r5;
                                            r4 = r4;
                                            build = longRef3;
                                        }
                                    } catch (CancellationException e10) {
                                        e = e10;
                                        build = longRef2;
                                        r7 = this;
                                        response = r5;
                                        str3 = ", bytesDownloaded=";
                                        str4 = ", range=";
                                        file2 = r4;
                                        longRef = build;
                                        sdVar = r7;
                                        mb.e("Partial download cancelled: url=" + url2 + str4 + str + str3 + longRef.element, null, 2, null);
                                        eVar2.b = response;
                                        eVar2.c = e;
                                        eVar2.d = null;
                                        eVar2.e = null;
                                        eVar2.f = null;
                                        eVar2.g = null;
                                        eVar2.j = 2;
                                        if (sdVar.a(file2, eVar2) != obj2) {
                                        }
                                        return obj2;
                                    } catch (Exception e11) {
                                        e = e11;
                                        build = longRef2;
                                        r7 = this;
                                        response = r5;
                                        if (!(e instanceof com.chartboost.sdk.internal.Networking.okhttp.a)) {
                                        }
                                        if (!(e instanceof com.chartboost.sdk.internal.Networking.okhttp.a)) {
                                        }
                                        if (aVar == null) {
                                        }
                                        mb.b("Partial download failed: url=" + url2 + ", range=" + str + ", bytesDownloaded=" + build.element + ", errorCategory=" + str6 + str2 + num + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                        eVar2.b = response;
                                        eVar2.c = e;
                                        eVar2.d = null;
                                        eVar2.e = null;
                                        eVar2.f = null;
                                        eVar2.g = null;
                                        eVar2.j = 3;
                                        if (r7.a(r4, eVar2) != obj2) {
                                        }
                                    }
                                } catch (CancellationException e12) {
                                    e = e12;
                                    build = longRef2;
                                    r5 = execute;
                                    r7 = this;
                                    response = r5;
                                    str3 = ", bytesDownloaded=";
                                    str4 = ", range=";
                                    file2 = r4;
                                    longRef = build;
                                    sdVar = r7;
                                    mb.e("Partial download cancelled: url=" + url2 + str4 + str + str3 + longRef.element, null, 2, null);
                                    eVar2.b = response;
                                    eVar2.c = e;
                                    eVar2.d = null;
                                    eVar2.e = null;
                                    eVar2.f = null;
                                    eVar2.g = null;
                                    eVar2.j = 2;
                                    if (sdVar.a(file2, eVar2) != obj2) {
                                    }
                                    return obj2;
                                } catch (Exception e13) {
                                    e = e13;
                                    build = longRef2;
                                    r5 = execute;
                                    r7 = this;
                                    response = r5;
                                    if (!(e instanceof com.chartboost.sdk.internal.Networking.okhttp.a)) {
                                    }
                                    if (!(e instanceof com.chartboost.sdk.internal.Networking.okhttp.a)) {
                                    }
                                    if (aVar == null) {
                                    }
                                    mb.b("Partial download failed: url=" + url2 + ", range=" + str + ", bytesDownloaded=" + build.element + ", errorCategory=" + str6 + str2 + num + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                                    eVar2.b = response;
                                    eVar2.c = e;
                                    eVar2.d = null;
                                    eVar2.e = null;
                                    eVar2.f = null;
                                    eVar2.g = null;
                                    eVar2.j = 3;
                                    if (r7.a(r4, eVar2) != obj2) {
                                    }
                                }
                                return obj2;
                            }
                            throw new IOException("Response body was null for " + url2);
                        }
                        com.chartboost.sdk.internal.Networking.okhttp.a b2 = com.chartboost.sdk.internal.Networking.okhttp.a.c.b(execute.code());
                        String url3 = url.toString();
                        Intrinsics.checkNotNullExpressionValue(url3, "toString(...)");
                        throw x8.a(b2, url3);
                    }
                    if (i != 1) {
                        if (i == 2) {
                            CancellationException cancellationException = (CancellationException) eVar2.c;
                            response = (Response) eVar2.b;
                            ResultKt.throwOnFailure(obj);
                            Result.Companion companion3 = Result.INSTANCE;
                            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(cancellationException));
                            if (response != null) {
                                body3 = response.body();
                            }
                            return m8079constructorimpl;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Exception exc = (Exception) eVar2.c;
                        response = (Response) eVar2.b;
                        ResultKt.throwOnFailure(obj);
                        if (exc instanceof IOException) {
                            String message = exc.getMessage();
                            if (message != null) {
                                str7 = message.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(str7, "toLowerCase(...)");
                            }
                            str7 = "";
                            if (StringsKt.contains$default((CharSequence) str7, (CharSequence) "no space left", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str7, (CharSequence) "insufficient storage", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str7, (CharSequence) "disk full", false, 2, (Object) null)) {
                                exc = ChartboostError.Load.NoStorage.INSTANCE;
                            }
                        }
                        Result.Companion companion4 = Result.INSTANCE;
                        m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(exc));
                        if (response != null) {
                            body3 = response.body();
                        }
                        return m8079constructorimpl;
                    }
                    Ref.LongRef longRef4 = (Ref.LongRef) eVar2.g;
                    response = (Response) eVar2.f;
                    String str8 = (String) eVar2.e;
                    File file3 = (File) eVar2.d;
                    URL url4 = (URL) eVar2.c;
                    r7 = (sd) eVar2.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str = str8;
                        r4 = file3;
                        str2 = ", httpCode=";
                        str5 = ")";
                        obj2 = coroutine_suspended;
                        build = longRef4;
                        url2 = url4;
                        r7 = r7;
                    } catch (CancellationException e14) {
                        e = e14;
                        obj2 = coroutine_suspended;
                        str = str8;
                        file2 = file3;
                        str3 = ", bytesDownloaded=";
                        str4 = ", range=";
                        longRef = longRef4;
                        url2 = url4;
                        sdVar = r7;
                        mb.e("Partial download cancelled: url=" + url2 + str4 + str + str3 + longRef.element, null, 2, null);
                        eVar2.b = response;
                        eVar2.c = e;
                        eVar2.d = null;
                        eVar2.e = null;
                        eVar2.f = null;
                        eVar2.g = null;
                        eVar2.j = 2;
                        if (sdVar.a(file2, eVar2) != obj2) {
                        }
                        return obj2;
                    } catch (Exception e15) {
                        e = e15;
                        obj2 = coroutine_suspended;
                        str = str8;
                        r4 = file3;
                        str2 = ", httpCode=";
                        build = longRef4;
                        url2 = url4;
                        if (!(e instanceof com.chartboost.sdk.internal.Networking.okhttp.a)) {
                        }
                        if (!(e instanceof com.chartboost.sdk.internal.Networking.okhttp.a)) {
                        }
                        if (aVar == null) {
                        }
                        mb.b("Partial download failed: url=" + url2 + ", range=" + str + ", bytesDownloaded=" + build.element + ", errorCategory=" + str6 + str2 + num + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                        eVar2.b = response;
                        eVar2.c = e;
                        eVar2.d = null;
                        eVar2.e = null;
                        eVar2.f = null;
                        eVar2.g = null;
                        eVar2.j = 3;
                        if (r7.a(r4, eVar2) != obj2) {
                        }
                    }
                    mb.d("OkHttp partial download complete for " + url2 + " (" + build.element + " bytes, range: " + str + str5, null, 2, null);
                    Result.Companion companion5 = Result.INSTANCE;
                    Object m8079constructorimpl2 = Result.m8079constructorimpl(Boxing.boxLong(build.element));
                    if (response != null && (body2 = response.body()) != null) {
                        body2.close();
                    }
                    return m8079constructorimpl2;
                }
            }
            if (i != 0) {
            }
            mb.d("OkHttp partial download complete for " + url2 + " (" + build.element + " bytes, range: " + str + str5, null, 2, null);
            Result.Companion companion52 = Result.INSTANCE;
            Object m8079constructorimpl22 = Result.m8079constructorimpl(Boxing.boxLong(build.element));
            if (response != null) {
                body2.close();
            }
            return m8079constructorimpl22;
        } catch (Throwable th5) {
            th = th5;
            r14 = "Response body was null for ";
        }
        eVar = new e(continuation);
        e eVar22 = eVar;
        Object obj3 = eVar22.h;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar22.j;
        Object obj22 = ")";
    }

    public final Object a(File file, Continuation continuation) {
        Object withContext = BuildersKt.withContext(NonCancellable.INSTANCE.plus(this.b), new b(file, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
