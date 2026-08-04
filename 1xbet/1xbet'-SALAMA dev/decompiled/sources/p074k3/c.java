package p074k3;

import Q0.a;
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
import p140t3.b;
import p140t3.g;
import p140t3.i;
import p140t3.k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14772a;

    public /* synthetic */ c(int i7) {
        this.f14772a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14772a) {
            case 0:
                int iA0 = a.a0(parcel);
                int iN = 0;
                ArrayList arrayListR = null;
                String strN = null;
                while (parcel.dataPosition() < iA0) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        iN = a.N(i7, parcel);
                    } else if (c3 == 2) {
                        arrayListR = a.r(parcel, i7, zal.CREATOR);
                    } else if (c3 != 3) {
                        a.X(i7, parcel);
                    } else {
                        strN = a.n(i7, parcel);
                    }
                }
                a.y(iA0, parcel);
                return new zan(iN, strN, arrayListR);
            case 1:
                int iA1 = a.a0(parcel);
                int iN2 = 0;
                String strN2 = null;
                ArrayList arrayListR2 = null;
                while (parcel.dataPosition() < iA1) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 1) {
                        iN2 = a.N(i8, parcel);
                    } else if (c4 == 2) {
                        strN2 = a.n(i8, parcel);
                    } else if (c4 != 3) {
                        a.X(i8, parcel);
                    } else {
                        arrayListR2 = a.r(parcel, i8, zam.CREATOR);
                    }
                }
                a.y(iA1, parcel);
                return new zal(iN2, strN2, arrayListR2);
            case 2:
                int iA2 = a.a0(parcel);
                int iN3 = 0;
                Parcel parcel2 = null;
                zan zanVar = null;
                while (parcel.dataPosition() < iA2) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        iN3 = a.N(i9, parcel);
                    } else if (c7 == 2) {
                        int iR = a.R(i9, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iR == 0) {
                            parcel2 = null;
                        } else {
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.appendFrom(parcel, iDataPosition, iR);
                            parcel.setDataPosition(iDataPosition + iR);
                            parcel2 = parcelObtain;
                        }
                    } else if (c7 != 3) {
                        a.X(i9, parcel);
                    } else {
                        zanVar = (zan) a.m(parcel, i9, zan.CREATOR);
                    }
                }
                a.y(iA2, parcel);
                return new SafeParcelResponse(iN3, parcel2, zanVar);
            case 3:
                String string = parcel.readString();
                try {
                    for (Transport transport : Transport.values()) {
                        if (string.equals(transport.f11405a)) {
                            return transport;
                        }
                    }
                    if (string.equals("hybrid")) {
                        return Transport.f11403b;
                    }
                    throw new p126r3.a(AbstractC0486a1.h("Transport ", string, " not supported"));
                } catch (p126r3.a e7) {
                    throw new RuntimeException(e7);
                }
            case 4:
                try {
                    return Attachment.a(parcel.readString());
                } catch (b e8) {
                    throw new RuntimeException(e8);
                }
            case 5:
                int iA3 = a.a0(parcel);
                boolean zK = false;
                while (parcel.dataPosition() < iA3) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        a.X(i10, parcel);
                    } else {
                        zK = a.K(i10, parcel);
                    }
                }
                a.y(iA3, parcel);
                return new zzz(zK);
            case 6:
                int iA4 = a.a0(parcel);
                long jP = 0;
                while (parcel.dataPosition() < iA4) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        a.X(i11, parcel);
                    } else {
                        jP = a.P(i11, parcel);
                    }
                }
                a.y(iA4, parcel);
                return new zzab(jP);
            case 7:
                int iA5 = a.a0(parcel);
                boolean zK2 = false;
                while (parcel.dataPosition() < iA5) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        a.X(i12, parcel);
                    } else {
                        zK2 = a.K(i12, parcel);
                    }
                }
                a.y(iA5, parcel);
                return new zzad(zK2);
            case 8:
                int iA6 = a.a0(parcel);
                boolean zK3 = false;
                while (parcel.dataPosition() < iA6) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        a.X(i13, parcel);
                    } else {
                        zK3 = a.K(i13, parcel);
                    }
                }
                a.y(iA6, parcel);
                return new GoogleThirdPartyPaymentExtension(zK3);
            case 9:
                int iA7 = a.a0(parcel);
                String strN3 = null;
                while (parcel.dataPosition() < iA7) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        a.X(i14, parcel);
                    } else {
                        strN3 = a.n(i14, parcel);
                    }
                }
                a.y(iA7, parcel);
                return new zzag(strN3);
            case 10:
                int iA8 = a.a0(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (true) {
                        if (parcel.dataPosition() >= iA8) {
                            a.y(iA8, parcel);
                            return new zzai(bArr);
                        }
                        int i15 = parcel.readInt();
                        if (((char) i15) != 1) {
                            a.X(i15, parcel);
                        } else {
                            int iR2 = a.R(i15, parcel);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iR2 == 0) {
                            }
                            int i16 = parcel.readInt();
                            byte[][] bArr2 = new byte[i16][];
                            for (int i17 = 0; i17 < i16; i17++) {
                                bArr2[i17] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition2 + iR2);
                            bArr = bArr2;
                        }
                        break;
                    }
                }
                break;
            case 11:
                int iA9 = a.a0(parcel);
                PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
                PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
                byte[] bArrK = null;
                ArrayList arrayListR3 = null;
                Double dL = null;
                ArrayList arrayListR4 = null;
                AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
                Integer numO = null;
                TokenBinding tokenBinding = null;
                String strN4 = null;
                AuthenticationExtensions authenticationExtensions = null;
                while (parcel.dataPosition() < iA9) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) a.m(parcel, i18, PublicKeyCredentialRpEntity.CREATOR);
                            break;
                        case 3:
                            publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) a.m(parcel, i18, PublicKeyCredentialUserEntity.CREATOR);
                            break;
                        case 4:
                            bArrK = a.k(i18, parcel);
                            break;
                        case 5:
                            arrayListR3 = a.r(parcel, i18, PublicKeyCredentialParameters.CREATOR);
                            break;
                        case 6:
                            dL = a.L(i18, parcel);
                            break;
                        case 7:
                            arrayListR4 = a.r(parcel, i18, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case '\b':
                            authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) a.m(parcel, i18, AuthenticatorSelectionCriteria.CREATOR);
                            break;
                        case '\t':
                            numO = a.O(i18, parcel);
                            break;
                        case '\n':
                            tokenBinding = (TokenBinding) a.m(parcel, i18, TokenBinding.CREATOR);
                            break;
                        case 11:
                            strN4 = a.n(i18, parcel);
                            break;
                        case '\f':
                            authenticationExtensions = (AuthenticationExtensions) a.m(parcel, i18, AuthenticationExtensions.CREATOR);
                            break;
                        default:
                            a.X(i18, parcel);
                            break;
                    }
                }
                a.y(iA9, parcel);
                return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrK, arrayListR3, dL, arrayListR4, authenticatorSelectionCriteria, numO, tokenBinding, strN4, authenticationExtensions);
            case 12:
                int iA10 = a.a0(parcel);
                String strN5 = null;
                String strN6 = null;
                byte[] bArrK2 = null;
                AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
                AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
                AuthenticatorErrorResponse authenticatorErrorResponse = null;
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
                String strN7 = null;
                while (parcel.dataPosition() < iA10) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strN5 = a.n(i19, parcel);
                            break;
                        case 2:
                            strN6 = a.n(i19, parcel);
                            break;
                        case 3:
                            bArrK2 = a.k(i19, parcel);
                            break;
                        case 4:
                            authenticatorAttestationResponse = (AuthenticatorAttestationResponse) a.m(parcel, i19, AuthenticatorAttestationResponse.CREATOR);
                            break;
                        case 5:
                            authenticatorAssertionResponse = (AuthenticatorAssertionResponse) a.m(parcel, i19, AuthenticatorAssertionResponse.CREATOR);
                            break;
                        case 6:
                            authenticatorErrorResponse = (AuthenticatorErrorResponse) a.m(parcel, i19, AuthenticatorErrorResponse.CREATOR);
                            break;
                        case 7:
                            authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) a.m(parcel, i19, AuthenticationExtensionsClientOutputs.CREATOR);
                            break;
                        case '\b':
                            strN7 = a.n(i19, parcel);
                            break;
                        default:
                            a.X(i19, parcel);
                            break;
                    }
                }
                a.y(iA10, parcel);
                return new PublicKeyCredential(strN5, strN6, bArrK2, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, strN7);
            case 13:
                int iA11 = a.a0(parcel);
                String strN8 = null;
                byte[] bArrK3 = null;
                ArrayList arrayListR5 = null;
                while (parcel.dataPosition() < iA11) {
                    int i20 = parcel.readInt();
                    char c8 = (char) i20;
                    if (c8 == 2) {
                        strN8 = a.n(i20, parcel);
                    } else if (c8 == 3) {
                        bArrK3 = a.k(i20, parcel);
                    } else if (c8 != 4) {
                        a.X(i20, parcel);
                    } else {
                        arrayListR5 = a.r(parcel, i20, Transport.CREATOR);
                    }
                }
                a.y(iA11, parcel);
                return new PublicKeyCredentialDescriptor(strN8, bArrK3, arrayListR5);
            case 14:
                int iA12 = a.a0(parcel);
                String strN9 = null;
                Integer numO2 = null;
                while (parcel.dataPosition() < iA12) {
                    int i21 = parcel.readInt();
                    char c9 = (char) i21;
                    if (c9 == 2) {
                        strN9 = a.n(i21, parcel);
                    } else if (c9 != 3) {
                        a.X(i21, parcel);
                    } else {
                        numO2 = a.O(i21, parcel);
                    }
                }
                a.y(iA12, parcel);
                return new PublicKeyCredentialParameters(strN9, numO2.intValue());
            case 15:
                int iA13 = a.a0(parcel);
                byte[] bArrK4 = null;
                Double dL2 = null;
                String strN10 = null;
                ArrayList arrayListR6 = null;
                Integer numO3 = null;
                TokenBinding tokenBinding2 = null;
                String strN11 = null;
                AuthenticationExtensions authenticationExtensions2 = null;
                Long lQ = null;
                while (parcel.dataPosition() < iA13) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            bArrK4 = a.k(i22, parcel);
                            break;
                        case 3:
                            dL2 = a.L(i22, parcel);
                            break;
                        case 4:
                            strN10 = a.n(i22, parcel);
                            break;
                        case 5:
                            arrayListR6 = a.r(parcel, i22, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case 6:
                            numO3 = a.O(i22, parcel);
                            break;
                        case 7:
                            tokenBinding2 = (TokenBinding) a.m(parcel, i22, TokenBinding.CREATOR);
                            break;
                        case '\b':
                            strN11 = a.n(i22, parcel);
                            break;
                        case '\t':
                            authenticationExtensions2 = (AuthenticationExtensions) a.m(parcel, i22, AuthenticationExtensions.CREATOR);
                            break;
                        case '\n':
                            lQ = a.Q(i22, parcel);
                            break;
                        default:
                            a.X(i22, parcel);
                            break;
                    }
                }
                a.y(iA13, parcel);
                return new PublicKeyCredentialRequestOptions(bArrK4, dL2, strN10, arrayListR6, numO3, tokenBinding2, strN11, authenticationExtensions2, lQ);
            case 16:
                int iA14 = a.a0(parcel);
                String strN12 = null;
                String strN13 = null;
                String strN14 = null;
                while (parcel.dataPosition() < iA14) {
                    int i23 = parcel.readInt();
                    char c10 = (char) i23;
                    if (c10 == 2) {
                        strN12 = a.n(i23, parcel);
                    } else if (c10 == 3) {
                        strN13 = a.n(i23, parcel);
                    } else if (c10 != 4) {
                        a.X(i23, parcel);
                    } else {
                        strN14 = a.n(i23, parcel);
                    }
                }
                a.y(iA14, parcel);
                return new PublicKeyCredentialRpEntity(strN12, strN13, strN14);
            case 17:
                try {
                    return PublicKeyCredentialType.a(parcel.readString());
                } catch (g e9) {
                    throw new RuntimeException(e9);
                }
            case 18:
                int iA15 = a.a0(parcel);
                byte[] bArrK5 = null;
                String strN15 = null;
                String strN16 = null;
                String strN17 = null;
                while (parcel.dataPosition() < iA15) {
                    int i24 = parcel.readInt();
                    char c11 = (char) i24;
                    if (c11 == 2) {
                        bArrK5 = a.k(i24, parcel);
                    } else if (c11 == 3) {
                        strN15 = a.n(i24, parcel);
                    } else if (c11 == 4) {
                        strN16 = a.n(i24, parcel);
                    } else if (c11 != 5) {
                        a.X(i24, parcel);
                    } else {
                        strN17 = a.n(i24, parcel);
                    }
                }
                a.y(iA15, parcel);
                return new PublicKeyCredentialUserEntity(strN15, strN16, strN17, bArrK5);
            case 19:
                String string2 = parcel.readString();
                if (string2 == null) {
                    string2 = "";
                }
                try {
                    return ResidentKeyRequirement.a(string2);
                } catch (i e10) {
                    throw new RuntimeException(e10);
                }
            case 20:
                int iA16 = a.a0(parcel);
                String strN18 = null;
                String strN19 = null;
                while (parcel.dataPosition() < iA16) {
                    int i25 = parcel.readInt();
                    char c12 = (char) i25;
                    if (c12 == 2) {
                        strN18 = a.n(i25, parcel);
                    } else if (c12 != 3) {
                        a.X(i25, parcel);
                    } else {
                        strN19 = a.n(i25, parcel);
                    }
                }
                a.y(iA16, parcel);
                return new TokenBinding(strN18, strN19);
            case zzbbd.zzt.zzm /* 21 */:
                int iA17 = a.a0(parcel);
                boolean zK4 = false;
                while (parcel.dataPosition() < iA17) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 1) {
                        a.X(i26, parcel);
                    } else {
                        zK4 = a.K(i26, parcel);
                    }
                }
                a.y(iA17, parcel);
                return new UserVerificationMethodExtension(zK4);
            case 22:
                try {
                    return zzay.a(parcel.readString());
                } catch (k e11) {
                    throw new RuntimeException(e11);
                }
            case 23:
                int iA18 = a.a0(parcel);
                ArrayList arrayListR7 = null;
                while (parcel.dataPosition() < iA18) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        a.X(i27, parcel);
                    } else {
                        arrayListR7 = a.r(parcel, i27, UvmEntry.CREATOR);
                    }
                }
                a.y(iA18, parcel);
                return new UvmEntries(arrayListR7);
            case 24:
                try {
                    return AttestationConveyancePreference.a(parcel.readString());
                } catch (p140t3.c e12) {
                    throw new RuntimeException(e12);
                }
            case 25:
                int iA19 = a.a0(parcel);
                int iN4 = 0;
                short s7 = 0;
                short s8 = 0;
                while (parcel.dataPosition() < iA19) {
                    int i28 = parcel.readInt();
                    char c13 = (char) i28;
                    if (c13 == 1) {
                        iN4 = a.N(i28, parcel);
                    } else if (c13 == 2) {
                        a.j0(parcel, i28, 4);
                        s7 = (short) parcel.readInt();
                    } else if (c13 != 3) {
                        a.X(i28, parcel);
                    } else {
                        a.j0(parcel, i28, 4);
                        s8 = (short) parcel.readInt();
                    }
                }
                a.y(iA19, parcel);
                return new UvmEntry(iN4, s7, s8);
            case 26:
                int iA20 = a.a0(parcel);
                UvmEntries uvmEntries = null;
                zzf zzfVar = null;
                AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
                zzh zzhVar = null;
                while (parcel.dataPosition() < iA20) {
                    int i29 = parcel.readInt();
                    char c14 = (char) i29;
                    if (c14 == 1) {
                        uvmEntries = (UvmEntries) a.m(parcel, i29, UvmEntries.CREATOR);
                    } else if (c14 == 2) {
                        zzfVar = (zzf) a.m(parcel, i29, zzf.CREATOR);
                    } else if (c14 == 3) {
                        authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) a.m(parcel, i29, AuthenticationExtensionsCredPropsOutputs.CREATOR);
                    } else if (c14 != 4) {
                        a.X(i29, parcel);
                    } else {
                        zzhVar = (zzh) a.m(parcel, i29, zzh.CREATOR);
                    }
                }
                a.y(iA20, parcel);
                return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar);
            case 27:
                int iA21 = a.a0(parcel);
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
                while (parcel.dataPosition() < iA21) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 2:
                            fidoAppIdExtension = (FidoAppIdExtension) a.m(parcel, i30, FidoAppIdExtension.CREATOR);
                            break;
                        case 3:
                            zzsVar = (zzs) a.m(parcel, i30, zzs.CREATOR);
                            break;
                        case 4:
                            userVerificationMethodExtension = (UserVerificationMethodExtension) a.m(parcel, i30, UserVerificationMethodExtension.CREATOR);
                            break;
                        case 5:
                            zzzVar = (zzz) a.m(parcel, i30, zzz.CREATOR);
                            break;
                        case 6:
                            zzabVar = (zzab) a.m(parcel, i30, zzab.CREATOR);
                            break;
                        case 7:
                            zzadVar = (zzad) a.m(parcel, i30, zzad.CREATOR);
                            break;
                        case '\b':
                            zzuVar = (zzu) a.m(parcel, i30, zzu.CREATOR);
                            break;
                        case '\t':
                            zzagVar = (zzag) a.m(parcel, i30, zzag.CREATOR);
                            break;
                        case '\n':
                            googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) a.m(parcel, i30, GoogleThirdPartyPaymentExtension.CREATOR);
                            break;
                        case 11:
                            zzaiVar = (zzai) a.m(parcel, i30, zzai.CREATOR);
                            break;
                        default:
                            a.X(i30, parcel);
                            break;
                    }
                }
                a.y(iA21, parcel);
                return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzaiVar);
            case 28:
                int iA22 = a.a0(parcel);
                boolean zK5 = false;
                while (parcel.dataPosition() < iA22) {
                    int i31 = parcel.readInt();
                    if (((char) i31) != 1) {
                        a.X(i31, parcel);
                    } else {
                        zK5 = a.K(i31, parcel);
                    }
                }
                a.y(iA22, parcel);
                return new AuthenticationExtensionsCredPropsOutputs(zK5);
            default:
                int iA23 = a.a0(parcel);
                byte[] bArrK6 = null;
                byte[] bArrK7 = null;
                while (parcel.dataPosition() < iA23) {
                    int i32 = parcel.readInt();
                    char c15 = (char) i32;
                    if (c15 == 1) {
                        bArrK6 = a.k(i32, parcel);
                    } else if (c15 != 2) {
                        a.X(i32, parcel);
                    } else {
                        bArrK7 = a.k(i32, parcel);
                    }
                }
                a.y(iA23, parcel);
                return new zzf(bArrK6, bArrK7);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f14772a) {
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
