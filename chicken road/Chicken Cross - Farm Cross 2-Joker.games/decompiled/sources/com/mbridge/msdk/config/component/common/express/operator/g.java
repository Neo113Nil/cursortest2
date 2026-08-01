package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: OperatorCompoundAssignment.java */
/* loaded from: classes6.dex */
public class g {
    private static final List<String> b = Arrays.asList("+=", "-=", "*=", "/=", "%=");

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f8929a;

    public g(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f8929a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String str2;
        Object obj2;
        Object a2 = a(list);
        if (obj instanceof com.mbridge.msdk.config.component.common.express.entities.a) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar = (com.mbridge.msdk.config.component.common.express.entities.a) obj;
            str2 = aVar.a();
            obj2 = aVar.b();
        } else {
            str2 = "";
            obj2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (obj2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj2;
            return a(aVar2, str2, str, aVar2.b(str2), a2);
        }
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            return a(map, str2, str, map.get(str2), a2);
        }
        if (obj2 instanceof List) {
            try {
                int parseInt = Integer.parseInt(str2);
                if (parseInt >= 0 && parseInt < ((List) obj2).size()) {
                    return a((List) obj2, parseInt, str, ((List) obj2).get(parseInt), a2);
                }
                q0.b("CompoundAssignOp", "List index out of bounds: " + str2 + ", list size: " + ((List) obj2).size());
            } catch (NumberFormatException unused) {
                q0.b("CompoundAssignOp", "Invalid list index: " + str2);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        String trim = str.trim();
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            if (trim.equals(it.next())) {
                return b(trim, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str, String str2, Object obj, Object obj2) {
        Object valueOf;
        Double a2 = a(obj);
        Double a3 = a(obj2);
        if (a2 != null && a3 != null) {
            try {
                Object a4 = a(a2, a3, str2);
                if (a4 instanceof Double) {
                    double doubleValue = ((Double) a4).doubleValue();
                    if (a(doubleValue)) {
                        valueOf = Integer.valueOf(((Double) a4).intValue());
                    } else {
                        valueOf = Double.valueOf(b(doubleValue));
                    }
                    if (aVar != null) {
                        aVar.a(str, valueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(valueOf);
                }
            } catch (Exception e) {
                q0.b("CompoundAssignOp", e.getMessage(), e);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private double b(double d) {
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Map map, String str, String str2, Object obj, Object obj2) {
        Object valueOf;
        Double a2 = a(obj);
        Double a3 = a(obj2);
        if (a2 != null && a3 != null) {
            try {
                Object a4 = a(a2, a3, str2);
                if (a4 instanceof Double) {
                    double doubleValue = ((Double) a4).doubleValue();
                    if (a(doubleValue)) {
                        valueOf = Integer.valueOf(((Double) a4).intValue());
                    } else {
                        valueOf = Double.valueOf(b(doubleValue));
                    }
                    if (map != null) {
                        map.put(str, valueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(valueOf);
                }
            } catch (Exception e) {
                q0.b("CompoundAssignOp", e.getMessage(), e);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(List list, int i, String str, Object obj, Object obj2) {
        Object valueOf;
        Double a2 = a(obj);
        Double a3 = a(obj2);
        if (a2 != null && a3 != null) {
            try {
                Object a4 = a(a2, a3, str);
                if (a4 instanceof Double) {
                    double doubleValue = ((Double) a4).doubleValue();
                    if (a(doubleValue)) {
                        valueOf = Integer.valueOf(((Double) a4).intValue());
                    } else {
                        valueOf = Double.valueOf(b(doubleValue));
                    }
                    if (list != null) {
                        list.set(i, valueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(valueOf);
                }
            } catch (Exception e) {
                q0.b("CompoundAssignOp", e.getMessage(), e);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private Double a(Object obj) {
        if (obj == null) {
            return null;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb A[Catch: Exception -> 0x00d9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d9, blocks: (B:2:0x0000, B:23:0x005e, B:25:0x0066, B:27:0x0074, B:28:0x007b, B:29:0x007c, B:31:0x0084, B:33:0x00a7, B:34:0x00ae, B:35:0x00af, B:37:0x00bd, B:39:0x00cb, B:41:0x001d, B:44:0x0027, B:47:0x0031, B:50:0x003b, B:53:0x0045), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object a(Double d, Double d2, String str) {
        int hashCode;
        char c;
        try {
            hashCode = str.hashCode();
        } catch (Exception e) {
            q0.b("CompoundAssignOp", e.getMessage());
        }
        if (hashCode == 1208) {
            if (str.equals("%=")) {
                c = 4;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else if (hashCode == 1363) {
            if (str.equals("*=")) {
                c = 2;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else if (hashCode == 1394) {
            if (str.equals("+=")) {
                c = 0;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else if (hashCode != 1456) {
            if (hashCode == 1518 && str.equals("/=")) {
                c = 3;
                if (c != 0) {
                    return Double.valueOf(d.doubleValue() + d2.doubleValue());
                }
                if (c == 1) {
                    return Double.valueOf(d.doubleValue() - d2.doubleValue());
                }
                if (c == 2) {
                    return Double.valueOf(d.doubleValue() * d2.doubleValue());
                }
                if (c == 3) {
                    if (d2.doubleValue() != 0.0d) {
                        return Double.valueOf(new BigDecimal(d.doubleValue()).divide(new BigDecimal(d2.doubleValue()), 10, RoundingMode.HALF_UP).doubleValue());
                    }
                    throw new ArithmeticException("Division by zero");
                }
                if (c != 4) {
                    return null;
                }
                if (d2.doubleValue() != 0.0d) {
                    return Double.valueOf(d.doubleValue() % d2.doubleValue());
                }
                throw new ArithmeticException("Modulo by zero");
            }
            c = 65535;
            if (c != 0) {
            }
        } else {
            if (str.equals("-=")) {
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
    }

    private boolean a(double d) {
        return (Double.isNaN(d) || Double.isInfinite(d) || d != Math.floor(d)) ? false : true;
    }
}
