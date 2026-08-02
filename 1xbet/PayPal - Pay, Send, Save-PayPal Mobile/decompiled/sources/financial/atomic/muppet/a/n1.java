package financial.atomic.muppet.a;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001e\u0010\f\u001a\f\u0012\b\u0012\u0006*\u00020\n0\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b"}, d2 = {"Lfinancial/atomic/muppet/a/n1;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/webkit/PermissionRequest;", "Camera2StreamConfigurationMap", "Landroid/webkit/PermissionRequest;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/activity/result/ActivityResultLauncher;", "", "Landroidx/activity/result/ActivityResultLauncher;", "getHighSpeedVideoSizes", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class n1 extends androidx.fragment.app.Fragment {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private android.webkit.PermissionRequest getHighSpeedVideoFpsRangesFor;
    private android.webkit.PermissionRequest getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.result.ActivityResultLauncher<java.lang.String> getHighSpeedVideoSizes;

    public static final class a {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
        }
    }

    static {
        new financial.atomic.muppet.a.n1.a(0);
    }

    public n1() {
        androidx.view.result.ActivityResultLauncher<java.lang.String> registerForActivityResult = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.RequestPermission(), new androidx.view.result.ActivityResultCallback() { // from class: financial.atomic.muppet.a.n1$$ExternalSyntheticLambda0
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                financial.atomic.muppet.a.n1.$r8$lambda$TsCuj6BsS3UaGl9CJ7FaBw6GUZQ(financial.atomic.muppet.a.n1.this, (java.lang.Boolean) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "");
        this.getHighSpeedVideoSizes = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.webkit.PermissionRequest permissionRequest = this.getHighResolutionOutputSizeshNQ4ISI;
        if (permissionRequest != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRangesFor = permissionRequest;
            this.getHighSpeedVideoSizes.launch("android.permission.CAMERA");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        android.webkit.PermissionRequest permissionRequest = this.getHighSpeedVideoFpsRangesFor;
        if (permissionRequest != null) {
            permissionRequest.deny();
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        android.webkit.PermissionRequest permissionRequest2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (permissionRequest2 != null) {
            permissionRequest2.deny();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public final void a(android.webkit.PermissionRequest permissionRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRequest, "");
        if (this.getHighSpeedVideoFpsRangesFor == null && this.getHighResolutionOutputSizeshNQ4ISI == null) {
            if (!getLifecycleRegistry().getCamera2StreamConfigurationMap().isAtLeast(androidx.lifecycle.Lifecycle.State.CREATED)) {
                this.getHighResolutionOutputSizeshNQ4ISI = permissionRequest;
                return;
            } else {
                this.getHighSpeedVideoFpsRangesFor = permissionRequest;
                this.getHighSpeedVideoSizes.launch("android.permission.CAMERA");
                return;
            }
        }
        permissionRequest.deny();
    }

    public static /* synthetic */ void $r8$lambda$TsCuj6BsS3UaGl9CJ7FaBw6GUZQ(financial.atomic.muppet.a.n1 n1Var, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bool, "");
        android.webkit.PermissionRequest permissionRequest = n1Var.getHighSpeedVideoFpsRangesFor;
        n1Var.getHighSpeedVideoFpsRangesFor = null;
        if (permissionRequest != null) {
            if (bool.booleanValue()) {
                permissionRequest.grant(new java.lang.String[]{"android.webkit.resource.VIDEO_CAPTURE"});
            } else {
                permissionRequest.deny();
            }
        }
    }
}
