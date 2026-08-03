package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class YB {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"aXQ8cQ350VCAT2mitcvykUGHubvGx6C9", "NAK0YApfoevBcA8nU2", "YHwKc8bJ3fYIczYaga21kucMEh7K8adi", "qYAOAoZ496ND8", "6pHjubFxbGGqNA8P9d", "3r9qhhsI1oDbETggKvxV5tdwn", "sRn13xQSljRP603ULBb8dNJbjS", "vNgqutu69Vtz3tnibxv52jRaXo"};
    public static final int A02;
    public static final int A03;
    public static final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> A04;
    public static final java.util.concurrent.atomic.AtomicInteger A05;

    public static java.lang.String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0D() {
        A00 = new byte[]{118, -127, -123, 125, 118, -35, -37, -26, -26, -33, -20, -50, -13, -22, -33, -127, -118, -121, -127, -119, 125, -111, -115, -109, -112, -127, -125, -43, -40, -37, -29, -44, -31, -44, -45, -50, -46, -37, -40, -46, -38, -50, -45, -44, -37, -48, -24, -50, -36, -30, -39, -34, -28, -43, -30, -29, -28, -39, -28, -39, -47, -36, -125, -115, 121, 125, 123, 125, 121, Byte.MIN_VALUE, -125, -122, -114, Byte.MAX_VALUE, -116, 121, 125, -122, -125, 125, -123, -115, 121, -119, -120, 121, 125, -114, 123, -99, -89, -109, -105, -90, -103, -107, -88, -99, -86, -103, -109, -107, -89, -109, -105, -88, -107, -109, -86, 102, -50, -63, -45, -67, -50, -64, -63, -64, -69, -46, -59, -64, -63, -53, -12, -15, -28, -15, -10, -15, -81, -17, -25, -26, -21, -9, -17, -38, -56, -43, -38, -108, -38, -52, -39, -48, -51, -108, -44, -52, -53, -48, -36, -44, -66, -73, -78, -70, -66, -82, -110, -83, -42, -44, -58, -45, -60, -51, -54, -60, -52};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0i(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str = map.get(A0C(89, 21, 37));
        boolean z = str != null && str.equals(java.lang.Boolean.TRUE.toString());
        if (z && (A0h(c1636gi, enumC0885Mq) || A0f(enumC0885Mq, map))) {
            return true;
        }
        java.lang.String str2 = map.get(A0C(62, 27, 11));
        return z && (str2 != null && str2.equals(java.lang.Boolean.TRUE.toString())) && A0g(enumC0885Mq, map);
    }

    static {
        A0D();
        A03 = com.facebook.ads.redexgen.core.P3.A02(-1, 0);
        A02 = com.facebook.ads.redexgen.core.P3.A02(androidx.core.view.ViewCompat.MEASURED_STATE_MASK, 115);
        A05 = new java.util.concurrent.atomic.AtomicInteger(1);
        A04 = new java.util.concurrent.ConcurrentHashMap<>();
    }

    public static int A00() {
        int i;
        int newValue;
        do {
            i = A05.get();
            newValue = i + 1;
            if (newValue > 16777215) {
                newValue = 1;
            }
        } while (!A05.compareAndSet(i, newValue));
        return i;
    }

    public static int A01(int i) {
        return (int) android.util.TypedValue.applyDimension(2, i, com.facebook.ads.redexgen.core.XX.A04);
    }

    public static int A02(int i) {
        if (A0e(i)) {
            return com.facebook.ads.redexgen.core.P3.A05(i, -1, 0.4f);
        }
        return com.facebook.ads.redexgen.core.P3.A05(i, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, 0.2f);
    }

    public static int A03(android.widget.TextView textView) {
        android.text.Layout layout;
        int lineCount;
        if (textView == null || textView.getLayout() == null || (lineCount = (layout = textView.getLayout()).getLineCount()) <= 0) {
            return 0;
        }
        double ellipsisCount = layout.getEllipsisCount(lineCount - 1);
        double ellipsisCount2 = ellipsisCount / (textView.getText().length() - ellipsisCount);
        if (A01[3].length() == 20) {
            throw new java.lang.RuntimeException();
        }
        A01[3] = "IkK7ljd8WWfE470H6O9Fo";
        return (int) java.lang.Math.ceil(ellipsisCount2);
    }

    public static int A04(android.widget.TextView textView, int i) {
        int lineHeightTitle = A03(textView);
        int lines = 0;
        int extraLinesRequired = textView.getLineHeight();
        while (i > extraLinesRequired && lines < lineHeightTitle) {
            lines++;
            i -= extraLinesRequired;
        }
        return lines;
    }

    public static android.graphics.drawable.Drawable A05(int i, int i2) {
        return A08(i, A02(i), i2);
    }

    public static android.graphics.drawable.Drawable A06(int i, int i2) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        return gradientDrawable;
    }

    public static android.graphics.drawable.Drawable A07(int i, int i2) {
        float[] fArr = new float[8];
        java.util.Arrays.fill(fArr, i2);
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    public static android.graphics.drawable.Drawable A08(int i, int i2, int i3) {
        return A09(i, i2, i, i3);
    }

    public static android.graphics.drawable.Drawable A09(int i, int i2, int i3, int i4) {
        return new android.graphics.drawable.RippleDrawable(android.content.res.ColorStateList.valueOf(i2), A06(i, i4), A07(i3, i4));
    }

    public static android.graphics.drawable.Drawable A0A(int i, float[] fArr) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.widget.TextView A0B(android.view.ViewGroup viewGroup) {
        for (int i = 0; i < i; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) childAt;
                if (A01[3].length() == 20) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A01;
                strArr[0] = "6RJtTYzLBnUcHRvsTatmkmWKIun16hlE";
                strArr[2] = "BwINbhkVgYMYeGJED3O8k6L5SNrYNN6g";
                return textView;
            }
            if (childAt instanceof android.view.ViewGroup) {
                A0B((android.view.ViewGroup) childAt);
            }
        }
        return null;
    }

    public static void A0E(float f, android.widget.LinearLayout linearLayout) {
        linearLayout.setOutlineProvider(new com.facebook.ads.redexgen.core.Y9(f));
        linearLayout.setClipToOutline(true);
    }

    public static void A0F(int i, android.view.View view) {
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i / 3);
        scaleAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator());
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration((i / 3) * 2);
        scaleAnimation2.setInterpolator(new android.view.animation.BounceInterpolator());
        scaleAnimation.setAnimationListener(new com.facebook.ads.redexgen.core.QA(view, scaleAnimation2));
        view.startAnimation(scaleAnimation);
    }

    public static void A0G(int i, android.view.View view) {
        java.lang.Integer viewId = A04.get(java.lang.Integer.valueOf(i));
        if (viewId != null) {
            view.setId(viewId.intValue());
        } else {
            A0K(view);
        }
    }

    public static void A0H(android.view.View view) {
        A0O(view, 8);
    }

    public static void A0I(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof android.view.ViewGroup)) {
            A0W((android.view.ViewGroup) parent);
        }
    }

    public static void A0J(android.view.View view) {
        if (view == null) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        if (A01[3].length() == 20) {
            throw new java.lang.RuntimeException();
        }
        A01[3] = "DU33ZJN3ug5gIBKNKyYbqVVAVCFz";
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static void A0K(android.view.View view) {
        if (view == null) {
            return;
        }
        view.setId(android.view.View.generateViewId());
    }

    public static void A0L(android.view.View view) {
        A0O(view, 0);
    }

    public static void A0M(android.view.View view, float f, float f2, int i) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, A0C(0, 5, 6), f, f2);
        ofFloat.setDuration(i);
        ofFloat.start();
    }

    public static void A0N(android.view.View view, int i) {
        view.setBackground(new android.graphics.drawable.ColorDrawable(i));
    }

    public static void A0O(android.view.View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static void A0P(android.view.View view, int i, int i2) {
        A0V(view, A06(i, i2));
    }

    public static void A0Q(android.view.View view, int i, int i2) {
        A0V(view, A08(i, A02(i), i2));
    }

    public static void A0R(android.view.View view, int i, int i2, int i3) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setStroke(i2, i3);
        A0V(view, gradientDrawable);
    }

    public static void A0S(android.view.View view, int i, int i2, int i3) {
        A0V(view, A09(i, A02(i), i2, i3));
    }

    public static void A0T(android.view.View view, int i, float[] fArr) {
        A0V(view, A0A(i, fArr));
    }

    public static void A0U(android.view.View view, android.content.Context context) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(0.0f);
        A0V(view, gradientDrawable);
    }

    public static void A0V(android.view.View view, android.graphics.drawable.Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void A0W(android.view.ViewGroup viewGroup) {
        A0X(viewGroup, 200);
    }

    public static void A0X(android.view.ViewGroup viewGroup, int i) {
        A0Y(viewGroup, new android.transition.AutoTransition(), i);
    }

    public static void A0Y(android.view.ViewGroup viewGroup, android.transition.Transition transition, int i) {
        transition.setDuration(i);
        transition.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        android.transition.TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    public static void A0Z(android.widget.Button button) {
        android.graphics.Typeface typeface = android.graphics.Typeface.create(A0C(124, 13, 115), 0);
        button.setTypeface(typeface);
    }

    public static void A0a(android.widget.TextView textView, boolean z, int i) {
        android.graphics.Typeface typeface;
        if (z) {
            typeface = android.graphics.Typeface.create(A0C(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 17, 88), 0);
        } else {
            android.graphics.Typeface typeface2 = android.graphics.Typeface.SANS_SERIF;
            typeface = android.graphics.Typeface.create(typeface2, 0);
        }
        textView.setTypeface(typeface);
        if (A01[5].length() != 25) {
            throw new java.lang.RuntimeException();
        }
        A01[3] = "EYVeEO4Fu";
        textView.setTextSize(2, i);
    }

    public static void A0b(android.widget.Toast toast, java.lang.String str, int i, int i2, int i3) {
        if (toast == null) {
            return;
        }
        toast.setGravity(i, i2, i3);
        android.widget.TextView A0B = A0B((android.view.ViewGroup) toast.getView());
        if (A0B != null) {
            A0B.setText(str);
            A0B.setGravity(17);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0c(java.util.Map<java.lang.String, java.lang.String> map, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        char c;
        if (abstractC1801jd == null) {
            return;
        }
        java.lang.String A10 = abstractC1801jd.A10();
        switch (A10.hashCode()) {
            case -1364000502:
                if (A10.equals(A0C(110, 14, 77))) {
                    c = 1;
                    java.lang.String A0C = A0C(5, 10, 107);
                    switch (c) {
                        case 0:
                            map.put(A0C, com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL.name());
                            break;
                        case 1:
                            map.put(A0C, com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO.name());
                            break;
                    }
                    map.put(A0C(154, 8, 58), abstractC1801jd.A0u());
                    map.put(A0C(89, 21, 37), java.lang.String.valueOf(abstractC1801jd.A1e()));
                    map.put(A0C(62, 27, 11), java.lang.String.valueOf(abstractC1801jd.A1Y()));
                    map.put(A0C(27, 23, 96), java.lang.String.valueOf(abstractC1801jd.A0q()));
                    return;
                }
                c = 65535;
                java.lang.String A0C2 = A0C(5, 10, 107);
                switch (c) {
                }
                map.put(A0C(154, 8, 58), abstractC1801jd.A0u());
                map.put(A0C(89, 21, 37), java.lang.String.valueOf(abstractC1801jd.A1e()));
                map.put(A0C(62, 27, 11), java.lang.String.valueOf(abstractC1801jd.A1Y()));
                map.put(A0C(27, 23, 96), java.lang.String.valueOf(abstractC1801jd.A0q()));
                return;
            case 604727084:
                java.lang.String A0C3 = A0C(50, 12, 97);
                if (A01[3].length() == 20) {
                    throw new java.lang.RuntimeException();
                }
                A01[3] = "p9FB";
                if (A10.equals(A0C3)) {
                    c = 0;
                    java.lang.String A0C22 = A0C(5, 10, 107);
                    switch (c) {
                    }
                    map.put(A0C(154, 8, 58), abstractC1801jd.A0u());
                    map.put(A0C(89, 21, 37), java.lang.String.valueOf(abstractC1801jd.A1e()));
                    map.put(A0C(62, 27, 11), java.lang.String.valueOf(abstractC1801jd.A1Y()));
                    map.put(A0C(27, 23, 96), java.lang.String.valueOf(abstractC1801jd.A0q()));
                    return;
                }
                c = 65535;
                java.lang.String A0C222 = A0C(5, 10, 107);
                switch (c) {
                }
                map.put(A0C(154, 8, 58), abstractC1801jd.A0u());
                map.put(A0C(89, 21, 37), java.lang.String.valueOf(abstractC1801jd.A1e()));
                map.put(A0C(62, 27, 11), java.lang.String.valueOf(abstractC1801jd.A1Y()));
                map.put(A0C(27, 23, 96), java.lang.String.valueOf(abstractC1801jd.A0q()));
                return;
            default:
                c = 65535;
                java.lang.String A0C2222 = A0C(5, 10, 107);
                switch (c) {
                }
                map.put(A0C(154, 8, 58), abstractC1801jd.A0u());
                map.put(A0C(89, 21, 37), java.lang.String.valueOf(abstractC1801jd.A1e()));
                map.put(A0C(62, 27, 11), java.lang.String.valueOf(abstractC1801jd.A1Y()));
                map.put(A0C(27, 23, 96), java.lang.String.valueOf(abstractC1801jd.A0q()));
                return;
        }
    }

    public static void A0d(android.view.View... viewArr) {
        for (android.view.View view : viewArr) {
            A0J(view);
        }
    }

    public static boolean A0e(int i) {
        return com.facebook.ads.redexgen.core.P3.A00(i) < 0.5d;
    }

    public static boolean A0f(com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq, java.util.Map<java.lang.String, java.lang.String> extraData) {
        boolean nonIabDestination = !A0C(162, 9, 82).equals(extraData.get(A0C(15, 12, 15)));
        boolean nonCtaClick = enumC0885Mq != com.facebook.ads.redexgen.core.EnumC0885Mq.A08;
        return nonIabDestination && nonCtaClick;
    }

    public static boolean A0g(com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq, java.util.Map<java.lang.String, java.lang.String> extraData) {
        boolean equals = A0C(162, 9, 82).equals(extraData.get(A0C(15, 12, 15)));
        boolean ctaClick = enumC0885Mq != com.facebook.ads.redexgen.core.EnumC0885Mq.A08;
        return equals && ctaClick;
    }

    public static boolean A0h(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq) {
        return enumC0885Mq == com.facebook.ads.redexgen.core.EnumC0885Mq.A08 && com.facebook.ads.redexgen.core.C1086Up.A2w(c1636gi);
    }
}
