package com.paypal.android.threeds.init;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fRj\u0010\u0014\u001aV\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00110\u0010j*\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0011`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/android/threeds/init/ConfigParams;", "", "<init>", "()V", "", "group", "paramName", "paramValue", "", "addParam", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getParamValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "removeParam", "requireValidParamName", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/HashMap;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ConfigParams {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> getHighSpeedVideoSizes = new java.util.HashMap<>();
    public static final int $stable = 8;

    public final void addParam(java.lang.String group, java.lang.String paramName, java.lang.String paramValue) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paramValue, "");
        if (group == null) {
            group = "defaultConfigParametersGroup";
        }
        java.lang.String requireValidParamName = requireValidParamName(paramName);
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.getHighSpeedVideoSizes.get(group);
        if (hashMap != null) {
            hashMap.put(requireValidParamName, paramValue);
            this.getHighSpeedVideoSizes.put(group, hashMap);
        } else {
            this.getHighSpeedVideoSizes.put(group, kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to(requireValidParamName, paramValue)));
        }
    }

    public final java.lang.String getParamValue(java.lang.String group, java.lang.String paramName) {
        requireValidParamName(paramName);
        if (group != null) {
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.getHighSpeedVideoSizes.get(group);
            java.lang.String str = hashMap != null ? hashMap.get(paramName) : null;
            if (str != null) {
                return str;
            }
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = this.getHighSpeedVideoSizes.get("defaultConfigParametersGroup");
        if (hashMap2 != null) {
            return hashMap2.get(paramName);
        }
        return null;
    }

    public final java.lang.String removeParam(java.lang.String group, java.lang.String paramName) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        requireValidParamName(paramName);
        if (group != null) {
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = this.getHighSpeedVideoSizes.get(group);
            java.lang.String str = hashMap != null ? (java.lang.String) kotlin.jvm.internal.TypeIntrinsics.asMutableMap(hashMap).remove(paramName) : null;
            if (str != null) {
                return str;
            }
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = this.getHighSpeedVideoSizes.get("defaultConfigParametersGroup");
        if (hashMap2 != null) {
            return (java.lang.String) kotlin.jvm.internal.TypeIntrinsics.asMutableMap(hashMap2).remove(paramName);
        }
        return null;
    }

    public final java.lang.String requireValidParamName(java.lang.String paramName) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        java.lang.String str = paramName;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            throw new com.paypal.android.threeds.exceptions.InvalidInputException(com.paypal.android.threeds.utils.ConstantUtil.INVALID_PARAMETER, null, 2, null);
        }
        return paramName;
    }
}
