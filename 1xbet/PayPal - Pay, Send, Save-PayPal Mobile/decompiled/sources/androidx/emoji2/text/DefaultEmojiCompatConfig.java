package androidx.emoji2.text;

/* loaded from: classes7.dex */
public final class DefaultEmojiCompatConfig {
    private DefaultEmojiCompatConfig() {
    }

    public static androidx.emoji2.text.FontRequestEmojiCompatConfig create(android.content.Context context) {
        return (androidx.emoji2.text.FontRequestEmojiCompatConfig) new androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory(null).create(context);
    }

    public static class DefaultEmojiCompatConfigFactory {
        private final androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper getHighSpeedVideoSizes;

        public DefaultEmojiCompatConfigFactory(androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper defaultEmojiCompatConfigHelper) {
            this.getHighSpeedVideoSizes = defaultEmojiCompatConfigHelper == null ? getHighSpeedVideoFpsRanges() : defaultEmojiCompatConfigHelper;
        }

        public androidx.emoji2.text.EmojiCompat.Config create(android.content.Context context) {
            return getHighSpeedVideoSizes(context, getHighResolutionOutputSizeshNQ4ISI(context));
        }

        private androidx.emoji2.text.EmojiCompat.Config getHighSpeedVideoSizes(android.content.Context context, androidx.core.provider.FontRequest fontRequest) {
            if (fontRequest == null) {
                return null;
            }
            return new androidx.emoji2.text.FontRequestEmojiCompatConfig(context, fontRequest);
        }

        androidx.core.provider.FontRequest getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            androidx.core.util.Preconditions.checkNotNull(packageManager, "Package manager required to locate emoji font provider");
            android.content.pm.ProviderInfo highSpeedVideoSizes = getHighSpeedVideoSizes(packageManager);
            if (highSpeedVideoSizes == null) {
                return null;
            }
            try {
                return getHighSpeedVideoSizes(highSpeedVideoSizes, packageManager);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }

        private android.content.pm.ProviderInfo getHighSpeedVideoSizes(android.content.pm.PackageManager packageManager) {
            java.util.Iterator<android.content.pm.ResolveInfo> it = this.getHighSpeedVideoSizes.queryIntentContentProviders(packageManager, new android.content.Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                android.content.pm.ProviderInfo providerInfo = this.getHighSpeedVideoSizes.getProviderInfo(it.next());
                if (Camera2StreamConfigurationMap(providerInfo)) {
                    return providerInfo;
                }
            }
            return null;
        }

        private boolean Camera2StreamConfigurationMap(android.content.pm.ProviderInfo providerInfo) {
            return (providerInfo == null || providerInfo.applicationInfo == null || (providerInfo.applicationInfo.flags & 1) != 1) ? false : true;
        }

        private androidx.core.provider.FontRequest getHighSpeedVideoSizes(android.content.pm.ProviderInfo providerInfo, android.content.pm.PackageManager packageManager) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String str = providerInfo.authority;
            java.lang.String str2 = providerInfo.packageName;
            return new androidx.core.provider.FontRequest(str, str2, "emojicompat-emoji-font", getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes.getSigningSignatures(packageManager, str2)));
        }

        private java.util.List<java.util.List<byte[]>> getHighSpeedVideoFpsRangesFor(android.content.pm.Signature[] signatureArr) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.content.pm.Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return java.util.Collections.singletonList(arrayList);
        }

        private static androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper getHighSpeedVideoFpsRanges() {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return new androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper_API28();
            }
            return new androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper_API19();
        }
    }

    public static class DefaultEmojiCompatConfigHelper {
        public android.content.pm.Signature[] getSigningSignatures(android.content.pm.PackageManager packageManager, java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public java.util.List<android.content.pm.ResolveInfo> queryIntentContentProviders(android.content.pm.PackageManager packageManager, android.content.Intent intent, int i) {
            return java.util.Collections.emptyList();
        }

        public android.content.pm.ProviderInfo getProviderInfo(android.content.pm.ResolveInfo resolveInfo) {
            throw new java.lang.IllegalStateException("Unable to get provider info prior to API 19");
        }
    }

    public static class DefaultEmojiCompatConfigHelper_API19 extends androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public java.util.List<android.content.pm.ResolveInfo> queryIntentContentProviders(android.content.pm.PackageManager packageManager, android.content.Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public android.content.pm.ProviderInfo getProviderInfo(android.content.pm.ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }
    }

    public static class DefaultEmojiCompatConfigHelper_API28 extends androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper_API19 {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public android.content.pm.Signature[] getSigningSignatures(android.content.pm.PackageManager packageManager, java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }
}
