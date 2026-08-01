package com.unity3d.services.core.di;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.AndroidManifestStringPropertyReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.CachedFIdDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FIdDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.ForegroundDurationReader;
import com.unity3d.ads.core.data.datasource.GoogleAppIdDataSource;
import com.unity3d.ads.core.data.datasource.InstallReferrerDataSource;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOfferwallManager;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.GatewayUrl;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRevenueRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AdRefresh;
import com.unity3d.ads.core.domain.AndroidAdRefresh;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidCacheAssets;
import com.unity3d.ads.core.domain.AndroidCacheWebViewAssets;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleFocusCounters;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidIntentCreation;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheAssets;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonCleanAssets;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonMediationInfoConverter;
import com.unity3d.ads.core.domain.CommonMediationProviderParser;
import com.unity3d.ads.core.domain.CommonSafeCallbackInvoke;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonTokenNumberProvider;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAssetFileName;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleDebugSettings;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.IntentCreation;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.MediationInfoConverter;
import com.unity3d.ads.core.domain.MediationProviderParser;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateExtrasSize;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality;
import com.unity3d.ads.core.domain.adquality.AndroidUpdateAdQualitySessionToken;
import com.unity3d.ads.core.domain.adquality.InitializeAdQuality;
import com.unity3d.ads.core.domain.adquality.UpdateAdQualitySessionToken;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback;
import com.unity3d.ads.core.domain.coherence.AndroidCoherenceLibraryManager;
import com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager;
import com.unity3d.ads.core.domain.events.AdRevenueObserver;
import com.unity3d.ads.core.domain.events.AndroidGetAdRevenueEventData;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetAdRevenueEventData;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.LifecycleEventObserver;
import com.unity3d.ads.core.domain.events.MaxAdRevenueCommunicatorProxyFactory;
import com.unity3d.ads.core.domain.events.MaxAdRevenueObserver;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.log.UnityLogger;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.gatewayclient.AndroidRequestUrlFactory;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestUrlFactory;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.fid.Constants;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.reflection.AppLovinCommunicatorBridge;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: ServiceProvider.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00101\u001a\u000200H\u0016J\b\u00102\u001a\u000200H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020#X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020'X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/unity3d/services/core/di/ServiceProvider;", "Lcom/unity3d/services/core/di/IServiceProvider;", "<init>", "()V", "NAMED_SDK", "", "NAMED_INIT_SCOPE", "NAMED_LOAD_SCOPE", "NAMED_SHOW_SCOPE", "NAMED_GET_TOKEN_SCOPE", "NAMED_TRANSACTION_SCOPE", "NAMED_ILRD_SCOPE", "NAMED_LIFECYCLE_SCOPE", "NAMED_OMID_SCOPE", "NAMED_INIT_REQ", "NAMED_OPERATIVE_REQ", "NAMED_OTHER_REQ", "NAMED_AD_REQ", "NAMED_PUBLIC_JOB", "NAMED_LOCAL", "NAMED_REMOTE", "NAMED_OFFERWALL_SCOPE", "LEGACY_PRIVACY_RULES", "DEV_CONSENT_PRIVACY_RULES", "DATA_STORE_GATEWAY_CACHE", "DATA_STORE_PRIVACY", "DATA_STORE_PRIVACY_FSM", "DATA_STORE_NATIVE_CONFIG", "DATA_STORE_IAP_TRANSACTION", "DATA_STORE_UNIVERSAL_REQUEST", "DATA_STORE_GL_INFO", "DATA_STORE_WEBVIEW_CONFIG", "PREF_GL_INFO", "GATEWAY_HOST", "GATEWAY_PORT", "", "CDN_CREATIVES_HOST", "CDN_CREATIVES_PORT", "HTTP_CACHE_DISK_SIZE", "", "HTTP_CLIENT_FETCH_TIMEOUT", "MAIN_DISPATCHER", "DEFAULT_DISPATCHER", "IO_DISPATCHER", "UNIVERSAL_EVENT_SENDER", "DIAGNOSTICS_EVENT_SENDER", "OPERATIVE_EVENT_SENDER", "serviceRegistry", "Lcom/unity3d/services/core/di/IServicesRegistry;", "getRegistry", "initialize", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ServiceProvider implements IServiceProvider {
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";
    public static final String DATA_STORE_PRIVACY = "privacy.pb";
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";
    public static final String DIAGNOSTICS_EVENT_SENDER = "diagnostics";
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;
    public static final ServiceProvider INSTANCE;
    public static final String IO_DISPATCHER = "io_dispatcher";
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";
    public static final String MAIN_DISPATCHER = "main_dispatcher";
    public static final String NAMED_AD_REQ = "ad_req";
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";
    public static final String NAMED_ILRD_SCOPE = "ilrd_scope";
    public static final String NAMED_INIT_REQ = "init_req";
    public static final String NAMED_INIT_SCOPE = "init_scope";
    public static final String NAMED_LIFECYCLE_SCOPE = "lifecycle_scope";
    public static final String NAMED_LOAD_SCOPE = "load_scope";
    public static final String NAMED_LOCAL = "local";
    public static final String NAMED_OFFERWALL_SCOPE = "offerwall_scope";
    public static final String NAMED_OMID_SCOPE = "omid_scope";
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";
    public static final String NAMED_OTHER_REQ = "other_req";
    public static final String NAMED_PUBLIC_JOB = "public_job";
    public static final String NAMED_REMOTE = "remote";
    public static final String NAMED_SDK = "sdk";
    public static final String NAMED_SHOW_SCOPE = "show_scope";
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";
    public static final String OPERATIVE_EVENT_SENDER = "operative";
    public static final String PREF_GL_INFO = "glinfo";
    public static final String UNIVERSAL_EVENT_SENDER = "universal";
    private static final IServicesRegistry serviceRegistry;

    private ServiceProvider() {
    }

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(new Function1() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda132
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit initialize$lambda$220;
                initialize$lambda$220 = ServiceProvider.initialize$lambda$220((ServicesRegistry) obj);
                return initialize$lambda$220;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$220(final ServicesRegistry registry) {
        Intrinsics.checkNotNullParameter(registry, "$this$registry");
        final UnityAdsModule unityAdsModule = new UnityAdsModule();
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Context applicationContext;
                applicationContext = ClientProperties.getApplicationContext();
                return applicationContext;
            }
        }));
        registry.updateService(new ServiceKey(MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineDispatcher mainDispatcher;
                mainDispatcher = UnityAdsModule.this.mainDispatcher();
                return mainDispatcher;
            }
        }));
        registry.updateService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineDispatcher defaultDispatcher;
                defaultDispatcher = UnityAdsModule.this.defaultDispatcher();
                return defaultDispatcher;
            }
        }));
        registry.updateService(new ServiceKey(IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineDispatcher ioDispatcher;
                ioDispatcher = UnityAdsModule.this.ioDispatcher();
                return ioDispatcher;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ISDKDispatchers sdkDispatchers;
                sdkDispatchers = UnityAdsModule.this.sdkDispatchers();
                return sdkDispatchers;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_INIT_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda82
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineScope initialize$lambda$220$lambda$5;
                initialize$lambda$220$lambda$5 = ServiceProvider.initialize$lambda$220$lambda$5(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$5;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_LOAD_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda94
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineScope initialize$lambda$220$lambda$6;
                initialize$lambda$220$lambda$6 = ServiceProvider.initialize$lambda$220$lambda$6(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$6;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_SHOW_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda106
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineScope initialize$lambda$220$lambda$7;
                initialize$lambda$220$lambda$7 = ServiceProvider.initialize$lambda$220$lambda$7(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$7;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_TRANSACTION_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda119
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineScope initialize$lambda$220$lambda$8;
                initialize$lambda$220$lambda$8 = ServiceProvider.initialize$lambda$220$lambda$8(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$8;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_ILRD_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda131
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineScope initialize$lambda$220$lambda$9;
                initialize$lambda$220$lambda$9 = ServiceProvider.initialize$lambda$220$lambda$9(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$9;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_LIFECYCLE_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineScope initialize$lambda$220$lambda$10;
                initialize$lambda$220$lambda$10 = ServiceProvider.initialize$lambda$220$lambda$10(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$10;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_GET_TOKEN_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda134
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineScope initialize$lambda$220$lambda$11;
                initialize$lambda$220$lambda$11 = ServiceProvider.initialize$lambda$220$lambda$11(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$11;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_OFFERWALL_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda146
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineScope initialize$lambda$220$lambda$12;
                initialize$lambda$220$lambda$12 = ServiceProvider.initialize$lambda$220$lambda$12(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$12;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_OMID_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda158
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineScope initialize$lambda$220$lambda$13;
                initialize$lambda$220$lambda$13 = ServiceProvider.initialize$lambda$220$lambda$13(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$13;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda170
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Job initialize$lambda$220$lambda$14;
                initialize$lambda$220$lambda$14 = ServiceProvider.initialize$lambda$220$lambda$14(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$14;
            }
        }));
        registry.updateService(new ServiceKey(DATA_STORE_GATEWAY_CACHE, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda182
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ByteStringDataSource initialize$lambda$220$lambda$15;
                initialize$lambda$220$lambda$15 = ServiceProvider.initialize$lambda$220$lambda$15(ServicesRegistry.this);
                return initialize$lambda$220$lambda$15;
            }
        }));
        registry.updateService(new ServiceKey(DATA_STORE_PRIVACY, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda194
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DataStore initialize$lambda$220$lambda$16;
                initialize$lambda$220$lambda$16 = ServiceProvider.initialize$lambda$220$lambda$16(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$16;
            }
        }));
        registry.updateService(new ServiceKey(DATA_STORE_PRIVACY, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda206
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ByteStringDataSource initialize$lambda$220$lambda$17;
                initialize$lambda$220$lambda$17 = ServiceProvider.initialize$lambda$220$lambda$17(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$17;
            }
        }));
        registry.updateService(new ServiceKey(DATA_STORE_PRIVACY_FSM, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda218
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DataStore initialize$lambda$220$lambda$18;
                initialize$lambda$220$lambda$18 = ServiceProvider.initialize$lambda$220$lambda$18(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$18;
            }
        }));
        registry.updateService(new ServiceKey(DATA_STORE_PRIVACY_FSM, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ByteStringDataSource initialize$lambda$220$lambda$19;
                initialize$lambda$220$lambda$19 = ServiceProvider.initialize$lambda$220$lambda$19(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$19;
            }
        }));
        registry.updateService(new ServiceKey(DATA_STORE_NATIVE_CONFIG, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DataStore initialize$lambda$220$lambda$20;
                initialize$lambda$220$lambda$20 = ServiceProvider.initialize$lambda$220$lambda$20(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$20;
            }
        }));
        registry.updateService(new ServiceKey(DATA_STORE_NATIVE_CONFIG, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ByteStringDataSource initialize$lambda$220$lambda$21;
                initialize$lambda$220$lambda$21 = ServiceProvider.initialize$lambda$220$lambda$21(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$21;
            }
        }));
        registry.updateService(new ServiceKey(DATA_STORE_GL_INFO, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DataStore initialize$lambda$220$lambda$22;
                initialize$lambda$220$lambda$22 = ServiceProvider.initialize$lambda$220$lambda$22(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$22;
            }
        }));
        registry.updateService(new ServiceKey(DATA_STORE_GL_INFO, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ByteStringDataSource initialize$lambda$220$lambda$23;
                initialize$lambda$220$lambda$23 = ServiceProvider.initialize$lambda$220$lambda$23(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$23;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UniversalRequestDataStoreProvider.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UniversalRequestDataStoreProvider initialize$lambda$220$lambda$24;
                initialize$lambda$220$lambda$24 = ServiceProvider.initialize$lambda$220$lambda$24(ServicesRegistry.this);
                return initialize$lambda$220$lambda$24;
            }
        }));
        registry.updateService(new ServiceKey(DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DataStore initialize$lambda$220$lambda$25;
                initialize$lambda$220$lambda$25 = ServiceProvider.initialize$lambda$220$lambda$25(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$25;
            }
        }));
        registry.updateService(new ServiceKey(DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ByteStringDataSource initialize$lambda$220$lambda$26;
                initialize$lambda$220$lambda$26 = ServiceProvider.initialize$lambda$220$lambda$26(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$26;
            }
        }));
        registry.updateService(new ServiceKey(DATA_STORE_WEBVIEW_CONFIG, Reflection.getOrCreateKotlinClass(DataStore.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DataStore initialize$lambda$220$lambda$27;
                initialize$lambda$220$lambda$27 = ServiceProvider.initialize$lambda$220$lambda$27(UnityAdsModule.this, registry);
                return initialize$lambda$220$lambda$27;
            }
        }));
        registry.updateService(new ServiceKey("PUBLIC", Reflection.getOrCreateKotlinClass(JsonStorage.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                JsonStorage publicJsonStorage;
                publicJsonStorage = UnityAdsModule.this.publicJsonStorage();
                return publicJsonStorage;
            }
        }));
        registry.updateService(new ServiceKey("PRIVATE", Reflection.getOrCreateKotlinClass(JsonStorage.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                JsonStorage privateJsonStorage;
                privateJsonStorage = UnityAdsModule.this.privateJsonStorage();
                return privateJsonStorage;
            }
        }));
        registry.updateService(new ServiceKey("MEMORY", Reflection.getOrCreateKotlinClass(JsonStorage.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                JsonStorage memoryJsonStorage;
                memoryJsonStorage = UnityAdsModule.this.memoryJsonStorage();
                return memoryJsonStorage;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(NativeConfigurationOuterClass.NativeConfiguration.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration;
                defaultNativeConfiguration = UnityAdsModule.this.defaultNativeConfiguration();
                return defaultNativeConfiguration;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CronetEngineBuilderFactory.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CronetEngineBuilderFactory initialize$lambda$220$lambda$32;
                initialize$lambda$220$lambda$32 = ServiceProvider.initialize$lambda$220$lambda$32();
                return initialize$lambda$220$lambda$32;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HttpClientProvider.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HttpClientProvider initialize$lambda$220$lambda$33;
                initialize$lambda$220$lambda$33 = ServiceProvider.initialize$lambda$220$lambda$33(ServicesRegistry.this);
                return initialize$lambda$220$lambda$33;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HttpClient.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HttpClient initialize$lambda$220$lambda$34;
                initialize$lambda$220$lambda$34 = ServiceProvider.initialize$lambda$220$lambda$34(ServicesRegistry.this);
                return initialize$lambda$220$lambda$34;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationTraitsMetadataReader.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MediationTraitsMetadataReader initialize$lambda$220$lambda$35;
                initialize$lambda$220$lambda$35 = ServiceProvider.initialize$lambda$220$lambda$35(ServicesRegistry.this);
                return initialize$lambda$220$lambda$35;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TcfDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TcfDataSource initialize$lambda$220$lambda$36;
                initialize$lambda$220$lambda$36 = ServiceProvider.initialize$lambda$220$lambda$36();
                return initialize$lambda$220$lambda$36;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TcfRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TcfRepository initialize$lambda$220$lambda$37;
                initialize$lambda$220$lambda$37 = ServiceProvider.initialize$lambda$220$lambda$37(ServicesRegistry.this);
                return initialize$lambda$220$lambda$37;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidManifestIntPropertyReader.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidManifestIntPropertyReader initialize$lambda$220$lambda$38;
                initialize$lambda$220$lambda$38 = ServiceProvider.initialize$lambda$220$lambda$38(ServicesRegistry.this);
                return initialize$lambda$220$lambda$38;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidManifestStringPropertyReader.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda57
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidManifestStringPropertyReader initialize$lambda$220$lambda$39;
                initialize$lambda$220$lambda$39 = ServiceProvider.initialize$lambda$220$lambda$39(ServicesRegistry.this);
                return initialize$lambda$220$lambda$39;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayUrl.class)), LazyKt.lazy(new Function0<GatewayUrl>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1$41
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ GatewayUrl invoke() {
                return GatewayUrl.m7610boximpl(m7785invokeBZg6m_U());
            }

            /* renamed from: invoke-BZg6m_U, reason: not valid java name */
            public final String m7785invokeBZg6m_U() {
                String provideGatewayUrl;
                provideGatewayUrl = ServiceProviderKt.provideGatewayUrl((AndroidManifestStringPropertyReader) ServicesRegistry.this.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidManifestStringPropertyReader.class))));
                return provideGatewayUrl;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidTestDataInfo.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda59
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidTestDataInfo initialize$lambda$220$lambda$40;
                initialize$lambda$220$lambda$40 = ServiceProvider.initialize$lambda$220$lambda$40(ServicesRegistry.this);
                return initialize$lambda$220$lambda$40;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GameServerIdReader.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GameServerIdReader initialize$lambda$220$lambda$41;
                initialize$lambda$220$lambda$41 = ServiceProvider.initialize$lambda$220$lambda$41(ServicesRegistry.this);
                return initialize$lambda$220$lambda$41;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda61
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StoreDataSource initialize$lambda$220$lambda$42;
                initialize$lambda$220$lambda$42 = ServiceProvider.initialize$lambda$220$lambda$42(ServicesRegistry.this);
                return initialize$lambda$220$lambda$42;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AnalyticsDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda62
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AnalyticsDataSource initialize$lambda$220$lambda$43;
                initialize$lambda$220$lambda$43 = ServiceProvider.initialize$lambda$220$lambda$43();
                return initialize$lambda$220$lambda$43;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeveloperConsentDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda63
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeveloperConsentDataSource initialize$lambda$220$lambda$44;
                initialize$lambda$220$lambda$44 = ServiceProvider.initialize$lambda$220$lambda$44(ServicesRegistry.this);
                return initialize$lambda$220$lambda$44;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DynamicDeviceInfoDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda64
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DynamicDeviceInfoDataSource initialize$lambda$220$lambda$45;
                initialize$lambda$220$lambda$45 = ServiceProvider.initialize$lambda$220$lambda$45(ServicesRegistry.this);
                return initialize$lambda$220$lambda$45;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LegacyUserConsentDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda65
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LegacyUserConsentDataSource initialize$lambda$220$lambda$46;
                initialize$lambda$220$lambda$46 = ServiceProvider.initialize$lambda$220$lambda$46(ServicesRegistry.this);
                return initialize$lambda$220$lambda$46;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LifecycleDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda67
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LifecycleDataSource initialize$lambda$220$lambda$47;
                initialize$lambda$220$lambda$47 = ServiceProvider.initialize$lambda$220$lambda$47();
                return initialize$lambda$220$lambda$47;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ForegroundDurationReader.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda68
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ForegroundDurationReader initialize$lambda$220$lambda$49;
                initialize$lambda$220$lambda$49 = ServiceProvider.initialize$lambda$220$lambda$49(ServicesRegistry.this);
                return initialize$lambda$220$lambda$49;
            }
        }));
        registry.updateService(new ServiceKey("local", Reflection.getOrCreateKotlinClass(CacheDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda69
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CacheDataSource initialize$lambda$220$lambda$50;
                initialize$lambda$220$lambda$50 = ServiceProvider.initialize$lambda$220$lambda$50(ServicesRegistry.this);
                return initialize$lambda$220$lambda$50;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CreateFile.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda71
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CreateFile initialize$lambda$220$lambda$51;
                initialize$lambda$220$lambda$51 = ServiceProvider.initialize$lambda$220$lambda$51();
                return initialize$lambda$220$lambda$51;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetFileExtensionFromUrl.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda72
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetFileExtensionFromUrl initialize$lambda$220$lambda$52;
                initialize$lambda$220$lambda$52 = ServiceProvider.initialize$lambda$220$lambda$52(ServicesRegistry.this);
                return initialize$lambda$220$lambda$52;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(RemoveUrlQuery.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda73
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RemoveUrlQuery initialize$lambda$220$lambda$53;
                initialize$lambda$220$lambda$53 = ServiceProvider.initialize$lambda$220$lambda$53();
                return initialize$lambda$220$lambda$53;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda74
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MediationDataSource initialize$lambda$220$lambda$54;
                initialize$lambda$220$lambda$54 = ServiceProvider.initialize$lambda$220$lambda$54(ServicesRegistry.this);
                return initialize$lambda$220$lambda$54;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(PrivacyDeviceInfoDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda75
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PrivacyDeviceInfoDataSource initialize$lambda$220$lambda$55;
                initialize$lambda$220$lambda$55 = ServiceProvider.initialize$lambda$220$lambda$55(ServicesRegistry.this);
                return initialize$lambda$220$lambda$55;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_REMOTE, Reflection.getOrCreateKotlinClass(CacheDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda76
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CacheDataSource initialize$lambda$220$lambda$56;
                initialize$lambda$220$lambda$56 = ServiceProvider.initialize$lambda$220$lambda$56(ServicesRegistry.this);
                return initialize$lambda$220$lambda$56;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StaticDeviceInfoDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda78
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StaticDeviceInfoDataSource initialize$lambda$220$lambda$57;
                initialize$lambda$220$lambda$57 = ServiceProvider.initialize$lambda$220$lambda$57(ServicesRegistry.this);
                return initialize$lambda$220$lambda$57;
            }
        }));
        registry.updateService(new ServiceKey(PREF_GL_INFO, Reflection.getOrCreateKotlinClass(DataMigration.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda79
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DataMigration initialize$lambda$220$lambda$58;
                initialize$lambda$220$lambda$58 = ServiceProvider.initialize$lambda$220$lambda$58(ServicesRegistry.this);
                return initialize$lambda$220$lambda$58;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UniversalRequestDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda80
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UniversalRequestDataSource initialize$lambda$220$lambda$59;
                initialize$lambda$220$lambda$59 = ServiceProvider.initialize$lambda$220$lambda$59(ServicesRegistry.this);
                return initialize$lambda$220$lambda$59;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(WebviewConfigurationDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda81
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebviewConfigurationDataSource initialize$lambda$220$lambda$60;
                initialize$lambda$220$lambda$60 = ServiceProvider.initialize$lambda$220$lambda$60(ServicesRegistry.this);
                return initialize$lambda$220$lambda$60;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OmidManager.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda83
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OmidManager initialize$lambda$220$lambda$61;
                initialize$lambda$220$lambda$61 = ServiceProvider.initialize$lambda$220$lambda$61();
                return initialize$lambda$220$lambda$61;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SDKPropertiesManager.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda84
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SDKPropertiesManager initialize$lambda$220$lambda$62;
                initialize$lambda$220$lambda$62 = ServiceProvider.initialize$lambda$220$lambda$62();
                return initialize$lambda$220$lambda$62;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StorageManager.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda85
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StorageManager initialize$lambda$220$lambda$63;
                initialize$lambda$220$lambda$63 = ServiceProvider.initialize$lambda$220$lambda$63();
                return initialize$lambda$220$lambda$63;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(BillingClientAdapter.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda86
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillingClientAdapter initialize$lambda$220$lambda$64;
                initialize$lambda$220$lambda$64 = ServiceProvider.initialize$lambda$220$lambda$64(ServicesRegistry.this);
                return initialize$lambda$220$lambda$64;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ProductDetailsFetcher.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda87
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ProductDetailsFetcher initialize$lambda$220$lambda$65;
                initialize$lambda$220$lambda$65 = ServiceProvider.initialize$lambda$220$lambda$65(ServicesRegistry.this);
                return initialize$lambda$220$lambda$65;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventManager.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda89
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionEventManager initialize$lambda$220$lambda$66;
                initialize$lambda$220$lambda$66 = ServiceProvider.initialize$lambda$220$lambda$66(ServicesRegistry.this);
                return initialize$lambda$220$lambda$66;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda90
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AdRepository initialize$lambda$220$lambda$67;
                initialize$lambda$220$lambda$67 = ServiceProvider.initialize$lambda$220$lambda$67();
                return initialize$lambda$220$lambda$67;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda91
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CacheRepository initialize$lambda$220$lambda$68;
                initialize$lambda$220$lambda$68 = ServiceProvider.initialize$lambda$220$lambda$68(ServicesRegistry.this);
                return initialize$lambda$220$lambda$68;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetCacheDirectory.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda92
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetCacheDirectory initialize$lambda$220$lambda$69;
                initialize$lambda$220$lambda$69 = ServiceProvider.initialize$lambda$220$lambda$69();
                return initialize$lambda$220$lambda$69;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAssetFileName.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda93
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetAssetFileName initialize$lambda$220$lambda$70;
                initialize$lambda$220$lambda$70 = ServiceProvider.initialize$lambda$220$lambda$70();
                return initialize$lambda$220$lambda$70;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CampaignRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda95
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CampaignRepository initialize$lambda$220$lambda$71;
                initialize$lambda$220$lambda$71 = ServiceProvider.initialize$lambda$220$lambda$71(ServicesRegistry.this);
                return initialize$lambda$220$lambda$71;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeveloperConsentRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda96
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeveloperConsentRepository initialize$lambda$220$lambda$72;
                initialize$lambda$220$lambda$72 = ServiceProvider.initialize$lambda$220$lambda$72(ServicesRegistry.this);
                return initialize$lambda$220$lambda$72;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda97
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeviceInfoRepository initialize$lambda$220$lambda$73;
                initialize$lambda$220$lambda$73 = ServiceProvider.initialize$lambda$220$lambda$73(ServicesRegistry.this);
                return initialize$lambda$220$lambda$73;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda98
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DiagnosticEventRepository initialize$lambda$220$lambda$74;
                initialize$lambda$220$lambda$74 = ServiceProvider.initialize$lambda$220$lambda$74(ServicesRegistry.this);
                return initialize$lambda$220$lambda$74;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LegacyUserConsentRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda100
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LegacyUserConsentRepository initialize$lambda$220$lambda$75;
                initialize$lambda$220$lambda$75 = ServiceProvider.initialize$lambda$220$lambda$75(ServicesRegistry.this);
                return initialize$lambda$220$lambda$75;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationProviderParser.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda101
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MediationProviderParser initialize$lambda$220$lambda$76;
                initialize$lambda$220$lambda$76 = ServiceProvider.initialize$lambda$220$lambda$76();
                return initialize$lambda$220$lambda$76;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationInfoConverter.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda102
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MediationInfoConverter initialize$lambda$220$lambda$77;
                initialize$lambda$220$lambda$77 = ServiceProvider.initialize$lambda$220$lambda$77(ServicesRegistry.this);
                return initialize$lambda$220$lambda$77;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda103
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MediationRepository initialize$lambda$220$lambda$78;
                initialize$lambda$220$lambda$78 = ServiceProvider.initialize$lambda$220$lambda$78(ServicesRegistry.this);
                return initialize$lambda$220$lambda$78;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda104
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OpenMeasurementRepository initialize$lambda$220$lambda$79;
                initialize$lambda$220$lambda$79 = ServiceProvider.initialize$lambda$220$lambda$79(ServicesRegistry.this);
                return initialize$lambda$220$lambda$79;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda105
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SessionRepository initialize$lambda$220$lambda$80;
                initialize$lambda$220$lambda$80 = ServiceProvider.initialize$lambda$220$lambda$80(ServicesRegistry.this);
                return initialize$lambda$220$lambda$80;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda107
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionEventRepository initialize$lambda$220$lambda$81;
                initialize$lambda$220$lambda$81 = ServiceProvider.initialize$lambda$220$lambda$81();
                return initialize$lambda$220$lambda$81;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRevenueRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda108
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AdRevenueRepository initialize$lambda$220$lambda$82;
                initialize$lambda$220$lambda$82 = ServiceProvider.initialize$lambda$220$lambda$82();
                return initialize$lambda$220$lambda$82;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OperativeEventRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda109
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OperativeEventRepository initialize$lambda$220$lambda$83;
                initialize$lambda$220$lambda$83 = ServiceProvider.initialize$lambda$220$lambda$83();
                return initialize$lambda$220$lambda$83;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda112
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExecuteAdViewerRequest initialize$lambda$220$lambda$84;
                initialize$lambda$220$lambda$84 = ServiceProvider.initialize$lambda$220$lambda$84(ServicesRegistry.this);
                return initialize$lambda$220$lambda$84;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetByteStringId.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda113
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetByteStringId initialize$lambda$220$lambda$85;
                initialize$lambda$220$lambda$85 = ServiceProvider.initialize$lambda$220$lambda$85();
                return initialize$lambda$220$lambda$85;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(IntentCreation.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda114
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                IntentCreation initialize$lambda$220$lambda$86;
                initialize$lambda$220$lambda$86 = ServiceProvider.initialize$lambda$220$lambda$86();
                return initialize$lambda$220$lambda$86;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleOpenUrl.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda115
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HandleOpenUrl initialize$lambda$220$lambda$87;
                initialize$lambda$220$lambda$87 = ServiceProvider.initialize$lambda$220$lambda$87(ServicesRegistry.this);
                return initialize$lambda$220$lambda$87;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Refresh.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda116
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Refresh initialize$lambda$220$lambda$88;
                initialize$lambda$220$lambda$88 = ServiceProvider.initialize$lambda$220$lambda$88(ServicesRegistry.this);
                return initialize$lambda$220$lambda$88;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheAssets.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda117
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CacheAssets initialize$lambda$220$lambda$89;
                initialize$lambda$220$lambda$89 = ServiceProvider.initialize$lambda$220$lambda$89(ServicesRegistry.this);
                return initialize$lambda$220$lambda$89;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRefresh.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda118
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AdRefresh initialize$lambda$220$lambda$90;
                initialize$lambda$220$lambda$90 = ServiceProvider.initialize$lambda$220$lambda$90(ServicesRegistry.this);
                return initialize$lambda$220$lambda$90;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda120
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SendDiagnosticEvent initialize$lambda$220$lambda$91;
                initialize$lambda$220$lambda$91 = ServiceProvider.initialize$lambda$220$lambda$91(ServicesRegistry.this);
                return initialize$lambda$220$lambda$91;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendWebViewClientErrorDiagnostics.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda121
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SendWebViewClientErrorDiagnostics initialize$lambda$220$lambda$92;
                initialize$lambda$220$lambda$92 = ServiceProvider.initialize$lambda$220$lambda$92(ServicesRegistry.this);
                return initialize$lambda$220$lambda$92;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Show.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda123
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Show initialize$lambda$220$lambda$93;
                initialize$lambda$220$lambda$93 = ServiceProvider.initialize$lambda$220$lambda$93(ServicesRegistry.this);
                return initialize$lambda$220$lambda$93;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheFile.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda124
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CacheFile initialize$lambda$220$lambda$94;
                initialize$lambda$220$lambda$94 = ServiceProvider.initialize$lambda$220$lambda$94(ServicesRegistry.this);
                return initialize$lambda$220$lambda$94;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CleanAssets.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda125
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CleanAssets initialize$lambda$220$lambda$95;
                initialize$lambda$220$lambda$95 = ServiceProvider.initialize$lambda$220$lambda$95(ServicesRegistry.this);
                return initialize$lambda$220$lambda$95;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdObject.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda126
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetAdObject initialize$lambda$220$lambda$96;
                initialize$lambda$220$lambda$96 = ServiceProvider.initialize$lambda$220$lambda$96(ServicesRegistry.this);
                return initialize$lambda$220$lambda$96;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda127
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetHeaderBiddingToken initialize$lambda$220$lambda$97;
                initialize$lambda$220$lambda$97 = ServiceProvider.initialize$lambda$220$lambda$97(ServicesRegistry.this);
                return initialize$lambda$220$lambda$97;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda128
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BuildHeaderBiddingToken initialize$lambda$220$lambda$98;
                initialize$lambda$220$lambda$98 = ServiceProvider.initialize$lambda$220$lambda$98(ServicesRegistry.this);
                return initialize$lambda$220$lambda$98;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TokenNumberProvider.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda129
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TokenNumberProvider initialize$lambda$220$lambda$99;
                initialize$lambda$220$lambda$99 = ServiceProvider.initialize$lambda$220$lambda$99(ServicesRegistry.this);
                return initialize$lambda$220$lambda$99;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationData.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda130
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetInitializationData initialize$lambda$220$lambda$100;
                initialize$lambda$220$lambda$100 = ServiceProvider.initialize$lambda$220$lambda$100(ServicesRegistry.this);
                return initialize$lambda$220$lambda$100;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationInitBlobMetadataReader.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda111
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MediationInitBlobMetadataReader initialize$lambda$220$lambda$101;
                initialize$lambda$220$lambda$101 = ServiceProvider.initialize$lambda$220$lambda$101(ServicesRegistry.this);
                return initialize$lambda$220$lambda$101;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationRequestPayload.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda142
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetInitializationRequestPayload initialize$lambda$220$lambda$102;
                initialize$lambda$220$lambda$102 = ServiceProvider.initialize$lambda$220$lambda$102(ServicesRegistry.this);
                return initialize$lambda$220$lambda$102;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationState.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda153
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetInitializationState initialize$lambda$220$lambda$103;
                initialize$lambda$220$lambda$103 = ServiceProvider.initialize$lambda$220$lambda$103(ServicesRegistry.this);
                return initialize$lambda$220$lambda$103;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetIsFileCache.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda164
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetIsFileCache initialize$lambda$220$lambda$104;
                initialize$lambda$220$lambda$104 = ServiceProvider.initialize$lambda$220$lambda$104(ServicesRegistry.this);
                return initialize$lambda$220$lambda$104;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SetInitializationState.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda175
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SetInitializationState initialize$lambda$220$lambda$105;
                initialize$lambda$220$lambda$105 = ServiceProvider.initialize$lambda$220$lambda$105(ServicesRegistry.this);
                return initialize$lambda$220$lambda$105;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_AD_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda186
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetRequestPolicy initialize$lambda$220$lambda$106;
                initialize$lambda$220$lambda$106 = ServiceProvider.initialize$lambda$220$lambda$106(ServicesRegistry.this);
                return initialize$lambda$220$lambda$106;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdDataRefreshRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda197
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetAdDataRefreshRequest initialize$lambda$220$lambda$107;
                initialize$lambda$220$lambda$107 = ServiceProvider.initialize$lambda$220$lambda$107(ServicesRegistry.this);
                return initialize$lambda$220$lambda$107;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdPlayerConfigRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda208
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetAdPlayerConfigRequest initialize$lambda$220$lambda$108;
                initialize$lambda$220$lambda$108 = ServiceProvider.initialize$lambda$220$lambda$108(ServicesRegistry.this);
                return initialize$lambda$220$lambda$108;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidGetAdPlayerContext.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda219
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidGetAdPlayerContext initialize$lambda$220$lambda$109;
                initialize$lambda$220$lambda$109 = ServiceProvider.initialize$lambda$220$lambda$109(ServicesRegistry.this);
                return initialize$lambda$220$lambda$109;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetAdRequest initialize$lambda$220$lambda$110;
                initialize$lambda$220$lambda$110 = ServiceProvider.initialize$lambda$220$lambda$110(ServicesRegistry.this);
                return initialize$lambda$220$lambda$110;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetClientInfo.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetClientInfo initialize$lambda$220$lambda$111;
                initialize$lambda$220$lambda$111 = ServiceProvider.initialize$lambda$220$lambda$111(ServicesRegistry.this);
                return initialize$lambda$220$lambda$111;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationCompletedRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetInitializationCompletedRequest initialize$lambda$220$lambda$112;
                initialize$lambda$220$lambda$112 = ServiceProvider.initialize$lambda$220$lambda$112(ServicesRegistry.this);
                return initialize$lambda$220$lambda$112;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda55
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetInitializationRequest initialize$lambda$220$lambda$113;
                initialize$lambda$220$lambda$113 = ServiceProvider.initialize$lambda$220$lambda$113(ServicesRegistry.this);
                return initialize$lambda$220$lambda$113;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetLimitedSessionToken.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda66
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetLimitedSessionToken initialize$lambda$220$lambda$114;
                initialize$lambda$220$lambda$114 = ServiceProvider.initialize$lambda$220$lambda$114(ServicesRegistry.this);
                return initialize$lambda$220$lambda$114;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOpenGLRendererInfo.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda77
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetOpenGLRendererInfo initialize$lambda$220$lambda$115;
                initialize$lambda$220$lambda$115 = ServiceProvider.initialize$lambda$220$lambda$115(ServicesRegistry.this);
                return initialize$lambda$220$lambda$115;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda88
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetSharedDataTimestamps initialize$lambda$220$lambda$116;
                initialize$lambda$220$lambda$116 = ServiceProvider.initialize$lambda$220$lambda$116(ServicesRegistry.this);
                return initialize$lambda$220$lambda$116;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda99
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetUniversalRequestForPayLoad initialize$lambda$220$lambda$117;
                initialize$lambda$220$lambda$117 = ServiceProvider.initialize$lambda$220$lambda$117(ServicesRegistry.this);
                return initialize$lambda$220$lambda$117;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestSharedData.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda110
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetUniversalRequestSharedData initialize$lambda$220$lambda$118;
                initialize$lambda$220$lambda$118 = ServiceProvider.initialize$lambda$220$lambda$118(ServicesRegistry.this);
                return initialize$lambda$220$lambda$118;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetCachedAsset.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda122
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetCachedAsset initialize$lambda$220$lambda$119;
                initialize$lambda$220$lambda$119 = ServiceProvider.initialize$lambda$220$lambda$119(ServicesRegistry.this);
                return initialize$lambda$220$lambda$119;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetWebViewBridgeUseCase.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda133
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetWebViewBridgeUseCase initialize$lambda$220$lambda$120;
                initialize$lambda$220$lambda$120 = ServiceProvider.initialize$lambda$220$lambda$120(ServicesRegistry.this);
                return initialize$lambda$220$lambda$120;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_INIT_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda135
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetRequestPolicy initialize$lambda$220$lambda$121;
                initialize$lambda$220$lambda$121 = ServiceProvider.initialize$lambda$220$lambda$121(ServicesRegistry.this);
                return initialize$lambda$220$lambda$121;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetLatestWebViewConfiguration.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda136
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetLatestWebViewConfiguration initialize$lambda$220$lambda$122;
                initialize$lambda$220$lambda$122 = ServiceProvider.initialize$lambda$220$lambda$122(ServicesRegistry.this);
                return initialize$lambda$220$lambda$122;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_OPERATIVE_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda137
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetRequestPolicy initialize$lambda$220$lambda$123;
                initialize$lambda$220$lambda$123 = ServiceProvider.initialize$lambda$220$lambda$123(ServicesRegistry.this);
                return initialize$lambda$220$lambda$123;
            }
        }));
        registry.updateService(new ServiceKey(NAMED_OTHER_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda138
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetRequestPolicy initialize$lambda$220$lambda$124;
                initialize$lambda$220$lambda$124 = ServiceProvider.initialize$lambda$220$lambda$124(ServicesRegistry.this);
                return initialize$lambda$220$lambda$124;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetPrivacyUpdateRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda139
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetPrivacyUpdateRequest initialize$lambda$220$lambda$125;
                initialize$lambda$220$lambda$125 = ServiceProvider.initialize$lambda$220$lambda$125(ServicesRegistry.this);
                return initialize$lambda$220$lambda$125;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayInitializationResponse.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda140
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HandleGatewayInitializationResponse initialize$lambda$220$lambda$126;
                initialize$lambda$220$lambda$126 = ServiceProvider.initialize$lambda$220$lambda$126(ServicesRegistry.this);
                return initialize$lambda$220$lambda$126;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UpdateAdQualitySessionToken.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda141
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UpdateAdQualitySessionToken initialize$lambda$220$lambda$127;
                initialize$lambda$220$lambda$127 = ServiceProvider.initialize$lambda$220$lambda$127(ServicesRegistry.this);
                return initialize$lambda$220$lambda$127;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayUniversalResponse.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda143
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HandleGatewayUniversalResponse initialize$lambda$220$lambda$128;
                initialize$lambda$220$lambda$128 = ServiceProvider.initialize$lambda$220$lambda$128(ServicesRegistry.this);
                return initialize$lambda$220$lambda$128;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeBoldSDK.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda144
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InitializeBoldSDK initialize$lambda$220$lambda$129;
                initialize$lambda$220$lambda$129 = ServiceProvider.initialize$lambda$220$lambda$129(ServicesRegistry.this);
                return initialize$lambda$220$lambda$129;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda145
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LegacyShowUseCase initialize$lambda$220$lambda$130;
                initialize$lambda$220$lambda$130 = ServiceProvider.initialize$lambda$220$lambda$130(ServicesRegistry.this);
                return initialize$lambda$220$lambda$130;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendPrivacyUpdateRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda147
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SendPrivacyUpdateRequest initialize$lambda$220$lambda$131;
                initialize$lambda$220$lambda$131 = ServiceProvider.initialize$lambda$220$lambda$131(ServicesRegistry.this);
                return initialize$lambda$220$lambda$131;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TriggerInitializationCompletedRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda148
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TriggerInitializationCompletedRequest initialize$lambda$220$lambda$132;
                initialize$lambda$220$lambda$132 = ServiceProvider.initialize$lambda$220$lambda$132(ServicesRegistry.this);
                return initialize$lambda$220$lambda$132;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TriggerInitializeListener.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda149
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TriggerInitializeListener initialize$lambda$220$lambda$133;
                initialize$lambda$220$lambda$133 = ServiceProvider.initialize$lambda$220$lambda$133(ServicesRegistry.this);
                return initialize$lambda$220$lambda$133;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventObserver.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda150
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DiagnosticEventObserver initialize$lambda$220$lambda$134;
                initialize$lambda$220$lambda$134 = ServiceProvider.initialize$lambda$220$lambda$134(ServicesRegistry.this);
                return initialize$lambda$220$lambda$134;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(EventObservers.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda151
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EventObservers initialize$lambda$220$lambda$135;
                initialize$lambda$220$lambda$135 = ServiceProvider.initialize$lambda$220$lambda$135(ServicesRegistry.this);
                return initialize$lambda$220$lambda$135;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetTransactionData.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda152
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetTransactionData initialize$lambda$220$lambda$136;
                initialize$lambda$220$lambda$136 = ServiceProvider.initialize$lambda$220$lambda$136(ServicesRegistry.this);
                return initialize$lambda$220$lambda$136;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetTransactionRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda154
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetTransactionRequest initialize$lambda$220$lambda$137;
                initialize$lambda$220$lambda$137 = ServiceProvider.initialize$lambda$220$lambda$137(ServicesRegistry.this);
                return initialize$lambda$220$lambda$137;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdRevenueEventData.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda155
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetAdRevenueEventData initialize$lambda$220$lambda$138;
                initialize$lambda$220$lambda$138 = ServiceProvider.initialize$lambda$220$lambda$138();
                return initialize$lambda$220$lambda$138;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleAdRevenueEvent.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda156
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HandleAdRevenueEvent initialize$lambda$220$lambda$139;
                initialize$lambda$220$lambda$139 = ServiceProvider.initialize$lambda$220$lambda$139(ServicesRegistry.this);
                return initialize$lambda$220$lambda$139;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetDiagnosticEventBatchRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda157
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetDiagnosticEventBatchRequest initialize$lambda$220$lambda$140;
                initialize$lambda$220$lambda$140 = ServiceProvider.initialize$lambda$220$lambda$140();
                return initialize$lambda$220$lambda$140;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetDiagnosticEventRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda159
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetDiagnosticEventRequest initialize$lambda$220$lambda$141;
                initialize$lambda$220$lambda$141 = ServiceProvider.initialize$lambda$220$lambda$141(ServicesRegistry.this);
                return initialize$lambda$220$lambda$141;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda160
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetOperativeEventApi initialize$lambda$220$lambda$142;
                initialize$lambda$220$lambda$142 = ServiceProvider.initialize$lambda$220$lambda$142(ServicesRegistry.this);
                return initialize$lambda$220$lambda$142;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOperativeEventRequest.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda161
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetOperativeEventRequest initialize$lambda$220$lambda$143;
                initialize$lambda$220$lambda$143 = ServiceProvider.initialize$lambda$220$lambda$143(ServicesRegistry.this);
                return initialize$lambda$220$lambda$143;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayEventResponse.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda162
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HandleGatewayEventResponse initialize$lambda$220$lambda$144;
                initialize$lambda$220$lambda$144 = ServiceProvider.initialize$lambda$220$lambda$144();
                return initialize$lambda$220$lambda$144;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OperativeEventObserver.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda163
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OperativeEventObserver initialize$lambda$220$lambda$145;
                initialize$lambda$220$lambda$145 = ServiceProvider.initialize$lambda$220$lambda$145(ServicesRegistry.this);
                return initialize$lambda$220$lambda$145;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventObserver.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda165
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionEventObserver initialize$lambda$220$lambda$146;
                initialize$lambda$220$lambda$146 = ServiceProvider.initialize$lambda$220$lambda$146(ServicesRegistry.this);
                return initialize$lambda$220$lambda$146;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRevenueObserver.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda166
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AdRevenueObserver initialize$lambda$220$lambda$147;
                initialize$lambda$220$lambda$147 = ServiceProvider.initialize$lambda$220$lambda$147(ServicesRegistry.this);
                return initialize$lambda$220$lambda$147;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LifecycleEventObserver.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda167
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LifecycleEventObserver initialize$lambda$220$lambda$148;
                initialize$lambda$220$lambda$148 = ServiceProvider.initialize$lambda$220$lambda$148(ServicesRegistry.this);
                return initialize$lambda$220$lambda$148;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AppLovinCommunicatorBridge.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda168
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AppLovinCommunicatorBridge initialize$lambda$220$lambda$149;
                initialize$lambda$220$lambda$149 = ServiceProvider.initialize$lambda$220$lambda$149(ServicesRegistry.this);
                return initialize$lambda$220$lambda$149;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MaxAdRevenueCommunicatorProxyFactory.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda169
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MaxAdRevenueCommunicatorProxyFactory initialize$lambda$220$lambda$150;
                initialize$lambda$220$lambda$150 = ServiceProvider.initialize$lambda$220$lambda$150(ServicesRegistry.this);
                return initialize$lambda$220$lambda$150;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MaxAdRevenueListener.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda171
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MaxAdRevenueListener initialize$lambda$220$lambda$151;
                initialize$lambda$220$lambda$151 = ServiceProvider.initialize$lambda$220$lambda$151(ServicesRegistry.this);
                return initialize$lambda$220$lambda$151;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MaxAdRevenueObserver.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda172
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MaxAdRevenueObserver initialize$lambda$220$lambda$152;
                initialize$lambda$220$lambda$152 = ServiceProvider.initialize$lambda$220$lambda$152(ServicesRegistry.this);
                return initialize$lambda$220$lambda$152;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UniversalRequestTtlValidator.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda173
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UniversalRequestTtlValidator initialize$lambda$220$lambda$153;
                initialize$lambda$220$lambda$153 = ServiceProvider.initialize$lambda$220$lambda$153();
                return initialize$lambda$220$lambda$153;
            }
        }));
        registry.updateService(new ServiceKey("universal", Reflection.getOrCreateKotlinClass(UniversalRequestEventSender.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda174
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UniversalRequestEventSender initialize$lambda$220$lambda$154;
                initialize$lambda$220$lambda$154 = ServiceProvider.initialize$lambda$220$lambda$154(ServicesRegistry.this);
                return initialize$lambda$220$lambda$154;
            }
        }));
        registry.updateService(new ServiceKey(DIAGNOSTICS_EVENT_SENDER, Reflection.getOrCreateKotlinClass(UniversalRequestEventSender.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda176
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UniversalRequestEventSender initialize$lambda$220$lambda$155;
                initialize$lambda$220$lambda$155 = ServiceProvider.initialize$lambda$220$lambda$155(ServicesRegistry.this);
                return initialize$lambda$220$lambda$155;
            }
        }));
        registry.updateService(new ServiceKey(OPERATIVE_EVENT_SENDER, Reflection.getOrCreateKotlinClass(UniversalRequestEventSender.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda177
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UniversalRequestEventSender initialize$lambda$220$lambda$156;
                initialize$lambda$220$lambda$156 = ServiceProvider.initialize$lambda$220$lambda$156(ServicesRegistry.this);
                return initialize$lambda$220$lambda$156;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OmFinishSession.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda178
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OmFinishSession initialize$lambda$220$lambda$157;
                initialize$lambda$220$lambda$157 = ServiceProvider.initialize$lambda$220$lambda$157(ServicesRegistry.this);
                return initialize$lambda$220$lambda$157;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OmImpressionOccurred.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda179
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OmImpressionOccurred initialize$lambda$220$lambda$158;
                initialize$lambda$220$lambda$158 = ServiceProvider.initialize$lambda$220$lambda$158(ServicesRegistry.this);
                return initialize$lambda$220$lambda$158;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidOmInteraction.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda180
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidOmInteraction initialize$lambda$220$lambda$159;
                initialize$lambda$220$lambda$159 = ServiceProvider.initialize$lambda$220$lambda$159(ServicesRegistry.this);
                return initialize$lambda$220$lambda$159;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOmData.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda181
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetOmData initialize$lambda$220$lambda$160;
                initialize$lambda$220$lambda$160 = ServiceProvider.initialize$lambda$220$lambda$160(ServicesRegistry.this);
                return initialize$lambda$220$lambda$160;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(IsOMActivated.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda183
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                IsOMActivated initialize$lambda$220$lambda$161;
                initialize$lambda$220$lambda$161 = ServiceProvider.initialize$lambda$220$lambda$161(ServicesRegistry.this);
                return initialize$lambda$220$lambda$161;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeOMSDK.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda184
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InitializeOMSDK initialize$lambda$220$lambda$162;
                initialize$lambda$220$lambda$162 = ServiceProvider.initialize$lambda$220$lambda$162(ServicesRegistry.this);
                return initialize$lambda$220$lambda$162;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeAdQuality.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda185
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InitializeAdQuality initialize$lambda$220$lambda$163;
                initialize$lambda$220$lambda$163 = ServiceProvider.initialize$lambda$220$lambda$163(ServicesRegistry.this);
                return initialize$lambda$220$lambda$163;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CoherenceLibraryManager.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda187
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoherenceLibraryManager initialize$lambda$220$lambda$164;
                initialize$lambda$220$lambda$164 = ServiceProvider.initialize$lambda$220$lambda$164(ServicesRegistry.this);
                return initialize$lambda$220$lambda$164;
            }
        }));
        registry.updateService(new ServiceKey(DEV_CONSENT_PRIVACY_RULES, Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda188
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlattenerRulesUseCase initialize$lambda$220$lambda$165;
                initialize$lambda$220$lambda$165 = ServiceProvider.initialize$lambda$220$lambda$165();
                return initialize$lambda$220$lambda$165;
            }
        }));
        registry.updateService(new ServiceKey(LEGACY_PRIVACY_RULES, Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda189
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlattenerRulesUseCase initialize$lambda$220$lambda$166;
                initialize$lambda$220$lambda$166 = ServiceProvider.initialize$lambda$220$lambda$166();
                return initialize$lambda$220$lambda$166;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(BackgroundWorker.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda190
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BackgroundWorker initialize$lambda$220$lambda$167;
                initialize$lambda$220$lambda$167 = ServiceProvider.initialize$lambda$220$lambda$167(ServicesRegistry.this);
                return initialize$lambda$220$lambda$167;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventRequestWorkModifier.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda191
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DiagnosticEventRequestWorkModifier initialize$lambda$220$lambda$168;
                initialize$lambda$220$lambda$168 = ServiceProvider.initialize$lambda$220$lambda$168(ServicesRegistry.this);
                return initialize$lambda$220$lambda$168;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda192
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GatewayClient initialize$lambda$220$lambda$169;
                initialize$lambda$220$lambda$169 = ServiceProvider.initialize$lambda$220$lambda$169(ServicesRegistry.this);
                return initialize$lambda$220$lambda$169;
            }
        }));
        registry.updateService(new ServiceKey("sdk", Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda193
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineExceptionHandler initialize$lambda$220$lambda$170;
                initialize$lambda$220$lambda$170 = ServiceProvider.initialize$lambda$220$lambda$170(ServicesRegistry.this);
                return initialize$lambda$220$lambda$170;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(VolumeChange.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda195
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                VolumeChange initialize$lambda$220$lambda$171;
                initialize$lambda$220$lambda$171 = ServiceProvider.initialize$lambda$220$lambda$171();
                return initialize$lambda$220$lambda$171;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreMonitor.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda196
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StoreMonitor initialize$lambda$220$lambda$172;
                initialize$lambda$220$lambda$172 = ServiceProvider.initialize$lambda$220$lambda$172(ServicesRegistry.this);
                return initialize$lambda$220$lambda$172;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreExceptionHandler.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda198
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StoreExceptionHandler initialize$lambda$220$lambda$173;
                initialize$lambda$220$lambda$173 = ServiceProvider.initialize$lambda$220$lambda$173();
                return initialize$lambda$220$lambda$173;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidAttribution.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda199
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidAttribution initialize$lambda$220$lambda$174;
                initialize$lambda$220$lambda$174 = ServiceProvider.initialize$lambda$220$lambda$174(ServicesRegistry.this);
                return initialize$lambda$220$lambda$174;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda200
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AdPlayerScope initialize$lambda$220$lambda$175;
                initialize$lambda$220$lambda$175 = ServiceProvider.initialize$lambda$220$lambda$175(ServicesRegistry.this);
                return initialize$lambda$220$lambda$175;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda201
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidWebViewClient initialize$lambda$220$lambda$176;
                initialize$lambda$220$lambda$176 = ServiceProvider.initialize$lambda$220$lambda$176(ServicesRegistry.this);
                return initialize$lambda$220$lambda$176;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda202
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidGetWebViewContainerUseCase initialize$lambda$220$lambda$177;
                initialize$lambda$220$lambda$177 = ServiceProvider.initialize$lambda$220$lambda$177(ServicesRegistry.this);
                return initialize$lambda$220$lambda$177;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Load.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda203
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Load initialize$lambda$220$lambda$178;
                initialize$lambda$220$lambda$178 = ServiceProvider.initialize$lambda$220$lambda$178(ServicesRegistry.this);
                return initialize$lambda$220$lambda$178;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda204
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AwaitInitialization initialize$lambda$220$lambda$179;
                initialize$lambda$220$lambda$179 = ServiceProvider.initialize$lambda$220$lambda$179(ServicesRegistry.this);
                return initialize$lambda$220$lambda$179;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda205
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetAsyncHeaderBiddingToken initialize$lambda$220$lambda$180;
                initialize$lambda$220$lambda$180 = ServiceProvider.initialize$lambda$220$lambda$180(ServicesRegistry.this);
                return initialize$lambda$220$lambda$180;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda207
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetAdPlayer initialize$lambda$220$lambda$181;
                initialize$lambda$220$lambda$181 = ServiceProvider.initialize$lambda$220$lambda$181(ServicesRegistry.this);
                return initialize$lambda$220$lambda$181;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheWebViewAssets.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda209
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CacheWebViewAssets initialize$lambda$220$lambda$182;
                initialize$lambda$220$lambda$182 = ServiceProvider.initialize$lambda$220$lambda$182(ServicesRegistry.this);
                return initialize$lambda$220$lambda$182;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda210
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HandleGatewayAdResponse initialize$lambda$220$lambda$183;
                initialize$lambda$220$lambda$183 = ServiceProvider.initialize$lambda$220$lambda$183(ServicesRegistry.this);
                return initialize$lambda$220$lambda$183;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda211
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HandleInvocationsFromAdViewer initialize$lambda$220$lambda$184;
                initialize$lambda$220$lambda$184 = ServiceProvider.initialize$lambda$220$lambda$184();
                return initialize$lambda$220$lambda$184;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda212
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LegacyLoadUseCase initialize$lambda$220$lambda$185;
                initialize$lambda$220$lambda$185 = ServiceProvider.initialize$lambda$220$lambda$185(ServicesRegistry.this);
                return initialize$lambda$220$lambda$185;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(WebViewLessLoadStrategy.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda213
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewLessLoadStrategy initialize$lambda$220$lambda$186;
                initialize$lambda$220$lambda$186 = ServiceProvider.initialize$lambda$220$lambda$186(ServicesRegistry.this);
                return initialize$lambda$220$lambda$186;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SafeCallbackInvoke.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda214
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SafeCallbackInvoke initialize$lambda$220$lambda$187;
                initialize$lambda$220$lambda$187 = ServiceProvider.initialize$lambda$220$lambda$187(ServicesRegistry.this);
                return initialize$lambda$220$lambda$187;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda215
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoroutineTimer initialize$lambda$220$lambda$188;
                initialize$lambda$220$lambda$188 = ServiceProvider.initialize$lambda$220$lambda$188(ServicesRegistry.this);
                return initialize$lambda$220$lambda$188;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SetGameId.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda216
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SetGameId initialize$lambda$220$lambda$189;
                initialize$lambda$220$lambda$189 = ServiceProvider.initialize$lambda$220$lambda$189(ServicesRegistry.this);
                return initialize$lambda$220$lambda$189;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetGameId.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda217
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetGameId initialize$lambda$220$lambda$190;
                initialize$lambda$220$lambda$190 = ServiceProvider.initialize$lambda$220$lambda$190(ServicesRegistry.this);
                return initialize$lambda$220$lambda$190;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ValidateGameId.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ValidateGameId initialize$lambda$220$lambda$191;
                initialize$lambda$220$lambda$191 = ServiceProvider.initialize$lambda$220$lambda$191(ServicesRegistry.this);
                return initialize$lambda$220$lambda$191;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ValidateExtrasSize.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ValidateExtrasSize initialize$lambda$220$lambda$192;
                initialize$lambda$220$lambda$192 = ServiceProvider.initialize$lambda$220$lambda$192(ServicesRegistry.this);
                return initialize$lambda$220$lambda$192;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ShouldAllowInitialization.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ShouldAllowInitialization initialize$lambda$220$lambda$193;
                initialize$lambda$220$lambda$193 = ServiceProvider.initialize$lambda$220$lambda$193(ServicesRegistry.this);
                return initialize$lambda$220$lambda$193;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CheckForGameIdAndTestModeChanges.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckForGameIdAndTestModeChanges initialize$lambda$220$lambda$194;
                initialize$lambda$220$lambda$194 = ServiceProvider.initialize$lambda$220$lambda$194(ServicesRegistry.this);
                return initialize$lambda$220$lambda$194;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DownloadPriorityQueue.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DownloadPriorityQueue initialize$lambda$220$lambda$195;
                initialize$lambda$220$lambda$195 = ServiceProvider.initialize$lambda$220$lambda$195(ServicesRegistry.this);
                return initialize$lambda$220$lambda$195;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CleanupDirectory.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CleanupDirectory initialize$lambda$220$lambda$196;
                initialize$lambda$220$lambda$196 = ServiceProvider.initialize$lambda$220$lambda$196(ServicesRegistry.this);
                return initialize$lambda$220$lambda$196;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(FocusRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FocusRepository initialize$lambda$220$lambda$197;
                initialize$lambda$220$lambda$197 = ServiceProvider.initialize$lambda$220$lambda$197(ServicesRegistry.this);
                return initialize$lambda$220$lambda$197;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidGetIsAdActivity.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidGetIsAdActivity initialize$lambda$220$lambda$198;
                initialize$lambda$220$lambda$198 = ServiceProvider.initialize$lambda$220$lambda$198(ServicesRegistry.this);
                return initialize$lambda$220$lambda$198;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidGetLifecycleFlow.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidGetLifecycleFlow initialize$lambda$220$lambda$199;
                initialize$lambda$220$lambda$199 = ServiceProvider.initialize$lambda$220$lambda$199(ServicesRegistry.this);
                return initialize$lambda$220$lambda$199;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidHandleFocusCounters.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidHandleFocusCounters initialize$lambda$220$lambda$200;
                initialize$lambda$220$lambda$200 = ServiceProvider.initialize$lambda$220$lambda$200(ServicesRegistry.this);
                return initialize$lambda$220$lambda$200;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OfferwallAdapterBridge.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OfferwallAdapterBridge initialize$lambda$220$lambda$201;
                initialize$lambda$220$lambda$201 = ServiceProvider.initialize$lambda$220$lambda$201(ServicesRegistry.this);
                return initialize$lambda$220$lambda$201;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OfferwallManager.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OfferwallManager initialize$lambda$220$lambda$202;
                initialize$lambda$220$lambda$202 = ServiceProvider.initialize$lambda$220$lambda$202(ServicesRegistry.this);
                return initialize$lambda$220$lambda$202;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LoadOfferwallAd.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LoadOfferwallAd initialize$lambda$220$lambda$203;
                initialize$lambda$220$lambda$203 = ServiceProvider.initialize$lambda$220$lambda$203(ServicesRegistry.this);
                return initialize$lambda$220$lambda$203;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetIsOfferwallAdReady.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetIsOfferwallAdReady initialize$lambda$220$lambda$204;
                initialize$lambda$220$lambda$204 = ServiceProvider.initialize$lambda$220$lambda$204(ServicesRegistry.this);
                return initialize$lambda$220$lambda$204;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(FIdDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FIdDataSource initialize$lambda$220$lambda$205;
                initialize$lambda$220$lambda$205 = ServiceProvider.initialize$lambda$220$lambda$205(ServicesRegistry.this);
                return initialize$lambda$220$lambda$205;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(FIdExistenceDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FIdExistenceDataSource initialize$lambda$220$lambda$206;
                initialize$lambda$220$lambda$206 = ServiceProvider.initialize$lambda$220$lambda$206();
                return initialize$lambda$220$lambda$206;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdQualityVersionDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AdQualityVersionDataSource initialize$lambda$220$lambda$207;
                initialize$lambda$220$lambda$207 = ServiceProvider.initialize$lambda$220$lambda$207(ServicesRegistry.this);
                return initialize$lambda$220$lambda$207;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CleanUpWhenOpportunityExpires.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CleanUpWhenOpportunityExpires initialize$lambda$220$lambda$208;
                initialize$lambda$220$lambda$208 = ServiceProvider.initialize$lambda$220$lambda$208(ServicesRegistry.this);
                return initialize$lambda$220$lambda$208;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OrientationRepository.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrientationRepository initialize$lambda$220$lambda$209;
                initialize$lambda$220$lambda$209 = ServiceProvider.initialize$lambda$220$lambda$209(ServicesRegistry.this);
                return initialize$lambda$220$lambda$209;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidAppSetIdDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidAppSetIdDataSource initialize$lambda$220$lambda$210;
                initialize$lambda$220$lambda$210 = ServiceProvider.initialize$lambda$220$lambda$210(ServicesRegistry.this);
                return initialize$lambda$220$lambda$210;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidUnityInfoDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AndroidUnityInfoDataSource initialize$lambda$220$lambda$211;
                initialize$lambda$220$lambda$211 = ServiceProvider.initialize$lambda$220$lambda$211(ServicesRegistry.this);
                return initialize$lambda$220$lambda$211;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InstallReferrerDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InstallReferrerDataSource initialize$lambda$220$lambda$212;
                initialize$lambda$220$lambda$212 = ServiceProvider.initialize$lambda$220$lambda$212(ServicesRegistry.this);
                return initialize$lambda$220$lambda$212;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GoogleAppIdDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GoogleAppIdDataSource initialize$lambda$220$lambda$213;
                initialize$lambda$220$lambda$213 = ServiceProvider.initialize$lambda$220$lambda$213(ServicesRegistry.this);
                return initialize$lambda$220$lambda$213;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleDebugSettings.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HandleDebugSettings initialize$lambda$220$lambda$214;
                initialize$lambda$220$lambda$214 = ServiceProvider.initialize$lambda$220$lambda$214();
                return initialize$lambda$220$lambda$214;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Logger initialize$lambda$220$lambda$215;
                initialize$lambda$220$lambda$215 = ServiceProvider.initialize$lambda$220$lambda$215(ServicesRegistry.this);
                return initialize$lambda$220$lambda$215;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(IsBillingClientAvailable.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                IsBillingClientAvailable initialize$lambda$220$lambda$216;
                initialize$lambda$220$lambda$216 = ServiceProvider.initialize$lambda$220$lambda$216();
                return initialize$lambda$220$lambda$216;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UnityBootConfigDataSource.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UnityBootConfigDataSource initialize$lambda$220$lambda$217;
                initialize$lambda$220$lambda$217 = ServiceProvider.initialize$lambda$220$lambda$217(ServicesRegistry.this);
                return initialize$lambda$220$lambda$217;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetSafeguardedInitializationPolicy.class)), LazyKt.lazy(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GetSafeguardedInitializationPolicy initialize$lambda$220$lambda$218;
                initialize$lambda$220$lambda$218 = ServiceProvider.initialize$lambda$220$lambda$218();
                return initialize$lambda$220$lambda$218;
            }
        }));
        registry.updateService(new ServiceKey("", Reflection.getOrCreateKotlinClass(RequestUrlFactory.class)), ServiceFactoryKt.factoryOf(new Function0() { // from class: com.unity3d.services.core.di.ServiceProvider$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RequestUrlFactory initialize$lambda$220$lambda$219;
                initialize$lambda$220$lambda$219 = ServiceProvider.initialize$lambda$220$lambda$219(ServicesRegistry.this);
                return initialize$lambda$220$lambda$219;
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteStringDataSource initialize$lambda$220$lambda$15(ServicesRegistry servicesRegistry) {
        return new AndroidLegacyConfigStoreDataSource((StorageManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StorageManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestDataStoreProvider initialize$lambda$220$lambda$24(ServicesRegistry servicesRegistry) {
        return new UniversalRequestDataStoreProvider((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CronetEngineBuilderFactory initialize$lambda$220$lambda$32() {
        return new CronetEngineBuilderFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpClientProvider initialize$lambda$220$lambda$33(ServicesRegistry servicesRegistry) {
        return new AndroidHttpClientProvider((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CronetEngineBuilderFactory) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CronetEngineBuilderFactory.class))), (MediationTraitsMetadataReader) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationTraitsMetadataReader.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpClient initialize$lambda$220$lambda$34(ServicesRegistry servicesRegistry) {
        Object runBlocking$default;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new ServiceProvider$initialize$1$35$1(servicesRegistry, null), 1, null);
        return (HttpClient) runBlocking$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediationTraitsMetadataReader initialize$lambda$220$lambda$35(ServicesRegistry servicesRegistry) {
        return new MediationTraitsMetadataReader((JsonStorage) servicesRegistry.resolveService(new ServiceKey("MEMORY", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TcfDataSource initialize$lambda$220$lambda$36() {
        return new AndroidTcfDataSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TcfRepository initialize$lambda$220$lambda$37(ServicesRegistry servicesRegistry) {
        return new AndroidTcfRepository((TcfDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TcfDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidManifestIntPropertyReader initialize$lambda$220$lambda$38(ServicesRegistry servicesRegistry) {
        return new AndroidManifestIntPropertyReader((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidManifestStringPropertyReader initialize$lambda$220$lambda$39(ServicesRegistry servicesRegistry) {
        return new AndroidManifestStringPropertyReader((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidTestDataInfo initialize$lambda$220$lambda$40(ServicesRegistry servicesRegistry) {
        return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidManifestIntPropertyReader.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameServerIdReader initialize$lambda$220$lambda$41(ServicesRegistry servicesRegistry) {
        return new GameServerIdReader((JsonStorage) servicesRegistry.resolveService(new ServiceKey("PUBLIC", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StoreDataSource initialize$lambda$220$lambda$42(ServicesRegistry servicesRegistry) {
        return new AndroidStoreDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalyticsDataSource initialize$lambda$220$lambda$43() {
        return new AndroidAnalyticsDataSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeveloperConsentDataSource initialize$lambda$220$lambda$44(ServicesRegistry servicesRegistry) {
        return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(DEV_CONSENT_PRIVACY_RULES, Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class))), (JsonStorage) servicesRegistry.resolveService(new ServiceKey("PUBLIC", Reflection.getOrCreateKotlinClass(JsonStorage.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DynamicDeviceInfoDataSource initialize$lambda$220$lambda$45(ServicesRegistry servicesRegistry) {
        return new AndroidDynamicDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LifecycleDataSource.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyUserConsentDataSource initialize$lambda$220$lambda$46(ServicesRegistry servicesRegistry) {
        return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(LEGACY_PRIVACY_RULES, Reflection.getOrCreateKotlinClass(FlattenerRulesUseCase.class))), (JsonStorage) servicesRegistry.resolveService(new ServiceKey("PRIVATE", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleDataSource initialize$lambda$220$lambda$47() {
        return new AndroidLifecycleDataSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForegroundDurationReader initialize$lambda$220$lambda$49(ServicesRegistry servicesRegistry) {
        AppForegroundDurationObserver appForegroundDurationObserver = new AppForegroundDurationObserver((LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LifecycleDataSource.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), null, null, 12, null);
        appForegroundDurationObserver.invoke();
        return appForegroundDurationObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheDataSource initialize$lambda$220$lambda$50(ServicesRegistry servicesRegistry) {
        return new AndroidLocalCacheDataSource((CreateFile) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CreateFile.class))), (GetFileExtensionFromUrl) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetFileExtensionFromUrl.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateFile initialize$lambda$220$lambda$51() {
        return new CommonCreateFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetFileExtensionFromUrl initialize$lambda$220$lambda$52(ServicesRegistry servicesRegistry) {
        return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(RemoveUrlQuery.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoveUrlQuery initialize$lambda$220$lambda$53() {
        return new AndroidRemoveUrlQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediationDataSource initialize$lambda$220$lambda$54(ServicesRegistry servicesRegistry) {
        return new AndroidMediationDataSource((JsonStorage) servicesRegistry.resolveService(new ServiceKey("MEMORY", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PrivacyDeviceInfoDataSource initialize$lambda$220$lambda$55(ServicesRegistry servicesRegistry) {
        return new AndroidPrivacyDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (FIdDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(FIdDataSource.class))), (AndroidAppSetIdDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidAppSetIdDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheDataSource initialize$lambda$220$lambda$56(ServicesRegistry servicesRegistry) {
        return new AndroidRemoteCacheDataSource((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (CreateFile) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CreateFile.class))), (GetFileExtensionFromUrl) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetFileExtensionFromUrl.class))), (HttpClientProvider) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HttpClientProvider.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StaticDeviceInfoDataSource initialize$lambda$220$lambda$57(ServicesRegistry servicesRegistry) {
        return new AndroidStaticDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_GL_INFO, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (AnalyticsDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AnalyticsDataSource.class))), (StoreDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreDataSource.class))), (UnityBootConfigDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UnityBootConfigDataSource.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataMigration initialize$lambda$220$lambda$58(ServicesRegistry servicesRegistry) {
        return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOpenGLRendererInfo.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestDataSource initialize$lambda$220$lambda$59(ServicesRegistry servicesRegistry) {
        return new UniversalRequestDataSource((UniversalRequestDataStoreProvider) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UniversalRequestDataStoreProvider.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebviewConfigurationDataSource initialize$lambda$220$lambda$60(ServicesRegistry servicesRegistry) {
        return new WebviewConfigurationDataSource((DataStore) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_WEBVIEW_CONFIG, Reflection.getOrCreateKotlinClass(DataStore.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmidManager initialize$lambda$220$lambda$61() {
        return new AndroidOmidManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SDKPropertiesManager initialize$lambda$220$lambda$62() {
        return new AndroidSDKPropertiesManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StorageManager initialize$lambda$220$lambda$63() {
        return new AndroidStorageManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BillingClientAdapter initialize$lambda$220$lambda$64(ServicesRegistry servicesRegistry) {
        return new BillingClientAdapterFactory().createBillingClientAdapter((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductDetailsFetcher initialize$lambda$220$lambda$65(ServicesRegistry servicesRegistry) {
        return new ProductDetailsFetcherWithFallback(new CommonProductDetailsFetcher((BillingClientAdapter) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(BillingClientAdapter.class))), "inapp"), new CommonProductDetailsFetcher((BillingClientAdapter) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(BillingClientAdapter.class))), "subs"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionEventManager initialize$lambda$220$lambda$66(ServicesRegistry servicesRegistry) {
        return new TransactionEventManager((CoroutineScope) servicesRegistry.resolveService(new ServiceKey(NAMED_TRANSACTION_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), (BillingClientAdapter) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(BillingClientAdapter.class))), (GetTransactionData) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetTransactionData.class))), (GetTransactionRequest) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetTransactionRequest.class))), (TransactionEventRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventRepository.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (IsBillingClientAvailable) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(IsBillingClientAvailable.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (ProductDetailsFetcher) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ProductDetailsFetcher.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdRepository initialize$lambda$220$lambda$67() {
        return new AndroidAdRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheRepository initialize$lambda$220$lambda$68(ServicesRegistry servicesRegistry) {
        return new AndroidCacheRepository((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (GetCacheDirectory) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetCacheDirectory.class))), (CacheDataSource) servicesRegistry.resolveService(new ServiceKey("local", Reflection.getOrCreateKotlinClass(CacheDataSource.class))), (CacheDataSource) servicesRegistry.resolveService(new ServiceKey(NAMED_REMOTE, Reflection.getOrCreateKotlinClass(CacheDataSource.class))), (Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CleanupDirectory) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CleanupDirectory.class))), (DownloadPriorityQueue) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DownloadPriorityQueue.class))), (CreateFile) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CreateFile.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetAssetFileName) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAssetFileName.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetCacheDirectory initialize$lambda$220$lambda$69() {
        return new CommonGetCacheDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAssetFileName initialize$lambda$220$lambda$70() {
        return new GetAssetFileName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CampaignRepository initialize$lambda$220$lambda$71(ServicesRegistry servicesRegistry) {
        return new AndroidCampaignRepository((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeveloperConsentRepository initialize$lambda$220$lambda$72(ServicesRegistry servicesRegistry) {
        return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeveloperConsentDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceInfoRepository initialize$lambda$220$lambda$73(ServicesRegistry servicesRegistry) {
        return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(PrivacyDeviceInfoDataSource.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DiagnosticEventRepository initialize$lambda$220$lambda$74(ServicesRegistry servicesRegistry) {
        return new AndroidDiagnosticEventRepository((CoroutineTimer) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CoroutineTimer.class))), (GetDiagnosticEventRequest) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetDiagnosticEventRequest.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyUserConsentRepository initialize$lambda$220$lambda$75(ServicesRegistry servicesRegistry) {
        return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LegacyUserConsentDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediationProviderParser initialize$lambda$220$lambda$76() {
        return new CommonMediationProviderParser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediationInfoConverter initialize$lambda$220$lambda$77(ServicesRegistry servicesRegistry) {
        return new CommonMediationInfoConverter((MediationProviderParser) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationProviderParser.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediationRepository initialize$lambda$220$lambda$78(ServicesRegistry servicesRegistry) {
        return new AndroidMediationRepository((MediationDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationDataSource.class))), (MediationProviderParser) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationProviderParser.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OpenMeasurementRepository initialize$lambda$220$lambda$79(ServicesRegistry servicesRegistry) {
        return new AndroidOpenMeasurementRepository((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (OmidManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OmidManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionRepository initialize$lambda$220$lambda$80(ServicesRegistry servicesRegistry) {
        return new AndroidSessionRepository((ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_GATEWAY_CACHE, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_PRIVACY, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_PRIVACY_FSM, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_NATIVE_CONFIG, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (AndroidUnityInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidUnityInfoDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(NativeConfigurationOuterClass.NativeConfiguration.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), ((GatewayUrl) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayUrl.class)))).m7616unboximpl(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionEventRepository initialize$lambda$220$lambda$81() {
        return new AndroidTransactionEventRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdRevenueRepository initialize$lambda$220$lambda$82() {
        return new AndroidAdRevenueRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OperativeEventRepository initialize$lambda$220$lambda$83() {
        return new OperativeEventRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecuteAdViewerRequest initialize$lambda$220$lambda$84(ServicesRegistry servicesRegistry) {
        return new AndroidExecuteAdViewerRequest((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (HttpClientProvider) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HttpClientProvider.class))), (GetCachedAsset) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetCachedAsset.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetByteStringId initialize$lambda$220$lambda$85() {
        return new AndroidGenerateByteStringId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntentCreation initialize$lambda$220$lambda$86() {
        return new AndroidIntentCreation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleOpenUrl initialize$lambda$220$lambda$87(ServicesRegistry servicesRegistry) {
        return new AndroidHandleOpenUrl((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (IntentCreation) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(IntentCreation.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Refresh initialize$lambda$220$lambda$88(ServicesRegistry servicesRegistry) {
        return new AndroidRefresh((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (GetAdDataRefreshRequest) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdDataRefreshRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_AD_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheAssets initialize$lambda$220$lambda$89(ServicesRegistry servicesRegistry) {
        return new AndroidCacheAssets((CoroutineScope) servicesRegistry.resolveService(new ServiceKey(NAMED_LOAD_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), (CacheFile) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheFile.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdRefresh initialize$lambda$220$lambda$90(ServicesRegistry servicesRegistry) {
        return new AndroidAdRefresh((AdRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))), (CacheAssets) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheAssets.class))), (Refresh) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Refresh.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SendDiagnosticEvent initialize$lambda$220$lambda$91(ServicesRegistry servicesRegistry) {
        return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetDiagnosticEventRequest.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LifecycleDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SendWebViewClientErrorDiagnostics initialize$lambda$220$lambda$92(ServicesRegistry servicesRegistry) {
        return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Show initialize$lambda$220$lambda$93(ServicesRegistry servicesRegistry) {
        return new AndroidShow((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))), (GameServerIdReader) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GameServerIdReader.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (ValidateExtrasSize) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ValidateExtrasSize.class))), (HandleGatewayAdResponse) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayAdResponse.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheFile initialize$lambda$220$lambda$94(ServicesRegistry servicesRegistry) {
        return new CommonCacheFile((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CleanAssets initialize$lambda$220$lambda$95(ServicesRegistry servicesRegistry) {
        return new CommonCleanAssets((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdObject initialize$lambda$220$lambda$96(ServicesRegistry servicesRegistry) {
        return new CommonGetAdObject((AdRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetHeaderBiddingToken initialize$lambda$220$lambda$97(ServicesRegistry servicesRegistry) {
        return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(BuildHeaderBiddingToken.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BuildHeaderBiddingToken initialize$lambda$220$lambda$98(ServicesRegistry servicesRegistry) {
        return new AndroidBuildHeaderBiddingToken((GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetByteStringId.class))), (GetClientInfo) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetClientInfo.class))), (GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetLimitedSessionToken.class))), (GetInitializationData) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationData.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CampaignRepository.class))), (TcfRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TcfRepository.class))), (AndroidTestDataInfo) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidTestDataInfo.class))), (OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OfferwallManager.class))), (MediationInfoConverter) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationInfoConverter.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider initialize$lambda$220$lambda$99(ServicesRegistry servicesRegistry) {
        return new CommonTokenNumberProvider((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetInitializationData initialize$lambda$220$lambda$100(ServicesRegistry servicesRegistry) {
        return new AndroidGetInitializationData((GetInitializationRequestPayload) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestSharedData.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediationInitBlobMetadataReader initialize$lambda$220$lambda$101(ServicesRegistry servicesRegistry) {
        return new MediationInitBlobMetadataReader((JsonStorage) servicesRegistry.resolveService(new ServiceKey("MEMORY", Reflection.getOrCreateKotlinClass(JsonStorage.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetInitializationRequestPayload initialize$lambda$220$lambda$102(ServicesRegistry servicesRegistry) {
        return new AndroidGetInitializationRequestPayload((GetClientInfo) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetClientInfo.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (LegacyUserConsentRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LegacyUserConsentRepository.class))), (MediationInitBlobMetadataReader) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationInitBlobMetadataReader.class))), (InstallReferrerDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InstallReferrerDataSource.class))), (GoogleAppIdDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GoogleAppIdDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetInitializationState initialize$lambda$220$lambda$103(ServicesRegistry servicesRegistry) {
        return new CommonGetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (SDKPropertiesManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SDKPropertiesManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetIsFileCache initialize$lambda$220$lambda$104(ServicesRegistry servicesRegistry) {
        return new CommonGetIsFileCache((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetAssetFileName) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAssetFileName.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetInitializationState initialize$lambda$220$lambda$105(ServicesRegistry servicesRegistry) {
        return new CommonSetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (SDKPropertiesManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SDKPropertiesManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetRequestPolicy initialize$lambda$220$lambda$106(ServicesRegistry servicesRegistry) {
        return new AndroidGetAdRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdDataRefreshRequest initialize$lambda$220$lambda$107(ServicesRegistry servicesRegistry) {
        return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CampaignRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdPlayerConfigRequest initialize$lambda$220$lambda$108(ServicesRegistry servicesRegistry) {
        return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (MediationInfoConverter) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationInfoConverter.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidGetAdPlayerContext initialize$lambda$220$lambda$109(ServicesRegistry servicesRegistry) {
        return new AndroidGetAdPlayerContext((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdRequest initialize$lambda$220$lambda$110(ServicesRegistry servicesRegistry) {
        return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CampaignRepository.class))), (WebviewConfigurationDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(WebviewConfigurationDataSource.class))), (TcfRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TcfRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetClientInfo initialize$lambda$220$lambda$111(ServicesRegistry servicesRegistry) {
        return new AndroidGetClientInfo((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (MediationRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationRepository.class))), (OmidManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OmidManager.class))), (OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OfferwallManager.class))), (FIdExistenceDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(FIdExistenceDataSource.class))), (AdQualityVersionDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdQualityVersionDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetInitializationCompletedRequest initialize$lambda$220$lambda$112(ServicesRegistry servicesRegistry) {
        return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CoherenceLibraryManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CoherenceLibraryManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetInitializationRequest initialize$lambda$220$lambda$113(ServicesRegistry servicesRegistry) {
        return new AndroidGetInitializationRequest((GetInitializationRequestPayload) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetLimitedSessionToken initialize$lambda$220$lambda$114(ServicesRegistry servicesRegistry) {
        return new AndroidGetLimitedSessionToken((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (MediationRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MediationRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetOpenGLRendererInfo initialize$lambda$220$lambda$115(ServicesRegistry servicesRegistry) {
        return new AndroidGetOpenGLRendererInfo((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetSharedDataTimestamps initialize$lambda$220$lambda$116(ServicesRegistry servicesRegistry) {
        return new AndroidGetSharedDataTimestamps((ForegroundDurationReader) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ForegroundDurationReader.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetUniversalRequestForPayLoad initialize$lambda$220$lambda$117(ServicesRegistry servicesRegistry) {
        return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestSharedData.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetUniversalRequestSharedData initialize$lambda$220$lambda$118(ServicesRegistry servicesRegistry) {
        return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (GetLimitedSessionToken) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetLimitedSessionToken.class))), (DeveloperConsentRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeveloperConsentRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetCachedAsset initialize$lambda$220$lambda$119(ServicesRegistry servicesRegistry) {
        return new GetCachedAsset((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CacheWebViewAssets) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheWebViewAssets.class))), (GetAssetFileName) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAssetFileName.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetWebViewBridgeUseCase initialize$lambda$220$lambda$120(ServicesRegistry servicesRegistry) {
        return new CommonGetWebViewBridgeUseCase((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetRequestPolicy initialize$lambda$220$lambda$121(ServicesRegistry servicesRegistry) {
        return new GetInitRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetLatestWebViewConfiguration initialize$lambda$220$lambda$122(ServicesRegistry servicesRegistry) {
        return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(WebviewConfigurationDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetRequestPolicy initialize$lambda$220$lambda$123(ServicesRegistry servicesRegistry) {
        return new GetOperativeEventRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetRequestPolicy initialize$lambda$220$lambda$124(ServicesRegistry servicesRegistry) {
        return new GetOtherRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetPrivacyUpdateRequest initialize$lambda$220$lambda$125(ServicesRegistry servicesRegistry) {
        return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleGatewayInitializationResponse initialize$lambda$220$lambda$126(ServicesRegistry servicesRegistry) {
        return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventManager.class))), (AdRevenueObserver) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRevenueObserver.class))), (MaxAdRevenueObserver) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MaxAdRevenueObserver.class))), (LifecycleEventObserver) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LifecycleEventObserver.class))), (TriggerInitializationCompletedRequest) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TriggerInitializationCompletedRequest.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CoroutineScope) servicesRegistry.resolveService(new ServiceKey(NAMED_INIT_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), (HandleDebugSettings) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleDebugSettings.class))), (GetSafeguardedInitializationPolicy) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetSafeguardedInitializationPolicy.class))), (NativeConfigurationOuterClass.NativeConfiguration) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(NativeConfigurationOuterClass.NativeConfiguration.class))), (InitializeAdQuality) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeAdQuality.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateAdQualitySessionToken initialize$lambda$220$lambda$127(ServicesRegistry servicesRegistry) {
        return new AndroidUpdateAdQualitySessionToken((Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))), (AdQualityVersionDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdQualityVersionDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleGatewayUniversalResponse initialize$lambda$220$lambda$128(ServicesRegistry servicesRegistry) {
        return new AndroidHandleGatewayUniversalResponse((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (AndroidAppSetIdDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidAppSetIdDataSource.class))), (UpdateAdQualitySessionToken) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UpdateAdQualitySessionToken.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeBoldSDK initialize$lambda$220$lambda$129(ServicesRegistry servicesRegistry) {
        return new AndroidInitializeBoldSDK((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (InitializeOMSDK) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(InitializeOMSDK.class))), (GetInitializationRequest) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_INIT_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (CleanAssets) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CleanAssets.class))), (HandleGatewayInitializationResponse) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayInitializationResponse.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (EventObservers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(EventObservers.class))), (TriggerInitializeListener) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TriggerInitializeListener.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (StorageManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StorageManager.class))), (SDKPropertiesManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SDKPropertiesManager.class))), (GetGameId) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetGameId.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))), (AndroidHandleFocusCounters) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidHandleFocusCounters.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyShowUseCase initialize$lambda$220$lambda$130(ServicesRegistry servicesRegistry) {
        return new LegacyShowUseCase((Show) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Show.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetOperativeEventApi) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationState.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (SafeCallbackInvoke) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SafeCallbackInvoke.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SendPrivacyUpdateRequest initialize$lambda$220$lambda$131(ServicesRegistry servicesRegistry) {
        return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_OTHER_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TriggerInitializationCompletedRequest initialize$lambda$220$lambda$132(ServicesRegistry servicesRegistry) {
        return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationCompletedRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_INIT_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TriggerInitializeListener initialize$lambda$220$lambda$133(ServicesRegistry servicesRegistry) {
        return new TriggerInitializeListener((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DiagnosticEventObserver initialize$lambda$220$lambda$134(ServicesRegistry servicesRegistry) {
        return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetDiagnosticEventBatchRequest.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class))), (UniversalRequestDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UniversalRequestDataSource.class))), (BackgroundWorker) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(BackgroundWorker.class))), (UniversalRequestEventSender) servicesRegistry.resolveService(new ServiceKey(DIAGNOSTICS_EVENT_SENDER, Reflection.getOrCreateKotlinClass(UniversalRequestEventSender.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_OTHER_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventObservers initialize$lambda$220$lambda$135(ServicesRegistry servicesRegistry) {
        return new EventObservers((OperativeEventObserver) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OperativeEventObserver.class))), (DiagnosticEventObserver) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventObserver.class))), (TransactionEventObserver) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventObserver.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetTransactionData initialize$lambda$220$lambda$136(ServicesRegistry servicesRegistry) {
        return new AndroidGetTransactionData((GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetByteStringId.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetTransactionRequest initialize$lambda$220$lambda$137(ServicesRegistry servicesRegistry) {
        return new CommonGetTransactionRequest((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdRevenueEventData initialize$lambda$220$lambda$138() {
        return new AndroidGetAdRevenueEventData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleAdRevenueEvent initialize$lambda$220$lambda$139(ServicesRegistry servicesRegistry) {
        return new HandleAdRevenueEvent((AdRevenueRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRevenueRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (GetAdRevenueEventData) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdRevenueEventData.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetDiagnosticEventBatchRequest initialize$lambda$220$lambda$140() {
        return new GetDiagnosticEventBatchRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetDiagnosticEventRequest initialize$lambda$220$lambda$141(ServicesRegistry servicesRegistry) {
        return new GetDiagnosticEventRequest((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetSharedDataTimestamps.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetOperativeEventApi initialize$lambda$220$lambda$142(ServicesRegistry servicesRegistry) {
        return new GetOperativeEventApi((OperativeEventRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OperativeEventRepository.class))), (GetOperativeEventRequest) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOperativeEventRequest.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetOperativeEventRequest initialize$lambda$220$lambda$143(ServicesRegistry servicesRegistry) {
        return new GetOperativeEventRequest((GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetByteStringId.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CampaignRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleGatewayEventResponse initialize$lambda$220$lambda$144() {
        return new AndroidHandleGatewayEventResponse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OperativeEventObserver initialize$lambda$220$lambda$145(ServicesRegistry servicesRegistry) {
        return new OperativeEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (OperativeEventRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OperativeEventRepository.class))), (UniversalRequestDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UniversalRequestDataSource.class))), (BackgroundWorker) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(BackgroundWorker.class))), (UniversalRequestEventSender) servicesRegistry.resolveService(new ServiceKey(OPERATIVE_EVENT_SENDER, Reflection.getOrCreateKotlinClass(UniversalRequestEventSender.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_OPERATIVE_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionEventObserver initialize$lambda$220$lambda$146(ServicesRegistry servicesRegistry) {
        return new TransactionEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (CoroutineScope) servicesRegistry.resolveService(new ServiceKey(NAMED_TRANSACTION_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), (TransactionEventRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(TransactionEventRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_OTHER_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(ByteStringDataSource.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdRevenueObserver initialize$lambda$220$lambda$147(ServicesRegistry servicesRegistry) {
        return new AdRevenueObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (CoroutineScope) servicesRegistry.resolveService(new ServiceKey(NAMED_ILRD_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), (AdRevenueRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRevenueRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_OTHER_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleEventObserver initialize$lambda$220$lambda$148(ServicesRegistry servicesRegistry) {
        return new LifecycleEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetUniversalRequestForPayLoad.class))), (CoroutineScope) servicesRegistry.resolveService(new ServiceKey(NAMED_LIFECYCLE_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LifecycleDataSource.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_OTHER_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetByteStringId.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppLovinCommunicatorBridge initialize$lambda$220$lambda$149(ServicesRegistry servicesRegistry) {
        return new AppLovinCommunicatorBridge((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaxAdRevenueCommunicatorProxyFactory initialize$lambda$220$lambda$150(ServicesRegistry servicesRegistry) {
        return new MaxAdRevenueCommunicatorProxyFactory((Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaxAdRevenueListener initialize$lambda$220$lambda$151(ServicesRegistry servicesRegistry) {
        return new MaxAdRevenueListener((HandleAdRevenueEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleAdRevenueEvent.class))), (CoroutineScope) servicesRegistry.resolveService(new ServiceKey(NAMED_ILRD_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaxAdRevenueObserver initialize$lambda$220$lambda$152(ServicesRegistry servicesRegistry) {
        return new MaxAdRevenueObserver((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))), (AppLovinCommunicatorBridge) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AppLovinCommunicatorBridge.class))), (MaxAdRevenueListener) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MaxAdRevenueListener.class))), (MaxAdRevenueCommunicatorProxyFactory) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(MaxAdRevenueCommunicatorProxyFactory.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestTtlValidator initialize$lambda$220$lambda$153() {
        return new CommonUniversalRequestTtlValidator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestEventSender initialize$lambda$220$lambda$154(ServicesRegistry servicesRegistry) {
        return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (HandleGatewayEventResponse) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UniversalRequestTtlValidator.class))), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestEventSender initialize$lambda$220$lambda$155(ServicesRegistry servicesRegistry) {
        return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (HandleGatewayEventResponse) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UniversalRequestTtlValidator.class))), OperationType.DIAGNOSTIC_EVENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestEventSender initialize$lambda$220$lambda$156(ServicesRegistry servicesRegistry) {
        return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (HandleGatewayEventResponse) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(UniversalRequestTtlValidator.class))), OperationType.OPERATIVE_EVENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmFinishSession initialize$lambda$220$lambda$157(ServicesRegistry servicesRegistry) {
        return new AndroidOmFinishSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmImpressionOccurred initialize$lambda$220$lambda$158(ServicesRegistry servicesRegistry) {
        return new AndroidOmImpressionOccurred((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidOmInteraction initialize$lambda$220$lambda$159(ServicesRegistry servicesRegistry) {
        return new AndroidOmStartSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetOmData initialize$lambda$220$lambda$160(ServicesRegistry servicesRegistry) {
        return new CommonGetOmData((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IsOMActivated initialize$lambda$220$lambda$161(ServicesRegistry servicesRegistry) {
        return new CommonIsOMActivated((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeOMSDK initialize$lambda$220$lambda$162(ServicesRegistry servicesRegistry) {
        return new AndroidInitializeOMSDK((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeAdQuality initialize$lambda$220$lambda$163(ServicesRegistry servicesRegistry) {
        return new AndroidInitializeAdQuality((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))), (GetGameId) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetGameId.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoherenceLibraryManager initialize$lambda$220$lambda$164(ServicesRegistry servicesRegistry) {
        return new AndroidCoherenceLibraryManager((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlattenerRulesUseCase initialize$lambda$220$lambda$165() {
        return new DeveloperConsentFlattenerRulesUseCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlattenerRulesUseCase initialize$lambda$220$lambda$166() {
        return new LegacyUserConsentFlattenerRulesUseCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BackgroundWorker initialize$lambda$220$lambda$167(ServicesRegistry servicesRegistry) {
        return new BackgroundWorker((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DiagnosticEventRequestWorkModifier initialize$lambda$220$lambda$168(ServicesRegistry servicesRegistry) {
        return new DiagnosticEventRequestWorkModifier((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GatewayClient initialize$lambda$220$lambda$169(ServicesRegistry servicesRegistry) {
        return new CommonGatewayClient((HttpClientProvider) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HttpClientProvider.class))), (HandleGatewayUniversalResponse) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (RequestUrlFactory) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(RequestUrlFactory.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineExceptionHandler initialize$lambda$220$lambda$170(ServicesRegistry servicesRegistry) {
        return new SDKErrorHandler((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VolumeChange initialize$lambda$220$lambda$171() {
        return new VolumeChangeContentObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StoreMonitor initialize$lambda$220$lambda$172(ServicesRegistry servicesRegistry) {
        return new StoreMonitor((StoreExceptionHandler) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(StoreExceptionHandler.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StoreExceptionHandler initialize$lambda$220$lambda$173() {
        return new GatewayStoreExceptionHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidAttribution initialize$lambda$220$lambda$174(ServicesRegistry servicesRegistry) {
        return new AndroidAttribution((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdPlayerScope initialize$lambda$220$lambda$175(ServicesRegistry servicesRegistry) {
        return new AdPlayerScope((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey("sdk", Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidWebViewClient initialize$lambda$220$lambda$176(ServicesRegistry servicesRegistry) {
        return new AndroidWebViewClient((GetCachedAsset) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetCachedAsset.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidGetWebViewContainerUseCase initialize$lambda$220$lambda$177(ServicesRegistry servicesRegistry) {
        return new AndroidGetWebViewContainerUseCase((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (AndroidWebViewClient) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendWebViewClientErrorDiagnostics.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Load initialize$lambda$220$lambda$178(ServicesRegistry servicesRegistry) {
        return new AndroidLoad((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (GetAdRequest) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdRequest.class))), (GetAdPlayerConfigRequest) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_AD_REQ, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class))), (HandleGatewayAdResponse) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleGatewayAdResponse.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GatewayClient.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (ValidateExtrasSize) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ValidateExtrasSize.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AwaitInitialization initialize$lambda$220$lambda$179(ServicesRegistry servicesRegistry) {
        return new CommonAwaitInitialization((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAsyncHeaderBiddingToken initialize$lambda$220$lambda$180(ServicesRegistry servicesRegistry) {
        return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationState.class))), (AwaitInitialization) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AwaitInitialization.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (SafeCallbackInvoke) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SafeCallbackInvoke.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdPlayer initialize$lambda$220$lambda$181(ServicesRegistry servicesRegistry) {
        return new CommonGetAdPlayer((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OpenMeasurementRepository.class))), (OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OfferwallManager.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(LifecycleDataSource.class))), (OrientationRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OrientationRepository.class))), (Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheWebViewAssets initialize$lambda$220$lambda$182(ServicesRegistry servicesRegistry) {
        return new AndroidCacheWebViewAssets((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleGatewayAdResponse initialize$lambda$220$lambda$183(ServicesRegistry servicesRegistry) {
        return new AndroidHandleGatewayAdResponse((AdRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))), (AndroidGetWebViewContainerUseCase) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(HandleInvocationsFromAdViewer.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CampaignRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetOperativeEventApi) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetLatestWebViewConfiguration.class))), (AdPlayerScope) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdPlayerScope.class))), (GetAdPlayer) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetAdPlayer.class))), (CacheWebViewAssets) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheWebViewAssets.class))), (WebViewLessLoadStrategy) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(WebViewLessLoadStrategy.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleInvocationsFromAdViewer initialize$lambda$220$lambda$184() {
        return new HandleInvocationsFromAdViewer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyLoadUseCase initialize$lambda$220$lambda$185(ServicesRegistry servicesRegistry) {
        return new LegacyLoadUseCase((Load) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Load.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationState.class))), (AwaitInitialization) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AwaitInitialization.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))), (SafeCallbackInvoke) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SafeCallbackInvoke.class))), (CleanUpWhenOpportunityExpires) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CleanUpWhenOpportunityExpires.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewLessLoadStrategy initialize$lambda$220$lambda$186(ServicesRegistry servicesRegistry) {
        return new AndroidWebViewLessLoadStrategy((AdRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CampaignRepository.class))), (CacheAssets) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CacheAssets.class))), (AdRefresh) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AdRefresh.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SafeCallbackInvoke initialize$lambda$220$lambda$187(ServicesRegistry servicesRegistry) {
        return new CommonSafeCallbackInvoke((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(MAIN_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineTimer initialize$lambda$220$lambda$188(ServicesRegistry servicesRegistry) {
        return new CommonCoroutineTimer((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetGameId initialize$lambda$220$lambda$189(ServicesRegistry servicesRegistry) {
        return new CommonSetGameId((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetGameId initialize$lambda$220$lambda$190(ServicesRegistry servicesRegistry) {
        return new CommonGetGameId((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValidateGameId initialize$lambda$220$lambda$191(ServicesRegistry servicesRegistry) {
        return new CommonValidateGameId((GetGameId) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetGameId.class))), (SetGameId) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SetGameId.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValidateExtrasSize initialize$lambda$220$lambda$192(ServicesRegistry servicesRegistry) {
        return new ValidateExtrasSize((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShouldAllowInitialization initialize$lambda$220$lambda$193(ServicesRegistry servicesRegistry) {
        return new CommonShouldAllowInitialization((CheckForGameIdAndTestModeChanges) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetInitializationState.class))), (SetInitializationState) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SetInitializationState.class))), (ValidateGameId) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ValidateGameId.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckForGameIdAndTestModeChanges initialize$lambda$220$lambda$194(ServicesRegistry servicesRegistry) {
        return new CommonCheckForGameIdAndTestModeChanges((GetGameId) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(GetGameId.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadPriorityQueue initialize$lambda$220$lambda$195(ServicesRegistry servicesRegistry) {
        return new DownloadPriorityQueue((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CleanupDirectory initialize$lambda$220$lambda$196(ServicesRegistry servicesRegistry) {
        return new CleanupDirectory((Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FocusRepository initialize$lambda$220$lambda$197(ServicesRegistry servicesRegistry) {
        return new FocusRepository((AndroidGetLifecycleFlow) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidGetLifecycleFlow.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidGetIsAdActivity initialize$lambda$220$lambda$198(ServicesRegistry servicesRegistry) {
        return new AndroidGetIsAdActivity((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidGetLifecycleFlow initialize$lambda$220$lambda$199(ServicesRegistry servicesRegistry) {
        return new AndroidGetLifecycleFlow((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidHandleFocusCounters initialize$lambda$220$lambda$200(ServicesRegistry servicesRegistry) {
        return new AndroidHandleFocusCounters((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (FocusRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(FocusRepository.class))), (AndroidGetIsAdActivity) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidGetIsAdActivity.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OfferwallAdapterBridge initialize$lambda$220$lambda$201(ServicesRegistry servicesRegistry) {
        return new OfferwallAdapterBridge((CoroutineScope) servicesRegistry.resolveService(new ServiceKey(NAMED_OFFERWALL_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OfferwallManager initialize$lambda$220$lambda$202(ServicesRegistry servicesRegistry) {
        return new AndroidOfferwallManager((OfferwallAdapterBridge) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OfferwallAdapterBridge.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadOfferwallAd initialize$lambda$220$lambda$203(ServicesRegistry servicesRegistry) {
        return new LoadOfferwallAd((OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OfferwallManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetIsOfferwallAdReady initialize$lambda$220$lambda$204(ServicesRegistry servicesRegistry) {
        return new GetIsOfferwallAdReady((OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(OfferwallManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FIdDataSource initialize$lambda$220$lambda$205(ServicesRegistry servicesRegistry) {
        return new CachedFIdDataSource((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), new AndroidFIdDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FIdExistenceDataSource initialize$lambda$220$lambda$206() {
        return new AndroidFIdExistenceDataSource(Constants.FID_CLASS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdQualityVersionDataSource initialize$lambda$220$lambda$207(ServicesRegistry servicesRegistry) {
        return new AndroidAdQualityVersionDataSource((Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CleanUpWhenOpportunityExpires initialize$lambda$220$lambda$208(ServicesRegistry servicesRegistry) {
        return new CleanUpWhenOpportunityExpires((CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrientationRepository initialize$lambda$220$lambda$209(ServicesRegistry servicesRegistry) {
        return new OrientationRepository((AndroidGetLifecycleFlow) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(AndroidGetLifecycleFlow.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidAppSetIdDataSource initialize$lambda$220$lambda$210(ServicesRegistry servicesRegistry) {
        return new AndroidAppSetIdDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidUnityInfoDataSource initialize$lambda$220$lambda$211(ServicesRegistry servicesRegistry) {
        return new AndroidUnityInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstallReferrerDataSource initialize$lambda$220$lambda$212(ServicesRegistry servicesRegistry) {
        return new AndroidInstallReferrerDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SendDiagnosticEvent.class))), (CoroutineScope) servicesRegistry.resolveService(new ServiceKey(NAMED_INIT_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoogleAppIdDataSource initialize$lambda$220$lambda$213(ServicesRegistry servicesRegistry) {
        return new AndroidGoogleAppIdDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleDebugSettings initialize$lambda$220$lambda$214() {
        return new HandleDebugSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Logger initialize$lambda$220$lambda$215(ServicesRegistry servicesRegistry) {
        return new UnityLogger((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))), (CreateFile) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(CreateFile.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IsBillingClientAvailable initialize$lambda$220$lambda$216() {
        return new IsBillingClientAvailable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UnityBootConfigDataSource initialize$lambda$220$lambda$217(ServicesRegistry servicesRegistry) {
        return new AndroidUnityBootConfigDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetSafeguardedInitializationPolicy initialize$lambda$220$lambda$218() {
        return new AndroidGetSafeguardedInitializationPolicy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestUrlFactory initialize$lambda$220$lambda$219(ServicesRegistry servicesRegistry) {
        return new AndroidRequestUrlFactory((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope initialize$lambda$220$lambda$5(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.initCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey("sdk", Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope initialize$lambda$220$lambda$6(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.loadCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey("sdk", Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope initialize$lambda$220$lambda$7(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.showCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey("sdk", Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope initialize$lambda$220$lambda$8(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.transactionCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey("sdk", Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope initialize$lambda$220$lambda$9(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.ilrdCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey("sdk", Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope initialize$lambda$220$lambda$10(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.lifecycleCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey("sdk", Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope initialize$lambda$220$lambda$11(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.getTokenCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey("sdk", Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope initialize$lambda$220$lambda$12(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.offerwallSignalsCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey("sdk", Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope initialize$lambda$220$lambda$13(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.omidCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(ISDKDispatchers.class))), (CoroutineExceptionHandler) servicesRegistry.resolveService(new ServiceKey("sdk", Reflection.getOrCreateKotlinClass(CoroutineExceptionHandler.class))), (Job) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, Reflection.getOrCreateKotlinClass(Job.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job initialize$lambda$220$lambda$14(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.publicApiJob((DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(DiagnosticEventRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore initialize$lambda$220$lambda$16(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.privacyDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteStringDataSource initialize$lambda$220$lambda$17(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.privacyDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_PRIVACY, Reflection.getOrCreateKotlinClass(DataStore.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore initialize$lambda$220$lambda$18(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.privacyFsmDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteStringDataSource initialize$lambda$220$lambda$19(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.privacyFsmDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_PRIVACY_FSM, Reflection.getOrCreateKotlinClass(DataStore.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore initialize$lambda$220$lambda$20(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.nativeConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteStringDataSource initialize$lambda$220$lambda$21(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.nativeConfigurationDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_NATIVE_CONFIG, Reflection.getOrCreateKotlinClass(DataStore.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore initialize$lambda$220$lambda$22(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.glInfoDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))), (DataMigration) servicesRegistry.resolveService(new ServiceKey(PREF_GL_INFO, Reflection.getOrCreateKotlinClass(DataMigration.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteStringDataSource initialize$lambda$220$lambda$23(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.glInfoDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_GL_INFO, Reflection.getOrCreateKotlinClass(DataStore.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore initialize$lambda$220$lambda$25(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.iapTransactionDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteStringDataSource initialize$lambda$220$lambda$26(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.iapTransactionDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_IAP_TRANSACTION, Reflection.getOrCreateKotlinClass(DataStore.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore initialize$lambda$220$lambda$27(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.webViewConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", Reflection.getOrCreateKotlinClass(Context.class))), (CoroutineDispatcher) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, Reflection.getOrCreateKotlinClass(CoroutineDispatcher.class))));
    }
}
