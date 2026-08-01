package com.mbridge.msdk.out.strategy.component;

import android.app.Activity;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.manager.a;
import com.mbridge.msdk.config.manager.callback.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.strategy.IBidVideoAdStrategy;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class BidComponentStrategy extends BaseComponentStrategy implements IBidVideoAdStrategy {
    public BidComponentStrategy(String str, String str2, int i) {
        super(str, str2, i);
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public boolean isBidReady() {
        try {
            if (a.c().e() || a.c().a(a.p)) {
                return isReadyWithSyncWait(true);
            }
            return false;
        } catch (Exception e) {
            q0.b("BaseComponentStrategy", "ComponentBidStrategy isBidReady error: " + e.getMessage(), e);
            return false;
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void loadFormSelfFilling() {
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void loadFromBid(String str) {
        try {
            if (!a.c().e() && !a.c().a(a.q)) {
                b bVar = this.mComponentCallbackListener;
                if (bVar != null) {
                    bVar.onVideoLoadFail(new MBridgeIds(this.placementId, this.unitId), "Unable to load");
                    return;
                }
                return;
            }
            this.bidToken = str;
            HashMap hashMap = new HashMap();
            hashMap.put("bid_token", str);
            hashMap.put("is_hb", 1);
            sendApiCallEvent(c.a(), "c1", hashMap);
        } catch (Exception e) {
            q0.b("BaseComponentStrategy", "ComponentBidStrategy loadFromBid error: " + e.getMessage(), e);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid() {
        try {
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
            hashMap.put("bid_token", this.bidToken);
            hashMap.put("is_hb", 1);
            sendApiCallEvent(c.a(), "c2", hashMap);
        } catch (Exception e) {
            q0.b("BaseComponentStrategy", "ComponentBidStrategy showFromBid error: " + e.getMessage(), e);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity) {
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str) {
        this.userId = str;
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity, String str) {
        this.userId = str;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity, String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        showFromBid();
    }
}
