package com.paypal.oslo.core.userstore.model;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\bP\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0010\u0010*\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010%J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010%J\u0012\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b8\u00101J\u0012\u00109\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b;\u0010:J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b<\u00101J\u0012\u0010=\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b?\u00101J\u0012\u0010@\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bB\u0010CJ²\u0002\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010G\u001a\u00020\b2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020 HÖ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bK\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010%R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010L\u001a\u0004\bN\u0010%R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bO\u0010%R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010L\u001a\u0004\bP\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010L\u0012\u0004\bR\u0010S\u001a\u0004\bQ\u0010%R \u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010T\u0012\u0004\bU\u0010S\u001a\u0004\b\t\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010L\u0012\u0004\bW\u0010S\u001a\u0004\bV\u0010%R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010L\u0012\u0004\bY\u0010S\u001a\u0004\bX\u0010%R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010L\u0012\u0004\b[\u0010S\u001a\u0004\bZ\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\b\\\u0010%R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010]\u001a\u0004\b^\u00101R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\b_\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\b`\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010a\u001a\u0004\bb\u00105R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010c\u001a\u0004\bd\u00107R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010]\u001a\u0004\be\u00101R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010f\u001a\u0004\bg\u0010:R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010f\u001a\u0004\bh\u0010:R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010]\u001a\u0004\bi\u00101R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010j\u001a\u0004\bk\u0010>R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010]\u001a\u0004\bl\u00101R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010m\u001a\u0004\bn\u0010AR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010o\u001a\u0004\bp\u0010C"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/User;", "", "", "id", "accountCountryCode", "accountCurrencyCode", "accountType", "primaryEmail", "", "isEmailConfirmed", "fullName", "phone", "address", "profileImageURL", "", "rpsAttributes", com.microblink.blinkid.entities.recognizers.blinkid.croatia.CroatiaCombinedRecognizer.VerificationConstants.Citizenship, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Lcom/paypal/oslo/core/userstore/model/ProfileName;", "legalName", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "primaryEmailAddress", "profileEmails", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "primaryMobilePhone", "profilePrimaryPhone", "profilePhones", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "homeAddress", "profileAddresses", "Ljava/util/Date;", "accountCreatedTime", "", "linkedAccountCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/userstore/model/ProfileName;Lcom/paypal/oslo/core/userstore/model/ProfileEmail;Ljava/util/List;Lcom/paypal/oslo/core/userstore/model/ProfilePhone;Lcom/paypal/oslo/core/userstore/model/ProfilePhone;Ljava/util/List;Lcom/paypal/oslo/core/userstore/model/ProfileAddress;Ljava/util/List;Ljava/util/Date;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "component7", "component8", "component9", "component10", "component11", "()Ljava/util/List;", "component12", "component13", "component14", "()Lcom/paypal/oslo/core/userstore/model/ProfileName;", "component15", "()Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "component16", "component17", "()Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "component18", "component19", "component20", "()Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "component21", "component22", "()Ljava/util/Date;", "component23", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/userstore/model/ProfileName;Lcom/paypal/oslo/core/userstore/model/ProfileEmail;Ljava/util/List;Lcom/paypal/oslo/core/userstore/model/ProfilePhone;Lcom/paypal/oslo/core/userstore/model/ProfilePhone;Ljava/util/List;Lcom/paypal/oslo/core/userstore/model/ProfileAddress;Ljava/util/List;Ljava/util/Date;Ljava/lang/Integer;)Lcom/paypal/oslo/core/userstore/model/User;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getAccountCountryCode", "getAccountCurrencyCode", "getAccountType", "getPrimaryEmail", "getPrimaryEmail$annotations", "()V", "Z", "isEmailConfirmed$annotations", "getFullName", "getFullName$annotations", "getPhone", "getPhone$annotations", "getAddress", "getAddress$annotations", "getProfileImageURL", "Ljava/util/List;", "getRpsAttributes", "getCitizenship", "getCountry", "Lcom/paypal/oslo/core/userstore/model/ProfileName;", "getLegalName", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "getPrimaryEmailAddress", "getProfileEmails", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "getPrimaryMobilePhone", "getProfilePrimaryPhone", "getProfilePhones", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "getHomeAddress", "getProfileAddresses", "Ljava/util/Date;", "getAccountCreatedTime", "Ljava/lang/Integer;", "getLinkedAccountCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class User {
    private final java.lang.String accountCountryCode;
    private final java.util.Date accountCreatedTime;
    private final java.lang.String accountCurrencyCode;
    private final java.lang.String accountType;
    private final java.lang.String address;
    private final java.lang.String citizenship;
    private final java.lang.String country;
    private final java.lang.String fullName;
    private final com.paypal.oslo.core.userstore.model.ProfileAddress homeAddress;
    private final java.lang.String id;
    private final boolean isEmailConfirmed;
    private final com.paypal.oslo.core.userstore.model.ProfileName legalName;
    private final java.lang.Integer linkedAccountCount;
    private final java.lang.String phone;
    private final java.lang.String primaryEmail;
    private final com.paypal.oslo.core.userstore.model.ProfileEmail primaryEmailAddress;
    private final com.paypal.oslo.core.userstore.model.ProfilePhone primaryMobilePhone;
    private final java.util.List<com.paypal.oslo.core.userstore.model.ProfileAddress> profileAddresses;
    private final java.util.List<com.paypal.oslo.core.userstore.model.ProfileEmail> profileEmails;
    private final java.lang.String profileImageURL;
    private final java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> profilePhones;
    private final com.paypal.oslo.core.userstore.model.ProfilePhone profilePrimaryPhone;
    private final java.util.List<java.lang.String> rpsAttributes;

    @kotlin.Deprecated(message = "Use homeAddress or profileAddresses instead, which provide structured address data with address lines and location components.", replaceWith = @kotlin.ReplaceWith(expression = "homeAddress", imports = {}))
    public static /* synthetic */ void getAddress$annotations() {
    }

    @kotlin.Deprecated(message = "Use legalName instead, which provides structured name data with full name, given name, surname, and other components.", replaceWith = @kotlin.ReplaceWith(expression = "legalName?.personName?.fullName", imports = {}))
    public static /* synthetic */ void getFullName$annotations() {
    }

    @kotlin.Deprecated(message = "Use primaryMobilePhone or profilePrimaryPhone instead, which provide structured phone data with country code and national number.", replaceWith = @kotlin.ReplaceWith(expression = "primaryMobilePhone?.maskedPhoneNumber ?: profilePrimaryPhone?.maskedPhoneNumber", imports = {}))
    public static /* synthetic */ void getPhone$annotations() {
    }

    @kotlin.Deprecated(message = "Use primaryEmailAddress instead. See deprecation migration guide for ProfileEmail usage.", replaceWith = @kotlin.ReplaceWith(expression = "primaryEmailAddress?.emailAddress", imports = {}))
    public static /* synthetic */ void getPrimaryEmail$annotations() {
    }

    @kotlin.Deprecated(message = "Use profileEmails instead to access email confirmation status of individual ProfileEmail objects.", replaceWith = @kotlin.ReplaceWith(expression = "primaryEmailAddress?.confirmed ?: false", imports = {}))
    public static /* synthetic */ void isEmailConfirmed$annotations() {
    }

    public User(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.util.List<java.lang.String> list, java.lang.String str10, java.lang.String str11, com.paypal.oslo.core.userstore.model.ProfileName profileName, com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, java.util.List<com.paypal.oslo.core.userstore.model.ProfileEmail> list2, com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone2, java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> list3, com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress, java.util.List<com.paypal.oslo.core.userstore.model.ProfileAddress> list4, java.util.Date date, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.accountCountryCode = str2;
        this.accountCurrencyCode = str3;
        this.accountType = str4;
        this.primaryEmail = str5;
        this.isEmailConfirmed = z;
        this.fullName = str6;
        this.phone = str7;
        this.address = str8;
        this.profileImageURL = str9;
        this.rpsAttributes = list;
        this.citizenship = str10;
        this.country = str11;
        this.legalName = profileName;
        this.primaryEmailAddress = profileEmail;
        this.profileEmails = list2;
        this.primaryMobilePhone = profilePhone;
        this.profilePrimaryPhone = profilePhone2;
        this.profilePhones = list3;
        this.homeAddress = profileAddress;
        this.profileAddresses = list4;
        this.accountCreatedTime = date;
        this.linkedAccountCount = num;
    }

    public /* synthetic */ User(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.util.List list, java.lang.String str10, java.lang.String str11, com.paypal.oslo.core.userstore.model.ProfileName profileName, com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, java.util.List list2, com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone2, java.util.List list3, com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress, java.util.List list4, java.util.Date date, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, z, str6, str7, str8, str9, list, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : profileName, (i & 16384) != 0 ? null : profileEmail, (32768 & i) != 0 ? null : list2, (65536 & i) != 0 ? null : profilePhone, (131072 & i) != 0 ? null : profilePhone2, (262144 & i) != 0 ? null : list3, (524288 & i) != 0 ? null : profileAddress, (1048576 & i) != 0 ? null : list4, (2097152 & i) != 0 ? null : date, (i & 4194304) != 0 ? null : num);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getAccountCountryCode() {
        return this.accountCountryCode;
    }

    public final java.lang.String getAccountCurrencyCode() {
        return this.accountCurrencyCode;
    }

    public final java.lang.String getAccountType() {
        return this.accountType;
    }

    public final java.lang.String getPrimaryEmail() {
        return this.primaryEmail;
    }

    public final boolean isEmailConfirmed() {
        return this.isEmailConfirmed;
    }

    public final java.lang.String getFullName() {
        return this.fullName;
    }

    public final java.lang.String getPhone() {
        return this.phone;
    }

    public final java.lang.String getAddress() {
        return this.address;
    }

    public final java.lang.String getProfileImageURL() {
        return this.profileImageURL;
    }

    public final java.util.List<java.lang.String> getRpsAttributes() {
        return this.rpsAttributes;
    }

    public final java.lang.String getCitizenship() {
        return this.citizenship;
    }

    public final java.lang.String getCountry() {
        return this.country;
    }

    public final com.paypal.oslo.core.userstore.model.ProfileName getLegalName() {
        return this.legalName;
    }

    public final com.paypal.oslo.core.userstore.model.ProfileEmail getPrimaryEmailAddress() {
        return this.primaryEmailAddress;
    }

    public final java.util.List<com.paypal.oslo.core.userstore.model.ProfileEmail> getProfileEmails() {
        return this.profileEmails;
    }

    public final com.paypal.oslo.core.userstore.model.ProfilePhone getPrimaryMobilePhone() {
        return this.primaryMobilePhone;
    }

    public final com.paypal.oslo.core.userstore.model.ProfilePhone getProfilePrimaryPhone() {
        return this.profilePrimaryPhone;
    }

    public final java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> getProfilePhones() {
        return this.profilePhones;
    }

    public final com.paypal.oslo.core.userstore.model.ProfileAddress getHomeAddress() {
        return this.homeAddress;
    }

    public final java.util.List<com.paypal.oslo.core.userstore.model.ProfileAddress> getProfileAddresses() {
        return this.profileAddresses;
    }

    public final java.util.Date getAccountCreatedTime() {
        return this.accountCreatedTime;
    }

    public final java.lang.Integer getLinkedAccountCount() {
        return this.linkedAccountCount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.accountCountryCode;
        java.lang.String str3 = this.accountCurrencyCode;
        java.lang.String str4 = this.accountType;
        java.lang.String str5 = this.primaryEmail;
        boolean z = this.isEmailConfirmed;
        java.lang.String str6 = this.fullName;
        java.lang.String str7 = this.phone;
        java.lang.String str8 = this.address;
        java.lang.String str9 = this.profileImageURL;
        java.util.List<java.lang.String> list = this.rpsAttributes;
        java.lang.String str10 = this.citizenship;
        java.lang.String str11 = this.country;
        com.paypal.oslo.core.userstore.model.ProfileName profileName = this.legalName;
        com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail = this.primaryEmailAddress;
        java.util.List<com.paypal.oslo.core.userstore.model.ProfileEmail> list2 = this.profileEmails;
        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = this.primaryMobilePhone;
        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone2 = this.profilePrimaryPhone;
        java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> list3 = this.profilePhones;
        com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress = this.homeAddress;
        java.util.List<com.paypal.oslo.core.userstore.model.ProfileAddress> list4 = this.profileAddresses;
        java.util.Date date = this.accountCreatedTime;
        java.lang.Integer num = this.linkedAccountCount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("User(id=");
        sb.append(str);
        sb.append(", accountCountryCode=");
        sb.append(str2);
        sb.append(", accountCurrencyCode=");
        sb.append(str3);
        sb.append(", accountType=");
        sb.append(str4);
        sb.append(", primaryEmail=");
        sb.append(str5);
        sb.append(", isEmailConfirmed=");
        sb.append(z);
        sb.append(", fullName=");
        sb.append(str6);
        sb.append(", phone=");
        sb.append(str7);
        sb.append(", address=");
        sb.append(str8);
        sb.append(", profileImageURL=");
        sb.append(str9);
        sb.append(", rpsAttributes=");
        sb.append(list);
        sb.append(", citizenship=");
        sb.append(str10);
        sb.append(", country=");
        sb.append(str11);
        sb.append(", legalName=");
        sb.append(profileName);
        sb.append(", primaryEmailAddress=");
        sb.append(profileEmail);
        sb.append(", profileEmails=");
        sb.append(list2);
        sb.append(", primaryMobilePhone=");
        sb.append(profilePhone);
        sb.append(", profilePrimaryPhone=");
        sb.append(profilePhone2);
        sb.append(", profilePhones=");
        sb.append(list3);
        sb.append(", homeAddress=");
        sb.append(profileAddress);
        sb.append(", profileAddresses=");
        sb.append(list4);
        sb.append(", accountCreatedTime=");
        sb.append(date);
        sb.append(", linkedAccountCount=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.accountCountryCode.hashCode();
        int hashCode3 = this.accountCurrencyCode.hashCode();
        int hashCode4 = this.accountType.hashCode();
        java.lang.String str = this.primaryEmail;
        int hashCode5 = str == null ? 0 : str.hashCode();
        int hashCode6 = java.lang.Boolean.hashCode(this.isEmailConfirmed);
        java.lang.String str2 = this.fullName;
        int hashCode7 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.phone;
        int hashCode8 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.address;
        int hashCode9 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.profileImageURL;
        int hashCode10 = str5 == null ? 0 : str5.hashCode();
        java.util.List<java.lang.String> list = this.rpsAttributes;
        int hashCode11 = list == null ? 0 : list.hashCode();
        java.lang.String str6 = this.citizenship;
        int hashCode12 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.country;
        int hashCode13 = str7 == null ? 0 : str7.hashCode();
        com.paypal.oslo.core.userstore.model.ProfileName profileName = this.legalName;
        int hashCode14 = profileName == null ? 0 : profileName.hashCode();
        com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail = this.primaryEmailAddress;
        int hashCode15 = profileEmail == null ? 0 : profileEmail.hashCode();
        java.util.List<com.paypal.oslo.core.userstore.model.ProfileEmail> list2 = this.profileEmails;
        int hashCode16 = list2 == null ? 0 : list2.hashCode();
        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = this.primaryMobilePhone;
        int hashCode17 = profilePhone == null ? 0 : profilePhone.hashCode();
        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone2 = this.profilePrimaryPhone;
        int hashCode18 = profilePhone2 == null ? 0 : profilePhone2.hashCode();
        java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> list3 = this.profilePhones;
        int hashCode19 = list3 == null ? 0 : list3.hashCode();
        com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress = this.homeAddress;
        int hashCode20 = profileAddress == null ? 0 : profileAddress.hashCode();
        java.util.List<com.paypal.oslo.core.userstore.model.ProfileAddress> list4 = this.profileAddresses;
        int hashCode21 = list4 == null ? 0 : list4.hashCode();
        java.util.Date date = this.accountCreatedTime;
        int hashCode22 = date == null ? 0 : date.hashCode();
        java.lang.Integer num = this.linkedAccountCount;
        return (((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.userstore.model.User)) {
            return false;
        }
        com.paypal.oslo.core.userstore.model.User user = (com.paypal.oslo.core.userstore.model.User) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, user.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountCountryCode, user.accountCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountCurrencyCode, user.accountCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountType, user.accountType) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryEmail, user.primaryEmail) && this.isEmailConfirmed == user.isEmailConfirmed && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, user.fullName) && kotlin.jvm.internal.Intrinsics.areEqual(this.phone, user.phone) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, user.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.profileImageURL, user.profileImageURL) && kotlin.jvm.internal.Intrinsics.areEqual(this.rpsAttributes, user.rpsAttributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.citizenship, user.citizenship) && kotlin.jvm.internal.Intrinsics.areEqual(this.country, user.country) && kotlin.jvm.internal.Intrinsics.areEqual(this.legalName, user.legalName) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryEmailAddress, user.primaryEmailAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.profileEmails, user.profileEmails) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryMobilePhone, user.primaryMobilePhone) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePrimaryPhone, user.profilePrimaryPhone) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhones, user.profilePhones) && kotlin.jvm.internal.Intrinsics.areEqual(this.homeAddress, user.homeAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.profileAddresses, user.profileAddresses) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountCreatedTime, user.accountCreatedTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkedAccountCount, user.linkedAccountCount);
    }

    public final com.paypal.oslo.core.userstore.model.User copy(java.lang.String id, java.lang.String accountCountryCode, java.lang.String accountCurrencyCode, java.lang.String accountType, java.lang.String primaryEmail, boolean isEmailConfirmed, java.lang.String fullName, java.lang.String phone, java.lang.String address, java.lang.String profileImageURL, java.util.List<java.lang.String> rpsAttributes, java.lang.String citizenship, java.lang.String country, com.paypal.oslo.core.userstore.model.ProfileName legalName, com.paypal.oslo.core.userstore.model.ProfileEmail primaryEmailAddress, java.util.List<com.paypal.oslo.core.userstore.model.ProfileEmail> profileEmails, com.paypal.oslo.core.userstore.model.ProfilePhone primaryMobilePhone, com.paypal.oslo.core.userstore.model.ProfilePhone profilePrimaryPhone, java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> profilePhones, com.paypal.oslo.core.userstore.model.ProfileAddress homeAddress, java.util.List<com.paypal.oslo.core.userstore.model.ProfileAddress> profileAddresses, java.util.Date accountCreatedTime, java.lang.Integer linkedAccountCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCountryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountCurrencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountType, "");
        return new com.paypal.oslo.core.userstore.model.User(id, accountCountryCode, accountCurrencyCode, accountType, primaryEmail, isEmailConfirmed, fullName, phone, address, profileImageURL, rpsAttributes, citizenship, country, legalName, primaryEmailAddress, profileEmails, primaryMobilePhone, profilePrimaryPhone, profilePhones, homeAddress, profileAddresses, accountCreatedTime, linkedAccountCount);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getAddress() {
        return this.address;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getPhone() {
        return this.phone;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getFullName() {
        return this.fullName;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsEmailConfirmed() {
        return this.isEmailConfirmed;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getPrimaryEmail() {
        return this.primaryEmail;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAccountType() {
        return this.accountType;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAccountCurrencyCode() {
        return this.accountCurrencyCode;
    }

    /* renamed from: component23, reason: from getter */
    public final java.lang.Integer getLinkedAccountCount() {
        return this.linkedAccountCount;
    }

    /* renamed from: component22, reason: from getter */
    public final java.util.Date getAccountCreatedTime() {
        return this.accountCreatedTime;
    }

    public final java.util.List<com.paypal.oslo.core.userstore.model.ProfileAddress> component21() {
        return this.profileAddresses;
    }

    /* renamed from: component20, reason: from getter */
    public final com.paypal.oslo.core.userstore.model.ProfileAddress getHomeAddress() {
        return this.homeAddress;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAccountCountryCode() {
        return this.accountCountryCode;
    }

    public final java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> component19() {
        return this.profilePhones;
    }

    /* renamed from: component18, reason: from getter */
    public final com.paypal.oslo.core.userstore.model.ProfilePhone getProfilePrimaryPhone() {
        return this.profilePrimaryPhone;
    }

    /* renamed from: component17, reason: from getter */
    public final com.paypal.oslo.core.userstore.model.ProfilePhone getPrimaryMobilePhone() {
        return this.primaryMobilePhone;
    }

    public final java.util.List<com.paypal.oslo.core.userstore.model.ProfileEmail> component16() {
        return this.profileEmails;
    }

    /* renamed from: component15, reason: from getter */
    public final com.paypal.oslo.core.userstore.model.ProfileEmail getPrimaryEmailAddress() {
        return this.primaryEmailAddress;
    }

    /* renamed from: component14, reason: from getter */
    public final com.paypal.oslo.core.userstore.model.ProfileName getLegalName() {
        return this.legalName;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getCountry() {
        return this.country;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getCitizenship() {
        return this.citizenship;
    }

    public final java.util.List<java.lang.String> component11() {
        return this.rpsAttributes;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getProfileImageURL() {
        return this.profileImageURL;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
