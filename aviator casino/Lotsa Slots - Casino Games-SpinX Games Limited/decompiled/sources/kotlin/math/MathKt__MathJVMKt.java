package kotlin.math;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MathJVM.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0006\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\b\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0019\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010#\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010%\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010%\u001a\u00020\u0001*\u00020\u00012\u0006\u0010&\u001a\u00020'H\u0087\b\u001a\u0015\u0010(\u001a\u00020\u0001*\u00020\u00012\u0006\u0010)\u001a\u00020\u0001H\u0087\b\u001a\u0015\u00101\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0087\b\u001a\u0015\u00101\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001f\u001a\u00020'H\u0087\b\u001a\r\u00105\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u00106\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u00107\u001a\u00020\u0001*\u00020\u00012\u0006\u00108\u001a\u00020\u0001H\u0087\b\u001a\f\u00109\u001a\u00020'*\u00020\u0001H\u0007\u001a\f\u0010:\u001a\u00020;*\u00020\u0001H\u0007\u001a\u0011\u0010\u0000\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0003\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0004\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0005\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0006\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0019\u0010\b\u001a\u00020<2\u0006\u0010\t\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\n\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u000b\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\f\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\r\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u000e\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0019\u0010\u0010\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<2\u0006\u0010\t\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0011\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0012\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0013\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0018\u0010\u0014\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020<H\u0007\u001a\u0011\u0010\u0016\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0017\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0010\u0010\u0018\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0007\u001a\u0011\u0010\u0019\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001a\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0007\u001a\u0011\u0010\u001d\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001f\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0019\u0010 \u001a\u00020<2\u0006\u0010!\u001a\u00020<2\u0006\u0010\"\u001a\u00020<H\u0087\b\u001a\u0019\u0010#\u001a\u00020<2\u0006\u0010!\u001a\u00020<2\u0006\u0010\"\u001a\u00020<H\u0087\b\u001a\u0011\u0010$\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0015\u0010%\u001a\u00020<*\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0015\u0010%\u001a\u00020<*\u00020<2\u0006\u0010&\u001a\u00020'H\u0087\b\u001a\u0015\u0010(\u001a\u00020<*\u00020<2\u0006\u0010)\u001a\u00020<H\u0087\b\u001a\u0015\u00101\u001a\u00020<*\u00020<2\u0006\u0010\u001f\u001a\u00020<H\u0087\b\u001a\u0015\u00101\u001a\u00020<*\u00020<2\u0006\u0010\u001f\u001a\u00020'H\u0087\b\u001a\r\u00105\u001a\u00020<*\u00020<H\u0087\b\u001a\r\u00106\u001a\u00020<*\u00020<H\u0087\b\u001a\u0015\u00107\u001a\u00020<*\u00020<2\u0006\u00108\u001a\u00020<H\u0087\b\u001a\f\u00109\u001a\u00020'*\u00020<H\u0007\u001a\f\u0010:\u001a\u00020;*\u00020<H\u0007\u001a\u0011\u0010\u001e\u001a\u00020'2\u0006\u0010&\u001a\u00020'H\u0087\b\u001a\u0019\u0010 \u001a\u00020'2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020'H\u0087\b\u001a\u0019\u0010#\u001a\u00020'2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020'H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020;2\u0006\u0010&\u001a\u00020;H\u0087\b\u001a\u0019\u0010 \u001a\u00020;2\u0006\u0010!\u001a\u00020;2\u0006\u0010\"\u001a\u00020;H\u0087\b\u001a\u0019\u0010#\u001a\u00020;2\u0006\u0010!\u001a\u00020;2\u0006\u0010\"\u001a\u00020;H\u0087\b\"\u001f\u0010*\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u001f\u0010\u001f\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010,\u001a\u0004\b0\u0010.\"\u001f\u00102\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010,\u001a\u0004\b4\u0010.\"\u001f\u0010*\u001a\u00020<*\u00020<8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010=\u001a\u0004\b-\u0010>\"\u001f\u0010\u001f\u001a\u00020<*\u00020<8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010=\u001a\u0004\b0\u0010>\"\u001f\u00102\u001a\u00020<*\u00020<8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010=\u001a\u0004\b4\u0010>\"\u001f\u0010*\u001a\u00020'*\u00020'8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010?\u001a\u0004\b-\u0010@\"\u001e\u0010\u001f\u001a\u00020'*\u00020'8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010?\u001a\u0004\b0\u0010@\"\u001f\u0010*\u001a\u00020;*\u00020;8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010A\u001a\u0004\b-\u0010B\"\u001e\u0010\u001f\u001a\u00020'*\u00020;8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010A\u001a\u0004\b0\u0010C¨\u0006D"}, d2 = {"sin", "", "x", "cos", "tan", "asin", "acos", "atan", "atan2", "y", "sinh", "cosh", "tanh", "asinh", "acosh", "atanh", "hypot", "sqrt", com.facebook.AuthenticationTokenClaims.JSON_KEY_EXP, "expm1", "log", "base", com.facebook.appevents.UserDataStore.LAST_NAME, "log10", "log2", "ln1p", "ceil", "floor", "truncate", "round", "abs", "sign", "min", "a", "b", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "cbrt", "pow", com.ironsource.B5.q, "", "IEEErem", "divisor", "absoluteValue", "getAbsoluteValue$annotations", "(D)V", "getAbsoluteValue", "(D)D", "getSign$annotations", "getSign", "withSign", "ulp", "getUlp$annotations", "getUlp", "nextUp", "nextDown", "nextTowards", "to", "roundToInt", "roundToLong", "", "", "(F)V", "(F)F", "(I)V", "(I)I", "(J)V", "(J)J", "(J)I", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/math/MathKt")
/* loaded from: classes6.dex */
public class MathKt__MathJVMKt extends kotlin.math.MathKt__MathHKt {
    public static /* synthetic */ void getAbsoluteValue$annotations(double d) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(float f) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(int i) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(long j) {
    }

    public static /* synthetic */ void getSign$annotations(double d) {
    }

    public static /* synthetic */ void getSign$annotations(float f) {
    }

    public static /* synthetic */ void getSign$annotations(int i) {
    }

    public static /* synthetic */ void getSign$annotations(long j) {
    }

    public static /* synthetic */ void getUlp$annotations(double d) {
    }

    public static /* synthetic */ void getUlp$annotations(float f) {
    }

    private static final double sin(double d) {
        return java.lang.Math.sin(d);
    }

    private static final double cos(double d) {
        return java.lang.Math.cos(d);
    }

    private static final double tan(double d) {
        return java.lang.Math.tan(d);
    }

    private static final double asin(double d) {
        return java.lang.Math.asin(d);
    }

    private static final double acos(double d) {
        return java.lang.Math.acos(d);
    }

    private static final double atan(double d) {
        return java.lang.Math.atan(d);
    }

    private static final double atan2(double d, double d2) {
        return java.lang.Math.atan2(d, d2);
    }

    private static final double sinh(double d) {
        return java.lang.Math.sinh(d);
    }

    private static final double cosh(double d) {
        return java.lang.Math.cosh(d);
    }

    private static final double tanh(double d) {
        return java.lang.Math.tanh(d);
    }

    public static final double asinh(double d) {
        if (d < kotlin.math.Constants.taylor_n_bound) {
            return d <= (-kotlin.math.Constants.taylor_n_bound) ? -kotlin.math.MathKt.asinh(-d) : java.lang.Math.abs(d) >= kotlin.math.Constants.taylor_2_bound ? d - (((d * d) * d) / 6) : d;
        }
        if (d <= kotlin.math.Constants.upper_taylor_n_bound) {
            return java.lang.Math.log(d + java.lang.Math.sqrt((d * d) + 1));
        }
        if (d > kotlin.math.Constants.upper_taylor_2_bound) {
            return java.lang.Math.log(d) + kotlin.math.Constants.LN2;
        }
        double d2 = d * 2;
        return java.lang.Math.log(d2 + (1 / d2));
    }

    public static final double acosh(double d) {
        if (d < 1.0d) {
            return Double.NaN;
        }
        if (d > kotlin.math.Constants.upper_taylor_2_bound) {
            return java.lang.Math.log(d) + kotlin.math.Constants.LN2;
        }
        double d2 = 1;
        double d3 = d - d2;
        if (d3 >= kotlin.math.Constants.taylor_n_bound) {
            return java.lang.Math.log(d + java.lang.Math.sqrt((d * d) - d2));
        }
        double sqrt = java.lang.Math.sqrt(d3);
        if (sqrt >= kotlin.math.Constants.taylor_2_bound) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return sqrt * java.lang.Math.sqrt(2.0d);
    }

    public static final double atanh(double d) {
        if (java.lang.Math.abs(d) < kotlin.math.Constants.taylor_n_bound) {
            return java.lang.Math.abs(d) > kotlin.math.Constants.taylor_2_bound ? d + (((d * d) * d) / 3) : d;
        }
        double d2 = 1;
        return java.lang.Math.log((d2 + d) / (d2 - d)) / 2;
    }

    private static final double hypot(double d, double d2) {
        return java.lang.Math.hypot(d, d2);
    }

    private static final double sqrt(double d) {
        return java.lang.Math.sqrt(d);
    }

    private static final double exp(double d) {
        return java.lang.Math.exp(d);
    }

    private static final double expm1(double d) {
        return java.lang.Math.expm1(d);
    }

    public static final double log(double d, double d2) {
        if (d2 <= 0.0d || d2 == 1.0d) {
            return Double.NaN;
        }
        return java.lang.Math.log(d) / java.lang.Math.log(d2);
    }

    private static final double ln(double d) {
        return java.lang.Math.log(d);
    }

    private static final double log10(double d) {
        return java.lang.Math.log10(d);
    }

    public static final double log2(double d) {
        return java.lang.Math.log(d) / kotlin.math.Constants.LN2;
    }

    private static final double ln1p(double d) {
        return java.lang.Math.log1p(d);
    }

    private static final double ceil(double d) {
        return java.lang.Math.ceil(d);
    }

    private static final double floor(double d) {
        return java.lang.Math.floor(d);
    }

    public static final double truncate(double d) {
        if (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d)) {
            return d;
        }
        if (d > 0.0d) {
            return java.lang.Math.floor(d);
        }
        return java.lang.Math.ceil(d);
    }

    private static final double round(double d) {
        return java.lang.Math.rint(d);
    }

    private static final double abs(double d) {
        return java.lang.Math.abs(d);
    }

    private static final double sign(double d) {
        return java.lang.Math.signum(d);
    }

    private static final double min(double d, double d2) {
        return java.lang.Math.min(d, d2);
    }

    private static final double max(double d, double d2) {
        return java.lang.Math.max(d, d2);
    }

    private static final double cbrt(double d) {
        return java.lang.Math.cbrt(d);
    }

    private static final double pow(double d, double d2) {
        return java.lang.Math.pow(d, d2);
    }

    private static final double pow(double d, int i) {
        return java.lang.Math.pow(d, i);
    }

    private static final double IEEErem(double d, double d2) {
        return java.lang.Math.IEEEremainder(d, d2);
    }

    private static final double getAbsoluteValue(double d) {
        return java.lang.Math.abs(d);
    }

    private static final double getSign(double d) {
        return java.lang.Math.signum(d);
    }

    private static final double withSign(double d, double d2) {
        return java.lang.Math.copySign(d, d2);
    }

    private static final double withSign(double d, int i) {
        return java.lang.Math.copySign(d, i);
    }

    private static final double getUlp(double d) {
        return java.lang.Math.ulp(d);
    }

    private static final double nextUp(double d) {
        return java.lang.Math.nextUp(d);
    }

    private static final double nextDown(double d) {
        return java.lang.Math.nextAfter(d, Double.NEGATIVE_INFINITY);
    }

    private static final double nextTowards(double d, double d2) {
        return java.lang.Math.nextAfter(d, d2);
    }

    public static final int roundToInt(double d) {
        if (java.lang.Double.isNaN(d)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) java.lang.Math.round(d);
    }

    public static final long roundToLong(double d) {
        if (java.lang.Double.isNaN(d)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(d);
    }

    private static final float sin(float f) {
        return (float) java.lang.Math.sin(f);
    }

    private static final float cos(float f) {
        return (float) java.lang.Math.cos(f);
    }

    private static final float tan(float f) {
        return (float) java.lang.Math.tan(f);
    }

    private static final float asin(float f) {
        return (float) java.lang.Math.asin(f);
    }

    private static final float acos(float f) {
        return (float) java.lang.Math.acos(f);
    }

    private static final float atan(float f) {
        return (float) java.lang.Math.atan(f);
    }

    private static final float atan2(float f, float f2) {
        return (float) java.lang.Math.atan2(f, f2);
    }

    private static final float sinh(float f) {
        return (float) java.lang.Math.sinh(f);
    }

    private static final float cosh(float f) {
        return (float) java.lang.Math.cosh(f);
    }

    private static final float tanh(float f) {
        return (float) java.lang.Math.tanh(f);
    }

    private static final float asinh(float f) {
        return (float) kotlin.math.MathKt.asinh(f);
    }

    private static final float acosh(float f) {
        return (float) kotlin.math.MathKt.acosh(f);
    }

    private static final float atanh(float f) {
        return (float) kotlin.math.MathKt.atanh(f);
    }

    private static final float hypot(float f, float f2) {
        return (float) java.lang.Math.hypot(f, f2);
    }

    private static final float sqrt(float f) {
        return (float) java.lang.Math.sqrt(f);
    }

    private static final float exp(float f) {
        return (float) java.lang.Math.exp(f);
    }

    private static final float expm1(float f) {
        return (float) java.lang.Math.expm1(f);
    }

    public static final float log(float f, float f2) {
        if (f2 <= 0.0f || f2 == 1.0f) {
            return Float.NaN;
        }
        return (float) (java.lang.Math.log(f) / java.lang.Math.log(f2));
    }

    private static final float ln(float f) {
        return (float) java.lang.Math.log(f);
    }

    private static final float log10(float f) {
        return (float) java.lang.Math.log10(f);
    }

    public static final float log2(float f) {
        return (float) (java.lang.Math.log(f) / kotlin.math.Constants.LN2);
    }

    private static final float ln1p(float f) {
        return (float) java.lang.Math.log1p(f);
    }

    private static final float ceil(float f) {
        return (float) java.lang.Math.ceil(f);
    }

    private static final float floor(float f) {
        return (float) java.lang.Math.floor(f);
    }

    public static final float truncate(float f) {
        double ceil;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isInfinite(f)) {
            return f;
        }
        if (f > 0.0f) {
            ceil = java.lang.Math.floor(f);
        } else {
            ceil = java.lang.Math.ceil(f);
        }
        return (float) ceil;
    }

    private static final float round(float f) {
        return (float) java.lang.Math.rint(f);
    }

    private static final float abs(float f) {
        return java.lang.Math.abs(f);
    }

    private static final float sign(float f) {
        return java.lang.Math.signum(f);
    }

    private static final float min(float f, float f2) {
        return java.lang.Math.min(f, f2);
    }

    private static final float max(float f, float f2) {
        return java.lang.Math.max(f, f2);
    }

    private static final float cbrt(float f) {
        return (float) java.lang.Math.cbrt(f);
    }

    private static final float pow(float f, float f2) {
        return (float) java.lang.Math.pow(f, f2);
    }

    private static final float pow(float f, int i) {
        return (float) java.lang.Math.pow(f, i);
    }

    private static final float IEEErem(float f, float f2) {
        return (float) java.lang.Math.IEEEremainder(f, f2);
    }

    private static final float getAbsoluteValue(float f) {
        return java.lang.Math.abs(f);
    }

    private static final float getSign(float f) {
        return java.lang.Math.signum(f);
    }

    private static final float withSign(float f, float f2) {
        return java.lang.Math.copySign(f, f2);
    }

    private static final float withSign(float f, int i) {
        return java.lang.Math.copySign(f, i);
    }

    private static final float getUlp(float f) {
        return java.lang.Math.ulp(f);
    }

    private static final float nextUp(float f) {
        return java.lang.Math.nextUp(f);
    }

    private static final float nextDown(float f) {
        return java.lang.Math.nextAfter(f, Double.NEGATIVE_INFINITY);
    }

    private static final float nextTowards(float f, float f2) {
        return java.lang.Math.nextAfter(f, f2);
    }

    public static final int roundToInt(float f) {
        if (java.lang.Float.isNaN(f)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(f);
    }

    public static final long roundToLong(float f) {
        return kotlin.math.MathKt.roundToLong(f);
    }

    private static final int abs(int i) {
        return java.lang.Math.abs(i);
    }

    private static final int min(int i, int i2) {
        return java.lang.Math.min(i, i2);
    }

    private static final int max(int i, int i2) {
        return java.lang.Math.max(i, i2);
    }

    private static final int getAbsoluteValue(int i) {
        return java.lang.Math.abs(i);
    }

    public static final int getSign(int i) {
        return java.lang.Integer.signum(i);
    }

    private static final long abs(long j) {
        return java.lang.Math.abs(j);
    }

    private static final long min(long j, long j2) {
        return java.lang.Math.min(j, j2);
    }

    private static final long max(long j, long j2) {
        return java.lang.Math.max(j, j2);
    }

    private static final long getAbsoluteValue(long j) {
        return java.lang.Math.abs(j);
    }

    public static final int getSign(long j) {
        return java.lang.Long.signum(j);
    }
}
