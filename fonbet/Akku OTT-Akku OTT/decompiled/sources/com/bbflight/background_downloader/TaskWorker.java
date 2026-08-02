package com.bbflight.background_downloader;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.preference.PreferenceManager;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.Operation;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import com.bbflight.background_downloader.M;
import com.bbflight.background_downloader.M0;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.gms.wallet.WalletConstants;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.FileSystemException;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.time.DurationKt;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.serialization.internal.C1126a0;
import kotlinx.serialization.json.b;
import okhttp3.internal.http.HttpStatusCodesKt;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0003\b\u0016\u0018\u0000 \u0089\u00012\u00020\u0001:\u0002\u0089\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010d\u001a\u00020eH\u0096@¢\u0006\u0002\u0010fJ\b\u0010g\u001a\u00020\u0018H\u0016J\u000e\u0010h\u001a\u00020iH\u0082@¢\u0006\u0002\u0010fJ\u0016\u0010j\u001a\u00020i2\u0006\u0010k\u001a\u00020lH\u0096@¢\u0006\u0002\u0010mJ\u001e\u0010n\u001a\u00020i2\u0006\u0010k\u001a\u00020l2\u0006\u0010o\u001a\u00020+H\u0096@¢\u0006\u0002\u0010pJ.\u0010q\u001a\u00020i2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010wJ\u0018\u0010x\u001a\u00020\u00182\u0006\u0010y\u001a\u00020\"2\u0006\u0010z\u001a\u00020\u000fH\u0016J&\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020\"2\u0006\u0010~\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u007fJ\u0017\u0010\u0080\u0001\u001a\u00020|2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010v\u001a\u00020\u000fJ\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010+2\u0006\u0010k\u001a\u00020lJ\u0012\u0010F\u001a\u00020|2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J$\u0010\u0084\u0001\u001a\u00020|2\u001b\u0010\u0085\u0001\u001a\u0016\u0012\u0004\u0012\u00020+\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020+0\u0087\u00010\u0086\u0001J$\u0010\u0088\u0001\u001a\u00020|2\u001b\u0010\u0085\u0001\u001a\u0016\u0012\u0004\u0012\u00020+\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020+0\u0087\u00010\u0086\u0001R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u000e\u0010\u001f\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u000207X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010&\"\u0004\b>\u0010(R\u001a\u0010?\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0011\"\u0004\bA\u0010\u0013R\u001c\u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010H\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010-\"\u0004\bJ\u0010/R\u001c\u0010K\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+\u0018\u00010LX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010M\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u0010\n\u0002\u0010R\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0010\u0010S\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010T\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010V\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u001a\"\u0004\bX\u0010\u001cR\u001a\u0010Y\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u001a\"\u0004\b[\u0010\u001cR\u000e\u0010\\\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010]\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b]\u0010\u001aR\u001a\u0010^\u001a\u00020_X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006\u008a\u0001"}, d2 = {"Lcom/bbflight/background_downloader/TaskWorker;", "Landroidx/work/CoroutineWorker;", "applicationContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "task", "Lcom/bbflight/background_downloader/Task;", "getTask", "()Lcom/bbflight/background_downloader/Task;", "setTask", "(Lcom/bbflight/background_downloader/Task;)V", "startByte", "", "getStartByte", "()J", "setStartByte", "(J)V", "bytesTotal", "getBytesTotal", "setBytesTotal", "taskCanResume", "", "getTaskCanResume", "()Z", "setTaskCanResume", "(Z)V", "isResume", "setResume", "bytesTotalAtLastProgressUpdate", "lastProgressUpdateTime", "lastProgressUpdate", "", "nextProgressUpdateTime", "networkSpeed", "getNetworkSpeed", "()D", "setNetworkSpeed", "(D)V", "isTimedOut", "notificationConfigJsonString", "", "getNotificationConfigJsonString", "()Ljava/lang/String;", "setNotificationConfigJsonString", "(Ljava/lang/String;)V", "notificationConfig", "Lcom/bbflight/background_downloader/NotificationConfig;", "getNotificationConfig", "()Lcom/bbflight/background_downloader/NotificationConfig;", "setNotificationConfig", "(Lcom/bbflight/background_downloader/NotificationConfig;)V", "notificationId", "", "getNotificationId", "()I", "setNotificationId", "(I)V", "notificationProgress", "getNotificationProgress", "setNotificationProgress", "lastNotificationTime", "getLastNotificationTime", "setLastNotificationTime", "taskException", "Lcom/bbflight/background_downloader/TaskException;", "getTaskException", "()Lcom/bbflight/background_downloader/TaskException;", "setTaskException", "(Lcom/bbflight/background_downloader/TaskException;)V", "responseBody", "getResponseBody", "setResponseBody", "responseHeaders", "", "responseStatusCode", "getResponseStatusCode", "()Ljava/lang/Integer;", "setResponseStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "mimeType", "charSet", "runInForegroundFileSize", "canRunInForeground", "getCanRunInForeground", "setCanRunInForeground", "runInForeground", "getRunInForeground", "setRunInForeground", "hasDeliveredResult", "isActive", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "setPrefs", "(Landroid/content/SharedPreferences;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "determineIfResume", "doTask", "Lcom/bbflight/background_downloader/TaskStatus;", "connectAndProcess", "connection", "Ljava/net/HttpURLConnection;", "(Ljava/net/HttpURLConnection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "process", "filePath", "(Ljava/net/HttpURLConnection;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transferBytes", "inputStream", "Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "contentLength", "(Ljava/io/InputStream;Ljava/io/OutputStream;JLcom/bbflight/background_downloader/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldSendProgressUpdate", "currentProgress", "now", "updateProgressAndNotify", "", NotificationCompat.CATEGORY_PROGRESS, "expectedFileSize", "(DJLcom/bbflight/background_downloader/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "determineRunInForeground", "responseErrorContent", "e", "", "extractContentType", "headers", "", "", "extractResponseHeaders", "Companion", "background_downloader_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,856:1\n1#2:857\n493#3:858\n442#3:859\n1266#4,4:860\n*S KotlinDebug\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorker\n*L\n802#1:858\n802#1:859\n802#1:860,4\n*E\n"})
/* loaded from: classes3.dex */
public class TaskWorker extends CoroutineWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public SharedPreferences A;
    public M0 a;
    public long b;
    public long c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public double h;
    public long i;
    public double j;
    public boolean k;
    public String l;
    public C0654k0 m;
    public int n;
    public double o;
    public long p;
    public P0 q;
    public String r;
    public LinkedHashMap s;
    public Integer t;
    public String u;
    public String v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    @SourceDebugExtension({"SMAP\nTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorker$Companion\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,856:1\n113#2:857\n113#2:864\n113#2:873\n508#3:858\n454#3:859\n567#3:865\n552#3,6:866\n1266#4,4:860\n96#5:872\n*S KotlinDebug\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorker$Companion\n*L\n62#1:857\n228#1:864\n336#1:873\n171#1:858\n171#1:859\n248#1:865\n248#1:866,6\n171#1:860,4\n332#1:872\n*E\n"})
    /* renamed from: com.bbflight.background_downloader.TaskWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final void a(Companion companion, String str, String str2, String str3, SharedPreferences sharedPreferences) {
            companion.getClass();
            BDPlugin.INSTANCE.getClass();
            ReentrantReadWriteLock reentrantReadWriteLock = BDPlugin.v;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                String string = sharedPreferences.getString(str, "{}");
                Intrinsics.checkNotNull(string, "null cannot be cast to non-null type kotlin.String");
                b.a aVar = kotlinx.serialization.json.b.d;
                aVar.getClass();
                kotlinx.serialization.internal.S0 s0 = kotlinx.serialization.internal.S0.a;
                Map map = (Map) aVar.a(new C1126a0(s0, s0), string);
                map.put(str2, str3);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(str, aVar.b(new C1126a0(s0, s0), map));
                edit.apply();
                Unit unit = Unit.INSTANCE;
            } finally {
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
            }
        }

        public static Object b(String str, M0 m0, Object obj, Function1 function1, ContinuationImpl continuationImpl) {
            Object i = A0.c.i(new A(m0, str, obj, function1), continuationImpl);
            if (i != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                i = Unit.INSTANCE;
            }
            return i == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? i : Unit.INSTANCE;
        }

        public static /* synthetic */ Object c(Companion companion, String str, M0 m0, Object obj, ContinuationImpl continuationImpl) {
            companion.getClass();
            return b(str, m0, obj, null, continuationImpl);
        }

        public static Object d(M0 m0, double d, SharedPreferences sharedPreferences, long j, double d2, long j2, ContinuationImpl continuationImpl) {
            s1 s1Var = m0.o;
            if (s1Var != s1.c && s1Var != s1.d) {
                return Unit.INSTANCE;
            }
            Object b = b("progressUpdate", m0, CollectionsKt.mutableListOf(Boxing.boxDouble(d), Boxing.boxLong(j), Boxing.boxDouble(d2), Boxing.boxLong(j2)), new d1(m0, d, j, sharedPreferences, null), continuationImpl);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Unit.INSTANCE;
        }

        public static Object e(E0 e0, SharedPreferences sharedPreferences, ContinuationImpl continuationImpl) {
            BDPlugin.INSTANCE.getClass();
            LinkedHashMap linkedHashMap = BDPlugin.n;
            M0 m0 = e0.a;
            linkedHashMap.put(m0.a, e0);
            Object b = b("resumeData", m0, CollectionsKt.mutableListOf(e0.b, Boxing.boxLong(e0.c), e0.d), new e1(e0, sharedPreferences, null), continuationImpl);
            return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Unit.INSTANCE;
        }

        public static /* synthetic */ Object g(Companion companion, M0 m0, W0 w0, SharedPreferences sharedPreferences, P0 p0, Context context, ContinuationImpl continuationImpl, int i) {
            return companion.f(m0, w0, sharedPreferences, (i & 8) != 0 ? null : p0, null, null, null, null, null, context, continuationImpl);
        }

        /* JADX WARN: Code restructure failed: missing block: B:193:0x0444, code lost:
        
            if (d(r27, -5.0d, r13, -1, -1.0d, -1000, r9) == r10) goto L246;
         */
        /* JADX WARN: Code restructure failed: missing block: B:194:0x0448, code lost:
        
            r2 = r1;
            r11 = r14;
            r12 = 1;
            r1 = r0;
            r0 = r4;
            r14 = r7;
            r7 = r15;
            r4 = r3;
            r15 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:218:0x056f, code lost:
        
            if (d(r8, -1.0d, r13, -1, -1.0d, -1000, r9) == r10) goto L246;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0a36, code lost:
        
            if (r9.e(r4, r3, r11) != r10) goto L247;
         */
        /* JADX WARN: Code restructure failed: missing block: B:220:0x05b6, code lost:
        
            if (d(r8, -3.0d, r13, -1, -1.0d, -1000, r9) == r10) goto L246;
         */
        /* JADX WARN: Code restructure failed: missing block: B:234:0x03d7, code lost:
        
            if (r0 == r10) goto L246;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:115:0x070c  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x0822  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x06e4  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x03ee  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x03fc  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x05ba  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:228:0x0234  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x0386  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x0266  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x090e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x091f A[LOOP:0: B:34:0x091d->B:35:0x091f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0968 A[LOOP:1: B:44:0x0966->B:45:0x0968, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x09cb  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x09d0  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0917  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x083b  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0613  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object f(M0 m0, W0 w0, SharedPreferences sharedPreferences, P0 p0, String str, LinkedHashMap linkedHashMap, Integer num, String str2, String str3, Context context, ContinuationImpl continuationImpl) {
            f1 f1Var;
            f1 f1Var2;
            SharedPreferences sharedPreferences2;
            P0 p02;
            String str4;
            Map map;
            Integer num2;
            String str5;
            String str6;
            Context context2;
            Map map2;
            Integer num3;
            String str7;
            String str8;
            Context context3;
            SharedPreferences sharedPreferences3;
            P0 p03;
            String str9;
            M0 m02;
            int ordinal;
            f1 f1Var3;
            int i;
            String str10;
            Context context4;
            int i2;
            String str11;
            W0 w02;
            String str12;
            M0 m03;
            M0 m04;
            Context context5;
            Integer num4;
            Map map3;
            M0 m05;
            P0 p04;
            int i3;
            String str13;
            int i4;
            Context context6;
            int i5;
            String str14;
            W0 w03;
            M0 m06;
            Map map4;
            String str15;
            int i6;
            W0 w04;
            String str16;
            M0 m07;
            String str17;
            c1 c1Var;
            String str18;
            Integer num5;
            String str19;
            c1 c1Var2;
            SharedPreferences sharedPreferences4;
            W0 w05;
            int i7;
            String str20;
            M0 m08;
            String str21;
            P0 p05;
            Map map5;
            Map map6;
            Integer num6;
            List mutableListOf;
            Integer num7;
            String str22;
            c1 c1Var3;
            Context context7;
            String str23;
            int i8;
            String str24;
            Map map7;
            W w;
            String str25;
            M0 m09;
            P0 p06;
            Integer num8;
            String str26;
            LinkedHashMap linkedHashMap2;
            Integer num9;
            String str27;
            W0 w06;
            P0 p07;
            Integer num10;
            String str28;
            int i9;
            int i10;
            SharedPreferences sharedPreferences5;
            String str29;
            Operation cancelAllWorkByTag;
            Integer num11;
            String str30;
            String str31;
            kotlinx.coroutines.scheduling.b bVar;
            h1 h1Var;
            Integer num12;
            ReentrantReadWriteLock reentrantReadWriteLock;
            ReentrantReadWriteLock.ReadLock readLock;
            String str32;
            int i11;
            int i12;
            ReentrantReadWriteLock.WriteLock writeLock;
            ReentrantReadWriteLock.WriteLock writeLock2;
            int i13;
            Object i14;
            String str33;
            String str34;
            Integer num13;
            SharedPreferences sharedPreferences6;
            Map map8;
            P0 p08;
            String str35;
            T0 t0;
            M0 m010 = m0;
            W0 w07 = w0;
            if (continuationImpl instanceof f1) {
                f1Var = (f1) continuationImpl;
                int i15 = f1Var.u;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    f1Var.u = i15 - Integer.MIN_VALUE;
                    f1Var2 = f1Var;
                    Object obj = f1Var2.s;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (f1Var2.u) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            BDPlugin.INSTANCE.getClass();
                            LinkedHashSet linkedHashSet = BDPlugin.r;
                            if (linkedHashSet.remove(m010)) {
                                if (w07 == W0.k || w07 == W0.i || w07 == W0.f) {
                                    kotlinx.coroutines.channels.b bVar2 = A1.a;
                                    U u = new U(context, m010, (String) BDPlugin.t.get(m010.a), (E0) BDPlugin.n.get(m010.a), null, 48);
                                    f1Var2.a = SpillingKt.nullOutSpilledVariable(m0);
                                    f1Var2.b = SpillingKt.nullOutSpilledVariable(w07);
                                    f1Var2.c = SpillingKt.nullOutSpilledVariable(sharedPreferences);
                                    f1Var2.d = SpillingKt.nullOutSpilledVariable(p0);
                                    f1Var2.e = SpillingKt.nullOutSpilledVariable(str);
                                    f1Var2.f = SpillingKt.nullOutSpilledVariable(linkedHashMap);
                                    f1Var2.i = SpillingKt.nullOutSpilledVariable(num);
                                    f1Var2.j = SpillingKt.nullOutSpilledVariable(str2);
                                    f1Var2.k = SpillingKt.nullOutSpilledVariable(str3);
                                    f1Var2.l = SpillingKt.nullOutSpilledVariable(context);
                                    f1Var2.u = 1;
                                    Object i16 = A1.b.i(u, f1Var2);
                                    if (i16 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        i16 = Unit.INSTANCE;
                                    }
                                    if (i16 != coroutine_suspended) {
                                        map2 = linkedHashMap;
                                        num3 = num;
                                        str7 = str2;
                                        str8 = str3;
                                        context3 = context;
                                        sharedPreferences3 = sharedPreferences;
                                        p03 = p0;
                                        str9 = str;
                                        m02 = m0;
                                        BDPlugin.INSTANCE.getClass();
                                        if (BDPlugin.r.isEmpty()) {
                                            kotlinx.coroutines.channels.b bVar3 = A1.a;
                                            f1Var2.a = SpillingKt.nullOutSpilledVariable(m02);
                                            f1Var2.b = SpillingKt.nullOutSpilledVariable(w07);
                                            f1Var2.c = SpillingKt.nullOutSpilledVariable(sharedPreferences3);
                                            f1Var2.d = SpillingKt.nullOutSpilledVariable(p03);
                                            f1Var2.e = SpillingKt.nullOutSpilledVariable(str9);
                                            f1Var2.f = SpillingKt.nullOutSpilledVariable(map2);
                                            f1Var2.i = SpillingKt.nullOutSpilledVariable(num3);
                                            f1Var2.j = SpillingKt.nullOutSpilledVariable(str7);
                                            f1Var2.k = SpillingKt.nullOutSpilledVariable(str8);
                                            f1Var2.l = SpillingKt.nullOutSpilledVariable(context3);
                                            f1Var2.u = 2;
                                            Object i17 = A1.b.i(null, f1Var2);
                                            if (i17 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                                i17 = Unit.INSTANCE;
                                                break;
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } else if (linkedHashSet.isEmpty()) {
                                    kotlinx.coroutines.channels.b bVar4 = A1.a;
                                    f1Var2.a = m010;
                                    f1Var2.b = w07;
                                    sharedPreferences2 = sharedPreferences;
                                    f1Var2.c = sharedPreferences2;
                                    p02 = p0;
                                    f1Var2.d = p02;
                                    str4 = str;
                                    f1Var2.e = str4;
                                    f1Var2.f = linkedHashMap;
                                    f1Var2.i = num;
                                    str5 = str2;
                                    f1Var2.j = str5;
                                    f1Var2.k = str3;
                                    f1Var2.l = context;
                                    f1Var2.u = 3;
                                    Object i18 = A1.b.i(null, f1Var2);
                                    if (i18 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        i18 = Unit.INSTANCE;
                                    }
                                    if (i18 != coroutine_suspended) {
                                        map = linkedHashMap;
                                        context2 = context;
                                        num2 = num;
                                        str6 = str3;
                                        int i19 = (w07 == W0.f || m010.r <= 0) ? 0 : 1;
                                        ordinal = w07.ordinal();
                                        if (ordinal != 2) {
                                            if (ordinal == 3) {
                                                m04 = m010;
                                                f1Var2.a = m04;
                                                f1Var2.b = w07;
                                                f1Var2.c = sharedPreferences2;
                                                f1Var2.d = p02;
                                                f1Var2.e = str4;
                                                f1Var2.f = map;
                                                f1Var2.i = num2;
                                                f1Var2.j = str5;
                                                f1Var2.k = str6;
                                                f1Var2.l = context2;
                                                f1Var2.p = i19;
                                                f1Var2.q = 1;
                                                f1Var2.u = 7;
                                                break;
                                            } else {
                                                if (ordinal == 4) {
                                                    m04 = m010;
                                                    if (i19 == 0) {
                                                        f1Var2.a = m04;
                                                        f1Var2.b = w07;
                                                        f1Var2.c = sharedPreferences2;
                                                        f1Var2.d = p02;
                                                        f1Var2.e = str4;
                                                        f1Var2.f = map;
                                                        f1Var2.i = num2;
                                                        f1Var2.j = str5;
                                                        f1Var2.k = str6;
                                                        f1Var2.l = context2;
                                                        f1Var2.p = i19;
                                                        f1Var2.q = 1;
                                                        f1Var2.u = 5;
                                                        break;
                                                    }
                                                    int i20 = i19;
                                                    context5 = context2;
                                                    i2 = i20;
                                                    Map map9 = map;
                                                    num4 = num2;
                                                    map3 = map9;
                                                    m05 = m04;
                                                    f1Var3 = f1Var2;
                                                    p04 = p02;
                                                    i3 = 1;
                                                    if (w07.a()) {
                                                    }
                                                    if (i3 != 0) {
                                                    }
                                                    String str36 = str5;
                                                    Map map10 = map3;
                                                    num5 = num4;
                                                    str19 = str18;
                                                    c1Var2 = c1Var;
                                                    sharedPreferences4 = sharedPreferences2;
                                                    w05 = w04;
                                                    i7 = i2;
                                                    str20 = str16;
                                                    m08 = m07;
                                                    str21 = str36;
                                                    p05 = p04;
                                                    map5 = map10;
                                                    if (w05.a()) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                if (ordinal == 5) {
                                                    M0 m011 = m010;
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    BDPlugin.INSTANCE.getClass();
                                                    Map<String, Long> map11 = BDPlugin.o;
                                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                                    for (Map.Entry<String, Long> entry : map11.entrySet()) {
                                                        if (currentTimeMillis - entry.getValue().longValue() < 1000) {
                                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                                            currentTimeMillis = currentTimeMillis;
                                                        }
                                                    }
                                                    Map<String, Long> asMutableMap = TypeIntrinsics.asMutableMap(linkedHashMap3);
                                                    Intrinsics.checkNotNullParameter(asMutableMap, "<set-?>");
                                                    BDPlugin.o = asMutableMap;
                                                    BDPlugin.INSTANCE.getClass();
                                                    boolean z = BDPlugin.o.get(m011.a) == null ? 1 : 0;
                                                    if (z == 0) {
                                                        int i21 = i19;
                                                        context5 = context2;
                                                        i2 = i21;
                                                        Map map12 = map;
                                                        num4 = num2;
                                                        map3 = map12;
                                                        m05 = m011;
                                                        f1Var3 = f1Var2;
                                                        i6 = z;
                                                        i3 = i6;
                                                        p04 = p02;
                                                        if (w07.a()) {
                                                        }
                                                        if (i3 != 0) {
                                                        }
                                                        String str362 = str5;
                                                        Map map102 = map3;
                                                        num5 = num4;
                                                        str19 = str18;
                                                        c1Var2 = c1Var;
                                                        sharedPreferences4 = sharedPreferences2;
                                                        w05 = w04;
                                                        i7 = i2;
                                                        str20 = str16;
                                                        m08 = m07;
                                                        str21 = str362;
                                                        p05 = p04;
                                                        map5 = map102;
                                                        if (w05.a()) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                    BDPlugin.o.put(m011.a, Boxing.boxLong(System.currentTimeMillis()));
                                                    f1Var2.a = m011;
                                                    f1Var2.b = w07;
                                                    f1Var2.c = sharedPreferences2;
                                                    f1Var2.d = p02;
                                                    f1Var2.e = str4;
                                                    f1Var2.f = map;
                                                    f1Var2.i = num2;
                                                    f1Var2.j = str5;
                                                    f1Var2.k = str6;
                                                    f1Var2.l = context2;
                                                    f1Var2.p = i19;
                                                    f1Var2.r = z;
                                                    f1Var2.u = 6;
                                                    coroutine_suspended = coroutine_suspended;
                                                    if (d(m011, -2.0d, sharedPreferences2, -1L, -1.0d, -1000L, f1Var2) != coroutine_suspended) {
                                                        int i22 = i19;
                                                        str13 = str6;
                                                        i4 = i22;
                                                        context6 = context2;
                                                        i5 = z;
                                                        p04 = p02;
                                                        str14 = str4;
                                                        w03 = w07;
                                                        m06 = m011;
                                                        map4 = map;
                                                        num4 = num2;
                                                        str15 = str5;
                                                        i3 = i5;
                                                        i2 = i4;
                                                        str6 = str13;
                                                        str5 = str15;
                                                        map3 = map4;
                                                        w07 = w03;
                                                        context5 = context6;
                                                        m05 = m06;
                                                        str4 = str14;
                                                        f1Var3 = f1Var2;
                                                        if (w07.a()) {
                                                        }
                                                        if (i3 != 0) {
                                                        }
                                                        String str3622 = str5;
                                                        Map map1022 = map3;
                                                        num5 = num4;
                                                        str19 = str18;
                                                        c1Var2 = c1Var;
                                                        sharedPreferences4 = sharedPreferences2;
                                                        w05 = w04;
                                                        i7 = i2;
                                                        str20 = str16;
                                                        m08 = m07;
                                                        str21 = str3622;
                                                        p05 = p04;
                                                        map5 = map1022;
                                                        if (w05.a()) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                } else {
                                                    if (ordinal != 7) {
                                                        m04 = m010;
                                                        int i202 = i19;
                                                        context5 = context2;
                                                        i2 = i202;
                                                        Map map92 = map;
                                                        num4 = num2;
                                                        map3 = map92;
                                                        m05 = m04;
                                                        f1Var3 = f1Var2;
                                                        p04 = p02;
                                                        i3 = 1;
                                                        if (w07.a()) {
                                                            if (w07 != W0.f) {
                                                                str25 = str6;
                                                                m09 = m05;
                                                                p06 = null;
                                                            } else if (p04 == null) {
                                                                str25 = str6;
                                                                m09 = m05;
                                                                p06 = new P0(W.b, (String) null, 6);
                                                            } else {
                                                                str25 = str6;
                                                                m09 = m05;
                                                                p06 = p04;
                                                            }
                                                            Integer num14 = (w07 == W0.d || w07 == W0.e) ? num4 : null;
                                                            if (map3 != null) {
                                                                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                                                for (Map.Entry entry2 : map3.entrySet()) {
                                                                    Object key = entry2.getKey();
                                                                    Object value = entry2.getValue();
                                                                    if (key == null || value == null) {
                                                                        num9 = num14;
                                                                        str27 = str5;
                                                                    } else {
                                                                        num9 = num14;
                                                                        str27 = str5;
                                                                        linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                                                                    }
                                                                    num14 = num9;
                                                                    str5 = str27;
                                                                }
                                                                num8 = num14;
                                                                str26 = str5;
                                                                linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap4.size()));
                                                                Iterator it = linkedHashMap4.entrySet().iterator();
                                                                while (it.hasNext()) {
                                                                    Map.Entry entry3 = (Map.Entry) it.next();
                                                                    Iterator it2 = it;
                                                                    String lowerCase = ((String) entry3.getKey()).toLowerCase(Locale.ROOT);
                                                                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                                                    linkedHashMap2.put(lowerCase, entry3.getValue());
                                                                    it = it2;
                                                                }
                                                            } else {
                                                                num8 = num14;
                                                                str26 = str5;
                                                                linkedHashMap2 = null;
                                                            }
                                                            W0 w08 = w07;
                                                            String str37 = str4;
                                                            str16 = str37;
                                                            str5 = str26;
                                                            str17 = str25;
                                                            c1Var = new c1(m09, w08, p06, str37, num8, linkedHashMap2, str26, str25);
                                                            m07 = m09;
                                                            w04 = w08;
                                                        } else {
                                                            w04 = w07;
                                                            str16 = str4;
                                                            m07 = m05;
                                                            str17 = str6;
                                                            c1Var = new c1(m07, w04, null, null, null, null, null, null);
                                                        }
                                                        if (i3 != 0) {
                                                            s1 s1Var = m07.o;
                                                            str18 = str17;
                                                            if (s1Var == s1.b || s1Var == s1.d || i2 != 0) {
                                                                W0 w09 = W0.f;
                                                                String str38 = c1Var.d;
                                                                String str39 = str5;
                                                                W0 w010 = c1Var.b;
                                                                if (w010 == w09) {
                                                                    Integer valueOf = Integer.valueOf(w010.ordinal());
                                                                    P0 p09 = c1Var.c;
                                                                    map6 = map3;
                                                                    num6 = num4;
                                                                    mutableListOf = CollectionsKt.mutableListOf(valueOf, (p09 == null || (w = p09.a) == null) ? null : w.a, p09 != null ? p09.c : null, p09 != null ? Integer.valueOf(p09.b) : null, str38);
                                                                } else {
                                                                    map6 = map3;
                                                                    num6 = num4;
                                                                    mutableListOf = CollectionsKt.mutableListOf(Integer.valueOf(w010.ordinal()), w010.a() ? str38 : null, w010.a() ? c1Var.f : null, (w010 == W0.d || w010 == W0.e) ? c1Var.e : null, w010.a() ? c1Var.g : null, w010.a() ? c1Var.h : null);
                                                                }
                                                                g1 g1Var = new g1(m07, c1Var, sharedPreferences2, null);
                                                                f1Var3.a = m07;
                                                                f1Var3.b = w04;
                                                                f1Var3.c = sharedPreferences2;
                                                                f1Var3.d = SpillingKt.nullOutSpilledVariable(p04);
                                                                f1Var3.e = SpillingKt.nullOutSpilledVariable(str16);
                                                                f1Var3.f = SpillingKt.nullOutSpilledVariable(map6);
                                                                f1Var3.i = SpillingKt.nullOutSpilledVariable(num6);
                                                                f1Var3.j = SpillingKt.nullOutSpilledVariable(str39);
                                                                f1Var3.k = SpillingKt.nullOutSpilledVariable(str18);
                                                                f1Var3.l = context5;
                                                                f1Var3.m = c1Var;
                                                                f1Var3.n = SpillingKt.nullOutSpilledVariable(mutableListOf);
                                                                f1Var3.p = i2;
                                                                f1Var3.q = i3;
                                                                f1Var3.u = 9;
                                                                if (b("statusUpdate", m07, mutableListOf, g1Var, f1Var3) != coroutine_suspended) {
                                                                    num7 = num6;
                                                                    str22 = str39;
                                                                    c1Var3 = c1Var;
                                                                    context7 = context5;
                                                                    str23 = str18;
                                                                    i7 = i2;
                                                                    i8 = i3;
                                                                    str24 = str16;
                                                                    map7 = map6;
                                                                    String str40 = str24;
                                                                    i3 = i8;
                                                                    m08 = m07;
                                                                    p05 = p04;
                                                                    map5 = map7;
                                                                    str21 = str22;
                                                                    sharedPreferences4 = sharedPreferences2;
                                                                    w05 = w04;
                                                                    str20 = str40;
                                                                    Context context8 = context7;
                                                                    c1Var2 = c1Var3;
                                                                    num5 = num7;
                                                                    str19 = str23;
                                                                    context5 = context8;
                                                                    if (w05.a()) {
                                                                        if (w05 == W0.f) {
                                                                            WorkManager workManager = WorkManager.getInstance(context5);
                                                                            Integer num15 = num5;
                                                                            Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
                                                                            String str41 = str19;
                                                                            String str42 = str21;
                                                                            cancelAllWorkByTag = workManager.cancelAllWorkByTag("taskId=" + m08.a);
                                                                            Intrinsics.checkNotNullExpressionValue(cancelAllWorkByTag, "cancelAllWorkByTag(...)");
                                                                            try {
                                                                                kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                                                                                bVar = kotlinx.coroutines.scheduling.b.a;
                                                                                h1Var = new h1(cancelAllWorkByTag, null);
                                                                                f1Var3.a = m08;
                                                                                f1Var3.b = SpillingKt.nullOutSpilledVariable(w05);
                                                                                f1Var3.c = sharedPreferences4;
                                                                                f1Var3.d = SpillingKt.nullOutSpilledVariable(p05);
                                                                                f1Var3.e = SpillingKt.nullOutSpilledVariable(str20);
                                                                                f1Var3.f = SpillingKt.nullOutSpilledVariable(map5);
                                                                                f1Var3.i = SpillingKt.nullOutSpilledVariable(num15);
                                                                                f1Var3.j = SpillingKt.nullOutSpilledVariable(str42);
                                                                                f1Var3.k = SpillingKt.nullOutSpilledVariable(str41);
                                                                                f1Var3.l = context5;
                                                                                f1Var3.m = c1Var2;
                                                                                f1Var3.n = SpillingKt.nullOutSpilledVariable(workManager);
                                                                                f1Var3.o = cancelAllWorkByTag;
                                                                                f1Var3.p = i7;
                                                                                f1Var3.q = i3;
                                                                                f1Var3.u = 10;
                                                                            } catch (Throwable unused) {
                                                                                num11 = num15;
                                                                                str30 = str41;
                                                                                str31 = str42;
                                                                                int i23 = i7;
                                                                                String str43 = m08.a;
                                                                                Objects.toString(cancelAllWorkByTag);
                                                                                P0 p010 = p05;
                                                                                w06 = w05;
                                                                                p07 = p010;
                                                                                i9 = i23;
                                                                                i10 = i3;
                                                                                sharedPreferences5 = sharedPreferences4;
                                                                                str29 = str30;
                                                                                str28 = str31;
                                                                                num10 = num11;
                                                                                BDPlugin.INSTANCE.getClass();
                                                                                reentrantReadWriteLock = BDPlugin.v;
                                                                                readLock = reentrantReadWriteLock.readLock();
                                                                                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                                                                                }
                                                                                String str44 = str28;
                                                                                while (i12 < i11) {
                                                                                }
                                                                                writeLock = reentrantReadWriteLock.writeLock();
                                                                                writeLock.lock();
                                                                                try {
                                                                                    Map<String, M0> b = q1.b(sharedPreferences5);
                                                                                    writeLock2 = writeLock;
                                                                                    try {
                                                                                        b.remove(m08.a);
                                                                                        SharedPreferences.Editor edit = sharedPreferences5.edit();
                                                                                        Integer num16 = num10;
                                                                                        SharedPreferences sharedPreferences7 = sharedPreferences5;
                                                                                        b.a aVar = kotlinx.serialization.json.b.d;
                                                                                        aVar.getClass();
                                                                                        Map map13 = map5;
                                                                                        P0 p011 = p07;
                                                                                        String str45 = str20;
                                                                                        edit.putString("com.bbflight.background_downloader.taskMap.v2", aVar.b(new C1126a0(kotlinx.serialization.internal.S0.a, M0.Companion.serializer()), b));
                                                                                        edit.apply();
                                                                                        Unit unit = Unit.INSTANCE;
                                                                                        while (i13 < i11) {
                                                                                        }
                                                                                        writeLock2.unlock();
                                                                                        kotlinx.coroutines.channels.b bVar5 = A0.a;
                                                                                        String str46 = m08.a;
                                                                                        f1Var3.a = m08;
                                                                                        f1Var3.b = SpillingKt.nullOutSpilledVariable(w06);
                                                                                        f1Var3.c = SpillingKt.nullOutSpilledVariable(sharedPreferences7);
                                                                                        f1Var3.d = SpillingKt.nullOutSpilledVariable(p011);
                                                                                        f1Var3.e = SpillingKt.nullOutSpilledVariable(str45);
                                                                                        f1Var3.f = SpillingKt.nullOutSpilledVariable(map13);
                                                                                        f1Var3.i = SpillingKt.nullOutSpilledVariable(num16);
                                                                                        f1Var3.j = SpillingKt.nullOutSpilledVariable(str44);
                                                                                        f1Var3.k = SpillingKt.nullOutSpilledVariable(str32);
                                                                                        f1Var3.l = context5;
                                                                                        f1Var3.m = c1Var2;
                                                                                        f1Var3.n = null;
                                                                                        f1Var3.o = null;
                                                                                        f1Var3.p = i9;
                                                                                        f1Var3.q = i10;
                                                                                        f1Var3.u = 11;
                                                                                        A0.b = System.currentTimeMillis();
                                                                                        i14 = A0.a.i(str46, f1Var3);
                                                                                        if (i14 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                                                                        }
                                                                                        if (i14 != coroutine_suspended) {
                                                                                        }
                                                                                        return coroutine_suspended;
                                                                                    } catch (Throwable th) {
                                                                                        th = th;
                                                                                        for (int i24 = 0; i24 < i11; i24++) {
                                                                                            readLock.lock();
                                                                                        }
                                                                                        writeLock2.unlock();
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                    writeLock2 = writeLock;
                                                                                }
                                                                            }
                                                                            if (C1082i.f(h1Var, bVar, f1Var3) != coroutine_suspended) {
                                                                                num12 = num15;
                                                                                str30 = str41;
                                                                                str31 = str42;
                                                                                Integer num17 = num12;
                                                                                i9 = i7;
                                                                                i10 = i3;
                                                                                sharedPreferences5 = sharedPreferences4;
                                                                                str29 = str30;
                                                                                str28 = str31;
                                                                                num10 = num17;
                                                                                P0 p012 = p05;
                                                                                w06 = w05;
                                                                                p07 = p012;
                                                                                BDPlugin.INSTANCE.getClass();
                                                                                reentrantReadWriteLock = BDPlugin.v;
                                                                                readLock = reentrantReadWriteLock.readLock();
                                                                                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                                                                                    str32 = str29;
                                                                                    i11 = reentrantReadWriteLock.getReadHoldCount();
                                                                                } else {
                                                                                    str32 = str29;
                                                                                    i11 = 0;
                                                                                }
                                                                                String str442 = str28;
                                                                                for (i12 = 0; i12 < i11; i12++) {
                                                                                    readLock.unlock();
                                                                                }
                                                                                writeLock = reentrantReadWriteLock.writeLock();
                                                                                writeLock.lock();
                                                                                Map<String, M0> b2 = q1.b(sharedPreferences5);
                                                                                writeLock2 = writeLock;
                                                                                b2.remove(m08.a);
                                                                                SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                                                                Integer num162 = num10;
                                                                                SharedPreferences sharedPreferences72 = sharedPreferences5;
                                                                                b.a aVar2 = kotlinx.serialization.json.b.d;
                                                                                aVar2.getClass();
                                                                                Map map132 = map5;
                                                                                P0 p0112 = p07;
                                                                                String str452 = str20;
                                                                                edit2.putString("com.bbflight.background_downloader.taskMap.v2", aVar2.b(new C1126a0(kotlinx.serialization.internal.S0.a, M0.Companion.serializer()), b2));
                                                                                edit2.apply();
                                                                                Unit unit2 = Unit.INSTANCE;
                                                                                for (i13 = 0; i13 < i11; i13++) {
                                                                                    readLock.lock();
                                                                                }
                                                                                writeLock2.unlock();
                                                                                kotlinx.coroutines.channels.b bVar52 = A0.a;
                                                                                String str462 = m08.a;
                                                                                f1Var3.a = m08;
                                                                                f1Var3.b = SpillingKt.nullOutSpilledVariable(w06);
                                                                                f1Var3.c = SpillingKt.nullOutSpilledVariable(sharedPreferences72);
                                                                                f1Var3.d = SpillingKt.nullOutSpilledVariable(p0112);
                                                                                f1Var3.e = SpillingKt.nullOutSpilledVariable(str452);
                                                                                f1Var3.f = SpillingKt.nullOutSpilledVariable(map132);
                                                                                f1Var3.i = SpillingKt.nullOutSpilledVariable(num162);
                                                                                f1Var3.j = SpillingKt.nullOutSpilledVariable(str442);
                                                                                f1Var3.k = SpillingKt.nullOutSpilledVariable(str32);
                                                                                f1Var3.l = context5;
                                                                                f1Var3.m = c1Var2;
                                                                                f1Var3.n = null;
                                                                                f1Var3.o = null;
                                                                                f1Var3.p = i9;
                                                                                f1Var3.q = i10;
                                                                                f1Var3.u = 11;
                                                                                A0.b = System.currentTimeMillis();
                                                                                i14 = A0.a.i(str462, f1Var3);
                                                                                if (i14 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                                                                    i14 = Unit.INSTANCE;
                                                                                }
                                                                                if (i14 != coroutine_suspended) {
                                                                                    str33 = str32;
                                                                                    str34 = str442;
                                                                                    num13 = num162;
                                                                                    sharedPreferences6 = sharedPreferences72;
                                                                                    map8 = map132;
                                                                                    p08 = p0112;
                                                                                    str35 = str452;
                                                                                    t0 = m08.x;
                                                                                    if (t0 != null && t0.b != null) {
                                                                                        M.a aVar3 = M.Companion;
                                                                                        f1Var3.a = SpillingKt.nullOutSpilledVariable(m08);
                                                                                        f1Var3.b = SpillingKt.nullOutSpilledVariable(w06);
                                                                                        f1Var3.c = SpillingKt.nullOutSpilledVariable(sharedPreferences6);
                                                                                        f1Var3.d = SpillingKt.nullOutSpilledVariable(p08);
                                                                                        f1Var3.e = SpillingKt.nullOutSpilledVariable(str35);
                                                                                        f1Var3.f = SpillingKt.nullOutSpilledVariable(map8);
                                                                                        f1Var3.i = SpillingKt.nullOutSpilledVariable(num13);
                                                                                        f1Var3.j = SpillingKt.nullOutSpilledVariable(str34);
                                                                                        f1Var3.k = SpillingKt.nullOutSpilledVariable(str33);
                                                                                        f1Var3.l = SpillingKt.nullOutSpilledVariable(context5);
                                                                                        f1Var3.m = SpillingKt.nullOutSpilledVariable(c1Var2);
                                                                                        f1Var3.p = i9;
                                                                                        f1Var3.q = i10;
                                                                                        f1Var3.u = 12;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            Integer num18 = num5;
                                                                            String str47 = str19;
                                                                            String str48 = str21;
                                                                            P0 p013 = p05;
                                                                            w06 = w05;
                                                                            p07 = p013;
                                                                            num10 = num18;
                                                                            str28 = str48;
                                                                            i9 = i7;
                                                                            i10 = i3;
                                                                            sharedPreferences5 = sharedPreferences4;
                                                                            str29 = str47;
                                                                            BDPlugin.INSTANCE.getClass();
                                                                            reentrantReadWriteLock = BDPlugin.v;
                                                                            readLock = reentrantReadWriteLock.readLock();
                                                                            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                                                                            }
                                                                            String str4422 = str28;
                                                                            while (i12 < i11) {
                                                                            }
                                                                            writeLock = reentrantReadWriteLock.writeLock();
                                                                            writeLock.lock();
                                                                            Map<String, M0> b22 = q1.b(sharedPreferences5);
                                                                            writeLock2 = writeLock;
                                                                            b22.remove(m08.a);
                                                                            SharedPreferences.Editor edit22 = sharedPreferences5.edit();
                                                                            Integer num1622 = num10;
                                                                            SharedPreferences sharedPreferences722 = sharedPreferences5;
                                                                            b.a aVar22 = kotlinx.serialization.json.b.d;
                                                                            aVar22.getClass();
                                                                            Map map1322 = map5;
                                                                            P0 p01122 = p07;
                                                                            String str4522 = str20;
                                                                            edit22.putString("com.bbflight.background_downloader.taskMap.v2", aVar22.b(new C1126a0(kotlinx.serialization.internal.S0.a, M0.Companion.serializer()), b22));
                                                                            edit22.apply();
                                                                            Unit unit22 = Unit.INSTANCE;
                                                                            while (i13 < i11) {
                                                                            }
                                                                            writeLock2.unlock();
                                                                            kotlinx.coroutines.channels.b bVar522 = A0.a;
                                                                            String str4622 = m08.a;
                                                                            f1Var3.a = m08;
                                                                            f1Var3.b = SpillingKt.nullOutSpilledVariable(w06);
                                                                            f1Var3.c = SpillingKt.nullOutSpilledVariable(sharedPreferences722);
                                                                            f1Var3.d = SpillingKt.nullOutSpilledVariable(p01122);
                                                                            f1Var3.e = SpillingKt.nullOutSpilledVariable(str4522);
                                                                            f1Var3.f = SpillingKt.nullOutSpilledVariable(map1322);
                                                                            f1Var3.i = SpillingKt.nullOutSpilledVariable(num1622);
                                                                            f1Var3.j = SpillingKt.nullOutSpilledVariable(str4422);
                                                                            f1Var3.k = SpillingKt.nullOutSpilledVariable(str32);
                                                                            f1Var3.l = context5;
                                                                            f1Var3.m = c1Var2;
                                                                            f1Var3.n = null;
                                                                            f1Var3.o = null;
                                                                            f1Var3.p = i9;
                                                                            f1Var3.q = i10;
                                                                            f1Var3.u = 11;
                                                                            A0.b = System.currentTimeMillis();
                                                                            i14 = A0.a.i(str4622, f1Var3);
                                                                            if (i14 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                                                            }
                                                                            if (i14 != coroutine_suspended) {
                                                                            }
                                                                        }
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }
                                                        } else {
                                                            str18 = str17;
                                                        }
                                                        String str36222 = str5;
                                                        Map map10222 = map3;
                                                        num5 = num4;
                                                        str19 = str18;
                                                        c1Var2 = c1Var;
                                                        sharedPreferences4 = sharedPreferences2;
                                                        w05 = w04;
                                                        i7 = i2;
                                                        str20 = str16;
                                                        m08 = m07;
                                                        str21 = str36222;
                                                        p05 = p04;
                                                        map5 = map10222;
                                                        if (w05.a()) {
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                    f1Var2.a = m010;
                                                    f1Var2.b = w07;
                                                    f1Var2.c = sharedPreferences2;
                                                    f1Var2.d = p02;
                                                    f1Var2.e = str4;
                                                    f1Var2.f = map;
                                                    f1Var2.i = num2;
                                                    f1Var2.j = str5;
                                                    f1Var2.k = str6;
                                                    f1Var2.l = context2;
                                                    f1Var2.p = i19;
                                                    f1Var2.q = 1;
                                                    f1Var2.u = 8;
                                                    M0 m012 = m010;
                                                    m04 = m012;
                                                    break;
                                                }
                                            }
                                            Map map14 = map;
                                            num4 = num2;
                                            map3 = map14;
                                            str5 = r4;
                                            i3 = r12;
                                            context5 = r1;
                                            str6 = r2;
                                            p04 = r11;
                                            m05 = r15;
                                            str4 = r7;
                                            f1Var3 = f1Var2;
                                            w07 = r14;
                                            if (w07.a()) {
                                            }
                                            if (i3 != 0) {
                                            }
                                            String str362222 = str5;
                                            Map map102222 = map3;
                                            num5 = num4;
                                            str19 = str18;
                                            c1Var2 = c1Var;
                                            sharedPreferences4 = sharedPreferences2;
                                            w05 = w04;
                                            i7 = i2;
                                            str20 = str16;
                                            m08 = m07;
                                            str21 = str362222;
                                            p05 = p04;
                                            map5 = map102222;
                                            if (w05.a()) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        M0 m013 = m010;
                                        f1Var2.a = m013;
                                        f1Var2.b = w07;
                                        f1Var2.c = sharedPreferences2;
                                        f1Var2.d = p02;
                                        f1Var2.e = str4;
                                        f1Var2.f = map;
                                        f1Var2.i = num2;
                                        f1Var2.j = str5;
                                        f1Var2.k = str6;
                                        f1Var2.l = context2;
                                        f1Var2.p = i19;
                                        f1Var2.q = 1;
                                        f1Var2.u = 4;
                                        f1Var3 = f1Var2;
                                        if (d(m013, 1.0d, sharedPreferences2, -1L, -1.0d, -1000L, f1Var2) != coroutine_suspended) {
                                            i = 1;
                                            str10 = str6;
                                            context4 = context2;
                                            i2 = i19;
                                            str11 = str5;
                                            w02 = w07;
                                            str12 = str4;
                                            m03 = m013;
                                            String str49 = str11;
                                            context5 = context4;
                                            str6 = str10;
                                            m05 = m03;
                                            str4 = str12;
                                            w07 = w02;
                                            str5 = str49;
                                            Map map15 = map;
                                            num4 = num2;
                                            map3 = map15;
                                            i6 = i;
                                            i3 = i6;
                                            p04 = p02;
                                            if (w07.a()) {
                                            }
                                            if (i3 != 0) {
                                            }
                                            String str3622222 = str5;
                                            Map map1022222 = map3;
                                            num5 = num4;
                                            str19 = str18;
                                            c1Var2 = c1Var;
                                            sharedPreferences4 = sharedPreferences2;
                                            w05 = w04;
                                            i7 = i2;
                                            str20 = str16;
                                            m08 = m07;
                                            str21 = str3622222;
                                            p05 = p04;
                                            map5 = map1022222;
                                            if (w05.a()) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                                return coroutine_suspended;
                            }
                            sharedPreferences2 = sharedPreferences;
                            p02 = p0;
                            str4 = str;
                            m010 = m0;
                            map = linkedHashMap;
                            num2 = num;
                            str5 = str2;
                            str6 = str3;
                            context2 = context;
                            if (w07 == W0.f) {
                            }
                            ordinal = w07.ordinal();
                            if (ordinal != 2) {
                            }
                            return coroutine_suspended;
                        case 1:
                            Context context9 = (Context) f1Var2.l;
                            str8 = (String) f1Var2.k;
                            str7 = (String) f1Var2.j;
                            num3 = (Integer) f1Var2.i;
                            map2 = (Map) f1Var2.f;
                            str9 = (String) f1Var2.e;
                            p03 = (P0) f1Var2.d;
                            SharedPreferences sharedPreferences8 = (SharedPreferences) f1Var2.c;
                            W0 w011 = (W0) f1Var2.b;
                            m02 = (M0) f1Var2.a;
                            ResultKt.throwOnFailure(obj);
                            context3 = context9;
                            sharedPreferences3 = sharedPreferences8;
                            w07 = w011;
                            BDPlugin.INSTANCE.getClass();
                            if (BDPlugin.r.isEmpty()) {
                            }
                            return Unit.INSTANCE;
                        case 2:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 3:
                            context2 = (Context) f1Var2.l;
                            str6 = (String) f1Var2.k;
                            String str50 = (String) f1Var2.j;
                            num2 = (Integer) f1Var2.i;
                            map = (Map) f1Var2.f;
                            String str51 = (String) f1Var2.e;
                            P0 p014 = (P0) f1Var2.d;
                            SharedPreferences sharedPreferences9 = (SharedPreferences) f1Var2.c;
                            W0 w012 = (W0) f1Var2.b;
                            M0 m014 = (M0) f1Var2.a;
                            ResultKt.throwOnFailure(obj);
                            str5 = str50;
                            m010 = m014;
                            str4 = str51;
                            w07 = w012;
                            p02 = p014;
                            sharedPreferences2 = sharedPreferences9;
                            if (w07 == W0.f) {
                            }
                            ordinal = w07.ordinal();
                            if (ordinal != 2) {
                            }
                            return coroutine_suspended;
                        case 4:
                            int i25 = f1Var2.q;
                            i2 = f1Var2.p;
                            context4 = (Context) f1Var2.l;
                            str10 = (String) f1Var2.k;
                            str11 = (String) f1Var2.j;
                            num2 = (Integer) f1Var2.i;
                            map = (Map) f1Var2.f;
                            str12 = (String) f1Var2.e;
                            P0 p015 = (P0) f1Var2.d;
                            sharedPreferences2 = (SharedPreferences) f1Var2.c;
                            W0 w013 = (W0) f1Var2.b;
                            m03 = (M0) f1Var2.a;
                            ResultKt.throwOnFailure(obj);
                            w02 = w013;
                            p02 = p015;
                            f1Var3 = f1Var2;
                            i = i25;
                            String str492 = str11;
                            context5 = context4;
                            str6 = str10;
                            m05 = m03;
                            str4 = str12;
                            w07 = w02;
                            str5 = str492;
                            Map map152 = map;
                            num4 = num2;
                            map3 = map152;
                            i6 = i;
                            i3 = i6;
                            p04 = p02;
                            if (w07.a()) {
                            }
                            if (i3 != 0) {
                            }
                            String str36222222 = str5;
                            Map map10222222 = map3;
                            num5 = num4;
                            str19 = str18;
                            c1Var2 = c1Var;
                            sharedPreferences4 = sharedPreferences2;
                            w05 = w04;
                            i7 = i2;
                            str20 = str16;
                            m08 = m07;
                            str21 = str36222222;
                            p05 = p04;
                            map5 = map10222222;
                            if (w05.a()) {
                            }
                            return Unit.INSTANCE;
                        case 5:
                        case 7:
                        case 8:
                            int i26 = f1Var2.q;
                            i2 = f1Var2.p;
                            Context context10 = (Context) f1Var2.l;
                            String str52 = (String) f1Var2.k;
                            String str53 = (String) f1Var2.j;
                            num2 = (Integer) f1Var2.i;
                            map = (Map) f1Var2.f;
                            String str54 = (String) f1Var2.e;
                            P0 p016 = (P0) f1Var2.d;
                            sharedPreferences2 = (SharedPreferences) f1Var2.c;
                            W0 w014 = (W0) f1Var2.b;
                            M0 m015 = (M0) f1Var2.a;
                            ResultKt.throwOnFailure(obj);
                            Map map142 = map;
                            num4 = num2;
                            map3 = map142;
                            str5 = str53;
                            i3 = i26;
                            context5 = context10;
                            str6 = str52;
                            p04 = p016;
                            m05 = m015;
                            str4 = str54;
                            f1Var3 = f1Var2;
                            w07 = w014;
                            if (w07.a()) {
                            }
                            if (i3 != 0) {
                            }
                            String str362222222 = str5;
                            Map map102222222 = map3;
                            num5 = num4;
                            str19 = str18;
                            c1Var2 = c1Var;
                            sharedPreferences4 = sharedPreferences2;
                            w05 = w04;
                            i7 = i2;
                            str20 = str16;
                            m08 = m07;
                            str21 = str362222222;
                            p05 = p04;
                            map5 = map102222222;
                            if (w05.a()) {
                            }
                            return Unit.INSTANCE;
                        case 6:
                            boolean z2 = f1Var2.r;
                            i4 = f1Var2.p;
                            context6 = (Context) f1Var2.l;
                            str13 = (String) f1Var2.k;
                            str15 = (String) f1Var2.j;
                            num4 = (Integer) f1Var2.i;
                            map4 = (Map) f1Var2.f;
                            str14 = (String) f1Var2.e;
                            p04 = (P0) f1Var2.d;
                            sharedPreferences2 = (SharedPreferences) f1Var2.c;
                            w03 = (W0) f1Var2.b;
                            m06 = (M0) f1Var2.a;
                            ResultKt.throwOnFailure(obj);
                            i5 = z2;
                            i3 = i5;
                            i2 = i4;
                            str6 = str13;
                            str5 = str15;
                            map3 = map4;
                            w07 = w03;
                            context5 = context6;
                            m05 = m06;
                            str4 = str14;
                            f1Var3 = f1Var2;
                            if (w07.a()) {
                            }
                            if (i3 != 0) {
                            }
                            String str3622222222 = str5;
                            Map map1022222222 = map3;
                            num5 = num4;
                            str19 = str18;
                            c1Var2 = c1Var;
                            sharedPreferences4 = sharedPreferences2;
                            w05 = w04;
                            i7 = i2;
                            str20 = str16;
                            m08 = m07;
                            str21 = str3622222222;
                            p05 = p04;
                            map5 = map1022222222;
                            if (w05.a()) {
                            }
                            return Unit.INSTANCE;
                        case 9:
                            i8 = f1Var2.q;
                            i7 = f1Var2.p;
                            c1Var3 = (c1) f1Var2.m;
                            context7 = (Context) f1Var2.l;
                            str23 = (String) f1Var2.k;
                            str22 = (String) f1Var2.j;
                            num7 = (Integer) f1Var2.i;
                            map7 = (Map) f1Var2.f;
                            String str55 = (String) f1Var2.e;
                            p04 = (P0) f1Var2.d;
                            sharedPreferences2 = (SharedPreferences) f1Var2.c;
                            w04 = (W0) f1Var2.b;
                            m07 = (M0) f1Var2.a;
                            ResultKt.throwOnFailure(obj);
                            str24 = str55;
                            f1Var3 = f1Var2;
                            String str402 = str24;
                            i3 = i8;
                            m08 = m07;
                            p05 = p04;
                            map5 = map7;
                            str21 = str22;
                            sharedPreferences4 = sharedPreferences2;
                            w05 = w04;
                            str20 = str402;
                            Context context82 = context7;
                            c1Var2 = c1Var3;
                            num5 = num7;
                            str19 = str23;
                            context5 = context82;
                            if (w05.a()) {
                            }
                            return Unit.INSTANCE;
                        case 10:
                            int i27 = f1Var2.q;
                            i7 = f1Var2.p;
                            cancelAllWorkByTag = f1Var2.o;
                            c1Var2 = (c1) f1Var2.m;
                            context5 = (Context) f1Var2.l;
                            str30 = (String) f1Var2.k;
                            str31 = (String) f1Var2.j;
                            Integer num19 = (Integer) f1Var2.i;
                            map5 = (Map) f1Var2.f;
                            str20 = (String) f1Var2.e;
                            p05 = (P0) f1Var2.d;
                            sharedPreferences4 = (SharedPreferences) f1Var2.c;
                            w05 = (W0) f1Var2.b;
                            m08 = (M0) f1Var2.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                i3 = i27;
                                num12 = num19;
                                f1Var3 = f1Var2;
                                Integer num172 = num12;
                                i9 = i7;
                                i10 = i3;
                                sharedPreferences5 = sharedPreferences4;
                                str29 = str30;
                                str28 = str31;
                                num10 = num172;
                                P0 p0122 = p05;
                                w06 = w05;
                                p07 = p0122;
                            } catch (Throwable unused2) {
                                f1Var3 = f1Var2;
                                num11 = num19;
                                i3 = i27;
                                int i232 = i7;
                                String str432 = m08.a;
                                Objects.toString(cancelAllWorkByTag);
                                P0 p0102 = p05;
                                w06 = w05;
                                p07 = p0102;
                                i9 = i232;
                                i10 = i3;
                                sharedPreferences5 = sharedPreferences4;
                                str29 = str30;
                                str28 = str31;
                                num10 = num11;
                                BDPlugin.INSTANCE.getClass();
                                reentrantReadWriteLock = BDPlugin.v;
                                readLock = reentrantReadWriteLock.readLock();
                                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                                }
                                String str44222 = str28;
                                while (i12 < i11) {
                                }
                                writeLock = reentrantReadWriteLock.writeLock();
                                writeLock.lock();
                                Map<String, M0> b222 = q1.b(sharedPreferences5);
                                writeLock2 = writeLock;
                                b222.remove(m08.a);
                                SharedPreferences.Editor edit222 = sharedPreferences5.edit();
                                Integer num16222 = num10;
                                SharedPreferences sharedPreferences7222 = sharedPreferences5;
                                b.a aVar222 = kotlinx.serialization.json.b.d;
                                aVar222.getClass();
                                Map map13222 = map5;
                                P0 p011222 = p07;
                                String str45222 = str20;
                                edit222.putString("com.bbflight.background_downloader.taskMap.v2", aVar222.b(new C1126a0(kotlinx.serialization.internal.S0.a, M0.Companion.serializer()), b222));
                                edit222.apply();
                                Unit unit222 = Unit.INSTANCE;
                                while (i13 < i11) {
                                }
                                writeLock2.unlock();
                                kotlinx.coroutines.channels.b bVar5222 = A0.a;
                                String str46222 = m08.a;
                                f1Var3.a = m08;
                                f1Var3.b = SpillingKt.nullOutSpilledVariable(w06);
                                f1Var3.c = SpillingKt.nullOutSpilledVariable(sharedPreferences7222);
                                f1Var3.d = SpillingKt.nullOutSpilledVariable(p011222);
                                f1Var3.e = SpillingKt.nullOutSpilledVariable(str45222);
                                f1Var3.f = SpillingKt.nullOutSpilledVariable(map13222);
                                f1Var3.i = SpillingKt.nullOutSpilledVariable(num16222);
                                f1Var3.j = SpillingKt.nullOutSpilledVariable(str44222);
                                f1Var3.k = SpillingKt.nullOutSpilledVariable(str32);
                                f1Var3.l = context5;
                                f1Var3.m = c1Var2;
                                f1Var3.n = null;
                                f1Var3.o = null;
                                f1Var3.p = i9;
                                f1Var3.q = i10;
                                f1Var3.u = 11;
                                A0.b = System.currentTimeMillis();
                                i14 = A0.a.i(str46222, f1Var3);
                                if (i14 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                }
                                if (i14 != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            }
                            BDPlugin.INSTANCE.getClass();
                            reentrantReadWriteLock = BDPlugin.v;
                            readLock = reentrantReadWriteLock.readLock();
                            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                            }
                            String str442222 = str28;
                            while (i12 < i11) {
                            }
                            writeLock = reentrantReadWriteLock.writeLock();
                            writeLock.lock();
                            Map<String, M0> b2222 = q1.b(sharedPreferences5);
                            writeLock2 = writeLock;
                            b2222.remove(m08.a);
                            SharedPreferences.Editor edit2222 = sharedPreferences5.edit();
                            Integer num162222 = num10;
                            SharedPreferences sharedPreferences72222 = sharedPreferences5;
                            b.a aVar2222 = kotlinx.serialization.json.b.d;
                            aVar2222.getClass();
                            Map map132222 = map5;
                            P0 p0112222 = p07;
                            String str452222 = str20;
                            edit2222.putString("com.bbflight.background_downloader.taskMap.v2", aVar2222.b(new C1126a0(kotlinx.serialization.internal.S0.a, M0.Companion.serializer()), b2222));
                            edit2222.apply();
                            Unit unit2222 = Unit.INSTANCE;
                            while (i13 < i11) {
                            }
                            writeLock2.unlock();
                            kotlinx.coroutines.channels.b bVar52222 = A0.a;
                            String str462222 = m08.a;
                            f1Var3.a = m08;
                            f1Var3.b = SpillingKt.nullOutSpilledVariable(w06);
                            f1Var3.c = SpillingKt.nullOutSpilledVariable(sharedPreferences72222);
                            f1Var3.d = SpillingKt.nullOutSpilledVariable(p0112222);
                            f1Var3.e = SpillingKt.nullOutSpilledVariable(str452222);
                            f1Var3.f = SpillingKt.nullOutSpilledVariable(map132222);
                            f1Var3.i = SpillingKt.nullOutSpilledVariable(num162222);
                            f1Var3.j = SpillingKt.nullOutSpilledVariable(str442222);
                            f1Var3.k = SpillingKt.nullOutSpilledVariable(str32);
                            f1Var3.l = context5;
                            f1Var3.m = c1Var2;
                            f1Var3.n = null;
                            f1Var3.o = null;
                            f1Var3.p = i9;
                            f1Var3.q = i10;
                            f1Var3.u = 11;
                            A0.b = System.currentTimeMillis();
                            i14 = A0.a.i(str462222, f1Var3);
                            if (i14 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            }
                            if (i14 != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        case 11:
                            i10 = f1Var2.q;
                            i9 = f1Var2.p;
                            c1Var2 = (c1) f1Var2.m;
                            context5 = (Context) f1Var2.l;
                            str33 = (String) f1Var2.k;
                            str34 = (String) f1Var2.j;
                            num13 = (Integer) f1Var2.i;
                            Map map16 = (Map) f1Var2.f;
                            str35 = (String) f1Var2.e;
                            p08 = (P0) f1Var2.d;
                            sharedPreferences6 = (SharedPreferences) f1Var2.c;
                            w06 = (W0) f1Var2.b;
                            m08 = (M0) f1Var2.a;
                            ResultKt.throwOnFailure(obj);
                            map8 = map16;
                            f1Var3 = f1Var2;
                            t0 = m08.x;
                            if (t0 != null) {
                                M.a aVar32 = M.Companion;
                                f1Var3.a = SpillingKt.nullOutSpilledVariable(m08);
                                f1Var3.b = SpillingKt.nullOutSpilledVariable(w06);
                                f1Var3.c = SpillingKt.nullOutSpilledVariable(sharedPreferences6);
                                f1Var3.d = SpillingKt.nullOutSpilledVariable(p08);
                                f1Var3.e = SpillingKt.nullOutSpilledVariable(str35);
                                f1Var3.f = SpillingKt.nullOutSpilledVariable(map8);
                                f1Var3.i = SpillingKt.nullOutSpilledVariable(num13);
                                f1Var3.j = SpillingKt.nullOutSpilledVariable(str34);
                                f1Var3.k = SpillingKt.nullOutSpilledVariable(str33);
                                f1Var3.l = SpillingKt.nullOutSpilledVariable(context5);
                                f1Var3.m = SpillingKt.nullOutSpilledVariable(c1Var2);
                                f1Var3.p = i9;
                                f1Var3.q = i10;
                                f1Var3.u = 12;
                                break;
                            }
                            return Unit.INSTANCE;
                        case 12:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            f1Var = new f1(this, continuationImpl);
            f1Var2 = f1Var;
            Object obj2 = f1Var2.s;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (f1Var2.u) {
            }
        }
    }

    @DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker", f = "TaskWorker.kt", i = {0}, l = {399}, m = "doWork$suspendImpl", n = {"$this"}, nl = {452}, s = {"L$0"}, v = 2)
    public static final class b extends ContinuationImpl {
        public TaskWorker a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return TaskWorker.g(TaskWorker.this, this);
        }
    }

    @DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker$doWork$2", f = "TaskWorker.kt", i = {5}, l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS, 420, 422, 424, 425, 426}, m = "invokeSuspend", n = {NotificationCompat.CATEGORY_STATUS}, nl = {408, HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST, 424, 425, 426, 451}, s = {"L$0"}, v = 2)
    @SourceDebugExtension({"SMAP\nTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorker$doWork$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,856:1\n96#2:857\n96#2:858\n*S KotlinDebug\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorker$doWork$2\n*L\n406#1:857\n410#1:858\n*E\n"})
    public static final class c extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        @DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker$doWork$2$1", f = "TaskWorker.kt", i = {}, l = {401}, m = "invokeSuspend", n = {}, nl = {WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE}, s = {}, v = 2)
        public static final class a extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ TaskWorker b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TaskWorker taskWorker, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = taskWorker;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
                return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.a = 1;
                    if (kotlinx.coroutines.W.b(540000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.b.k = true;
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker$doWork$2$2", f = "TaskWorker.kt", i = {}, l = {429, 443, 448}, m = "invokeSuspend", n = {}, nl = {441, 445, 450}, s = {}, v = 2)
        public static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ TaskWorker b;
            public final /* synthetic */ W0 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(TaskWorker taskWorker, W0 w0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = taskWorker;
                this.c = w0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
                return ((b) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
            
                if (r0.g(r1, r17) == r12) goto L28;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
            
                return r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
            
                if (r0 == r12) goto L28;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
            
                if (r0.f(r3, r17.c, r3, r4, r5, r6, r7, r8, r9, r10, r17) == r12) goto L28;
             */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                TaskWorker taskWorker;
                Object i;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.a;
                W0 w0 = this.c;
                TaskWorker taskWorker2 = this.b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Companion companion = TaskWorker.INSTANCE;
                    M0 k = taskWorker2.k();
                    SharedPreferences j = taskWorker2.j();
                    P0 p0 = taskWorker2.q;
                    String str = taskWorker2.r;
                    LinkedHashMap linkedHashMap = taskWorker2.s;
                    Integer num = taskWorker2.t;
                    String str2 = taskWorker2.u;
                    String str3 = taskWorker2.v;
                    Context applicationContext = taskWorker2.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    this.a = 1;
                    taskWorker = taskWorker2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        taskWorker = taskWorker2;
                        if (w0 != W0.i) {
                            BDPlugin.INSTANCE.getClass();
                            C0638c0 c0638c0 = BDPlugin.y;
                            if (c0638c0 != null) {
                                M0 k2 = taskWorker.k();
                                this.a = 3;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    taskWorker = taskWorker2;
                }
                if (w0 != W0.f || taskWorker.k().r == 0) {
                    C0657m0 c0657m0 = C0657m0.a;
                    this.a = 2;
                    i = C0657m0.a.i(taskWorker, w0, 2.0d, -1000L, this);
                }
                if (w0 != W0.i) {
                }
                return Unit.INSTANCE;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TaskWorker.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((c) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x015a, code lost:
        
            if (kotlinx.coroutines.C1082i.f(r3, r2, r14) == r11) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0141, code lost:
        
            if (r0 == r11) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0137, code lost:
        
            if (com.bbflight.background_downloader.C0657m0.a.i(r1, r2, 2.0d, -1000, r14) != r11) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0121, code lost:
        
            if (com.bbflight.background_downloader.TaskWorker.Companion.d(r0, 0.0d, r3, -1, -1.0d, -1000, r14) == r11) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
        
            if (r0 != null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00fd, code lost:
        
            if (com.bbflight.background_downloader.TaskWorker.Companion.g(r0, r1, r3, r3, null, r5, r14, 504) != r11) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a2;
            TaskWorker taskWorker;
            String string;
            C0654k0 c0654k0;
            S0 s0;
            TaskWorker taskWorker2;
            Object b2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            boolean z = true;
            TaskWorker taskWorker3 = TaskWorker.this;
            switch (i) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    C1082i.c(kotlinx.coroutines.L.a(C1049c0.a), null, null, new a(taskWorker3, null), 3);
                    Context applicationContext = taskWorker3.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    b.a aVar = kotlinx.serialization.json.b.d;
                    String string2 = taskWorker3.getInputData().getString("Task");
                    Intrinsics.checkNotNull(string2);
                    aVar.getClass();
                    M0 m0 = (M0) aVar.a(M0.Companion.serializer(), string2);
                    this.a = taskWorker3;
                    this.b = 1;
                    a2 = q1.a(applicationContext, m0, this);
                    if (a2 != coroutine_suspended) {
                        taskWorker = taskWorker3;
                        M0 m02 = (M0) a2;
                        taskWorker.getClass();
                        Intrinsics.checkNotNullParameter(m02, "<set-?>");
                        taskWorker.a = m02;
                        string = taskWorker3.getInputData().getString("notificationConfig");
                        taskWorker3.l = string;
                        if (string == null) {
                            b.a aVar2 = kotlinx.serialization.json.b.d;
                            Intrinsics.checkNotNull(string);
                            aVar2.getClass();
                            c0654k0 = (C0654k0) aVar2.a(kotlinx.serialization.builtins.a.c(C0654k0.Companion.serializer()), string);
                        } else {
                            c0654k0 = null;
                        }
                        taskWorker3.m = c0654k0;
                        if (taskWorker3.w >= 0) {
                            if (c0654k0 == null) {
                                s0 = null;
                                break;
                            } else {
                                s0 = c0654k0.a;
                                break;
                            }
                        }
                        z = false;
                        taskWorker3.x = z;
                        taskWorker3.e = taskWorker3.e();
                        String str = taskWorker3.k().a;
                        Companion companion = TaskWorker.INSTANCE;
                        M0 k = taskWorker3.k();
                        W0 w0 = W0.c;
                        SharedPreferences j = taskWorker3.j();
                        Context applicationContext2 = taskWorker3.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                        this.a = null;
                        this.b = 2;
                        break;
                    }
                    return coroutine_suspended;
                case 1:
                    TaskWorker taskWorker4 = (TaskWorker) this.a;
                    ResultKt.throwOnFailure(obj);
                    taskWorker = taskWorker4;
                    a2 = obj;
                    M0 m022 = (M0) a2;
                    taskWorker.getClass();
                    Intrinsics.checkNotNullParameter(m022, "<set-?>");
                    taskWorker.a = m022;
                    string = taskWorker3.getInputData().getString("notificationConfig");
                    taskWorker3.l = string;
                    if (string == null) {
                    }
                    taskWorker3.m = c0654k0;
                    if (taskWorker3.w >= 0) {
                    }
                    z = false;
                    taskWorker3.x = z;
                    taskWorker3.e = taskWorker3.e();
                    String str2 = taskWorker3.k().a;
                    Companion companion2 = TaskWorker.INSTANCE;
                    M0 k2 = taskWorker3.k();
                    W0 w02 = W0.c;
                    SharedPreferences j2 = taskWorker3.j();
                    Context applicationContext22 = taskWorker3.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext22, "getApplicationContext(...)");
                    this.a = null;
                    this.b = 2;
                    break;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    if (!taskWorker3.e) {
                        Companion companion3 = TaskWorker.INSTANCE;
                        M0 k3 = taskWorker3.k();
                        SharedPreferences j3 = taskWorker3.j();
                        this.b = 3;
                        companion3.getClass();
                        break;
                    }
                    C0657m0 c0657m0 = C0657m0.a;
                    W0 w03 = W0.c;
                    this.b = 4;
                    taskWorker2 = taskWorker3;
                    break;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    C0657m0 c0657m02 = C0657m0.a;
                    W0 w032 = W0.c;
                    this.b = 4;
                    taskWorker2 = taskWorker3;
                    break;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    taskWorker2 = taskWorker3;
                    this.b = 5;
                    b2 = TaskWorker.b(taskWorker2, this);
                    break;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    b2 = obj;
                    taskWorker2 = taskWorker3;
                    W0 w04 = (W0) b2;
                    kotlinx.coroutines.J0 j0 = kotlinx.coroutines.J0.a;
                    b bVar = new b(taskWorker2, w04, null);
                    this.a = SpillingKt.nullOutSpilledVariable(w04);
                    this.b = 6;
                    break;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskWorker(Context applicationContext, WorkerParameters workerParams) {
        super(applicationContext, workerParams);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.j = -1.0d;
        this.o = 2.0d;
        this.w = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x010f A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:12:0x003c, B:18:0x005f, B:19:0x00e6, B:20:0x0109, B:22:0x010f, B:24:0x0121, B:27:0x012f, B:33:0x013f, B:38:0x0067, B:41:0x0098, B:42:0x00a6, B:44:0x00af, B:45:0x00b1), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(TaskWorker taskWorker, ContinuationImpl continuationImpl) {
        j1 j1Var;
        int i;
        String str;
        URL url;
        int i2;
        String str2;
        int i3;
        Proxy proxy;
        try {
            if (continuationImpl instanceof j1) {
                j1Var = (j1) continuationImpl;
                int i4 = j1Var.l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    j1Var.l = i4 - Integer.MIN_VALUE;
                    Object obj = j1Var.j;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = j1Var.l;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        str = taskWorker.k().b;
                        url = new URL(str);
                        int i5 = taskWorker.j().getInt("com.bbflight.background_downloader.config.requestTimeout", 60);
                        String string = taskWorker.j().getString("com.bbflight.background_downloader.config.proxyAddress", null);
                        int i6 = taskWorker.j().getInt("com.bbflight.background_downloader.config.proxyPort", 0);
                        Proxy proxy2 = (string == null || i6 == 0) ? null : new Proxy(Proxy.Type.HTTP, new InetSocketAddress(string, i6));
                        BDPlugin.INSTANCE.getClass();
                        if (!BDPlugin.x) {
                            BDPlugin.x = true;
                        }
                        kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                        kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.scheduling.b.a;
                        k1 k1Var = new k1(url, proxy2, null);
                        j1Var.a = SpillingKt.nullOutSpilledVariable(str);
                        j1Var.b = SpillingKt.nullOutSpilledVariable(url);
                        j1Var.c = SpillingKt.nullOutSpilledVariable(string);
                        j1Var.d = SpillingKt.nullOutSpilledVariable(proxy2);
                        j1Var.f = i5;
                        j1Var.i = i6;
                        j1Var.l = 1;
                        Object f = C1082i.f(k1Var, bVar, j1Var);
                        if (f != coroutine_suspended) {
                            i2 = i5;
                            obj = f;
                            str2 = string;
                            i3 = i6;
                            proxy = proxy2;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        i3 = j1Var.i;
                        i2 = j1Var.f;
                        proxy = (Proxy) j1Var.d;
                        str2 = (String) j1Var.c;
                        url = (URL) j1Var.b;
                        str = (String) j1Var.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    HttpURLConnection httpURLConnection = (HttpURLConnection) obj;
                    httpURLConnection.setRequestMethod(taskWorker.k().f);
                    httpURLConnection.setConnectTimeout(i2 * 1000);
                    for (Map.Entry<String, String> entry : taskWorker.k().e.entrySet()) {
                        if (!Intrinsics.areEqual(entry.getKey(), RtspHeaders.RANGE) || !Intrinsics.areEqual(taskWorker.k().y, "UploadTask")) {
                            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    j1Var.a = SpillingKt.nullOutSpilledVariable(str);
                    j1Var.b = SpillingKt.nullOutSpilledVariable(url);
                    j1Var.c = SpillingKt.nullOutSpilledVariable(str2);
                    j1Var.d = SpillingKt.nullOutSpilledVariable(proxy);
                    j1Var.e = SpillingKt.nullOutSpilledVariable(httpURLConnection);
                    j1Var.f = i2;
                    j1Var.i = i3;
                    j1Var.l = 2;
                    Object c2 = taskWorker.c(httpURLConnection, j1Var);
                    return c2 != coroutine_suspended ? coroutine_suspended : c2;
                }
            }
            if (i != 0) {
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) obj;
            httpURLConnection2.setRequestMethod(taskWorker.k().f);
            httpURLConnection2.setConnectTimeout(i2 * 1000);
            while (r9.hasNext()) {
            }
            j1Var.a = SpillingKt.nullOutSpilledVariable(str);
            j1Var.b = SpillingKt.nullOutSpilledVariable(url);
            j1Var.c = SpillingKt.nullOutSpilledVariable(str2);
            j1Var.d = SpillingKt.nullOutSpilledVariable(proxy);
            j1Var.e = SpillingKt.nullOutSpilledVariable(httpURLConnection2);
            j1Var.f = i2;
            j1Var.i = i3;
            j1Var.l = 2;
            Object c22 = taskWorker.c(httpURLConnection2, j1Var);
            if (c22 != coroutine_suspended) {
            }
        } catch (Exception e) {
            String str3 = taskWorker.k().a;
            ExceptionsKt.stackTraceToString(e);
            e.toString();
            taskWorker.n(e);
            return W0.f;
        }
        j1Var = new j1(taskWorker, continuationImpl);
        Object obj2 = j1Var.j;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = j1Var.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {all -> 0x0080, blocks: (B:20:0x00e2, B:23:0x00ef, B:26:0x011a, B:28:0x011e, B:29:0x0148, B:31:0x014c, B:33:0x015f, B:36:0x0176, B:37:0x017f, B:45:0x0062, B:47:0x006c, B:50:0x00be, B:53:0x0084, B:55:0x008c, B:58:0x00b3, B:65:0x00ba, B:66:0x00bd), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011a A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:20:0x00e2, B:23:0x00ef, B:26:0x011a, B:28:0x011e, B:29:0x0148, B:31:0x014c, B:33:0x015f, B:36:0x0176, B:37:0x017f, B:45:0x0062, B:47:0x006c, B:50:0x00be, B:53:0x0084, B:55:0x008c, B:58:0x00b3, B:65:0x00ba, B:66:0x00bd), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object d(TaskWorker taskWorker, HttpURLConnection httpURLConnection, ContinuationImpl continuationImpl) {
        i1 i1Var;
        int i;
        TaskWorker taskWorker2;
        Throwable th;
        String b2;
        W0 w0;
        try {
            if (continuationImpl instanceof i1) {
                i1Var = (i1) continuationImpl;
                int i2 = i1Var.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    i1Var.f = i2 - Integer.MIN_VALUE;
                    Object obj = i1Var.d;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = i1Var.f;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        M0 k = taskWorker.k();
                        Context applicationContext = taskWorker.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        M0.b bVar = M0.Companion;
                        b2 = k.b(applicationContext, null);
                        try {
                            if (!taskWorker.k().d()) {
                                if (Intrinsics.areEqual(taskWorker.k().y, "DataTask")) {
                                }
                                i1Var.a = taskWorker;
                                i1Var.b = SpillingKt.nullOutSpilledVariable(httpURLConnection);
                                i1Var.c = b2;
                                i1Var.f = 1;
                                obj = taskWorker.l(httpURLConnection, b2, i1Var);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            if (taskWorker.k().h != null) {
                                httpURLConnection.setDoOutput(true);
                                String str = taskWorker.k().h;
                                Intrinsics.checkNotNull(str);
                                httpURLConnection.setFixedLengthStreamingMode(str.length());
                                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    dataOutputStream.writeBytes(taskWorker.k().h);
                                    Unit unit = Unit.INSTANCE;
                                    CloseableKt.closeFinally(dataOutputStream, null);
                                } finally {
                                }
                            }
                            i1Var.a = taskWorker;
                            i1Var.b = SpillingKt.nullOutSpilledVariable(httpURLConnection);
                            i1Var.c = b2;
                            i1Var.f = 1;
                            obj = taskWorker.l(httpURLConnection, b2, i1Var);
                            if (obj == coroutine_suspended) {
                            }
                        } catch (Exception e) {
                            e = e;
                            taskWorker.n(e);
                            if (!(e instanceof FileSystemException)) {
                                Boxing.boxInt(Log.w("TaskWorker", "Filesystem exception for taskId " + taskWorker.k().a + " and " + b2 + ": " + e.getMessage()));
                            } else if (e instanceof SocketException) {
                                Boxing.boxInt(Log.i("TaskWorker", "Socket exception for taskId " + taskWorker.k().a + " and " + b2 + ": " + e.getMessage()));
                            } else {
                                if (e instanceof CancellationException) {
                                    BDPlugin.INSTANCE.getClass();
                                    if (BDPlugin.o.containsKey(taskWorker.k().a)) {
                                        String str2 = taskWorker.k().a;
                                        e.getMessage();
                                        w0 = W0.i;
                                    } else {
                                        String str3 = taskWorker.k().a;
                                        w0 = W0.f;
                                    }
                                    BDPlugin.w.remove(taskWorker.k().a);
                                    return w0;
                                }
                                String str4 = taskWorker.k().a;
                                e.getMessage();
                                ExceptionsKt.stackTraceToString(e);
                                taskWorker.q = new P0(W.b, "Error for url " + taskWorker.k().b + " and " + b2 + ": " + e.getMessage(), 2);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            BDPlugin.INSTANCE.getClass();
                            BDPlugin.w.remove(taskWorker.k().a);
                            return W0.f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str5 = i1Var.c;
                        taskWorker2 = i1Var.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            taskWorker = taskWorker2;
                        } catch (Exception e2) {
                            b2 = str5;
                            taskWorker = taskWorker2;
                            e = e2;
                            taskWorker.n(e);
                            if (!(e instanceof FileSystemException)) {
                            }
                            BDPlugin.INSTANCE.getClass();
                            BDPlugin.w.remove(taskWorker.k().a);
                            return W0.f;
                        } catch (Throwable th2) {
                            th = th2;
                            BDPlugin.INSTANCE.getClass();
                            BDPlugin.w.remove(taskWorker2.k().a);
                            throw th;
                        }
                    }
                    BDPlugin.INSTANCE.getClass();
                    BDPlugin.w.remove(taskWorker.k().a);
                    return obj;
                }
            }
            if (i != 0) {
            }
            BDPlugin.INSTANCE.getClass();
            BDPlugin.w.remove(taskWorker.k().a);
            return obj;
        } catch (Throwable th3) {
            taskWorker2 = taskWorker;
            th = th3;
        }
        i1Var = new i1(taskWorker, continuationImpl);
        Object obj2 = i1Var.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = i1Var.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object g(TaskWorker taskWorker, Continuation<? super ListenableWorker.Result> continuation) {
        b bVar;
        int i;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
                Object obj = bVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(taskWorker.getApplicationContext());
                    Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
                    Intrinsics.checkNotNullParameter(defaultSharedPreferences, "<set-?>");
                    taskWorker.A = defaultSharedPreferences;
                    taskWorker.w = taskWorker.j().getInt("com.bbflight.background_downloader.config.foregroundFileSize", -1);
                    kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                    kotlinx.coroutines.scheduling.b bVar2 = kotlinx.coroutines.scheduling.b.a;
                    c cVar2 = taskWorker.new c(null);
                    bVar.a = taskWorker;
                    bVar.d = 1;
                    if (C1082i.f(cVar2, bVar2, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    taskWorker = bVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                taskWorker.z = true;
                ListenableWorker.Result success = ListenableWorker.Result.success();
                Intrinsics.checkNotNullExpressionValue(success, "success(...)");
                return success;
            }
        }
        bVar = taskWorker.new b(continuation);
        Object obj2 = bVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
        if (i != 0) {
        }
        taskWorker.z = true;
        ListenableWorker.Result success2 = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(success2, "success(...)");
        return success2;
    }

    public static String m(HttpURLConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        try {
            InputStream errorStream = connection.getErrorStream();
            Intrinsics.checkNotNullExpressionValue(errorStream, "getErrorStream(...)");
            return TextStreamsKt.readText(new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192));
        } catch (Exception e) {
            connection.getResponseCode();
            e.toString();
            return null;
        }
    }

    public Object c(HttpURLConnection httpURLConnection, Continuation<? super W0> continuation) {
        return d(this, httpURLConnection, (ContinuationImpl) continuation);
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        return g(this, continuation);
    }

    public boolean e() {
        return false;
    }

    public final void f(M0 task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        boolean z = this.x && j > (((long) this.w) << 20);
        this.y = z;
        if (z) {
            String str = task.a;
        }
    }

    public final void h(Map<String, List<String>> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        List<String> list = headers.get("content-type");
        String str = list != null ? (String) CollectionsKt.first((List) list) : null;
        if (str != null) {
            MatchResult find$default = Regex.find$default(new Regex("(.*);\\s*charset\\s*=(.*)"), str, 0, 2, null);
            if (find$default == null) {
                this.u = str;
                return;
            }
            MatchGroup matchGroup = find$default.getGroups().get(1);
            this.u = matchGroup != null ? matchGroup.getValue() : null;
            MatchGroup matchGroup2 = find$default.getGroups().get(2);
            this.v = matchGroup2 != null ? matchGroup2.getValue() : null;
        }
    }

    public final void i(Map<String, List<String>> headers) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(headers, "headers");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(headers.size()));
        Iterator<T> it = headers.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default((Iterable) entry.getValue(), null, null, null, 0, null, null, 63, null);
            linkedHashMap.put(key, joinToString$default);
        }
        this.s = linkedHashMap;
    }

    public final SharedPreferences j() {
        SharedPreferences sharedPreferences = this.A;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("prefs");
        return null;
    }

    public final M0 k() {
        M0 m0 = this.a;
        if (m0 != null) {
            return m0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("task");
        return null;
    }

    public Object l(HttpURLConnection httpURLConnection, String str, Continuation<? super W0> continuation) {
        throw new NotImplementedError(null, 1, null);
    }

    public final void n(Exception exc) {
        W w = W.b;
        if ((exc instanceof FileSystemException) || (exc instanceof IOException)) {
            w = W.c;
        }
        if (exc instanceof SocketException) {
            w = W.e;
        }
        this.q = new P0(w, exc.toString(), 2);
    }

    public final boolean o(double d, long j) {
        double d2 = this.h;
        if (d - d2 <= 0.02d || j <= this.i) {
            return d > d2 && j > this.i + ((long) 2000);
        }
        return true;
    }

    public final Object p(InputStream inputStream, OutputStream outputStream, long j, M0 m0, ContinuationImpl continuationImpl) {
        Ref.IntRef intRef = new Ref.IntRef();
        return C1082i.f(new l1(m0, this, inputStream, new byte[8192], intRef, outputStream, j, null), C1049c0.a, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(double d, long j, M0 m0, ContinuationImpl continuationImpl) {
        m1 m1Var;
        m1 m1Var2;
        int i;
        double d2;
        double d3;
        TaskWorker taskWorker;
        Object obj;
        double d4;
        M0 m02;
        Object obj2;
        long j2;
        long j3;
        double d5;
        long j4;
        long j5;
        double d6;
        C0657m0 c0657m0;
        W0 w0;
        long j6;
        double d7;
        TaskWorker taskWorker2 = this;
        if (continuationImpl instanceof m1) {
            m1Var = (m1) continuationImpl;
            int i2 = m1Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m1Var.n = i2 - Integer.MIN_VALUE;
                m1Var2 = m1Var;
                Object obj3 = m1Var2.l;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = m1Var2.n;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (Intrinsics.areEqual(m0.y, "ParallelDownloadTask")) {
                        taskWorker2.c = (long) (j * d);
                    }
                    long j7 = currentTimeMillis - taskWorker2.g;
                    taskWorker2.g = currentTimeMillis;
                    long j8 = taskWorker2.c;
                    long j9 = j8 - taskWorker2.f;
                    taskWorker2.f = j8;
                    if (j7 > DurationKt.MILLIS_IN_HOUR) {
                        d3 = -1.0d;
                        d2 = -1.0d;
                    } else {
                        d2 = -1.0d;
                        d3 = j9 / (j7 * 1000.0d);
                        taskWorker2 = this;
                    }
                    double d8 = taskWorker2.j;
                    double d9 = d8 == d2 ? d3 : ((d8 * 3.0d) + d3) / 4.0d;
                    taskWorker2.j = d9;
                    double d10 = d9;
                    double d11 = d3;
                    double d12 = (1 - d) * j;
                    long j10 = d10 == d2 ? -1000L : (long) ((d12 / d10) / 1000);
                    Companion companion = INSTANCE;
                    SharedPreferences j11 = j();
                    taskWorker = this;
                    double d13 = taskWorker.j;
                    m1Var2.k = SpillingKt.nullOutSpilledVariable(m0);
                    m1Var2.a = d;
                    m1Var2.d = j;
                    m1Var2.e = currentTimeMillis;
                    m1Var2.f = j7;
                    m1Var2.i = j9;
                    m1Var2.b = d11;
                    m1Var2.c = d12;
                    m1Var2.j = j10;
                    m1Var2.n = 1;
                    companion.getClass();
                    obj = coroutine_suspended;
                    if (Companion.d(m0, d, j11, j, d13, j10, m1Var2) == obj) {
                        return obj;
                    }
                    d4 = d;
                    m02 = m0;
                    obj2 = obj;
                    j2 = j7;
                    j3 = j9;
                    d5 = d12;
                    j4 = j10;
                    j5 = currentTimeMillis;
                    d6 = d11;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d7 = m1Var2.a;
                        ResultKt.throwOnFailure(obj3);
                        taskWorker2.h = d7;
                        taskWorker2.i = System.currentTimeMillis() + 500;
                        return Unit.INSTANCE;
                    }
                    long j12 = m1Var2.j;
                    double d14 = m1Var2.c;
                    double d15 = m1Var2.b;
                    long j13 = m1Var2.i;
                    long j14 = m1Var2.f;
                    long j15 = m1Var2.e;
                    j = m1Var2.d;
                    double d16 = m1Var2.a;
                    M0 m03 = (M0) m1Var2.k;
                    ResultKt.throwOnFailure(obj3);
                    j4 = j12;
                    d5 = d14;
                    obj2 = coroutine_suspended;
                    taskWorker = taskWorker2;
                    d4 = d16;
                    m02 = m03;
                    d6 = d15;
                    j3 = j13;
                    j2 = j14;
                    j5 = j15;
                }
                long j16 = j;
                c0657m0 = C0657m0.a;
                M0 m04 = m02;
                w0 = W0.c;
                m1Var2.k = SpillingKt.nullOutSpilledVariable(m04);
                m1Var2.a = d4;
                m1Var2.d = j16;
                m1Var2.e = j5;
                m1Var2.f = j2;
                m1Var2.i = j3;
                m1Var2.b = d6;
                m1Var2.c = d5;
                j6 = j4;
                m1Var2.j = j6;
                m1Var2.n = 2;
                taskWorker2 = taskWorker;
                obj = obj2;
                if (c0657m0.i(taskWorker2, w0, d4, j6, m1Var2) != obj) {
                    d7 = d4;
                    taskWorker2.h = d7;
                    taskWorker2.i = System.currentTimeMillis() + 500;
                    return Unit.INSTANCE;
                }
                return obj;
            }
        }
        m1Var = new m1(taskWorker2, continuationImpl);
        m1Var2 = m1Var;
        Object obj32 = m1Var2.l;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = m1Var2.n;
        if (i != 0) {
        }
        long j162 = j;
        c0657m0 = C0657m0.a;
        M0 m042 = m02;
        w0 = W0.c;
        m1Var2.k = SpillingKt.nullOutSpilledVariable(m042);
        m1Var2.a = d4;
        m1Var2.d = j162;
        m1Var2.e = j5;
        m1Var2.f = j2;
        m1Var2.i = j3;
        m1Var2.b = d6;
        m1Var2.c = d5;
        j6 = j4;
        m1Var2.j = j6;
        m1Var2.n = 2;
        taskWorker2 = taskWorker;
        obj = obj2;
        if (c0657m0.i(taskWorker2, w0, d4, j6, m1Var2) != obj) {
        }
        return obj;
    }
}
