package org.chromium.net.telemetry;

/* loaded from: classes5.dex */
public class CronetLoggerImpl extends org.chromium.net.impl.CronetLogger {
    private static final java.lang.String getHighSpeedVideoSizes = "CronetLoggerImpl";
    private final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap;
    private final org.chromium.net.telemetry.RateLimiter getHighSpeedVideoFpsRangesFor;

    public CronetLoggerImpl(int i) {
        this(new org.chromium.net.telemetry.RateLimiter(i));
    }

    public CronetLoggerImpl(org.chromium.net.telemetry.RateLimiter rateLimiter) {
        this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger();
        this.getHighSpeedVideoFpsRangesFor = rateLimiter;
    }

    @Override // org.chromium.net.impl.CronetLogger
    public long generateId() {
        long nextLong = java.util.concurrent.ThreadLocalRandom.current().nextLong(androidx.media3.common.C.TIME_UNSET, 9223372036854775805L);
        return nextLong >= -1 ? nextLong + 2 : nextLong;
    }

    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetEngineBuilderInitializedInfo(org.chromium.net.impl.CronetLogger.CronetEngineBuilderInitializedInfo cronetEngineBuilderInitializedInfo) {
        org.chromium.base.metrics.ScopedSysTraceEvent scoped = org.chromium.base.metrics.ScopedSysTraceEvent.scoped("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo");
        try {
            long j = cronetEngineBuilderInitializedInfo.cronetInitializationRef;
            int i = org.chromium.net.telemetry.CronetLoggerImpl.AnonymousClass1.Camera2StreamConfigurationMap[cronetEngineBuilderInitializedInfo.author.ordinal()];
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 0;
                }
            }
            org.chromium.net.telemetry.CronetStatsLog.write(org.chromium.net.telemetry.CronetStatsLog.CRONET_ENGINE_BUILDER_INITIALIZED, j, i2, cronetEngineBuilderInitializedInfo.engineBuilderCreatedLatencyMillis, getHighSpeedVideoFpsRangesFor(cronetEngineBuilderInitializedInfo.source), org.chromium.net.telemetry.OptionalBoolean.fromBoolean(cronetEngineBuilderInitializedInfo.creationSuccessful).getValue(), cronetEngineBuilderInitializedInfo.apiVersion.getMajorVersion(), cronetEngineBuilderInitializedInfo.apiVersion.getMinorVersion(), cronetEngineBuilderInitializedInfo.apiVersion.getBuildVersion(), cronetEngineBuilderInitializedInfo.apiVersion.getPatchVersion(), cronetEngineBuilderInitializedInfo.implVersion == null ? -1 : cronetEngineBuilderInitializedInfo.implVersion.getMajorVersion(), cronetEngineBuilderInitializedInfo.implVersion == null ? -1 : cronetEngineBuilderInitializedInfo.implVersion.getMinorVersion(), cronetEngineBuilderInitializedInfo.implVersion == null ? -1 : cronetEngineBuilderInitializedInfo.implVersion.getBuildVersion(), cronetEngineBuilderInitializedInfo.implVersion == null ? -1 : cronetEngineBuilderInitializedInfo.implVersion.getPatchVersion(), cronetEngineBuilderInitializedInfo.uid);
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th) {
            if (scoped == null) {
                throw th;
            }
            try {
                scoped.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetInitializedInfo(org.chromium.net.impl.CronetLogger.CronetInitializedInfo cronetInitializedInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            org.chromium.base.metrics.ScopedSysTraceEvent scoped = org.chromium.base.metrics.ScopedSysTraceEvent.scoped("CronetLoggerImpl#logCronetInitializedInfo");
            try {
                org.chromium.net.telemetry.CronetStatsLog.write(764, cronetInitializedInfo.cronetInitializationRef, cronetInitializedInfo.engineCreationLatencyMillis, cronetInitializedInfo.engineAsyncLatencyMillis, -1, org.chromium.net.telemetry.OptionalBoolean.UNSET.getValue(), new long[0], new long[0], cronetInitializedInfo.cronetImplVersion, getHighSpeedVideoFpsRangesFor(cronetInitializedInfo.source), android.os.Process.myUid());
                if (scoped != null) {
                    scoped.close();
                }
            } catch (java.lang.Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetEngineCreation(long j, org.chromium.net.impl.CronetLogger.CronetEngineBuilderInfo cronetEngineBuilderInfo, org.chromium.net.impl.CronetLogger.CronetVersion cronetVersion, org.chromium.net.impl.CronetLogger.CronetSource cronetSource) {
        if (cronetEngineBuilderInfo == null || cronetVersion == null || cronetSource == null) {
            return;
        }
        writeCronetEngineCreation(j, cronetEngineBuilderInfo, cronetVersion, cronetSource);
    }

    @Override // org.chromium.net.impl.CronetLogger
    public void logCronetTrafficInfo(long j, org.chromium.net.impl.CronetLogger.CronetTrafficInfo cronetTrafficInfo) {
        if (cronetTrafficInfo == null) {
            return;
        }
        if (!this.getHighSpeedVideoFpsRangesFor.tryAcquire()) {
            this.Camera2StreamConfigurationMap.incrementAndGet();
        } else {
            writeCronetTrafficReported(j, cronetTrafficInfo, this.Camera2StreamConfigurationMap.getAndSet(0));
        }
    }

    public void writeCronetEngineCreation(long j, org.chromium.net.impl.CronetLogger.CronetEngineBuilderInfo cronetEngineBuilderInfo, org.chromium.net.impl.CronetLogger.CronetVersion cronetVersion, org.chromium.net.impl.CronetLogger.CronetSource cronetSource) {
        int i;
        try {
            org.chromium.base.metrics.ScopedSysTraceEvent scoped = org.chromium.base.metrics.ScopedSysTraceEvent.scoped("CronetLoggerImpl#writeCronetEngineCreation");
            try {
                org.chromium.net.telemetry.ExperimentalOptions experimentalOptions = new org.chromium.net.telemetry.ExperimentalOptions(cronetEngineBuilderInfo.getExperimentalOptions());
                int majorVersion = cronetVersion.getMajorVersion();
                int minorVersion = cronetVersion.getMinorVersion();
                int buildVersion = cronetVersion.getBuildVersion();
                int patchVersion = cronetVersion.getPatchVersion();
                int i2 = org.chromium.net.telemetry.CronetLoggerImpl.AnonymousClass1.getHighSpeedVideoFpsRangesFor[cronetSource.ordinal()];
                int i3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 4 : 3 : 2 : 1;
                boolean isBrotliEnabled = cronetEngineBuilderInfo.isBrotliEnabled();
                boolean isHttp2Enabled = cronetEngineBuilderInfo.isHttp2Enabled();
                int httpCacheMode = cronetEngineBuilderInfo.getHttpCacheMode();
                if (httpCacheMode == 0) {
                    i = 1;
                } else if (httpCacheMode == 1) {
                    i = 2;
                } else if (httpCacheMode == 2) {
                    i = 3;
                } else {
                    if (httpCacheMode != 3) {
                        throw new java.lang.IllegalArgumentException("Expected httpCacheMode to range from 0 to 3");
                    }
                    i = 4;
                }
                org.chromium.net.telemetry.CronetStatsLog.write(org.chromium.net.telemetry.CronetStatsLog.CRONET_ENGINE_CREATED, j, majorVersion, minorVersion, buildVersion, patchVersion, i3, isBrotliEnabled, isHttp2Enabled, i, cronetEngineBuilderInfo.isPublicKeyPinningBypassForLocalTrustAnchorsEnabled(), cronetEngineBuilderInfo.isQuicEnabled(), cronetEngineBuilderInfo.isNetworkQualityEstimatorEnabled(), cronetEngineBuilderInfo.getThreadPriority(), experimentalOptions.getConnectionOptionsOption(), experimentalOptions.getStoreServerConfigsInPropertiesOption().getValue(), experimentalOptions.getMaxServerConfigsStoredInPropertiesOption(), experimentalOptions.getIdleConnectionTimeoutSecondsOption(), experimentalOptions.getGoawaySessionsOnIpChangeOption().getValue(), experimentalOptions.getCloseSessionsOnIpChangeOption().getValue(), experimentalOptions.getMigrateSessionsOnNetworkChangeV2Option().getValue(), experimentalOptions.getMigrateSessionsEarlyV2().getValue(), experimentalOptions.getDisableBidirectionalStreamsOption().getValue(), experimentalOptions.getMaxTimeBeforeCryptoHandshakeSecondsOption(), experimentalOptions.getMaxIdleTimeBeforeCryptoHandshakeSecondsOption(), experimentalOptions.getEnableSocketRecvOptimizationOption().getValue(), experimentalOptions.getAsyncDnsEnableOption().getValue(), experimentalOptions.getStaleDnsEnableOption().getValue(), experimentalOptions.getStaleDnsDelayMillisOption(), experimentalOptions.getStaleDnsMaxExpiredTimeMillisOption(), experimentalOptions.getStaleDnsMaxStaleUsesOption(), experimentalOptions.getStaleDnsAllowOtherNetworkOption().getValue(), experimentalOptions.getStaleDnsPersistToDiskOption().getValue(), experimentalOptions.getStaleDnsPersistDelayMillisOption(), experimentalOptions.getStaleDnsUseStaleOnNameNotResolvedOption().getValue(), experimentalOptions.getDisableIpv6OnWifiOption().getValue(), cronetEngineBuilderInfo.getCronetInitializationRef(), android.os.Process.myUid());
                if (scoped != null) {
                    scoped.close();
                }
            } finally {
            }
        } catch (java.lang.Exception e) {
            if (android.util.Log.isLoggable(getHighSpeedVideoSizes, 3)) {
                new java.lang.Object[]{java.lang.Long.valueOf(j), e.getMessage()};
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010b A[Catch: Exception -> 0x011d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x011d, blocks: (B:3:0x0001, B:20:0x010b, B:43:0x011c, B:42:0x0119, B:37:0x0113, B:5:0x0007, B:10:0x006c, B:14:0x00b4, B:18:0x00ce), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeCronetTrafficReported(long j, org.chromium.net.impl.CronetLogger.CronetTrafficInfo cronetTrafficInfo, int i) {
        int i2;
        int i3;
        try {
            org.chromium.base.metrics.ScopedSysTraceEvent scoped = org.chromium.base.metrics.ScopedSysTraceEvent.scoped("CronetLoggerImpl#writeCronetTrafficReported");
            try {
                int calcRequestHeadersSizeBucket = org.chromium.net.telemetry.SizeBuckets.calcRequestHeadersSizeBucket(cronetTrafficInfo.getRequestHeaderSizeInBytes());
                int calcRequestBodySizeBucket = org.chromium.net.telemetry.SizeBuckets.calcRequestBodySizeBucket(cronetTrafficInfo.getRequestBodySizeInBytes());
                int calcResponseHeadersSizeBucket = org.chromium.net.telemetry.SizeBuckets.calcResponseHeadersSizeBucket(cronetTrafficInfo.getResponseHeaderSizeInBytes());
                int calcResponseBodySizeBucket = org.chromium.net.telemetry.SizeBuckets.calcResponseBodySizeBucket(cronetTrafficInfo.getResponseBodySizeInBytes());
                int responseStatusCode = cronetTrafficInfo.getResponseStatusCode();
                long hash = org.chromium.net.telemetry.Hash.hash(cronetTrafficInfo.getNegotiatedProtocol());
                int millis = (int) cronetTrafficInfo.getHeadersLatency().toMillis();
                int millis2 = (int) cronetTrafficInfo.getTotalLatency().toMillis();
                boolean wasConnectionMigrationAttempted = cronetTrafficInfo.wasConnectionMigrationAttempted();
                boolean didConnectionMigrationSucceed = cronetTrafficInfo.didConnectionMigrationSucceed();
                int i4 = org.chromium.net.telemetry.CronetLoggerImpl.AnonymousClass1.getHighSpeedVideoFpsRanges[cronetTrafficInfo.getTerminalState().ordinal()];
                if (i4 == 1) {
                    i2 = 1;
                } else if (i4 == 2) {
                    i2 = 2;
                } else {
                    if (i4 != 3) {
                        i3 = 0;
                        int nonfinalUserCallbackExceptionCount = cronetTrafficInfo.getNonfinalUserCallbackExceptionCount();
                        int readCount = cronetTrafficInfo.getReadCount();
                        int onUploadReadCount = cronetTrafficInfo.getOnUploadReadCount();
                        int value = org.chromium.net.telemetry.OptionalBoolean.fromBoolean(java.lang.Boolean.valueOf(cronetTrafficInfo.getIsBidiStream())).getValue();
                        int value2 = org.chromium.net.telemetry.OptionalBoolean.fromBoolean(java.lang.Boolean.valueOf(cronetTrafficInfo.getFinalUserCallbackThrew())).getValue();
                        int uid = cronetTrafficInfo.getUid();
                        int networkInternalErrorCode = cronetTrafficInfo.getNetworkInternalErrorCode();
                        int quicErrorCode = cronetTrafficInfo.getQuicErrorCode();
                        int connectionCloseSource = cronetTrafficInfo.getConnectionCloseSource();
                        int i5 = connectionCloseSource == 1 ? connectionCloseSource != 2 ? 0 : 1 : 2;
                        int i6 = org.chromium.net.telemetry.CronetLoggerImpl.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[cronetTrafficInfo.getFailureReason().ordinal()];
                        org.chromium.net.telemetry.CronetStatsLog.write(704, j, calcRequestHeadersSizeBucket, calcRequestBodySizeBucket, calcResponseHeadersSizeBucket, calcResponseBodySizeBucket, responseStatusCode, hash, millis, millis2, wasConnectionMigrationAttempted, didConnectionMigrationSucceed, i, i3, nonfinalUserCallbackExceptionCount, -1L, -1L, readCount, onUploadReadCount, value, value2, uid, networkInternalErrorCode, quicErrorCode, i5, i6 == 1 ? i6 != 2 ? 0 : 100 : 1, org.chromium.net.telemetry.OptionalBoolean.fromBoolean(java.lang.Boolean.valueOf(cronetTrafficInfo.getIsSocketReused())).getValue(), cronetTrafficInfo.getCronetVersion(), getHighSpeedVideoFpsRangesFor(cronetTrafficInfo.getCronetSource()), cronetTrafficInfo.getTimeToEstablishDNSMillis(), cronetTrafficInfo.getTimeToEstablishSSLMillis(), cronetTrafficInfo.getTimeToConnectMillis(), cronetTrafficInfo.getTimeToSendFirstByteMillis());
                        if (scoped == null) {
                            scoped.close();
                            return;
                        }
                        return;
                    }
                    i2 = 3;
                }
                i3 = i2;
                int nonfinalUserCallbackExceptionCount2 = cronetTrafficInfo.getNonfinalUserCallbackExceptionCount();
                int readCount2 = cronetTrafficInfo.getReadCount();
                int onUploadReadCount2 = cronetTrafficInfo.getOnUploadReadCount();
                int value3 = org.chromium.net.telemetry.OptionalBoolean.fromBoolean(java.lang.Boolean.valueOf(cronetTrafficInfo.getIsBidiStream())).getValue();
                int value22 = org.chromium.net.telemetry.OptionalBoolean.fromBoolean(java.lang.Boolean.valueOf(cronetTrafficInfo.getFinalUserCallbackThrew())).getValue();
                int uid2 = cronetTrafficInfo.getUid();
                int networkInternalErrorCode2 = cronetTrafficInfo.getNetworkInternalErrorCode();
                int quicErrorCode2 = cronetTrafficInfo.getQuicErrorCode();
                int connectionCloseSource2 = cronetTrafficInfo.getConnectionCloseSource();
                if (connectionCloseSource2 == 1) {
                }
                int i62 = org.chromium.net.telemetry.CronetLoggerImpl.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[cronetTrafficInfo.getFailureReason().ordinal()];
                org.chromium.net.telemetry.CronetStatsLog.write(704, j, calcRequestHeadersSizeBucket, calcRequestBodySizeBucket, calcResponseHeadersSizeBucket, calcResponseBodySizeBucket, responseStatusCode, hash, millis, millis2, wasConnectionMigrationAttempted, didConnectionMigrationSucceed, i, i3, nonfinalUserCallbackExceptionCount2, -1L, -1L, readCount2, onUploadReadCount2, value3, value22, uid2, networkInternalErrorCode2, quicErrorCode2, i5, i62 == 1 ? i62 != 2 ? 0 : 100 : 1, org.chromium.net.telemetry.OptionalBoolean.fromBoolean(java.lang.Boolean.valueOf(cronetTrafficInfo.getIsSocketReused())).getValue(), cronetTrafficInfo.getCronetVersion(), getHighSpeedVideoFpsRangesFor(cronetTrafficInfo.getCronetSource()), cronetTrafficInfo.getTimeToEstablishDNSMillis(), cronetTrafficInfo.getTimeToEstablishSSLMillis(), cronetTrafficInfo.getTimeToConnectMillis(), cronetTrafficInfo.getTimeToSendFirstByteMillis());
                if (scoped == null) {
                }
            } finally {
            }
        } catch (java.lang.Exception e) {
            this.Camera2StreamConfigurationMap.addAndGet(i);
            if (android.util.Log.isLoggable(getHighSpeedVideoSizes, 3)) {
                new java.lang.Object[]{java.lang.Long.valueOf(j), e.getMessage()};
            }
        }
    }

    /* renamed from: org.chromium.net.telemetry.CronetLoggerImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[org.chromium.net.impl.CronetLogger.CronetSource.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_STATICALLY_LINKED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_FALLBACK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLATFORM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestTerminalState.values().length];
            getHighSpeedVideoFpsRanges = iArr2;
            try {
                iArr2[org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestTerminalState.SUCCEEDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestTerminalState.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestTerminalState.CANCELLED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[org.chromium.net.impl.CronetLogger.CronetEngineBuilderInitializedInfo.Author.values().length];
            Camera2StreamConfigurationMap = iArr3;
            try {
                iArr3[org.chromium.net.impl.CronetLogger.CronetEngineBuilderInitializedInfo.Author.API.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                Camera2StreamConfigurationMap[org.chromium.net.impl.CronetLogger.CronetEngineBuilderInitializedInfo.Author.IMPL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestFailureReason.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr4;
            try {
                iArr4[org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestFailureReason.NETWORK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.chromium.net.impl.CronetLogger.CronetTrafficInfo.RequestFailureReason.OTHER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    private static int getHighSpeedVideoFpsRangesFor(org.chromium.net.impl.CronetLogger.CronetSource cronetSource) {
        int i = org.chromium.net.telemetry.CronetLoggerImpl.AnonymousClass1.getHighSpeedVideoFpsRangesFor[cronetSource.ordinal()];
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
}
