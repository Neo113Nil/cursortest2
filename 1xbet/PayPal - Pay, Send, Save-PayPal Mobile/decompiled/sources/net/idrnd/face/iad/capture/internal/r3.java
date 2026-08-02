package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class r3 {
    public static final int[] b = {63131, 51152, 18403, 63845, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, 48337, 23182, 35145, 49102, 53010};
    public static int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7001a;

    public static /* synthetic */ java.lang.String b() {
        return null;
    }

    public final void c() {
        net.idrnd.face.iad.capture.internal.y3.a();
    }

    public r3(android.content.Context context) {
        this.f7001a = context;
        c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(1:45)(1:8)|9|(2:10|11)|(2:13|(2:15|(14:17|18|(1:20)|21|22|23|(8:25|(1:27)(1:39)|28|(1:30)(1:37)|31|(1:33)|34|35)|40|28|(0)(0)|31|(0)|34|35)))|43|18|(0)|21|22|23|(0)|40|28|(0)(0)|31|(0)|34|35) */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b A[Catch: UnsatisfiedLinkError -> 0x00a6, TryCatch #0 {UnsatisfiedLinkError -> 0x00a6, blocks: (B:23:0x0087, B:25:0x008b, B:27:0x009d), top: B:22:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z;
        int i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String absolutePath = this.f7001a.getFilesDir().getAbsolutePath();
        int a2 = net.idrnd.face.iad.capture.internal.y3.a(absolutePath);
        arrayList.add(java.lang.Boolean.valueOf(net.idrnd.face.iad.capture.internal.y3.a(a(0)) == 0 && new java.io.File(absolutePath).exists() && (a2 == 2 || a2 == 13)));
        if (net.idrnd.face.iad.capture.checker.nativelib.NativeInterface.f6952a) {
            java.lang.Object call = net.idrnd.face.iad.capture.checker.nativelib.NativeInterface.call(new java.lang.Object[]{4, null});
            if (call instanceof java.lang.Integer) {
                if (((java.lang.Integer) call).intValue() != 0) {
                    z = true;
                    arrayList.add(java.lang.Boolean.valueOf(z));
                    if (c == 0) {
                        c = (int) ((-java.lang.System.currentTimeMillis()) & 2146500607);
                    }
                    int i2 = c + 11;
                    int i3 = Integer.MAX_VALUE & i2;
                    c = i3;
                    java.lang.Object[] objArr = {java.lang.Integer.valueOf(i3)};
                    if (net.idrnd.face.iad.capture.checker.nativelib.NativeInterface.f6952a) {
                        java.lang.Object call2 = net.idrnd.face.iad.capture.checker.nativelib.NativeInterface.call(new java.lang.Object[]{2, objArr});
                        i = call2 instanceof java.lang.Integer ? ((java.lang.Integer) call2).intValue() : 0;
                        arrayList.add(java.lang.Boolean.valueOf(!(((java.lang.Integer) objArr[0]).intValue() == (b[i2 & 5] ^ (~(i3 + i))) ? (1073741824 & i) != 0 : false)));
                        arrayList.add(java.lang.Boolean.valueOf(new java.io.File(a(1)).exists()));
                        final java.lang.String str = (java.lang.String) arrayList.stream().map(new java.util.function.Function() { // from class: net.idrnd.face.iad.capture.internal.r3$$ExternalSyntheticLambda0
                            @Override // java.util.function.Function
                            public final java.lang.Object apply(java.lang.Object obj) {
                                return net.idrnd.face.iad.capture.internal.r3.a((java.lang.Boolean) obj);
                            }
                        }).collect(java.util.stream.Collectors.joining());
                        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: net.idrnd.face.iad.capture.internal.r3$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                java.lang.String concat;
                                concat = "SB res: ".concat(java.lang.String.valueOf(str));
                                return concat;
                            }
                        };
                        kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: net.idrnd.face.iad.capture.internal.r3$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return net.idrnd.face.iad.capture.internal.r3.b();
                            }
                        };
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
                        return str.contains("1");
                    }
                    i = 1;
                    arrayList.add(java.lang.Boolean.valueOf(!(((java.lang.Integer) objArr[0]).intValue() == (b[i2 & 5] ^ (~(i3 + i))) ? (1073741824 & i) != 0 : false)));
                    arrayList.add(java.lang.Boolean.valueOf(new java.io.File(a(1)).exists()));
                    final java.lang.String str2 = (java.lang.String) arrayList.stream().map(new java.util.function.Function() { // from class: net.idrnd.face.iad.capture.internal.r3$$ExternalSyntheticLambda0
                        @Override // java.util.function.Function
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return net.idrnd.face.iad.capture.internal.r3.a((java.lang.Boolean) obj);
                        }
                    }).collect(java.util.stream.Collectors.joining());
                    kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: net.idrnd.face.iad.capture.internal.r3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            java.lang.String concat;
                            concat = "SB res: ".concat(java.lang.String.valueOf(str2));
                            return concat;
                        }
                    };
                    kotlin.jvm.functions.Function0 function022 = new kotlin.jvm.functions.Function0() { // from class: net.idrnd.face.iad.capture.internal.r3$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return net.idrnd.face.iad.capture.internal.r3.b();
                        }
                    };
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function022, "");
                    return str2.contains("1");
                }
            }
        }
        z = false;
        arrayList.add(java.lang.Boolean.valueOf(z));
        if (c == 0) {
        }
        int i22 = c + 11;
        int i32 = Integer.MAX_VALUE & i22;
        c = i32;
        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i32)};
        if (net.idrnd.face.iad.capture.checker.nativelib.NativeInterface.f6952a) {
        }
        i = 1;
        arrayList.add(java.lang.Boolean.valueOf(!(((java.lang.Integer) objArr2[0]).intValue() == (b[i22 & 5] ^ (~(i32 + i))) ? (1073741824 & i) != 0 : false)));
        arrayList.add(java.lang.Boolean.valueOf(new java.io.File(a(1)).exists()));
        final java.lang.String str22 = (java.lang.String) arrayList.stream().map(new java.util.function.Function() { // from class: net.idrnd.face.iad.capture.internal.r3$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return net.idrnd.face.iad.capture.internal.r3.a((java.lang.Boolean) obj);
            }
        }).collect(java.util.stream.Collectors.joining());
        kotlin.jvm.functions.Function0 function032 = new kotlin.jvm.functions.Function0() { // from class: net.idrnd.face.iad.capture.internal.r3$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String concat;
                concat = "SB res: ".concat(java.lang.String.valueOf(str22));
                return concat;
            }
        };
        kotlin.jvm.functions.Function0 function0222 = new kotlin.jvm.functions.Function0() { // from class: net.idrnd.face.iad.capture.internal.r3$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return net.idrnd.face.iad.capture.internal.r3.b();
            }
        };
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function032, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0222, "");
        return str22.contains("1");
    }

    public static /* synthetic */ java.lang.String a(java.lang.Boolean bool) {
        return bool.booleanValue() ? "1" : "0";
    }

    public static java.lang.String a(int i) {
        if (net.idrnd.face.iad.capture.internal.s3.f7005a == null) {
            net.idrnd.face.iad.capture.internal.s3.f7005a = new net.idrnd.face.iad.capture.internal.v3(1005913574).a(new byte[]{-55, -58, com.google.common.base.Ascii.FS, 67, -60, -75, 33, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -43, 67, com.google.common.base.Ascii.EM, -109, -71, 56, 110, -8, -46, 65, 8, -121, -26, 114, 100, -15, -111, com.google.common.base.Ascii.SYN, 91, -40, -81}).split(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        return net.idrnd.face.iad.capture.internal.s3.f7005a[i];
    }
}
