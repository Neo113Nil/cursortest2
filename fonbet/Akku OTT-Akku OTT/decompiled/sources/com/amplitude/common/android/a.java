package com.amplitude.common.android;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.i;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class a {
    public static final b Companion = new b();
    public final Context a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Lazy e;

    /* renamed from: com.amplitude.common.android.a$a, reason: collision with other inner class name */
    public final class C0039a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final boolean j;
        public final String k;
        public final /* synthetic */ a l;

        /* JADX WARN: Can't wrap try/catch for region: R(30:0|1|(21:3|(3:5|(1:7)|8)(5:86|87|(1:89)(1:97)|(1:96)(1:93)|94)|9|10|11|12|13|14|15|(3:66|67|(3:71|(3:74|(2:76|77)(1:79)|72)|80))|17|(7:50|51|(3:55|(1:60)|59)|62|(1:57)|60|59)|21|22|23|(1:25)(1:41)|(1:27)|29|(3:34|35|36)|31|32)|101|9|10|11|12|13|14|15|(4:64|66|67|(4:69|71|(1:72)|80))|17|(1:19)|50|51|(14:53|55|(0)|60|59|21|22|23|(0)(0)|(0)|29|(0)|31|32)|62|(0)|60|59|21|22|23|(0)(0)|(0)|29|(0)|31|32) */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0207, code lost:
        
            com.amplitude.common.android.b.Companion.getClass();
            com.amplitude.common.android.b.b.d("Google Play Services Util not found!");
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x01e6, code lost:
        
            com.amplitude.common.android.b.Companion.getClass();
            com.amplitude.common.android.b.b.d("Google Play Services not available");
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0212, code lost:
        
            com.amplitude.common.android.b.Companion.getClass();
            com.amplitude.common.android.b.b.d("Google Play Services Util not found!");
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x01fc, code lost:
        
            com.amplitude.common.android.b.Companion.getClass();
            com.amplitude.common.android.b.b.d("Google Play Services not available");
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x01f1, code lost:
        
            com.amplitude.common.android.b.Companion.getClass();
            com.amplitude.common.android.b.b.d("Google Play Services not available");
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x01c3, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x01cd, code lost:
        
            com.amplitude.common.android.b.Companion.getClass();
            com.amplitude.common.android.b.b.d("Error when checking for Google Play Services: " + r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x010f, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x00fa, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x01c0 A[Catch: Exception -> 0x01c3, IllegalAccessException -> 0x01e6, InvocationTargetException -> 0x01f1, NoSuchMethodException -> 0x01fc, ClassNotFoundException -> 0x0207, NoClassDefFoundError -> 0x0212, TryCatch #8 {ClassNotFoundException -> 0x0207, IllegalAccessException -> 0x01e6, NoClassDefFoundError -> 0x0212, NoSuchMethodException -> 0x01fc, InvocationTargetException -> 0x01f1, Exception -> 0x01c3, blocks: (B:23:0x01a2, B:25:0x01c0, B:27:0x01c8), top: B:22:0x01a2 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x01c8 A[Catch: Exception -> 0x01c3, IllegalAccessException -> 0x01e6, InvocationTargetException -> 0x01f1, NoSuchMethodException -> 0x01fc, ClassNotFoundException -> 0x0207, NoClassDefFoundError -> 0x0212, TRY_LEAVE, TryCatch #8 {ClassNotFoundException -> 0x0207, IllegalAccessException -> 0x01e6, NoClassDefFoundError -> 0x0212, NoSuchMethodException -> 0x01fc, InvocationTargetException -> 0x01f1, Exception -> 0x01c3, blocks: (B:23:0x01a2, B:25:0x01c0, B:27:0x01c8), top: B:22:0x01a2 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0144 A[Catch: IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException | SecurityException -> 0x0118, TryCatch #5 {IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException | SecurityException -> 0x0118, blocks: (B:67:0x0120, B:69:0x0126, B:71:0x013a, B:72:0x013e, B:74:0x0144, B:77:0x014c), top: B:66:0x0120 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C0039a(a aVar) {
            String str;
            a aVar2;
            Location c;
            List<Address> fromLocation;
            String countryCode;
            String str2;
            TelephonyManager telephonyManager;
            String networkCountryIso;
            Integer num;
            Context context = aVar.a;
            this.l = aVar;
            this.j = true;
            String RELEASE = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
            this.d = RELEASE;
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            this.e = BRAND;
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            this.f = MANUFACTURER;
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            this.g = MODEL;
            String language = a().getLanguage();
            Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
            this.i = language;
            String str3 = null;
            if (aVar.c) {
                if (Intrinsics.areEqual("Amazon", MANUFACTURER)) {
                    ContentResolver contentResolver = context.getContentResolver();
                    this.j = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1;
                    str = Settings.Secure.getString(contentResolver, "advertising_id");
                } else {
                    try {
                        Object invoke = com.google.android.gms.ads.identifier.b.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                        Object invoke2 = invoke.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(invoke, null);
                        Boolean bool = invoke2 instanceof Boolean ? (Boolean) invoke2 : null;
                        if (bool == null || !bool.booleanValue()) {
                            r5 = false;
                        }
                        this.j = r5;
                        Object invoke3 = invoke.getClass().getMethod("getId", null).invoke(invoke, null);
                        Intrinsics.checkNotNull(invoke3, "null cannot be cast to non-null type kotlin.String");
                        str = (String) invoke3;
                    } catch (ClassNotFoundException unused) {
                        com.amplitude.common.android.b.Companion.getClass();
                        com.amplitude.common.android.b.b.d("Google Play Services SDK not found for advertising id!");
                    } catch (InvocationTargetException unused2) {
                        com.amplitude.common.android.b.Companion.getClass();
                        com.amplitude.common.android.b.b.d("Google Play Services not available for advertising id");
                    } catch (Exception unused3) {
                        com.amplitude.common.android.b.Companion.getClass();
                        com.amplitude.common.android.b.b.b("Encountered an error connecting to Google Play Services for advertising id");
                    }
                }
                this.a = str;
                Context context2 = this.l.a;
                PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
                String str4 = packageInfo.versionName;
                this.c = str4;
                Object systemService = this.l.a.getSystemService("phone");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String str5 = ((TelephonyManager) systemService).getNetworkOperatorName();
                this.h = str5;
                aVar2 = this.l;
                if (aVar2.b && (c = aVar2.c()) != null) {
                    try {
                        if (Geocoder.isPresent() && (fromLocation = a.a(aVar2).getFromLocation(c.getLatitude(), c.getLongitude(), 1)) != null) {
                            for (Address address : fromLocation) {
                                if (address != null) {
                                    countryCode = address.getCountryCode();
                                    break;
                                }
                            }
                        }
                    } catch (IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException | SecurityException unused4) {
                    }
                }
                countryCode = null;
                if (countryCode != null || countryCode.length() == 0) {
                    Object systemService2 = aVar2.a.getSystemService("phone");
                    Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    telephonyManager = (TelephonyManager) systemService2;
                    if (telephonyManager.getPhoneType() != 2 && (networkCountryIso = telephonyManager.getNetworkCountryIso()) != null) {
                        Locale US = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US, "US");
                        str2 = networkCountryIso.toUpperCase(US);
                        Intrinsics.checkNotNullExpressionValue(str2, "toUpperCase(...)");
                        if (str2 != null || str2.length() == 0) {
                            str2 = a().getCountry();
                            Intrinsics.checkNotNullExpressionValue(str2, "getCountry(...)");
                        }
                        countryCode = str2;
                    }
                    str2 = null;
                    if (str2 != null) {
                    }
                    str2 = a().getCountry();
                    Intrinsics.checkNotNullExpressionValue(str2, "getCountry(...)");
                    countryCode = str2;
                }
                this.b = countryCode;
                int i = i.e;
                Object invoke4 = i.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, this.l.a);
                num = invoke4 instanceof Integer ? (Integer) invoke4 : null;
                if (num != null) {
                    num.intValue();
                }
                if (this.l.d) {
                    try {
                        Object invoke5 = Class.forName("com.google.android.gms.appset.AppSet").getMethod("getClient", Context.class).invoke(null, this.l.a);
                        Object invoke6 = Tasks.class.getMethod("await", Task.class).invoke(null, invoke5.getClass().getMethod("getAppSetIdInfo", null).invoke(invoke5, null));
                        Object invoke7 = invoke6.getClass().getMethod("getId", null).invoke(invoke6, null);
                        Intrinsics.checkNotNull(invoke7, "null cannot be cast to non-null type kotlin.String");
                        str3 = (String) invoke7;
                    } catch (ClassNotFoundException unused5) {
                        com.amplitude.common.android.b.Companion.getClass();
                        com.amplitude.common.android.b.b.d("Google Play Services SDK not found for app set id!");
                    } catch (InvocationTargetException unused6) {
                        com.amplitude.common.android.b.Companion.getClass();
                        com.amplitude.common.android.b.b.d("Google Play Services not available for app set id");
                    } catch (Exception unused7) {
                        com.amplitude.common.android.b.Companion.getClass();
                        com.amplitude.common.android.b.b.b("Encountered an error connecting to Google Play Services for app set id");
                    }
                }
                this.k = str3;
            }
            str = null;
            this.a = str;
            Context context22 = this.l.a;
            PackageInfo packageInfo2 = context22.getPackageManager().getPackageInfo(context22.getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo2, "getPackageInfo(...)");
            String str42 = packageInfo2.versionName;
            this.c = str42;
            Object systemService3 = this.l.a.getSystemService("phone");
            Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String str52 = ((TelephonyManager) systemService3).getNetworkOperatorName();
            this.h = str52;
            aVar2 = this.l;
            if (aVar2.b) {
                if (Geocoder.isPresent()) {
                    while (r2.hasNext()) {
                    }
                }
            }
            countryCode = null;
            if (countryCode != null) {
            }
            Object systemService22 = aVar2.a.getSystemService("phone");
            Intrinsics.checkNotNull(systemService22, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            telephonyManager = (TelephonyManager) systemService22;
            if (telephonyManager.getPhoneType() != 2) {
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                str2 = networkCountryIso.toUpperCase(US2);
                Intrinsics.checkNotNullExpressionValue(str2, "toUpperCase(...)");
                if (str2 != null) {
                }
                str2 = a().getCountry();
                Intrinsics.checkNotNullExpressionValue(str2, "getCountry(...)");
                countryCode = str2;
                this.b = countryCode;
                int i2 = i.e;
                Object invoke42 = i.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, this.l.a);
                if (invoke42 instanceof Integer) {
                }
                if (num != null) {
                }
                if (this.l.d) {
                }
                this.k = str3;
            }
            str2 = null;
            if (str2 != null) {
            }
            str2 = a().getCountry();
            Intrinsics.checkNotNullExpressionValue(str2, "getCountry(...)");
            countryCode = str2;
            this.b = countryCode;
            int i22 = i.e;
            Object invoke422 = i.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, this.l.a);
            if (invoke422 instanceof Integer) {
            }
            if (num != null) {
            }
            if (this.l.d) {
            }
            this.k = str3;
        }

        public static Locale a() {
            LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
            Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
            Locale locale = locales.isEmpty() ? Locale.getDefault() : locales.get(0);
            Intrinsics.checkNotNull(locale);
            return locale;
        }
    }

    public static final class b {
    }

    public static final class c extends Lambda implements Function0<C0039a> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C0039a invoke() {
            return new C0039a(a.this);
        }
    }

    public a(Context context, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = LazyKt.lazy(new c());
    }

    public static final Geocoder a(a aVar) {
        return new Geocoder(aVar.a, Locale.ENGLISH);
    }

    public final C0039a b() {
        return (C0039a) this.e.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f A[SYNTHETIC] */
    @SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Location c() {
        List<String> list;
        Location location;
        Location location2 = null;
        if (!this.b) {
            return null;
        }
        Context context = this.a;
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") != 0 && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return null;
        }
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager == null) {
            return null;
        }
        try {
            list = locationManager.getProviders(true);
        } catch (SecurityException | Exception unused) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList<Location> arrayList = new ArrayList();
        for (String str : list) {
            try {
                Intrinsics.checkNotNull(str);
                location = locationManager.getLastKnownLocation(str);
            } catch (SecurityException unused2) {
                com.amplitude.common.android.b.Companion.getClass();
                com.amplitude.common.android.b.b.d("Failed to get most recent location");
                location = null;
                if (location != null) {
                }
            } catch (Exception unused3) {
                com.amplitude.common.android.b.Companion.getClass();
                com.amplitude.common.android.b.b.d("Failed to get most recent location");
                location = null;
                if (location != null) {
                }
            }
            if (location != null) {
                arrayList.add(location);
            }
        }
        long j = -1;
        for (Location location3 : arrayList) {
            if (location3.getTime() > j) {
                j = location3.getTime();
                location2 = location3;
            }
        }
        return location2;
    }
}
