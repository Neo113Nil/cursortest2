package p115p6;

import F.AbstractC0210f;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.gms.internal.ads.zzbbd;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p031e1.k;
import p063i4.d;
import p098n4.C0934g;
import v4.h;
import v4.i;
import v4.j;
import v4.o;
import v4.r;
import v4.v;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static String a(Context context, String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && i(context, null, str)) {
            return str;
        }
        if (i7 >= 29) {
            if (i(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            return null;
        }
        if (i(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (i(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        return null;
    }

    public static int b(p121q5.c cVar, String str) {
        if (cVar == null) {
            return 0;
        }
        boolean z4 = cVar.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
        boolean zB = AbstractC0210f.b(cVar, str);
        if (z4) {
            zB = !zB;
        }
        if (!z4 && zB) {
            cVar.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
        }
        return (z4 && zB) ? 4 : 0;
    }

    public static String c() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String d() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ArrayList e(int i7, Context context) {
        String strA;
        String strA2;
        String strA3;
        ArrayList arrayList = new ArrayList();
        switch (i7) {
            case 0:
            case 37:
                if (i(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                if (i(context, arrayList, "android.permission.READ_CALENDAR")) {
                    arrayList.add("android.permission.READ_CALENDAR");
                }
                return arrayList;
            case 1:
                if (i(context, arrayList, "android.permission.CAMERA")) {
                    arrayList.add("android.permission.CAMERA");
                }
                return arrayList;
            case 2:
                if (i(context, arrayList, "android.permission.READ_CONTACTS")) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (i(context, arrayList, "android.permission.WRITE_CONTACTS")) {
                    arrayList.add("android.permission.WRITE_CONTACTS");
                }
                if (i(context, arrayList, "android.permission.GET_ACCOUNTS")) {
                    arrayList.add("android.permission.GET_ACCOUNTS");
                }
                return arrayList;
            case 3:
            case 4:
            case 5:
                if (i7 != 4 || Build.VERSION.SDK_INT < 29) {
                    if (i(context, arrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                    }
                    if (i(context, arrayList, "android.permission.ACCESS_FINE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                    }
                } else if (i(context, arrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
                return arrayList;
            case 6:
            case 11:
            case 20:
                return null;
            case 7:
            case 14:
                if (i(context, arrayList, "android.permission.RECORD_AUDIO")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                }
                return arrayList;
            case 8:
                if (i(context, arrayList, "android.permission.READ_PHONE_STATE")) {
                    arrayList.add("android.permission.READ_PHONE_STATE");
                }
                int i8 = Build.VERSION.SDK_INT;
                if (i8 > 29 && i(context, arrayList, "android.permission.READ_PHONE_NUMBERS")) {
                    arrayList.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (i(context, arrayList, "android.permission.CALL_PHONE")) {
                    arrayList.add("android.permission.CALL_PHONE");
                }
                if (i(context, arrayList, "android.permission.READ_CALL_LOG")) {
                    arrayList.add("android.permission.READ_CALL_LOG");
                }
                if (i(context, arrayList, "android.permission.WRITE_CALL_LOG")) {
                    arrayList.add("android.permission.WRITE_CALL_LOG");
                }
                if (i(context, arrayList, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (i(context, arrayList, "android.permission.USE_SIP")) {
                    arrayList.add("android.permission.USE_SIP");
                }
                if (i8 >= 26 && i(context, arrayList, "android.permission.ANSWER_PHONE_CALLS")) {
                    arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                }
                return arrayList;
            case 9:
                if (Build.VERSION.SDK_INT >= 33 && i(context, arrayList, "android.permission.READ_MEDIA_IMAGES")) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                return arrayList;
            case 10:
            case 25:
            case 26:
            default:
                return arrayList;
            case 12:
                if (i(context, arrayList, "android.permission.BODY_SENSORS")) {
                    arrayList.add("android.permission.BODY_SENSORS");
                }
                return arrayList;
            case 13:
                if (i(context, arrayList, "android.permission.SEND_SMS")) {
                    arrayList.add("android.permission.SEND_SMS");
                }
                if (i(context, arrayList, "android.permission.RECEIVE_SMS")) {
                    arrayList.add("android.permission.RECEIVE_SMS");
                }
                if (i(context, arrayList, "android.permission.READ_SMS")) {
                    arrayList.add("android.permission.READ_SMS");
                }
                if (i(context, arrayList, "android.permission.RECEIVE_WAP_PUSH")) {
                    arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                }
                if (i(context, arrayList, "android.permission.RECEIVE_MMS")) {
                    arrayList.add("android.permission.RECEIVE_MMS");
                }
                return arrayList;
            case 15:
                if (i(context, arrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
                int i9 = Build.VERSION.SDK_INT;
                if ((i9 < 29 || (i9 == 29 && Environment.isExternalStorageLegacy())) && i(context, arrayList, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
                return arrayList;
            case 16:
                if (i(context, arrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                    arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                }
                return arrayList;
            case 17:
                if (Build.VERSION.SDK_INT >= 33 && i(context, arrayList, "android.permission.POST_NOTIFICATIONS")) {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                }
                return arrayList;
            case 18:
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (i(context, arrayList, "android.permission.ACCESS_MEDIA_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                }
                return arrayList;
            case 19:
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (i(context, arrayList, "android.permission.ACTIVITY_RECOGNITION")) {
                    arrayList.add("android.permission.ACTIVITY_RECOGNITION");
                }
                return arrayList;
            case zzbbd.zzt.zzm /* 21 */:
                if (i(context, arrayList, "android.permission.BLUETOOTH")) {
                    arrayList.add("android.permission.BLUETOOTH");
                }
                return arrayList;
            case 22:
                if (Build.VERSION.SDK_INT >= 30 && i(context, arrayList, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                }
                return arrayList;
            case 23:
                if (i(context, arrayList, "android.permission.SYSTEM_ALERT_WINDOW")) {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
                return arrayList;
            case 24:
                if (i(context, arrayList, "android.permission.REQUEST_INSTALL_PACKAGES")) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                }
                return arrayList;
            case 27:
                if (i(context, arrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                }
                return arrayList;
            case 28:
                if (Build.VERSION.SDK_INT >= 31 && (strA = a(context, "android.permission.BLUETOOTH_SCAN")) != null) {
                    arrayList.add(strA);
                }
                return arrayList;
            case 29:
                if (Build.VERSION.SDK_INT >= 31 && (strA2 = a(context, "android.permission.BLUETOOTH_ADVERTISE")) != null) {
                    arrayList.add(strA2);
                }
                return arrayList;
            case 30:
                if (Build.VERSION.SDK_INT >= 31 && (strA3 = a(context, "android.permission.BLUETOOTH_CONNECT")) != null) {
                    arrayList.add(strA3);
                }
                return arrayList;
            case 31:
                if (Build.VERSION.SDK_INT >= 33 && i(context, arrayList, "android.permission.NEARBY_WIFI_DEVICES")) {
                    arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
                }
                return arrayList;
            case 32:
                if (Build.VERSION.SDK_INT >= 33 && i(context, arrayList, "android.permission.READ_MEDIA_VIDEO")) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                return arrayList;
            case 33:
                if (Build.VERSION.SDK_INT >= 33 && i(context, arrayList, "android.permission.READ_MEDIA_AUDIO")) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                }
                return arrayList;
            case 34:
                if (i(context, arrayList, "android.permission.SCHEDULE_EXACT_ALARM")) {
                    arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
                }
                return arrayList;
            case 35:
                if (Build.VERSION.SDK_INT >= 33 && i(context, arrayList, "android.permission.BODY_SENSORS_BACKGROUND")) {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                }
                return arrayList;
            case 36:
                if (i(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                return arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    public static String f(int i7, Context context) {
        if (i7 == -1) {
            return "UNKNOWN";
        }
        try {
            i7 = context.getResources().getResourceEntryName(i7);
            return i7;
        } catch (Exception unused) {
            return k.d(i7, "?");
        }
    }

    public static String g(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String h(int i7, MotionLayout motionLayout) {
        return i7 == -1 ? "UNDEFINED" : motionLayout.getContext().getResources().getResourceEntryName(i7);
    }

    public static boolean i(Context context, ArrayList arrayList, String str) {
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e7) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e7);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(context.getPackageName(), 4096);
        if (packageInfo == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(packageInfo.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(r rVar) {
        return rVar.e().isEmpty() && (rVar.isEmpty() || (rVar instanceof i) || (rVar instanceof v) || (rVar instanceof h));
    }

    public static r k(C0934g c0934g, Object obj) {
        String str;
        j jVar = j.f17190e;
        r rVarA = a.a(obj, jVar);
        if (rVarA instanceof o) {
            rVarA = new i(Double.valueOf(((o) rVarA).f17198c), jVar);
        }
        if (j(rVarA)) {
            return rVarA;
        }
        StringBuilder sb = new StringBuilder();
        if (c0934g != null) {
            str = "Path '" + c0934g + "'";
        } else {
            str = "Node";
        }
        throw new d(k.i(sb, str, " contains invalid priority: Must be a string, double, ServerValue, or null"));
    }

    public static Integer l(HashSet hashSet) {
        if (hashSet.contains(4)) {
            return 4;
        }
        if (hashSet.contains(2)) {
            return 2;
        }
        if (hashSet.contains(0)) {
            return 0;
        }
        return hashSet.contains(3) ? 3 : 1;
    }

    public static int m(p121q5.c cVar, String str, int i7) {
        if (i7 == -1) {
            return b(cVar, str);
        }
        return 1;
    }

    public static final void n(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        t6.h.e(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            t6.h.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        t6.h.b(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        t6.h.d(byteBufferAllocate, "allocate(...)");
        int i7 = 0;
        int i8 = 0;
        while (i7 < str.length()) {
            int iMin = Math.min(8192 - i8, str.length() - i7);
            int i9 = i7 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            t6.h.d(cArrArray, "array(...)");
            str.getChars(i7, i9, cArrArray, i8);
            charBufferAllocate.limit(iMin + i8);
            i8 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i9 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i8 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i7 = i9;
        }
    }
}
