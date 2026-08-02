package com.facebook.internal;

import android.R;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenu;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.ViewCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.internal.m;
import java.util.HashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.facebook.internal.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0715k {
    public static final C0715k a = new C0715k();
    public static final HashMap b = new HashMap();

    /* renamed from: com.facebook.internal.k$a */
    public interface a {
        void b(boolean z);
    }

    /* renamed from: com.facebook.internal.k$b */
    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        ProtectedMode(66564),
        MACARuleMatching(66565),
        BlocklistEvents(66566),
        FilterRedactedEvents(66567),
        FilterSensitiveParams(66568),
        StdParamEnforcement(R.attr.trimPathEnd),
        BannedParamFiltering(R.attr.trimPathOffset),
        VVP(66571),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        IapLoggingLib5To7(67330),
        AndroidManualImplicitPurchaseDedupe(67331),
        AndroidManualImplicitSubsDedupe(67332),
        AndroidIAPSubscriptionAutoLogging(67333),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE),
        ServiceUpdateCompliance(196864),
        /* JADX INFO: Fake field, exist only in values array */
        Login(262144),
        /* JADX INFO: Fake field, exist only in values array */
        ReferrerForDeepLink(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED),
        GPSARATriggers(393216),
        GPSPACAProcessing(458752),
        GPSTopicsObservation(524288),
        /* JADX INFO: Fake field, exist only in values array */
        ReferrerForDeepLink(589824),
        /* JADX INFO: Fake field, exist only in values array */
        Login(16777216),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        /* JADX INFO: Fake field, exist only in values array */
        LoginSSO(R.string.cancel),
        /* JADX INFO: Fake field, exist only in values array */
        Share(33554432);

        public static final a Companion = new a();
        public final int a;

        /* renamed from: com.facebook.internal.k$b$a */
        public static final class a {
            public static b a(int i) {
                for (b bVar : b.values()) {
                    if (bVar.a == i) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }
        }

        /* renamed from: com.facebook.internal.k$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C0094b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[3] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[5] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[28] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[29] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[30] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[31] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[32] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[33] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[6] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[4] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[7] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[8] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[9] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[16] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[11] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[17] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[12] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[13] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[14] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[15] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[10] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[19] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[20] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[21] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[22] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[23] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[24] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[25] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[26] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[27] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[34] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[36] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[37] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[38] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[39] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[40] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[18] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[41] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[35] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[42] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[43] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[44] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[45] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[46] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[47] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        b(int i) {
            this.a = i;
        }

        @Override // java.lang.Enum
        public final String toString() {
            switch (C0094b.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "StdParamEnforcement";
                case 17:
                    return "ProtectedMode";
                case 18:
                    return "BannedParamFiltering";
                case 19:
                    return "MACARuleMatching";
                case 20:
                    return "BlocklistEvents";
                case 21:
                    return "FilterRedactedEvents";
                case 22:
                    return "FilterSensitiveParams";
                case 23:
                    return "ModelRequest";
                case 24:
                    return "EventDeactivation";
                case 25:
                    return "OnDeviceEventProcessing";
                case 26:
                    return "OnDevicePostInstallEventProcessing";
                case 27:
                    return "IAPLogging";
                case 28:
                    return "IAPLoggingLib2";
                case 29:
                    return "IAPLoggingLib5To7";
                case 30:
                    return "AndroidManualImplicitPurchaseDedupe";
                case 31:
                    return "AndroidManualImplicitSubsDedupe";
                case 32:
                    return "AndroidIAPSubscriptionAutoLogging";
                case 33:
                    return "Monitoring";
                case 34:
                    return "Megatron";
                case 35:
                    return "Elora";
                case 36:
                    return "GPSARATriggers";
                case 37:
                    return "GPSPACAProcessing";
                case 38:
                    return "GPSTopicsObservation";
                case 39:
                    return "VVP";
                case 40:
                    return "ReferrerForDeepLink";
                case 41:
                    return "ServiceUpdateCompliance";
                case 42:
                    return "LoginKit";
                case 43:
                    return "ChromeCustomTabsPrefetching";
                case 44:
                    return "IgnoreAppSwitchToLoggedOut";
                case 45:
                    return "BypassAppSwitch";
                case 46:
                    return "LoginSSO";
                case 47:
                    return "ShareKit";
                default:
                    return EnvironmentCompat.MEDIA_UNKNOWN;
            }
        }
    }

    /* renamed from: com.facebook.internal.k$c */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[28] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[29] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[30] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[31] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[32] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[33] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[4] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[7] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[8] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[9] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[10] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[19] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[20] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[21] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[22] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[23] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[24] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[25] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[26] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[27] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[17] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[11] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[16] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[12] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[13] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[14] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[15] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[43] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[34] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[44] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[45] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[38] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[39] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[40] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[18] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[41] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.facebook.internal.k$d */
    public static final class d implements m.a {
        public final /* synthetic */ a a;
        public final /* synthetic */ b b;

        public d(a aVar, b bVar) {
            this.a = aVar;
            this.b = bVar;
        }

        @Override // com.facebook.internal.m.a
        public final void a() {
            this.a.b(C0715k.b(this.b));
        }
    }

    @JvmStatic
    public static final void a(a callback, b feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m.d(new d(callback, feature));
    }

    @JvmStatic
    public static final boolean b(b feature) {
        b a2;
        boolean z;
        Intrinsics.checkNotNullParameter(feature, "feature");
        boolean z2 = false;
        if (b.Unknown != feature) {
            if (b.Core != feature) {
                SharedPreferences sharedPreferences = com.facebook.w.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0);
                feature.getClass();
                String string = sharedPreferences.getString("FBSDKFeature" + feature, null);
                if (string == null || !Intrinsics.areEqual(string, "18.3.0")) {
                    int i = feature.a;
                    if ((i & 255) > 0) {
                        b.Companion.getClass();
                        a2 = b.a.a(i & (-256));
                    } else if ((65280 & i) > 0) {
                        b.a aVar = b.Companion;
                        int i2 = i & SupportMenu.CATEGORY_MASK;
                        aVar.getClass();
                        a2 = b.a.a(i2);
                    } else if ((16711680 & i) > 0) {
                        b.a aVar2 = b.Companion;
                        int i3 = i & ViewCompat.MEASURED_STATE_MASK;
                        aVar2.getClass();
                        a2 = b.a.a(i3);
                    } else {
                        b.Companion.getClass();
                        a2 = b.a.a(0);
                    }
                    if (a2 == feature) {
                        switch (c.$EnumSwitchMapping$0[feature.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                                break;
                            default:
                                z2 = true;
                                break;
                        }
                        return m.b("FBSDKFeature" + feature, com.facebook.w.b(), z2);
                    }
                    if (b(a2)) {
                        switch (c.$EnumSwitchMapping$0[feature.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                                z = false;
                                break;
                            default:
                                z = true;
                                break;
                        }
                        if (m.b("FBSDKFeature" + feature, com.facebook.w.b(), z)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
