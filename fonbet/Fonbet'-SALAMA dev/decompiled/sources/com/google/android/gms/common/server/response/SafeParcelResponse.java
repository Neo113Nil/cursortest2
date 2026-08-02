package com.google.android.gms.common.server.response;

import A1.W;
import Q0.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.util.VisibleForTesting;
import e1.k;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import k3.AbstractC1336a;
import k3.C1338c;
import m3.c;
import m3.d;

@VisibleForTesting
/* loaded from: classes.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new C1338c(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f11387a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f11388b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11389c;

    /* renamed from: d, reason: collision with root package name */
    public final zan f11390d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11391e;

    /* renamed from: f, reason: collision with root package name */
    public int f11392f;

    /* renamed from: x, reason: collision with root package name */
    public int f11393x;

    public SafeParcelResponse(int i7, Parcel parcel, zan zanVar) {
        this.f11387a = i7;
        D.i(parcel);
        this.f11388b = parcel;
        this.f11389c = 2;
        this.f11390d = zanVar;
        this.f11391e = zanVar == null ? null : zanVar.f11402c;
        this.f11392f = 2;
    }

    public static void e(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse$Field) entry.getValue()).f11384x, entry);
        }
        sb.append('{');
        int a02 = a.a0(parcel);
        boolean z4 = false;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z4) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                StringToIntConverter stringToIntConverter = fastJsonResponse$Field.f11377B;
                BigInteger bigInteger = null;
                BigInteger bigInteger2 = null;
                Parcel[] parcelArr = null;
                boolean[] zArr = null;
                BigDecimal[] bigDecimalArr = null;
                double[] dArr = null;
                float[] fArr = null;
                long[] jArr = null;
                BigInteger[] bigIntegerArr = null;
                Parcel obtain = null;
                int i7 = fastJsonResponse$Field.f11381d;
                if (stringToIntConverter != null) {
                    switch (i7) {
                        case 0:
                            i(sb, fastJsonResponse$Field, AbstractC1336a.zaD(fastJsonResponse$Field, Integer.valueOf(a.N(readInt, parcel))));
                            break;
                        case 1:
                            int R6 = a.R(readInt, parcel);
                            int dataPosition = parcel.dataPosition();
                            if (R6 != 0) {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + R6);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            i(sb, fastJsonResponse$Field, AbstractC1336a.zaD(fastJsonResponse$Field, bigInteger2));
                            break;
                        case 2:
                            i(sb, fastJsonResponse$Field, AbstractC1336a.zaD(fastJsonResponse$Field, Long.valueOf(a.P(readInt, parcel))));
                            break;
                        case 3:
                            a.j0(parcel, readInt, 4);
                            i(sb, fastJsonResponse$Field, AbstractC1336a.zaD(fastJsonResponse$Field, Float.valueOf(parcel.readFloat())));
                            break;
                        case 4:
                            a.j0(parcel, readInt, 8);
                            i(sb, fastJsonResponse$Field, AbstractC1336a.zaD(fastJsonResponse$Field, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            i(sb, fastJsonResponse$Field, AbstractC1336a.zaD(fastJsonResponse$Field, a.i(readInt, parcel)));
                            break;
                        case 6:
                            i(sb, fastJsonResponse$Field, AbstractC1336a.zaD(fastJsonResponse$Field, Boolean.valueOf(a.K(readInt, parcel))));
                            break;
                        case 7:
                            i(sb, fastJsonResponse$Field, AbstractC1336a.zaD(fastJsonResponse$Field, a.n(readInt, parcel)));
                            break;
                        case 8:
                        case 9:
                            i(sb, fastJsonResponse$Field, AbstractC1336a.zaD(fastJsonResponse$Field, a.k(readInt, parcel)));
                            break;
                        case 10:
                            Bundle j = a.j(readInt, parcel);
                            HashMap hashMap = new HashMap();
                            for (String str2 : j.keySet()) {
                                String string = j.getString(str2);
                                D.i(string);
                                hashMap.put(str2, string);
                            }
                            i(sb, fastJsonResponse$Field, AbstractC1336a.zaD(fastJsonResponse$Field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(k.d(i7, "Unknown field out type = "));
                    }
                } else {
                    boolean z7 = fastJsonResponse$Field.f11382e;
                    String str3 = fastJsonResponse$Field.f11386z;
                    if (z7) {
                        sb.append("[");
                        switch (i7) {
                            case 0:
                                int[] l7 = a.l(readInt, parcel);
                                int length = l7.length;
                                for (int i8 = 0; i8 < length; i8++) {
                                    if (i8 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(l7[i8]);
                                }
                                break;
                            case 1:
                                int R7 = a.R(readInt, parcel);
                                int dataPosition2 = parcel.dataPosition();
                                if (R7 != 0) {
                                    int readInt2 = parcel.readInt();
                                    bigIntegerArr = new BigInteger[readInt2];
                                    for (int i9 = 0; i9 < readInt2; i9++) {
                                        bigIntegerArr[i9] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(dataPosition2 + R7);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i10 = 0; i10 < length2; i10++) {
                                    if (i10 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(bigIntegerArr[i10]);
                                }
                                break;
                            case 2:
                                int R8 = a.R(readInt, parcel);
                                int dataPosition3 = parcel.dataPosition();
                                if (R8 != 0) {
                                    jArr = parcel.createLongArray();
                                    parcel.setDataPosition(dataPosition3 + R8);
                                }
                                int length3 = jArr.length;
                                for (int i11 = 0; i11 < length3; i11++) {
                                    if (i11 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(jArr[i11]);
                                }
                                break;
                            case 3:
                                int R9 = a.R(readInt, parcel);
                                int dataPosition4 = parcel.dataPosition();
                                if (R9 != 0) {
                                    fArr = parcel.createFloatArray();
                                    parcel.setDataPosition(dataPosition4 + R9);
                                }
                                int length4 = fArr.length;
                                for (int i12 = 0; i12 < length4; i12++) {
                                    if (i12 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(fArr[i12]);
                                }
                                break;
                            case 4:
                                int R10 = a.R(readInt, parcel);
                                int dataPosition5 = parcel.dataPosition();
                                if (R10 != 0) {
                                    dArr = parcel.createDoubleArray();
                                    parcel.setDataPosition(dataPosition5 + R10);
                                }
                                int length5 = dArr.length;
                                for (int i13 = 0; i13 < length5; i13++) {
                                    if (i13 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(dArr[i13]);
                                }
                                break;
                            case 5:
                                int R11 = a.R(readInt, parcel);
                                int dataPosition6 = parcel.dataPosition();
                                if (R11 != 0) {
                                    int readInt3 = parcel.readInt();
                                    bigDecimalArr = new BigDecimal[readInt3];
                                    for (int i14 = 0; i14 < readInt3; i14++) {
                                        bigDecimalArr[i14] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                    }
                                    parcel.setDataPosition(dataPosition6 + R11);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i15 = 0; i15 < length6; i15++) {
                                    if (i15 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(bigDecimalArr[i15]);
                                }
                                break;
                            case 6:
                                int R12 = a.R(readInt, parcel);
                                int dataPosition7 = parcel.dataPosition();
                                if (R12 != 0) {
                                    zArr = parcel.createBooleanArray();
                                    parcel.setDataPosition(dataPosition7 + R12);
                                }
                                int length7 = zArr.length;
                                for (int i16 = 0; i16 < length7; i16++) {
                                    if (i16 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(zArr[i16]);
                                }
                                break;
                            case 7:
                                String[] o7 = a.o(readInt, parcel);
                                int length8 = o7.length;
                                for (int i17 = 0; i17 < length8; i17++) {
                                    if (i17 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(o7[i17]);
                                    sb.append("\"");
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                int R13 = a.R(readInt, parcel);
                                int dataPosition8 = parcel.dataPosition();
                                if (R13 != 0) {
                                    int readInt4 = parcel.readInt();
                                    Parcel[] parcelArr2 = new Parcel[readInt4];
                                    for (int i18 = 0; i18 < readInt4; i18++) {
                                        int readInt5 = parcel.readInt();
                                        if (readInt5 != 0) {
                                            int dataPosition9 = parcel.dataPosition();
                                            Parcel obtain2 = Parcel.obtain();
                                            obtain2.appendFrom(parcel, dataPosition9, readInt5);
                                            parcelArr2[i18] = obtain2;
                                            parcel.setDataPosition(dataPosition9 + readInt5);
                                        } else {
                                            parcelArr2[i18] = null;
                                        }
                                    }
                                    parcel.setDataPosition(dataPosition8 + R13);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i19 = 0; i19 < length9; i19++) {
                                    if (i19 > 0) {
                                        sb.append(",");
                                    }
                                    parcelArr[i19].setDataPosition(0);
                                    D.i(str3);
                                    D.i(fastJsonResponse$Field.f11376A);
                                    Map map2 = (Map) fastJsonResponse$Field.f11376A.f11401b.get(str3);
                                    D.i(map2);
                                    e(sb, map2, parcelArr[i19]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        sb.append("]");
                    } else {
                        switch (i7) {
                            case 0:
                                sb.append(a.N(readInt, parcel));
                                break;
                            case 1:
                                int R14 = a.R(readInt, parcel);
                                int dataPosition10 = parcel.dataPosition();
                                if (R14 != 0) {
                                    byte[] createByteArray2 = parcel.createByteArray();
                                    parcel.setDataPosition(dataPosition10 + R14);
                                    bigInteger = new BigInteger(createByteArray2);
                                }
                                sb.append(bigInteger);
                                break;
                            case 2:
                                sb.append(a.P(readInt, parcel));
                                break;
                            case 3:
                                a.j0(parcel, readInt, 4);
                                sb.append(parcel.readFloat());
                                break;
                            case 4:
                                a.j0(parcel, readInt, 8);
                                sb.append(parcel.readDouble());
                                break;
                            case 5:
                                sb.append(a.i(readInt, parcel));
                                break;
                            case 6:
                                sb.append(a.K(readInt, parcel));
                                break;
                            case 7:
                                String n2 = a.n(readInt, parcel);
                                sb.append("\"");
                                sb.append(d.a(n2));
                                sb.append("\"");
                                break;
                            case 8:
                                byte[] k7 = a.k(readInt, parcel);
                                sb.append("\"");
                                sb.append(k7 != null ? Base64.encodeToString(k7, 0) : null);
                                sb.append("\"");
                                break;
                            case 9:
                                byte[] k8 = a.k(readInt, parcel);
                                sb.append("\"");
                                sb.append(k8 != null ? Base64.encodeToString(k8, 10) : null);
                                sb.append("\"");
                                break;
                            case 10:
                                Bundle j3 = a.j(readInt, parcel);
                                Set<String> keySet = j3.keySet();
                                sb.append("{");
                                boolean z8 = true;
                                for (String str4 : keySet) {
                                    if (!z8) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(str4);
                                    sb.append("\":\"");
                                    sb.append(d.a(j3.getString(str4)));
                                    sb.append("\"");
                                    z8 = false;
                                }
                                sb.append("}");
                                break;
                            case 11:
                                int R15 = a.R(readInt, parcel);
                                int dataPosition11 = parcel.dataPosition();
                                if (R15 != 0) {
                                    obtain = Parcel.obtain();
                                    obtain.appendFrom(parcel, dataPosition11, R15);
                                    parcel.setDataPosition(dataPosition11 + R15);
                                }
                                obtain.setDataPosition(0);
                                D.i(str3);
                                D.i(fastJsonResponse$Field.f11376A);
                                Map map3 = (Map) fastJsonResponse$Field.f11376A.f11401b.get(str3);
                                D.i(map3);
                                e(sb, map3, obtain);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                }
                z4 = true;
            }
        }
        if (parcel.dataPosition() != a02) {
            throw new W(k.d(a02, "Overread allowed size end="), parcel);
        }
        sb.append('}');
    }

    public static final void g(StringBuilder sb, int i7, Object obj) {
        switch (i7) {
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
                D.i(obj);
                sb.append(d.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                sb.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb.append("\"");
                return;
            case 10:
                D.i(obj);
                c.p(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(k.d(i7, "Unknown type = "));
        }
    }

    public static final void i(StringBuilder sb, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        boolean z4 = fastJsonResponse$Field.f11380c;
        int i7 = fastJsonResponse$Field.f11379b;
        if (!z4) {
            g(sb, i7, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (i8 != 0) {
                sb.append(",");
            }
            g(sb, i7, arrayList.get(i8));
        }
        sb.append("]");
    }

    @Override // k3.AbstractC1336a
    public final void addConcreteTypeArrayInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        d(fastJsonResponse$Field);
        ArrayList arrayList2 = new ArrayList();
        D.i(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(((SafeParcelResponse) ((AbstractC1336a) arrayList.get(i7))).c());
        }
        int i8 = fastJsonResponse$Field.f11384x;
        Parcel parcel = this.f11388b;
        int x02 = Y4.D.x0(i8, parcel);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i9 = 0; i9 < size2; i9++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i9);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        Y4.D.z0(x02, parcel);
    }

    @Override // k3.AbstractC1336a
    public final void addConcreteTypeInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, AbstractC1336a abstractC1336a) {
        d(fastJsonResponse$Field);
        Parcel c3 = ((SafeParcelResponse) abstractC1336a).c();
        Parcel parcel = this.f11388b;
        int i7 = fastJsonResponse$Field.f11384x;
        if (c3 == null) {
            Y4.D.B0(parcel, i7, 0);
            return;
        }
        int x02 = Y4.D.x0(i7, parcel);
        parcel.appendFrom(c3, 0, c3.dataSize());
        Y4.D.z0(x02, parcel);
    }

    public final Parcel c() {
        int i7 = this.f11392f;
        Parcel parcel = this.f11388b;
        if (i7 == 0) {
            int x02 = Y4.D.x0(20293, parcel);
            this.f11393x = x02;
            Y4.D.z0(x02, parcel);
            this.f11392f = 2;
        } else if (i7 == 1) {
            Y4.D.z0(this.f11393x, parcel);
            this.f11392f = 2;
        }
        return parcel;
    }

    public final void d(FastJsonResponse$Field fastJsonResponse$Field) {
        if (fastJsonResponse$Field.f11384x == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f11388b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i7 = this.f11392f;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f11393x = Y4.D.x0(20293, parcel);
            this.f11392f = 1;
        }
    }

    @Override // k3.AbstractC1336a
    public final Map getFieldMappings() {
        zan zanVar = this.f11390d;
        if (zanVar == null) {
            return null;
        }
        String str = this.f11391e;
        D.i(str);
        return (Map) zanVar.f11401b.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, k3.AbstractC1336a
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, k3.AbstractC1336a
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // k3.AbstractC1336a
    public final void setBooleanInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z4) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        Y4.D.B0(parcel, fastJsonResponse$Field.f11384x, 4);
        parcel.writeInt(z4 ? 1 : 0);
    }

    @Override // k3.AbstractC1336a
    public final void setDecodedBytesInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        d(fastJsonResponse$Field);
        Y4.D.l0(this.f11388b, fastJsonResponse$Field.f11384x, bArr, true);
    }

    @Override // k3.AbstractC1336a
    public final void setIntegerInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, int i7) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        Y4.D.B0(parcel, fastJsonResponse$Field.f11384x, 4);
        parcel.writeInt(i7);
    }

    @Override // k3.AbstractC1336a
    public final void setLongInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        Y4.D.B0(parcel, fastJsonResponse$Field.f11384x, 8);
        parcel.writeLong(j);
    }

    @Override // k3.AbstractC1336a
    public final void setStringInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        d(fastJsonResponse$Field);
        Y4.D.s0(this.f11388b, fastJsonResponse$Field.f11384x, str2, true);
    }

    @Override // k3.AbstractC1336a
    public final void setStringMapInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, Map map) {
        d(fastJsonResponse$Field);
        Bundle bundle = new Bundle();
        D.i(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        Y4.D.k0(this.f11388b, fastJsonResponse$Field.f11384x, bundle, true);
    }

    @Override // k3.AbstractC1336a
    public final void setStringsInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        d(fastJsonResponse$Field);
        D.i(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i7 = 0; i7 < size; i7++) {
            strArr[i7] = (String) arrayList.get(i7);
        }
        Y4.D.t0(this.f11388b, fastJsonResponse$Field.f11384x, strArr, true);
    }

    @Override // k3.AbstractC1336a
    public final String toString() {
        zan zanVar = this.f11390d;
        D.j(zanVar, "Cannot convert to JSON on client side.");
        Parcel c3 = c();
        c3.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.f11391e;
        D.i(str);
        Map map = (Map) zanVar.f11401b.get(str);
        D.i(map);
        e(sb, map, c3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11387a);
        Parcel c3 = c();
        if (c3 != null) {
            int x03 = Y4.D.x0(2, parcel);
            parcel.appendFrom(c3, 0, c3.dataSize());
            Y4.D.z0(x03, parcel);
        }
        Y4.D.r0(parcel, 3, this.f11389c != 0 ? this.f11390d : null, i7, false);
        Y4.D.z0(x02, parcel);
    }

    @Override // k3.AbstractC1336a
    public final void zab(FastJsonResponse$Field fastJsonResponse$Field, String str, BigDecimal bigDecimal) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        int i7 = fastJsonResponse$Field.f11384x;
        if (bigDecimal == null) {
            Y4.D.B0(parcel, i7, 0);
            return;
        }
        int x02 = Y4.D.x0(i7, parcel);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        Y4.D.z0(x02, parcel);
    }

    @Override // k3.AbstractC1336a
    public final void zad(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        d(fastJsonResponse$Field);
        D.i(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i7 = 0; i7 < size; i7++) {
            bigDecimalArr[i7] = (BigDecimal) arrayList.get(i7);
        }
        int i8 = fastJsonResponse$Field.f11384x;
        Parcel parcel = this.f11388b;
        int x02 = Y4.D.x0(i8, parcel);
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeByteArray(bigDecimalArr[i9].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i9].scale());
        }
        Y4.D.z0(x02, parcel);
    }

    @Override // k3.AbstractC1336a
    public final void zaf(FastJsonResponse$Field fastJsonResponse$Field, String str, BigInteger bigInteger) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        int i7 = fastJsonResponse$Field.f11384x;
        if (bigInteger == null) {
            Y4.D.B0(parcel, i7, 0);
            return;
        }
        int x02 = Y4.D.x0(i7, parcel);
        parcel.writeByteArray(bigInteger.toByteArray());
        Y4.D.z0(x02, parcel);
    }

    @Override // k3.AbstractC1336a
    public final void zah(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        d(fastJsonResponse$Field);
        D.i(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i7 = 0; i7 < size; i7++) {
            bigIntegerArr[i7] = (BigInteger) arrayList.get(i7);
        }
        int i8 = fastJsonResponse$Field.f11384x;
        Parcel parcel = this.f11388b;
        int x02 = Y4.D.x0(i8, parcel);
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeByteArray(bigIntegerArr[i9].toByteArray());
        }
        Y4.D.z0(x02, parcel);
    }

    @Override // k3.AbstractC1336a
    public final void zak(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        d(fastJsonResponse$Field);
        D.i(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i7 = 0; i7 < size; i7++) {
            zArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue();
        }
        int i8 = fastJsonResponse$Field.f11384x;
        Parcel parcel = this.f11388b;
        int x02 = Y4.D.x0(i8, parcel);
        parcel.writeBooleanArray(zArr);
        Y4.D.z0(x02, parcel);
    }

    @Override // k3.AbstractC1336a
    public final void zan(FastJsonResponse$Field fastJsonResponse$Field, String str, double d7) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        Y4.D.B0(parcel, fastJsonResponse$Field.f11384x, 8);
        parcel.writeDouble(d7);
    }

    @Override // k3.AbstractC1336a
    public final void zap(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        d(fastJsonResponse$Field);
        D.i(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = ((Double) arrayList.get(i7)).doubleValue();
        }
        int i8 = fastJsonResponse$Field.f11384x;
        Parcel parcel = this.f11388b;
        int x02 = Y4.D.x0(i8, parcel);
        parcel.writeDoubleArray(dArr);
        Y4.D.z0(x02, parcel);
    }

    @Override // k3.AbstractC1336a
    public final void zar(FastJsonResponse$Field fastJsonResponse$Field, String str, float f7) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        Y4.D.B0(parcel, fastJsonResponse$Field.f11384x, 4);
        parcel.writeFloat(f7);
    }

    @Override // k3.AbstractC1336a
    public final void zat(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        d(fastJsonResponse$Field);
        D.i(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            fArr[i7] = ((Float) arrayList.get(i7)).floatValue();
        }
        int i8 = fastJsonResponse$Field.f11384x;
        Parcel parcel = this.f11388b;
        int x02 = Y4.D.x0(i8, parcel);
        parcel.writeFloatArray(fArr);
        Y4.D.z0(x02, parcel);
    }

    @Override // k3.AbstractC1336a
    public final void zaw(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        d(fastJsonResponse$Field);
        D.i(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        Y4.D.o0(this.f11388b, fastJsonResponse$Field.f11384x, iArr, true);
    }

    @Override // k3.AbstractC1336a
    public final void zaz(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        d(fastJsonResponse$Field);
        D.i(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i7 = 0; i7 < size; i7++) {
            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
        }
        int i8 = fastJsonResponse$Field.f11384x;
        Parcel parcel = this.f11388b;
        int x02 = Y4.D.x0(i8, parcel);
        parcel.writeLongArray(jArr);
        Y4.D.z0(x02, parcel);
    }
}
