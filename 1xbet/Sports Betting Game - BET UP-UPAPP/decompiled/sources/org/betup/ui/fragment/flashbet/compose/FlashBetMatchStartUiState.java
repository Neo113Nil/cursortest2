package org.betup.ui.fragment.flashbet.compose;

import io.bidmachine.iab.vast.tags.VastTagName;
import io.sentry.cache.EnvelopeCache;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetMatchStartContent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Idle", "Loading", "StartSuccess", "NoAvailableMatches", VastTagName.ERROR, "Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState$Error;", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState$Idle;", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState$Loading;", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState$NoAvailableMatches;", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState$StartSuccess;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class FlashBetMatchStartUiState {
    public static final int $stable = 0;

    public /* synthetic */ FlashBetMatchStartUiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: FlashBetMatchStartContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState$Idle;", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Idle extends FlashBetMatchStartUiState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }
    }

    private FlashBetMatchStartUiState() {
    }

    /* compiled from: FlashBetMatchStartContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState$Loading;", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Loading extends FlashBetMatchStartUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: FlashBetMatchStartContent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState$StartSuccess;", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState;", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, "Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;)V", "getSession", "()Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StartSuccess extends FlashBetMatchStartUiState {
        public static final int $stable = 8;
        private final FlashBetGameSessionDto session;

        public static /* synthetic */ StartSuccess copy$default(StartSuccess startSuccess, FlashBetGameSessionDto flashBetGameSessionDto, int i, Object obj) {
            if ((i & 1) != 0) {
                flashBetGameSessionDto = startSuccess.session;
            }
            return startSuccess.copy(flashBetGameSessionDto);
        }

        /* renamed from: component1, reason: from getter */
        public final FlashBetGameSessionDto getSession() {
            return this.session;
        }

        public final StartSuccess copy(FlashBetGameSessionDto session) {
            return new StartSuccess(session);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartSuccess) && Intrinsics.areEqual(this.session, ((StartSuccess) other).session);
        }

        public int hashCode() {
            FlashBetGameSessionDto flashBetGameSessionDto = this.session;
            if (flashBetGameSessionDto == null) {
                return 0;
            }
            return flashBetGameSessionDto.hashCode();
        }

        public String toString() {
            return "StartSuccess(session=" + this.session + ")";
        }

        public final FlashBetGameSessionDto getSession() {
            return this.session;
        }

        public StartSuccess(FlashBetGameSessionDto flashBetGameSessionDto) {
            super(null);
            this.session = flashBetGameSessionDto;
        }
    }

    /* compiled from: FlashBetMatchStartContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState$NoAvailableMatches;", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoAvailableMatches extends FlashBetMatchStartUiState {
        public static final int $stable = 0;
        public static final NoAvailableMatches INSTANCE = new NoAvailableMatches();

        private NoAvailableMatches() {
            super(null);
        }
    }

    /* compiled from: FlashBetMatchStartContent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState$Error;", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetMatchStartUiState;", "message", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends FlashBetMatchStartUiState {
        public static final int $stable = 0;
        private final String message;

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Error copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }
    }
}
