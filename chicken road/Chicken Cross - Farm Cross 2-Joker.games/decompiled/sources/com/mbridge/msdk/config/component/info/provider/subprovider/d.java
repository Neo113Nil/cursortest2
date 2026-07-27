package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.ironsource.U3;
import com.ironsource.Y1;
import com.mbridge.msdk.foundation.tools.q0;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: OtherDeviceInfoProvider.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    static String f8980a = "OtherDeviceInfoProvider";

    public Map<String, Object> a() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long totalBytes = statFs.getTotalBytes();
            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            HashMap hashMap = new HashMap();
            hashMap.put("totalSpace", Long.valueOf(totalBytes));
            hashMap.put("freeExternalSize", Long.valueOf(availableBlocksLong));
            return hashMap;
        } catch (Throwable th) {
            q0.b(f8980a, th.getMessage(), th);
            return null;
        }
    }

    public float c(Context context) {
        if (context == null) {
            return -1.0f;
        }
        try {
            Resources resources = context.getResources();
            if (resources != null) {
                return resources.getConfiguration().fontScale;
            }
        } catch (Throwable th) {
            q0.b(f8980a, th.getMessage());
        }
        return -1.0f;
    }

    public int d(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
        } catch (Throwable th) {
            q0.b(f8980a, th.getMessage());
            return -1;
        }
    }

    public String b(Context context) {
        if (context == null) {
            return Y1.f;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
            String format = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format((audioManager != null ? audioManager.getStreamVolume(3) : -1) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1));
            return TextUtils.isEmpty(format) ? Y1.f : format;
        } catch (Throwable th) {
            q0.b(f8980a, th.getMessage());
            return Y1.f;
        }
    }

    public String b() {
        try {
            return TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
        } catch (Throwable th) {
            q0.b(f8980a, th.getMessage(), th);
            return "";
        }
    }

    public Map<String, Object> a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        HashMap hashMap = new HashMap();
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            int i = (intExtra == -1 || intExtra2 == -1) ? -1 : (intExtra * 100) / intExtra2;
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            hashMap.put(U3.j.Y, Integer.valueOf(i));
            hashMap.put("charging", Integer.valueOf(intExtra3 == 2 ? 1 : 2));
        }
        return hashMap;
    }
}
