package androidx.core.provider;

/* loaded from: classes.dex */
class FontProvider {
    private static final java.util.Comparator<byte[]> sByteArrayComparator = new java.util.Comparator() { // from class: androidx.core.provider.FontProvider$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.core.provider.FontProvider.lambda$static$0((byte[]) obj, (byte[]) obj2);
        }
    };

    private FontProvider() {
    }

    static androidx.core.provider.FontsContractCompat.FontFamilyResult getFontFamilyResult(android.content.Context context, androidx.core.provider.FontRequest fontRequest, android.os.CancellationSignal cancellationSignal) throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.pm.ProviderInfo provider = getProvider(context.getPackageManager(), fontRequest, context.getResources());
        if (provider == null) {
            return androidx.core.provider.FontsContractCompat.FontFamilyResult.create(1, null);
        }
        return androidx.core.provider.FontsContractCompat.FontFamilyResult.create(0, query(context, fontRequest, provider.authority, cancellationSignal));
    }

    static android.content.pm.ProviderInfo getProvider(android.content.pm.PackageManager packageManager, androidx.core.provider.FontRequest fontRequest, android.content.res.Resources resources) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String providerAuthority = fontRequest.getProviderAuthority();
        android.content.pm.ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
        if (resolveContentProvider == null) {
            throw new android.content.pm.PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
        }
        if (!resolveContentProvider.packageName.equals(fontRequest.getProviderPackage())) {
            throw new android.content.pm.PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + fontRequest.getProviderPackage());
        }
        java.util.List<byte[]> convertToByteArrayList = convertToByteArrayList(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        java.util.Collections.sort(convertToByteArrayList, sByteArrayComparator);
        java.util.List<java.util.List<byte[]>> certificates = getCertificates(fontRequest, resources);
        for (int i = 0; i < certificates.size(); i++) {
            java.util.ArrayList arrayList = new java.util.ArrayList(certificates.get(i));
            java.util.Collections.sort(arrayList, sByteArrayComparator);
            if (equalsByteArrayList(convertToByteArrayList, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static androidx.core.provider.FontsContractCompat.FontInfo[] query(android.content.Context context, androidx.core.provider.FontRequest fontRequest, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        java.util.ArrayList arrayList;
        int i;
        android.net.Uri withAppendedId;
        int i2;
        boolean z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.net.Uri build = new android.net.Uri.Builder().scheme("content").authority(str).build();
        android.net.Uri build2 = new android.net.Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        androidx.core.provider.FontProvider.ContentQueryWrapper make = androidx.core.provider.FontProvider.ContentQueryWrapper.CC.make(context, build);
        android.database.Cursor cursor = null;
        try {
            int i3 = 1;
            android.database.Cursor query = make.query(build, new java.lang.String[]{"_id", androidx.core.provider.FontsContractCompat.Columns.FILE_ID, androidx.core.provider.FontsContractCompat.Columns.TTC_INDEX, androidx.core.provider.FontsContractCompat.Columns.VARIATION_SETTINGS, androidx.core.provider.FontsContractCompat.Columns.WEIGHT, androidx.core.provider.FontsContractCompat.Columns.ITALIC, androidx.core.provider.FontsContractCompat.Columns.RESULT_CODE}, "query = ?", new java.lang.String[]{fontRequest.getQuery()}, null, cancellationSignal);
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        int columnIndex = query.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.RESULT_CODE);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        int columnIndex2 = query.getColumnIndex("_id");
                        int columnIndex3 = query.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.FILE_ID);
                        int columnIndex4 = query.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.TTC_INDEX);
                        int columnIndex5 = query.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.WEIGHT);
                        int columnIndex6 = query.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.ITALIC);
                        while (query.moveToNext()) {
                            int i4 = columnIndex != -1 ? query.getInt(columnIndex) : 0;
                            int i5 = columnIndex4 != -1 ? query.getInt(columnIndex4) : 0;
                            if (columnIndex3 == -1) {
                                i = i5;
                                withAppendedId = android.content.ContentUris.withAppendedId(build, query.getLong(columnIndex2));
                            } else {
                                i = i5;
                                withAppendedId = android.content.ContentUris.withAppendedId(build2, query.getLong(columnIndex3));
                            }
                            int i6 = columnIndex5 != -1 ? query.getInt(columnIndex5) : 400;
                            if (columnIndex6 == -1 || query.getInt(columnIndex6) != i3) {
                                i2 = i6;
                                z = false;
                            } else {
                                i2 = i6;
                                z = true;
                            }
                            arrayList3.add(androidx.core.provider.FontsContractCompat.FontInfo.create(withAppendedId, i, i2, z, i4));
                            i3 = 1;
                        }
                        arrayList = arrayList3;
                        if (query != null) {
                            query.close();
                        }
                        make.close();
                        return (androidx.core.provider.FontsContractCompat.FontInfo[]) arrayList.toArray(new androidx.core.provider.FontsContractCompat.FontInfo[0]);
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    make.close();
                    throw th;
                }
            }
            arrayList = arrayList2;
            if (query != null) {
            }
            make.close();
            return (androidx.core.provider.FontsContractCompat.FontInfo[]) arrayList.toArray(new androidx.core.provider.FontsContractCompat.FontInfo[0]);
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private static java.util.List<java.util.List<byte[]>> getCertificates(androidx.core.provider.FontRequest fontRequest, android.content.res.Resources resources) {
        if (fontRequest.getCertificates() != null) {
            return fontRequest.getCertificates();
        }
        return androidx.core.content.res.FontResourcesParserCompat.readCerts(resources, fontRequest.getCertificatesArrayResId());
    }

    static /* synthetic */ int lambda$static$0(byte[] bArr, byte[] bArr2) {
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

    private static boolean equalsByteArrayList(java.util.List<byte[]> list, java.util.List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!java.util.Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static java.util.List<byte[]> convertToByteArrayList(android.content.pm.Signature[] signatureArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.content.pm.Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private interface ContentQueryWrapper {
        void close();

        android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, android.os.CancellationSignal cancellationSignal);

        /* renamed from: androidx.core.provider.FontProvider$ContentQueryWrapper$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static androidx.core.provider.FontProvider.ContentQueryWrapper make(android.content.Context context, android.net.Uri uri) {
                if (android.os.Build.VERSION.SDK_INT < 24) {
                    return new androidx.core.provider.FontProvider.ContentQueryWrapperApi16Impl(context, uri);
                }
                return new androidx.core.provider.FontProvider.ContentQueryWrapperApi24Impl(context, uri);
            }
        }
    }

    private static class ContentQueryWrapperApi16Impl implements androidx.core.provider.FontProvider.ContentQueryWrapper {
        private final android.content.ContentProviderClient mClient;

        ContentQueryWrapperApi16Impl(android.content.Context context, android.net.Uri uri) {
            this.mClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, android.os.CancellationSignal cancellationSignal) {
            android.content.ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (android.os.RemoteException e) {
                android.util.Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
            android.content.ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    private static class ContentQueryWrapperApi24Impl implements androidx.core.provider.FontProvider.ContentQueryWrapper {
        private final android.content.ContentProviderClient mClient;

        ContentQueryWrapperApi24Impl(android.content.Context context, android.net.Uri uri) {
            this.mClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, android.os.CancellationSignal cancellationSignal) {
            android.content.ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (android.os.RemoteException e) {
                android.util.Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
            android.content.ContentProviderClient contentProviderClient = this.mClient;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }
}
