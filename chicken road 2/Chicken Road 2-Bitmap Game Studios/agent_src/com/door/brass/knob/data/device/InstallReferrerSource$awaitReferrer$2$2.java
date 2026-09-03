package com.door.brass.knob.data.device;

import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/door/brass/knob/data/device/InstallReferrerSource$awaitReferrer$2$2", "Lcom/android/installreferrer/api/InstallReferrerStateListener;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InstallReferrerSource$awaitReferrer$2$2 implements InstallReferrerStateListener {
    public final /* synthetic */ AtomicBoolean hRNgd2zGCE5kj;
    public final /* synthetic */ CancellableContinuationImpl ra306ClFT3HT;
    public final /* synthetic */ InstallReferrerClient yzPsTade5rL7D3;

    public InstallReferrerSource$awaitReferrer$2$2(InstallReferrerClient installReferrerClient, AtomicBoolean atomicBoolean, InstallReferrerSource installReferrerSource, CancellableContinuationImpl cancellableContinuationImpl) {
        this.yzPsTade5rL7D3 = installReferrerClient;
        this.hRNgd2zGCE5kj = atomicBoolean;
        this.ra306ClFT3HT = cancellableContinuationImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.Result$Failure] */
    public final void yzPsTade5rL7D3(int i) {
        String str;
        String failure;
        InstallReferrerClient installReferrerClient = this.yzPsTade5rL7D3;
        str = "";
        if (i == 0) {
            try {
                failure = installReferrerClient.hRNgd2zGCE5kj().yzPsTade5rL7D3.getString("install_referrer");
                if (failure == null) {
                    failure = "";
                }
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable yzPsTade5rL7D3 = Result.yzPsTade5rL7D3(failure);
            if (yzPsTade5rL7D3 != null) {
                Log.w("DeviceSignals", "Referrer details unreadable", yzPsTade5rL7D3);
            }
            str = failure instanceof Result.Failure ? "" : failure;
        } else {
            Log.w("DeviceSignals", "Install referrer setup finished with code " + i);
        }
        InstallReferrerSource.yzPsTade5rL7D3(this.hRNgd2zGCE5kj, this.ra306ClFT3HT, installReferrerClient, str);
    }
}
