package com.facebook;

/* compiled from: Profile.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*BO\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bB\u000f\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB\u000f\b\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\u0016\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cJ\b\u0010$\u001a\u00020\u001cH\u0016J\b\u0010%\u001a\u0004\u0018\u00010\rJ\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001cH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006+"}, d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", "id", "", "firstName", "middleName", "lastName", "name", "linkUri", "Landroid/net/Uri;", "pictureUri", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getFirstName", "()Ljava/lang/String;", "getId", "getLastName", "getLinkUri", "()Landroid/net/Uri;", "getMiddleName", "getName", "getPictureUri", "describeContents", "", "equals", "", "other", "", "getProfilePictureUri", "width", "height", "hashCode", "toJSONObject", "writeToParcel", "", "dest", "flags", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Profile implements android.os.Parcelable {
    private static final java.lang.String FIRST_NAME_KEY = "first_name";
    private static final java.lang.String ID_KEY = "id";
    private static final java.lang.String LAST_NAME_KEY = "last_name";
    private static final java.lang.String LINK_URI_KEY = "link_uri";
    private static final java.lang.String MIDDLE_NAME_KEY = "middle_name";
    private static final java.lang.String NAME_KEY = "name";
    private static final java.lang.String PICTURE_URI_KEY = "picture_uri";
    private final java.lang.String firstName;
    private final java.lang.String id;
    private final java.lang.String lastName;
    private final android.net.Uri linkUri;
    private final java.lang.String middleName;
    private final java.lang.String name;
    private final android.net.Uri pictureUri;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.Profile.Companion INSTANCE = new com.facebook.Profile.Companion(null);
    private static final java.lang.String TAG = "Profile";
    public static final android.os.Parcelable.Creator<com.facebook.Profile> CREATOR = new android.os.Parcelable.Creator<com.facebook.Profile>() { // from class: com.facebook.Profile$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.Profile createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.Profile(source, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.Profile[] newArray(int size) {
            return new com.facebook.Profile[size];
        }
    };

    public /* synthetic */ Profile(android.os.Parcel parcel, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public Profile(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, android.net.Uri uri) {
        this(str, str2, str3, str4, str5, uri, null, 64, null);
    }

    @kotlin.jvm.JvmStatic
    public static final void fetchProfileForCurrentAccessToken() {
        INSTANCE.fetchProfileForCurrentAccessToken();
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.Profile getCurrentProfile() {
        return INSTANCE.getCurrentProfile();
    }

    @kotlin.jvm.JvmStatic
    public static final void setCurrentProfile(com.facebook.Profile profile) {
        INSTANCE.setCurrentProfile(profile);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public final java.lang.String getMiddleName() {
        return this.middleName;
    }

    public final java.lang.String getLastName() {
        return this.lastName;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final android.net.Uri getLinkUri() {
        return this.linkUri;
    }

    public final android.net.Uri getPictureUri() {
        return this.pictureUri;
    }

    public /* synthetic */ Profile(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, android.net.Uri uri, android.net.Uri uri2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, uri, (i & 64) != 0 ? null : uri2);
    }

    public Profile(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, android.net.Uri uri, android.net.Uri uri2) {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notNullOrEmpty(str, "id");
        this.id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.name = str5;
        this.linkUri = uri;
        this.pictureUri = uri2;
    }

    public final android.net.Uri getProfilePictureUri(int width, int height) {
        java.lang.String str;
        android.net.Uri uri = this.pictureUri;
        if (uri != null) {
            return uri;
        }
        if (com.facebook.AccessToken.INSTANCE.isCurrentAccessTokenActive()) {
            com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.INSTANCE.getCurrentAccessToken();
            str = currentAccessToken == null ? null : currentAccessToken.getToken();
        } else {
            str = "";
        }
        return com.facebook.internal.ImageRequest.INSTANCE.getProfilePictureUri(this.id, width, height, str);
    }

    public boolean equals(java.lang.Object other) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        android.net.Uri uri;
        android.net.Uri uri2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.facebook.Profile)) {
            return false;
        }
        java.lang.String str5 = this.id;
        return ((str5 == null && ((com.facebook.Profile) other).id == null) || kotlin.jvm.internal.Intrinsics.areEqual(str5, ((com.facebook.Profile) other).id)) && (((str = this.firstName) == null && ((com.facebook.Profile) other).firstName == null) || kotlin.jvm.internal.Intrinsics.areEqual(str, ((com.facebook.Profile) other).firstName)) && ((((str2 = this.middleName) == null && ((com.facebook.Profile) other).middleName == null) || kotlin.jvm.internal.Intrinsics.areEqual(str2, ((com.facebook.Profile) other).middleName)) && ((((str3 = this.lastName) == null && ((com.facebook.Profile) other).lastName == null) || kotlin.jvm.internal.Intrinsics.areEqual(str3, ((com.facebook.Profile) other).lastName)) && ((((str4 = this.name) == null && ((com.facebook.Profile) other).name == null) || kotlin.jvm.internal.Intrinsics.areEqual(str4, ((com.facebook.Profile) other).name)) && ((((uri = this.linkUri) == null && ((com.facebook.Profile) other).linkUri == null) || kotlin.jvm.internal.Intrinsics.areEqual(uri, ((com.facebook.Profile) other).linkUri)) && (((uri2 = this.pictureUri) == null && ((com.facebook.Profile) other).pictureUri == null) || kotlin.jvm.internal.Intrinsics.areEqual(uri2, ((com.facebook.Profile) other).pictureUri))))));
    }

    public int hashCode() {
        java.lang.String str = this.id;
        int hashCode = com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0);
        java.lang.String str2 = this.firstName;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        java.lang.String str3 = this.middleName;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        java.lang.String str4 = this.lastName;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        java.lang.String str5 = this.name;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        android.net.Uri uri = this.linkUri;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        android.net.Uri uri2 = this.pictureUri;
        return uri2 != null ? (hashCode * 31) + uri2.hashCode() : hashCode;
    }

    public final org.json.JSONObject toJSONObject() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put(FIRST_NAME_KEY, this.firstName);
            jSONObject.put("middle_name", this.middleName);
            jSONObject.put(LAST_NAME_KEY, this.lastName);
            jSONObject.put("name", this.name);
            android.net.Uri uri = this.linkUri;
            if (uri != null) {
                jSONObject.put(LINK_URI_KEY, uri.toString());
            }
            android.net.Uri uri2 = this.pictureUri;
            if (uri2 != null) {
                jSONObject.put(PICTURE_URI_KEY, uri2.toString());
            }
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public Profile(org.json.JSONObject jsonObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.id = jsonObject.optString("id", null);
        this.firstName = jsonObject.optString(FIRST_NAME_KEY, null);
        this.middleName = jsonObject.optString("middle_name", null);
        this.lastName = jsonObject.optString(LAST_NAME_KEY, null);
        this.name = jsonObject.optString("name", null);
        java.lang.String optString = jsonObject.optString(LINK_URI_KEY, null);
        this.linkUri = optString == null ? null : android.net.Uri.parse(optString);
        java.lang.String optString2 = jsonObject.optString(PICTURE_URI_KEY, null);
        this.pictureUri = optString2 != null ? android.net.Uri.parse(optString2) : null;
    }

    private Profile(android.os.Parcel parcel) {
        this.id = parcel.readString();
        this.firstName = parcel.readString();
        this.middleName = parcel.readString();
        this.lastName = parcel.readString();
        this.name = parcel.readString();
        java.lang.String readString = parcel.readString();
        this.linkUri = readString == null ? null : android.net.Uri.parse(readString);
        java.lang.String readString2 = parcel.readString();
        this.pictureUri = readString2 != null ? android.net.Uri.parse(readString2) : null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.firstName);
        dest.writeString(this.middleName);
        dest.writeString(this.lastName);
        dest.writeString(this.name);
        android.net.Uri uri = this.linkUri;
        dest.writeString(uri == null ? null : uri.toString());
        android.net.Uri uri2 = this.pictureUri;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    /* compiled from: Profile.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/Profile$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/Profile;", "FIRST_NAME_KEY", "", "ID_KEY", "LAST_NAME_KEY", "LINK_URI_KEY", "MIDDLE_NAME_KEY", "NAME_KEY", "PICTURE_URI_KEY", "TAG", "kotlin.jvm.PlatformType", "fetchProfileForCurrentAccessToken", "", "getCurrentProfile", "setCurrentProfile", com.google.android.gms.common.Scopes.PROFILE, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.Profile getCurrentProfile() {
            return com.facebook.ProfileManager.INSTANCE.getInstance().getCurrentProfileField();
        }

        @kotlin.jvm.JvmStatic
        public final void setCurrentProfile(com.facebook.Profile profile) {
            com.facebook.ProfileManager.INSTANCE.getInstance().setCurrentProfile(profile);
        }

        @kotlin.jvm.JvmStatic
        public final void fetchProfileForCurrentAccessToken() {
            com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.INSTANCE.getCurrentAccessToken();
            if (currentAccessToken == null) {
                return;
            }
            if (!com.facebook.AccessToken.INSTANCE.isCurrentAccessTokenActive()) {
                setCurrentProfile(null);
            } else {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.getGraphMeRequestWithCacheAsync(currentAccessToken.getToken(), new com.facebook.internal.Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.Profile$Companion$fetchProfileForCurrentAccessToken$1
                    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                    public void onSuccess(org.json.JSONObject userInfo) {
                        java.lang.String str;
                        java.lang.String optString = userInfo == null ? null : userInfo.optString("id");
                        if (optString == null) {
                            str = com.facebook.Profile.TAG;
                            android.util.Log.w(str, "No user ID returned on Me request");
                        } else {
                            java.lang.String optString2 = userInfo.optString("link");
                            java.lang.String optString3 = userInfo.optString("profile_picture", null);
                            com.facebook.Profile.INSTANCE.setCurrentProfile(new com.facebook.Profile(optString, userInfo.optString("first_name"), userInfo.optString(com.facebook.AuthenticationTokenClaims.JSON_KEY_MIDDLE_NAME), userInfo.optString("last_name"), userInfo.optString("name"), optString2 != null ? android.net.Uri.parse(optString2) : null, optString3 != null ? android.net.Uri.parse(optString3) : null));
                        }
                    }

                    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                    public void onFailure(com.facebook.FacebookException error) {
                        java.lang.String str;
                        str = com.facebook.Profile.TAG;
                        android.util.Log.e(str, kotlin.jvm.internal.Intrinsics.stringPlus("Got unexpected exception: ", error));
                    }
                });
            }
        }
    }
}
