package com.google.mlkit.common.internal.model;

/* loaded from: classes9.dex */
public class ModelUtils {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("ModelUtils", "");

    public static abstract class AutoMLManifest {
        public abstract java.lang.String getLabelsFile();

        public abstract java.lang.String getModelFile();

        public abstract java.lang.String getModelType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo getModelLoggingInfo(android.content.Context context, com.google.mlkit.common.model.LocalModel localModel) {
        long length;
        java.io.IOException e;
        java.io.InputStream inputStream;
        java.lang.String zzc;
        java.lang.String assetFilePath = localModel.getAssetFilePath();
        java.lang.String absoluteFilePath = localModel.getAbsoluteFilePath();
        android.net.Uri uri = localModel.getUri();
        ?? r5 = 0;
        if (assetFilePath != null) {
            if (localModel.isManifestFile() && (assetFilePath = zzb(context, assetFilePath, true)) == null) {
                return null;
            }
            try {
                android.content.res.AssetFileDescriptor openFd = context.getAssets().openFd(assetFilePath);
                try {
                    length = openFd.getLength();
                    if (openFd != null) {
                        openFd.close();
                    }
                } finally {
                }
            } catch (java.io.IOException e2) {
                zza.e("ModelUtils", "Failed to open model file", e2);
                return null;
            }
        } else if (absoluteFilePath != null) {
            if (localModel.isManifestFile() && (absoluteFilePath = zzb(context, absoluteFilePath, false)) == null) {
                return null;
            }
            length = new java.io.File(absoluteFilePath).length();
        } else {
            if (uri == null) {
                zza.e("ModelUtils", "Local model doesn't have any valid path.");
                return null;
            }
            try {
                android.content.res.AssetFileDescriptor zza2 = com.google.android.gms.internal.mlkit_common.zzi.zza(context, uri, "r");
                try {
                    length = zza2.getLength();
                    if (zza2 != null) {
                        zza2.close();
                    }
                } finally {
                }
            } catch (java.io.IOException e3) {
                zza.e("ModelUtils", "Failed to open model file", e3);
                return null;
            }
        }
        com.google.mlkit.common.sdkinternal.SharedPrefManager sharedPrefManager = (com.google.mlkit.common.sdkinternal.SharedPrefManager) com.google.mlkit.common.sdkinternal.MlKitContext.getInstance().get(com.google.mlkit.common.sdkinternal.SharedPrefManager.class);
        java.lang.String obj = assetFilePath != null ? assetFilePath : absoluteFilePath != null ? absoluteFilePath : ((android.net.Uri) com.google.android.gms.common.internal.Preconditions.checkNotNull(uri)).toString();
        java.lang.String zzb = sharedPrefManager.zzb(obj, length);
        if (zzb != null) {
            return com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo.zza(length, zzb, localModel.isManifestFile());
        }
        try {
            try {
                if (assetFilePath != null) {
                    inputStream = context.getAssets().open(assetFilePath);
                } else if (absoluteFilePath != null) {
                    inputStream = new java.io.FileInputStream(new java.io.File(absoluteFilePath));
                } else {
                    android.net.Uri uri2 = (android.net.Uri) com.google.android.gms.common.internal.Preconditions.checkNotNull(uri);
                    int i = com.google.android.gms.internal.mlkit_common.zzi.zza;
                    inputStream = com.google.android.gms.internal.mlkit_common.zzi.zzb(context, uri2, com.google.android.gms.internal.mlkit_common.zzh.zza);
                }
                if (inputStream != null) {
                    try {
                        zzc = zzc(inputStream);
                    } catch (java.io.IOException e4) {
                        e = e4;
                        zza.e("ModelUtils", "Failed to open model file", e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (java.io.IOException e5) {
                                zza.e("ModelUtils", "Failed to close model file", e5);
                            }
                        }
                        return null;
                    }
                } else {
                    zzc = null;
                }
                if (zzc != null) {
                    sharedPrefManager.zzc(obj, length, zzc);
                }
                com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo zza3 = com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo.zza(length, zzc, localModel.isManifestFile());
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return zza3;
                    } catch (java.io.IOException e6) {
                        zza.e("ModelUtils", "Failed to close model file", e6);
                    }
                }
                return zza3;
            } catch (java.lang.Throwable th) {
                r5 = context;
                th = th;
                if (r5 != 0) {
                    throw th;
                }
                try {
                    r5.close();
                    throw th;
                } catch (java.io.IOException e7) {
                    zza.e("ModelUtils", "Failed to close model file", e7);
                    throw th;
                }
            }
        } catch (java.io.IOException e8) {
            e = e8;
            inputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (r5 != 0) {
            }
        }
    }

    public static java.lang.String getSHA256(java.io.File file) {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                java.lang.String zzc = zzc(fileInputStream);
                fileInputStream.close();
                return zzc;
            } finally {
            }
        } catch (java.io.IOException e) {
            zza.e("ModelUtils", "Failed to create FileInputStream for model: ".concat(e.toString()));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (new java.io.File(r5).exists() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest parseManifestFile(java.lang.String str, boolean z, android.content.Context context) {
        byte[] bArr;
        java.lang.String valueOf = java.lang.String.valueOf(str);
        com.google.android.gms.common.internal.GmsLogger gmsLogger = zza;
        gmsLogger.d("ModelUtils", "Manifest file path: ".concat(valueOf));
        if (z) {
            try {
                java.io.InputStream open = context.getAssets().open(str);
                if (open != null) {
                    open.close();
                }
            } catch (java.io.IOException unused) {
                zza.e("ModelUtils", "Manifest file does not exist.");
                return null;
            }
        }
        try {
            if (str.isEmpty()) {
                bArr = new byte[0];
            } else {
                java.io.InputStream open2 = z ? context.getAssets().open(str) : new java.io.FileInputStream(new java.io.File(str));
                try {
                    int available = open2.available();
                    byte[] bArr2 = new byte[available];
                    open2.read(bArr2, 0, available);
                    if (open2 != null) {
                        open2.close();
                    }
                    bArr = bArr2;
                } catch (java.lang.Throwable th) {
                    if (open2 != null) {
                        try {
                            open2.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            java.lang.String str2 = new java.lang.String(bArr, "UTF-8");
            gmsLogger.d("ModelUtils", "Json string from the manifest file: ".concat(str2));
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            return new com.google.mlkit.common.internal.model.AutoValue_ModelUtils_AutoMLManifest(jSONObject.getString("modelType"), jSONObject.getString("modelFile"), jSONObject.getString("labelsFile"));
        } catch (java.io.IOException | org.json.JSONException e) {
            zza.e("ModelUtils", "Error parsing the manifest file.", e);
            return null;
        }
    }

    public static boolean zza(java.io.File file, java.lang.String str) {
        java.lang.String sha256 = getSHA256(file);
        zza.d("ModelUtils", "Calculated hash value is: ".concat(java.lang.String.valueOf(sha256)));
        return str.equals(sha256);
    }

    private static java.lang.String zzb(android.content.Context context, java.lang.String str, boolean z) {
        com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest parseManifestFile = parseManifestFile(str, z, context);
        if (parseManifestFile != null) {
            return new java.io.File(new java.io.File(str).getParent(), parseManifestFile.getModelFile()).toString();
        }
        zza.e("ModelUtils", "Failed to parse manifest file.");
        return null;
    }

    private static java.lang.String zzc(java.io.InputStream inputStream) {
        int i;
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            byte[] digest = messageDigest.digest();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (byte b : digest) {
                java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (java.io.IOException unused) {
            zza.e("ModelUtils", "Failed to read model file");
            return null;
        } catch (java.security.NoSuchAlgorithmException unused2) {
            zza.e("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        }
    }

    public static abstract class ModelLoggingInfo {
        public abstract java.lang.String getHash();

        public abstract long getSize();

        public abstract boolean isManifestModel();

        static com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo zza(long j, java.lang.String str, boolean z) {
            return new com.google.mlkit.common.internal.model.AutoValue_ModelUtils_ModelLoggingInfo(j, com.google.android.gms.internal.mlkit_common.zzu.zzb(str), z);
        }
    }

    private ModelUtils() {
    }
}
