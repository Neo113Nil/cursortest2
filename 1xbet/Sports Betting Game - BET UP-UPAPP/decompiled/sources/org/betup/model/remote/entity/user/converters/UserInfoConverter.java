package org.betup.model.remote.entity.user.converters;

import org.betup.model.remote.entity.country.CountryModel;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.NewUserInfoModel;

/* loaded from: classes2.dex */
public class UserInfoConverter {
    public static BaseUserModel fromNewModel(NewUserInfoModel newModel) {
        if (newModel == null) {
            return null;
        }
        BaseUserModel baseUserModel = new BaseUserModel();
        baseUserModel.setId(Integer.valueOf(newModel.getId()));
        baseUserModel.setName(newModel.getName());
        baseUserModel.setPhotoUrl(newModel.getPhotoUrl());
        baseUserModel.setReferralsCount(newModel.getReferralsCount());
        if (newModel.getCountry() != null) {
            CountryModel countryModel = new CountryModel();
            countryModel.setId(newModel.getCountry().getId());
            countryModel.setIso(newModel.getCountry().getIso());
            countryModel.setName(newModel.getCountry().getNiceName());
            countryModel.setPhoto(newModel.getCountry().getPhotoUrl());
            baseUserModel.setCountry(countryModel);
        }
        baseUserModel.setEmail(null);
        baseUserModel.setTutorialComplete(false);
        baseUserModel.setPushToken(null);
        baseUserModel.setReferralCode(null);
        baseUserModel.setInvitedBy(0);
        baseUserModel.setMatchPush(false);
        baseUserModel.setBetPush(false);
        baseUserModel.setTimezone(null);
        baseUserModel.setAdsEnabled(true);
        baseUserModel.setVideoEnabled(false);
        baseUserModel.setOfferExpiration(null);
        baseUserModel.setAppVersion(null);
        baseUserModel.setExpert(false);
        baseUserModel.setSubscriber(newModel.getVip());
        baseUserModel.setLang(null);
        return baseUserModel;
    }
}
