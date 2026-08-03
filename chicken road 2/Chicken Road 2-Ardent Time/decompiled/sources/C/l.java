package C;

/* loaded from: classes.dex */
public final class l implements android.os.Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89a;

    public /* synthetic */ l(int i2) {
        this.f89a = i2;
    }

    public static void a(p0.C0952d c0952d, android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        int i3 = c0952d.f8230a;
        a.AbstractC0059a.I(parcel, 1, 4);
        parcel.writeInt(i3);
        a.AbstractC0059a.I(parcel, 2, 4);
        parcel.writeInt(c0952d.f8231b);
        a.AbstractC0059a.I(parcel, 3, 4);
        parcel.writeInt(c0952d.f8232c);
        a.AbstractC0059a.D(parcel, 4, c0952d.f8233d);
        android.os.IBinder iBinder = c0952d.f8234e;
        if (iBinder != null) {
            int G2 = a.AbstractC0059a.G(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            a.AbstractC0059a.H(parcel, G2);
        }
        a.AbstractC0059a.E(parcel, 6, c0952d.f8235f, i2);
        android.os.Bundle bundle = c0952d.f8236g;
        if (bundle != null) {
            int G3 = a.AbstractC0059a.G(parcel, 7);
            parcel.writeBundle(bundle);
            a.AbstractC0059a.H(parcel, G3);
        }
        a.AbstractC0059a.C(parcel, 8, c0952d.f8237h, i2);
        a.AbstractC0059a.E(parcel, 10, c0952d.f8238i, i2);
        a.AbstractC0059a.E(parcel, 11, c0952d.f8239j, i2);
        a.AbstractC0059a.I(parcel, 12, 4);
        parcel.writeInt(c0952d.f8240k ? 1 : 0);
        a.AbstractC0059a.I(parcel, 13, 4);
        parcel.writeInt(c0952d.f8241l);
        boolean z2 = c0952d.f8242m;
        a.AbstractC0059a.I(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        a.AbstractC0059a.D(parcel, 15, c0952d.f8243n);
        a.AbstractC0059a.H(parcel, G);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.f89a) {
            case 0:
                C.m mVar = new C.m(parcel);
                mVar.f90a = parcel.readInt();
                return mVar;
            case 1:
                int B2 = Q1.l.B(parcel);
                android.content.Intent intent = null;
                int i2 = 0;
                int i3 = 0;
                while (parcel.dataPosition() < B2) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 1) {
                        i2 = Q1.l.t(parcel, readInt);
                    } else if (c2 == 2) {
                        i3 = Q1.l.t(parcel, readInt);
                    } else if (c2 != 3) {
                        Q1.l.z(parcel, readInt);
                    } else {
                        intent = (android.content.Intent) Q1.l.f(parcel, readInt, android.content.Intent.CREATOR);
                    }
                }
                Q1.l.j(parcel, B2);
                return new C0.b(i2, i3, intent);
            case 2:
                int B3 = Q1.l.B(parcel);
                java.util.ArrayList<java.lang.String> arrayList = null;
                java.lang.String str = null;
                while (parcel.dataPosition() < B3) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 == 1) {
                        int u2 = Q1.l.u(parcel, readInt2);
                        int dataPosition = parcel.dataPosition();
                        if (u2 == 0) {
                            arrayList = null;
                        } else {
                            java.util.ArrayList<java.lang.String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition + u2);
                            arrayList = createStringArrayList;
                        }
                    } else if (c3 != 2) {
                        Q1.l.z(parcel, readInt2);
                    } else {
                        str = Q1.l.g(parcel, readInt2);
                    }
                }
                Q1.l.j(parcel, B3);
                return new C0.e(arrayList, str);
            case 3:
                int B4 = Q1.l.B(parcel);
                m0.b bVar = null;
                int i4 = 0;
                p0.C0962n c0962n = null;
                while (parcel.dataPosition() < B4) {
                    int readInt3 = parcel.readInt();
                    char c4 = (char) readInt3;
                    if (c4 == 1) {
                        i4 = Q1.l.t(parcel, readInt3);
                    } else if (c4 == 2) {
                        bVar = (m0.b) Q1.l.f(parcel, readInt3, m0.b.CREATOR);
                    } else if (c4 != 3) {
                        Q1.l.z(parcel, readInt3);
                    } else {
                        c0962n = (p0.C0962n) Q1.l.f(parcel, readInt3, p0.C0962n.CREATOR);
                    }
                }
                Q1.l.j(parcel, B4);
                return new C0.f(i4, bVar, c0962n);
            case 4:
                P.C0041n c0041n = new P.C0041n();
                c0041n.f1292a = parcel.readInt();
                c0041n.f1293b = parcel.readInt();
                c0041n.f1294c = parcel.readInt() == 1;
                return c0041n;
            case 5:
                P.K k2 = new P.K();
                k2.f1207a = parcel.readInt();
                k2.f1208b = parcel.readInt();
                k2.f1210d = parcel.readInt() == 1;
                int readInt4 = parcel.readInt();
                if (readInt4 > 0) {
                    int[] iArr = new int[readInt4];
                    k2.f1209c = iArr;
                    parcel.readIntArray(iArr);
                }
                return k2;
            case 6:
                P.L l2 = new P.L();
                l2.f1211a = parcel.readInt();
                l2.f1212b = parcel.readInt();
                int readInt5 = parcel.readInt();
                l2.f1213c = readInt5;
                if (readInt5 > 0) {
                    int[] iArr2 = new int[readInt5];
                    l2.f1214d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt6 = parcel.readInt();
                l2.f1215e = readInt6;
                if (readInt6 > 0) {
                    int[] iArr3 = new int[readInt6];
                    l2.f1216f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                l2.f1218h = parcel.readInt() == 1;
                l2.f1219i = parcel.readInt() == 1;
                l2.f1220j = parcel.readInt() == 1;
                l2.f1217g = parcel.readArrayList(P.K.class.getClassLoader());
                return l2;
            case 7:
                return new androidx.versionedparcelable.ParcelImpl(parcel);
            case 8:
                int B5 = Q1.l.B(parcel);
                java.lang.String str2 = null;
                int i5 = 0;
                while (parcel.dataPosition() < B5) {
                    int readInt7 = parcel.readInt();
                    char c5 = (char) readInt7;
                    if (c5 == 1) {
                        str2 = Q1.l.g(parcel, readInt7);
                    } else if (c5 != 2) {
                        Q1.l.z(parcel, readInt7);
                    } else {
                        i5 = Q1.l.t(parcel, readInt7);
                    }
                }
                Q1.l.j(parcel, B5);
                return new j0.b(str2, i5);
            case 9:
                int B6 = Q1.l.B(parcel);
                java.lang.String str3 = null;
                java.lang.String str4 = null;
                java.lang.String str5 = null;
                java.lang.String str6 = null;
                android.net.Uri uri = null;
                java.lang.String str7 = null;
                java.lang.String str8 = null;
                java.util.ArrayList arrayList2 = null;
                java.lang.String str9 = null;
                java.lang.String str10 = null;
                long j2 = 0;
                int i6 = 0;
                while (parcel.dataPosition() < B6) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i6 = Q1.l.t(parcel, readInt8);
                            break;
                        case 2:
                            str3 = Q1.l.g(parcel, readInt8);
                            break;
                        case 3:
                            str4 = Q1.l.g(parcel, readInt8);
                            break;
                        case 4:
                            str5 = Q1.l.g(parcel, readInt8);
                            break;
                        case 5:
                            str6 = Q1.l.g(parcel, readInt8);
                            break;
                        case 6:
                            uri = (android.net.Uri) Q1.l.f(parcel, readInt8, android.net.Uri.CREATOR);
                            break;
                        case 7:
                            str7 = Q1.l.g(parcel, readInt8);
                            break;
                        case '\b':
                            Q1.l.E(parcel, readInt8, 8);
                            j2 = parcel.readLong();
                            break;
                        case '\t':
                            str8 = Q1.l.g(parcel, readInt8);
                            break;
                        case '\n':
                            android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> creator = com.google.android.gms.common.api.Scope.CREATOR;
                            int u3 = Q1.l.u(parcel, readInt8);
                            int dataPosition2 = parcel.dataPosition();
                            if (u3 != 0) {
                                java.util.ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
                                parcel.setDataPosition(dataPosition2 + u3);
                                arrayList2 = createTypedArrayList;
                                break;
                            } else {
                                arrayList2 = null;
                                break;
                            }
                        case 11:
                            str9 = Q1.l.g(parcel, readInt8);
                            break;
                        case '\f':
                            str10 = Q1.l.g(parcel, readInt8);
                            break;
                        default:
                            Q1.l.z(parcel, readInt8);
                            break;
                    }
                }
                Q1.l.j(parcel, B6);
                return new com.google.android.gms.auth.api.signin.GoogleSignInAccount(i6, str3, str4, str5, str6, uri, str7, j2, str8, arrayList2, str9, str10);
            case 10:
                int B7 = Q1.l.B(parcel);
                android.app.PendingIntent pendingIntent = null;
                int i7 = 0;
                int i8 = 0;
                java.lang.String str11 = null;
                while (parcel.dataPosition() < B7) {
                    int readInt9 = parcel.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 1) {
                        i7 = Q1.l.t(parcel, readInt9);
                    } else if (c6 == 2) {
                        i8 = Q1.l.t(parcel, readInt9);
                    } else if (c6 == 3) {
                        pendingIntent = (android.app.PendingIntent) Q1.l.f(parcel, readInt9, android.app.PendingIntent.CREATOR);
                    } else if (c6 != 4) {
                        Q1.l.z(parcel, readInt9);
                    } else {
                        str11 = Q1.l.g(parcel, readInt9);
                    }
                }
                Q1.l.j(parcel, B7);
                return new m0.b(i7, i8, pendingIntent, str11);
            case 11:
                int B8 = Q1.l.B(parcel);
                long j3 = -1;
                int i9 = 0;
                java.lang.String str12 = null;
                while (parcel.dataPosition() < B8) {
                    int readInt10 = parcel.readInt();
                    char c7 = (char) readInt10;
                    if (c7 == 1) {
                        str12 = Q1.l.g(parcel, readInt10);
                    } else if (c7 == 2) {
                        i9 = Q1.l.t(parcel, readInt10);
                    } else if (c7 != 3) {
                        Q1.l.z(parcel, readInt10);
                    } else {
                        Q1.l.E(parcel, readInt10, 8);
                        j3 = parcel.readLong();
                    }
                }
                Q1.l.j(parcel, B8);
                return new m0.d(str12, i9, j3);
            case 12:
                int B9 = Q1.l.B(parcel);
                java.lang.String str13 = null;
                int i10 = 0;
                while (parcel.dataPosition() < B9) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 == 1) {
                        i10 = Q1.l.t(parcel, readInt11);
                    } else if (c8 != 2) {
                        Q1.l.z(parcel, readInt11);
                    } else {
                        str13 = Q1.l.g(parcel, readInt11);
                    }
                }
                Q1.l.j(parcel, B9);
                return new com.google.android.gms.common.api.Scope(i10, str13);
            case 13:
                int B10 = Q1.l.B(parcel);
                java.lang.String str14 = null;
                m0.b bVar2 = null;
                int i11 = 0;
                android.app.PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < B10) {
                    int readInt12 = parcel.readInt();
                    char c9 = (char) readInt12;
                    if (c9 == 1) {
                        i11 = Q1.l.t(parcel, readInt12);
                    } else if (c9 == 2) {
                        str14 = Q1.l.g(parcel, readInt12);
                    } else if (c9 == 3) {
                        pendingIntent2 = (android.app.PendingIntent) Q1.l.f(parcel, readInt12, android.app.PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        Q1.l.z(parcel, readInt12);
                    } else {
                        bVar2 = (m0.b) Q1.l.f(parcel, readInt12, m0.b.CREATOR);
                    }
                }
                Q1.l.j(parcel, B10);
                return new com.google.android.gms.common.api.Status(i11, str14, pendingIntent2, bVar2);
            case 14:
                int B11 = Q1.l.B(parcel);
                int i12 = 0;
                while (true) {
                    java.util.ArrayList arrayList3 = null;
                    while (parcel.dataPosition() < B11) {
                        int readInt13 = parcel.readInt();
                        char c10 = (char) readInt13;
                        if (c10 == 1) {
                            i12 = Q1.l.t(parcel, readInt13);
                        } else if (c10 != 2) {
                            Q1.l.z(parcel, readInt13);
                        } else {
                            android.os.Parcelable.Creator<p0.C0954f> creator2 = p0.C0954f.CREATOR;
                            int u4 = Q1.l.u(parcel, readInt13);
                            int dataPosition3 = parcel.dataPosition();
                            if (u4 == 0) {
                                break;
                            }
                            arrayList3 = parcel.createTypedArrayList(creator2);
                            parcel.setDataPosition(dataPosition3 + u4);
                        }
                    }
                    Q1.l.j(parcel, B11);
                    return new p0.C0957i(i12, arrayList3);
                    break;
                }
            case 15:
                int B12 = Q1.l.B(parcel);
                int i13 = -1;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                java.lang.String str15 = null;
                java.lang.String str16 = null;
                long j4 = 0;
                long j5 = 0;
                while (parcel.dataPosition() < B12) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i14 = Q1.l.t(parcel, readInt14);
                            break;
                        case 2:
                            i15 = Q1.l.t(parcel, readInt14);
                            break;
                        case 3:
                            i16 = Q1.l.t(parcel, readInt14);
                            break;
                        case 4:
                            Q1.l.E(parcel, readInt14, 8);
                            j4 = parcel.readLong();
                            break;
                        case 5:
                            Q1.l.E(parcel, readInt14, 8);
                            j5 = parcel.readLong();
                            break;
                        case 6:
                            str15 = Q1.l.g(parcel, readInt14);
                            break;
                        case 7:
                            str16 = Q1.l.g(parcel, readInt14);
                            break;
                        case '\b':
                            i17 = Q1.l.t(parcel, readInt14);
                            break;
                        case '\t':
                            i13 = Q1.l.t(parcel, readInt14);
                            break;
                        default:
                            Q1.l.z(parcel, readInt14);
                            break;
                    }
                }
                Q1.l.j(parcel, B12);
                return new p0.C0954f(i14, i15, i16, j4, j5, str15, str16, i17, i13);
            case 16:
                int B13 = Q1.l.B(parcel);
                android.accounts.Account account = null;
                int i18 = 0;
                int i19 = 0;
                com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < B13) {
                    int readInt15 = parcel.readInt();
                    char c11 = (char) readInt15;
                    if (c11 == 1) {
                        i18 = Q1.l.t(parcel, readInt15);
                    } else if (c11 == 2) {
                        account = (android.accounts.Account) Q1.l.f(parcel, readInt15, android.accounts.Account.CREATOR);
                    } else if (c11 == 3) {
                        i19 = Q1.l.t(parcel, readInt15);
                    } else if (c11 != 4) {
                        Q1.l.z(parcel, readInt15);
                    } else {
                        googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) Q1.l.f(parcel, readInt15, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
                    }
                }
                Q1.l.j(parcel, B13);
                return new p0.C0961m(i18, account, i19, googleSignInAccount);
            case 17:
                int B14 = Q1.l.B(parcel);
                int i20 = 0;
                boolean z2 = false;
                boolean z3 = false;
                android.os.IBinder iBinder = null;
                m0.b bVar3 = null;
                while (parcel.dataPosition() < B14) {
                    int readInt16 = parcel.readInt();
                    char c12 = (char) readInt16;
                    if (c12 == 1) {
                        i20 = Q1.l.t(parcel, readInt16);
                    } else if (c12 == 2) {
                        int u5 = Q1.l.u(parcel, readInt16);
                        int dataPosition4 = parcel.dataPosition();
                        if (u5 == 0) {
                            iBinder = null;
                        } else {
                            iBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition4 + u5);
                        }
                    } else if (c12 == 3) {
                        bVar3 = (m0.b) Q1.l.f(parcel, readInt16, m0.b.CREATOR);
                    } else if (c12 == 4) {
                        z2 = Q1.l.s(parcel, readInt16);
                    } else if (c12 != 5) {
                        Q1.l.z(parcel, readInt16);
                    } else {
                        z3 = Q1.l.s(parcel, readInt16);
                    }
                }
                Q1.l.j(parcel, B14);
                return new p0.C0962n(i20, iBinder, bVar3, z2, z3);
            case 18:
                int B15 = Q1.l.B(parcel);
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                boolean z4 = false;
                boolean z5 = false;
                while (parcel.dataPosition() < B15) {
                    int readInt17 = parcel.readInt();
                    char c13 = (char) readInt17;
                    if (c13 == 1) {
                        i21 = Q1.l.t(parcel, readInt17);
                    } else if (c13 == 2) {
                        z4 = Q1.l.s(parcel, readInt17);
                    } else if (c13 == 3) {
                        z5 = Q1.l.s(parcel, readInt17);
                    } else if (c13 == 4) {
                        i22 = Q1.l.t(parcel, readInt17);
                    } else if (c13 != 5) {
                        Q1.l.z(parcel, readInt17);
                    } else {
                        i23 = Q1.l.t(parcel, readInt17);
                    }
                }
                Q1.l.j(parcel, B15);
                return new p0.C0956h(i21, i22, i23, z4, z5);
            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                int B16 = Q1.l.B(parcel);
                int i24 = 0;
                android.os.Bundle bundle = null;
                m0.d[] dVarArr = null;
                p0.C0951c c0951c = null;
                while (parcel.dataPosition() < B16) {
                    int readInt18 = parcel.readInt();
                    char c14 = (char) readInt18;
                    if (c14 == 1) {
                        int u6 = Q1.l.u(parcel, readInt18);
                        int dataPosition5 = parcel.dataPosition();
                        if (u6 == 0) {
                            bundle = null;
                        } else {
                            android.os.Bundle readBundle = parcel.readBundle();
                            parcel.setDataPosition(dataPosition5 + u6);
                            bundle = readBundle;
                        }
                    } else if (c14 == 2) {
                        dVarArr = (m0.d[]) Q1.l.h(parcel, readInt18, m0.d.CREATOR);
                    } else if (c14 == 3) {
                        i24 = Q1.l.t(parcel, readInt18);
                    } else if (c14 != 4) {
                        Q1.l.z(parcel, readInt18);
                    } else {
                        c0951c = (p0.C0951c) Q1.l.f(parcel, readInt18, p0.C0951c.CREATOR);
                    }
                }
                Q1.l.j(parcel, B16);
                p0.C0972x c0972x = new p0.C0972x();
                c0972x.f8296a = bundle;
                c0972x.f8297b = dVarArr;
                c0972x.f8298c = i24;
                c0972x.f8299d = c0951c;
                return c0972x;
            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                int B17 = Q1.l.B(parcel);
                p0.C0956h c0956h = null;
                int[] iArr4 = null;
                int[] iArr5 = null;
                boolean z6 = false;
                boolean z7 = false;
                int i25 = 0;
                while (parcel.dataPosition() < B17) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            c0956h = (p0.C0956h) Q1.l.f(parcel, readInt19, p0.C0956h.CREATOR);
                            break;
                        case 2:
                            z6 = Q1.l.s(parcel, readInt19);
                            break;
                        case 3:
                            z7 = Q1.l.s(parcel, readInt19);
                            break;
                        case 4:
                            int u7 = Q1.l.u(parcel, readInt19);
                            int dataPosition6 = parcel.dataPosition();
                            if (u7 != 0) {
                                iArr4 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition6 + u7);
                                break;
                            } else {
                                iArr4 = null;
                                break;
                            }
                        case 5:
                            i25 = Q1.l.t(parcel, readInt19);
                            break;
                        case 6:
                            int u8 = Q1.l.u(parcel, readInt19);
                            int dataPosition7 = parcel.dataPosition();
                            if (u8 != 0) {
                                iArr5 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition7 + u8);
                                break;
                            } else {
                                iArr5 = null;
                                break;
                            }
                        default:
                            Q1.l.z(parcel, readInt19);
                            break;
                    }
                }
                Q1.l.j(parcel, B17);
                return new p0.C0951c(c0956h, z6, z7, iArr4, i25, iArr5);
            default:
                int B18 = Q1.l.B(parcel);
                com.google.android.gms.common.api.Scope[] scopeArr = p0.C0952d.f8228o;
                android.os.Bundle bundle2 = new android.os.Bundle();
                m0.d[] dVarArr2 = p0.C0952d.f8229p;
                m0.d[] dVarArr3 = dVarArr2;
                java.lang.String str17 = null;
                android.os.IBinder iBinder2 = null;
                android.accounts.Account account2 = null;
                java.lang.String str18 = null;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                boolean z8 = false;
                int i29 = 0;
                boolean z9 = false;
                while (parcel.dataPosition() < B18) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            i26 = Q1.l.t(parcel, readInt20);
                            break;
                        case 2:
                            i27 = Q1.l.t(parcel, readInt20);
                            break;
                        case 3:
                            i28 = Q1.l.t(parcel, readInt20);
                            break;
                        case 4:
                            str17 = Q1.l.g(parcel, readInt20);
                            break;
                        case 5:
                            int u9 = Q1.l.u(parcel, readInt20);
                            int dataPosition8 = parcel.dataPosition();
                            if (u9 != 0) {
                                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition8 + u9);
                                iBinder2 = readStrongBinder;
                                break;
                            } else {
                                iBinder2 = null;
                                break;
                            }
                        case 6:
                            scopeArr = (com.google.android.gms.common.api.Scope[]) Q1.l.h(parcel, readInt20, com.google.android.gms.common.api.Scope.CREATOR);
                            break;
                        case 7:
                            int u10 = Q1.l.u(parcel, readInt20);
                            int dataPosition9 = parcel.dataPosition();
                            if (u10 != 0) {
                                android.os.Bundle readBundle2 = parcel.readBundle();
                                parcel.setDataPosition(dataPosition9 + u10);
                                bundle2 = readBundle2;
                                break;
                            } else {
                                bundle2 = null;
                                break;
                            }
                        case '\b':
                            account2 = (android.accounts.Account) Q1.l.f(parcel, readInt20, android.accounts.Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            Q1.l.z(parcel, readInt20);
                            break;
                        case '\n':
                            dVarArr2 = (m0.d[]) Q1.l.h(parcel, readInt20, m0.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (m0.d[]) Q1.l.h(parcel, readInt20, m0.d.CREATOR);
                            break;
                        case '\f':
                            z8 = Q1.l.s(parcel, readInt20);
                            break;
                        case '\r':
                            i29 = Q1.l.t(parcel, readInt20);
                            break;
                        case 14:
                            z9 = Q1.l.s(parcel, readInt20);
                            break;
                        case 15:
                            str18 = Q1.l.g(parcel, readInt20);
                            break;
                    }
                }
                Q1.l.j(parcel, B18);
                return new p0.C0952d(i26, i27, i28, str17, iBinder2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, z8, i29, z9, str18);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i2) {
        switch (this.f89a) {
            case 0:
                return new C.m[i2];
            case 1:
                return new C0.b[i2];
            case 2:
                return new C0.e[i2];
            case 3:
                return new C0.f[i2];
            case 4:
                return new P.C0041n[i2];
            case 5:
                return new P.K[i2];
            case 6:
                return new P.L[i2];
            case 7:
                return new androidx.versionedparcelable.ParcelImpl[i2];
            case 8:
                return new j0.b[i2];
            case 9:
                return new com.google.android.gms.auth.api.signin.GoogleSignInAccount[i2];
            case 10:
                return new m0.b[i2];
            case 11:
                return new m0.d[i2];
            case 12:
                return new com.google.android.gms.common.api.Scope[i2];
            case 13:
                return new com.google.android.gms.common.api.Status[i2];
            case 14:
                return new p0.C0957i[i2];
            case 15:
                return new p0.C0954f[i2];
            case 16:
                return new p0.C0961m[i2];
            case 17:
                return new p0.C0962n[i2];
            case 18:
                return new p0.C0956h[i2];
            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                return new p0.C0972x[i2];
            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                return new p0.C0951c[i2];
            default:
                return new p0.C0952d[i2];
        }
    }
}
