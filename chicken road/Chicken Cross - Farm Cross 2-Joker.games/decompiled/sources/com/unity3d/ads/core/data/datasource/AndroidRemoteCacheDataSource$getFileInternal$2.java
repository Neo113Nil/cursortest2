package com.unity3d.ads.core.data.datasource;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.common.net.HttpHeaders;
import com.ironsource.Te;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource;
import kotlinx.coroutines.CoroutineScope;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;

/* compiled from: AndroidRemoteCacheDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/CacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFileInternal$2", f = "AndroidRemoteCacheDataSource.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER, 79, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend", n = {"$this$withContext", "file", "etagFile", "request", "fileSizeBefore", "$this$withContext", "file", "etagFile", "fileSizeBefore", "$this$withContext", "file", "etagFile", Te.n, "totalBytesRead", "nextProgressDeadline", "inputStream", "buffer", "bytesRead", "bufferedSink", "effectiveFileSizeBefore", "absoluteTotal"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$8", "L$9", "L$10", "L$13", "J$0", "J$1"})
/* loaded from: classes7.dex */
final class AndroidRemoteCacheDataSource$getFileInternal$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CacheResult>, Object> {
    final /* synthetic */ File $cachePath;
    final /* synthetic */ String $fileName;
    final /* synthetic */ int $intervalMs;
    final /* synthetic */ Function3<Long, Long, Continuation<? super Unit>, Object> $onProgress;
    final /* synthetic */ Integer $priority;
    final /* synthetic */ String $url;
    int I$0;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ AndroidRemoteCacheDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AndroidRemoteCacheDataSource$getFileInternal$2(String str, AndroidRemoteCacheDataSource androidRemoteCacheDataSource, File file, String str2, Integer num, int i, Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super AndroidRemoteCacheDataSource$getFileInternal$2> continuation) {
        super(2, continuation);
        this.$url = str;
        this.this$0 = androidRemoteCacheDataSource;
        this.$cachePath = file;
        this.$fileName = str2;
        this.$priority = num;
        this.$intervalMs = i;
        this.$onProgress = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidRemoteCacheDataSource$getFileInternal$2 androidRemoteCacheDataSource$getFileInternal$2 = new AndroidRemoteCacheDataSource$getFileInternal$2(this.$url, this.this$0, this.$cachePath, this.$fileName, this.$priority, this.$intervalMs, this.$onProgress, continuation);
        androidRemoteCacheDataSource$getFileInternal$2.L$0 = obj;
        return androidRemoteCacheDataSource$getFileInternal$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CacheResult> continuation) {
        return ((AndroidRemoteCacheDataSource$getFileInternal$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x05ce, code lost:
    
        throw new java.lang.IllegalStateException("Final file exists and could not be deleted before overwriting".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x05d3, code lost:
    
        if (r5.renameTo(r9) != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x05d9, code lost:
    
        if (r4.exists() != false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x05ed, code lost:
    
        throw new java.lang.IllegalStateException("Could not delete Etag file after successful download".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x060c, code lost:
    
        r0 = kotlin.Result.m8082exceptionOrNullimpl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0610, code lost:
    
        if (r0 != null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x061b, code lost:
    
        return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.FILE_STATE_WRONG, com.unity3d.ads.core.data.model.CacheSource.REMOTE, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x061c, code lost:
    
        r7 = r44.$url;
        r8 = r44.$fileName;
        r4 = r44.this$0.getFileExtensionFromUrl;
        r4 = r4.invoke(r44.$url);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x062e, code lost:
    
        if (r4 == null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0630, code lost:
    
        r10 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0634, code lost:
    
        r11 = r2.element;
        r13 = r3.getProtocol();
        r2 = r44.$priority;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x063d, code lost:
    
        if (r2 != null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x063f, code lost:
    
        r14 = r2.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0653, code lost:
    
        return new com.unity3d.ads.core.data.model.CacheResult.Success(new com.unity3d.ads.core.data.model.CachedFile(r7, r8, r9, r10, r11, r13, r14), com.unity3d.ads.core.data.model.CacheSource.REMOTE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0645, code lost:
    
        r14 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0633, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0600, code lost:
    
        throw new java.lang.IllegalStateException("Could not rename temporary file to final file".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0601, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0602, code lost:
    
        r4 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m8079constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x045d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x045e, code lost:
    
        r26 = r4;
        r25 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0464, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0465, code lost:
    
        r21 = r3;
        r26 = r4;
        r25 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x046d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x049f, code lost:
    
        r24 = r2;
        r26 = r4;
        r25 = r5;
        r2 = r21;
        r21 = r3;
        r3 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04ab, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04af, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r3, r39);
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04b6, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r2, r40);
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04bd, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r6, r41);
        r0 = kotlin.Result.m8079constructorimpl(kotlin.Unit.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04c6, code lost:
    
        r3 = r21;
        r2 = r24;
        r5 = r25;
        r4 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04d0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04d1, code lost:
    
        r10 = r11;
        r3 = r21;
        r9 = r24;
        r5 = r25;
        r2 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04dc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04dd, code lost:
    
        r4 = r6;
        r10 = r11;
        r3 = r21;
        r9 = r24;
        r5 = r25;
        r2 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04ea, code lost:
    
        r7 = r0;
        r4 = r6;
        r10 = r11;
        r3 = r21;
        r9 = r24;
        r5 = r25;
        r6 = r2;
        r2 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x03b1, code lost:
    
        r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r2.element + r11);
        r10 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r19);
        r44.L$0 = r8;
        r44.L$1 = r5;
        r44.L$2 = r4;
        r44.L$3 = r3;
        r44.L$4 = r2;
        r44.L$5 = r14;
        r44.L$6 = r0;
        r44.L$7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x03cd, code lost:
    
        r24 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x03d1, code lost:
    
        r44.L$8 = r23;
        r44.L$9 = r7;
        r44.L$10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x03d7, code lost:
    
        r23 = r23;
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x03db, code lost:
    
        r44.L$11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x03dd, code lost:
    
        r21 = r3;
        r3 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x03e1, code lost:
    
        r44.L$12 = r3;
        r44.L$13 = r13;
        r44.J$0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x03e7, code lost:
    
        r26 = r4;
        r25 = r5;
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x03ed, code lost:
    
        r44.J$1 = r4;
        r19 = r4;
        r4 = r18;
        r44.I$0 = r4;
        r44.label = 3;
        r9 = r0.invoke(r9, r10, r44);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x03fc, code lost:
    
        r10 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x03fe, code lost:
    
        if (r9 != r10) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0400, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0401, code lost:
    
        r38 = r3;
        r9 = r7;
        r3 = r21;
        r21 = r2;
        r7 = r4;
        r2 = r24;
        r4 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x04f7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0573, code lost:
    
        return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.NETWORK_ERROR, com.unity3d.ads.core.data.model.CacheSource.REMOTE, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x057a, code lost:
    
        if (r3.getStatusCode() != 206) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0661, code lost:
    
        return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.NETWORK_ERROR, com.unity3d.ads.core.data.model.CacheSource.REMOTE, null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x05ab, code lost:
    
        r9 = new java.io.File(r44.$cachePath, r44.$fileName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x05b4, code lost:
    
        r0 = kotlin.Result.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x05ba, code lost:
    
        if (r9.exists() != false) goto L216;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x049f A[EDGE_INSN: B:149:0x049f->B:150:0x049f BREAK  A[LOOP:0: B:20:0x038a->B:29:0x047f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0395 A[Catch: all -> 0x04f9, TryCatch #16 {all -> 0x04f9, blocks: (B:21:0x038a, B:23:0x0395, B:25:0x03a7, B:31:0x03b1), top: B:20:0x038a }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0574  */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v67, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0401 -> B:10:0x040d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SessionRepository sessionRepository;
        CreateFile createFile;
        CreateFile createFile2;
        File invoke;
        HttpClientProvider httpClientProvider;
        Object invoke2;
        CoroutineScope coroutineScope;
        long j;
        HttpRequest httpRequest;
        File file;
        Object execute;
        File file2;
        File file3;
        long j2;
        HttpResponse httpResponse;
        String str;
        long contentSize;
        Ref.IntRef intRef;
        Ref.LongRef longRef;
        String str2;
        HttpResponse httpResponse2;
        File file4;
        InputStream inputStream;
        Throwable th;
        Ref.IntRef intRef2;
        Throwable th2;
        Sink sink;
        Throwable th3;
        File file5;
        Ref.IntRef intRef3;
        long j3;
        File file6;
        BufferedSink bufferedSink;
        HttpResponse httpResponse3;
        InputStream inputStream2;
        Sink sink2;
        int i;
        BufferedSink bufferedSink2;
        Throwable th4;
        Throwable th5;
        Throwable th6;
        HttpResponse httpResponse4;
        Sink sink3;
        Object obj2;
        Function3<Long, Long, Continuation<? super Unit>, Object> function3;
        Ref.IntRef intRef4;
        byte[] bArr;
        InputStream inputStream3;
        File file7;
        long j4;
        InputStream inputStream4;
        long j5;
        BufferedSink bufferedSink3;
        String str3;
        Throwable m8082exceptionOrNullimpl;
        File file8;
        int read;
        Ref.IntRef intRef5;
        File file9;
        File file10;
        byte[] bArr2;
        BufferedSink bufferedSink4;
        Ref.IntRef intRef6;
        HttpResponse httpResponse5;
        InputStream inputStream5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            String str4 = this.$url;
            if (str4 != null && str4.length() != 0) {
                sessionRepository = this.this$0.sessionRepository;
                if (sessionRepository.getFeatureFlags().getEnsureCacheFolderExistences()) {
                    if (this.$cachePath.exists()) {
                        if (!this.$cachePath.isDirectory()) {
                            return new CacheResult.Failure(CacheError.FILE_IO_ERROR, CacheSource.REMOTE, null, 4, null);
                        }
                    } else if (!this.$cachePath.mkdirs() && !this.$cachePath.isDirectory()) {
                        return new CacheResult.Failure(CacheError.FILE_IO_ERROR, CacheSource.REMOTE, null, 4, null);
                    }
                }
                createFile = this.this$0.createFile;
                File invoke3 = createFile.invoke(this.$cachePath, this.$fileName + ".part");
                if (!invoke3.exists()) {
                    invoke3.createNewFile();
                }
                long length = invoke3.length();
                createFile2 = this.this$0.createFile;
                invoke = createFile2.invoke(this.$cachePath, this.$fileName + ".etag");
                File file11 = invoke.exists() ? invoke : null;
                String readText$default = file11 != null ? FilesKt.readText$default(file11, null, 1, null) : null;
                Map createMapBuilder = MapsKt.createMapBuilder();
                if (length > 0) {
                    createMapBuilder.put("Range", CollectionsKt.listOf("bytes=" + length + '-'));
                }
                if (readText$default != null) {
                    createMapBuilder.put(HttpHeaders.IF_RANGE, CollectionsKt.listOf("\"" + readText$default + '\"'));
                }
                Map build = MapsKt.build(createMapBuilder);
                Integer num = this.$priority;
                HttpRequest httpRequest2 = new HttpRequest(this.$url, null, null, null, build, null, null, null, null, 0, 0, 0, 0, false, null, null, num != null ? num.intValue() : Integer.MAX_VALUE, 65518, null);
                httpClientProvider = this.this$0.httpClientProvider;
                this.L$0 = coroutineScope2;
                this.L$1 = invoke3;
                this.L$2 = invoke;
                this.L$3 = httpRequest2;
                this.J$0 = length;
                this.label = 1;
                invoke2 = httpClientProvider.invoke(this);
                if (invoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                j = length;
                httpRequest = httpRequest2;
                file = invoke3;
            } else {
                return new CacheResult.Failure(CacheError.MALFORMED_URL, CacheSource.REMOTE, null, 4, null);
            }
        } else if (i2 == 1) {
            j = this.J$0;
            httpRequest = (HttpRequest) this.L$3;
            invoke = (File) this.L$2;
            File file12 = (File) this.L$1;
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            invoke2 = obj;
            file = file12;
            coroutineScope = coroutineScope3;
        } else {
            if (i2 == 2) {
                long j6 = this.J$0;
                File file13 = (File) this.L$2;
                file3 = (File) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                j2 = j6;
                file2 = file13;
                execute = obj;
                httpResponse = (HttpResponse) execute;
                if (HttpResponseKt.isSuccessful(httpResponse)) {
                    return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Request failed with status code " + httpResponse.getStatusCode()));
                }
                List<String> list = httpResponse.getHeaders().get("ETag");
                if (list == null || (str3 = (String) CollectionsKt.firstOrNull((List) list)) == null || (str = StringsKt.trim(str3, '\"')) == null) {
                    str = "";
                }
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    FilesKt.writeText$default(file2, str, null, 2, null);
                    Unit unit = Unit.INSTANCE;
                }
                if (j2 > 0 && httpResponse.getStatusCode() == 200) {
                    file3.delete();
                    file3.createNewFile();
                    j2 = 0;
                }
                Object body = httpResponse.getBody();
                InputStream inputStream6 = body instanceof InputStream ? (InputStream) body : null;
                if (inputStream6 == null) {
                    return new CacheResult.Failure(CacheError.NETWORK_ERROR, CacheSource.REMOTE, new Exception("Response body is not an InputStream"));
                }
                if (httpResponse.getStatusCode() == 206 && httpResponse.getContentSize() > 0) {
                    contentSize = httpResponse.getContentSize() + j2;
                } else {
                    contentSize = httpResponse.getContentSize();
                }
                intRef = new Ref.IntRef();
                longRef = new Ref.LongRef();
                str2 = "";
                long m9541markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                Duration.Companion companion = Duration.INSTANCE;
                File file14 = file2;
                longRef.element = TimeSource.Monotonic.ValueTimeMark.m9555plusLRDsOJo(m9541markNowz9LOYto, DurationKt.toDuration(this.$intervalMs, DurationUnit.MILLISECONDS));
                Function3<Long, Long, Continuation<? super Unit>, Object> function32 = this.$onProgress;
                int i3 = this.$intervalMs;
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    inputStream = inputStream6;
                    try {
                        InputStream inputStream7 = inputStream;
                        byte[] bArr3 = new byte[8192];
                        intRef2 = new Ref.IntRef();
                        Sink appendingSink = Okio.appendingSink(file3);
                        try {
                            BufferedSink buffer = Okio.buffer(appendingSink);
                            try {
                                BufferedSink bufferedSink5 = buffer;
                                i = i3;
                                bufferedSink2 = buffer;
                                th4 = null;
                                th5 = null;
                                th6 = null;
                                httpResponse4 = httpResponse;
                                sink3 = appendingSink;
                                obj2 = coroutine_suspended;
                                function3 = function32;
                                intRef4 = intRef;
                                bArr = bArr3;
                                inputStream3 = inputStream;
                                file7 = file14;
                                j4 = contentSize;
                                inputStream4 = inputStream7;
                                j5 = j2;
                                bufferedSink3 = bufferedSink5;
                                while (true) {
                                    read = inputStream4.read(bArr);
                                    intRef2.element = read;
                                    InputStream inputStream8 = inputStream4;
                                    if (read != -1) {
                                    }
                                    bufferedSink2 = bufferedSink2;
                                    i = i;
                                    bArr = bArr2;
                                    obj2 = obj2;
                                    bufferedSink3 = bufferedSink4;
                                    httpResponse4 = httpResponse4;
                                    inputStream4 = inputStream8;
                                    file3 = file10;
                                    file7 = file9;
                                    sink3 = sink3;
                                    intRef4 = intRef5;
                                }
                                file6 = file7;
                                file8 = file3;
                                Sink sink4 = sink3;
                                httpResponse3 = httpResponse4;
                                BufferedSink bufferedSink6 = bufferedSink2;
                                sink2 = sink4;
                                j3 = j5;
                                file5 = file8;
                                bufferedSink = bufferedSink6;
                                inputStream2 = inputStream3;
                                th3 = th;
                            } catch (Throwable th7) {
                                th3 = th7;
                                file5 = file3;
                                intRef3 = intRef;
                                j3 = j2;
                                file6 = file14;
                                bufferedSink = buffer;
                                httpResponse3 = httpResponse;
                                inputStream2 = inputStream;
                                sink2 = appendingSink;
                            }
                        } catch (Throwable th8) {
                            httpResponse2 = httpResponse;
                            th2 = th8;
                            file4 = file14;
                            sink = appendingSink;
                            throw th2;
                        }
                    } catch (Throwable th9) {
                        httpResponse2 = httpResponse;
                        th = th9;
                        file4 = file14;
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    httpResponse2 = httpResponse;
                    file4 = file14;
                    Result.Companion companion3 = Result.INSTANCE;
                    Object obj3 = Result.m8079constructorimpl(ResultKt.createFailure(th));
                    File file15 = file4;
                    Ref.IntRef intRef7 = intRef;
                    j5 = j2;
                    m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(obj3);
                    if (m8082exceptionOrNullimpl != null) {
                    }
                }
                throw th3;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = this.I$0;
            long j7 = this.J$1;
            j3 = this.J$0;
            BufferedSink bufferedSink7 = (BufferedSink) this.L$13;
            ?? r12 = (Closeable) this.L$12;
            ?? r4 = (Closeable) this.L$11;
            Ref.IntRef intRef8 = (Ref.IntRef) this.L$10;
            byte[] bArr4 = (byte[]) this.L$9;
            InputStream inputStream9 = (InputStream) this.L$8;
            ?? r11 = (Closeable) this.L$7;
            Function3<Long, Long, Continuation<? super Unit>, Object> function33 = (Function3) this.L$6;
            Ref.LongRef longRef2 = (Ref.LongRef) this.L$5;
            Ref.IntRef intRef9 = (Ref.IntRef) this.L$4;
            httpResponse3 = (HttpResponse) this.L$3;
            File file16 = (File) this.L$2;
            File file17 = (File) this.L$1;
            CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                str2 = "";
                bufferedSink2 = r12;
                int i5 = i4;
                file8 = file17;
                th4 = null;
                th5 = null;
                th6 = null;
                InputStream inputStream10 = inputStream9;
                Object obj4 = coroutine_suspended;
                function3 = function33;
                bufferedSink4 = bufferedSink7;
                inputStream3 = r11;
                j5 = j3;
                coroutineScope = coroutineScope4;
                bArr = bArr4;
                Ref.IntRef intRef10 = intRef9;
                intRef2 = intRef8;
                longRef = longRef2;
                HttpResponse httpResponse6 = httpResponse3;
                sink3 = r4;
                j4 = j7;
                file7 = file16;
                try {
                    try {
                        try {
                            long m9541markNowz9LOYto2 = TimeSource.Monotonic.INSTANCE.m9541markNowz9LOYto();
                            Duration.Companion companion4 = Duration.INSTANCE;
                            Function3<Long, Long, Continuation<? super Unit>, Object> function34 = function3;
                            longRef.element = TimeSource.Monotonic.ValueTimeMark.m9555plusLRDsOJo(m9541markNowz9LOYto2, DurationKt.toDuration(i5, DurationUnit.MILLISECONDS));
                            inputStream3 = inputStream5;
                            i = i5;
                            function3 = function34;
                            intRef4 = intRef6;
                            httpResponse4 = httpResponse5;
                            file3 = file8;
                            obj2 = obj4;
                            bufferedSink3 = bufferedSink4;
                            inputStream4 = inputStream10;
                            while (true) {
                                try {
                                    read = inputStream4.read(bArr);
                                    intRef2.element = read;
                                    InputStream inputStream82 = inputStream4;
                                    if (read != -1) {
                                        break;
                                    }
                                    bufferedSink3.write(bArr, 0, intRef2.element);
                                    bufferedSink3.flush();
                                    intRef4.element += intRef2.element;
                                    if (function3 != null) {
                                        bArr2 = bArr;
                                        bufferedSink4 = bufferedSink3;
                                        if (TimeSource.Monotonic.ValueTimeMark.m9550hasPassedNowimpl(longRef.element)) {
                                            break;
                                        }
                                        intRef5 = intRef4;
                                        file9 = file7;
                                        file10 = file3;
                                    } else {
                                        intRef5 = intRef4;
                                        file9 = file7;
                                        file10 = file3;
                                        bArr2 = bArr;
                                        bufferedSink4 = bufferedSink3;
                                    }
                                    bufferedSink2 = bufferedSink2;
                                    i = i;
                                    bArr = bArr2;
                                    obj2 = obj2;
                                    bufferedSink3 = bufferedSink4;
                                    httpResponse4 = httpResponse4;
                                    inputStream4 = inputStream82;
                                    file3 = file10;
                                    file7 = file9;
                                    sink3 = sink3;
                                    intRef4 = intRef5;
                                } catch (Throwable th11) {
                                    th = th11;
                                    intRef3 = intRef4;
                                }
                            }
                            file6 = file7;
                            file8 = file3;
                            Sink sink42 = sink3;
                            httpResponse3 = httpResponse4;
                            BufferedSink bufferedSink62 = bufferedSink2;
                            sink2 = sink42;
                            j3 = j5;
                            file5 = file8;
                            bufferedSink = bufferedSink62;
                            inputStream2 = inputStream3;
                            th3 = th;
                        } catch (Throwable th12) {
                            th = th12;
                            intRef6 = intRef10;
                            httpResponse5 = httpResponse6;
                            inputStream5 = inputStream3;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        th3 = th;
                        file6 = file7;
                        j3 = j5;
                        sink2 = sink3;
                        httpResponse3 = httpResponse5;
                        file5 = file8;
                        bufferedSink = bufferedSink2;
                        inputStream2 = inputStream5;
                        intRef3 = intRef6;
                        throw th3;
                    }
                    intRef6 = intRef10;
                    httpResponse5 = httpResponse6;
                } catch (Throwable th14) {
                    th = th14;
                    intRef6 = intRef10;
                    httpResponse5 = httpResponse6;
                }
                inputStream5 = inputStream3;
            } catch (Throwable th15) {
                th3 = th15;
                str2 = "";
                intRef3 = intRef9;
                file6 = file16;
                file5 = file17;
                sink2 = r4;
                inputStream2 = r11;
                bufferedSink = r12;
            }
            try {
                throw th3;
            } catch (Throwable th16) {
                try {
                    CloseableKt.closeFinally(bufferedSink, th3);
                    throw th16;
                } catch (Throwable th17) {
                    th2 = th17;
                    file3 = file5;
                    sink = sink2;
                    inputStream = inputStream2;
                    httpResponse2 = httpResponse3;
                    file4 = file6;
                    j2 = j3;
                    intRef = intRef3;
                    try {
                        throw th2;
                    } catch (Throwable th18) {
                        try {
                            CloseableKt.closeFinally(sink, th2);
                            throw th18;
                        } catch (Throwable th19) {
                            Throwable th20 = th19;
                            th = th20;
                            try {
                                throw th;
                            } catch (Throwable th21) {
                                try {
                                    CloseableKt.closeFinally(inputStream, th);
                                    throw th21;
                                } catch (Throwable th22) {
                                    th = th22;
                                    Result.Companion companion32 = Result.INSTANCE;
                                    Object obj32 = Result.m8079constructorimpl(ResultKt.createFailure(th));
                                    File file152 = file4;
                                    Ref.IntRef intRef72 = intRef;
                                    j5 = j2;
                                    m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(obj32);
                                    if (m8082exceptionOrNullimpl != null) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.L$0 = coroutineScope;
        this.L$1 = file;
        this.L$2 = invoke;
        this.L$3 = null;
        this.J$0 = j;
        this.label = 2;
        execute = ((HttpClient) invoke2).execute(httpRequest, true, this);
        if (execute == coroutine_suspended) {
            return coroutine_suspended;
        }
        long j8 = j;
        file2 = invoke;
        file3 = file;
        j2 = j8;
        httpResponse = (HttpResponse) execute;
        if (HttpResponseKt.isSuccessful(httpResponse)) {
        }
    }
}
