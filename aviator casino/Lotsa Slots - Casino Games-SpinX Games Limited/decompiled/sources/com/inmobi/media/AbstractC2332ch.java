package com.inmobi.media;

/* renamed from: com.inmobi.media.ch, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2332ch {

    /* renamed from: a, reason: collision with root package name */
    public static int f5142a = Integer.MIN_VALUE;
    public static java.lang.Boolean b = null;
    public static java.lang.String c = null;
    public static java.lang.String d = null;
    public static java.lang.String e = null;
    public static java.lang.String f = null;
    public static java.lang.String g = null;
    public static java.lang.String h = null;
    public static int i = Integer.MIN_VALUE;
    public static java.lang.String j;
    public static java.lang.String k;
    public static java.lang.String l;
    public static java.lang.String m;
    public static android.location.Location n;

    public static void a(final boolean z) {
        b = java.lang.Boolean.valueOf(z);
        final android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.ch$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.AbstractC2332ch.a(context, z);
                }
            };
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
            com.inmobi.media.Xi.g.submit(runnable);
        }
    }

    public static android.location.Location b() {
        android.location.Location location = n;
        if (location != null) {
            return location;
        }
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        android.location.Location location2 = null;
        if (context == null) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "user_info_store");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, com.ironsource.X3.i.W);
        java.lang.String string = a2.f4815a.getString(com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, null);
        if (string == null) {
            return null;
        }
        android.location.Location location3 = new android.location.Location("");
        try {
            java.lang.String[] strArr = (java.lang.String[]) new kotlin.text.Regex(",").split(string, 0).toArray(new java.lang.String[0]);
            location3.setLatitude(java.lang.Double.parseDouble(strArr[0]));
            location3.setLongitude(java.lang.Double.parseDouble(strArr[1]));
            location3.setAccuracy(java.lang.Float.parseFloat(strArr[2]));
            location3.setTime(java.lang.Long.parseLong(strArr[3]));
            location2 = location3;
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.NumberFormatException unused) {
        }
        n = location2;
        return location2;
    }

    public static final void a(android.content.Context context, boolean z) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        com.inmobi.media.La.a(com.inmobi.media.Ka.a(context, "user_info_store"), "user_age_restricted", z);
    }

    public static java.util.HashMap a() {
        boolean booleanValue;
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i2 = f5142a;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context == null) {
                i2 = Integer.MIN_VALUE;
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_age", com.ironsource.X3.i.W);
                i2 = a2.f4815a.getInt("user_age", Integer.MIN_VALUE);
            }
            f5142a = i2;
        }
        if (i2 > 0) {
            hashMap.put("u-age", java.lang.String.valueOf(i2));
        }
        int i4 = i;
        if (i4 == Integer.MIN_VALUE) {
            android.content.Context context2 = com.inmobi.media.Xi.f5051a;
            if (context2 != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = com.inmobi.media.La.b;
                com.inmobi.media.La a3 = com.inmobi.media.Ka.a(context2, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_yob", com.ironsource.X3.i.W);
                i3 = a3.f4815a.getInt("user_yob", Integer.MIN_VALUE);
            }
            i = i3;
            i4 = i3;
        }
        if (i4 > 0) {
            hashMap.put("u-yearofbirth", java.lang.String.valueOf(i4));
        }
        java.lang.String str2 = f;
        java.lang.String str3 = null;
        if (str2 == null) {
            android.content.Context context3 = com.inmobi.media.Xi.f5051a;
            if (context3 == null) {
                str2 = null;
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = com.inmobi.media.La.b;
                com.inmobi.media.La a4 = com.inmobi.media.Ka.a(context3, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_city_code", com.ironsource.X3.i.W);
                str2 = a4.f4815a.getString("user_city_code", null);
            }
            f = str2;
        }
        java.lang.String str4 = g;
        if (str4 == null) {
            android.content.Context context4 = com.inmobi.media.Xi.f5051a;
            if (context4 == null) {
                str4 = null;
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap4 = com.inmobi.media.La.b;
                com.inmobi.media.La a5 = com.inmobi.media.Ka.a(context4, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_state_code", com.ironsource.X3.i.W);
                str4 = a5.f4815a.getString("user_state_code", null);
            }
            g = str4;
        }
        java.lang.String str5 = h;
        if (str5 == null) {
            android.content.Context context5 = com.inmobi.media.Xi.f5051a;
            if (context5 == null) {
                str5 = null;
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap5 = com.inmobi.media.La.b;
                com.inmobi.media.La a6 = com.inmobi.media.Ka.a(context5, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_country_code", com.ironsource.X3.i.W);
                str5 = a6.f4815a.getString("user_country_code", null);
            }
            h = str5;
        }
        java.lang.String a7 = a(str2, str4, str5);
        int length = a7.length() - 1;
        int i5 = 0;
        boolean z = false;
        while (i5 <= length) {
            boolean z2 = kotlin.jvm.internal.Intrinsics.compare((int) a7.charAt(!z ? i5 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i5++;
            } else {
                z = true;
            }
        }
        if (a7.subSequence(i5, length + 1).toString().length() > 0) {
            hashMap.put("u-location", a7);
        }
        java.lang.String str6 = c;
        if (str6 == null) {
            android.content.Context context6 = com.inmobi.media.Xi.f5051a;
            if (context6 == null) {
                str6 = null;
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap6 = com.inmobi.media.La.b;
                com.inmobi.media.La a8 = com.inmobi.media.Ka.a(context6, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_age_group", com.ironsource.X3.i.W);
                str6 = a8.f4815a.getString("user_age_group", null);
            }
            c = str6;
        }
        if (str6 != null) {
            java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            java.lang.String lowerCase = str6.toLowerCase(ENGLISH);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            hashMap.put("u-agegroup", lowerCase);
        }
        java.lang.String str7 = d;
        if (str7 == null) {
            android.content.Context context7 = com.inmobi.media.Xi.f5051a;
            if (context7 == null) {
                str7 = null;
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap7 = com.inmobi.media.La.b;
                com.inmobi.media.La a9 = com.inmobi.media.Ka.a(context7, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_area_code", com.ironsource.X3.i.W);
                str7 = a9.f4815a.getString("user_area_code", null);
            }
            d = str7;
        }
        if (str7 != null) {
            hashMap.put("u-areacode", str7);
        }
        java.lang.String str8 = e;
        if (str8 == null) {
            android.content.Context context8 = com.inmobi.media.Xi.f5051a;
            if (context8 == null) {
                str8 = null;
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap8 = com.inmobi.media.La.b;
                com.inmobi.media.La a10 = com.inmobi.media.Ka.a(context8, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_post_code", com.ironsource.X3.i.W);
                str8 = a10.f4815a.getString("user_post_code", null);
            }
            e = str8;
        }
        if (str8 != null) {
            hashMap.put("u-postalcode", str8);
        }
        java.lang.String str9 = j;
        if (str9 == null) {
            android.content.Context context9 = com.inmobi.media.Xi.f5051a;
            if (context9 == null) {
                str9 = null;
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap9 = com.inmobi.media.La.b;
                com.inmobi.media.La a11 = com.inmobi.media.Ka.a(context9, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_GENDER, com.ironsource.X3.i.W);
                str9 = a11.f4815a.getString(com.facebook.AuthenticationTokenClaims.JSON_KEY_USER_GENDER, null);
            }
            j = str9;
        }
        if (str9 != null) {
            hashMap.put("u-gender", str9);
        }
        java.lang.String str10 = k;
        if (str10 == null) {
            android.content.Context context10 = com.inmobi.media.Xi.f5051a;
            if (context10 == null) {
                str10 = null;
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap10 = com.inmobi.media.La.b;
                com.inmobi.media.La a12 = com.inmobi.media.Ka.a(context10, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_education", com.ironsource.X3.i.W);
                str10 = a12.f4815a.getString("user_education", null);
            }
            k = str10;
        }
        if (str10 != null) {
            hashMap.put("u-education", str10);
        }
        java.lang.String str11 = l;
        if (str11 == null) {
            android.content.Context context11 = com.inmobi.media.Xi.f5051a;
            if (context11 == null) {
                str11 = null;
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap11 = com.inmobi.media.La.b;
                com.inmobi.media.La a13 = com.inmobi.media.Ka.a(context11, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_language", com.ironsource.X3.i.W);
                str11 = a13.f4815a.getString("user_language", null);
            }
            l = str11;
        }
        if (str11 != null) {
            hashMap.put("u-language", str11);
        }
        java.lang.String str12 = m;
        if (str12 == null) {
            android.content.Context context12 = com.inmobi.media.Xi.f5051a;
            if (context12 != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap12 = com.inmobi.media.La.b;
                com.inmobi.media.La a14 = com.inmobi.media.Ka.a(context12, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_interest", com.ironsource.X3.i.W);
                str3 = a14.f4815a.getString("user_interest", null);
            }
            m = str3;
            str12 = str3;
        }
        if (str12 != null) {
            hashMap.put("u-interests", str12);
        }
        java.lang.Boolean bool = b;
        if (bool == null) {
            android.content.Context context13 = com.inmobi.media.Xi.f5051a;
            if (context13 != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap13 = com.inmobi.media.La.b;
                com.inmobi.media.La a15 = com.inmobi.media.Ka.a(context13, "user_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_age_restricted", com.ironsource.X3.i.W);
                b = java.lang.Boolean.valueOf(a15.f4815a.getBoolean("user_age_restricted", false));
            }
            java.lang.Boolean bool2 = b;
            if (bool2 != null) {
                booleanValue = bool2.booleanValue();
            }
            str = "0";
            hashMap.put("u-age-restricted", str);
            return hashMap;
        }
        booleanValue = bool.booleanValue();
        if (booleanValue) {
            str = "1";
            hashMap.put("u-age-restricted", str);
            return hashMap;
        }
        str = "0";
        hashMap.put("u-age-restricted", str);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = kotlin.jvm.internal.Intrinsics.compare((int) str.charAt(!z ? i2 : length), 32) <= 0;
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
                    boolean z4 = kotlin.jvm.internal.Intrinsics.compare((int) str.charAt(!z3 ? i3 : length2), 32) <= 0;
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
                        boolean z6 = kotlin.jvm.internal.Intrinsics.compare((int) str2.charAt(!z5 ? i4 : length3), 32) <= 0;
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
                            boolean z8 = kotlin.jvm.internal.Intrinsics.compare((int) str2.charAt(!z7 ? i5 : length4), 32) <= 0;
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
                    boolean z10 = kotlin.jvm.internal.Intrinsics.compare((int) str3.charAt(!z9 ? i6 : length5), 32) <= 0;
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
                    boolean z12 = kotlin.jvm.internal.Intrinsics.compare((int) str3.charAt(!z11 ? i7 : length6), 32) <= 0;
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

    public static java.lang.String a(android.location.Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy()) + "," + location.getTime();
    }
}
