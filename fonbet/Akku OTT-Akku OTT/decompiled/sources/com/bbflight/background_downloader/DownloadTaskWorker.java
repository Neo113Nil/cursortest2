package com.bbflight.background_downloader;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.preference.PreferenceManager;
import androidx.work.WorkerParameters;
import com.bbflight.background_downloader.BDPlugin;
import com.bbflight.background_downloader.TaskWorker;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.C1049c0;
import okhttp3.internal.http.HttpStatusCodesKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001cH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bbflight/background_downloader/DownloadTaskWorker;", "Lcom/bbflight/background_downloader/TaskWorker;", "applicationContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "eTagHeader", "", "serverAcceptsRanges", "", "tempFilePath", "requiredStartByte", "", "taskRangeStartByte", "eTag", "connectAndProcess", "Lcom/bbflight/background_downloader/TaskStatus;", "connection", "Ljava/net/HttpURLConnection;", "(Ljava/net/HttpURLConnection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "process", "filePath", "(Ljava/net/HttpURLConnection;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "determineIfResume", "prepareResume", "prepResumeAfterFailure", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTempFile", "background_downloader_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDownloadTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadTaskWorker.kt\ncom/bbflight/background_downloader/DownloadTaskWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,431:1\n1#2:432\n*E\n"})
/* loaded from: classes3.dex */
public final class DownloadTaskWorker extends TaskWorker {
    public String B;
    public boolean C;
    public String D;
    public long E;
    public long F;
    public String G;

    @DebugMetadata(c = "com.bbflight.background_downloader.DownloadTaskWorker", f = "DownloadTaskWorker.kt", i = {0, 1, 1}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 54}, m = "connectAndProcess", n = {"connection", "connection", "result"}, nl = {50, 56}, s = {"L$0", "L$0", "L$1"}, v = 2)
    public static final class a extends ContinuationImpl {
        public Object a;
        public W0 b;
        public /* synthetic */ Object c;
        public int e;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return DownloadTaskWorker.this.c(null, this);
        }
    }

    @DebugMetadata(c = "com.bbflight.background_downloader.DownloadTaskWorker", f = "DownloadTaskWorker.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, l = {76, 98, 163, 178, 205, 248, 265}, m = "process", n = {"connection", "filePath", "acceptRangesHeader", "connection", "filePath", "acceptRangesHeader", "destFilePath", "connection", "filePath", "acceptRangesHeader", "destFilePath", "applicationSupportPath", "cachePath", "tempDir", "tempFile", "transferBytesResult", "inputStream", "outputStream", "contentLength", "$i$a$-use-DownloadTaskWorker$process$3", "$i$a$-use-DownloadTaskWorker$process$3$1", "connection", "filePath", "acceptRangesHeader", "destFilePath", "applicationSupportPath", "cachePath", "tempDir", "tempFile", "transferBytesResult", "destFile", "dir", "contentLength", "connection", "filePath", "acceptRangesHeader", "destFilePath", "applicationSupportPath", "cachePath", "tempDir", "tempFile", "transferBytesResult", "contentLength", "connection", "filePath", "acceptRangesHeader", "destFilePath", "applicationSupportPath", "cachePath", "tempDir", "tempFile", "transferBytesResult", "contentLength", "start", "connection", "filePath", "acceptRangesHeader", "destFilePath", "applicationSupportPath", "cachePath", "tempDir", "tempFile", "transferBytesResult", "contentLength"}, nl = {81, HttpStatusCodesKt.HTTP_EARLY_HINTS, 166, 186, 210, 255, 266}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "L$12", "J$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0"}, v = 2)
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public Object m;
        public FileOutputStream n;
        public Object o;
        public Ref.ObjectRef p;
        public long q;
        public /* synthetic */ Object r;
        public int t;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.r = obj;
            this.t |= Integer.MIN_VALUE;
            return DownloadTaskWorker.this.l(null, null, this);
        }
    }

    @DebugMetadata(c = "com.bbflight.background_downloader.DownloadTaskWorker$process$4", f = "DownloadTaskWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    public static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Path>, Object> {
        public final /* synthetic */ File a;
        public final /* synthetic */ File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file, File file2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.a = file;
            this.b = file2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.a, this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Path> continuation) {
            return ((c) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Path path;
            Path path2;
            StandardCopyOption standardCopyOption;
            Path move;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            path = this.a.toPath();
            path2 = this.b.toPath();
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            move = Files.move(path, path2, standardCopyOption);
            return move;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadTaskWorker(Context applicationContext, WorkerParameters workerParams) {
        super(applicationContext, workerParams);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.D = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.bbflight.background_downloader.TaskWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(HttpURLConnection httpURLConnection, Continuation<? super W0> continuation) {
        a aVar;
        int i;
        W0 w0;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
                Object obj = aVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.e) {
                        String str = k().e.get(RtspHeaders.RANGE);
                        if (str == null) {
                            str = "";
                        }
                        Pair<Long, Long> c2 = C0633a0.c(str);
                        long longValue = c2.getFirst().longValue();
                        this.F = longValue;
                        Pair pair = new Pair(Boxing.boxLong(longValue + this.E), c2.getSecond());
                        Object first = pair.getFirst();
                        Object obj2 = (Long) pair.getSecond();
                        httpURLConnection.setRequestProperty(RtspHeaders.RANGE, "bytes=" + first + "-" + (obj2 != null ? obj2 : ""));
                    }
                    aVar.a = SpillingKt.nullOutSpilledVariable(httpURLConnection);
                    aVar.e = 1;
                    obj = TaskWorker.d(this, httpURLConnection, aVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        W0 w02 = aVar.b;
                        ResultKt.throwOnFailure(obj);
                        return w02;
                    }
                    httpURLConnection = (HttpURLConnection) aVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                w0 = (W0) obj;
                if (w0 == W0.i) {
                    r();
                }
                if (w0 == W0.f) {
                    aVar.a = SpillingKt.nullOutSpilledVariable(httpURLConnection);
                    aVar.b = w0;
                    aVar.e = 2;
                    if (s(aVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return w0;
            }
        }
        aVar = new a((ContinuationImpl) continuation);
        Object obj3 = aVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.e;
        if (i != 0) {
        }
        w0 = (W0) obj3;
        if (w0 == W0.i) {
        }
        if (w0 == W0.f) {
        }
        return w0;
    }

    @Override // com.bbflight.background_downloader.TaskWorker
    public final boolean e() {
        Path path;
        StandardOpenOption standardOpenOption;
        FileChannel open;
        String string;
        long j = getInputData().getLong("startByte", 0L);
        this.E = j;
        String str = "";
        if (j > 0 && (string = getInputData().getString("tempFilename")) != null) {
            str = string;
        }
        this.D = str;
        this.G = getInputData().getString("eTag");
        if (this.E != 0) {
            File file = new File(this.D);
            if (file.exists()) {
                long length = file.length();
                if (length == this.E) {
                    return true;
                }
                file.length();
                if (length > this.E && Build.VERSION.SDK_INT >= 26) {
                    try {
                        path = file.toPath();
                        standardOpenOption = StandardOpenOption.WRITE;
                        open = FileChannel.open(path, standardOpenOption);
                        open.truncate(this.E);
                        open.close();
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x035e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0 != null ? r0.subSequence(0, 1) : null, "W/") != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0212, code lost:
    
        if (r2 == r11) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0650, code lost:
    
        if (s(r7) == r11) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x06e1, code lost:
    
        if (com.bbflight.background_downloader.TaskWorker.Companion.e(r17, r6, r7) == r11) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x07b1, code lost:
    
        if (kotlinx.coroutines.C1082i.f(r10, r3, r7) == r11) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0871, code lost:
    
        if (com.bbflight.background_downloader.BDPlugin.Companion.e(r3, r2, r8, r6, r17, null, r7, 32) == r11) goto L227;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x042f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Type inference failed for: r0v178 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v99, types: [T] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.io.Closeable] */
    @Override // com.bbflight.background_downloader.TaskWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(HttpURLConnection httpURLConnection, String str, Continuation<? super W0> continuation) {
        b bVar;
        b bVar2;
        List<String> list;
        HttpURLConnection httpURLConnection2;
        String str2;
        List<String> list2;
        boolean z;
        HttpURLConnection httpURLConnection3;
        String str3;
        Object obj;
        DownloadTaskWorker downloadTaskWorker;
        String str4;
        List<String> list3;
        String value;
        String value2;
        String value3;
        List<String> list4;
        long b2;
        String a2;
        String a3;
        String str5;
        File file;
        Throwable th;
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        ?? r6;
        FileOutputStream fileOutputStream2;
        File file2;
        String str6;
        String str7;
        BufferedInputStream bufferedInputStream2;
        HttpURLConnection httpURLConnection4;
        File file3;
        Ref.ObjectRef objectRef;
        ?? r0;
        FileOutputStream fileOutputStream3;
        Ref.ObjectRef objectRef2;
        int i;
        long j;
        UUID uuidForPath;
        String parent;
        Throwable th2;
        BufferedInputStream bufferedInputStream3;
        int ordinal;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.t = i2 - Integer.MIN_VALUE;
                bVar2 = bVar;
                Object obj2 = bVar2.r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (bVar2.t) {
                    case 0:
                        ResultKt.throwOnFailure(obj2);
                        this.t = Boxing.boxInt(httpURLConnection.getResponseCode());
                        int responseCode = httpURLConnection.getResponseCode();
                        if (200 > responseCode || responseCode >= 207) {
                            httpURLConnection.getResponseCode();
                            String str8 = k().a;
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
                        List<String> list5 = httpURLConnection.getHeaderFields().get("ETag");
                        this.B = list5 != null ? (String) CollectionsKt.first((List) list5) : null;
                        list = httpURLConnection.getHeaderFields().get("Accept-Ranges");
                        this.C = Intrinsics.areEqual(list != null ? (String) CollectionsKt.first((List) list) : null, "bytes") || httpURLConnection.getResponseCode() == 206;
                        if (k().s) {
                            this.d = this.C;
                            TaskWorker.Companion companion = TaskWorker.INSTANCE;
                            M0 k = k();
                            boolean z2 = this.d;
                            httpURLConnection2 = httpURLConnection;
                            bVar2.a = httpURLConnection2;
                            str2 = str;
                            bVar2.b = str2;
                            bVar2.c = SpillingKt.nullOutSpilledVariable(list);
                            bVar2.t = 1;
                            companion.getClass();
                            Object b3 = TaskWorker.Companion.b("canResume", k, Boxing.boxBoolean(z2), null, bVar2);
                            if (b3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                b3 = Unit.INSTANCE;
                                break;
                            }
                        } else {
                            httpURLConnection2 = httpURLConnection;
                            str2 = str;
                        }
                        list2 = list;
                        z = !this.e && httpURLConnection2.getResponseCode() == 206;
                        this.e = z;
                        if (z) {
                            if (this.D.length() != 0 && (list3 = httpURLConnection2.getHeaderFields().get("Content-Range")) != null && list3.size() <= 1) {
                                String str9 = (String) CollectionsKt.first((List) list3);
                                Regex regex = new Regex("(\\d+)-(\\d+)/(\\d+)");
                                Intrinsics.checkNotNull(str9);
                                MatchResult find$default = Regex.find$default(regex, str9, 0, 2, null);
                                if (find$default == null) {
                                    this.q = new P0(W.f, defpackage.g.a("Could not process partial response Content-Range ", str9), 2);
                                } else {
                                    MatchGroup matchGroup = find$default.getGroups().get(1);
                                    Long valueOf = (matchGroup == null || (value3 = matchGroup.getValue()) == null) ? null : Long.valueOf(Long.parseLong(value3));
                                    Intrinsics.checkNotNull(valueOf);
                                    long longValue = valueOf.longValue();
                                    MatchGroup matchGroup2 = find$default.getGroups().get(2);
                                    Long valueOf2 = (matchGroup2 == null || (value2 = matchGroup2.getValue()) == null) ? null : Long.valueOf(Long.parseLong(value2));
                                    Intrinsics.checkNotNull(valueOf2);
                                    valueOf2.getClass();
                                    MatchGroup matchGroup3 = find$default.getGroups().get(3);
                                    Long valueOf3 = (matchGroup3 == null || (value = matchGroup3.getValue()) == null) ? null : Long.valueOf(Long.parseLong(value));
                                    Intrinsics.checkNotNull(valueOf3);
                                    valueOf3.getClass();
                                    long length = new File(this.D).length();
                                    long j2 = longValue - this.F;
                                    this.b = j2;
                                    if (j2 > length) {
                                        this.q = new P0(W.f, "Offered range not feasible: " + str9 + " with startByte " + this.b, 2);
                                    } else {
                                        try {
                                            RandomAccessFile randomAccessFile = new RandomAccessFile(this.D, "rw");
                                            try {
                                                randomAccessFile.setLength(this.b);
                                                Unit unit = Unit.INSTANCE;
                                                CloseableKt.closeFinally(randomAccessFile, null);
                                            } finally {
                                            }
                                        } catch (IOException unused) {
                                            this.q = new P0(W.f, "Could not truncate temp file", 2);
                                        }
                                    }
                                }
                            }
                            r();
                            return W0.f;
                        }
                        if (this.e) {
                            if (Intrinsics.areEqual(this.B, this.G)) {
                                String str10 = this.G;
                                break;
                            }
                            r();
                            this.q = new P0(W.f, "Cannot resume: ETag is not identical, or is weak", 2);
                            return W0.f;
                        }
                        if (Intrinsics.areEqual(k().d, "?")) {
                            httpURLConnection3 = httpURLConnection2;
                            str3 = str2;
                            list4 = list2;
                            Map<String, List<String>> headerFields = httpURLConnection3.getHeaderFields();
                            Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
                            i(headerFields);
                            Map<String, List<String>> headerFields2 = httpURLConnection3.getHeaderFields();
                            Intrinsics.checkNotNullExpressionValue(headerFields2, "getHeaderFields(...)");
                            h(headerFields2);
                            Map<String, List<String>> headerFields3 = httpURLConnection3.getHeaderFields();
                            Intrinsics.checkNotNullExpressionValue(headerFields3, "getHeaderFields(...)");
                            b2 = C0633a0.b(headerFields3, k());
                            Context applicationContext = getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                            a2 = C0633a0.a(applicationContext, B.d);
                            Context applicationContext2 = getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                            a3 = C0633a0.a(applicationContext2, B.c);
                            if (a2 != null) {
                            }
                            throw new IllegalStateException("External storage is requested but not available");
                        }
                        M0 k2 = k();
                        Context applicationContext3 = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                        Map<String, List<String>> headerFields4 = httpURLConnection2.getHeaderFields();
                        Intrinsics.checkNotNullExpressionValue(headerFields4, "getHeaderFields(...)");
                        bVar2.a = httpURLConnection2;
                        bVar2.b = str2;
                        bVar2.c = SpillingKt.nullOutSpilledVariable(list2);
                        bVar2.d = SpillingKt.nullOutSpilledVariable(str2);
                        bVar2.e = this;
                        bVar2.t = 2;
                        Object e = k2.e(applicationContext3, headerFields4, true, bVar2);
                        if (e != coroutine_suspended) {
                            obj = e;
                            downloadTaskWorker = this;
                            str4 = str2;
                            M0 m0 = (M0) obj;
                            downloadTaskWorker.getClass();
                            Intrinsics.checkNotNullParameter(m0, "<set-?>");
                            downloadTaskWorker.a = m0;
                            parent = new File(str4).getParent();
                            if (parent == null) {
                                parent = "";
                            }
                            String b4 = android.support.v4.media.session.f.b(parent, DomExceptionUtils.SEPARATOR, k().d);
                            String str11 = k().a;
                            String str12 = k().d;
                            HttpURLConnection httpURLConnection5 = httpURLConnection2;
                            str3 = b4;
                            httpURLConnection3 = httpURLConnection5;
                            str2 = str4;
                            list4 = list2;
                            Map<String, List<String>> headerFields5 = httpURLConnection3.getHeaderFields();
                            Intrinsics.checkNotNullExpressionValue(headerFields5, "getHeaderFields(...)");
                            i(headerFields5);
                            Map<String, List<String>> headerFields22 = httpURLConnection3.getHeaderFields();
                            Intrinsics.checkNotNullExpressionValue(headerFields22, "getHeaderFields(...)");
                            h(headerFields22);
                            Map<String, List<String>> headerFields32 = httpURLConnection3.getHeaderFields();
                            Intrinsics.checkNotNullExpressionValue(headerFields32, "getHeaderFields(...)");
                            b2 = C0633a0.b(headerFields32, k());
                            Context applicationContext4 = getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext4, "getApplicationContext(...)");
                            a2 = C0633a0.a(applicationContext4, B.d);
                            Context applicationContext22 = getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext22, "getApplicationContext(...)");
                            a3 = C0633a0.a(applicationContext22, B.c);
                            if (a2 != null || a3 == null) {
                                throw new IllegalStateException("External storage is requested but not available");
                            }
                            int i3 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getInt("com.bbflight.background_downloader.config.useCacheDir", -2);
                            if (i3 == -1) {
                                str5 = str3;
                                file = new File(a2);
                            } else if (i3 != 0) {
                                Object systemService = getApplicationContext().getSystemService("storage");
                                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
                                StorageManager storageManager = (StorageManager) systemService;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    uuidForPath = storageManager.getUuidForPath(new File(a3));
                                    j = storageManager.getCacheQuotaBytes(uuidForPath);
                                } else {
                                    j = 52428800;
                                }
                                str5 = str3;
                                file = b2 < j / ((long) 2) ? new File(a3) : new File(a2);
                            } else {
                                str5 = str3;
                                file = new File(a3);
                            }
                            File file4 = file;
                            if (!file4.exists()) {
                                file4.mkdirs();
                            }
                            String str13 = this.D;
                            if (str13.length() == 0) {
                                str13 = file4.getAbsolutePath() + "/com.bbflight.background_downloader" + Random.INSTANCE.nextInt();
                            }
                            this.D = str13;
                            File file5 = new File(this.D);
                            Context applicationContext5 = getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext5, "getApplicationContext(...)");
                            Intrinsics.checkNotNullParameter(applicationContext5, "applicationContext");
                            if (b2 > 0 && (i = PreferenceManager.getDefaultSharedPreferences(applicationContext5).getInt("com.bbflight.background_downloader.config.checkAvailableSpace", 0)) > 0) {
                                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                                long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                                BDPlugin.INSTANCE.getClass();
                                if (availableBlocksLong - (CollectionsKt.sumOfLong(BDPlugin.w.values()) + b2) < (i << 20)) {
                                    String str14 = k().a;
                                    this.q = new P0(W.c, "Insufficient space to store the file to be downloaded", 2);
                                    return W0.f;
                                }
                            }
                            BDPlugin.INSTANCE.getClass();
                            BDPlugin.w.put(k().a, Boxing.boxLong(b2));
                            f(k(), b2);
                            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                            BufferedInputStream bufferedInputStream4 = new BufferedInputStream(httpURLConnection3.getInputStream());
                            try {
                                HttpURLConnection httpURLConnection6 = httpURLConnection3;
                                FileOutputStream fileOutputStream4 = new FileOutputStream(file5, this.e);
                                try {
                                    M0 k3 = k();
                                    bVar2.a = SpillingKt.nullOutSpilledVariable(httpURLConnection6);
                                    bVar2.b = SpillingKt.nullOutSpilledVariable(str2);
                                    bVar2.c = SpillingKt.nullOutSpilledVariable(list4);
                                    String str15 = str5;
                                    bVar2.d = str15;
                                    bVar2.e = SpillingKt.nullOutSpilledVariable(a2);
                                    bVar2.f = SpillingKt.nullOutSpilledVariable(a3);
                                    bVar2.i = SpillingKt.nullOutSpilledVariable(file4);
                                    bVar2.j = file5;
                                    bVar2.k = objectRef3;
                                    bVar2.l = bufferedInputStream4;
                                    bVar2.m = SpillingKt.nullOutSpilledVariable(bufferedInputStream4);
                                    bVar2.n = fileOutputStream4;
                                    bVar2.o = SpillingKt.nullOutSpilledVariable(fileOutputStream4);
                                    bVar2.p = objectRef3;
                                    bVar2.q = b2;
                                    bVar2.t = 3;
                                    bufferedInputStream = bufferedInputStream4;
                                    fileOutputStream = fileOutputStream4;
                                    try {
                                        Object p = p(bufferedInputStream, fileOutputStream, b2, k3, bVar2);
                                        if (p != coroutine_suspended) {
                                            file2 = file4;
                                            str6 = str15;
                                            str7 = a2;
                                            bufferedInputStream2 = bufferedInputStream;
                                            httpURLConnection4 = httpURLConnection6;
                                            file3 = file5;
                                            objectRef = objectRef3;
                                            r0 = p;
                                            fileOutputStream3 = fileOutputStream;
                                            objectRef2 = objectRef;
                                            try {
                                                objectRef2.element = r0;
                                                Unit unit2 = Unit.INSTANCE;
                                                try {
                                                    CloseableKt.closeFinally(fileOutputStream3, null);
                                                    CloseableKt.closeFinally(bufferedInputStream2, null);
                                                    ordinal = ((W0) objectRef.element).ordinal();
                                                    if (ordinal != 0) {
                                                        String str16 = str6;
                                                        HttpURLConnection httpURLConnection7 = httpURLConnection4;
                                                        File file6 = file3;
                                                        List<String> list6 = list4;
                                                        if (!k().s) {
                                                            String str17 = k().a;
                                                            this.q = new P0(W.e, "Task timed out", 2);
                                                            return W0.f;
                                                        }
                                                        if (!this.d) {
                                                            String str18 = k().a;
                                                            this.q = new P0(W.e, "Task timed out", 2);
                                                            r();
                                                            return W0.f;
                                                        }
                                                        String str19 = k().a;
                                                        long j3 = this.c + this.b;
                                                        BDPlugin.Companion companion2 = BDPlugin.INSTANCE;
                                                        Context applicationContext6 = getApplicationContext();
                                                        Intrinsics.checkNotNullExpressionValue(applicationContext6, "getApplicationContext(...)");
                                                        M0 k4 = k();
                                                        String str20 = this.l;
                                                        E0 e0 = new E0(k(), this.D, j3, this.G);
                                                        bVar2.a = SpillingKt.nullOutSpilledVariable(httpURLConnection7);
                                                        bVar2.b = SpillingKt.nullOutSpilledVariable(str2);
                                                        bVar2.c = SpillingKt.nullOutSpilledVariable(list6);
                                                        bVar2.d = SpillingKt.nullOutSpilledVariable(str16);
                                                        bVar2.e = SpillingKt.nullOutSpilledVariable(str7);
                                                        bVar2.f = SpillingKt.nullOutSpilledVariable(a3);
                                                        bVar2.i = SpillingKt.nullOutSpilledVariable(file2);
                                                        bVar2.j = SpillingKt.nullOutSpilledVariable(file6);
                                                        bVar2.k = SpillingKt.nullOutSpilledVariable(objectRef);
                                                        bVar2.l = null;
                                                        bVar2.m = null;
                                                        bVar2.n = null;
                                                        bVar2.o = null;
                                                        bVar2.p = null;
                                                        bVar2.q = b2;
                                                        bVar2.t = 6;
                                                        break;
                                                    } else {
                                                        if (ordinal == 2) {
                                                            String str21 = str6;
                                                            File file7 = new File(str21);
                                                            File parentFile = file7.getParentFile();
                                                            Intrinsics.checkNotNull(parentFile);
                                                            if (!parentFile.exists()) {
                                                                parentFile.mkdirs();
                                                            }
                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                                kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                                                                kotlinx.coroutines.scheduling.b bVar3 = kotlinx.coroutines.scheduling.b.a;
                                                                HttpURLConnection httpURLConnection8 = httpURLConnection4;
                                                                File file8 = file3;
                                                                c cVar2 = new c(file8, file7, null);
                                                                bVar2.a = SpillingKt.nullOutSpilledVariable(httpURLConnection8);
                                                                bVar2.b = SpillingKt.nullOutSpilledVariable(str2);
                                                                bVar2.c = SpillingKt.nullOutSpilledVariable(list4);
                                                                bVar2.d = str21;
                                                                bVar2.e = SpillingKt.nullOutSpilledVariable(str7);
                                                                bVar2.f = SpillingKt.nullOutSpilledVariable(a3);
                                                                bVar2.i = SpillingKt.nullOutSpilledVariable(file2);
                                                                bVar2.j = SpillingKt.nullOutSpilledVariable(file8);
                                                                bVar2.k = SpillingKt.nullOutSpilledVariable(objectRef);
                                                                bVar2.l = SpillingKt.nullOutSpilledVariable(file7);
                                                                bVar2.m = SpillingKt.nullOutSpilledVariable(parentFile);
                                                                bVar2.n = null;
                                                                bVar2.o = null;
                                                                bVar2.p = null;
                                                                bVar2.q = b2;
                                                                bVar2.t = 4;
                                                                break;
                                                            } else {
                                                                FilesKt__UtilsKt.copyTo$default(file3, file7, true, 0, 4, null);
                                                                r();
                                                            }
                                                            String str22 = k().a;
                                                            return W0.d;
                                                        }
                                                        if (ordinal == 7) {
                                                            BDPlugin.INSTANCE.getClass();
                                                            BDPlugin.p.remove(k().a);
                                                            if (!this.d) {
                                                                if (BDPlugin.r.contains(k()) && this.C) {
                                                                    String str23 = k().a;
                                                                    BDPlugin.n.put(k().a, new E0(k(), this.D, this.c + this.b, this.B));
                                                                    return W0.k;
                                                                }
                                                                String str24 = k().a;
                                                                this.q = new P0(W.f, "Task was paused but cannot resume", 2);
                                                                r();
                                                                return W0.f;
                                                            }
                                                            String str25 = k().a;
                                                            TaskWorker.Companion companion3 = TaskWorker.INSTANCE;
                                                            E0 e02 = new E0(k(), this.D, this.c + this.b, this.B);
                                                            SharedPreferences j4 = j();
                                                            bVar2.a = SpillingKt.nullOutSpilledVariable(httpURLConnection4);
                                                            bVar2.b = SpillingKt.nullOutSpilledVariable(str2);
                                                            bVar2.c = SpillingKt.nullOutSpilledVariable(list4);
                                                            bVar2.d = SpillingKt.nullOutSpilledVariable(str6);
                                                            bVar2.e = SpillingKt.nullOutSpilledVariable(str7);
                                                            bVar2.f = SpillingKt.nullOutSpilledVariable(a3);
                                                            bVar2.i = SpillingKt.nullOutSpilledVariable(file2);
                                                            bVar2.j = SpillingKt.nullOutSpilledVariable(file3);
                                                            bVar2.k = SpillingKt.nullOutSpilledVariable(objectRef);
                                                            bVar2.l = null;
                                                            bVar2.m = null;
                                                            bVar2.n = null;
                                                            bVar2.o = null;
                                                            bVar2.p = null;
                                                            bVar2.q = b2;
                                                            bVar2.t = 5;
                                                            companion3.getClass();
                                                            break;
                                                        } else if (ordinal == 4) {
                                                            bVar2.a = SpillingKt.nullOutSpilledVariable(httpURLConnection4);
                                                            bVar2.b = SpillingKt.nullOutSpilledVariable(str2);
                                                            bVar2.c = SpillingKt.nullOutSpilledVariable(list4);
                                                            bVar2.d = SpillingKt.nullOutSpilledVariable(str6);
                                                            bVar2.e = SpillingKt.nullOutSpilledVariable(str7);
                                                            bVar2.f = SpillingKt.nullOutSpilledVariable(a3);
                                                            bVar2.i = SpillingKt.nullOutSpilledVariable(file2);
                                                            bVar2.j = SpillingKt.nullOutSpilledVariable(file3);
                                                            bVar2.k = SpillingKt.nullOutSpilledVariable(objectRef);
                                                            bVar2.l = null;
                                                            bVar2.m = null;
                                                            bVar2.n = null;
                                                            bVar2.o = null;
                                                            bVar2.p = null;
                                                            bVar2.q = b2;
                                                            bVar2.t = 7;
                                                            break;
                                                        } else {
                                                            if (ordinal != 5) {
                                                                Objects.toString(objectRef.element);
                                                                r();
                                                                return W0.f;
                                                            }
                                                            r();
                                                            String str26 = k().a;
                                                            return W0.i;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    bufferedInputStream4 = bufferedInputStream2;
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th4) {
                                                        CloseableKt.closeFinally(bufferedInputStream4, th);
                                                        throw th4;
                                                    }
                                                }
                                            } catch (Throwable th5) {
                                                th2 = th5;
                                                fileOutputStream2 = fileOutputStream3;
                                                bufferedInputStream3 = bufferedInputStream2;
                                                try {
                                                    throw th2;
                                                } catch (Throwable th6) {
                                                    try {
                                                        CloseableKt.closeFinally(fileOutputStream2, th2);
                                                        throw th6;
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        bufferedInputStream4 = bufferedInputStream3;
                                                        throw th;
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        r6 = bufferedInputStream;
                                        fileOutputStream2 = fileOutputStream;
                                        th2 = th;
                                        bufferedInputStream3 = r6;
                                        throw th2;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    bufferedInputStream = bufferedInputStream4;
                                    fileOutputStream = fileOutputStream4;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                throw th;
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        list = (List) bVar2.c;
                        String str27 = (String) bVar2.b;
                        HttpURLConnection httpURLConnection9 = (HttpURLConnection) bVar2.a;
                        ResultKt.throwOnFailure(obj2);
                        str2 = str27;
                        httpURLConnection2 = httpURLConnection9;
                        list2 = list;
                        if (this.e) {
                            break;
                        }
                        this.e = z;
                        if (z) {
                        }
                        if (this.e) {
                        }
                        if (Intrinsics.areEqual(k().d, "?")) {
                        }
                        break;
                    case 2:
                        obj = obj2;
                        downloadTaskWorker = (DownloadTaskWorker) bVar2.e;
                        list2 = (List) bVar2.c;
                        str4 = (String) bVar2.b;
                        HttpURLConnection httpURLConnection10 = (HttpURLConnection) bVar2.a;
                        ResultKt.throwOnFailure(obj);
                        httpURLConnection2 = httpURLConnection10;
                        M0 m02 = (M0) obj;
                        downloadTaskWorker.getClass();
                        Intrinsics.checkNotNullParameter(m02, "<set-?>");
                        downloadTaskWorker.a = m02;
                        parent = new File(str4).getParent();
                        if (parent == null) {
                        }
                        String b42 = android.support.v4.media.session.f.b(parent, DomExceptionUtils.SEPARATOR, k().d);
                        String str112 = k().a;
                        String str122 = k().d;
                        HttpURLConnection httpURLConnection52 = httpURLConnection2;
                        str3 = b42;
                        httpURLConnection3 = httpURLConnection52;
                        str2 = str4;
                        list4 = list2;
                        Map<String, List<String>> headerFields52 = httpURLConnection3.getHeaderFields();
                        Intrinsics.checkNotNullExpressionValue(headerFields52, "getHeaderFields(...)");
                        i(headerFields52);
                        Map<String, List<String>> headerFields222 = httpURLConnection3.getHeaderFields();
                        Intrinsics.checkNotNullExpressionValue(headerFields222, "getHeaderFields(...)");
                        h(headerFields222);
                        Map<String, List<String>> headerFields322 = httpURLConnection3.getHeaderFields();
                        Intrinsics.checkNotNullExpressionValue(headerFields322, "getHeaderFields(...)");
                        b2 = C0633a0.b(headerFields322, k());
                        Context applicationContext42 = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext42, "getApplicationContext(...)");
                        a2 = C0633a0.a(applicationContext42, B.d);
                        Context applicationContext222 = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext222, "getApplicationContext(...)");
                        a3 = C0633a0.a(applicationContext222, B.c);
                        if (a2 != null) {
                        }
                        throw new IllegalStateException("External storage is requested but not available");
                    case 3:
                        long j5 = bVar2.q;
                        Ref.ObjectRef objectRef4 = bVar2.p;
                        fileOutputStream2 = bVar2.n;
                        r6 = (Closeable) bVar2.l;
                        Ref.ObjectRef objectRef5 = (Ref.ObjectRef) bVar2.k;
                        File file9 = (File) bVar2.j;
                        File file10 = (File) bVar2.i;
                        String str28 = (String) bVar2.f;
                        String str29 = (String) bVar2.e;
                        String str30 = (String) bVar2.d;
                        List<String> list7 = (List) bVar2.c;
                        String str31 = (String) bVar2.b;
                        HttpURLConnection httpURLConnection11 = (HttpURLConnection) bVar2.a;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            str2 = str31;
                            file3 = file9;
                            list4 = list7;
                            str6 = str30;
                            objectRef = objectRef5;
                            str7 = str29;
                            bufferedInputStream2 = r6;
                            fileOutputStream3 = fileOutputStream2;
                            httpURLConnection4 = httpURLConnection11;
                            objectRef2 = objectRef4;
                            r0 = obj2;
                            b2 = j5;
                            file2 = file10;
                            a3 = str28;
                            objectRef2.element = r0;
                            Unit unit22 = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileOutputStream3, null);
                            CloseableKt.closeFinally(bufferedInputStream2, null);
                            ordinal = ((W0) objectRef.element).ordinal();
                            if (ordinal != 0) {
                            }
                            return coroutine_suspended;
                        } catch (Throwable th11) {
                            th = th11;
                            th2 = th;
                            bufferedInputStream3 = r6;
                            throw th2;
                        }
                    case 4:
                        ResultKt.throwOnFailure(obj2);
                        String str222 = k().a;
                        return W0.d;
                    case 5:
                        ResultKt.throwOnFailure(obj2);
                        return W0.k;
                    case 6:
                        ResultKt.throwOnFailure(obj2);
                        return W0.k;
                    case 7:
                        ResultKt.throwOnFailure(obj2);
                        return W0.f;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        bVar = new b((ContinuationImpl) continuation);
        bVar2 = bVar;
        Object obj22 = bVar2.r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (bVar2.t) {
        }
    }

    public final void r() {
        if (this.D.length() > 0) {
            try {
                new File(this.D).delete();
            } catch (IOException unused) {
            }
        }
    }

    public final Object s(ContinuationImpl continuationImpl) {
        if (!this.C || this.c + this.b <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            r();
            return Unit.INSTANCE;
        }
        TaskWorker.Companion companion = TaskWorker.INSTANCE;
        E0 e0 = new E0(k(), this.D, this.c + this.b, this.B);
        SharedPreferences j = j();
        companion.getClass();
        Object e = TaskWorker.Companion.e(e0, j, continuationImpl);
        return e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e : Unit.INSTANCE;
    }
}
