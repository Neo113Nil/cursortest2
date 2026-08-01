package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Marker;

/* compiled from: OperatorBasicArithmetic.java */
/* loaded from: classes6.dex */
public class e {
    private static final List<String> b = Arrays.asList(Marker.ANY_NON_NULL_MARKER, "-", "*", "/", "%");

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f8927a;

    public e(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f8927a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8 A[Catch: Exception -> 0x00f6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f6, blocks: (B:10:0x001e, B:41:0x007b, B:43:0x0083, B:44:0x0091, B:45:0x0098, B:46:0x0099, B:48:0x00a1, B:49:0x00c4, B:50:0x00cb, B:51:0x00cc, B:52:0x00da, B:53:0x00e8, B:54:0x003b, B:57:0x0044, B:60:0x004e, B:63:0x0058, B:66:0x0062), top: B:9:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        Double d;
        int hashCode;
        char c = 0;
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        Double a2 = a(obj);
        Double a3 = a(obj2);
        if (a2 == null || a3 == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        try {
            hashCode = str.hashCode();
        } catch (Exception e) {
            q0.b("BasicArithmeticOperator", e.getMessage());
        }
        if (hashCode == 37) {
            if (str.equals("%")) {
                c = 4;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else if (hashCode == 45) {
            if (str.equals("-")) {
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else if (hashCode == 47) {
            if (str.equals("/")) {
                c = 3;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else if (hashCode != 42) {
            if (hashCode == 43 && str.equals(Marker.ANY_NON_NULL_MARKER)) {
                if (c != 0) {
                    d = Double.valueOf(a2.doubleValue() + a3.doubleValue());
                } else if (c == 1) {
                    d = Double.valueOf(a2.doubleValue() - a3.doubleValue());
                } else if (c == 2) {
                    d = Double.valueOf(a2.doubleValue() * a3.doubleValue());
                } else if (c != 3) {
                    if (c != 4) {
                        d = null;
                    } else {
                        if (a3.doubleValue() == 0.0d) {
                            throw new ArithmeticException("Modulo by zero");
                        }
                        d = Double.valueOf(a2.doubleValue() % a3.doubleValue());
                    }
                } else {
                    if (a3.doubleValue() == 0.0d) {
                        throw new ArithmeticException("Division by zero");
                    }
                    d = Double.valueOf(new BigDecimal(a2.doubleValue()).divide(new BigDecimal(a3.doubleValue()), 10, RoundingMode.HALF_UP).doubleValue());
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else {
            if (str.equals("*")) {
                c = 2;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
        if (!(d instanceof Double)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        double doubleValue = d.doubleValue();
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(doubleValue) ? Integer.valueOf(d.intValue()) : Double.valueOf(b(doubleValue)));
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Double a(Object obj) {
        if (obj == null) {
            return Double.valueOf(0.0d);
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        try {
            return Double.valueOf(Double.parseDouble(String.valueOf(obj)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private boolean a(double d) {
        return (Double.isNaN(d) || Double.isInfinite(d) || d != Math.floor(d)) ? false : true;
    }

    private double b(double d) {
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
