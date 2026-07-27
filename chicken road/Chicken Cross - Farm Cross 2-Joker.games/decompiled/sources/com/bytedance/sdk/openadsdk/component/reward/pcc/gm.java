package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.model.of;

/* loaded from: classes4.dex */
public class gm {
    public static void pcc(sf sfVar, Intent intent, Bundle bundle) {
        pcc(intent, sfVar);
        pcc(bundle, sfVar);
    }

    public static void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.sf sfVar, Intent intent, Bundle bundle) {
        pcc(intent, sfVar);
        pcc(bundle, sfVar);
    }

    public static of pcc(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.component.reward.gm.vj vjVar) {
        com.bytedance.sdk.openadsdk.core.model.pcc sf = atb.pcc().sf(atb.pcc(intent));
        of ork = sf != null ? sf.ork() : null;
        if (vjVar != null) {
            vjVar.pcc(bundle);
        }
        if (bundle != null) {
            try {
                int i = bundle.getInt("meta_index", -1);
                ork = atb.pcc().pcc(i);
                new StringBuilder("getMaterialMetaData metaIndex =").append(i).append(",materialMeta =").append(ork);
            } catch (Throwable th) {
                lo.pcc("TTAD.RFDM", "", th);
            }
        }
        if (ork != null) {
            ork.pcc(ork.kz(), 7);
        }
        return ork;
    }

    public static of pcc(Intent intent, Bundle bundle, com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        com.bytedance.sdk.openadsdk.core.model.pcc sf = atb.pcc().sf(atb.pcc(intent));
        of ork = sf != null ? sf.ork() : null;
        if (sfVar != null) {
            sfVar.pcc(bundle);
        }
        atb.pcc().vj();
        if (bundle != null) {
            try {
                int i = bundle.getInt("meta_index", -1);
                ork = atb.pcc().pcc(i);
                new StringBuilder("getMaterialMetaData metaIndex =").append(i).append(",materialMeta =").append(ork);
            } catch (Throwable th) {
                lo.pcc("TTAD.RFDM", "", th);
            }
        }
        if (ork != null) {
            ork.pcc(ork.kz(), 7);
        }
        return ork;
    }

    public static void pcc(Intent intent, sf sfVar) {
        if (intent == null) {
            return;
        }
        sfVar.fum.gm(intent.getBooleanExtra("video_is_cached", false));
        sfVar.iv = intent.getStringExtra("multi_process_listener_key");
        sfVar.ptr = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void pcc(Intent intent, com.bytedance.sdk.openadsdk.component.reward.gm.sf sfVar) {
        if (intent == null) {
            return;
        }
        sfVar.sf(intent.getBooleanExtra("video_is_cached", false));
        sfVar.sf = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void pcc(Bundle bundle, sf sfVar) {
        if (bundle == null) {
            return;
        }
        sfVar.iv = bundle.getString("multi_process_listener_key");
        sfVar.fum.gm(bundle.getBoolean("video_is_cached", false));
        sfVar.xb = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            sfVar.fum.sf(bundle.getLong("video_current", 0L));
        }
        sfVar.pcc(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void pcc(Bundle bundle, com.bytedance.sdk.openadsdk.component.reward.gm.sf sfVar) {
        if (bundle == null) {
            return;
        }
        sfVar.sf(bundle.getBoolean("video_is_cached", false));
    }

    public static void pcc(sf sfVar, Bundle bundle, int i) {
        if (bundle == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i);
            bundle.putString("multi_process_listener_key", sfVar.iv);
            bundle.putBoolean("video_is_cached", sfVar.fum.pq());
            bundle.putLong("video_current", sfVar.fum.hc());
            bundle.putBoolean("is_mute", sfVar.xb);
            bundle.putBoolean("has_show_skip_btn", sfVar.hoh);
        } catch (Throwable th) {
            lo.pcc("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    public static void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.sf sfVar, Bundle bundle, int i) {
        if (bundle == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i);
            if (sfVar != null) {
                bundle.putBoolean("video_is_cached", sfVar.jr());
            }
        } catch (Throwable th) {
            lo.pcc("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    public static void pcc(of ofVar, Intent intent, Bundle bundle, int i) {
        if (bundle == null || ofVar == null) {
            return;
        }
        try {
            bundle.putInt("meta_index", i);
            new StringBuilder("onSaveInstanceStateForOneMoreAd metaIndex =").append(i).append(",materialMeta =").append(ofVar);
            if (intent != null) {
                bundle.putString("multi_process_listener_key", intent.getStringExtra("multi_process_listener_key"));
                bundle.putBoolean("video_is_cached", intent.getBooleanExtra("video_is_cached", false));
            }
        } catch (Throwable th) {
            lo.pcc("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    public static void pcc(Intent intent, Activity activity, boolean z, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, String str) {
        int rotation;
        if (activity == null) {
            intent.addFlags(268435456);
        } else {
            try {
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception e) {
                lo.pcc("TTAD.RFDM", "", e);
            }
            intent.putExtra("orientation_angle", rotation);
            intent.putExtra("video_is_cached", z);
            atb.pcc().vj();
            intent.putExtra("meta_index", atb.pcc().pcc(pccVar));
            intent.putExtra("single_process_listener_key", str);
        }
        rotation = 0;
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("video_is_cached", z);
        atb.pcc().vj();
        intent.putExtra("meta_index", atb.pcc().pcc(pccVar));
        intent.putExtra("single_process_listener_key", str);
    }
}
