package io.appmetrica.analytics.flutter.utils;

/* loaded from: classes.dex */
public class Converter {
    private static final java.util.Map<io.appmetrica.analytics.flutter.pigeon.Pigeon.GenderPigeon, io.appmetrica.analytics.profile.GenderAttribute.Gender> genderToNative = new java.util.HashMap<io.appmetrica.analytics.flutter.pigeon.Pigeon.GenderPigeon, io.appmetrica.analytics.profile.GenderAttribute.Gender>() { // from class: io.appmetrica.analytics.flutter.utils.Converter.1
        {
            put(io.appmetrica.analytics.flutter.pigeon.Pigeon.GenderPigeon.MALE, io.appmetrica.analytics.profile.GenderAttribute.Gender.MALE);
            put(io.appmetrica.analytics.flutter.pigeon.Pigeon.GenderPigeon.FEMALE, io.appmetrica.analytics.profile.GenderAttribute.Gender.FEMALE);
            put(io.appmetrica.analytics.flutter.pigeon.Pigeon.GenderPigeon.OTHER, io.appmetrica.analytics.profile.GenderAttribute.Gender.OTHER);
        }
    };
    private static final java.util.Map<io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon, io.appmetrica.analytics.AdType> adTypeToNative = new java.util.HashMap<io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon, io.appmetrica.analytics.AdType>() { // from class: io.appmetrica.analytics.flutter.utils.Converter.2
        {
            put(io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon.UNKNOWN, null);
            put(io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon.NATIVE, io.appmetrica.analytics.AdType.NATIVE);
            put(io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon.BANNER, io.appmetrica.analytics.AdType.BANNER);
            put(io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon.REWARDED, io.appmetrica.analytics.AdType.REWARDED);
            put(io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon.INTERSTITIAL, io.appmetrica.analytics.AdType.INTERSTITIAL);
            put(io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon.MREC, io.appmetrica.analytics.AdType.MREC);
            put(io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon.APP_OPEN, io.appmetrica.analytics.AdType.APP_OPEN);
            put(io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon.OTHER, io.appmetrica.analytics.AdType.OTHER);
        }
    };

    /* renamed from: io.appmetrica.analytics.flutter.utils.Converter$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error;
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error;
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus;
        static final /* synthetic */ int[] $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType;

        static {
            int[] iArr = new int[io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error.values().length];
            $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error = iArr;
            try {
                iArr[io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error[io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error.PARSE_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error[io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error.NO_REFERRER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[io.appmetrica.analytics.DeferredDeeplinkListener.Error.values().length];
            $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error = iArr2;
            try {
                iArr2[io.appmetrica.analytics.DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error[io.appmetrica.analytics.DeferredDeeplinkListener.Error.PARSE_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error[io.appmetrica.analytics.DeferredDeeplinkListener.Error.NO_REFERRER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[io.appmetrica.analytics.StartupParamsItemStatus.values().length];
            $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus = iArr3;
            try {
                iArr3[io.appmetrica.analytics.StartupParamsItemStatus.OK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[io.appmetrica.analytics.StartupParamsItemStatus.PROVIDER_UNAVAILABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[io.appmetrica.analytics.StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[io.appmetrica.analytics.StartupParamsItemStatus.FEATURE_DISABLED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType.values().length];
            $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType = iArr4;
            try {
                iArr4[io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType.BIRTH_DATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType.BOOLEAN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType.COUNTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType.GENDER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType.NAME.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType.NOTIFICATION_ENABLED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType.NUMBER.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType.STRING.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType.PHONE_HASH.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType.EMAIL_HASH.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType.TELEGRAM_LOGIN_HASH.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
        }
    }

    private static java.util.List<java.lang.String> filterNonNull(java.util.List<java.lang.String> list) {
        if (list == null) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : list) {
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static io.appmetrica.analytics.Revenue toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon revenuePigeon) {
        io.appmetrica.analytics.Revenue.Builder newBuilder = io.appmetrica.analytics.Revenue.newBuilder(new java.math.BigDecimal(revenuePigeon.getPrice()).multiply(new java.math.BigDecimal(1000000)).longValue(), java.util.Currency.getInstance(revenuePigeon.getCurrency()));
        java.lang.String productId = revenuePigeon.getProductId();
        if (productId != null) {
            newBuilder.withProductID(productId);
        }
        java.lang.String payload = revenuePigeon.getPayload();
        if (payload != null) {
            newBuilder.withPayload(payload);
        }
        java.lang.Long quantity = revenuePigeon.getQuantity();
        if (quantity != null) {
            newBuilder.withQuantity(java.lang.Integer.valueOf(quantity.intValue()));
        }
        io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon receipt = revenuePigeon.getReceipt();
        if (receipt != null) {
            io.appmetrica.analytics.Revenue.Receipt.Builder newBuilder2 = io.appmetrica.analytics.Revenue.Receipt.newBuilder();
            java.lang.String data = receipt.getData();
            if (data != null) {
                newBuilder2.withData(data);
            }
            java.lang.String signature = receipt.getSignature();
            if (signature != null) {
                newBuilder2.withSignature(signature);
            }
            newBuilder.withReceipt(newBuilder2.build());
        }
        return newBuilder.build();
    }

    public static io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemStatusPigeon toPigeon(io.appmetrica.analytics.StartupParamsItemStatus startupParamsItemStatus) {
        int i2 = io.appmetrica.analytics.flutter.utils.Converter.AnonymousClass4.$SwitchMap$io$appmetrica$analytics$StartupParamsItemStatus[startupParamsItemStatus.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemStatusPigeon.UNKNOWN_ERROR : io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemStatusPigeon.FEATURE_DISABLED : io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemStatusPigeon.INVALID_VALUE_FROM_PROVIDER : io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemStatusPigeon.PROVIDER_UNAVAILABLE : io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemStatusPigeon.OK;
    }

    public static io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon toPigeon(io.appmetrica.analytics.StartupParamsItem startupParamsItem) {
        return new io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon.Builder().setId(startupParamsItem.getId()).setStatus(toPigeon(startupParamsItem.getStatus())).setErrorDetails(startupParamsItem.getErrorDetails()).build();
    }

    public static io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon toPigeon(io.appmetrica.analytics.StartupParamsCallback.Result result) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, io.appmetrica.analytics.StartupParamsItem> entry : result.parameters.entrySet()) {
            hashMap.put(entry.getKey(), toPigeon(entry.getValue()));
        }
        return new io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon.Builder().setDeviceId(result.deviceId).setDeviceIdHash(result.deviceIdHash).setParameters(hashMap).setUuid(result.uuid).build();
    }

    public static io.appmetrica.analytics.AppMetricaConfig toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon appMetricaConfigPigeon) {
        io.appmetrica.analytics.AppMetricaConfig.Builder newConfigBuilder = io.appmetrica.analytics.AppMetricaConfig.newConfigBuilder(appMetricaConfigPigeon.getApiKey());
        java.lang.Boolean advIdentifiersTracking = appMetricaConfigPigeon.getAdvIdentifiersTracking();
        if (advIdentifiersTracking != null) {
            newConfigBuilder.withAdvIdentifiersTracking(advIdentifiersTracking.booleanValue());
        }
        java.lang.Boolean anrMonitoring = appMetricaConfigPigeon.getAnrMonitoring();
        if (anrMonitoring != null) {
            newConfigBuilder.withAnrMonitoring(anrMonitoring.booleanValue());
        }
        java.lang.Long anrMonitoringTimeout = appMetricaConfigPigeon.getAnrMonitoringTimeout();
        if (anrMonitoringTimeout != null) {
            newConfigBuilder.withAnrMonitoringTimeout(anrMonitoringTimeout.intValue());
        }
        java.lang.Long appBuildNumber = appMetricaConfigPigeon.getAppBuildNumber();
        if (appBuildNumber != null) {
            newConfigBuilder.withAppBuildNumber(appBuildNumber.intValue());
        }
        java.util.Map<java.lang.String, java.lang.String> appEnvironment = appMetricaConfigPigeon.getAppEnvironment();
        if (appEnvironment != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : appEnvironment.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                if (key != null) {
                    newConfigBuilder.withAppEnvironmentValue(key, value);
                }
            }
        }
        java.lang.Boolean appOpenTrackingEnabled = appMetricaConfigPigeon.getAppOpenTrackingEnabled();
        if (appOpenTrackingEnabled != null) {
            newConfigBuilder.withAppOpenTrackingEnabled(appOpenTrackingEnabled.booleanValue());
        }
        java.lang.String appVersion = appMetricaConfigPigeon.getAppVersion();
        if (appVersion != null) {
            newConfigBuilder.withAppVersion(appVersion);
        }
        java.lang.Boolean crashReporting = appMetricaConfigPigeon.getCrashReporting();
        if (crashReporting != null) {
            newConfigBuilder.withCrashReporting(crashReporting.booleanValue());
        }
        java.util.List<java.lang.String> customHosts = appMetricaConfigPigeon.getCustomHosts();
        if (customHosts != null) {
            newConfigBuilder.withCustomHosts(customHosts);
        }
        java.lang.Boolean dataSendingEnabled = appMetricaConfigPigeon.getDataSendingEnabled();
        if (dataSendingEnabled != null) {
            newConfigBuilder.withDataSendingEnabled(dataSendingEnabled.booleanValue());
        }
        java.lang.String deviceType = appMetricaConfigPigeon.getDeviceType();
        if (deviceType != null) {
            newConfigBuilder.withDeviceType(deviceType);
        }
        java.lang.Long dispatchPeriodSeconds = appMetricaConfigPigeon.getDispatchPeriodSeconds();
        if (dispatchPeriodSeconds != null) {
            newConfigBuilder.withDispatchPeriodSeconds(dispatchPeriodSeconds.intValue());
        }
        java.util.Map<java.lang.String, java.lang.String> errorEnvironment = appMetricaConfigPigeon.getErrorEnvironment();
        if (errorEnvironment != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : errorEnvironment.entrySet()) {
                java.lang.String key2 = entry2.getKey();
                java.lang.String value2 = entry2.getValue();
                if (key2 != null) {
                    newConfigBuilder.withErrorEnvironmentValue(key2, value2);
                }
            }
        }
        java.lang.Boolean firstActivationAsUpdate = appMetricaConfigPigeon.getFirstActivationAsUpdate();
        if (firstActivationAsUpdate != null) {
            newConfigBuilder.handleFirstActivationAsUpdate(firstActivationAsUpdate.booleanValue());
        }
        io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon location = appMetricaConfigPigeon.getLocation();
        if (location != null) {
            newConfigBuilder.withLocation(toNative(location));
        }
        java.lang.Boolean locationTracking = appMetricaConfigPigeon.getLocationTracking();
        if (locationTracking != null) {
            newConfigBuilder.withLocationTracking(locationTracking.booleanValue());
        }
        if (appMetricaConfigPigeon.getLogs() != null) {
            newConfigBuilder.withLogs();
        }
        java.lang.Long maxReportsCount = appMetricaConfigPigeon.getMaxReportsCount();
        if (maxReportsCount != null) {
            newConfigBuilder.withMaxReportsCount(maxReportsCount.intValue());
        }
        java.lang.Long maxReportsInDatabaseCount = appMetricaConfigPigeon.getMaxReportsInDatabaseCount();
        if (maxReportsInDatabaseCount != null) {
            newConfigBuilder.withMaxReportsInDatabaseCount(maxReportsInDatabaseCount.intValue());
        }
        java.lang.Boolean nativeCrashReporting = appMetricaConfigPigeon.getNativeCrashReporting();
        if (nativeCrashReporting != null) {
            newConfigBuilder.withNativeCrashReporting(nativeCrashReporting.booleanValue());
        }
        io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon preloadInfo = appMetricaConfigPigeon.getPreloadInfo();
        if (preloadInfo != null) {
            newConfigBuilder.withPreloadInfo(toNative(preloadInfo));
        }
        java.lang.Boolean revenueAutoTrackingEnabled = appMetricaConfigPigeon.getRevenueAutoTrackingEnabled();
        if (revenueAutoTrackingEnabled != null) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(revenueAutoTrackingEnabled.booleanValue());
        }
        java.lang.Long sessionTimeout = appMetricaConfigPigeon.getSessionTimeout();
        if (sessionTimeout != null) {
            newConfigBuilder.withSessionTimeout(sessionTimeout.intValue());
        }
        java.lang.Boolean sessionsAutoTrackingEnabled = appMetricaConfigPigeon.getSessionsAutoTrackingEnabled();
        if (sessionsAutoTrackingEnabled != null) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(sessionsAutoTrackingEnabled.booleanValue());
        }
        java.lang.String userProfileID = appMetricaConfigPigeon.getUserProfileID();
        if (userProfileID != null) {
            newConfigBuilder.withUserProfileID(userProfileID);
        }
        return newConfigBuilder.build();
    }

    public static io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon toPigeon(io.appmetrica.analytics.StartupParamsCallback.Reason reason) {
        return new io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon.Builder().setValue(reason.value).build();
    }

    public static io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon toPigeon(io.appmetrica.analytics.StartupParamsCallback.Result result, io.appmetrica.analytics.StartupParamsCallback.Reason reason) {
        if (reason == null) {
            return new io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon.Builder().setResult(result != null ? toPigeon(result) : null).build();
        }
        return new io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon.Builder().setResult(result != null ? toPigeon(result) : null).setReason(toPigeon(reason)).build();
    }

    public static io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon toPigeon(java.lang.String str, io.appmetrica.analytics.DeferredDeeplinkListener.Error error, java.lang.String str2) {
        io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon;
        java.lang.String str3;
        if (str != null) {
            return new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon.Builder().setDeeplink(str).build();
        }
        if (error != null) {
            int i2 = io.appmetrica.analytics.flutter.utils.Converter.AnonymousClass4.$SwitchMap$io$appmetrica$analytics$DeferredDeeplinkListener$Error[error.ordinal()];
            if (i2 == 1) {
                appMetricaDeferredDeeplinkReasonPigeon = io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.NOT_A_FIRST_LAUNCH;
            } else if (i2 == 2) {
                appMetricaDeferredDeeplinkReasonPigeon = io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.PARSE_ERROR;
            } else if (i2 != 3) {
                appMetricaDeferredDeeplinkReasonPigeon = io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.UNKNOWN;
            } else {
                appMetricaDeferredDeeplinkReasonPigeon = io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.NO_REFERRER;
            }
        } else {
            appMetricaDeferredDeeplinkReasonPigeon = io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.UNKNOWN;
        }
        if (error != null) {
            str3 = error.getDescription();
        } else {
            str3 = "";
        }
        return new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon.Builder().setDeeplink(null).setError(new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon.Builder().setReason(appMetricaDeferredDeeplinkReasonPigeon).setMessage(str2).setErrorDescription(str3).build()).build();
    }

    public static io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon toPigeon(java.util.Map<java.lang.String, java.lang.String> map, io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error error, java.lang.String str) {
        io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon;
        java.lang.String str2;
        if (map != null) {
            return new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon.Builder().setParameters(map).build();
        }
        if (error != null) {
            int i2 = io.appmetrica.analytics.flutter.utils.Converter.AnonymousClass4.$SwitchMap$io$appmetrica$analytics$DeferredDeeplinkParametersListener$Error[error.ordinal()];
            if (i2 == 1) {
                appMetricaDeferredDeeplinkReasonPigeon = io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.NOT_A_FIRST_LAUNCH;
            } else if (i2 == 2) {
                appMetricaDeferredDeeplinkReasonPigeon = io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.PARSE_ERROR;
            } else if (i2 != 3) {
                appMetricaDeferredDeeplinkReasonPigeon = io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.UNKNOWN;
            } else {
                appMetricaDeferredDeeplinkReasonPigeon = io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.NO_REFERRER;
            }
        } else {
            appMetricaDeferredDeeplinkReasonPigeon = io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.UNKNOWN;
        }
        if (error != null) {
            str2 = error.getDescription();
        } else {
            str2 = "";
        }
        return new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon.Builder().setParameters(null).setError(new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon.Builder().setReason(appMetricaDeferredDeeplinkReasonPigeon).setMessage(str).setErrorDescription(str2).build()).build();
    }

    public static io.appmetrica.analytics.AppMetricaLibraryAdapterConfig toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon appMetricaLibraryAdapterConfigPigeon) {
        io.appmetrica.analytics.AppMetricaLibraryAdapterConfig.Builder newConfigBuilder = io.appmetrica.analytics.AppMetricaLibraryAdapterConfig.newConfigBuilder();
        java.lang.Boolean advIdentifiersTracking = appMetricaLibraryAdapterConfigPigeon.getAdvIdentifiersTracking();
        if (advIdentifiersTracking != null) {
            newConfigBuilder.withAdvIdentifiersTracking(advIdentifiersTracking.booleanValue());
        }
        return newConfigBuilder.build();
    }

    public static io.appmetrica.analytics.ReporterConfig toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon reporterConfigPigeon) {
        io.appmetrica.analytics.ReporterConfig.Builder newConfigBuilder = io.appmetrica.analytics.ReporterConfig.newConfigBuilder(reporterConfigPigeon.getApiKey());
        java.util.Map<java.lang.String, java.lang.String> appEnvironment = reporterConfigPigeon.getAppEnvironment();
        if (appEnvironment != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : appEnvironment.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                if (key != null) {
                    newConfigBuilder.withAppEnvironmentValue(key, value);
                }
            }
        }
        java.lang.Boolean dataSendingEnabled = reporterConfigPigeon.getDataSendingEnabled();
        if (dataSendingEnabled != null) {
            newConfigBuilder.withDataSendingEnabled(dataSendingEnabled.booleanValue());
        }
        java.lang.Long dispatchPeriodSeconds = reporterConfigPigeon.getDispatchPeriodSeconds();
        if (dispatchPeriodSeconds != null) {
            newConfigBuilder.withDispatchPeriodSeconds(dispatchPeriodSeconds.intValue());
        }
        if (reporterConfigPigeon.getLogs() != null) {
            newConfigBuilder.withLogs();
        }
        java.lang.Long maxReportsCount = reporterConfigPigeon.getMaxReportsCount();
        if (maxReportsCount != null) {
            newConfigBuilder.withMaxReportsCount(maxReportsCount.intValue());
        }
        java.lang.Long maxReportsInDatabaseCount = reporterConfigPigeon.getMaxReportsInDatabaseCount();
        if (maxReportsInDatabaseCount != null) {
            newConfigBuilder.withMaxReportsInDatabaseCount(maxReportsInDatabaseCount.intValue());
        }
        java.lang.Long sessionTimeout = reporterConfigPigeon.getSessionTimeout();
        if (sessionTimeout != null) {
            newConfigBuilder.withSessionTimeout(sessionTimeout.intValue());
        }
        java.lang.String userProfileID = reporterConfigPigeon.getUserProfileID();
        if (userProfileID != null) {
            newConfigBuilder.withUserProfileID(userProfileID);
        }
        return newConfigBuilder.build();
    }

    public static io.appmetrica.analytics.PreloadInfo toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon preloadInfoPigeon) {
        io.appmetrica.analytics.PreloadInfo.Builder newBuilder = io.appmetrica.analytics.PreloadInfo.newBuilder(preloadInfoPigeon.getTrackingId());
        java.util.Map<java.lang.String, java.lang.String> additionalInfo = preloadInfoPigeon.getAdditionalInfo();
        if (additionalInfo != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : additionalInfo.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                if (key != null) {
                    newBuilder.setAdditionalParams(key, value);
                }
            }
        }
        return newBuilder.build();
    }

    public static android.location.Location toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon locationPigeon) {
        android.location.Location location = new android.location.Location(locationPigeon.getProvider());
        location.setLongitude(locationPigeon.getLongitude().doubleValue());
        location.setLatitude(locationPigeon.getLatitude().doubleValue());
        java.lang.Double altitude = locationPigeon.getAltitude();
        if (altitude != null) {
            location.setAltitude(altitude.doubleValue());
        }
        java.lang.Double course = locationPigeon.getCourse();
        if (course != null) {
            location.setBearing(course.floatValue());
        }
        java.lang.Long timestamp = locationPigeon.getTimestamp();
        if (timestamp != null) {
            location.setTime(timestamp.longValue());
        }
        java.lang.Double accuracy = locationPigeon.getAccuracy();
        if (accuracy != null) {
            location.setAccuracy(accuracy.floatValue());
        }
        java.lang.Double speed = locationPigeon.getSpeed();
        if (speed != null) {
            location.setSpeed(speed.floatValue());
        }
        return location;
    }

    public static io.appmetrica.analytics.profile.UserProfile toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon userProfilePigeon) {
        io.appmetrica.analytics.profile.UserProfile.Builder newBuilder = io.appmetrica.analytics.profile.UserProfile.newBuilder();
        java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon> attributes = userProfilePigeon.getAttributes();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon userProfileAttributePigeon : attributes) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType type = userProfileAttributePigeon.getType();
            if (type != null) {
                int i2 = io.appmetrica.analytics.flutter.utils.Converter.AnonymousClass4.$SwitchMap$io$appmetrica$analytics$flutter$pigeon$Pigeon$UserProfileAttributeType[type.ordinal()];
                double d2 = com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE;
                switch (i2) {
                    case 1:
                        io.appmetrica.analytics.profile.BirthDateAttribute birthDate = io.appmetrica.analytics.profile.Attribute.birthDate();
                        if (java.lang.Boolean.TRUE.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(birthDate.withValueReset());
                            break;
                        } else {
                            java.lang.Long year = userProfileAttributePigeon.getYear();
                            java.lang.Long month = userProfileAttributePigeon.getMonth();
                            java.lang.Long day = userProfileAttributePigeon.getDay();
                            java.lang.Long age = userProfileAttributePigeon.getAge();
                            if (year == null) {
                                if (age != null) {
                                    arrayList.add(birthDate.withAge(age.intValue()));
                                    break;
                                } else {
                                    break;
                                }
                            } else if (month == null) {
                                arrayList.add(birthDate.withBirthDate(year.intValue()));
                                break;
                            } else if (day == null) {
                                arrayList.add(birthDate.withBirthDate(year.intValue(), month.intValue()));
                                break;
                            } else {
                                arrayList.add(birthDate.withBirthDate(year.intValue(), month.intValue(), day.intValue()));
                                break;
                            }
                        }
                    case 2:
                        io.appmetrica.analytics.profile.BooleanAttribute customBoolean = io.appmetrica.analytics.profile.Attribute.customBoolean(userProfileAttributePigeon.getKey());
                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                        if (bool.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(customBoolean.withValueReset());
                            break;
                        } else {
                            java.lang.Boolean boolValue = userProfileAttributePigeon.getBoolValue();
                            boolean booleanValue = boolValue != null ? boolValue.booleanValue() : false;
                            if (bool.equals(userProfileAttributePigeon.getIfUndefined())) {
                                arrayList.add(customBoolean.withValueIfUndefined(booleanValue));
                                break;
                            } else {
                                arrayList.add(customBoolean.withValue(booleanValue));
                                break;
                            }
                        }
                    case 3:
                        io.appmetrica.analytics.profile.CounterAttribute customCounter = io.appmetrica.analytics.profile.Attribute.customCounter(userProfileAttributePigeon.getKey());
                        java.lang.Double doubleValue = userProfileAttributePigeon.getDoubleValue();
                        if (doubleValue != null) {
                            d2 = doubleValue.doubleValue();
                        }
                        arrayList.add(customCounter.withDelta(d2));
                        break;
                    case 4:
                        io.appmetrica.analytics.profile.GenderAttribute gender = io.appmetrica.analytics.profile.Attribute.gender();
                        if (java.lang.Boolean.TRUE.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(gender.withValueReset());
                            break;
                        } else {
                            io.appmetrica.analytics.profile.GenderAttribute.Gender gender2 = genderToNative.get(userProfileAttributePigeon.getGenderValue());
                            if (gender2 == null) {
                                gender2 = io.appmetrica.analytics.profile.GenderAttribute.Gender.OTHER;
                            }
                            arrayList.add(gender.withValue(gender2));
                            break;
                        }
                    case 5:
                        io.appmetrica.analytics.profile.NameAttribute name = io.appmetrica.analytics.profile.Attribute.name();
                        if (java.lang.Boolean.TRUE.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(name.withValueReset());
                            break;
                        } else {
                            java.lang.String stringValue = userProfileAttributePigeon.getStringValue();
                            arrayList.add(name.withValue(stringValue != null ? stringValue : ""));
                            break;
                        }
                    case 6:
                        io.appmetrica.analytics.profile.NotificationsEnabledAttribute notificationsEnabled = io.appmetrica.analytics.profile.Attribute.notificationsEnabled();
                        if (java.lang.Boolean.TRUE.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(notificationsEnabled.withValueReset());
                            break;
                        } else {
                            java.lang.Boolean boolValue2 = userProfileAttributePigeon.getBoolValue();
                            arrayList.add(notificationsEnabled.withValue(boolValue2 != null ? boolValue2.booleanValue() : false));
                            break;
                        }
                    case 7:
                        io.appmetrica.analytics.profile.NumberAttribute customNumber = io.appmetrica.analytics.profile.Attribute.customNumber(userProfileAttributePigeon.getKey());
                        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                        if (bool2.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(customNumber.withValueReset());
                            break;
                        } else {
                            java.lang.Double doubleValue2 = userProfileAttributePigeon.getDoubleValue();
                            if (doubleValue2 != null) {
                                d2 = doubleValue2.doubleValue();
                            }
                            if (bool2.equals(userProfileAttributePigeon.getIfUndefined())) {
                                arrayList.add(customNumber.withValueIfUndefined(d2));
                                break;
                            } else {
                                arrayList.add(customNumber.withValue(d2));
                                break;
                            }
                        }
                    case 8:
                        io.appmetrica.analytics.profile.StringAttribute customString = io.appmetrica.analytics.profile.Attribute.customString(userProfileAttributePigeon.getKey());
                        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                        if (bool3.equals(userProfileAttributePigeon.getReset())) {
                            arrayList.add(customString.withValueReset());
                            break;
                        } else {
                            java.lang.String stringValue2 = userProfileAttributePigeon.getStringValue();
                            java.lang.String str = stringValue2 != null ? stringValue2 : "";
                            if (bool3.equals(userProfileAttributePigeon.getIfUndefined())) {
                                arrayList.add(customString.withValueIfUndefined(str));
                                break;
                            } else {
                                arrayList.add(customString.withValue(str));
                                break;
                            }
                        }
                    case 9:
                        arrayList.add(io.appmetrica.analytics.profile.Attribute.phoneHash().withPhoneValues(filterNonNull(userProfileAttributePigeon.getStringValues())));
                        break;
                    case 10:
                        arrayList.add(io.appmetrica.analytics.profile.Attribute.emailHash().withEmailValues(filterNonNull(userProfileAttributePigeon.getStringValues())));
                        break;
                    case 11:
                        arrayList.add(io.appmetrica.analytics.profile.Attribute.telegramLoginHash().withTelegramLoginValues(filterNonNull(userProfileAttributePigeon.getStringValues())));
                        break;
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> userProfileUpdate = (io.appmetrica.analytics.profile.UserProfileUpdate) it.next();
            if (userProfileUpdate != null) {
                newBuilder.apply(userProfileUpdate);
            }
        }
        return newBuilder.build();
    }

    public static io.appmetrica.analytics.plugins.StackTraceItem toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon stackTraceElementPigeon) {
        return new io.appmetrica.analytics.plugins.StackTraceItem.Builder().withFileName(stackTraceElementPigeon.getFileName()).withClassName(stackTraceElementPigeon.getClassName()).withMethodName(stackTraceElementPigeon.getMethodName()).withLine(java.lang.Integer.valueOf(stackTraceElementPigeon.getLine().intValue())).withColumn(java.lang.Integer.valueOf(stackTraceElementPigeon.getColumn().intValue())).build();
    }

    public static io.appmetrica.analytics.plugins.PluginErrorDetails toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon) {
        io.appmetrica.analytics.plugins.PluginErrorDetails.Builder withVirtualMachineVersion = new io.appmetrica.analytics.plugins.PluginErrorDetails.Builder().withExceptionClass(errorDetailsPigeon.getExceptionClass()).withMessage(errorDetailsPigeon.getMessage()).withPlatform(io.appmetrica.analytics.plugins.PluginErrorDetails.Platform.FLUTTER).withVirtualMachineVersion(errorDetailsPigeon.getDartVersion());
        java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon> backtrace = errorDetailsPigeon.getBacktrace();
        if (backtrace != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon> it = backtrace.iterator();
            while (it.hasNext()) {
                arrayList.add(toNative(it.next()));
            }
            withVirtualMachineVersion.withStacktrace(arrayList);
        }
        return withVirtualMachineVersion.build();
    }

    public static io.appmetrica.analytics.AdRevenue toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon adRevenuePigeon) {
        io.appmetrica.analytics.AdType adType;
        io.appmetrica.analytics.AdRevenue.Builder newBuilder = io.appmetrica.analytics.AdRevenue.newBuilder(new java.math.BigDecimal(adRevenuePigeon.getAdRevenue()), java.util.Currency.getInstance(adRevenuePigeon.getCurrency()));
        io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon adType2 = adRevenuePigeon.getAdType();
        if (adType2 != null && (adType = adTypeToNative.get(adType2)) != null) {
            newBuilder.withAdType(adType);
        }
        java.lang.String adNetwork = adRevenuePigeon.getAdNetwork();
        if (adNetwork != null) {
            newBuilder.withAdNetwork(adNetwork);
        }
        java.lang.String adUnitId = adRevenuePigeon.getAdUnitId();
        if (adUnitId != null) {
            newBuilder.withAdUnitId(adUnitId);
        }
        java.lang.String adUnitName = adRevenuePigeon.getAdUnitName();
        if (adUnitName != null) {
            newBuilder.withAdUnitName(adUnitName);
        }
        java.lang.String adPlacementId = adRevenuePigeon.getAdPlacementId();
        if (adPlacementId != null) {
            newBuilder.withAdPlacementId(adPlacementId);
        }
        java.lang.String adPlacementName = adRevenuePigeon.getAdPlacementName();
        if (adPlacementName != null) {
            newBuilder.withAdPlacementName(adPlacementName);
        }
        java.lang.String precision = adRevenuePigeon.getPrecision();
        if (precision != null) {
            newBuilder.withPrecision(precision);
        }
        java.util.Map<java.lang.String, java.lang.String> payload = adRevenuePigeon.getPayload();
        if (payload != null) {
            newBuilder.withPayload(payload);
        }
        return newBuilder.build();
    }

    public static io.appmetrica.analytics.flutter.utils.FlutterExternalAttribution toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon externalAttributionPigeon) {
        return new io.appmetrica.analytics.flutter.utils.FlutterExternalAttribution(new java.util.HashMap<java.lang.String, java.lang.Integer>() { // from class: io.appmetrica.analytics.flutter.utils.Converter.3
            {
                put("appsflyer", 1);
                put("adjust", 2);
                put("kochava", 3);
                put("tenjin", 4);
                put("airbridge", 5);
                put("singular", 6);
            }
        }.get(externalAttributionPigeon.getSource()).intValue(), new org.json.JSONObject(externalAttributionPigeon.getData()).toString());
    }
}
