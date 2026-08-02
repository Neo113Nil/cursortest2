package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/izettle/android/auth/repository/SessionRepositoryImpl;", "Lcom/izettle/android/auth/repository/SessionRepository;", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "prefs", "<init>", "(Landroid/content/Context;Landroid/content/SharedPreferences;)V", "", "generateSessionId$auth_release", "()Ljava/lang/String;", "getSessionId", "Landroid/content/SharedPreferences;", "sessionIdCache", "Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SessionRepositoryImpl implements com.izettle.android.auth.repository.SessionRepository {
    private static final java.lang.String PREFS_SESSION = "izettle-presistance";
    private static final java.lang.String SESSION = "openudid";
    private final android.content.SharedPreferences prefs;
    private java.lang.String sessionIdCache;

    public SessionRepositoryImpl(android.content.Context context, android.content.SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.prefs = sharedPreferences;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SessionRepositoryImpl(android.content.Context context, android.content.SharedPreferences sharedPreferences, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, sharedPreferences);
        if ((i & 2) != 0) {
            sharedPreferences = context.getSharedPreferences("izettle-presistance", 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        }
    }

    public final java.lang.String generateSessionId$auth_release() {
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        java.util.UUID randomUUID2 = java.util.UUID.randomUUID();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AD");
        sb.append(randomUUID);
        sb.append(randomUUID2);
        java.lang.String substring = kotlin.text.StringsKt.replace$default(sb.toString(), "-", "", false, 4, (java.lang.Object) null).substring(0, 40);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    @Override // com.izettle.android.auth.repository.SessionRepository
    public final java.lang.String getSessionId() {
        java.lang.String str = this.sessionIdCache;
        if (str == null) {
            str = this.prefs.getString(SESSION, null);
        }
        if (str != null) {
            this.sessionIdCache = str;
            return str;
        }
        java.lang.String generateSessionId$auth_release = generateSessionId$auth_release();
        this.prefs.edit().putString(SESSION, generateSessionId$auth_release).apply();
        this.sessionIdCache = generateSessionId$auth_release;
        return generateSessionId$auth_release;
    }
}
