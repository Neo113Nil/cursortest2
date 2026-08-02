package com.payair.hce;

/* loaded from: classes10.dex */
public final class getCardLayoutDescription {
    public static com.payair.hce.getCiacDecline AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws com.payair.hce.getPaymentFci, com.payair.hce.getDualTapResetTimeout {
        boolean z = getackautomaticallyresetbyapplication.DigitizedCardProfile;
        getackautomaticallyresetbyapplication.DigitizedCardProfile = true;
        try {
            try {
                try {
                    return com.payair.hce.getRecords.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                } catch (java.lang.StackOverflowError e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing JSON source: ");
                    sb.append(getackautomaticallyresetbyapplication);
                    sb.append(" to Json");
                    throw new com.payair.hce.getSecurityWord(sb.toString(), e);
                }
            } catch (java.lang.OutOfMemoryError e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed parsing JSON source: ");
                sb2.append(getackautomaticallyresetbyapplication);
                sb2.append(" to Json");
                throw new com.payair.hce.getSecurityWord(sb2.toString(), e2);
            }
        } finally {
            getackautomaticallyresetbyapplication.DigitizedCardProfile = z;
        }
    }
}
