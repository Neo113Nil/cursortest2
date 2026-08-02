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

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7852a;

    public /* synthetic */ a(int i7) {
        this.f7852a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f7852a) {
            case 0:
                int a02 = Q0.a.a0(parcel);
                int i7 = 0;
                boolean z4 = false;
                boolean z7 = false;
                boolean z8 = false;
                String[] strArr = null;
                CredentialPickerConfig credentialPickerConfig = null;
                CredentialPickerConfig credentialPickerConfig2 = null;
                String str = null;
                String str2 = null;
                while (parcel.dataPosition() < a02) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 != 1000) {
                        switch (c3) {
                            case 1:
                                z4 = Q0.a.K(readInt, parcel);
                                break;
                            case 2:
                                strArr = Q0.a.o(readInt, parcel);
                                break;
                            case 3:
                                credentialPickerConfig = (CredentialPickerConfig) Q0.a.m(parcel, readInt, CredentialPickerConfig.CREATOR);
                                break;
                            case 4:
                                credentialPickerConfig2 = (CredentialPickerConfig) Q0.a.m(parcel, readInt, CredentialPickerConfig.CREATOR);
                                break;
                            case 5:
                                z7 = Q0.a.K(readInt, parcel);
                                break;
                            case 6:
                                str = Q0.a.n(readInt, parcel);
                                break;
                            case 7:
                                str2 = Q0.a.n(readInt, parcel);
                                break;
                            case '\b':
                                z8 = Q0.a.K(readInt, parcel);
                                break;
                            default:
                                Q0.a.X(readInt, parcel);
                                break;
                        }
                    } else {
                        i7 = Q0.a.N(readInt, parcel);
                    }
                }
                Q0.a.y(a02, parcel);
                return new CredentialRequest(i7, z4, strArr, credentialPickerConfig, credentialPickerConfig2, z7, str, str2, z8);
            case 1:
                int a03 = Q0.a.a0(parcel);
                CredentialPickerConfig credentialPickerConfig3 = null;
                String[] strArr2 = null;
                String str3 = null;
                String str4 = null;
                int i8 = 0;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                while (parcel.dataPosition() < a03) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 != 1000) {
                        switch (c4) {
                            case 1:
                                credentialPickerConfig3 = (CredentialPickerConfig) Q0.a.m(parcel, readInt2, CredentialPickerConfig.CREATOR);
                                break;
                            case 2:
                                z9 = Q0.a.K(readInt2, parcel);
                                break;
                            case 3:
                                z10 = Q0.a.K(readInt2, parcel);
                                break;
                            case 4:
                                strArr2 = Q0.a.o(readInt2, parcel);
                                break;
                            case 5:
                                z11 = Q0.a.K(readInt2, parcel);
                                break;
                            case 6:
                                str3 = Q0.a.n(readInt2, parcel);
                                break;
                            case 7:
                                str4 = Q0.a.n(readInt2, parcel);
                                break;
                            default:
                                Q0.a.X(readInt2, parcel);
                                break;
                        }
                    } else {
                        i8 = Q0.a.N(readInt2, parcel);
                    }
                }
                Q0.a.y(a03, parcel);
                return new HintRequest(i8, credentialPickerConfig3, z9, z10, strArr2, z11, str3, str4);
            case 2:
                int a04 = Q0.a.a0(parcel);
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < a04) {
                    int readInt3 = parcel.readInt();
                    char c7 = (char) readInt3;
                    if (c7 == 1) {
                        str5 = Q0.a.n(readInt3, parcel);
                    } else if (c7 != 2) {
                        Q0.a.X(readInt3, parcel);
                    } else {
                        str6 = Q0.a.n(readInt3, parcel);
                    }
                }
                Q0.a.y(a04, parcel);
                return new IdToken(str5, str6);
            case 3:
                return new VorbisComment(parcel);
            case 4:
                int a05 = Q0.a.a0(parcel);
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                ArrayList arrayList = null;
                String str7 = null;
                Account account = null;
                String str8 = null;
                String str9 = null;
                while (parcel.dataPosition() < a05) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            arrayList = Q0.a.r(parcel, readInt4, Scope.CREATOR);
                            break;
                        case 2:
                            str7 = Q0.a.n(readInt4, parcel);
                            break;
                        case 3:
                            z12 = Q0.a.K(readInt4, parcel);
                            break;
                        case 4:
                            z13 = Q0.a.K(readInt4, parcel);
                            break;
                        case 5:
                            account = (Account) Q0.a.m(parcel, readInt4, Account.CREATOR);
                            break;
                        case 6:
                            str8 = Q0.a.n(readInt4, parcel);
                            break;
                        case 7:
                            str9 = Q0.a.n(readInt4, parcel);
                            break;
                        case '\b':
                            z14 = Q0.a.K(readInt4, parcel);
                            break;
                        default:
                            Q0.a.X(readInt4, parcel);
                            break;
                    }
                }
                Q0.a.y(a05, parcel);
                return new AuthorizationRequest(arrayList, str7, z12, z13, account, str8, str9, z14);
            case 5:
                int a06 = Q0.a.a0(parcel);
                String str10 = null;
                String str11 = null;
                String str12 = null;
                ArrayList arrayList2 = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < a06) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str10 = Q0.a.n(readInt5, parcel);
                            break;
                        case 2:
                            str11 = Q0.a.n(readInt5, parcel);
                            break;
                        case 3:
                            str12 = Q0.a.n(readInt5, parcel);
                            break;
                        case 4:
                            arrayList2 = Q0.a.p(readInt5, parcel);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) Q0.a.m(parcel, readInt5, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent = (PendingIntent) Q0.a.m(parcel, readInt5, PendingIntent.CREATOR);
                            break;
                        default:
                            Q0.a.X(readInt5, parcel);
                            break;
                    }
                }
                Q0.a.y(a06, parcel);
                return new AuthorizationResult(str10, str11, str12, arrayList2, googleSignInAccount, pendingIntent);
            case 6:
                int a07 = Q0.a.a0(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < a07) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        Q0.a.X(readInt6, parcel);
                    } else {
                        pendingIntent2 = (PendingIntent) Q0.a.m(parcel, readInt6, PendingIntent.CREATOR);
                    }
                }
                Q0.a.y(a07, parcel);
                return new BeginSignInResult(pendingIntent2);
            case 7:
                int a08 = Q0.a.a0(parcel);
                int i9 = 0;
                while (parcel.dataPosition() < a08) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        Q0.a.X(readInt7, parcel);
                    } else {
                        i9 = Q0.a.N(readInt7, parcel);
                    }
                }
                Q0.a.y(a08, parcel);
                return new GetPhoneNumberHintIntentRequest(i9);
            case 8:
                int a09 = Q0.a.a0(parcel);
                boolean z15 = false;
                int i10 = 0;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                while (parcel.dataPosition() < a09) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            str13 = Q0.a.n(readInt8, parcel);
                            break;
                        case 2:
                            str14 = Q0.a.n(readInt8, parcel);
                            break;
                        case 3:
                            str15 = Q0.a.n(readInt8, parcel);
                            break;
                        case 4:
                            str16 = Q0.a.n(readInt8, parcel);
                            break;
                        case 5:
                            z15 = Q0.a.K(readInt8, parcel);
                            break;
                        case 6:
                            i10 = Q0.a.N(readInt8, parcel);
                            break;
                        default:
                            Q0.a.X(readInt8, parcel);
                            break;
                    }
                }
                Q0.a.y(a09, parcel);
                return new GetSignInIntentRequest(str13, str14, str15, str16, z15, i10);
            case 9:
                int a010 = Q0.a.a0(parcel);
                int i11 = 0;
                PendingIntent pendingIntent3 = null;
                String str17 = null;
                String str18 = null;
                ArrayList arrayList3 = null;
                String str19 = null;
                while (parcel.dataPosition() < a010) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            pendingIntent3 = (PendingIntent) Q0.a.m(parcel, readInt9, PendingIntent.CREATOR);
                            break;
                        case 2:
                            str17 = Q0.a.n(readInt9, parcel);
                            break;
                        case 3:
                            str18 = Q0.a.n(readInt9, parcel);
                            break;
                        case 4:
                            arrayList3 = Q0.a.p(readInt9, parcel);
                            break;
                        case 5:
                            str19 = Q0.a.n(readInt9, parcel);
                            break;
                        case 6:
                            i11 = Q0.a.N(readInt9, parcel);
                            break;
                        default:
                            Q0.a.X(readInt9, parcel);
                            break;
                    }
                }
                Q0.a.y(a010, parcel);
                return new SaveAccountLinkingTokenRequest(pendingIntent3, str17, str18, arrayList3, str19, i11);
            case 10:
                int a011 = Q0.a.a0(parcel);
                PendingIntent pendingIntent4 = null;
                while (parcel.dataPosition() < a011) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        Q0.a.X(readInt10, parcel);
                    } else {
                        pendingIntent4 = (PendingIntent) Q0.a.m(parcel, readInt10, PendingIntent.CREATOR);
                    }
                }
                Q0.a.y(a011, parcel);
                return new SaveAccountLinkingTokenResult(pendingIntent4);
            case 11:
                int a012 = Q0.a.a0(parcel);
                int i12 = 0;
                SignInPassword signInPassword = null;
                String str20 = null;
                while (parcel.dataPosition() < a012) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 == 1) {
                        signInPassword = (SignInPassword) Q0.a.m(parcel, readInt11, SignInPassword.CREATOR);
                    } else if (c8 == 2) {
                        str20 = Q0.a.n(readInt11, parcel);
                    } else if (c8 != 3) {
                        Q0.a.X(readInt11, parcel);
                    } else {
                        i12 = Q0.a.N(readInt11, parcel);
                    }
                }
                Q0.a.y(a012, parcel);
                return new SavePasswordRequest(signInPassword, str20, i12);
            case 12:
                int a013 = Q0.a.a0(parcel);
                PendingIntent pendingIntent5 = null;
                while (parcel.dataPosition() < a013) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        Q0.a.X(readInt12, parcel);
                    } else {
                        pendingIntent5 = (PendingIntent) Q0.a.m(parcel, readInt12, PendingIntent.CREATOR);
                    }
                }
                Q0.a.y(a013, parcel);
                return new SavePasswordResult(pendingIntent5);
            case 13:
                int a014 = Q0.a.a0(parcel);
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                Uri uri = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                PublicKeyCredential publicKeyCredential = null;
                while (parcel.dataPosition() < a014) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            str21 = Q0.a.n(readInt13, parcel);
                            break;
                        case 2:
                            str22 = Q0.a.n(readInt13, parcel);
                            break;
                        case 3:
                            str23 = Q0.a.n(readInt13, parcel);
                            break;
                        case 4:
                            str24 = Q0.a.n(readInt13, parcel);
                            break;
                        case 5:
                            uri = (Uri) Q0.a.m(parcel, readInt13, Uri.CREATOR);
                            break;
                        case 6:
                            str25 = Q0.a.n(readInt13, parcel);
                            break;
                        case 7:
                            str26 = Q0.a.n(readInt13, parcel);
                            break;
                        case '\b':
                            str27 = Q0.a.n(readInt13, parcel);
                            break;
                        case '\t':
                            publicKeyCredential = (PublicKeyCredential) Q0.a.m(parcel, readInt13, PublicKeyCredential.CREATOR);
                            break;
                        default:
                            Q0.a.X(readInt13, parcel);
                            break;
                    }
                }
                Q0.a.y(a014, parcel);
                return new SignInCredential(str21, str22, str23, str24, uri, str25, str26, str27, publicKeyCredential);
            case 14:
                int a015 = Q0.a.a0(parcel);
                String str28 = null;
                String str29 = null;
                while (parcel.dataPosition() < a015) {
                    int readInt14 = parcel.readInt();
                    char c9 = (char) readInt14;
                    if (c9 == 1) {
                        str28 = Q0.a.n(readInt14, parcel);
                    } else if (c9 != 2) {
                        Q0.a.X(readInt14, parcel);
                    } else {
                        str29 = Q0.a.n(readInt14, parcel);
                    }
                }
                Q0.a.y(a015, parcel);
                return new SignInPassword(str28, str29);
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
                int a016 = Q0.a.a0(parcel);
                int i13 = 0;
                int i14 = 0;
                String str30 = null;
                byte[] bArr = null;
                Bundle bundle = null;
                long j = 0;
                while (parcel.dataPosition() < a016) {
                    int readInt15 = parcel.readInt();
                    char c10 = (char) readInt15;
                    if (c10 == 1) {
                        str30 = Q0.a.n(readInt15, parcel);
                    } else if (c10 == 2) {
                        i14 = Q0.a.N(readInt15, parcel);
                    } else if (c10 == 3) {
                        j = Q0.a.P(readInt15, parcel);
                    } else if (c10 == 4) {
                        bArr = Q0.a.k(readInt15, parcel);
                    } else if (c10 == 5) {
                        bundle = Q0.a.j(readInt15, parcel);
                    } else if (c10 != 1000) {
                        Q0.a.X(readInt15, parcel);
                    } else {
                        i13 = Q0.a.N(readInt15, parcel);
                    }
                }
                Q0.a.y(a016, parcel);
                return new ProxyRequest(i13, str30, i14, j, bArr, bundle);
            case zzbbd.zzt.zzm /* 21 */:
                int a017 = Q0.a.a0(parcel);
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                PendingIntent pendingIntent6 = null;
                Bundle bundle2 = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < a017) {
                    int readInt16 = parcel.readInt();
                    char c11 = (char) readInt16;
                    if (c11 == 1) {
                        i16 = Q0.a.N(readInt16, parcel);
                    } else if (c11 == 2) {
                        pendingIntent6 = (PendingIntent) Q0.a.m(parcel, readInt16, PendingIntent.CREATOR);
                    } else if (c11 == 3) {
                        i17 = Q0.a.N(readInt16, parcel);
                    } else if (c11 == 4) {
                        bundle2 = Q0.a.j(readInt16, parcel);
                    } else if (c11 == 5) {
                        bArr2 = Q0.a.k(readInt16, parcel);
                    } else if (c11 != 1000) {
                        Q0.a.X(readInt16, parcel);
                    } else {
                        i15 = Q0.a.N(readInt16, parcel);
                    }
                }
                Q0.a.y(a017, parcel);
                return new ProxyResponse(i15, i16, pendingIntent6, i17, bundle2, bArr2);
            case 22:
                return new FlurryMessage(parcel);
            case 23:
                int a018 = Q0.a.a0(parcel);
                String str31 = null;
                int i18 = 0;
                while (parcel.dataPosition() < a018) {
                    int readInt17 = parcel.readInt();
                    char c12 = (char) readInt17;
                    if (c12 == 1) {
                        i18 = Q0.a.N(readInt17, parcel);
                    } else if (c12 != 2) {
                        Q0.a.X(readInt17, parcel);
                    } else {
                        str31 = Q0.a.n(readInt17, parcel);
                    }
                }
                Q0.a.y(a018, parcel);
                return new Scope(i18, str31);
            case 24:
                int a019 = Q0.a.a0(parcel);
                String str32 = null;
                ConnectionResult connectionResult = null;
                int i19 = 0;
                PendingIntent pendingIntent7 = null;
                while (parcel.dataPosition() < a019) {
                    int readInt18 = parcel.readInt();
                    char c13 = (char) readInt18;
                    if (c13 == 1) {
                        i19 = Q0.a.N(readInt18, parcel);
                    } else if (c13 == 2) {
                        str32 = Q0.a.n(readInt18, parcel);
                    } else if (c13 == 3) {
                        pendingIntent7 = (PendingIntent) Q0.a.m(parcel, readInt18, PendingIntent.CREATOR);
                    } else if (c13 != 4) {
                        Q0.a.X(readInt18, parcel);
                    } else {
                        connectionResult = (ConnectionResult) Q0.a.m(parcel, readInt18, ConnectionResult.CREATOR);
                    }
                }
                Q0.a.y(a019, parcel);
                return new Status(i19, str32, pendingIntent7, connectionResult);
            case 25:
                int a020 = Q0.a.a0(parcel);
                int i20 = 0;
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < a020) {
                    int readInt19 = parcel.readInt();
                    char c14 = (char) readInt19;
                    if (c14 == 1) {
                        i20 = Q0.a.N(readInt19, parcel);
                    } else if (c14 != 2) {
                        Q0.a.X(readInt19, parcel);
                    } else {
                        arrayList4 = Q0.a.r(parcel, readInt19, MethodInvocation.CREATOR);
                    }
                }
                Q0.a.y(a020, parcel);
                return new TelemetryData(i20, arrayList4);
            case 26:
                int a021 = Q0.a.a0(parcel);
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                long j3 = 0;
                long j7 = 0;
                String str33 = null;
                String str34 = null;
                int i25 = -1;
                while (parcel.dataPosition() < a021) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            i21 = Q0.a.N(readInt20, parcel);
                            break;
                        case 2:
                            i22 = Q0.a.N(readInt20, parcel);
                            break;
                        case 3:
                            i23 = Q0.a.N(readInt20, parcel);
                            break;
                        case 4:
                            j3 = Q0.a.P(readInt20, parcel);
                            break;
                        case 5:
                            j7 = Q0.a.P(readInt20, parcel);
                            break;
                        case 6:
                            str33 = Q0.a.n(readInt20, parcel);
                            break;
                        case 7:
                            str34 = Q0.a.n(readInt20, parcel);
                            break;
                        case '\b':
                            i24 = Q0.a.N(readInt20, parcel);
                            break;
                        case '\t':
                            i25 = Q0.a.N(readInt20, parcel);
                            break;
                        default:
                            Q0.a.X(readInt20, parcel);
                            break;
                    }
                }
                Q0.a.y(a021, parcel);
                return new MethodInvocation(i21, i22, i23, j3, j7, str33, str34, i24, i25);
            case 27:
                int a022 = Q0.a.a0(parcel);
                int i26 = 0;
                Account account2 = null;
                GoogleSignInAccount googleSignInAccount2 = null;
                int i27 = 0;
                while (parcel.dataPosition() < a022) {
                    int readInt21 = parcel.readInt();
                    char c15 = (char) readInt21;
                    if (c15 == 1) {
                        i26 = Q0.a.N(readInt21, parcel);
                    } else if (c15 == 2) {
                        account2 = (Account) Q0.a.m(parcel, readInt21, Account.CREATOR);
                    } else if (c15 == 3) {
                        i27 = Q0.a.N(readInt21, parcel);
                    } else if (c15 != 4) {
                        Q0.a.X(readInt21, parcel);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) Q0.a.m(parcel, readInt21, GoogleSignInAccount.CREATOR);
                    }
                }
                Q0.a.y(a022, parcel);
                return new zat(i26, account2, i27, googleSignInAccount2);
            case 28:
                int a023 = Q0.a.a0(parcel);
                int i28 = 0;
                boolean z16 = false;
                boolean z17 = false;
                IBinder iBinder = null;
                ConnectionResult connectionResult2 = null;
                while (parcel.dataPosition() < a023) {
                    int readInt22 = parcel.readInt();
                    char c16 = (char) readInt22;
                    if (c16 == 1) {
                        i28 = Q0.a.N(readInt22, parcel);
                    } else if (c16 == 2) {
                        iBinder = Q0.a.M(readInt22, parcel);
                    } else if (c16 == 3) {
                        connectionResult2 = (ConnectionResult) Q0.a.m(parcel, readInt22, ConnectionResult.CREATOR);
                    } else if (c16 == 4) {
                        z16 = Q0.a.K(readInt22, parcel);
                    } else if (c16 != 5) {
                        Q0.a.X(readInt22, parcel);
                    } else {
                        z17 = Q0.a.K(readInt22, parcel);
                    }
                }
                Q0.a.y(a023, parcel);
                return new zav(i28, iBinder, connectionResult2, z16, z17);
            default:
                int a024 = Q0.a.a0(parcel);
                int i29 = 0;
                int i30 = 0;
                Scope[] scopeArr = null;
                int i31 = 0;
                while (parcel.dataPosition() < a024) {
                    int readInt23 = parcel.readInt();
                    char c17 = (char) readInt23;
                    if (c17 == 1) {
                        i29 = Q0.a.N(readInt23, parcel);
                    } else if (c17 == 2) {
                        i31 = Q0.a.N(readInt23, parcel);
                    } else if (c17 == 3) {
                        i30 = Q0.a.N(readInt23, parcel);
                    } else if (c17 != 4) {
                        Q0.a.X(readInt23, parcel);
                    } else {
                        scopeArr = (Scope[]) Q0.a.q(parcel, readInt23, Scope.CREATOR);
                    }
                }
                Q0.a.y(a024, parcel);
                return new zax(i29, i31, i30, scopeArr);
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
