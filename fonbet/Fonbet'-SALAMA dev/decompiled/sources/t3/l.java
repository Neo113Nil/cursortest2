package t3;

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

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16453a;

    public /* synthetic */ l(int i7) {
        this.f16453a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f16453a) {
            case 0:
                int a02 = Q0.a.a0(parcel);
                byte[] bArr = null;
                boolean z4 = false;
                while (parcel.dataPosition() < a02) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        z4 = Q0.a.K(readInt, parcel);
                    } else if (c3 != 2) {
                        Q0.a.X(readInt, parcel);
                    } else {
                        bArr = Q0.a.k(readInt, parcel);
                    }
                }
                Q0.a.y(a02, parcel);
                return new zzh(bArr, z4);
            case 1:
                int a03 = Q0.a.a0(parcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                while (parcel.dataPosition() < a03) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 == 2) {
                        bArr2 = Q0.a.k(readInt2, parcel);
                    } else if (c4 == 3) {
                        bArr3 = Q0.a.k(readInt2, parcel);
                    } else if (c4 == 4) {
                        bArr4 = Q0.a.k(readInt2, parcel);
                    } else if (c4 == 5) {
                        bArr5 = Q0.a.k(readInt2, parcel);
                    } else if (c4 != 6) {
                        Q0.a.X(readInt2, parcel);
                    } else {
                        bArr6 = Q0.a.k(readInt2, parcel);
                    }
                }
                Q0.a.y(a03, parcel);
                return new AuthenticatorAssertionResponse(bArr2, bArr3, bArr4, bArr5, bArr6);
            case 2:
                int a04 = Q0.a.a0(parcel);
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                byte[] bArr9 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < a04) {
                    int readInt3 = parcel.readInt();
                    char c7 = (char) readInt3;
                    if (c7 == 2) {
                        bArr7 = Q0.a.k(readInt3, parcel);
                    } else if (c7 == 3) {
                        bArr8 = Q0.a.k(readInt3, parcel);
                    } else if (c7 == 4) {
                        bArr9 = Q0.a.k(readInt3, parcel);
                    } else if (c7 != 5) {
                        Q0.a.X(readInt3, parcel);
                    } else {
                        strArr = Q0.a.o(readInt3, parcel);
                    }
                }
                Q0.a.y(a04, parcel);
                return new AuthenticatorAttestationResponse(bArr7, bArr8, bArr9, strArr);
            case 3:
                int a05 = Q0.a.a0(parcel);
                int i7 = 0;
                String str = null;
                int i8 = 0;
                while (parcel.dataPosition() < a05) {
                    int readInt4 = parcel.readInt();
                    char c8 = (char) readInt4;
                    if (c8 == 2) {
                        i7 = Q0.a.N(readInt4, parcel);
                    } else if (c8 == 3) {
                        str = Q0.a.n(readInt4, parcel);
                    } else if (c8 != 4) {
                        Q0.a.X(readInt4, parcel);
                    } else {
                        i8 = Q0.a.N(readInt4, parcel);
                    }
                }
                Q0.a.y(a05, parcel);
                return new AuthenticatorErrorResponse(i7, str, i8);
            case 4:
                int a06 = Q0.a.a0(parcel);
                String str2 = null;
                Boolean bool = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < a06) {
                    int readInt5 = parcel.readInt();
                    char c9 = (char) readInt5;
                    if (c9 == 2) {
                        str2 = Q0.a.n(readInt5, parcel);
                    } else if (c9 == 3) {
                        int R6 = Q0.a.R(readInt5, parcel);
                        if (R6 == 0) {
                            bool = null;
                        } else {
                            Q0.a.f0(parcel, R6, 4);
                            bool = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c9 == 4) {
                        str3 = Q0.a.n(readInt5, parcel);
                    } else if (c9 != 5) {
                        Q0.a.X(readInt5, parcel);
                    } else {
                        str4 = Q0.a.n(readInt5, parcel);
                    }
                }
                Q0.a.y(a06, parcel);
                return new AuthenticatorSelectionCriteria(str2, bool, str3, str4);
            case 5:
                int a07 = Q0.a.a0(parcel);
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
                Uri uri = null;
                byte[] bArr10 = null;
                while (parcel.dataPosition() < a07) {
                    int readInt6 = parcel.readInt();
                    char c10 = (char) readInt6;
                    if (c10 == 2) {
                        publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) Q0.a.m(parcel, readInt6, PublicKeyCredentialCreationOptions.CREATOR);
                    } else if (c10 == 3) {
                        uri = (Uri) Q0.a.m(parcel, readInt6, Uri.CREATOR);
                    } else if (c10 != 4) {
                        Q0.a.X(readInt6, parcel);
                    } else {
                        bArr10 = Q0.a.k(readInt6, parcel);
                    }
                }
                Q0.a.y(a07, parcel);
                return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArr10);
            case 6:
                int a08 = Q0.a.a0(parcel);
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
                Uri uri2 = null;
                byte[] bArr11 = null;
                while (parcel.dataPosition() < a08) {
                    int readInt7 = parcel.readInt();
                    char c11 = (char) readInt7;
                    if (c11 == 2) {
                        publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) Q0.a.m(parcel, readInt7, PublicKeyCredentialRequestOptions.CREATOR);
                    } else if (c11 == 3) {
                        uri2 = (Uri) Q0.a.m(parcel, readInt7, Uri.CREATOR);
                    } else if (c11 != 4) {
                        Q0.a.X(readInt7, parcel);
                    } else {
                        bArr11 = Q0.a.k(readInt7, parcel);
                    }
                }
                Q0.a.y(a08, parcel);
                return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri2, bArr11);
            case 7:
                try {
                    return COSEAlgorithmIdentifier.a(parcel.readInt());
                } catch (d e7) {
                    throw new RuntimeException(e7);
                }
            case 8:
                int a09 = Q0.a.a0(parcel);
                byte[] bArr12 = null;
                byte[] bArr13 = null;
                byte[] bArr14 = null;
                long j = 0;
                while (parcel.dataPosition() < a09) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 1) {
                        j = Q0.a.P(readInt8, parcel);
                    } else if (c12 == 2) {
                        bArr12 = Q0.a.k(readInt8, parcel);
                    } else if (c12 == 3) {
                        bArr13 = Q0.a.k(readInt8, parcel);
                    } else if (c12 != 4) {
                        Q0.a.X(readInt8, parcel);
                    } else {
                        bArr14 = Q0.a.k(readInt8, parcel);
                    }
                }
                Q0.a.y(a09, parcel);
                return new zzq(j, bArr12, bArr13, bArr14);
            case 9:
                int a010 = Q0.a.a0(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < a010) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        Q0.a.X(readInt9, parcel);
                    } else {
                        arrayList = Q0.a.r(parcel, readInt9, zzq.CREATOR);
                    }
                }
                Q0.a.y(a010, parcel);
                return new zzs(arrayList);
            case 10:
                int a011 = Q0.a.a0(parcel);
                boolean z7 = false;
                while (parcel.dataPosition() < a011) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        Q0.a.X(readInt10, parcel);
                    } else {
                        z7 = Q0.a.K(readInt10, parcel);
                    }
                }
                Q0.a.y(a011, parcel);
                return new zzu(z7);
            case 11:
                try {
                    return ErrorCode.a(parcel.readInt());
                } catch (f e8) {
                    throw new IllegalArgumentException(e8);
                }
            case 12:
                int a012 = Q0.a.a0(parcel);
                String str5 = null;
                while (parcel.dataPosition() < a012) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 2) {
                        Q0.a.X(readInt11, parcel);
                    } else {
                        str5 = Q0.a.n(readInt11, parcel);
                    }
                }
                Q0.a.y(a012, parcel);
                return new FidoAppIdExtension(str5);
            case 13:
                int a013 = Q0.a.a0(parcel);
                String str6 = null;
                int i9 = 0;
                String str7 = null;
                while (parcel.dataPosition() < a013) {
                    int readInt12 = parcel.readInt();
                    char c13 = (char) readInt12;
                    if (c13 == 2) {
                        i9 = Q0.a.N(readInt12, parcel);
                    } else if (c13 == 3) {
                        str6 = Q0.a.n(readInt12, parcel);
                    } else if (c13 != 4) {
                        Q0.a.X(readInt12, parcel);
                    } else {
                        str7 = Q0.a.n(readInt12, parcel);
                    }
                }
                Q0.a.y(a013, parcel);
                return new ChannelIdValue(i9, str6, str7);
            case 14:
                int a014 = Q0.a.a0(parcel);
                byte[] bArr15 = null;
                ArrayList arrayList2 = null;
                int i10 = 0;
                String str8 = null;
                while (parcel.dataPosition() < a014) {
                    int readInt13 = parcel.readInt();
                    char c14 = (char) readInt13;
                    if (c14 == 1) {
                        i10 = Q0.a.N(readInt13, parcel);
                    } else if (c14 == 2) {
                        bArr15 = Q0.a.k(readInt13, parcel);
                    } else if (c14 == 3) {
                        str8 = Q0.a.n(readInt13, parcel);
                    } else if (c14 != 4) {
                        Q0.a.X(readInt13, parcel);
                    } else {
                        arrayList2 = Q0.a.r(parcel, readInt13, Transport.CREATOR);
                    }
                }
                Q0.a.y(a014, parcel);
                return new KeyHandle(i10, str8, arrayList2, bArr15);
            case 15:
                try {
                    return ProtocolVersion.a(parcel.readString());
                } catch (u3.b e9) {
                    throw new RuntimeException(e9);
                }
            case 16:
                int a015 = Q0.a.a0(parcel);
                String str9 = null;
                String str10 = null;
                int i11 = 0;
                byte[] bArr16 = null;
                while (parcel.dataPosition() < a015) {
                    int readInt14 = parcel.readInt();
                    char c15 = (char) readInt14;
                    if (c15 == 1) {
                        i11 = Q0.a.N(readInt14, parcel);
                    } else if (c15 == 2) {
                        str9 = Q0.a.n(readInt14, parcel);
                    } else if (c15 == 3) {
                        bArr16 = Q0.a.k(readInt14, parcel);
                    } else if (c15 != 4) {
                        Q0.a.X(readInt14, parcel);
                    } else {
                        str10 = Q0.a.n(readInt14, parcel);
                    }
                }
                Q0.a.y(a015, parcel);
                return new RegisterRequest(str9, str10, i11, bArr16);
            case 17:
                int a016 = Q0.a.a0(parcel);
                Integer num = null;
                Double d7 = null;
                Uri uri3 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ChannelIdValue channelIdValue = null;
                String str11 = null;
                while (parcel.dataPosition() < a016) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            num = Q0.a.O(readInt15, parcel);
                            break;
                        case 3:
                            d7 = Q0.a.L(readInt15, parcel);
                            break;
                        case 4:
                            uri3 = (Uri) Q0.a.m(parcel, readInt15, Uri.CREATOR);
                            break;
                        case 5:
                            arrayList3 = Q0.a.r(parcel, readInt15, RegisterRequest.CREATOR);
                            break;
                        case 6:
                            arrayList4 = Q0.a.r(parcel, readInt15, RegisteredKey.CREATOR);
                            break;
                        case 7:
                            channelIdValue = (ChannelIdValue) Q0.a.m(parcel, readInt15, ChannelIdValue.CREATOR);
                            break;
                        case '\b':
                            str11 = Q0.a.n(readInt15, parcel);
                            break;
                        default:
                            Q0.a.X(readInt15, parcel);
                            break;
                    }
                }
                Q0.a.y(a016, parcel);
                return new RegisterRequestParams(num, d7, uri3, arrayList3, arrayList4, channelIdValue, str11);
            case 18:
                int a017 = Q0.a.a0(parcel);
                KeyHandle keyHandle = null;
                String str12 = null;
                String str13 = null;
                while (parcel.dataPosition() < a017) {
                    int readInt16 = parcel.readInt();
                    char c16 = (char) readInt16;
                    if (c16 == 2) {
                        keyHandle = (KeyHandle) Q0.a.m(parcel, readInt16, KeyHandle.CREATOR);
                    } else if (c16 == 3) {
                        str12 = Q0.a.n(readInt16, parcel);
                    } else if (c16 != 4) {
                        Q0.a.X(readInt16, parcel);
                    } else {
                        str13 = Q0.a.n(readInt16, parcel);
                    }
                }
                Q0.a.y(a017, parcel);
                return new RegisteredKey(keyHandle, str12, str13);
            case 19:
                int a018 = Q0.a.a0(parcel);
                Integer num2 = null;
                Double d8 = null;
                Uri uri4 = null;
                byte[] bArr17 = null;
                ArrayList arrayList5 = null;
                ChannelIdValue channelIdValue2 = null;
                String str14 = null;
                while (parcel.dataPosition() < a018) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            num2 = Q0.a.O(readInt17, parcel);
                            break;
                        case 3:
                            d8 = Q0.a.L(readInt17, parcel);
                            break;
                        case 4:
                            uri4 = (Uri) Q0.a.m(parcel, readInt17, Uri.CREATOR);
                            break;
                        case 5:
                            bArr17 = Q0.a.k(readInt17, parcel);
                            break;
                        case 6:
                            arrayList5 = Q0.a.r(parcel, readInt17, RegisteredKey.CREATOR);
                            break;
                        case 7:
                            channelIdValue2 = (ChannelIdValue) Q0.a.m(parcel, readInt17, ChannelIdValue.CREATOR);
                            break;
                        case '\b':
                            str14 = Q0.a.n(readInt17, parcel);
                            break;
                        default:
                            Q0.a.X(readInt17, parcel);
                            break;
                    }
                }
                Q0.a.y(a018, parcel);
                return new SignRequestParams(num2, d8, uri4, bArr17, arrayList5, channelIdValue2, str14);
            case 20:
                int a019 = Q0.a.a0(parcel);
                int i12 = 0;
                Intent intent = null;
                int i13 = 0;
                while (parcel.dataPosition() < a019) {
                    int readInt18 = parcel.readInt();
                    char c17 = (char) readInt18;
                    if (c17 == 1) {
                        i12 = Q0.a.N(readInt18, parcel);
                    } else if (c17 == 2) {
                        i13 = Q0.a.N(readInt18, parcel);
                    } else if (c17 != 3) {
                        Q0.a.X(readInt18, parcel);
                    } else {
                        intent = (Intent) Q0.a.m(parcel, readInt18, Intent.CREATOR);
                    }
                }
                Q0.a.y(a019, parcel);
                return new zaa(i12, i13, intent);
            case zzbbd.zzt.zzm /* 21 */:
                int a020 = Q0.a.a0(parcel);
                ArrayList arrayList6 = null;
                String str15 = null;
                while (parcel.dataPosition() < a020) {
                    int readInt19 = parcel.readInt();
                    char c18 = (char) readInt19;
                    if (c18 == 1) {
                        arrayList6 = Q0.a.p(readInt19, parcel);
                    } else if (c18 != 2) {
                        Q0.a.X(readInt19, parcel);
                    } else {
                        str15 = Q0.a.n(readInt19, parcel);
                    }
                }
                Q0.a.y(a020, parcel);
                return new zag(str15, arrayList6);
            case 22:
                int a021 = Q0.a.a0(parcel);
                int i14 = 0;
                zat zatVar = null;
                while (parcel.dataPosition() < a021) {
                    int readInt20 = parcel.readInt();
                    char c19 = (char) readInt20;
                    if (c19 == 1) {
                        i14 = Q0.a.N(readInt20, parcel);
                    } else if (c19 != 2) {
                        Q0.a.X(readInt20, parcel);
                    } else {
                        zatVar = (zat) Q0.a.m(parcel, readInt20, zat.CREATOR);
                    }
                }
                Q0.a.y(a021, parcel);
                return new zai(i14, zatVar);
            default:
                int a022 = Q0.a.a0(parcel);
                int i15 = 0;
                ConnectionResult connectionResult = null;
                zav zavVar = null;
                while (parcel.dataPosition() < a022) {
                    int readInt21 = parcel.readInt();
                    char c20 = (char) readInt21;
                    if (c20 == 1) {
                        i15 = Q0.a.N(readInt21, parcel);
                    } else if (c20 == 2) {
                        connectionResult = (ConnectionResult) Q0.a.m(parcel, readInt21, ConnectionResult.CREATOR);
                    } else if (c20 != 3) {
                        Q0.a.X(readInt21, parcel);
                    } else {
                        zavVar = (zav) Q0.a.m(parcel, readInt21, zav.CREATOR);
                    }
                }
                Q0.a.y(a022, parcel);
                return new zak(i15, connectionResult, zavVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f16453a) {
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
