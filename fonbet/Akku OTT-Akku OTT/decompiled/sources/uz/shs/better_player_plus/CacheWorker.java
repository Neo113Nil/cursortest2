package uz.shs.better_player_plus;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Luz/shs/better_player_plus/CacheWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "cacheWriter", "Landroidx/media3/datasource/cache/CacheWriter;", "lastCacheReportIndex", "", "doWork", "Landroidx/work/ListenableWorker$Result;", "onStopped", "", "Companion", "better_player_plus_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@UnstableApi
@SourceDebugExtension({"SMAP\nCacheWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheWorker.kt\nuz/shs/better_player_plus/CacheWorker\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,101:1\n37#2,2:102\n29#3:104\n*S KotlinDebug\n*F\n+ 1 CacheWorker.kt\nuz/shs/better_player_plus/CacheWorker\n*L\n41#1:102,2\n45#1:104\n*E\n"})
/* loaded from: classes5.dex */
public final class CacheWorker extends Worker {
    public final Context a;
    public CacheWriter b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.a = context;
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        String str;
        boolean contains$default;
        try {
            Data inputData = getInputData();
            Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
            final String string = inputData.getString("url");
            String string2 = inputData.getString("cacheKey");
            final long j = inputData.getLong("preCacheSize", 0L);
            long j2 = inputData.getLong("maxCacheSize", 0L);
            long j3 = inputData.getLong("maxCacheFileSize", 0L);
            HashMap hashMap = new HashMap();
            for (String str2 : inputData.getKeyValueMap().keySet()) {
                contains$default = StringsKt__StringsKt.contains$default(str2, "header_", false, 2, (Object) null);
                if (contains$default) {
                    String str3 = ((String[]) new Regex("header_").split(str2, 0).toArray(new String[0]))[0];
                    Object obj = inputData.getKeyValueMap().get(str2);
                    Objects.requireNonNull(obj);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    hashMap.put(str3, (String) obj);
                }
            }
            Uri parse = string != null ? Uri.parse(string) : null;
            if (parse == null || !m.b(parse)) {
                ListenableWorker.Result failure = ListenableWorker.Result.failure();
                Intrinsics.checkNotNullExpressionValue(failure, "failure(...)");
                return failure;
            }
            String property = System.getProperty("http.agent");
            if (hashMap.containsKey(RtspHeaders.USER_AGENT) && (str = (String) hashMap.get(RtspHeaders.USER_AGENT)) != null) {
                property = str;
            }
            DefaultHttpDataSource.Factory a = m.a(property, hashMap);
            DataSpec dataSpec = new DataSpec(parse, 0L, j);
            if (string2 != null && string2.length() != 0) {
                dataSpec = dataSpec.buildUpon().setKey(string2).build();
                Intrinsics.checkNotNullExpressionValue(dataSpec, "build(...)");
            }
            CacheWriter cacheWriter = new CacheWriter(new j(this.a, j2, j3, a).createDataSource(), dataSpec, null, new CacheWriter.ProgressListener(j, this, string) { // from class: uz.shs.better_player_plus.k
                public final /* synthetic */ long a;
                public final /* synthetic */ CacheWorker b;

                @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
                public final void onProgress(long j4, long j5, long j6) {
                    double d = (j5 * 100.0f) / this.a;
                    CacheWorker cacheWorker = this.b;
                    int i = cacheWorker.c;
                    if (d >= i * 10) {
                        cacheWorker.c = i + 1;
                    }
                }
            });
            this.b = cacheWriter;
            cacheWriter.cache();
            ListenableWorker.Result success = ListenableWorker.Result.success();
            Intrinsics.checkNotNullExpressionValue(success, "success(...)");
            return success;
        } catch (Exception e) {
            e.toString();
            if (e instanceof HttpDataSource.HttpDataSourceException) {
                ListenableWorker.Result success2 = ListenableWorker.Result.success();
                Intrinsics.checkNotNull(success2);
                return success2;
            }
            ListenableWorker.Result failure2 = ListenableWorker.Result.failure();
            Intrinsics.checkNotNull(failure2);
            return failure2;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        try {
            CacheWriter cacheWriter = this.b;
            if (cacheWriter != null) {
                cacheWriter.cancel();
            }
            super.onStopped();
        } catch (Exception e) {
            e.toString();
        }
    }
}
