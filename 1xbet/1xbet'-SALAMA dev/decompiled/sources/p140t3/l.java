package p140t3;

import Q0.a;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.zzh;
import com.google.android.gms.fido.fido2.api.common.zzq;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import java.util.ArrayList;
import p147u3.b;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16459a;

    public /* synthetic */ l(int i7) {
        this.f16459a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f16459a) {
            case 0:
                int iA0 = a.a0(parcel);
                byte[] bArrK = null;
                boolean zK = false;
                while (parcel.dataPosition() < iA0) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        zK = a.K(i7, parcel);
                    } else if (c3 != 2) {
                        a.X(i7, parcel);
                    } else {
                        bArrK = a.k(i7, parcel);
                    }
                }
                a.y(iA0, parcel);
                return new zzh(bArrK, zK);
            case 1:
                int iA1 = a.a0(parcel);
                byte[] bArrK2 = null;
                byte[] bArrK3 = null;
                byte[] bArrK4 = null;
                byte[] bArrK5 = null;
                byte[] bArrK6 = null;
                while (parcel.dataPosition() < iA1) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 2) {
                        bArrK2 = a.k(i8, parcel);
                    } else if (c4 == 3) {
                        bArrK3 = a.k(i8, parcel);
                    } else if (c4 == 4) {
                        bArrK4 = a.k(i8, parcel);
                    } else if (c4 == 5) {
                        bArrK5 = a.k(i8, parcel);
                    } else if (c4 != 6) {
                        a.X(i8, parcel);
                    } else {
                        bArrK6 = a.k(i8, parcel);
                    }
                }
                a.y(iA1, parcel);
                return new AuthenticatorAssertionResponse(bArrK2, bArrK3, bArrK4, bArrK5, bArrK6);
            case 2:
                int iA2 = a.a0(parcel);
                byte[] bArrK7 = null;
                byte[] bArrK8 = null;
                byte[] bArrK9 = null;
                String[] strArrO = null;
                while (parcel.dataPosition() < iA2) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 2) {
                        bArrK7 = a.k(i9, parcel);
                    } else if (c7 == 3) {
                        bArrK8 = a.k(i9, parcel);
                    } else if (c7 == 4) {
                        bArrK9 = a.k(i9, parcel);
                    } else if (c7 != 5) {
                        a.X(i9, parcel);
                    } else {
                        strArrO = a.o(i9, parcel);
                    }
                }
                a.y(iA2, parcel);
                return new AuthenticatorAttestationResponse(bArrK7, bArrK8, bArrK9, strArrO);
            case 3:
                int iA3 = a.a0(parcel);
                int iN = 0;
                String strN = null;
                int iN2 = 0;
                while (parcel.dataPosition() < iA3) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 2) {
                        iN = a.N(i10, parcel);
                    } else if (c8 == 3) {
                        strN = a.n(i10, parcel);
                    } else if (c8 != 4) {
                        a.X(i10, parcel);
                    } else {
                        iN2 = a.N(i10, parcel);
                    }
                }
                a.y(iA3, parcel);
                return new AuthenticatorErrorResponse(iN, strN, iN2);
            case 4:
                int iA4 = a.a0(parcel);
                String strN2 = null;
                Boolean boolValueOf = null;
                String strN3 = null;
                String strN4 = null;
                while (parcel.dataPosition() < iA4) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 2) {
                        strN2 = a.n(i11, parcel);
                    } else if (c9 == 3) {
                        int iR = a.R(i11, parcel);
                        if (iR == 0) {
                            boolValueOf = null;
                        } else {
                            a.f0(parcel, iR, 4);
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c9 == 4) {
                        strN3 = a.n(i11, parcel);
                    } else if (c9 != 5) {
                        a.X(i11, parcel);
                    } else {
                        strN4 = a.n(i11, parcel);
                    }
                }
                a.y(iA4, parcel);
                return new AuthenticatorSelectionCriteria(strN2, boolValueOf, strN3, strN4);
            case 5:
                int iA5 = a.a0(parcel);
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
                Uri uri = null;
                byte[] bArrK10 = null;
                while (parcel.dataPosition() < iA5) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 2) {
                        publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) a.m(parcel, i12, PublicKeyCredentialCreationOptions.CREATOR);
                    } else if (c10 == 3) {
                        uri = (Uri) a.m(parcel, i12, Uri.CREATOR);
                    } else if (c10 != 4) {
                        a.X(i12, parcel);
                    } else {
                        bArrK10 = a.k(i12, parcel);
                    }
                }
                a.y(iA5, parcel);
                return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArrK10);
            case 6:
                int iA6 = a.a0(parcel);
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
                Uri uri2 = null;
                byte[] bArrK11 = null;
                while (parcel.dataPosition() < iA6) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 2) {
                        publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) a.m(parcel, i13, PublicKeyCredentialRequestOptions.CREATOR);
                    } else if (c11 == 3) {
                        uri2 = (Uri) a.m(parcel, i13, Uri.CREATOR);
                    } else if (c11 != 4) {
                        a.X(i13, parcel);
                    } else {
                        bArrK11 = a.k(i13, parcel);
                    }
                }
                a.y(iA6, parcel);
                return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri2, bArrK11);
            case 7:
                try {
                    return COSEAlgorithmIdentifier.a(parcel.readInt());
                } catch (d e7) {
                    throw new RuntimeException(e7);
                }
            case 8:
                int iA7 = a.a0(parcel);
                byte[] bArrK12 = null;
                byte[] bArrK13 = null;
                byte[] bArrK14 = null;
                long jP = 0;
                while (parcel.dataPosition() < iA7) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        jP = a.P(i14, parcel);
                    } else if (c12 == 2) {
                        bArrK12 = a.k(i14, parcel);
                    } else if (c12 == 3) {
                        bArrK13 = a.k(i14, parcel);
                    } else if (c12 != 4) {
                        a.X(i14, parcel);
                    } else {
                        bArrK14 = a.k(i14, parcel);
                    }
                }
                a.y(iA7, parcel);
                return new zzq(jP, bArrK12, bArrK13, bArrK14);
            case 9:
                int iA8 = a.a0(parcel);
                ArrayList arrayListR = null;
                while (parcel.dataPosition() < iA8) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        a.X(i15, parcel);
                    } else {
                        arrayListR = a.r(parcel, i15, zzq.CREATOR);
                    }
                }
                a.y(iA8, parcel);
                return new zzs(arrayListR);
            case 10:
                int iA9 = a.a0(parcel);
                boolean zK2 = false;
                while (parcel.dataPosition() < iA9) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        a.X(i16, parcel);
                    } else {
                        zK2 = a.K(i16, parcel);
                    }
                }
                a.y(iA9, parcel);
                return new zzu(zK2);
            case 11:
                try {
                    return ErrorCode.a(parcel.readInt());
                } catch (f e8) {
                    throw new IllegalArgumentException(e8);
                }
            case 12:
                int iA10 = a.a0(parcel);
                String strN5 = null;
                while (parcel.dataPosition() < iA10) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 2) {
                        a.X(i17, parcel);
                    } else {
                        strN5 = a.n(i17, parcel);
                    }
                }
                a.y(iA10, parcel);
                return new FidoAppIdExtension(strN5);
            case 13:
                int iA11 = a.a0(parcel);
                String strN6 = null;
                int iN3 = 0;
                String strN7 = null;
                while (parcel.dataPosition() < iA11) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 2) {
                        iN3 = a.N(i18, parcel);
                    } else if (c13 == 3) {
                        strN6 = a.n(i18, parcel);
                    } else if (c13 != 4) {
                        a.X(i18, parcel);
                    } else {
                        strN7 = a.n(i18, parcel);
                    }
                }
                a.y(iA11, parcel);
                return new ChannelIdValue(iN3, strN6, strN7);
            case 14:
                int iA12 = a.a0(parcel);
                byte[] bArrK15 = null;
                ArrayList arrayListR2 = null;
                int iN4 = 0;
                String strN8 = null;
                while (parcel.dataPosition() < iA12) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 1) {
                        iN4 = a.N(i19, parcel);
                    } else if (c14 == 2) {
                        bArrK15 = a.k(i19, parcel);
                    } else if (c14 == 3) {
                        strN8 = a.n(i19, parcel);
                    } else if (c14 != 4) {
                        a.X(i19, parcel);
                    } else {
                        arrayListR2 = a.r(parcel, i19, Transport.CREATOR);
                    }
                }
                a.y(iA12, parcel);
                return new KeyHandle(iN4, strN8, arrayListR2, bArrK15);
            case 15:
                try {
                    return ProtocolVersion.a(parcel.readString());
                } catch (b e9) {
                    throw new RuntimeException(e9);
                }
            case 16:
                int iA13 = a.a0(parcel);
                String strN9 = null;
                String strN10 = null;
                int iN5 = 0;
                byte[] bArrK16 = null;
                while (parcel.dataPosition() < iA13) {
                    int i20 = parcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 1) {
                        iN5 = a.N(i20, parcel);
                    } else if (c15 == 2) {
                        strN9 = a.n(i20, parcel);
                    } else if (c15 == 3) {
                        bArrK16 = a.k(i20, parcel);
                    } else if (c15 != 4) {
                        a.X(i20, parcel);
                    } else {
                        strN10 = a.n(i20, parcel);
                    }
                }
                a.y(iA13, parcel);
                return new RegisterRequest(strN9, strN10, iN5, bArrK16);
            case 17:
                int iA14 = a.a0(parcel);
                Integer numO = null;
                Double dL = null;
                Uri uri3 = null;
                ArrayList arrayListR3 = null;
                ArrayList arrayListR4 = null;
                ChannelIdValue channelIdValue = null;
                String strN11 = null;
                while (parcel.dataPosition() < iA14) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 2:
                            numO = a.O(i21, parcel);
                            break;
                        case 3:
                            dL = a.L(i21, parcel);
                            break;
                        case 4:
                            uri3 = (Uri) a.m(parcel, i21, Uri.CREATOR);
                            break;
                        case 5:
                            arrayListR3 = a.r(parcel, i21, RegisterRequest.CREATOR);
                            break;
                        case 6:
                            arrayListR4 = a.r(parcel, i21, RegisteredKey.CREATOR);
                            break;
                        case 7:
                            channelIdValue = (ChannelIdValue) a.m(parcel, i21, ChannelIdValue.CREATOR);
                            break;
                        case '\b':
                            strN11 = a.n(i21, parcel);
                            break;
                        default:
                            a.X(i21, parcel);
                            break;
                    }
                }
                a.y(iA14, parcel);
                return new RegisterRequestParams(numO, dL, uri3, arrayListR3, arrayListR4, channelIdValue, strN11);
            case 18:
                int iA15 = a.a0(parcel);
                KeyHandle keyHandle = null;
                String strN12 = null;
                String strN13 = null;
                while (parcel.dataPosition() < iA15) {
                    int i22 = parcel.readInt();
                    char c16 = (char) i22;
                    if (c16 == 2) {
                        keyHandle = (KeyHandle) a.m(parcel, i22, KeyHandle.CREATOR);
                    } else if (c16 == 3) {
                        strN12 = a.n(i22, parcel);
                    } else if (c16 != 4) {
                        a.X(i22, parcel);
                    } else {
                        strN13 = a.n(i22, parcel);
                    }
                }
                a.y(iA15, parcel);
                return new RegisteredKey(keyHandle, strN12, strN13);
            case 19:
                int iA16 = a.a0(parcel);
                Integer numO2 = null;
                Double dL2 = null;
                Uri uri4 = null;
                byte[] bArrK17 = null;
                ArrayList arrayListR5 = null;
                ChannelIdValue channelIdValue2 = null;
                String strN14 = null;
                while (parcel.dataPosition() < iA16) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 2:
                            numO2 = a.O(i23, parcel);
                            break;
                        case 3:
                            dL2 = a.L(i23, parcel);
                            break;
                        case 4:
                            uri4 = (Uri) a.m(parcel, i23, Uri.CREATOR);
                            break;
                        case 5:
                            bArrK17 = a.k(i23, parcel);
                            break;
                        case 6:
                            arrayListR5 = a.r(parcel, i23, RegisteredKey.CREATOR);
                            break;
                        case 7:
                            channelIdValue2 = (ChannelIdValue) a.m(parcel, i23, ChannelIdValue.CREATOR);
                            break;
                        case '\b':
                            strN14 = a.n(i23, parcel);
                            break;
                        default:
                            a.X(i23, parcel);
                            break;
                    }
                }
                a.y(iA16, parcel);
                return new SignRequestParams(numO2, dL2, uri4, bArrK17, arrayListR5, channelIdValue2, strN14);
            case 20:
                int iA17 = a.a0(parcel);
                int iN6 = 0;
                Intent intent = null;
                int iN7 = 0;
                while (parcel.dataPosition() < iA17) {
                    int i24 = parcel.readInt();
                    char c17 = (char) i24;
                    if (c17 == 1) {
                        iN6 = a.N(i24, parcel);
                    } else if (c17 == 2) {
                        iN7 = a.N(i24, parcel);
                    } else if (c17 != 3) {
                        a.X(i24, parcel);
                    } else {
                        intent = (Intent) a.m(parcel, i24, Intent.CREATOR);
                    }
                }
                a.y(iA17, parcel);
                return new zaa(iN6, iN7, intent);
            case zzbbd.zzt.zzm /* 21 */:
                int iA18 = a.a0(parcel);
                ArrayList arrayListP = null;
                String strN15 = null;
                while (parcel.dataPosition() < iA18) {
                    int i25 = parcel.readInt();
                    char c18 = (char) i25;
                    if (c18 == 1) {
                        arrayListP = a.p(i25, parcel);
                    } else if (c18 != 2) {
                        a.X(i25, parcel);
                    } else {
                        strN15 = a.n(i25, parcel);
                    }
                }
                a.y(iA18, parcel);
                return new zag(strN15, arrayListP);
            case 22:
                int iA19 = a.a0(parcel);
                int iN8 = 0;
                zat zatVar = null;
                while (parcel.dataPosition() < iA19) {
                    int i26 = parcel.readInt();
                    char c19 = (char) i26;
                    if (c19 == 1) {
                        iN8 = a.N(i26, parcel);
                    } else if (c19 != 2) {
                        a.X(i26, parcel);
                    } else {
                        zatVar = (zat) a.m(parcel, i26, zat.CREATOR);
                    }
                }
                a.y(iA19, parcel);
                return new zai(iN8, zatVar);
            default:
                int iA20 = a.a0(parcel);
                int iN9 = 0;
                ConnectionResult connectionResult = null;
                zav zavVar = null;
                while (parcel.dataPosition() < iA20) {
                    int i27 = parcel.readInt();
                    char c20 = (char) i27;
                    if (c20 == 1) {
                        iN9 = a.N(i27, parcel);
                    } else if (c20 == 2) {
                        connectionResult = (ConnectionResult) a.m(parcel, i27, ConnectionResult.CREATOR);
                    } else if (c20 != 3) {
                        a.X(i27, parcel);
                    } else {
                        zavVar = (zav) a.m(parcel, i27, zav.CREATOR);
                    }
                }
                a.y(iA20, parcel);
                return new zak(iN9, connectionResult, zavVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f16459a) {
            case 0:
                return new zzh[i7];
            case 1:
                return new AuthenticatorAssertionResponse[i7];
            case 2:
                return new AuthenticatorAttestationResponse[i7];
            case 3:
                return new AuthenticatorErrorResponse[i7];
            case 4:
                return new AuthenticatorSelectionCriteria[i7];
            case 5:
                return new BrowserPublicKeyCredentialCreationOptions[i7];
            case 6:
                return new BrowserPublicKeyCredentialRequestOptions[i7];
            case 7:
                return new COSEAlgorithmIdentifier[i7];
            case 8:
                return new zzq[i7];
            case 9:
                return new zzs[i7];
            case 10:
                return new zzu[i7];
            case 11:
                return new ErrorCode[i7];
            case 12:
                return new FidoAppIdExtension[i7];
            case 13:
                return new ChannelIdValue[i7];
            case 14:
                return new KeyHandle[i7];
            case 15:
                return new ProtocolVersion[i7];
            case 16:
                return new RegisterRequest[i7];
            case 17:
                return new RegisterRequestParams[i7];
            case 18:
                return new RegisteredKey[i7];
            case 19:
                return new SignRequestParams[i7];
            case 20:
                return new zaa[i7];
            case zzbbd.zzt.zzm /* 21 */:
                return new zag[i7];
            case 22:
                return new zai[i7];
            default:
                return new zak[i7];
        }
    }
}
