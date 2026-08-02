package com.visa.cbp.sdk.facade.util;

/* loaded from: classes5.dex */
public class UtilityFunctions {
    private static java.lang.String TAG = "UtilityFunctions";
    private static android.content.SharedPreferences settings;

    public static boolean saveBooleanInSharedPreference(android.content.Context context, java.lang.String str, boolean z) {
        return getEditableSettingsSettings(context).putBoolean(str, z).commit();
    }

    public static boolean retrieveBooleanFromPreference(android.content.Context context, java.lang.String str) {
        return getSettings(context, str).getBoolean(str, false);
    }

    public static boolean saveIntInSharedPreference(android.content.Context context, java.lang.String str, int i) {
        return getEditableSettingsSettings(context).putInt(str, i).commit();
    }

    public static int retrieveIntFromPreference(android.content.Context context, java.lang.String str) {
        return getSettings(context, str).getInt(str, 0);
    }

    public static void saveStringInSharedPreference(android.content.Context context, java.lang.String str, java.lang.String str2) {
        getEditableSettingsSettings(context).putString(str, str2).commit();
    }

    public static java.lang.String retrieveStringFromPreference(android.content.Context context, java.lang.String str) {
        return getSettings(context, str).getString(str, "");
    }

    private static android.content.SharedPreferences.Editor getEditableSettingsSettings(android.content.Context context) {
        return getSettings(context).edit();
    }

    private static android.content.SharedPreferences getSettings(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences settings2 = getSettings(context);
        settings2.contains(str);
        return settings2;
    }

    private static android.content.SharedPreferences getSettings(android.content.Context context) {
        if (settings == null) {
            settings = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        }
        return settings;
    }

    public static int compareVersion(java.lang.String str, java.lang.String str2) {
        java.lang.String[] split = str.split("\\.");
        java.lang.String[] split2 = str2.split("\\.");
        int i = 0;
        while (true) {
            if (i >= split.length && i >= split2.length) {
                return 0;
            }
            if (i < split.length && i < split2.length) {
                if (java.lang.Integer.parseInt(split[i]) < java.lang.Integer.parseInt(split2[i])) {
                    return -1;
                }
                if (java.lang.Integer.parseInt(split[i]) > java.lang.Integer.parseInt(split2[i])) {
                    return 1;
                }
            } else if (i < split.length) {
                if (java.lang.Integer.parseInt(split[i]) != 0) {
                    return 1;
                }
            } else if (i < split2.length && java.lang.Integer.parseInt(split2[i]) != 0) {
                return -1;
            }
            i++;
        }
    }

    private static boolean checkForKeystore() {
        try {
            java.lang.String property = java.lang.System.getProperty(com.datadog.trace.bootstrap.instrumentation.api.Tags.OS_VERSION);
            return compareVersion(property.substring(0, java.lang.Math.min(property.length(), 6)), "3.10.0") >= 0;
        } catch (java.lang.Exception e) {
            e.getLocalizedMessage();
            return false;
        }
    }

    /* renamed from: com.visa.cbp.sdk.facade.util.UtilityFunctions$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$visa$cbp$external$common$HardwareKeyStoreState;

        static {
            int[] iArr = new int[com.visa.cbp.external.common.HardwareKeyStoreState.values().length];
            $SwitchMap$com$visa$cbp$external$common$HardwareKeyStoreState = iArr;
            try {
                iArr[com.visa.cbp.external.common.HardwareKeyStoreState.DID_NOT_CHECK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$visa$cbp$external$common$HardwareKeyStoreState[com.visa.cbp.external.common.HardwareKeyStoreState.HAS_HARDWARE_KEY_STORE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$visa$cbp$external$common$HardwareKeyStoreState[com.visa.cbp.external.common.HardwareKeyStoreState.NO_HARDWARE_KEY_STORE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public static int isHardwareKeyStoreAvailable(android.content.Context context) {
        int i = com.visa.cbp.sdk.facade.util.UtilityFunctions.AnonymousClass1.$SwitchMap$com$visa$cbp$external$common$HardwareKeyStoreState[com.visa.cbp.external.common.HardwareKeyStoreState.getHardwareKeyStoreState(retrieveIntFromPreference(context, com.visa.cbp.setEncryptionScheme.getTokenInfo.BuildConfig())).ordinal()];
        if (i != 1) {
            if (i == 2) {
                return com.visa.cbp.external.common.HardwareKeyStoreState.HAS_HARDWARE_KEY_STORE.getValue();
            }
            if (i != 3) {
                return 0;
            }
            return com.visa.cbp.external.common.HardwareKeyStoreState.NO_HARDWARE_KEY_STORE.getValue();
        }
        java.security.KeyStore keyStore = null;
        try {
            try {
                java.security.KeyStore keyStore2 = (java.security.KeyStore) java.lang.Class.forName("java.security.KeyStore").getMethod("getInstance", java.lang.String.class).invoke(null, com.visa.cbp.setEncryptionScheme.setSignature.BuildConfig());
                try {
                    java.lang.Class.forName("java.security.KeyStore").getMethod("load", java.security.KeyStore.LoadStoreParameter.class).invoke(keyStore2, null);
                    keyStore = keyStore2;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        int value = ((keyStore != null && checkForKeystore() && ifKeyStoredOnHardware(keyStore)) ? com.visa.cbp.external.common.HardwareKeyStoreState.HAS_HARDWARE_KEY_STORE : com.visa.cbp.external.common.HardwareKeyStoreState.NO_HARDWARE_KEY_STORE).getValue();
        saveIntInSharedPreference(context, com.visa.cbp.setEncryptionScheme.getTokenInfo.BuildConfig(), value);
        return value;
    }

    public static int isHardwareKeyStoreAvailable() {
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ignore);
    }

    public static void writeToFile(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.io.BufferedWriter bufferedWriter;
        try {
            try {
                java.io.File file = new java.io.File(str2);
                if (!file.exists() && !file.mkdir()) {
                    throw new java.lang.RuntimeException("Could not create DIRECTORY.");
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb.append(str3);
                java.io.File file2 = new java.io.File(sb.toString());
                if (!file2.exists() && !file2.createNewFile()) {
                    throw new java.lang.RuntimeException("Could not create FILE.");
                }
                bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(file2));
            } catch (java.io.IOException e) {
                e = e;
            }
        } catch (java.lang.Throwable th) {
            th = th;
            bufferedWriter = null;
        }
        try {
            bufferedWriter.write(str);
            try {
                bufferedWriter.close();
            } catch (java.lang.Exception unused) {
            }
        } catch (java.io.IOException e2) {
            e = e2;
            throw new java.lang.RuntimeException(e.getMessage());
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th;
        }
    }

    public static byte[] readFileToBytes(java.lang.String str) {
        java.io.BufferedInputStream bufferedInputStream;
        java.io.File file = new java.io.File(str);
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        try {
            try {
                bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
            } catch (java.lang.Throwable th) {
                th = th;
                bufferedInputStream = null;
            }
            try {
                bufferedInputStream.read(bArr, 0, length);
                try {
                    bufferedInputStream.close();
                    return bArr;
                } catch (java.io.IOException e) {
                    e.getLocalizedMessage();
                    return bArr;
                }
            } catch (java.io.FileNotFoundException e2) {
                e = e2;
                throw new java.lang.RuntimeException(e.getMessage());
            } catch (java.io.IOException e3) {
                e = e3;
                throw new java.lang.RuntimeException(e.getMessage());
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (java.io.IOException e4) {
                        e4.getLocalizedMessage();
                    }
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException e5) {
            e = e5;
        } catch (java.io.IOException e6) {
            e = e6;
        }
    }

    static void createKeystoreKey(java.lang.String str) {
        try {
            android.security.keystore.KeyGenParameterSpec build = new android.security.keystore.KeyGenParameterSpec.Builder(str, 3).setBlockModes(com.google.android.gms.stats.CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
            javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(org.jose4j.keys.AesKey.ALGORITHM, com.visa.cbp.setEncryptionScheme.setSignature.BuildConfig());
            keyGenerator.init(build);
            keyGenerator.generateKey();
        } catch (java.lang.Exception e) {
            throw new com.visa.cbp.sdk.facade.exception.CryptoException(com.visa.cbp.setDeviceCerts.getForegroundColor, com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION, e.getLocalizedMessage());
        }
    }

    static boolean ifKeyStoredOnHardware(java.security.KeyStore keyStore) {
        try {
            createKeystoreKey("test");
            try {
                javax.crypto.SecretKey secretKey = ((java.security.KeyStore.SecretKeyEntry) java.lang.Class.forName("java.security.KeyStore").getMethod("getEntry", java.lang.String.class, java.security.KeyStore.ProtectionParameter.class).invoke(keyStore, "test", null)).getSecretKey();
                boolean isInsideSecureHardware = ((android.security.keystore.KeyInfo) javax.crypto.SecretKeyFactory.getInstance(secretKey.getAlgorithm(), com.visa.cbp.setEncryptionScheme.setSignature.BuildConfig()).getKeySpec(secretKey, android.security.keystore.KeyInfo.class)).isInsideSecureHardware();
                deleteKey("test", keyStore);
                return isInsideSecureHardware;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static void deleteKey(java.lang.String str, java.security.KeyStore keyStore) {
        try {
            java.lang.Class.forName("java.security.KeyStore").getMethod("deleteEntry", java.lang.String.class).invoke(keyStore, str);
        } catch (java.lang.Throwable th) {
            try {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            } catch (java.security.KeyStoreException unused) {
            }
        }
    }

    public static boolean isNullOrEmpty(java.lang.String str) {
        return str == null || str.length() <= 0 || str.trim().length() <= 0;
    }

    public static boolean deleteSdkSharedPrefs(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences settings2 = getSettings(context, str);
        android.content.SharedPreferences.Editor editableSettingsSettings = getEditableSettingsSettings(context);
        if (settings2.contains(str)) {
            editableSettingsSettings.remove(str);
        }
        return editableSettingsSettings.commit();
    }
}
