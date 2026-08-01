package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bykv.vk.openvk.pcc.pcc.pcc.qf.gm;
import com.bytedance.sdk.component.qf.gm.oo;
import com.bytedance.sdk.component.utils.jr;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.core.zti;
import com.bytedance.sdk.openadsdk.utils.kun;

/* loaded from: classes4.dex */
public final class PAGConfig implements InitConfig {
    private static String qf;
    private String kj;
    private String pcc;
    private boolean sf;
    private String vj;
    private String wh;
    private int gm = -1;
    private int oo = 0;

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.wh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(String str) {
        this.wh = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.pcc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(String str) {
        this.pcc = str;
    }

    public boolean getDebugLog() {
        return this.sf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(boolean z) {
        this.sf = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(int i) {
        this.gm = i;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getPA() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.oo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(int i) {
        this.oo = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(String str) {
        this.vj = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        if (TextUtils.isEmpty(this.vj)) {
            return qf;
        }
        return this.vj;
    }

    public static void setPAConsent(int i) {
        if (kun.vh("setPAConsent")) {
            if (i == 1 || i == 0) {
                zti.pcc().oo(i);
            } else {
                zti.pcc().oo(-2);
            }
        }
    }

    public static int getPAConsent() {
        if (kun.vh("getPAConsent")) {
            return zti.pcc().vj();
        }
        return -1;
    }

    public static void debugLog(boolean z) {
        if (zti.pcc() != null) {
            if (z) {
                zti.pcc().sf(1);
                zti.pcc().sf();
                return;
            }
            zti.pcc().sf(0);
            oo.pcc(oo.pcc.OFF);
            jr.sf();
            gm.sf();
            lo.sf();
        }
    }

    public static void setAppIconId(int i) {
        if (zti.pcc() != null) {
            zti.pcc().gm(i);
        }
    }

    public static void setUserData(String str) {
        if (zti.pcc() != null) {
            zti.pcc().sf(str);
        }
    }

    public static void setPackageName(String str) {
        qf = str;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAdxId() {
        return this.kj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo(String str) {
        this.kj = str;
    }

    public static class Builder {
        private String pcc;
        private String qf;
        private boolean sf;
        private String[] vj;
        private String wh;
        private int gm = -1;
        private int oo = 0;
        private String kj = "";

        @Deprecated
        public Builder appIcon(int i) {
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            return this;
        }

        public Builder useTextureView(boolean z) {
            return this;
        }

        public Builder setUserData(String str) {
            this.qf = str;
            return this;
        }

        public Builder appId(String str) {
            this.pcc = str;
            return this;
        }

        public Builder debugLog(boolean z) {
            this.sf = z;
            return this;
        }

        public Builder setPAConsent(int i) {
            if (i == 0 || i == 1) {
                this.gm = i;
            } else {
                this.gm = -2;
            }
            return this;
        }

        public Builder setAdxId(String str) {
            this.kj = str;
            return this;
        }

        public Builder titleBarTheme(int i) {
            this.oo = i;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.vj = strArr;
            return this;
        }

        public Builder setPackageName(String str) {
            this.wh = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.sf(this.pcc);
            pAGConfig.sf(this.oo);
            pAGConfig.pcc(this.gm);
            pAGConfig.pcc(this.sf);
            pAGConfig.gm(this.wh);
            pAGConfig.pcc(this.qf);
            pAGConfig.oo(this.kj);
            return pAGConfig;
        }
    }
}
