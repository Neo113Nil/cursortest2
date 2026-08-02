package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIIIIIllll {
    public java.lang.String llIIlIlIIl = "https://baltazar.microblink.com/api/v2/status/check";

    public final com.microblink.blinkid.secured.IIlIIIllIl llIIlIlIIl(com.microblink.blinkid.secured.llIIlIIlll lliiliilll) {
        java.io.BufferedReader bufferedReader;
        com.microblink.blinkid.secured.IIIIlIlIll llIIlIlIIl = com.microblink.blinkid.secured.IIIIlIlIll.llIIlIlIIl(this.llIIlIlIIl);
        llIIlIlIIl.llIIlIlIIl().setConnectTimeout(2000);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        treeMap.put("sdkName", lliiliilll.IlIllIlIIl);
        treeMap.put("sdkVersion", lliiliilll.llIIlIlIIl);
        treeMap.put("licensee", lliiliilll.llIIIlllll);
        treeMap.put("applicationIds", lliiliilll.IllIIIIllI);
        treeMap.put("licenseId", lliiliilll.IllIIIllII);
        treeMap.put(com.visa.cbp.ConsumerInfo.setSignature, lliiliilll.lIlIIIIlIl);
        treeMap.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "ANDROID");
        llIIlIlIIl.llIIlIlIIl(new org.json.JSONObject(treeMap));
        int IlIllIlIIl = llIIlIlIIl.IlIllIlIIl();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(llIIlIlIIl.llIIlIlIIl().getInputStream(), "UTF-8"));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine.trim());
                        } else {
                            try {
                                break;
                            } catch (java.io.IOException unused) {
                            }
                        }
                    } catch (java.io.IOException e) {
                        e = e;
                        throw new com.microblink.blinkid.secured.llllIIIllI(e);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException unused2) {
                                throw th;
                            }
                        }
                        llIIlIlIIl.llIIlIlIIl().getInputStream().close();
                        throw th;
                    }
                }
                bufferedReader.close();
                llIIlIlIIl.llIIlIlIIl().getInputStream().close();
                return new com.microblink.blinkid.secured.IIlIIIllIl(sb.toString(), IlIllIlIIl);
            } catch (java.lang.Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (java.io.IOException e2) {
            e = e2;
        }
    }
}
