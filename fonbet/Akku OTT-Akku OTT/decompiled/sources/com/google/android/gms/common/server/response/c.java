package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class c extends b {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new k();
    public final int a;
    public final Parcel b;
    public final int c;
    public final h d;

    @Nullable
    public final String e;
    public int f;
    public int i;

    public c(int i, Parcel parcel, h hVar) {
        this.a = i;
        C0875q.g(parcel);
        this.b = parcel;
        this.c = 2;
        this.d = hVar;
        this.e = hVar == null ? null : hVar.c;
        this.f = 2;
    }

    public static void m(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel obtain;
        BigInteger[] bigIntegerArr;
        long[] createLongArray;
        float[] createFloatArray;
        double[] createDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] createBooleanArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((a.C0113a) entry.getValue()).i, entry);
        }
        sb.append('{');
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        boolean z2 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z2) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                a.C0113a c0113a = (a.C0113a) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                a.b bVar = c0113a.m;
                String str2 = c0113a.k;
                int i = c0113a.d;
                if (bVar != null) {
                    switch (i) {
                        case 0:
                            o(sb, c0113a, a.zaD(c0113a, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt))));
                            break;
                        case 1:
                            int x = com.google.android.gms.common.internal.safeparcel.b.x(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (x == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + x);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            o(sb, c0113a, a.zaD(c0113a, bigInteger2));
                            break;
                        case 2:
                            o(sb, c0113a, a.zaD(c0113a, Long.valueOf(com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt))));
                            break;
                        case 3:
                            o(sb, c0113a, a.zaD(c0113a, Float.valueOf(com.google.android.gms.common.internal.safeparcel.b.q(parcel, readInt))));
                            break;
                        case 4:
                            o(sb, c0113a, a.zaD(c0113a, Double.valueOf(com.google.android.gms.common.internal.safeparcel.b.o(parcel, readInt))));
                            break;
                        case 5:
                            o(sb, c0113a, a.zaD(c0113a, com.google.android.gms.common.internal.safeparcel.b.a(parcel, readInt)));
                            break;
                        case 6:
                            o(sb, c0113a, a.zaD(c0113a, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt))));
                            break;
                        case 7:
                            o(sb, c0113a, a.zaD(c0113a, com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt)));
                            break;
                        case 8:
                        case 9:
                            o(sb, c0113a, a.zaD(c0113a, com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt)));
                            break;
                        case 10:
                            Bundle b = com.google.android.gms.common.internal.safeparcel.b.b(parcel, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str3 : b.keySet()) {
                                String string = b.getString(str3);
                                C0875q.g(string);
                                hashMap.put(str3, string);
                            }
                            o(sb, c0113a, a.zaD(c0113a, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(android.support.v4.media.a.a(i, "Unknown field out type = "));
                    }
                } else if (c0113a.e) {
                    sb.append("[");
                    switch (i) {
                        case 0:
                            ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.b.d(parcel, readInt));
                            break;
                        case 1:
                            int x2 = com.google.android.gms.common.internal.safeparcel.b.x(parcel, readInt);
                            int dataPosition2 = parcel.dataPosition();
                            if (x2 == 0) {
                                bigIntegerArr = null;
                            } else {
                                int readInt2 = parcel.readInt();
                                bigIntegerArr = new BigInteger[readInt2];
                                for (int i2 = 0; i2 < readInt2; i2++) {
                                    bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(dataPosition2 + x2);
                            }
                            ArrayUtils.writeArray(sb, bigIntegerArr);
                            break;
                        case 2:
                            int x3 = com.google.android.gms.common.internal.safeparcel.b.x(parcel, readInt);
                            int dataPosition3 = parcel.dataPosition();
                            if (x3 == 0) {
                                createLongArray = null;
                            } else {
                                createLongArray = parcel.createLongArray();
                                parcel.setDataPosition(dataPosition3 + x3);
                            }
                            ArrayUtils.writeArray(sb, createLongArray);
                            break;
                        case 3:
                            int x4 = com.google.android.gms.common.internal.safeparcel.b.x(parcel, readInt);
                            int dataPosition4 = parcel.dataPosition();
                            if (x4 == 0) {
                                createFloatArray = null;
                            } else {
                                createFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition4 + x4);
                            }
                            ArrayUtils.writeArray(sb, createFloatArray);
                            break;
                        case 4:
                            int x5 = com.google.android.gms.common.internal.safeparcel.b.x(parcel, readInt);
                            int dataPosition5 = parcel.dataPosition();
                            if (x5 == 0) {
                                createDoubleArray = null;
                            } else {
                                createDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(dataPosition5 + x5);
                            }
                            ArrayUtils.writeArray(sb, createDoubleArray);
                            break;
                        case 5:
                            int x6 = com.google.android.gms.common.internal.safeparcel.b.x(parcel, readInt);
                            int dataPosition6 = parcel.dataPosition();
                            if (x6 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int readInt3 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[readInt3];
                                for (int i3 = 0; i3 < readInt3; i3++) {
                                    bigDecimalArr[i3] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(dataPosition6 + x6);
                            }
                            ArrayUtils.writeArray(sb, bigDecimalArr);
                            break;
                        case 6:
                            int x7 = com.google.android.gms.common.internal.safeparcel.b.x(parcel, readInt);
                            int dataPosition7 = parcel.dataPosition();
                            if (x7 == 0) {
                                createBooleanArray = null;
                            } else {
                                createBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(dataPosition7 + x7);
                            }
                            ArrayUtils.writeArray(sb, createBooleanArray);
                            break;
                        case 7:
                            ArrayUtils.writeStringArray(sb, com.google.android.gms.common.internal.safeparcel.b.h(parcel, readInt));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int x8 = com.google.android.gms.common.internal.safeparcel.b.x(parcel, readInt);
                            int dataPosition8 = parcel.dataPosition();
                            if (x8 == 0) {
                                parcelArr = null;
                            } else {
                                int readInt4 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[readInt4];
                                for (int i4 = 0; i4 < readInt4; i4++) {
                                    int readInt5 = parcel.readInt();
                                    if (readInt5 != 0) {
                                        int dataPosition9 = parcel.dataPosition();
                                        Parcel obtain2 = Parcel.obtain();
                                        obtain2.appendFrom(parcel, dataPosition9, readInt5);
                                        parcelArr2[i4] = obtain2;
                                        parcel.setDataPosition(dataPosition9 + readInt5);
                                    } else {
                                        parcelArr2[i4] = null;
                                    }
                                }
                                parcel.setDataPosition(dataPosition8 + x8);
                                parcelArr = parcelArr2;
                            }
                            int length = parcelArr.length;
                            for (int i5 = 0; i5 < length; i5++) {
                                if (i5 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i5].setDataPosition(0);
                                C0875q.g(str2);
                                C0875q.g(c0113a.l);
                                Map map2 = (Map) c0113a.l.b.get(str2);
                                C0875q.g(map2);
                                m(sb, map2, parcelArr[i5]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (i) {
                        case 0:
                            sb.append(com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt));
                            break;
                        case 1:
                            int x9 = com.google.android.gms.common.internal.safeparcel.b.x(parcel, readInt);
                            int dataPosition10 = parcel.dataPosition();
                            if (x9 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] createByteArray2 = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition10 + x9);
                                bigInteger = new BigInteger(createByteArray2);
                            }
                            sb.append(bigInteger);
                            break;
                        case 2:
                            sb.append(com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt));
                            break;
                        case 3:
                            sb.append(com.google.android.gms.common.internal.safeparcel.b.q(parcel, readInt));
                            break;
                        case 4:
                            sb.append(com.google.android.gms.common.internal.safeparcel.b.o(parcel, readInt));
                            break;
                        case 5:
                            sb.append(com.google.android.gms.common.internal.safeparcel.b.a(parcel, readInt));
                            break;
                        case 6:
                            sb.append(com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt));
                            break;
                        case 7:
                            String g = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                            sb.append("\"");
                            sb.append(JsonUtils.escapeString(g));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] c = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
                            sb.append("\"");
                            sb.append(Base64Utils.encode(c));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] c2 = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe(c2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle b2 = com.google.android.gms.common.internal.safeparcel.b.b(parcel, readInt);
                            Set<String> keySet = b2.keySet();
                            sb.append("{");
                            boolean z3 = true;
                            for (String str4 : keySet) {
                                if (!z3) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str4);
                                sb.append("\":\"");
                                sb.append(JsonUtils.escapeString(b2.getString(str4)));
                                sb.append("\"");
                                z3 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            int x10 = com.google.android.gms.common.internal.safeparcel.b.x(parcel, readInt);
                            int dataPosition11 = parcel.dataPosition();
                            if (x10 == 0) {
                                obtain = null;
                            } else {
                                obtain = Parcel.obtain();
                                obtain.appendFrom(parcel, dataPosition11, x10);
                                parcel.setDataPosition(dataPosition11 + x10);
                            }
                            obtain.setDataPosition(0);
                            C0875q.g(str2);
                            C0875q.g(c0113a.l);
                            Map map3 = (Map) c0113a.l.b.get(str2);
                            C0875q.g(map3);
                            m(sb, map3, obtain);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z2 = true;
            }
        }
        if (parcel.dataPosition() != z) {
            throw new b.a(android.support.v4.media.a.a(z, "Overread allowed size end="), parcel);
        }
        sb.append('}');
    }

    public static final void n(StringBuilder sb, int i, @Nullable Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                C0875q.g(obj);
                sb.append(JsonUtils.escapeString(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.encode((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.encodeUrlSafe((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C0875q.g(obj);
                MapUtils.writeStringMapToJson(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(android.support.v4.media.a.a(i, "Unknown type = "));
        }
    }

    public static final void o(StringBuilder sb, a.C0113a c0113a, Object obj) {
        boolean z = c0113a.c;
        int i = c0113a.b;
        if (!z) {
            n(sb, i, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            n(sb, i, arrayList.get(i2));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.a
    public final <T extends a> void addConcreteTypeArrayInternal(@NonNull a.C0113a c0113a, @NonNull String str, @Nullable ArrayList<T> arrayList) {
        l(c0113a);
        ArrayList arrayList2 = new ArrayList();
        C0875q.g(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((c) arrayList.get(i)).h());
        }
        int i2 = c0113a.i;
        Parcel parcel = this.b;
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, i2);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i3);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final <T extends a> void addConcreteTypeInternal(@NonNull a.C0113a c0113a, @NonNull String str, @NonNull T t) {
        l(c0113a);
        Parcel h = ((c) t).h();
        int i = c0113a.i;
        Parcel parcel = this.b;
        if (h == null) {
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, i, 0);
            return;
        }
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, i);
        parcel.appendFrom(h, 0, h.dataSize());
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    @Override // com.google.android.gms.common.server.response.a
    @Nullable
    public final Map<String, a.C0113a<?, ?>> getFieldMappings() {
        h hVar = this.d;
        if (hVar == null) {
            return null;
        }
        String str = this.e;
        C0875q.g(str);
        return (Map) hVar.b.get(str);
    }

    @Override // com.google.android.gms.common.server.response.b, com.google.android.gms.common.server.response.a
    @NonNull
    public final Object getValueObject(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @NonNull
    public final Parcel h() {
        int i = this.f;
        Parcel parcel = this.b;
        if (i != 0) {
            if (i != 1) {
                return parcel;
            }
            com.google.android.gms.common.internal.safeparcel.c.r(parcel, this.i);
            this.f = 2;
            return parcel;
        }
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        this.i = q;
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
        this.f = 2;
        return parcel;
    }

    @Override // com.google.android.gms.common.server.response.b, com.google.android.gms.common.server.response.a
    public final boolean isPrimitiveFieldSet(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final void l(a.C0113a c0113a) {
        if (c0113a.i == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.i = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
            this.f = 1;
        }
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void setBooleanInternal(@NonNull a.C0113a<?, ?> c0113a, @NonNull String str, boolean z) {
        l(c0113a);
        int i = c0113a.i;
        Parcel parcel = this.b;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void setDecodedBytesInternal(@NonNull a.C0113a<?, ?> c0113a, @NonNull String str, @Nullable byte[] bArr) {
        l(c0113a);
        com.google.android.gms.common.internal.safeparcel.c.c(this.b, c0113a.i, bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void setIntegerInternal(@NonNull a.C0113a<?, ?> c0113a, @NonNull String str, int i) {
        l(c0113a);
        int i2 = c0113a.i;
        Parcel parcel = this.b;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, i2, 4);
        parcel.writeInt(i);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void setLongInternal(@NonNull a.C0113a<?, ?> c0113a, @NonNull String str, long j) {
        l(c0113a);
        int i = c0113a.i;
        Parcel parcel = this.b;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, i, 8);
        parcel.writeLong(j);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void setStringInternal(@NonNull a.C0113a<?, ?> c0113a, @NonNull String str, @Nullable String str2) {
        l(c0113a);
        com.google.android.gms.common.internal.safeparcel.c.l(this.b, c0113a.i, str2, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void setStringMapInternal(@NonNull a.C0113a<?, ?> c0113a, @NonNull String str, @Nullable Map<String, String> map) {
        l(c0113a);
        Bundle bundle = new Bundle();
        C0875q.g(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        com.google.android.gms.common.internal.safeparcel.c.b(this.b, c0113a.i, bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void setStringsInternal(@NonNull a.C0113a<?, ?> c0113a, @NonNull String str, @Nullable ArrayList<String> arrayList) {
        l(c0113a);
        C0875q.g(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        com.google.android.gms.common.internal.safeparcel.c.m(this.b, c0113a.i, strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    @NonNull
    public final String toString() {
        h hVar = this.d;
        C0875q.h(hVar, "Cannot convert to JSON on client side.");
        Parcel h = h();
        h.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.e;
        C0875q.g(str);
        Map map = (Map) hVar.b.get(str);
        C0875q.g(map);
        m(sb, map, h);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        Parcel h = h();
        if (h != null) {
            int q2 = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 2);
            parcel.appendFrom(h, 0, h.dataSize());
            com.google.android.gms.common.internal.safeparcel.c.r(parcel, q2);
        }
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 3, this.c != 0 ? this.d : null, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void zab(@NonNull a.C0113a c0113a, @NonNull String str, @Nullable BigDecimal bigDecimal) {
        l(c0113a);
        int i = c0113a.i;
        Parcel parcel = this.b;
        if (bigDecimal == null) {
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, i, 0);
            return;
        }
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, i);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void zad(@NonNull a.C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        l(c0113a);
        C0875q.g(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
        }
        int i2 = c0113a.i;
        Parcel parcel = this.b;
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, i2);
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(bigDecimalArr[i3].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i3].scale());
        }
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void zaf(@NonNull a.C0113a c0113a, @NonNull String str, @Nullable BigInteger bigInteger) {
        l(c0113a);
        int i = c0113a.i;
        Parcel parcel = this.b;
        if (bigInteger == null) {
            com.google.android.gms.common.internal.safeparcel.c.s(parcel, i, 0);
            return;
        }
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, i);
        parcel.writeByteArray(bigInteger.toByteArray());
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void zah(@NonNull a.C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        l(c0113a);
        C0875q.g(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (BigInteger) arrayList.get(i);
        }
        int i2 = c0113a.i;
        Parcel parcel = this.b;
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, i2);
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(bigIntegerArr[i3].toByteArray());
        }
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void zak(@NonNull a.C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        l(c0113a);
        C0875q.g(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        int i2 = c0113a.i;
        Parcel parcel = this.b;
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, i2);
        parcel.writeBooleanArray(zArr);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void zan(@NonNull a.C0113a c0113a, @NonNull String str, double d) {
        l(c0113a);
        int i = c0113a.i;
        Parcel parcel = this.b;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, i, 8);
        parcel.writeDouble(d);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void zap(@NonNull a.C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        l(c0113a);
        C0875q.g(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        int i2 = c0113a.i;
        Parcel parcel = this.b;
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, i2);
        parcel.writeDoubleArray(dArr);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void zar(@NonNull a.C0113a c0113a, @NonNull String str, float f) {
        l(c0113a);
        int i = c0113a.i;
        Parcel parcel = this.b;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, i, 4);
        parcel.writeFloat(f);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void zat(@NonNull a.C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        l(c0113a);
        C0875q.g(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        int i2 = c0113a.i;
        Parcel parcel = this.b;
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, i2);
        parcel.writeFloatArray(fArr);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void zaw(@NonNull a.C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        l(c0113a);
        C0875q.g(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        com.google.android.gms.common.internal.safeparcel.c.g(this.b, c0113a.i, iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void zaz(@NonNull a.C0113a c0113a, @NonNull String str, @Nullable ArrayList arrayList) {
        l(c0113a);
        C0875q.g(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        int i2 = c0113a.i;
        Parcel parcel = this.b;
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, i2);
        parcel.writeLongArray(jArr);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
