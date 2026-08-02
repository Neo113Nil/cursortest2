package com.izettle.android.auth.token;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/izettle/android/auth/token/DefaultGetTokensSpec;", "Lcom/izettle/android/auth/token/GetTokensSpec;", "<init>", "()V", "NewBuilder", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DefaultGetTokensSpec extends com.izettle.android.auth.token.GetTokensSpec {

    /* renamed from: NewBuilder, reason: from kotlin metadata */
    public static final com.izettle.android.auth.token.DefaultGetTokensSpec.Companion INSTANCE = new com.izettle.android.auth.token.DefaultGetTokensSpec.Companion(null);

    public DefaultGetTokensSpec() {
        super(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/izettle/android/auth/token/DefaultGetTokensSpec$Builder;", "", "<init>", "()V", "Lcom/izettle/android/auth/token/DefaultGetTokensSpec;", "build", "()Lcom/izettle/android/auth/token/DefaultGetTokensSpec;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        public final com.izettle.android.auth.token.DefaultGetTokensSpec build() {
            return new com.izettle.android.auth.token.DefaultGetTokensSpec();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/izettle/android/auth/token/DefaultGetTokensSpec$NewBuilder;", "Lkotlin/Function0;", "Lcom/izettle/android/auth/token/DefaultGetTokensSpec$Builder;", "<init>", "()V", "invoke", "()Lcom/izettle/android/auth/token/DefaultGetTokensSpec$Builder;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.izettle.android.auth.token.DefaultGetTokensSpec$NewBuilder, reason: from kotlin metadata */
    public static final class Companion implements kotlin.jvm.functions.Function0<com.izettle.android.auth.token.DefaultGetTokensSpec.Builder> {
        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final com.izettle.android.auth.token.DefaultGetTokensSpec.Builder invoke() {
            return new com.izettle.android.auth.token.DefaultGetTokensSpec.Builder();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
