package com.facetec.sdk;

/* loaded from: classes8.dex */
final class bc {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* renamed from: a, reason: collision with root package name */
    private static java.util.HashMap<java.lang.String, java.lang.Long> f3413a;
    private static int b;
    private static long c;
    private static char e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i, int i2, int i3) {
        int i4;
        int i5 = 116 - i3;
        int i6 = (i2 * 3) + 1;
        int i7 = (i * 4) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i7;
            int i9 = i6;
            i4 = 0;
            int i10 = i8 + 1;
            i5 = i7 + i9;
            i7 = i10;
            bArr2[i4] = (byte) i5;
            i4++;
            if (i4 == i6) {
                return new java.lang.String(bArr2, 0);
            }
            i9 = bArr[i7];
            int i11 = i5;
            i8 = i7;
            i7 = i11;
            int i102 = i8 + 1;
            i5 = i7 + i9;
            i7 = i102;
            bArr2[i4] = (byte) i5;
            i4++;
            if (i4 == i6) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i5;
            i4++;
            if (i4 == i6) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{33, 2, 62, com.google.common.base.Ascii.ETB};
        $$b = 102;
    }

    bc() {
    }

    static {
        init$0();
        b();
        f3413a = new java.util.HashMap<>();
    }

    static void c(java.lang.String str) {
        if (!f3413a.containsKey(e(str)) || f3413a.containsKey(d(str))) {
            return;
        }
        java.util.HashMap<java.lang.String, java.lang.Long> hashMap = f3413a;
        java.lang.String d = d(str);
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            f("\uf7d4쾫쪝껅", (char) (36740 - android.text.TextUtils.getTrimmedLength("")), "\uea39㗈䤯؛턯䇭剱ꭑ䂦\uf227ᐃ鮢箁ꪕ橀꾛", "㒓亽蒀\uf88f", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            f("\uf7d4쾫쪝껅", (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), "\ud87a蘞俉๐缠᫈鈧ں", "ﭞ歔ڑ攢", android.graphics.Color.blue(0), objArr2);
            hashMap.put(d, java.lang.Long.valueOf(((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue()));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static long b(java.lang.String str) {
        long longValue = f3413a.containsKey(e(str)) ? f3413a.get(e(str)).longValue() : -1L;
        long longValue2 = f3413a.containsKey(d(str)) ? f3413a.get(d(str)).longValue() : -1L;
        if (longValue == -1) {
            return 0L;
        }
        if (longValue2 != -1) {
            return longValue2 - longValue;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            f("\uf7d4쾫쪝껅", (char) (36741 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\uea39㗈䤯؛턯䇭剱ꭑ䂦\uf227ᐃ鮢箁ꪕ橀꾛", "㒓亽蒀\uf88f", 16777216 + android.graphics.Color.rgb(0, 0, 0), objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            f("\uf7d4쾫쪝껅", (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), "\ud87a蘞俉๐缠᫈鈧ں", "ﭞ歔ڑ攢", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
            return ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue() - longValue;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static java.lang.String e(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("__S");
        return sb.toString();
    }

    private static java.lang.String d(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("__E");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void f(java.lang.String str, char c2, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
        char c3;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != 0 ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hs hsVar = new com.facetec.sdk.hs();
        int length = charArray.length;
        char[] cArr = new char[length];
        int length2 = charArray3.length;
        char[] cArr2 = new char[length2];
        int i2 = 0;
        java.lang.System.arraycopy(charArray, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray3, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c2);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr3 = new char[length3];
        hsVar.d = 0;
        while (hsVar.d < length3) {
            try {
                java.lang.Object[] objArr2 = {hsVar};
                java.lang.Object d = com.facetec.sdk.al.d(-1265265027);
                if (d == null) {
                    char blue = (char) android.graphics.Color.blue(i2);
                    int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                    int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                    byte b2 = (byte) i2;
                    byte b3 = b2;
                    java.lang.String $$c = $$c(b2, b3, (byte) (b3 + 5));
                    java.lang.Class[] clsArr = new java.lang.Class[1];
                    clsArr[i2] = java.lang.Object.class;
                    d = com.facetec.sdk.al.c(blue, 988 - (maxKeyCode >> 16), 24 - packedPositionType, 326823045, false, $$c, clsArr);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr3 = {hsVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(1957241543);
                if (d2 == null) {
                    char red = (char) android.graphics.Color.red(i2);
                    int resolveSize = android.view.View.resolveSize(i2, i2);
                    int size = android.view.View.MeasureSpec.getSize(i2);
                    byte b4 = (byte) i2;
                    byte b5 = b4;
                    java.lang.String $$c2 = $$c(b4, b5, (byte) (b5 | 8));
                    java.lang.Class[] clsArr2 = new java.lang.Class[1];
                    clsArr2[i2] = java.lang.Object.class;
                    d2 = com.facetec.sdk.al.c(red, resolveSize + 1505, size + 24, -750364609, false, $$c2, clsArr2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).intValue();
                char c4 = cArr[hsVar.d % 4];
                java.lang.Object[] objArr4 = new java.lang.Object[3];
                objArr4[2] = java.lang.Integer.valueOf(cArr2[intValue]);
                objArr4[1] = java.lang.Integer.valueOf(c4 * 32718);
                objArr4[i2] = hsVar;
                java.lang.Object d3 = com.facetec.sdk.al.d(-1182647832);
                if (d3 == null) {
                    byte b6 = (byte) i2;
                    d3 = com.facetec.sdk.al.c((char) (26699 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), android.widget.ExpandableListView.getPackedPositionType(0L) + 639, 23 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 510477072, false, $$c(b6, b6, $$a[1]), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr4);
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr[intValue2] * 32718), java.lang.Integer.valueOf(cArr2[intValue])};
                java.lang.Object d4 = com.facetec.sdk.al.d(1279455729);
                if (d4 == null) {
                    char c5 = (char) (410 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                    int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    java.lang.String $$c3 = $$c(b7, b8, b8);
                    c3 = 2;
                    d4 = com.facetec.sdk.al.c(c5, offsetBefore + 2198, 24 - resolveSizeAndState, -340948215, false, $$c3, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                } else {
                    c3 = 2;
                }
                cArr2[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) d4).invoke(null, objArr5)).charValue();
                cArr[intValue2] = hsVar.b;
                cArr3[hsVar.d] = (char) ((((cArr[intValue2] ^ charArray2[hsVar.d]) ^ (c ^ 9010024738234916139L)) ^ ((int) (b ^ 9010024738234916139L))) ^ ((char) (e ^ 9010024738234916139L)));
                hsVar.d++;
                i2 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void a(java.lang.String str) {
        f3413a.remove(e(str));
        f3413a.remove(d(str));
        java.util.HashMap<java.lang.String, java.lang.Long> hashMap = f3413a;
        java.lang.String e2 = e(str);
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            f("\uf7d4쾫쪝껅", (char) (android.graphics.Color.rgb(0, 0, 0) + 16813956), "\uea39㗈䤯؛턯䇭剱ꭑ䂦\uf227ᐃ鮢箁ꪕ橀꾛", "㒓亽蒀\uf88f", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            f("\uf7d4쾫쪝껅", (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), "\ud87a蘞俉๐缠᫈鈧ں", "ﭞ歔ڑ攢", android.widget.ExpandableListView.getPackedPositionChild(0L) + 1, objArr2);
            hashMap.put(e2, java.lang.Long.valueOf(((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue()));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void b() {
        c = -3184111599068468481L;
        b = 603544875;
        e = (char) 23851;
    }
}
