package com.bbflight.background_downloader;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.ComposerKt;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkerParameters;
import com.bbflight.background_downloader.TaskWorker;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1117w;
import kotlinx.coroutines.C1119x;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.serialization.internal.C1135f;
import kotlinx.serialization.json.b;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u001bJ2\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u0010#J\u001e\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&H\u0086@¢\u0006\u0002\u0010'J\u001a\u0010(\u001a\u0004\u0018\u00010\u00112\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002J\n\u0010*\u001a\u0004\u0018\u00010\u0011H\u0002J\u0018\u0010+\u001a\u00020&2\u0006\u0010)\u001a\u00020\f2\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u0010,\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020\u001dH\u0082@¢\u0006\u0002\u0010-J\u000e\u0010/\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010-J0\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u00101\u001a\u0002022\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0504H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/bbflight/background_downloader/ParallelDownloadTaskWorker;", "Lcom/bbflight/background_downloader/TaskWorker;", "applicationContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "parallelDownloadContentLength", "", "chunks", "", "Lcom/bbflight/background_downloader/Chunk;", "chunksJsonString", "", "parallelTaskStatusUpdateCompleter", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/bbflight/background_downloader/TaskStatus;", "lastTaskStatus", "determineIfResume", "", "connectAndProcess", "connection", "Ljava/net/HttpURLConnection;", "(Ljava/net/HttpURLConnection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "process", "filePath", "(Ljava/net/HttpURLConnection;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chunkStatusUpdate", "", "chunkTaskId", NotificationCompat.CATEGORY_STATUS, "taskException", "Lcom/bbflight/background_downloader/TaskException;", "responseBody", "(Ljava/lang/String;Lcom/bbflight/background_downloader/TaskStatus;Lcom/bbflight/background_downloader/TaskException;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chunkProgressUpdate", NotificationCompat.CATEGORY_PROGRESS, "", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateChunkStatus", "chunk", "parentTaskStatus", "updateChunkProgress", "cancelAllChunkTasks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pauseAllChunkTasks", "stitchChunks", "createChunks", "task", "Lcom/bbflight/background_downloader/Task;", "headers", "", "", "background_downloader_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nParallelDownloadTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParallelDownloadTaskWorker.kt\ncom/bbflight/background_downloader/ParallelDownloadTaskWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,502:1\n296#2,2:503\n296#2,2:506\n296#2,2:508\n296#2,2:510\n1786#2,3:512\n1849#2,3:515\n1586#2:518\n1661#2,3:519\n1586#2:523\n1661#2,3:524\n231#2,2:528\n1586#2:530\n1661#2,3:531\n113#3:505\n113#3:522\n113#3:527\n*S KotlinDebug\n*F\n+ 1 ParallelDownloadTaskWorker.kt\ncom/bbflight/background_downloader/ParallelDownloadTaskWorker\n*L\n200#1:503,2\n259#1:506,2\n294#1:508,2\n299#1:510,2\n304#1:512,3\n320#1:515,3\n336#1:518\n336#1:519,3\n347#1:523\n347#1:524,3\n423#1:528,2\n428#1:530\n428#1:531,3\n215#1:505\n336#1:522\n347#1:527\n*E\n"})
/* loaded from: classes3.dex */
public final class ParallelDownloadTaskWorker extends TaskWorker {
    public long B;
    public List<O> C;
    public String D;
    public final C1117w E;
    public W0 F;

    @DebugMetadata(c = "com.bbflight.background_downloader.ParallelDownloadTaskWorker", f = "ParallelDownloadTaskWorker.kt", i = {0}, l = {64}, m = "connectAndProcess", n = {"connection"}, nl = {65}, s = {"L$0"}, v = 2)
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ParallelDownloadTaskWorker.this.c(null, this);
        }
    }

    @DebugMetadata(c = "com.bbflight.background_downloader.ParallelDownloadTaskWorker$process$2", f = "ParallelDownloadTaskWorker.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6}, l = {173, 183, 184, 183, 184, 183, 184}, m = "invokeSuspend", n = {"$this$withContext", "enqueueJob", "testerJob", "$this$withContext", "enqueueJob", "testerJob", "$this$withContext", "enqueueJob", "testerJob", "$this$withContext", "enqueueJob", "testerJob", "$this$withContext", "enqueueJob", "testerJob", "$this$withContext", "enqueueJob", "testerJob", "$this$withContext", "enqueueJob", "testerJob"}, nl = {183, 184, 173, 184, 181, 184, -1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
    public static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super W0>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public W0 d;
        public int e;
        public /* synthetic */ Object f;
        public final /* synthetic */ HttpURLConnection j;

        @DebugMetadata(c = "com.bbflight.background_downloader.ParallelDownloadTaskWorker$process$2$1", f = "ParallelDownloadTaskWorker.kt", i = {1}, l = {83, 100}, m = "invokeSuspend", n = {"chunk"}, nl = {89, 122}, s = {"L$1"}, v = 2)
        @SourceDebugExtension({"SMAP\nParallelDownloadTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParallelDownloadTaskWorker.kt\ncom/bbflight/background_downloader/ParallelDownloadTaskWorker$process$2$1\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,502:1\n113#2:503\n96#3:504\n1849#4,3:505\n*S KotlinDebug\n*F\n+ 1 ParallelDownloadTaskWorker.kt\ncom/bbflight/background_downloader/ParallelDownloadTaskWorker$process$2$1\n*L\n103#1:503\n142#1:504\n143#1:505,3\n*E\n"})
        public static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
            public Object a;
            public Object b;
            public int c;
            public final /* synthetic */ ParallelDownloadTaskWorker d;
            public final /* synthetic */ HttpURLConnection e;

            @DebugMetadata(c = "com.bbflight.background_downloader.ParallelDownloadTaskWorker$process$2$1$1", f = "ParallelDownloadTaskWorker.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, nl = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, s = {}, v = 2)
            /* renamed from: com.bbflight.background_downloader.ParallelDownloadTaskWorker$b$a$a, reason: collision with other inner class name */
            public static final class C0049a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ ParallelDownloadTaskWorker b;
                public final /* synthetic */ O c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0049a(ParallelDownloadTaskWorker parallelDownloadTaskWorker, O o, Continuation<? super C0049a> continuation) {
                    super(1, continuation);
                    this.b = parallelDownloadTaskWorker;
                    this.c = o;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Continuation<?> continuation) {
                    return new C0049a(this.b, this.c, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Continuation<? super Unit> continuation) {
                    return ((C0049a) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    M0 m0 = this.c.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    ParallelDownloadTaskWorker parallelDownloadTaskWorker = this.b;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.a = 1;
                        if (parallelDownloadTaskWorker.r(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    String str = m0.a;
                    parallelDownloadTaskWorker.q = new P0(W.b, defpackage.g.a("Failed to enqueue chunk task with id ", m0.a), 2);
                    parallelDownloadTaskWorker.E.M(W0.f);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ParallelDownloadTaskWorker parallelDownloadTaskWorker, HttpURLConnection httpURLConnection, Continuation<? super a> continuation) {
                super(2, continuation);
                this.d = parallelDownloadTaskWorker;
                this.e = httpURLConnection;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.d, this.e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
                return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0106 A[Catch: NoSuchElementException -> 0x022b, TRY_LEAVE, TryCatch #1 {NoSuchElementException -> 0x022b, blocks: (B:24:0x00fe, B:26:0x0106, B:43:0x0153, B:44:0x0168, B:46:0x016e, B:53:0x021d, B:54:0x0224, B:55:0x0225, B:56:0x022a, B:28:0x0108, B:29:0x0112, B:31:0x0118, B:33:0x012b, B:38:0x013e, B:41:0x0150, B:51:0x0215, B:52:0x021c), top: B:23:0x00fe, inners: #0 }] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0225 A[Catch: NoSuchElementException -> 0x022b, TryCatch #1 {NoSuchElementException -> 0x022b, blocks: (B:24:0x00fe, B:26:0x0106, B:43:0x0153, B:44:0x0168, B:46:0x016e, B:53:0x021d, B:54:0x0224, B:55:0x0225, B:56:0x022a, B:28:0x0108, B:29:0x0112, B:31:0x0118, B:33:0x012b, B:38:0x013e, B:41:0x0150, B:51:0x0215, B:52:0x021c), top: B:23:0x00fe, inners: #0 }] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x01d3  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                boolean M;
                Object e;
                ParallelDownloadTaskWorker parallelDownloadTaskWorker;
                long b;
                int collectionSizeOrDefault;
                Iterator it;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.c;
                long j = 0;
                long j2 = 1;
                char c = 2;
                HttpURLConnection httpURLConnection = this.e;
                ParallelDownloadTaskWorker parallelDownloadTaskWorker2 = this.d;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (parallelDownloadTaskWorker2.e) {
                            b.a aVar = kotlinx.serialization.json.b.d;
                            String str = parallelDownloadTaskWorker2.D;
                            aVar.getClass();
                            List<O> list = (List) aVar.a(new C1135f(O.Companion.serializer()), str);
                            parallelDownloadTaskWorker2.C = list;
                            for (O o : list) {
                                j = ((j + o.f) - o.e) + 1;
                            }
                            parallelDownloadTaskWorker2.B = j;
                        } else {
                            if (CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(200), Boxing.boxInt(ComposerKt.providerKey), Boxing.boxInt(ComposerKt.compositionLocalMapKey), Boxing.boxInt(ComposerKt.providerValuesKey), Boxing.boxInt(ComposerKt.providerMapsKey), Boxing.boxInt(205), Boxing.boxInt(ComposerKt.referenceKey)}).contains(Boxing.boxInt(httpURLConnection.getResponseCode()))) {
                                if (Intrinsics.areEqual(parallelDownloadTaskWorker2.k().d, "?")) {
                                    M0 k = parallelDownloadTaskWorker2.k();
                                    Context applicationContext = parallelDownloadTaskWorker2.getApplicationContext();
                                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                    Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
                                    this.a = parallelDownloadTaskWorker2;
                                    this.c = 1;
                                    e = k.e(applicationContext, headerFields, true, this);
                                    if (e != coroutine_suspended) {
                                        parallelDownloadTaskWorker = parallelDownloadTaskWorker2;
                                    }
                                    return coroutine_suspended;
                                }
                                Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
                                Intrinsics.checkNotNullExpressionValue(headerFields2, "getHeaderFields(...)");
                                parallelDownloadTaskWorker2.i(headerFields2);
                                parallelDownloadTaskWorker2.t = Boxing.boxInt(httpURLConnection.getResponseCode());
                                Map<String, List<String>> headerFields3 = httpURLConnection.getHeaderFields();
                                Intrinsics.checkNotNullExpressionValue(headerFields3, "getHeaderFields(...)");
                                parallelDownloadTaskWorker2.h(headerFields3);
                                M0 k2 = parallelDownloadTaskWorker2.k();
                                Map<String, List<String>> headerFields4 = httpURLConnection.getHeaderFields();
                                Intrinsics.checkNotNullExpressionValue(headerFields4, "getHeaderFields(...)");
                                int size = k2.c.size() * k2.g;
                                b = C0633a0.b(headerFields4, k2);
                                if (b > 0) {
                                    throw new IllegalStateException("Server does not provide content length - cannot chunk download. If you know the length, set Range or Known-Content-Length header");
                                }
                                parallelDownloadTaskWorker2.B = b;
                                try {
                                    for (Object obj2 : headerFields4.entrySet()) {
                                        Map.Entry entry = (Map.Entry) obj2;
                                        if (!Intrinsics.areEqual(entry.getKey(), "accept-ranges")) {
                                            if (Intrinsics.areEqual(entry.getKey(), "Accept-Ranges")) {
                                            }
                                            c = c;
                                            b = b;
                                            j2 = j2;
                                        }
                                        if (Intrinsics.areEqual(CollectionsKt.first((List) entry.getValue()), "bytes")) {
                                            long j3 = (b / size) + j2;
                                            IntRange until = RangesKt.until(0, size);
                                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
                                            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                                            Iterator<Integer> it2 = until.iterator();
                                            while (it2.hasNext()) {
                                                int nextInt = ((IntIterator) it2).nextInt();
                                                long j4 = j2;
                                                List<String> list2 = k2.c;
                                                String str2 = list2.get(nextInt % list2.size());
                                                int abs = Math.abs(Random.INSTANCE.nextInt());
                                                StringBuilder sb = new StringBuilder();
                                                long j5 = j3;
                                                sb.append("com.bbflight.background_downloader.");
                                                sb.append(abs);
                                                long j6 = nextInt * j5;
                                                long j7 = b;
                                                arrayList.add(new O(k2, str2, sb.toString(), j6, Math.min((j6 + j5) - j4, b - j4)));
                                                b = j7;
                                                j2 = j4;
                                                j3 = j5;
                                            }
                                            parallelDownloadTaskWorker2.C = arrayList;
                                            it = arrayList.iterator();
                                            while (it.hasNext()) {
                                            }
                                        }
                                        c = c;
                                        b = b;
                                        j2 = j2;
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                } catch (NoSuchElementException unused) {
                                    throw new IllegalStateException("Server does not accept ranges - cannot chunk download");
                                }
                            }
                            httpURLConnection.getResponseCode();
                            String str3 = parallelDownloadTaskWorker2.k().a;
                            String m = TaskWorker.m(httpURLConnection);
                            W w = W.i;
                            int responseCode = httpURLConnection.getResponseCode();
                            String responseMessage = (m == null || m.length() <= 0) ? httpURLConnection.getResponseMessage() : m;
                            Intrinsics.checkNotNull(responseMessage);
                            parallelDownloadTaskWorker2.q = new P0(w, responseCode, responseMessage);
                            if (httpURLConnection.getResponseCode() == 404) {
                                parallelDownloadTaskWorker2.r = m;
                                M = parallelDownloadTaskWorker2.E.M(W0.e);
                            } else {
                                M = parallelDownloadTaskWorker2.E.M(W0.f);
                            }
                            Boxing.boxBoolean(M);
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) this.a;
                        ResultKt.throwOnFailure(obj);
                        while (it.hasNext()) {
                            O o2 = (O) it.next();
                            TaskWorker.Companion companion = TaskWorker.INSTANCE;
                            M0 k3 = parallelDownloadTaskWorker2.k();
                            b.a aVar2 = kotlinx.serialization.json.b.d;
                            M0 m0 = o2.d;
                            aVar2.getClass();
                            String b2 = aVar2.b(M0.Companion.serializer(), m0);
                            C0049a c0049a = new C0049a(parallelDownloadTaskWorker2, o2, null);
                            this.a = it;
                            this.b = SpillingKt.nullOutSpilledVariable(o2);
                            this.c = 2;
                            companion.getClass();
                            if (TaskWorker.Companion.b("enqueueChild", k3, b2, c0049a, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    ParallelDownloadTaskWorker parallelDownloadTaskWorker3 = (ParallelDownloadTaskWorker) this.a;
                    ResultKt.throwOnFailure(obj);
                    parallelDownloadTaskWorker = parallelDownloadTaskWorker3;
                    e = obj;
                    b = C0633a0.b(headerFields4, k2);
                    if (b > 0) {
                    }
                } catch (NoSuchElementException unused2) {
                    throw new IllegalStateException("Server does not provide content length - cannot chunk download. If you know the length, set Range or Known-Content-Length header");
                }
                M0 m02 = (M0) e;
                parallelDownloadTaskWorker.getClass();
                Intrinsics.checkNotNullParameter(m02, "<set-?>");
                parallelDownloadTaskWorker.a = m02;
                String str4 = parallelDownloadTaskWorker2.k().a;
                String str5 = parallelDownloadTaskWorker2.k().d;
                Map<String, List<String>> headerFields22 = httpURLConnection.getHeaderFields();
                Intrinsics.checkNotNullExpressionValue(headerFields22, "getHeaderFields(...)");
                parallelDownloadTaskWorker2.i(headerFields22);
                parallelDownloadTaskWorker2.t = Boxing.boxInt(httpURLConnection.getResponseCode());
                Map<String, List<String>> headerFields32 = httpURLConnection.getHeaderFields();
                Intrinsics.checkNotNullExpressionValue(headerFields32, "getHeaderFields(...)");
                parallelDownloadTaskWorker2.h(headerFields32);
                M0 k22 = parallelDownloadTaskWorker2.k();
                Map<String, List<String>> headerFields42 = httpURLConnection.getHeaderFields();
                Intrinsics.checkNotNullExpressionValue(headerFields42, "getHeaderFields(...)");
                int size2 = k22.c.size() * k22.g;
            }
        }

        @DebugMetadata(c = "com.bbflight.background_downloader.ParallelDownloadTaskWorker$process$2$2", f = "ParallelDownloadTaskWorker.kt", i = {0, 1, 2, 3}, l = {152, 160, 161, 169}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch", "$this$launch"}, nl = {156, 161, 166, 171}, s = {"L$0", "L$0", "L$0", "L$0"}, v = 2)
        @SourceDebugExtension({"SMAP\nParallelDownloadTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParallelDownloadTaskWorker.kt\ncom/bbflight/background_downloader/ParallelDownloadTaskWorker$process$2$2\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,502:1\n113#2:503\n*S KotlinDebug\n*F\n+ 1 ParallelDownloadTaskWorker.kt\ncom/bbflight/background_downloader/ParallelDownloadTaskWorker$process$2$2\n*L\n164#1:503\n*E\n"})
        /* renamed from: com.bbflight.background_downloader.ParallelDownloadTaskWorker$b$b, reason: collision with other inner class name */
        public static final class C0050b extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ ParallelDownloadTaskWorker c;

            @DebugMetadata(c = "com.bbflight.background_downloader.ParallelDownloadTaskWorker$process$2$2$1", f = "ParallelDownloadTaskWorker.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, nl = {154}, s = {}, v = 2)
            /* renamed from: com.bbflight.background_downloader.ParallelDownloadTaskWorker$b$b$a */
            public static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Boolean>, Object> {
                public int a;
                public final /* synthetic */ ParallelDownloadTaskWorker b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ParallelDownloadTaskWorker parallelDownloadTaskWorker, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.b = parallelDownloadTaskWorker;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Boolean> continuation) {
                    return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    ParallelDownloadTaskWorker parallelDownloadTaskWorker = this.b;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.a = 1;
                        if (parallelDownloadTaskWorker.r(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Boxing.boxBoolean(parallelDownloadTaskWorker.E.M(W0.f));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0050b(ParallelDownloadTaskWorker parallelDownloadTaskWorker, Continuation<? super C0050b> continuation) {
                super(2, continuation);
                this.c = parallelDownloadTaskWorker;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0050b c0050b = new C0050b(this.c, continuation);
                c0050b.b = obj;
                return c0050b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
                return ((C0050b) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x00eb, code lost:
            
                if (com.bbflight.background_downloader.TaskWorker.Companion.c(r11, "resumeData", r2, r3, r10) == r1) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
            
                if (r11 == r1) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
            
                if (kotlinx.coroutines.C1082i.f(r2, r11, r10) == r1) goto L40;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int collectionSizeOrDefault;
                kotlinx.coroutines.K k = (kotlinx.coroutines.K) this.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                ParallelDownloadTaskWorker parallelDownloadTaskWorker = this.c;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        TaskWorker.Companion companion = TaskWorker.INSTANCE;
                        M0 k2 = parallelDownloadTaskWorker.k();
                        b.a aVar = kotlinx.serialization.json.b.d;
                        List<O> list = parallelDownloadTaskWorker.C;
                        aVar.getClass();
                        String b = aVar.b(new C1135f(O.Companion.serializer()), list);
                        this.b = SpillingKt.nullOutSpilledVariable(k);
                        this.a = 3;
                    } else {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            parallelDownloadTaskWorker.E.M(W0.k);
                            return Unit.INSTANCE;
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
                ResultKt.throwOnFailure(obj);
                while (true) {
                    if (!kotlinx.coroutines.L.d(k)) {
                        break;
                    }
                    if (parallelDownloadTaskWorker.isStopped()) {
                        kotlinx.coroutines.J0 j0 = kotlinx.coroutines.J0.a;
                        a aVar2 = new a(parallelDownloadTaskWorker, null);
                        this.b = SpillingKt.nullOutSpilledVariable(k);
                        this.a = 1;
                    } else {
                        BDPlugin.INSTANCE.getClass();
                        if (BDPlugin.p.remove(parallelDownloadTaskWorker.k().a)) {
                            this.b = SpillingKt.nullOutSpilledVariable(k);
                            this.a = 2;
                            TaskWorker.Companion companion2 = TaskWorker.INSTANCE;
                            M0 k3 = parallelDownloadTaskWorker.k();
                            b.a aVar3 = kotlinx.serialization.json.b.d;
                            List<O> list2 = parallelDownloadTaskWorker.C;
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((O) it.next()).d);
                            }
                            aVar3.getClass();
                            Object c = TaskWorker.Companion.c(companion2, "pauseTasks", k3, aVar3.b(new C1135f(M0.Companion.serializer()), arrayList), this);
                            if (c != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                c = Unit.INSTANCE;
                            }
                        } else {
                            this.b = k;
                            this.a = 4;
                            if (kotlinx.coroutines.W.b(200L, this) == coroutine_suspended) {
                                break;
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HttpURLConnection httpURLConnection, Continuation<? super b> continuation) {
            super(2, continuation);
            this.j = httpURLConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = ParallelDownloadTaskWorker.this.new b(this.j, continuation);
            bVar.f = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super W0> continuation) {
            return ((b) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x01b1, code lost:
        
            if (com.google.common.base.r.c(r4, r12) == r2) goto L66;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x01d3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x019a  */
        /* JADX WARN: Type inference failed for: r3v13, types: [kotlinx.coroutines.x0] */
        /* JADX WARN: Type inference failed for: r3v18, types: [kotlinx.coroutines.x0] */
        /* JADX WARN: Type inference failed for: r4v18, types: [kotlinx.coroutines.x0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.Q0 q0;
            InterfaceC1120x0 interfaceC1120x0;
            InterfaceC1120x0 interfaceC1120x02;
            InterfaceC1120x0 interfaceC1120x03;
            InterfaceC1120x0 interfaceC1120x04;
            kotlinx.coroutines.Q0 q02;
            W0 w0;
            kotlinx.coroutines.Q0 q03;
            Object obj2;
            InterfaceC1120x0 interfaceC1120x05;
            kotlinx.coroutines.K k = (kotlinx.coroutines.K) this.f;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            ParallelDownloadTaskWorker parallelDownloadTaskWorker = ParallelDownloadTaskWorker.this;
            switch (i) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    q0 = null;
                    try {
                        kotlinx.coroutines.Q0 c = C1082i.c(k, null, null, new a(parallelDownloadTaskWorker, this.j, null), 3);
                        try {
                            q0 = C1082i.c(k, null, null, new C0050b(parallelDownloadTaskWorker, null), 3);
                            C1117w c1117w = parallelDownloadTaskWorker.E;
                            this.f = SpillingKt.nullOutSpilledVariable(k);
                            this.a = c;
                            this.b = q0;
                            this.e = 1;
                            Object await = c1117w.await(this);
                            if (await != coroutine_suspended) {
                                interfaceC1120x04 = c;
                                q02 = q0;
                                obj = await;
                                if (interfaceC1120x04 != null) {
                                    this.f = SpillingKt.nullOutSpilledVariable(k);
                                    this.a = SpillingKt.nullOutSpilledVariable(interfaceC1120x04);
                                    this.b = q02;
                                    this.c = obj;
                                    this.e = 2;
                                    if (com.google.common.base.r.c(interfaceC1120x04, this) != coroutine_suspended) {
                                        obj2 = obj;
                                        interfaceC1120x05 = interfaceC1120x04;
                                        q02 = q02;
                                        obj = obj2;
                                        interfaceC1120x04 = interfaceC1120x05;
                                    }
                                }
                                if (q02 != null) {
                                    this.f = SpillingKt.nullOutSpilledVariable(k);
                                    this.a = SpillingKt.nullOutSpilledVariable(interfaceC1120x04);
                                    this.b = SpillingKt.nullOutSpilledVariable(q02);
                                    this.c = obj;
                                    this.e = 3;
                                    if (com.google.common.base.r.c(q02, this) == coroutine_suspended) {
                                    }
                                }
                                return obj;
                            }
                        } catch (Exception e) {
                            interfaceC1120x03 = c;
                            e = e;
                            try {
                                String str = parallelDownloadTaskWorker.k().a;
                                e.toString();
                                parallelDownloadTaskWorker.q = new P0(W.b, "Exception for taskId " + parallelDownloadTaskWorker.k().a + ": " + e, 2);
                                w0 = W0.f;
                            } catch (Throwable th) {
                                th = th;
                                interfaceC1120x0 = q0;
                                interfaceC1120x02 = interfaceC1120x03;
                                if (interfaceC1120x02 != null) {
                                    this.f = SpillingKt.nullOutSpilledVariable(k);
                                    this.a = SpillingKt.nullOutSpilledVariable(interfaceC1120x02);
                                    this.b = interfaceC1120x0;
                                    this.c = th;
                                    this.e = 6;
                                    break;
                                }
                                if (interfaceC1120x0 != null) {
                                }
                            }
                            if (interfaceC1120x03 != null) {
                                this.f = SpillingKt.nullOutSpilledVariable(k);
                                this.a = SpillingKt.nullOutSpilledVariable(interfaceC1120x03);
                                this.b = q0;
                                this.c = SpillingKt.nullOutSpilledVariable(e);
                                this.d = w0;
                                this.e = 4;
                                if (com.google.common.base.r.c(interfaceC1120x03, this) != coroutine_suspended) {
                                    q03 = q0;
                                    q0 = q03;
                                }
                            }
                            if (q0 == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC1120x02 = c;
                            interfaceC1120x0 = q0;
                            if (interfaceC1120x02 != null) {
                            }
                            if (interfaceC1120x0 != null) {
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        interfaceC1120x03 = null;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC1120x0 = null;
                        interfaceC1120x02 = null;
                    }
                case 1:
                    ?? r3 = (InterfaceC1120x0) this.b;
                    interfaceC1120x04 = (InterfaceC1120x0) this.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        q02 = r3;
                        if (interfaceC1120x04 != null) {
                        }
                        if (q02 != null) {
                        }
                        return obj;
                    } catch (Exception e3) {
                        e = e3;
                        q0 = r3;
                        interfaceC1120x03 = interfaceC1120x04;
                        String str2 = parallelDownloadTaskWorker.k().a;
                        e.toString();
                        parallelDownloadTaskWorker.q = new P0(W.b, "Exception for taskId " + parallelDownloadTaskWorker.k().a + ": " + e, 2);
                        w0 = W0.f;
                        if (interfaceC1120x03 != null) {
                        }
                        if (q0 == null) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        interfaceC1120x02 = interfaceC1120x04;
                        interfaceC1120x0 = r3;
                        if (interfaceC1120x02 != null) {
                        }
                        if (interfaceC1120x0 != null) {
                        }
                    }
                    break;
                case 2:
                    obj2 = this.c;
                    ?? r32 = (InterfaceC1120x0) this.b;
                    interfaceC1120x05 = (InterfaceC1120x0) this.a;
                    ResultKt.throwOnFailure(obj);
                    q02 = r32;
                    obj = obj2;
                    interfaceC1120x04 = interfaceC1120x05;
                    if (q02 != null) {
                    }
                    return obj;
                case 3:
                    Object obj3 = this.c;
                    ResultKt.throwOnFailure(obj);
                    return obj3;
                case 4:
                    w0 = this.d;
                    e = (Exception) this.c;
                    ?? r4 = (InterfaceC1120x0) this.b;
                    interfaceC1120x03 = (InterfaceC1120x0) this.a;
                    ResultKt.throwOnFailure(obj);
                    q03 = r4;
                    q0 = q03;
                    if (q0 == null) {
                        return w0;
                    }
                    this.f = SpillingKt.nullOutSpilledVariable(k);
                    this.a = SpillingKt.nullOutSpilledVariable(interfaceC1120x03);
                    this.b = SpillingKt.nullOutSpilledVariable(q0);
                    this.c = SpillingKt.nullOutSpilledVariable(e);
                    this.d = w0;
                    this.e = 5;
                    return com.google.common.base.r.c(q0, this) == coroutine_suspended ? coroutine_suspended : w0;
                case 5:
                    W0 w02 = this.d;
                    ResultKt.throwOnFailure(obj);
                    return w02;
                case 6:
                    th = (Throwable) this.c;
                    interfaceC1120x0 = (InterfaceC1120x0) this.b;
                    interfaceC1120x02 = (InterfaceC1120x0) this.a;
                    ResultKt.throwOnFailure(obj);
                    if (interfaceC1120x0 != null) {
                        throw th;
                    }
                    this.f = SpillingKt.nullOutSpilledVariable(k);
                    this.a = SpillingKt.nullOutSpilledVariable(interfaceC1120x02);
                    this.b = SpillingKt.nullOutSpilledVariable(interfaceC1120x0);
                    this.c = th;
                    this.e = 7;
                    if (com.google.common.base.r.c(interfaceC1120x0, this) != coroutine_suspended) {
                        throw th;
                    }
                    break;
                case 7:
                    Throwable th5 = (Throwable) this.c;
                    ResultKt.throwOnFailure(obj);
                    throw th5;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParallelDownloadTaskWorker(Context applicationContext, WorkerParameters workerParams) {
        super(applicationContext, workerParams);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.B = -1L;
        this.C = new ArrayList();
        this.D = "";
        this.E = C1119x.a();
        this.F = W0.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.bbflight.background_downloader.TaskWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(HttpURLConnection httpURLConnection, Continuation<? super W0> continuation) {
        a aVar;
        int i;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                Object obj = aVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BDPlugin.INSTANCE.getClass();
                    BDPlugin.q.put(k().a, this);
                    this.x = true;
                    C0654k0 c0654k0 = this.m;
                    this.y = (c0654k0 != null ? c0654k0.a : null) != null;
                    httpURLConnection.setRequestMethod("HEAD");
                    aVar.a = SpillingKt.nullOutSpilledVariable(httpURLConnection);
                    aVar.d = 1;
                    obj = TaskWorker.d(this, httpURLConnection, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                W0 w0 = (W0) obj;
                BDPlugin.INSTANCE.getClass();
                BDPlugin.q.remove(k().a);
                return w0;
            }
        }
        aVar = new a((ContinuationImpl) continuation);
        Object obj2 = aVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        W0 w02 = (W0) obj2;
        BDPlugin.INSTANCE.getClass();
        BDPlugin.q.remove(k().a);
        return w02;
    }

    @Override // com.bbflight.background_downloader.TaskWorker
    public final boolean e() {
        String string = getInputData().getString("tempFilename");
        if (string == null) {
            string = "";
        }
        this.D = string;
        return string.length() > 0;
    }

    @Override // com.bbflight.background_downloader.TaskWorker
    public final Object l(HttpURLConnection httpURLConnection, String str, Continuation<? super W0> continuation) {
        return C1082i.f(new b(httpURLConnection, null), C1049c0.a, continuation);
    }

    public final Object r(ContinuationImpl continuationImpl) {
        int collectionSizeOrDefault;
        TaskWorker.Companion companion = TaskWorker.INSTANCE;
        M0 k = k();
        b.a aVar = kotlinx.serialization.json.b.d;
        List<O> list = this.C;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((O) it.next()).d.a);
        }
        aVar.getClass();
        Object c = TaskWorker.Companion.c(companion, "cancelTasksWithId", k, aVar.b(new C1135f(kotlinx.serialization.internal.S0.a), arrayList), continuationImpl);
        return c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01a9, code lost:
    
        if (com.bbflight.background_downloader.TaskWorker.Companion.b("enqueueChild", r13, r15, r0, r6) != r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0272, code lost:
    
        if (r(r6) == r7) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02b6, code lost:
    
        if (r(r6) == r7) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02fd, code lost:
    
        if (r5 == r7) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(String str, W0 w0, P0 p0, String str2, ContinuationImpl continuationImpl) {
        C0672u0 c0672u0;
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        W0 w02;
        int i2;
        O o;
        M0 m0;
        int i3;
        W0 w03;
        String str3;
        P0 p02 = p0;
        String str4 = str2;
        if (continuationImpl instanceof C0672u0) {
            c0672u0 = (C0672u0) continuationImpl;
            int i4 = c0672u0.m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0672u0.m = i4 - Integer.MIN_VALUE;
                Object obj4 = c0672u0.k;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0672u0.m;
                C1117w c1117w = this.E;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj4);
                    Iterator<T> it = this.C.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual(((O) obj).d.a, str)) {
                            break;
                        }
                    }
                    O o2 = (O) obj;
                    if (o2 == null) {
                        return Unit.INSTANCE;
                    }
                    M0 m02 = o2.d;
                    if (w0 != W0.f || (i2 = m02.r) <= 0) {
                        Intrinsics.checkNotNullParameter(w0, "<set-?>");
                        o2.g = w0;
                        Iterator<T> it2 = this.C.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (((O) obj2).g == W0.f) {
                                break;
                            }
                        }
                        if (((O) obj2) != null) {
                            w02 = W0.f;
                        } else {
                            Iterator<T> it3 = this.C.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it3.next();
                                if (((O) obj3).g == W0.e) {
                                    break;
                                }
                            }
                            if (((O) obj3) != null) {
                                w02 = W0.e;
                            } else {
                                List<O> list = this.C;
                                if (list == null || !list.isEmpty()) {
                                    Iterator<T> it4 = list.iterator();
                                    while (it4.hasNext()) {
                                        if (((O) it4.next()).g != W0.d) {
                                            w02 = null;
                                            break;
                                        }
                                    }
                                }
                                w02 = W0.d;
                            }
                        }
                        if (w02 == null || w02 == this.F) {
                            w02 = null;
                        } else {
                            this.F = w02;
                        }
                        if (w02 != null) {
                            int ordinal = w02.ordinal();
                            if (ordinal == 2) {
                                c0672u0.a = SpillingKt.nullOutSpilledVariable(str);
                                c0672u0.b = SpillingKt.nullOutSpilledVariable(w0);
                                c0672u0.c = SpillingKt.nullOutSpilledVariable(p02);
                                c0672u0.d = SpillingKt.nullOutSpilledVariable(str4);
                                c0672u0.e = SpillingKt.nullOutSpilledVariable(o2);
                                c0672u0.f = SpillingKt.nullOutSpilledVariable(m02);
                                c0672u0.i = SpillingKt.nullOutSpilledVariable(w02);
                                c0672u0.m = 3;
                                kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                                obj4 = C1082i.f(new C0676w0(this, null), kotlinx.coroutines.scheduling.b.a, c0672u0);
                            } else if (ordinal == 3) {
                                this.q = p02;
                                this.r = str4;
                                c0672u0.a = SpillingKt.nullOutSpilledVariable(str);
                                c0672u0.b = SpillingKt.nullOutSpilledVariable(w0);
                                c0672u0.c = SpillingKt.nullOutSpilledVariable(p02);
                                c0672u0.d = SpillingKt.nullOutSpilledVariable(str4);
                                c0672u0.e = SpillingKt.nullOutSpilledVariable(o2);
                                c0672u0.f = SpillingKt.nullOutSpilledVariable(m02);
                                c0672u0.i = SpillingKt.nullOutSpilledVariable(w02);
                                c0672u0.m = 5;
                            } else if (ordinal != 4) {
                                Unit unit = Unit.INSTANCE;
                            } else {
                                this.q = p02;
                                c0672u0.a = SpillingKt.nullOutSpilledVariable(str);
                                c0672u0.b = SpillingKt.nullOutSpilledVariable(w0);
                                c0672u0.c = SpillingKt.nullOutSpilledVariable(p02);
                                c0672u0.d = SpillingKt.nullOutSpilledVariable(str4);
                                c0672u0.e = SpillingKt.nullOutSpilledVariable(o2);
                                c0672u0.f = SpillingKt.nullOutSpilledVariable(m02);
                                c0672u0.i = SpillingKt.nullOutSpilledVariable(w02);
                                c0672u0.m = 4;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    int i5 = i2 - 1;
                    m02.r = i5;
                    int min = 2 << Math.min((m02.q - i5) - 1, 8);
                    c0672u0.a = str;
                    c0672u0.b = SpillingKt.nullOutSpilledVariable(w0);
                    c0672u0.c = p02;
                    c0672u0.d = str4;
                    c0672u0.e = o2;
                    c0672u0.f = SpillingKt.nullOutSpilledVariable(m02);
                    c0672u0.j = min;
                    c0672u0.m = 1;
                    if (kotlinx.coroutines.W.b(min * 1000, c0672u0) != coroutine_suspended) {
                        o = o2;
                        m0 = m02;
                        i3 = min;
                        w03 = w0;
                        str3 = str;
                        TaskWorker.Companion companion = TaskWorker.INSTANCE;
                        M0 k = k();
                        b.a aVar = kotlinx.serialization.json.b.d;
                        M0 m03 = o.d;
                        aVar.getClass();
                        String b2 = aVar.b(M0.Companion.serializer(), m03);
                        C0674v0 c0674v0 = new C0674v0(this, str3, p02, str4, null);
                        c0672u0.a = SpillingKt.nullOutSpilledVariable(str3);
                        c0672u0.b = SpillingKt.nullOutSpilledVariable(w03);
                        c0672u0.c = SpillingKt.nullOutSpilledVariable(p02);
                        c0672u0.d = SpillingKt.nullOutSpilledVariable(str4);
                        c0672u0.e = SpillingKt.nullOutSpilledVariable(o);
                        c0672u0.f = SpillingKt.nullOutSpilledVariable(m0);
                        c0672u0.j = i3;
                        c0672u0.m = 2;
                        companion.getClass();
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj4);
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj4);
                        Boxing.boxBoolean(c1117w.M((W0) obj4));
                        return Unit.INSTANCE;
                    }
                    if (i == 4) {
                        ResultKt.throwOnFailure(obj4);
                        Boxing.boxBoolean(c1117w.M(W0.f));
                        return Unit.INSTANCE;
                    }
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj4);
                    Boxing.boxBoolean(c1117w.M(W0.e));
                    return Unit.INSTANCE;
                }
                int i6 = c0672u0.j;
                M0 m04 = (M0) c0672u0.f;
                O o3 = (O) c0672u0.e;
                str4 = (String) c0672u0.d;
                P0 p03 = (P0) c0672u0.c;
                w03 = (W0) c0672u0.b;
                String str5 = (String) c0672u0.a;
                ResultKt.throwOnFailure(obj4);
                m0 = m04;
                str3 = str5;
                o = o3;
                p02 = p03;
                i3 = i6;
                TaskWorker.Companion companion2 = TaskWorker.INSTANCE;
                M0 k2 = k();
                b.a aVar2 = kotlinx.serialization.json.b.d;
                M0 m032 = o.d;
                aVar2.getClass();
                String b22 = aVar2.b(M0.Companion.serializer(), m032);
                C0674v0 c0674v02 = new C0674v0(this, str3, p02, str4, null);
                c0672u0.a = SpillingKt.nullOutSpilledVariable(str3);
                c0672u0.b = SpillingKt.nullOutSpilledVariable(w03);
                c0672u0.c = SpillingKt.nullOutSpilledVariable(p02);
                c0672u0.d = SpillingKt.nullOutSpilledVariable(str4);
                c0672u0.e = SpillingKt.nullOutSpilledVariable(o);
                c0672u0.f = SpillingKt.nullOutSpilledVariable(m0);
                c0672u0.j = i3;
                c0672u0.m = 2;
                companion2.getClass();
            }
        }
        c0672u0 = new C0672u0(this, continuationImpl);
        Object obj42 = c0672u0.k;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0672u0.m;
        C1117w c1117w2 = this.E;
        if (i != 0) {
        }
    }
}
