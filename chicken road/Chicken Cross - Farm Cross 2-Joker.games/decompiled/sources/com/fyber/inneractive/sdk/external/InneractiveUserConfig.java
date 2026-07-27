package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class InneractiveUserConfig {

    /* renamed from: a, reason: collision with root package name */
    public Gender f5308a = null;
    public String b = null;

    public enum Gender {
        MALE,
        FEMALE
    }

    public Gender getGender() {
        return this.f5308a;
    }

    @Deprecated
    public String getZipCode() {
        return this.b;
    }

    public InneractiveUserConfig setGender(Gender gender) {
        if (gender != null) {
            this.f5308a = gender;
        } else {
            IAlog.f("The gender is invalid. Please use one of the suggested InneractiveAdView.Gender", new Object[0]);
        }
        return this;
    }

    @Deprecated
    public InneractiveUserConfig setZipCode(String str) {
        if (str == null || !Pattern.compile("(^\\d{5}$)|(^\\d{5}-\\d{4}$)").matcher(str).matches()) {
            IAlog.c("The zipcode format is invalid. Please use a valid value.", new Object[0]);
        } else {
            this.b = str;
        }
        return this;
    }
}
