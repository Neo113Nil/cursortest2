package com.door.brass.knob.data.device;

import android.content.Context;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.yzPsTade5rL7D3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/door/brass/knob/data/device/InstallReferrerSource;", "", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InstallReferrerSource {
    public final Context yzPsTade5rL7D3;

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/door/brass/knob/data/device/InstallReferrerSource$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "SERVICE_TIMEOUT_MS", "J", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    public InstallReferrerSource(Context context) {
        this.yzPsTade5rL7D3 = context;
    }

    public static final void yzPsTade5rL7D3(AtomicBoolean atomicBoolean, CancellableContinuationImpl cancellableContinuationImpl, InstallReferrerClient installReferrerClient, String str) {
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                installReferrerClient.yzPsTade5rL7D3();
            } catch (Throwable th) {
                new Result.Failure(th);
            }
            if (cancellableContinuationImpl.AGl7HBCQ8xrHABq() instanceof NotCompleted) {
                cancellableContinuationImpl.FsuUJlzzWhYnMlD(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hRNgd2zGCE5kj(ContinuationImpl continuationImpl) {
        InstallReferrerSource$read$1 installReferrerSource$read$1;
        int i;
        try {
            if (continuationImpl instanceof InstallReferrerSource$read$1) {
                installReferrerSource$read$1 = (InstallReferrerSource$read$1) continuationImpl;
                int i2 = installReferrerSource$read$1.FsuUJlzzWhYnMlD;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    installReferrerSource$read$1.FsuUJlzzWhYnMlD = i2 - Integer.MIN_VALUE;
                    Object obj = installReferrerSource$read$1.i7xAcZoXXiIt;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
                    i = installReferrerSource$read$1.FsuUJlzzWhYnMlD;
                    if (i != 0) {
                        ResultKt.hRNgd2zGCE5kj(obj);
                        InstallReferrerSource$read$2 installReferrerSource$read$2 = new InstallReferrerSource$read$2(this, null);
                        installReferrerSource$read$1.FsuUJlzzWhYnMlD = 1;
                        obj = TimeoutKt.ra306ClFT3HT(8000L, installReferrerSource$read$2, installReferrerSource$read$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.hRNgd2zGCE5kj(obj);
                    }
                    String str = (String) obj;
                    return str != null ? "" : str;
                }
            }
            if (i != 0) {
            }
            String str2 = (String) obj;
            if (str2 != null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Log.w("DeviceSignals", "Install referrer unavailable", e2);
            return "";
        }
        installReferrerSource$read$1 = new InstallReferrerSource$read$1(this, continuationImpl);
        Object obj2 = installReferrerSource$read$1.i7xAcZoXXiIt;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.oyjLVtGms9eZwJ0;
        i = installReferrerSource$read$1.FsuUJlzzWhYnMlD;
    }
}
