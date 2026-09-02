package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/LayoutBlock;", "Lcom/goldenboot/saga/zone/CachedDeserializer;", "", "saveSnapshot", "()Ljava/lang/Object;", "traverseKey", "serializeOffset", "ActivityMutator", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LayoutBlock extends CachedDeserializer {

    /* renamed from: serializeOffset, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/goldenboot/saga/zone/LayoutBlock$ActivityMutator;", "", "<init>", "()V", "ActivityMutator", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.LayoutBlock$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion evictLayout = new Companion();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/goldenboot/saga/zone/LayoutBlock$ActivityMutator$ActivityMutator;", "", "<init>", "(Ljava/lang/String;I)V", "reduceScope", "notifyMessage", "connectPatch", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.goldenboot.saga.zone.LayoutBlock$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class EnumC0126ActivityMutator {
            private static final /* synthetic */ EnumC0126ActivityMutator[] attachConfig;
            private static final /* synthetic */ ItemProcessor resetDelta;
            public static final EnumC0126ActivityMutator reduceScope = new EnumC0126ActivityMutator("ContinueTraversal", 0);
            public static final EnumC0126ActivityMutator notifyMessage = new EnumC0126ActivityMutator("SkipSubtreeAndContinueTraversal", 1);
            public static final EnumC0126ActivityMutator connectPatch = new EnumC0126ActivityMutator("CancelTraversal", 2);

            static {
                EnumC0126ActivityMutator[] evictLayout = evictLayout();
                attachConfig = evictLayout;
                resetDelta = TranslateConductor.evictLayout(evictLayout);
            }

            private EnumC0126ActivityMutator(String str, int i) {
            }

            private static final /* synthetic */ EnumC0126ActivityMutator[] evictLayout() {
                return new EnumC0126ActivityMutator[]{reduceScope, notifyMessage, connectPatch};
            }

            public static ItemProcessor releaseHeader() {
                return resetDelta;
            }

            public static EnumC0126ActivityMutator valueOf(String str) {
                return (EnumC0126ActivityMutator) Enum.valueOf(EnumC0126ActivityMutator.class, str);
            }

            public static EnumC0126ActivityMutator[] values() {
                return (EnumC0126ActivityMutator[]) attachConfig.clone();
            }
        }

        private Companion() {
        }
    }

    Object saveSnapshot();
}
