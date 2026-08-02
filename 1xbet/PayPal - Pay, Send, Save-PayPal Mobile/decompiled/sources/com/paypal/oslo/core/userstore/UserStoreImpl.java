package com.paypal.oslo.core.userstore;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 :2\u00020\u0001:\u0001:B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096@¢\u0006\u0002\u0010\u001dJ$\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0082@¢\u0006\u0002\u0010!J.\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010#2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010&\u001a\u00020'H\u0082@¢\u0006\u0002\u0010(J$\u0010)\u001a\u0004\u0018\u00010*2\n\u0010+\u001a\u00060,j\u0002`-2\u0006\u0010&\u001a\u00020'H\u0082@¢\u0006\u0002\u0010.J \u0010/\u001a\u0004\u0018\u00010\u001a2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%0#H\u0002J&\u00101\u001a\u00020\u00182\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%0#2\u0006\u00102\u001a\u00020\u001aH\u0002J\"\u00103\u001a\u00060,j\u0002`-2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%0#H\u0002J\u001a\u00104\u001a\u00020*2\n\u00105\u001a\u00060,j\u0002`-H\u0082@¢\u0006\u0002\u00106J\u0016\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u00109R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/paypal/oslo/core/userstore/UserStoreImpl;", "Lcom/paypal/oslo/core/userstore/UserStore;", "authStateProvider", "Lcom/paypal/oslo/core/identity/AuthStateProvider;", "userRepository", "Ldagger/Lazy;", "Lcom/paypal/oslo/core/userstore/data/repository/UserRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/paypal/oslo/core/identity/AuthStateProvider;Ldagger/Lazy;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Lcom/paypal/oslo/core/identity/AuthStateProvider;Ldagger/Lazy;)V", "_userState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/core/userstore/model/UserState;", "userState", "Lkotlinx/coroutines/flow/StateFlow;", "getUserState", "()Lkotlinx/coroutines/flow/StateFlow;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "observeAuthState", "", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "Lcom/paypal/oslo/core/userstore/model/User;", "intent", "Lcom/paypal/oslo/core/userstore/model/ProfileIntent;", "(Lcom/paypal/oslo/core/userstore/model/ProfileIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAndUpdateUserProfile", "fetchPolicy", "Lcom/apollographql/apollo/cache/normalized/FetchPolicy;", "(Lcom/apollographql/apollo/cache/normalized/FetchPolicy;Lcom/paypal/oslo/core/userstore/model/ProfileIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeSingleAttempt", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/userstore/model/UserError;", "Lcom/paypal/oslo/core/userstore/graphql/GetProfileQuery$Data;", "attempt", "", "(Lcom/apollographql/apollo/cache/normalized/FetchPolicy;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onRepositoryThrow", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapToUser", "result", "logProfileSuccess", "user", "buildProfileException", "handleProfileError", "error", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateState", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "(Lcom/paypal/oslo/core/userstore/model/UserState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "userstore_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserStoreImpl implements com.paypal.oslo.core.userstore.UserStore {

    @java.lang.Deprecated
    public static final int MAX_PROFILE_FETCH_RETRIES = 2;
    private static final com.paypal.oslo.core.userstore.UserStoreImpl.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.userstore.UserStoreImpl.Companion(null);
    private final kotlinx.coroutines.sync.Mutex Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.userstore.model.UserState> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.identity.AuthStateProvider getHighSpeedVideoSizes;
    private final dagger.Lazy<com.paypal.oslo.core.userstore.data.repository.UserRepository> getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState;

    public UserStoreImpl(com.paypal.oslo.core.identity.AuthStateProvider authStateProvider, dagger.Lazy<com.paypal.oslo.core.userstore.data.repository.UserRepository> lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStateProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoSizes = authStateProvider;
        this.getInputSizeshNQ4ISI = lazy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.userstore.model.UserState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.core.userstore.model.UserState.LoggedOut.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.userState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.getHighSpeedVideoFpsRanges = CoroutineScope;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1(this, null), 3, null);
    }

    public /* synthetic */ UserStoreImpl(com.paypal.oslo.core.identity.AuthStateProvider authStateProvider, dagger.Lazy lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(authStateProvider, lazy, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getDefault() : coroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public UserStoreImpl(com.paypal.oslo.core.identity.AuthStateProvider authStateProvider, dagger.Lazy<com.paypal.oslo.core.userstore.data.repository.UserRepository> lazy) {
        this(authStateProvider, lazy, kotlinx.coroutines.Dispatchers.getDefault());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStateProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
    }

    @Override // com.paypal.oslo.core.userstore.UserStore
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> getUserState() {
        return this.userState;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/userstore/UserStoreImpl$Companion;", "", "<init>", "()V", "", "MAX_PROFILE_FETCH_RETRIES", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.core.userstore.UserStore
    public final java.lang.Object refresh(com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.userstore.model.User> continuation) {
        java.util.Map emptyMap;
        if (profileIntent == null || (emptyMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", profileIntent.name()))) == null) {
            emptyMap = kotlin.collections.MapsKt.emptyMap();
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.userstore.LoggerKt.log, "Refreshing user profile with NetworkFirst fetch policy", emptyMap, null, 4, null);
        return getHighSpeedVideoSizes(com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst, profileIntent, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0189, code lost:
    
        if (getHighSpeedVideoFpsRanges(r1, r2) == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        if (getHighSpeedVideoSizes(r1, r2) != r3) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e5 -> B:21:0x00e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.userstore.model.User> continuation) {
        com.paypal.oslo.core.userstore.UserStoreImpl$fetchAndUpdateUserProfile$1 userStoreImpl$fetchAndUpdateUserProfile$1;
        int i;
        com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy2;
        com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy3;
        int i2;
        com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent3;
        int i3;
        if (continuation instanceof com.paypal.oslo.core.userstore.UserStoreImpl$fetchAndUpdateUserProfile$1) {
            userStoreImpl$fetchAndUpdateUserProfile$1 = (com.paypal.oslo.core.userstore.UserStoreImpl$fetchAndUpdateUserProfile$1) continuation;
            if ((userStoreImpl$fetchAndUpdateUserProfile$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                userStoreImpl$fetchAndUpdateUserProfile$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = userStoreImpl$fetchAndUpdateUserProfile$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userStoreImpl$fetchAndUpdateUserProfile$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.userstore.LoggerKt.log, "Fetching user profile", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fetch_policy", fetchPolicy.toString())), null, 4, null);
                    com.paypal.oslo.core.userstore.model.UserState userState = com.paypal.oslo.core.userstore.model.UserState.ProfileLoading.INSTANCE;
                    fetchPolicy2 = fetchPolicy;
                    userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoFpsRangesFor = fetchPolicy2;
                    profileIntent2 = profileIntent;
                    userStoreImpl$fetchAndUpdateUserProfile$1.getInputSizeshNQ4ISI = profileIntent2;
                    userStoreImpl$fetchAndUpdateUserProfile$1.getOutputMinFrameDuration = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                                throw new kotlin.KotlinNothingValueException();
                            }
                            int i4 = userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoSizes;
                            int i5 = userStoreImpl$fetchAndUpdateUserProfile$1.Camera2StreamConfigurationMap;
                            com.paypal.oslo.core.userstore.model.User user = (com.paypal.oslo.core.userstore.model.User) userStoreImpl$fetchAndUpdateUserProfile$1.getInputFormats;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return user;
                        }
                        int i6 = userStoreImpl$fetchAndUpdateUserProfile$1.getHighResolutionOutputSizeshNQ4ISI;
                        i3 = userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoFpsRanges;
                        int i7 = userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoSizes;
                        i2 = userStoreImpl$fetchAndUpdateUserProfile$1.Camera2StreamConfigurationMap;
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoSizesFor;
                        profileIntent3 = (com.paypal.oslo.core.userstore.model.ProfileIntent) userStoreImpl$fetchAndUpdateUserProfile$1.getInputSizeshNQ4ISI;
                        fetchPolicy3 = (com.apollographql.apollo.cache.normalized.FetchPolicy) userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Ior ior = (arrow.core.Ior) obj;
                        if (ior != null) {
                            com.paypal.oslo.core.userstore.model.User highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(ior);
                            if (highResolutionOutputSizeshNQ4ISI != null) {
                                getHighSpeedVideoSizes((arrow.core.Ior<com.paypal.oslo.core.userstore.model.UserError, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data>) ior, highResolutionOutputSizeshNQ4ISI);
                                com.paypal.oslo.core.userstore.model.UserState profileLoaded = new com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded(highResolutionOutputSizeshNQ4ISI, profileIntent3);
                                userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchPolicy3);
                                userStoreImpl$fetchAndUpdateUserProfile$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(profileIntent3);
                                userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objectRef);
                                userStoreImpl$fetchAndUpdateUserProfile$1.getInputFormats = highResolutionOutputSizeshNQ4ISI;
                                userStoreImpl$fetchAndUpdateUserProfile$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                                userStoreImpl$fetchAndUpdateUserProfile$1.Camera2StreamConfigurationMap = i3;
                                userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoSizes = i6;
                                userStoreImpl$fetchAndUpdateUserProfile$1.getOutputMinFrameDuration = 3;
                                return getHighSpeedVideoSizes(profileLoaded, userStoreImpl$fetchAndUpdateUserProfile$1) != coroutine_suspended ? highResolutionOutputSizeshNQ4ISI : coroutine_suspended;
                            }
                            ?? highSpeedVideoSizes = getHighSpeedVideoSizes(ior);
                            objectRef.element = highSpeedVideoSizes;
                            if (i3 < 2) {
                                com.paypal.android.logger.Logger logger = com.paypal.oslo.core.userstore.LoggerKt.log;
                                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                                pairArr[0] = kotlin.TuplesKt.to("attempt", java.lang.String.valueOf(i3 + 1));
                                pairArr[1] = kotlin.TuplesKt.to("max_retries", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
                                java.lang.String message = highSpeedVideoSizes.getMessage();
                                if (message == null) {
                                    message = "unknown";
                                }
                                pairArr[2] = kotlin.TuplesKt.to("error", message);
                                com.paypal.android.logger.Logger.d$default(logger, "Profile fetch failed, retrying silently", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                            }
                        }
                        i3 = i7 + 1;
                        if (i3 >= i2) {
                            userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoFpsRangesFor = fetchPolicy3;
                            userStoreImpl$fetchAndUpdateUserProfile$1.getInputSizeshNQ4ISI = profileIntent3;
                            userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoSizesFor = objectRef;
                            userStoreImpl$fetchAndUpdateUserProfile$1.Camera2StreamConfigurationMap = i2;
                            userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoSizes = i3;
                            userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoFpsRanges = i3;
                            userStoreImpl$fetchAndUpdateUserProfile$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            userStoreImpl$fetchAndUpdateUserProfile$1.getOutputMinFrameDuration = 2;
                            obj = getHighResolutionOutputSizeshNQ4ISI(fetchPolicy3, i3, userStoreImpl$fetchAndUpdateUserProfile$1);
                            if (obj != coroutine_suspended) {
                                i6 = 0;
                                i7 = i3;
                                arrow.core.Ior ior2 = (arrow.core.Ior) obj;
                                if (ior2 != null) {
                                }
                                i3 = i7 + 1;
                                if (i3 >= i2) {
                                    java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                                    if (exc == null) {
                                        throw new java.lang.IllegalStateException("No exception captured after retries".toString());
                                    }
                                    userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchPolicy3);
                                    userStoreImpl$fetchAndUpdateUserProfile$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(profileIntent3);
                                    userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objectRef);
                                    userStoreImpl$fetchAndUpdateUserProfile$1.getOutputMinFrameDuration = 4;
                                }
                            }
                        }
                    }
                    com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent4 = (com.paypal.oslo.core.userstore.model.ProfileIntent) userStoreImpl$fetchAndUpdateUserProfile$1.getInputSizeshNQ4ISI;
                    com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy4 = (com.apollographql.apollo.cache.normalized.FetchPolicy) userStoreImpl$fetchAndUpdateUserProfile$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    profileIntent2 = profileIntent4;
                    fetchPolicy2 = fetchPolicy4;
                }
                objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                fetchPolicy3 = fetchPolicy2;
                i2 = 3;
                profileIntent3 = profileIntent2;
                i3 = 0;
                if (i3 >= i2) {
                }
            }
        }
        userStoreImpl$fetchAndUpdateUserProfile$1 = new com.paypal.oslo.core.userstore.UserStoreImpl$fetchAndUpdateUserProfile$1(this, continuation);
        java.lang.Object obj2 = userStoreImpl$fetchAndUpdateUserProfile$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userStoreImpl$fetchAndUpdateUserProfile$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        fetchPolicy3 = fetchPolicy2;
        i2 = 3;
        profileIntent3 = profileIntent2;
        i3 = 0;
        if (i3 >= i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(3:19|20|21))(3:22|23|24))(2:25|26))(2:30|31)|27|28))|43|6|7|(0)(0)|27|28|(3:(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
    
        r0.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8);
        r0.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10);
        r0.Camera2StreamConfigurationMap = r9;
        r0.getHighSpeedVideoFpsRangesFor = 2;
        r10 = getHighResolutionOutputSizeshNQ4ISI(r10, r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        if (r10 != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        r0.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8);
        r0.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10);
        r0.Camera2StreamConfigurationMap = r9;
        r0.getHighSpeedVideoFpsRangesFor = 3;
        r10 = getHighResolutionOutputSizeshNQ4ISI(r10, r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        r2 = new java.io.IOException("Unexpected exception from getUserProfile", r10);
        r0.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8);
        r0.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10);
        r0.Camera2StreamConfigurationMap = r9;
        r0.getHighSpeedVideoFpsRangesFor = 4;
        r10 = getHighResolutionOutputSizeshNQ4ISI(r2, r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, int i, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.core.userstore.model.UserError, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data>> continuation) {
        com.paypal.oslo.core.userstore.UserStoreImpl$executeSingleAttempt$1 userStoreImpl$executeSingleAttempt$1;
        int i2;
        if (continuation instanceof com.paypal.oslo.core.userstore.UserStoreImpl$executeSingleAttempt$1) {
            userStoreImpl$executeSingleAttempt$1 = (com.paypal.oslo.core.userstore.UserStoreImpl$executeSingleAttempt$1) continuation;
            if ((userStoreImpl$executeSingleAttempt$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                userStoreImpl$executeSingleAttempt$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = userStoreImpl$executeSingleAttempt$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = userStoreImpl$executeSingleAttempt$1.getHighSpeedVideoFpsRangesFor;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.userstore.data.repository.UserRepository userRepository = this.getInputSizeshNQ4ISI.get();
                    userStoreImpl$executeSingleAttempt$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchPolicy);
                    userStoreImpl$executeSingleAttempt$1.Camera2StreamConfigurationMap = i;
                    userStoreImpl$executeSingleAttempt$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = userRepository.getUserProfile(fetchPolicy, userStoreImpl$executeSingleAttempt$1);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            int i3 = userStoreImpl$executeSingleAttempt$1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return (arrow.core.Ior) obj;
                        }
                        if (i2 == 3) {
                            int i4 = userStoreImpl$executeSingleAttempt$1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return (arrow.core.Ior) obj;
                        }
                        if (i2 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i5 = userStoreImpl$executeSingleAttempt$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (arrow.core.Ior) obj;
                    }
                    i = userStoreImpl$executeSingleAttempt$1.Camera2StreamConfigurationMap;
                    fetchPolicy = (com.apollographql.apollo.cache.normalized.FetchPolicy) userStoreImpl$executeSingleAttempt$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return (arrow.core.Ior) obj;
            }
        }
        userStoreImpl$executeSingleAttempt$1 = new com.paypal.oslo.core.userstore.UserStoreImpl$executeSingleAttempt$1(this, continuation);
        java.lang.Object obj2 = userStoreImpl$executeSingleAttempt$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = userStoreImpl$executeSingleAttempt$1.getHighSpeedVideoFpsRangesFor;
        if (i2 != 0) {
        }
        return (arrow.core.Ior) obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.Exception exc, int i, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.core.userstore.UserStoreImpl$onRepositoryThrow$1 userStoreImpl$onRepositoryThrow$1;
        int i2;
        if (continuation instanceof com.paypal.oslo.core.userstore.UserStoreImpl$onRepositoryThrow$1) {
            userStoreImpl$onRepositoryThrow$1 = (com.paypal.oslo.core.userstore.UserStoreImpl$onRepositoryThrow$1) continuation;
            if ((userStoreImpl$onRepositoryThrow$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                userStoreImpl$onRepositoryThrow$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = userStoreImpl$onRepositoryThrow$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = userStoreImpl$onRepositoryThrow$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.userstore.LoggerKt.log, "getUserProfile threw an exception", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attempt", java.lang.String.valueOf(i + 1)), kotlin.TuplesKt.to("error", exc.toString())), null, 4, null);
                    if (i < 2) {
                        return null;
                    }
                    userStoreImpl$onRepositoryThrow$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(exc);
                    userStoreImpl$onRepositoryThrow$1.Camera2StreamConfigurationMap = i;
                    userStoreImpl$onRepositoryThrow$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (getHighSpeedVideoFpsRanges(exc, userStoreImpl$onRepositoryThrow$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = userStoreImpl$onRepositoryThrow$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        userStoreImpl$onRepositoryThrow$1 = new com.paypal.oslo.core.userstore.UserStoreImpl$onRepositoryThrow$1(this, continuation);
        java.lang.Object obj2 = userStoreImpl$onRepositoryThrow$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = userStoreImpl$onRepositoryThrow$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    private static com.paypal.oslo.core.userstore.model.User getHighResolutionOutputSizeshNQ4ISI(arrow.core.Ior<com.paypal.oslo.core.userstore.model.UserError, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data> ior) {
        try {
            com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data orNull = ior.getOrNull();
            if (orNull != null) {
                return com.paypal.oslo.core.userstore.data.mapper.UserMapperKt.toUser(orNull);
            }
            return null;
        } catch (com.paypal.oslo.core.userstore.model.UserError e) {
            com.paypal.oslo.core.userstore.LoggerKt.log.e("Failed to map profile data to User", e);
            return null;
        }
    }

    private static void getHighSpeedVideoSizes(arrow.core.Ior<com.paypal.oslo.core.userstore.model.UserError, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data> ior, com.paypal.oslo.core.userstore.model.User user) {
        com.paypal.oslo.core.userstore.model.UserError leftOrNull = ior.leftOrNull();
        if (leftOrNull != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.userstore.LoggerKt.log, "GraphQL query returned partial success - user data loaded despite errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", leftOrNull.getMessage())), null, 4, null);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.userstore.LoggerKt.log, "Successfully fetched user profile", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("user_id", user.getId())), 2, null);
        }
    }

    private static java.lang.Exception getHighSpeedVideoSizes(arrow.core.Ior<com.paypal.oslo.core.userstore.model.UserError, com.paypal.oslo.core.userstore.graphql.GetProfileQuery.Data> ior) {
        java.lang.String str;
        com.paypal.oslo.core.userstore.model.UserError leftOrNull = ior.leftOrNull();
        if (ior.isRight()) {
            str = "Profile data missing from successful GraphQL response";
        } else if (ior.isBoth()) {
            if (leftOrNull == null || (str = leftOrNull.getMessage()) == null) {
                str = "GraphQL query returned errors with no user data";
            }
        } else if (!ior.isLeft() || leftOrNull == null || (str = leftOrNull.getMessage()) == null) {
            str = "Unknown GraphQL error";
        }
        return ior.isRight() ? new java.lang.IllegalStateException(str) : new java.io.IOException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.Exception exc, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.userstore.UserStoreImpl$handleProfileError$1 userStoreImpl$handleProfileError$1;
        int i;
        if (continuation instanceof com.paypal.oslo.core.userstore.UserStoreImpl$handleProfileError$1) {
            userStoreImpl$handleProfileError$1 = (com.paypal.oslo.core.userstore.UserStoreImpl$handleProfileError$1) continuation;
            if ((userStoreImpl$handleProfileError$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                userStoreImpl$handleProfileError$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = userStoreImpl$handleProfileError$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userStoreImpl$handleProfileError$1.getHighSpeedVideoFpsRangesFor;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Exception exc2 = (java.lang.Exception) userStoreImpl$handleProfileError$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw exc2;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.core.userstore.model.UserState profileError = new com.paypal.oslo.core.userstore.model.UserState.ProfileError(exc);
                userStoreImpl$handleProfileError$1.getHighSpeedVideoFpsRanges = exc;
                userStoreImpl$handleProfileError$1.getHighSpeedVideoFpsRangesFor = 1;
                if (getHighSpeedVideoSizes(profileError, userStoreImpl$handleProfileError$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw exc;
            }
        }
        userStoreImpl$handleProfileError$1 = new com.paypal.oslo.core.userstore.UserStoreImpl$handleProfileError$1(this, continuation);
        java.lang.Object obj2 = userStoreImpl$handleProfileError$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userStoreImpl$handleProfileError$1.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062 A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:11:0x0054, B:13:0x0062, B:14:0x00a0), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.core.userstore.model.UserState userState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.userstore.UserStoreImpl$updateState$1 userStoreImpl$updateState$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.paypal.oslo.core.userstore.model.UserState value;
        try {
            if (continuation instanceof com.paypal.oslo.core.userstore.UserStoreImpl$updateState$1) {
                userStoreImpl$updateState$1 = (com.paypal.oslo.core.userstore.UserStoreImpl$updateState$1) continuation;
                if ((userStoreImpl$updateState$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    userStoreImpl$updateState$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = userStoreImpl$updateState$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = userStoreImpl$updateState$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.Camera2StreamConfigurationMap;
                        userStoreImpl$updateState$1.getHighSpeedVideoFpsRangesFor = userState;
                        userStoreImpl$updateState$1.getHighSpeedVideoFpsRanges = mutex;
                        userStoreImpl$updateState$1.Camera2StreamConfigurationMap = 0;
                        userStoreImpl$updateState$1.getHighSpeedVideoSizes = 1;
                        if (mutex.lock(null, userStoreImpl$updateState$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = userStoreImpl$updateState$1.Camera2StreamConfigurationMap;
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) userStoreImpl$updateState$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.core.userstore.model.UserState userState2 = (com.paypal.oslo.core.userstore.model.UserState) userStoreImpl$updateState$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        userState = userState2;
                    }
                    value = this.getHighSpeedVideoFpsRangesFor.getValue();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(value, userState)) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.userstore.LoggerKt.log, "UserState transition", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("previous_state", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName()), kotlin.TuplesKt.to("new_state", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(userState.getClass()).getSimpleName())), null, 4, null);
                        this.getHighSpeedVideoFpsRangesFor.setValue(userState);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            value = this.getHighSpeedVideoFpsRangesFor.getValue();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(value, userState)) {
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        userStoreImpl$updateState$1 = new com.paypal.oslo.core.userstore.UserStoreImpl$updateState$1(this, continuation);
        java.lang.Object obj2 = userStoreImpl$updateState$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userStoreImpl$updateState$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
    }
}
