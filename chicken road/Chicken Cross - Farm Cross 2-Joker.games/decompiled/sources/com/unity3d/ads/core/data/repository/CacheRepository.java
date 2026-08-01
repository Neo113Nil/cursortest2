package com.unity3d.ads.core.data.repository;

import com.ironsource.S5;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import org.json.JSONArray;

/* compiled from: CacheRepository.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0082\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2J\b\u0002\u0010\u000b\u001aD\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\fH¦@¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0016\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0005H¦@¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0005H¦@¢\u0006\u0002\u0010!J\u000e\u0010#\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\rH¦@¢\u0006\u0002\u0010$¨\u0006&"}, d2 = {"Lcom/unity3d/ads/core/data/repository/CacheRepository;", "", "getFile", "Lcom/unity3d/ads/core/data/model/CacheResult;", "url", "", "headers", "Lorg/json/JSONArray;", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "intervalMs", "onProgress", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "bytesDownloaded", "totalBytes", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/String;Lorg/json/JSONArray;IILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWebviewFile", "type", "forceRemote", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWebviewFileFromDisk", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFile", "cachedFile", "Lcom/unity3d/ads/core/data/model/CachedFile;", "doesFileExist", S5.c.b, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveFile", "clearCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheSize", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CacheRepository {
    Object clearCache(Continuation<? super Unit> continuation);

    Object doesFileExist(String str, Continuation<? super Boolean> continuation);

    Object getCacheSize(Continuation<? super Long> continuation);

    Object getFile(String str, JSONArray jSONArray, int i, int i2, Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super CacheResult> continuation);

    Object getWebviewFile(String str, String str2, boolean z, Continuation<? super CacheResult> continuation);

    Object getWebviewFileFromDisk(String str, String str2, Continuation<? super CacheResult> continuation);

    boolean removeFile(CachedFile cachedFile);

    Object retrieveFile(String str, Continuation<? super CacheResult> continuation);

    /* compiled from: CacheRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i, int i2, Function3 function3, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                return cacheRepository.getFile(str, (i3 & 2) != 0 ? null : jSONArray, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? Integer.MAX_VALUE : i2, (i3 & 16) != 0 ? null : function3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
        }

        public static /* synthetic */ Object getWebviewFile$default(CacheRepository cacheRepository, String str, String str2, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWebviewFile");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return cacheRepository.getWebviewFile(str, str2, z, continuation);
        }
    }
}
