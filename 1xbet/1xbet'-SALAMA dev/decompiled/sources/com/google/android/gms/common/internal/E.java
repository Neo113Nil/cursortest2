package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.converter.zac;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.zam;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.p002firebaseauthapi.zzahp;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.zzan;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class E implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11239a;

    public /* synthetic */ E(int i7) {
        this.f11239a = i7;
    }

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        int i8 = getServiceRequest.f11250a;
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        Y4.D.B0(parcel, 2, 4);
        parcel.writeInt(getServiceRequest.f11251b);
        Y4.D.B0(parcel, 3, 4);
        parcel.writeInt(getServiceRequest.f11252c);
        Y4.D.s0(parcel, 4, getServiceRequest.f11253d, false);
        Y4.D.n0(parcel, 5, getServiceRequest.f11254e);
        Y4.D.v0(parcel, 6, getServiceRequest.f11255f, i7);
        Y4.D.k0(parcel, 7, getServiceRequest.f11256x, false);
        Y4.D.r0(parcel, 8, getServiceRequest.f11257y, i7, false);
        Y4.D.v0(parcel, 10, getServiceRequest.f11258z, i7);
        Y4.D.v0(parcel, 11, getServiceRequest.f11245A, i7);
        Y4.D.B0(parcel, 12, 4);
        parcel.writeInt(getServiceRequest.f11246B ? 1 : 0);
        Y4.D.B0(parcel, 13, 4);
        parcel.writeInt(getServiceRequest.f11247C);
        boolean z4 = getServiceRequest.f11248D;
        Y4.D.B0(parcel, 14, 4);
        parcel.writeInt(z4 ? 1 : 0);
        Y4.D.s0(parcel, 15, getServiceRequest.f11249E, false);
        Y4.D.z0(iX0, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iN = 0;
        int iN2 = 0;
        int iN3 = 0;
        int iN4 = 0;
        int iN5 = 0;
        boolean zK = false;
        int iN6 = 0;
        int iN7 = 0;
        int iN8 = 0;
        Bundle bundleJ = null;
        String strN = null;
        String strN2 = null;
        ArrayList arrayListR = null;
        StringToIntConverter stringToIntConverter = null;
        String strN3 = null;
        String strN4 = null;
        String strN5 = null;
        String strN6 = null;
        String strN7 = null;
        String strN8 = null;
        String strN9 = null;
        String strN10 = null;
        Bundle bundleJ2 = null;
        p021d.b bVar = null;
        String strN11 = null;
        PendingIntent pendingIntent = null;
        switch (this.f11239a) {
            case 0:
                int iA0 = Q0.a.a0(parcel);
                int iN9 = 0;
                boolean zK2 = false;
                boolean zK3 = false;
                int iN10 = 0;
                int iN11 = 0;
                while (parcel.dataPosition() < iA0) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        iN9 = Q0.a.N(i7, parcel);
                    } else if (c3 == 2) {
                        zK2 = Q0.a.K(i7, parcel);
                    } else if (c3 == 3) {
                        zK3 = Q0.a.K(i7, parcel);
                    } else if (c3 == 4) {
                        iN10 = Q0.a.N(i7, parcel);
                    } else if (c3 != 5) {
                        Q0.a.X(i7, parcel);
                    } else {
                        iN11 = Q0.a.N(i7, parcel);
                    }
                }
                Q0.a.y(iA0, parcel);
                return new RootTelemetryConfiguration(iN9, zK2, zK3, iN10, iN11);
            case 1:
                int iA1 = Q0.a.a0(parcel);
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                while (parcel.dataPosition() < iA1) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 1) {
                        bundleJ = Q0.a.j(i8, parcel);
                    } else if (c4 == 2) {
                        featureArr = (Feature[]) Q0.a.q(parcel, i8, Feature.CREATOR);
                    } else if (c4 == 3) {
                        iN = Q0.a.N(i8, parcel);
                    } else if (c4 != 4) {
                        Q0.a.X(i8, parcel);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) Q0.a.m(parcel, i8, ConnectionTelemetryConfiguration.CREATOR);
                    }
                }
                Q0.a.y(iA1, parcel);
                zzk zzkVar = new zzk();
                zzkVar.f11353a = bundleJ;
                zzkVar.f11354b = featureArr;
                zzkVar.f11355c = iN;
                zzkVar.f11356d = connectionTelemetryConfiguration;
                return zzkVar;
            case 2:
                int iA2 = Q0.a.a0(parcel);
                boolean zK4 = false;
                boolean zK5 = false;
                int iN12 = 0;
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArrL = null;
                int[] iArrL2 = null;
                while (parcel.dataPosition() < iA2) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) Q0.a.m(parcel, i9, RootTelemetryConfiguration.CREATOR);
                            break;
                        case 2:
                            zK4 = Q0.a.K(i9, parcel);
                            break;
                        case 3:
                            zK5 = Q0.a.K(i9, parcel);
                            break;
                        case 4:
                            iArrL = Q0.a.l(i9, parcel);
                            break;
                        case 5:
                            iN12 = Q0.a.N(i9, parcel);
                            break;
                        case 6:
                            iArrL2 = Q0.a.l(i9, parcel);
                            break;
                        default:
                            Q0.a.X(i9, parcel);
                            break;
                    }
                }
                Q0.a.y(iA2, parcel);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zK4, zK5, iArrL, iN12, iArrL2);
            case 3:
                int iA3 = Q0.a.a0(parcel);
                Scope[] scopeArr = GetServiceRequest.f11243F;
                Bundle bundle = new Bundle();
                Feature[] featureArr2 = GetServiceRequest.f11244G;
                Feature[] featureArr3 = featureArr2;
                int iN13 = 0;
                int iN14 = 0;
                int iN15 = 0;
                boolean zK6 = false;
                int iN16 = 0;
                boolean zK7 = false;
                String strN12 = null;
                IBinder iBinderM = null;
                Account account = null;
                String strN13 = null;
                while (parcel.dataPosition() < iA3) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iN13 = Q0.a.N(i10, parcel);
                            break;
                        case 2:
                            iN14 = Q0.a.N(i10, parcel);
                            break;
                        case 3:
                            iN15 = Q0.a.N(i10, parcel);
                            break;
                        case 4:
                            strN12 = Q0.a.n(i10, parcel);
                            break;
                        case 5:
                            iBinderM = Q0.a.M(i10, parcel);
                            break;
                        case 6:
                            scopeArr = (Scope[]) Q0.a.q(parcel, i10, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = Q0.a.j(i10, parcel);
                            break;
                        case '\b':
                            account = (Account) Q0.a.m(parcel, i10, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            Q0.a.X(i10, parcel);
                            break;
                        case '\n':
                            featureArr2 = (Feature[]) Q0.a.q(parcel, i10, Feature.CREATOR);
                            break;
                        case 11:
                            featureArr3 = (Feature[]) Q0.a.q(parcel, i10, Feature.CREATOR);
                            break;
                        case '\f':
                            zK6 = Q0.a.K(i10, parcel);
                            break;
                        case '\r':
                            iN16 = Q0.a.N(i10, parcel);
                            break;
                        case 14:
                            zK7 = Q0.a.K(i10, parcel);
                            break;
                        case 15:
                            strN13 = Q0.a.n(i10, parcel);
                            break;
                    }
                }
                Q0.a.y(iA3, parcel);
                return new GetServiceRequest(iN13, iN14, iN15, strN12, iBinderM, scopeArr, bundle, account, featureArr2, featureArr3, zK6, iN16, zK7, strN13);
            case 4:
                int iA4 = Q0.a.a0(parcel);
                int iN17 = 0;
                String strN14 = null;
                while (parcel.dataPosition() < iA4) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 1) {
                        iN8 = Q0.a.N(i11, parcel);
                    } else if (c7 == 2) {
                        iN17 = Q0.a.N(i11, parcel);
                    } else if (c7 == 3) {
                        pendingIntent = (PendingIntent) Q0.a.m(parcel, i11, PendingIntent.CREATOR);
                    } else if (c7 != 4) {
                        Q0.a.X(i11, parcel);
                    } else {
                        strN14 = Q0.a.n(i11, parcel);
                    }
                }
                Q0.a.y(iA4, parcel);
                return new ConnectionResult(iN8, iN17, pendingIntent, strN14);
            case 5:
                int iA5 = Q0.a.a0(parcel);
                long jP = -1;
                while (parcel.dataPosition() < iA5) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        strN11 = Q0.a.n(i12, parcel);
                    } else if (c8 == 2) {
                        iN7 = Q0.a.N(i12, parcel);
                    } else if (c8 != 3) {
                        Q0.a.X(i12, parcel);
                    } else {
                        jP = Q0.a.P(i12, parcel);
                    }
                }
                Q0.a.y(iA5, parcel);
                return new Feature(iN7, jP, strN11);
            case 6:
                ResultReceiver resultReceiver = new ResultReceiver();
                IBinder strongBinder = parcel.readStrongBinder();
                int i13 = p021d.c.f12330b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(p021d.b.f12329p);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p021d.b)) {
                        p021d.a aVar = new p021d.a();
                        aVar.f12328a = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (p021d.b) iInterfaceQueryLocalInterface;
                    }
                }
                resultReceiver.f8079a = bVar;
                return resultReceiver;
            case 7:
                int iA6 = Q0.a.a0(parcel);
                int iN18 = 0;
                while (parcel.dataPosition() < iA6) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 1) {
                        iN6 = Q0.a.N(i14, parcel);
                    } else if (c9 == 2) {
                        iN18 = Q0.a.N(i14, parcel);
                    } else if (c9 != 3) {
                        Q0.a.X(i14, parcel);
                    } else {
                        bundleJ2 = Q0.a.j(i14, parcel);
                    }
                }
                Q0.a.y(iA6, parcel);
                return new GoogleSignInOptionsExtensionParcelable(iN6, iN18, bundleJ2);
            case 8:
                int iA7 = Q0.a.a0(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iA7) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 2) {
                        strN10 = Q0.a.n(i15, parcel);
                    } else if (c10 != 5) {
                        Q0.a.X(i15, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) Q0.a.m(parcel, i15, GoogleSignInOptions.CREATOR);
                    }
                }
                Q0.a.y(iA7, parcel);
                return new SignInConfiguration(strN10, googleSignInOptions);
            case 9:
                int iA8 = Q0.a.a0(parcel);
                boolean zK8 = false;
                boolean zK9 = false;
                int iN19 = 0;
                String strN15 = null;
                String strN16 = null;
                String strN17 = null;
                String strN18 = null;
                String strN19 = null;
                String strN20 = null;
                String strN21 = null;
                String strN22 = null;
                while (parcel.dataPosition() < iA8) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strN15 = Q0.a.n(i16, parcel);
                            break;
                        case 2:
                            strN16 = Q0.a.n(i16, parcel);
                            break;
                        case 3:
                            strN17 = Q0.a.n(i16, parcel);
                            break;
                        case 4:
                            strN18 = Q0.a.n(i16, parcel);
                            break;
                        case 5:
                            zK8 = Q0.a.K(i16, parcel);
                            break;
                        case 6:
                            strN19 = Q0.a.n(i16, parcel);
                            break;
                        case 7:
                            zK9 = Q0.a.K(i16, parcel);
                            break;
                        case '\b':
                            strN20 = Q0.a.n(i16, parcel);
                            break;
                        case '\t':
                            iN19 = Q0.a.N(i16, parcel);
                            break;
                        case '\n':
                            strN21 = Q0.a.n(i16, parcel);
                            break;
                        case 11:
                            strN22 = Q0.a.n(i16, parcel);
                            break;
                        default:
                            Q0.a.X(i16, parcel);
                            break;
                    }
                }
                Q0.a.y(iA8, parcel);
                return new ActionCodeSettings(strN15, strN16, strN17, strN18, zK8, strN19, zK9, strN20, iN19, strN21, strN22);
            case 10:
                int iA9 = Q0.a.a0(parcel);
                while (parcel.dataPosition() < iA9) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        Q0.a.X(i17, parcel);
                    } else {
                        strN9 = Q0.a.n(i17, parcel);
                    }
                }
                Q0.a.y(iA9, parcel);
                return new GithubAuthCredential(strN9);
            case 11:
                int iA10 = Q0.a.a0(parcel);
                String strN23 = null;
                while (parcel.dataPosition() < iA10) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 1) {
                        strN8 = Q0.a.n(i18, parcel);
                    } else if (c11 != 2) {
                        Q0.a.X(i18, parcel);
                    } else {
                        strN23 = Q0.a.n(i18, parcel);
                    }
                }
                Q0.a.y(iA10, parcel);
                return new GoogleAuthCredential(strN8, strN23);
            case 12:
                int iA11 = Q0.a.a0(parcel);
                String strN24 = null;
                String strN25 = null;
                while (parcel.dataPosition() < iA11) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 1) {
                        strN7 = Q0.a.n(i19, parcel);
                    } else if (c12 == 2) {
                        strN24 = Q0.a.n(i19, parcel);
                    } else if (c12 != 3) {
                        Q0.a.X(i19, parcel);
                    } else {
                        strN25 = Q0.a.n(i19, parcel);
                    }
                }
                Q0.a.y(iA11, parcel);
                return new zzan(strN7, strN24, strN25);
            case 13:
                int iA12 = Q0.a.a0(parcel);
                boolean zK10 = false;
                String strN26 = null;
                String strN27 = null;
                String strN28 = null;
                String strN29 = null;
                while (parcel.dataPosition() < iA12) {
                    int i20 = parcel.readInt();
                    char c13 = (char) i20;
                    if (c13 == 1) {
                        strN26 = Q0.a.n(i20, parcel);
                    } else if (c13 == 2) {
                        strN27 = Q0.a.n(i20, parcel);
                    } else if (c13 == 4) {
                        strN28 = Q0.a.n(i20, parcel);
                    } else if (c13 == 5) {
                        zK10 = Q0.a.K(i20, parcel);
                    } else if (c13 != 6) {
                        Q0.a.X(i20, parcel);
                    } else {
                        strN29 = Q0.a.n(i20, parcel);
                    }
                }
                Q0.a.y(iA12, parcel);
                return new PhoneAuthCredential(strN26, strN27, strN28, zK10, strN29);
            case 14:
                int iA13 = Q0.a.a0(parcel);
                long jP2 = 0;
                String strN30 = null;
                String strN31 = null;
                String strN32 = null;
                while (parcel.dataPosition() < iA13) {
                    int i21 = parcel.readInt();
                    char c14 = (char) i21;
                    if (c14 == 1) {
                        strN30 = Q0.a.n(i21, parcel);
                    } else if (c14 == 2) {
                        strN31 = Q0.a.n(i21, parcel);
                    } else if (c14 == 3) {
                        jP2 = Q0.a.P(i21, parcel);
                    } else if (c14 != 4) {
                        Q0.a.X(i21, parcel);
                    } else {
                        strN32 = Q0.a.n(i21, parcel);
                    }
                }
                Q0.a.y(iA13, parcel);
                return new PhoneMultiFactorInfo(strN30, strN31, jP2, strN32);
            case 15:
                int iA14 = Q0.a.a0(parcel);
                while (parcel.dataPosition() < iA14) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        Q0.a.X(i22, parcel);
                    } else {
                        strN6 = Q0.a.n(i22, parcel);
                    }
                }
                Q0.a.y(iA14, parcel);
                return new PlayGamesAuthCredential(strN6);
            case 16:
                int iA15 = Q0.a.a0(parcel);
                long jP3 = 0;
                String strN33 = null;
                String strN34 = null;
                zzahp zzahpVar = null;
                while (parcel.dataPosition() < iA15) {
                    int i23 = parcel.readInt();
                    char c15 = (char) i23;
                    if (c15 == 1) {
                        strN33 = Q0.a.n(i23, parcel);
                    } else if (c15 == 2) {
                        strN34 = Q0.a.n(i23, parcel);
                    } else if (c15 == 3) {
                        jP3 = Q0.a.P(i23, parcel);
                    } else if (c15 != 4) {
                        Q0.a.X(i23, parcel);
                    } else {
                        zzahpVar = (zzahp) Q0.a.m(parcel, i23, zzahp.CREATOR);
                    }
                }
                Q0.a.y(iA15, parcel);
                return new TotpMultiFactorInfo(strN33, strN34, jP3, zzahpVar);
            case 17:
                int iA16 = Q0.a.a0(parcel);
                String strN35 = null;
                while (parcel.dataPosition() < iA16) {
                    int i24 = parcel.readInt();
                    char c16 = (char) i24;
                    if (c16 == 1) {
                        strN5 = Q0.a.n(i24, parcel);
                    } else if (c16 != 2) {
                        Q0.a.X(i24, parcel);
                    } else {
                        strN35 = Q0.a.n(i24, parcel);
                    }
                }
                Q0.a.y(iA16, parcel);
                return new TwitterAuthCredential(strN5, strN35);
            case 18:
                int iA17 = Q0.a.a0(parcel);
                boolean zK11 = false;
                String strN36 = null;
                while (parcel.dataPosition() < iA17) {
                    int i25 = parcel.readInt();
                    char c17 = (char) i25;
                    if (c17 == 2) {
                        strN4 = Q0.a.n(i25, parcel);
                    } else if (c17 == 3) {
                        strN36 = Q0.a.n(i25, parcel);
                    } else if (c17 == 4) {
                        zK = Q0.a.K(i25, parcel);
                    } else if (c17 != 5) {
                        Q0.a.X(i25, parcel);
                    } else {
                        zK11 = Q0.a.K(i25, parcel);
                    }
                }
                Q0.a.y(iA17, parcel);
                return new UserProfileChangeRequest(strN4, strN36, zK, zK11);
            case 19:
                int iA18 = Q0.a.a0(parcel);
                while (parcel.dataPosition() < iA18) {
                    Q0.a.X(parcel.readInt(), parcel);
                }
                Q0.a.y(iA18, parcel);
                return new PhoneAuthProvider$ForceResendingToken();
            case 20:
                int iA19 = Q0.a.a0(parcel);
                String strN37 = null;
                String strN38 = null;
                String strN39 = null;
                zzahr zzahrVar = null;
                String strN40 = null;
                String strN41 = null;
                String strN42 = null;
                while (parcel.dataPosition() < iA19) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            strN37 = Q0.a.n(i26, parcel);
                            break;
                        case 2:
                            strN38 = Q0.a.n(i26, parcel);
                            break;
                        case 3:
                            strN39 = Q0.a.n(i26, parcel);
                            break;
                        case 4:
                            zzahrVar = (zzahr) Q0.a.m(parcel, i26, zzahr.CREATOR);
                            break;
                        case 5:
                            strN40 = Q0.a.n(i26, parcel);
                            break;
                        case 6:
                            strN41 = Q0.a.n(i26, parcel);
                            break;
                        case 7:
                            strN42 = Q0.a.n(i26, parcel);
                            break;
                        default:
                            Q0.a.X(i26, parcel);
                            break;
                    }
                }
                Q0.a.y(iA19, parcel);
                return new zze(strN37, strN38, strN39, zzahrVar, strN40, strN41, strN42);
            case zzbbd.zzt.zzm /* 21 */:
                int iA20 = Q0.a.a0(parcel);
                boolean zK12 = false;
                String strN43 = null;
                String strN44 = null;
                String strN45 = null;
                String strN46 = null;
                while (parcel.dataPosition() < iA20) {
                    int i27 = parcel.readInt();
                    char c18 = (char) i27;
                    if (c18 == 1) {
                        strN43 = Q0.a.n(i27, parcel);
                    } else if (c18 == 2) {
                        strN44 = Q0.a.n(i27, parcel);
                    } else if (c18 == 3) {
                        strN45 = Q0.a.n(i27, parcel);
                    } else if (c18 == 4) {
                        strN46 = Q0.a.n(i27, parcel);
                    } else if (c18 != 5) {
                        Q0.a.X(i27, parcel);
                    } else {
                        zK12 = Q0.a.K(i27, parcel);
                    }
                }
                Q0.a.y(iA20, parcel);
                return new EmailAuthCredential(strN43, strN44, strN45, strN46, zK12);
            case 22:
                int iA21 = Q0.a.a0(parcel);
                while (parcel.dataPosition() < iA21) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        Q0.a.X(i28, parcel);
                    } else {
                        strN3 = Q0.a.n(i28, parcel);
                    }
                }
                Q0.a.y(iA21, parcel);
                return new FacebookAuthCredential(strN3);
            case 23:
                return new ActivityResult(parcel);
            case 24:
                t6.h.e(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                t6.h.b(parcelable);
                return new IntentSenderRequest((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 25:
                return new HlsTrackMetadataEntry(parcel);
            case 26:
                int iA22 = Q0.a.a0(parcel);
                while (parcel.dataPosition() < iA22) {
                    int i29 = parcel.readInt();
                    char c19 = (char) i29;
                    if (c19 == 1) {
                        iN5 = Q0.a.N(i29, parcel);
                    } else if (c19 != 2) {
                        Q0.a.X(i29, parcel);
                    } else {
                        stringToIntConverter = (StringToIntConverter) Q0.a.m(parcel, i29, StringToIntConverter.CREATOR);
                    }
                }
                Q0.a.y(iA22, parcel);
                return new zaa(iN5, stringToIntConverter);
            case 27:
                int iA23 = Q0.a.a0(parcel);
                while (parcel.dataPosition() < iA23) {
                    int i30 = parcel.readInt();
                    char c20 = (char) i30;
                    if (c20 == 1) {
                        iN4 = Q0.a.N(i30, parcel);
                    } else if (c20 != 2) {
                        Q0.a.X(i30, parcel);
                    } else {
                        arrayListR = Q0.a.r(parcel, i30, zac.CREATOR);
                    }
                }
                Q0.a.y(iA23, parcel);
                return new StringToIntConverter(arrayListR, iN4);
            case 28:
                int iA24 = Q0.a.a0(parcel);
                int iN20 = 0;
                while (parcel.dataPosition() < iA24) {
                    int i31 = parcel.readInt();
                    char c21 = (char) i31;
                    if (c21 == 1) {
                        iN3 = Q0.a.N(i31, parcel);
                    } else if (c21 == 2) {
                        strN2 = Q0.a.n(i31, parcel);
                    } else if (c21 != 3) {
                        Q0.a.X(i31, parcel);
                    } else {
                        iN20 = Q0.a.N(i31, parcel);
                    }
                }
                Q0.a.y(iA24, parcel);
                return new zac(iN3, strN2, iN20);
            default:
                int iA25 = Q0.a.a0(parcel);
                FastJsonResponse$Field fastJsonResponse$Field = null;
                while (parcel.dataPosition() < iA25) {
                    int i32 = parcel.readInt();
                    char c22 = (char) i32;
                    if (c22 == 1) {
                        iN2 = Q0.a.N(i32, parcel);
                    } else if (c22 == 2) {
                        strN = Q0.a.n(i32, parcel);
                    } else if (c22 != 3) {
                        Q0.a.X(i32, parcel);
                    } else {
                        fastJsonResponse$Field = (FastJsonResponse$Field) Q0.a.m(parcel, i32, FastJsonResponse$Field.CREATOR);
                    }
                }
                Q0.a.y(iA25, parcel);
                return new zam(fastJsonResponse$Field, strN, iN2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f11239a) {
            case 0:
                return new RootTelemetryConfiguration[i7];
            case 1:
                return new zzk[i7];
            case 2:
                return new ConnectionTelemetryConfiguration[i7];
            case 3:
                return new GetServiceRequest[i7];
            case 4:
                return new ConnectionResult[i7];
            case 5:
                return new Feature[i7];
            case 6:
                return new ResultReceiver[i7];
            case 7:
                return new GoogleSignInOptionsExtensionParcelable[i7];
            case 8:
                return new SignInConfiguration[i7];
            case 9:
                return new ActionCodeSettings[i7];
            case 10:
                return new GithubAuthCredential[i7];
            case 11:
                return new GoogleAuthCredential[i7];
            case 12:
                return new zzan[i7];
            case 13:
                return new PhoneAuthCredential[i7];
            case 14:
                return new PhoneMultiFactorInfo[i7];
            case 15:
                return new PlayGamesAuthCredential[i7];
            case 16:
                return new TotpMultiFactorInfo[i7];
            case 17:
                return new TwitterAuthCredential[i7];
            case 18:
                return new UserProfileChangeRequest[i7];
            case 19:
                return new PhoneAuthProvider$ForceResendingToken[i7];
            case 20:
                return new zze[i7];
            case zzbbd.zzt.zzm /* 21 */:
                return new EmailAuthCredential[i7];
            case 22:
                return new FacebookAuthCredential[i7];
            case 23:
                return new ActivityResult[i7];
            case 24:
                return new IntentSenderRequest[i7];
            case 25:
                return new HlsTrackMetadataEntry[i7];
            case 26:
                return new zaa[i7];
            case 27:
                return new StringToIntConverter[i7];
            case 28:
                return new zac[i7];
            default:
                return new zam[i7];
        }
    }
}
