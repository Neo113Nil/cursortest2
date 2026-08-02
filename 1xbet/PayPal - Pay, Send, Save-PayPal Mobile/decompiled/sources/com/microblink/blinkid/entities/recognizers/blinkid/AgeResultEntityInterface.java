package com.microblink.blinkid.entities.recognizers.blinkid;

/* loaded from: classes9.dex */
public class AgeResultEntityInterface {
    public static final java.lang.String CLASS_NAME = "com.microblink.blinkid.entities.recognizers.blinkid.AgeResultEntityInterface";

    public int getAge() {
        com.microblink.blinkid.results.date.SimpleDateResult dateOfBirth = getDateOfBirth();
        if (dateOfBirth == null || dateOfBirth.getDate() == null) {
            return -1;
        }
        return com.microblink.blinkid.results.date.DateUtils.yearsPassedFrom(dateOfBirth.getDate());
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus getAgeLimitStatus(int i) {
        int age = getAge();
        return age == -1 ? com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus.NotAvailable : age >= i ? com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus.OverAgeLimit : com.microblink.blinkid.entities.recognizers.blinkid.AgeLimitStatus.BelowAgeLimit;
    }

    public com.microblink.blinkid.results.date.SimpleDateResult getDateOfBirth() {
        return null;
    }
}
