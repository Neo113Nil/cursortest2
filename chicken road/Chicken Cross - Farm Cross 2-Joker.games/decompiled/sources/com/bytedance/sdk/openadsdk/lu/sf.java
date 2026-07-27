package com.bytedance.sdk.openadsdk.lu;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.kj.pcc.wh;
import java.util.List;

/* loaded from: classes4.dex */
public interface sf {
    Context getContext();

    wh getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    HandlerThread getSafeHandlerThread(String str, int i);

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<com.bytedance.sdk.openadsdk.lu.sf.pcc> list);
}
