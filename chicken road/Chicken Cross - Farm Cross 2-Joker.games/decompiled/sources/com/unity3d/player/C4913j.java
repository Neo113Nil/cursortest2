package com.unity3d.player;

import android.content.Context;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import java.util.HashSet;

/* renamed from: com.unity3d.player.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4913j {
    public static C4913j e;

    /* renamed from: a, reason: collision with root package name */
    public final UnityPlayer f11794a;
    public final AssetPackManager b;
    public final HashSet c;
    public C4901d d;

    public C4913j(UnityPlayer unityPlayer, Context context) {
        if (e != null) {
            throw new RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
        }
        this.f11794a = unityPlayer;
        this.b = AssetPackManagerFactory.getInstance(context);
        this.c = new HashSet();
    }
}
