package com.paypal.oslo.feature.qrc.ui.enrollment;

/* loaded from: classes14.dex */
public final class EnrollmentReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer_Factory create() {
        return com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer newInstance() {
        return new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentReducer_Factory();

        private InstanceHolder() {
        }
    }
}
