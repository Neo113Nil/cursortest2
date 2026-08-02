package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class mk {
    static final java.util.concurrent.Executor e = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), com.facetec.sdk.nh.c("OkHttp ConnectionPool", true));
    static final /* synthetic */ boolean i = true;

    /* renamed from: a, reason: collision with root package name */
    final java.util.Deque<com.facetec.sdk.nl> f3649a;
    final java.lang.Runnable b;
    final com.facetec.sdk.nr c;
    final int d;
    private final long f;
    boolean h;

    public mk() {
        this(java.util.concurrent.TimeUnit.MINUTES);
    }

    private mk(java.util.concurrent.TimeUnit timeUnit) {
        this.b = new java.lang.Runnable() { // from class: com.facetec.sdk.mk.3
            private static final byte[] $$a = null;
            private static final int $$b = 0;

            /* renamed from: a, reason: collision with root package name */
            private static char[] f3650a;
            private static boolean c;
            private static boolean d;
            private static int e;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0027). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$c(byte b, byte b2, int i2) {
                int i3;
                int i4;
                int i5 = b + 65;
                int i6 = 1 - (b2 * 2);
                int i7 = (i2 * 3) + 4;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i6];
                if (bArr == null) {
                    int i8 = i7;
                    i4 = 0;
                    i5 += i7;
                    i7 = i8 + 1;
                    i3 = i4;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i5;
                    if (i4 == i6) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i8 = i7;
                    i7 = bArr[i7];
                    i5 += i7;
                    i7 = i8 + 1;
                    i3 = i4;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i5;
                    if (i4 == i6) {
                    }
                } else {
                    i3 = 0;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i5;
                    if (i4 == i6) {
                    }
                }
            }

            static void init$0() {
                $$a = new byte[]{120, -93, 60, 33};
                $$b = 59;
            }

            @Override // java.lang.Runnable
            public final void run() {
                while (true) {
                    com.facetec.sdk.mk mkVar = com.facetec.sdk.mk.this;
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        f(null, null, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, "\u008d\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        f(null, null, 127 - android.view.KeyEvent.keyCodeFromString(""), "\u008c\u008d\u0090\u008f\u008e\u0086\u0082\u0086", objArr2);
                        long c2 = mkVar.c(((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue());
                        if (c2 == -1) {
                            return;
                        }
                        if (c2 > 0) {
                            long j = c2 / 1000000;
                            synchronized (com.facetec.sdk.mk.this) {
                                try {
                                    com.facetec.sdk.mk.this.wait(j, (int) (c2 - (1000000 * j)));
                                } catch (java.lang.InterruptedException unused) {
                                }
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }

            private static void f(int[] iArr, java.lang.String str, int i2, java.lang.String str2, java.lang.Object[] objArr) {
                java.lang.String str3 = str2;
                byte[] bArr = str3;
                if (str3 != null) {
                    bArr = str3.getBytes("ISO-8859-1");
                }
                byte[] bArr2 = bArr;
                char[] charArray = str != null ? str.toCharArray() : str;
                com.facetec.sdk.hn hnVar = new com.facetec.sdk.hn();
                char[] cArr = f3650a;
                long j = 0;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i3 = 0;
                    while (i3 < length) {
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                            java.lang.Object d2 = com.facetec.sdk.al.d(484843984);
                            if (d2 == null) {
                                byte b = (byte) 0;
                                d2 = com.facetec.sdk.al.c((char) android.widget.ExpandableListView.getPackedPositionType(j), 1810 - android.view.MotionEvent.axisFromString(""), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 22, -1157014744, false, $$c(b, b, b), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                            i3++;
                            j = 0;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(e)};
                java.lang.Object d3 = com.facetec.sdk.al.d(-1796435875);
                if (d3 == null) {
                    char lastIndexOf = (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                    float complexToFloat = android.util.TypedValue.complexToFloat(0);
                    int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                    byte b2 = (byte) ($$b & 5);
                    byte b3 = (byte) (b2 - 1);
                    d3 = com.facetec.sdk.al.c(lastIndexOf, 662 - (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)), 23 - offsetBefore, 855894693, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).intValue();
                if (c) {
                    hnVar.c = bArr2.length;
                    char[] cArr3 = new char[hnVar.c];
                    hnVar.f3629a = 0;
                    while (hnVar.f3629a < hnVar.c) {
                        cArr3[hnVar.f3629a] = (char) (cArr[bArr2[(hnVar.c - 1) - hnVar.f3629a] + i2] - intValue);
                        java.lang.Object[] objArr4 = {hnVar, hnVar};
                        java.lang.Object d4 = com.facetec.sdk.al.d(870267758);
                        if (d4 == null) {
                            byte b4 = (byte) 0;
                            d4 = com.facetec.sdk.al.c((char) (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1235, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, -1808776810, false, $$c((byte) ($$b - 2), b4, b4), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                    }
                    objArr[0] = new java.lang.String(cArr3);
                    return;
                }
                if (d) {
                    hnVar.c = charArray.length;
                    char[] cArr4 = new char[hnVar.c];
                    hnVar.f3629a = 0;
                    while (hnVar.f3629a < hnVar.c) {
                        cArr4[hnVar.f3629a] = (char) (cArr[charArray[(hnVar.c - 1) - hnVar.f3629a] - i2] - intValue);
                        java.lang.Object[] objArr5 = {hnVar, hnVar};
                        java.lang.Object d5 = com.facetec.sdk.al.d(870267758);
                        if (d5 == null) {
                            byte b5 = (byte) 0;
                            d5 = com.facetec.sdk.al.c((char) (android.os.Process.myTid() >> 22), 1235 - android.graphics.ImageFormat.getBitsPerPixel(0), android.graphics.Color.alpha(0) + 24, -1808776810, false, $$c((byte) ($$b - 2), b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                    }
                    objArr[0] = new java.lang.String(cArr4);
                    return;
                }
                hnVar.c = iArr.length;
                char[] cArr5 = new char[hnVar.c];
                hnVar.f3629a = 0;
                while (hnVar.f3629a < hnVar.c) {
                    cArr5[hnVar.f3629a] = (char) (cArr[iArr[(hnVar.c - 1) - hnVar.f3629a] - i2] - intValue);
                    hnVar.f3629a++;
                }
                objArr[0] = new java.lang.String(cArr5);
            }

            static {
                init$0();
                f3650a = new char[]{5849, 5824, 5805, 5909, 5847, 5845, 5850, 5838, 5800, 5806, 5807, 5852, 5844, 5842, 5839, 5848};
                e = -1919674589;
                d = true;
                c = true;
            }
        };
        this.f3649a = new java.util.ArrayDeque();
        this.c = new com.facetec.sdk.nr();
        this.d = 5;
        this.f = timeUnit.toNanos(5L);
    }

    final long c(long j) {
        synchronized (this) {
            com.facetec.sdk.nl nlVar = null;
            long j2 = Long.MIN_VALUE;
            int i2 = 0;
            int i3 = 0;
            for (com.facetec.sdk.nl nlVar2 : this.f3649a) {
                java.util.List<java.lang.ref.Reference<com.facetec.sdk.nu>> list = nlVar2.f3684o;
                int i4 = 0;
                while (true) {
                    if (i4 < list.size()) {
                        java.lang.ref.Reference<com.facetec.sdk.nu> reference = list.get(i4);
                        if (reference.get() == null) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("A connection to ");
                            sb.append(nlVar2.e().d().b());
                            sb.append(" was leaked. Did you forget to close a response body?");
                            com.facetec.sdk.pa.d().a(sb.toString(), ((com.facetec.sdk.nu.b) reference).d);
                            list.remove(i4);
                            nlVar2.g = true;
                            if (list.isEmpty()) {
                                nlVar2.m = j - this.f;
                                break;
                            }
                        } else {
                            i4++;
                        }
                    } else if (list.size() > 0) {
                        i3++;
                    }
                }
                i2++;
                long j3 = j - nlVar2.m;
                if (j3 > j2) {
                    nlVar = nlVar2;
                    j2 = j3;
                }
            }
            long j4 = this.f;
            if (j2 < j4 && i2 <= this.d) {
                if (i2 > 0) {
                    return j4 - j2;
                }
                if (i3 > 0) {
                    return j4;
                }
                this.h = false;
                return -1L;
            }
            this.f3649a.remove(nlVar);
            com.facetec.sdk.nh.c(nlVar.a());
            return 0L;
        }
    }
}
