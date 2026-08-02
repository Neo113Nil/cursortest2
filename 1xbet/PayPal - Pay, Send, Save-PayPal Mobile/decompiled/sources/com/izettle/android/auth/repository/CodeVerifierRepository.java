package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b`\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/izettle/android/auth/repository/CodeVerifierRepository;", "", "", "clear", "()V", "", "key", "deleteCodeVerifier", "(Ljava/lang/String;)V", "getCodeVerifier", "(Ljava/lang/String;)Ljava/lang/String;", "codeVerifier", "saveCodeVerifier", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface CodeVerifierRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.repository.CodeVerifierRepository.Companion INSTANCE = com.izettle.android.auth.repository.CodeVerifierRepository.Companion.$$INSTANCE;

    void clear();

    void deleteCodeVerifier(java.lang.String key);

    java.lang.String getCodeVerifier(java.lang.String key);

    void saveCodeVerifier(java.lang.String key, java.lang.String codeVerifier);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/izettle/android/auth/repository/CodeVerifierRepository$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/izettle/android/auth/repository/CodeVerifierRepository;", "create", "(Landroid/content/Context;)Lcom/izettle/android/auth/repository/CodeVerifierRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.auth.repository.CodeVerifierRepository.Companion $$INSTANCE = new com.izettle.android.auth.repository.CodeVerifierRepository.Companion();

        private Companion() {
        }

        public final com.izettle.android.auth.repository.CodeVerifierRepository create(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new com.izettle.android.auth.repository.CodeVerifierRepositoryImpl(context, null, 2, null);
        }
    }
}
