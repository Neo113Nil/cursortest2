package com.unity3d.player;

import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.unity3d.player.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4901d implements AssetPackStateUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f11784a;
    public final UnityPlayer b;
    public final /* synthetic */ C4913j c;

    public final void onStateUpdate(Object obj) {
        AssetPackState assetPackState = (AssetPackState) obj;
        synchronized (this) {
            if (assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                synchronized (C4913j.e) {
                    this.c.c.remove(assetPackState.name());
                    if (this.c.c.isEmpty()) {
                        C4913j c4913j = this.c;
                        C4901d c4901d = c4913j.d;
                        if (c4901d instanceof C4901d) {
                            c4913j.b.unregisterListener(c4901d);
                        }
                        this.c.d = null;
                    }
                }
            }
            if (this.f11784a.size() == 0) {
                return;
            }
            this.b.invokeOnMainThread(new RunnableC4899c((Set) this.f11784a.clone(), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
        }
    }

    public C4901d(C4913j c4913j, UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.c = c4913j;
        this.b = unityPlayer;
        HashSet hashSet = new HashSet();
        this.f11784a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
    }

    public final synchronized void a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.f11784a.add(iAssetPackManagerDownloadStatusCallback);
    }
}
