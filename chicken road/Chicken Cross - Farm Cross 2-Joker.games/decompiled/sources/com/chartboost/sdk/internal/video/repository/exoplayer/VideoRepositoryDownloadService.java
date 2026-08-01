package com.chartboost.sdk.internal.video.repository.exoplayer;

import android.app.Notification;
import com.chartboost.sdk.impl.b4;
import com.chartboost.sdk.impl.d4;
import com.chartboost.sdk.impl.f6;
import com.chartboost.sdk.impl.s7;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.ui.DownloadNotificationHelper;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/chartboost/sdk/internal/video/repository/exoplayer/VideoRepositoryDownloadService;", "Lcom/google/android/exoplayer2/offline/DownloadService;", "<init>", "()V", "", "onCreate", "Lcom/google/android/exoplayer2/offline/DownloadManager;", "getDownloadManager", "()Lcom/google/android/exoplayer2/offline/DownloadManager;", "Lcom/google/android/exoplayer2/scheduler/Scheduler;", "getScheduler", "()Lcom/google/android/exoplayer2/scheduler/Scheduler;", "", "Lcom/google/android/exoplayer2/offline/Download;", "downloads", "", "notMetRequirements", "Landroid/app/Notification;", "getForegroundNotification", "(Ljava/util/List;I)Landroid/app/Notification;", "Lcom/chartboost/sdk/impl/s7;", "a", "Lkotlin/Lazy;", "b", "()Lcom/chartboost/sdk/impl/s7;", "exoPlayerDownloadManager", "Lcom/google/android/exoplayer2/ui/DownloadNotificationHelper;", "Lcom/google/android/exoplayer2/ui/DownloadNotificationHelper;", "downloadNotificationHelper", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VideoRepositoryDownloadService extends DownloadService {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Lazy exoPlayerDownloadManager;

    /* renamed from: b, reason: from kotlin metadata */
    public DownloadNotificationHelper downloadNotificationHelper;

    public VideoRepositoryDownloadService() {
        super(0);
        this.exoPlayerDownloadManager = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.internal.video.repository.exoplayer.VideoRepositoryDownloadService$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoRepositoryDownloadService.a();
            }
        });
    }

    public static final s7 a() {
        return b4.b.b().c();
    }

    public final s7 b() {
        return (s7) this.exoPlayerDownloadManager.getValue();
    }

    @Override // com.google.android.exoplayer2.offline.DownloadService
    public DownloadManager getDownloadManager() {
        s7 b = b();
        b.a();
        return b.d();
    }

    @Override // com.google.android.exoplayer2.offline.DownloadService
    public Notification getForegroundNotification(List downloads, int notMetRequirements) {
        Intrinsics.checkNotNullParameter(downloads, "downloads");
        DownloadNotificationHelper downloadNotificationHelper = this.downloadNotificationHelper;
        if (downloadNotificationHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadNotificationHelper");
            downloadNotificationHelper = null;
        }
        Notification buildProgressNotification = downloadNotificationHelper.buildProgressNotification(this, 0, null, null, CollectionsKt.emptyList(), 0);
        Intrinsics.checkNotNullExpressionValue(buildProgressNotification, "buildProgressNotification(...)");
        return buildProgressNotification;
    }

    @Override // com.google.android.exoplayer2.offline.DownloadService
    public Scheduler getScheduler() {
        return f6.a(this, 0, 2, (Object) null);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadService, android.app.Service
    public void onCreate() {
        d4.b.a(this);
        super.onCreate();
        this.downloadNotificationHelper = new DownloadNotificationHelper(this, "chartboost");
    }
}
