package com.izettle.android.auth.token;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0002\n\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/izettle/android/auth/token/RefreshGetTokensSpec;", "Lcom/izettle/android/auth/token/GetTokensSpec;", "", "refreshToken", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getRefreshToken", "()Ljava/lang/String;", "NewBuilder", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RefreshGetTokensSpec extends com.izettle.android.auth.token.GetTokensSpec {

    /* renamed from: NewBuilder, reason: from kotlin metadata */
    public static final com.izettle.android.auth.token.RefreshGetTokensSpec.Companion INSTANCE = new com.izettle.android.auth.token.RefreshGetTokensSpec.Companion(null);
    private final java.lang.String refreshToken;

    public final java.lang.String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshGetTokensSpec(java.lang.String str) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.refreshToken = str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR.\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\t\u0010\u000f"}, d2 = {"Lcom/izettle/android/auth/token/RefreshGetTokensSpec$Builder;", "", "<init>", "()V", "Lcom/izettle/android/auth/token/RefreshGetTokensSpec;", "build", "()Lcom/izettle/android/auth/token/RefreshGetTokensSpec;", "", "refreshToken", "setRefreshToken", "(Ljava/lang/String;)Lcom/izettle/android/auth/token/RefreshGetTokensSpec$Builder;", "<set-?>", "Ljava/lang/String;", "getRefreshToken", "()Ljava/lang/String;", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String refreshToken;

        public final java.lang.String getRefreshToken() {
            return this.refreshToken;
        }

        /* renamed from: setRefreshToken, reason: collision with other method in class */
        public final /* synthetic */ void m10815setRefreshToken(java.lang.String str) {
            this.refreshToken = str;
        }

        public final com.izettle.android.auth.token.RefreshGetTokensSpec.Builder setRefreshToken(java.lang.String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public final com.izettle.android.auth.token.RefreshGetTokensSpec build() {
            java.lang.String str = this.refreshToken;
            if (str != null) {
                return new com.izettle.android.auth.token.RefreshGetTokensSpec(str);
            }
            throw new java.lang.IllegalArgumentException("refreshToken must not be null".toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/izettle/android/auth/token/RefreshGetTokensSpec$NewBuilder;", "Lkotlin/Function0;", "Lcom/izettle/android/auth/token/RefreshGetTokensSpec$Builder;", "<init>", "()V", "invoke", "()Lcom/izettle/android/auth/token/RefreshGetTokensSpec$Builder;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.izettle.android.auth.token.RefreshGetTokensSpec$NewBuilder, reason: from kotlin metadata */
    public static final class Companion implements kotlin.jvm.functions.Function0<com.izettle.android.auth.token.RefreshGetTokensSpec.Builder> {
        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final com.izettle.android.auth.token.RefreshGetTokensSpec.Builder invoke() {
            return new com.izettle.android.auth.token.RefreshGetTokensSpec.Builder();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
