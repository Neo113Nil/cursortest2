package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebResourceResponse;
import android.widget.RelativeLayout;
import com.google.common.net.HttpHeaders;
import com.ironsource.U3;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import okio.Buffer;
import okio.BufferedSource;

/* renamed from: com.inmobi.media.g4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3727g4 {
    public static final boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static final int b(float f) {
        try {
            return MathKt.roundToInt(f);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int c(float f) {
        try {
            return (int) (f / AbstractC3841k6.b());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final WebResourceResponse a(InputStream inputStream, String mimeType) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Map mapOf = MapsKt.mapOf(TuplesKt.to(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*"));
        Y5.f6965a.getClass();
        return Y5.x() ? new WebResourceResponse(mimeType, "UTF-8", 200, "OK", mapOf, inputStream) : new WebResourceResponse(mimeType, "UTF-8", inputStream);
    }

    public static final int a(int i) {
        try {
            return (int) (i / AbstractC3841k6.b());
        } catch (Exception unused) {
            return i;
        }
    }

    public static final float a(float f) {
        return b(f * 10.0f) / 10.0f;
    }

    public static final String a(BufferedSource bufferedSource, int i) {
        Intrinsics.checkNotNullParameter("\"main\"", "startMarker");
        Intrinsics.checkNotNullParameter("ZygoteInit.java", "endMarker");
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            if (bufferedSource != null) {
                int i2 = i;
                boolean z = false;
                do {
                    try {
                        String readUtf8Line = bufferedSource.readUtf8Line();
                        if (readUtf8Line == null) {
                            break;
                        }
                        if (i > 0 && !z) {
                            sb2.append(readUtf8Line).append("\n");
                            i--;
                        }
                        if (StringsKt.startsWith$default(readUtf8Line, "\"main\"", false, 2, (Object) null)) {
                            StringsKt.clear(sb2);
                            z = true;
                        }
                        if (z) {
                            i2--;
                            sb.append(readUtf8Line).append("\n");
                        }
                        if (StringsKt.contains$default((CharSequence) readUtf8Line, (CharSequence) "ZygoteInit.java", false, 2, (Object) null)) {
                            break;
                        }
                    } catch (IOException e) {
                        Log.e("CommonExt", "Error reading from input stream", e);
                    }
                } while (i2 > 0);
            }
            if (sb.length() == 0) {
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                if (bufferedSource != null) {
                    try {
                        bufferedSource.close();
                    } catch (IOException unused) {
                    }
                }
                return sb3;
            }
            String sb4 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
            if (bufferedSource != null) {
                Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
                try {
                    bufferedSource.close();
                } catch (IOException unused2) {
                }
            }
            return sb4;
        } finally {
            if (bufferedSource != null) {
                Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
                try {
                    bufferedSource.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(Context context) {
        int i;
        ApplicationInfo applicationInfo;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Y5.f6965a.getClass();
        if (Build.VERSION.SDK_INT < 35) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
            applicationInfo = packageInfo.applicationInfo;
        } catch (Exception unused) {
        }
        if (applicationInfo != null) {
            i = applicationInfo.targetSdkVersion;
            return i < 35;
        }
        i = -1;
        if (i < 35) {
        }
    }

    public static final void a(Kq kq, RelativeLayout.LayoutParams layoutParams, Hg orientation) {
        Intrinsics.checkNotNullParameter(kq, "<this>");
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        kq.getClass();
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Jq jq = (Jq) kq.f6682a.get(orientation);
        int i = jq != null ? jq.f6658a : 0;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Jq jq2 = (Jq) kq.f6682a.get(orientation);
        int i2 = jq2 != null ? jq2.c : 0;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Jq jq3 = (Jq) kq.f6682a.get(orientation);
        layoutParams.setMargins(i, 0, i2, jq3 != null ? jq3.d : 0);
    }

    public static final String a(HashMap hashMap) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String obj = StringsKt.trim((CharSequence) entry.getValue()).toString();
            if (obj.length() != 0) {
                if (sb.length() > 0) {
                    sb.append(U3.j.c);
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                try {
                    str = URLEncoder.encode(str3, "UTF-8");
                    Intrinsics.checkNotNullExpressionValue(str, "encode(...)");
                } catch (UnsupportedEncodingException unused) {
                    str = "";
                }
                try {
                    str2 = URLEncoder.encode(obj, "UTF-8");
                    Intrinsics.checkNotNullExpressionValue(str2, "encode(...)");
                } catch (UnsupportedEncodingException unused2) {
                    str2 = "";
                }
                String format = String.format(locale, "%s=%s", Arrays.copyOf(new Object[]{str, str2}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                sb.append(format);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final String a(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        String encodeToString = Base64.encodeToString(buffer.readByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public static final void a(CoroutineScope coroutineScope) {
        if (coroutineScope == null || coroutineScope.getCoroutineContext().get(Job.INSTANCE) == null) {
            return;
        }
        try {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        } catch (Exception unused) {
        }
    }

    public static final Job a(CoroutineScope coroutineScope, long j, long j2, Function1 action) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C3615c4(j, action, j2, null), 3, null);
        return launch$default;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        r5 = com.inmobi.media.Ba.f6473a;
        com.inmobi.media.Ba.a(new com.inmobi.media.C3810j3(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Oi oi, Function1 function1, Continuation continuation) {
        C3670e4 c3670e4;
        int i;
        if (continuation instanceof C3670e4) {
            c3670e4 = (C3670e4) continuation;
            int i2 = c3670e4.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3670e4.b = i2 - Integer.MIN_VALUE;
                Object obj = c3670e4.f7079a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3670e4.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C3699f4 c3699f4 = new C3699f4(function1, null);
                    c3670e4.b = 1;
                    if (oi.a(c3699f4, c3670e4) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        c3670e4 = new C3670e4(continuation);
        Object obj2 = c3670e4.f7079a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3670e4.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public static final Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter filter) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        try {
            Y5.f6965a.getClass();
            if (Build.VERSION.SDK_INT >= 33) {
                return context.registerReceiver(broadcastReceiver, filter, 2);
            }
            return context.registerReceiver(broadcastReceiver, filter);
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            U9.a(e);
            return null;
        }
    }
}
