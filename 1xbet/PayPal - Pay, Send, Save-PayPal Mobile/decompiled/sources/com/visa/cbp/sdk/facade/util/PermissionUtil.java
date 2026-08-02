package com.visa.cbp.sdk.facade.util;

/* loaded from: classes16.dex */
public class PermissionUtil {
    public static void checkForMandatoryPermissions(android.content.Context context, java.util.HashMap<com.visa.cbp.setDeviceCerts, java.lang.String> hashMap) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKPermissionException {
        com.visa.cbp.setDeviceCerts checkForPermissions = checkForPermissions(context, hashMap);
        if (checkForPermissions != null) {
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKPermissionException(checkForPermissions, com.visa.cbp.sdk.facade.error.ReasonCode.PERMISSION_ERROR);
        }
    }

    private static com.visa.cbp.setDeviceCerts checkForPermissions(android.content.Context context, java.util.Map<com.visa.cbp.setDeviceCerts, java.lang.String> map) {
        for (java.util.Map.Entry<com.visa.cbp.setDeviceCerts, java.lang.String> entry : map.entrySet()) {
            if (-1 == context.checkCallingOrSelfPermission(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static boolean isOptionalPermissionSpecified(android.content.Context context, java.lang.String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
