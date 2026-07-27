package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.facebook.AuthenticationTokenClaims;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: com.inmobi.media.ni, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3940ni {

    /* renamed from: a, reason: collision with root package name */
    public static int f7268a = Integer.MIN_VALUE;
    public static Boolean b = null;
    public static String c = null;
    public static String d = null;
    public static String e = null;
    public static String f = null;
    public static String g = null;
    public static String h = null;
    public static int i = Integer.MIN_VALUE;
    public static String j;
    public static String k;
    public static String l;
    public static String m;
    public static Location n;

    public static void a(final boolean z) {
        b = Boolean.valueOf(z);
        final Context context = AbstractC3914mk.f7252a;
        if (context != null) {
            Runnable runnable = new Runnable() { // from class: com.inmobi.media.ni$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3940ni.a(context, z);
                }
            };
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            AbstractC3914mk.h.submit(runnable);
        }
    }

    public static Location b() {
        Location location = n;
        if (location != null) {
            return location;
        }
        Context context = AbstractC3914mk.f7252a;
        Location location2 = null;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Db.b;
        Db a2 = Cb.a(context, "user_info_store");
        Intrinsics.checkNotNullParameter(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, "key");
        String string = a2.f6510a.getString(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, null);
        if (string == null) {
            return null;
        }
        Location location3 = new Location("");
        try {
            String[] strArr = (String[]) new Regex(",").split(string, 0).toArray(new String[0]);
            location3.setLatitude(Double.parseDouble(strArr[0]));
            location3.setLongitude(Double.parseDouble(strArr[1]));
            location3.setAccuracy(Float.parseFloat(strArr[2]));
            location3.setTime(Long.parseLong(strArr[3]));
            location2 = location3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
        }
        n = location2;
        return location2;
    }

    public static final void a(Context context, boolean z) {
        ConcurrentHashMap concurrentHashMap = Db.b;
        Db.a(Cb.a(context, "user_info_store"), "user_age_restricted", z);
    }

    public static HashMap a() {
        String str;
        HashMap hashMap = new HashMap();
        int i2 = f7268a;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            Context context = AbstractC3914mk.f7252a;
            if (context == null) {
                i2 = Integer.MIN_VALUE;
            } else {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age", "key");
                i2 = a2.f6510a.getInt("user_age", Integer.MIN_VALUE);
            }
            f7268a = i2;
        }
        if (i2 > 0) {
            hashMap.put("u-age", String.valueOf(i2));
        }
        int i4 = i;
        if (i4 == Integer.MIN_VALUE) {
            Context context2 = AbstractC3914mk.f7252a;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Db.b;
                Db a3 = Cb.a(context2, "user_info_store");
                Intrinsics.checkNotNullParameter("user_yob", "key");
                i3 = a3.f6510a.getInt("user_yob", Integer.MIN_VALUE);
            }
            i = i3;
            i4 = i3;
        }
        if (i4 > 0) {
            hashMap.put("u-yearofbirth", String.valueOf(i4));
        }
        String str2 = f;
        String str3 = null;
        if (str2 == null) {
            Context context3 = AbstractC3914mk.f7252a;
            if (context3 == null) {
                str2 = null;
            } else {
                ConcurrentHashMap concurrentHashMap3 = Db.b;
                Db a4 = Cb.a(context3, "user_info_store");
                Intrinsics.checkNotNullParameter("user_city_code", "key");
                str2 = a4.f6510a.getString("user_city_code", null);
            }
            f = str2;
        }
        String str4 = g;
        if (str4 == null) {
            Context context4 = AbstractC3914mk.f7252a;
            if (context4 == null) {
                str4 = null;
            } else {
                ConcurrentHashMap concurrentHashMap4 = Db.b;
                Db a5 = Cb.a(context4, "user_info_store");
                Intrinsics.checkNotNullParameter("user_state_code", "key");
                str4 = a5.f6510a.getString("user_state_code", null);
            }
            g = str4;
        }
        String str5 = h;
        if (str5 == null) {
            Context context5 = AbstractC3914mk.f7252a;
            if (context5 == null) {
                str5 = null;
            } else {
                ConcurrentHashMap concurrentHashMap5 = Db.b;
                Db a6 = Cb.a(context5, "user_info_store");
                Intrinsics.checkNotNullParameter("user_country_code", "key");
                str5 = a6.f6510a.getString("user_country_code", null);
            }
            h = str5;
        }
        String a7 = a(str2, str4, str5);
        int length = a7.length() - 1;
        boolean z = false;
        int i5 = 0;
        boolean z2 = false;
        while (i5 <= length) {
            boolean z3 = Intrinsics.compare((int) a7.charAt(!z2 ? i5 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i5++;
            } else {
                z2 = true;
            }
        }
        if (a7.subSequence(i5, length + 1).toString().length() > 0) {
            hashMap.put("u-location", a7);
        }
        String str6 = c;
        if (str6 == null) {
            Context context6 = AbstractC3914mk.f7252a;
            if (context6 == null) {
                str6 = null;
            } else {
                ConcurrentHashMap concurrentHashMap6 = Db.b;
                Db a8 = Cb.a(context6, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_group", "key");
                str6 = a8.f6510a.getString("user_age_group", null);
            }
            c = str6;
        }
        if (str6 != null) {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String lowerCase = str6.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            hashMap.put("u-agegroup", lowerCase);
        }
        String str7 = d;
        if (str7 == null) {
            Context context7 = AbstractC3914mk.f7252a;
            if (context7 == null) {
                str7 = null;
            } else {
                ConcurrentHashMap concurrentHashMap7 = Db.b;
                Db a9 = Cb.a(context7, "user_info_store");
                Intrinsics.checkNotNullParameter("user_area_code", "key");
                str7 = a9.f6510a.getString("user_area_code", null);
            }
            d = str7;
        }
        if (str7 != null) {
            hashMap.put("u-areacode", str7);
        }
        String str8 = e;
        if (str8 == null) {
            Context context8 = AbstractC3914mk.f7252a;
            if (context8 == null) {
                str8 = null;
            } else {
                ConcurrentHashMap concurrentHashMap8 = Db.b;
                Db a10 = Cb.a(context8, "user_info_store");
                Intrinsics.checkNotNullParameter("user_post_code", "key");
                str8 = a10.f6510a.getString("user_post_code", null);
            }
            e = str8;
        }
        if (str8 != null) {
            hashMap.put("u-postalcode", str8);
        }
        String str9 = j;
        if (str9 == null) {
            Context context9 = AbstractC3914mk.f7252a;
            if (context9 == null) {
                str9 = null;
            } else {
                ConcurrentHashMap concurrentHashMap9 = Db.b;
                Db a11 = Cb.a(context9, "user_info_store");
                Intrinsics.checkNotNullParameter(AuthenticationTokenClaims.JSON_KEY_USER_GENDER, "key");
                str9 = a11.f6510a.getString(AuthenticationTokenClaims.JSON_KEY_USER_GENDER, null);
            }
            j = str9;
        }
        if (str9 != null) {
            hashMap.put("u-gender", str9);
        }
        String str10 = k;
        if (str10 == null) {
            Context context10 = AbstractC3914mk.f7252a;
            if (context10 == null) {
                str10 = null;
            } else {
                ConcurrentHashMap concurrentHashMap10 = Db.b;
                Db a12 = Cb.a(context10, "user_info_store");
                Intrinsics.checkNotNullParameter("user_education", "key");
                str10 = a12.f6510a.getString("user_education", null);
            }
            k = str10;
        }
        if (str10 != null) {
            hashMap.put("u-education", str10);
        }
        String str11 = l;
        if (str11 == null) {
            Context context11 = AbstractC3914mk.f7252a;
            if (context11 == null) {
                str11 = null;
            } else {
                ConcurrentHashMap concurrentHashMap11 = Db.b;
                Db a13 = Cb.a(context11, "user_info_store");
                Intrinsics.checkNotNullParameter("user_language", "key");
                str11 = a13.f6510a.getString("user_language", null);
            }
            l = str11;
        }
        if (str11 != null) {
            hashMap.put("u-language", str11);
        }
        String str12 = m;
        if (str12 == null) {
            Context context12 = AbstractC3914mk.f7252a;
            if (context12 != null) {
                ConcurrentHashMap concurrentHashMap12 = Db.b;
                Db a14 = Cb.a(context12, "user_info_store");
                Intrinsics.checkNotNullParameter("user_interest", "key");
                str3 = a14.f6510a.getString("user_interest", null);
            }
            m = str3;
            str12 = str3;
        }
        if (str12 != null) {
            hashMap.put("u-interests", str12);
        }
        Boolean bool = b;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            Context context13 = AbstractC3914mk.f7252a;
            if (context13 != null) {
                ConcurrentHashMap concurrentHashMap13 = Db.b;
                Db a15 = Cb.a(context13, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                b = Boolean.valueOf(a15.f6510a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = b;
            if (bool2 != null) {
                z = bool2.booleanValue();
            }
        }
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("u-age-restricted", str);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str, String str2, String str3) {
        String str4;
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() > 0) {
                int length2 = str.length() - 1;
                int i3 = 0;
                boolean z3 = false;
                while (i3 <= length2) {
                    boolean z4 = Intrinsics.compare((int) str.charAt(!z3 ? i3 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        }
                        length2--;
                    } else if (z4) {
                        i3++;
                    } else {
                        z3 = true;
                    }
                }
                str4 = str.subSequence(i3, length2 + 1).toString();
                if (str2 != null) {
                    int length3 = str2.length() - 1;
                    int i4 = 0;
                    boolean z5 = false;
                    while (i4 <= length3) {
                        boolean z6 = Intrinsics.compare((int) str2.charAt(!z5 ? i4 : length3), 32) <= 0;
                        if (z5) {
                            if (!z6) {
                                break;
                            }
                            length3--;
                        } else if (z6) {
                            i4++;
                        } else {
                            z5 = true;
                        }
                    }
                    if (str2.subSequence(i4, length3 + 1).toString().length() > 0) {
                        int length4 = str2.length() - 1;
                        int i5 = 0;
                        boolean z7 = false;
                        while (i5 <= length4) {
                            boolean z8 = Intrinsics.compare((int) str2.charAt(!z7 ? i5 : length4), 32) <= 0;
                            if (z7) {
                                if (!z8) {
                                    break;
                                }
                                length4--;
                            } else if (z8) {
                                i5++;
                            } else {
                                z7 = true;
                            }
                        }
                        str4 = str4 + "-" + str2.subSequence(i5, length4 + 1).toString();
                    }
                }
                if (str3 != null) {
                    return str4;
                }
                int length5 = str3.length() - 1;
                int i6 = 0;
                boolean z9 = false;
                while (i6 <= length5) {
                    boolean z10 = Intrinsics.compare((int) str3.charAt(!z9 ? i6 : length5), 32) <= 0;
                    if (z9) {
                        if (!z10) {
                            break;
                        }
                        length5--;
                    } else if (z10) {
                        i6++;
                    } else {
                        z9 = true;
                    }
                }
                if (str3.subSequence(i6, length5 + 1).toString().length() <= 0) {
                    return str4;
                }
                int length6 = str3.length() - 1;
                int i7 = 0;
                boolean z11 = false;
                while (i7 <= length6) {
                    boolean z12 = Intrinsics.compare((int) str3.charAt(!z11 ? i7 : length6), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            break;
                        }
                        length6--;
                    } else if (z12) {
                        i7++;
                    } else {
                        z11 = true;
                    }
                }
                return str4 + "-" + str3.subSequence(i7, length6 + 1).toString();
            }
        }
        str4 = "";
        if (str2 != null) {
        }
        if (str3 != null) {
        }
    }

    public static String a(Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy()) + "," + location.getTime();
    }
}
