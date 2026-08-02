package org.bouncycastle.jcajce.provider.keystore.util;

/* loaded from: classes17.dex */
public class ParameterUtil {
    public static char[] extractPassword(java.security.KeyStore.LoadStoreParameter loadStoreParameter) throws java.io.IOException {
        java.security.KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            return null;
        }
        if (protectionParameter instanceof java.security.KeyStore.PasswordProtection) {
            return ((java.security.KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        if (!(protectionParameter instanceof java.security.KeyStore.CallbackHandlerProtection)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("no support for protection parameter of type ");
            sb.append(protectionParameter.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        javax.security.auth.callback.CallbackHandler callbackHandler = ((java.security.KeyStore.CallbackHandlerProtection) protectionParameter).getCallbackHandler();
        javax.security.auth.callback.PasswordCallback passwordCallback = new javax.security.auth.callback.PasswordCallback("password: ", false);
        try {
            callbackHandler.handle(new javax.security.auth.callback.Callback[]{passwordCallback});
            return passwordCallback.getPassword();
        } catch (javax.security.auth.callback.UnsupportedCallbackException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("PasswordCallback not recognised: ");
            sb2.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb2.toString(), e);
        }
    }
}
