package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.of;

/* loaded from: classes4.dex */
public interface pcc<T extends View> {
    void clickSkip();

    void clickSound(String str);

    View getCloseBackupButton();

    View getCloseButton();

    void setCountDownFor1InN(CharSequence charSequence, int i);

    void setListener(sf sfVar);

    void setShowDislike(boolean z);

    void setShowEndCardNextAd(boolean z, of ofVar);

    void setShowPlayableNextAd(boolean z, of ofVar);

    void setShowSkip(boolean z);

    void setShowSound(boolean z);

    void setSkipEnable(boolean z);

    void setSkipInvisiable();

    void setSkipText(CharSequence charSequence);

    void setSoundMute(boolean z);

    void setTime(CharSequence charSequence, CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
