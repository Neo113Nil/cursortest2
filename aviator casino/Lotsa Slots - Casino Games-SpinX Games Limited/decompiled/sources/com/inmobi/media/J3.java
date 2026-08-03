package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class J3 {
    public static final boolean a(java.lang.String str) {
        return str != null && str.length() > 0;
    }

    public static final int b(float f) {
        try {
            return kotlin.math.MathKt.roundToInt(f);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public static final int c(float f) {
        try {
            return (int) (f / com.inmobi.media.N5.b());
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public static final android.webkit.WebResourceResponse a(java.io.InputStream inputStream, java.lang.String mimeType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.common.net.HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*"));
        com.inmobi.media.B5.f4614a.getClass();
        return com.inmobi.media.B5.x() ? new android.webkit.WebResourceResponse(mimeType, "UTF-8", 200, "OK", mapOf, inputStream) : new android.webkit.WebResourceResponse(mimeType, "UTF-8", inputStream);
    }

    public static final int a(int i) {
        try {
            return (int) (i / com.inmobi.media.N5.b());
        } catch (java.lang.Exception unused) {
            return i;
        }
    }

    public static final float a(float f) {
        return b(f * 10.0f) / 10.0f;
    }

    public static final java.lang.String a(okio.BufferedSource bufferedSource, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("\"main\"", "startMarker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ZygoteInit.java", "endMarker");
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            if (bufferedSource != null) {
                int i2 = i;
                boolean z = false;
                do {
                    try {
                        java.lang.String readUtf8Line = bufferedSource.readUtf8Line();
                        if (readUtf8Line == null) {
                            break;
                        }
                        if (i > 0 && !z) {
                            sb2.append(readUtf8Line);
                            sb2.append("\n");
                            i--;
                        }
                        if (kotlin.text.StringsKt.startsWith$default(readUtf8Line, "\"main\"", false, 2, (java.lang.Object) null)) {
                            kotlin.text.StringsKt.clear(sb2);
                            z = true;
                        }
                        if (z) {
                            i2--;
                            sb.append(readUtf8Line);
                            sb.append("\n");
                        }
                        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) readUtf8Line, (java.lang.CharSequence) "ZygoteInit.java", false, 2, (java.lang.Object) null)) {
                            break;
                        }
                    } catch (java.io.IOException e) {
                        android.util.Log.e("CommonExt", "Error reading from input stream", e);
                    }
                } while (i2 > 0);
            }
            if (sb.length() == 0) {
                java.lang.String sb3 = sb2.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                if (bufferedSource != null) {
                    try {
                        bufferedSource.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                return sb3;
            }
            java.lang.String sb4 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
            if (bufferedSource != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
                try {
                    bufferedSource.close();
                } catch (java.io.IOException unused2) {
                }
            }
            return sb4;
        } finally {
            if (bufferedSource != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
                try {
                    bufferedSource.close();
                } catch (java.io.IOException unused3) {
                }
            }
        }
    }

    public static final boolean a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        com.inmobi.media.B5.f4614a.getClass();
        if (android.os.Build.VERSION.SDK_INT < 35) {
            return false;
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(0L));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
            android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                return applicationInfo.targetSdkVersion >= 35;
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static final void a(com.inmobi.media.No no, android.widget.RelativeLayout.LayoutParams layoutParams, com.inmobi.media.Lf orientation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(no, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        no.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        com.inmobi.media.Mo mo = (com.inmobi.media.Mo) no.f4863a.get(orientation);
        int i = mo != null ? mo.f4843a : 0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        com.inmobi.media.Mo mo2 = (com.inmobi.media.Mo) no.f4863a.get(orientation);
        int i2 = mo2 != null ? mo2.c : 0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientation, "orientation");
        com.inmobi.media.Mo mo3 = (com.inmobi.media.Mo) no.f4863a.get(orientation);
        layoutParams.setMargins(i, 0, i2, mo3 != null ? mo3.d : 0);
    }

    public static final java.lang.String a(java.util.HashMap hashMap) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashMap, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str3 = (java.lang.String) entry.getKey();
            java.lang.String obj = kotlin.text.StringsKt.trim((java.lang.CharSequence) entry.getValue()).toString();
            if (obj.length() != 0) {
                if (sb.length() > 0) {
                    sb.append(com.ironsource.X3.j.c);
                }
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.util.Locale locale = java.util.Locale.US;
                try {
                    str = java.net.URLEncoder.encode(str3, "UTF-8");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "encode(...)");
                } catch (java.io.UnsupportedEncodingException unused) {
                    str = "";
                }
                try {
                    str2 = java.net.URLEncoder.encode(obj, "UTF-8");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "encode(...)");
                } catch (java.io.UnsupportedEncodingException unused2) {
                    str2 = "";
                }
                java.lang.String format = java.lang.String.format(locale, "%s=%s", java.util.Arrays.copyOf(new java.lang.Object[]{str, str2}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                sb.append(format);
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final java.lang.String a(okio.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "<this>");
        java.lang.String encodeToString = android.util.Base64.encodeToString(buffer.readByteArray(), 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public static final void a(kotlinx.coroutines.CoroutineScope coroutineScope) {
        if (coroutineScope == null) {
            return;
        }
        try {
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    public static final kotlinx.coroutines.Job a(kotlinx.coroutines.CoroutineScope coroutineScope, long j, long j2, kotlin.jvm.functions.Function1 action) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.inmobi.media.F3(j, action, j2, null), 3, null);
        return launch$default;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        r5 = com.inmobi.media.W9.f5027a;
        com.inmobi.media.W9.a(new com.inmobi.media.M2(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.C2935zh c2935zh, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.H3 h3;
        int i;
        if (continuation instanceof com.inmobi.media.H3) {
            h3 = (com.inmobi.media.H3) continuation;
            int i2 = h3.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h3.b = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = h3.f4737a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = h3.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.I3 i3 = new com.inmobi.media.I3(function1, null);
                    h3.b = 1;
                    if (c2935zh.a(i3, h3) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        h3 = new com.inmobi.media.H3(continuation);
        java.lang.Object obj2 = h3.f4737a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = h3.b;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final android.content.Intent a(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter filter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filter, "filter");
        try {
            com.inmobi.media.B5.f4614a.getClass();
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                return context.registerReceiver(broadcastReceiver, filter, 2);
            }
            return context.registerReceiver(broadcastReceiver, filter);
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e);
            return null;
        }
    }
}
