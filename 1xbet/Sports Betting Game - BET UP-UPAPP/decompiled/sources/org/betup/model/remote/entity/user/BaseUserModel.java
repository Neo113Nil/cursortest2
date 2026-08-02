package org.betup.model.remote.entity.user;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.App;
import java.io.Serializable;
import org.betup.model.remote.entity.country.CountryModel;

/* loaded from: classes2.dex */
public class BaseUserModel implements Serializable {

    @SerializedName("adsEnabled")
    @Expose
    private boolean adsEnabled = true;

    @SerializedName(App.JsonKeys.APP_VERSION)
    @Expose
    private String appVersion;

    @SerializedName("bet_push")
    @Expose
    private boolean betPush;

    @SerializedName("country")
    @Expose
    private CountryModel country;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("invitedBy")
    @Expose
    private int invitedBy;

    @SerializedName("isExpert")
    @Expose
    private boolean isExpert;

    @SerializedName("is_subscriber")
    @Expose
    private boolean isSubscriber;

    @SerializedName("lang")
    @Expose
    private String lang;

    @SerializedName("match_push")
    @Expose
    private boolean matchPush;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("offer_expiration")
    @Expose
    private String offerExpiration;

    @SerializedName("photo_url")
    @Expose
    private String photoUrl;

    @SerializedName("push_token")
    @Expose
    private String pushToken;

    @SerializedName("referral_code")
    @Expose
    private String referralCode;

    @SerializedName("referralsCount")
    @Expose
    private int referralsCount;

    @SerializedName("timezone")
    @Expose
    private String timezone;

    @SerializedName(FirebaseAnalytics.Event.TUTORIAL_COMPLETE)
    @Expose
    private boolean tutorialComplete;

    @SerializedName("videoEnabled")
    @Expose
    private boolean videoEnabled;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTutorialComplete() {
        return this.tutorialComplete;
    }

    public void setTutorialComplete(boolean tutorialComplete) {
        this.tutorialComplete = tutorialComplete;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getPushToken() {
        return this.pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public int getReferralsCount() {
        return this.referralsCount;
    }

    public void setReferralsCount(int referralsCount) {
        this.referralsCount = referralsCount;
    }

    public String getReferralCode() {
        return this.referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public int getInvitedBy() {
        return this.invitedBy;
    }

    public void setInvitedBy(int invitedBy) {
        this.invitedBy = invitedBy;
    }

    public boolean isMatchPush() {
        return this.matchPush;
    }

    public void setMatchPush(boolean matchPush) {
        this.matchPush = matchPush;
    }

    public boolean isBetPush() {
        return this.betPush;
    }

    public void setBetPush(boolean betPush) {
        this.betPush = betPush;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public CountryModel getCountry() {
        return this.country;
    }

    public void setCountry(CountryModel country) {
        this.country = country;
    }

    public boolean isAdsEnabled() {
        return this.adsEnabled;
    }

    public void setAdsEnabled(boolean adsEnabled) {
        this.adsEnabled = adsEnabled;
    }

    public boolean isVideoEnabled() {
        return this.videoEnabled;
    }

    public void setVideoEnabled(boolean videoEnabled) {
        this.videoEnabled = videoEnabled;
    }

    public String getOfferExpiration() {
        return this.offerExpiration;
    }

    public void setOfferExpiration(String offerExpiration) {
        this.offerExpiration = offerExpiration;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public boolean isExpert() {
        return this.isExpert;
    }

    public void setExpert(boolean expert) {
        this.isExpert = expert;
    }

    public boolean isSubscriber() {
        return this.isSubscriber;
    }

    public void setSubscriber(boolean subscriber) {
        this.isSubscriber = subscriber;
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
