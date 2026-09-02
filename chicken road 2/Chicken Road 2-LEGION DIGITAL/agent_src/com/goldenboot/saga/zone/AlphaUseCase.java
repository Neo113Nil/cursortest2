package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/AlphaUseCase;", "", "releaseHeader", "ActivityMutator", "Lcom/goldenboot/saga/zone/InternalCurator;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AlphaUseCase {

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0005\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/goldenboot/saga/zone/AlphaUseCase$ActivityMutator;", "", "<init>", "()V", "", "growPayload", "Z", "evictLayout", "()Z", "injectMetric", "(Z)V", "isEnabled", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.AlphaUseCase$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion evictLayout = new Companion();

        /* renamed from: growPayload, reason: from kotlin metadata */
        private static boolean isEnabled = true;

        private Companion() {
        }

        public final boolean evictLayout() {
            return isEnabled;
        }

        public final void injectMetric(boolean z) {
            isEnabled = z;
        }

        public static /* synthetic */ void growPayload() {
        }
    }
}
