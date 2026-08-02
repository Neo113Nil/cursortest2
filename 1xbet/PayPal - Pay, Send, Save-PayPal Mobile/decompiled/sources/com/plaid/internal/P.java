package com.plaid.internal;

/* loaded from: classes16.dex */
public final class P implements com.plaid.internal.Y3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.V3 f5874a;
    public final kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.String, java.lang.String, kotlin.Unit> b;
    public final java.util.regex.Pattern c;
    public final java.util.List<java.lang.String> d;

    /* JADX WARN: Multi-variable type inference failed */
    public P(com.plaid.internal.V3 v3, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v3, "");
        this.f5874a = v3;
        this.b = function3;
        this.c = java.util.regex.Pattern.compile("(\\$\\d+)+$");
        this.d = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.plaid.internal.C0452a6.class.getName(), com.plaid.internal.C0452a6.a.class.getName(), com.plaid.internal.P.class.getName()});
    }

    public final void a(int i, java.lang.Throwable th, java.lang.String str, java.lang.Object[] objArr, boolean z) {
        if (z) {
            return;
        }
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            if (!this.d.contains(stackTraceElement.getClassName())) {
                java.lang.String className = stackTraceElement.getClassName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "");
                java.lang.String substringAfterLast$default = kotlin.text.StringsKt.substringAfterLast$default(className, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, (java.lang.String) null, 2, (java.lang.Object) null);
                java.util.regex.Matcher matcher = this.c.matcher(substringAfterLast$default);
                if (matcher.find()) {
                    substringAfterLast$default = matcher.replaceAll("");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substringAfterLast$default, "");
                }
                com.plaid.internal.V3.a aVar = com.plaid.internal.V3.Companion;
                if (i >= com.plaid.internal.V3.a.a(this.f5874a)) {
                    if (str == null || str.length() == 0) {
                        if (th == null) {
                            return;
                        }
                        java.io.StringWriter stringWriter = new java.io.StringWriter(256);
                        java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) stringWriter, false);
                        th.printStackTrace(printWriter);
                        printWriter.flush();
                        str = stringWriter.toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                    } else {
                        if (objArr.length != 0) {
                            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
                            str = java.lang.String.format(str, java.util.Arrays.copyOf(copyOf, copyOf.length));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                        }
                        if (th != null) {
                            java.io.StringWriter stringWriter2 = new java.io.StringWriter(256);
                            java.io.PrintWriter printWriter2 = new java.io.PrintWriter((java.io.Writer) stringWriter2, false);
                            th.printStackTrace(printWriter2);
                            printWriter2.flush();
                            java.lang.String obj = stringWriter2.toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(str);
                            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                            sb.append(obj);
                            str = sb.toString();
                        }
                    }
                    try {
                        a(i, substringAfterLast$default, str);
                        return;
                    } catch (java.lang.Throwable unused) {
                        return;
                    }
                }
                return;
            }
        }
        throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.plaid.internal.Y3
    public final void b(java.lang.Throwable th, java.lang.String str, java.lang.Object[] objArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        a(5, th, str, java.util.Arrays.copyOf(objArr, objArr.length), z);
    }

    @Override // com.plaid.internal.Y3
    public final void c(java.lang.String str, java.lang.Object[] objArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        a(4, null, str, java.util.Arrays.copyOf(objArr, objArr.length), z);
    }

    @Override // com.plaid.internal.Y3
    public final void d(java.lang.String str, java.lang.Object[] objArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        a(3, null, str, java.util.Arrays.copyOf(objArr, objArr.length), z);
    }

    @Override // com.plaid.internal.Y3
    public final void e(java.lang.String str, java.lang.Object[] objArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        a(5, null, str, java.util.Arrays.copyOf(objArr, objArr.length), z);
    }

    @Override // com.plaid.internal.Y3
    public final void b(java.lang.String str, java.lang.Object[] objArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        a(6, new java.lang.Throwable(), "Plog.e: ".concat(java.lang.String.valueOf(str)), java.util.Arrays.copyOf(objArr, objArr.length), z);
    }

    @Override // com.plaid.internal.Y3
    public final void b(java.lang.Throwable th, boolean z) {
        a(6, th, null, new java.lang.Object[0], z);
    }

    @Override // com.plaid.internal.Y3
    public final void a(java.lang.String str, java.lang.Object[] objArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        a(2, null, str, java.util.Arrays.copyOf(objArr, objArr.length), z);
    }

    @Override // com.plaid.internal.Y3
    public final void a(java.lang.Throwable th, boolean z) {
        a(5, th, null, new java.lang.Object[0], z);
    }

    @Override // com.plaid.internal.Y3
    public final void a(java.lang.Throwable th, java.lang.String str, java.lang.Object[] objArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        a(6, th, str, java.util.Arrays.copyOf(objArr, objArr.length), z);
    }

    public final void a(int i, java.lang.String str, java.lang.String str2) {
        int min;
        if (str2.length() < 4000) {
            kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.String, java.lang.String, kotlin.Unit> function3 = this.b;
            if (function3 != null) {
                function3.invoke(java.lang.Integer.valueOf(i), str, str2);
            }
            if (i == 7) {
                android.util.Log.wtf(str, str2);
                return;
            }
            return;
        }
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, '\n', i2, false, 4, (java.lang.Object) null);
            if (indexOf$default == -1) {
                indexOf$default = length;
            }
            while (true) {
                min = java.lang.Math.min(indexOf$default, i2 + 4000);
                java.lang.String substring = str2.substring(i2, min);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.String, java.lang.String, kotlin.Unit> function32 = this.b;
                if (function32 != null) {
                    function32.invoke(java.lang.Integer.valueOf(i), str, substring);
                }
                if (i == 7) {
                    android.util.Log.wtf(str, substring);
                }
                if (min >= indexOf$default) {
                    break;
                } else {
                    i2 = min;
                }
            }
            i2 = min + 1;
        }
    }
}
