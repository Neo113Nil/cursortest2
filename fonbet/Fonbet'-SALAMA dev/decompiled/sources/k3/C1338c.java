package k3;

import W5.AbstractC0486a1;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import com.google.android.gms.common.server.response.zan;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzay;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.fido2.api.common.zzz;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;
import r3.C1573a;
import t3.C1608b;
import t3.g;
import t3.i;
import t3.k;

/* renamed from: k3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1338c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14766a;

    public /* synthetic */ C1338c(int i7) {
        this.f14766a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14766a) {
            case 0:
                int a02 = Q0.a.a0(parcel);
                int i7 = 0;
                ArrayList arrayList = null;
                String str = null;
                while (parcel.dataPosition() < a02) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        i7 = Q0.a.N(readInt, parcel);
                    } else if (c3 == 2) {
                        arrayList = Q0.a.r(parcel, readInt, zal.CREATOR);
                    } else if (c3 != 3) {
                        Q0.a.X(readInt, parcel);
                    } else {
                        str = Q0.a.n(readInt, parcel);
                    }
                }
                Q0.a.y(a02, parcel);
                return new zan(i7, str, arrayList);
            case 1:
                int a03 = Q0.a.a0(parcel);
                int i8 = 0;
                String str2 = null;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < a03) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 == 1) {
                        i8 = Q0.a.N(readInt2, parcel);
                    } else if (c4 == 2) {
                        str2 = Q0.a.n(readInt2, parcel);
                    } else if (c4 != 3) {
                        Q0.a.X(readInt2, parcel);
                    } else {
                        arrayList2 = Q0.a.r(parcel, readInt2, zam.CREATOR);
                    }
                }
                Q0.a.y(a03, parcel);
                return new zal(i8, str2, arrayList2);
            case 2:
                int a04 = Q0.a.a0(parcel);
                int i9 = 0;
                Parcel parcel2 = null;
                zan zanVar = null;
                while (parcel.dataPosition() < a04) {
                    int readInt3 = parcel.readInt();
                    char c7 = (char) readInt3;
                    if (c7 == 1) {
                        i9 = Q0.a.N(readInt3, parcel);
                    } else if (c7 == 2) {
                        int R6 = Q0.a.R(readInt3, parcel);
                        int dataPosition = parcel.dataPosition();
                        if (R6 == 0) {
                            parcel2 = null;
                        } else {
                            Parcel obtain = Parcel.obtain();
                            obtain.appendFrom(parcel, dataPosition, R6);
                            parcel.setDataPosition(dataPosition + R6);
                            parcel2 = obtain;
                        }
                    } else if (c7 != 3) {
                        Q0.a.X(readInt3, parcel);
                    } else {
                        zanVar = (zan) Q0.a.m(parcel, readInt3, zan.CREATOR);
                    }
                }
                Q0.a.y(a04, parcel);
                return new SafeParcelResponse(i9, parcel2, zanVar);
            case 3:
                String readString = parcel.readString();
                try {
                    for (Transport transport : Transport.values()) {
                        if (readString.equals(transport.f11405a)) {
                            return transport;
                        }
                    }
                    if (readString.equals("hybrid")) {
                        return Transport.f11403b;
                    }
                    throw new C1573a(AbstractC0486a1.h("Transport ", readString, " not supported"));
                } catch (C1573a e7) {
                    throw new RuntimeException(e7);
                }
            case 4:
                try {
                    return Attachment.a(parcel.readString());
                } catch (C1608b e8) {
                    throw new RuntimeException(e8);
                }
            case 5:
                int a05 = Q0.a.a0(parcel);
                boolean z4 = false;
                while (parcel.dataPosition() < a05) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        Q0.a.X(readInt4, parcel);
                    } else {
                        z4 = Q0.a.K(readInt4, parcel);
                    }
                }
                Q0.a.y(a05, parcel);
                return new zzz(z4);
            case 6:
                int a06 = Q0.a.a0(parcel);
                long j = 0;
                while (parcel.dataPosition() < a06) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        Q0.a.X(readInt5, parcel);
                    } else {
                        j = Q0.a.P(readInt5, parcel);
                    }
                }
                Q0.a.y(a06, parcel);
                return new zzab(j);
            case 7:
                int a07 = Q0.a.a0(parcel);
                boolean z7 = false;
                while (parcel.dataPosition() < a07) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        Q0.a.X(readInt6, parcel);
                    } else {
                        z7 = Q0.a.K(readInt6, parcel);
                    }
                }
                Q0.a.y(a07, parcel);
                return new zzad(z7);
            case 8:
                int a08 = Q0.a.a0(parcel);
                boolean z8 = false;
                while (parcel.dataPosition() < a08) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        Q0.a.X(readInt7, parcel);
                    } else {
                        z8 = Q0.a.K(readInt7, parcel);
                    }
                }
                Q0.a.y(a08, parcel);
                return new GoogleThirdPartyPaymentExtension(z8);
            case 9:
                int a09 = Q0.a.a0(parcel);
                String str3 = null;
                while (parcel.dataPosition() < a09) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        Q0.a.X(readInt8, parcel);
                    } else {
                        str3 = Q0.a.n(readInt8, parcel);
                    }
                }
                Q0.a.y(a09, parcel);
                return new zzag(str3);
            case 10:
                int a010 = Q0.a.a0(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (parcel.dataPosition() < a010) {
                        int readInt9 = parcel.readInt();
                        if (((char) readInt9) != 1) {
                            Q0.a.X(readInt9, parcel);
                        } else {
                            int R7 = Q0.a.R(readInt9, parcel);
                            int dataPosition2 = parcel.dataPosition();
                            if (R7 == 0) {
                                break;
                            }
                            int readInt10 = parcel.readInt();
                            byte[][] bArr2 = new byte[readInt10][];
                            for (int i10 = 0; i10 < readInt10; i10++) {
                                bArr2[i10] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(dataPosition2 + R7);
                            bArr = bArr2;
                        }
                    }
                    Q0.a.y(a010, parcel);
                    return new zzai(bArr);
                    break;
                }
            case 11:
                int a011 = Q0.a.a0(parcel);
                PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
                PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
                byte[] bArr3 = null;
                ArrayList arrayList3 = null;
                Double d7 = null;
                ArrayList arrayList4 = null;
                AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
                Integer num = null;
                TokenBinding tokenBinding = null;
                String str4 = null;
                AuthenticationExtensions authenticationExtensions = null;
                while (parcel.dataPosition() < a011) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) Q0.a.m(parcel, readInt11, PublicKeyCredentialRpEntity.CREATOR);
                            break;
                        case 3:
                            publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) Q0.a.m(parcel, readInt11, PublicKeyCredentialUserEntity.CREATOR);
                            break;
                        case 4:
                            bArr3 = Q0.a.k(readInt11, parcel);
                            break;
                        case 5:
                            arrayList3 = Q0.a.r(parcel, readInt11, PublicKeyCredentialParameters.CREATOR);
                            break;
                        case 6:
                            d7 = Q0.a.L(readInt11, parcel);
                            break;
                        case 7:
                            arrayList4 = Q0.a.r(parcel, readInt11, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case '\b':
                            authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) Q0.a.m(parcel, readInt11, AuthenticatorSelectionCriteria.CREATOR);
                            break;
                        case '\t':
                            num = Q0.a.O(readInt11, parcel);
                            break;
                        case '\n':
                            tokenBinding = (TokenBinding) Q0.a.m(parcel, readInt11, TokenBinding.CREATOR);
                            break;
                        case 11:
                            str4 = Q0.a.n(readInt11, parcel);
                            break;
                        case '\f':
                            authenticationExtensions = (AuthenticationExtensions) Q0.a.m(parcel, readInt11, AuthenticationExtensions.CREATOR);
                            break;
                        default:
                            Q0.a.X(readInt11, parcel);
                            break;
                    }
                }
                Q0.a.y(a011, parcel);
                return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr3, arrayList3, d7, arrayList4, authenticatorSelectionCriteria, num, tokenBinding, str4, authenticationExtensions);
            case 12:
                int a012 = Q0.a.a0(parcel);
                String str5 = null;
                String str6 = null;
                byte[] bArr4 = null;
                AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
                AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
                AuthenticatorErrorResponse authenticatorErrorResponse = null;
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
                String str7 = null;
                while (parcel.dataPosition() < a012) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            str5 = Q0.a.n(readInt12, parcel);
                            break;
                        case 2:
                            str6 = Q0.a.n(readInt12, parcel);
                            break;
                        case 3:
                            bArr4 = Q0.a.k(readInt12, parcel);
                            break;
                        case 4:
                            authenticatorAttestationResponse = (AuthenticatorAttestationResponse) Q0.a.m(parcel, readInt12, AuthenticatorAttestationResponse.CREATOR);
                            break;
                        case 5:
                            authenticatorAssertionResponse = (AuthenticatorAssertionResponse) Q0.a.m(parcel, readInt12, AuthenticatorAssertionResponse.CREATOR);
                            break;
                        case 6:
                            authenticatorErrorResponse = (AuthenticatorErrorResponse) Q0.a.m(parcel, readInt12, AuthenticatorErrorResponse.CREATOR);
                            break;
                        case 7:
                            authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) Q0.a.m(parcel, readInt12, AuthenticationExtensionsClientOutputs.CREATOR);
                            break;
                        case '\b':
                            str7 = Q0.a.n(readInt12, parcel);
                            break;
                        default:
                            Q0.a.X(readInt12, parcel);
                            break;
                    }
                }
                Q0.a.y(a012, parcel);
                return new PublicKeyCredential(str5, str6, bArr4, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str7);
            case 13:
                int a013 = Q0.a.a0(parcel);
                String str8 = null;
                byte[] bArr5 = null;
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < a013) {
                    int readInt13 = parcel.readInt();
                    char c8 = (char) readInt13;
                    if (c8 == 2) {
                        str8 = Q0.a.n(readInt13, parcel);
                    } else if (c8 == 3) {
                        bArr5 = Q0.a.k(readInt13, parcel);
                    } else if (c8 != 4) {
                        Q0.a.X(readInt13, parcel);
                    } else {
                        arrayList5 = Q0.a.r(parcel, readInt13, Transport.CREATOR);
                    }
                }
                Q0.a.y(a013, parcel);
                return new PublicKeyCredentialDescriptor(str8, bArr5, arrayList5);
            case 14:
                int a014 = Q0.a.a0(parcel);
                String str9 = null;
                Integer num2 = null;
                while (parcel.dataPosition() < a014) {
                    int readInt14 = parcel.readInt();
                    char c9 = (char) readInt14;
                    if (c9 == 2) {
                        str9 = Q0.a.n(readInt14, parcel);
                    } else if (c9 != 3) {
                        Q0.a.X(readInt14, parcel);
                    } else {
                        num2 = Q0.a.O(readInt14, parcel);
                    }
                }
                Q0.a.y(a014, parcel);
                return new PublicKeyCredentialParameters(str9, num2.intValue());
            case 15:
                int a015 = Q0.a.a0(parcel);
                byte[] bArr6 = null;
                Double d8 = null;
                String str10 = null;
                ArrayList arrayList6 = null;
                Integer num3 = null;
                TokenBinding tokenBinding2 = null;
                String str11 = null;
                AuthenticationExtensions authenticationExtensions2 = null;
                Long l7 = null;
                while (parcel.dataPosition() < a015) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            bArr6 = Q0.a.k(readInt15, parcel);
                            break;
                        case 3:
                            d8 = Q0.a.L(readInt15, parcel);
                            break;
                        case 4:
                            str10 = Q0.a.n(readInt15, parcel);
                            break;
                        case 5:
                            arrayList6 = Q0.a.r(parcel, readInt15, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case 6:
                            num3 = Q0.a.O(readInt15, parcel);
                            break;
                        case 7:
                            tokenBinding2 = (TokenBinding) Q0.a.m(parcel, readInt15, TokenBinding.CREATOR);
                            break;
                        case '\b':
                            str11 = Q0.a.n(readInt15, parcel);
                            break;
                        case '\t':
                            authenticationExtensions2 = (AuthenticationExtensions) Q0.a.m(parcel, readInt15, AuthenticationExtensions.CREATOR);
                            break;
                        case '\n':
                            l7 = Q0.a.Q(readInt15, parcel);
                            break;
                        default:
                            Q0.a.X(readInt15, parcel);
                            break;
                    }
                }
                Q0.a.y(a015, parcel);
                return new PublicKeyCredentialRequestOptions(bArr6, d8, str10, arrayList6, num3, tokenBinding2, str11, authenticationExtensions2, l7);
            case 16:
                int a016 = Q0.a.a0(parcel);
                String str12 = null;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < a016) {
                    int readInt16 = parcel.readInt();
                    char c10 = (char) readInt16;
                    if (c10 == 2) {
                        str12 = Q0.a.n(readInt16, parcel);
                    } else if (c10 == 3) {
                        str13 = Q0.a.n(readInt16, parcel);
                    } else if (c10 != 4) {
                        Q0.a.X(readInt16, parcel);
                    } else {
                        str14 = Q0.a.n(readInt16, parcel);
                    }
                }
                Q0.a.y(a016, parcel);
                return new PublicKeyCredentialRpEntity(str12, str13, str14);
            case 17:
                try {
                    return PublicKeyCredentialType.a(parcel.readString());
                } catch (g e9) {
                    throw new RuntimeException(e9);
                }
            case 18:
                int a017 = Q0.a.a0(parcel);
                byte[] bArr7 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                while (parcel.dataPosition() < a017) {
                    int readInt17 = parcel.readInt();
                    char c11 = (char) readInt17;
                    if (c11 == 2) {
                        bArr7 = Q0.a.k(readInt17, parcel);
                    } else if (c11 == 3) {
                        str15 = Q0.a.n(readInt17, parcel);
                    } else if (c11 == 4) {
                        str16 = Q0.a.n(readInt17, parcel);
                    } else if (c11 != 5) {
                        Q0.a.X(readInt17, parcel);
                    } else {
                        str17 = Q0.a.n(readInt17, parcel);
                    }
                }
                Q0.a.y(a017, parcel);
                return new PublicKeyCredentialUserEntity(str15, str16, str17, bArr7);
            case 19:
                String readString2 = parcel.readString();
                if (readString2 == null) {
                    readString2 = "";
                }
                try {
                    return ResidentKeyRequirement.a(readString2);
                } catch (i e10) {
                    throw new RuntimeException(e10);
                }
            case 20:
                int a018 = Q0.a.a0(parcel);
                String str18 = null;
                String str19 = null;
                while (parcel.dataPosition() < a018) {
                    int readInt18 = parcel.readInt();
                    char c12 = (char) readInt18;
                    if (c12 == 2) {
                        str18 = Q0.a.n(readInt18, parcel);
                    } else if (c12 != 3) {
                        Q0.a.X(readInt18, parcel);
                    } else {
                        str19 = Q0.a.n(readInt18, parcel);
                    }
                }
                Q0.a.y(a018, parcel);
                return new TokenBinding(str18, str19);
            case zzbbd.zzt.zzm /* 21 */:
                int a019 = Q0.a.a0(parcel);
                boolean z9 = false;
                while (parcel.dataPosition() < a019) {
                    int readInt19 = parcel.readInt();
                    if (((char) readInt19) != 1) {
                        Q0.a.X(readInt19, parcel);
                    } else {
                        z9 = Q0.a.K(readInt19, parcel);
                    }
                }
                Q0.a.y(a019, parcel);
                return new UserVerificationMethodExtension(z9);
            case 22:
                try {
                    return zzay.a(parcel.readString());
                } catch (k e11) {
                    throw new RuntimeException(e11);
                }
            case 23:
                int a020 = Q0.a.a0(parcel);
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < a020) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        Q0.a.X(readInt20, parcel);
                    } else {
                        arrayList7 = Q0.a.r(parcel, readInt20, UvmEntry.CREATOR);
                    }
                }
                Q0.a.y(a020, parcel);
                return new UvmEntries(arrayList7);
            case 24:
                try {
                    return AttestationConveyancePreference.a(parcel.readString());
                } catch (t3.c e12) {
                    throw new RuntimeException(e12);
                }
            case 25:
                int a021 = Q0.a.a0(parcel);
                int i11 = 0;
                short s7 = 0;
                short s8 = 0;
                while (parcel.dataPosition() < a021) {
                    int readInt21 = parcel.readInt();
                    char c13 = (char) readInt21;
                    if (c13 == 1) {
                        i11 = Q0.a.N(readInt21, parcel);
                    } else if (c13 == 2) {
                        Q0.a.j0(parcel, readInt21, 4);
                        s7 = (short) parcel.readInt();
                    } else if (c13 != 3) {
                        Q0.a.X(readInt21, parcel);
                    } else {
                        Q0.a.j0(parcel, readInt21, 4);
                        s8 = (short) parcel.readInt();
                    }
                }
                Q0.a.y(a021, parcel);
                return new UvmEntry(i11, s7, s8);
            case 26:
                int a022 = Q0.a.a0(parcel);
                UvmEntries uvmEntries = null;
                zzf zzfVar = null;
                AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
                zzh zzhVar = null;
                while (parcel.dataPosition() < a022) {
                    int readInt22 = parcel.readInt();
                    char c14 = (char) readInt22;
                    if (c14 == 1) {
                        uvmEntries = (UvmEntries) Q0.a.m(parcel, readInt22, UvmEntries.CREATOR);
                    } else if (c14 == 2) {
                        zzfVar = (zzf) Q0.a.m(parcel, readInt22, zzf.CREATOR);
                    } else if (c14 == 3) {
                        authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) Q0.a.m(parcel, readInt22, AuthenticationExtensionsCredPropsOutputs.CREATOR);
                    } else if (c14 != 4) {
                        Q0.a.X(readInt22, parcel);
                    } else {
                        zzhVar = (zzh) Q0.a.m(parcel, readInt22, zzh.CREATOR);
                    }
                }
                Q0.a.y(a022, parcel);
                return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar);
            case 27:
                int a023 = Q0.a.a0(parcel);
                FidoAppIdExtension fidoAppIdExtension = null;
                zzs zzsVar = null;
                UserVerificationMethodExtension userVerificationMethodExtension = null;
                zzz zzzVar = null;
                zzab zzabVar = null;
                zzad zzadVar = null;
                zzu zzuVar = null;
                zzag zzagVar = null;
                GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
                zzai zzaiVar = null;
                while (parcel.dataPosition() < a023) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 2:
                            fidoAppIdExtension = (FidoAppIdExtension) Q0.a.m(parcel, readInt23, FidoAppIdExtension.CREATOR);
                            break;
                        case 3:
                            zzsVar = (zzs) Q0.a.m(parcel, readInt23, zzs.CREATOR);
                            break;
                        case 4:
                            userVerificationMethodExtension = (UserVerificationMethodExtension) Q0.a.m(parcel, readInt23, UserVerificationMethodExtension.CREATOR);
                            break;
                        case 5:
                            zzzVar = (zzz) Q0.a.m(parcel, readInt23, zzz.CREATOR);
                            break;
                        case 6:
                            zzabVar = (zzab) Q0.a.m(parcel, readInt23, zzab.CREATOR);
                            break;
                        case 7:
                            zzadVar = (zzad) Q0.a.m(parcel, readInt23, zzad.CREATOR);
                            break;
                        case '\b':
                            zzuVar = (zzu) Q0.a.m(parcel, readInt23, zzu.CREATOR);
                            break;
                        case '\t':
                            zzagVar = (zzag) Q0.a.m(parcel, readInt23, zzag.CREATOR);
                            break;
                        case '\n':
                            googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) Q0.a.m(parcel, readInt23, GoogleThirdPartyPaymentExtension.CREATOR);
                            break;
                        case 11:
                            zzaiVar = (zzai) Q0.a.m(parcel, readInt23, zzai.CREATOR);
                            break;
                        default:
                            Q0.a.X(readInt23, parcel);
                            break;
                    }
                }
                Q0.a.y(a023, parcel);
                return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzaiVar);
            case 28:
                int a024 = Q0.a.a0(parcel);
                boolean z10 = false;
                while (parcel.dataPosition() < a024) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        Q0.a.X(readInt24, parcel);
                    } else {
                        z10 = Q0.a.K(readInt24, parcel);
                    }
                }
                Q0.a.y(a024, parcel);
                return new AuthenticationExtensionsCredPropsOutputs(z10);
            default:
                int a025 = Q0.a.a0(parcel);
                byte[] bArr8 = null;
                byte[] bArr9 = null;
                while (parcel.dataPosition() < a025) {
                    int readInt25 = parcel.readInt();
                    char c15 = (char) readInt25;
                    if (c15 == 1) {
                        bArr8 = Q0.a.k(readInt25, parcel);
                    } else if (c15 != 2) {
                        Q0.a.X(readInt25, parcel);
                    } else {
                        bArr9 = Q0.a.k(readInt25, parcel);
                    }
                }
                Q0.a.y(a025, parcel);
                return new zzf(bArr8, bArr9);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f14766a) {
            case 0:
                return new zan[i7];
            case 1:
                return new zal[i7];
            case 2:
                return new SafeParcelResponse[i7];
            case 3:
                return new Transport[i7];
            case 4:
                return new Attachment[i7];
            case 5:
                return new zzz[i7];
            case 6:
                return new zzab[i7];
            case 7:
                return new zzad[i7];
            case 8:
                return new GoogleThirdPartyPaymentExtension[i7];
            case 9:
                return new zzag[i7];
            case 10:
                return new zzai[i7];
            case 11:
                return new PublicKeyCredentialCreationOptions[i7];
            case 12:
                return new PublicKeyCredential[i7];
            case 13:
                return new PublicKeyCredentialDescriptor[i7];
            case 14:
                return new PublicKeyCredentialParameters[i7];
            case 15:
                return new PublicKeyCredentialRequestOptions[i7];
            case 16:
                return new PublicKeyCredentialRpEntity[i7];
            case 17:
                return new PublicKeyCredentialType[i7];
            case 18:
                return new PublicKeyCredentialUserEntity[i7];
            case 19:
                return new ResidentKeyRequirement[i7];
            case 20:
                return new TokenBinding[i7];
            case zzbbd.zzt.zzm /* 21 */:
                return new UserVerificationMethodExtension[i7];
            case 22:
                return new zzay[i7];
            case 23:
                return new UvmEntries[i7];
            case 24:
                return new AttestationConveyancePreference[i7];
            case 25:
                return new UvmEntry[i7];
            case 26:
                return new AuthenticationExtensionsClientOutputs[i7];
            case 27:
                return new AuthenticationExtensions[i7];
            case 28:
                return new AuthenticationExtensionsCredPropsOutputs[i7];
            default:
                return new zzf[i7];
        }
    }
}
