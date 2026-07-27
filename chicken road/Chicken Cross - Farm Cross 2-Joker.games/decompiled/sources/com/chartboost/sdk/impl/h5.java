package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class h5 {
    public static final NetworkInfo a(Context context) {
        ConnectivityManager b;
        Object m8079constructorimpl;
        if (context == null || (b = b(context)) == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(b.getActiveNetworkInfo());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            mb.a("Cannot retrieve active network info", m8082exceptionOrNullimpl);
        }
        return (NetworkInfo) (Result.m8085isFailureimpl(m8079constructorimpl) ? null : m8079constructorimpl);
    }

    public static final ConnectivityManager b(Context context) {
        Object m8079constructorimpl;
        if (context == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            m8079constructorimpl = Result.m8079constructorimpl((ConnectivityManager) systemService);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            mb.a("Cannot retrieve connectivity manager", m8082exceptionOrNullimpl);
        }
        return (ConnectivityManager) (Result.m8085isFailureimpl(m8079constructorimpl) ? null : m8079constructorimpl);
    }

    public static final boolean c(Context context) {
        NetworkInfo a2 = a(context);
        return a2 != null && a2.isConnected() && a2.getType() == 0;
    }

    public static final boolean d(Context context) {
        NetworkInfo a2 = a(context);
        NetworkCapabilities a3 = a(context, null, 1, null);
        return a3 != null ? a3.hasCapability(12) : a2 != null && a2.isConnected();
    }

    public static final boolean e(Context context) {
        NetworkInfo a2 = a(context);
        return a2 != null && a2.isConnected() && a2.getType() == 1;
    }

    public static final int f(Context context) {
        NetworkInfo a2 = a(context);
        if (a2 == null || !a2.isConnected()) {
            return 0;
        }
        return a2.getSubtype();
    }

    public static final rd g(Context context) {
        NetworkInfo a2 = a(context);
        if (a2 != null) {
            rd a3 = a2.isConnected() ? a(a2.getType(), a2.getSubtype()) : rd.d;
            if (a3 != null) {
                return a3;
            }
        }
        return rd.d;
    }

    public static /* synthetic */ NetworkCapabilities a(Context context, Network network, int i, Object obj) {
        if ((i & 1) != 0) {
            network = null;
        }
        return a(context, network);
    }

    public static final NetworkCapabilities a(Context context, Network network) {
        ConnectivityManager b;
        Object m8079constructorimpl;
        if (context == null || (b = b(context)) == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            if (network == null) {
                network = b.getActiveNetwork();
            }
            m8079constructorimpl = Result.m8079constructorimpl(b.getNetworkCapabilities(network));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            mb.a("Cannot retrieve network capabilities", m8082exceptionOrNullimpl);
        }
        return (NetworkCapabilities) (Result.m8085isFailureimpl(m8079constructorimpl) ? null : m8079constructorimpl);
    }

    public static final rd a(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                return rd.d;
            }
            return rd.f;
        }
        if (i2 != 20) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return rd.h;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return rd.i;
                case 13:
                    return rd.j;
                default:
                    return rd.g;
            }
        }
        return rd.k;
    }
}
