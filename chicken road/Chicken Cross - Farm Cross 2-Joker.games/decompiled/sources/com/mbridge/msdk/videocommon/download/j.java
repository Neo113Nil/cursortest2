package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RewardVideoRefactorManager.java */
/* loaded from: classes6.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private AtomicBoolean f10340a;
    private AtomicBoolean b;

    /* compiled from: RewardVideoRefactorManager.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final j f10341a = new j();
    }

    public static j a() {
        return b.f10341a;
    }

    public boolean b(int i) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i != 94 && i != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f10340a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f10340a = new AtomicBoolean(s0.a().a("r_v_r_f_l", false));
        } catch (Exception e) {
            this.f10340a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e.getMessage());
            }
        }
        return this.f10340a.get();
    }

    private j() {
    }

    public boolean a(int i) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i != 94 && i != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.b = new AtomicBoolean(s0.a().a("r_v_r_f_c_r", false));
        } catch (Exception e) {
            this.b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e.getMessage());
            }
        }
        return this.b.get();
    }
}
