package com.adobe.marketing.mobile.services;

/* loaded from: classes3.dex */
class DeviceInfoService implements com.adobe.marketing.mobile.services.DeviceInforming {
    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public boolean registerOneTimeNetworkConnectionActiveListener(com.adobe.marketing.mobile.services.DeviceInforming.NetworkConnectionActiveListener networkConnectionActiveListener) {
        return false;
    }

    DeviceInfoService() {
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.util.Locale getSystemLocale() {
        android.content.res.Configuration configuration;
        android.content.res.Resources system = android.content.res.Resources.getSystem();
        if (system == null || (configuration = system.getConfiguration()) == null) {
            return null;
        }
        return configuration.getLocales().get(0);
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getCanonicalPlatformName() {
        return com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getOperatingSystemName() {
        return "Android";
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getOperatingSystemVersion() {
        return android.os.Build.VERSION.RELEASE;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getDeviceBrand() {
        return android.os.Build.BRAND;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getDeviceManufacturer() {
        return android.os.Build.MANUFACTURER;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getDeviceName() {
        return android.os.Build.MODEL;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getDevice() {
        return android.os.Build.DEVICE;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getDeviceBuildId() {
        return android.os.Build.ID;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public com.adobe.marketing.mobile.services.DeviceInforming.ConnectionStatus getNetworkConnectionStatus() {
        android.net.ConnectivityManager connectivityManager = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getConnectivityManager();
        if (connectivityManager == null) {
            return com.adobe.marketing.mobile.services.DeviceInforming.ConnectionStatus.UNKNOWN;
        }
        if (com.adobe.marketing.mobile.internal.util.NetworkUtils.isInternetAvailable(connectivityManager)) {
            return com.adobe.marketing.mobile.services.DeviceInforming.ConnectionStatus.CONNECTED;
        }
        return com.adobe.marketing.mobile.services.DeviceInforming.ConnectionStatus.DISCONNECTED;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getRunMode() {
        return "Application";
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getDefaultUserAgent() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getOperatingSystemName());
        sb.append(" ");
        sb.append(getOperatingSystemVersion());
        java.lang.String obj = sb.toString();
        java.lang.String str2 = "unknown";
        if (obj == null || obj.trim().isEmpty()) {
            obj = "unknown";
        }
        java.lang.String localeString = getLocaleString();
        if (localeString == null || localeString.trim().isEmpty()) {
            localeString = "unknown";
        }
        java.lang.String deviceName = getDeviceName();
        if (deviceName == null || deviceName.trim().isEmpty()) {
            str = "unknown";
        } else {
            str = getDeviceName();
        }
        java.lang.String deviceBuildId = getDeviceBuildId();
        if (deviceBuildId != null && !deviceBuildId.trim().isEmpty()) {
            str2 = getDeviceBuildId();
        }
        return java.lang.String.format("Mozilla/5.0 (Linux; U; %s; %s; %s Build/%s)", obj, localeString, str, str2);
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getApplicationVersion() {
        android.content.pm.PackageInfo highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor != null) {
            return highSpeedVideoFpsRangesFor.versionName;
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getApplicationVersionCode() {
        int i;
        android.content.pm.PackageInfo highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor == null) {
            return null;
        }
        java.util.Locale locale = java.util.Locale.US;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            i = 0;
            try {
                i = (int) ((java.lang.Long) highSpeedVideoFpsRangesFor.getClass().getDeclaredMethod("getLongVersionCode", new java.lang.Class[0]).invoke(highSpeedVideoFpsRangesFor, new java.lang.Object[0])).longValue();
            } catch (java.lang.Exception e) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DeviceInfoService", java.lang.String.format("Failed to get app version code, (%s)", e), new java.lang.Object[0]);
            }
        } else {
            i = highSpeedVideoFpsRangesFor.versionCode;
        }
        if (i > 0) {
            return java.lang.String.format(locale, com.google.android.material.timepicker.TimeModel.NUMBER_FORMAT, java.lang.Integer.valueOf(i));
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getLocaleString() {
        java.util.Locale activeLocale = getActiveLocale();
        if (activeLocale == null) {
            activeLocale = java.util.Locale.US;
        }
        java.lang.String language = activeLocale.getLanguage();
        java.lang.String country = activeLocale.getCountry();
        if (country.isEmpty()) {
            return language;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(language);
        sb.append("-");
        sb.append(country);
        return sb.toString();
    }

    private static android.content.pm.PackageInfo getHighSpeedVideoFpsRangesFor() {
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getPackageInfo(applicationContext.getPackageName(), 0);
        } catch (java.lang.Exception e) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DeviceInfoService", java.lang.String.format("PackageManager couldn't find application version (%s)", e.getLocalizedMessage()), new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.util.Locale getActiveLocale() {
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null || (resources = applicationContext.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return null;
        }
        return configuration.getLocales().get(0);
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.io.File getApplicationBaseDir() {
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null || applicationContext.getApplicationInfo() == null) {
            return null;
        }
        return new java.io.File(applicationContext.getApplicationInfo().dataDir);
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.io.File getApplicationCacheDir() {
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getCacheDir();
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getApplicationName() {
        android.content.pm.ApplicationInfo applicationInfo;
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 0)) == null) {
                return null;
            }
            return (java.lang.String) packageManager.getApplicationLabel(applicationInfo);
        } catch (java.lang.Exception e) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DeviceInfoService", java.lang.String.format("PackageManager couldn't find application name (%s)", e), new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getApplicationPackageName() {
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getPackageName();
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.io.InputStream getAsset(java.lang.String str) {
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (str != null && !str.trim().isEmpty() && applicationContext != null) {
            android.content.res.Resources resources = applicationContext.getResources();
            if (resources == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DeviceInfoService", java.lang.String.format("%s (Resources), unable to read (%s) from the the assets folder.", com.adobe.marketing.mobile.services.Log.UNEXPECTED_NULL_VALUE, str), new java.lang.Object[0]);
                return null;
            }
            android.content.res.AssetManager assets = resources.getAssets();
            if (assets == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DeviceInfoService", java.lang.String.format("%s (AssetManager), unable to read (%s) from the the assets folder.", com.adobe.marketing.mobile.services.Log.UNEXPECTED_NULL_VALUE, str), new java.lang.Object[0]);
                return null;
            }
            try {
                return assets.open(str);
            } catch (java.io.IOException e) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DeviceInfoService", java.lang.String.format("Unable to read (%s) from the the assets folder. (%s)", str, e), new java.lang.Object[0]);
            }
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public int getCurrentOrientation() {
        android.app.Activity currentActivity = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getCurrentActivity();
        if (currentActivity == null) {
            return 0;
        }
        return currentActivity.getResources().getConfiguration().orientation;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public com.adobe.marketing.mobile.services.DeviceInforming.DeviceType getDeviceType() {
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null) {
            return com.adobe.marketing.mobile.services.DeviceInforming.DeviceType.UNKNOWN;
        }
        android.content.res.Resources resources = applicationContext.getResources();
        if (resources == null) {
            return com.adobe.marketing.mobile.services.DeviceInforming.DeviceType.UNKNOWN;
        }
        if ((resources.getConfiguration().uiMode & 15) == 6) {
            return com.adobe.marketing.mobile.services.DeviceInforming.DeviceType.WATCH;
        }
        android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f = displayMetrics.heightPixels / displayMetrics.ydpi;
        float f2 = displayMetrics.widthPixels / displayMetrics.xdpi;
        if (java.lang.Math.sqrt((f2 * f2) + (f * f)) >= 6.5d) {
            return com.adobe.marketing.mobile.services.DeviceInforming.DeviceType.TABLET;
        }
        return com.adobe.marketing.mobile.services.DeviceInforming.DeviceType.PHONE;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getDeviceUniqueId() {
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return android.provider.Settings.Secure.getString(applicationContext.getContentResolver(), a.b.l);
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public com.adobe.marketing.mobile.services.DeviceInforming.DisplayInformation getDisplayInformation() {
        android.content.res.Resources resources;
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null || (resources = applicationContext.getResources()) == null) {
            return null;
        }
        return new com.adobe.marketing.mobile.services.DisplayInfoService(resources.getDisplayMetrics());
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getMobileCarrierName() {
        android.telephony.TelephonyManager telephonyManager;
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null || (telephonyManager = (android.telephony.TelephonyManager) applicationContext.getSystemService("phone")) == null) {
            return null;
        }
        return telephonyManager.getNetworkOperatorName();
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public java.lang.String getPropertyFromManifest(java.lang.String str) {
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (str != null && !str.trim().isEmpty() && applicationContext != null) {
            android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DeviceInfoService", java.lang.String.format("%s (Package Manager), unable to read property for key (%s).", com.adobe.marketing.mobile.services.Log.UNEXPECTED_NULL_VALUE, str), new java.lang.Object[0]);
                return null;
            }
            try {
                android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo == null) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DeviceInfoService", java.lang.String.format("%s (Application info), unable to read property for key (%s).", com.adobe.marketing.mobile.services.Log.UNEXPECTED_NULL_VALUE, str), new java.lang.Object[0]);
                    return null;
                }
                android.os.Bundle bundle = applicationInfo.metaData;
                if (bundle == null) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DeviceInfoService", java.lang.String.format("%s (ApplicationInfo's metaData), unable to read property for key (%s).", com.adobe.marketing.mobile.services.Log.UNEXPECTED_NULL_VALUE, str), new java.lang.Object[0]);
                    return null;
                }
                return bundle.getString(str);
            } catch (java.lang.Exception e) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DeviceInfoService", java.lang.String.format("Unable to read property for key (%s). Exception - (%s)", str, e), new java.lang.Object[0]);
            }
        }
        return null;
    }
}
