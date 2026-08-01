package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class of {
    private static sf pcc;

    public interface sf {
        void pcc(String str, boolean z, pcc pccVar);
    }

    public static void pcc(sf sfVar) {
        pcc = sfVar;
    }

    public static void pcc(String str, pcc pccVar) {
        sf sfVar = pcc;
        if (sfVar == null) {
            return;
        }
        sfVar.pcc(str, false, pccVar);
    }

    public static abstract class pcc {
        abstract JSONObject pcc();

        public final String sf() {
            try {
                return pcc().toString();
            } catch (Exception unused) {
                return "";
            }
        }
    }
}
