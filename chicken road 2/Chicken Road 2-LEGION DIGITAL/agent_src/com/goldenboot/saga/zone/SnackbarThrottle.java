package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/goldenboot/saga/zone/SnackbarThrottle;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/KeyframeLauncher;", "", "growPayload", "Lcom/goldenboot/saga/zone/KeyframeLauncher;", "()Lcom/goldenboot/saga/zone/KeyframeLauncher;", "TestTagsAsResourceId", "", "injectMetric", "evictLayout", "AccessibilityClassName", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarThrottle {
    public static final SnackbarThrottle evictLayout = new SnackbarThrottle();

    /* renamed from: growPayload, reason: from kotlin metadata */
    private static final KeyframeLauncher<Boolean> TestTagsAsResourceId = new KeyframeLauncher<>("TestTagsAsResourceId", false, BounceHandler.reduceScope, null, 8, null);

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private static final KeyframeLauncher<String> AccessibilityClassName = new KeyframeLauncher<>("AccessibilityClassName", true, ActivityMutator.reduceScope, null, 8, null);
    public static final int detachStream = 8;

    private SnackbarThrottle() {
    }

    public final KeyframeLauncher<String> evictLayout() {
        return AccessibilityClassName;
    }

    public final KeyframeLauncher<Boolean> growPayload() {
        return TestTagsAsResourceId;
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<unused var>", "evictLayout", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator extends Lambda implements IconExporter {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(2);
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<unused var>", "evictLayout", "(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0})
    public static final class BounceHandler extends Lambda implements IconExporter {
        public static final BounceHandler reduceScope = new BounceHandler();

        public BounceHandler() {
            super(2);
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return evictLayout((Boolean) obj, ((Boolean) obj2).booleanValue());
        }

        public final Boolean evictLayout(Boolean bool, boolean z) {
            return bool;
        }
    }
}
