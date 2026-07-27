package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.ironsource.S5;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetAssetFileName;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;
import org.json.JSONArray;

/* compiled from: AndroidCacheRepository.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018Jz\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2H\u0010-\u001aD\b\u0001\u0012\u0013\u0012\u00110/¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0013\u0012\u00110/¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(3\u0012\n\u0012\b\u0012\u0004\u0012\u00020504\u0012\u0006\u0012\u0004\u0018\u000106\u0018\u00010.H\u0096@¢\u0006\u0002\u00107J&\u00108\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020;H\u0096@¢\u0006\u0002\u0010<J\u001e\u0010=\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u00109\u001a\u00020'H\u0096@¢\u0006\u0002\u0010>J\u0086\u0001\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2J\b\u0002\u0010-\u001aD\b\u0001\u0012\u0013\u0012\u00110/¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0013\u0012\u00110/¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(3\u0012\n\u0012\b\u0012\u0004\u0012\u00020504\u0012\u0006\u0012\u0004\u0018\u000106\u0018\u00010.H\u0082@¢\u0006\u0002\u0010AJ\u001e\u0010B\u001a\u00020%2\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0082@¢\u0006\u0002\u0010CJ\u0016\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020'H\u0096@¢\u0006\u0002\u0010FJ\u0010\u0010G\u001a\u00020;2\u0006\u0010H\u001a\u00020IH\u0016J\u0016\u0010J\u001a\u00020;2\u0006\u0010E\u001a\u00020'H\u0096@¢\u0006\u0002\u0010FJ\u000e\u0010K\u001a\u00020'2\u0006\u0010&\u001a\u00020'J\u000e\u0010L\u001a\u000205H\u0096@¢\u0006\u0002\u0010MJ\u000e\u0010N\u001a\u00020/H\u0096@¢\u0006\u0002\u0010MJ\u0010\u0010O\u001a\u00020\u001c2\u0006\u0010P\u001a\u00020'H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u001e¨\u0006Q"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidCacheRepository;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCacheDirectory", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "localCacheDataSource", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "remoteCacheDataSource", "context", "Landroid/content/Context;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "cleanupDirectory", "Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "downloadPriorityQueue", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "createFile", "Lcom/unity3d/ads/core/domain/CreateFile;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getAssetFileName", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/GetCacheDirectory;Lcom/unity3d/ads/core/data/datasource/CacheDataSource;Lcom/unity3d/ads/core/data/datasource/CacheDataSource;Landroid/content/Context;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/services/core/network/domain/CleanupDirectory;Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;Lcom/unity3d/ads/core/domain/CreateFile;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetAssetFileName;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "cacheDir", "Ljava/io/File;", "getCacheDir", "()Ljava/io/File;", "cacheDir$delegate", "Lkotlin/Lazy;", "webviewCacheDir", "getWebviewCacheDir", "webviewCacheDir$delegate", "getFile", "Lcom/unity3d/ads/core/data/model/CacheResult;", "url", "", "headers", "Lorg/json/JSONArray;", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "intervalMs", "onProgress", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "bytesDownloaded", "totalBytes", "Lkotlin/coroutines/Continuation;", "", "", "(Ljava/lang/String;Lorg/json/JSONArray;IILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWebviewFile", "type", "forceRemote", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWebviewFileFromDisk", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFileInternal", "cacheDirectory", "(Ljava/io/File;Ljava/lang/String;Lorg/json/JSONArray;IILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFileFromRemote", "(Ljava/io/File;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveFile", S5.c.b, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFile", "cachedFile", "Lcom/unity3d/ads/core/data/model/CachedFile;", "doesFileExist", "getFilename", "clearCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheSize", "initCacheDir", "dirName", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidCacheRepository implements CacheRepository {

    /* renamed from: cacheDir$delegate, reason: from kotlin metadata */
    private final Lazy cacheDir;
    private final CleanupDirectory cleanupDirectory;
    private final Context context;
    private final CreateFile createFile;
    private final DownloadPriorityQueue downloadPriorityQueue;
    private final GetAssetFileName getAssetFileName;
    private final GetCacheDirectory getCacheDirectory;
    private final CacheDataSource localCacheDataSource;
    private final CacheDataSource remoteCacheDataSource;
    private final CoroutineScope scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* renamed from: webviewCacheDir$delegate, reason: from kotlin metadata */
    private final Lazy webviewCacheDir;

    public AndroidCacheRepository(CoroutineDispatcher ioDispatcher, GetCacheDirectory getCacheDirectory, CacheDataSource localCacheDataSource, CacheDataSource remoteCacheDataSource, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, DownloadPriorityQueue downloadPriorityQueue, CreateFile createFile, SendDiagnosticEvent sendDiagnosticEvent, GetAssetFileName getAssetFileName) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(getCacheDirectory, "getCacheDirectory");
        Intrinsics.checkNotNullParameter(localCacheDataSource, "localCacheDataSource");
        Intrinsics.checkNotNullParameter(remoteCacheDataSource, "remoteCacheDataSource");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(cleanupDirectory, "cleanupDirectory");
        Intrinsics.checkNotNullParameter(downloadPriorityQueue, "downloadPriorityQueue");
        Intrinsics.checkNotNullParameter(createFile, "createFile");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(getAssetFileName, "getAssetFileName");
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = localCacheDataSource;
        this.remoteCacheDataSource = remoteCacheDataSource;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.createFile = createFile;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getAssetFileName = getAssetFileName;
        this.scope = CoroutineScopeKt.plus(CoroutineScopeKt.plus(CoroutineScopeKt.CoroutineScope(ioDispatcher), new CoroutineName("CacheRepository")), NonCancellable.INSTANCE);
        this.cacheDir = LazyKt.lazy(new Function0() { // from class: com.unity3d.ads.core.data.repository.AndroidCacheRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                File cacheDir_delegate$lambda$0;
                cacheDir_delegate$lambda$0 = AndroidCacheRepository.cacheDir_delegate$lambda$0(AndroidCacheRepository.this);
                return cacheDir_delegate$lambda$0;
            }
        });
        this.webviewCacheDir = LazyKt.lazy(new Function0() { // from class: com.unity3d.ads.core.data.repository.AndroidCacheRepository$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                File webviewCacheDir_delegate$lambda$1;
                webviewCacheDir_delegate$lambda$1 = AndroidCacheRepository.webviewCacheDir_delegate$lambda$1(AndroidCacheRepository.this);
                return webviewCacheDir_delegate$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File cacheDir_delegate$lambda$0(AndroidCacheRepository androidCacheRepository) {
        return androidCacheRepository.initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDir() {
        return (File) this.cacheDir.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getWebviewCacheDir() {
        return (File) this.webviewCacheDir.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File webviewCacheDir_delegate$lambda$1(AndroidCacheRepository androidCacheRepository) {
        return androidCacheRepository.initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_WEBVIEW_DIR_NAME);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getFile(String str, JSONArray jSONArray, int i, int i2, Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super CacheResult> continuation) {
        return getFileInternal(getCacheDir(), str, jSONArray, i, i2, function3, continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getWebviewFile(String str, String str2, boolean z, Continuation<? super CacheResult> continuation) {
        File invoke = this.createFile.invoke(getWebviewCacheDir(), str2);
        invoke.mkdirs();
        if (z) {
            return getFileFromRemote(invoke, str, continuation);
        }
        return getFileInternal$default(this, invoke, str, null, 0, 0, null, continuation, 48, null);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getWebviewFileFromDisk(String str, String str2, Continuation<? super CacheResult> continuation) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, this.createFile.invoke(getWebviewCacheDir(), str2), getFilename(str), str, Boxing.boxInt(0), 0, null, continuation, 48, null);
    }

    static /* synthetic */ Object getFileInternal$default(AndroidCacheRepository androidCacheRepository, File file, String str, JSONArray jSONArray, int i, int i2, Function3 function3, Continuation continuation, int i3, Object obj) {
        return androidCacheRepository.getFileInternal(file, str, jSONArray, i, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? null : function3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, JSONArray jSONArray, int i, int i2, Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super CacheResult> continuation) {
        return BuildersKt.withContext(this.scope.getCoroutineContext(), new AndroidCacheRepository$getFileInternal$2(this, str, file, i, i2, function3, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileFromRemote(File file, String str, Continuation<? super CacheResult> continuation) {
        return BuildersKt.withContext(this.scope.getCoroutineContext(), new AndroidCacheRepository$getFileFromRemote$2(this, str, file, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object retrieveFile(String str, Continuation<? super CacheResult> continuation) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, getCacheDir(), str, null, null, 0, null, continuation, 60, null);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(CachedFile cachedFile) {
        Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
        File file = cachedFile.getFile();
        if (file != null) {
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                return file.delete();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doesFileExist(String str, Continuation<? super Boolean> continuation) {
        AndroidCacheRepository$doesFileExist$1 androidCacheRepository$doesFileExist$1;
        int i;
        if (continuation instanceof AndroidCacheRepository$doesFileExist$1) {
            androidCacheRepository$doesFileExist$1 = (AndroidCacheRepository$doesFileExist$1) continuation;
            if ((androidCacheRepository$doesFileExist$1.label & Integer.MIN_VALUE) != 0) {
                androidCacheRepository$doesFileExist$1.label -= Integer.MIN_VALUE;
                Object obj = androidCacheRepository$doesFileExist$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidCacheRepository$doesFileExist$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    androidCacheRepository$doesFileExist$1.label = 1;
                    obj = retrieveFile(str, androidCacheRepository$doesFileExist$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(obj instanceof CacheResult.Success);
            }
        }
        androidCacheRepository$doesFileExist$1 = new AndroidCacheRepository$doesFileExist$1(this, continuation);
        Object obj2 = androidCacheRepository$doesFileExist$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidCacheRepository$doesFileExist$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(obj2 instanceof CacheResult.Success);
    }

    public final String getFilename(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.getAssetFileName.invoke(url);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object clearCache(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.scope.getCoroutineContext(), new AndroidCacheRepository$clearCache$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getCacheSize(Continuation<? super Long> continuation) {
        return BuildersKt.withContext(this.scope.getCoroutineContext(), new AndroidCacheRepository$getCacheSize$2(this, null), continuation);
    }

    private final File initCacheDir(String dirName) {
        File filesDir = this.sessionRepository.getFeatureFlags().getUseFilesDir() ? this.context.getFilesDir() : this.context.getCacheDir();
        GetCacheDirectory getCacheDirectory = this.getCacheDirectory;
        Intrinsics.checkNotNull(filesDir);
        File invoke = getCacheDirectory.invoke(filesDir, dirName);
        invoke.mkdirs();
        return invoke;
    }
}
