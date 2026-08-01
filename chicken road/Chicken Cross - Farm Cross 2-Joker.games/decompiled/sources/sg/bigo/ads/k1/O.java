package sg.bigo.ads.k1;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.U3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f13021a = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};
    public static final HashSet b = new HashSet();

    public static boolean a(Context context, Intent intent) {
        try {
            return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(Context context, String str, C5266g c5266g) {
        HashSet hashSet = b;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        M m = new M(context, new J(context, c5266g));
        String[] strArr = {str};
        if (Looper.getMainLooper() == Looper.myLooper()) {
            m.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, strArr);
        } else {
            new Handler(Looper.getMainLooper()).post(new K(m, strArr));
        }
    }

    public static boolean a(Context context) {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            try {
                if (context.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) == 0) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static Date a(String str) {
        String[] strArr = f13021a;
        Date date = null;
        for (int i = 0; i < 2; i++) {
            try {
                date = new SimpleDateFormat(strArr[i], Locale.US).parse(str);
            } catch (ParseException unused) {
            }
            if (date != null) {
                break;
            }
        }
        return date;
    }

    public static HashMap a(HashMap hashMap) {
        String str;
        HashMap hashMap2 = new HashMap();
        if (!hashMap.containsKey("description") || !hashMap.containsKey("start")) {
            throw new IllegalArgumentException("Missing start and description fields");
        }
        hashMap2.put("title", hashMap.get("description"));
        if (!hashMap.containsKey("start") || hashMap.get("start") == null) {
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        Date a2 = a((String) hashMap.get("start"));
        if (a2 == null) {
            throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
        }
        hashMap2.put("beginTime", Long.valueOf(a2.getTime()));
        if (hashMap.containsKey("end") && hashMap.get("end") != null) {
            Date a3 = a((String) hashMap.get("end"));
            if (a3 == null) {
                throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            hashMap2.put(SDKConstants.PARAM_END_TIME, Long.valueOf(a3.getTime()));
        }
        if (hashMap.containsKey(FirebaseAnalytics.Param.LOCATION)) {
            hashMap2.put("eventLocation", hashMap.get(FirebaseAnalytics.Param.LOCATION));
        }
        if (hashMap.containsKey("summary")) {
            hashMap2.put("description", hashMap.get("summary"));
        }
        if (hashMap.containsKey("transparency")) {
            hashMap2.put("availability", Integer.valueOf(((String) hashMap.get("transparency")).equals(U3.i.T) ? 1 : 0));
        }
        StringBuilder sb = new StringBuilder();
        if (hashMap.containsKey("frequency")) {
            String str2 = (String) hashMap.get("frequency");
            int parseInt = hashMap.containsKey("interval") ? Integer.parseInt((String) hashMap.get("interval")) : -1;
            if ("daily".equals(str2)) {
                sb.append("FREQ=DAILY;");
                if (parseInt != -1) {
                    sb.append("INTERVAL=" + parseInt + ";");
                }
            } else {
                if ("weekly".equals(str2)) {
                    sb.append("FREQ=WEEKLY;");
                    if (parseInt != -1) {
                        sb.append("INTERVAL=" + parseInt + ";");
                    }
                    if (hashMap.containsKey("daysInWeek")) {
                        String str3 = (String) hashMap.get("daysInWeek");
                        StringBuilder sb2 = new StringBuilder();
                        boolean[] zArr = new boolean[7];
                        String[] split = str3.split(",");
                        for (String str4 : split) {
                            int parseInt2 = Integer.parseInt(str4);
                            if (parseInt2 == 7) {
                                parseInt2 = 0;
                            }
                            if (!zArr[parseInt2]) {
                                StringBuilder sb3 = new StringBuilder();
                                switch (parseInt2) {
                                    case 0:
                                        str = "SU";
                                        break;
                                    case 1:
                                        str = "MO";
                                        break;
                                    case 2:
                                        str = "TU";
                                        break;
                                    case 3:
                                        str = "WE";
                                        break;
                                    case 4:
                                        str = "TH";
                                        break;
                                    case 5:
                                        str = "FR";
                                        break;
                                    case 6:
                                        str = "SA";
                                        break;
                                    default:
                                        throw new IllegalArgumentException("invalid day of week " + parseInt2);
                                }
                                sb2.append(sb3.append(str).append(",").toString());
                                zArr[parseInt2] = true;
                            }
                        }
                        if (split.length == 0) {
                            throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
                        }
                        sb2.deleteCharAt(sb2.length() - 1);
                        String sb4 = sb2.toString();
                        if (sb4 == null) {
                            throw new IllegalArgumentException("invalid ");
                        }
                        sb.append("BYDAY=" + sb4 + ";");
                    }
                } else {
                    if (!"monthly".equals(str2)) {
                        throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                    }
                    sb.append("FREQ=MONTHLY;");
                    if (parseInt != -1) {
                        sb.append("INTERVAL=" + parseInt + ";");
                    }
                    if (hashMap.containsKey("daysInMonth")) {
                        String str5 = (String) hashMap.get("daysInMonth");
                        StringBuilder sb5 = new StringBuilder();
                        boolean[] zArr2 = new boolean[63];
                        String[] split2 = str5.split(",");
                        for (String str6 : split2) {
                            int parseInt3 = Integer.parseInt(str6);
                            int i = parseInt3 + 31;
                            if (!zArr2[i]) {
                                StringBuilder sb6 = new StringBuilder();
                                if (parseInt3 != 0 && parseInt3 >= -31 && parseInt3 <= 31) {
                                    sb5.append(sb6.append("" + parseInt3).append(",").toString());
                                    zArr2[i] = true;
                                } else {
                                    throw new IllegalArgumentException("invalid day of month " + parseInt3);
                                }
                            }
                        }
                        if (split2.length == 0) {
                            throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
                        }
                        sb5.deleteCharAt(sb5.length() - 1);
                        String sb7 = sb5.toString();
                        if (sb7 == null) {
                            throw new IllegalArgumentException();
                        }
                        sb.append("BYMONTHDAY=" + sb7 + ";");
                    }
                }
            }
        }
        hashMap2.put("rrule", sb.toString());
        return hashMap2;
    }
}
