package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public class RequestConfiguration {
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;

    @Nullable
    private final AgeRestrictedTreatment zzb;
    private final int zzc;
    private final int zzd;

    @Nullable
    private final String zze;
    private final List zzf;
    private final PublisherPrivacyPersonalizationState zzg;
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, "T", MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    public static class Builder {

        @Nullable
        private AgeRestrictedTreatment zza = null;
        private int zzb = -1;
        private int zzc = -1;

        @Nullable
        private String zzd = null;
        private final List zze = new ArrayList();
        private PublisherPrivacyPersonalizationState zzf = PublisherPrivacyPersonalizationState.DEFAULT;

        public RequestConfiguration build() {
            return new RequestConfiguration(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
        }

        public Builder setAgeRestrictedTreatment(@Nullable AgeRestrictedTreatment ageRestrictedTreatment) {
            this.zza = ageRestrictedTreatment;
            return this;
        }

        public Builder setMaxAdContentRating(@Nullable String str) {
            if (str == null || "".equals(str)) {
                str = null;
            } else if (!RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) && !"T".equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                zzo.zzi("Invalid value passed to setMaxAdContentRating: ".concat(str));
                return this;
            }
            this.zzd = str;
            return this;
        }

        public Builder setPublisherPrivacyPersonalizationState(PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            this.zzf = publisherPrivacyPersonalizationState;
            return this;
        }

        @Deprecated
        public Builder setTagForChildDirectedTreatment(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.zzb = i;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 57);
                sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
                sb.append(i);
                zzo.zzi(sb.toString());
            }
            return this;
        }

        @Deprecated
        public Builder setTagForUnderAgeOfConsent(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.zzc = i;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 52);
                sb.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
                sb.append(i);
                zzo.zzi(sb.toString());
            }
            return this;
        }

        public Builder setTestDeviceIds(@Nullable List<String> list) {
            List list2 = this.zze;
            list2.clear();
            if (list != null) {
                list2.addAll(list);
            }
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);

        private final int zza;

        PublisherPrivacyPersonalizationState(int i) {
            this.zza = i;
        }

        public int getValue() {
            return this.zza;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForChildDirectedTreatment {
    }

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForUnderAgeOfConsent {
    }

    /* synthetic */ RequestConfiguration(AgeRestrictedTreatment ageRestrictedTreatment, int i, int i2, String str, List list, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState, byte[] bArr) {
        this.zzb = ageRestrictedTreatment;
        this.zzc = i;
        this.zzd = i2;
        this.zze = str;
        this.zzf = list;
        this.zzg = publisherPrivacyPersonalizationState;
    }

    public AgeRestrictedTreatment getAgeRestrictedTreatment() {
        AgeRestrictedTreatment ageRestrictedTreatment = this.zzb;
        return ageRestrictedTreatment == null ? AgeRestrictedTreatment.UNSPECIFIED : ageRestrictedTreatment;
    }

    public String getMaxAdContentRating() {
        String str = this.zze;
        return str == null ? "" : str;
    }

    public PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.zzg;
    }

    @Deprecated
    public int getTagForChildDirectedTreatment() {
        return this.zzc;
    }

    @Deprecated
    public int getTagForUnderAgeOfConsent() {
        return this.zzd;
    }

    public List<String> getTestDeviceIds() {
        return new ArrayList(this.zzf);
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setAgeRestrictedTreatment(this.zzb);
        builder.setTagForChildDirectedTreatment(this.zzc);
        builder.setTagForUnderAgeOfConsent(this.zzd);
        builder.setMaxAdContentRating(this.zze);
        builder.setTestDeviceIds(this.zzf);
        builder.setPublisherPrivacyPersonalizationState(this.zzg);
        return builder;
    }

    public final AgeRestrictedTreatment zza() {
        return this.zzb;
    }
}
