package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface PrefetchOperationCallbackBoundaryInterface {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface PrefetchExceptionTypeBoundaryInterface {
        public static final int DUPLICATE = 2;
        public static final int GENERIC = 0;
        public static final int NETWORK = 1;
    }

    void onFailure(int i, java.lang.String str, int i2);

    void onSuccess();
}
