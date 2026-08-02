package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014"}, d2 = {"Lcom/izettle/android/auth/repository/CodeVerifierRepositoryImpl;", "Lcom/izettle/android/auth/repository/CodeVerifierRepository;", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "prefs", "<init>", "(Landroid/content/Context;Landroid/content/SharedPreferences;)V", "", "clear", "()V", "", "key", "deleteCodeVerifier", "(Ljava/lang/String;)V", "getCodeVerifier", "(Ljava/lang/String;)Ljava/lang/String;", "codeVerifier", "saveCodeVerifier", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/SharedPreferences;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CodeVerifierRepositoryImpl implements com.izettle.android.auth.repository.CodeVerifierRepository {
    private static final java.lang.String PREFS_AUTH_URI = "CODE_VERIFIER_PREFS";
    private final android.content.SharedPreferences prefs;

    public CodeVerifierRepositoryImpl(android.content.Context context, android.content.SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.prefs = sharedPreferences;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CodeVerifierRepositoryImpl(android.content.Context context, android.content.SharedPreferences sharedPreferences, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, sharedPreferences);
        if ((i & 2) != 0) {
            sharedPreferences = context.getSharedPreferences(PREFS_AUTH_URI, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        }
    }

    @Override // com.izettle.android.auth.repository.CodeVerifierRepository
    public final void deleteCodeVerifier(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.prefs.edit().remove(key).commit();
    }

    @Override // com.izettle.android.auth.repository.CodeVerifierRepository
    public final void saveCodeVerifier(java.lang.String key, java.lang.String codeVerifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeVerifier, "");
        this.prefs.edit().putString(key, codeVerifier).commit();
    }

    @Override // com.izettle.android.auth.repository.CodeVerifierRepository
    public final java.lang.String getCodeVerifier(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.prefs.getString(key, null);
    }

    @Override // com.izettle.android.auth.repository.CodeVerifierRepository
    public final void clear() {
        this.prefs.edit().clear().commit();
    }
}
