package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/izettle/android/auth/repository/SessionRepository;", "", "", "getSessionId", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface SessionRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.repository.SessionRepository.Companion INSTANCE = com.izettle.android.auth.repository.SessionRepository.Companion.$$INSTANCE;

    java.lang.String getSessionId();

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/izettle/android/auth/repository/SessionRepository$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/izettle/android/auth/repository/SessionRepository;", "create", "(Landroid/content/Context;)Lcom/izettle/android/auth/repository/SessionRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.auth.repository.SessionRepository.Companion $$INSTANCE = new com.izettle.android.auth.repository.SessionRepository.Companion();

        private Companion() {
        }

        public final com.izettle.android.auth.repository.SessionRepository create(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new com.izettle.android.auth.repository.SessionRepositoryImpl(context, null, 2, null);
        }
    }
}
