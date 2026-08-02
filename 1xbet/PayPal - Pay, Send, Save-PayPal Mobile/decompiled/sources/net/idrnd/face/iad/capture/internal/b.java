package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f6955a;
    public final java.lang.String b;
    public final net.idrnd.face.iad.capture.internal.l0 c;
    public final net.idrnd.face.iad.capture.internal.p3 d;

    static {
        kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(net.idrnd.face.iad.capture.internal.b.class).getSimpleName();
    }

    public b(android.content.Context context) {
        java.lang.Object m23436constructorimpl;
        java.lang.Object m23436constructorimpl2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.c = new net.idrnd.face.iad.capture.internal.l0(context);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(b(context));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23442isSuccessimpl(m23436constructorimpl)) {
            m23436constructorimpl = kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl;
            kotlin.jvm.internal.Intrinsics.checkNotNull(m23436constructorimpl);
            this.f6955a = (java.util.List) m23436constructorimpl;
        } else {
            this.f6955a = kotlin.collections.CollectionsKt.emptyList();
        }
        this.b = a(context);
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(new net.idrnd.face.iad.capture.internal.p3(context));
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl2)) {
            throw new net.idrnd.face.iad.capture.internal.z3();
        }
        java.lang.Object obj = kotlin.Result.m23441isFailureimpl(m23436constructorimpl2) ? null : m23436constructorimpl2;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        this.d = (net.idrnd.face.iad.capture.internal.p3) obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:0|1|(1:3)|4|(1:(1:7)(2:62|63))(1:64)|8|(1:10)|11|12|13|(4:15|(1:17)|18|(16:20|21|22|(1:55)(1:26)|27|28|(1:30)|53|32|(4:34|(2:37|35)|38|39)|40|(1:(1:43)(2:50|51))(1:52)|44|(1:46)|47|48))|58|21|22|(0)|55|27|28|(0)|53|32|(0)|40|(0)(0)|44|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        if (((java.lang.Boolean) r11).booleanValue() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bc, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
    
        r2 = kotlin.Result.INSTANCE;
        r11 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(net.idrnd.face.iad.capture.internal.p pVar, net.idrnd.face.iad.capture.internal.p pVar2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, net.idrnd.face.iad.capture.internal.p2 p2Var, long j) {
        net.idrnd.face.iad.capture.internal.n1 n1Var;
        java.lang.Object m23436constructorimpl;
        boolean z;
        java.lang.Object m23436constructorimpl2;
        int ordinal;
        net.idrnd.face.iad.capture.internal.b1 b1Var;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2Var, "");
        int i = net.idrnd.face.iad.capture.internal.r2.f7000a;
        net.idrnd.face.iad.capture.internal.t0 c = net.idrnd.face.iad.capture.internal.w0.c();
        if (arrayList != null) {
            c.a(arrayList);
        }
        net.idrnd.face.iad.capture.internal.p0 p0Var = (net.idrnd.face.iad.capture.internal.p0) p2Var.a().b().get(p2Var.a().a());
        net.idrnd.face.iad.capture.internal.m2 a2 = p0Var.a();
        net.idrnd.face.iad.capture.internal.l1 a3 = net.idrnd.face.iad.capture.internal.m1.a();
        int ordinal2 = a2.ordinal();
        if (ordinal2 == 0) {
            n1Var = net.idrnd.face.iad.capture.internal.n1.JPEG;
        } else {
            if (ordinal2 != 1) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            n1Var = net.idrnd.face.iad.capture.internal.n1.PNG;
        }
        net.idrnd.face.iad.capture.internal.l1 a4 = a3.a(n1Var);
        if (a2 == net.idrnd.face.iad.capture.internal.m2.f6986a) {
            java.lang.Integer b = p0Var.b();
            kotlin.jvm.internal.Intrinsics.checkNotNull(b);
            a4.a(b.intValue());
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Boolean.valueOf(net.idrnd.face.iad.capture.internal.t3.a(pVar2.b().a())));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        int i2 = net.idrnd.face.iad.capture.internal.r2.f7000a;
        kotlin.Result.m23441isFailureimpl(m23436constructorimpl);
        boolean z2 = false;
        if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                m23436constructorimpl = null;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(m23436constructorimpl, java.lang.Boolean.TRUE)) {
                z = false;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(java.lang.Boolean.valueOf(!this.d.b() || net.idrnd.face.iad.capture.internal.y.a() || z));
                kotlin.Result.m23441isFailureimpl(m23436constructorimpl2);
                if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl2)) {
                    kotlin.ResultKt.throwOnFailure(m23436constructorimpl2);
                }
                z2 = true;
                c.a((net.idrnd.face.iad.capture.internal.m1) a4.build());
                c.a(java.lang.System.currentTimeMillis() / 1000);
                c.a(com.google.protobuf.kotlin.ByteStringsKt.toByteString(pVar.a()));
                c.b(com.google.protobuf.kotlin.ByteStringsKt.toByteString(pVar2.a()));
                c.a((net.idrnd.face.iad.capture.internal.i1) net.idrnd.face.iad.capture.internal.i1.a().a(z2).build());
                c.a();
                if (!arrayList2.isEmpty()) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(com.google.protobuf.kotlin.ByteStringsKt.toByteString(((net.idrnd.face.iad.capture.internal.p) it.next()).a()));
                    }
                    c.b(arrayList3);
                }
                long a5 = net.idrnd.face.iad.capture.internal.w3.a();
                ordinal = p2Var.b().ordinal();
                if (ordinal != 0) {
                    b1Var = net.idrnd.face.iad.capture.internal.b1.FACE;
                } else {
                    if (ordinal != 1) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    b1Var = net.idrnd.face.iad.capture.internal.b1.DOCUMENT;
                }
                net.idrnd.face.iad.capture.internal.o1 a6 = net.idrnd.face.iad.capture.internal.p1.a().a(pVar.c().getHeight()).b(pVar.c().getWidth()).a((net.idrnd.face.iad.capture.internal.u1) net.idrnd.face.iad.capture.internal.u1.a().a().a("API ".concat(java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT))).build()).a((net.idrnd.face.iad.capture.internal.w1) net.idrnd.face.iad.capture.internal.w1.a().b(android.os.Build.MANUFACTURER).a().a(android.os.Build.MODEL).build()).a((net.idrnd.face.iad.capture.internal.e2) net.idrnd.face.iad.capture.internal.e2.a().c(pVar.a(a5)).d(pVar2.a(a5)).b(j).a(java.lang.System.currentTimeMillis()).build()).a((net.idrnd.face.iad.capture.internal.y0) net.idrnd.face.iad.capture.internal.y0.b().a(this.f6955a).build()).a(b1Var);
                a6.a(net.idrnd.face.iad.capture.internal.a1.a().b().a());
                c.a((net.idrnd.face.iad.capture.internal.p1) a6.build());
                c.b();
                str = this.b;
                if (str != null) {
                    c.a(str);
                }
                int i3 = net.idrnd.face.iad.capture.internal.r2.f7000a;
                net.idrnd.face.iad.capture.internal.w0 w0Var = (net.idrnd.face.iad.capture.internal.w0) c.build();
                net.idrnd.face.iad.capture.internal.l0 l0Var = this.c;
                byte[] byteArray = w0Var.toByteArray();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
                return l0Var.a(byteArray);
            }
        }
        z = true;
        kotlin.Result.Companion companion32 = kotlin.Result.INSTANCE;
        m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(java.lang.Boolean.valueOf(!this.d.b() || net.idrnd.face.iad.capture.internal.y.a() || z));
        kotlin.Result.m23441isFailureimpl(m23436constructorimpl2);
        if (!kotlin.Result.m23441isFailureimpl(m23436constructorimpl2)) {
        }
        z2 = true;
        c.a((net.idrnd.face.iad.capture.internal.m1) a4.build());
        c.a(java.lang.System.currentTimeMillis() / 1000);
        c.a(com.google.protobuf.kotlin.ByteStringsKt.toByteString(pVar.a()));
        c.b(com.google.protobuf.kotlin.ByteStringsKt.toByteString(pVar2.a()));
        c.a((net.idrnd.face.iad.capture.internal.i1) net.idrnd.face.iad.capture.internal.i1.a().a(z2).build());
        c.a();
        if (!arrayList2.isEmpty()) {
        }
        long a52 = net.idrnd.face.iad.capture.internal.w3.a();
        ordinal = p2Var.b().ordinal();
        if (ordinal != 0) {
        }
        net.idrnd.face.iad.capture.internal.o1 a62 = net.idrnd.face.iad.capture.internal.p1.a().a(pVar.c().getHeight()).b(pVar.c().getWidth()).a((net.idrnd.face.iad.capture.internal.u1) net.idrnd.face.iad.capture.internal.u1.a().a().a("API ".concat(java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT))).build()).a((net.idrnd.face.iad.capture.internal.w1) net.idrnd.face.iad.capture.internal.w1.a().b(android.os.Build.MANUFACTURER).a().a(android.os.Build.MODEL).build()).a((net.idrnd.face.iad.capture.internal.e2) net.idrnd.face.iad.capture.internal.e2.a().c(pVar.a(a52)).d(pVar2.a(a52)).b(j).a(java.lang.System.currentTimeMillis()).build()).a((net.idrnd.face.iad.capture.internal.y0) net.idrnd.face.iad.capture.internal.y0.b().a(this.f6955a).build()).a(b1Var);
        a62.a(net.idrnd.face.iad.capture.internal.a1.a().b().a());
        c.a((net.idrnd.face.iad.capture.internal.p1) a62.build());
        c.b();
        str = this.b;
        if (str != null) {
        }
        int i32 = net.idrnd.face.iad.capture.internal.r2.f7000a;
        net.idrnd.face.iad.capture.internal.w0 w0Var2 = (net.idrnd.face.iad.capture.internal.w0) c.build();
        net.idrnd.face.iad.capture.internal.l0 l0Var2 = this.c;
        byte[] byteArray2 = w0Var2.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray2, "");
        return l0Var2.a(byteArray2);
    }

    public static java.util.ArrayList b(android.content.Context context) {
        java.lang.Object m23436constructorimpl;
        java.lang.Object m23436constructorimpl2;
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap;
        android.util.Size[] outputSizes;
        java.lang.Object systemService = context.getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) systemService;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(cameraManager.getCameraCharacteristics("1"));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            throw new net.idrnd.face.iad.capture.internal.f0();
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(m23436constructorimpl);
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics = (android.hardware.camera2.CameraCharacteristics) m23436constructorimpl;
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            java.lang.Integer num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 0 && (streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(35)) != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(outputSizes);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(outputSizes.length);
                for (android.util.Size size : outputSizes) {
                    arrayList2.add((net.idrnd.face.iad.capture.internal.c2) net.idrnd.face.iad.capture.internal.c2.a().b(size.getWidth()).a(size.getHeight()).build());
                }
                arrayList.addAll(arrayList2);
            }
            m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl2)) {
            throw new net.idrnd.face.iad.capture.internal.c();
        }
        return arrayList;
    }

    public static java.lang.String a(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
