package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.mbridge.msdk.foundation.tools.SameMD5;
import io.ktor.sse.ServerSentEventKt;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class gm {
    private static HashMap<String, ArrayList<String>> pcc = new HashMap<>();

    public static ArrayList<String> pcc(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (pcc.get(str) != null) {
                return pcc.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : sf(context, packageName)) {
                    String str2 = "error!";
                    if (SameMD5.TAG.equals(str)) {
                        str2 = pcc(signature, SameMD5.TAG);
                    } else if ("SHA1".equals(str)) {
                        str2 = pcc(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        str2 = pcc(signature, "SHA256");
                    }
                    arrayList.add(str2);
                }
            } catch (Exception unused) {
            }
            pcc.put(str, arrayList);
        }
        return arrayList;
    }

    public static String pcc(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> pcc2 = pcc(context, "SHA1");
        if (pcc2 != null && pcc2.size() != 0) {
            for (int i = 0; i < pcc2.size(); i++) {
                sb.append(pcc2.get(i));
                if (i < pcc2.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static Signature[] sf(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String pcc(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] digest = messageDigest.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                sb.append(ServerSentEventKt.COLON);
            }
            return sb.substring(0, sb.length() - 1).toString();
        } catch (Exception unused) {
            return "error!";
        }
    }
}
