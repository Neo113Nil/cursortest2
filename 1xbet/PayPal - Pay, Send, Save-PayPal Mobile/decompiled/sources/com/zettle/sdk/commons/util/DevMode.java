package com.zettle.sdk.commons.util;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/commons/util/DevMode;", "", "", "isEnabled", "()Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface DevMode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.commons.util.DevMode.Companion INSTANCE = com.zettle.sdk.commons.util.DevMode.Companion.getHighSpeedVideoFpsRangesFor;

    boolean isEnabled();

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\n"}, d2 = {"Lcom/zettle/sdk/commons/util/DevMode$Companion;", "Lcom/zettle/sdk/commons/util/DevMode;", "<init>", "()V", "", "enabled", "", "create", "(Z)V", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoFpsRangesFor", "isEnabled", "()Z", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements com.zettle.sdk.commons.util.DevMode {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private static boolean getHighSpeedVideoFpsRangesFor;
        static final /* synthetic */ com.zettle.sdk.commons.util.DevMode.Companion getHighSpeedVideoFpsRangesFor = new com.zettle.sdk.commons.util.DevMode.Companion();
        private static boolean getHighSpeedVideoSizes;

        private Companion() {
        }

        @Override // com.zettle.sdk.commons.util.DevMode
        public final boolean isEnabled() {
            return getHighSpeedVideoFpsRangesFor;
        }

        public static /* synthetic */ void create$default(com.zettle.sdk.commons.util.DevMode.Companion companion, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            companion.create(z);
        }

        public final void create(boolean enabled) {
            if (getHighSpeedVideoSizes) {
                return;
            }
            getHighSpeedVideoSizes = true;
            getHighSpeedVideoFpsRangesFor = enabled;
        }
    }
}
