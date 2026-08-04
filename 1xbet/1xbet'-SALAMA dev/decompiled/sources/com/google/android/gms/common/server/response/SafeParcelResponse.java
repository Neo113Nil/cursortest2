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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p031e1.k;
import p074k3.c;
import p090m3.d;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new c(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcel f11388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zan f11390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11392f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
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
        int iA0 = a.a0(parcel);
        boolean z4 = false;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i7);
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
                boolean[] zArrCreateBooleanArray = null;
                BigDecimal[] bigDecimalArr = null;
                double[] dArrCreateDoubleArray = null;
                float[] fArrCreateFloatArray = null;
                long[] jArrCreateLongArray = null;
                BigInteger[] bigIntegerArr = null;
                Parcel parcelObtain = null;
                int i8 = fastJsonResponse$Field.f11381d;
                if (stringToIntConverter != null) {
                    switch (i8) {
                        case 0:
                            i(sb, fastJsonResponse$Field, p074k3.a.zaD(fastJsonResponse$Field, Integer.valueOf(a.N(i7, parcel))));
                            break;
                        case 1:
                            int iR = a.R(i7, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iR != 0) {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iR);
                                bigInteger2 = new BigInteger(bArrCreateByteArray);
                            }
                            i(sb, fastJsonResponse$Field, p074k3.a.zaD(fastJsonResponse$Field, bigInteger2));
                            break;
                        case 2:
                            i(sb, fastJsonResponse$Field, p074k3.a.zaD(fastJsonResponse$Field, Long.valueOf(a.P(i7, parcel))));
                            break;
                        case 3:
                            a.j0(parcel, i7, 4);
                            i(sb, fastJsonResponse$Field, p074k3.a.zaD(fastJsonResponse$Field, Float.valueOf(parcel.readFloat())));
                            break;
                        case 4:
                            a.j0(parcel, i7, 8);
                            i(sb, fastJsonResponse$Field, p074k3.a.zaD(fastJsonResponse$Field, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            i(sb, fastJsonResponse$Field, p074k3.a.zaD(fastJsonResponse$Field, a.i(i7, parcel)));
                            break;
                        case 6:
                            i(sb, fastJsonResponse$Field, p074k3.a.zaD(fastJsonResponse$Field, Boolean.valueOf(a.K(i7, parcel))));
                            break;
                        case 7:
                            i(sb, fastJsonResponse$Field, p074k3.a.zaD(fastJsonResponse$Field, a.n(i7, parcel)));
                            break;
                        case 8:
                        case 9:
                            i(sb, fastJsonResponse$Field, p074k3.a.zaD(fastJsonResponse$Field, a.k(i7, parcel)));
                            break;
                        case 10:
                            Bundle bundleJ = a.j(i7, parcel);
                            HashMap map2 = new HashMap();
                            for (String str2 : bundleJ.keySet()) {
                                String string = bundleJ.getString(str2);
                                D.i(string);
                                map2.put(str2, string);
                            }
                            i(sb, fastJsonResponse$Field, p074k3.a.zaD(fastJsonResponse$Field, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(k.d(i8, "Unknown field out type = "));
                    }
                } else {
                    boolean z7 = fastJsonResponse$Field.f11382e;
                    String str3 = fastJsonResponse$Field.f11386z;
                    if (z7) {
                        sb.append("[");
                        switch (i8) {
                            case 0:
                                int[] iArrL = a.l(i7, parcel);
                                int length = iArrL.length;
                                for (int i9 = 0; i9 < length; i9++) {
                                    if (i9 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(iArrL[i9]);
                                }
                                break;
                            case 1:
                                int iR2 = a.R(i7, parcel);
                                int iDataPosition2 = parcel.dataPosition();
                                if (iR2 != 0) {
                                    int i10 = parcel.readInt();
                                    bigIntegerArr = new BigInteger[i10];
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        bigIntegerArr[i11] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(iDataPosition2 + iR2);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i12 = 0; i12 < length2; i12++) {
                                    if (i12 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(bigIntegerArr[i12]);
                                }
                                break;
                            case 2:
                                int iR3 = a.R(i7, parcel);
                                int iDataPosition3 = parcel.dataPosition();
                                if (iR3 != 0) {
                                    jArrCreateLongArray = parcel.createLongArray();
                                    parcel.setDataPosition(iDataPosition3 + iR3);
                                }
                                int length3 = jArrCreateLongArray.length;
                                for (int i13 = 0; i13 < length3; i13++) {
                                    if (i13 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(jArrCreateLongArray[i13]);
                                }
                                break;
                            case 3:
                                int iR4 = a.R(i7, parcel);
                                int iDataPosition4 = parcel.dataPosition();
                                if (iR4 != 0) {
                                    fArrCreateFloatArray = parcel.createFloatArray();
                                    parcel.setDataPosition(iDataPosition4 + iR4);
                                }
                                int length4 = fArrCreateFloatArray.length;
                                for (int i14 = 0; i14 < length4; i14++) {
                                    if (i14 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(fArrCreateFloatArray[i14]);
                                }
                                break;
                            case 4:
                                int iR5 = a.R(i7, parcel);
                                int iDataPosition5 = parcel.dataPosition();
                                if (iR5 != 0) {
                                    dArrCreateDoubleArray = parcel.createDoubleArray();
                                    parcel.setDataPosition(iDataPosition5 + iR5);
                                }
                                int length5 = dArrCreateDoubleArray.length;
                                for (int i15 = 0; i15 < length5; i15++) {
                                    if (i15 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(dArrCreateDoubleArray[i15]);
                                }
                                break;
                            case 5:
                                int iR6 = a.R(i7, parcel);
                                int iDataPosition6 = parcel.dataPosition();
                                if (iR6 != 0) {
                                    int i16 = parcel.readInt();
                                    bigDecimalArr = new BigDecimal[i16];
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        bigDecimalArr[i17] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                    }
                                    parcel.setDataPosition(iDataPosition6 + iR6);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i18 = 0; i18 < length6; i18++) {
                                    if (i18 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(bigDecimalArr[i18]);
                                }
                                break;
                            case 6:
                                int iR7 = a.R(i7, parcel);
                                int iDataPosition7 = parcel.dataPosition();
                                if (iR7 != 0) {
                                    zArrCreateBooleanArray = parcel.createBooleanArray();
                                    parcel.setDataPosition(iDataPosition7 + iR7);
                                }
                                int length7 = zArrCreateBooleanArray.length;
                                for (int i19 = 0; i19 < length7; i19++) {
                                    if (i19 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(zArrCreateBooleanArray[i19]);
                                }
                                break;
                            case 7:
                                String[] strArrO = a.o(i7, parcel);
                                int length8 = strArrO.length;
                                for (int i20 = 0; i20 < length8; i20++) {
                                    if (i20 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(strArrO[i20]);
                                    sb.append("\"");
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                int iR8 = a.R(i7, parcel);
                                int iDataPosition8 = parcel.dataPosition();
                                if (iR8 != 0) {
                                    int i21 = parcel.readInt();
                                    Parcel[] parcelArr2 = new Parcel[i21];
                                    for (int i22 = 0; i22 < i21; i22++) {
                                        int i23 = parcel.readInt();
                                        if (i23 != 0) {
                                            int iDataPosition9 = parcel.dataPosition();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            parcelObtain2.appendFrom(parcel, iDataPosition9, i23);
                                            parcelArr2[i22] = parcelObtain2;
                                            parcel.setDataPosition(iDataPosition9 + i23);
                                        } else {
                                            parcelArr2[i22] = null;
                                        }
                                    }
                                    parcel.setDataPosition(iDataPosition8 + iR8);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i24 = 0; i24 < length9; i24++) {
                                    if (i24 > 0) {
                                        sb.append(",");
                                    }
                                    parcelArr[i24].setDataPosition(0);
                                    D.i(str3);
                                    D.i(fastJsonResponse$Field.f11376A);
                                    Map map3 = (Map) fastJsonResponse$Field.f11376A.f11401b.get(str3);
                                    D.i(map3);
                                    e(sb, map3, parcelArr[i24]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        sb.append("]");
                    } else {
                        switch (i8) {
                            case 0:
                                sb.append(a.N(i7, parcel));
                                break;
                            case 1:
                                int iR9 = a.R(i7, parcel);
                                int iDataPosition10 = parcel.dataPosition();
                                if (iR9 != 0) {
                                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                    parcel.setDataPosition(iDataPosition10 + iR9);
                                    bigInteger = new BigInteger(bArrCreateByteArray2);
                                }
                                sb.append(bigInteger);
                                break;
                            case 2:
                                sb.append(a.P(i7, parcel));
                                break;
                            case 3:
                                a.j0(parcel, i7, 4);
                                sb.append(parcel.readFloat());
                                break;
                            case 4:
                                a.j0(parcel, i7, 8);
                                sb.append(parcel.readDouble());
                                break;
                            case 5:
                                sb.append(a.i(i7, parcel));
                                break;
                            case 6:
                                sb.append(a.K(i7, parcel));
                                break;
                            case 7:
                                String strN = a.n(i7, parcel);
                                sb.append("\"");
                                sb.append(d.a(strN));
                                sb.append("\"");
                                break;
                            case 8:
                                byte[] bArrK = a.k(i7, parcel);
                                sb.append("\"");
                                sb.append(bArrK != null ? Base64.encodeToString(bArrK, 0) : null);
                                sb.append("\"");
                                break;
                            case 9:
                                byte[] bArrK2 = a.k(i7, parcel);
                                sb.append("\"");
                                sb.append(bArrK2 != null ? Base64.encodeToString(bArrK2, 10) : null);
                                sb.append("\"");
                                break;
                            case 10:
                                Bundle bundleJ2 = a.j(i7, parcel);
                                Set<String> setKeySet = bundleJ2.keySet();
                                sb.append("{");
                                boolean z8 = true;
                                for (String str4 : setKeySet) {
                                    if (!z8) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(str4);
                                    sb.append("\":\"");
                                    sb.append(d.a(bundleJ2.getString(str4)));
                                    sb.append("\"");
                                    z8 = false;
                                }
                                sb.append("}");
                                break;
                            case 11:
                                int iR10 = a.R(i7, parcel);
                                int iDataPosition11 = parcel.dataPosition();
                                if (iR10 != 0) {
                                    parcelObtain = Parcel.obtain();
                                    parcelObtain.appendFrom(parcel, iDataPosition11, iR10);
                                    parcel.setDataPosition(iDataPosition11 + iR10);
                                }
                                parcelObtain.setDataPosition(0);
                                D.i(str3);
                                D.i(fastJsonResponse$Field.f11376A);
                                Map map4 = (Map) fastJsonResponse$Field.f11376A.f11401b.get(str3);
                                D.i(map4);
                                e(sb, map4, parcelObtain);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                }
                z4 = true;
            }
        }
        if (parcel.dataPosition() != iA0) {
            throw new W(k.d(iA0, "Overread allowed size end="), parcel);
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
                p090m3.c.p(sb, (HashMap) obj);
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

    @Override // p074k3.a
    public final void addConcreteTypeArrayInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        d(fastJsonResponse$Field);
        ArrayList arrayList2 = new ArrayList();
        D.i(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(((SafeParcelResponse) ((p074k3.a) arrayList.get(i7))).c());
        }
        int i8 = fastJsonResponse$Field.f11384x;
        Parcel parcel = this.f11388b;
        int iX0 = Y4.D.x0(i8, parcel);
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
        Y4.D.z0(iX0, parcel);
    }

    @Override // p074k3.a
    public final void addConcreteTypeInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, p074k3.a aVar) {
        d(fastJsonResponse$Field);
        Parcel parcelC = ((SafeParcelResponse) aVar).c();
        Parcel parcel = this.f11388b;
        int i7 = fastJsonResponse$Field.f11384x;
        if (parcelC == null) {
            Y4.D.B0(parcel, i7, 0);
            return;
        }
        int iX0 = Y4.D.x0(i7, parcel);
        parcel.appendFrom(parcelC, 0, parcelC.dataSize());
        Y4.D.z0(iX0, parcel);
    }

    public final Parcel c() {
        int i7 = this.f11392f;
        Parcel parcel = this.f11388b;
        if (i7 == 0) {
            int iX0 = Y4.D.x0(20293, parcel);
            this.f11393x = iX0;
            Y4.D.z0(iX0, parcel);
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

    @Override // p074k3.a
    public final Map getFieldMappings() {
        zan zanVar = this.f11390d;
        if (zanVar == null) {
            return null;
        }
        String str = this.f11391e;
        D.i(str);
        return (Map) zanVar.f11401b.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, p074k3.a
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, p074k3.a
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // p074k3.a
    public final void setBooleanInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z4) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        Y4.D.B0(parcel, fastJsonResponse$Field.f11384x, 4);
        parcel.writeInt(z4 ? 1 : 0);
    }

    @Override // p074k3.a
    public final void setDecodedBytesInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        d(fastJsonResponse$Field);
        Y4.D.l0(this.f11388b, fastJsonResponse$Field.f11384x, bArr, true);
    }

    @Override // p074k3.a
    public final void setIntegerInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, int i7) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        Y4.D.B0(parcel, fastJsonResponse$Field.f11384x, 4);
        parcel.writeInt(i7);
    }

    @Override // p074k3.a
    public final void setLongInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        Y4.D.B0(parcel, fastJsonResponse$Field.f11384x, 8);
        parcel.writeLong(j);
    }

    @Override // p074k3.a
    public final void setStringInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        d(fastJsonResponse$Field);
        Y4.D.s0(this.f11388b, fastJsonResponse$Field.f11384x, str2, true);
    }

    @Override // p074k3.a
    public final void setStringMapInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, Map map) {
        d(fastJsonResponse$Field);
        Bundle bundle = new Bundle();
        D.i(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        Y4.D.k0(this.f11388b, fastJsonResponse$Field.f11384x, bundle, true);
    }

    @Override // p074k3.a
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

    @Override // p074k3.a
    public final String toString() {
        zan zanVar = this.f11390d;
        D.j(zanVar, "Cannot convert to JSON on client side.");
        Parcel parcelC = c();
        parcelC.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.f11391e;
        D.i(str);
        Map map = (Map) zanVar.f11401b.get(str);
        D.i(map);
        e(sb, map, parcelC);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11387a);
        Parcel parcelC = c();
        if (parcelC != null) {
            int iX1 = Y4.D.x0(2, parcel);
            parcel.appendFrom(parcelC, 0, parcelC.dataSize());
            Y4.D.z0(iX1, parcel);
        }
        Y4.D.r0(parcel, 3, this.f11389c != 0 ? this.f11390d : null, i7, false);
        Y4.D.z0(iX0, parcel);
    }

    @Override // p074k3.a
    public final void zab(FastJsonResponse$Field fastJsonResponse$Field, String str, BigDecimal bigDecimal) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        int i7 = fastJsonResponse$Field.f11384x;
        if (bigDecimal == null) {
            Y4.D.B0(parcel, i7, 0);
            return;
        }
        int iX0 = Y4.D.x0(i7, parcel);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        Y4.D.z0(iX0, parcel);
    }

    @Override // p074k3.a
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
        int iX0 = Y4.D.x0(i8, parcel);
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeByteArray(bigDecimalArr[i9].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i9].scale());
        }
        Y4.D.z0(iX0, parcel);
    }

    @Override // p074k3.a
    public final void zaf(FastJsonResponse$Field fastJsonResponse$Field, String str, BigInteger bigInteger) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        int i7 = fastJsonResponse$Field.f11384x;
        if (bigInteger == null) {
            Y4.D.B0(parcel, i7, 0);
            return;
        }
        int iX0 = Y4.D.x0(i7, parcel);
        parcel.writeByteArray(bigInteger.toByteArray());
        Y4.D.z0(iX0, parcel);
    }

    @Override // p074k3.a
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
        int iX0 = Y4.D.x0(i8, parcel);
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeByteArray(bigIntegerArr[i9].toByteArray());
        }
        Y4.D.z0(iX0, parcel);
    }

    @Override // p074k3.a
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
        int iX0 = Y4.D.x0(i8, parcel);
        parcel.writeBooleanArray(zArr);
        Y4.D.z0(iX0, parcel);
    }

    @Override // p074k3.a
    public final void zan(FastJsonResponse$Field fastJsonResponse$Field, String str, double d7) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        Y4.D.B0(parcel, fastJsonResponse$Field.f11384x, 8);
        parcel.writeDouble(d7);
    }

    @Override // p074k3.a
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
        int iX0 = Y4.D.x0(i8, parcel);
        parcel.writeDoubleArray(dArr);
        Y4.D.z0(iX0, parcel);
    }

    @Override // p074k3.a
    public final void zar(FastJsonResponse$Field fastJsonResponse$Field, String str, float f7) {
        d(fastJsonResponse$Field);
        Parcel parcel = this.f11388b;
        Y4.D.B0(parcel, fastJsonResponse$Field.f11384x, 4);
        parcel.writeFloat(f7);
    }

    @Override // p074k3.a
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
        int iX0 = Y4.D.x0(i8, parcel);
        parcel.writeFloatArray(fArr);
        Y4.D.z0(iX0, parcel);
    }

    @Override // p074k3.a
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

    @Override // p074k3.a
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
        int iX0 = Y4.D.x0(i8, parcel);
        parcel.writeLongArray(jArr);
        Y4.D.z0(iX0, parcel);
    }
}
