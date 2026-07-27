package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.w9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4711w9 {
    void onAdInstanceDidBecomeVisible();

    void onAdInstanceDidClick();

    void onAdInstanceDidDismiss();

    void onAdInstanceDidFailedToShow(IronSourceError ironSourceError);

    void onAdInstanceDidReward(String str, int i);

    void onAdInstanceDidShow();
}
