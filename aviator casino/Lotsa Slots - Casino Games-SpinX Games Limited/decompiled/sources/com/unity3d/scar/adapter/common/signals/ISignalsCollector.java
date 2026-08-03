package com.unity3d.scar.adapter.common.signals;

/* loaded from: classes5.dex */
public interface ISignalsCollector {
    void getSCARBiddingSignals(android.content.Context context, java.util.List<com.unity3d.scar.adapter.common.scarads.UnityAdFormat> list, com.unity3d.scar.adapter.common.signals.ISignalCollectionListener iSignalCollectionListener);

    void getSCARBiddingSignals(android.content.Context context, boolean z, com.unity3d.scar.adapter.common.signals.ISignalCollectionListener iSignalCollectionListener);

    void getSCARSignal(android.content.Context context, java.lang.String str, com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.DispatchGroup dispatchGroup, com.unity3d.scar.adapter.common.signals.SignalsResult signalsResult);

    void getSCARSignal(android.content.Context context, java.lang.String str, com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.signals.ISignalCollectionListener iSignalCollectionListener);

    void getSCARSignalForHB(android.content.Context context, com.unity3d.scar.adapter.common.scarads.UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.DispatchGroup dispatchGroup, com.unity3d.scar.adapter.common.signals.SignalsResult signalsResult);
}
