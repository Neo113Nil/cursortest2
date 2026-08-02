package com.paypal.oslo.core.navigation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/navigation/SoftInputMode;", "", "", "p0", "<init>", "(I)V", "windowFlag", com.visa.cbp.getEncExpo.warmup, "getWindowFlag$navigation_release", "()I", "Resize", "Pan", "Nothing", "Default", "Lcom/paypal/oslo/core/navigation/SoftInputMode$Default;", "Lcom/paypal/oslo/core/navigation/SoftInputMode$Nothing;", "Lcom/paypal/oslo/core/navigation/SoftInputMode$Pan;", "Lcom/paypal/oslo/core/navigation/SoftInputMode$Resize;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SoftInputMode {
    public static final int $stable = 0;
    private final int windowFlag;

    private SoftInputMode(int i) {
        this.windowFlag = i;
    }

    /* renamed from: getWindowFlag$navigation_release, reason: from getter */
    public final int getWindowFlag() {
        return this.windowFlag;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/navigation/SoftInputMode$Resize;", "Lcom/paypal/oslo/core/navigation/SoftInputMode;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Resize extends com.paypal.oslo.core.navigation.SoftInputMode {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.navigation.SoftInputMode.Resize INSTANCE = new com.paypal.oslo.core.navigation.SoftInputMode.Resize();

        private Resize() {
            super(16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/navigation/SoftInputMode$Pan;", "Lcom/paypal/oslo/core/navigation/SoftInputMode;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Pan extends com.paypal.oslo.core.navigation.SoftInputMode {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.navigation.SoftInputMode.Pan INSTANCE = new com.paypal.oslo.core.navigation.SoftInputMode.Pan();

        private Pan() {
            super(32, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/navigation/SoftInputMode$Nothing;", "Lcom/paypal/oslo/core/navigation/SoftInputMode;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Nothing extends com.paypal.oslo.core.navigation.SoftInputMode {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.navigation.SoftInputMode.Nothing INSTANCE = new com.paypal.oslo.core.navigation.SoftInputMode.Nothing();

        private Nothing() {
            super(48, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/navigation/SoftInputMode$Default;", "Lcom/paypal/oslo/core/navigation/SoftInputMode;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Default extends com.paypal.oslo.core.navigation.SoftInputMode {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.navigation.SoftInputMode.Default INSTANCE = new com.paypal.oslo.core.navigation.SoftInputMode.Default();

        private Default() {
            super(com.paypal.oslo.core.navigation.SoftInputMode.Resize.INSTANCE.getWindowFlag(), null);
        }
    }

    public /* synthetic */ SoftInputMode(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
