package com.unity3d.ads.core.data.datasource;

import com.ironsource.S5;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* compiled from: CacheDataSource.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u008c\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2J\b\u0002\u0010\f\u001aD\b\u0001\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rH¦@¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "", "getFile", "Lcom/unity3d/ads/core/data/model/CacheResult;", "cachePath", "Ljava/io/File;", S5.c.b, "", "url", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "intervalMs", "onProgress", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "bytesDownloaded", "totalBytes", "Lkotlin/coroutines/Continuation;", "", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CacheDataSource {
    Object getFile(File file, String str, String str2, Integer num, int i, Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super CacheResult> continuation);

    /* compiled from: CacheDataSource.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheDataSource cacheDataSource, File file, String str, String str2, Integer num, int i, Function3 function3, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return cacheDataSource.getFile(file, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? Integer.MAX_VALUE : num, (i2 & 16) != 0 ? Integer.MAX_VALUE : i, (i2 & 32) != 0 ? null : function3, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
        }
    }
}
