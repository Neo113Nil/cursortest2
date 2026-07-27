package com.bytedance.adsdk.sf.vj;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
class lo {
    private static final Interpolator pcc = new LinearInterpolator();
    private static SparseArray<WeakReference<Interpolator>> sf;

    lo() {
    }

    private static SparseArray<WeakReference<Interpolator>> pcc() {
        if (sf == null) {
            sf = new SparseArray<>();
        }
        return sf;
    }

    private static WeakReference<Interpolator> pcc(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (lo.class) {
            weakReference = pcc().get(i);
        }
        return weakReference;
    }

    private static void pcc(int i, WeakReference<Interpolator> weakReference) {
        synchronized (lo.class) {
            sf.put(i, weakReference);
        }
    }

    static <T> com.bytedance.adsdk.sf.qf.pcc<T> pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, float f, lrr<T> lrrVar, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return sf(qfVar, jsonReader, f, lrrVar);
        }
        if (z) {
            return pcc(qfVar, jsonReader, f, lrrVar);
        }
        return pcc(jsonReader, f, lrrVar);
    }

    private static <T> com.bytedance.adsdk.sf.qf.pcc<T> pcc(com.bytedance.adsdk.sf.qf qfVar, JsonReader jsonReader, float f, lrr<T> lrrVar) throws IOException {
        Interpolator pcc2;
        jsonReader.beginObject();
        PointF pointF = null;
        T t = null;
        T t2 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "e":
                    t = lrrVar.sf(jsonReader, f);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case "i":
                    pointF4 = gpj.sf(jsonReader, 1.0f);
                    break;
                case "o":
                    pointF = gpj.sf(jsonReader, 1.0f);
                    break;
                case "s":
                    t2 = lrrVar.sf(jsonReader, f);
                    break;
                case "t":
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointF3 = gpj.sf(jsonReader, f);
                    break;
                case "to":
                    pointF2 = gpj.sf(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            t = t2;
        } else if (pointF != null && pointF4 != null) {
            pcc2 = pcc(pointF, pointF4);
            com.bytedance.adsdk.sf.qf.pcc<T> pccVar = new com.bytedance.adsdk.sf.qf.pcc<>(qfVar, t2, t, pcc2, f2, null);
            pccVar.kj = pointF2;
            pccVar.vy = pointF3;
            return pccVar;
        }
        pcc2 = pcc;
        com.bytedance.adsdk.sf.qf.pcc<T> pccVar2 = new com.bytedance.adsdk.sf.qf.pcc<>(qfVar, t2, t, pcc2, f2, null);
        pccVar2.kj = pointF2;
        pccVar2.vy = pointF3;
        return pccVar2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0262 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static <T> com.bytedance.adsdk.sf.qf.pcc<T> sf(com.bytedance.adsdk.sf.qf qfVar, JsonReader jsonReader, float f, lrr<T> lrrVar) throws IOException {
        Interpolator pcc2;
        Interpolator pcc3;
        T t;
        Interpolator interpolator;
        PointF pointF;
        com.bytedance.adsdk.sf.qf.pcc<T> pccVar;
        float f2;
        PointF pointF2;
        PointF pointF3;
        T t2;
        String str;
        String str2;
        T t3;
        jsonReader.beginObject();
        PointF pointF4 = null;
        boolean z = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t4 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f3 = 0.0f;
        PointF pointF11 = null;
        T t5 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        c = 0;
                        break;
                    }
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        c = 1;
                        break;
                    }
                    break;
                case 105:
                    if (nextName.equals("i")) {
                        c = 2;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 3;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals(CmcdData.Factory.STREAMING_FORMAT_SS)) {
                        c = 4;
                        break;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3701:
                    if (nextName.equals("ti")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3707:
                    if (nextName.equals("to")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            String str3 = "y";
            String str4 = "x";
            switch (c) {
                case 0:
                    f2 = f3;
                    t5 = lrrVar.sf(jsonReader, f);
                    f3 = f2;
                    break;
                case 1:
                    pointF2 = pointF4;
                    f2 = f3;
                    pointF3 = pointF11;
                    t2 = t4;
                    z = jsonReader.nextInt() == 1;
                    t4 = t2;
                    pointF11 = pointF3;
                    pointF4 = pointF2;
                    f3 = f2;
                    break;
                case 2:
                    pointF2 = pointF4;
                    f2 = f3;
                    pointF3 = pointF11;
                    t2 = t4;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals(str4)) {
                                str = str3;
                                str2 = str4;
                                if (jsonReader.peek() == JsonToken.NUMBER) {
                                    f6 = (float) jsonReader.nextDouble();
                                    f4 = f6;
                                } else {
                                    jsonReader.beginArray();
                                    f4 = (float) jsonReader.nextDouble();
                                    f6 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : f4;
                                    jsonReader.endArray();
                                }
                            } else if (nextName2.equals(str3)) {
                                if (jsonReader.peek() == JsonToken.NUMBER) {
                                    str = str3;
                                    str2 = str4;
                                    f7 = (float) jsonReader.nextDouble();
                                    f5 = f7;
                                } else {
                                    str = str3;
                                    str2 = str4;
                                    jsonReader.beginArray();
                                    f5 = (float) jsonReader.nextDouble();
                                    f7 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : f5;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            str3 = str;
                            str4 = str2;
                        }
                        PointF pointF12 = new PointF(f4, f5);
                        PointF pointF13 = new PointF(f6, f7);
                        jsonReader.endObject();
                        pointF10 = pointF13;
                        pointF9 = pointF12;
                    } else {
                        pointF6 = gpj.sf(jsonReader, f);
                    }
                    t4 = t2;
                    pointF11 = pointF3;
                    pointF4 = pointF2;
                    f3 = f2;
                    break;
                case 3:
                    pointF3 = pointF11;
                    pointF2 = pointF4;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        while (jsonReader.hasNext()) {
                            float f12 = f3;
                            String nextName3 = jsonReader.nextName();
                            nextName3.hashCode();
                            if (nextName3.equals("x")) {
                                if (jsonReader.peek() == JsonToken.NUMBER) {
                                    t3 = t4;
                                    f10 = (float) jsonReader.nextDouble();
                                    f8 = f10;
                                } else {
                                    t3 = t4;
                                    jsonReader.beginArray();
                                    f8 = (float) jsonReader.nextDouble();
                                    f10 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : f8;
                                    jsonReader.endArray();
                                }
                                t4 = t3;
                            } else if (nextName3.equals("y")) {
                                if (jsonReader.peek() == JsonToken.NUMBER) {
                                    f11 = (float) jsonReader.nextDouble();
                                    f9 = f11;
                                } else {
                                    jsonReader.beginArray();
                                    f9 = (float) jsonReader.nextDouble();
                                    f11 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : f9;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            f3 = f12;
                        }
                        f2 = f3;
                        PointF pointF14 = new PointF(f8, f9);
                        PointF pointF15 = new PointF(f10, f11);
                        jsonReader.endObject();
                        pointF8 = pointF15;
                        pointF7 = pointF14;
                    } else {
                        f2 = f3;
                        pointF5 = gpj.sf(jsonReader, f);
                    }
                    pointF11 = pointF3;
                    pointF4 = pointF2;
                    f3 = f2;
                    break;
                case 4:
                    t4 = lrrVar.sf(jsonReader, f);
                    break;
                case 5:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    pointF4 = gpj.sf(jsonReader, f);
                    break;
                case 7:
                    pointF11 = gpj.sf(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        PointF pointF16 = pointF4;
        float f13 = f3;
        PointF pointF17 = pointF11;
        T t6 = t4;
        jsonReader.endObject();
        if (z) {
            t5 = t6;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = pcc(pointF5, pointF6);
                t = t5;
                pcc2 = null;
                pcc3 = null;
                if (pcc2 == null) {
                }
                pointF = pointF17;
                pccVar = new com.bytedance.adsdk.sf.qf.pcc<>(qfVar, t6, t, interpolator, f13, null);
                pccVar.kj = pointF;
                pccVar.vy = pointF16;
                return pccVar;
            }
            if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                pcc2 = pcc(pointF7, pointF9);
                pcc3 = pcc(pointF8, pointF10);
                t = t5;
                interpolator = null;
                if (pcc2 == null && pcc3 != null) {
                    pointF = pointF17;
                    pccVar = new com.bytedance.adsdk.sf.qf.pcc<>(qfVar, t6, t, pcc2, pcc3, f13, null);
                } else {
                    pointF = pointF17;
                    pccVar = new com.bytedance.adsdk.sf.qf.pcc<>(qfVar, t6, t, interpolator, f13, null);
                }
                pccVar.kj = pointF;
                pccVar.vy = pointF16;
                return pccVar;
            }
        }
        interpolator = pcc;
        t = t5;
        pcc2 = null;
        pcc3 = null;
        if (pcc2 == null) {
        }
        pointF = pointF17;
        pccVar = new com.bytedance.adsdk.sf.qf.pcc<>(qfVar, t6, t, interpolator, f13, null);
        pccVar.kj = pointF;
        pccVar.vy = pointF16;
        return pccVar;
    }

    private static Interpolator pcc(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.sf.wh.vj.sf(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.sf.wh.vj.sf(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.sf.wh.vj.sf(pointF2.x, -1.0f, 1.0f);
        pointF2.y = com.bytedance.adsdk.sf.wh.vj.sf(pointF2.y, -100.0f, 100.0f);
        int pcc2 = com.bytedance.adsdk.sf.wh.wh.pcc(pointF.x, pointF.y, pointF2.x, pointF2.y);
        WeakReference<Interpolator> pcc3 = com.bytedance.adsdk.sf.vj.pcc() ? null : pcc(pcc2);
        Interpolator interpolator = pcc3 != null ? pcc3.get() : null;
        if (pcc3 == null || interpolator == null) {
            try {
                linearInterpolator = com.bytedance.adsdk.sf.nac.pcc(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = com.bytedance.adsdk.sf.nac.pcc(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!com.bytedance.adsdk.sf.vj.pcc()) {
                try {
                    pcc(pcc2, (WeakReference<Interpolator>) new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    private static <T> com.bytedance.adsdk.sf.qf.pcc<T> pcc(JsonReader jsonReader, float f, lrr<T> lrrVar) throws IOException {
        return new com.bytedance.adsdk.sf.qf.pcc<>(lrrVar.sf(jsonReader, f));
    }
}
