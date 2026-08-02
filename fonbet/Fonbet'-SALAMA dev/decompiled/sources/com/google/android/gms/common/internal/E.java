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
import d.BinderC0938c;
import d.C0936a;
import d.InterfaceC0937b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class E implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11239a;

    public /* synthetic */ E(int i7) {
        this.f11239a = i7;
    }

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
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
        Y4.D.z0(x02, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z4 = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        Bundle bundle = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        StringToIntConverter stringToIntConverter = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle2 = null;
        InterfaceC0937b interfaceC0937b = null;
        String str11 = null;
        PendingIntent pendingIntent = null;
        switch (this.f11239a) {
            case 0:
                int a02 = Q0.a.a0(parcel);
                int i15 = 0;
                boolean z7 = false;
                boolean z8 = false;
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < a02) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        i15 = Q0.a.N(readInt, parcel);
                    } else if (c3 == 2) {
                        z7 = Q0.a.K(readInt, parcel);
                    } else if (c3 == 3) {
                        z8 = Q0.a.K(readInt, parcel);
                    } else if (c3 == 4) {
                        i16 = Q0.a.N(readInt, parcel);
                    } else if (c3 != 5) {
                        Q0.a.X(readInt, parcel);
                    } else {
                        i17 = Q0.a.N(readInt, parcel);
                    }
                }
                Q0.a.y(a02, parcel);
                return new RootTelemetryConfiguration(i15, z7, z8, i16, i17);
            case 1:
                int a03 = Q0.a.a0(parcel);
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                while (parcel.dataPosition() < a03) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 == 1) {
                        bundle = Q0.a.j(readInt2, parcel);
                    } else if (c4 == 2) {
                        featureArr = (Feature[]) Q0.a.q(parcel, readInt2, Feature.CREATOR);
                    } else if (c4 == 3) {
                        i7 = Q0.a.N(readInt2, parcel);
                    } else if (c4 != 4) {
                        Q0.a.X(readInt2, parcel);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) Q0.a.m(parcel, readInt2, ConnectionTelemetryConfiguration.CREATOR);
                    }
                }
                Q0.a.y(a03, parcel);
                zzk zzkVar = new zzk();
                zzkVar.f11353a = bundle;
                zzkVar.f11354b = featureArr;
                zzkVar.f11355c = i7;
                zzkVar.f11356d = connectionTelemetryConfiguration;
                return zzkVar;
            case 2:
                int a04 = Q0.a.a0(parcel);
                boolean z9 = false;
                boolean z10 = false;
                int i18 = 0;
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < a04) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) Q0.a.m(parcel, readInt3, RootTelemetryConfiguration.CREATOR);
                            break;
                        case 2:
                            z9 = Q0.a.K(readInt3, parcel);
                            break;
                        case 3:
                            z10 = Q0.a.K(readInt3, parcel);
                            break;
                        case 4:
                            iArr = Q0.a.l(readInt3, parcel);
                            break;
                        case 5:
                            i18 = Q0.a.N(readInt3, parcel);
                            break;
                        case 6:
                            iArr2 = Q0.a.l(readInt3, parcel);
                            break;
                        default:
                            Q0.a.X(readInt3, parcel);
                            break;
                    }
                }
                Q0.a.y(a04, parcel);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z9, z10, iArr, i18, iArr2);
            case 3:
                int a05 = Q0.a.a0(parcel);
                Scope[] scopeArr = GetServiceRequest.f11243F;
                Bundle bundle3 = new Bundle();
                Feature[] featureArr2 = GetServiceRequest.f11244G;
                Feature[] featureArr3 = featureArr2;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                boolean z11 = false;
                int i22 = 0;
                boolean z12 = false;
                String str12 = null;
                IBinder iBinder = null;
                Account account = null;
                String str13 = null;
                while (parcel.dataPosition() < a05) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i19 = Q0.a.N(readInt4, parcel);
                            break;
                        case 2:
                            i20 = Q0.a.N(readInt4, parcel);
                            break;
                        case 3:
                            i21 = Q0.a.N(readInt4, parcel);
                            break;
                        case 4:
                            str12 = Q0.a.n(readInt4, parcel);
                            break;
                        case 5:
                            iBinder = Q0.a.M(readInt4, parcel);
                            break;
                        case 6:
                            scopeArr = (Scope[]) Q0.a.q(parcel, readInt4, Scope.CREATOR);
                            break;
                        case 7:
                            bundle3 = Q0.a.j(readInt4, parcel);
                            break;
                        case '\b':
                            account = (Account) Q0.a.m(parcel, readInt4, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            Q0.a.X(readInt4, parcel);
                            break;
                        case '\n':
                            featureArr2 = (Feature[]) Q0.a.q(parcel, readInt4, Feature.CREATOR);
                            break;
                        case 11:
                            featureArr3 = (Feature[]) Q0.a.q(parcel, readInt4, Feature.CREATOR);
                            break;
                        case '\f':
                            z11 = Q0.a.K(readInt4, parcel);
                            break;
                        case '\r':
                            i22 = Q0.a.N(readInt4, parcel);
                            break;
                        case 14:
                            z12 = Q0.a.K(readInt4, parcel);
                            break;
                        case 15:
                            str13 = Q0.a.n(readInt4, parcel);
                            break;
                    }
                }
                Q0.a.y(a05, parcel);
                return new GetServiceRequest(i19, i20, i21, str12, iBinder, scopeArr, bundle3, account, featureArr2, featureArr3, z11, i22, z12, str13);
            case 4:
                int a06 = Q0.a.a0(parcel);
                int i23 = 0;
                String str14 = null;
                while (parcel.dataPosition() < a06) {
                    int readInt5 = parcel.readInt();
                    char c7 = (char) readInt5;
                    if (c7 == 1) {
                        i14 = Q0.a.N(readInt5, parcel);
                    } else if (c7 == 2) {
                        i23 = Q0.a.N(readInt5, parcel);
                    } else if (c7 == 3) {
                        pendingIntent = (PendingIntent) Q0.a.m(parcel, readInt5, PendingIntent.CREATOR);
                    } else if (c7 != 4) {
                        Q0.a.X(readInt5, parcel);
                    } else {
                        str14 = Q0.a.n(readInt5, parcel);
                    }
                }
                Q0.a.y(a06, parcel);
                return new ConnectionResult(i14, i23, pendingIntent, str14);
            case 5:
                int a07 = Q0.a.a0(parcel);
                long j = -1;
                while (parcel.dataPosition() < a07) {
                    int readInt6 = parcel.readInt();
                    char c8 = (char) readInt6;
                    if (c8 == 1) {
                        str11 = Q0.a.n(readInt6, parcel);
                    } else if (c8 == 2) {
                        i13 = Q0.a.N(readInt6, parcel);
                    } else if (c8 != 3) {
                        Q0.a.X(readInt6, parcel);
                    } else {
                        j = Q0.a.P(readInt6, parcel);
                    }
                }
                Q0.a.y(a07, parcel);
                return new Feature(i13, j, str11);
            case 6:
                ResultReceiver resultReceiver = new ResultReceiver();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i24 = BinderC0938c.f12324b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC0937b.f12323p);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0937b)) {
                        C0936a c0936a = new C0936a();
                        c0936a.f12322a = readStrongBinder;
                        interfaceC0937b = c0936a;
                    } else {
                        interfaceC0937b = (InterfaceC0937b) queryLocalInterface;
                    }
                }
                resultReceiver.f8079a = interfaceC0937b;
                return resultReceiver;
            case 7:
                int a08 = Q0.a.a0(parcel);
                int i25 = 0;
                while (parcel.dataPosition() < a08) {
                    int readInt7 = parcel.readInt();
                    char c9 = (char) readInt7;
                    if (c9 == 1) {
                        i12 = Q0.a.N(readInt7, parcel);
                    } else if (c9 == 2) {
                        i25 = Q0.a.N(readInt7, parcel);
                    } else if (c9 != 3) {
                        Q0.a.X(readInt7, parcel);
                    } else {
                        bundle2 = Q0.a.j(readInt7, parcel);
                    }
                }
                Q0.a.y(a08, parcel);
                return new GoogleSignInOptionsExtensionParcelable(i12, i25, bundle2);
            case 8:
                int a09 = Q0.a.a0(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < a09) {
                    int readInt8 = parcel.readInt();
                    char c10 = (char) readInt8;
                    if (c10 == 2) {
                        str10 = Q0.a.n(readInt8, parcel);
                    } else if (c10 != 5) {
                        Q0.a.X(readInt8, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) Q0.a.m(parcel, readInt8, GoogleSignInOptions.CREATOR);
                    }
                }
                Q0.a.y(a09, parcel);
                return new SignInConfiguration(str10, googleSignInOptions);
            case 9:
                int a010 = Q0.a.a0(parcel);
                boolean z13 = false;
                boolean z14 = false;
                int i26 = 0;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                while (parcel.dataPosition() < a010) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            str15 = Q0.a.n(readInt9, parcel);
                            break;
                        case 2:
                            str16 = Q0.a.n(readInt9, parcel);
                            break;
                        case 3:
                            str17 = Q0.a.n(readInt9, parcel);
                            break;
                        case 4:
                            str18 = Q0.a.n(readInt9, parcel);
                            break;
                        case 5:
                            z13 = Q0.a.K(readInt9, parcel);
                            break;
                        case 6:
                            str19 = Q0.a.n(readInt9, parcel);
                            break;
                        case 7:
                            z14 = Q0.a.K(readInt9, parcel);
                            break;
                        case '\b':
                            str20 = Q0.a.n(readInt9, parcel);
                            break;
                        case '\t':
                            i26 = Q0.a.N(readInt9, parcel);
                            break;
                        case '\n':
                            str21 = Q0.a.n(readInt9, parcel);
                            break;
                        case 11:
                            str22 = Q0.a.n(readInt9, parcel);
                            break;
                        default:
                            Q0.a.X(readInt9, parcel);
                            break;
                    }
                }
                Q0.a.y(a010, parcel);
                return new ActionCodeSettings(str15, str16, str17, str18, z13, str19, z14, str20, i26, str21, str22);
            case 10:
                int a011 = Q0.a.a0(parcel);
                while (parcel.dataPosition() < a011) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        Q0.a.X(readInt10, parcel);
                    } else {
                        str9 = Q0.a.n(readInt10, parcel);
                    }
                }
                Q0.a.y(a011, parcel);
                return new GithubAuthCredential(str9);
            case 11:
                int a012 = Q0.a.a0(parcel);
                String str23 = null;
                while (parcel.dataPosition() < a012) {
                    int readInt11 = parcel.readInt();
                    char c11 = (char) readInt11;
                    if (c11 == 1) {
                        str8 = Q0.a.n(readInt11, parcel);
                    } else if (c11 != 2) {
                        Q0.a.X(readInt11, parcel);
                    } else {
                        str23 = Q0.a.n(readInt11, parcel);
                    }
                }
                Q0.a.y(a012, parcel);
                return new GoogleAuthCredential(str8, str23);
            case 12:
                int a013 = Q0.a.a0(parcel);
                String str24 = null;
                String str25 = null;
                while (parcel.dataPosition() < a013) {
                    int readInt12 = parcel.readInt();
                    char c12 = (char) readInt12;
                    if (c12 == 1) {
                        str7 = Q0.a.n(readInt12, parcel);
                    } else if (c12 == 2) {
                        str24 = Q0.a.n(readInt12, parcel);
                    } else if (c12 != 3) {
                        Q0.a.X(readInt12, parcel);
                    } else {
                        str25 = Q0.a.n(readInt12, parcel);
                    }
                }
                Q0.a.y(a013, parcel);
                return new zzan(str7, str24, str25);
            case 13:
                int a014 = Q0.a.a0(parcel);
                boolean z15 = false;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                while (parcel.dataPosition() < a014) {
                    int readInt13 = parcel.readInt();
                    char c13 = (char) readInt13;
                    if (c13 == 1) {
                        str26 = Q0.a.n(readInt13, parcel);
                    } else if (c13 == 2) {
                        str27 = Q0.a.n(readInt13, parcel);
                    } else if (c13 == 4) {
                        str28 = Q0.a.n(readInt13, parcel);
                    } else if (c13 == 5) {
                        z15 = Q0.a.K(readInt13, parcel);
                    } else if (c13 != 6) {
                        Q0.a.X(readInt13, parcel);
                    } else {
                        str29 = Q0.a.n(readInt13, parcel);
                    }
                }
                Q0.a.y(a014, parcel);
                return new PhoneAuthCredential(str26, str27, str28, z15, str29);
            case 14:
                int a015 = Q0.a.a0(parcel);
                long j3 = 0;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                while (parcel.dataPosition() < a015) {
                    int readInt14 = parcel.readInt();
                    char c14 = (char) readInt14;
                    if (c14 == 1) {
                        str30 = Q0.a.n(readInt14, parcel);
                    } else if (c14 == 2) {
                        str31 = Q0.a.n(readInt14, parcel);
                    } else if (c14 == 3) {
                        j3 = Q0.a.P(readInt14, parcel);
                    } else if (c14 != 4) {
                        Q0.a.X(readInt14, parcel);
                    } else {
                        str32 = Q0.a.n(readInt14, parcel);
                    }
                }
                Q0.a.y(a015, parcel);
                return new PhoneMultiFactorInfo(str30, str31, j3, str32);
            case 15:
                int a016 = Q0.a.a0(parcel);
                while (parcel.dataPosition() < a016) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        Q0.a.X(readInt15, parcel);
                    } else {
                        str6 = Q0.a.n(readInt15, parcel);
                    }
                }
                Q0.a.y(a016, parcel);
                return new PlayGamesAuthCredential(str6);
            case 16:
                int a017 = Q0.a.a0(parcel);
                long j7 = 0;
                String str33 = null;
                String str34 = null;
                zzahp zzahpVar = null;
                while (parcel.dataPosition() < a017) {
                    int readInt16 = parcel.readInt();
                    char c15 = (char) readInt16;
                    if (c15 == 1) {
                        str33 = Q0.a.n(readInt16, parcel);
                    } else if (c15 == 2) {
                        str34 = Q0.a.n(readInt16, parcel);
                    } else if (c15 == 3) {
                        j7 = Q0.a.P(readInt16, parcel);
                    } else if (c15 != 4) {
                        Q0.a.X(readInt16, parcel);
                    } else {
                        zzahpVar = (zzahp) Q0.a.m(parcel, readInt16, zzahp.CREATOR);
                    }
                }
                Q0.a.y(a017, parcel);
                return new TotpMultiFactorInfo(str33, str34, j7, zzahpVar);
            case 17:
                int a018 = Q0.a.a0(parcel);
                String str35 = null;
                while (parcel.dataPosition() < a018) {
                    int readInt17 = parcel.readInt();
                    char c16 = (char) readInt17;
                    if (c16 == 1) {
                        str5 = Q0.a.n(readInt17, parcel);
                    } else if (c16 != 2) {
                        Q0.a.X(readInt17, parcel);
                    } else {
                        str35 = Q0.a.n(readInt17, parcel);
                    }
                }
                Q0.a.y(a018, parcel);
                return new TwitterAuthCredential(str5, str35);
            case 18:
                int a019 = Q0.a.a0(parcel);
                boolean z16 = false;
                String str36 = null;
                while (parcel.dataPosition() < a019) {
                    int readInt18 = parcel.readInt();
                    char c17 = (char) readInt18;
                    if (c17 == 2) {
                        str4 = Q0.a.n(readInt18, parcel);
                    } else if (c17 == 3) {
                        str36 = Q0.a.n(readInt18, parcel);
                    } else if (c17 == 4) {
                        z4 = Q0.a.K(readInt18, parcel);
                    } else if (c17 != 5) {
                        Q0.a.X(readInt18, parcel);
                    } else {
                        z16 = Q0.a.K(readInt18, parcel);
                    }
                }
                Q0.a.y(a019, parcel);
                return new UserProfileChangeRequest(str4, str36, z4, z16);
            case 19:
                int a020 = Q0.a.a0(parcel);
                while (parcel.dataPosition() < a020) {
                    Q0.a.X(parcel.readInt(), parcel);
                }
                Q0.a.y(a020, parcel);
                return new PhoneAuthProvider$ForceResendingToken();
            case 20:
                int a021 = Q0.a.a0(parcel);
                String str37 = null;
                String str38 = null;
                String str39 = null;
                zzahr zzahrVar = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                while (parcel.dataPosition() < a021) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            str37 = Q0.a.n(readInt19, parcel);
                            break;
                        case 2:
                            str38 = Q0.a.n(readInt19, parcel);
                            break;
                        case 3:
                            str39 = Q0.a.n(readInt19, parcel);
                            break;
                        case 4:
                            zzahrVar = (zzahr) Q0.a.m(parcel, readInt19, zzahr.CREATOR);
                            break;
                        case 5:
                            str40 = Q0.a.n(readInt19, parcel);
                            break;
                        case 6:
                            str41 = Q0.a.n(readInt19, parcel);
                            break;
                        case 7:
                            str42 = Q0.a.n(readInt19, parcel);
                            break;
                        default:
                            Q0.a.X(readInt19, parcel);
                            break;
                    }
                }
                Q0.a.y(a021, parcel);
                return new zze(str37, str38, str39, zzahrVar, str40, str41, str42);
            case zzbbd.zzt.zzm /* 21 */:
                int a022 = Q0.a.a0(parcel);
                boolean z17 = false;
                String str43 = null;
                String str44 = null;
                String str45 = null;
                String str46 = null;
                while (parcel.dataPosition() < a022) {
                    int readInt20 = parcel.readInt();
                    char c18 = (char) readInt20;
                    if (c18 == 1) {
                        str43 = Q0.a.n(readInt20, parcel);
                    } else if (c18 == 2) {
                        str44 = Q0.a.n(readInt20, parcel);
                    } else if (c18 == 3) {
                        str45 = Q0.a.n(readInt20, parcel);
                    } else if (c18 == 4) {
                        str46 = Q0.a.n(readInt20, parcel);
                    } else if (c18 != 5) {
                        Q0.a.X(readInt20, parcel);
                    } else {
                        z17 = Q0.a.K(readInt20, parcel);
                    }
                }
                Q0.a.y(a022, parcel);
                return new EmailAuthCredential(str43, str44, str45, str46, z17);
            case 22:
                int a023 = Q0.a.a0(parcel);
                while (parcel.dataPosition() < a023) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 1) {
                        Q0.a.X(readInt21, parcel);
                    } else {
                        str3 = Q0.a.n(readInt21, parcel);
                    }
                }
                Q0.a.y(a023, parcel);
                return new FacebookAuthCredential(str3);
            case 23:
                return new ActivityResult(parcel);
            case 24:
                t6.h.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                t6.h.b(readParcelable);
                return new IntentSenderRequest((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 25:
                return new HlsTrackMetadataEntry(parcel);
            case 26:
                int a024 = Q0.a.a0(parcel);
                while (parcel.dataPosition() < a024) {
                    int readInt22 = parcel.readInt();
                    char c19 = (char) readInt22;
                    if (c19 == 1) {
                        i11 = Q0.a.N(readInt22, parcel);
                    } else if (c19 != 2) {
                        Q0.a.X(readInt22, parcel);
                    } else {
                        stringToIntConverter = (StringToIntConverter) Q0.a.m(parcel, readInt22, StringToIntConverter.CREATOR);
                    }
                }
                Q0.a.y(a024, parcel);
                return new zaa(i11, stringToIntConverter);
            case 27:
                int a025 = Q0.a.a0(parcel);
                while (parcel.dataPosition() < a025) {
                    int readInt23 = parcel.readInt();
                    char c20 = (char) readInt23;
                    if (c20 == 1) {
                        i10 = Q0.a.N(readInt23, parcel);
                    } else if (c20 != 2) {
                        Q0.a.X(readInt23, parcel);
                    } else {
                        arrayList = Q0.a.r(parcel, readInt23, zac.CREATOR);
                    }
                }
                Q0.a.y(a025, parcel);
                return new StringToIntConverter(arrayList, i10);
            case 28:
                int a026 = Q0.a.a0(parcel);
                int i27 = 0;
                while (parcel.dataPosition() < a026) {
                    int readInt24 = parcel.readInt();
                    char c21 = (char) readInt24;
                    if (c21 == 1) {
                        i9 = Q0.a.N(readInt24, parcel);
                    } else if (c21 == 2) {
                        str2 = Q0.a.n(readInt24, parcel);
                    } else if (c21 != 3) {
                        Q0.a.X(readInt24, parcel);
                    } else {
                        i27 = Q0.a.N(readInt24, parcel);
                    }
                }
                Q0.a.y(a026, parcel);
                return new zac(i9, str2, i27);
            default:
                int a027 = Q0.a.a0(parcel);
                FastJsonResponse$Field fastJsonResponse$Field = null;
                while (parcel.dataPosition() < a027) {
                    int readInt25 = parcel.readInt();
                    char c22 = (char) readInt25;
                    if (c22 == 1) {
                        i8 = Q0.a.N(readInt25, parcel);
                    } else if (c22 == 2) {
                        str = Q0.a.n(readInt25, parcel);
                    } else if (c22 != 3) {
                        Q0.a.X(readInt25, parcel);
                    } else {
                        fastJsonResponse$Field = (FastJsonResponse$Field) Q0.a.m(parcel, readInt25, FastJsonResponse$Field.CREATOR);
                    }
                }
                Q0.a.y(a027, parcel);
                return new zam(fastJsonResponse$Field, str, i8);
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
