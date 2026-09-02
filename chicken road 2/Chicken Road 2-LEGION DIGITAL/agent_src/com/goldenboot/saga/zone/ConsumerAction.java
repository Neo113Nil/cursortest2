package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/ConsumerAction;", "", "", "offset", "growPayload", "(I)I", "evictLayout", "ActivityMutator", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ConsumerAction {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.evictLayout;

    int evictLayout(int offset);

    int growPayload(int offset);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/goldenboot/saga/zone/ConsumerAction$ActivityMutator;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/ConsumerAction;", "growPayload", "Lcom/goldenboot/saga/zone/ConsumerAction;", "evictLayout", "()Lcom/goldenboot/saga/zone/ConsumerAction;", "Identity", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.goldenboot.saga.zone.ConsumerAction$ActivityMutator, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion evictLayout = new Companion();

        /* renamed from: growPayload, reason: from kotlin metadata */
        private static final ConsumerAction Identity = new C0098ActivityMutator();

        private Companion() {
        }

        public final ConsumerAction evictLayout() {
            return Identity;
        }

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"com/goldenboot/saga/zone/ConsumerAction$ActivityMutator$ActivityMutator", "Lcom/goldenboot/saga/zone/ConsumerAction;", "", "offset", "growPayload", "(I)I", "evictLayout", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.goldenboot.saga.zone.ConsumerAction$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0098ActivityMutator implements ConsumerAction {
            @Override // com.goldenboot.saga.zone.ConsumerAction
            public int evictLayout(int offset) {
                return offset;
            }

            @Override // com.goldenboot.saga.zone.ConsumerAction
            public int growPayload(int offset) {
                return offset;
            }
        }
    }
}
