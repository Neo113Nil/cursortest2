package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class a {

    public interface b<I, O> {
    }

    @NonNull
    public static final Object zaD(@NonNull C0113a c0113a, @Nullable Object obj) {
        b bVar = c0113a.m;
        if (bVar != null) {
            com.google.android.gms.common.server.converter.a aVar = (com.google.android.gms.common.server.converter.a) bVar;
            obj = (String) aVar.c.get(((Integer) obj).intValue());
            if (obj == null && aVar.b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zaE(C0113a c0113a, @Nullable Object obj) {
        int i = c0113a.d;
        b bVar = c0113a.m;
        C0875q.g(bVar);
        HashMap hashMap = ((com.google.android.gms.common.server.converter.a) bVar).b;
        Integer num = (Integer) hashMap.get((String) obj);
        Integer num2 = num;
        if (num == null) {
            num2 = (Integer) hashMap.get("gms_unknown");
        }
        C0875q.g(num2);
        String str = c0113a.f;
        switch (i) {
            case 0:
                setIntegerInternal(c0113a, str, num2.intValue());
                return;
            case 1:
                zaf(c0113a, str, (BigInteger) num2);
                return;
            case 2:
                setLongInternal(c0113a, str, ((Long) num2).longValue());
                return;
            case 3:
            default:
                throw new IllegalStateException(android.support.v4.media.a.a(i, "Unsupported type for conversion: "));
            case 4:
                zan(c0113a, str, ((Double) num2).doubleValue());
                return;
            case 5:
                zab(c0113a, str, (BigDecimal) num2);
                return;
            case 6:
                setBooleanInternal(c0113a, str, ((Boolean) num2).booleanValue());
                return;
            case 7:
                setStringInternal(c0113a, str, (String) num2);
                return;
            case 8:
            case 9:
                setDecodedBytesInternal(c0113a, str, (byte[]) num2);
                return;
        }
    }

    private static final void zaF(StringBuilder sb, C0113a c0113a, Object obj) {
        int i = c0113a.b;
        if (i == 11) {
            Class cls = c0113a.j;
            C0875q.g(cls);
            sb.append(((a) cls.cast(obj)).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(JsonUtils.escapeString((String) obj));
            sb.append("\"");
        }
    }

    private static final void zaG(String str) {
        Log.isLoggable("FastJsonResponse", 6);
    }

    public <T extends a> void addConcreteTypeArrayInternal(@NonNull C0113a c0113a, @NonNull String str, @Nullable ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends a> void addConcreteTypeInternal(@NonNull C0113a c0113a, @NonNull String str, @NonNull T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @NonNull
    public abstract Map<String, C0113a<?, ?>> getFieldMappings();

    @Nullable
    public Object getFieldValue(@NonNull C0113a c0113a) {
        String str = c0113a.f;
        if (c0113a.j == null) {
            return getValueObject(str);
        }
        boolean z = getValueObject(str) == null;
        String str2 = c0113a.f;
        if (!z) {
            throw new IllegalStateException(defpackage.g.a("Concrete field shouldn't be value object: ", str2));
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    public abstract Object getValueObject(@NonNull String str);

    public boolean isFieldSet(@NonNull C0113a c0113a) {
        if (c0113a.d != 11) {
            return isPrimitiveFieldSet(c0113a.f);
        }
        if (c0113a.e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(@NonNull String str);

    public void setBooleanInternal(@NonNull C0113a<?, ?> c0113a, @NonNull String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(@NonNull C0113a<?, ?> c0113a, @NonNull String str, @Nullable byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(@NonNull C0113a<?, ?> c0113a, @NonNull String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(@NonNull C0113a<?, ?> c0113a, @NonNull String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(@NonNull C0113a<?, ?> c0113a, @NonNull String str, @Nullable String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(@NonNull C0113a<?, ?> c0113a, @NonNull String str, @Nullable Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(@NonNull C0113a<?, ?> c0113a, @NonNull String str, @Nullable ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    @NonNull
    public String toString() {
        Map<String, C0113a<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            C0113a<?, ?> c0113a = fieldMappings.get(str);
            if (isFieldSet(c0113a)) {
                Object zaD = zaD(c0113a, getFieldValue(c0113a));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (zaD != null) {
                    switch (c0113a.d) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.encode((byte[]) zaD));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe((byte[]) zaD));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.writeStringMapToJson(sb, (HashMap) zaD);
                            break;
                        default:
                            if (c0113a.c) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        zaF(sb, c0113a, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                zaF(sb, c0113a, zaD);
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

    public final void zaA(@NonNull C0113a c0113a, @Nullable String str) {
        if (c0113a.m != null) {
            zaE(c0113a, str);
        } else {
            setStringInternal(c0113a, c0113a.f, str);
        }
    }

    public final void zaB(@NonNull C0113a c0113a, @Nullable Map map) {
        if (c0113a.m != null) {
            zaE(c0113a, map);
        } else {
            setStringMapInternal(c0113a, c0113a.f, map);
        }
    }

    public final void zaC(@NonNull C0113a c0113a, @Nullable ArrayList arrayList) {
        if (c0113a.m != null) {
            zaE(c0113a, arrayList);
        } else {
            setStringsInternal(c0113a, c0113a.f, arrayList);
        }
    }

    public final void zaa(@NonNull C0113a c0113a, @Nullable BigDecimal bigDecimal) {
        if (c0113a.m != null) {
            zaE(c0113a, bigDecimal);
        } else {
            zab(c0113a, c0113a.f, bigDecimal);
        }
    }

    public void zab(@NonNull C0113a c0113a, @NonNull String str, @Nullable BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(@NonNull C0113a c0113a, @Nullable ArrayList arrayList) {
        if (c0113a.m != null) {
            zaE(c0113a, arrayList);
        } else {
            zad(c0113a, c0113a.f, arrayList);
        }
    }

    public void zad(@NonNull C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(@NonNull C0113a c0113a, @Nullable BigInteger bigInteger) {
        if (c0113a.m != null) {
            zaE(c0113a, bigInteger);
        } else {
            zaf(c0113a, c0113a.f, bigInteger);
        }
    }

    public void zaf(@NonNull C0113a c0113a, @NonNull String str, @Nullable BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(@NonNull C0113a c0113a, @Nullable ArrayList arrayList) {
        if (c0113a.m != null) {
            zaE(c0113a, arrayList);
        } else {
            zah(c0113a, c0113a.f, arrayList);
        }
    }

    public void zah(@NonNull C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(@NonNull C0113a c0113a, boolean z) {
        if (c0113a.m != null) {
            zaE(c0113a, Boolean.valueOf(z));
        } else {
            setBooleanInternal(c0113a, c0113a.f, z);
        }
    }

    public final void zaj(@NonNull C0113a c0113a, @Nullable ArrayList arrayList) {
        if (c0113a.m != null) {
            zaE(c0113a, arrayList);
        } else {
            zak(c0113a, c0113a.f, arrayList);
        }
    }

    public void zak(@NonNull C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(@NonNull C0113a c0113a, @Nullable byte[] bArr) {
        if (c0113a.m != null) {
            zaE(c0113a, bArr);
        } else {
            setDecodedBytesInternal(c0113a, c0113a.f, bArr);
        }
    }

    public final void zam(@NonNull C0113a c0113a, double d) {
        if (c0113a.m != null) {
            zaE(c0113a, Double.valueOf(d));
        } else {
            zan(c0113a, c0113a.f, d);
        }
    }

    public void zan(@NonNull C0113a c0113a, @NonNull String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(@NonNull C0113a c0113a, @Nullable ArrayList arrayList) {
        if (c0113a.m != null) {
            zaE(c0113a, arrayList);
        } else {
            zap(c0113a, c0113a.f, arrayList);
        }
    }

    public void zap(@NonNull C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(@NonNull C0113a c0113a, float f) {
        if (c0113a.m != null) {
            zaE(c0113a, Float.valueOf(f));
        } else {
            zar(c0113a, c0113a.f, f);
        }
    }

    public void zar(@NonNull C0113a c0113a, @NonNull String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(@NonNull C0113a c0113a, @Nullable ArrayList arrayList) {
        if (c0113a.m != null) {
            zaE(c0113a, arrayList);
        } else {
            zat(c0113a, c0113a.f, arrayList);
        }
    }

    public void zat(@NonNull C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(@NonNull C0113a c0113a, int i) {
        if (c0113a.m != null) {
            zaE(c0113a, Integer.valueOf(i));
        } else {
            setIntegerInternal(c0113a, c0113a.f, i);
        }
    }

    public final void zav(@NonNull C0113a c0113a, @Nullable ArrayList arrayList) {
        if (c0113a.m != null) {
            zaE(c0113a, arrayList);
        } else {
            zaw(c0113a, c0113a.f, arrayList);
        }
    }

    public void zaw(@NonNull C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(@NonNull C0113a c0113a, long j) {
        if (c0113a.m != null) {
            zaE(c0113a, Long.valueOf(j));
        } else {
            setLongInternal(c0113a, c0113a.f, j);
        }
    }

    public final void zay(@NonNull C0113a c0113a, @Nullable ArrayList arrayList) {
        if (c0113a.m != null) {
            zaE(c0113a, arrayList);
        } else {
            zaz(c0113a, c0113a.f, arrayList);
        }
    }

    public void zaz(@NonNull C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    /* renamed from: com.google.android.gms.common.server.response.a$a, reason: collision with other inner class name */
    public static class C0113a<I, O> extends com.google.android.gms.common.internal.safeparcel.a {
        public static final d CREATOR = new d();
        public final int a;
        public final int b;
        public final boolean c;
        public final int d;
        public final boolean e;

        @NonNull
        public final String f;
        public final int i;

        @Nullable
        public final Class j;

        @Nullable
        public final String k;
        public h l;

        @Nullable
        public final b m;

        public C0113a(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, @Nullable String str2, @Nullable com.google.android.gms.common.server.converter.b bVar) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = i3;
            this.e = z2;
            this.f = str;
            this.i = i4;
            if (str2 == null) {
                this.j = null;
                this.k = null;
            } else {
                this.j = c.class;
                this.k = str2;
            }
            if (bVar == null) {
                this.m = null;
                return;
            }
            com.google.android.gms.common.server.converter.a aVar = bVar.b;
            if (aVar == null) {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            this.m = aVar;
        }

        @NonNull
        public static C0113a l(int i, @NonNull String str) {
            return new C0113a(7, true, 7, true, str, i, null);
        }

        @NonNull
        public final String toString() {
            C0874p.a aVar = new C0874p.a(this);
            aVar.a(Integer.valueOf(this.a), "versionCode");
            aVar.a(Integer.valueOf(this.b), "typeIn");
            aVar.a(Boolean.valueOf(this.c), "typeInArray");
            aVar.a(Integer.valueOf(this.d), "typeOut");
            aVar.a(Boolean.valueOf(this.e), "typeOutArray");
            aVar.a(this.f, "outputFieldName");
            aVar.a(Integer.valueOf(this.i), "safeParcelFieldId");
            String str = this.k;
            if (str == null) {
                str = null;
            }
            aVar.a(str, "concreteTypeName");
            Class cls = this.j;
            if (cls != null) {
                aVar.a(cls.getCanonicalName(), "concreteType.class");
            }
            b bVar = this.m;
            if (bVar != null) {
                aVar.a(bVar.getClass().getCanonicalName(), "converterName");
            }
            return aVar.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
            parcel.writeInt(this.a);
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
            parcel.writeInt(this.b);
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
            parcel.writeInt(this.c ? 1 : 0);
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 4);
            parcel.writeInt(this.d);
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 5, 4);
            parcel.writeInt(this.e ? 1 : 0);
            com.google.android.gms.common.internal.safeparcel.c.l(parcel, 6, this.f, false);
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, 7, 4);
            parcel.writeInt(this.i);
            com.google.android.gms.common.server.converter.b bVar = null;
            String str = this.k;
            if (str == null) {
                str = null;
            }
            com.google.android.gms.common.internal.safeparcel.c.l(parcel, 8, str, false);
            b bVar2 = this.m;
            if (bVar2 != null) {
                if (!(bVar2 instanceof com.google.android.gms.common.server.converter.a)) {
                    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
                }
                bVar = new com.google.android.gms.common.server.converter.b((com.google.android.gms.common.server.converter.a) bVar2);
            }
            com.google.android.gms.common.internal.safeparcel.c.k(parcel, 9, bVar, i, false);
            com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
        }

        public C0113a(int i, boolean z, int i2, boolean z2, @NonNull String str, int i3, @Nullable Class cls) {
            this.a = 1;
            this.b = i;
            this.c = z;
            this.d = i2;
            this.e = z2;
            this.f = str;
            this.i = i3;
            this.j = cls;
            if (cls == null) {
                this.k = null;
            } else {
                this.k = cls.getCanonicalName();
            }
            this.m = null;
        }
    }
}
