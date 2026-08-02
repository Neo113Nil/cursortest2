package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public abstract class XP {
    public static byte[] A00;
    public static String[] A01 = {"aXQ8cQ350VCAT2mitcvykUGHubvGx6C9", "NAK0YApfoevBcA8nU2", "YHwKc8bJ3fYIczYaga21kucMEh7K8adi", "qYAOAoZ496ND8", "6pHjubFxbGGqNA8P9d", "3r9qhhsI1oDbETggKvxV5tdwn", "sRn13xQSljRP603ULBb8dNJbjS", "vNgqutu69Vtz3tnibxv52jRaXo"};
    public static final int A02;
    public static final int A03;
    public static final ConcurrentHashMap<Integer, Integer> A04;
    public static final AtomicInteger A05;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A00 = new byte[]{120, 118, -127, -127, 122, -121, 105, -114, -123, 122, -35, -26, -29, -35, -27, -39, -19, -23, -17, -20, -35, -33, -124, -121, -118, -110, -125, -112, -125, -126, 125, -127, -118, -121, -127, -119, 125, -126, -125, -118, Byte.MAX_VALUE, -105, 125, -117, -111, -40, -35, -29, -44, -31, -30, -29, -40, -29, -40, -48, -37, -39, -29, -49, -45, -47, -45, -49, -42, -39, -36, -28, -43, -30, -49, -45, -36, -39, -45, -37, -29, -49, -33, -34, -49, -45, -28, -47, -125, -115, 121, 125, -116, Byte.MAX_VALUE, 123, -114, -125, -112, Byte.MAX_VALUE, 121, 123, -115, 121, 125, -114, 123, 121, -112, 76, -90, -103, -85, -107, -90, -104, -103, -104, -109, -86, -99, -104, -103, -93, -50, -53, -66, -53, -48, -53, -119, -55, -63, -64, -59, -47, -55, -11, -29, -16, -11, -81, -11, -25, -12, -21, -24, -81, -17, -25, -26, -21, -9, -17, -36, -43, -48, -40, -36, -52, -80, -53, -66, -68, -82, -69, -84, -75, -78, -84, -76};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0e(C1153dL c1153dL, ME me, Map<String, String> map) {
        String str = map.get(A0B(84, 21, 11));
        boolean z = str != null && str.equals(Boolean.TRUE.toString());
        if (z && (A0d(c1153dL, me) || A0b(me, map))) {
            return true;
        }
        String str2 = map.get(A0B(57, 27, 97));
        return z && (str2 != null && str2.equals(Boolean.TRUE.toString())) && A0c(me, map);
    }

    static {
        A0C();
        A03 = OP.A02(-1, 0);
        A02 = OP.A02(-16777216, 115);
        A05 = new AtomicInteger(1);
        A04 = new ConcurrentHashMap<>();
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
        return (int) TypedValue.applyDimension(2, i, AbstractC0856Wl.A04);
    }

    public static int A02(int i) {
        if (A0a(i)) {
            return OP.A05(i, -1, 0.4f);
        }
        return OP.A05(i, -16777216, 0.2f);
    }

    public static int A03(TextView textView) {
        Layout layout;
        int lineCount;
        if (textView == null || textView.getLayout() == null || (lineCount = (layout = textView.getLayout()).getLineCount()) <= 0) {
            return 0;
        }
        double ellipsisCount = layout.getEllipsisCount(lineCount - 1);
        double ellipsisCount2 = ellipsisCount / (textView.getText().length() - ellipsisCount);
        if (A01[3].length() == 20) {
            throw new RuntimeException();
        }
        A01[3] = "IkK7ljd8WWfE470H6O9Fo";
        return (int) Math.ceil(ellipsisCount2);
    }

    public static int A04(TextView textView, int i) {
        int lineHeightTitle = A03(textView);
        int lines = 0;
        int extraLinesRequired = textView.getLineHeight();
        while (i > extraLinesRequired && lines < lineHeightTitle) {
            lines++;
            i -= extraLinesRequired;
        }
        return lines;
    }

    public static Drawable A05(int i, int i2) {
        return A08(i, A02(i), i2);
    }

    public static Drawable A06(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        return gradientDrawable;
    }

    public static Drawable A07(int i, int i2) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, i2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    public static Drawable A08(int i, int i2, int i3) {
        return A09(i, i2, i, i3);
    }

    public static Drawable A09(int i, int i2, int i3, int i4) {
        return new RippleDrawable(ColorStateList.valueOf(i2), A06(i, i4), A07(i3, i4));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TextView A0A(ViewGroup viewGroup) {
        for (int i = 0; i < i; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (A01[3].length() == 20) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "6RJtTYzLBnUcHRvsTatmkmWKIun16hlE";
                strArr[2] = "BwINbhkVgYMYeGJED3O8k6L5SNrYNN6g";
                return textView;
            }
            if (childAt instanceof ViewGroup) {
                A0A((ViewGroup) childAt);
            }
        }
        return null;
    }

    public static void A0D(int i, View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i / 3);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration((i / 3) * 2);
        scaleAnimation2.setInterpolator(new BounceInterpolator());
        scaleAnimation.setAnimationListener(new C0660Os(view, scaleAnimation2));
        view.startAnimation(scaleAnimation);
    }

    public static void A0E(int i, View view) {
        Integer viewId = A04.get(Integer.valueOf(i));
        if (viewId != null) {
            view.setId(viewId.intValue());
        } else {
            A0I(view);
        }
    }

    public static void A0F(View view) {
        A0L(view, 8);
    }

    public static void A0G(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            A0R((ViewGroup) parent);
        }
    }

    public static void A0H(View view) {
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (A01[3].length() == 20) {
            throw new RuntimeException();
        }
        A01[3] = "DU33ZJN3ug5gIBKNKyYbqVVAVCFz";
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static void A0I(View view) {
        if (view == null) {
            return;
        }
        view.setId(View.generateViewId());
    }

    public static void A0J(View view) {
        A0L(view, 0);
    }

    public static void A0K(View view, int i) {
        view.setBackground(new ColorDrawable(i));
    }

    public static void A0L(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static void A0M(View view, int i, int i2) {
        A0Q(view, A08(i, A02(i), i2));
    }

    public static void A0N(View view, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setStroke(i2, i3);
        A0Q(view, gradientDrawable);
    }

    public static void A0O(View view, int i, int i2, int i3) {
        A0Q(view, A09(i, A02(i), i2, i3));
    }

    public static void A0P(View view, Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(0.0f);
        A0Q(view, gradientDrawable);
    }

    public static void A0Q(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void A0R(ViewGroup viewGroup) {
        A0S(viewGroup, 200);
    }

    public static void A0S(ViewGroup viewGroup, int i) {
        A0U(viewGroup, new AutoTransition(), i);
    }

    public static void A0T(ViewGroup viewGroup, Transition transition) {
        A0U(viewGroup, transition, 200);
    }

    public static void A0U(ViewGroup viewGroup, Transition transition, int i) {
        transition.setDuration(i);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    public static void A0V(Button button) {
        Typeface typeface = Typeface.create(A0B(119, 13, 77), 0);
        button.setTypeface(typeface);
    }

    public static void A0W(TextView textView, boolean z, int i) {
        Typeface typeface;
        if (z) {
            typeface = Typeface.create(A0B(Opcodes.IINC, 17, 115), 0);
        } else {
            Typeface typeface2 = Typeface.SANS_SERIF;
            typeface = Typeface.create(typeface2, 0);
        }
        textView.setTypeface(typeface);
        if (A01[5].length() != 25) {
            throw new RuntimeException();
        }
        A01[3] = "EYVeEO4Fu";
        textView.setTextSize(2, i);
    }

    public static void A0X(Toast toast, String str, int i, int i2, int i3) {
        if (toast == null) {
            return;
        }
        toast.setGravity(i, i2, i3);
        TextView A0A = A0A((ViewGroup) toast.getView());
        if (A0A != null) {
            A0A.setText(str);
            A0A.setGravity(17);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0Y(Map<String, String> map, AbstractC1428hy abstractC1428hy) {
        char c;
        if (abstractC1428hy == null) {
            return;
        }
        String A0v = abstractC1428hy.A0v();
        switch (A0v.hashCode()) {
            case -1364000502:
                if (A0v.equals(A0B(105, 14, 37))) {
                    c = 1;
                    String A0B = A0B(0, 10, 6);
                    switch (c) {
                        case 0:
                            map.put(A0B, AdPlacementType.INTERSTITIAL.name());
                            break;
                        case 1:
                            map.put(A0B, AdPlacementType.REWARDED_VIDEO.name());
                            break;
                    }
                    map.put(A0B(Opcodes.FCMPL, 8, 88), abstractC1428hy.A0q());
                    map.put(A0B(84, 21, 11), String.valueOf(abstractC1428hy.A1W()));
                    map.put(A0B(57, 27, 97), String.valueOf(abstractC1428hy.A1R()));
                    map.put(A0B(22, 23, 15), String.valueOf(abstractC1428hy.A0n()));
                    return;
                }
                c = 65535;
                String A0B2 = A0B(0, 10, 6);
                switch (c) {
                }
                map.put(A0B(Opcodes.FCMPL, 8, 88), abstractC1428hy.A0q());
                map.put(A0B(84, 21, 11), String.valueOf(abstractC1428hy.A1W()));
                map.put(A0B(57, 27, 97), String.valueOf(abstractC1428hy.A1R()));
                map.put(A0B(22, 23, 15), String.valueOf(abstractC1428hy.A0n()));
                return;
            case 604727084:
                String A0B3 = A0B(45, 12, 96);
                if (A01[3].length() == 20) {
                    throw new RuntimeException();
                }
                A01[3] = "p9FB";
                if (A0v.equals(A0B3)) {
                    c = 0;
                    String A0B22 = A0B(0, 10, 6);
                    switch (c) {
                    }
                    map.put(A0B(Opcodes.FCMPL, 8, 88), abstractC1428hy.A0q());
                    map.put(A0B(84, 21, 11), String.valueOf(abstractC1428hy.A1W()));
                    map.put(A0B(57, 27, 97), String.valueOf(abstractC1428hy.A1R()));
                    map.put(A0B(22, 23, 15), String.valueOf(abstractC1428hy.A0n()));
                    return;
                }
                c = 65535;
                String A0B222 = A0B(0, 10, 6);
                switch (c) {
                }
                map.put(A0B(Opcodes.FCMPL, 8, 88), abstractC1428hy.A0q());
                map.put(A0B(84, 21, 11), String.valueOf(abstractC1428hy.A1W()));
                map.put(A0B(57, 27, 97), String.valueOf(abstractC1428hy.A1R()));
                map.put(A0B(22, 23, 15), String.valueOf(abstractC1428hy.A0n()));
                return;
            default:
                c = 65535;
                String A0B2222 = A0B(0, 10, 6);
                switch (c) {
                }
                map.put(A0B(Opcodes.FCMPL, 8, 88), abstractC1428hy.A0q());
                map.put(A0B(84, 21, 11), String.valueOf(abstractC1428hy.A1W()));
                map.put(A0B(57, 27, 97), String.valueOf(abstractC1428hy.A1R()));
                map.put(A0B(22, 23, 15), String.valueOf(abstractC1428hy.A0n()));
                return;
        }
    }

    public static void A0Z(View... viewArr) {
        for (View view : viewArr) {
            A0H(view);
        }
    }

    public static boolean A0a(int i) {
        return OP.A00(i) < 0.5d;
    }

    public static boolean A0b(ME me, Map<String, String> extraData) {
        boolean nonIabDestination = !A0B(157, 9, 58).equals(extraData.get(A0B(10, 12, 107)));
        boolean nonCtaClick = me != ME.A08;
        return nonIabDestination && nonCtaClick;
    }

    public static boolean A0c(ME me, Map<String, String> extraData) {
        boolean equals = A0B(157, 9, 58).equals(extraData.get(A0B(10, 12, 107)));
        boolean ctaClick = me != ME.A08;
        return equals && ctaClick;
    }

    public static boolean A0d(C1153dL c1153dL, ME me) {
        return me == ME.A08 && U7.A2o(c1153dL);
    }
}
