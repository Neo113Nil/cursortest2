package com.paypal.oslo.feature.identity.login.domain.reducer;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginReducerImpl;", "Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer;", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowState;", "state", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "action", "Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer$ReducerOutput;", "reduce", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowState;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;)Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer$ReducerOutput;", "p0", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;", "p1", "Lkotlin/Function0;", "p2", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowState;Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer$ReducerOutput;", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowState;)Lcom/paypal/oslo/feature/identity/login/domain/reducer/IdentityLoginFlowReducer$ReducerOutput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IdentityLoginReducerImpl implements com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer {
    public static final int $stable = 0;

    @javax.inject.Inject
    public IdentityLoginReducerImpl() {
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer
    public final com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput reduce(final com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState state, com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        if (!(action instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.StartInteractiveAuth)) {
            if (!(action instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Cancel)) {
                if (!(action instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Interrupt)) {
                    if (!(action instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Reset)) {
                        if (!(action instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.BiometricResult)) {
                            if (!(action instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult)) {
                                if (!(action instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.AuthOptionsResult)) {
                                    if (!(action instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult)) {
                                        if (!(action instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PostLoginResult)) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                        com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PostLoginResult postLoginResult = (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PostLoginResult) action;
                                        if (state.getPhase() instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.ProcessingPostLogin) {
                                            return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.copy$default(state, new com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Completed(postLoginResult.getToken()), null, false, null, null, 30, null), kotlin.collections.CollectionsKt.emptyList());
                                        }
                                        return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(state, kotlin.collections.CollectionsKt.emptyList());
                                    }
                                    com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult credentialEntryResult = (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult) action;
                                    if (state.getPhase() instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AwaitingCredentialEntry) {
                                        arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token> result = credentialEntryResult.getResult();
                                        if (!(result instanceof arrow.core.Either.Right)) {
                                            if (!(result instanceof arrow.core.Either.Left)) {
                                                throw new kotlin.NoWhenBranchMatchedException();
                                            }
                                            return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.copy$default(state, new com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Failed((com.paypal.oslo.core.identity.domain.model.TokenError) ((arrow.core.Either.Left) result).getValue()), null, false, null, null, 30, null), kotlin.collections.CollectionsKt.emptyList());
                                        }
                                        return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.copy$default(state, com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.ProcessingPostLogin.INSTANCE, null, false, null, null, 30, null), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.RunPostLogin((com.paypal.oslo.core.identity.domain.model.Token) ((arrow.core.Either.Right) result).getValue())));
                                    }
                                    return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(state, kotlin.collections.CollectionsKt.emptyList());
                                }
                                com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.AuthOptionsResult authOptionsResult = (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.AuthOptionsResult) action;
                                if (state.getPhase() instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.PrefetchingAuthOptions) {
                                    com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser = state.getRememberedUser();
                                    com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState copy$default = com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.copy$default(state, com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AwaitingCredentialEntry.INSTANCE, null, false, null, authOptionsResult.getOptions(), 14, null);
                                    java.lang.String publicCredential = rememberedUser != null ? rememberedUser.getPublicCredential() : null;
                                    if (publicCredential == null) {
                                        publicCredential = "";
                                    }
                                    java.lang.String displayName = rememberedUser != null ? rememberedUser.getDisplayName() : null;
                                    return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(copy$default, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet(publicCredential, displayName != null ? displayName : "", authOptionsResult.getOptions())));
                                }
                                return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(state, kotlin.collections.CollectionsKt.emptyList());
                            }
                            com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult passkeyResult = (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult) action;
                            if (state.getPhase() instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AttemptingPasskey) {
                                return Camera2StreamConfigurationMap(state, passkeyResult.getResult(), new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginReducerImpl$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput Camera2StreamConfigurationMap;
                                        com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginReducerImpl identityLoginReducerImpl = com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginReducerImpl.this;
                                        Camera2StreamConfigurationMap = com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginReducerImpl.Camera2StreamConfigurationMap(state);
                                        return Camera2StreamConfigurationMap;
                                    }
                                });
                            }
                            return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(state, kotlin.collections.CollectionsKt.emptyList());
                        }
                        com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.BiometricResult biometricResult = (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.BiometricResult) action;
                        if (state.getPhase() instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AttemptingBiometric) {
                            return Camera2StreamConfigurationMap(state, biometricResult.getResult(), new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginReducerImpl$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginReducerImpl.$r8$lambda$u2whuRaCfg77SegbHAgi6wUY6jY(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.this, this);
                                }
                            });
                        }
                        return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(state, kotlin.collections.CollectionsKt.emptyList());
                    }
                    if (!state.getPhase().isActive()) {
                        return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState(null, null, false, null, null, 31, null), kotlin.collections.CollectionsKt.emptyList());
                    }
                    return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(state, kotlin.collections.CollectionsKt.emptyList());
                }
                java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.CancelInFlightEffects.INSTANCE);
                if (state.getPhase().getHasVisibleUI()) {
                    mutableListOf.add(com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.DismissAuthUI.INSTANCE);
                }
                return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState(com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Cancelled.INSTANCE, null, false, null, null, 30, null), mutableListOf);
            }
            if (state.getPhase().isActive()) {
                java.util.List mutableListOf2 = kotlin.collections.CollectionsKt.mutableListOf(com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.CancelInFlightEffects.INSTANCE);
                if (state.getPhase().getHasVisibleUI()) {
                    mutableListOf2.add(com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.DismissAuthUI.INSTANCE);
                }
                return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.copy$default(state, com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Cancelled.INSTANCE, null, false, null, null, 30, null), mutableListOf2);
            }
            return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(state, kotlin.collections.CollectionsKt.emptyList());
        }
        com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.StartInteractiveAuth startInteractiveAuth = (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.StartInteractiveAuth) action;
        if (!state.getPhase().isActive()) {
            com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState copy$default2 = com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.copy$default(state, null, startInteractiveAuth.getTokenType(), startInteractiveAuth.isInContext(), startInteractiveAuth.getRememberedUser(), null, 17, null);
            if (!copy$default2.isInContext()) {
                com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState copy$default3 = com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.copy$default(copy$default2, com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AwaitingCredentialEntry.INSTANCE, null, false, null, null, 30, null);
                com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType tokenType = copy$default2.getTokenType();
                if (tokenType == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(copy$default3, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth(tokenType)));
            }
            return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.copy$default(copy$default2, com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AttemptingBiometric.INSTANCE, null, false, null, null, 30, null), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.AttemptBiometric.INSTANCE));
        }
        return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(state, kotlin.collections.CollectionsKt.emptyList());
    }

    private static com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState p0, com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult p1, kotlin.jvm.functions.Function0<com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput> p2) {
        if (!(p1 instanceof com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Success)) {
            if (!(p1 instanceof com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.ChallengeRequired)) {
                if (!(p1 instanceof com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.NotEligible) && !(p1 instanceof com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.UserCancelled) && !(p1 instanceof com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Failed)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return p2.invoke();
            }
            return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.copy$default(p0, com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AwaitingCredentialEntry.INSTANCE, null, false, null, null, 30, null), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToStepUpChallenge(((com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.ChallengeRequired) p1).getChallenge())));
        }
        return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.copy$default(p0, com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.ProcessingPostLogin.INSTANCE, null, false, null, null, 30, null), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.RunPostLogin(((com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Success) p1).getToken())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState p0) {
        com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser = p0.getRememberedUser();
        java.lang.String publicCredential = rememberedUser != null ? rememberedUser.getPublicCredential() : null;
        if (publicCredential == null) {
            com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState copy$default = com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.copy$default(p0, com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AwaitingCredentialEntry.INSTANCE, null, false, null, null, 30, null);
            com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType tokenType = p0.getTokenType();
            if (tokenType == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(copy$default, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth(tokenType)));
        }
        return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.copy$default(p0, com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.PrefetchingAuthOptions.INSTANCE, null, false, null, null, 30, null), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.PrefetchAuthOptions(publicCredential)));
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput $r8$lambda$u2whuRaCfg77SegbHAgi6wUY6jY(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState authFlowState, com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginReducerImpl identityLoginReducerImpl) {
        com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser = authFlowState.getRememberedUser();
        java.lang.String userId = rememberedUser != null ? rememberedUser.getUserId() : null;
        if (userId == null) {
            return Camera2StreamConfigurationMap(authFlowState);
        }
        return new com.paypal.oslo.feature.identity.login.domain.reducer.IdentityLoginFlowReducer.ReducerOutput(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState.copy$default(authFlowState, com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.AttemptingPasskey.INSTANCE, null, false, null, null, 30, null), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.AttemptPasskey(userId)));
    }
}
