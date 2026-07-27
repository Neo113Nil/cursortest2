package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import gatewayprotocol.v1.ClientInfoKt;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AndroidGetClientInfo.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u0011H\u0096B¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetClientInfo;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "mediationRepository", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "omidManager", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "offerwallManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "fIdExistenceDataSource", "Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;", "adQualityVersionDataSource", "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/MediationRepository;Lcom/unity3d/ads/core/data/manager/OmidManager;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/data/datasource/FIdExistenceDataSource;Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;)V", "invoke", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidGetClientInfo implements GetClientInfo {
    private final AdQualityVersionDataSource adQualityVersionDataSource;
    private final FIdExistenceDataSource fIdExistenceDataSource;
    private final MediationRepository mediationRepository;
    private final OfferwallManager offerwallManager;
    private final OmidManager omidManager;
    private final SessionRepository sessionRepository;

    public AndroidGetClientInfo(SessionRepository sessionRepository, MediationRepository mediationRepository, OmidManager omidManager, OfferwallManager offerwallManager, FIdExistenceDataSource fIdExistenceDataSource, AdQualityVersionDataSource adQualityVersionDataSource) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(mediationRepository, "mediationRepository");
        Intrinsics.checkNotNullParameter(omidManager, "omidManager");
        Intrinsics.checkNotNullParameter(offerwallManager, "offerwallManager");
        Intrinsics.checkNotNullParameter(fIdExistenceDataSource, "fIdExistenceDataSource");
        Intrinsics.checkNotNullParameter(adQualityVersionDataSource, "adQualityVersionDataSource");
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
        this.omidManager = omidManager;
        this.offerwallManager = offerwallManager;
        this.fIdExistenceDataSource = fIdExistenceDataSource;
        this.adQualityVersionDataSource = adQualityVersionDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.GetClientInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(Continuation<? super ClientInfoOuterClass.ClientInfo> continuation) {
        AndroidGetClientInfo$invoke$1 androidGetClientInfo$invoke$1;
        int i;
        ClientInfoKt.Dsl dsl;
        ClientInfoKt.Dsl dsl2;
        String str;
        String invoke;
        if (continuation instanceof AndroidGetClientInfo$invoke$1) {
            androidGetClientInfo$invoke$1 = (AndroidGetClientInfo$invoke$1) continuation;
            if ((androidGetClientInfo$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidGetClientInfo$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = androidGetClientInfo$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetClientInfo$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.INSTANCE;
                    ClientInfoOuterClass.ClientInfo.Builder newBuilder = ClientInfoOuterClass.ClientInfo.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                    ClientInfoKt.Dsl _create = companion._create(newBuilder);
                    _create.setSdkVersion(41900);
                    _create.setSdkVersionName("4.19.0");
                    String gameId = this.sessionRepository.getGameId();
                    if (gameId != null) {
                        _create.setGameId(gameId);
                    }
                    _create.setTest(this.sessionRepository.isTestModeEnabled());
                    _create.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
                    _create.setMediationProvider(this.mediationRepository.getMediationProvider().invoke());
                    String name = this.mediationRepository.getName();
                    if (name != null && _create.getMediationProvider() == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM && !StringsKt.isBlank(name)) {
                        _create.setCustomMediationName(name);
                    }
                    String version = this.mediationRepository.getVersion();
                    if (version != null) {
                        _create.setMediationVersion(version);
                    }
                    OfferwallManager offerwallManager = this.offerwallManager;
                    androidGetClientInfo$invoke$1.L$0 = _create;
                    androidGetClientInfo$invoke$1.L$1 = _create;
                    androidGetClientInfo$invoke$1.label = 1;
                    Object version2 = offerwallManager.getVersion(androidGetClientInfo$invoke$1);
                    if (version2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dsl = _create;
                    obj = version2;
                    dsl2 = dsl;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl = (ClientInfoKt.Dsl) androidGetClientInfo$invoke$1.L$1;
                    dsl2 = (ClientInfoKt.Dsl) androidGetClientInfo$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null) {
                    dsl.setOfferwallVersion(str);
                }
                dsl.setOmidVersion(this.omidManager.getVersion());
                dsl.setOmidPartnerVersion("1");
                dsl.setSdkDevelopmentPlatform(!MadeWithUnityDetector.isMadeWithUnity() ? "Unity" : "");
                dsl.setIsFidAvailable(this.fIdExistenceDataSource.invoke());
                invoke = this.adQualityVersionDataSource.invoke();
                if (invoke != null) {
                    dsl.setAdQualitySdkVersion(invoke);
                }
                return dsl2._build();
            }
        }
        androidGetClientInfo$invoke$1 = new AndroidGetClientInfo$invoke$1(this, continuation);
        Object obj2 = androidGetClientInfo$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetClientInfo$invoke$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        dsl.setOmidVersion(this.omidManager.getVersion());
        dsl.setOmidPartnerVersion("1");
        dsl.setSdkDevelopmentPlatform(!MadeWithUnityDetector.isMadeWithUnity() ? "Unity" : "");
        dsl.setIsFidAvailable(this.fIdExistenceDataSource.invoke());
        invoke = this.adQualityVersionDataSource.invoke();
        if (invoke != null) {
        }
        return dsl2._build();
    }
}
