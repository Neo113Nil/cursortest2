package com.bytedance.adsdk.sf.vj;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.sf.gm.sf;
import java.io.IOException;

/* loaded from: classes4.dex */
public class vy implements lrr<com.bytedance.adsdk.sf.gm.sf> {
    public static final vy pcc = new vy();

    private vy() {
    }

    @Override // com.bytedance.adsdk.sf.vj.lrr
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.sf.gm.sf sf(JsonReader jsonReader, float f) throws IOException {
        sf.pcc pccVar = sf.pcc.CENTER;
        jsonReader.beginObject();
        sf.pcc pccVar2 = pccVar;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "f":
                    str2 = jsonReader.nextString();
                    break;
                case "j":
                    int nextInt = jsonReader.nextInt();
                    if (nextInt > sf.pcc.CENTER.ordinal() || nextInt < 0) {
                        pccVar2 = sf.pcc.CENTER;
                        break;
                    } else {
                        pccVar2 = sf.pcc.values()[nextInt];
                        break;
                    }
                    break;
                case "s":
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case "t":
                    str = jsonReader.nextString();
                    break;
                case "fc":
                    i2 = gpj.pcc(jsonReader);
                    break;
                case "lh":
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case "ls":
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case "of":
                    z = jsonReader.nextBoolean();
                    break;
                case "ps":
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case "sc":
                    i3 = gpj.pcc(jsonReader);
                    break;
                case "sw":
                    f5 = (float) jsonReader.nextDouble();
                    break;
                case "sz":
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case "tr":
                    i = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.sf.gm.sf(str, str2, f2, pccVar2, i, f3, f4, i2, i3, f5, z, pointF, pointF2);
    }
}
