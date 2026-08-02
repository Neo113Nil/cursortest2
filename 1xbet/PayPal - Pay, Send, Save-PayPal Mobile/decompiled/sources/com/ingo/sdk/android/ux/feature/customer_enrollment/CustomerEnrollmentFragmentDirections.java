package com.ingo.sdk.android.ux.feature.customer_enrollment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/customer_enrollment/CustomerEnrollmentFragmentDirections;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CustomerEnrollmentFragmentDirections {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragmentDirections.Companion INSTANCE = new com.ingo.sdk.android.ux.feature.customer_enrollment.CustomerEnrollmentFragmentDirections.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/customer_enrollment/CustomerEnrollmentFragmentDirections$Companion;", "", "<init>", "()V", "Landroidx/navigation/NavDirections;", "actionCustomerEnrollmentFragmentToMoreMenuFragment", "()Landroidx/navigation/NavDirections;", "actionCustomerEnrollmentFragmentToCaptureCheckImagesFragment", "actionCustomerEnrollmentFragmentToAccountSelectionFragment"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.view.NavDirections actionCustomerEnrollmentFragmentToMoreMenuFragment() {
            return new androidx.view.ActionOnlyNavDirections(com.ingo.sdk.android.R.id.action_customerEnrollmentFragment_to_moreMenuFragment);
        }

        public final androidx.view.NavDirections actionCustomerEnrollmentFragmentToCaptureCheckImagesFragment() {
            return new androidx.view.ActionOnlyNavDirections(com.ingo.sdk.android.R.id.action_customerEnrollmentFragment_to_captureCheckImagesFragment);
        }

        public final androidx.view.NavDirections actionCustomerEnrollmentFragmentToAccountSelectionFragment() {
            return new androidx.view.ActionOnlyNavDirections(com.ingo.sdk.android.R.id.action_customerEnrollmentFragment_to_accountSelectionFragment);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private CustomerEnrollmentFragmentDirections() {
    }
}
