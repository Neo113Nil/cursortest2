package androidx.core.provider;

/* loaded from: classes3.dex */
class FontProvider {
    private static final androidx.collection.LruCache<androidx.core.provider.FontProvider.ProviderCacheKey, android.content.pm.ProviderInfo> getHighSpeedVideoSizes = new androidx.collection.LruCache<>(2);
    private static final java.util.Comparator<byte[]> getHighSpeedVideoFpsRanges = new java.util.Comparator() { // from class: androidx.core.provider.FontProvider$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.core.provider.FontProvider.getHighSpeedVideoFpsRanges((byte[]) obj, (byte[]) obj2);
        }
    };

    private FontProvider() {
    }

    static androidx.core.provider.FontsContractCompat.FontFamilyResult Camera2StreamConfigurationMap(android.content.Context context, java.util.List<androidx.core.provider.FontRequest> list, android.os.CancellationSignal cancellationSignal) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String systemFont;
        android.graphics.Typeface systemFontFamily;
        androidx.tracing.Trace.beginSection("FontProvider.getFontFamilyResult");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < list.size(); i++) {
                androidx.core.provider.FontRequest fontRequest = list.get(i);
                if (android.os.Build.VERSION.SDK_INT >= 31 && (systemFontFamily = androidx.core.graphics.TypefaceCompat.getSystemFontFamily((systemFont = fontRequest.getSystemFont()))) != null && androidx.core.graphics.TypefaceCompat.guessPrimaryFont(systemFontFamily) != null) {
                    arrayList.add(new androidx.core.provider.FontsContractCompat.FontInfo[]{new androidx.core.provider.FontsContractCompat.FontInfo(systemFont, fontRequest.getVariationSettings())});
                } else {
                    android.content.pm.ProviderInfo Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(context.getPackageManager(), fontRequest, context.getResources());
                    if (Camera2StreamConfigurationMap == null) {
                        return androidx.core.provider.FontsContractCompat.FontFamilyResult.getHighSpeedVideoFpsRanges(1, null);
                    }
                    arrayList.add(getHighSpeedVideoFpsRanges(context, fontRequest, Camera2StreamConfigurationMap.authority, cancellationSignal));
                }
            }
            return androidx.core.provider.FontsContractCompat.FontFamilyResult.getHighSpeedVideoSizes(0, arrayList);
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    static class ProviderCacheKey {
        java.util.List<java.util.List<byte[]>> Camera2StreamConfigurationMap;
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRangesFor;

        ProviderCacheKey(java.lang.String str, java.lang.String str2, java.util.List<java.util.List<byte[]>> list) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighResolutionOutputSizeshNQ4ISI = str2;
            this.Camera2StreamConfigurationMap = list;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.core.provider.FontProvider.ProviderCacheKey)) {
                return false;
            }
            androidx.core.provider.FontProvider.ProviderCacheKey providerCacheKey = (androidx.core.provider.FontProvider.ProviderCacheKey) obj;
            return java.util.Objects.equals(this.getHighSpeedVideoFpsRangesFor, providerCacheKey.getHighSpeedVideoFpsRangesFor) && java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI, providerCacheKey.getHighResolutionOutputSizeshNQ4ISI) && java.util.Objects.equals(this.Camera2StreamConfigurationMap, providerCacheKey.Camera2StreamConfigurationMap);
        }

        public int hashCode() {
            return java.util.Objects.hash(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        }
    }

    static android.content.pm.ProviderInfo Camera2StreamConfigurationMap(android.content.pm.PackageManager packageManager, androidx.core.provider.FontRequest fontRequest, android.content.res.Resources resources) throws android.content.pm.PackageManager.NameNotFoundException {
        java.util.List<java.util.List<byte[]>> readCerts;
        androidx.tracing.Trace.beginSection("FontProvider.getProvider");
        try {
            if (fontRequest.getCertificates() != null) {
                readCerts = fontRequest.getCertificates();
            } else {
                readCerts = androidx.core.content.res.FontResourcesParserCompat.readCerts(resources, fontRequest.getCertificatesArrayResId());
            }
            androidx.core.provider.FontProvider.ProviderCacheKey providerCacheKey = new androidx.core.provider.FontProvider.ProviderCacheKey(fontRequest.getProviderAuthority(), fontRequest.getProviderPackage(), readCerts);
            android.content.pm.ProviderInfo providerInfo = getHighSpeedVideoSizes.get(providerCacheKey);
            if (providerInfo != null) {
                return providerInfo;
            }
            java.lang.String providerAuthority = fontRequest.getProviderAuthority();
            android.content.pm.ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
            if (resolveContentProvider == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("No package found for authority: ");
                sb.append(providerAuthority);
                throw new android.content.pm.PackageManager.NameNotFoundException(sb.toString());
            }
            if (!resolveContentProvider.packageName.equals(fontRequest.getProviderPackage())) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Found content provider ");
                sb2.append(providerAuthority);
                sb2.append(", but package was not ");
                sb2.append(fontRequest.getProviderPackage());
                throw new android.content.pm.PackageManager.NameNotFoundException(sb2.toString());
            }
            android.content.pm.Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.content.pm.Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            java.util.Collections.sort(arrayList, getHighSpeedVideoFpsRanges);
            for (int i = 0; i < readCerts.size(); i++) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(readCerts.get(i));
                java.util.Collections.sort(arrayList2, getHighSpeedVideoFpsRanges);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!java.util.Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    getHighSpeedVideoSizes.put(providerCacheKey, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            androidx.tracing.Trace.endSection();
            return null;
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    private static androidx.core.provider.FontsContractCompat.FontInfo[] getHighSpeedVideoFpsRanges(android.content.Context context, androidx.core.provider.FontRequest fontRequest, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        android.database.Cursor cursor;
        java.util.ArrayList arrayList;
        android.net.Uri withAppendedId;
        androidx.tracing.Trace.beginSection("FontProvider.query");
        try {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.net.Uri build = new android.net.Uri.Builder().scheme("content").authority(str).build();
            android.net.Uri build2 = new android.net.Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            androidx.core.provider.FontProvider.ContentQueryWrapper highResolutionOutputSizeshNQ4ISI = androidx.core.provider.FontProvider.ContentQueryWrapper.getHighResolutionOutputSizeshNQ4ISI(context, build);
            try {
                java.lang.String[] strArr = {"_id", androidx.core.provider.FontsContractCompat.Columns.FILE_ID, androidx.core.provider.FontsContractCompat.Columns.TTC_INDEX, androidx.core.provider.FontsContractCompat.Columns.VARIATION_SETTINGS, androidx.core.provider.FontsContractCompat.Columns.WEIGHT, androidx.core.provider.FontsContractCompat.Columns.ITALIC, androidx.core.provider.FontsContractCompat.Columns.RESULT_CODE};
                androidx.tracing.Trace.beginSection("ContentQueryWrapper.query");
                try {
                    cursor = highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(build, strArr, "query = ?", new java.lang.String[]{fontRequest.getQuery()}, null, cancellationSignal);
                    try {
                        if (cursor == null || cursor.getCount() <= 0) {
                            arrayList = arrayList2;
                        } else {
                            int columnIndex = cursor.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.RESULT_CODE);
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            int columnIndex2 = cursor.getColumnIndex("_id");
                            int columnIndex3 = cursor.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.FILE_ID);
                            int columnIndex4 = cursor.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.TTC_INDEX);
                            int columnIndex5 = cursor.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.WEIGHT);
                            int columnIndex6 = cursor.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.ITALIC);
                            while (cursor.moveToNext()) {
                                int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                                int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    withAppendedId = android.content.ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                                } else {
                                    withAppendedId = android.content.ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                }
                                arrayList3.add(new androidx.core.provider.FontsContractCompat.FontInfo(withAppendedId, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, fontRequest.getVariationSettings(), i));
                            }
                            arrayList = arrayList3;
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
                        return (androidx.core.provider.FontsContractCompat.FontInfo[]) arrayList.toArray(new androidx.core.provider.FontsContractCompat.FontInfo[0]);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
                        throw th;
                    }
                } finally {
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                cursor = null;
            }
        } finally {
        }
    }

    static /* synthetic */ int getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    interface ContentQueryWrapper {
        android.database.Cursor Camera2StreamConfigurationMap(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, android.os.CancellationSignal cancellationSignal);

        void Camera2StreamConfigurationMap();

        static androidx.core.provider.FontProvider.ContentQueryWrapper getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, android.net.Uri uri) {
            return new androidx.core.provider.FontProvider.ContentQueryWrapperApi24Impl(context, uri);
        }
    }

    /* loaded from: classes7.dex */
    static class ContentQueryWrapperApi16Impl implements androidx.core.provider.FontProvider.ContentQueryWrapper {
        private final android.content.ContentProviderClient getHighSpeedVideoFpsRangesFor;

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public android.database.Cursor Camera2StreamConfigurationMap(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, android.os.CancellationSignal cancellationSignal) {
            android.content.ContentProviderClient contentProviderClient = this.getHighSpeedVideoFpsRangesFor;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (android.os.RemoteException unused) {
                return null;
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void Camera2StreamConfigurationMap() {
            android.content.ContentProviderClient contentProviderClient = this.getHighSpeedVideoFpsRangesFor;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    static class ContentQueryWrapperApi24Impl implements androidx.core.provider.FontProvider.ContentQueryWrapper {
        private final android.content.ContentProviderClient getHighResolutionOutputSizeshNQ4ISI;

        ContentQueryWrapperApi24Impl(android.content.Context context, android.net.Uri uri) {
            this.getHighResolutionOutputSizeshNQ4ISI = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public android.database.Cursor Camera2StreamConfigurationMap(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, android.os.CancellationSignal cancellationSignal) {
            android.content.ContentProviderClient contentProviderClient = this.getHighResolutionOutputSizeshNQ4ISI;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (android.os.RemoteException unused) {
                return null;
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void Camera2StreamConfigurationMap() {
            android.content.ContentProviderClient contentProviderClient = this.getHighResolutionOutputSizeshNQ4ISI;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }
}
