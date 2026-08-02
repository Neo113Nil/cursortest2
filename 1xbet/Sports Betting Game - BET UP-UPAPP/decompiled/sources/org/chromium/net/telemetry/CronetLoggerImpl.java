package org.chromium.net.telemetry;

import android.os.Build;
import android.os.Process;
import android.util.Log;
import io.bidmachine.media3.common.C;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes4.dex */
public class CronetLoggerImpl extends CronetLogger {
    private static final String TAG = "CronetLoggerImpl";
    private final RateLimiter mRateLimiter;
    private final AtomicInteger mSamplesRateLimited;

    private static int convertToProtoConnectionCloseSource(int source) {
        if (source != 1) {
            return source != 2 ? 0 : 1;
        }
        return 2;
    }

    public CronetLoggerImpl(int sampleRatePerSecond) {
        this(new RateLimiter(sampleRatePerSecond));
    }

    public CronetLoggerImpl(RateLimiter rateLimiter) {
        this.mSamplesRateLimited = new AtomicInteger();
        this.mRateLimiter = rateLimiter;
    }

    @Override // org.chromium.net.impl.CronetLogger
    public long generateId() {
        long nextLong = ThreadLocalRandom.current().nextLong(C.TIME_UNSET, 9223372036854775805L);
        return nextLong >= -1 ? nextLong + 2 : nextLong;
    }

    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetEngineBuilderInitializedInfo(CronetLogger.CronetEngineBuilderInitializedInfo info) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
        try {
            CronetStatsLog.write(CronetStatsLog.CRONET_ENGINE_BUILDER_INITIALIZED, info.cronetInitializationRef, convertToProtoCronetEngineBuilderInitializedAuthor(info.author), info.engineBuilderCreatedLatencyMillis, convertToProtoCronetEngineBuilderInitializedSource(info.source), OptionalBoolean.fromBoolean(info.creationSuccessful).getValue(), info.apiVersion.getMajorVersion(), info.apiVersion.getMinorVersion(), info.apiVersion.getBuildVersion(), info.apiVersion.getPatchVersion(), info.implVersion == null ? -1 : info.implVersion.getMajorVersion(), info.implVersion == null ? -1 : info.implVersion.getMinorVersion(), info.implVersion == null ? -1 : info.implVersion.getBuildVersion(), info.implVersion == null ? -1 : info.implVersion.getPatchVersion(), info.uid);
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped == null) {
                throw th;
            }
            try {
                scoped.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetInitializedInfo(CronetLogger.CronetInitializedInfo info) {
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetLoggerImpl#logCronetInitializedInfo");
        try {
            CronetStatsLog.write(CronetStatsLog.CRONET_INITIALIZED, info.cronetInitializationRef, info.engineCreationLatencyMillis, info.engineAsyncLatencyMillis, -1, OptionalBoolean.UNSET.getValue(), new long[0], new long[0], info.cronetImplVersion, convertToProtoCronetEngineBuilderInitializedSource(info.source), Process.myUid());
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetEngineCreation(long cronetEngineId, CronetLogger.CronetEngineBuilderInfo builder, CronetLogger.CronetVersion version, CronetLogger.CronetSource source) {
        if (builder == null || version == null || source == null) {
            return;
        }
        writeCronetEngineCreation(cronetEngineId, builder, version, source);
    }

    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetTrafficInfo(long cronetEngineId, CronetLogger.CronetTrafficInfo trafficInfo) {
        if (trafficInfo == null) {
            return;
        }
        if (!this.mRateLimiter.tryAcquire()) {
            this.mSamplesRateLimited.incrementAndGet();
        } else {
            writeCronetTrafficReported(cronetEngineId, trafficInfo, this.mSamplesRateLimited.getAndSet(0));
        }
    }

    public void writeCronetEngineCreation(long cronetEngineId, CronetLogger.CronetEngineBuilderInfo builder, CronetLogger.CronetVersion version, CronetLogger.CronetSource source) {
        try {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetLoggerImpl#writeCronetEngineCreation");
            try {
                ExperimentalOptions experimentalOptions = new ExperimentalOptions(builder.getExperimentalOptions());
                CronetStatsLog.write(703, cronetEngineId, version.getMajorVersion(), version.getMinorVersion(), version.getBuildVersion(), version.getPatchVersion(), convertToProtoCronetEngineCreatedSource(source), builder.isBrotliEnabled(), builder.isHttp2Enabled(), convertToProtoHttpCacheMode(builder.getHttpCacheMode()), builder.isPublicKeyPinningBypassForLocalTrustAnchorsEnabled(), builder.isQuicEnabled(), builder.isNetworkQualityEstimatorEnabled(), builder.getThreadPriority(), experimentalOptions.getConnectionOptionsOption(), experimentalOptions.getStoreServerConfigsInPropertiesOption().getValue(), experimentalOptions.getMaxServerConfigsStoredInPropertiesOption(), experimentalOptions.getIdleConnectionTimeoutSecondsOption(), experimentalOptions.getGoawaySessionsOnIpChangeOption().getValue(), experimentalOptions.getCloseSessionsOnIpChangeOption().getValue(), experimentalOptions.getMigrateSessionsOnNetworkChangeV2Option().getValue(), experimentalOptions.getMigrateSessionsEarlyV2().getValue(), experimentalOptions.getDisableBidirectionalStreamsOption().getValue(), experimentalOptions.getMaxTimeBeforeCryptoHandshakeSecondsOption(), experimentalOptions.getMaxIdleTimeBeforeCryptoHandshakeSecondsOption(), experimentalOptions.getEnableSocketRecvOptimizationOption().getValue(), experimentalOptions.getAsyncDnsEnableOption().getValue(), experimentalOptions.getStaleDnsEnableOption().getValue(), experimentalOptions.getStaleDnsDelayMillisOption(), experimentalOptions.getStaleDnsMaxExpiredTimeMillisOption(), experimentalOptions.getStaleDnsMaxStaleUsesOption(), experimentalOptions.getStaleDnsAllowOtherNetworkOption().getValue(), experimentalOptions.getStaleDnsPersistToDiskOption().getValue(), experimentalOptions.getStaleDnsPersistDelayMillisOption(), experimentalOptions.getStaleDnsUseStaleOnNameNotResolvedOption().getValue(), experimentalOptions.getDisableIpv6OnWifiOption().getValue(), builder.getCronetInitializationRef(), Process.myUid());
                if (scoped != null) {
                    scoped.close();
                }
            } finally {
            }
        } catch (Exception e) {
            String str = TAG;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, String.format("Failed to log CronetEngine:%s creation: %s", Long.valueOf(cronetEngineId), e.getMessage()));
            }
        }
    }

    public void writeCronetTrafficReported(long cronetEngineId, CronetLogger.CronetTrafficInfo trafficInfo, int samplesRateLimitedCount) {
        try {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetLoggerImpl#writeCronetTrafficReported");
            try {
                CronetStatsLog.write(704, cronetEngineId, SizeBuckets.calcRequestHeadersSizeBucket(trafficInfo.getRequestHeaderSizeInBytes()), SizeBuckets.calcRequestBodySizeBucket(trafficInfo.getRequestBodySizeInBytes()), SizeBuckets.calcResponseHeadersSizeBucket(trafficInfo.getResponseHeaderSizeInBytes()), SizeBuckets.calcResponseBodySizeBucket(trafficInfo.getResponseBodySizeInBytes()), trafficInfo.getResponseStatusCode(), Hash.hash(trafficInfo.getNegotiatedProtocol()), (int) trafficInfo.getHeadersLatency().toMillis(), (int) trafficInfo.getTotalLatency().toMillis(), trafficInfo.wasConnectionMigrationAttempted(), trafficInfo.didConnectionMigrationSucceed(), samplesRateLimitedCount, convertToProtoCronetRequestTerminalState(trafficInfo.getTerminalState()), trafficInfo.getNonfinalUserCallbackExceptionCount(), -1L, -1L, trafficInfo.getReadCount(), trafficInfo.getOnUploadReadCount(), OptionalBoolean.fromBoolean(Boolean.valueOf(trafficInfo.getIsBidiStream())).getValue(), OptionalBoolean.fromBoolean(Boolean.valueOf(trafficInfo.getFinalUserCallbackThrew())).getValue(), trafficInfo.getUid(), trafficInfo.getNetworkInternalErrorCode(), trafficInfo.getQuicErrorCode(), convertToProtoConnectionCloseSource(trafficInfo.getConnectionCloseSource()), convertToProtoFailureReason(trafficInfo.getFailureReason()), OptionalBoolean.fromBoolean(Boolean.valueOf(trafficInfo.getIsSocketReused())).getValue(), trafficInfo.getCronetVersion(), convertToProtoCronetEngineBuilderInitializedSource(trafficInfo.getCronetSource()), trafficInfo.getTimeToEstablishDNSMillis(), trafficInfo.getTimeToEstablishSSLMillis(), trafficInfo.getTimeToConnectMillis(), trafficInfo.getTimeToSendFirstByteMillis());
                if (scoped != null) {
                    scoped.close();
                }
            } finally {
            }
        } catch (Exception e) {
            this.mSamplesRateLimited.addAndGet(samplesRateLimitedCount);
            String str = TAG;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, String.format("Failed to log cronet traffic sample for CronetEngine %s: %s", Long.valueOf(cronetEngineId), e.getMessage()));
            }
        }
    }

    private static int convertToProtoFailureReason(CronetLogger.CronetTrafficInfo.RequestFailureReason failureReason) {
        int i = AnonymousClass1.$SwitchMap$org$chromium$net$impl$CronetLogger$CronetTrafficInfo$RequestFailureReason[failureReason.ordinal()];
        if (i != 1) {
            return i != 2 ? 0 : 100;
        }
        return 1;
    }

    private static int convertToProtoCronetEngineBuilderInitializedAuthor(CronetLogger.CronetEngineBuilderInitializedInfo.Author author) {
        int i = AnonymousClass1.$SwitchMap$org$chromium$net$impl$CronetLogger$CronetEngineBuilderInitializedInfo$Author[author.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    private static int convertToProtoCronetRequestTerminalState(CronetLogger.CronetTrafficInfo.RequestTerminalState requestTerminalState) {
        int i = AnonymousClass1.$SwitchMap$org$chromium$net$impl$CronetLogger$CronetTrafficInfo$RequestTerminalState[requestTerminalState.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    /* renamed from: org.chromium.net.telemetry.CronetLoggerImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$chromium$net$impl$CronetLogger$CronetEngineBuilderInitializedInfo$Author;
        static final /* synthetic */ int[] $SwitchMap$org$chromium$net$impl$CronetLogger$CronetSource;
        static final /* synthetic */ int[] $SwitchMap$org$chromium$net$impl$CronetLogger$CronetTrafficInfo$RequestFailureReason;
        static final /* synthetic */ int[] $SwitchMap$org$chromium$net$impl$CronetLogger$CronetTrafficInfo$RequestTerminalState;

        static {
            int[] iArr = new int[CronetLogger.CronetSource.values().length];
            $SwitchMap$org$chromium$net$impl$CronetLogger$CronetSource = iArr;
            try {
                iArr[CronetLogger.CronetSource.CRONET_SOURCE_STATICALLY_LINKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetLogger$CronetSource[CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetLogger$CronetSource[CronetLogger.CronetSource.CRONET_SOURCE_FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetLogger$CronetSource[CronetLogger.CronetSource.CRONET_SOURCE_PLATFORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetLogger$CronetSource[CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[CronetLogger.CronetTrafficInfo.RequestTerminalState.values().length];
            $SwitchMap$org$chromium$net$impl$CronetLogger$CronetTrafficInfo$RequestTerminalState = iArr2;
            try {
                iArr2[CronetLogger.CronetTrafficInfo.RequestTerminalState.SUCCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetLogger$CronetTrafficInfo$RequestTerminalState[CronetLogger.CronetTrafficInfo.RequestTerminalState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetLogger$CronetTrafficInfo$RequestTerminalState[CronetLogger.CronetTrafficInfo.RequestTerminalState.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[CronetLogger.CronetEngineBuilderInitializedInfo.Author.values().length];
            $SwitchMap$org$chromium$net$impl$CronetLogger$CronetEngineBuilderInitializedInfo$Author = iArr3;
            try {
                iArr3[CronetLogger.CronetEngineBuilderInitializedInfo.Author.API.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetLogger$CronetEngineBuilderInitializedInfo$Author[CronetLogger.CronetEngineBuilderInitializedInfo.Author.IMPL.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[CronetLogger.CronetTrafficInfo.RequestFailureReason.values().length];
            $SwitchMap$org$chromium$net$impl$CronetLogger$CronetTrafficInfo$RequestFailureReason = iArr4;
            try {
                iArr4[CronetLogger.CronetTrafficInfo.RequestFailureReason.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetLogger$CronetTrafficInfo$RequestFailureReason[CronetLogger.CronetTrafficInfo.RequestFailureReason.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private static int convertToProtoCronetEngineBuilderInitializedSource(CronetLogger.CronetSource source) {
        int i = AnonymousClass1.$SwitchMap$org$chromium$net$impl$CronetLogger$CronetSource[source.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    private static int convertToProtoCronetEngineCreatedSource(CronetLogger.CronetSource source) {
        int i = AnonymousClass1.$SwitchMap$org$chromium$net$impl$CronetLogger$CronetSource[source.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    private static int convertToProtoHttpCacheMode(int httpCacheMode) {
        if (httpCacheMode == 0) {
            return 1;
        }
        if (httpCacheMode == 1) {
            return 2;
        }
        if (httpCacheMode == 2) {
            return 3;
        }
        if (httpCacheMode == 3) {
            return 4;
        }
        throw new IllegalArgumentException("Expected httpCacheMode to range from 0 to 3");
    }
}
