package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.adsdk.sf.gm.sf.lu;
import com.ironsource.C4761z5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes4.dex */
class nac {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static com.bytedance.adsdk.sf.gm.sf.wh pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        char c;
        lu.pcc pccVar;
        lu.sf sfVar;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str = null;
        com.bytedance.adsdk.sf.gm.sf.qf qfVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.gm gmVar = null;
        com.bytedance.adsdk.sf.gm.pcc.wh whVar = null;
        com.bytedance.adsdk.sf.gm.pcc.wh whVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar2 = null;
        lu.pcc pccVar2 = null;
        lu.sf sfVar3 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar4 = null;
        boolean z = false;
        com.bytedance.adsdk.sf.gm.pcc.oo ooVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            boolean z2 = z;
            com.bytedance.adsdk.sf.gm.pcc.sf sfVar5 = sfVar4;
            float f2 = f;
            switch (nextName.hashCode()) {
                case 100:
                    if (nextName.equals("d")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 101:
                    if (nextName.equals("e")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 115:
                    if (nextName.equals(CmcdData.Factory.STREAMING_FORMAT_SS)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    if (nextName.equals("w")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 11;
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
                        jsonReader.beginObject();
                        String str2 = null;
                        com.bytedance.adsdk.sf.gm.pcc.sf sfVar6 = null;
                        while (jsonReader.hasNext()) {
                            lu.sf sfVar7 = sfVar3;
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            lu.pcc pccVar3 = pccVar2;
                            if (nextName2.equals(C4761z5.q)) {
                                str2 = jsonReader.nextString();
                            } else if (nextName2.equals("v")) {
                                sfVar6 = oo.pcc(jsonReader, qfVar);
                            } else {
                                jsonReader.skipValue();
                            }
                            sfVar3 = sfVar7;
                            pccVar2 = pccVar3;
                        }
                        lu.pcc pccVar4 = pccVar2;
                        lu.sf sfVar8 = sfVar3;
                        jsonReader.endObject();
                        if (str2.equals("o")) {
                            sfVar5 = sfVar6;
                            sfVar3 = sfVar8;
                            pccVar2 = pccVar4;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                qfVar.pcc(true);
                                arrayList.add(sfVar6);
                            }
                            sfVar3 = sfVar8;
                            pccVar2 = pccVar4;
                        }
                    }
                    pccVar = pccVar2;
                    sfVar = sfVar3;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                        z = z2;
                        sfVar4 = sfVar5;
                        sfVar3 = sfVar;
                        f = f2;
                        pccVar2 = pccVar;
                        break;
                    } else {
                        sfVar4 = sfVar5;
                        z = z2;
                        sfVar3 = sfVar;
                        f = f2;
                        pccVar2 = pccVar;
                    }
                    break;
                case 1:
                    whVar2 = oo.gm(jsonReader, qfVar);
                    z = z2;
                    sfVar4 = sfVar5;
                    f = f2;
                    break;
                case 2:
                    jsonReader.beginObject();
                    int i = -1;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.hashCode();
                        if (nextName3.equals(CampaignEx.JSON_KEY_AD_K)) {
                            gmVar = oo.pcc(jsonReader, qfVar, i);
                        } else if (nextName3.equals("p")) {
                            i = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    z = z2;
                    sfVar4 = sfVar5;
                    f = f2;
                    break;
                case 3:
                    ooVar = oo.sf(jsonReader, qfVar);
                    z = z2;
                    sfVar4 = sfVar5;
                    f = f2;
                    break;
                case 4:
                    whVar = oo.gm(jsonReader, qfVar);
                    z = z2;
                    sfVar4 = sfVar5;
                    f = f2;
                    break;
                case 5:
                    qfVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.sf.gm.sf.qf.LINEAR : com.bytedance.adsdk.sf.gm.sf.qf.RADIAL;
                    z = z2;
                    sfVar4 = sfVar5;
                    f = f2;
                    break;
                case 6:
                    sfVar2 = oo.pcc(jsonReader, qfVar);
                    z = z2;
                    sfVar4 = sfVar5;
                    f = f2;
                    break;
                case 7:
                    z = jsonReader.nextBoolean();
                    sfVar4 = sfVar5;
                    f = f2;
                    break;
                case '\b':
                    pccVar2 = lu.pcc.values()[jsonReader.nextInt() - 1];
                    z = z2;
                    sfVar4 = sfVar5;
                    f = f2;
                    break;
                case '\t':
                    sfVar3 = lu.sf.values()[jsonReader.nextInt() - 1];
                    z = z2;
                    sfVar4 = sfVar5;
                    f = f2;
                    break;
                case '\n':
                    f = (float) jsonReader.nextDouble();
                    z = z2;
                    sfVar4 = sfVar5;
                    break;
                case 11:
                    str = jsonReader.nextString();
                    z = z2;
                    sfVar4 = sfVar5;
                    f = f2;
                    break;
                default:
                    jsonReader.skipValue();
                    pccVar = pccVar2;
                    sfVar = sfVar3;
                    sfVar4 = sfVar5;
                    z = z2;
                    sfVar3 = sfVar;
                    f = f2;
                    pccVar2 = pccVar;
                    break;
            }
        }
        lu.pcc pccVar5 = pccVar2;
        lu.sf sfVar9 = sfVar3;
        float f3 = f;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar10 = sfVar4;
        boolean z3 = z;
        if (ooVar == null) {
            ooVar = new com.bytedance.adsdk.sf.gm.pcc.oo(Collections.singletonList(new com.bytedance.adsdk.sf.qf.pcc(100)));
        }
        return new com.bytedance.adsdk.sf.gm.sf.wh(str, qfVar2, gmVar, ooVar, whVar, whVar2, sfVar2, pccVar5, sfVar9, f3, arrayList, sfVar10, z3);
    }
}
