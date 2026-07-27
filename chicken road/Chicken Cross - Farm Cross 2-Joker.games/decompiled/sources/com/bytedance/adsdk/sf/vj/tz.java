package com.bytedance.adsdk.sf.vj;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.adsdk.sf.gm.gm.vj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes4.dex */
public class tz {
    public static com.bytedance.adsdk.sf.gm.gm.vj pcc(com.bytedance.adsdk.sf.qf qfVar) {
        Rect oo = qfVar.oo();
        return new com.bytedance.adsdk.sf.gm.gm.vj(Collections.emptyList(), qfVar, "__container", -1L, vj.pcc.PRE_COMP, -1L, null, Collections.emptyList(), new com.bytedance.adsdk.sf.gm.pcc.tmg(), 0, 0, 0, 0.0f, 0.0f, oo.width(), oo.height(), null, null, Collections.emptyList(), vj.sf.NONE, null, false, null, null);
    }

    public static com.bytedance.adsdk.sf.gm.gm.vj pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        ArrayList arrayList;
        vj.sf sfVar = vj.sf.NONE;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        jsonReader.beginObject();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        vj.sf sfVar2 = sfVar;
        vj.pcc pccVar = null;
        String str = null;
        com.bytedance.adsdk.sf.gm.pcc.tmg tmgVar = null;
        com.bytedance.adsdk.sf.gm.pcc.ork orkVar = null;
        com.bytedance.adsdk.sf.gm.pcc.vh vhVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar3 = null;
        com.bytedance.adsdk.sf.gm.sf.pcc pccVar2 = null;
        ork orkVar2 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        long j2 = -1;
        float f5 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        float f6 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "parent":
                    j2 = jsonReader.nextInt();
                    break;
                case "shapes":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.sf.gm.sf.gm pcc = kj.pcc(jsonReader, qfVar);
                        if (pcc != null) {
                            arrayList3.add(pcc);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "h":
                    f3 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.sf.wh.wh.pcc());
                    break;
                case "t":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        if (nextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                vhVar = sf.pcc(jsonReader, qfVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (nextName2.equals("d")) {
                            orkVar = oo.wh(jsonReader, qfVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "w":
                    f2 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.sf.wh.wh.pcc());
                    break;
                case "cl":
                    str3 = jsonReader.nextString();
                    break;
                case "ef":
                    jsonReader.beginArray();
                    ArrayList arrayList4 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            nextName3.hashCode();
                            if (nextName3.equals("nm")) {
                                arrayList4.add(jsonReader.nextString());
                            } else if (nextName3.equals("ty")) {
                                int nextInt = jsonReader.nextInt();
                                if (nextInt == 29) {
                                    pccVar2 = vj.pcc(jsonReader, qfVar);
                                } else if (nextInt == 25) {
                                    orkVar2 = new vh().pcc(jsonReader, qfVar);
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    qfVar.pcc("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList4)));
                    break;
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "ip":
                    f6 = (float) jsonReader.nextDouble();
                    break;
                case "ks":
                    tmgVar = gm.pcc(jsonReader, qfVar);
                    break;
                case "nm":
                    str2 = jsonReader.nextString();
                    break;
                case "op":
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case "sc":
                    i3 = Color.parseColor(jsonReader.nextString());
                    break;
                case "sh":
                    i2 = (int) (jsonReader.nextInt() * com.bytedance.adsdk.sf.wh.wh.pcc());
                    break;
                case "sr":
                    f5 = (float) jsonReader.nextDouble();
                    break;
                case "st":
                    f = (float) jsonReader.nextDouble();
                    break;
                case "sw":
                    i = (int) (jsonReader.nextInt() * com.bytedance.adsdk.sf.wh.wh.pcc());
                    break;
                case "tm":
                    sfVar3 = oo.pcc(jsonReader, qfVar, false);
                    break;
                case "tt":
                    int nextInt2 = jsonReader.nextInt();
                    if (nextInt2 >= vj.sf.values().length) {
                        qfVar.pcc("Unsupported matte type: ".concat(String.valueOf(nextInt2)));
                        break;
                    } else {
                        sfVar2 = vj.sf.values()[nextInt2];
                        int i4 = AnonymousClass1.pcc[sfVar2.ordinal()];
                        if (i4 == 1) {
                            qfVar.pcc("Unsupported matte type: Luma");
                        } else if (i4 == 2) {
                            qfVar.pcc("Unsupported matte type: Luma Inverted");
                        }
                        qfVar.pcc(1);
                        break;
                    }
                case "ty":
                    int nextInt3 = jsonReader.nextInt();
                    if (nextInt3 < vj.pcc.UNKNOWN.ordinal()) {
                        pccVar = vj.pcc.values()[nextInt3];
                        break;
                    } else {
                        pccVar = vj.pcc.UNKNOWN;
                        break;
                    }
                case "ind":
                    j = jsonReader.nextInt();
                    break;
                case "refId":
                    str = jsonReader.nextString();
                    break;
                case "masksProperties":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList2.add(yt.pcc(jsonReader, qfVar));
                    }
                    qfVar.pcc(arrayList2.size());
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList5 = new ArrayList();
        if (f6 > 0.0f) {
            arrayList = arrayList2;
            arrayList5.add(new com.bytedance.adsdk.sf.qf.pcc(qfVar, valueOf, valueOf, null, 0.0f, Float.valueOf(f6)));
        } else {
            arrayList = arrayList2;
        }
        if (f4 <= 0.0f) {
            f4 = qfVar.qf();
        }
        arrayList5.add(new com.bytedance.adsdk.sf.qf.pcc(qfVar, valueOf2, valueOf2, null, f6, Float.valueOf(f4)));
        arrayList5.add(new com.bytedance.adsdk.sf.qf.pcc(qfVar, valueOf, valueOf, null, f4, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            qfVar.pcc("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.sf.gm.gm.vj(arrayList3, qfVar, str2, j, pccVar, j2, str, arrayList, tmgVar, i, i2, i3, f5, f, f2, f3, orkVar, vhVar, arrayList5, sfVar2, sfVar3, z, pccVar2, orkVar2);
    }

    /* renamed from: com.bytedance.adsdk.sf.vj.tz$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[vj.sf.values().length];
            pcc = iArr;
            try {
                iArr[vj.sf.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[vj.sf.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
