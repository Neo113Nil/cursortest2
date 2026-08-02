package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\u000e\u0010\u000b"}, d2 = {"Lcom/izettle/android/auth/dto/JwtUser;", "", "", "type", "userId", "organizationId", "role", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getOrganizationId", "()Ljava/lang/String;", "getRole", "getType", "getUserId"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JwtUser {
    private final java.lang.String organizationId;
    private final java.lang.String role;
    private final java.lang.String type;
    private final java.lang.String userId;

    public JwtUser(@com.izettle.android.serialization.annotations.JsonDeserialize("userType") java.lang.String str, @com.izettle.android.serialization.annotations.JsonDeserialize("uuid") java.lang.String str2, @com.izettle.android.serialization.annotations.JsonDeserialize("orgUuid") java.lang.String str3, @com.izettle.android.serialization.annotations.JsonDeserialize("userRole") java.lang.String str4) {
        this.type = str;
        this.userId = str2;
        this.organizationId = str3;
        this.role = str4;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getUserId() {
        return this.userId;
    }

    public final java.lang.String getOrganizationId() {
        return this.organizationId;
    }

    public final java.lang.String getRole() {
        return this.role;
    }
}
