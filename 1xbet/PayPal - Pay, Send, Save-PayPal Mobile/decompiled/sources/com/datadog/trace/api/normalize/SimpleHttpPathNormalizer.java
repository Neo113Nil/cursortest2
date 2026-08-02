package com.datadog.trace.api.normalize;

/* loaded from: classes3.dex */
public final class SimpleHttpPathNormalizer extends com.datadog.trace.api.normalize.HttpPathNormalizer {
    SimpleHttpPathNormalizer() {
    }

    @Override // com.datadog.trace.api.normalize.HttpPathNormalizer
    public final java.lang.String normalize(java.lang.String str, boolean z) {
        if (str == null || str.isEmpty()) {
            return androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR;
        }
        int i = 1;
        boolean z2 = !z && com.datadog.trace.api.Config.get().isHttpServerDecodedResourcePreserveSpaces();
        java.lang.StringBuilder sb = null;
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            int indexOf = str.indexOf(47, i2);
            if (indexOf != i2) {
                int length = indexOf == -1 ? str.length() : indexOf;
                int i4 = length - i2;
                if (i4 > 3 || i4 <= i || (str.charAt(i2) | ' ') != 118) {
                    int length2 = sb != null ? sb.length() : i2;
                    boolean z3 = false;
                    while (i2 < length && !z3) {
                        char charAt = str.charAt(i2);
                        if (z && charAt == '%') {
                            i3 = 3;
                        }
                        i3--;
                        boolean z4 = i3 < 0 && charAt <= '9' && charAt >= '0';
                        if (!z4) {
                            if (java.lang.Character.isWhitespace(charAt)) {
                                if (sb == null) {
                                    sb = new java.lang.StringBuilder();
                                    sb.append((java.lang.CharSequence) str, 0, i2);
                                }
                                if (z2 && sb.length() > 0) {
                                    sb.append(charAt);
                                }
                            } else if (sb != null) {
                                sb.append(charAt);
                            }
                        }
                        i2++;
                        z3 = z4;
                    }
                    if (z3) {
                        if (sb == null) {
                            sb = new java.lang.StringBuilder();
                            sb.append((java.lang.CharSequence) str, 0, length2);
                        }
                        sb.setLength(length2);
                        sb.append('?');
                    }
                } else {
                    boolean z5 = true;
                    for (int i5 = i2 + 1; i5 < length; i5++) {
                        char charAt2 = str.charAt(i5);
                        z5 &= charAt2 <= '9' && charAt2 >= '0';
                    }
                    if (!z5) {
                        if (sb == null) {
                            sb = new java.lang.StringBuilder();
                            sb.append((java.lang.CharSequence) str, 0, i2);
                        }
                        sb.append('?');
                    } else if (sb != null) {
                        sb.append((java.lang.CharSequence) str, i2, length);
                    }
                }
                i2 = length + 1;
            } else {
                i2++;
            }
            if (indexOf != -1 && sb != null) {
                sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            }
            i = 1;
        }
        return sb == null ? str : sb.length() == 0 ? androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR : sb.toString();
    }
}
