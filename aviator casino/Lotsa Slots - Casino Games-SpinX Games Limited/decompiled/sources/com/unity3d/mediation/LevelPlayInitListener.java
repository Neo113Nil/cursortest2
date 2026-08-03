package com.unity3d.mediation;

/* loaded from: classes5.dex */
public interface LevelPlayInitListener {
    void onInitFailed(com.unity3d.mediation.LevelPlayInitError levelPlayInitError);

    void onInitSuccess(com.unity3d.mediation.LevelPlayConfiguration levelPlayConfiguration);
}
