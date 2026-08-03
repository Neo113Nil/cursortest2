package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public class InneractiveUserConfig {

    /* renamed from: a, reason: collision with root package name */
    public int f3655a = -1;
    public com.fyber.inneractive.sdk.external.InneractiveUserConfig.Gender b = null;
    public java.lang.String c = null;

    public enum Gender {
        MALE,
        FEMALE
    }

    public static boolean ageIsValid(int i) {
        return i >= 1 && i <= 120;
    }

    public int getAge() {
        return this.f3655a;
    }

    public com.fyber.inneractive.sdk.external.InneractiveUserConfig.Gender getGender() {
        return this.b;
    }

    @java.lang.Deprecated
    public java.lang.String getZipCode() {
        return this.c;
    }

    @java.lang.Deprecated
    public com.fyber.inneractive.sdk.external.InneractiveUserConfig setAge(int i) {
        if (ageIsValid(i)) {
            this.f3655a = i;
        } else {
            com.fyber.inneractive.sdk.util.IAlog.f("The Age is invalid. Please use a number between 1 and 120", new java.lang.Object[0]);
        }
        return this;
    }

    public com.fyber.inneractive.sdk.external.InneractiveUserConfig setGender(com.fyber.inneractive.sdk.external.InneractiveUserConfig.Gender gender) {
        if (gender != null) {
            this.b = gender;
        } else {
            com.fyber.inneractive.sdk.util.IAlog.f("The gender is invalid. Please use one of the suggested InneractiveAdView.Gender", new java.lang.Object[0]);
        }
        return this;
    }

    @java.lang.Deprecated
    public com.fyber.inneractive.sdk.external.InneractiveUserConfig setZipCode(java.lang.String str) {
        if (str == null || !java.util.regex.Pattern.compile("(^\\d{5}$)|(^\\d{5}-\\d{4}$)").matcher(str).matches()) {
            com.fyber.inneractive.sdk.util.IAlog.c("The zipcode format is invalid. Please use a valid value.", new java.lang.Object[0]);
        } else {
            this.c = str;
        }
        return this;
    }
}
