package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: OperatorArray.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f8924a;

    public b(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f8924a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        List<Object> arrayList = obj instanceof List ? (List) obj : (obj == null || !obj.getClass().isArray()) ? null : new ArrayList(Arrays.asList(obj));
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        try {
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("860")) ? a() : str.equals(com.mbridge.msdk.config.component.common.util.c.c("861")) ? b(arrayList, obj2) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("862")) ? a(arrayList, obj2) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("863")) ? c(arrayList, obj2) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("864")) ? b(arrayList) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("865")) ? a(arrayList) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("866")) ? d(arrayList, obj2) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("867")) ? g(arrayList, obj2) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("868")) ? e(arrayList, obj2) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("869")) ? f(arrayList, obj2) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        } catch (Exception e) {
            q0.b("ArrayOperator", "Error handling array operation: " + str + ", " + e.getMessage(), e);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(List<Object> list, Object obj) {
        if (list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (!(obj instanceof List)) {
            if (list.contains(obj)) {
                list.remove(obj);
            } else if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                int size = list.size();
                if (intValue >= 0 && intValue <= size - 1) {
                    list.remove(intValue);
                }
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list);
        }
        for (Object obj2 : (List) obj) {
            if (list.contains(obj2)) {
                list.remove(obj2);
            } else if (obj2 instanceof Integer) {
                int intValue2 = ((Integer) obj2).intValue();
                int size2 = list.size();
                if (intValue2 >= 0 && intValue2 <= size2 - 1) {
                    list.remove(intValue2);
                }
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(List<Object> list, Object obj) {
        boolean z;
        if (list == null || obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
        }
        if (!(obj instanceof List)) {
            return list.contains(obj) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.TRUE) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
        }
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            if (!list.contains(it.next())) {
                z = false;
                break;
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(z));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(List<Object> list, Object obj) {
        int intValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
        if (obj instanceof String) {
            intValue = Integer.parseInt((String) obj);
        }
        return (intValue < 0 || intValue > list.size() + (-1)) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new ArrayList(list.subList(0, intValue)));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a f(List<Object> list, Object obj) {
        int intValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
        if (obj instanceof String) {
            intValue = Integer.parseInt((String) obj);
        }
        if (intValue < 0 || intValue > list.size() - 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        int size = list.size();
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new ArrayList(list.subList(size - intValue, size)));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a g(List<Object> list, Object obj) {
        if (list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            Object obj2 = list.get(i);
            if (obj2 instanceof String) {
                sb.append(obj2);
            } else if (obj2 != null) {
                sb.append(obj2.toString());
            }
            if (i < list.size() - 1 && obj != null) {
                sb.append(obj);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb.toString());
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : a(str) ? b(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new ArrayList());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(List<Object> list, Object obj) {
        if (list == null) {
            if (obj == null) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            list = new ArrayList<>();
        }
        if (obj instanceof List) {
            list.addAll((List) obj);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list);
        }
        q0.a("ArrayOperator", "ArrayAddFromArray rightObj is not List");
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(List<Object> list) {
        if (list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(0);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(list.size()));
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("860")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("861")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("862")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("863")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("864")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("865")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("866")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("867")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("868")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("869"));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(List<Object> list, Object obj) {
        if (list == null) {
            if (obj == null) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            list = new ArrayList<>();
        }
        list.add(obj);
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(List<Object> list) {
        if (list != null) {
            list.clear();
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(list);
    }
}
