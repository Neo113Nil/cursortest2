package com.inmobi.media;

/* renamed from: com.inmobi.media.jn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2520jn {
    public static final void a(java.lang.String str) {
        try {
            java.lang.Class.forName("androidx.media3.exoplayer.ExoPlayerImpl");
            if (str == null || str.length() == 0) {
                return;
            }
            java.lang.String str2 = null;
            try {
                java.lang.reflect.Field declaredField = java.lang.Class.forName("androidx.media3.common.MediaLibraryInfo").getDeclaredField("VERSION");
                declaredField.setAccessible(true);
                java.lang.Object obj = declaredField.get(null);
                java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                if (str3 != null) {
                    if (!kotlin.text.StringsKt.isBlank(str3)) {
                        str2 = str3;
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
            if (str2 == null) {
                throw new com.inmobi.media.Ag(8800);
            }
            com.inmobi.media.C2280aj b = b(str2);
            if (b == null) {
                throw new com.inmobi.media.Ag(8802);
            }
            com.inmobi.media.C2280aj b2 = b(str);
            if (b2 == null) {
                throw new com.inmobi.media.Ag(8803);
            }
            int i = b.f5107a;
            int i2 = b2.f5107a;
            if (i >= i2) {
                if (i != i2 || b.b > b2.b) {
                    throw new com.inmobi.media.Ag(8804);
                }
            }
        } catch (java.lang.ClassNotFoundException unused2) {
            throw new com.inmobi.media.Ag(8800);
        }
    }

    public static final com.inmobi.media.C2280aj b(java.lang.String str) {
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"."}, false, 3, 2, (java.lang.Object) null);
        if (split$default.size() < 2) {
            return null;
        }
        int c = c((java.lang.String) split$default.get(0));
        int c2 = c((java.lang.String) split$default.get(1));
        int c3 = split$default.size() >= 3 ? c((java.lang.String) split$default.get(2)) : 0;
        if (c < 0 || c2 < 0) {
            return null;
        }
        return new com.inmobi.media.C2280aj(c, c2, c3);
    }

    public static final int c(java.lang.String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!java.lang.Character.isDigit(str.charAt(i))) {
                str = str.substring(0, i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                break;
            }
            i++;
        }
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }
}
