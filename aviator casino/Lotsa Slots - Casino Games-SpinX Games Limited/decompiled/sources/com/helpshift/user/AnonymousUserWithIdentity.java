package com.helpshift.user;

/* loaded from: classes5.dex */
public class AnonymousUserWithIdentity extends com.helpshift.user.UserWithIdentity {
    public static final java.lang.String ANONYMOUS_USER_WITH_IDENTITY_ID = "anon_uid";

    public AnonymousUserWithIdentity(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        super(hSPersistentStorage);
    }

    @Override // com.helpshift.user.UserWithIdentity, com.helpshift.user.BaseUser
    protected boolean isUserSame(java.util.Map<java.lang.String, java.lang.Object> map) {
        return com.helpshift.user.IdentityValidationUtil.isNewIdentityUserSame(map, com.helpshift.util.JsonUtils.jsonStringToMap((java.lang.String) getUserDataValue(com.helpshift.user.UserConstants.USER_LOGIN_CONFIG, "")));
    }
}
