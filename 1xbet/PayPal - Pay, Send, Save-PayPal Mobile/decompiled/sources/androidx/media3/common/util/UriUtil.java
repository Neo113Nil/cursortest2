package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class UriUtil {
    private UriUtil() {
    }

    public static android.net.Uri resolveToUri(java.lang.String str, java.lang.String str2) {
        return android.net.Uri.parse(resolve(str, str2));
    }

    public static java.lang.String resolve(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str2);
        if (Camera2StreamConfigurationMap[0] != -1) {
            sb.append(str2);
            getHighSpeedVideoSizes(sb, Camera2StreamConfigurationMap[1], Camera2StreamConfigurationMap[2]);
            return sb.toString();
        }
        int[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str);
        if (Camera2StreamConfigurationMap[3] == 0) {
            sb.append((java.lang.CharSequence) str, 0, Camera2StreamConfigurationMap2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (Camera2StreamConfigurationMap[2] == 0) {
            sb.append((java.lang.CharSequence) str, 0, Camera2StreamConfigurationMap2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = Camera2StreamConfigurationMap[1];
        if (i != 0) {
            int i2 = Camera2StreamConfigurationMap2[0] + 1;
            sb.append((java.lang.CharSequence) str, 0, i2);
            sb.append(str2);
            return getHighSpeedVideoSizes(sb, Camera2StreamConfigurationMap[1] + i2, i2 + Camera2StreamConfigurationMap[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((java.lang.CharSequence) str, 0, Camera2StreamConfigurationMap2[1]);
            sb.append(str2);
            int i3 = Camera2StreamConfigurationMap2[1];
            return getHighSpeedVideoSizes(sb, i3, Camera2StreamConfigurationMap[2] + i3);
        }
        int i4 = Camera2StreamConfigurationMap2[0];
        int i5 = Camera2StreamConfigurationMap2[1];
        if (i4 + 2 < i5 && i5 == Camera2StreamConfigurationMap2[2]) {
            sb.append((java.lang.CharSequence) str, 0, i5);
            sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            sb.append(str2);
            int i6 = Camera2StreamConfigurationMap2[1];
            return getHighSpeedVideoSizes(sb, i6, Camera2StreamConfigurationMap[2] + i6 + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, Camera2StreamConfigurationMap2[2] - 1);
        int i7 = lastIndexOf == -1 ? Camera2StreamConfigurationMap2[1] : lastIndexOf + 1;
        sb.append((java.lang.CharSequence) str, 0, i7);
        sb.append(str2);
        return getHighSpeedVideoSizes(sb, Camera2StreamConfigurationMap2[1], i7 + Camera2StreamConfigurationMap[2]);
    }

    public static boolean isAbsolute(java.lang.String str) {
        return (str == null || Camera2StreamConfigurationMap(str)[0] == -1) ? false : true;
    }

    public static android.net.Uri removeQueryParameter(android.net.Uri uri, java.lang.String str) {
        android.net.Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (java.lang.String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                java.util.Iterator<java.lang.String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    buildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return buildUpon.build();
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    private static int[] Camera2StreamConfigurationMap(java.lang.String str) {
        int i;
        int[] iArr = new int[4];
        if (android.text.TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static java.lang.String getRelativePath(android.net.Uri uri, android.net.Uri uri2) {
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        java.lang.String scheme = uri.getScheme();
        java.lang.String scheme2 = uri2.getScheme();
        if (scheme != null ? !(scheme2 == null || !com.google.common.base.Ascii.equalsIgnoreCase(scheme, scheme2)) : scheme2 == null) {
            if (java.util.Objects.equals(uri.getAuthority(), uri2.getAuthority())) {
                java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
                java.util.List<java.lang.String> pathSegments2 = uri2.getPathSegments();
                int min = java.lang.Math.min(pathSegments.size(), pathSegments2.size());
                int i = 0;
                for (int i2 = 0; i2 < min && pathSegments.get(i2).equals(pathSegments2.get(i2)); i2++) {
                    i++;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (int i3 = i; i3 < pathSegments.size(); i3++) {
                    sb.append("../");
                }
                while (i < pathSegments2.size()) {
                    sb.append(pathSegments2.get(i));
                    if (i < pathSegments2.size() - 1) {
                        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                    }
                    i++;
                }
                return sb.toString();
            }
        }
        return uri2.toString();
    }
}
