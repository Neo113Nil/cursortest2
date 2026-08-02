package com.datadog.trace.core.util;

/* loaded from: classes3.dex */
public final class GlobPattern {
    private GlobPattern() {
    }

    public static java.util.regex.Pattern globToRegexPattern(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.ObscuredMaskString);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '$' && charAt != '.') {
                if (charAt == '?') {
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                } else {
                    switch (charAt) {
                        case '(':
                        case ')':
                            break;
                        case '*':
                            sb.append(".*");
                            continue;
                        default:
                            switch (charAt) {
                                case '[':
                                case '\\':
                                case ']':
                                case '^':
                                    break;
                                default:
                                    switch (charAt) {
                                        case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                                        case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                                        case '}':
                                            break;
                                        default:
                                            sb.append(charAt);
                                            continue;
                                    }
                            }
                    }
                }
            }
            sb.append("\\");
            sb.append(charAt);
        }
        sb.append(kotlin.text.Typography.dollar);
        return java.util.regex.Pattern.compile(sb.toString());
    }
}
