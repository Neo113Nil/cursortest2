package com.bbflight.background_downloader;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.preference.PreferenceManager;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.bbflight.background_downloader.BDPlugin;
import com.bbflight.background_downloader.C0682z0;
import com.bbflight.background_downloader.G0;
import com.bbflight.background_downloader.M0;
import com.bbflight.background_downloader.TaskWorker;
import com.bbflight.background_downloader.W0;
import com.google.android.gms.wallet.WalletConstants;
import com.haryanvi.netstream.R;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.internal.C1086c;
import kotlinx.serialization.internal.C1126a0;
import kotlinx.serialization.json.b;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 _2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001_B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001e\u0010!\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@¢\u0006\u0002\u0010\"J\u001e\u0010#\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@¢\u0006\u0002\u0010\"J\u001e\u0010$\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@¢\u0006\u0002\u0010\"J\u001e\u0010%\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@¢\u0006\u0002\u0010\"J\u0018\u0010&\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001e\u0010'\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@¢\u0006\u0002\u0010\"J\u0018\u0010(\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010)\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001e\u00100\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@¢\u0006\u0002\u0010\"J\u0018\u00101\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u00102\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001e\u00103\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@¢\u0006\u0002\u0010\"J\u0010\u00104\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001e\u00105\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@¢\u0006\u0002\u0010\"J\u001e\u00106\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@¢\u0006\u0002\u0010\"J\u0018\u00107\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u00108\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u00109\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010:\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010;\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010<\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010=\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010>\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010?\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010@\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010A\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010B\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010C\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010D\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010E\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010F\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001e\u0010G\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@¢\u0006\u0002\u0010\"J\u001f\u0010H\u001a\u00020\u00172\u0006\u0010I\u001a\u00020/2\b\u0010J\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0002\u0010LJ\u0012\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0002J\u0010\u0010Q\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020\u0017H\u0016J\u0010\u0010T\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020RH\u0016J\b\u0010U\u001a\u00020\u0017H\u0016J\u0010\u0010V\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020RH\u0002J\b\u0010W\u001a\u00020\u0017H\u0002J-\u0010X\u001a\u00020N2\u0006\u0010Y\u001a\u00020K2\u000e\u0010Z\u001a\n\u0012\u0006\b\u0001\u0012\u00020/0[2\u0006\u0010\\\u001a\u00020]H\u0016¢\u0006\u0002\u0010^R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006`"}, d2 = {"Lcom/bbflight/background_downloader/BDPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;", "<init>", "()V", "channel", "Lio/flutter/plugin/common/MethodChannel;", "backgroundChannel", "applicationContext", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "binding", "onMethodCall", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "methodEnqueue", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "methodReset", "methodAllTasks", "methodCancelTasksWithIds", "methodKillTaskWithId", "methodTaskForId", "methodPause", "methodUpdateNotification", "methodPopResumeData", "methodPopStatusUpdates", "methodPopProgressUpdates", "popLocalStorage", "prefsKey", "", "methodMoveToSharedStorage", "methodPathInSharedStorage", "methodOpenFile", "methodRequireWiFi", "methodGetRequireWiFiSetting", "methodUpdateChunkStatus", "methodUpdateChunkProgress", "methodPermissionStatus", "methodRequestPermission", "methodShouldShowPermissionRationale", "methodGetTaskTimeout", "methodRegisterCallbackDispatcher", "methodConfigForegroundFileSize", "methodConfigProxyAddress", "methodConfigProxyPort", "methodConfigRequestTimeout", "methodConfigBypassTLSCertificateValidation", "methodConfigCheckAvailableSpace", "methodConfigUseCacheDir", "methodConfigUseExternalStorage", "methodConfigHoldingQueue", "methodPlatformVersion", "methodForceFailPostOnBackgroundChannel", "methodTestSuggestedFilename", "updateSharedPreferences", Constants.KEY, "value", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "handleIntent", "", "intent", "Landroid/content/Intent;", "onAttachedToActivity", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "attach", "detach", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)Z", "Companion", "background_downloader_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBDPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BDPlugin.kt\ncom/bbflight/background_downloader/BDPlugin\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,1259:1\n567#2:1260\n552#2,6:1261\n96#3:1267\n96#3:1285\n96#3:1286\n96#3:1287\n96#3:1288\n96#3:1289\n777#4:1268\n873#4,2:1269\n777#4:1271\n873#4,2:1272\n1915#4:1274\n1916#4:1276\n777#4:1277\n873#4,2:1278\n777#4:1280\n873#4,2:1281\n113#5:1275\n113#5:1283\n113#5:1284\n*S KotlinDebug\n*F\n+ 1 BDPlugin.kt\ncom/bbflight/background_downloader/BDPlugin\n*L\n383#1:1260\n383#1:1261,6\n457#1:1267\n809#1:1285\n868#1:1286\n1099#1:1287\n1169#1:1288\n1173#1:1289\n533#1:1268\n533#1:1269,2\n535#1:1271\n535#1:1272,2\n566#1:1274\n566#1:1276\n571#1:1277\n571#1:1278,2\n578#1:1280\n578#1:1281,2\n566#1:1275\n583#1:1283\n642#1:1284\n*E\n"})
/* renamed from: com.bbflight.background_downloader.l, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class BDPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.RequestPermissionsResultListener {
    public static MethodChannel j;
    public static boolean u;
    public static boolean x;
    public static C0638c0 y;
    public MethodChannel a;
    public MethodChannel b;
    public Context c;
    public C1086c d;
    public BinaryMessenger e;
    public Activity f;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    @SuppressLint({"StaticFieldLeak"})
    public static final LinkedHashMap i = new LinkedHashMap();
    public static Map<String, MethodChannel> k = new LinkedHashMap();
    public static final LinkedHashMap l = new LinkedHashMap();
    public static B0 m = B0.a;
    public static final LinkedHashMap n = new LinkedHashMap();
    public static Map<String, Long> o = new LinkedHashMap();
    public static final LinkedHashSet p = new LinkedHashSet();
    public static final HashMap<String, ParallelDownloadTaskWorker> q = new HashMap<>();
    public static final LinkedHashSet r = new LinkedHashSet();
    public static final LinkedHashSet s = new LinkedHashSet();
    public static final LinkedHashMap t = new LinkedHashMap();
    public static final ReentrantReadWriteLock v = new ReentrantReadWriteLock();
    public static final LinkedHashMap w = new LinkedHashMap();

    @SourceDebugExtension({"SMAP\nBDPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BDPlugin.kt\ncom/bbflight/background_downloader/BDPlugin$Companion\n+ 2 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n+ 3 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1259:1\n100#2:1260\n100#2:1261\n100#2:1262\n100#2:1263\n100#2:1264\n113#3:1265\n113#3:1269\n113#3:1270\n777#4:1266\n873#4,2:1267\n*S KotlinDebug\n*F\n+ 1 BDPlugin.kt\ncom/bbflight/background_downloader/BDPlugin$Companion\n*L\n149#1:1260\n150#1:1261\n151#1:1262\n152#1:1263\n153#1:1264\n201#1:1265\n270#1:1269\n271#1:1270\n219#1:1266\n219#1:1267,2\n*E\n"})
    /* renamed from: com.bbflight.background_downloader.l$a, reason: from kotlin metadata */
    public static final class Companion {
        public static MethodChannel a(Companion companion, BDPlugin bDPlugin, String taskId, int i) {
            MethodChannel methodChannel;
            if ((i & 1) != 0) {
                bDPlugin = null;
            }
            if ((i & 2) != 0) {
                taskId = "bgd_non_existent_id";
            }
            companion.getClass();
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            if (bDPlugin != null && (methodChannel = bDPlugin.b) != null) {
                return methodChannel;
            }
            MethodChannel methodChannel2 = BDPlugin.k.get(taskId);
            return methodChannel2 == null ? BDPlugin.j : methodChannel2;
        }

        public static /* synthetic */ Object e(Companion companion, Context context, M0 m0, String str, E0 e0, BDPlugin bDPlugin, ContinuationImpl continuationImpl, int i) {
            return companion.d(context, m0, str, e0, (i & 16) != 0 ? 0L : 1000L, (i & 32) != 0 ? null : bDPlugin, continuationImpl);
        }

        public static boolean f(M0 task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (BDPlugin.m != B0.b) {
                return BDPlugin.m == B0.a && task.p;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x01cd, code lost:
        
            if (r1.g(r0, r2) == r4) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0101, code lost:
        
            if (r1.r(r2) == r4) goto L82;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x02f0  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x023c  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0229 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x030b  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x02f0 -> B:17:0x02f6). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(Context context, String str, WorkManager workManager, ContinuationImpl continuationImpl) {
            C0643f c0643f;
            Object obj;
            Object coroutine_suspended;
            int i;
            int i2;
            boolean z;
            Context context2;
            WorkManager workManager2;
            String str2;
            WorkManager workManager3;
            Context context3;
            List list;
            SharedPreferences defaultSharedPreferences;
            Map<String, M0> b;
            Iterator it;
            String taskId;
            WorkManager workManager4;
            List list2;
            SharedPreferences sharedPreferences;
            Context context4;
            Iterator it2;
            WorkInfo workInfo;
            M0 m0;
            boolean z2;
            WorkManager workManager5;
            List list3;
            SharedPreferences sharedPreferences2;
            Context context5;
            String str3;
            Iterator it3;
            WorkInfo workInfo2;
            Operation cancelAllWorkByTag;
            int i3;
            Object f;
            Iterator<Z> it4;
            Z z3;
            C0638c0 c0638c0;
            C0643f c0643f2;
            Context context6;
            SharedPreferences sharedPreferences3;
            String str4 = str;
            if (continuationImpl instanceof C0643f) {
                c0643f = (C0643f) continuationImpl;
                int i4 = c0643f.n;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0643f.n = i4 - Integer.MIN_VALUE;
                    obj = c0643f.l;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0643f.n;
                    int i5 = 3;
                    boolean z4 = true;
                    if (i != 0) {
                        i2 = 5;
                        z = false;
                        ResultKt.throwOnFailure(obj);
                        ParallelDownloadTaskWorker parallelDownloadTaskWorker = BDPlugin.q.get(str4);
                        context2 = context;
                        if (parallelDownloadTaskWorker != null) {
                            c0643f.a = context2;
                            c0643f.b = str4;
                            workManager2 = workManager;
                            c0643f.c = workManager2;
                            c0643f.n = 1;
                        } else {
                            workManager2 = workManager;
                        }
                    } else if (i == 1) {
                        i2 = 5;
                        z = false;
                        WorkManager workManager6 = c0643f.c;
                        String str5 = c0643f.b;
                        Context context7 = c0643f.a;
                        ResultKt.throwOnFailure(obj);
                        workManager2 = workManager6;
                        str4 = str5;
                        context2 = context7;
                    } else if (i == 2) {
                        i2 = 5;
                        z = false;
                        workManager3 = c0643f.c;
                        str2 = c0643f.b;
                        context3 = c0643f.a;
                        ResultKt.throwOnFailure(obj);
                        list = (List) obj;
                        if (!list.isEmpty()) {
                            return Boxing.boxBoolean(z);
                        }
                        defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context3);
                        Intrinsics.checkNotNull(defaultSharedPreferences);
                        b = q1.b(defaultSharedPreferences);
                        it = list.iterator();
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i == 3) {
                            i2 = 5;
                            z = false;
                            m0 = (M0) c0643f.k;
                            workInfo = (WorkInfo) c0643f.j;
                            it2 = c0643f.i;
                            Map<String, M0> map = c0643f.f;
                            SharedPreferences sharedPreferences4 = c0643f.e;
                            List list4 = (List) c0643f.d;
                            WorkManager workManager7 = c0643f.c;
                            String str6 = c0643f.b;
                            Context context8 = c0643f.a;
                            ResultKt.throwOnFailure(obj);
                            b = map;
                            context4 = context8;
                            taskId = str6;
                            workManager4 = workManager7;
                            list2 = list4;
                            sharedPreferences = sharedPreferences4;
                            c0638c0 = BDPlugin.y;
                            if (c0638c0 != null) {
                            }
                            C0657m0 c0657m0 = C0657m0.a;
                            Intrinsics.checkNotNullParameter(taskId, "taskId");
                            it4 = C0657m0.b.values().iterator();
                            loop0: while (true) {
                                if (!it4.hasNext()) {
                                }
                                z4 = z2;
                            }
                            NotificationManagerCompat from = NotificationManagerCompat.from(context4);
                            if (z3 == null) {
                            }
                            workInfo2 = workInfo;
                            it3 = it2;
                            str3 = taskId;
                            workManager5 = workManager4;
                            list3 = list2;
                            sharedPreferences2 = sharedPreferences;
                            context5 = context4;
                            cancelAllWorkByTag = workManager5.cancelAllWorkByTag("taskId=" + str3);
                            Intrinsics.checkNotNullExpressionValue(cancelAllWorkByTag, "cancelAllWorkByTag(...)");
                            kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.scheduling.b.a;
                            C0645g c0645g = new C0645g(cancelAllWorkByTag, null);
                            c0643f.a = context5;
                            c0643f.b = str3;
                            c0643f.c = workManager5;
                            c0643f.d = SpillingKt.nullOutSpilledVariable(list3);
                            c0643f.e = sharedPreferences2;
                            c0643f.f = b;
                            c0643f.i = it3;
                            c0643f.j = SpillingKt.nullOutSpilledVariable(workInfo2);
                            c0643f.k = cancelAllWorkByTag;
                            i3 = i2;
                            c0643f.n = i3;
                            f = C1082i.f(c0645g, bVar, c0643f);
                            if (f != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        if (i == 4) {
                            i2 = 5;
                            z = false;
                            m0 = (M0) c0643f.k;
                            workInfo = (WorkInfo) c0643f.j;
                            it2 = c0643f.i;
                            b = c0643f.f;
                            sharedPreferences = c0643f.e;
                            list2 = (List) c0643f.d;
                            workManager4 = c0643f.c;
                            taskId = c0643f.b;
                            context4 = c0643f.a;
                            ResultKt.throwOnFailure(obj);
                            C0657m0 c0657m02 = C0657m0.a;
                            Intrinsics.checkNotNullParameter(taskId, "taskId");
                            it4 = C0657m0.b.values().iterator();
                            loop0: while (true) {
                                if (!it4.hasNext()) {
                                }
                                z4 = z2;
                            }
                            NotificationManagerCompat from2 = NotificationManagerCompat.from(context4);
                            if (z3 == null) {
                            }
                            workInfo2 = workInfo;
                            it3 = it2;
                            str3 = taskId;
                            workManager5 = workManager4;
                            list3 = list2;
                            sharedPreferences2 = sharedPreferences;
                            context5 = context4;
                            cancelAllWorkByTag = workManager5.cancelAllWorkByTag("taskId=" + str3);
                            Intrinsics.checkNotNullExpressionValue(cancelAllWorkByTag, "cancelAllWorkByTag(...)");
                            kotlinx.coroutines.scheduling.c cVar2 = C1049c0.a;
                            kotlinx.coroutines.scheduling.b bVar2 = kotlinx.coroutines.scheduling.b.a;
                            C0645g c0645g2 = new C0645g(cancelAllWorkByTag, null);
                            c0643f.a = context5;
                            c0643f.b = str3;
                            c0643f.c = workManager5;
                            c0643f.d = SpillingKt.nullOutSpilledVariable(list3);
                            c0643f.e = sharedPreferences2;
                            c0643f.f = b;
                            c0643f.i = it3;
                            c0643f.j = SpillingKt.nullOutSpilledVariable(workInfo2);
                            c0643f.k = cancelAllWorkByTag;
                            i3 = i2;
                            c0643f.n = i3;
                            f = C1082i.f(c0645g2, bVar2, c0643f);
                            if (f != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Operation operation = (Operation) c0643f.k;
                        Iterator it5 = c0643f.i;
                        b = c0643f.f;
                        sharedPreferences2 = c0643f.e;
                        list3 = (List) c0643f.d;
                        workManager5 = c0643f.c;
                        z = false;
                        String str7 = c0643f.b;
                        Context context9 = c0643f.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            it = it5;
                            str2 = str7;
                            context3 = context9;
                            f = obj;
                            z2 = true;
                            cancelAllWorkByTag = operation;
                            i3 = 5;
                            try {
                                i2 = i3;
                                defaultSharedPreferences = sharedPreferences2;
                                list = list3;
                                workManager3 = workManager5;
                                z4 = z2;
                                i5 = 3;
                                if (it.hasNext()) {
                                    WorkInfo workInfo3 = (WorkInfo) it.next();
                                    if (workInfo3.getState() == WorkInfo.State.SUCCEEDED) {
                                        c0643f2 = c0643f;
                                        context6 = context3;
                                        sharedPreferences3 = defaultSharedPreferences;
                                        z2 = z4;
                                    } else {
                                        M0 m02 = b.get(str2);
                                        if (m02 != null) {
                                            TaskWorker.Companion companion = TaskWorker.INSTANCE;
                                            W0 w0 = W0.i;
                                            Intrinsics.checkNotNull(defaultSharedPreferences);
                                            c0643f.a = context3;
                                            c0643f.b = str2;
                                            c0643f.c = workManager3;
                                            c0643f.d = SpillingKt.nullOutSpilledVariable(list);
                                            c0643f.e = defaultSharedPreferences;
                                            c0643f.f = b;
                                            c0643f.i = it;
                                            c0643f.j = SpillingKt.nullOutSpilledVariable(workInfo3);
                                            c0643f.k = m02;
                                            c0643f.n = i5;
                                            C0643f c0643f3 = c0643f;
                                            Context context10 = context3;
                                            SharedPreferences sharedPreferences5 = defaultSharedPreferences;
                                            if (TaskWorker.Companion.g(companion, m02, w0, sharedPreferences5, null, context10, c0643f3, 504) != coroutine_suspended) {
                                                workManager4 = workManager3;
                                                taskId = str2;
                                                it2 = it;
                                                workInfo = workInfo3;
                                                m0 = m02;
                                                sharedPreferences = sharedPreferences5;
                                                context4 = context10;
                                                c0643f = c0643f3;
                                                list2 = list;
                                                c0638c0 = BDPlugin.y;
                                                if (c0638c0 != null) {
                                                    c0643f.a = context4;
                                                    c0643f.b = taskId;
                                                    c0643f.c = workManager4;
                                                    c0643f.d = SpillingKt.nullOutSpilledVariable(list2);
                                                    c0643f.e = sharedPreferences;
                                                    c0643f.f = b;
                                                    c0643f.i = it2;
                                                    c0643f.j = SpillingKt.nullOutSpilledVariable(workInfo);
                                                    c0643f.k = m0;
                                                    c0643f.n = 4;
                                                }
                                                C0657m0 c0657m022 = C0657m0.a;
                                                Intrinsics.checkNotNullParameter(taskId, "taskId");
                                                it4 = C0657m0.b.values().iterator();
                                                loop0: while (true) {
                                                    if (!it4.hasNext()) {
                                                        z2 = z4;
                                                        z3 = null;
                                                        break;
                                                    }
                                                    Z next = it4.next();
                                                    z2 = z4;
                                                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                                                    z3 = next;
                                                    Set<M0> c = z3.c();
                                                    if (!(c instanceof Collection) || !c.isEmpty()) {
                                                        Iterator<T> it6 = c.iterator();
                                                        while (it6.hasNext()) {
                                                            if (Intrinsics.areEqual(((M0) it6.next()).a, taskId)) {
                                                                break loop0;
                                                            }
                                                        }
                                                    }
                                                    z4 = z2;
                                                }
                                                NotificationManagerCompat from22 = NotificationManagerCompat.from(context4);
                                                if (z3 == null) {
                                                    from22.cancel(m0.a.hashCode());
                                                } else {
                                                    C0657m0 c0657m03 = C0657m0.a;
                                                    b.a aVar = kotlinx.serialization.json.b.d;
                                                    aVar.getClass();
                                                    String b2 = aVar.b(M0.Companion.serializer(), m0);
                                                    String b3 = aVar.b(C0654k0.Companion.serializer(), z3.b);
                                                    W0.a aVar2 = W0.Companion;
                                                    C0657m0.e(context4, b2, b3, Boxing.boxInt(i2));
                                                }
                                                workInfo2 = workInfo;
                                                it3 = it2;
                                                str3 = taskId;
                                                workManager5 = workManager4;
                                                list3 = list2;
                                                sharedPreferences2 = sharedPreferences;
                                                context5 = context4;
                                                cancelAllWorkByTag = workManager5.cancelAllWorkByTag("taskId=" + str3);
                                                Intrinsics.checkNotNullExpressionValue(cancelAllWorkByTag, "cancelAllWorkByTag(...)");
                                                kotlinx.coroutines.scheduling.c cVar22 = C1049c0.a;
                                                kotlinx.coroutines.scheduling.b bVar22 = kotlinx.coroutines.scheduling.b.a;
                                                C0645g c0645g22 = new C0645g(cancelAllWorkByTag, null);
                                                c0643f.a = context5;
                                                c0643f.b = str3;
                                                c0643f.c = workManager5;
                                                c0643f.d = SpillingKt.nullOutSpilledVariable(list3);
                                                c0643f.e = sharedPreferences2;
                                                c0643f.f = b;
                                                c0643f.i = it3;
                                                c0643f.j = SpillingKt.nullOutSpilledVariable(workInfo2);
                                                c0643f.k = cancelAllWorkByTag;
                                                i3 = i2;
                                                c0643f.n = i3;
                                                f = C1082i.f(c0645g22, bVar22, c0643f);
                                                if (f != coroutine_suspended) {
                                                    Context context11 = context5;
                                                    it = it3;
                                                    str2 = str3;
                                                    context3 = context11;
                                                    i2 = i3;
                                                    defaultSharedPreferences = sharedPreferences2;
                                                    list = list3;
                                                    workManager3 = workManager5;
                                                    z4 = z2;
                                                    i5 = 3;
                                                    if (it.hasNext()) {
                                                        return Boxing.boxBoolean(z4);
                                                    }
                                                }
                                            }
                                            return coroutine_suspended;
                                        }
                                        c0643f2 = c0643f;
                                        context6 = context3;
                                        sharedPreferences3 = defaultSharedPreferences;
                                        z2 = z4;
                                        Boxing.boxInt(Log.d("BackgroundDownloader", "Could not find task with taskId " + str2 + " to cancel"));
                                    }
                                    workManager5 = workManager3;
                                    list3 = list;
                                    str3 = str2;
                                    it3 = it;
                                    workInfo2 = workInfo3;
                                    sharedPreferences2 = sharedPreferences3;
                                    context5 = context6;
                                    c0643f = c0643f2;
                                    cancelAllWorkByTag = workManager5.cancelAllWorkByTag("taskId=" + str3);
                                    Intrinsics.checkNotNullExpressionValue(cancelAllWorkByTag, "cancelAllWorkByTag(...)");
                                    kotlinx.coroutines.scheduling.c cVar222 = C1049c0.a;
                                    kotlinx.coroutines.scheduling.b bVar222 = kotlinx.coroutines.scheduling.b.a;
                                    C0645g c0645g222 = new C0645g(cancelAllWorkByTag, null);
                                    c0643f.a = context5;
                                    c0643f.b = str3;
                                    c0643f.c = workManager5;
                                    c0643f.d = SpillingKt.nullOutSpilledVariable(list3);
                                    c0643f.e = sharedPreferences2;
                                    c0643f.f = b;
                                    c0643f.i = it3;
                                    c0643f.j = SpillingKt.nullOutSpilledVariable(workInfo2);
                                    c0643f.k = cancelAllWorkByTag;
                                    i3 = i2;
                                    c0643f.n = i3;
                                    f = C1082i.f(c0645g222, bVar222, c0643f);
                                    if (f != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                }
                            } catch (Throwable unused) {
                                operation = cancelAllWorkByTag;
                                Objects.toString(operation);
                                return Boxing.boxBoolean(z);
                            }
                        } catch (Throwable unused2) {
                            Objects.toString(operation);
                            return Boxing.boxBoolean(z);
                        }
                    }
                    kotlinx.coroutines.scheduling.c cVar3 = C1049c0.a;
                    kotlinx.coroutines.scheduling.b bVar3 = kotlinx.coroutines.scheduling.b.a;
                    C0647h c0647h = new C0647h(workManager2, str4, null);
                    c0643f.a = context2;
                    c0643f.b = str4;
                    c0643f.c = workManager2;
                    c0643f.n = 2;
                    obj = C1082i.f(c0647h, bVar3, c0643f);
                    if (obj != coroutine_suspended) {
                        Context context12 = context2;
                        str2 = str4;
                        workManager3 = workManager2;
                        context3 = context12;
                        list = (List) obj;
                        if (!list.isEmpty()) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            c0643f = new C0643f(this, continuationImpl);
            obj = c0643f.l;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c0643f.n;
            int i52 = 3;
            boolean z42 = true;
            if (i != 0) {
            }
            kotlinx.coroutines.scheduling.c cVar32 = C1049c0.a;
            kotlinx.coroutines.scheduling.b bVar32 = kotlinx.coroutines.scheduling.b.a;
            C0647h c0647h2 = new C0647h(workManager2, str4, null);
            c0643f.a = context2;
            c0643f.b = str4;
            c0643f.c = workManager2;
            c0643f.n = 2;
            obj = C1082i.f(c0647h2, bVar32, c0643f);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x011c, code lost:
        
            if (((java.lang.Boolean) r13).booleanValue() != false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0113, code lost:
        
            if (r13 == r1) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x008b, code lost:
        
            if (r2.d(r0) == r1) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ed -> B:14:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0113 -> B:12:0x0116). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(Context context, Iterable iterable, ContinuationImpl continuationImpl) {
            C0649i c0649i;
            int i;
            WorkManager workManager;
            C0638c0 c0638c0;
            Context context2;
            WorkManager workManager2;
            List list;
            WorkManager workManager3;
            Iterator it;
            Iterable iterable2;
            List list2;
            Context context3;
            List list3;
            kotlinx.coroutines.sync.c cVar;
            if (continuationImpl instanceof C0649i) {
                c0649i = (C0649i) continuationImpl;
                int i2 = c0649i.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0649i.l = i2 - Integer.MIN_VALUE;
                    Object obj = c0649i.j;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0649i.l;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        workManager = WorkManager.getInstance(context);
                        Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
                        Objects.toString(iterable);
                        C0638c0 c0638c02 = BDPlugin.y;
                        if (c0638c02 != null && (r2 = c0638c02.o) != null) {
                            c0649i.a = context;
                            c0649i.b = iterable;
                            c0649i.c = workManager;
                            c0649i.l = 1;
                        }
                    } else if (i == 1) {
                        WorkManager workManager4 = c0649i.c;
                        iterable = (Iterable) c0649i.b;
                        Context context4 = c0649i.a;
                        ResultKt.throwOnFailure(obj);
                        workManager = workManager4;
                        context = context4;
                    } else if (i == 2) {
                        workManager2 = c0649i.c;
                        iterable = (Iterable) c0649i.b;
                        context2 = c0649i.a;
                        ResultKt.throwOnFailure(obj);
                        list = (List) obj;
                        if (list == null) {
                            workManager = workManager2;
                            context = context2;
                            context2 = context;
                            workManager2 = workManager;
                            list = CollectionsKt.emptyList();
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (!list.contains((String) obj2)) {
                                arrayList.add(obj2);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        workManager3 = workManager2;
                        it = it2;
                        iterable2 = iterable;
                        list2 = arrayList;
                        context3 = context2;
                        list3 = list;
                        boolean z = true;
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            if (z) {
                                c0649i.a = context3;
                                c0649i.b = SpillingKt.nullOutSpilledVariable(iterable2);
                                c0649i.c = workManager3;
                                c0649i.d = SpillingKt.nullOutSpilledVariable(list3);
                                c0649i.e = SpillingKt.nullOutSpilledVariable(list2);
                                c0649i.f = it;
                                c0649i.i = SpillingKt.nullOutSpilledVariable(str);
                                c0649i.l = 3;
                                obj = b(context3, str, workManager3, c0649i);
                            }
                            z = false;
                            if (it.hasNext()) {
                                C0638c0 c0638c03 = BDPlugin.y;
                                if (c0638c03 != null && (cVar = c0638c03.o) != null) {
                                    cVar.c(null);
                                }
                                return Boxing.boxBoolean(z);
                            }
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0649i.f;
                        list2 = (List) c0649i.e;
                        list3 = (List) c0649i.d;
                        workManager3 = c0649i.c;
                        iterable2 = (Iterable) c0649i.b;
                        context3 = c0649i.a;
                        ResultKt.throwOnFailure(obj);
                    }
                    c0638c0 = BDPlugin.y;
                    if (c0638c0 != null) {
                        c0649i.a = context;
                        c0649i.b = iterable;
                        c0649i.c = workManager;
                        c0649i.l = 2;
                        Object f = c0638c0.f(context, iterable, c0649i);
                        if (f != coroutine_suspended) {
                            context2 = context;
                            workManager2 = workManager;
                            obj = f;
                            list = (List) obj;
                            if (list == null) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            while (r6.hasNext()) {
                            }
                            Iterator it22 = arrayList2.iterator();
                            workManager3 = workManager2;
                            it = it22;
                            iterable2 = iterable;
                            list2 = arrayList2;
                            context3 = context2;
                            list3 = list;
                            boolean z2 = true;
                            if (it.hasNext()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    context2 = context;
                    workManager2 = workManager;
                    list = CollectionsKt.emptyList();
                    ArrayList arrayList22 = new ArrayList();
                    while (r6.hasNext()) {
                    }
                    Iterator it222 = arrayList22.iterator();
                    workManager3 = workManager2;
                    it = it222;
                    iterable2 = iterable;
                    list2 = arrayList22;
                    context3 = context2;
                    list3 = list;
                    boolean z22 = true;
                    if (it.hasNext()) {
                    }
                }
            }
            c0649i = new C0649i(this, continuationImpl);
            Object obj3 = c0649i.j;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c0649i.l;
            if (i != 0) {
            }
            c0638c0 = BDPlugin.y;
            if (c0638c0 != null) {
            }
            context2 = context;
            workManager2 = workManager;
            list = CollectionsKt.emptyList();
            ArrayList arrayList222 = new ArrayList();
            while (r6.hasNext()) {
            }
            Iterator it2222 = arrayList222.iterator();
            workManager3 = workManager2;
            it = it2222;
            iterable2 = iterable;
            list2 = arrayList222;
            context3 = context2;
            list3 = list;
            boolean z222 = true;
            if (it.hasNext()) {
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(3:(1:(1:(18:11|12|13|14|15|16|(1:18)(1:41)|19|(1:21)|22|23|24|25|26|(1:28)|29|30|31)(2:46|47))(13:48|49|50|51|52|53|54|55|(1:72)(2:59|(14:61|16|(0)(0)|19|(0)|22|23|24|25|26|(0)|29|30|31))|62|63|64|65))(4:76|77|78|79)|44|45)(13:91|(1:93)(1:144)|94|(1:98)|99|(1:101)|(1:103)|104|(1:106)|107|(1:109)(1:143)|110|111)|80|81|(3:83|(11:85|52|53|54|55|(1:57)|72|62|63|64|65)|67)(10:87|53|54|55|(0)|72|62|63|64|65)))|145|6|(0)(0)|80|81|(0)(0)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x040f, code lost:
        
            if (r0 == r8) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x037b, code lost:
        
            r3 = r1;
         */
        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:117:0x027b  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0285  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x02fb  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x043f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x044a A[LOOP:0: B:20:0x0448->B:21:0x044a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x048f A[LOOP:1: B:27:0x048d->B:28:0x048f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0444  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0395 A[Catch: all -> 0x03a6, TryCatch #0 {all -> 0x03a6, blocks: (B:55:0x0391, B:57:0x0395, B:59:0x0399, B:62:0x03aa), top: B:54:0x0391 }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0310 A[Catch: all -> 0x037b, TRY_LEAVE, TryCatch #4 {all -> 0x037b, blocks: (B:81:0x0308, B:83:0x0310), top: B:80:0x0308 }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x037f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
        /* JADX WARN: Type inference failed for: r14v23 */
        /* JADX WARN: Type inference failed for: r14v24, types: [int] */
        /* JADX WARN: Type inference failed for: r14v26 */
        /* JADX WARN: Type inference failed for: r14v27, types: [int] */
        /* JADX WARN: Type inference failed for: r14v34 */
        /* JADX WARN: Type inference failed for: r14v35 */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v19 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3, types: [int] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object d(Context context, M0 task, String str, E0 e0, long j, BDPlugin bDPlugin, ContinuationImpl continuationImpl) {
            C0651j c0651j;
            int i;
            boolean z;
            long j2;
            boolean f;
            OneTimeWorkRequest.Builder builder;
            OneTimeWorkRequest.Builder builder2;
            WorkManager workManager;
            Operation enqueue;
            kotlinx.coroutines.scheduling.b bVar;
            C0653k c0653k;
            OneTimeWorkRequest.Builder builder3;
            BDPlugin bDPlugin2;
            Context context2;
            MethodChannel methodChannel;
            Data.Builder builder4;
            Constraints constraints;
            M0 m0;
            E0 e02;
            Data data;
            WorkManager workManager2;
            ConcurrentHashMap<String, String> concurrentHashMap;
            M0 m02;
            SharedPreferences defaultSharedPreferences;
            MethodChannel methodChannel2;
            M0 m03;
            Data.Builder builder5;
            Context context3;
            Data data2;
            E0 e03;
            Constraints constraints2;
            BDPlugin bDPlugin3;
            Constraints constraints3;
            Operation operation;
            C0638c0 c0638c0;
            WorkManager workManager3;
            Context context4;
            ArrayList arrayList;
            ?? readHoldCount;
            ?? r5;
            ReentrantReadWriteLock.WriteLock writeLock;
            ?? r14;
            String str2 = str;
            long j3 = j;
            if (continuationImpl instanceof C0651j) {
                c0651j = (C0651j) continuationImpl;
                int i2 = c0651j.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0651j.t = i2 - Integer.MIN_VALUE;
                    Object obj = c0651j.r;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0651j.t;
                    if (i == 0) {
                        if (i == 1) {
                            z = false;
                            boolean z2 = c0651j.q;
                            long j4 = c0651j.p;
                            Operation operation2 = c0651j.n;
                            WorkManager workManager4 = (WorkManager) c0651j.m;
                            OneTimeWorkRequest.Builder builder6 = (OneTimeWorkRequest.Builder) c0651j.l;
                            constraints = (Constraints) c0651j.k;
                            data = (Data) c0651j.j;
                            builder4 = (Data.Builder) c0651j.i;
                            j2 = 0;
                            MethodChannel methodChannel3 = (MethodChannel) c0651j.f;
                            bDPlugin2 = (BDPlugin) c0651j.e;
                            e02 = (E0) c0651j.d;
                            String str3 = c0651j.c;
                            M0 m04 = c0651j.b;
                            context2 = c0651j.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                f = z2;
                                methodChannel = methodChannel3;
                                m0 = m04;
                                enqueue = operation2;
                                builder3 = builder6;
                                workManager2 = workManager4;
                                j3 = j4;
                                str2 = str3;
                            } catch (Throwable unused) {
                                m02 = m04;
                                operation = operation2;
                            }
                        } else if (i == 2) {
                            boolean z3 = c0651j.q;
                            long j5 = c0651j.p;
                            SharedPreferences sharedPreferences = (SharedPreferences) c0651j.o;
                            Operation operation3 = c0651j.n;
                            workManager2 = (WorkManager) c0651j.m;
                            OneTimeWorkRequest.Builder builder7 = (OneTimeWorkRequest.Builder) c0651j.l;
                            constraints3 = (Constraints) c0651j.k;
                            Data data3 = (Data) c0651j.j;
                            z = false;
                            Data.Builder builder8 = (Data.Builder) c0651j.i;
                            methodChannel2 = (MethodChannel) c0651j.f;
                            BDPlugin bDPlugin4 = (BDPlugin) c0651j.e;
                            E0 e04 = (E0) c0651j.d;
                            String str4 = c0651j.c;
                            M0 m05 = c0651j.b;
                            Context context5 = c0651j.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                context3 = context5;
                                enqueue = operation3;
                                builder3 = builder7;
                                bDPlugin3 = bDPlugin4;
                                f = z3;
                                m03 = m05;
                                builder4 = builder8;
                                data = data3;
                                e02 = e04;
                                str2 = str4;
                                defaultSharedPreferences = sharedPreferences;
                                j3 = j5;
                                E0 e05 = e02;
                                constraints2 = constraints3;
                                bDPlugin2 = bDPlugin3;
                                builder5 = builder4;
                                data2 = data;
                                e03 = e05;
                                SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                                try {
                                    c0638c0 = BDPlugin.y;
                                    if (c0638c0 != null || (arrayList = c0638c0.f) == null) {
                                        workManager3 = workManager2;
                                    } else {
                                        workManager3 = workManager2;
                                        if (arrayList.contains(m03.a)) {
                                            C0657m0 c0657m0 = C0657m0.a;
                                            C0657m0.f(new U(context3, m03, str2, null, null, 56), true);
                                            ReentrantReadWriteLock reentrantReadWriteLock = BDPlugin.v;
                                            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                                            if (reentrantReadWriteLock.getWriteHoldCount() != 0) {
                                            }
                                            while (r5 < readHoldCount) {
                                            }
                                            writeLock = reentrantReadWriteLock.writeLock();
                                            writeLock.lock();
                                            SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(context3);
                                            Intrinsics.checkNotNull(defaultSharedPreferences2);
                                            Map<String, M0> b = q1.b(defaultSharedPreferences2);
                                            b.put(m03.a, m03);
                                            SharedPreferences.Editor edit = defaultSharedPreferences2.edit();
                                            b.a aVar = kotlinx.serialization.json.b.d;
                                            aVar.getClass();
                                            edit.putString("com.bbflight.background_downloader.taskMap.v2", aVar.b(new C1126a0(kotlinx.serialization.internal.S0.a, M0.Companion.serializer()), b));
                                            edit.apply();
                                            Unit unit = Unit.INSTANCE;
                                            while (r14 < readHoldCount) {
                                            }
                                            writeLock.unlock();
                                            return Boxing.boxBoolean(true);
                                        }
                                    }
                                    TaskWorker.Companion companion = TaskWorker.INSTANCE;
                                    W0 w0 = W0.b;
                                    Intrinsics.checkNotNull(sharedPreferences2);
                                    c0651j.a = context3;
                                    c0651j.b = m03;
                                    c0651j.c = str2;
                                    c0651j.d = SpillingKt.nullOutSpilledVariable(e03);
                                    c0651j.e = SpillingKt.nullOutSpilledVariable(bDPlugin2);
                                    c0651j.f = SpillingKt.nullOutSpilledVariable(methodChannel2);
                                    c0651j.i = SpillingKt.nullOutSpilledVariable(builder5);
                                    c0651j.j = SpillingKt.nullOutSpilledVariable(data2);
                                    c0651j.k = SpillingKt.nullOutSpilledVariable(constraints2);
                                    c0651j.l = SpillingKt.nullOutSpilledVariable(builder3);
                                    c0651j.m = SpillingKt.nullOutSpilledVariable(workManager3);
                                    c0651j.n = enqueue;
                                    c0651j.o = SpillingKt.nullOutSpilledVariable(sharedPreferences2);
                                    c0651j.p = j3;
                                    c0651j.q = f;
                                    c0651j.t = 3;
                                    task = m03;
                                    Context context6 = context3;
                                    Object g = TaskWorker.Companion.g(companion, task, w0, sharedPreferences2, null, context6, c0651j, 504);
                                    m02 = task;
                                    context4 = context6;
                                } catch (Throwable unused2) {
                                    m02 = m03;
                                    operation = enqueue;
                                    String str5 = m02.a;
                                    Objects.toString(operation);
                                    return Boxing.boxBoolean(z);
                                }
                            } catch (Throwable unused3) {
                                m02 = m05;
                                operation = operation3;
                            }
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            operation = c0651j.n;
                            str2 = c0651j.c;
                            m02 = c0651j.b;
                            context4 = c0651j.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                z = false;
                                m03 = m02;
                                context3 = context4;
                                C0657m0 c0657m02 = C0657m0.a;
                                C0657m0.f(new U(context3, m03, str2, null, null, 56), true);
                                ReentrantReadWriteLock reentrantReadWriteLock2 = BDPlugin.v;
                                ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock2.readLock();
                                readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() != 0 ? reentrantReadWriteLock2.getReadHoldCount() : z;
                                for (r5 = z; r5 < readHoldCount; r5++) {
                                    readLock2.unlock();
                                }
                                writeLock = reentrantReadWriteLock2.writeLock();
                                writeLock.lock();
                                try {
                                    SharedPreferences defaultSharedPreferences22 = PreferenceManager.getDefaultSharedPreferences(context3);
                                    Intrinsics.checkNotNull(defaultSharedPreferences22);
                                    Map<String, M0> b2 = q1.b(defaultSharedPreferences22);
                                    b2.put(m03.a, m03);
                                    SharedPreferences.Editor edit2 = defaultSharedPreferences22.edit();
                                    b.a aVar2 = kotlinx.serialization.json.b.d;
                                    aVar2.getClass();
                                    edit2.putString("com.bbflight.background_downloader.taskMap.v2", aVar2.b(new C1126a0(kotlinx.serialization.internal.S0.a, M0.Companion.serializer()), b2));
                                    edit2.apply();
                                    Unit unit2 = Unit.INSTANCE;
                                    for (r14 = z; r14 < readHoldCount; r14++) {
                                        readLock2.lock();
                                    }
                                    writeLock.unlock();
                                    return Boxing.boxBoolean(true);
                                } catch (Throwable th) {
                                    for (?? r142 = z; r142 < readHoldCount; r142++) {
                                        readLock2.lock();
                                    }
                                    writeLock.unlock();
                                    throw th;
                                }
                            } catch (Throwable unused4) {
                                z = false;
                            }
                        }
                        String str52 = m02.a;
                        Objects.toString(operation);
                        return Boxing.boxBoolean(z);
                    }
                    z = false;
                    j2 = 0;
                    ResultKt.throwOnFailure(obj);
                    String str6 = task.a;
                    MethodChannel a = a(this, bDPlugin, null, 2);
                    if (a != null) {
                        BDPlugin.k.put(str6, a);
                    } else {
                        Boxing.boxInt(Log.w("BackgroundDownloader", "Could not find backgroundChannel for taskId " + str6));
                    }
                    C0638c0 c0638c02 = BDPlugin.y;
                    if (c0638c02 != null && (concurrentHashMap = c0638c02.e) != null) {
                        concurrentHashMap.put(str6, task.c());
                    }
                    BDPlugin.o.remove(str6);
                    Data.Builder builder9 = new Data.Builder();
                    TaskWorker.INSTANCE.getClass();
                    Intrinsics.checkNotNullParameter(task, "task");
                    b.a aVar3 = kotlinx.serialization.json.b.d;
                    aVar3.getClass();
                    Data.Builder putString = builder9.putString("Task", aVar3.b(M0.Companion.serializer(), task));
                    Intrinsics.checkNotNullExpressionValue(putString, "putString(...)");
                    if (str2 != null) {
                        putString.putString("notificationConfig", str2);
                        BDPlugin.t.put(str6, str2);
                    }
                    if (e0 != null) {
                        putString.putString("tempFilename", e0.b).putLong("startByte", e0.c).putString("eTag", e0.d);
                    }
                    Data build = putString.build();
                    Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                    f = f(task);
                    if (f) {
                        BDPlugin.s.add(str6);
                    }
                    Constraints build2 = new Constraints.Builder().setRequiredNetworkType(f ? NetworkType.UNMETERED : NetworkType.CONNECTED).build();
                    String str7 = task.y;
                    switch (str7.hashCode()) {
                        case -2093100556:
                            if (str7.equals("ParallelDownloadTask")) {
                                builder = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) ParallelDownloadTaskWorker.class);
                                builder.setInputData(build).setConstraints(build2).addTag("BackgroundDownloader").addTag("taskId=" + str6).addTag("group=" + task.n);
                                if (j3 != 0) {
                                    builder.setInitialDelay(j3, TimeUnit.MILLISECONDS);
                                }
                                if (task.t < 5 && Build.VERSION.SDK_INT >= 31) {
                                    builder.setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
                                }
                                workManager = WorkManager.getInstance(context);
                                Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
                                enqueue = workManager.enqueue(builder.build());
                                Intrinsics.checkNotNullExpressionValue(enqueue, "enqueue(...)");
                                try {
                                    kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                                    bVar = kotlinx.coroutines.scheduling.b.a;
                                    builder3 = builder;
                                    c0653k = new C0653k(enqueue, null);
                                    c0651j.a = context;
                                    c0651j.b = task;
                                    c0651j.c = str2;
                                    c0651j.d = SpillingKt.nullOutSpilledVariable(e0);
                                    c0651j.e = SpillingKt.nullOutSpilledVariable(bDPlugin);
                                    c0651j.f = SpillingKt.nullOutSpilledVariable(a);
                                    c0651j.i = SpillingKt.nullOutSpilledVariable(putString);
                                    c0651j.j = SpillingKt.nullOutSpilledVariable(build);
                                    c0651j.k = SpillingKt.nullOutSpilledVariable(build2);
                                    c0651j.l = SpillingKt.nullOutSpilledVariable(builder3);
                                    c0651j.m = SpillingKt.nullOutSpilledVariable(workManager);
                                    c0651j.n = enqueue;
                                    c0651j.p = j3;
                                    c0651j.q = f;
                                    c0651j.t = 1;
                                    if (C1082i.f(c0653k, bVar, c0651j) != coroutine_suspended) {
                                        bDPlugin2 = bDPlugin;
                                        context2 = context;
                                        methodChannel = a;
                                        builder4 = putString;
                                        constraints = build2;
                                        m0 = task;
                                        e02 = e0;
                                        data = build;
                                        workManager2 = workManager;
                                        break;
                                    }
                                    return coroutine_suspended;
                                } catch (Throwable unused5) {
                                    m02 = task;
                                    operation = enqueue;
                                    String str522 = m02.a;
                                    Objects.toString(operation);
                                    return Boxing.boxBoolean(z);
                                }
                            }
                            return Boxing.boxBoolean(false);
                        case -683424481:
                            if (str7.equals("MultiUploadTask")) {
                                builder2 = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) UploadTaskWorker.class);
                                builder = builder2;
                                builder.setInputData(build).setConstraints(build2).addTag("BackgroundDownloader").addTag("taskId=" + str6).addTag("group=" + task.n);
                                if (j3 != 0) {
                                }
                                if (task.t < 5) {
                                    builder.setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
                                    break;
                                }
                                workManager = WorkManager.getInstance(context);
                                Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
                                enqueue = workManager.enqueue(builder.build());
                                Intrinsics.checkNotNullExpressionValue(enqueue, "enqueue(...)");
                                kotlinx.coroutines.scheduling.c cVar2 = C1049c0.a;
                                bVar = kotlinx.coroutines.scheduling.b.a;
                                builder3 = builder;
                                c0653k = new C0653k(enqueue, null);
                                c0651j.a = context;
                                c0651j.b = task;
                                c0651j.c = str2;
                                c0651j.d = SpillingKt.nullOutSpilledVariable(e0);
                                c0651j.e = SpillingKt.nullOutSpilledVariable(bDPlugin);
                                c0651j.f = SpillingKt.nullOutSpilledVariable(a);
                                c0651j.i = SpillingKt.nullOutSpilledVariable(putString);
                                c0651j.j = SpillingKt.nullOutSpilledVariable(build);
                                c0651j.k = SpillingKt.nullOutSpilledVariable(build2);
                                c0651j.l = SpillingKt.nullOutSpilledVariable(builder3);
                                c0651j.m = SpillingKt.nullOutSpilledVariable(workManager);
                                c0651j.n = enqueue;
                                c0651j.p = j3;
                                c0651j.q = f;
                                c0651j.t = 1;
                                if (C1082i.f(c0653k, bVar, c0651j) != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            }
                            return Boxing.boxBoolean(false);
                        case 1273381453:
                            if (str7.equals("DownloadTask")) {
                                builder = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) DownloadTaskWorker.class);
                                builder.setInputData(build).setConstraints(build2).addTag("BackgroundDownloader").addTag("taskId=" + str6).addTag("group=" + task.n);
                                if (j3 != 0) {
                                }
                                if (task.t < 5) {
                                }
                                workManager = WorkManager.getInstance(context);
                                Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
                                enqueue = workManager.enqueue(builder.build());
                                Intrinsics.checkNotNullExpressionValue(enqueue, "enqueue(...)");
                                kotlinx.coroutines.scheduling.c cVar22 = C1049c0.a;
                                bVar = kotlinx.coroutines.scheduling.b.a;
                                builder3 = builder;
                                c0653k = new C0653k(enqueue, null);
                                c0651j.a = context;
                                c0651j.b = task;
                                c0651j.c = str2;
                                c0651j.d = SpillingKt.nullOutSpilledVariable(e0);
                                c0651j.e = SpillingKt.nullOutSpilledVariable(bDPlugin);
                                c0651j.f = SpillingKt.nullOutSpilledVariable(a);
                                c0651j.i = SpillingKt.nullOutSpilledVariable(putString);
                                c0651j.j = SpillingKt.nullOutSpilledVariable(build);
                                c0651j.k = SpillingKt.nullOutSpilledVariable(build2);
                                c0651j.l = SpillingKt.nullOutSpilledVariable(builder3);
                                c0651j.m = SpillingKt.nullOutSpilledVariable(workManager);
                                c0651j.n = enqueue;
                                c0651j.p = j3;
                                c0651j.q = f;
                                c0651j.t = 1;
                                if (C1082i.f(c0653k, bVar, c0651j) != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            }
                            return Boxing.boxBoolean(false);
                        case 1750379334:
                            if (str7.equals("UploadTask")) {
                                builder2 = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) UploadTaskWorker.class);
                                builder = builder2;
                                builder.setInputData(build).setConstraints(build2).addTag("BackgroundDownloader").addTag("taskId=" + str6).addTag("group=" + task.n);
                                if (j3 != 0) {
                                }
                                if (task.t < 5) {
                                }
                                workManager = WorkManager.getInstance(context);
                                Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
                                enqueue = workManager.enqueue(builder.build());
                                Intrinsics.checkNotNullExpressionValue(enqueue, "enqueue(...)");
                                kotlinx.coroutines.scheduling.c cVar222 = C1049c0.a;
                                bVar = kotlinx.coroutines.scheduling.b.a;
                                builder3 = builder;
                                c0653k = new C0653k(enqueue, null);
                                c0651j.a = context;
                                c0651j.b = task;
                                c0651j.c = str2;
                                c0651j.d = SpillingKt.nullOutSpilledVariable(e0);
                                c0651j.e = SpillingKt.nullOutSpilledVariable(bDPlugin);
                                c0651j.f = SpillingKt.nullOutSpilledVariable(a);
                                c0651j.i = SpillingKt.nullOutSpilledVariable(putString);
                                c0651j.j = SpillingKt.nullOutSpilledVariable(build);
                                c0651j.k = SpillingKt.nullOutSpilledVariable(build2);
                                c0651j.l = SpillingKt.nullOutSpilledVariable(builder3);
                                c0651j.m = SpillingKt.nullOutSpilledVariable(workManager);
                                c0651j.n = enqueue;
                                c0651j.p = j3;
                                c0651j.q = f;
                                c0651j.t = 1;
                                if (C1082i.f(c0653k, bVar, c0651j) != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            }
                            return Boxing.boxBoolean(false);
                        case 1853692015:
                            if (str7.equals("DataTask")) {
                                builder = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) DataTaskWorker.class);
                                builder.setInputData(build).setConstraints(build2).addTag("BackgroundDownloader").addTag("taskId=" + str6).addTag("group=" + task.n);
                                if (j3 != 0) {
                                }
                                if (task.t < 5) {
                                }
                                workManager = WorkManager.getInstance(context);
                                Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
                                enqueue = workManager.enqueue(builder.build());
                                Intrinsics.checkNotNullExpressionValue(enqueue, "enqueue(...)");
                                kotlinx.coroutines.scheduling.c cVar2222 = C1049c0.a;
                                bVar = kotlinx.coroutines.scheduling.b.a;
                                builder3 = builder;
                                c0653k = new C0653k(enqueue, null);
                                c0651j.a = context;
                                c0651j.b = task;
                                c0651j.c = str2;
                                c0651j.d = SpillingKt.nullOutSpilledVariable(e0);
                                c0651j.e = SpillingKt.nullOutSpilledVariable(bDPlugin);
                                c0651j.f = SpillingKt.nullOutSpilledVariable(a);
                                c0651j.i = SpillingKt.nullOutSpilledVariable(putString);
                                c0651j.j = SpillingKt.nullOutSpilledVariable(build);
                                c0651j.k = SpillingKt.nullOutSpilledVariable(build2);
                                c0651j.l = SpillingKt.nullOutSpilledVariable(builder3);
                                c0651j.m = SpillingKt.nullOutSpilledVariable(workManager);
                                c0651j.n = enqueue;
                                c0651j.p = j3;
                                c0651j.q = f;
                                c0651j.t = 1;
                                if (C1082i.f(c0653k, bVar, c0651j) != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            }
                            return Boxing.boxBoolean(false);
                        default:
                            return Boxing.boxBoolean(false);
                    }
                    defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
                    if (j3 == j2) {
                        BDPlugin bDPlugin5 = bDPlugin2;
                        Constraints constraints4 = constraints;
                        long min = Long.min(100L, j3);
                        c0651j.a = context2;
                        c0651j.b = m0;
                        c0651j.c = str2;
                        Context context7 = context2;
                        c0651j.d = SpillingKt.nullOutSpilledVariable(e02);
                        c0651j.e = SpillingKt.nullOutSpilledVariable(bDPlugin5);
                        c0651j.f = SpillingKt.nullOutSpilledVariable(methodChannel);
                        c0651j.i = SpillingKt.nullOutSpilledVariable(builder4);
                        c0651j.j = SpillingKt.nullOutSpilledVariable(data);
                        c0651j.k = SpillingKt.nullOutSpilledVariable(constraints4);
                        c0651j.l = SpillingKt.nullOutSpilledVariable(builder3);
                        c0651j.m = SpillingKt.nullOutSpilledVariable(workManager2);
                        c0651j.n = enqueue;
                        c0651j.o = defaultSharedPreferences;
                        c0651j.p = j3;
                        c0651j.q = f;
                        c0651j.t = 2;
                        if (kotlinx.coroutines.W.b(min, c0651j) != coroutine_suspended) {
                            methodChannel2 = methodChannel;
                            bDPlugin3 = bDPlugin5;
                            constraints3 = constraints4;
                            m03 = m0;
                            context3 = context7;
                            E0 e052 = e02;
                            constraints2 = constraints3;
                            bDPlugin2 = bDPlugin3;
                            builder5 = builder4;
                            data2 = data;
                            e03 = e052;
                            SharedPreferences sharedPreferences22 = defaultSharedPreferences;
                            c0638c0 = BDPlugin.y;
                            if (c0638c0 != null) {
                            }
                            workManager3 = workManager2;
                            TaskWorker.Companion companion2 = TaskWorker.INSTANCE;
                            W0 w02 = W0.b;
                            Intrinsics.checkNotNull(sharedPreferences22);
                            c0651j.a = context3;
                            c0651j.b = m03;
                            c0651j.c = str2;
                            c0651j.d = SpillingKt.nullOutSpilledVariable(e03);
                            c0651j.e = SpillingKt.nullOutSpilledVariable(bDPlugin2);
                            c0651j.f = SpillingKt.nullOutSpilledVariable(methodChannel2);
                            c0651j.i = SpillingKt.nullOutSpilledVariable(builder5);
                            c0651j.j = SpillingKt.nullOutSpilledVariable(data2);
                            c0651j.k = SpillingKt.nullOutSpilledVariable(constraints2);
                            c0651j.l = SpillingKt.nullOutSpilledVariable(builder3);
                            c0651j.m = SpillingKt.nullOutSpilledVariable(workManager3);
                            c0651j.n = enqueue;
                            c0651j.o = SpillingKt.nullOutSpilledVariable(sharedPreferences22);
                            c0651j.p = j3;
                            c0651j.q = f;
                            c0651j.t = 3;
                            task = m03;
                            Context context62 = context3;
                            Object g2 = TaskWorker.Companion.g(companion2, task, w02, sharedPreferences22, null, context62, c0651j, 504);
                            m02 = task;
                            context4 = context62;
                        }
                        return coroutine_suspended;
                    }
                    Context context8 = context2;
                    Constraints constraints5 = constraints;
                    methodChannel2 = methodChannel;
                    m03 = m0;
                    builder5 = builder4;
                    context3 = context8;
                    data2 = data;
                    e03 = e02;
                    constraints2 = constraints5;
                    SharedPreferences sharedPreferences222 = defaultSharedPreferences;
                    c0638c0 = BDPlugin.y;
                    if (c0638c0 != null) {
                    }
                    workManager3 = workManager2;
                    TaskWorker.Companion companion22 = TaskWorker.INSTANCE;
                    W0 w022 = W0.b;
                    Intrinsics.checkNotNull(sharedPreferences222);
                    c0651j.a = context3;
                    c0651j.b = m03;
                    c0651j.c = str2;
                    c0651j.d = SpillingKt.nullOutSpilledVariable(e03);
                    c0651j.e = SpillingKt.nullOutSpilledVariable(bDPlugin2);
                    c0651j.f = SpillingKt.nullOutSpilledVariable(methodChannel2);
                    c0651j.i = SpillingKt.nullOutSpilledVariable(builder5);
                    c0651j.j = SpillingKt.nullOutSpilledVariable(data2);
                    c0651j.k = SpillingKt.nullOutSpilledVariable(constraints2);
                    c0651j.l = SpillingKt.nullOutSpilledVariable(builder3);
                    c0651j.m = SpillingKt.nullOutSpilledVariable(workManager3);
                    c0651j.n = enqueue;
                    c0651j.o = SpillingKt.nullOutSpilledVariable(sharedPreferences222);
                    c0651j.p = j3;
                    c0651j.q = f;
                    c0651j.t = 3;
                    task = m03;
                    Context context622 = context3;
                    Object g22 = TaskWorker.Companion.g(companion22, task, w022, sharedPreferences222, null, context622, c0651j, 504);
                    m02 = task;
                    context4 = context622;
                }
            }
            c0651j = new C0651j(this, continuationImpl);
            Object obj2 = c0651j.r;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c0651j.t;
            if (i == 0) {
            }
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
            if (j3 == j2) {
            }
        }
    }

    @DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin$onMethodCall$1", f = "BDPlugin.kt", i = {}, l = {395, 396, 397, 398, 400, 403, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, 439}, m = "invokeSuspend", n = {}, nl = {396, 397, 398, 399, 401, WalletConstants.ERROR_CODE_INVALID_PARAMETERS, 407, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION, 441}, s = {}, v = 2)
    /* renamed from: com.bbflight.background_downloader.l$b */
    public static final class b extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MethodCall b;
        public final /* synthetic */ BDPlugin c;
        public final /* synthetic */ MethodChannel.Result d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MethodCall methodCall, BDPlugin bDPlugin, MethodChannel.Result result, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = methodCall;
            this.c = bDPlugin;
            this.d = result;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
            return ((b) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x027a, code lost:
        
            if (com.bbflight.background_downloader.BDPlugin.d(r5, r2, r4, r19) == r0) goto L278;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x0317, code lost:
        
            if (com.bbflight.background_downloader.BDPlugin.g(r5, r2, r4, r19) == r0) goto L278;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x034d, code lost:
        
            if (com.bbflight.background_downloader.BDPlugin.f(r5, r2, r4, r19) == r0) goto L278;
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x038c, code lost:
        
            if (com.bbflight.background_downloader.BDPlugin.b(r5, r2, r4, r19) == r0) goto L278;
         */
        /* JADX WARN: Code restructure failed: missing block: B:183:0x04db, code lost:
        
            if (com.bbflight.background_downloader.BDPlugin.h(r5, r2, r4, r19) == r0) goto L278;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
        
            if (com.bbflight.background_downloader.BDPlugin.a(r5, r2, r4, r19) == r0) goto L278;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0649, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:240:0x0647, code lost:
        
            if (com.bbflight.background_downloader.BDPlugin.c(r5, r2, r4, r19) == r0) goto L278;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x011a, code lost:
        
            if (com.bbflight.background_downloader.BDPlugin.j(r5, r2, r4, r19) == r0) goto L278;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x024f, code lost:
        
            if (com.bbflight.background_downloader.BDPlugin.e(r5, r2, r4, r19) == r0) goto L278;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0265, code lost:
        
            if (com.bbflight.background_downloader.BDPlugin.i(r5, r2, r4, r19) == r0) goto L278;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Context context;
            M0 m0;
            boolean z2;
            String str;
            Activity activity;
            boolean z3;
            Activity activity2;
            Context context2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.a) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    MethodCall methodCall = this.b;
                    String str2 = methodCall.method;
                    MethodChannel.Result result = this.d;
                    if (str2 != null) {
                        int hashCode = str2.hashCode();
                        BDPlugin plugin = this.c;
                        switch (hashCode) {
                            case -1662725512:
                                if (str2.equals("shouldShowPermissionRationale")) {
                                    Companion companion = BDPlugin.INSTANCE;
                                    EnumEntries enumEntries = EnumC0680y0.d;
                                    Object obj2 = methodCall.arguments;
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    EnumC0680y0 permissionType = (EnumC0680y0) enumEntries.get(((Integer) obj2).intValue());
                                    C0682z0.Companion.getClass();
                                    Intrinsics.checkNotNullParameter(plugin, "plugin");
                                    Intrinsics.checkNotNullParameter(permissionType, "permissionType");
                                    Activity activity3 = plugin.f;
                                    if (activity3 != null) {
                                        int i = C0682z0.a.C0051a.$EnumSwitchMapping$0[permissionType.ordinal()];
                                        if (i != 1) {
                                            if (i == 2) {
                                                z = ActivityCompat.shouldShowRequestPermissionRationale(activity3, "android.permission.WRITE_EXTERNAL_STORAGE");
                                                result.success(Boolean.valueOf(z));
                                                break;
                                            }
                                        } else if (Build.VERSION.SDK_INT >= 33) {
                                            z = ActivityCompat.shouldShowRequestPermissionRationale(activity3, "android.permission.POST_NOTIFICATIONS");
                                            result.success(Boolean.valueOf(z));
                                        }
                                    }
                                    z = false;
                                    result.success(Boolean.valueOf(z));
                                }
                                break;
                            case -1594257912:
                                if (str2.equals("enqueue")) {
                                    this.a = 1;
                                    break;
                                }
                                break;
                            case -1402964472:
                                if (str2.equals("configProxyAddress")) {
                                    Context context3 = plugin.c;
                                    if (context3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                                        context3 = null;
                                    }
                                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context3).edit();
                                    String str3 = (String) methodCall.arguments;
                                    if (str3 != null) {
                                        edit.putString("com.bbflight.background_downloader.config.proxyAddress", str3);
                                    } else {
                                        edit.remove("com.bbflight.background_downloader.config.proxyAddress");
                                    }
                                    edit.apply();
                                    result.success(null);
                                    break;
                                }
                                break;
                            case -1058370388:
                                if (str2.equals("getRequireWiFiSetting")) {
                                    Context context4 = plugin.c;
                                    if (context4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                                        context = null;
                                    } else {
                                        context = context4;
                                    }
                                    result.success(Integer.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getInt("com.bbflight.background_downloader.requireWifi", 0)));
                                    break;
                                }
                                break;
                            case -805652413:
                                if (str2.equals("configCheckAvailableSpace")) {
                                    Companion companion2 = BDPlugin.INSTANCE;
                                    plugin.n((Integer) methodCall.arguments, "com.bbflight.background_downloader.config.checkAvailableSpace");
                                    result.success(null);
                                    break;
                                }
                                break;
                            case -505062682:
                                if (str2.equals("openFile")) {
                                    Companion companion3 = BDPlugin.INSTANCE;
                                    Object obj3 = methodCall.arguments;
                                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.List<*>");
                                    List list = (List) obj3;
                                    String str4 = (String) list.get(0);
                                    if (str4 != null) {
                                        b.a aVar = kotlinx.serialization.json.b.d;
                                        aVar.getClass();
                                        m0 = (M0) aVar.a(M0.Companion.serializer(), str4);
                                    } else {
                                        m0 = null;
                                    }
                                    String str5 = (String) list.get(1);
                                    if (str5 == null) {
                                        Intrinsics.checkNotNull(m0);
                                        Context context5 = plugin.c;
                                        if (context5 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                                            context5 = null;
                                        }
                                        M0.b bVar = M0.Companion;
                                        str5 = m0.b(context5, null);
                                    }
                                    String str6 = (String) list.get(2);
                                    if (str6 == null) {
                                        str6 = G0.c(str5);
                                    }
                                    Activity activity4 = plugin.f;
                                    if (activity4 != null) {
                                        Intrinsics.checkNotNull(activity4);
                                        z2 = C0670t0.a(activity4, str5, str6);
                                    } else {
                                        z2 = false;
                                    }
                                    result.success(Boolean.valueOf(z2));
                                    break;
                                }
                                break;
                            case -376295340:
                                if (str2.equals("updateNotification")) {
                                    Companion companion4 = BDPlugin.INSTANCE;
                                    Object obj4 = methodCall.arguments;
                                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.collections.List<*>");
                                    List list2 = (List) obj4;
                                    Object obj5 = list2.get(0);
                                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
                                    String str7 = (String) obj5;
                                    Object obj6 = list2.get(1);
                                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.String");
                                    String str8 = (String) obj6;
                                    Integer num = (Integer) list2.get(2);
                                    C0657m0 c0657m0 = C0657m0.a;
                                    Context context6 = plugin.c;
                                    if (context6 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                                        context6 = null;
                                    }
                                    C0657m0.e(context6, str7, str8, num);
                                    result.success(null);
                                    break;
                                }
                                break;
                            case -226224403:
                                if (str2.equals("configProxyPort")) {
                                    Companion companion5 = BDPlugin.INSTANCE;
                                    plugin.n((Integer) methodCall.arguments, "com.bbflight.background_downloader.config.proxyPort");
                                    result.success(null);
                                    break;
                                }
                                break;
                            case -66148634:
                                if (str2.equals("getTaskTimeout")) {
                                    Companion companion6 = BDPlugin.INSTANCE;
                                    result.success(540000L);
                                    break;
                                }
                                break;
                            case -34471976:
                                if (str2.equals("testSuggestedFilename")) {
                                    this.a = 10;
                                    break;
                                }
                                break;
                            case 13282892:
                                if (str2.equals("pathInSharedStorage")) {
                                    Companion companion7 = BDPlugin.INSTANCE;
                                    Object obj7 = methodCall.arguments;
                                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.collections.List<*>");
                                    List list3 = (List) obj7;
                                    Object obj8 = list3.get(0);
                                    Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.String");
                                    String filePath = (String) obj8;
                                    EnumEntries enumEntries2 = F0.b;
                                    Object obj9 = list3.get(1);
                                    Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Int");
                                    F0 destination = (F0) enumEntries2.get(((Integer) obj9).intValue());
                                    Object obj10 = list3.get(2);
                                    Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.String");
                                    String directory = (String) obj10;
                                    Object obj11 = list3.get(3);
                                    Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                                    boolean booleanValue = ((Boolean) obj11).booleanValue();
                                    Context context7 = plugin.c;
                                    if (context7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                                        context7 = null;
                                    }
                                    Regex regex = G0.a;
                                    Intrinsics.checkNotNullParameter(context7, "context");
                                    Intrinsics.checkNotNullParameter(filePath, "filePath");
                                    Intrinsics.checkNotNullParameter(destination, "destination");
                                    Intrinsics.checkNotNullParameter(directory, "directory");
                                    String name = new File(filePath).getName();
                                    if (Build.VERSION.SDK_INT < 29) {
                                        str = new File(new File(Environment.getExternalStoragePublicDirectory(G0.a(destination)), directory), name).getPath();
                                    } else {
                                        Cursor query = context7.getContentResolver().query(G0.b(destination), new String[]{"_data", "_id"}, "_display_name = ?", new String[]{name}, null);
                                        if (query != null) {
                                            try {
                                                if (query.moveToFirst()) {
                                                    String uri = booleanValue ? Uri.withAppendedPath(G0.b(destination), String.valueOf(query.getLong(1))).toString() : query.getString(0);
                                                    CloseableKt.closeFinally(query, null);
                                                    str = uri;
                                                } else {
                                                    Unit unit = Unit.INSTANCE;
                                                    CloseableKt.closeFinally(query, null);
                                                }
                                            } finally {
                                            }
                                        }
                                        str = null;
                                    }
                                    result.success(str);
                                    break;
                                }
                                break;
                            case 29017188:
                                if (str2.equals("killTaskWithId")) {
                                    Companion companion8 = BDPlugin.INSTANCE;
                                    Object obj12 = methodCall.arguments;
                                    Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.String");
                                    String str9 = (String) obj12;
                                    Context context8 = plugin.c;
                                    if (context8 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                                        context8 = null;
                                    }
                                    WorkManager workManager = WorkManager.getInstance(context8);
                                    Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
                                    Operation cancelAllWorkByTag = workManager.cancelAllWorkByTag("taskId=" + str9);
                                    Intrinsics.checkNotNullExpressionValue(cancelAllWorkByTag, "cancelAllWorkByTag(...)");
                                    try {
                                        cancelAllWorkByTag.getResult().get();
                                    } catch (Throwable unused) {
                                        Objects.toString(cancelAllWorkByTag);
                                    }
                                    result.success(null);
                                    break;
                                }
                                break;
                            case 29731902:
                                if (str2.equals("cancelTasksWithIds")) {
                                    this.a = 4;
                                    break;
                                }
                                break;
                            case 106440182:
                                if (str2.equals("pause")) {
                                    Companion companion9 = BDPlugin.INSTANCE;
                                    Object obj13 = methodCall.arguments;
                                    Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.String");
                                    String taskId = (String) obj13;
                                    BDPlugin.INSTANCE.getClass();
                                    Intrinsics.checkNotNullParameter(taskId, "taskId");
                                    BDPlugin.p.add(taskId);
                                    result.success(Boolean.TRUE);
                                    break;
                                }
                                break;
                            case 108404047:
                                if (str2.equals("reset")) {
                                    this.a = 2;
                                    break;
                                }
                                break;
                            case 116439266:
                                if (str2.equals("configForegroundFileSize")) {
                                    Companion companion10 = BDPlugin.INSTANCE;
                                    Object obj14 = methodCall.arguments;
                                    Intrinsics.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Int");
                                    Integer num2 = (Integer) obj14;
                                    num2.getClass();
                                    plugin.n(num2, "com.bbflight.background_downloader.config.foregroundFileSize");
                                    result.success(null);
                                    break;
                                }
                                break;
                            case 157683007:
                                if (str2.equals("taskForId")) {
                                    this.a = 5;
                                    break;
                                }
                                break;
                            case 239286196:
                                if (str2.equals("configRequestTimeout")) {
                                    Companion companion11 = BDPlugin.INSTANCE;
                                    plugin.n((Integer) methodCall.arguments, "com.bbflight.background_downloader.config.requestTimeout");
                                    result.success(null);
                                    break;
                                }
                                break;
                            case 275380336:
                                if (str2.equals("configHoldingQueue")) {
                                    Companion companion12 = BDPlugin.INSTANCE;
                                    Object obj15 = methodCall.arguments;
                                    Intrinsics.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.collections.List<*>");
                                    List list4 = (List) obj15;
                                    C0638c0 c0638c0 = BDPlugin.y;
                                    if (c0638c0 == null) {
                                        Context context9 = plugin.c;
                                        if (context9 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                                            context9 = null;
                                        }
                                        WorkManager workManager2 = WorkManager.getInstance(context9);
                                        Intrinsics.checkNotNullExpressionValue(workManager2, "getInstance(...)");
                                        c0638c0 = new C0638c0(workManager2);
                                    }
                                    BDPlugin.y = c0638c0;
                                    Object obj16 = list4.get(0);
                                    Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Int");
                                    c0638c0.b = ((Integer) obj16).intValue();
                                    C0638c0 c0638c02 = BDPlugin.y;
                                    if (c0638c02 != null) {
                                        Object obj17 = list4.get(1);
                                        Intrinsics.checkNotNull(obj17, "null cannot be cast to non-null type kotlin.Int");
                                        c0638c02.c = ((Integer) obj17).intValue();
                                    }
                                    C0638c0 c0638c03 = BDPlugin.y;
                                    if (c0638c03 != null) {
                                        Object obj18 = list4.get(2);
                                        Intrinsics.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Int");
                                        c0638c03.d = ((Integer) obj18).intValue();
                                    }
                                    result.success(null);
                                    break;
                                }
                                break;
                            case 313484170:
                                if (str2.equals("moveToSharedStorage")) {
                                    this.a = 6;
                                    break;
                                }
                                break;
                            case 327974179:
                                if (str2.equals("chunkProgressUpdate")) {
                                    this.a = 9;
                                    break;
                                }
                                break;
                            case 362735162:
                                if (str2.equals("requireWiFi")) {
                                    this.a = 7;
                                    break;
                                }
                                break;
                            case 433744927:
                                if (str2.equals("configBypassTLSCertificateValidation")) {
                                    Companion companion13 = BDPlugin.INSTANCE;
                                    try {
                                        TrustManager[] trustManagerArr = {new C0636b0()};
                                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                                        sSLContext.init(null, trustManagerArr, new SecureRandom());
                                        HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
                                        result.success(null);
                                        break;
                                    } catch (Exception e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                break;
                            case 482193328:
                                if (str2.equals("configUseCacheDir")) {
                                    Companion companion14 = BDPlugin.INSTANCE;
                                    plugin.n((Integer) methodCall.arguments, "com.bbflight.background_downloader.config.useCacheDir");
                                    result.success(null);
                                    break;
                                }
                                break;
                            case 517952332:
                                if (str2.equals("popProgressUpdates")) {
                                    Companion companion15 = BDPlugin.INSTANCE;
                                    plugin.m("com.bbflight.background_downloader.progressUpdateMap.v2", result);
                                    break;
                                }
                                break;
                            case 545829515:
                                if (str2.equals("configUseExternalStorage")) {
                                    Companion companion16 = BDPlugin.INSTANCE;
                                    plugin.n((Integer) methodCall.arguments, "com.bbflight.background_downloader.config.useExternalStorage");
                                    result.success(null);
                                    break;
                                }
                                break;
                            case 647151015:
                                if (str2.equals("popStatusUpdates")) {
                                    Companion companion17 = BDPlugin.INSTANCE;
                                    plugin.m("com.bbflight.background_downloader.statusUpdateMap.v2", result);
                                    break;
                                }
                                break;
                            case 687729320:
                                if (str2.equals("popResumeData")) {
                                    Companion companion18 = BDPlugin.INSTANCE;
                                    plugin.m("com.bbflight.background_downloader.resumeDataMap.v2", result);
                                    break;
                                }
                                break;
                            case 746581438:
                                if (str2.equals("requestPermission")) {
                                    Companion companion19 = BDPlugin.INSTANCE;
                                    EnumEntries enumEntries3 = EnumC0680y0.d;
                                    Object obj19 = methodCall.arguments;
                                    Intrinsics.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.Int");
                                    EnumC0680y0 permissionType2 = (EnumC0680y0) enumEntries3.get(((Integer) obj19).intValue());
                                    C0682z0.Companion.getClass();
                                    Intrinsics.checkNotNullParameter(plugin, "plugin");
                                    Intrinsics.checkNotNullParameter(permissionType2, "permissionType");
                                    int ordinal = permissionType2.ordinal() + 373900;
                                    int i2 = C0682z0.a.C0051a.$EnumSwitchMapping$0[permissionType2.ordinal()];
                                    if (i2 != 1) {
                                        if (i2 == 2 && Build.VERSION.SDK_INT < 29 && (activity2 = plugin.f) != null) {
                                            Intrinsics.checkNotNull(activity2);
                                            ActivityCompat.requestPermissions(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, ordinal);
                                            z3 = true;
                                        }
                                        z3 = false;
                                    } else {
                                        if (Build.VERSION.SDK_INT >= 33 && (activity = plugin.f) != null) {
                                            Intrinsics.checkNotNull(activity);
                                            ActivityCompat.requestPermissions(activity, new String[]{"android.permission.POST_NOTIFICATIONS"}, ordinal);
                                            z3 = true;
                                        }
                                        z3 = false;
                                    }
                                    result.success(Boolean.valueOf(z3));
                                    break;
                                }
                                break;
                            case 773190248:
                                if (str2.equals("chunkStatusUpdate")) {
                                    this.a = 8;
                                    break;
                                }
                                break;
                            case 928688801:
                                if (str2.equals("permissionStatus")) {
                                    Companion companion20 = BDPlugin.INSTANCE;
                                    EnumEntries enumEntries4 = EnumC0680y0.d;
                                    Object obj20 = methodCall.arguments;
                                    Intrinsics.checkNotNull(obj20, "null cannot be cast to non-null type kotlin.Int");
                                    EnumC0680y0 enumC0680y0 = (EnumC0680y0) enumEntries4.get(((Integer) obj20).intValue());
                                    C0682z0.a aVar2 = C0682z0.Companion;
                                    Context context10 = plugin.c;
                                    if (context10 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                                        context2 = null;
                                    } else {
                                        context2 = context10;
                                    }
                                    aVar2.getClass();
                                    result.success(Integer.valueOf(C0682z0.a.a(context2, enumC0680y0).ordinal()));
                                    break;
                                }
                                break;
                            case 938536143:
                                if (str2.equals("registerCallbackDispatcher")) {
                                    Context context11 = plugin.c;
                                    if (context11 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                                        context11 = null;
                                    }
                                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(context11).edit();
                                    Long l = (Long) methodCall.arguments;
                                    if (l != null) {
                                        edit2.putLong("com.bbflight.background_downloader.callbackDispatcherRawHandle", l.longValue());
                                    } else {
                                        edit2.remove("com.bbflight.background_downloader.config.proxyAddress");
                                    }
                                    edit2.apply();
                                    result.success(null);
                                    break;
                                }
                                break;
                            case 1787555437:
                                if (str2.equals("allTasks")) {
                                    this.a = 3;
                                    break;
                                }
                                break;
                            case 1848800485:
                                if (str2.equals("platformVersion")) {
                                    Companion companion21 = BDPlugin.INSTANCE;
                                    result.success(String.valueOf(Build.VERSION.SDK_INT));
                                    break;
                                }
                                break;
                            case 1912334381:
                                if (str2.equals("forceFailPostOnBackgroundChannel")) {
                                    Companion companion22 = BDPlugin.INSTANCE;
                                    Object obj21 = methodCall.arguments;
                                    Intrinsics.checkNotNull(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                                    BDPlugin.u = ((Boolean) obj21).booleanValue();
                                    result.success(null);
                                    break;
                                }
                                break;
                        }
                    }
                    result.notImplemented();
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    ResultKt.throwOnFailure(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x007d, code lost:
    
        if (r7.d(r0) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(BDPlugin bDPlugin, MethodCall methodCall, MethodChannel.Result result, ContinuationImpl continuationImpl) {
        C0658n c0658n;
        Object coroutine_suspended;
        int i2;
        ArrayList arrayList;
        MethodChannel.Result result2;
        String str;
        C0638c0 c0638c0;
        Context context;
        Object f;
        MethodChannel.Result result3;
        List list;
        int collectionSizeOrDefault;
        ArrayList arrayList2;
        Context context2;
        ReentrantReadWriteLock.ReadLock readLock;
        Iterator it;
        C0638c0 c0638c02;
        kotlinx.coroutines.sync.c cVar;
        boolean contains$default;
        if (continuationImpl instanceof C0658n) {
            c0658n = (C0658n) continuationImpl;
            int i3 = c0658n.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0658n.j = i3 - Integer.MIN_VALUE;
                Object obj = c0658n.f;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0658n.j;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String str2 = (String) methodCall.arguments;
                    arrayList = new ArrayList();
                    C0638c0 c0638c03 = y;
                    if (c0638c03 != null && (r7 = c0638c03.o) != null) {
                        c0658n.a = SpillingKt.nullOutSpilledVariable(methodCall);
                        c0658n.b = result;
                        c0658n.c = str2;
                        c0658n.d = arrayList;
                        c0658n.j = 1;
                    }
                    result2 = result;
                    str = str2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list = c0658n.d;
                        str = c0658n.c;
                        result3 = c0658n.b;
                        ResultKt.throwOnFailure(obj);
                        Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                        arrayList2 = new ArrayList();
                        for (Object obj2 : (Iterable) obj) {
                            WorkInfo workInfo = (WorkInfo) obj2;
                            if (!workInfo.getState().isFinished() && (str == null || workInfo.getTags().contains("group=".concat(str)))) {
                                arrayList2.add(obj2);
                            }
                        }
                        context2 = bDPlugin.c;
                        if (context2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                            context2 = null;
                        }
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
                        readLock = v.readLock();
                        readLock.lock();
                        try {
                            Intrinsics.checkNotNull(defaultSharedPreferences);
                            Map<String, M0> b2 = q1.b(defaultSharedPreferences);
                            Unit unit = Unit.INSTANCE;
                            readLock.unlock();
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                Set<String> tags = ((WorkInfo) it.next()).getTags();
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj3 : tags) {
                                    contains$default = StringsKt__StringsKt.contains$default((String) obj3, "taskId=", false, 2, (Object) null);
                                    if (contains$default) {
                                        arrayList3.add(obj3);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    String substring = ((String) CollectionsKt.first((List) arrayList3)).substring(7);
                                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                    M0 m0 = b2.get(substring);
                                    if (m0 != null) {
                                        b.a aVar = kotlinx.serialization.json.b.d;
                                        aVar.getClass();
                                        list.add(aVar.b(M0.Companion.serializer(), m0));
                                    }
                                }
                            }
                            c0638c02 = y;
                            if (c0638c02 != null && (cVar = c0638c02.o) != null) {
                                cVar.c(null);
                            }
                            list.size();
                            result3.success(list);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            readLock.unlock();
                            throw th;
                        }
                    }
                    ?? r12 = c0658n.d;
                    str = c0658n.c;
                    MethodChannel.Result result4 = c0658n.b;
                    MethodCall methodCall2 = (MethodCall) c0658n.a;
                    ResultKt.throwOnFailure(obj);
                    result2 = result4;
                    arrayList = r12;
                    methodCall = methodCall2;
                }
                c0638c0 = y;
                if (c0638c0 != null) {
                    PriorityBlockingQueue<U> priorityBlockingQueue = c0638c0.j;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<U> it2 = priorityBlockingQueue.iterator();
                    while (it2.hasNext()) {
                        U next = it2.next();
                        U u2 = next;
                        if (str == null || Intrinsics.areEqual(u2.b.n, str)) {
                            arrayList4.add(next);
                        }
                    }
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
                    ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault);
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(((U) it3.next()).b);
                    }
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        M0 m02 = (M0) it4.next();
                        b.a aVar2 = kotlinx.serialization.json.b.d;
                        aVar2.getClass();
                        arrayList.add(aVar2.b(M0.Companion.serializer(), m02));
                    }
                }
                context = bDPlugin.c;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                    context = null;
                }
                WorkManager workManager = WorkManager.getInstance(context);
                Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
                kotlinx.coroutines.scheduling.c cVar2 = C1049c0.a;
                kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.scheduling.b.a;
                C0660o c0660o = new C0660o(workManager, null);
                c0658n.a = SpillingKt.nullOutSpilledVariable(methodCall);
                c0658n.b = result2;
                c0658n.c = str;
                c0658n.d = arrayList;
                c0658n.e = SpillingKt.nullOutSpilledVariable(workManager);
                c0658n.j = 2;
                f = C1082i.f(c0660o, bVar, c0658n);
                if (f != coroutine_suspended) {
                    result3 = result2;
                    obj = f;
                    list = arrayList;
                    Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                    arrayList2 = new ArrayList();
                    while (r14.hasNext()) {
                    }
                    context2 = bDPlugin.c;
                    if (context2 == null) {
                    }
                    SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(context2);
                    readLock = v.readLock();
                    readLock.lock();
                    Intrinsics.checkNotNull(defaultSharedPreferences2);
                    Map<String, M0> b22 = q1.b(defaultSharedPreferences2);
                    Unit unit2 = Unit.INSTANCE;
                    readLock.unlock();
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                    }
                    c0638c02 = y;
                    if (c0638c02 != null) {
                        cVar.c(null);
                    }
                    list.size();
                    result3.success(list);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        c0658n = new C0658n(bDPlugin, continuationImpl);
        Object obj4 = c0658n.f;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0658n.j;
        if (i2 != 0) {
        }
        c0638c0 = y;
        if (c0638c0 != null) {
        }
        context = bDPlugin.c;
        if (context == null) {
        }
        WorkManager workManager2 = WorkManager.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(workManager2, "getInstance(...)");
        kotlinx.coroutines.scheduling.c cVar22 = C1049c0.a;
        kotlinx.coroutines.scheduling.b bVar2 = kotlinx.coroutines.scheduling.b.a;
        C0660o c0660o2 = new C0660o(workManager2, null);
        c0658n.a = SpillingKt.nullOutSpilledVariable(methodCall);
        c0658n.b = result2;
        c0658n.c = str;
        c0658n.d = arrayList;
        c0658n.e = SpillingKt.nullOutSpilledVariable(workManager2);
        c0658n.j = 2;
        f = C1082i.f(c0660o2, bVar2, c0658n);
        if (f != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(BDPlugin bDPlugin, MethodCall methodCall, MethodChannel.Result result, ContinuationImpl continuationImpl) {
        C0662p c0662p;
        int i2;
        if (continuationImpl instanceof C0662p) {
            c0662p = (C0662p) continuationImpl;
            int i3 = c0662p.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0662p.i = i3 - Integer.MIN_VALUE;
                Object obj = c0662p.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0662p.i;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = methodCall.arguments;
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    List list = (List) obj2;
                    Companion companion = INSTANCE;
                    Context context = bDPlugin.c;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                        context = null;
                    }
                    c0662p.a = SpillingKt.nullOutSpilledVariable(methodCall);
                    c0662p.b = SpillingKt.nullOutSpilledVariable(result);
                    c0662p.c = SpillingKt.nullOutSpilledVariable(list);
                    c0662p.d = result;
                    c0662p.i = 1;
                    obj = companion.c(context, list, c0662p);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    result = c0662p.d;
                    ResultKt.throwOnFailure(obj);
                }
                result.success(obj);
                return Unit.INSTANCE;
            }
        }
        c0662p = new C0662p(bDPlugin, continuationImpl);
        Object obj3 = c0662p.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0662p.i;
        if (i2 != 0) {
        }
        result.success(obj3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x02a2, code lost:
    
        if (com.bbflight.background_downloader.TaskWorker.Companion.g(r0, r3, r4, r7, null, r18, r8, 504) != r10) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(BDPlugin bDPlugin, MethodCall methodCall, MethodChannel.Result result, ContinuationImpl continuationImpl) {
        C0664q c0664q;
        int i2;
        E0 e0;
        M0 m0;
        boolean z;
        MethodChannel.Result result2;
        String str;
        int i3;
        MethodCall methodCall2;
        MethodChannel.Result result3;
        String str2;
        List list;
        long intValue;
        M0 m02;
        C0638c0 c0638c0;
        String str3;
        C0664q c0664q2;
        M0 m03;
        E0 e02;
        MethodChannel.Result result4;
        String str4;
        MethodCall methodCall3;
        MethodChannel.Result result5;
        Context context;
        Context context2;
        Context context3;
        try {
            if (continuationImpl instanceof C0664q) {
                c0664q = (C0664q) continuationImpl;
                int i4 = c0664q.n;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0664q.n = i4 - Integer.MIN_VALUE;
                    C0664q c0664q3 = c0664q;
                    Object obj = c0664q3.l;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = c0664q3.n;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Object obj2 = methodCall.arguments;
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        List list2 = (List) obj2;
                        Object obj3 = list2.get(0);
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str5 = (String) obj3;
                        b.a aVar = kotlinx.serialization.json.b.d;
                        aVar.getClass();
                        M0 m04 = (M0) aVar.a(M0.Companion.serializer(), str5);
                        String str6 = (String) list2.get(1);
                        int i5 = list2.size() == 5 ? 1 : 0;
                        if (i5 != 0) {
                            if (list2.get(3) instanceof Long) {
                                Object obj4 = list2.get(3);
                                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Long");
                                intValue = ((Long) obj4).longValue();
                            } else {
                                Object obj5 = list2.get(3);
                                Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                                intValue = ((Integer) obj5).intValue();
                            }
                            long j2 = intValue;
                            String str7 = (String) list2.get(4);
                            Object obj6 = list2.get(2);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.String");
                            e0 = new E0(m04, (String) obj6, j2, str7);
                        } else {
                            e0 = null;
                        }
                        m0 = m04;
                        try {
                            new URL(m0.b);
                            kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.scheduling.b.a;
                            r rVar = new r(m0, null);
                            z = false;
                            try {
                                c0664q3.a = SpillingKt.nullOutSpilledVariable(methodCall);
                                result2 = result;
                            } catch (IllegalArgumentException unused) {
                                result2 = result;
                                String str8 = m0.a;
                                result2.success(Boxing.boxBoolean(z));
                                return Unit.INSTANCE;
                            } catch (MalformedURLException unused2) {
                                result2 = result;
                                String str9 = m0.a;
                                result2.success(Boxing.boxBoolean(z));
                                return Unit.INSTANCE;
                            }
                            try {
                                c0664q3.b = result2;
                                c0664q3.c = SpillingKt.nullOutSpilledVariable(list2);
                                c0664q3.d = SpillingKt.nullOutSpilledVariable(str5);
                                c0664q3.e = m0;
                                c0664q3.f = str6;
                                c0664q3.i = e0;
                                c0664q3.k = i5;
                                c0664q3.n = 1;
                                Object f = C1082i.f(rVar, bVar, c0664q3);
                                if (f != coroutine_suspended) {
                                    str = str5;
                                    i3 = i5;
                                    methodCall2 = methodCall;
                                    obj = f;
                                    result3 = result2;
                                    str2 = str6;
                                    list = list2;
                                }
                                return coroutine_suspended;
                            } catch (IllegalArgumentException unused3) {
                                String str82 = m0.a;
                                result2.success(Boxing.boxBoolean(z));
                                return Unit.INSTANCE;
                            } catch (MalformedURLException unused4) {
                                String str92 = m0.a;
                                result2.success(Boxing.boxBoolean(z));
                                return Unit.INSTANCE;
                            }
                        } catch (IllegalArgumentException unused5) {
                            z = false;
                        } catch (MalformedURLException unused6) {
                            z = false;
                        }
                    } else if (i2 == 1) {
                        int i6 = c0664q3.k;
                        e0 = (E0) c0664q3.i;
                        String str10 = (String) c0664q3.f;
                        m0 = (M0) c0664q3.e;
                        str = (String) c0664q3.d;
                        List list3 = (List) c0664q3.c;
                        MethodChannel.Result result6 = (MethodChannel.Result) c0664q3.b;
                        methodCall2 = (MethodCall) c0664q3.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            result3 = result6;
                            z = false;
                            str2 = str10;
                            list = list3;
                            i3 = i6;
                        } catch (IllegalArgumentException unused7) {
                            z = false;
                            result2 = result6;
                            String str822 = m0.a;
                            result2.success(Boxing.boxBoolean(z));
                            return Unit.INSTANCE;
                        } catch (MalformedURLException unused8) {
                            z = false;
                            result2 = result6;
                            String str922 = m0.a;
                            result2.success(Boxing.boxBoolean(z));
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (i2 == 2) {
                            result5 = c0664q3.j;
                            ResultKt.throwOnFailure(obj);
                            result5.success(obj);
                            return Unit.INSTANCE;
                        }
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            result4 = (MethodChannel.Result) c0664q3.b;
                            ResultKt.throwOnFailure(obj);
                            result4.success(Boxing.boxBoolean(true));
                            return Unit.INSTANCE;
                        }
                        int i7 = c0664q3.k;
                        e02 = (E0) c0664q3.i;
                        str2 = (String) c0664q3.f;
                        m03 = (M0) c0664q3.e;
                        str4 = (String) c0664q3.d;
                        list = (List) c0664q3.c;
                        MethodChannel.Result result7 = (MethodChannel.Result) c0664q3.b;
                        methodCall3 = (MethodCall) c0664q3.a;
                        ResultKt.throwOnFailure(obj);
                        i3 = i7;
                        str3 = "applicationContext";
                        result4 = result7;
                        c0664q2 = c0664q3;
                        TaskWorker.Companion companion = TaskWorker.INSTANCE;
                        String str11 = str2;
                        M0 m05 = m03;
                        W0 w0 = W0.b;
                        context = bDPlugin.c;
                        if (context == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str3);
                            context = null;
                        }
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
                        context2 = bDPlugin.c;
                        if (context2 != null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str3);
                            context3 = null;
                        } else {
                            context3 = context2;
                        }
                        c0664q2.a = SpillingKt.nullOutSpilledVariable(methodCall3);
                        c0664q2.b = result4;
                        c0664q2.c = SpillingKt.nullOutSpilledVariable(list);
                        c0664q2.d = SpillingKt.nullOutSpilledVariable(str4);
                        c0664q2.e = SpillingKt.nullOutSpilledVariable(m05);
                        c0664q2.f = SpillingKt.nullOutSpilledVariable(str11);
                        c0664q2.i = SpillingKt.nullOutSpilledVariable(e02);
                        c0664q2.k = i3;
                        c0664q2.n = 4;
                    }
                    m02 = m0;
                    c0638c0 = y;
                    if (c0638c0 != null) {
                        Companion companion2 = INSTANCE;
                        Context context4 = bDPlugin.c;
                        if (context4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                            context4 = null;
                        }
                        c0664q3.a = SpillingKt.nullOutSpilledVariable(methodCall2);
                        c0664q3.b = SpillingKt.nullOutSpilledVariable(result3);
                        c0664q3.c = SpillingKt.nullOutSpilledVariable(list);
                        c0664q3.d = SpillingKt.nullOutSpilledVariable(str);
                        c0664q3.e = SpillingKt.nullOutSpilledVariable(m02);
                        c0664q3.f = SpillingKt.nullOutSpilledVariable(str2);
                        c0664q3.i = SpillingKt.nullOutSpilledVariable(e0);
                        c0664q3.j = result3;
                        c0664q3.k = i3;
                        c0664q3.n = 2;
                        obj = Companion.e(companion2, context4, m02, str2, e0, bDPlugin, c0664q3, 16);
                        if (obj != coroutine_suspended) {
                            result5 = result3;
                            result5.success(obj);
                            return Unit.INSTANCE;
                        }
                    } else {
                        str3 = "applicationContext";
                        c0664q2 = c0664q3;
                        String str12 = m02.a;
                        Context context5 = bDPlugin.c;
                        if (context5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str3);
                            context5 = null;
                        }
                        U u2 = new U(context5, m02, str2, e0, bDPlugin, 32);
                        c0664q2.a = SpillingKt.nullOutSpilledVariable(methodCall2);
                        c0664q2.b = result3;
                        c0664q2.c = SpillingKt.nullOutSpilledVariable(list);
                        c0664q2.d = SpillingKt.nullOutSpilledVariable(str);
                        c0664q2.e = m02;
                        c0664q2.f = SpillingKt.nullOutSpilledVariable(str2);
                        c0664q2.i = SpillingKt.nullOutSpilledVariable(e0);
                        c0664q2.k = i3;
                        c0664q2.n = 3;
                        if (c0638c0.c(u2, c0664q2) != coroutine_suspended) {
                            E0 e03 = e0;
                            m03 = m02;
                            e02 = e03;
                            result4 = result3;
                            str4 = str;
                            methodCall3 = methodCall2;
                            TaskWorker.Companion companion3 = TaskWorker.INSTANCE;
                            String str112 = str2;
                            M0 m052 = m03;
                            W0 w02 = W0.b;
                            context = bDPlugin.c;
                            if (context == null) {
                            }
                            SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(context);
                            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences2, "getDefaultSharedPreferences(...)");
                            context2 = bDPlugin.c;
                            if (context2 != null) {
                            }
                            c0664q2.a = SpillingKt.nullOutSpilledVariable(methodCall3);
                            c0664q2.b = result4;
                            c0664q2.c = SpillingKt.nullOutSpilledVariable(list);
                            c0664q2.d = SpillingKt.nullOutSpilledVariable(str4);
                            c0664q2.e = SpillingKt.nullOutSpilledVariable(m052);
                            c0664q2.f = SpillingKt.nullOutSpilledVariable(str112);
                            c0664q2.i = SpillingKt.nullOutSpilledVariable(e02);
                            c0664q2.k = i3;
                            c0664q2.n = 4;
                        }
                    }
                    return coroutine_suspended;
                }
            }
            c0638c0 = y;
            if (c0638c0 != null) {
            }
            return coroutine_suspended;
        } catch (IllegalArgumentException unused9) {
            m0 = m02;
            result2 = result3;
            String str8222 = m0.a;
            result2.success(Boxing.boxBoolean(z));
            return Unit.INSTANCE;
        } catch (MalformedURLException unused10) {
            m0 = m02;
            result2 = result3;
            String str9222 = m0.a;
            result2.success(Boxing.boxBoolean(z));
            return Unit.INSTANCE;
        }
        c0664q = new C0664q(bDPlugin, continuationImpl);
        C0664q c0664q32 = c0664q;
        Object obj7 = c0664q32.l;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0664q32.n;
        if (i2 != 0) {
        }
        m02 = m0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0253 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022d  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.String, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(BDPlugin bDPlugin, MethodCall methodCall, MethodChannel.Result result, ContinuationImpl continuationImpl) {
        C0667s c0667s;
        int i2;
        Context context;
        String str;
        ContentResolver contentResolver;
        Uri insert;
        ?? r10;
        int i3;
        FileInputStream fileInputStream;
        int i4;
        int i5;
        Object f;
        MethodChannel.Result result2;
        boolean contains$default;
        if (continuationImpl instanceof C0667s) {
            c0667s = (C0667s) continuationImpl;
            int i6 = c0667s.n;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0667s.n = i6 - Integer.MIN_VALUE;
                Object obj = c0667s.l;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0667s.n;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = methodCall.arguments;
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    Object obj3 = list.get(0);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) obj3;
                    EnumEntries enumEntries = F0.b;
                    Object obj4 = list.get(1);
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                    F0 f0 = (F0) enumEntries.get(((Integer) obj4).intValue());
                    Object obj5 = list.get(2);
                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
                    String str3 = (String) obj5;
                    String str4 = (String) list.get(3);
                    Object obj6 = list.get(4);
                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean booleanValue = ((Boolean) obj6).booleanValue();
                    C0682z0.a aVar = C0682z0.Companion;
                    Context context2 = bDPlugin.c;
                    if (context2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                        context2 = null;
                    }
                    EnumC0680y0 enumC0680y0 = EnumC0680y0.b;
                    aVar.getClass();
                    EnumC0678x0 a = C0682z0.a.a(context2, enumC0680y0);
                    if (a != EnumC0678x0.b) {
                        result.success(null);
                        return Unit.INSTANCE;
                    }
                    Context context3 = bDPlugin.c;
                    if (context3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                        context = null;
                    } else {
                        context = context3;
                    }
                    c0667s.a = SpillingKt.nullOutSpilledVariable(methodCall);
                    c0667s.b = SpillingKt.nullOutSpilledVariable(result);
                    c0667s.c = SpillingKt.nullOutSpilledVariable(list);
                    c0667s.d = SpillingKt.nullOutSpilledVariable(str2);
                    c0667s.e = SpillingKt.nullOutSpilledVariable(f0);
                    c0667s.f = SpillingKt.nullOutSpilledVariable(str3);
                    c0667s.i = SpillingKt.nullOutSpilledVariable(str4);
                    c0667s.j = SpillingKt.nullOutSpilledVariable(a);
                    c0667s.k = result;
                    c0667s.n = 1;
                    Regex regex = G0.a;
                    str = "";
                    if (Build.VERSION.SDK_INT < 29) {
                        try {
                            File file = new File(str2);
                            if (file.exists()) {
                                File file2 = new File(Environment.getExternalStoragePublicDirectory(G0.a(f0)), str3);
                                if (!file2.exists()) {
                                    file2.mkdirs();
                                }
                                File file3 = new File(file2, file.getName());
                                String nameWithoutExtension = FilesKt.getNameWithoutExtension(file);
                                String name = file.getName();
                                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                contains$default = StringsKt__StringsKt.contains$default(name, ".", false, 2, (Object) null);
                                str = contains$default ? "." + FilesKt.getExtension(file) : "";
                                for (int i7 = 1; file3.exists() && i7 < 100; i7++) {
                                    file3 = new File(file2, nameWithoutExtension + "_" + i7 + str);
                                }
                                if (file3.exists()) {
                                    throw new Exception("Destination file exist!");
                                }
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                try {
                                    fileInputStream = new FileInputStream(file);
                                    try {
                                        ByteStreamsKt.copyTo$default(fileInputStream, fileOutputStream, 0, 2, null);
                                        CloseableKt.closeFinally(fileInputStream, null);
                                        CloseableKt.closeFinally(fileOutputStream, null);
                                        file.delete();
                                        f = file3.getAbsolutePath();
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                        } catch (Exception e) {
                            e.toString();
                        }
                        obj = null;
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result2 = result;
                    } else {
                        File file4 = new File(str2);
                        if (file4.exists()) {
                            String replace = G0.b.replace(G0.a.replace(str3, ""), "");
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("_display_name", file4.getName());
                            if (str4 == null) {
                                String name2 = file4.getName();
                                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                                str4 = G0.c(name2);
                            }
                            contentValues.put("mime_type", str4);
                            switch (G0.a.$EnumSwitchMapping$0[f0.ordinal()]) {
                                case 1:
                                    str = Environment.DIRECTORY_DOCUMENTS;
                                    if (replace.length() != 0) {
                                        Intrinsics.checkNotNull(str);
                                    } else {
                                        str = android.support.v4.media.session.f.b(str, DomExceptionUtils.SEPARATOR, replace);
                                    }
                                    contentValues.put("relative_path", str);
                                    contentValues.put("is_pending", Boxing.boxInt(1));
                                    contentResolver = context.getContentResolver();
                                    try {
                                        insert = contentResolver.insert(G0.b(f0), contentValues);
                                        if (insert == null) {
                                            try {
                                                OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                                                if (openOutputStream != null) {
                                                    try {
                                                        fileInputStream = new FileInputStream(file4);
                                                        try {
                                                            ByteStreamsKt.copyTo$default(fileInputStream, openOutputStream, 0, 2, null);
                                                            CloseableKt.closeFinally(fileInputStream, null);
                                                            CloseableKt.closeFinally(openOutputStream, null);
                                                            i4 = 1;
                                                        } finally {
                                                        }
                                                    } catch (Throwable th) {
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            CloseableKt.closeFinally(openOutputStream, th);
                                                            throw th2;
                                                        }
                                                    }
                                                } else {
                                                    i4 = 0;
                                                }
                                                contentValues.clear();
                                                contentValues.put("is_pending", Boxing.boxInt(0));
                                                contentResolver.update(insert, contentValues, null, null);
                                                i5 = i4;
                                            } catch (Exception e2) {
                                                r10 = 0;
                                                i3 = 0;
                                                try {
                                                    e2.toString();
                                                    contentValues.clear();
                                                    contentValues.put("is_pending", Boxing.boxInt(0));
                                                    contentResolver.update(insert, contentValues, null, null);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    contentValues.clear();
                                                    contentValues.put("is_pending", Boxing.boxInt(i3));
                                                    contentResolver.update(insert, contentValues, r10, r10);
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r10 = 0;
                                                i3 = 0;
                                                contentValues.clear();
                                                contentValues.put("is_pending", Boxing.boxInt(i3));
                                                contentResolver.update(insert, contentValues, r10, r10);
                                                throw th;
                                            }
                                            if (i5 != 0) {
                                                file4.delete();
                                                Intrinsics.checkNotNull(insert);
                                                if (booleanValue) {
                                                    f = insert.toString();
                                                    break;
                                                } else {
                                                    kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                                                    f = C1082i.f(new H0(context, insert, null), kotlinx.coroutines.scheduling.b.a, c0667s);
                                                    break;
                                                }
                                            }
                                        } else {
                                            i3 = 0;
                                        }
                                        i5 = i3;
                                        if (i5 != 0) {
                                        }
                                    } catch (Exception e3) {
                                        e3.toString();
                                        break;
                                    }
                                    break;
                                case 2:
                                    str = Environment.DIRECTORY_DOWNLOADS;
                                    if (replace.length() != 0) {
                                    }
                                    contentValues.put("relative_path", str);
                                    contentValues.put("is_pending", Boxing.boxInt(1));
                                    contentResolver = context.getContentResolver();
                                    insert = contentResolver.insert(G0.b(f0), contentValues);
                                    if (insert == null) {
                                    }
                                    i5 = i3;
                                    if (i5 != 0) {
                                    }
                                    break;
                                case 3:
                                    str = Environment.DIRECTORY_PICTURES;
                                    if (replace.length() != 0) {
                                    }
                                    contentValues.put("relative_path", str);
                                    contentValues.put("is_pending", Boxing.boxInt(1));
                                    contentResolver = context.getContentResolver();
                                    insert = contentResolver.insert(G0.b(f0), contentValues);
                                    if (insert == null) {
                                    }
                                    i5 = i3;
                                    if (i5 != 0) {
                                    }
                                    break;
                                case 4:
                                    str = Environment.DIRECTORY_MOVIES;
                                    if (replace.length() != 0) {
                                    }
                                    contentValues.put("relative_path", str);
                                    contentValues.put("is_pending", Boxing.boxInt(1));
                                    contentResolver = context.getContentResolver();
                                    insert = contentResolver.insert(G0.b(f0), contentValues);
                                    if (insert == null) {
                                    }
                                    i5 = i3;
                                    if (i5 != 0) {
                                    }
                                    break;
                                case 5:
                                    str = Environment.DIRECTORY_MUSIC;
                                    if (replace.length() != 0) {
                                    }
                                    contentValues.put("relative_path", str);
                                    contentValues.put("is_pending", Boxing.boxInt(1));
                                    contentResolver = context.getContentResolver();
                                    insert = contentResolver.insert(G0.b(f0), contentValues);
                                    if (insert == null) {
                                    }
                                    i5 = i3;
                                    if (i5 != 0) {
                                    }
                                    break;
                                case 6:
                                    if (replace.length() != 0) {
                                    }
                                    contentValues.put("relative_path", str);
                                    contentValues.put("is_pending", Boxing.boxInt(1));
                                    contentResolver = context.getContentResolver();
                                    insert = contentResolver.insert(G0.b(f0), contentValues);
                                    if (insert == null) {
                                    }
                                    i5 = i3;
                                    if (i5 != 0) {
                                    }
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        }
                        obj = null;
                        if (obj == coroutine_suspended) {
                        }
                    }
                    obj = f;
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    result2 = c0667s.k;
                    ResultKt.throwOnFailure(obj);
                }
                result2.success(obj);
                return Unit.INSTANCE;
            }
        }
        c0667s = new C0667s(bDPlugin, continuationImpl);
        Object obj7 = c0667s.l;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0667s.n;
        if (i2 != 0) {
        }
        result2.success(obj7);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(BDPlugin bDPlugin, MethodCall methodCall, MethodChannel.Result result, ContinuationImpl continuationImpl) {
        C0669t c0669t;
        int i2;
        if (continuationImpl instanceof C0669t) {
            c0669t = (C0669t) continuationImpl;
            int i3 = c0669t.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0669t.i = i3 - Integer.MIN_VALUE;
                Object obj = c0669t.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0669t.i;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = methodCall.arguments;
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    EnumEntries enumEntries = B0.d;
                    Object obj3 = list.get(0);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                    B0 b0 = (B0) enumEntries.get(((Integer) obj3).intValue());
                    Object obj4 = list.get(1);
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean booleanValue = ((Boolean) obj4).booleanValue();
                    Objects.toString(b0);
                    kotlinx.coroutines.channels.b bVar = A1.a;
                    Context context = bDPlugin.c;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                        context = null;
                    }
                    C0 c0 = new C0(context, b0, booleanValue);
                    c0669t.a = SpillingKt.nullOutSpilledVariable(methodCall);
                    c0669t.b = result;
                    c0669t.c = SpillingKt.nullOutSpilledVariable(list);
                    c0669t.d = SpillingKt.nullOutSpilledVariable(b0);
                    c0669t.i = 1;
                    Object i4 = A1.a.i(c0, c0669t);
                    if (i4 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        i4 = Unit.INSTANCE;
                    }
                    if (i4 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    result = c0669t.b;
                    ResultKt.throwOnFailure(obj);
                }
                result.success(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
        }
        c0669t = new C0669t(bDPlugin, continuationImpl);
        Object obj5 = c0669t.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0669t.i;
        if (i2 != 0) {
        }
        result.success(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0114, code lost:
    
        if (r5.d(r2) == r3) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0331, code lost:
    
        r10 = r28;
        r12 = r29;
        r5 = r5;
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x030a -> B:14:0x0310). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0319 -> B:15:0x0331). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(BDPlugin bDPlugin, MethodCall methodCall, MethodChannel.Result result, ContinuationImpl continuationImpl) {
        C0671u c0671u;
        int i2;
        MethodCall methodCall2;
        MethodChannel.Result result2;
        String str;
        MethodChannel.Result result3;
        C0638c0 c0638c0;
        MethodCall methodCall3;
        int i3;
        MethodCall methodCall4;
        Object obj;
        MethodChannel.Result result4;
        Ref.ObjectRef objectRef;
        Context context;
        SharedPreferences defaultSharedPreferences;
        ReentrantReadWriteLock.ReadLock readLock;
        Context context2;
        WorkManager workManager;
        Object f;
        int i4;
        Object obj2;
        String str2;
        SharedPreferences sharedPreferences;
        Iterator it;
        Iterator it2;
        Iterator it3;
        String str3;
        ArrayList arrayList;
        SharedPreferences sharedPreferences2;
        WorkInfo workInfo;
        Ref.ObjectRef objectRef2;
        MethodCall methodCall5;
        WorkManager workManager2;
        String str4;
        Iterator it4;
        MethodChannel.Result result5;
        M0 m0;
        Collection collection;
        C0638c0 c0638c02;
        Collection collection2;
        kotlinx.coroutines.sync.c cVar;
        Context context3;
        boolean contains$default;
        BDPlugin bDPlugin2 = bDPlugin;
        if (continuationImpl instanceof C0671u) {
            c0671u = (C0671u) continuationImpl;
            int i5 = c0671u.r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0671u.r = i5 - Integer.MIN_VALUE;
                Object obj3 = c0671u.p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0671u.r;
                String str5 = "applicationContext";
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    methodCall2 = methodCall;
                    Object obj4 = methodCall2.arguments;
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    String str6 = (String) obj4;
                    C0638c0 c0638c03 = y;
                    if (c0638c03 == null || (r5 = c0638c03.o) == null) {
                        result2 = result;
                    } else {
                        c0671u.a = SpillingKt.nullOutSpilledVariable(methodCall2);
                        result2 = result;
                        c0671u.b = result2;
                        c0671u.c = str6;
                        c0671u.r = 1;
                    }
                    str = str6;
                    result3 = result2;
                } else if (i2 == 1) {
                    String str7 = c0671u.c;
                    result3 = c0671u.b;
                    MethodCall methodCall6 = (MethodCall) c0671u.a;
                    ResultKt.throwOnFailure(obj3);
                    str = str7;
                    methodCall2 = methodCall6;
                } else {
                    if (i2 == 2) {
                        String str8 = c0671u.c;
                        result3 = c0671u.b;
                        MethodCall methodCall7 = (MethodCall) c0671u.a;
                        ResultKt.throwOnFailure(obj3);
                        methodCall4 = methodCall7;
                        str = str8;
                        obj = obj3;
                        i3 = ((Number) obj).intValue();
                        methodCall3 = methodCall4;
                        result4 = result3;
                        objectRef = new Ref.ObjectRef();
                        context = bDPlugin2.c;
                        if (context == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                            context = null;
                        }
                        defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        readLock = v.readLock();
                        readLock.lock();
                        try {
                            Intrinsics.checkNotNull(defaultSharedPreferences);
                            objectRef.element = q1.b(defaultSharedPreferences);
                            Unit unit = Unit.INSTANCE;
                            readLock.unlock();
                            context2 = bDPlugin2.c;
                            if (context2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                                context2 = null;
                            }
                            workManager = WorkManager.getInstance(context2);
                            Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
                            kotlinx.coroutines.scheduling.c cVar2 = C1049c0.a;
                            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.scheduling.b.a;
                            C0673v c0673v = new C0673v(workManager, null);
                            c0671u.a = SpillingKt.nullOutSpilledVariable(methodCall3);
                            c0671u.b = result4;
                            c0671u.c = str;
                            c0671u.d = objectRef;
                            c0671u.e = defaultSharedPreferences;
                            c0671u.f = workManager;
                            c0671u.o = i3;
                            c0671u.r = 3;
                            f = C1082i.f(c0673v, bVar, c0671u);
                            if (f != coroutine_suspended) {
                                i4 = i3;
                                obj2 = f;
                                str2 = str;
                                sharedPreferences = defaultSharedPreferences;
                                Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
                                ArrayList arrayList2 = new ArrayList();
                                it = ((Iterable) obj2).iterator();
                                while (it.hasNext()) {
                                }
                                it2 = arrayList2.iterator();
                                collection2 = arrayList2;
                                if (!it2.hasNext()) {
                                }
                            }
                            return coroutine_suspended;
                        } catch (Throwable th) {
                            readLock.unlock();
                            throw th;
                        }
                    }
                    if (i2 == 3) {
                        int i6 = c0671u.o;
                        WorkManager workManager3 = c0671u.f;
                        sharedPreferences = c0671u.e;
                        objectRef = c0671u.d;
                        str2 = c0671u.c;
                        result4 = c0671u.b;
                        methodCall3 = (MethodCall) c0671u.a;
                        ResultKt.throwOnFailure(obj3);
                        workManager = workManager3;
                        i4 = i6;
                        obj2 = obj3;
                        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
                        ArrayList arrayList22 = new ArrayList();
                        it = ((Iterable) obj2).iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            WorkInfo workInfo2 = (WorkInfo) next;
                            if (workInfo2.getState().isFinished()) {
                                it3 = it;
                            } else {
                                it3 = it;
                                if (workInfo2.getTags().contains("group=" + str2)) {
                                    arrayList22.add(next);
                                }
                            }
                            it = it3;
                        }
                        it2 = arrayList22.iterator();
                        collection2 = arrayList22;
                        if (!it2.hasNext()) {
                        }
                    } else if (i2 == 4) {
                        i4 = c0671u.o;
                        m0 = (M0) c0671u.n;
                        String str9 = (String) c0671u.m;
                        ?? r7 = (List) c0671u.l;
                        WorkInfo workInfo3 = c0671u.k;
                        Iterator it5 = c0671u.j;
                        Collection collection3 = (List) c0671u.i;
                        WorkManager workManager4 = c0671u.f;
                        sharedPreferences2 = c0671u.e;
                        Ref.ObjectRef objectRef3 = c0671u.d;
                        String str10 = c0671u.c;
                        MethodChannel.Result result6 = c0671u.b;
                        MethodCall methodCall8 = (MethodCall) c0671u.a;
                        ResultKt.throwOnFailure(obj3);
                        methodCall5 = methodCall8;
                        collection = collection3;
                        objectRef2 = objectRef3;
                        arrayList = r7;
                        str2 = str10;
                        workManager2 = workManager4;
                        workInfo = workInfo3;
                        it4 = it5;
                        str3 = "applicationContext";
                        str4 = str9;
                        result5 = result6;
                        c0638c02 = y;
                        Collection collection4 = collection;
                        if (c0638c02 == null) {
                        }
                    } else {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i4 = c0671u.o;
                        WorkInfo workInfo4 = c0671u.k;
                        it4 = c0671u.j;
                        Collection collection5 = (List) c0671u.i;
                        WorkManager workManager5 = c0671u.f;
                        sharedPreferences2 = c0671u.e;
                        Ref.ObjectRef objectRef4 = c0671u.d;
                        String str11 = c0671u.c;
                        result5 = c0671u.b;
                        methodCall5 = (MethodCall) c0671u.a;
                        ResultKt.throwOnFailure(obj3);
                        str3 = "applicationContext";
                        Collection collection6 = collection5;
                        it2 = it4;
                        methodCall3 = methodCall5;
                        workManager = workManager5;
                        result4 = result5;
                        workInfo = workInfo4;
                        objectRef = objectRef4;
                        str2 = str11;
                        sharedPreferences = sharedPreferences2;
                        workManager.cancelWorkById(workInfo.getId());
                        i4++;
                        bDPlugin2 = bDPlugin;
                        str5 = str3;
                        collection2 = collection6;
                        if (!it2.hasNext()) {
                            workInfo = (WorkInfo) it2.next();
                            Set<String> tags = workInfo.getTags();
                            arrayList = new ArrayList();
                            Collection collection7 = collection2;
                            for (Object obj5 : tags) {
                                String str12 = str5;
                                MethodCall methodCall9 = methodCall3;
                                Collection collection8 = collection7;
                                contains$default = StringsKt__StringsKt.contains$default((String) obj5, "taskId=", false, 2, (Object) null);
                                if (contains$default) {
                                    arrayList.add(obj5);
                                }
                                methodCall3 = methodCall9;
                                collection7 = collection8;
                                str5 = str12;
                            }
                            str3 = str5;
                            MethodCall methodCall10 = methodCall3;
                            Collection collection9 = collection7;
                            if (!arrayList.isEmpty()) {
                                str4 = ((String) CollectionsKt.first((List) arrayList)).substring(7);
                                Intrinsics.checkNotNullExpressionValue(str4, "substring(...)");
                                M0 m02 = (M0) ((Map) objectRef.element).get(str4);
                                if (m02 != null) {
                                    TaskWorker.Companion companion = TaskWorker.INSTANCE;
                                    W0 w0 = W0.i;
                                    Intrinsics.checkNotNull(sharedPreferences);
                                    Context context4 = bDPlugin2.c;
                                    if (context4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(str3);
                                        context3 = null;
                                    } else {
                                        context3 = context4;
                                    }
                                    c0671u.a = SpillingKt.nullOutSpilledVariable(methodCall10);
                                    c0671u.b = result4;
                                    c0671u.c = str2;
                                    c0671u.d = objectRef;
                                    c0671u.e = sharedPreferences;
                                    c0671u.f = workManager;
                                    c0671u.i = SpillingKt.nullOutSpilledVariable(collection9);
                                    c0671u.j = it2;
                                    c0671u.k = workInfo;
                                    c0671u.l = SpillingKt.nullOutSpilledVariable(arrayList);
                                    c0671u.m = SpillingKt.nullOutSpilledVariable(str4);
                                    c0671u.n = m02;
                                    c0671u.o = i4;
                                    c0671u.r = 4;
                                    C0671u c0671u2 = c0671u;
                                    SharedPreferences sharedPreferences3 = sharedPreferences;
                                    if (TaskWorker.Companion.g(companion, m02, w0, sharedPreferences3, null, context3, c0671u2, 504) != coroutine_suspended) {
                                        objectRef2 = objectRef;
                                        result5 = result4;
                                        workManager2 = workManager;
                                        m0 = m02;
                                        sharedPreferences2 = sharedPreferences3;
                                        c0671u = c0671u2;
                                        methodCall5 = methodCall10;
                                        it4 = it2;
                                        collection = collection9;
                                        c0638c02 = y;
                                        Collection collection42 = collection;
                                        if (c0638c02 == null) {
                                            c0671u.a = SpillingKt.nullOutSpilledVariable(methodCall5);
                                            c0671u.b = result5;
                                            c0671u.c = str2;
                                            c0671u.d = objectRef2;
                                            c0671u.e = sharedPreferences2;
                                            c0671u.f = workManager2;
                                            c0671u.i = SpillingKt.nullOutSpilledVariable(collection42);
                                            c0671u.j = it4;
                                            c0671u.k = workInfo;
                                            c0671u.l = SpillingKt.nullOutSpilledVariable(arrayList);
                                            c0671u.m = SpillingKt.nullOutSpilledVariable(str4);
                                            c0671u.n = SpillingKt.nullOutSpilledVariable(m0);
                                            c0671u.o = i4;
                                            c0671u.r = 5;
                                            if (c0638c02.g(m0, c0671u) != coroutine_suspended) {
                                                str11 = str2;
                                                objectRef4 = objectRef2;
                                                workInfo4 = workInfo;
                                                collection6 = collection42;
                                                workManager5 = workManager2;
                                                it2 = it4;
                                                methodCall3 = methodCall5;
                                                workManager = workManager5;
                                                result4 = result5;
                                                workInfo = workInfo4;
                                                objectRef = objectRef4;
                                                str2 = str11;
                                                sharedPreferences = sharedPreferences2;
                                                workManager.cancelWorkById(workInfo.getId());
                                                i4++;
                                                bDPlugin2 = bDPlugin;
                                                str5 = str3;
                                                collection2 = collection6;
                                                if (!it2.hasNext()) {
                                                    C0638c0 c0638c04 = y;
                                                    if (c0638c04 != null && (cVar = c0638c04.o) != null) {
                                                        cVar.c(null);
                                                    }
                                                    result4.success(Boxing.boxInt(i4));
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        } else {
                                            MethodCall methodCall11 = methodCall5;
                                            workManager = workManager2;
                                            methodCall3 = methodCall11;
                                            it2 = it4;
                                            sharedPreferences = sharedPreferences2;
                                            result4 = result5;
                                            objectRef = objectRef2;
                                            collection6 = collection42;
                                            workManager.cancelWorkById(workInfo.getId());
                                            i4++;
                                            bDPlugin2 = bDPlugin;
                                            str5 = str3;
                                            collection2 = collection6;
                                            if (!it2.hasNext()) {
                                            }
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                            }
                            methodCall3 = methodCall10;
                            collection6 = collection9;
                            sharedPreferences = sharedPreferences;
                            c0671u = c0671u;
                            workManager.cancelWorkById(workInfo.getId());
                            i4++;
                            bDPlugin2 = bDPlugin;
                            str5 = str3;
                            collection2 = collection6;
                            if (!it2.hasNext()) {
                            }
                        }
                    }
                }
                c0638c0 = y;
                if (c0638c0 != null) {
                    methodCall3 = methodCall2;
                    i3 = 0;
                    result4 = result3;
                    objectRef = new Ref.ObjectRef();
                    context = bDPlugin2.c;
                    if (context == null) {
                    }
                    defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    readLock = v.readLock();
                    readLock.lock();
                    Intrinsics.checkNotNull(defaultSharedPreferences);
                    objectRef.element = q1.b(defaultSharedPreferences);
                    Unit unit2 = Unit.INSTANCE;
                    readLock.unlock();
                    context2 = bDPlugin2.c;
                    if (context2 == null) {
                    }
                    workManager = WorkManager.getInstance(context2);
                    Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
                    kotlinx.coroutines.scheduling.c cVar22 = C1049c0.a;
                    kotlinx.coroutines.scheduling.b bVar2 = kotlinx.coroutines.scheduling.b.a;
                    C0673v c0673v2 = new C0673v(workManager, null);
                    c0671u.a = SpillingKt.nullOutSpilledVariable(methodCall3);
                    c0671u.b = result4;
                    c0671u.c = str;
                    c0671u.d = objectRef;
                    c0671u.e = defaultSharedPreferences;
                    c0671u.f = workManager;
                    c0671u.o = i3;
                    c0671u.r = 3;
                    f = C1082i.f(c0673v2, bVar2, c0671u);
                    if (f != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                Context context5 = bDPlugin2.c;
                if (context5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                    context5 = null;
                }
                c0671u.a = SpillingKt.nullOutSpilledVariable(methodCall2);
                c0671u.b = result3;
                c0671u.c = str;
                c0671u.r = 2;
                Object e = c0638c0.e(context5, str, c0671u);
                if (e != coroutine_suspended) {
                    methodCall4 = methodCall2;
                    obj = e;
                    i3 = ((Number) obj).intValue();
                    methodCall3 = methodCall4;
                    result4 = result3;
                    objectRef = new Ref.ObjectRef();
                    context = bDPlugin2.c;
                    if (context == null) {
                    }
                    defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    readLock = v.readLock();
                    readLock.lock();
                    Intrinsics.checkNotNull(defaultSharedPreferences);
                    objectRef.element = q1.b(defaultSharedPreferences);
                    Unit unit22 = Unit.INSTANCE;
                    readLock.unlock();
                    context2 = bDPlugin2.c;
                    if (context2 == null) {
                    }
                    workManager = WorkManager.getInstance(context2);
                    Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
                    kotlinx.coroutines.scheduling.c cVar222 = C1049c0.a;
                    kotlinx.coroutines.scheduling.b bVar22 = kotlinx.coroutines.scheduling.b.a;
                    C0673v c0673v22 = new C0673v(workManager, null);
                    c0671u.a = SpillingKt.nullOutSpilledVariable(methodCall3);
                    c0671u.b = result4;
                    c0671u.c = str;
                    c0671u.d = objectRef;
                    c0671u.e = defaultSharedPreferences;
                    c0671u.f = workManager;
                    c0671u.o = i3;
                    c0671u.r = 3;
                    f = C1082i.f(c0673v22, bVar22, c0671u);
                    if (f != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        c0671u = new C0671u(bDPlugin2, continuationImpl);
        Object obj32 = c0671u.p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0671u.r;
        String str52 = "applicationContext";
        if (i2 != 0) {
        }
        c0638c0 = y;
        if (c0638c0 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(BDPlugin bDPlugin, MethodCall methodCall, MethodChannel.Result result, ContinuationImpl continuationImpl) {
        C0675w c0675w;
        int i2;
        String taskId;
        kotlinx.coroutines.sync.c cVar;
        String str;
        C0638c0 c0638c0;
        M0 m0;
        C0638c0 c0638c02;
        kotlinx.coroutines.sync.c cVar2;
        int collectionSizeOrDefault;
        if (continuationImpl instanceof C0675w) {
            c0675w = (C0675w) continuationImpl;
            int i3 = c0675w.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0675w.f = i3 - Integer.MIN_VALUE;
                Object obj = c0675w.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0675w.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = methodCall.arguments;
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                    taskId = (String) obj2;
                    C0638c0 c0638c03 = y;
                    if (c0638c03 != null && (cVar = c0638c03.o) != null) {
                        c0675w.a = SpillingKt.nullOutSpilledVariable(methodCall);
                        c0675w.b = result;
                        c0675w.c = taskId;
                        c0675w.f = 1;
                        if (cVar.d(c0675w) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = taskId;
                    }
                    c0638c0 = y;
                    if (c0638c0 != null) {
                        Intrinsics.checkNotNullParameter(taskId, "taskId");
                        PriorityBlockingQueue<U> priorityBlockingQueue = c0638c0.j;
                        ArrayList arrayList = new ArrayList();
                        Iterator<U> it = priorityBlockingQueue.iterator();
                        while (it.hasNext()) {
                            U next = it.next();
                            if (Intrinsics.areEqual(next.b.a, taskId)) {
                                arrayList.add(next);
                            }
                        }
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((U) it2.next()).b);
                        }
                        if (!arrayList2.isEmpty()) {
                            m0 = (M0) CollectionsKt.first((List) arrayList2);
                            if (m0 == null) {
                                ReentrantReadWriteLock.ReadLock readLock = v.readLock();
                                readLock.lock();
                                try {
                                    Context context = bDPlugin.c;
                                    if (context == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                                        context = null;
                                    }
                                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                                    Intrinsics.checkNotNull(defaultSharedPreferences);
                                    M0 m02 = q1.b(defaultSharedPreferences).get(taskId);
                                    Unit unit = Unit.INSTANCE;
                                    readLock.unlock();
                                    m0 = m02;
                                } catch (Throwable th) {
                                    readLock.unlock();
                                    throw th;
                                }
                            }
                            if (m0 == null) {
                                b.a aVar = kotlinx.serialization.json.b.d;
                                aVar.getClass();
                                result.success(aVar.b(M0.Companion.serializer(), m0));
                            } else {
                                result.success(null);
                            }
                            c0638c02 = y;
                            if (c0638c02 != null && (cVar2 = c0638c02.o) != null) {
                                cVar2.c(null);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    m0 = null;
                    if (m0 == null) {
                    }
                    if (m0 == null) {
                    }
                    c0638c02 = y;
                    if (c0638c02 != null) {
                        cVar2.c(null);
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c0675w.c;
                result = c0675w.b;
                ResultKt.throwOnFailure(obj);
                taskId = str;
                c0638c0 = y;
                if (c0638c0 != null) {
                }
                m0 = null;
                if (m0 == null) {
                }
                if (m0 == null) {
                }
                c0638c02 = y;
                if (c0638c02 != null) {
                }
                return Unit.INSTANCE;
            }
        }
        c0675w = new C0675w(bDPlugin, continuationImpl);
        Object obj3 = c0675w.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0675w.f;
        if (i2 != 0) {
        }
        taskId = str;
        c0638c0 = y;
        if (c0638c0 != null) {
        }
        m0 = null;
        if (m0 == null) {
        }
        if (m0 == null) {
        }
        c0638c02 = y;
        if (c0638c02 != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(BDPlugin bDPlugin, MethodCall methodCall, MethodChannel.Result result, ContinuationImpl continuationImpl) {
        C0677x c0677x;
        int i2;
        if (continuationImpl instanceof C0677x) {
            c0677x = (C0677x) continuationImpl;
            int i3 = c0677x.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0677x.l = i3 - Integer.MIN_VALUE;
                Object obj = c0677x.j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0677x.l;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = methodCall.arguments;
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    Object obj3 = list.get(0);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj3;
                    Object obj4 = list.get(1);
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) obj4;
                    b.a aVar = kotlinx.serialization.json.b.d;
                    aVar.getClass();
                    M0 m0 = (M0) aVar.a(M0.Companion.serializer(), str);
                    Map mutableMapOf = str2.length() > 0 ? MapsKt.mutableMapOf(TuplesKt.to("Content-Disposition", CollectionsKt.mutableListOf(str2))) : MapsKt.mutableMapOf(TuplesKt.to("", new ArrayList()));
                    Context context = bDPlugin.c;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                        context = null;
                    }
                    c0677x.a = SpillingKt.nullOutSpilledVariable(methodCall);
                    c0677x.b = result;
                    c0677x.c = SpillingKt.nullOutSpilledVariable(list);
                    c0677x.d = SpillingKt.nullOutSpilledVariable(str);
                    c0677x.e = SpillingKt.nullOutSpilledVariable(str2);
                    c0677x.f = SpillingKt.nullOutSpilledVariable(m0);
                    c0677x.i = SpillingKt.nullOutSpilledVariable(mutableMapOf);
                    c0677x.l = 1;
                    obj = m0.e(context, mutableMapOf, false, c0677x);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    result = c0677x.b;
                    ResultKt.throwOnFailure(obj);
                }
                result.success(((M0) obj).d);
                return Unit.INSTANCE;
            }
        }
        c0677x = new C0677x(bDPlugin, continuationImpl);
        Object obj5 = c0677x.j;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0677x.l;
        if (i2 != 0) {
        }
        result.success(((M0) obj5).d);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(BDPlugin bDPlugin, MethodCall methodCall, MethodChannel.Result result, ContinuationImpl continuationImpl) {
        C0679y c0679y;
        int i2;
        MethodChannel.Result result2;
        Object obj;
        Object obj2;
        if (continuationImpl instanceof C0679y) {
            c0679y = (C0679y) continuationImpl;
            int i3 = c0679y.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0679y.j = i3 - Integer.MIN_VALUE;
                C0679y c0679y2 = c0679y;
                Object obj3 = c0679y2.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0679y2.j;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    Object obj4 = methodCall.arguments;
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj4;
                    Object obj5 = list.get(0);
                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj5;
                    Object obj6 = list.get(1);
                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) obj6;
                    Object obj7 = list.get(2);
                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Double");
                    double doubleValue = ((Double) obj7).doubleValue();
                    ParallelDownloadTaskWorker parallelDownloadTaskWorker = q.get(str);
                    if (parallelDownloadTaskWorker != null) {
                        c0679y2.a = SpillingKt.nullOutSpilledVariable(methodCall);
                        result2 = result;
                        c0679y2.b = result2;
                        c0679y2.c = SpillingKt.nullOutSpilledVariable(list);
                        c0679y2.d = SpillingKt.nullOutSpilledVariable(str);
                        c0679y2.e = SpillingKt.nullOutSpilledVariable(str2);
                        c0679y2.j = 1;
                        Iterator<T> it = parallelDownloadTaskWorker.C.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (Intrinsics.areEqual(((O) obj).d.a, str2)) {
                                break;
                            }
                        }
                        O o2 = (O) obj;
                        if (o2 == null) {
                            obj2 = Unit.INSTANCE;
                        } else {
                            double d = 0.0d;
                            if (doubleValue > 0.0d && doubleValue < 1.0d) {
                                o2.h = doubleValue;
                                Iterator<T> it2 = parallelDownloadTaskWorker.C.iterator();
                                while (it2.hasNext()) {
                                    d += ((O) it2.next()).h;
                                }
                                double size = d / parallelDownloadTaskWorker.C.size();
                                if (parallelDownloadTaskWorker.o(size, System.currentTimeMillis())) {
                                    obj2 = parallelDownloadTaskWorker.q(size, parallelDownloadTaskWorker.B, parallelDownloadTaskWorker.k(), c0679y2);
                                    if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        obj2 = Unit.INSTANCE;
                                    }
                                }
                            }
                            obj2 = Unit.INSTANCE;
                        }
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        result2 = result;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    result2 = c0679y2.b;
                    ResultKt.throwOnFailure(obj3);
                }
                result2.success(null);
                return Unit.INSTANCE;
            }
        }
        c0679y = new C0679y(bDPlugin, continuationImpl);
        C0679y c0679y22 = c0679y;
        Object obj32 = c0679y22.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0679y22.j;
        if (i2 != 0) {
        }
        result2.success(null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|8|(1:(2:11|12)(2:16|17))(4:18|(1:20)(1:26)|21|(2:23|(1:25)))|13|14))|30|6|7|8|(0)(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ec, code lost:
    
        r0.toString();
        r0.printStackTrace();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(BDPlugin bDPlugin, MethodCall methodCall, MethodChannel.Result result, ContinuationImpl continuationImpl) {
        C0681z c0681z;
        int i2;
        P0 p0;
        if (continuationImpl instanceof C0681z) {
            c0681z = (C0681z) continuationImpl;
            int i3 = c0681z.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0681z.l = i3 - Integer.MIN_VALUE;
                C0681z c0681z2 = c0681z;
                Object obj = c0681z2.j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c0681z2.l;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = methodCall.arguments;
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    Object obj3 = list.get(0);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj3;
                    Object obj4 = list.get(1);
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) obj4;
                    Object obj5 = list.get(2);
                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) obj5).intValue();
                    String str3 = (String) list.get(3);
                    if (str3 != null) {
                        b.a aVar = kotlinx.serialization.json.b.d;
                        aVar.getClass();
                        p0 = (P0) aVar.a(P0.Companion.serializer(), str3);
                    } else {
                        p0 = null;
                    }
                    String str4 = (String) list.get(4);
                    ParallelDownloadTaskWorker parallelDownloadTaskWorker = q.get(str);
                    if (parallelDownloadTaskWorker != null) {
                        W0 w0 = (W0) W0.m.get(intValue);
                        c0681z2.a = SpillingKt.nullOutSpilledVariable(methodCall);
                        c0681z2.b = result;
                        c0681z2.c = SpillingKt.nullOutSpilledVariable(list);
                        c0681z2.d = SpillingKt.nullOutSpilledVariable(str);
                        c0681z2.e = SpillingKt.nullOutSpilledVariable(str2);
                        c0681z2.f = SpillingKt.nullOutSpilledVariable(p0);
                        c0681z2.i = SpillingKt.nullOutSpilledVariable(str4);
                        c0681z2.l = 1;
                        if (parallelDownloadTaskWorker.s(str2, w0, p0, str4, c0681z2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    result = c0681z2.b;
                    ResultKt.throwOnFailure(obj);
                }
                result.success(null);
                return Unit.INSTANCE;
            }
        }
        c0681z = new C0681z(bDPlugin, continuationImpl);
        C0681z c0681z22 = c0681z;
        Object obj6 = c0681z22.j;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c0681z22.l;
        if (i2 != 0) {
        }
        result.success(null);
        return Unit.INSTANCE;
    }

    public final void k(ActivityPluginBinding activityPluginBinding) {
        this.f = null;
        C1086c c1086c = this.d;
        if (c1086c != null) {
            kotlinx.coroutines.L.b(c1086c, null);
        }
        this.d = null;
        this.f = activityPluginBinding.getActivity();
        kotlinx.coroutines.R0 a = kotlinx.coroutines.S0.a();
        kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
        this.d = new C1086c(CoroutineContext.Element.DefaultImpls.plus(a, kotlinx.coroutines.internal.p.a));
        activityPluginBinding.addRequestPermissionsResultListener(this);
        activityPluginBinding.addOnNewIntentListener(new PluginRegistry.NewIntentListener() { // from class: com.bbflight.background_downloader.e
            @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
            public final boolean onNewIntent(Intent intent) {
                BDPlugin.Companion companion = BDPlugin.INSTANCE;
                return BDPlugin.this.l(intent);
            }
        });
        LinkedHashMap linkedHashMap = i;
        if (linkedHashMap.isEmpty()) {
            Activity activity = this.f;
            Intrinsics.checkNotNull(activity);
            linkedHashMap.put("Cancel", activity.getString(R.string.bg_downloader_cancel));
            Activity activity2 = this.f;
            Intrinsics.checkNotNull(activity2);
            linkedHashMap.put("Pause", activity2.getString(R.string.bg_downloader_pause));
            Activity activity3 = this.f;
            Intrinsics.checkNotNull(activity3);
            linkedHashMap.put("Resume", activity3.getString(R.string.bg_downloader_resume));
        }
    }

    public final boolean l(Intent intent) {
        Activity activity;
        if (intent == null || !Intrinsics.areEqual(intent.getAction(), NotificationReceiver.actionTap)) {
            return false;
        }
        String stringExtra = intent.getStringExtra(NotificationReceiver.keyTask);
        if (stringExtra != null) {
            int intExtra = intent.getIntExtra(NotificationReceiver.keyNotificationType, 0);
            int intExtra2 = intent.getIntExtra(NotificationReceiver.keyNotificationId, 0);
            Context context = null;
            if (stringExtra.length() > 0) {
                C1082i.c(kotlinx.coroutines.L.a(C1049c0.a), null, null, new C0656m(this, stringExtra, intExtra, null), 3);
                EnumC0668s0 enumC0668s0 = EnumC0668s0.a;
                if (intExtra == 1) {
                    b.a aVar = kotlinx.serialization.json.b.d;
                    aVar.getClass();
                    M0 m0 = (M0) aVar.a(M0.Companion.serializer(), stringExtra);
                    Bundle extras = intent.getExtras();
                    String string = extras != null ? extras.getString(NotificationReceiver.keyNotificationConfig) : null;
                    C0654k0 c0654k0 = string != null ? (C0654k0) aVar.a(C0654k0.Companion.serializer(), string) : null;
                    if (c0654k0 != null && c0654k0.f && (activity = this.f) != null) {
                        Intrinsics.checkNotNull(activity);
                        String b2 = m0.b(activity, null);
                        Activity activity2 = this.f;
                        Intrinsics.checkNotNull(activity2);
                        C0670t0.a(activity2, b2, G0.c(b2));
                    }
                }
            }
            if (intExtra2 != 0) {
                EnumC0668s0 enumC0668s02 = EnumC0668s0.a;
                if (intExtra == 1 || intExtra == 2) {
                    Context context2 = this.c;
                    if (context2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                    } else {
                        context = context2;
                    }
                    NotificationManagerCompat.from(context).cancel(intExtra2);
                }
            }
        }
        return true;
    }

    public final void m(String str, MethodChannel.Result result) {
        ReentrantReadWriteLock reentrantReadWriteLock = v;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Context context = this.c;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                context = null;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            String string = defaultSharedPreferences.getString(str, "{}");
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.remove(str);
            edit.apply();
            result.success(string);
            Unit unit = Unit.INSTANCE;
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final void n(Integer num, String str) {
        Context context = this.c;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context = null;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        if (num != null) {
            edit.putInt(str, num.intValue());
        } else {
            edit.remove(str);
        }
        edit.apply();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        k(binding);
        l(binding.getActivity().getIntent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.c = applicationContext;
        this.e = flutterPluginBinding.getBinaryMessenger();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bbflight.background_downloader.background");
        this.b = methodChannel;
        if (j == null) {
            j = methodChannel;
        }
        MethodChannel methodChannel2 = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.bbflight.background_downloader");
        this.a = methodChannel2;
        methodChannel2.setMethodCallHandler(this);
        Context context = this.c;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context = null;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Context context3 = this.c;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        } else {
            context2 = context3;
        }
        WorkManager workManager = WorkManager.getInstance(context2);
        Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
        if (workManager.getWorkInfosByTag("BackgroundDownloader").get().isEmpty()) {
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.remove("com.bbflight.background_downloader.taskMap.v2");
            edit.apply();
        }
        m = (B0) B0.d.get(defaultSharedPreferences.getInt("com.bbflight.background_downloader.requireWifi", 0));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        this.f = null;
        C1086c c1086c = this.d;
        if (c1086c != null) {
            kotlinx.coroutines.L.b(c1086c, null);
        }
        this.d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        this.f = null;
        C1086c c1086c = this.d;
        if (c1086c != null) {
            kotlinx.coroutines.L.b(c1086c, null);
        }
        this.d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.a = null;
        Map<String, MethodChannel> map = k;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, MethodChannel> entry : map.entrySet()) {
            if (!Intrinsics.areEqual(entry.getValue(), this.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        k = TypeIntrinsics.asMutableMap(linkedHashMap);
        if (Intrinsics.areEqual(j, this.b)) {
            j = null;
        }
        this.b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        C1082i.d(EmptyCoroutineContext.INSTANCE, new b(call, this, result, null));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        k(binding);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public final boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        C0682z0.Companion.getClass();
        Intrinsics.checkNotNullParameter(this, "plugin");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        boolean z = grantResults.length != 0 && grantResults[0] == 0;
        EnumC0680y0 enumC0680y0 = EnumC0680y0.a;
        if (requestCode != 373900 && requestCode != 373901) {
            return false;
        }
        int i2 = 2;
        MethodChannel a = Companion.a(INSTANCE, this, null, 2);
        if (a != null) {
            if (z) {
                EnumC0678x0 enumC0678x0 = EnumC0678x0.a;
            } else {
                EnumC0678x0 enumC0678x02 = EnumC0678x0.a;
                i2 = 1;
            }
            a.invokeMethod("permissionRequestResult", CollectionsKt.listOf("", Integer.valueOf(i2)));
        }
        return true;
    }
}
