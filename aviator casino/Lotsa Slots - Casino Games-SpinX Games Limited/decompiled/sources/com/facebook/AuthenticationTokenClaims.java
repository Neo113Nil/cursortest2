package com.facebook;

/* compiled from: AuthenticationTokenClaims.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 L2\u00020\u0001:\u0001LB\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0085\u0002\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001eB\u000f\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010!J\b\u0010;\u001a\u00020\u0019H\u0016J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0096\u0002J\b\u0010@\u001a\u00020\u0019H\u0016J\u0018\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010D\u001a\u00020\u0003H\u0007J\r\u0010E\u001a\u00020CH\u0001¢\u0006\u0002\bFJ\b\u0010G\u001a\u00020\u0003H\u0016J\u0018\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020 2\u0006\u0010K\u001a\u00020\u0019H\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000104¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00102R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u001f\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b:\u00102¨\u0006M"}, d2 = {"Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable;", "encodedClaims", "", "expectedNonce", "(Ljava/lang/String;Ljava/lang/String;)V", com.facebook.AuthenticationTokenClaims.JSON_KEY_JIT, com.facebook.AuthenticationTokenClaims.JSON_KEY_ISS, com.facebook.AuthenticationTokenClaims.JSON_KEY_AUD, "nonce", com.facebook.AuthenticationTokenClaims.JSON_KEY_EXP, "", com.facebook.AuthenticationTokenClaims.JSON_KEY_IAT, com.facebook.AuthenticationTokenClaims.JSON_KEY_SUB, "name", "givenName", "middleName", "familyName", "email", "picture", "userFriends", "", "userBirthday", "userAgeRange", "", "", "userHometown", "userLocation", "userGender", "userLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getAud", "()Ljava/lang/String;", "getEmail", "getExp", "()J", "getFamilyName", "getGivenName", "getIat", "getIss", "getJti", "getMiddleName", "getName", "getNonce", "getPicture", "getSub", "getUserAgeRange", "()Ljava/util/Map;", "getUserBirthday", "", "getUserFriends", "()Ljava/util/Set;", "getUserGender", "getUserHometown", "getUserLink", "getUserLocation", "describeContents", "equals", "", "other", "", "hashCode", "isValidClaims", "claimsJson", "Lorg/json/JSONObject;", "toEnCodedString", "toJSONObject", "toJSONObject$facebook_core_release", "toString", "writeToParcel", "", "dest", "flags", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationTokenClaims implements android.os.Parcelable {
    public static final java.lang.String JSON_KEY_AUD = "aud";
    public static final java.lang.String JSON_KEY_EMAIL = "email";
    public static final java.lang.String JSON_KEY_EXP = "exp";
    public static final java.lang.String JSON_KEY_FAMILY_NAME = "family_name";
    public static final java.lang.String JSON_KEY_GIVEN_NAME = "given_name";
    public static final java.lang.String JSON_KEY_IAT = "iat";
    public static final java.lang.String JSON_KEY_ISS = "iss";
    public static final java.lang.String JSON_KEY_JIT = "jti";
    public static final java.lang.String JSON_KEY_MIDDLE_NAME = "middle_name";
    public static final java.lang.String JSON_KEY_NAME = "name";
    public static final java.lang.String JSON_KEY_NONCE = "nonce";
    public static final java.lang.String JSON_KEY_PICTURE = "picture";
    public static final java.lang.String JSON_KEY_SUB = "sub";
    public static final java.lang.String JSON_KEY_USER_AGE_RANGE = "user_age_range";
    public static final java.lang.String JSON_KEY_USER_BIRTHDAY = "user_birthday";
    public static final java.lang.String JSON_KEY_USER_FRIENDS = "user_friends";
    public static final java.lang.String JSON_KEY_USER_GENDER = "user_gender";
    public static final java.lang.String JSON_KEY_USER_HOMETOWN = "user_hometown";
    public static final java.lang.String JSON_KEY_USER_LINK = "user_link";
    public static final java.lang.String JSON_KEY_USER_LOCATION = "user_location";
    public static final long MAX_TIME_SINCE_TOKEN_ISSUED = 600000;
    private final java.lang.String aud;
    private final java.lang.String email;
    private final long exp;
    private final java.lang.String familyName;
    private final java.lang.String givenName;
    private final long iat;
    private final java.lang.String iss;
    private final java.lang.String jti;
    private final java.lang.String middleName;
    private final java.lang.String name;
    private final java.lang.String nonce;
    private final java.lang.String picture;
    private final java.lang.String sub;
    private final java.util.Map<java.lang.String, java.lang.Integer> userAgeRange;
    private final java.lang.String userBirthday;
    private final java.util.Set<java.lang.String> userFriends;
    private final java.lang.String userGender;
    private final java.util.Map<java.lang.String, java.lang.String> userHometown;
    private final java.lang.String userLink;
    private final java.util.Map<java.lang.String, java.lang.String> userLocation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.AuthenticationTokenClaims.Companion INSTANCE = new com.facebook.AuthenticationTokenClaims.Companion(null);
    public static final android.os.Parcelable.Creator<com.facebook.AuthenticationTokenClaims> CREATOR = new android.os.Parcelable.Creator<com.facebook.AuthenticationTokenClaims>() { // from class: com.facebook.AuthenticationTokenClaims$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.AuthenticationTokenClaims createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.AuthenticationTokenClaims(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.AuthenticationTokenClaims[] newArray(int size) {
            return new com.facebook.AuthenticationTokenClaims[size];
        }
    };

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub) {
        this(jti, iss, aud, nonce, j, j2, sub, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048448, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub, java.lang.String str) {
        this(jti, iss, aud, nonce, j, j2, sub, str, null, null, null, null, null, null, null, null, null, null, null, null, 1048320, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub, java.lang.String str, java.lang.String str2) {
        this(jti, iss, aud, nonce, j, j2, sub, str, str2, null, null, null, null, null, null, null, null, null, null, null, 1048064, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(jti, iss, aud, nonce, j, j2, sub, str, str2, str3, null, null, null, null, null, null, null, null, null, null, 1047552, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this(jti, iss, aud, nonce, j, j2, sub, str, str2, str3, str4, null, null, null, null, null, null, null, null, null, 1046528, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this(jti, iss, aud, nonce, j, j2, sub, str, str2, str3, str4, str5, null, null, null, null, null, null, null, null, 1044480, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this(jti, iss, aud, nonce, j, j2, sub, str, str2, str3, str4, str5, str6, null, null, null, null, null, null, null, 1040384, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Collection<java.lang.String> collection) {
        this(jti, iss, aud, nonce, j, j2, sub, str, str2, str3, str4, str5, str6, collection, null, null, null, null, null, null, 1032192, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Collection<java.lang.String> collection, java.lang.String str7) {
        this(jti, iss, aud, nonce, j, j2, sub, str, str2, str3, str4, str5, str6, collection, str7, null, null, null, null, null, 1015808, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Collection<java.lang.String> collection, java.lang.String str7, java.util.Map<java.lang.String, java.lang.Integer> map) {
        this(jti, iss, aud, nonce, j, j2, sub, str, str2, str3, str4, str5, str6, collection, str7, map, null, null, null, null, 983040, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Collection<java.lang.String> collection, java.lang.String str7, java.util.Map<java.lang.String, java.lang.Integer> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        this(jti, iss, aud, nonce, j, j2, sub, str, str2, str3, str4, str5, str6, collection, str7, map, map2, null, null, null, 917504, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Collection<java.lang.String> collection, java.lang.String str7, java.util.Map<java.lang.String, java.lang.Integer> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
        this(jti, iss, aud, nonce, j, j2, sub, str, str2, str3, str4, str5, str6, collection, str7, map, map2, map3, null, null, 786432, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Collection<java.lang.String> collection, java.lang.String str7, java.util.Map<java.lang.String, java.lang.Integer> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3, java.lang.String str8) {
        this(jti, iss, aud, nonce, j, j2, sub, str, str2, str3, str4, str5, str6, collection, str7, map, map2, map3, str8, null, 524288, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final java.lang.String getJti() {
        return this.jti;
    }

    public final java.lang.String getIss() {
        return this.iss;
    }

    public final java.lang.String getAud() {
        return this.aud;
    }

    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final long getExp() {
        return this.exp;
    }

    public final long getIat() {
        return this.iat;
    }

    public final java.lang.String getSub() {
        return this.sub;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getGivenName() {
        return this.givenName;
    }

    public final java.lang.String getMiddleName() {
        return this.middleName;
    }

    public final java.lang.String getFamilyName() {
        return this.familyName;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getPicture() {
        return this.picture;
    }

    public final java.util.Set<java.lang.String> getUserFriends() {
        return this.userFriends;
    }

    public final java.lang.String getUserBirthday() {
        return this.userBirthday;
    }

    public final java.util.Map<java.lang.String, java.lang.Integer> getUserAgeRange() {
        return this.userAgeRange;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getUserHometown() {
        return this.userHometown;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getUserLocation() {
        return this.userLocation;
    }

    public final java.lang.String getUserGender() {
        return this.userGender;
    }

    public final java.lang.String getUserLink() {
        return this.userLink;
    }

    public AuthenticationTokenClaims(java.lang.String encodedClaims, java.lang.String expectedNonce) {
        java.util.Set<java.lang.String> unmodifiableSet;
        java.util.Map<java.lang.String, java.lang.Integer> unmodifiableMap;
        java.util.Map<java.lang.String, java.lang.String> unmodifiableMap2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedClaims, "encodedClaims");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notEmpty(encodedClaims, "encodedClaims");
        byte[] decodedBytes = android.util.Base64.decode(encodedClaims, 8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(decodedBytes, kotlin.text.Charsets.UTF_8));
        if (!isValidClaims(jSONObject, expectedNonce)) {
            throw new java.lang.IllegalArgumentException("Invalid claims".toString());
        }
        java.lang.String string = jSONObject.getString(JSON_KEY_JIT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.jti = string;
        java.lang.String string2 = jSONObject.getString(JSON_KEY_ISS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.iss = string2;
        java.lang.String string3 = jSONObject.getString(JSON_KEY_AUD);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.aud = string3;
        java.lang.String string4 = jSONObject.getString("nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.nonce = string4;
        this.exp = jSONObject.getLong(JSON_KEY_EXP);
        this.iat = jSONObject.getLong(JSON_KEY_IAT);
        java.lang.String string5 = jSONObject.getString(JSON_KEY_SUB);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.sub = string5;
        com.facebook.AuthenticationTokenClaims.Companion companion = INSTANCE;
        this.name = companion.getNullableString$facebook_core_release(jSONObject, "name");
        this.givenName = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_GIVEN_NAME);
        this.middleName = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_MIDDLE_NAME);
        this.familyName = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_FAMILY_NAME);
        this.email = companion.getNullableString$facebook_core_release(jSONObject, "email");
        this.picture = companion.getNullableString$facebook_core_release(jSONObject, "picture");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(JSON_KEY_USER_FRIENDS);
        java.util.Map<java.lang.String, java.lang.String> map = null;
        if (optJSONArray == null) {
            unmodifiableSet = null;
        } else {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            unmodifiableSet = java.util.Collections.unmodifiableSet(com.facebook.internal.Utility.jsonArrayToSet(optJSONArray));
        }
        this.userFriends = unmodifiableSet;
        this.userBirthday = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_USER_BIRTHDAY);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(JSON_KEY_USER_AGE_RANGE);
        if (optJSONObject == null) {
            unmodifiableMap = null;
        } else {
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            unmodifiableMap = java.util.Collections.unmodifiableMap(com.facebook.internal.Utility.convertJSONObjectToHashMap(optJSONObject));
        }
        this.userAgeRange = unmodifiableMap;
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject(JSON_KEY_USER_HOMETOWN);
        if (optJSONObject2 == null) {
            unmodifiableMap2 = null;
        } else {
            com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
            unmodifiableMap2 = java.util.Collections.unmodifiableMap(com.facebook.internal.Utility.convertJSONObjectToStringMap(optJSONObject2));
        }
        this.userHometown = unmodifiableMap2;
        org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject(JSON_KEY_USER_LOCATION);
        if (optJSONObject3 != null) {
            com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
            map = java.util.Collections.unmodifiableMap(com.facebook.internal.Utility.convertJSONObjectToStringMap(optJSONObject3));
        }
        this.userLocation = map;
        this.userGender = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_USER_GENDER);
        this.userLink = companion.getNullableString$facebook_core_release(jSONObject, JSON_KEY_USER_LINK);
    }

    public /* synthetic */ AuthenticationTokenClaims(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.util.Collection collection, java.lang.String str12, java.util.Map map, java.util.Map map2, java.util.Map map3, java.lang.String str13, java.lang.String str14, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j, j2, str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : collection, (i & 16384) != 0 ? null : str12, (32768 & i) != 0 ? null : map, (65536 & i) != 0 ? null : map2, (131072 & i) != 0 ? null : map3, (262144 & i) != 0 ? null : str13, (i & 524288) != 0 ? null : str14);
    }

    public AuthenticationTokenClaims(java.lang.String jti, java.lang.String iss, java.lang.String aud, java.lang.String nonce, long j, long j2, java.lang.String sub, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Collection<java.lang.String> collection, java.lang.String str7, java.util.Map<java.lang.String, java.lang.Integer> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3, java.lang.String str8, java.lang.String str9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jti, "jti");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iss, "iss");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aud, "aud");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "nonce");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sub, "sub");
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notEmpty(jti, JSON_KEY_JIT);
        com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notEmpty(iss, JSON_KEY_ISS);
        com.facebook.internal.Validate validate3 = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notEmpty(aud, JSON_KEY_AUD);
        com.facebook.internal.Validate validate4 = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notEmpty(nonce, "nonce");
        com.facebook.internal.Validate validate5 = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notEmpty(sub, JSON_KEY_SUB);
        this.jti = jti;
        this.iss = iss;
        this.aud = aud;
        this.nonce = nonce;
        this.exp = j;
        this.iat = j2;
        this.sub = sub;
        this.name = str;
        this.givenName = str2;
        this.middleName = str3;
        this.familyName = str4;
        this.email = str5;
        this.picture = str6;
        this.userFriends = collection != null ? java.util.Collections.unmodifiableSet(new java.util.HashSet(collection)) : null;
        this.userBirthday = str7;
        this.userAgeRange = map != null ? java.util.Collections.unmodifiableMap(new java.util.HashMap(map)) : null;
        this.userHometown = map2 != null ? java.util.Collections.unmodifiableMap(new java.util.HashMap(map2)) : null;
        this.userLocation = map3 != null ? java.util.Collections.unmodifiableMap(new java.util.HashMap(map3)) : null;
        this.userGender = str8;
        this.userLink = str9;
    }

    public AuthenticationTokenClaims(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        this.jti = com.facebook.internal.Validate.notNullOrEmpty(readString, JSON_KEY_JIT);
        java.lang.String readString2 = parcel.readString();
        com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
        this.iss = com.facebook.internal.Validate.notNullOrEmpty(readString2, JSON_KEY_ISS);
        java.lang.String readString3 = parcel.readString();
        com.facebook.internal.Validate validate3 = com.facebook.internal.Validate.INSTANCE;
        this.aud = com.facebook.internal.Validate.notNullOrEmpty(readString3, JSON_KEY_AUD);
        java.lang.String readString4 = parcel.readString();
        com.facebook.internal.Validate validate4 = com.facebook.internal.Validate.INSTANCE;
        this.nonce = com.facebook.internal.Validate.notNullOrEmpty(readString4, "nonce");
        this.exp = parcel.readLong();
        this.iat = parcel.readLong();
        java.lang.String readString5 = parcel.readString();
        com.facebook.internal.Validate validate5 = com.facebook.internal.Validate.INSTANCE;
        this.sub = com.facebook.internal.Validate.notNullOrEmpty(readString5, JSON_KEY_SUB);
        this.name = parcel.readString();
        this.givenName = parcel.readString();
        this.middleName = parcel.readString();
        this.familyName = parcel.readString();
        this.email = parcel.readString();
        this.picture = parcel.readString();
        java.util.ArrayList<java.lang.String> createStringArrayList = parcel.createStringArrayList();
        this.userFriends = createStringArrayList != null ? java.util.Collections.unmodifiableSet(new java.util.HashSet(createStringArrayList)) : null;
        this.userBirthday = parcel.readString();
        java.util.HashMap readHashMap = parcel.readHashMap(kotlin.jvm.internal.IntCompanionObject.INSTANCE.getClass().getClassLoader());
        readHashMap = readHashMap instanceof java.util.HashMap ? readHashMap : null;
        this.userAgeRange = readHashMap != null ? java.util.Collections.unmodifiableMap(readHashMap) : null;
        java.util.HashMap readHashMap2 = parcel.readHashMap(kotlin.jvm.internal.StringCompanionObject.INSTANCE.getClass().getClassLoader());
        readHashMap2 = readHashMap2 instanceof java.util.HashMap ? readHashMap2 : null;
        this.userHometown = readHashMap2 != null ? java.util.Collections.unmodifiableMap(readHashMap2) : null;
        java.util.HashMap readHashMap3 = parcel.readHashMap(kotlin.jvm.internal.StringCompanionObject.INSTANCE.getClass().getClassLoader());
        readHashMap3 = readHashMap3 instanceof java.util.HashMap ? readHashMap3 : null;
        this.userLocation = readHashMap3 != null ? java.util.Collections.unmodifiableMap(readHashMap3) : null;
        this.userGender = parcel.readString();
        this.userLink = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.jti);
        dest.writeString(this.iss);
        dest.writeString(this.aud);
        dest.writeString(this.nonce);
        dest.writeLong(this.exp);
        dest.writeLong(this.iat);
        dest.writeString(this.sub);
        dest.writeString(this.name);
        dest.writeString(this.givenName);
        dest.writeString(this.middleName);
        dest.writeString(this.familyName);
        dest.writeString(this.email);
        dest.writeString(this.picture);
        if (this.userFriends == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new java.util.ArrayList(this.userFriends));
        }
        dest.writeString(this.userBirthday);
        dest.writeMap(this.userAgeRange);
        dest.writeMap(this.userHometown);
        dest.writeMap(this.userLocation);
        dest.writeString(this.userGender);
        dest.writeString(this.userLink);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.facebook.AuthenticationTokenClaims)) {
            return false;
        }
        com.facebook.AuthenticationTokenClaims authenticationTokenClaims = (com.facebook.AuthenticationTokenClaims) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.jti, authenticationTokenClaims.jti) && kotlin.jvm.internal.Intrinsics.areEqual(this.iss, authenticationTokenClaims.iss) && kotlin.jvm.internal.Intrinsics.areEqual(this.aud, authenticationTokenClaims.aud) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, authenticationTokenClaims.nonce) && this.exp == authenticationTokenClaims.exp && this.iat == authenticationTokenClaims.iat && kotlin.jvm.internal.Intrinsics.areEqual(this.sub, authenticationTokenClaims.sub) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, authenticationTokenClaims.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, authenticationTokenClaims.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, authenticationTokenClaims.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.familyName, authenticationTokenClaims.familyName) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, authenticationTokenClaims.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.picture, authenticationTokenClaims.picture) && kotlin.jvm.internal.Intrinsics.areEqual(this.userFriends, authenticationTokenClaims.userFriends) && kotlin.jvm.internal.Intrinsics.areEqual(this.userBirthday, authenticationTokenClaims.userBirthday) && kotlin.jvm.internal.Intrinsics.areEqual(this.userAgeRange, authenticationTokenClaims.userAgeRange) && kotlin.jvm.internal.Intrinsics.areEqual(this.userHometown, authenticationTokenClaims.userHometown) && kotlin.jvm.internal.Intrinsics.areEqual(this.userLocation, authenticationTokenClaims.userLocation) && kotlin.jvm.internal.Intrinsics.areEqual(this.userGender, authenticationTokenClaims.userGender) && kotlin.jvm.internal.Intrinsics.areEqual(this.userLink, authenticationTokenClaims.userLink);
    }

    public int hashCode() {
        int hashCode = (((((((((((((com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.jti.hashCode()) * 31) + this.iss.hashCode()) * 31) + this.aud.hashCode()) * 31) + this.nonce.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.exp)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.iat)) * 31) + this.sub.hashCode()) * 31;
        java.lang.String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.givenName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.middleName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.familyName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.email;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.picture;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.util.Set<java.lang.String> set = this.userFriends;
        int hashCode8 = (hashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        java.lang.String str7 = this.userBirthday;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.util.Map<java.lang.String, java.lang.Integer> map = this.userAgeRange;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.userHometown;
        int hashCode11 = (hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        java.util.Map<java.lang.String, java.lang.String> map3 = this.userLocation;
        int hashCode12 = (hashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        java.lang.String str8 = this.userGender;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.String str9 = this.userLink;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.String jSONObject = toJSONObject$facebook_core_release().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(new java.net.URL(r2).getHost(), "www.facebook.com") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean isValidClaims(org.json.JSONObject claimsJson, java.lang.String expectedNonce) {
        if (claimsJson == null) {
            return false;
        }
        java.lang.String jti = claimsJson.optString(JSON_KEY_JIT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jti, "jti");
        if (jti.length() == 0) {
            return false;
        }
        try {
            java.lang.String iss = claimsJson.optString(JSON_KEY_ISS);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iss, "iss");
            if (iss.length() != 0) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(new java.net.URL(iss).getHost(), com.facebook.FacebookSdk.FACEBOOK_COM)) {
                }
                java.lang.String aud = claimsJson.optString(JSON_KEY_AUD);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aud, "aud");
                if (aud.length() != 0) {
                    com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(aud, com.facebook.FacebookSdk.getApplicationId())) {
                        long j = 1000;
                        if (new java.util.Date().after(new java.util.Date(claimsJson.optLong(JSON_KEY_EXP) * j))) {
                            return false;
                        }
                        if (new java.util.Date().after(new java.util.Date((claimsJson.optLong(JSON_KEY_IAT) * j) + MAX_TIME_SINCE_TOKEN_ISSUED))) {
                            return false;
                        }
                        java.lang.String sub = claimsJson.optString(JSON_KEY_SUB);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sub, "sub");
                        if (sub.length() == 0) {
                            return false;
                        }
                        java.lang.String nonce = claimsJson.optString("nonce");
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonce, "nonce");
                        return nonce.length() != 0 && kotlin.jvm.internal.Intrinsics.areEqual(nonce, expectedNonce);
                    }
                }
                return false;
            }
            return false;
        } catch (java.net.MalformedURLException unused) {
            return false;
        }
    }

    public final java.lang.String toEnCodedString() {
        java.lang.String authenticationTokenClaims = toString();
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        if (authenticationTokenClaims == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = authenticationTokenClaims.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(claimsJsonString.toByteArray(), Base64.URL_SAFE)");
        return encodeToString;
    }

    public final org.json.JSONObject toJSONObject$facebook_core_release() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(JSON_KEY_JIT, this.jti);
        jSONObject.put(JSON_KEY_ISS, this.iss);
        jSONObject.put(JSON_KEY_AUD, this.aud);
        jSONObject.put("nonce", this.nonce);
        jSONObject.put(JSON_KEY_EXP, this.exp);
        jSONObject.put(JSON_KEY_IAT, this.iat);
        java.lang.String str = this.sub;
        if (str != null) {
            jSONObject.put(JSON_KEY_SUB, str);
        }
        java.lang.String str2 = this.name;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        java.lang.String str3 = this.givenName;
        if (str3 != null) {
            jSONObject.put(JSON_KEY_GIVEN_NAME, str3);
        }
        java.lang.String str4 = this.middleName;
        if (str4 != null) {
            jSONObject.put(JSON_KEY_MIDDLE_NAME, str4);
        }
        java.lang.String str5 = this.familyName;
        if (str5 != null) {
            jSONObject.put(JSON_KEY_FAMILY_NAME, str5);
        }
        java.lang.String str6 = this.email;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        java.lang.String str7 = this.picture;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.userFriends != null) {
            jSONObject.put(JSON_KEY_USER_FRIENDS, new org.json.JSONArray((java.util.Collection) this.userFriends));
        }
        java.lang.String str8 = this.userBirthday;
        if (str8 != null) {
            jSONObject.put(JSON_KEY_USER_BIRTHDAY, str8);
        }
        if (this.userAgeRange != null) {
            jSONObject.put(JSON_KEY_USER_AGE_RANGE, new org.json.JSONObject(this.userAgeRange));
        }
        if (this.userHometown != null) {
            jSONObject.put(JSON_KEY_USER_HOMETOWN, new org.json.JSONObject(this.userHometown));
        }
        if (this.userLocation != null) {
            jSONObject.put(JSON_KEY_USER_LOCATION, new org.json.JSONObject(this.userLocation));
        }
        java.lang.String str9 = this.userGender;
        if (str9 != null) {
            jSONObject.put(JSON_KEY_USER_GENDER, str9);
        }
        java.lang.String str10 = this.userLink;
        if (str10 != null) {
            jSONObject.put(JSON_KEY_USER_LINK, str10);
        }
        return jSONObject;
    }

    /* compiled from: AuthenticationTokenClaims.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b J\u001b\u0010!\u001a\u0004\u0018\u00010\u0007*\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0007H\u0000¢\u0006\u0002\b#R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/facebook/AuthenticationTokenClaims$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenClaims;", "JSON_KEY_AUD", "", "JSON_KEY_EMAIL", "JSON_KEY_EXP", "JSON_KEY_FAMILY_NAME", "JSON_KEY_GIVEN_NAME", "JSON_KEY_IAT", "JSON_KEY_ISS", "JSON_KEY_JIT", "JSON_KEY_MIDDLE_NAME", "JSON_KEY_NAME", "JSON_KEY_NONCE", "JSON_KEY_PICTURE", "JSON_KEY_SUB", "JSON_KEY_USER_AGE_RANGE", "JSON_KEY_USER_BIRTHDAY", "JSON_KEY_USER_FRIENDS", "JSON_KEY_USER_GENDER", "JSON_KEY_USER_HOMETOWN", "JSON_KEY_USER_LINK", "JSON_KEY_USER_LOCATION", "MAX_TIME_SINCE_TOKEN_ISSUED", "", "createFromJSONObject", "jsonObject", "Lorg/json/JSONObject;", "createFromJSONObject$facebook_core_release", "getNullableString", "name", "getNullableString$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getNullableString$facebook_core_release(org.json.JSONObject jSONObject, java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            if (jSONObject.has(name)) {
                return jSONObject.getString(name);
            }
            return null;
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.AuthenticationTokenClaims createFromJSONObject$facebook_core_release(org.json.JSONObject jsonObject) throws org.json.JSONException {
            java.util.List<java.lang.String> jsonArrayToStringList;
            java.util.Map<java.lang.String, java.lang.Object> convertJSONObjectToHashMap;
            java.util.Map<java.lang.String, java.lang.String> convertJSONObjectToStringMap;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            java.lang.String jti = jsonObject.getString(com.facebook.AuthenticationTokenClaims.JSON_KEY_JIT);
            java.lang.String iss = jsonObject.getString(com.facebook.AuthenticationTokenClaims.JSON_KEY_ISS);
            java.lang.String aud = jsonObject.getString(com.facebook.AuthenticationTokenClaims.JSON_KEY_AUD);
            java.lang.String nonce = jsonObject.getString("nonce");
            long j = jsonObject.getLong(com.facebook.AuthenticationTokenClaims.JSON_KEY_EXP);
            long j2 = jsonObject.getLong(com.facebook.AuthenticationTokenClaims.JSON_KEY_IAT);
            java.lang.String sub = jsonObject.getString(com.facebook.AuthenticationTokenClaims.JSON_KEY_SUB);
            java.lang.String nullableString$facebook_core_release = getNullableString$facebook_core_release(jsonObject, "name");
            java.lang.String nullableString$facebook_core_release2 = getNullableString$facebook_core_release(jsonObject, com.facebook.AuthenticationTokenClaims.JSON_KEY_GIVEN_NAME);
            java.lang.String nullableString$facebook_core_release3 = getNullableString$facebook_core_release(jsonObject, com.facebook.AuthenticationTokenClaims.JSON_KEY_MIDDLE_NAME);
            java.lang.String nullableString$facebook_core_release4 = getNullableString$facebook_core_release(jsonObject, com.facebook.AuthenticationTokenClaims.JSON_KEY_FAMILY_NAME);
            java.lang.String nullableString$facebook_core_release5 = getNullableString$facebook_core_release(jsonObject, "email");
            java.lang.String nullableString$facebook_core_release6 = getNullableString$facebook_core_release(jsonObject, "picture");
            org.json.JSONArray optJSONArray = jsonObject.optJSONArray(com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_FRIENDS);
            java.lang.String nullableString$facebook_core_release7 = getNullableString$facebook_core_release(jsonObject, com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_BIRTHDAY);
            org.json.JSONObject optJSONObject = jsonObject.optJSONObject(com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_AGE_RANGE);
            org.json.JSONObject optJSONObject2 = jsonObject.optJSONObject(com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_HOMETOWN);
            org.json.JSONObject optJSONObject3 = jsonObject.optJSONObject(com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_LOCATION);
            java.lang.String nullableString$facebook_core_release8 = getNullableString$facebook_core_release(jsonObject, com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_GENDER);
            java.lang.String nullableString$facebook_core_release9 = getNullableString$facebook_core_release(jsonObject, com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_LINK);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jti, "jti");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iss, "iss");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aud, "aud");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonce, "nonce");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sub, "sub");
            java.util.Map<java.lang.String, java.lang.String> map = null;
            if (optJSONArray == null) {
                jsonArrayToStringList = null;
            } else {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                jsonArrayToStringList = com.facebook.internal.Utility.jsonArrayToStringList(optJSONArray);
            }
            java.util.List<java.lang.String> list = jsonArrayToStringList;
            if (optJSONObject == null) {
                convertJSONObjectToHashMap = null;
            } else {
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                convertJSONObjectToHashMap = com.facebook.internal.Utility.convertJSONObjectToHashMap(optJSONObject);
            }
            if (optJSONObject2 == null) {
                convertJSONObjectToStringMap = null;
            } else {
                com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                convertJSONObjectToStringMap = com.facebook.internal.Utility.convertJSONObjectToStringMap(optJSONObject2);
            }
            if (optJSONObject3 != null) {
                com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
                map = com.facebook.internal.Utility.convertJSONObjectToStringMap(optJSONObject3);
            }
            return new com.facebook.AuthenticationTokenClaims(jti, iss, aud, nonce, j, j2, sub, nullableString$facebook_core_release, nullableString$facebook_core_release2, nullableString$facebook_core_release3, nullableString$facebook_core_release4, nullableString$facebook_core_release5, nullableString$facebook_core_release6, list, nullableString$facebook_core_release7, convertJSONObjectToHashMap, convertJSONObjectToStringMap, map, nullableString$facebook_core_release8, nullableString$facebook_core_release9);
        }
    }
}
