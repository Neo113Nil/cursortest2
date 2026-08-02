package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/ZettleSDKLifecycle;", "Landroidx/lifecycle/LifecycleEventObserver;", "", "delayMilliSeconds", "<init>", "(J)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ZettleSDKLifecycle implements androidx.view.LifecycleEventObserver {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    public ZettleSDKLifecycle(long j) {
        this.getHighSpeedVideoFpsRanges = j;
    }

    public /* synthetic */ ZettleSDKLifecycle(long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 60000L : j);
    }

    @Override // androidx.view.LifecycleEventObserver
    public final void onStateChanged(androidx.view.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        int i = com.zettle.sdk.ZettleSDKLifecycle.WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            com.zettle.sdk.ZettleSDKImpl.INSTANCE.start();
        } else {
            if (i != 2) {
                return;
            }
            com.zettle.sdk.ZettleSDKImpl.INSTANCE.stop$core_publicRelease(this.getHighSpeedVideoFpsRanges);
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ZettleSDKLifecycle() {
        this(0L, 1, null);
    }
}
