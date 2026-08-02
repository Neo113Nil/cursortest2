package com.google.android.gms.common.internal;

/* loaded from: classes8.dex */
public class ViewUtils {
    public static java.lang.String getXmlAttributeString(java.lang.String str, java.lang.String str2, android.content.Context context, android.util.AttributeSet attributeSet, boolean z, boolean z2, java.lang.String str3) {
        java.lang.String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue == null || !attributeValue.startsWith("@string/") || !z) {
            return attributeValue;
        }
        java.lang.String substring = attributeValue.substring(8);
        java.lang.String packageName = context.getPackageName();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        try {
            android.content.res.Resources resources = context.getResources();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 8 + java.lang.String.valueOf(substring).length());
            sb.append(packageName);
            sb.append(":string/");
            sb.append(substring);
            resources.getValue(sb.toString(), typedValue, true);
        } catch (android.content.res.Resources.NotFoundException unused) {
        }
        return typedValue.string != null ? typedValue.string.toString() : attributeValue;
    }

    private ViewUtils() {
    }
}
