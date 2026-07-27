package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.יּ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC1145 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final ScheduledExecutorService f3286;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final Handler f3287;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Handler f3288 = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    static {
        Handler handler;
        HandlerThread handlerThread;
        int i = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            try {
                handlerThread = new HandlerThread(StringFog.decrypt("KsuD/f7+8/Uf7Q==\n", "fonBuqqWgZA=\n"));
            } catch (Throwable unused) {
                handlerThread = null;
            }
            try {
                handlerThread.start();
                handler = new Handler(handlerThread.getLooper());
                break;
            } catch (Throwable unused2) {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                    } catch (Throwable unused3) {
                        AbstractC0544.m5513(StringFog.decrypt("8ihowUsj3YbKH33/\n", "s0w5tCpPtPI=\n"), StringFog.decrypt("PWlFUKkp5P0UKE9OqSyw7FtqTV+nKrbmDmZIHKQsqu0XbV4=\n", "ewgsPMxNxIk=\n"), true);
                        handler = null;
                        f3287 = handler;
                        f3286 = handler == null ? Executors.newSingleThreadScheduledExecutor() : null;
                    }
                }
                AbstractC0544.m5513(StringFog.decrypt("I/U9C9UyQxMbwig1\n", "YpFsfrReKmc=\n"), StringFog.decrypt("H+Di8L2dzRo2oejuvZiZC3nj6v+znp8BLO/vvLCYgwo15Pmw+IuIGiv44vK/18NA\n", "WYGLnNj57W4=\n"), true);
                i++;
            }
            i++;
        }
        f3287 = handler;
        f3286 = handler == null ? Executors.newSingleThreadScheduledExecutor() : null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m5891(AbstractRunnableC0730 abstractRunnableC0730) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            abstractRunnableC0730.run();
        } else {
            m5893(abstractRunnableC0730);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m5892(AbstractRunnableC0730 abstractRunnableC0730) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m5895(abstractRunnableC0730);
        } else {
            abstractRunnableC0730.run();
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5894(AbstractRunnableC0730 abstractRunnableC0730, long j) {
        try {
            f3288.postDelayed(abstractRunnableC0730, j);
        } catch (Throwable unused) {
            AbstractC0544.m5513(StringFog.decrypt("YuFuXTRQOtFa1ntj\n", "I4U/KFU8U6U=\n"), StringFog.decrypt("FrKh1ASOm4Q/87jXEp6blDW/qcEEjpufPvOl2QiEm4Q4oa3ZBQ==\n", "UNPIuGHqu/A=\n"), false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5896(AbstractRunnableC0730 abstractRunnableC0730, long j) {
        try {
            Handler handler = f3287;
            if (handler != null) {
                handler.postDelayed(abstractRunnableC0730, j);
            } else {
                ScheduledExecutorService scheduledExecutorService = f3286;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.schedule(abstractRunnableC0730, j, TimeUnit.MILLISECONDS);
                } else {
                    AbstractC0544.m5513(StringFog.decrypt("ZJS3IWi5fQFco6If\n", "JfDmVAnVFHU=\n"), StringFog.decrypt("yidrY0aucN32Jz5vQ+1z2+osJ2RV7XTIpC4qbUuvetnvaC55Qq5uzus6a2BRrHLW5SonZA==\n", "hEhLASfNG7o=\n"), false);
                }
            }
        } catch (Throwable unused) {
            AbstractC0544.m5513(StringFog.decrypt("nO+PtZRiQg2k2JqL\n", "3YvewPUOK3k=\n"), StringFog.decrypt("1M6Jqfj+Alb9j5Cq7u4CRvfDgbz4/gJN/I+CpP7xRVD92o6hvfJDTPbDhbc=\n", "kq/gxZ2aIiI=\n"), false);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5893(AbstractRunnableC0730 abstractRunnableC0730) {
        try {
            f3288.post(abstractRunnableC0730);
        } catch (Throwable unused) {
            AbstractC0544.m5513(StringFog.decrypt("zyE2zDAF35j3FiPy\n", "jkVnuVFptuw=\n"), StringFog.decrypt("Awjv8q4L5S8qSfbxuBvlNCtJ6/+iAeUvLRvj/68=\n", "RWmGnstvxVs=\n"), false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5895(AbstractRunnableC0730 abstractRunnableC0730) {
        try {
            Handler handler = f3287;
            if (handler != null) {
                handler.post(abstractRunnableC0730);
            } else {
                ScheduledExecutorService scheduledExecutorService = f3286;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.execute(abstractRunnableC0730);
                } else {
                    AbstractC0544.m5513(StringFog.decrypt("eb6mTNwrE5tBibNy\n", "ONr3Ob1Heu8=\n"), StringFog.decrypt("9oJb8lZE8+HKgg7+Uwfw59aJF/VFB/f0mIsa/FtF+eXTzR7oUkTt8tefW/FBRvHq2Y8X9Q==\n", "uO17kDcnmIY=\n"), false);
                }
            }
        } catch (Throwable unused) {
            AbstractC0544.m5513(StringFog.decrypt("ynNu6j5ALUHyRHvU\n", "ixc/n18sRDU=\n"), StringFog.decrypt("JmqBcHMuVM0PK5hzZT5U1g4rin11IRPLD36GeDYiFdcEZ41u\n", "YAvoHBZKdLk=\n"), false);
        }
    }
}
