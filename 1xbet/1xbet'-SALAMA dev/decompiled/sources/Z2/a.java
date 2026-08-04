package Z2;

import android.accounts.Account;
import android.app.PendingIntent;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import com.flurry.android.marketing.messaging.notification.FlurryMessage;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.common.internal.zax;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7852a;

    public /* synthetic */ a(int i7) {
        this.f7852a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f7852a) {
            case 0:
                int iA0 = Q0.a.a0(parcel);
                int iN = 0;
                boolean zK = false;
                boolean zK2 = false;
                boolean zK3 = false;
                String[] strArrO = null;
                CredentialPickerConfig credentialPickerConfig = null;
                CredentialPickerConfig credentialPickerConfig2 = null;
                String strN = null;
                String strN2 = null;
                while (parcel.dataPosition() < iA0) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 != 1000) {
                        switch (c3) {
                            case 1:
                                zK = Q0.a.K(i7, parcel);
                                break;
                            case 2:
                                strArrO = Q0.a.o(i7, parcel);
                                break;
                            case 3:
                                credentialPickerConfig = (CredentialPickerConfig) Q0.a.m(parcel, i7, CredentialPickerConfig.CREATOR);
                                break;
                            case 4:
                                credentialPickerConfig2 = (CredentialPickerConfig) Q0.a.m(parcel, i7, CredentialPickerConfig.CREATOR);
                                break;
                            case 5:
                                zK2 = Q0.a.K(i7, parcel);
                                break;
                            case 6:
                                strN = Q0.a.n(i7, parcel);
                                break;
                            case 7:
                                strN2 = Q0.a.n(i7, parcel);
                                break;
                            case '\b':
                                zK3 = Q0.a.K(i7, parcel);
                                break;
                            default:
                                Q0.a.X(i7, parcel);
                                break;
                        }
                    } else {
                        iN = Q0.a.N(i7, parcel);
                    }
                }
                Q0.a.y(iA0, parcel);
                return new CredentialRequest(iN, zK, strArrO, credentialPickerConfig, credentialPickerConfig2, zK2, strN, strN2, zK3);
            case 1:
                int iA1 = Q0.a.a0(parcel);
                CredentialPickerConfig credentialPickerConfig3 = null;
                String[] strArrO2 = null;
                String strN3 = null;
                String strN4 = null;
                int iN2 = 0;
                boolean zK4 = false;
                boolean zK5 = false;
                boolean zK6 = false;
                while (parcel.dataPosition() < iA1) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 != 1000) {
                        switch (c4) {
                            case 1:
                                credentialPickerConfig3 = (CredentialPickerConfig) Q0.a.m(parcel, i8, CredentialPickerConfig.CREATOR);
                                break;
                            case 2:
                                zK4 = Q0.a.K(i8, parcel);
                                break;
                            case 3:
                                zK5 = Q0.a.K(i8, parcel);
                                break;
                            case 4:
                                strArrO2 = Q0.a.o(i8, parcel);
                                break;
                            case 5:
                                zK6 = Q0.a.K(i8, parcel);
                                break;
                            case 6:
                                strN3 = Q0.a.n(i8, parcel);
                                break;
                            case 7:
                                strN4 = Q0.a.n(i8, parcel);
                                break;
                            default:
                                Q0.a.X(i8, parcel);
                                break;
                        }
                    } else {
                        iN2 = Q0.a.N(i8, parcel);
                    }
                }
                Q0.a.y(iA1, parcel);
                return new HintRequest(iN2, credentialPickerConfig3, zK4, zK5, strArrO2, zK6, strN3, strN4);
            case 2:
                int iA2 = Q0.a.a0(parcel);
                String strN5 = null;
                String strN6 = null;
                while (parcel.dataPosition() < iA2) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        strN5 = Q0.a.n(i9, parcel);
                    } else if (c7 != 2) {
                        Q0.a.X(i9, parcel);
                    } else {
                        strN6 = Q0.a.n(i9, parcel);
                    }
                }
                Q0.a.y(iA2, parcel);
                return new IdToken(strN5, strN6);
            case 3:
                return new VorbisComment(parcel);
            case 4:
                int iA3 = Q0.a.a0(parcel);
                boolean zK7 = false;
                boolean zK8 = false;
                boolean zK9 = false;
                ArrayList arrayListR = null;
                String strN7 = null;
                Account account = null;
                String strN8 = null;
                String strN9 = null;
                while (parcel.dataPosition() < iA3) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            arrayListR = Q0.a.r(parcel, i10, Scope.CREATOR);
                            break;
                        case 2:
                            strN7 = Q0.a.n(i10, parcel);
                            break;
                        case 3:
                            zK7 = Q0.a.K(i10, parcel);
                            break;
                        case 4:
                            zK8 = Q0.a.K(i10, parcel);
                            break;
                        case 5:
                            account = (Account) Q0.a.m(parcel, i10, Account.CREATOR);
                            break;
                        case 6:
                            strN8 = Q0.a.n(i10, parcel);
                            break;
                        case 7:
                            strN9 = Q0.a.n(i10, parcel);
                            break;
                        case '\b':
                            zK9 = Q0.a.K(i10, parcel);
                            break;
                        default:
                            Q0.a.X(i10, parcel);
                            break;
                    }
                }
                Q0.a.y(iA3, parcel);
                return new AuthorizationRequest(arrayListR, strN7, zK7, zK8, account, strN8, strN9, zK9);
            case 5:
                int iA4 = Q0.a.a0(parcel);
                String strN10 = null;
                String strN11 = null;
                String strN12 = null;
                ArrayList arrayListP = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iA4) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            strN10 = Q0.a.n(i11, parcel);
                            break;
                        case 2:
                            strN11 = Q0.a.n(i11, parcel);
                            break;
                        case 3:
                            strN12 = Q0.a.n(i11, parcel);
                            break;
                        case 4:
                            arrayListP = Q0.a.p(i11, parcel);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) Q0.a.m(parcel, i11, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent = (PendingIntent) Q0.a.m(parcel, i11, PendingIntent.CREATOR);
                            break;
                        default:
                            Q0.a.X(i11, parcel);
                            break;
                    }
                }
                Q0.a.y(iA4, parcel);
                return new AuthorizationResult(strN10, strN11, strN12, arrayListP, googleSignInAccount, pendingIntent);
            case 6:
                int iA5 = Q0.a.a0(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iA5) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        Q0.a.X(i12, parcel);
                    } else {
                        pendingIntent2 = (PendingIntent) Q0.a.m(parcel, i12, PendingIntent.CREATOR);
                    }
                }
                Q0.a.y(iA5, parcel);
                return new BeginSignInResult(pendingIntent2);
            case 7:
                int iA6 = Q0.a.a0(parcel);
                int iN3 = 0;
                while (parcel.dataPosition() < iA6) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        Q0.a.X(i13, parcel);
                    } else {
                        iN3 = Q0.a.N(i13, parcel);
                    }
                }
                Q0.a.y(iA6, parcel);
                return new GetPhoneNumberHintIntentRequest(iN3);
            case 8:
                int iA7 = Q0.a.a0(parcel);
                boolean zK10 = false;
                int iN4 = 0;
                String strN13 = null;
                String strN14 = null;
                String strN15 = null;
                String strN16 = null;
                while (parcel.dataPosition() < iA7) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strN13 = Q0.a.n(i14, parcel);
                            break;
                        case 2:
                            strN14 = Q0.a.n(i14, parcel);
                            break;
                        case 3:
                            strN15 = Q0.a.n(i14, parcel);
                            break;
                        case 4:
                            strN16 = Q0.a.n(i14, parcel);
                            break;
                        case 5:
                            zK10 = Q0.a.K(i14, parcel);
                            break;
                        case 6:
                            iN4 = Q0.a.N(i14, parcel);
                            break;
                        default:
                            Q0.a.X(i14, parcel);
                            break;
                    }
                }
                Q0.a.y(iA7, parcel);
                return new GetSignInIntentRequest(strN13, strN14, strN15, strN16, zK10, iN4);
            case 9:
                int iA8 = Q0.a.a0(parcel);
                int iN5 = 0;
                PendingIntent pendingIntent3 = null;
                String strN17 = null;
                String strN18 = null;
                ArrayList arrayListP2 = null;
                String strN19 = null;
                while (parcel.dataPosition() < iA8) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            pendingIntent3 = (PendingIntent) Q0.a.m(parcel, i15, PendingIntent.CREATOR);
                            break;
                        case 2:
                            strN17 = Q0.a.n(i15, parcel);
                            break;
                        case 3:
                            strN18 = Q0.a.n(i15, parcel);
                            break;
                        case 4:
                            arrayListP2 = Q0.a.p(i15, parcel);
                            break;
                        case 5:
                            strN19 = Q0.a.n(i15, parcel);
                            break;
                        case 6:
                            iN5 = Q0.a.N(i15, parcel);
                            break;
                        default:
                            Q0.a.X(i15, parcel);
                            break;
                    }
                }
                Q0.a.y(iA8, parcel);
                return new SaveAccountLinkingTokenRequest(pendingIntent3, strN17, strN18, arrayListP2, strN19, iN5);
            case 10:
                int iA9 = Q0.a.a0(parcel);
                PendingIntent pendingIntent4 = null;
                while (parcel.dataPosition() < iA9) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        Q0.a.X(i16, parcel);
                    } else {
                        pendingIntent4 = (PendingIntent) Q0.a.m(parcel, i16, PendingIntent.CREATOR);
                    }
                }
                Q0.a.y(iA9, parcel);
                return new SaveAccountLinkingTokenResult(pendingIntent4);
            case 11:
                int iA10 = Q0.a.a0(parcel);
                int iN6 = 0;
                SignInPassword signInPassword = null;
                String strN20 = null;
                while (parcel.dataPosition() < iA10) {
                    int i17 = parcel.readInt();
                    char c8 = (char) i17;
                    if (c8 == 1) {
                        signInPassword = (SignInPassword) Q0.a.m(parcel, i17, SignInPassword.CREATOR);
                    } else if (c8 == 2) {
                        strN20 = Q0.a.n(i17, parcel);
                    } else if (c8 != 3) {
                        Q0.a.X(i17, parcel);
                    } else {
                        iN6 = Q0.a.N(i17, parcel);
                    }
                }
                Q0.a.y(iA10, parcel);
                return new SavePasswordRequest(signInPassword, strN20, iN6);
            case 12:
                int iA11 = Q0.a.a0(parcel);
                PendingIntent pendingIntent5 = null;
                while (parcel.dataPosition() < iA11) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        Q0.a.X(i18, parcel);
                    } else {
                        pendingIntent5 = (PendingIntent) Q0.a.m(parcel, i18, PendingIntent.CREATOR);
                    }
                }
                Q0.a.y(iA11, parcel);
                return new SavePasswordResult(pendingIntent5);
            case 13:
                int iA12 = Q0.a.a0(parcel);
                String strN21 = null;
                String strN22 = null;
                String strN23 = null;
                String strN24 = null;
                Uri uri = null;
                String strN25 = null;
                String strN26 = null;
                String strN27 = null;
                PublicKeyCredential publicKeyCredential = null;
                while (parcel.dataPosition() < iA12) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strN21 = Q0.a.n(i19, parcel);
                            break;
                        case 2:
                            strN22 = Q0.a.n(i19, parcel);
                            break;
                        case 3:
                            strN23 = Q0.a.n(i19, parcel);
                            break;
                        case 4:
                            strN24 = Q0.a.n(i19, parcel);
                            break;
                        case 5:
                            uri = (Uri) Q0.a.m(parcel, i19, Uri.CREATOR);
                            break;
                        case 6:
                            strN25 = Q0.a.n(i19, parcel);
                            break;
                        case 7:
                            strN26 = Q0.a.n(i19, parcel);
                            break;
                        case '\b':
                            strN27 = Q0.a.n(i19, parcel);
                            break;
                        case '\t':
                            publicKeyCredential = (PublicKeyCredential) Q0.a.m(parcel, i19, PublicKeyCredential.CREATOR);
                            break;
                        default:
                            Q0.a.X(i19, parcel);
                            break;
                    }
                }
                Q0.a.y(iA12, parcel);
                return new SignInCredential(strN21, strN22, strN23, strN24, uri, strN25, strN26, strN27, publicKeyCredential);
            case 14:
                int iA13 = Q0.a.a0(parcel);
                String strN28 = null;
                String strN29 = null;
                while (parcel.dataPosition() < iA13) {
                    int i20 = parcel.readInt();
                    char c9 = (char) i20;
                    if (c9 == 1) {
                        strN28 = Q0.a.n(i20, parcel);
                    } else if (c9 != 2) {
                        Q0.a.X(i20, parcel);
                    } else {
                        strN29 = Q0.a.n(i20, parcel);
                    }
                }
                Q0.a.y(iA13, parcel);
                return new SignInPassword(strN28, strN29);
            case 15:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 16:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 17:
                return new MediaMetadataCompat(parcel);
            case 18:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 19:
                return new StreamKey(parcel);
            case 20:
                int iA14 = Q0.a.a0(parcel);
                int iN7 = 0;
                int iN8 = 0;
                String strN30 = null;
                byte[] bArrK = null;
                Bundle bundleJ = null;
                long jP = 0;
                while (parcel.dataPosition() < iA14) {
                    int i21 = parcel.readInt();
                    char c10 = (char) i21;
                    if (c10 == 1) {
                        strN30 = Q0.a.n(i21, parcel);
                    } else if (c10 == 2) {
                        iN8 = Q0.a.N(i21, parcel);
                    } else if (c10 == 3) {
                        jP = Q0.a.P(i21, parcel);
                    } else if (c10 == 4) {
                        bArrK = Q0.a.k(i21, parcel);
                    } else if (c10 == 5) {
                        bundleJ = Q0.a.j(i21, parcel);
                    } else if (c10 != 1000) {
                        Q0.a.X(i21, parcel);
                    } else {
                        iN7 = Q0.a.N(i21, parcel);
                    }
                }
                Q0.a.y(iA14, parcel);
                return new ProxyRequest(iN7, strN30, iN8, jP, bArrK, bundleJ);
            case zzbbd.zzt.zzm /* 21 */:
                int iA15 = Q0.a.a0(parcel);
                int iN9 = 0;
                int iN10 = 0;
                int iN11 = 0;
                PendingIntent pendingIntent6 = null;
                Bundle bundleJ2 = null;
                byte[] bArrK2 = null;
                while (parcel.dataPosition() < iA15) {
                    int i22 = parcel.readInt();
                    char c11 = (char) i22;
                    if (c11 == 1) {
                        iN10 = Q0.a.N(i22, parcel);
                    } else if (c11 == 2) {
                        pendingIntent6 = (PendingIntent) Q0.a.m(parcel, i22, PendingIntent.CREATOR);
                    } else if (c11 == 3) {
                        iN11 = Q0.a.N(i22, parcel);
                    } else if (c11 == 4) {
                        bundleJ2 = Q0.a.j(i22, parcel);
                    } else if (c11 == 5) {
                        bArrK2 = Q0.a.k(i22, parcel);
                    } else if (c11 != 1000) {
                        Q0.a.X(i22, parcel);
                    } else {
                        iN9 = Q0.a.N(i22, parcel);
                    }
                }
                Q0.a.y(iA15, parcel);
                return new ProxyResponse(iN9, iN10, pendingIntent6, iN11, bundleJ2, bArrK2);
            case 22:
                return new FlurryMessage(parcel);
            case 23:
                int iA16 = Q0.a.a0(parcel);
                String strN31 = null;
                int iN12 = 0;
                while (parcel.dataPosition() < iA16) {
                    int i23 = parcel.readInt();
                    char c12 = (char) i23;
                    if (c12 == 1) {
                        iN12 = Q0.a.N(i23, parcel);
                    } else if (c12 != 2) {
                        Q0.a.X(i23, parcel);
                    } else {
                        strN31 = Q0.a.n(i23, parcel);
                    }
                }
                Q0.a.y(iA16, parcel);
                return new Scope(iN12, strN31);
            case 24:
                int iA17 = Q0.a.a0(parcel);
                String strN32 = null;
                ConnectionResult connectionResult = null;
                int iN13 = 0;
                PendingIntent pendingIntent7 = null;
                while (parcel.dataPosition() < iA17) {
                    int i24 = parcel.readInt();
                    char c13 = (char) i24;
                    if (c13 == 1) {
                        iN13 = Q0.a.N(i24, parcel);
                    } else if (c13 == 2) {
                        strN32 = Q0.a.n(i24, parcel);
                    } else if (c13 == 3) {
                        pendingIntent7 = (PendingIntent) Q0.a.m(parcel, i24, PendingIntent.CREATOR);
                    } else if (c13 != 4) {
                        Q0.a.X(i24, parcel);
                    } else {
                        connectionResult = (ConnectionResult) Q0.a.m(parcel, i24, ConnectionResult.CREATOR);
                    }
                }
                Q0.a.y(iA17, parcel);
                return new Status(iN13, strN32, pendingIntent7, connectionResult);
            case 25:
                int iA18 = Q0.a.a0(parcel);
                int iN14 = 0;
                ArrayList arrayListR2 = null;
                while (parcel.dataPosition() < iA18) {
                    int i25 = parcel.readInt();
                    char c14 = (char) i25;
                    if (c14 == 1) {
                        iN14 = Q0.a.N(i25, parcel);
                    } else if (c14 != 2) {
                        Q0.a.X(i25, parcel);
                    } else {
                        arrayListR2 = Q0.a.r(parcel, i25, MethodInvocation.CREATOR);
                    }
                }
                Q0.a.y(iA18, parcel);
                return new TelemetryData(iN14, arrayListR2);
            case 26:
                int iA19 = Q0.a.a0(parcel);
                int iN15 = 0;
                int iN16 = 0;
                int iN17 = 0;
                int iN18 = 0;
                long jP2 = 0;
                long jP3 = 0;
                String strN33 = null;
                String strN34 = null;
                int iN19 = -1;
                while (parcel.dataPosition() < iA19) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            iN15 = Q0.a.N(i26, parcel);
                            break;
                        case 2:
                            iN16 = Q0.a.N(i26, parcel);
                            break;
                        case 3:
                            iN17 = Q0.a.N(i26, parcel);
                            break;
                        case 4:
                            jP2 = Q0.a.P(i26, parcel);
                            break;
                        case 5:
                            jP3 = Q0.a.P(i26, parcel);
                            break;
                        case 6:
                            strN33 = Q0.a.n(i26, parcel);
                            break;
                        case 7:
                            strN34 = Q0.a.n(i26, parcel);
                            break;
                        case '\b':
                            iN18 = Q0.a.N(i26, parcel);
                            break;
                        case '\t':
                            iN19 = Q0.a.N(i26, parcel);
                            break;
                        default:
                            Q0.a.X(i26, parcel);
                            break;
                    }
                }
                Q0.a.y(iA19, parcel);
                return new MethodInvocation(iN15, iN16, iN17, jP2, jP3, strN33, strN34, iN18, iN19);
            case 27:
                int iA20 = Q0.a.a0(parcel);
                int iN20 = 0;
                Account account2 = null;
                GoogleSignInAccount googleSignInAccount2 = null;
                int iN21 = 0;
                while (parcel.dataPosition() < iA20) {
                    int i27 = parcel.readInt();
                    char c15 = (char) i27;
                    if (c15 == 1) {
                        iN20 = Q0.a.N(i27, parcel);
                    } else if (c15 == 2) {
                        account2 = (Account) Q0.a.m(parcel, i27, Account.CREATOR);
                    } else if (c15 == 3) {
                        iN21 = Q0.a.N(i27, parcel);
                    } else if (c15 != 4) {
                        Q0.a.X(i27, parcel);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) Q0.a.m(parcel, i27, GoogleSignInAccount.CREATOR);
                    }
                }
                Q0.a.y(iA20, parcel);
                return new zat(iN20, account2, iN21, googleSignInAccount2);
            case 28:
                int iA21 = Q0.a.a0(parcel);
                int iN22 = 0;
                boolean zK11 = false;
                boolean zK12 = false;
                IBinder iBinderM = null;
                ConnectionResult connectionResult2 = null;
                while (parcel.dataPosition() < iA21) {
                    int i28 = parcel.readInt();
                    char c16 = (char) i28;
                    if (c16 == 1) {
                        iN22 = Q0.a.N(i28, parcel);
                    } else if (c16 == 2) {
                        iBinderM = Q0.a.M(i28, parcel);
                    } else if (c16 == 3) {
                        connectionResult2 = (ConnectionResult) Q0.a.m(parcel, i28, ConnectionResult.CREATOR);
                    } else if (c16 == 4) {
                        zK11 = Q0.a.K(i28, parcel);
                    } else if (c16 != 5) {
                        Q0.a.X(i28, parcel);
                    } else {
                        zK12 = Q0.a.K(i28, parcel);
                    }
                }
                Q0.a.y(iA21, parcel);
                return new zav(iN22, iBinderM, connectionResult2, zK11, zK12);
            default:
                int iA22 = Q0.a.a0(parcel);
                int iN23 = 0;
                int iN24 = 0;
                Scope[] scopeArr = null;
                int iN25 = 0;
                while (parcel.dataPosition() < iA22) {
                    int i29 = parcel.readInt();
                    char c17 = (char) i29;
                    if (c17 == 1) {
                        iN23 = Q0.a.N(i29, parcel);
                    } else if (c17 == 2) {
                        iN25 = Q0.a.N(i29, parcel);
                    } else if (c17 == 3) {
                        iN24 = Q0.a.N(i29, parcel);
                    } else if (c17 != 4) {
                        Q0.a.X(i29, parcel);
                    } else {
                        scopeArr = (Scope[]) Q0.a.q(parcel, i29, Scope.CREATOR);
                    }
                }
                Q0.a.y(iA22, parcel);
                return new zax(iN23, iN25, iN24, scopeArr);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f7852a) {
            case 0:
                return new CredentialRequest[i7];
            case 1:
                return new HintRequest[i7];
            case 2:
                return new IdToken[i7];
            case 3:
                return new VorbisComment[i7];
            case 4:
                return new AuthorizationRequest[i7];
            case 5:
                return new AuthorizationResult[i7];
            case 6:
                return new BeginSignInResult[i7];
            case 7:
                return new GetPhoneNumberHintIntentRequest[i7];
            case 8:
                return new GetSignInIntentRequest[i7];
            case 9:
                return new SaveAccountLinkingTokenRequest[i7];
            case 10:
                return new SaveAccountLinkingTokenResult[i7];
            case 11:
                return new SavePasswordRequest[i7];
            case 12:
                return new SavePasswordResult[i7];
            case 13:
                return new SignInCredential[i7];
            case 14:
                return new SignInPassword[i7];
            case 15:
                return new MediaBrowserCompat$MediaItem[i7];
            case 16:
                return new MediaDescriptionCompat[i7];
            case 17:
                return new MediaMetadataCompat[i7];
            case 18:
                return new RatingCompat[i7];
            case 19:
                return new StreamKey[i7];
            case 20:
                return new ProxyRequest[i7];
            case zzbbd.zzt.zzm /* 21 */:
                return new ProxyResponse[i7];
            case 22:
                return new FlurryMessage[i7];
            case 23:
                return new Scope[i7];
            case 24:
                return new Status[i7];
            case 25:
                return new TelemetryData[i7];
            case 26:
                return new MethodInvocation[i7];
            case 27:
                return new zat[i7];
            case 28:
                return new zav[i7];
            default:
                return new zax[i7];
        }
    }
}
