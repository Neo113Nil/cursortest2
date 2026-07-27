package com.bytedance.sdk.openadsdk.tmg.pcc;

import com.bytedance.sdk.openadsdk.core.mu;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class tmg extends com.bytedance.sdk.component.pcc.lu<JSONObject, JSONObject> {
    private static final HashSet<String> pcc = new HashSet<>(Arrays.asList("popupShow", "popupDismiss", "changeCountdownStatus", "getCurrentCountdownStatus", "popupRenderDidFinish"));
    private final mu sf;

    public tmg(mu muVar) {
        this.sf = muVar;
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, mu muVar) {
        jrVar.pcc(pcc, new tmg(muVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.pcc.oo
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        str.hashCode();
        switch (str) {
            case "popupDismiss":
                this.sf.dax();
                return null;
            case "popupShow":
                this.sf.jr();
                return null;
            case "getCurrentCountdownStatus":
                return this.sf.nac();
            case "popupRenderDidFinish":
                this.sf.lu();
                return null;
            case "changeCountdownStatus":
                this.sf.vh(jSONObject);
                return null;
            default:
                return null;
        }
    }
}
