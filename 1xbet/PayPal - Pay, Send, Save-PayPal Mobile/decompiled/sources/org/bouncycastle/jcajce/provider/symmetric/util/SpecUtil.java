package org.bouncycastle.jcajce.provider.symmetric.util;

/* loaded from: classes17.dex */
class SpecUtil {
    static java.security.spec.AlgorithmParameterSpec getHighSpeedVideoFpsRanges(java.security.AlgorithmParameters algorithmParameters, java.lang.Class[] clsArr) {
        try {
            return algorithmParameters.getParameterSpec(java.security.spec.AlgorithmParameterSpec.class);
        } catch (java.lang.Exception unused) {
            for (int i = 0; i != clsArr.length; i++) {
                java.lang.Class cls = clsArr[i];
                if (cls != null) {
                    try {
                        return algorithmParameters.getParameterSpec(cls);
                    } catch (java.lang.Exception unused2) {
                        continue;
                    }
                }
            }
            return null;
        }
    }

    SpecUtil() {
    }
}
