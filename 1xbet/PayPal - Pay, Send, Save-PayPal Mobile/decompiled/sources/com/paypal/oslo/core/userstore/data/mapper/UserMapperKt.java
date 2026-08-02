package com.paypal.oslo.core.userstore.data.mapper;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\u0006\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\u0006\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0006\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0006\u0010\u0012\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0006\u0010\u0015\u001a\u0019\u0010\r\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\r\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Data;", "Lcom/paypal/oslo/core/userstore/model/User;", "toUser", "(Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Data;)Lcom/paypal/oslo/core/userstore/model/User;", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;)Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "(Lcom/paypal/oslo/core/userstore/graphql/fragment/UserPhoneFragment;)Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/core/userstore/graphql/fragment/UserAddressFragment;)Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "", "p0", "Ljava/util/Date;", "(Ljava/lang/Object;)Ljava/util/Date;", "", "", "(Ljava/lang/String;)Ljava/lang/Long;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserMapperKt {
    public static final com.paypal.oslo.core.userstore.model.User toUser(com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data data) {
        java.lang.String str;
        java.util.List<java.lang.String> list;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.core.userstore.model.ProfileName profileName;
        com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment;
        com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment;
        com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment2;
        com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment;
        com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment personNameFragment;
        com.paypal.oslo.core.userstore.model.Orthography orthography;
        com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment2;
        com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment3;
        com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment personNameFragment2;
        com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName personName;
        com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment2;
        com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment3;
        java.lang.Object emailAddress;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        if (data.getProfile() == null || data.getParty() == null || data.getAccount() == null) {
            throw new com.paypal.oslo.core.userstore.model.UserError("Missing required data in GetProfile response");
        }
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Profile profile = data.getProfile();
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Party party = data.getParty();
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Account account = data.getAccount();
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LinkedAuthenticationProfiles linkedAuthenticationProfiles = data.getLinkedAuthenticationProfiles();
        java.lang.String id = party.getId();
        java.lang.String obj = account.getLegalCountryCode().toString();
        java.lang.String obj2 = profile.getPrimaryCurrencyCode().toString();
        java.lang.String tier = account.getTier();
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail primaryEmail = party.getPrimaryEmail();
        java.lang.String obj3 = (primaryEmail == null || (userEmailFragment3 = primaryEmail.getUserEmailFragment()) == null || (emailAddress = userEmailFragment3.getEmailAddress()) == null) ? null : emailAddress.toString();
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail primaryEmail2 = party.getPrimaryEmail();
        boolean confirmed = (primaryEmail2 == null || (userEmailFragment2 = primaryEmail2.getUserEmailFragment()) == null) ? false : userEmailFragment2.getConfirmed();
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName legalName = party.getLegalName();
        java.lang.String fullName = (legalName == null || (personNameFragment2 = legalName.getPersonNameFragment()) == null || (personName = personNameFragment2.getPersonName()) == null) ? null : personName.getFullName();
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone primaryMobilePhone = party.getPrimaryMobilePhone();
        java.lang.String maskedPhoneNumber = (primaryMobilePhone == null || (userPhoneFragment3 = primaryMobilePhone.getUserPhoneFragment()) == null) ? null : userPhoneFragment3.getMaskedPhoneNumber();
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress homeAddress = party.getHomeAddress();
        com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment.Address address = (homeAddress == null || (userAddressFragment2 = homeAddress.getUserAddressFragment()) == null) ? null : userAddressFragment2.getAddress();
        if (address != null) {
            java.lang.String addressLine1 = address.getAddressLine1();
            java.lang.String str4 = addressLine1 == null ? "" : addressLine1;
            java.lang.String adminArea2 = address.getAdminArea2();
            java.lang.String str5 = adminArea2 == null ? "" : adminArea2;
            java.lang.String adminArea1 = address.getAdminArea1();
            java.lang.String str6 = adminArea1 != null ? adminArea1 : "";
            java.lang.String postalCode = address.getPostalCode();
            if (postalCode == null) {
                postalCode = "";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str4);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            sb.append(str5);
            sb.append(", ");
            sb.append(str6);
            sb.append(" ");
            sb.append(postalCode);
            str = sb.toString();
        } else {
            str = null;
        }
        java.lang.Object profileImageUrl = party.getProfileImageUrl();
        java.lang.String obj4 = profileImageUrl != null ? profileImageUrl.toString() : null;
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.ExperimentationSegments experimentationSegments = data.getExperimentationSegments();
        java.util.List<java.lang.String> segmentCodes = experimentationSegments != null ? experimentationSegments.getSegmentCodes() : null;
        java.lang.Object citizenship = party.getCitizenship();
        java.lang.String obj5 = citizenship != null ? citizenship.toString() : null;
        java.lang.String obj6 = account.getLegalCountryCode().toString();
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.LegalName legalName2 = party.getLegalName();
        if (legalName2 == null || (personNameFragment = legalName2.getPersonNameFragment()) == null) {
            list = segmentCodes;
            str2 = obj5;
            str3 = str;
            profileName = null;
        } else {
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography2 = personNameFragment.getOrthography();
            if (orthography2 != null) {
                str2 = obj5;
                com.paypal.oslo.core.userstore.model.Orthography[] values = com.paypal.oslo.core.userstore.model.Orthography.values();
                list = segmentCodes;
                int length = values.length;
                str3 = str;
                int i = 0;
                while (i < length) {
                    com.paypal.oslo.core.userstore.model.Orthography orthography3 = values[i];
                    int i2 = length;
                    com.paypal.oslo.core.userstore.model.Orthography[] orthographyArr = values;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(orthography3.name(), orthography2.name())) {
                        orthography = orthography3;
                        break;
                    }
                    i++;
                    length = i2;
                    values = orthographyArr;
                }
            } else {
                list = segmentCodes;
                str2 = obj5;
                str3 = str;
            }
            orthography = null;
            com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName personName2 = personNameFragment.getPersonName();
            profileName = new com.paypal.oslo.core.userstore.model.ProfileName(orthography, new com.paypal.oslo.core.userstore.model.ProfileName.PersonName(personName2.getPrefix(), personName2.getGivenName(), personName2.getMiddleName(), personName2.getSecondSurname(), personName2.getSurname(), personName2.getSuffix(), personName2.getFullName()));
        }
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryEmail primaryEmail3 = party.getPrimaryEmail();
        com.paypal.oslo.core.userstore.model.ProfileEmail highSpeedVideoFpsRanges = (primaryEmail3 == null || (userEmailFragment = primaryEmail3.getUserEmailFragment()) == null) ? null : getHighSpeedVideoFpsRanges(userEmailFragment);
        java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1> emails = party.getEmails();
        if (emails != null) {
            java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1> list2 = emails;
            profileEmail = highSpeedVideoFpsRanges;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList5.add(getHighSpeedVideoFpsRanges(((com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Email1) it.next()).getUserEmailFragment()));
            }
            arrayList = arrayList5;
        } else {
            profileEmail = highSpeedVideoFpsRanges;
            arrayList = null;
        }
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryMobilePhone primaryMobilePhone2 = party.getPrimaryMobilePhone();
        com.paypal.oslo.core.userstore.model.ProfilePhone highSpeedVideoFpsRanges2 = (primaryMobilePhone2 == null || (userPhoneFragment2 = primaryMobilePhone2.getUserPhoneFragment()) == null) ? null : getHighSpeedVideoFpsRanges(userPhoneFragment2);
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.PrimaryPhone primaryPhone = party.getPrimaryPhone();
        com.paypal.oslo.core.userstore.model.ProfilePhone highSpeedVideoFpsRanges3 = (primaryPhone == null || (userPhoneFragment = primaryPhone.getUserPhoneFragment()) == null) ? null : getHighSpeedVideoFpsRanges(userPhoneFragment);
        java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone> phones = party.getPhones();
        if (phones != null) {
            java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone> list3 = phones;
            arrayList2 = arrayList;
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            java.util.Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList6.add(getHighSpeedVideoFpsRanges(((com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Phone) it2.next()).getUserPhoneFragment()));
            }
            arrayList3 = arrayList6;
        } else {
            arrayList2 = arrayList;
            arrayList3 = null;
        }
        com.paypal.oslo.core.userstore.graphql.GetProfileQuery.HomeAddress homeAddress2 = party.getHomeAddress();
        com.paypal.oslo.core.userstore.model.ProfileAddress highResolutionOutputSizeshNQ4ISI = (homeAddress2 == null || (userAddressFragment = homeAddress2.getUserAddressFragment()) == null) ? null : getHighResolutionOutputSizeshNQ4ISI(userAddressFragment);
        java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address> addresses = party.getAddresses();
        if (addresses != null) {
            java.util.List<com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address> list4 = addresses;
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
            java.util.Iterator<T> it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList7.add(getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Address) it3.next()).getUserAddressFragment()));
            }
            arrayList4 = arrayList7;
        } else {
            arrayList4 = null;
        }
        return new com.paypal.oslo.core.userstore.model.User(id, obj, obj2, tier, obj3, confirmed, fullName, maskedPhoneNumber, str3, obj4, list, str2, obj6, profileName, profileEmail, arrayList2, highSpeedVideoFpsRanges2, highSpeedVideoFpsRanges3, arrayList3, highResolutionOutputSizeshNQ4ISI, arrayList4, getHighSpeedVideoFpsRanges(account.getCreatedTime()), linkedAuthenticationProfiles.getPage().getTotalCount());
    }

    private static final com.paypal.oslo.core.userstore.model.ProfileEmail getHighSpeedVideoFpsRanges(com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment) {
        return new com.paypal.oslo.core.userstore.model.ProfileEmail(userEmailFragment.getId(), userEmailFragment.getEmailAddress().toString(), userEmailFragment.getPrimary(), userEmailFragment.getConfirmed(), getHighSpeedVideoFpsRanges(userEmailFragment.getCreatedTime()));
    }

    private static final com.paypal.oslo.core.userstore.model.ProfilePhone getHighSpeedVideoFpsRanges(com.paypal.oslo.core.userstore.graphql.fragment.UserPhoneFragment userPhoneFragment) {
        com.paypal.oslo.core.userstore.model.PhoneType phoneType;
        com.paypal.oslo.core.userstore.model.ProfilePhone.PhoneNumber phoneNumber = new com.paypal.oslo.core.userstore.model.ProfilePhone.PhoneNumber(userPhoneFragment.getPhoneNumber().getExtensionNumber(), userPhoneFragment.getPhoneNumber().getCountryCode(), userPhoneFragment.getPhoneNumber().getNationalNumber());
        java.lang.String id = userPhoneFragment.getId();
        java.lang.String name2 = userPhoneFragment.getType().name();
        com.paypal.oslo.core.userstore.model.PhoneType phoneType2 = com.paypal.oslo.core.userstore.model.PhoneType.NONE;
        com.paypal.oslo.core.userstore.model.PhoneType[] values = com.paypal.oslo.core.userstore.model.PhoneType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                phoneType = null;
                break;
            }
            phoneType = values[i];
            if (kotlin.jvm.internal.Intrinsics.areEqual(phoneType.name(), name2)) {
                break;
            }
            i++;
        }
        com.paypal.oslo.core.userstore.model.PhoneType phoneType3 = phoneType;
        if (phoneType3 != null) {
            phoneType2 = phoneType3;
        }
        return new com.paypal.oslo.core.userstore.model.ProfilePhone(id, phoneType2, phoneNumber, userPhoneFragment.getMaskedPhoneNumber(), userPhoneFragment.getPrimary(), userPhoneFragment.getConfirmed(), getHighSpeedVideoFpsRanges(userPhoneFragment.getCreatedTime()));
    }

    private static final com.paypal.oslo.core.userstore.model.ProfileAddress getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.userstore.graphql.fragment.UserAddressFragment userAddressFragment) {
        com.paypal.oslo.core.userstore.model.AddressConfirmationAuthority addressConfirmationAuthority;
        com.paypal.oslo.core.userstore.model.ProfileAddress.Address address = new com.paypal.oslo.core.userstore.model.ProfileAddress.Address(userAddressFragment.getAddress().getAddressLine1(), userAddressFragment.getAddress().getAddressLine2(), userAddressFragment.getAddress().getAddressLine3(), userAddressFragment.getAddress().getAdminArea1(), userAddressFragment.getAddress().getAdminArea2(), userAddressFragment.getAddress().getAdminArea3(), userAddressFragment.getAddress().getAdminArea4(), userAddressFragment.getAddress().getCountryCode().toString(), userAddressFragment.getAddress().getPostalCode());
        java.lang.String id = userAddressFragment.getId();
        boolean primary = userAddressFragment.getPrimary();
        boolean confirmed = userAddressFragment.getConfirmed();
        java.lang.String addresseeName = userAddressFragment.getAddresseeName();
        boolean billing = userAddressFragment.getBilling();
        java.lang.String name2 = userAddressFragment.getConfirmationAuthority().name();
        com.paypal.oslo.core.userstore.model.AddressConfirmationAuthority addressConfirmationAuthority2 = com.paypal.oslo.core.userstore.model.AddressConfirmationAuthority.NONE;
        com.paypal.oslo.core.userstore.model.AddressConfirmationAuthority[] values = com.paypal.oslo.core.userstore.model.AddressConfirmationAuthority.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                addressConfirmationAuthority = null;
                break;
            }
            addressConfirmationAuthority = values[i];
            if (kotlin.jvm.internal.Intrinsics.areEqual(addressConfirmationAuthority.name(), name2)) {
                break;
            }
            i++;
        }
        com.paypal.oslo.core.userstore.model.AddressConfirmationAuthority addressConfirmationAuthority3 = addressConfirmationAuthority;
        if (addressConfirmationAuthority3 != null) {
            addressConfirmationAuthority2 = addressConfirmationAuthority3;
        }
        return new com.paypal.oslo.core.userstore.model.ProfileAddress(id, primary, confirmed, addresseeName, billing, addressConfirmationAuthority2, address);
    }

    private static final java.util.Date getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        java.lang.Long l = null;
        if (obj == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.userstore.LoggerKt.log, "Null timestamp - using current time as fallback", null, null, 6, null);
        } else if (obj instanceof java.lang.Number) {
            l = java.lang.Long.valueOf(((java.lang.Number) obj).longValue());
        } else if (!(obj instanceof java.lang.String)) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.userstore.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "unknown";
            }
            pairArr[0] = kotlin.TuplesKt.to("type", simpleName);
            pairArr[1] = kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, obj.toString());
            com.paypal.android.logger.Logger.w$default(logger, "Unexpected timestamp type - using current time as fallback", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        } else {
            java.lang.String str = (java.lang.String) obj;
            l = kotlin.text.StringsKt.toLongOrNull(str);
            if (l == null && (l = getHighSpeedVideoFpsRanges(str)) == null) {
                l = getHighResolutionOutputSizeshNQ4ISI(str);
            }
            if (l == null) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.userstore.LoggerKt.log, "Failed to parse timestamp string - using current time as fallback", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, str)), null, 4, null);
            }
        }
        return l != null ? new java.util.Date(l.longValue() * 1000) : new java.util.Date();
    }

    private static final java.lang.Long getHighSpeedVideoFpsRanges(java.lang.String str) {
        try {
            return java.lang.Long.valueOf(java.time.Instant.parse(str).toEpochMilli() / 1000);
        } catch (java.time.format.DateTimeParseException unused) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.userstore.LoggerKt.log, "Timestamp did not match ISO 8601 format, trying next", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, str)), null, 4, null);
            return null;
        }
    }

    private static final java.lang.Long getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("MM-dd-yyyy", java.util.Locale.US);
            simpleDateFormat.setLenient(false);
            java.util.Date parse = simpleDateFormat.parse(str);
            if (parse != null) {
                return java.lang.Long.valueOf(parse.getTime() / 1000);
            }
            return null;
        } catch (java.text.ParseException unused) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.userstore.LoggerKt.log, "Timestamp did not match MM-dd-yyyy format", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, str)), null, 4, null);
            return null;
        }
    }
}
