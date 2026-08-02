package org.betup.model.remote.entity.challenges;

import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ChallengeCreator.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\f\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u000b\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeState;", "", "value", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V", "getValue", "()I", "NONE", "PENDING", "ACCEPTED", "REJECTED", "WON", "LOST", "DRAW", "RETURN", "STARTED", "FINISHED", "CANCELED", VastTagName.COMPANION, "Lorg/betup/model/remote/entity/challenges/ChallengeState$ACCEPTED;", "Lorg/betup/model/remote/entity/challenges/ChallengeState$CANCELED;", "Lorg/betup/model/remote/entity/challenges/ChallengeState$DRAW;", "Lorg/betup/model/remote/entity/challenges/ChallengeState$FINISHED;", "Lorg/betup/model/remote/entity/challenges/ChallengeState$LOST;", "Lorg/betup/model/remote/entity/challenges/ChallengeState$NONE;", "Lorg/betup/model/remote/entity/challenges/ChallengeState$PENDING;", "Lorg/betup/model/remote/entity/challenges/ChallengeState$REJECTED;", "Lorg/betup/model/remote/entity/challenges/ChallengeState$RETURN;", "Lorg/betup/model/remote/entity/challenges/ChallengeState$STARTED;", "Lorg/betup/model/remote/entity/challenges/ChallengeState$WON;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ChallengeState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    public /* synthetic */ ChallengeState(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* compiled from: ChallengeCreator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeState$NONE;", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NONE extends ChallengeState {
        public static final int $stable = 0;
        public static final NONE INSTANCE = new NONE();

        private NONE() {
            super(0, null);
        }
    }

    private ChallengeState(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: ChallengeCreator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeState$PENDING;", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PENDING extends ChallengeState {
        public static final int $stable = 0;
        public static final PENDING INSTANCE = new PENDING();

        private PENDING() {
            super(1, null);
        }
    }

    /* compiled from: ChallengeCreator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeState$ACCEPTED;", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ACCEPTED extends ChallengeState {
        public static final int $stable = 0;
        public static final ACCEPTED INSTANCE = new ACCEPTED();

        private ACCEPTED() {
            super(2, null);
        }
    }

    /* compiled from: ChallengeCreator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeState$REJECTED;", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class REJECTED extends ChallengeState {
        public static final int $stable = 0;
        public static final REJECTED INSTANCE = new REJECTED();

        private REJECTED() {
            super(3, null);
        }
    }

    /* compiled from: ChallengeCreator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeState$WON;", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WON extends ChallengeState {
        public static final int $stable = 0;
        public static final WON INSTANCE = new WON();

        private WON() {
            super(4, null);
        }
    }

    /* compiled from: ChallengeCreator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeState$LOST;", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LOST extends ChallengeState {
        public static final int $stable = 0;
        public static final LOST INSTANCE = new LOST();

        private LOST() {
            super(5, null);
        }
    }

    /* compiled from: ChallengeCreator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeState$DRAW;", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DRAW extends ChallengeState {
        public static final int $stable = 0;
        public static final DRAW INSTANCE = new DRAW();

        private DRAW() {
            super(6, null);
        }
    }

    /* compiled from: ChallengeCreator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeState$RETURN;", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RETURN extends ChallengeState {
        public static final int $stable = 0;
        public static final RETURN INSTANCE = new RETURN();

        private RETURN() {
            super(7, null);
        }
    }

    /* compiled from: ChallengeCreator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeState$STARTED;", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class STARTED extends ChallengeState {
        public static final int $stable = 0;
        public static final STARTED INSTANCE = new STARTED();

        private STARTED() {
            super(8, null);
        }
    }

    /* compiled from: ChallengeCreator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeState$FINISHED;", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FINISHED extends ChallengeState {
        public static final int $stable = 0;
        public static final FINISHED INSTANCE = new FINISHED();

        private FINISHED() {
            super(9, null);
        }
    }

    /* compiled from: ChallengeCreator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeState$CANCELED;", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CANCELED extends ChallengeState {
        public static final int $stable = 0;
        public static final CANCELED INSTANCE = new CANCELED();

        private CANCELED() {
            super(10, null);
        }
    }

    /* compiled from: ChallengeCreator.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lorg/betup/model/remote/entity/challenges/ChallengeState$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "fromInt", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", "value", "", "fromServerGlobalInt", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChallengeState fromInt(int value) {
            switch (value) {
                case 1:
                    return PENDING.INSTANCE;
                case 2:
                    return ACCEPTED.INSTANCE;
                case 3:
                    return REJECTED.INSTANCE;
                case 4:
                    return WON.INSTANCE;
                case 5:
                    return LOST.INSTANCE;
                case 6:
                    return DRAW.INSTANCE;
                case 7:
                    return RETURN.INSTANCE;
                case 8:
                    return STARTED.INSTANCE;
                case 9:
                    return FINISHED.INSTANCE;
                case 10:
                    return CANCELED.INSTANCE;
                default:
                    return NONE.INSTANCE;
            }
        }

        public final ChallengeState fromServerGlobalInt(int value) {
            switch (value) {
                case 1:
                    return PENDING.INSTANCE;
                case 2:
                    return ACCEPTED.INSTANCE;
                case 3:
                    return REJECTED.INSTANCE;
                case 4:
                    return STARTED.INSTANCE;
                case 5:
                    return FINISHED.INSTANCE;
                case 6:
                    return CANCELED.INSTANCE;
                default:
                    return fromInt(value);
            }
        }
    }
}
