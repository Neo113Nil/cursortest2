package k3;

import android.util.Base64;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import e1.k;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m3.d;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1336a {
    public static final void b(StringBuilder sb, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        int i7 = fastJsonResponse$Field.f11379b;
        if (i7 == 11) {
            Class cls = fastJsonResponse$Field.f11385y;
            D.i(cls);
            sb.append(((AbstractC1336a) cls.cast(obj)).toString());
        } else {
            if (i7 != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(d.a((String) obj));
            sb.append("\"");
        }
    }

    public static final Object zaD(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        StringToIntConverter stringToIntConverter = fastJsonResponse$Field.f11377B;
        if (stringToIntConverter == null) {
            return obj;
        }
        String str = (String) stringToIntConverter.f11370c.get(((Integer) obj).intValue());
        return (str == null && stringToIntConverter.f11369b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        String str = fastJsonResponse$Field.f11383f;
        StringToIntConverter stringToIntConverter = fastJsonResponse$Field.f11377B;
        D.i(stringToIntConverter);
        HashMap hashMap = stringToIntConverter.f11369b;
        Integer num = (Integer) hashMap.get((String) obj);
        Integer num2 = num;
        if (num == null) {
            num2 = (Integer) hashMap.get("gms_unknown");
        }
        D.i(num2);
        int i7 = fastJsonResponse$Field.f11381d;
        switch (i7) {
            case 0:
                setIntegerInternal(fastJsonResponse$Field, str, num2.intValue());
                return;
            case 1:
                zaf(fastJsonResponse$Field, str, (BigInteger) num2);
                return;
            case 2:
                setLongInternal(fastJsonResponse$Field, str, ((Long) num2).longValue());
                return;
            case 3:
            default:
                throw new IllegalStateException(k.d(i7, "Unsupported type for conversion: "));
            case 4:
                zan(fastJsonResponse$Field, str, ((Double) num2).doubleValue());
                return;
            case 5:
                zab(fastJsonResponse$Field, str, (BigDecimal) num2);
                return;
            case 6:
                setBooleanInternal(fastJsonResponse$Field, str, ((Boolean) num2).booleanValue());
                return;
            case 7:
                setStringInternal(fastJsonResponse$Field, str, (String) num2);
                return;
            case 8:
            case 9:
                setDecodedBytesInternal(fastJsonResponse$Field, str, (byte[]) num2);
                return;
        }
    }

    public <T extends AbstractC1336a> void addConcreteTypeArrayInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends AbstractC1336a> void addConcreteTypeInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, T t7) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, FastJsonResponse$Field<?, ?>> getFieldMappings();

    public Object getFieldValue(FastJsonResponse$Field fastJsonResponse$Field) {
        String str = fastJsonResponse$Field.f11383f;
        if (fastJsonResponse$Field.f11385y == null) {
            return getValueObject(str);
        }
        if (!(getValueObject(str) == null)) {
            throw new IllegalStateException("Concrete field shouldn't be value object: " + fastJsonResponse$Field.f11383f);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(FastJsonResponse$Field fastJsonResponse$Field) {
        if (fastJsonResponse$Field.f11381d != 11) {
            return isPrimitiveFieldSet(fastJsonResponse$Field.f11383f);
        }
        if (fastJsonResponse$Field.f11382e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, boolean z4) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, int i7) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(FastJsonResponse$Field<?, ?> fastJsonResponse$Field, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, FastJsonResponse$Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            FastJsonResponse$Field<?, ?> fastJsonResponse$Field = fieldMappings.get(str);
            if (isFieldSet(fastJsonResponse$Field)) {
                Object zaD = zaD(fastJsonResponse$Field, getFieldValue(fastJsonResponse$Field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (zaD != null) {
                    switch (fastJsonResponse$Field.f11381d) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) zaD, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) zaD, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            m3.c.p(sb, (HashMap) zaD);
                            break;
                        default:
                            if (fastJsonResponse$Field.f11380c) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    if (i7 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i7);
                                    if (obj != null) {
                                        b(sb, fastJsonResponse$Field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                b(sb, fastJsonResponse$Field, zaD);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final void zaA(FastJsonResponse$Field fastJsonResponse$Field, String str) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, str);
        } else {
            setStringInternal(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, str);
        }
    }

    public final void zaB(FastJsonResponse$Field fastJsonResponse$Field, Map map) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, map);
        } else {
            setStringMapInternal(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, map);
        }
    }

    public final void zaC(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, arrayList);
        } else {
            setStringsInternal(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, arrayList);
        }
    }

    public final void zaa(FastJsonResponse$Field fastJsonResponse$Field, BigDecimal bigDecimal) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, bigDecimal);
        } else {
            zab(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, bigDecimal);
        }
    }

    public void zab(FastJsonResponse$Field fastJsonResponse$Field, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, arrayList);
        } else {
            zad(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, arrayList);
        }
    }

    public void zad(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(FastJsonResponse$Field fastJsonResponse$Field, BigInteger bigInteger) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, bigInteger);
        } else {
            zaf(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, bigInteger);
        }
    }

    public void zaf(FastJsonResponse$Field fastJsonResponse$Field, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, arrayList);
        } else {
            zah(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, arrayList);
        }
    }

    public void zah(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(FastJsonResponse$Field fastJsonResponse$Field, boolean z4) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, Boolean.valueOf(z4));
        } else {
            setBooleanInternal(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, z4);
        }
    }

    public final void zaj(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, arrayList);
        } else {
            zak(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, arrayList);
        }
    }

    public void zak(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(FastJsonResponse$Field fastJsonResponse$Field, byte[] bArr) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, bArr);
        } else {
            setDecodedBytesInternal(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, bArr);
        }
    }

    public final void zam(FastJsonResponse$Field fastJsonResponse$Field, double d7) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, Double.valueOf(d7));
        } else {
            zan(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, d7);
        }
    }

    public void zan(FastJsonResponse$Field fastJsonResponse$Field, String str, double d7) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, arrayList);
        } else {
            zap(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, arrayList);
        }
    }

    public void zap(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(FastJsonResponse$Field fastJsonResponse$Field, float f7) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, Float.valueOf(f7));
        } else {
            zar(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, f7);
        }
    }

    public void zar(FastJsonResponse$Field fastJsonResponse$Field, String str, float f7) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, arrayList);
        } else {
            zat(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, arrayList);
        }
    }

    public void zat(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(FastJsonResponse$Field fastJsonResponse$Field, int i7) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, Integer.valueOf(i7));
        } else {
            setIntegerInternal(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, i7);
        }
    }

    public final void zav(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, arrayList);
        } else {
            zaw(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, arrayList);
        }
    }

    public void zaw(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(FastJsonResponse$Field fastJsonResponse$Field, long j) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, Long.valueOf(j));
        } else {
            setLongInternal(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, j);
        }
    }

    public final void zay(FastJsonResponse$Field fastJsonResponse$Field, ArrayList arrayList) {
        if (fastJsonResponse$Field.f11377B != null) {
            a(fastJsonResponse$Field, arrayList);
        } else {
            zaz(fastJsonResponse$Field, fastJsonResponse$Field.f11383f, arrayList);
        }
    }

    public void zaz(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
