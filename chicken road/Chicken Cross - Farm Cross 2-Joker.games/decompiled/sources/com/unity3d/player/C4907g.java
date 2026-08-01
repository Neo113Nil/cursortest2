package com.unity3d.player;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Collections;
import java.util.Map;
import java.util.Vector;

/* renamed from: com.unity3d.player.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4907g implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final IAssetPackManagerDownloadStatusCallback f11790a;
    public final UnityPlayer b;
    public final String[] c;

    public C4907g(UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, String[] strArr) {
        this.b = unityPlayer;
        this.f11790a = iAssetPackManagerDownloadStatusCallback;
        this.c = strArr;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int errorCode;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map packStates = assetPackStates.packStates();
            if (packStates.size() == 0) {
                return;
            }
            Vector vector = new Vector();
            for (AssetPackState assetPackState : packStates.values()) {
                if (assetPackState.errorCode() != 0 || assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                    String name = assetPackState.name();
                    int status = assetPackState.status();
                    int errorCode2 = assetPackState.errorCode();
                    long j = assetPackStates.totalBytes();
                    this.b.invokeOnMainThread(new RunnableC4899c(Collections.singleton(this.f11790a), name, status, j, status == 4 ? j : 0L, 0, errorCode2));
                } else {
                    vector.add(assetPackState.name());
                }
            }
            if (vector.size() > 0) {
                C4913j c4913j = C4913j.e;
                UnityPlayer unityPlayer = this.b;
                IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback = this.f11790a;
                c4913j.getClass();
                synchronized (C4913j.e) {
                    C4901d c4901d = c4913j.d;
                    if (c4901d == null) {
                        C4901d c4901d2 = new C4901d(c4913j, unityPlayer, iAssetPackManagerDownloadStatusCallback);
                        c4913j.b.registerListener(c4901d2);
                        c4913j.d = c4901d2;
                    } else {
                        c4901d.a(iAssetPackManagerDownloadStatusCallback);
                    }
                    c4913j.c.addAll(vector);
                    c4913j.b.fetch(vector);
                }
            }
        } catch (RuntimeExecutionException e) {
            e = e;
            String[] strArr = this.c;
            if (strArr.length == 1) {
                String str = strArr[0];
                while (true) {
                    if (e instanceof AssetPackException) {
                        errorCode = e.getErrorCode();
                        break;
                    }
                    e = e.getCause();
                    if (e == null) {
                        errorCode = -100;
                        break;
                    }
                }
                this.b.invokeOnMainThread(new RunnableC4899c(Collections.singleton(this.f11790a), str, 0, 0L, 0L, 0, errorCode));
                return;
            }
            C4913j c4913j2 = C4913j.e;
            IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback2 = this.f11790a;
            c4913j2.getClass();
            for (String str2 : strArr) {
                c4913j2.b.getPackStates(Collections.singletonList(str2)).addOnCompleteListener(new C4907g(c4913j2.f11794a, iAssetPackManagerDownloadStatusCallback2, new String[]{str2}));
            }
        }
    }
}
