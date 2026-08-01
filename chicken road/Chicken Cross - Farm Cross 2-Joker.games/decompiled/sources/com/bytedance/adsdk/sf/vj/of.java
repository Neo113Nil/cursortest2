package com.bytedance.adsdk.sf.vj;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.adsdk.sf.gm.gm.vj;
import com.bytedance.adsdk.sf.ork;
import com.bytedance.adsdk.sf.qf;
import io.ktor.http.LinkHeader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class of {
    public static com.bytedance.adsdk.sf.qf pcc(JsonReader jsonReader) throws IOException {
        int i;
        char c;
        float pcc = com.bytedance.adsdk.sf.wh.wh.pcc();
        LongSparseArray<com.bytedance.adsdk.sf.gm.gm.vj> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.sf.gm.oo> sparseArray = new SparseArray<>();
        qf.gm gmVar = new qf.gm();
        qf.pcc pccVar = new qf.pcc();
        qf.sf sfVar = new qf.sf();
        com.bytedance.adsdk.sf.qf qfVar = new com.bytedance.adsdk.sf.qf();
        jsonReader.beginObject();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1408207997:
                    i = i3;
                    if (nextName.equals("assets")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1109732030:
                    i = i3;
                    if (nextName.equals("layers")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -865448777:
                    i = i3;
                    if (nextName.equals("globalEvent")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 104:
                    i = i3;
                    if (nextName.equals("h")) {
                        c = 3;
                        c2 = c;
                        break;
                    }
                    break;
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    i = i3;
                    if (nextName.equals("v")) {
                        c = 4;
                        c2 = c;
                        break;
                    }
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    i = i3;
                    if (nextName.equals("w")) {
                        c = 5;
                        c2 = c;
                        break;
                    }
                    break;
                case 3208:
                    i = i3;
                    if (nextName.equals(CmcdConfiguration.KEY_DEADLINE)) {
                        c = 6;
                        c2 = c;
                        break;
                    }
                    break;
                case 3276:
                    i = i3;
                    if (nextName.equals("fr")) {
                        c = 7;
                        c2 = c;
                        break;
                    }
                    break;
                case 3292:
                    i = i3;
                    if (nextName.equals("gc")) {
                        c = '\b';
                        c2 = c;
                        break;
                    }
                    break;
                case 3367:
                    i = i3;
                    if (nextName.equals("ip")) {
                        c = '\t';
                        c2 = c;
                        break;
                    }
                    break;
                case 3553:
                    i = i3;
                    if (nextName.equals("op")) {
                        c = '\n';
                        c2 = c;
                        break;
                    }
                    break;
                case 94623709:
                    i = i3;
                    if (nextName.equals("chars")) {
                        c = 11;
                        c2 = c;
                        break;
                    }
                    break;
                case 97615364:
                    i = i3;
                    if (nextName.equals("fonts")) {
                        c = '\f';
                        c2 = c;
                        break;
                    }
                    break;
                case 110364485:
                    i = i3;
                    if (nextName.equals("timer")) {
                        c = '\r';
                        c2 = c;
                        break;
                    }
                    break;
                case 839250809:
                    i = i3;
                    if (nextName.equals("markers")) {
                        c = 14;
                        c2 = c;
                        break;
                    }
                    break;
                default:
                    i = i3;
                    break;
            }
            switch (c2) {
                case 0:
                    pcc(jsonReader, qfVar, hashMap, hashMap2);
                    break;
                case 1:
                    pcc(jsonReader, qfVar, arrayList, longSparseArray);
                    break;
                case 2:
                    pcc(jsonReader, sfVar);
                    break;
                case 3:
                    i3 = jsonReader.nextInt();
                    continue;
                case 4:
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.sf.wh.wh.pcc(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        qfVar.pcc("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 5:
                    i2 = jsonReader.nextInt();
                    break;
                case 6:
                    str = jsonReader.nextString();
                    break;
                case 7:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case '\b':
                    pcc(jsonReader, pccVar);
                    break;
                case '\t':
                    f = (float) jsonReader.nextDouble();
                    break;
                case '\n':
                    f2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case 11:
                    pcc(jsonReader, qfVar, sparseArray);
                    break;
                case '\f':
                    pcc(jsonReader, hashMap3);
                    break;
                case '\r':
                    pcc(jsonReader, gmVar);
                    break;
                case 14:
                    pcc(jsonReader, arrayList2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            i3 = i;
        }
        jsonReader.endObject();
        qfVar.pcc(new Rect(0, 0, (int) (i2 * pcc), (int) (i3 * pcc)), f, f2, f3, arrayList, longSparseArray, hashMap, hashMap2, sparseArray, hashMap3, arrayList2, gmVar, str, pccVar, sfVar);
        return qfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void pcc(JsonReader jsonReader, qf.sf sfVar) {
        char c;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode == 3239) {
                    if (nextName.equals("el")) {
                        c = 1;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode != 107027) {
                    if (hashCode == 3237004 && nextName.equals("inel")) {
                        c = 0;
                        if (c != 0) {
                            sfVar.sf = new int[][]{new int[]{-1, -1}};
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                jsonReader.beginArray();
                                for (int i = 0; i < 2; i++) {
                                    if (jsonReader.hasNext()) {
                                        sfVar.sf[0][i] = jsonReader.nextInt();
                                    }
                                }
                                jsonReader.endArray();
                            }
                            jsonReader.endArray();
                        } else if (c == 1) {
                            sfVar.pcc = jsonReader.nextString();
                        } else if (c == 2) {
                            sfVar.gm = gm(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else {
                    if (nextName.equals("lel")) {
                        c = 2;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void pcc(JsonReader jsonReader, qf.pcc pccVar) {
        char c;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode == 3139) {
                    if (nextName.equals("be")) {
                        c = 1;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode == 3232) {
                    if (nextName.equals("ee")) {
                        c = 2;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode == 3571) {
                    if (nextName.equals("pc")) {
                        c = 3;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode != 3666) {
                    if (hashCode == 98713 && nextName.equals("cpf")) {
                        c = 4;
                        if (c != 0) {
                            pccVar.pcc = jsonReader.nextInt();
                        } else if (c == 1) {
                            pccVar.sf = sf(jsonReader);
                        } else if (c == 2) {
                            pccVar.gm = sf(jsonReader);
                        } else if (c == 3) {
                            pccVar.oo = jsonReader.nextInt();
                        } else if (c == 4) {
                            sf(jsonReader, pccVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else {
                    if (nextName.equals("se")) {
                        c = 0;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void sf(JsonReader jsonReader, qf.pcc pccVar) {
        char c;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode == 3239) {
                    if (nextName.equals("el")) {
                        c = 1;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else if (hashCode != 3276) {
                    if (hashCode == 107027 && nextName.equals("lel")) {
                        c = 2;
                        if (c != 0) {
                            pccVar.vj = jsonReader.nextInt();
                        } else if (c == 1) {
                            pccVar.wh = jsonReader.nextString();
                        } else if (c == 2) {
                            pccVar.qf = gm(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                } else {
                    if (nextName.equals("fr")) {
                        c = 0;
                        if (c != 0) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
        }
    }

    private static Map<String, Object> sf(JsonReader jsonReader) throws IOException {
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("lel")) {
                hashMap.put("lel", gm(jsonReader));
            } else if (nextName.equals("lottie_back")) {
                JSONObject jSONObject = new JSONObject();
                hashMap.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.hashCode();
                    if (nextName2.equals("hd")) {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException unused) {
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        Object remove = hashMap.remove("lottie_back");
        if (remove instanceof JSONObject) {
            Object obj = hashMap.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(remove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(remove);
                hashMap.put("lel", jSONArray);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void pcc(JsonReader jsonReader, qf.gm gmVar) {
        char c;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode == 3123) {
                    if (nextName.equals("at")) {
                        c = 3;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                } else if (hashCode == 3239) {
                    if (nextName.equals("el")) {
                        c = 5;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                } else if (hashCode == 3355) {
                    if (nextName.equals("id")) {
                        c = 1;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                } else if (hashCode == 3418) {
                    if (nextName.equals("ke")) {
                        c = 0;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                } else if (hashCode == 3704) {
                    if (nextName.equals("tl")) {
                        c = 2;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                } else if (hashCode != 107027) {
                    if (hashCode == 3237004 && nextName.equals("inel")) {
                        c = 4;
                        switch (c) {
                            case 0:
                                gmVar.pcc = jsonReader.nextInt();
                                break;
                            case 1:
                                gmVar.sf = jsonReader.nextString();
                                break;
                            case 2:
                                gmVar.gm = jsonReader.nextString();
                                break;
                            case 3:
                                gmVar.oo = jsonReader.nextString();
                                break;
                            case 4:
                                gmVar.vj = new int[]{-1, -1};
                                jsonReader.beginArray();
                                for (int i = 0; i < 2; i++) {
                                    if (jsonReader.hasNext()) {
                                        gmVar.vj[i] = jsonReader.nextInt();
                                    }
                                }
                                jsonReader.endArray();
                                break;
                            case 5:
                                gmVar.wh = jsonReader.nextString();
                                break;
                            case 6:
                                gmVar.qf = gm(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                } else {
                    if (nextName.equals("lel")) {
                        c = 6;
                        switch (c) {
                        }
                    }
                    c = 65535;
                    switch (c) {
                    }
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, List<com.bytedance.adsdk.sf.gm.gm.vj> list, LongSparseArray<com.bytedance.adsdk.sf.gm.gm.vj> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.sf.gm.gm.vj pcc = tz.pcc(jsonReader, qfVar);
            pcc.vh();
            vj.pcc pccVar = vj.pcc.IMAGE;
            list.add(pcc);
            longSparseArray.put(pcc.vj(), pcc);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, Map<String, List<com.bytedance.adsdk.sf.gm.gm.vj>> map, Map<String, com.bytedance.adsdk.sf.ork> map2) throws IOException {
        char c;
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            List<ork.pcc> list = null;
            String str5 = null;
            int[][] iArr = null;
            JSONArray jSONArray = null;
            int i = 0;
            int i2 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                switch (nextName.hashCode()) {
                    case -1109732030:
                        if (nextName.equals("layers")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 104:
                        if (nextName.equals("h")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 112:
                        if (nextName.equals("p")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case ASSET_FAILED_STATUS_CODE_VALUE:
                        if (nextName.equals("u")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case JSON_ENCODE_ERROR_VALUE:
                        if (nextName.equals("w")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3239:
                        if (nextName.equals("el")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3355:
                        if (nextName.equals("id")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3695:
                        if (nextName.equals("tc")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 107027:
                        if (nextName.equals("lel")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 112793:
                        if (nextName.equals(LinkHeader.Parameters.Rel)) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3237004:
                        if (nextName.equals("inel")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.sf.gm.gm.vj pcc = tz.pcc(jsonReader, qfVar);
                            longSparseArray.put(pcc.vj(), pcc);
                            arrayList.add(pcc);
                        }
                        jsonReader.endArray();
                        break;
                    case 1:
                        i2 = jsonReader.nextInt();
                        break;
                    case 2:
                        str2 = jsonReader.nextString();
                        break;
                    case 3:
                        str3 = jsonReader.nextString();
                        break;
                    case 4:
                        i = jsonReader.nextInt();
                        break;
                    case 5:
                        str5 = jsonReader.nextString();
                        break;
                    case 6:
                        str = jsonReader.nextString();
                        break;
                    case 7:
                        jsonReader.beginArray();
                        list = oo(jsonReader);
                        jsonReader.endArray();
                        break;
                    case '\b':
                        jSONArray = gm(jsonReader);
                        break;
                    case '\t':
                        str4 = jsonReader.nextString();
                        break;
                    case '\n':
                        iArr = new int[][]{new int[]{-1, -1}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i3 = 0; i3 < 2; i3++) {
                                if (jsonReader.hasNext()) {
                                    iArr[0][i3] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                com.bytedance.adsdk.sf.ork orkVar = new com.bytedance.adsdk.sf.ork(i, i2, str, str2, str3, str4, list, str5, iArr, jSONArray);
                map2.put(orkVar.kj(), orkVar);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static JSONArray gm(JsonReader jsonReader) {
        char c;
        JSONArray jSONArray = new JSONArray();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3324) {
                        if (hashCode == 116753 && nextName.equals("vid")) {
                            c = 0;
                        }
                        c = 65535;
                    } else {
                        if (nextName.equals("hd")) {
                            c = 1;
                        }
                        c = 65535;
                    }
                    if (c == 0) {
                        jSONObject.put("vid", jsonReader.nextString());
                    } else if (c == 1) {
                        try {
                            jSONObject.put("hd", jsonReader.nextInt());
                        } catch (JSONException unused) {
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<ork.pcc> oo(JsonReader jsonReader) {
        char c;
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                ork.pcc pccVar = new ork.pcc();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode == 99) {
                        if (nextName.equals("c")) {
                            c = 3;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode == 102) {
                        if (nextName.equals("f")) {
                            c = 4;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode == 108) {
                        if (nextName.equals(CmcdData.Factory.STREAM_TYPE_LIVE)) {
                            c = 0;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode == 115) {
                        if (nextName.equals(CmcdData.Factory.STREAMING_FORMAT_SS)) {
                            c = 2;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode == 3153) {
                        if (nextName.equals(CmcdConfiguration.KEY_BUFFER_STARVATION)) {
                            c = 5;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else if (hashCode != 3449) {
                        if (hashCode == 96670 && nextName.equals("ali")) {
                            c = 6;
                            switch (c) {
                                case 0:
                                    pccVar.pcc = jsonReader.nextInt();
                                    break;
                                case 1:
                                    pccVar.sf = jsonReader.nextInt();
                                    break;
                                case 2:
                                    pccVar.vj = jsonReader.nextInt();
                                    break;
                                case 3:
                                    pccVar.gm = jsonReader.nextString();
                                    break;
                                case 4:
                                    pccVar.oo = jsonReader.nextString();
                                    break;
                                case 5:
                                    pccVar.wh = jsonReader.nextInt();
                                    break;
                                case 6:
                                    pccVar.qf = jsonReader.nextString();
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    } else {
                        if (nextName.equals("le")) {
                            c = 1;
                            switch (c) {
                            }
                        }
                        c = 65535;
                        switch (c) {
                        }
                    }
                }
                jsonReader.endObject();
                arrayList.add(pccVar);
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void pcc(JsonReader jsonReader, Map<String, com.bytedance.adsdk.sf.gm.gm> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("list")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.sf.gm.gm pcc = gbb.pcc(jsonReader);
                    map.put(pcc.sf(), pcc);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, SparseArray<com.bytedance.adsdk.sf.gm.oo> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.sf.gm.oo pcc = hc.pcc(jsonReader, qfVar);
            sparseArray.put(pcc.hashCode(), pcc);
        }
        jsonReader.endArray();
    }

    private static void pcc(JsonReader jsonReader, List<com.bytedance.adsdk.sf.gm.wh> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float f = 0.0f;
            String str = null;
            float f2 = 0.0f;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                switch (nextName) {
                    case "cm":
                        str = jsonReader.nextString();
                        break;
                    case "dr":
                        f2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        f = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.sf.gm.wh(str, f, f2));
        }
        jsonReader.endArray();
    }
}
