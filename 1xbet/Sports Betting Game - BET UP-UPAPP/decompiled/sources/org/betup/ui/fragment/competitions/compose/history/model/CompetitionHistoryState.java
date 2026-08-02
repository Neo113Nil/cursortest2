package org.betup.ui.fragment.competitions.compose.history.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionHistoryState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryState;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Won", "Lost", "Pending", "Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryState$Lost;", "Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryState$Pending;", "Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryState$Won;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CompetitionHistoryState {
    public static final int $stable = 0;

    public /* synthetic */ CompetitionHistoryState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CompetitionHistoryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryState$Won;", "Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Won extends CompetitionHistoryState {
        public static final int $stable = 0;
        public static final Won INSTANCE = new Won();

        private Won() {
            super(null);
        }
    }

    private CompetitionHistoryState() {
    }

    /* compiled from: CompetitionHistoryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryState$Lost;", "Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Lost extends CompetitionHistoryState {
        public static final int $stable = 0;
        public static final Lost INSTANCE = new Lost();

        private Lost() {
            super(null);
        }
    }

    /* compiled from: CompetitionHistoryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryState$Pending;", "Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Pending extends CompetitionHistoryState {
        public static final int $stable = 0;
        public static final Pending INSTANCE = new Pending();

        private Pending() {
            super(null);
        }
    }
}
