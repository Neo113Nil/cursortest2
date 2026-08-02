package org.betup.ui.fragment.matches.details.compose.tabs.betgorups;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchBetGroupsTabContent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/betgorups/BetGroupsRows;", "", "title", "", "onClick", "Lkotlin/Function0;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getTitle", "()Ljava/lang/String;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BetGroupsRows {
    public static final int $stable = 0;
    private final Function0<Unit> onClick;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetGroupsRows copy$default(BetGroupsRows betGroupsRows, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = betGroupsRows.title;
        }
        if ((i & 2) != 0) {
            function0 = betGroupsRows.onClick;
        }
        return betGroupsRows.copy(str, function0);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Function0<Unit> component2() {
        return this.onClick;
    }

    public final BetGroupsRows copy(String title, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new BetGroupsRows(title, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetGroupsRows)) {
            return false;
        }
        BetGroupsRows betGroupsRows = (BetGroupsRows) other;
        return Intrinsics.areEqual(this.title, betGroupsRows.title) && Intrinsics.areEqual(this.onClick, betGroupsRows.onClick);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "BetGroupsRows(title=" + this.title + ", onClick=" + this.onClick + ")";
    }

    public BetGroupsRows(String title, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.title = title;
        this.onClick = onClick;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final String getTitle() {
        return this.title;
    }
}
