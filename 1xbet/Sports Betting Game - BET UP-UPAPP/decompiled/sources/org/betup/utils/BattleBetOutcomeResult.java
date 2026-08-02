package org.betup.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleBetOutcomeResolver.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lorg/betup/utils/BattleBetOutcomeResult;", "", "firstHighlight", "Lorg/betup/utils/BattleBetHighlightStyle;", "secondHighlight", "scenario", "Lorg/betup/utils/BattleOutcomeScenario;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/utils/BattleBetHighlightStyle;Lorg/betup/utils/BattleBetHighlightStyle;Lorg/betup/utils/BattleOutcomeScenario;)V", "getFirstHighlight", "()Lorg/betup/utils/BattleBetHighlightStyle;", "getSecondHighlight", "getScenario", "()Lorg/betup/utils/BattleOutcomeScenario;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BattleBetOutcomeResult {
    public static final int $stable = 0;
    private final BattleBetHighlightStyle firstHighlight;
    private final BattleOutcomeScenario scenario;
    private final BattleBetHighlightStyle secondHighlight;

    public static /* synthetic */ BattleBetOutcomeResult copy$default(BattleBetOutcomeResult battleBetOutcomeResult, BattleBetHighlightStyle battleBetHighlightStyle, BattleBetHighlightStyle battleBetHighlightStyle2, BattleOutcomeScenario battleOutcomeScenario, int i, Object obj) {
        if ((i & 1) != 0) {
            battleBetHighlightStyle = battleBetOutcomeResult.firstHighlight;
        }
        if ((i & 2) != 0) {
            battleBetHighlightStyle2 = battleBetOutcomeResult.secondHighlight;
        }
        if ((i & 4) != 0) {
            battleOutcomeScenario = battleBetOutcomeResult.scenario;
        }
        return battleBetOutcomeResult.copy(battleBetHighlightStyle, battleBetHighlightStyle2, battleOutcomeScenario);
    }

    /* renamed from: component1, reason: from getter */
    public final BattleBetHighlightStyle getFirstHighlight() {
        return this.firstHighlight;
    }

    /* renamed from: component2, reason: from getter */
    public final BattleBetHighlightStyle getSecondHighlight() {
        return this.secondHighlight;
    }

    /* renamed from: component3, reason: from getter */
    public final BattleOutcomeScenario getScenario() {
        return this.scenario;
    }

    public final BattleBetOutcomeResult copy(BattleBetHighlightStyle firstHighlight, BattleBetHighlightStyle secondHighlight, BattleOutcomeScenario scenario) {
        Intrinsics.checkNotNullParameter(firstHighlight, "firstHighlight");
        Intrinsics.checkNotNullParameter(secondHighlight, "secondHighlight");
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        return new BattleBetOutcomeResult(firstHighlight, secondHighlight, scenario);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleBetOutcomeResult)) {
            return false;
        }
        BattleBetOutcomeResult battleBetOutcomeResult = (BattleBetOutcomeResult) other;
        return this.firstHighlight == battleBetOutcomeResult.firstHighlight && this.secondHighlight == battleBetOutcomeResult.secondHighlight && this.scenario == battleBetOutcomeResult.scenario;
    }

    public int hashCode() {
        return (((this.firstHighlight.hashCode() * 31) + this.secondHighlight.hashCode()) * 31) + this.scenario.hashCode();
    }

    public String toString() {
        return "BattleBetOutcomeResult(firstHighlight=" + this.firstHighlight + ", secondHighlight=" + this.secondHighlight + ", scenario=" + this.scenario + ")";
    }

    public BattleBetOutcomeResult(BattleBetHighlightStyle firstHighlight, BattleBetHighlightStyle secondHighlight, BattleOutcomeScenario scenario) {
        Intrinsics.checkNotNullParameter(firstHighlight, "firstHighlight");
        Intrinsics.checkNotNullParameter(secondHighlight, "secondHighlight");
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        this.firstHighlight = firstHighlight;
        this.secondHighlight = secondHighlight;
        this.scenario = scenario;
    }

    public final BattleBetHighlightStyle getFirstHighlight() {
        return this.firstHighlight;
    }

    public final BattleBetHighlightStyle getSecondHighlight() {
        return this.secondHighlight;
    }

    public final BattleOutcomeScenario getScenario() {
        return this.scenario;
    }
}
