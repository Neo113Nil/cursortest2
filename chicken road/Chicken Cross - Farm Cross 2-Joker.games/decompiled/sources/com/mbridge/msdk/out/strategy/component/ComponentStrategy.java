package com.mbridge.msdk.out.strategy.component;

import android.app.Activity;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.manager.a;
import com.mbridge.msdk.config.manager.callback.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.strategy.IVideoAdStrategy;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class ComponentStrategy extends BaseComponentStrategy implements IVideoAdStrategy {
    public ComponentStrategy(String str, String str2, int i) {
        super(str, str2, i);
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public boolean isReady() {
        try {
            if (a.c().e() || a.c().a(a.p)) {
                return isReadyWithSyncWait(false);
            }
            return false;
        } catch (Exception e) {
            q0.b("BaseComponentStrategy", "ComponentBidStrategy isBidReady error: " + e.getMessage(), e);
            return false;
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void load() {
        if (a.c().e() || a.c().a(a.q)) {
            HashMap hashMap = new HashMap();
            hashMap.put("bid_token", "");
            hashMap.put("is_hb", 0);
            sendApiCallEvent(c.a(), "c1", hashMap);
            return;
        }
        b bVar = this.mComponentCallbackListener;
        if (bVar != null) {
            bVar.onVideoLoadFail(new MBridgeIds(this.placementId, this.unitId), "Unable to load");
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy, com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void loadFormSelfFilling() {
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show() {
        if (!a.c().e() && !a.c().a(a.r)) {
            b bVar = this.mComponentCallbackListener;
            if (bVar != null) {
                bVar.onShowFail(new MBridgeIds(this.placementId, this.unitId), "Unable to show");
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", this.userId);
        hashMap.put("user_extra_data", this.extraData);
        hashMap.put("is_hb", 0);
        sendApiCallEvent(c.a(), "c2", hashMap);
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity) {
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(String str) {
        this.userId = str;
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity, String str) {
        this.userId = str;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity, String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        show();
    }
}
